package xsna;

import android.util.Log;
import com.facebook.common.references.SharedReference;
import xsna.uvf;

/* compiled from: CloseableReferenceFactory.java */
/* loaded from: classes.dex */
public final class vvf {
    public final a a;

    /* compiled from: CloseableReferenceFactory.java */
    public class a implements uvf.c {
        public final /* synthetic */ vek a;

        public a(vek vekVar) {
            this.a = vekVar;
        }

        @Override // xsna.uvf.c
        public final boolean a() {
            this.a.getClass();
            return false;
        }

        @Override // xsna.uvf.c
        public final void b(SharedReference<Object> sharedReference, Throwable th) {
            this.a.getClass();
            Object a = sharedReference.a();
            ahq.l("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(sharedReference)), a != null ? a.getClass().getName() : "<value is null>", th == null ? "" : Log.getStackTraceString(th));
        }
    }

    public vvf(vek vekVar) {
        this.a = new a(vekVar);
    }
}
