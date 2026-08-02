package defpackage;

import android.app.Activity;
import android.net.wifi.ScanResult;
import com.yandex.passport.internal.filter.l;
import com.yandex.passport.internal.report.rb;
import com.yandex.passport.internal.report.reporters.z0;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.ui.util.ForegroundDetector;
import com.yandex.quark.js.serializer.JsDataSerializationStrategy;
import java.lang.ref.WeakReference;
import kotlinx.serialization.modules.a;

/* loaded from: classes8.dex */
public final /* synthetic */ class ph41 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ph41(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean onActivityPaused$lambda$7;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 4;
        boolean z = false;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new nvy0((qh41) obj2, (Activity) obj);
            case 1:
                n4u0 n4u0Var = (n4u0) obj2;
                ut20 ut20Var = (ut20) obj;
                ut20Var.a = new qc20(n4u0Var);
                zia0 zia0Var = new zia0();
                zia0Var.c = n4u0Var;
                mhd0 mhd0Var = zia0Var.a;
                zia0.a(mhd0Var, "themeProvider");
                n4u0 n4u0Var2 = zia0Var.c;
                zia0.a(n4u0Var2, "themeFlow");
                ut20Var.b = new ofa0(mhd0Var, (e5o) zia0Var.b, n4u0Var2, (xyj) zia0Var.d).w();
                return zy11Var;
            case 2:
                acx acxVar = (acx) obj;
                acxVar.c = true;
                acxVar.a = true;
                a aVar = new a();
                aVar.g(qoi0.a(png.class), new gee((JsDataSerializationStrategy) obj2));
                acxVar.n = aVar.a();
                return zy11Var;
            case 3:
                return Boolean.valueOf(((ScanResult) obj).level >= ((qk0) obj2).f);
            case 4:
                return new vjp(((cne0) obj2).o(new he7(3, (tls) obj), "zone_country_codes"), 1);
            case 5:
                ((z0) obj2).f(rb.w, new yd("yandex-datastore", i2, z));
                return kp50.i();
            case 6:
                z0 z0Var = ((l) obj2).b;
                String str = l.g;
                z0Var.getClass();
                z0Var.f(rb.w, new yd(str, i2, z));
                return kp50.i();
            default:
                onActivityPaused$lambda$7 = ForegroundDetector.onActivityPaused$lambda$7((Activity) obj2, (WeakReference) obj);
                return Boolean.valueOf(onActivityPaused$lambda$7);
        }
    }
}
