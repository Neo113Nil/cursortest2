package xsna;

import android.content.Intent;

/* compiled from: VoipUiLauncher.kt */
/* loaded from: classes7.dex */
public interface w2x0 {
    void b(a aVar);

    Intent c();

    /* compiled from: VoipUiLauncher.kt */
    public static final class a {
        public final boolean a;
        public final gzs<s3q0> b;
        public final gzs<s3q0> c;

        public a(boolean z, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
            this.a = z;
            this.b = gzsVar;
            this.c = gzsVar2;
        }

        public /* synthetic */ a(boolean z, int i) {
            this((i & 1) != 0 ? false : z, new qc00(24), new d2c0(17));
        }
    }
}
