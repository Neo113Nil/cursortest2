package yads;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import com.ironsource.O6;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Locale;
import ru.ok.tracer.base.deviceid.DeviceIdUtils;
import xsna.j5g;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class pm0 {
    public final px2 a;
    public final sy2 b;
    public final jg0 c;
    public final ci1 d;
    public final sd e;
    public final qm0 f;
    public final rd g;
    public final km0 h;

    public /* synthetic */ pm0(Context context, d4 d4Var) {
        this(d4Var, new px2(), new sy2(), new jg0(), bi1.a(context), new sd(), new rm0());
    }

    public final void a(Context context, wzs wzsVar) {
        Location a;
        wzsVar.invoke("app_id", context.getPackageName());
        wzsVar.invoke("app_version_code", og.a(context));
        wzsVar.invoke(CommonUrlParts.APP_VERSION, og.b(context));
        wzsVar.invoke("vast-integration-type", "inapp_sdk");
        wzsVar.invoke("sdk_version", this.a.a("%d.%d%d"));
        wzsVar.invoke("sdk_version_name", this.a.a("%d.%d.%d"));
        wzsVar.invoke("sdk_vendor", "yandex");
        wzsVar.invoke(((rm0) this.f).b(), this.c.a(context));
        zh1 zh1Var = this.c.b;
        zh1Var.getClass();
        Locale locale = context.getResources().getConfiguration().locale;
        zh1Var.a.getClass();
        wzsVar.invoke("locale", xh1.a(locale));
        wzsVar.invoke("content_language", this.c.b.a(context));
        List b = this.c.b.b(context);
        wzsVar.invoke("device_languages", b != null ? j5g.g0(b, StringUtils.COMMA, null, null, 0, null, 62) : null);
        String c = ((rm0) this.f).c();
        this.c.getClass();
        wzsVar.invoke(c, jg0.a());
        String d = ((rm0) this.f).d();
        this.c.getClass();
        wzsVar.invoke(d, Build.MODEL);
        String e = ((rm0) this.f).e();
        this.c.getClass();
        wzsVar.invoke(e, "android");
        String f = ((rm0) this.f).f();
        this.c.getClass();
        wzsVar.invoke(f, Build.VERSION.RELEASE);
        Boolean c2 = zd2.c(context);
        if (c2 != null) {
            wzsVar.invoke("vpn_enabled", c2.booleanValue() ? "1" : "0");
        }
        if (!this.b.b(context) && (a = this.d.a()) != null) {
            wzsVar.invoke("location_timestamp", String.valueOf(a.getTime()));
            wzsVar.invoke(O6.s, String.valueOf(a.getLatitude()));
            wzsVar.invoke("lon", String.valueOf(a.getLongitude()));
            wzsVar.invoke("precision", String.valueOf(Math.round(a.getAccuracy())));
        }
        if (!this.b.b(context)) {
            wzsVar.invoke(((rm0) this.f).a(), this.h.a);
            wzsVar.invoke(CommonUrlParts.APP_SET_ID, this.g.d);
            td tdVar = this.g.a;
            boolean z = false;
            if (tdVar != null) {
                boolean z2 = tdVar.b;
                String str = tdVar.a;
                this.e.getClass();
                boolean z3 = (str == null || str.length() == 0 || DeviceIdUtils.NULL_UUID.equals(str)) ? false : true;
                if (!z2 && z3) {
                    wzsVar.invoke("google_aid", str);
                }
            }
            td tdVar2 = this.g.b;
            if (tdVar2 != null) {
                boolean z4 = tdVar2.b;
                String str2 = tdVar2.a;
                this.e.getClass();
                if (str2 != null && str2.length() != 0 && !DeviceIdUtils.NULL_UUID.equals(str2)) {
                    z = true;
                }
                if (!z4 && z) {
                    wzsVar.invoke("huawei_oaid", str2);
                }
            }
        }
        wzsVar.invoke(CommonUrlParts.SCREEN_WIDTH, String.valueOf(om3.d(context)));
        wzsVar.invoke(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(om3.b(context)));
        wzsVar.invoke(CommonUrlParts.SCALE_FACTOR, String.valueOf(context.getResources().getDisplayMetrics().density));
        wzsVar.invoke(CommonUrlParts.SCREEN_DPI, String.valueOf(om3.a(context)));
    }

    public pm0(d4 d4Var, px2 px2Var, sy2 sy2Var, jg0 jg0Var, ci1 ci1Var, sd sdVar, qm0 qm0Var) {
        this.a = px2Var;
        this.b = sy2Var;
        this.c = jg0Var;
        this.d = ci1Var;
        this.e = sdVar;
        this.f = qm0Var;
        this.g = d4Var.b();
        this.h = d4Var.c();
    }
}
