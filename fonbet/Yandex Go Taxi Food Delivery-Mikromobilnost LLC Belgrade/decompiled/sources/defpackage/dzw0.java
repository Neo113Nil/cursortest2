package defpackage;

import androidx.compose.ui.semantics.f;
import androidx.compose.ui.state.ToggleableState;
import com.yandex.mapkit.transport.masstransit.MasstransitLayer;
import defpackage.v4j0;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes12.dex */
public final /* synthetic */ class dzw0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ dzw0(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                f.u((mnq0) obj, z ? ToggleableState.On : ToggleableState.Off);
                return zy11Var;
            case 1:
                c1y c1yVar = (c1y) obj;
                c1yVar.a();
                if (z) {
                    qam.t(c1yVar, zoy0.A(scc.g(new ldc(ldc.l), new ldc(ldc.b)), 0.0f, c1yVar.w0(32.0f), 8), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (c1yVar.a.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(r0) << 32), 0.0f, null, 6, 56);
                }
                return zy11Var;
            case 2:
                ((v4j0.a) obj).a = !z;
                return zy11Var;
            case 3:
                wk01 wk01Var = (wk01) obj;
                String str = wk01Var.y;
                boolean z2 = this.b;
                if (!z2) {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                return wk01.b(wk01Var, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, z2, str, false, null, null, null, null, null, null, null, -25165825, 15);
            case 4:
                return wk01.b((wk01) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, null, this.b, null, null, null, null, null, null, null, -33554433, 15);
            default:
                MasstransitLayer masstransitLayer = (MasstransitLayer) obj;
                if (masstransitLayer.isVehiclesVisible() != z) {
                    masstransitLayer.setVehiclesVisible(z);
                }
                return zy11Var;
        }
    }
}
