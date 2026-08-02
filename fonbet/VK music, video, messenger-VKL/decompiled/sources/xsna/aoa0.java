package xsna;

import android.os.MemoryFile;
import com.vk.media.MediaUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PingPongFrameWriter.kt */
/* loaded from: classes3.dex */
public final class aoa0 {
    public ByteBuffer c;
    public MediaUtils.d d;
    public boolean e;
    public boolean f;
    public final Object a = new Object();
    public final ArrayList<MemoryFile> b = new ArrayList<>();
    public boolean g = true;
    public final pes h = new pes();
    public final byte[] i = new byte[4096];

    public final void a() {
        synchronized (this.a) {
            try {
                Iterator<MemoryFile> it = this.b.iterator();
                while (it.hasNext()) {
                    it.next().close();
                }
                this.b.clear();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i, int i2) {
        synchronized (this.a) {
            MediaUtils.d dVar = this.d;
            if (dVar != null && dVar.a == i && dVar.b == i2) {
                return;
            }
            this.d = new MediaUtils.d(i, i2);
            this.h.h(i, i2);
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
