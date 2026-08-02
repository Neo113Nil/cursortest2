package sg.bigo.ads.cn;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.cn.a;

/* loaded from: classes9.dex */
public final class m extends e<sg.bigo.ads.bs.d> {
    public m(@NonNull Map<String, Object> map, @NonNull sg.bigo.ads.an.g gVar, @Nullable sg.bigo.ads.cf.b bVar, @NonNull sg.bigo.ads.ce.b bVar2) {
        super(map, gVar, bVar, bVar2);
    }

    @Override // sg.bigo.ads.cn.e, sg.bigo.ads.cn.a
    public final void a(@NonNull a.b bVar) {
        super.a(bVar);
        bVar.a("token", this.b.P());
    }

    @Override // sg.bigo.ads.cn.a
    @Nullable
    public final sg.bigo.ads.bh.e c() {
        return sg.bigo.ads.bp.e.c();
    }

    @Override // sg.bigo.ads.cn.a
    @NonNull
    public final /* synthetic */ sg.bigo.ads.bo.a f() {
        String str = this.i;
        return str != null ? new sg.bigo.ads.bs.d(sg.bigo.ads.b.a(str, "/Ad/ReportUniBaina")) : new sg.bigo.ads.bs.d(sg.bigo.ads.b.a(sg.bigo.ads.b.b(), "/Ad/ReportUniBaina"));
    }

    @Override // sg.bigo.ads.cn.a
    public final boolean g() {
        return false;
    }

    @Override // sg.bigo.ads.cn.a
    public final boolean j() {
        return false;
    }

    @Override // sg.bigo.ads.cn.a
    public final void i() {
    }
}
