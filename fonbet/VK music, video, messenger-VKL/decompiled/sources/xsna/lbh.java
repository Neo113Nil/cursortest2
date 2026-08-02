package xsna;

import android.graphics.Rect;
import android.view.View;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import kotlin.NoWhenBranchMatchedException;
import xsna.o1i;

/* compiled from: CommunityNotificationsPopup.kt */
/* loaded from: classes5.dex */
public final class lbh {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ExtendedCommunityProfile extendedCommunityProfile, ebh ebhVar, o1i.a.InterfaceC3433a interfaceC3433a) {
        e.c cVar;
        if (interfaceC3433a instanceof o1i.a.InterfaceC3433a.b) {
            View view = ((o1i.a.InterfaceC3433a.b) interfaceC3433a).a;
            int l = krv0.l(R.attr.vk_ui_icon_accent);
            view.getContext();
            e.b bVar = new e.b(view, null, null, l, 6);
            bVar.w = R.layout.ds_internal_context_menu_item;
            cVar = bVar;
        } else {
            if (!(interfaceC3433a instanceof o1i.a.InterfaceC3433a.C3434a)) {
                throw new NoWhenBranchMatchedException();
            }
            o1i.a.InterfaceC3433a.C3434a c3434a = (o1i.a.InterfaceC3433a.C3434a) interfaceC3433a;
            View view2 = c3434a.b;
            Rect rect = c3434a.a;
            int l2 = krv0.l(R.attr.vk_ui_icon_accent);
            view2.getContext();
            cVar = new e.c(null, rect, view2, l2, 1);
        }
        e.c cVar2 = cVar;
        VkContextMenu.c.c(cVar2, extendedCommunityProfile.j1 ? R.string.community_unsubscribe_from_posts : R.string.community_subscribe_to_posts, null, false, null, new b3(ebhVar, 24), 30);
        if (extendedCommunityProfile.H1 || extendedCommunityProfile.I1) {
            VkContextMenu.c.c(cVar2, extendedCommunityProfile.I1 ? R.string.community_unsubscribe_from_stories : R.string.community_subscribe_to_stories, null, false, null, new sbg(ebhVar, 5), 30);
        }
        if (extendedCommunityProfile.d1 && !extendedCommunityProfile.g() && (extendedCommunityProfile.k1 == null || extendedCommunityProfile.e1)) {
            VkContextMenu.c.c(cVar2, extendedCommunityProfile.e1 ? R.string.unsubscribe_from_podcasts : R.string.subscribe_to_podcasts, null, false, null, new ka0(ebhVar, 28), 30);
        }
        if (extendedCommunityProfile.h1 && !extendedCommunityProfile.g() && (extendedCommunityProfile.k1 == null || extendedCommunityProfile.i1)) {
            VkContextMenu.c.c(cVar2, extendedCommunityProfile.i1 ? R.string.group_video_live_notify_off : R.string.group_video_live_notify_on, null, false, null, new vf0(ebhVar, 27), 30);
        }
        cVar2.l(false);
    }
}
