package ru.ok.proto.okmp;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.channels.DatagramChannel;
import ru.ok.media.utils.IOUtils;
import xsna.ne7;

/* loaded from: classes9.dex */
public class FileDescriptorRefCountWrapper {
    private static final String TAG = "Publisher";
    private DatagramChannel datagramChannel;
    private ParcelFileDescriptor fileDescr;
    private long refCount = 1;

    public FileDescriptorRefCountWrapper() throws IOException {
        DatagramChannel open = DatagramChannel.open();
        this.datagramChannel = open;
        this.fileDescr = ParcelFileDescriptor.fromDatagramSocket(open.socket());
        ne7.m(TAG, "Created, fd=" + this.fileDescr.getFd());
    }

    private void doClose() {
        if (this.fileDescr != null) {
            ne7.m(TAG, "Closing, fd=" + this.fileDescr.getFd());
        }
        IOUtils.closeSilently(this.fileDescr);
        IOUtils.closeSilently(this.datagramChannel);
        this.fileDescr = null;
        this.datagramChannel = null;
    }

    public synchronized void addRef() {
        this.refCount++;
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.refCount <= 0 || this.fileDescr == null) {
            return;
        }
        ne7.m(TAG, "FD leak detected, fd=" + this.fileDescr.getFd());
        doClose();
    }

    public synchronized DatagramChannel getDatagramChannel() {
        return this.datagramChannel;
    }

    public synchronized int getFD() {
        ParcelFileDescriptor parcelFileDescriptor;
        parcelFileDescriptor = this.fileDescr;
        return parcelFileDescriptor == null ? -1 : parcelFileDescriptor.getFd();
    }

    public synchronized void release() {
        long j = this.refCount - 1;
        this.refCount = j;
        if (j < 0) {
            throw new IllegalStateException("Ref count < 0, double release?");
        }
        if (j == 0) {
            doClose();
        }
    }
}
