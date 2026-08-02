package xsna;

import com.vk.clips.sdk.shared.paging.PaginationKey;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.mke;

/* compiled from: ClipsTop.kt */
/* loaded from: classes14.dex */
public final class faf extends e7d {
    /* JADX WARN: Multi-variable type inference failed */
    public faf(String str, PaginationKey paginationKey, mke mkeVar, int i, Integer num, Integer num2, boolean z) {
        super("shortVideo.getTopVideos", paginationKey, i, false);
        String a;
        List<String> a2;
        Pair pair = null;
        if (mkeVar instanceof mke.x) {
            mke.x xVar = (mke.x) mkeVar;
            K("track_code", xVar.b);
            K("product_data", xVar.c);
        } else if (mkeVar instanceof mke.j) {
            pair = new Pair("tag", ((mke.j) mkeVar).a);
        } else if (mkeVar instanceof mke.a) {
            pair = new Pair("audioId", ((mke.a) mkeVar).a);
        } else if (mkeVar instanceof mke.m) {
            pair = new Pair("maskId", ((mke.m) mkeVar).a);
        } else if (mkeVar instanceof mke.d) {
            pair = new Pair("compilationId", ((mke.d) mkeVar).a);
        } else if (mkeVar instanceof mke.i) {
            pair = new Pair("placeId", Integer.valueOf(((mke.i) mkeVar).a));
        } else if (mkeVar instanceof mke.y) {
            mke.y yVar = (mke.y) mkeVar;
            K("from_video", yVar.a);
            String str2 = yVar.b;
            if (str2 != null && (a = cqm0.a(str2)) != null) {
                K("track_code", a);
            }
        } else {
            if ((mkeVar instanceof mke.v) || (mkeVar instanceof mke.s) || (mkeVar instanceof mke.b) || (mkeVar instanceof mke.o) || (mkeVar instanceof mke.n) || (mkeVar instanceof mke.u) || (mkeVar instanceof mke.k) || (mkeVar instanceof mke.t) || (mkeVar instanceof mke.l) || (mkeVar instanceof mke.p) || (mkeVar instanceof mke.w) || (mkeVar instanceof mke.h) || (mkeVar instanceof mke.r) || (mkeVar instanceof mke.c) || (mkeVar instanceof mke.e) || (mkeVar instanceof mke.f) || (mkeVar instanceof mke.q) || (mkeVar instanceof mke.z)) {
                throw new IllegalStateException("incorrect filter for ClipTop");
            }
            if (mkeVar != 0) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (pair != null) {
            String str3 = (String) pair.d();
            Object g = pair.g();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str3, g);
            s3q0 s3q0Var = s3q0.a;
            K("filters", jSONObject.toString());
        }
        if (num != null) {
            C(num.intValue(), "prefetch_count");
        }
        if (num2 != null) {
            C(num2.intValue(), "prefetch_session_id");
        }
        if ((mkeVar instanceof mke.g) && (a2 = ((mke.g) mkeVar).a()) != null) {
            K("last_video_ids", j5g.g0(a2, StringUtils.COMMA, null, null, 0, null, 62));
        }
        K("ref", str);
        String deviceInfo = qyk0.a().getDeviceInfo();
        if (!z) {
            JSONObject jSONObject2 = new JSONObject(deviceInfo);
            jSONObject2.remove("is_whitelist_enabled");
            deviceInfo = jSONObject2.toString();
        }
        K("device_info", deviceInfo);
        if (o25.a().b()) {
            return;
        }
        this.d = true;
        this.c = true;
    }
}
