package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.profile.community.impl.ui.tag.CommunityActionTags;
import com.vkontakte.android.R;
import xsna.v4i;

/* compiled from: CommunityUserSubscribedItem.kt */
/* loaded from: classes5.dex */
public final class u4i implements l2v0 {
    public final int b;
    public final /* synthetic */ v4i.a c;

    public u4i(Context context, v4i.a aVar) {
        this.c = aVar;
        this.b = krv0.m(R.attr.vk_ui_text_primary, context);
    }

    @Override // xsna.rku0
    public final void a(Context context, View view) {
        f(context, view);
    }

    @Override // xsna.rku0
    public final boolean e() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.rku0
    public final void f(Context context, View view) {
        if (view != null) {
            v4i v4iVar = (v4i) this.c.m;
            w4i w4iVar = v4iVar.g;
            if (w4iVar.b == 1) {
                v4iVar.j.invoke(view, CommunityActionTags.OPTIONS);
                return;
            }
            int l = krv0.l(R.attr.vk_ui_icon_accent);
            view.getContext();
            e.b bVar = new e.b(view, null, null, l, 6);
            bVar.w = R.layout.ds_internal_context_menu_item;
            VkContextMenu.c.c(bVar, w4iVar.c ? R.string.show_community_news : R.string.hide_community_news, null, false, null, new com.vk.movika.sdk.base.logic.interactor.h(v4iVar, 28), 30);
            VkContextMenu.c.c(bVar, w4iVar.b == 2 ? R.string.profile_unsubscribe : R.string.leave_group, null, false, null, new hn9(8, v4iVar, view), 30);
            bVar.a().g();
        }
    }

    @Override // xsna.l2v0
    public final int getColor() {
        return this.b;
    }

    @Override // xsna.l2v0
    public final String i() {
        return null;
    }
}
