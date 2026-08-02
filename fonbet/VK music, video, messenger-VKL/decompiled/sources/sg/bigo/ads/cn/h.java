package sg.bigo.ads.cn;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.cn.a;

/* loaded from: classes9.dex */
public final class h extends a<sg.bigo.ads.cf.e> {

    @NonNull
    private final sg.bigo.ads.ce.b j;
    private final sg.bigo.ads.ci.i k;

    public h(@NonNull sg.bigo.ads.an.g gVar, @NonNull sg.bigo.ads.cf.b bVar, sg.bigo.ads.ci.i iVar, long j, @NonNull sg.bigo.ads.ce.b bVar2) {
        super(gVar, bVar, j);
        this.j = bVar2;
        this.k = iVar;
    }

    @Override // sg.bigo.ads.cn.a
    public final void a(int i, int i2, String str) {
        this.j.a(a(), i, i2, str, null);
    }

    @Override // sg.bigo.ads.cn.a
    @Nullable
    public final sg.bigo.ads.bh.e c() {
        return sg.bigo.ads.bp.e.d();
    }

    @Override // sg.bigo.ads.cn.a
    public final long e() {
        sg.bigo.ads.cf.b bVar = this.c;
        return bVar != null ? bVar.a.l.d : super.e();
    }

    @Override // sg.bigo.ads.cn.a
    @NonNull
    public final /* synthetic */ sg.bigo.ads.cf.e f() {
        String str = this.i;
        return str != null ? this.c.b("/Ad/GetUniConfig", str) : this.c.b("/Ad/GetUniConfig", null);
    }

    @Override // sg.bigo.ads.cn.a
    public final void i() {
        sg.bigo.ads.bw.a.x();
    }

    @Override // sg.bigo.ads.cn.a
    public final boolean j() {
        return sg.bigo.ads.ai.k.a.c() && sg.bigo.ads.bw.a.w();
    }

    @Override // sg.bigo.ads.cn.a
    public final void a(@NonNull String str, @NonNull Map<String, Object> map) {
        this.j.a(a(), str);
    }

    @Override // sg.bigo.ads.cn.a
    public final void a(@NonNull a.b bVar) {
        bVar.a("req_status", Integer.valueOf(sg.bigo.ads.at.b.c()));
        sg.bigo.ads.an.b ac = this.b.ac();
        bVar.a("bat_stat", ac != null ? String.valueOf(ac.c) : "");
        bVar.a("bat_num", ac != null ? String.valueOf(ac.a) : "");
        bVar.a("bat_scale", ac != null ? String.valueOf(ac.b) : "");
        bVar.a("coppa", Integer.valueOf(sg.bigo.ads.bw.a.r()));
        bVar.a("global_md5", this.b.aF());
        bVar.a("slots_md5", this.k.a);
    }
}
