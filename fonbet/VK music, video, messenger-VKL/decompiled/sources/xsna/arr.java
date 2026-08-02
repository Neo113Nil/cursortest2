package xsna;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.polls.Poll;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class arr implements View.OnLongClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ arr(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                VkButton vkButton = (VkButton) obj;
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                vkButton.getContext();
                e.b bVar = new e.b(vkButton, null, null, l, 6);
                bVar.w = R.layout.ds_internal_context_menu_item;
                bVar.h(e43.l(new VkContextMenu.a(vkButton.getContext().getString(R.string.overlay_menu_disable_till_restart), null, null, false, false, new wb1(13), 30), new VkContextMenu.a(vkButton.getContext().getString(R.string.overlay_menu_disable), null, null, false, false, new dv2(18), 30), new VkContextMenu.a(vkButton.getContext().getString(R.string.overlay_menu_move), null, null, false, false, new h20((err) obj2, 27), 30)));
                bVar.q = true;
                bVar.p = new drr();
                x290 x290Var = x290.a;
                Activity b = x290.b();
                if (b == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                bVar.e = b;
                bVar.j();
                return true;
            default:
                Poll poll = (Poll) obj2;
                boolean Ab = poll.Ab();
                nsb0 nsb0Var = (nsb0) view;
                LinearLayout linearLayout = ((zsb0) obj).o;
                int childCount = linearLayout.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        i2 = -1;
                    } else if (!epx.f(nsb0Var, linearLayout.getChildAt(i2))) {
                        i2++;
                    }
                }
                if (i2 != -1) {
                    if (poll.e.contains(Long.valueOf(poll.f.get(i2).b)) && Ab) {
                        return true;
                    }
                }
                return false;
        }
    }
}
