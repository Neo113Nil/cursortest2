package defpackage;

import android.os.Build;
import com.yandex.plus.home.analytics.evgen.a;
import com.yandex.plus.home.internal.di.b;
import com.yandex.plus.pay.adapter.internal.q;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes8.dex */
public final /* synthetic */ class p42 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ p42(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        int i2 = 3;
        int i3 = 2;
        int i4 = 0;
        int i5 = 1;
        b bVar = this.b;
        switch (i) {
            case 0:
                p42 p42Var = new p42(bVar, 19);
                String str = Build.MANUFACTURER;
                String str2 = Build.MODEL;
                if (!evu0.y(str2, str, true)) {
                    str2 = oyr.f(HexString.CHAR_SPACE, str, str2);
                }
                String str3 = str2;
                cop0 cop0Var = bVar.a;
                return new com.yandex.plus.home.analytics.evgen.b(cop0Var.u, cop0Var.v, cop0Var.c, p42Var, new i22(i2), new p42(bVar, 21), new p42(bVar, 22), new p42(bVar, 23), str3, String.valueOf(Build.VERSION.SDK_INT));
            case 1:
                return new wio(bVar.b(), EvgenDiagnostic$WebViewType.Simple);
            case 2:
                return new wio(bVar.b(), EvgenDiagnostic$WebViewType.Smart);
            case 3:
                return new kio(bVar.b(), EvgenDiagnostic$WebViewType.Home);
            case 4:
                return new kio(bVar.b(), EvgenDiagnostic$WebViewType.Story);
            case 5:
                return new kio(bVar.b(), EvgenDiagnostic$WebViewType.Smart);
            case 6:
                return new vio(bVar.b(), EvgenDiagnostic$WebViewType.Home);
            case 7:
                return new vio(bVar.b(), EvgenDiagnostic$WebViewType.Story);
            case 8:
                return new vio(bVar.b(), EvgenDiagnostic$WebViewType.Smart);
            case 9:
                return new qio(bVar.b(), EvgenDiagnostic$WebViewType.Home);
            case 10:
                return ((com.yandex.plus.home.analytics.evgen.b) bVar.d.getValue()).a();
            case 11:
                return new sio(bVar.a(), new r42(bVar, i5));
            case 12:
                return new qio(bVar.b(), EvgenDiagnostic$WebViewType.Story);
            case 13:
                return new lho(new vit(i3, bVar), (a) bVar.f.getValue(), new rho());
            case 14:
                return new uho(new cot(i2, bVar), (zho) bVar.e.getValue(), new bio());
            case 15:
                return new eio(bVar.a(), i4);
            case 16:
                return new eio(bVar.a(), i5);
            case 17:
                return new xio(bVar.a());
            case 18:
                return new yio(bVar.a());
            case 19:
                int i6 = s42.a[((q) bVar.a.a()).b().ordinal()];
                if (i6 == 1) {
                    return BrandType.Yandex;
                }
                if (i6 == 2) {
                    return BrandType.Yango;
                }
                w511.b();
                return null;
            case 20:
                return new oio(bVar.a());
            case 21:
                return ((lj) bVar.b.h.getValue()).getId();
            case 22:
                return bVar.a.n;
            case 23:
                return bVar.a.q.getLocale().toLanguageTag();
            case 24:
                return new uio(bVar.a(), true);
            case 25:
                return new mio(bVar.b(), new r42(bVar, i4));
            case 26:
                return new tho(bVar.b());
            case 27:
                return new wio(bVar.b(), EvgenDiagnostic$WebViewType.Home);
            case 28:
                return ((com.yandex.plus.home.analytics.evgen.b) bVar.d.getValue()).b();
            default:
                return new wio(bVar.b(), EvgenDiagnostic$WebViewType.Story);
        }
    }
}
