package xsna;

import android.content.Context;
import xsna.ify;

/* compiled from: PostingViewExt.kt */
/* loaded from: classes4.dex */
public final class tpc0 {
    public static final void a(Context context, gzs<s3q0> gzsVar) {
        int i = ify.a;
        if (!ify.e(ify.c)) {
            gzsVar.invoke();
        } else {
            ify.a(new a(gzsVar));
            mhy.b(context);
        }
    }

    /* compiled from: PostingViewExt.kt */
    public static final class a implements ify.a {
        public final /* synthetic */ gzs<s3q0> b;

        public a(gzs<s3q0> gzsVar) {
            this.b = gzsVar;
        }

        @Override // xsna.ify.a
        public final void Y0() {
            int i = ify.a;
            ify.g(this);
            try {
                this.b.invoke();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable unused) {
            }
        }

        @Override // xsna.ify.a
        public final void x0(int i) {
        }
    }
}
