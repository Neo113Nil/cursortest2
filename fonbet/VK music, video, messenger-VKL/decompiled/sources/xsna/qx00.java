package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qx00 implements wzs {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qx00(int i, String str, String str2, gzs gzsVar, q630 q630Var) {
        this.c = str;
        this.e = str2;
        this.d = gzsVar;
        this.f = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                rx00.a((String) this.c, (gzs) this.d, (gzs) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(433));
                break;
            case 1:
                peb0 peb0Var = (peb0) this.c;
                szm szmVar = (szm) this.d;
                zfe0 zfe0Var = (zfe0) this.e;
                mtk0 mtk0Var = (mtk0) this.f;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(673932423, intValue, -1, "com.vk.music.playlist.framework.presentation.screen.PlaylistScreenContent.<anonymous> (PlaylistScreenContent.kt:62)");
                    }
                    peb0Var.a(szmVar, zfe0Var, mtk0Var, null, aVar, 64);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                String str = (String) this.c;
                String str2 = (String) this.e;
                gzs gzsVar = (gzs) this.d;
                q630 q630Var = (q630) this.f;
                ((Integer) obj2).getClass();
                taf0.a(ne7.I(1), (androidx.compose.runtime.a) obj, str, str2, gzsVar, q630Var);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ qx00(int i, String str, gzs gzsVar, gzs gzsVar2, q630 q630Var) {
        this.c = str;
        this.d = gzsVar;
        this.e = gzsVar2;
        this.f = q630Var;
    }

    public /* synthetic */ qx00(peb0 peb0Var, szm szmVar, zfe0 zfe0Var, mtk0 mtk0Var) {
        this.c = peb0Var;
        this.d = szmVar;
        this.e = zfe0Var;
        this.f = mtk0Var;
    }
}
