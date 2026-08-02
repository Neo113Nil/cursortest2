package xsna;

import android.view.View;
import com.vk.dto.group.Group;
import com.vk.dto.photo.Photo;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.profile.ui.community.CommunityPickerFragment;
import com.vk.superapp.multiaccount.impl.ui.FooterButtonType;
import kotlin.NoWhenBranchMatchedException;
import xsna.g240;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class gla implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gla(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                hla hlaVar = (hla) this.c;
                vka vkaVar = (vka) this.d;
                if (hlaVar.o.a()) {
                    return;
                }
                hlaVar.l.invoke(vkaVar);
                view.performHapticFeedback(0);
                return;
            case 1:
                yle yleVar = (yle) this.c;
                yleVar.a.m2((ClipGridParams.Data.Music) this.d);
                return;
            case 2:
                CommunityPickerFragment.b bVar = (CommunityPickerFragment.b) this.c;
                CommunityPickerFragment communityPickerFragment = (CommunityPickerFragment) this.d;
                Group group = bVar.d.get(((Integer) view.getTag()).intValue());
                new CommunityNotificationSettingsFragment.a(group.c.b, group.d).g(3, communityPickerFragment);
                return;
            case 3:
                ((hz60) this.c).a(((r2r) this.d).c);
                return;
            case 4:
                com.vk.newsfeed.posting.market_picker.presentation.base.view.f fVar = (com.vk.newsfeed.posting.market_picker.presentation.base.view.f) this.c;
                ((kdg0) fVar.y.getValue()).g((Photo) this.d);
                return;
            default:
                FooterButtonType footerButtonType = (FooterButtonType) this.c;
                g240 g240Var = (g240) this.d;
                int i = g240.a.$EnumSwitchMapping$0[footerButtonType.ordinal()];
                if (i == 1) {
                    g240Var.l.e();
                    return;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    g240Var.l.d();
                    return;
                }
        }
    }
}
