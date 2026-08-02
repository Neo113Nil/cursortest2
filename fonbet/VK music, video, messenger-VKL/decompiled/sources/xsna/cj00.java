package xsna;

import android.content.Context;
import com.vk.log.L;
import okhttp3.p;

/* compiled from: ManifestApiSecretsProvider.kt */
/* loaded from: classes.dex */
public final class cj00 {
    public final Context a;
    public final Object b;

    public cj00(Context context) {
        this.a = context;
        this.b = new bpn0(new ib8(this, 5));
    }

    public boolean a(String str) {
        ny70 ny70Var = (ny70) this.b;
        String a = zr.a("https://", str, "/ping.txt");
        L.e("VkProxyHttpClient", "Check: common request begin: ".concat(a));
        p.a aVar = new p.a();
        aVar.i(a);
        okhttp3.p b = aVar.b();
        bpn0 bpn0Var = ny70Var.c;
        okhttp3.u uVar = ny70.c((okhttp3.o) bpn0Var.getValue(), b).a;
        boolean z = uVar != null && (uVar.t() || uVar.o() == 429);
        L.e("VkProxyHttpClient", "Check: common request end status: " + a + " - " + z + '}');
        if (uVar != null) {
            x2r0.c(uVar);
        }
        if (ny70Var.d(str).containsAll(j5g.S0(ny70Var.d(brm0.y("internal.api.vk.ru", "vk.ru", str))))) {
            return z;
        }
        String a2 = zr.a("https://", brm0.y("internal.api.vk.ru", "vk.ru", str), "/ping.txt");
        L.e("VkProxyHttpClient", "Check: common request begin: ".concat(a2));
        p.a aVar2 = new p.a();
        aVar2.i(a2);
        okhttp3.u uVar2 = ny70.c((okhttp3.o) bpn0Var.getValue(), aVar2.b()).a;
        boolean z2 = uVar2 != null && (uVar2.t() || uVar2.o() == 429);
        L.e("VkProxyHttpClient", "Check: common request end status: " + a2 + " - " + z2 + '}');
        if (uVar2 != null) {
            x2r0.c(uVar2);
        }
        return z & z2;
    }

    public cj00(Context context, ny70 ny70Var) {
        this.a = context;
        this.b = ny70Var;
    }
}
