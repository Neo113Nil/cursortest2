package xsna;

import com.vk.libvideo.donut.model.Donut;
import com.vkontakte.android.R;
import kotlin.Triple;
import xsna.ezn;

/* compiled from: ActiveSubscriptionProvider.kt */
/* loaded from: classes2.dex */
public final class p80 implements qyn {
    @Override // xsna.qyn
    public final boolean a(Donut donut) {
        return donut != null && donut.a && donut.b == Donut.DonutStatus.ACTIVE;
    }

    @Override // xsna.qyn
    public final Triple<Integer, Integer, ezn> b(Donut donut) {
        String str;
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_donut_check_outline_24);
        if (donut == null || (str = donut.e) == null) {
            str = donut != null ? donut.d : null;
            if (str == null) {
                str = "https://vk.com/@donut-android";
            }
        }
        return new Triple<>(valueOf, null, new ezn.c(str));
    }
}
