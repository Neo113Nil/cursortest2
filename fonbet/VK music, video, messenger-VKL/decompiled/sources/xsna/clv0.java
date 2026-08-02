package xsna;

import com.vk.core.snackbar.HideReason;
import xsna.flv0;

/* compiled from: VkSnackbarHost.kt */
/* loaded from: classes17.dex */
public final class clv0 implements flv0.a {
    public final /* synthetic */ dlv0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ acn c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ lq9 f;

    /* compiled from: VkSnackbarHost.kt */
    public static final class a implements gzs<s3q0> {
        public a() {
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            Object obj = flv0.a;
            flv0.e(clv0.this);
            return s3q0.a;
        }
    }

    /* compiled from: VkSnackbarHost.kt */
    public static final class b implements gzs<s3q0> {
        public final /* synthetic */ lq9 c;

        public b(lq9 lq9Var) {
            this.c = lq9Var;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            Object obj = flv0.a;
            flv0.d(clv0.this);
            lq9 lq9Var = this.c;
            lq9Var.getClass();
            if (!(lq9.h.get(lq9Var) instanceof wq9)) {
                lq9Var.resumeWith(s3q0.a);
            }
            return s3q0.a;
        }
    }

    public clv0(dlv0 dlv0Var, String str, acn acnVar, float f, boolean z, lq9 lq9Var) {
        this.a = dlv0Var;
        this.b = str;
        this.c = acnVar;
        this.d = f;
        this.e = z;
        this.f = lq9Var;
    }

    @Override // xsna.flv0.a
    public final void a(HideReason hideReason) {
        ((zak0) this.a.b).setValue(null);
    }

    @Override // xsna.flv0.a
    public final void show() {
        a aVar = new a();
        lq9 lq9Var = this.f;
        ((zak0) this.a.b).setValue(new l7k0(this.b, this, this.c, this.d, this.e, aVar, new b(lq9Var), lq9Var));
    }
}
