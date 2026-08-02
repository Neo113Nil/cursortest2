package defpackage;

import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.childrouter.api.ButtonType;
import ru.yandex.taxi.logistics.childrouter.api.ScreenMode;
import ru.yandex.taxi.logistics.childrouter.api.ScreenState;

/* loaded from: classes12.dex */
public final class izh {
    public final zni a;
    public final zni b;
    public final ButtonType c;
    public final ScreenMode d;
    public final ScreenState e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final ts11 i;
    public final dzh j;
    public final String k;
    public final boolean l;
    public final tls m;

    public izh(zni zniVar, ButtonType buttonType, ScreenMode screenMode, ts11 ts11Var, dzh dzhVar, String str, int i) {
        this(zniVar, null, (i & 4) != 0 ? ButtonType.NONE : buttonType, (i & 8) != 0 ? ScreenMode.SLIDEABLE : screenMode, ScreenState.COMMON, (i & 32) == 0, true, (i & 128) == 0, (i & 256) != 0 ? new ts11(false, false, null, null, null, 511) : ts11Var, (i & 512) != 0 ? new zoy0() : dzhVar, (i & 1024) != 0 ? UUID.randomUUID().toString() : str, (i & 2048) == 0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izh)) {
            return false;
        }
        izh izhVar = (izh) obj;
        return jl40.l(this.a, izhVar.a) && jl40.l(this.b, izhVar.b) && this.c == izhVar.c && this.d == izhVar.d && this.e == izhVar.e && this.f == izhVar.f && this.g == izhVar.g && this.h == izhVar.h && jl40.l(this.i, izhVar.i) && jl40.l(this.j, izhVar.j) && jl40.l(this.k, izhVar.k) && this.l == izhVar.l && jl40.l(this.m, izhVar.m);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zni zniVar = this.b;
        int e = unr0.e(unr0.b((this.j.hashCode() + ((this.i.hashCode() + unr0.e(unr0.e(unr0.e((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (zniVar == null ? 0 : zniVar.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h)) * 31)) * 31, 31, this.k), 31, this.l);
        tls tlsVar = this.m;
        return e + (tlsVar != null ? tlsVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryChildRouterPayload(deliveryScreenEngineFactory=");
        sb.append(this.a);
        sb.append(", deliveryScreenBottomSectionEngineFactory=");
        sb.append(this.b);
        sb.append(", buttonType=");
        sb.append(this.c);
        sb.append(", screenMode=");
        sb.append(this.d);
        sb.append(", screenState=");
        sb.append(this.e);
        sb.append(", canTouchOutside=");
        sb.append(this.f);
        sb.append(", shouldCloseByHardwareBack=");
        nnm.v(", shouldAddFocusCoordinatorChangeListener=", ", uiConfig=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", callback=");
        sb.append(this.j);
        sb.append(", screenId=");
        tse0.y(this.k, ", isMapRequired=", ", isRouterOnTopPredicate=", sb, this.l);
        sb.append(this.m);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public izh(zni zniVar, v230 v230Var, ButtonType buttonType, ScreenMode screenMode, ScreenState screenState, boolean z, boolean z2, boolean z3, ts11 ts11Var, dzh dzhVar, String str, boolean z4, tls tlsVar) {
        this.a = zniVar;
        this.b = v230Var;
        this.c = buttonType;
        this.d = screenMode;
        this.e = screenState;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = ts11Var;
        this.j = dzhVar;
        this.k = str;
        this.l = z4;
        this.m = tlsVar;
    }
}
