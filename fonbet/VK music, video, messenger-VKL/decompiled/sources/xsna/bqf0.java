package xsna;

import android.os.Build;
import com.vk.instantjobs.InstantJob;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import xsna.ij20;
import xsna.u6x;

/* compiled from: RegisterDeviceForPushesJob.kt */
/* loaded from: classes.dex */
public final class bqf0 extends u4w {
    public final String c;
    public final int d;
    public final String e;
    public final boolean f;
    public final String g;
    public final List<String> h;
    public final boolean i;
    public final vle0 j = new vle0();

    /* compiled from: RegisterDeviceForPushesJob.kt */
    public static final class a implements s7x<bqf0> {
        @Override // xsna.s7x
        public final bqf0 a(ny90 ny90Var) {
            String f = ny90Var.f("token");
            int c = ny90Var.c(CallAnalyticsApiRequest.KEY_APP_VERSION);
            String f2 = ny90Var.f("companion_apps");
            boolean a = ny90Var.a("google_services_available");
            String f3 = ny90Var.f("push_provider");
            String f4 = ny90Var.f("exchange_tokens");
            if (f4.length() <= 0) {
                f4 = null;
            }
            List c0 = f4 != null ? drm0.c0(f4, new String[]{StringUtils.COMMA}, 0, 6) : null;
            if (c0 == null) {
                c0 = EmptyList.b;
            }
            return new bqf0(f, c, f2, a, f3, c0, ny90Var.a("registered_device_logged"));
        }

        @Override // xsna.s7x
        public final void b(bqf0 bqf0Var, ny90 ny90Var) {
            bqf0 bqf0Var2 = bqf0Var;
            ny90Var.o("token", bqf0Var2.c);
            ny90Var.l(CallAnalyticsApiRequest.KEY_APP_VERSION, bqf0Var2.d);
            ny90Var.o("companion_apps", bqf0Var2.e);
            ny90Var.j("google_services_available", bqf0Var2.f);
            ny90Var.o("push_provider", bqf0Var2.g);
            ny90Var.o("exchange_tokens", j5g.g0(bqf0Var2.h, StringUtils.COMMA, null, null, 0, null, 62));
            ny90Var.j("registered_device_logged", bqf0Var2.i);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ImRegisterDeviceForPushes";
        }
    }

    public bqf0(String str, int i, String str2, boolean z, String str3, List<String> list, boolean z2) {
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = z;
        this.g = str3;
        this.h = list;
        this.i = z2;
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        long j = w2wVar.H0().d;
        this.j.getClass();
        String c = vle0.c(j);
        ij20.a aVar2 = new ij20.a();
        aVar2.d = bz2.m();
        aVar2.c = "account.registerDevice";
        aVar2.f.put(CallAnalyticsApiRequest.KEY_APP_VERSION, Integer.valueOf(this.d).toString());
        String str = this.c;
        aVar2.b("token", str);
        aVar2.b("system_version", Build.VERSION.RELEASE);
        Integer num = 4;
        aVar2.f.put("type", num.toString());
        aVar2.f.put("pushes_granted", Integer.valueOf(w2wVar.getConfig().f.e() ? 1 : 0).toString());
        aVar2.b("push_provider", this.g);
        aVar2.b("device_id", b6m.b(w2wVar.getContext()));
        aVar2.b(AnalyticsBaseParamsConstantsKt.DEVICE_MODEL, vle0.b());
        aVar2.j("has_google_services", this.f);
        aVar2.f.put("app_id", Integer.valueOf(gnj.a(w2wVar.getContext()).getInt("com.vk.sdk.APP_ID")).toString());
        aVar2.b("companion_apps", this.e);
        List<String> list = this.h;
        if (!list.isEmpty()) {
            aVar2.b("exchange_tokens", p4g.k(list, StringUtils.COMMA, null));
        }
        if (c.length() > 0) {
            aVar2.b("token_sig", vle0.d(str, w2wVar, c));
        }
        if (!this.i) {
            aVar2.l = true;
        }
        aVar2.i = true;
        bz2.f(new ij20(aVar2), new cqf0(w2wVar, this, c, j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqf0)) {
            return false;
        }
        bqf0 bqf0Var = (bqf0) obj;
        return epx.f(this.c, bqf0Var.c) && this.d == bqf0Var.d && epx.f(this.e, bqf0Var.e) && this.f == bqf0Var.f && epx.f(this.g, bqf0Var.g) && epx.f(this.h, bqf0Var.h) && this.i == bqf0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + fw3.a(urd0.a(qoy.b(urd0.a(shy.a(this.d, this.c.hashCode() * 31, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationHideCondition o() {
        return InstantJob.NotificationHideCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return "register-device";
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "RegisterDeviceForPushesJob";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegisterDeviceForPushesJob(token='");
        sb.append(erm0.D0(5, this.c));
        sb.append("...', appVersion=");
        return vu5.b(sb, this.d, ')');
    }
}
