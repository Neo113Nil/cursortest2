package xsna;

import android.graphics.Bitmap;

/* compiled from: TextEditPatch.kt */
/* loaded from: classes4.dex */
public interface teo0 extends mwx {

    /* compiled from: TextEditPatch.kt */
    public interface a extends teo0 {

        /* compiled from: TextEditPatch.kt */
        /* renamed from: xsna.teo0$a$a, reason: collision with other inner class name */
        public static final class C3741a implements a {
            public static final C3741a a = new C3741a();
        }

        /* compiled from: TextEditPatch.kt */
        public static final class b implements a {
            public static final b a = new b();
        }

        /* compiled from: TextEditPatch.kt */
        public static final class c implements a {
            public final Bitmap a;

            public c(Bitmap bitmap) {
                this.a = bitmap;
            }
        }
    }

    /* compiled from: TextEditPatch.kt */
    public static final class b implements teo0 {
        public final veo0 a;

        public b(veo0 veo0Var) {
            this.a = veo0Var;
        }
    }

    /* compiled from: TextEditPatch.kt */
    public static final class c implements teo0 {
        public final teo0[] a;

        public c(teo0... teo0VarArr) {
            this.a = teo0VarArr;
        }
    }
}
