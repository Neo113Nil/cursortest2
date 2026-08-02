package xsna;

import androidx.annotation.Nullable;
import com.github.luben.zstd.BufferPool;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedRequestContext;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: DolbyVisionConfig.java */
/* loaded from: classes12.dex */
public final class pvn implements t1y0, sjg, oh60, BufferPool {
    public final Object b;

    public /* synthetic */ pvn(Object obj, boolean z) {
        this.b = obj;
    }

    @Nullable
    public static pvn e(xi90 xi90Var) {
        String str;
        xi90Var.Q(2);
        int C = xi90Var.C();
        int i = C >> 1;
        int C2 = ((xi90Var.C() >> 3) & 31) | ((C & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder e = fw3.e(str);
        e.append(i < 10 ? ".0" : ".");
        e.append(i);
        return new pvn(z23.b(C2, C2 < 10 ? ".0" : ".", e), false);
    }

    @Override // xsna.sjg
    public void a(io.reactivex.rxjava3.disposables.c cVar) {
        hg1.a(cVar, (f5z) this.b);
    }

    @Override // xsna.t1y0
    public void b() {
        cvk.r(new com.vk.movika.sdk.base.model.b((com.vk.channels.impl.channel_screen.send_msg.a) this.b, 13));
    }

    @Override // xsna.oh60
    public mx6 c(vg60 vg60Var, krk0 krk0Var) {
        awq bwqVar;
        boolean z = krk0Var.a;
        ac60 ac60Var = (ac60) this.b;
        fk60 fk60Var = new fk60(vg60Var.d, vg60Var.a, vg60Var.b, vg60Var.e, vg60Var.k);
        JSONObject jSONObject = vg60Var.g;
        fk60Var.K("geo_data", jSONObject != null ? jSONObject.toString() : null);
        fk60Var.K("filters", vg60Var.h);
        fk60Var.K("user_options", vg60Var.i);
        fk60Var.K("device_info", vg60Var.j);
        ac60Var.getClass();
        long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        fk60Var.D(micros, CommonUrlParts.REQUEST_ID);
        if (z) {
            p1n p1nVar = krk0Var.c;
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = krk0Var.b;
            LinkedHashMap<String, String> linkedHashMap = fk60Var.j;
            String str = linkedHashMap.get(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            String str2 = linkedHashMap.get("count");
            int parseInt = str2 != null ? Integer.parseInt(str2) : -1;
            String str3 = linkedHashMap.get("feed_id");
            if (str3 == null) {
                str3 = com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen);
            }
            bwqVar = new bwq(new MobileOfficialAppsFeedStat$FeedRequestContext(parseInt, str3, vrk0.c(str), mobileOfficialAppsCoreNavStat$EventScreen, x260.b(com.vk.core.utils.newtork.b.c()), fk60Var.b, linkedHashMap.get("start_from"), p1nVar != null ? vrk0.b(p1nVar) : null, null, Long.valueOf(micros), null, null, null, 7424, null));
            fk60Var.w = bwqVar;
        } else {
            bwqVar = new zvq();
        }
        return new mx6(z ? rsg0.y0(fk60Var, null, null, 3).p(new yb60(bwqVar)) : rsg0.y0(fk60Var, null, null, 3).U(new s7(new c2u(bwqVar, 24), 24)), bwqVar);
    }

    public void g(t4h t4hVar) {
        ((LinkedList) this.b).add(t4hVar);
    }

    @Override // com.github.luben.zstd.BufferPool
    public ByteBuffer get(int i) {
        return ((m3w0) this.b).get(i);
    }

    @Override // xsna.sjg
    public String getRef() {
        ce60 ce60Var = ce60.b;
        return ce60.k(ce60Var, ce60Var.i());
    }

    @Override // com.github.luben.zstd.BufferPool
    public void release(ByteBuffer byteBuffer) {
        ((m3w0) this.b).release(byteBuffer);
    }

    public pvn() {
        this.b = new ac60();
    }

    public pvn(Object obj) {
        this.b = new LinkedList();
    }
}
