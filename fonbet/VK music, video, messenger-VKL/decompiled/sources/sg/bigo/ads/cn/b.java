package sg.bigo.ads.cn;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import sg.bigo.ads.cn.a;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public class b extends a<sg.bigo.ads.cf.e> implements i {
    protected final sg.bigo.ads.ai.j j;
    protected final sg.bigo.ads.api.b k;
    protected final sg.bigo.ads.ai.n l;
    protected final sg.bigo.ads.ce.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.ai.n> m;

    public b(@NonNull sg.bigo.ads.ai.j jVar, @NonNull sg.bigo.ads.an.g gVar, @NonNull sg.bigo.ads.cf.b bVar, @NonNull sg.bigo.ads.api.b bVar2, @NonNull sg.bigo.ads.ai.n nVar, @NonNull sg.bigo.ads.ce.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.ai.n> eVar) {
        super(gVar, bVar, nVar.d() * 1000);
        this.j = jVar;
        this.k = bVar2;
        this.l = nVar;
        this.m = eVar;
        bVar2.a(this.e, this.f, this.g);
    }

    @Override // sg.bigo.ads.cn.a
    @NonNull
    public final StringBuilder a(long j, String str) {
        StringBuilder a = super.a(j, str);
        a.append(StringUtils.COMMA);
        a.append(r.a(this.l.l()));
        a.append(StringUtils.COMMA);
        a.append(r.a(this.l.n()));
        return a;
    }

    @Override // sg.bigo.ads.cn.a
    @Nullable
    public final sg.bigo.ads.bh.e c() {
        return sg.bigo.ads.bp.e.d();
    }

    @Override // sg.bigo.ads.cn.a
    public final long e() {
        sg.bigo.ads.cf.b bVar = this.c;
        return bVar != null ? bVar.a.l.b : super.e();
    }

    @Override // sg.bigo.ads.cn.a
    public void i() {
        sg.bigo.ads.bw.a.z();
    }

    @Override // sg.bigo.ads.cn.a
    public boolean j() {
        return sg.bigo.ads.ai.k.a.d() && sg.bigo.ads.bw.a.y();
    }

    @Override // sg.bigo.ads.cn.i
    @NonNull
    public final sg.bigo.ads.api.b k() {
        return this.k;
    }

    @Override // sg.bigo.ads.cn.i
    @NonNull
    public final sg.bigo.ads.ai.n l() {
        return this.l;
    }

    @Override // sg.bigo.ads.cn.a
    @NonNull
    /* renamed from: m */
    public sg.bigo.ads.cf.e f() {
        return this.c.b("/Ad/GetUniAd", null);
    }

    @Override // sg.bigo.ads.cn.a
    public final void a(int i, int i2, String str) {
        sg.bigo.ads.ce.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.ai.n> eVar = this.m;
        if (eVar != null) {
            eVar.a(a(), i, i2, str, this.l);
        }
    }

    @Override // sg.bigo.ads.cn.a
    public void a(@NonNull String str, @NonNull Map<String, Object> map) {
        if (this.m != null) {
            Object obj = map.get("logid");
            sg.bigo.ads.cj.b a = sg.bigo.ads.cj.b.a(obj instanceof Long ? ((Long) obj).longValue() : 0L, this.k.g, this.l, str);
            if (a != null) {
                this.m.a(a(), this.k, a);
            } else {
                a(1005, 0, "Invalid ad data.");
            }
        }
    }

    @Override // sg.bigo.ads.cn.a
    public final void a(@NonNull a.b bVar) {
        int u;
        bVar.a("slot", r.a(this.l.l()));
        bVar.a("placement_id", r.a(this.l.n()));
        bVar.a("strategy_id", this.l.a());
        bVar.a("support_adx_types", sg.bigo.ads.api.core.a.a(this.k.c()));
        bVar.a("lat_enable", Integer.valueOf(this.b.z() ? 1 : 0));
        bVar.a("hw_lat_enable", Integer.valueOf(this.b.F() ? 1 : 0));
        bVar.a("fire_lat_enable", Integer.valueOf(this.b.ad() ? 1 : 0));
        bVar.a("token", this.j.l());
        bVar.a("slot_abflags", this.l.o());
        bVar.a("global_abflags", this.j.j());
        bVar.a("support_playable_ad", Integer.valueOf(this.l.r()));
        bVar.a("session_id", this.k.g.b);
        int c = sg.bigo.ads.at.b.c();
        bVar.a("req_status", Integer.valueOf(c));
        this.k.c(c);
        this.k.b(this.b.X());
        if (sg.bigo.ads.cl.h.a().a) {
            bVar.a("algo_info", sg.bigo.ads.cl.h.a().e.a(r.a(this.l.l())));
        }
        bVar.a("auc_mode", Integer.valueOf(this.l.v()));
        if (sg.bigo.ads.api.core.a.d(this.l.b())) {
            u = this.l.q().a("splash_orientation");
        } else {
            sg.bigo.ads.ai.j jVar = sg.bigo.ads.ai.k.a;
            u = jVar == null ? 0 : jVar.u();
        }
        bVar.a(X3.i.n, Integer.valueOf(u));
        Map<String, Object> e = this.k.e();
        if (e != null) {
            for (Map.Entry<String, Object> entry : e.entrySet()) {
                bVar.a(entry.getKey(), entry.getValue());
            }
        }
        String str = this.k.g.a;
        if (!r.a((CharSequence) str)) {
            bVar.a("load_ext", str);
        }
        String a = d.a(this.k, this.b);
        if (!TextUtils.isEmpty(a)) {
            bVar.a("ad_info", a);
        }
        sg.bigo.ads.an.b ac = this.b.ac();
        bVar.a("bat_stat", ac != null ? String.valueOf(ac.c) : "");
        bVar.a("bat_num", ac != null ? String.valueOf(ac.a) : "");
        bVar.a("bat_scale", ac != null ? String.valueOf(ac.b) : "");
        bVar.a("tc_string", sg.bigo.ads.bg.b.f());
        if (!(this instanceof j)) {
            bVar.a("imp_pattern", Integer.valueOf(this.b.aw()));
        }
        bVar.a("gp_vc", Integer.valueOf(this.b.ax()));
        bVar.a("webp_gif", Integer.valueOf(this.b.az() ? 1 : 0));
        bVar.a("anti_boot_count", Integer.valueOf(this.b.aB()));
        bVar.a("anti_sig", this.b.aC());
        bVar.a("anti_detect_key", Integer.valueOf(this.b.aD()));
        bVar.a("anti_update_time", this.b.aE());
        bVar.a("om_ver", this.b.aH());
    }
}
