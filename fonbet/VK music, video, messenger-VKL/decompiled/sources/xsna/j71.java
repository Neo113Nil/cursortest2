package xsna;

import androidx.fragment.app.FragmentManager;
import com.vk.channelrestrictions.RestrictionBadge;
import kotlin.Pair;

/* compiled from: AgeRestrictionLauncherImpl.kt */
/* loaded from: classes16.dex */
public final class j71 implements i71 {
    @Override // xsna.i71
    public final void a(RestrictionBadge restrictionBadge, FragmentManager fragmentManager) {
        com.vk.channelrestrictions.a aVar = new com.vk.channelrestrictions.a();
        aVar.setArguments(yfb.b(new Pair("badge", Integer.valueOf(restrictionBadge.h()))));
        aVar.Td(fragmentManager, "AgeRestrictionBottomSheet");
    }
}
