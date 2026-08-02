package xsna;

import com.vk.libvideo.donut.model.Donut;
import com.vkontakte.android.R;
import kotlin.Triple;
import xsna.ezn;

/* compiled from: InactiveSubscriptionProvider.kt */
/* loaded from: classes2.dex */
public final class jsw implements qyn {
    @Override // xsna.qyn
    public final boolean a(Donut donut) {
        if (donut == null) {
            return false;
        }
        boolean z = donut.a;
        return (z && donut.b == Donut.DonutStatus.EXPIRING) || !z;
    }

    @Override // xsna.qyn
    public final Triple<Integer, Integer, ezn> b(Donut donut) {
        String str;
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_donut_outline_24);
        if (donut == null || (str = donut.e) == null) {
            str = donut != null ? donut.d : null;
            if (str == null) {
                str = "https://vk.com/@donut-android";
            }
        }
        return new Triple<>(valueOf, null, new ezn.d(str));
    }
}
