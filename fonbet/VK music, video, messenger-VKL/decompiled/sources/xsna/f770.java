package xsna;

import com.vk.libvideo.donut.model.Donut;
import com.vkontakte.android.R;
import kotlin.Triple;
import xsna.ezn;

/* compiled from: NotSubscribedProvider.kt */
/* loaded from: classes6.dex */
public final class f770 implements qyn {
    @Override // xsna.qyn
    public final boolean a(Donut donut) {
        return (donut == null || donut.a) ? false : true;
    }

    @Override // xsna.qyn
    public final Triple<Integer, Integer, ezn> b(Donut donut) {
        String str;
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_donut_outline_24);
        Integer valueOf2 = Integer.valueOf(R.string.video_channel_donut_subscription_create);
        if (donut == null || (str = donut.e) == null) {
            str = donut != null ? donut.d : null;
            if (str == null) {
                str = "https://vk.com/@donut-android";
            }
        }
        return new Triple<>(valueOf, valueOf2, new ezn.b(str));
    }
}
