package xsna;

import com.vk.libvideo.donut.model.Donut;
import com.vkontakte.android.R;
import kotlin.Triple;
import xsna.ezn;

/* compiled from: DefaultSubscriptionProvider.kt */
/* loaded from: classes2.dex */
public final class zml implements qyn {
    @Override // xsna.qyn
    public final boolean a(Donut donut) {
        return true;
    }

    @Override // xsna.qyn
    public final Triple<Integer, Integer, ezn> b(Donut donut) {
        return new Triple<>(Integer.valueOf(R.drawable.vk_icon_donut_outline_24), null, ezn.a.b);
    }
}
