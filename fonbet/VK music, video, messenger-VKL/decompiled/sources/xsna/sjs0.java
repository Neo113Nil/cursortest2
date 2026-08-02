package xsna;

import java.util.LinkedHashMap;
import one.video.player.error.ResponseInfo;

/* compiled from: VideoErrorExt.kt */
/* loaded from: classes8.dex */
public final class sjs0 {
    public static final LinkedHashMap a;

    static {
        zrp<ResponseInfo> j = ResponseInfo.j();
        int e = on00.e(c5g.u(j, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Object obj : j) {
            linkedHashMap.put(Integer.valueOf(((ResponseInfo) obj).i()), obj);
        }
        a = linkedHashMap;
    }
}
