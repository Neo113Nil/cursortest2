package defpackage;

import androidx.compose.ui.semantics.f;
import androidx.compose.ui.semantics.g;
import com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.views.SuperAppMapSearchbarView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.v2.SuperAppDiscoveryMapV2ModalView;
import com.yandex.go.superapp.discovery.map.impl.ui.search.data.repositories.d;
import com.yandex.mapkit.map.CameraPosition;
import java.util.Objects;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.logistics.sdk.ui.component.control.e;
import ru.yandex.taxi.preorder.summary.tariffpage.router.TariffPageCloseReason;

/* loaded from: classes14.dex */
public final /* synthetic */ class oxv0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ oxv0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        bxv0 bxv0Var;
        String str;
        String str2;
        String str3;
        String str4;
        FormattedText formattedText;
        rl2 rl2Var;
        swv0 b;
        a76 updateStatusBarBlur$lambda$0;
        a76 onDetachedFromWindow$lambda$0;
        int i = this.a;
        r1 = null;
        r1 = null;
        r1 = null;
        cvp0 cvp0Var = null;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                w8v0 w8v0Var = (w8v0) obj;
                if (w8v0Var instanceof f9v0) {
                    f9v0 f9v0Var = (f9v0) w8v0Var;
                    FormattedText formattedText2 = f9v0Var.a;
                    FormattedText formattedText3 = f9v0Var.b;
                    n7v n7vVar = f9v0Var.c;
                    if (n7vVar == null || (str4 = n7vVar.b) == null) {
                        str4 = n7vVar != null ? n7vVar.c : null;
                    }
                    u8v0 u8v0Var = f9v0Var.f;
                    if (u8v0Var != null && (formattedText = u8v0Var.b) != null && (rl2Var = u8v0Var.a) != null && (b = d.b(rl2Var, null)) != null) {
                        cvp0Var = new cvp0(formattedText, u8v0Var.c, b);
                    }
                    return new jxv0(formattedText2, formattedText3, str4, cvp0Var);
                }
                if (w8v0Var instanceof z8v0) {
                    z8v0 z8v0Var = (z8v0) w8v0Var;
                    FormattedText formattedText4 = z8v0Var.a;
                    FormattedText formattedText5 = z8v0Var.b;
                    n7v n7vVar2 = z8v0Var.c;
                    if (n7vVar2 == null || (str3 = n7vVar2.b) == null) {
                        str3 = n7vVar2 != null ? n7vVar2.c : null;
                    }
                    swv0 b2 = d.b(z8v0Var.d, w8v0Var);
                    t1k t1kVar = z8v0Var.f;
                    bxv0Var = new bxv0(formattedText4, formattedText5, str3, b2, t1kVar != null ? t1kVar.a : null, 16);
                } else {
                    if (!(w8v0Var instanceof o9v0) && !(w8v0Var instanceof c9v0) && !(w8v0Var instanceof l9v0) && !(w8v0Var instanceof s9v0) && !(w8v0Var instanceof i9v0)) {
                        w511.b();
                        return null;
                    }
                    FormattedText a = w8v0Var.getA();
                    FormattedText b3 = w8v0Var.getB();
                    n7v c = w8v0Var.getC();
                    if (c == null || (str2 = c.b) == null) {
                        str = c != null ? c.c : null;
                    } else {
                        str = str2;
                    }
                    bxv0Var = new bxv0(a, b3, str, d.b(w8v0Var.getD(), w8v0Var), null, 48);
                }
                return bxv0Var;
            case 1:
                updateStatusBarBlur$lambda$0 = SuperAppDiscoveryMapV2ModalView.updateStatusBarBlur$lambda$0((a76) obj);
                return updateStatusBarBlur$lambda$0;
            case 2:
                onDetachedFromWindow$lambda$0 = SuperAppMapSearchbarView.onDetachedFromWindow$lambda$0((a76) obj);
                return onDetachedFromWindow$lambda$0;
            case 3:
                CameraPosition cameraPosition = (CameraPosition) obj;
                return new CameraPosition(cameraPosition.getTarget(), 17.0f, cameraPosition.getAzimuth(), cameraPosition.getTilt());
            case 4:
                ((w8w0) obj).p();
                return zy11Var;
            case 5:
                ((w8w0) obj).p();
                return zy11Var;
            case 6:
                ((w8w0) obj).p();
                return zy11Var;
            case 7:
                ((vew0) obj).V0();
                return zy11Var;
            case 8:
                uhj uhjVar = (uhj) mbb1.d((y3x) obj, new lhj(1)).d();
                return new diw0(uhjVar.a, uhjVar.b, uhjVar.c);
            case 9:
                return ((mjw0) obj).a;
            case 10:
                kgx[] kgxVarArr = f.a;
                g gVar = androidx.compose.ui.semantics.d.m;
                kgx kgxVar = f.a[5];
                ((mnq0) obj).a(gVar, Boolean.TRUE);
                return zy11Var;
            case 11:
                kgx[] kgxVarArr2 = f.a;
                g gVar2 = androidx.compose.ui.semantics.d.m;
                kgx kgxVar2 = f.a[5];
                ((mnq0) obj).a(gVar2, Boolean.TRUE);
                return zy11Var;
            case 12:
                ((ftw0) obj).a.r(new qu(9));
                return zy11Var;
            case 13:
                return zy11Var;
            case 14:
                ck11 ck11Var = e.a;
                return Boolean.TRUE;
            case 15:
                ck11 ck11Var2 = e.a;
                return zy11Var;
            case 16:
                f.d((mnq0) obj);
                return zy11Var;
            case 17:
                czj0 czj0Var = (czj0) obj;
                if (czj0Var.d) {
                    Throwable th = czj0Var.c;
                    Objects.requireNonNull(th);
                    qwf0.a("SystemServicesManager.onCameraError", th);
                }
                return null;
            case 18:
                ((Float) obj).getClass();
                return zy11Var;
            case 19:
                return new tdx0((edu) obj);
            case 20:
                return new xdx0((xlj0) obj);
            case 21:
                return new sdx0((fx8) obj);
            case 22:
                f.v((mnq0) obj);
                return zy11Var;
            case 23:
                mnq0 mnq0Var = (mnq0) obj;
                f.v(mnq0Var);
                f.w(mnq0Var, 0.0f);
                return zy11Var;
            case 24:
                return new aex0((dtz0) obj);
            case 25:
                mnq0 mnq0Var2 = (mnq0) obj;
                f.v(mnq0Var2);
                f.w(mnq0Var2, 2.0f);
                return zy11Var;
            case 26:
                return new ydx0((ghp0) obj);
            case 27:
                return new fmq0((puz0) obj);
            case 28:
                return new fmq0((puz0) obj);
            default:
                ((bjx0) obj).a.r(new ajx0(TariffPageCloseReason.SYSTEM_BACK_BUTTON, 0));
                return zy11Var;
        }
    }

    public /* synthetic */ oxv0(int i, Object obj) {
        this.a = i;
    }
}
