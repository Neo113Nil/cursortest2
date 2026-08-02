package defpackage;

import com.yandex.go.ads.mobile_ads_sdk.presentation.divkit.native_banner.NativeAdSlot;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class d250 {
    public static NativeAdSlot a(String str) {
        Object obj;
        Iterator<E> it = NativeAdSlot.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((NativeAdSlot) obj).getCustomType(), str)) {
                break;
            }
        }
        return (NativeAdSlot) obj;
    }
}
