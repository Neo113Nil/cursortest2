package xsna;

import android.content.Context;
import com.vk.core.view.components.userstack.VkMiniUserStack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StorySubscribersHeader;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.aex;
import xsna.ayv0;

/* compiled from: PhoneBookStoriesBindHelper.kt */
/* loaded from: classes4.dex */
public final class r2a0 {
    public final pdx a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new ee4(29));

    public r2a0(pdx pdxVar) {
        this.a = pdxVar;
    }

    public static void a(Context context, s2a0 s2a0Var, StoryEntry storyEntry) {
        StorySubscribersHeader storySubscribersHeader;
        if (s2a0Var == null) {
            return;
        }
        List<Owner> list = (storyEntry == null || (storySubscribersHeader = storyEntry.r0) == null) ? null : storySubscribersHeader.c;
        if (list == null || !(!list.isEmpty())) {
            bwt0.p0(s2a0Var.getUserStackViewsContainer(), false);
            return;
        }
        bwt0.p0(s2a0Var.getUserStackViewsContainer(), true);
        VkMiniUserStack userStack = s2a0Var.getUserStack();
        List H0 = j5g.H0(list, 2);
        ArrayList arrayList = new ArrayList();
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            String f = ((Owner) it.next()).f(iah0.a(24));
            ayv0.c cVar = f != null ? new ayv0.c(f) : null;
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        userStack.setAvatars(arrayList);
        s2a0Var.getCountFriendsTextView().setText(context.getResources().getQuantityString(R.plurals.friends_quantity, list.size(), uqm0.f(list.size())));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(Context context, s2a0 s2a0Var, gzs<? extends aex.a> gzsVar) {
        if (s2a0Var == null) {
            return;
        }
        c3b c3bVar = new c3b(gzsVar, this, context);
        if (((Boolean) this.b.getValue()).booleanValue()) {
            bwt0.p0(s2a0Var.getProfileButton(), false);
            jjc.g(s2a0Var.getUserNameView(), c3bVar);
        } else {
            bwt0.p0(s2a0Var.getProfileButton(), true);
            jjc.g(s2a0Var.getProfileButton(), c3bVar);
        }
    }
}
