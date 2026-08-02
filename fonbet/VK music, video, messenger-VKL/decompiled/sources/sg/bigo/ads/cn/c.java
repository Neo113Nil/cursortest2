package sg.bigo.ads.cn;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Map;

/* loaded from: classes9.dex */
public final class c implements i {
    private final sg.bigo.ads.ci.e a;
    private final sg.bigo.ads.an.g b;
    private final sg.bigo.ads.api.b c;
    private final sg.bigo.ads.ai.n d;
    private final sg.bigo.ads.ce.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.ai.n> e;
    private final int f;

    public c(sg.bigo.ads.ci.e eVar, sg.bigo.ads.an.g gVar, sg.bigo.ads.api.b bVar, sg.bigo.ads.ai.n nVar, sg.bigo.ads.ce.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.ai.n> eVar2) {
        this.a = eVar;
        this.b = gVar;
        this.c = bVar;
        this.d = nVar;
        this.e = eVar2;
        bVar.a(gVar.Q(), gVar.R(), gVar.S());
        this.f = sg.bigo.ads.bx.a.a();
    }

    @Override // sg.bigo.ads.cn.i
    public final int a() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    @Override // sg.bigo.ads.cn.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        String a;
        String str = this.c.a;
        if (TextUtils.isEmpty(str)) {
            a(1018, 10200, "An adm show be passed when constructing an ad request if using a server bidding slot.");
            return;
        }
        this.c.c(sg.bigo.ads.at.b.c());
        sg.bigo.ads.an.g gVar = this.b;
        if (gVar != null) {
            this.c.b(gVar.X());
        }
        int[] iArr = new int[1];
        sg.bigo.ads.co.a aVar = null;
        if (!TextUtils.isEmpty(str)) {
            byte[] b = sg.bigo.ads.bc.a.b(str, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F");
            if (b == null) {
                iArr[0] = 1;
            } else {
                a = sg.bigo.ads.cj.c.a(b);
                if (TextUtils.isEmpty(a)) {
                    iArr[0] = 2;
                }
                if (!TextUtils.isEmpty(a)) {
                    aVar = new sg.bigo.ads.co.a(a);
                }
            }
            a = null;
            if (!TextUtils.isEmpty(a)) {
            }
        }
        if (aVar == null || !aVar.a()) {
            if (aVar == null) {
                int i = iArr[0];
                a(1005, 10201, i == 1 ? "Invalid payload response." : i == 2 ? "Invalid payload data." : "Unknown payload error.");
                return;
            } else {
                if (aVar.b()) {
                    sg.bigo.ads.bw.a.e(System.currentTimeMillis());
                }
                a(1005, aVar.a, aVar.b);
                return;
            }
        }
        String str2 = aVar.c;
        Map<String, Object> map = aVar.d;
        if (this.e != null) {
            Object obj = map.get("logid");
            sg.bigo.ads.cj.b a2 = sg.bigo.ads.cj.b.a(obj instanceof Long ? ((Long) obj).longValue() : 0L, this.c.g, this.d, str2);
            if (a2 == null) {
                a(1005, 0, "Empty ad data.");
            } else if (TextUtils.equals(a2.b(), a2.x)) {
                this.e.a(this.f, this.c, a2);
            } else {
                a(1005, 0, "Unmatched slot of ad data.");
            }
        }
    }

    @Override // sg.bigo.ads.cn.i
    public final sg.bigo.ads.api.b k() {
        return this.c;
    }

    @Override // sg.bigo.ads.cn.i
    @NonNull
    public final sg.bigo.ads.ai.n l() {
        return this.d;
    }

    private void a(int i, int i2, String str) {
        sg.bigo.ads.ce.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.ai.n> eVar = this.e;
        if (eVar != null) {
            eVar.a(this.f, i, i2, str, this.d);
        }
    }
}
