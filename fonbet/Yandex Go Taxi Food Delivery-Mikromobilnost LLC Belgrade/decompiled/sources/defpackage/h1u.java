package defpackage;

import android.content.Intent;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.layout.o;
import com.yandex.messaging.ui.auth.ProxyPassportActivity;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.c;
import java.util.ArrayList;
import java.util.Collections;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes3.dex */
public final /* synthetic */ class h1u implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ h1u(int i, int i2, oz40 oz40Var, oz40 oz40Var2) {
        this.a = 3;
        this.b = i;
        this.c = i2;
        this.w = oz40Var;
        this.x = oz40Var2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 lambda$onActivityResult$1;
        kam0 b;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        Object obj2 = this.x;
        int i3 = this.b;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                a aVar = (a) obj2;
                lmt0 lmt0Var = (lmt0) obj;
                for (e1u e1uVar : ((k1u) obj3).c) {
                    y2x y2xVar = e1uVar.b;
                    c3x c3xVar = e1uVar.a;
                    int d = y6i0.d(y2xVar.b, 0, i3 - 1);
                    int d2 = y6i0.d(e1uVar.b.a, 0, i2 - 1);
                    lmt0Var.a(d, d2, y6i0.d(c3xVar.b, 1, i3 - d), y6i0.d(c3xVar.a, 1, i2 - d2), new a(1617919698, new a6n(19, aVar, e1uVar), true));
                }
                return zy11Var;
            case 1:
                lambda$onActivityResult$1 = ((ProxyPassportActivity) obj3).lambda$onActivityResult$1(i3, i2, (Intent) obj2, (kt11) obj);
                return lambda$onActivityResult$1;
            case 2:
                String str = (String) obj3;
                c cVar = (c) obj2;
                fbm0 fbm0Var = (fbm0) obj;
                lam0 lam0Var = fbm0Var.d;
                if (lam0Var == null || (b = lam0Var.b(str)) == null) {
                    c.l0(cVar, "Target shelf is null", str);
                    return fbm0Var;
                }
                ArrayList arrayList = new ArrayList(b.g);
                Collections.swap(arrayList, i3, i2);
                kam0 a = kam0.a(b, arrayList, false, 447);
                cVar.M = new qbm0(i3, i2, str);
                return fbm0.a(fbm0Var, null, lam0Var.c(a), null, 23);
            case 3:
                oz40 oz40Var = (oz40) obj3;
                oz40 oz40Var2 = (oz40) obj2;
                return new z5w((((int) (((((int) (((k6w) oz40Var2.getValue()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 2.0f) + Float.intBitsToFloat((int) (((wu60) oz40Var.getValue()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) - (i2 / 2.0f))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (((int) (((((int) (((k6w) oz40Var2.getValue()).a >> 32)) / 2.0f) + Float.intBitsToFloat((int) (((wu60) oz40Var.getValue()).a >> 32))) - (i3 / 2.0f))) << 32));
            default:
                o oVar = (o) obj3;
                o oVar2 = (o) obj2;
                o.a aVar2 = (o.a) obj;
                o.a.o(aVar2, oVar, 0, (i3 - oVar.b) / 2);
                o.a.o(aVar2, oVar2, i2, (i3 - oVar2.b) / 2);
                return zy11Var;
        }
    }

    public /* synthetic */ h1u(int i, int i2, int i3, Object obj, Object obj2) {
        this.a = i3;
        this.w = obj;
        this.b = i;
        this.c = i2;
        this.x = obj2;
    }

    public /* synthetic */ h1u(o oVar, int i, o oVar2, int i2) {
        this.a = 4;
        this.w = oVar;
        this.b = i;
        this.x = oVar2;
        this.c = i2;
    }

    public /* synthetic */ h1u(String str, c cVar, int i, int i2) {
        this.a = 2;
        this.w = str;
        this.x = cVar;
        this.b = i;
        this.c = i2;
    }
}
