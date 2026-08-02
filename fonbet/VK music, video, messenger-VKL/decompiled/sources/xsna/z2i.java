package xsna;

import android.graphics.Rect;
import android.view.View;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.group.Group;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import kotlin.NoWhenBranchMatchedException;
import xsna.oap;
import xsna.xy1;

/* compiled from: CommunitySubscriptionRouterImpl.kt */
/* loaded from: classes5.dex */
public final class z2i implements y2i {
    /* JADX WARN: Multi-variable type inference failed */
    public static void c(oap oapVar, m6h m6hVar, xy1 xy1Var, boolean z, FullSourceJoinApi fullSourceJoinApi) {
        e.c cVar;
        if (!xus.o(oapVar)) {
            m6hVar.b(true, z, fullSourceJoinApi);
            return;
        }
        if (xy1Var instanceof xy1.b) {
            View view = ((xy1.b) xy1Var).a;
            int l = krv0.l(R.attr.vk_ui_icon_accent);
            view.getContext();
            e.b bVar = new e.b(view, null, null, l, 6);
            bVar.w = R.layout.ds_internal_context_menu_item;
            cVar = bVar;
        } else {
            if (!(xy1Var instanceof xy1.a)) {
                throw new NoWhenBranchMatchedException();
            }
            xy1.a aVar = (xy1.a) xy1Var;
            View view2 = aVar.b;
            Rect rect = aVar.a;
            int l2 = krv0.l(R.attr.vk_ui_icon_accent);
            view2.getContext();
            cVar = new e.c(null, rect, view2, l2, 1);
        }
        e.c cVar2 = cVar;
        VkContextMenu.c.c(cVar2, R.string.group_event_join, null, false, null, new krh(m6hVar, 2), 30);
        VkContextMenu.c.c(cVar2, R.string.group_event_join_unsure, null, false, null, new com.vk.movika.sdk.base.presenter.b(m6hVar, 25), 30);
        cVar2.a().j(false);
    }

    @Override // xsna.y2i
    public final void a(ExtendedCommunityProfile extendedCommunityProfile, o1i o1iVar, xy1 xy1Var, boolean z, FullSourceJoinApi fullSourceJoinApi) {
        c(new oap.a(extendedCommunityProfile), o1iVar, xy1Var, z, fullSourceJoinApi);
    }

    @Override // xsna.y2i
    public final void b(Group group, h3i h3iVar, xy1.b bVar) {
        c(new oap.b(group), h3iVar, bVar, false, null);
    }
}
