package xsna;

import android.net.Uri;
import com.vk.media.pipeline.session.transform.task.copy.CopyException;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ppa0;
import xsna.rkp0;

/* compiled from: Copy.kt */
/* loaded from: classes3.dex */
public final class atj extends a5o0 {
    public final gtj g;
    public final jkp0 h;

    /* compiled from: Copy.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Long, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Long l) {
            long longValue = l.longValue();
            vxj0 vxj0Var = (vxj0) this.receiver;
            long j = vxj0Var.a;
            int min = j != 0 ? Math.min(100, (int) ((longValue * 100.0f) / j)) : 0;
            if (min != 100) {
                vxj0Var.b.a(min, longValue);
            }
            return s3q0.a;
        }
    }

    public atj(csp cspVar, gtj gtjVar, jkp0 jkp0Var) {
        super(cspVar, gtjVar.a, cspVar.c, new ju4(), "Copy");
        this.g = gtjVar;
        this.h = jkp0Var;
    }

    @Override // xsna.a5o0
    public final qpa0 c() {
        csp cspVar = this.a;
        File file = this.b;
        try {
            super.c();
            boolean exists = file.exists();
            gtj gtjVar = this.g;
            if (exists) {
                throw new CopyException("Output file already exists, " + gtjVar.b + " -> " + file);
            }
            Uri uri = gtjVar.b;
            n1i0 n1i0Var = new n1i0(cspVar.a, uri);
            Long c = n1i0Var.c();
            long longValue = c != null ? c.longValue() : br10.c(cspVar.a, uri);
            vxj0 vxj0Var = new vxj0(this.h, longValue);
            ppa0.a aVar = cspVar.c;
            a aVar2 = new a(1, vxj0Var, vxj0.class, "notify", "notify(J)V", 0);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                long a2 = n1i0Var.a(fileOutputStream, aVar, aVar2);
                fileOutputStream.close();
                ejp0 ejp0Var = (ejp0) this.d.a;
                if (a2 < 0) {
                    ejp0Var.getClass();
                    throw new IllegalArgumentException("Wrong processed total bytes specified");
                }
                ejp0Var.a = a2;
                if (4 < a2) {
                    vxj0Var.b.a(100, longValue);
                    return a5o0.a(this, rkp0.a.a, null, 2);
                }
                throw new CopyException("Wrong copied bytes=" + a2 + ", " + uri + " -> " + file);
            } finally {
            }
        } catch (CopyException e) {
            return a5o0.a(this, null, e, 1);
        } catch (Throwable th) {
            return a5o0.a(this, null, new CopyException(th), 1);
        }
    }

    @Override // xsna.a5o0
    public final void b() {
    }
}
