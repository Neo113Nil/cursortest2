package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;
import sg.bigo.ads.ai.n;

/* loaded from: classes9.dex */
public class IconAdsRequest extends sg.bigo.ads.api.b implements sg.bigo.ads.aj.c {
    private final n h;
    private final sg.bigo.ads.api.core.b i;
    private final int j;
    private final int k;
    private final int l;
    private final b m;

    public static class a extends c<a, IconAdsRequest> {
        public n a;
        public sg.bigo.ads.api.core.b b;
        public int c;
        public int d = 1;
        public int e = 20;
        public b f;

        @Override // sg.bigo.ads.api.c
        public final /* synthetic */ IconAdsRequest createAdRequest() {
            if (this.a == null) {
                return null;
            }
            return new IconAdsRequest(this, (byte) 0);
        }
    }

    public interface b {
        int a();
    }

    private IconAdsRequest(@NonNull a aVar) {
        super(aVar.mSlotId, null);
        this.h = aVar.a;
        this.i = aVar.b;
        this.j = aVar.c;
        this.k = aVar.d;
        this.l = aVar.e;
        this.m = aVar.f;
    }

    @Override // sg.bigo.ads.api.b
    public final int c() {
        return this.h.b();
    }

    @Override // sg.bigo.ads.api.b
    @Nullable
    public final Map<String, Object> e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        sg.bigo.ads.api.core.b bVar = this.i;
        if (bVar != null) {
            linkedHashMap.put("host_slot", bVar.b());
            linkedHashMap.put("host_placement", this.i.c());
            linkedHashMap.put("host_ad_type", Integer.valueOf(this.i.y()));
            linkedHashMap.put("host_adx_type", Integer.valueOf(this.i.x()));
            linkedHashMap.put("dsp_source", this.i.w());
            linkedHashMap.put("main_domain", this.i.j());
            linkedHashMap.put("main_bundle", this.i.o());
            linkedHashMap.put("main_adx_sid", Long.valueOf(this.i.z()));
            linkedHashMap.put("main_ad_id", this.i.s());
            linkedHashMap.put("dsp_extra", this.i.ao());
        }
        linkedHashMap.put("adx_type", 5);
        linkedHashMap.put("ad_type", Integer.valueOf(c()));
        linkedHashMap.put("icon_ads_type", Integer.valueOf(this.k));
        linkedHashMap.put("scene_page", Integer.valueOf(this.j));
        linkedHashMap.put("icon_num", Integer.valueOf(this.l));
        return linkedHashMap;
    }

    @Override // sg.bigo.ads.api.b
    public final boolean f() {
        return true;
    }

    @Override // sg.bigo.ads.api.b
    public final boolean g() {
        return true;
    }

    @Override // sg.bigo.ads.api.b
    public final boolean h() {
        return true;
    }

    @Override // sg.bigo.ads.api.b
    public final n i() {
        return this.h;
    }

    @Override // sg.bigo.ads.aj.b
    public final sg.bigo.ads.api.core.b j() {
        return this.i;
    }

    @Override // sg.bigo.ads.aj.c
    public final int k() {
        return this.l;
    }

    @Override // sg.bigo.ads.aj.c
    public final int l() {
        return this.j;
    }

    @Override // sg.bigo.ads.aj.c
    public final int m() {
        b bVar = this.m;
        if (bVar != null) {
            return bVar.a();
        }
        return 1;
    }

    public /* synthetic */ IconAdsRequest(a aVar, byte b2) {
        this(aVar);
    }
}
