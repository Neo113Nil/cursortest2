package xsna;

import xsna.wbu0;

/* compiled from: AuthView.kt */
/* loaded from: classes.dex */
public interface x65 extends dhg {

    /* compiled from: AuthView.kt */
    /* loaded from: classes15.dex */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void a(x65 x65Var, String str, String str2, String str3, gzs gzsVar, String str4, gzs gzsVar2, boolean z, gzs gzsVar3, gzs gzsVar4, int i) {
            if ((i & 16) != 0) {
                str4 = null;
            }
            if ((i & 32) != 0) {
                gzsVar2 = null;
            }
            if ((i & 64) != 0) {
                z = true;
            }
            if ((i & 128) != 0) {
                gzsVar3 = null;
            }
            if ((i & 256) != 0) {
                gzsVar4 = null;
            }
            x65Var.U2(str, str2, str3, gzsVar, str4, gzsVar2, z, gzsVar3, gzsVar4);
        }

        public static void b(x65 x65Var, wbu0.a aVar) {
            if (aVar.c) {
                return;
            }
            x65Var.wa(aVar.a, null, null);
        }
    }

    void S(boolean z);

    void U2(String str, String str2, String str3, gzs<s3q0> gzsVar, String str4, gzs<s3q0> gzsVar2, boolean z, gzs<s3q0> gzsVar3, gzs<s3q0> gzsVar4);

    void qi(String str);

    void vf(wbu0.a aVar);

    void wa(String str, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2);

    void wm(boolean z);
}
