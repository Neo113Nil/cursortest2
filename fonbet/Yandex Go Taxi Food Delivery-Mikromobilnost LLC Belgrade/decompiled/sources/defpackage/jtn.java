package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import kotlin.collections.b;

/* loaded from: classes14.dex */
public final /* synthetic */ class jtn implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3u0 b;

    public /* synthetic */ jtn(m3u0 m3u0Var, int i) {
        this.a = i;
        this.b = m3u0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wp2 up2Var;
        aa10 w;
        aa10 w2;
        int i = this.a;
        m3u0 m3u0Var = this.b;
        switch (i) {
            case 0:
                f530 f530Var = (f530) obj;
                ((Integer) obj3).getClass();
                bts btsVar = (bts) ((fid) obj2);
                btsVar.e0(-2117198989);
                long n = tje.n(AppColor$Palette.ControlMinor, btsVar);
                if (((Boolean) m3u0Var.getValue()).booleanValue()) {
                    btsVar.e0(1186273402);
                    up2Var = tp2.a;
                } else {
                    btsVar.e0(1186274202);
                    up2Var = new up2(zp2.d);
                }
                long n2 = tje.n(up2Var, btsVar);
                btsVar.t(false);
                boolean d = btsVar.d(n) | btsVar.d(n2);
                Object Q = btsVar.Q();
                if (d || Q == did.a) {
                    j2b j2bVar = new j2b(4, n, n2);
                    btsVar.o0(j2bVar);
                    Q = j2bVar;
                }
                f530 i2 = bb1.i(f530Var, (tls) Q);
                btsVar.t(false);
                return i2;
            case 1:
                o l0 = ((x910) obj2).l0(((n8e) obj3).a);
                w = ((k) obj).w(l0.a, y6i0.d(m810.b(((Number) m3u0Var.getValue()).floatValue() * l0.b), 0, l0.b), b.f(), new q83(l0, 11));
                return w;
            default:
                o l02 = ((x910) obj2).l0(((n8e) obj3).a);
                w2 = ((k) obj).w(l02.a, l02.b, b.f(), new a5p0(13, l02, m3u0Var));
                return w2;
        }
    }
}
