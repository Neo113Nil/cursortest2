package ru.ok.android.webrtc.protocol.impl.transport;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.webrtc.DataChannel;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.protocol.RtcFormat;
import ru.ok.android.webrtc.protocol.RtcTransport;
import ru.ok.android.webrtc.protocol.exceptions.RtcInternalHandleException;

/* loaded from: classes9.dex */
public class DataChannelRtcTransport implements RtcTransport {
    public final DataChannel a;
    public final RTCLog b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();

    public class DataChannelObserver implements DataChannel.Observer {
        public final DataChannel a;

        public DataChannelObserver(@NonNull DataChannel dataChannel) {
            this.a = dataChannel;
        }

        @Override // org.webrtc.DataChannel.Observer
        public void onBufferedAmountChange(long j) {
            DataChannelRtcTransport dataChannelRtcTransport = DataChannelRtcTransport.this;
            Iterator it = dataChannelRtcTransport.e.iterator();
            while (it.hasNext()) {
                try {
                    ((RtcTransport.BufferedAmountChangeListener) it.next()).onBufferedAmountChange(dataChannelRtcTransport, j);
                } catch (Throwable th) {
                    dataChannelRtcTransport.b.reportException("DataChannelRtcTransport", "rtc.datachannel.buffer.listen", new RtcInternalHandleException(th));
                }
            }
        }

        @Override // org.webrtc.DataChannel.Observer
        public void onMessage(DataChannel.Buffer buffer) {
            ByteBuffer byteBuffer = buffer.data;
            byte[] bArr = new byte[byteBuffer.remaining()];
            RtcFormat rtcFormat = buffer.binary ? RtcFormat.BINARY : RtcFormat.TEXT;
            byteBuffer.get(bArr);
            DataChannelRtcTransport dataChannelRtcTransport = DataChannelRtcTransport.this;
            Iterator it = dataChannelRtcTransport.d.iterator();
            while (it.hasNext()) {
                try {
                    ((RtcTransport.DataListener) it.next()).onReceive(dataChannelRtcTransport, bArr, rtcFormat);
                } catch (Throwable th) {
                    dataChannelRtcTransport.b.reportException("DataChannelRtcTransport", "rtc.datachannel.listen.response", new RtcInternalHandleException(th));
                }
            }
        }

        @Override // org.webrtc.DataChannel.Observer
        public void onStateChange() {
            DataChannelRtcTransport dataChannelRtcTransport = DataChannelRtcTransport.this;
            boolean z = this.a.state() == DataChannel.State.OPEN;
            Iterator it = dataChannelRtcTransport.c.iterator();
            while (it.hasNext()) {
                try {
                    ((RtcTransport.ConnectionStateListener) it.next()).onConnectionStateChanged(dataChannelRtcTransport, z);
                } catch (Throwable th) {
                    dataChannelRtcTransport.b.reportException("DataChannelRtcTransport", "rtc.datachannel.handle.connection", new RtcInternalHandleException(th));
                }
            }
        }
    }

    public DataChannelRtcTransport(@NonNull DataChannel dataChannel, @NonNull RTCLog rTCLog) {
        this.a = dataChannel;
        this.b = rTCLog;
        dataChannel.registerObserver(new DataChannelObserver(dataChannel));
    }

    @Override // ru.ok.android.webrtc.protocol.RtcTransport
    public void addBufferedAmountChangeListener(@NonNull RtcTransport.BufferedAmountChangeListener bufferedAmountChangeListener) {
        this.e.add(bufferedAmountChangeListener);
    }

    @Override // ru.ok.android.webrtc.protocol.RtcTransport
    public void addConnectionStateListener(@NonNull RtcTransport.ConnectionStateListener connectionStateListener) {
        if (connectionStateListener == null) {
            throw new IllegalArgumentException("Illegal 'listener' value: null");
        }
        this.c.add(connectionStateListener);
    }

    @Override // ru.ok.android.webrtc.protocol.RtcTransport
    public void addDataListener(@NonNull RtcTransport.DataListener dataListener) {
        if (dataListener == null) {
            throw new IllegalArgumentException("Illegal 'listener' value: null");
        }
        this.d.add(dataListener);
    }

    @Override // ru.ok.android.webrtc.protocol.RtcTransport
    public long bufferedAmount() {
        return this.a.bufferedAmount();
    }

    @Override // ru.ok.android.webrtc.protocol.RtcTransport
    public void dispose() {
        this.a.close();
    }

    @Override // ru.ok.android.webrtc.protocol.RtcTransport
    public DataChannel get() {
        return this.a;
    }

    @Override // ru.ok.android.webrtc.protocol.RtcTransport
    public boolean isConnected() {
        return this.a.state() == DataChannel.State.OPEN;
    }

    @Override // ru.ok.android.webrtc.protocol.RtcTransport
    public void removeBufferedAmountChangeListener(@NonNull RtcTransport.BufferedAmountChangeListener bufferedAmountChangeListener) {
        this.e.remove(bufferedAmountChangeListener);
    }

    @Override // ru.ok.android.webrtc.protocol.RtcTransport
    public void removeConnectionStateListener(@NonNull RtcTransport.ConnectionStateListener connectionStateListener) {
        if (connectionStateListener == null) {
            throw new IllegalArgumentException("Illegal 'listener' value: null");
        }
        this.c.remove(connectionStateListener);
    }

    @Override // ru.ok.android.webrtc.protocol.RtcTransport
    public void removeDataListener(@NonNull RtcTransport.DataListener dataListener) {
        if (dataListener == null) {
            throw new IllegalArgumentException("Illegal 'listener' value: null");
        }
        this.d.remove(dataListener);
    }

    @Override // ru.ok.android.webrtc.protocol.RtcTransport
    public boolean send(@NonNull byte[] bArr, @NonNull RtcFormat rtcFormat) {
        if (bArr == null) {
            throw new IllegalArgumentException("Illegal 'command' value: null");
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            try {
                ((RtcTransport.DataListener) it.next()).onSend(this, bArr, rtcFormat);
            } catch (Throwable th) {
                this.b.reportException("DataChannelRtcTransport", "rtc.datachannel.listen.send", new RtcInternalHandleException(th));
            }
        }
        return this.a.send(new DataChannel.Buffer(ByteBuffer.wrap(bArr), rtcFormat == RtcFormat.BINARY));
    }

    @Override // ru.ok.android.webrtc.protocol.RtcTransport
    public boolean send(@NonNull RtcFormat rtcFormat, @NonNull ByteBuffer... byteBufferArr) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            try {
                ((RtcTransport.DataListener) it.next()).onSend(this, rtcFormat, byteBufferArr);
            } catch (Throwable th) {
                this.b.reportException("DataChannelRtcTransport", "rtc.datachannel.listen.send", new RtcInternalHandleException(th));
            }
        }
        return this.a.sendMultiple(rtcFormat == RtcFormat.BINARY, byteBufferArr);
    }
}
