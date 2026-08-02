package sg.bigo.ads.cn;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.O6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.api.core.q;
import sg.bigo.ads.bo.a;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public abstract class a<T extends sg.bigo.ads.bo.a> {
    protected final int a;
    protected final sg.bigo.ads.an.g b;
    protected final sg.bigo.ads.cf.b c;
    protected final long d;

    @Nullable
    protected final String e;

    @Nullable
    protected final String f;

    @Nullable
    protected final String g;
    public final q h;
    public String i;
    private final sg.bigo.ads.bo.b<sg.bigo.ads.bs.b, sg.bigo.ads.bt.d> j;

    /* renamed from: sg.bigo.ads.cn.a$a, reason: collision with other inner class name */
    public static class C2455a extends sg.bigo.ads.bs.b<sg.bigo.ads.cf.e> {
        private final long q;

        public C2455a(Context context, int i, @NonNull sg.bigo.ads.cf.e eVar, long j) {
            super(i, eVar, context);
            this.q = j;
        }

        @Override // sg.bigo.ads.bs.c
        public final void h() {
            super.h();
            sg.bigo.ads.cf.e eVar = (sg.bigo.ads.cf.e) this.k;
            HashMap hashMap = new HashMap();
            hashMap.put("pre_host", eVar.f());
            hashMap.put("host_cfg_clear", Integer.valueOf(eVar.h() ? 1 : 0));
            hashMap.put("host_src", eVar.i());
            sg.bigo.ads.cf.i g = eVar.g();
            if (g != null) {
                hashMap.put("host_type", Integer.valueOf(g.d()));
            }
            a(hashMap);
            long j = this.q;
            if (j > 0) {
                eVar.a(j);
            }
        }
    }

    public interface b {
        void a(String str, Object obj);
    }

    public a(@NonNull sg.bigo.ads.an.g gVar, @Nullable sg.bigo.ads.cf.b bVar) {
        this(gVar, bVar, 15000L);
    }

    public final int a() {
        return this.a;
    }

    public abstract void a(int i, int i2, String str);

    public abstract void a(@NonNull String str, @NonNull Map<String, Object> map);

    public abstract void a(@NonNull b bVar);

    public final void b() {
        final JSONObject jSONObject;
        String str;
        T f = f();
        sg.bigo.ads.bs.b c2455a = f instanceof sg.bigo.ads.cf.e ? new C2455a(this.b.af(), this.a, (sg.bigo.ads.cf.e) f, e()) : new sg.bigo.ads.bs.b(this.a, f, this.b.af());
        boolean z = false;
        int i = 0;
        z = false;
        if (sg.bigo.ads.bw.a.s() && !(this instanceof m) && !(this instanceof h)) {
            String str2 = "Missing CCPA consent";
            if (sg.bigo.ads.bw.a.o() == 2) {
                str = "Missing GDPR consent";
                i = 1;
            } else {
                str = "Missing CCPA consent";
            }
            if (sg.bigo.ads.bw.a.q() == 2) {
                i++;
                str = "Missing LGPD consent";
            }
            if (sg.bigo.ads.bw.a.p() == 2) {
                i++;
            } else {
                str2 = str;
            }
            if (sg.bigo.ads.bw.a.r() == 2) {
                i++;
                str2 = "Missing COPPA consent";
            }
            if (i > 1) {
                str2 = "Missing user consent";
            }
            this.j.a((sg.bigo.ads.bo.b<sg.bigo.ads.bs.b, sg.bigo.ads.bt.d>) c2455a, new sg.bigo.ads.bo.h(800, str2));
            return;
        }
        try {
            jSONObject = new JSONObject();
            jSONObject.putOpt(MBridgeConstans.APP_KEY, r.a(this.b.a()));
            jSONObject.putOpt("pkg_name", r.a(this.b.b()));
            jSONObject.putOpt("pkg_ver", r.a(this.b.c()));
            jSONObject.putOpt("pkg_vc", Integer.valueOf(this.b.d()));
            jSONObject.putOpt("pkg_ch", this.b.e());
            jSONObject.putOpt(O6.F, r.a(this.b.i()));
            jSONObject.putOpt("os_ver", r.a(this.b.j()));
            jSONObject.putOpt(AnalyticsBaseParamsConstantsKt.OS_LANG, this.b.k());
            jSONObject.putOpt("vendor", this.b.l());
            jSONObject.putOpt("model", this.b.m());
            jSONObject.putOpt(CommonCode.MapKey.HAS_RESOLUTION, this.b.o());
            jSONObject.putOpt("dpi", Integer.valueOf(this.b.p()));
            jSONObject.putOpt("dpi_f", this.b.q());
            jSONObject.putOpt("net", this.b.r());
            jSONObject.putOpt(AnalyticsBaseParamsConstantsKt.TIMEZONE, this.b.s());
            jSONObject.putOpt("country", this.b.t());
            jSONObject.putOpt(HiAnalyticsConstant.BI_KEY_SDK_VER, r.a(this.b.y()));
            jSONObject.putOpt("sdk_vc", 50900);
            jSONObject.putOpt("consent_status", Integer.valueOf(sg.bigo.ads.da.b.b()));
            if (!sg.bigo.ads.bw.a.s()) {
                jSONObject.putOpt(O6.X0, r.a(this.b.A()));
                jSONObject.putOpt("hw_id", r.a(this.b.G()));
                jSONObject.putOpt("fire_id", r.a(this.b.ae()));
                jSONObject.putOpt("af_id", r.a(this.b.B()));
                jSONObject.putOpt("uid", r.a(this.b.C()));
            }
            if (sg.bigo.ads.bw.a.m() == 1) {
                jSONObject.putOpt("tc_string", sg.bigo.ads.bg.b.f());
            }
            jSONObject.putOpt("gdpr_switch", Integer.valueOf(this.b.av()));
            long D = this.b.D();
            jSONObject.putOpt("timestamp", Long.valueOf(D));
            jSONObject.putOpt("abflags", this.b.E());
            jSONObject.putOpt("batsa", Integer.valueOf(this.b.ag() ? 1 : 0));
            jSONObject.putOpt("datasa", Integer.valueOf(this.b.ah()));
            jSONObject.putOpt("root", Integer.valueOf(this.b.ai() ? 1 : 0));
            String uuid = UUID.randomUUID().toString();
            jSONObject.putOpt(CommonUrlParts.REQUEST_ID, r.a(uuid));
            jSONObject.putOpt("sdk_channel", this.b.aa());
            jSONObject.putOpt("simulator_file", Integer.valueOf(this.b.ab()));
            jSONObject.putOpt("sim_country", this.f);
            jSONObject.putOpt("system_country", this.g);
            jSONObject.putOpt("inst_src", this.b.T());
            a(new b() { // from class: sg.bigo.ads.cn.a.3
                @Override // sg.bigo.ads.cn.a.b
                public final void a(String str3, Object obj) {
                    if (TextUtils.isEmpty(str3)) {
                        return;
                    }
                    try {
                        jSONObject.putOpt(str3, obj);
                    } catch (JSONException unused) {
                    }
                }
            });
            jSONObject.putOpt("sign", sg.bigo.ads.common.utils.n.b(a(D, uuid).toString()));
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (sg.bigo.ads.bw.a.u() && j()) {
            z = true;
        }
        sg.bigo.ads.bo.f d = d();
        c2455a.b = jSONObject;
        c2455a.c = null;
        c2455a.d = d;
        c2455a.e = z;
        c2455a.m = this.d;
        c2455a.a("SDK-Version-Code", BigoAdSdk.getSDKVersion());
        c2455a.l = c();
        sg.bigo.ads.bo.b bVar = this.j;
        if (bVar == null) {
            bVar = sg.bigo.ads.bo.b.d;
        }
        if (sg.bigo.ads.bo.g.a()) {
            sg.bigo.ads.bo.g.b.a(c2455a, bVar);
        } else {
            sg.bigo.ads.bo.g.a.a(c2455a, bVar);
        }
    }

    @Nullable
    public abstract sg.bigo.ads.bh.e c();

    public sg.bigo.ads.bo.f d() {
        return sg.bigo.ads.bs.b.a;
    }

    public long e() {
        return 0L;
    }

    @NonNull
    public abstract T f();

    public boolean g() {
        return true;
    }

    public boolean h() {
        return true;
    }

    public abstract void i();

    public abstract boolean j();

    public a(@NonNull sg.bigo.ads.an.g gVar, @Nullable sg.bigo.ads.cf.b bVar, long j) {
        this.h = new q();
        this.i = null;
        this.j = new sg.bigo.ads.bo.b<sg.bigo.ads.bs.b, sg.bigo.ads.bt.d>() { // from class: sg.bigo.ads.cn.a.1
            private long b = -1;
            private boolean c = false;

            @Override // sg.bigo.ads.bo.b
            public final /* synthetic */ sg.bigo.ads.bt.d a(@NonNull sg.bigo.ads.bt.a aVar) {
                return new sg.bigo.ads.bt.d(aVar);
            }

            @Override // sg.bigo.ads.bo.b
            public final /* synthetic */ void a(@NonNull sg.bigo.ads.bs.b bVar2) {
                super.a((AnonymousClass1) bVar2);
                this.b = SystemClock.elapsedRealtime();
                this.c = sg.bigo.ads.at.b.d();
            }

            @Override // sg.bigo.ads.bo.b
            public final /* synthetic */ void a(@NonNull sg.bigo.ads.bs.b bVar2, @NonNull sg.bigo.ads.bo.h hVar) {
                int i;
                String str;
                sg.bigo.ads.bs.b bVar3 = bVar2;
                if (a.this.g() && a.this.i == null) {
                    long elapsedRealtime = this.b > 0 ? SystemClock.elapsedRealtime() - this.b : 0L;
                    String g = bVar3.g();
                    if (hVar.a == 900) {
                        g = "https://invalid.url";
                    }
                    String str2 = g;
                    T t = bVar3.k;
                    String d = t.e() ? t.d() : "";
                    int i2 = hVar.a;
                    String message = hVar.getMessage();
                    boolean z = this.c;
                    int e = bVar3.e();
                    a aVar = a.this;
                    String str3 = aVar.e;
                    String str4 = aVar.f;
                    String str5 = aVar.g;
                    sg.bigo.ads.an.g gVar2 = aVar.b;
                    sg.bigo.ads.da.b.a(str2, d, false, elapsedRealtime, i2, message, z, e, str3, str4, str5, gVar2 == null ? null : gVar2.X(), bVar3.e, bVar3.f, bVar3.g, bVar3.h, bVar3.p);
                }
                int i3 = hVar.a;
                if (i3 == 701 || i3 == 702) {
                    i = IronSourceError.ERROR_LOAD_FAILED_TIMEOUT;
                    str = "Request timeout.";
                } else {
                    str = "(" + hVar.a + ") " + hVar.getMessage();
                    i = IronSourceError.ERROR_RV_LOAD_DURING_LOAD;
                }
                a.this.a(bVar3.g(), i, hVar.a, str, null);
                a.this.a(bVar3.g());
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x006d  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0071  */
            @Override // sg.bigo.ads.bo.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final /* synthetic */ void a(@NonNull sg.bigo.ads.bs.b bVar2, @NonNull sg.bigo.ads.bt.d dVar) {
                boolean z;
                boolean z2;
                sg.bigo.ads.co.a aVar;
                sg.bigo.ads.bs.b bVar3 = bVar2;
                sg.bigo.ads.bt.d dVar2 = dVar;
                String a = dVar2.a();
                if (bVar3.f) {
                    try {
                        if (TextUtils.isEmpty(a) || !a.trim().startsWith("{")) {
                            String a2 = sg.bigo.ads.bc.a.a(a, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F", null);
                            if (TextUtils.isEmpty(a2)) {
                                bVar3.g = 0;
                            } else {
                                try {
                                    bVar3.g = 1;
                                    a = a2;
                                } catch (Exception unused) {
                                    a = a2;
                                    bVar3.g = 2;
                                    try {
                                        bVar3.h = dVar2.a("logid");
                                    } catch (Exception unused2) {
                                    }
                                    a aVar2 = a.this;
                                    q qVar = aVar2.h;
                                    z = bVar3.e;
                                    z2 = bVar3.f;
                                    int i = bVar3.g;
                                    String str = bVar3.h;
                                    qVar.a = z;
                                    qVar.b = z2;
                                    qVar.c = i;
                                    qVar.d = str;
                                    if (z) {
                                        if (z2) {
                                        }
                                    }
                                    aVar = new sg.bigo.ads.co.a(a);
                                    if (!aVar.a()) {
                                    }
                                    a.a(a.this, sg.bigo.ads.common.utils.m.a(aVar.d, "host_cfg"), bVar3.g(), this.b);
                                    if (a.this.g()) {
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                            }
                        } else {
                            bVar3.g = 3;
                        }
                        bVar3.h = dVar2.a("logid");
                    } catch (Exception unused3) {
                    }
                }
                a aVar22 = a.this;
                q qVar2 = aVar22.h;
                z = bVar3.e;
                z2 = bVar3.f;
                int i2 = bVar3.g;
                String str2 = bVar3.h;
                qVar2.a = z;
                qVar2.b = z2;
                qVar2.c = i2;
                qVar2.d = str2;
                if (z && (!z2 || i2 != 1)) {
                    if (z2) {
                        sg.bigo.ads.bw.a.v();
                    } else {
                        aVar22.i();
                    }
                }
                aVar = new sg.bigo.ads.co.a(a);
                if (!aVar.a()) {
                    a.this.a(bVar3.g(), aVar.c, aVar.d);
                } else {
                    if (aVar.b()) {
                        sg.bigo.ads.bw.a.e(System.currentTimeMillis());
                    }
                    a.this.a(bVar3.g(), 1005, aVar.a, aVar.b, aVar.d);
                }
                a.a(a.this, sg.bigo.ads.common.utils.m.a(aVar.d, "host_cfg"), bVar3.g(), this.b);
                if (a.this.g() || a.this.i != null) {
                    return;
                }
                long elapsedRealtime = this.b > 0 ? SystemClock.elapsedRealtime() - this.b : 0L;
                T t = bVar3.k;
                String d = t.e() ? t.d() : "";
                String g = bVar3.g();
                int i3 = dVar2.a.a;
                boolean z3 = this.c;
                int e = bVar3.e();
                a aVar3 = a.this;
                String str3 = aVar3.e;
                String str4 = aVar3.f;
                String str5 = aVar3.g;
                sg.bigo.ads.an.g gVar2 = aVar3.b;
                sg.bigo.ads.da.b.a(g, d, true, elapsedRealtime, i3, "", z3, e, str3, str4, str5, gVar2 != null ? gVar2.X() : null, bVar3.e, bVar3.f, bVar3.g, bVar3.h, bVar3.p);
            }
        };
        this.a = sg.bigo.ads.bx.a.a();
        this.b = gVar;
        this.c = bVar;
        this.d = j;
        this.e = gVar.Q();
        this.f = gVar.R();
        this.g = gVar.S();
    }

    @NonNull
    public StringBuilder a(long j, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(r.a(this.b.a()));
        sb.append(StringUtils.COMMA);
        sb.append(r.a(this.b.b()));
        sb.append(StringUtils.COMMA);
        sb.append(r.a(this.b.c()));
        sb.append(StringUtils.COMMA);
        sb.append(this.b.d());
        sb.append(StringUtils.COMMA);
        sb.append(r.a(this.b.i()));
        sb.append(StringUtils.COMMA);
        sb.append(r.a(this.b.j()));
        sb.append(StringUtils.COMMA);
        sb.append(r.a(this.b.y()));
        sb.append(",50900,");
        sb.append(j);
        if (sg.bigo.ads.bw.a.s()) {
            sb.append(",,,");
            sb.append(r.a(this.b.C()));
            sb.append(StringUtils.COMMA);
        } else {
            sb.append(StringUtils.COMMA);
            sb.append(r.a(this.b.A()));
            sb.append(StringUtils.COMMA);
            sb.append(r.a(this.b.B()));
            sb.append(StringUtils.COMMA);
            sb.append(r.a(this.b.C()));
            sb.append(StringUtils.COMMA);
            sb.append(r.a(this.b.G()));
        }
        sb.append(StringUtils.COMMA);
        sb.append(r.a(str));
        return sb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.c != null && h() && this.i == null) {
            this.c.a(100L, str);
        }
    }

    public void a(String str, int i, int i2, String str2, @Nullable Map<String, Object> map) {
        a(i, i2, str2);
    }

    public void a(String str, @NonNull String str2, @NonNull Map<String, Object> map) {
        a(str2, map);
    }

    public static /* synthetic */ void a(a aVar, final String str, final String str2, final long j) {
        if (aVar.c != null) {
            if (TextUtils.isEmpty(str)) {
                aVar.a(str2);
            } else {
                sg.bigo.ads.bh.d.a(3, new Runnable() { // from class: sg.bigo.ads.cn.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a aVar2 = a.this;
                        sg.bigo.ads.cf.b bVar = aVar2.c;
                        if (bVar == null || bVar.a(str, str2, j, aVar2.g()).d == 0) {
                            return;
                        }
                        a.this.a(str2);
                    }
                });
            }
        }
    }
}
