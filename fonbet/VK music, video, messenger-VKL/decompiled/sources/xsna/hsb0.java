package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.polls.Poll;
import com.vk.newsfeed.common.PostActions;
import com.vk.newsfeed.common.util.a;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PollV3ActionsMenuBuilder.kt */
/* loaded from: classes4.dex */
public final class hsb0 implements com.vk.newsfeed.common.util.a {
    public Poll b;
    public psb0 c;

    /* compiled from: PollV3ActionsMenuBuilder.kt */
    public static final class a implements jjv0 {
        public final /* synthetic */ gsb0 b;

        public a(gsb0 gsb0Var) {
            this.b = gsb0Var;
        }

        @Override // xsna.jjv0
        public final int n1(int i) {
            return ((esb0) ((ArrayList) this.b.y0()).get(i)).d ? 3 : 0;
        }

        @Override // xsna.jjv0
        public final int t(int i) {
            return 0;
        }
    }

    public static String c(String str) {
        if (str.length() <= 30) {
            return str;
        }
        List<String> b0 = drm0.b0(str, new char[]{' '}, 0, 6);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        for (String str2 : b0) {
            if (z) {
                if (myc0.f(sb2)) {
                    sb2.append(" ");
                }
                sb2.append(str2);
            } else if (str2.length() + sb.length() < 30) {
                if (myc0.f(sb)) {
                    sb.append(" ");
                }
                sb.append(str2);
            } else {
                if (myc0.f(sb2)) {
                    sb2.append(" ");
                }
                sb2.append(str2);
                z = true;
            }
        }
        if (sb2.length() > 30) {
            sb2.setLength(27);
            sb2.append("...");
            sb2.insert(0, '\n');
        }
        if (!myc0.f(sb2)) {
            return sb.toString();
        }
        sb.append((CharSequence) sb2);
        return sb.toString();
    }

    @Override // com.vk.newsfeed.common.util.a
    public final VkContextMenu a(Context context, a.AbstractC1374a abstractC1374a) {
        Owner owner;
        Map<UserId, Owner> map;
        gsb0 gsb0Var = new gsb0();
        gsb0Var.e = this.c;
        gpu0 gpu0Var = new gpu0(context);
        gpu0Var.j = new a(gsb0Var);
        gpu0Var.e = cn70.b(4);
        cn70.b(4);
        gpu0Var.f = cn70.b(1);
        gpu0Var.i = cn70.b(16);
        View view = ((a.AbstractC1374a.b) abstractC1374a).a;
        int l = krv0.l(R.attr.vk_ui_icon_accent);
        view.getContext();
        e.b bVar = new e.b(view, null, null, l, 6);
        bVar.w = R.layout.ds_internal_context_menu_item;
        bVar.l = gsb0Var;
        bVar.o = gpu0Var;
        bVar.u = cn70.b(30);
        bVar.t = cn70.b(25);
        bVar.m = 0;
        VkContextMenu a2 = bVar.a();
        gsb0Var.f = new WeakReference<>(a2);
        Poll poll = this.b;
        if (poll == null || (owner = poll.w) == null) {
            owner = (poll == null || (map = poll.v) == null) ? null : map.get(poll.c);
        }
        if (owner != null) {
            String c = fkq0.b(owner.b) ? c(context.getString(R.string.poll_community_author, owner.c)) : c(context.getString(R.string.poll_user_author, owner.c));
            gsb0Var.g = true;
            gsb0Var.x0(new esb0(c, -1, true, false));
        }
        Poll poll2 = this.b;
        if (poll2 != null && poll2.t0()) {
            int h = PostActions.ACTION_POLL_EDIT.h();
            String string = context.getString(R.string.poll_change);
            if (gsb0Var.g) {
                gsb0Var.g = false;
                gsb0Var.x0(new esb0(string, h, false, true));
            } else {
                gsb0Var.x0(new esb0(string, h, false, false));
            }
        }
        Poll poll3 = this.b;
        if (poll3 != null && poll3.Ab()) {
            int h2 = PostActions.ACTION_POLL_UNVOTE.h();
            String string2 = context.getString(R.string.poll_unvote);
            if (gsb0Var.g) {
                gsb0Var.g = false;
                gsb0Var.x0(new esb0(string2, h2, false, true));
                return a2;
            }
            gsb0Var.x0(new esb0(string2, h2, false, false));
        }
        return a2;
    }

    @Override // com.vk.newsfeed.common.util.a
    public final com.vk.newsfeed.common.util.a b(z960 z960Var) {
        this.c = z960Var instanceof psb0 ? (psb0) z960Var : null;
        return this;
    }
}
