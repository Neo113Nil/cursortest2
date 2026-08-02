package xsna;

import android.os.Bundle;
import android.text.TextUtils;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.user.UserProfile;
import com.vk.profile.user.impl.ui.b;
import com.vk.profile.user.impl.ui.g;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: UserProfileOldReducerDelegate.kt */
/* loaded from: classes5.dex */
public final class etq0 implements nuq0 {
    public final mqq0 a;
    public final ctq0 b;
    public final je40 c;

    public etq0(mqq0 mqq0Var, ctq0 ctq0Var, je40 je40Var) {
        this.a = mqq0Var;
        this.b = ctq0Var;
        this.c = je40Var;
    }

    public static List g(etq0 etq0Var, com.vk.profile.user.impl.ui.g gVar, ExtendedUserProfile extendedUserProfile) {
        return etq0Var.a.a(gVar, extendedUserProfile, gVar.k, gVar.r, etq0Var.c);
    }

    @Override // xsna.nuq0
    public final com.vk.profile.user.impl.ui.g a(com.vk.profile.user.impl.ui.g gVar, b.c0 c0Var) {
        return com.vk.profile.user.impl.ui.g.a(gVar, null, false, false, false, null, null, null, null, null, null, false, null, null, null, this.b.a(c0Var.b), null, null, null, null, null, null, false, null, 8372223);
    }

    @Override // xsna.nuq0
    public final com.vk.profile.user.impl.ui.g b(com.vk.profile.user.impl.ui.g gVar, b.y yVar) {
        g.b a = g.b.a(gVar.b, false);
        ExtendedUserProfile extendedUserProfile = yVar.b;
        g.a a2 = this.b.a(extendedUserProfile);
        List g = g(this, gVar, yVar.b);
        UserProfile userProfile = extendedUserProfile.a;
        String str = extendedUserProfile.b;
        String str2 = extendedUserProfile.e;
        Bundle bundle = userProfile.s;
        if (TextUtils.isEmpty(str)) {
            bundle.remove("name_gen");
        } else {
            bundle.putString("first_name_gen", str);
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("name_gen", str + " " + str2);
            }
        }
        StoryOwner.User user = new StoryOwner.User(extendedUserProfile.a, null, 2, null);
        ArrayList<StoriesContainer> arrayList = extendedUserProfile.v1;
        if (arrayList != null) {
            for (StoriesContainer storiesContainer : arrayList) {
                storiesContainer.b = user;
                Iterator<StoryEntry> it = storiesContainer.g.iterator();
                while (it.hasNext()) {
                    it.next().l0 = user;
                }
            }
        }
        return com.vk.profile.user.impl.ui.g.a(gVar, a, false, false, false, null, null, null, null, extendedUserProfile, null, false, g, null, null, a2, null, null, null, null, null, null, false, null, 8369914);
    }

    @Override // xsna.nuq0
    public final com.vk.profile.user.impl.ui.g c(com.vk.profile.user.impl.ui.g gVar) {
        return com.vk.profile.user.impl.ui.g.a(gVar, g.b.a(gVar.b, true), false, false, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, 8388592);
    }

    @Override // xsna.nuq0
    public final com.vk.profile.user.impl.ui.g e(com.vk.profile.user.impl.ui.g gVar, b.a0.c cVar) {
        ExtendedUserProfile extendedUserProfile = gVar.j;
        if (extendedUserProfile == null) {
            return gVar;
        }
        extendedUserProfile.v1 = cVar.b;
        return com.vk.profile.user.impl.ui.g.a(gVar, null, false, false, false, null, null, null, null, extendedUserProfile, null, false, g(this, gVar, extendedUserProfile), null, null, null, null, null, null, null, null, null, false, null, 8386303);
    }

    @Override // xsna.nuq0
    public final com.vk.profile.user.impl.ui.g f(com.vk.profile.user.impl.ui.g gVar, b.j jVar) {
        g.a aVar = gVar.p;
        return com.vk.profile.user.impl.ui.g.a(gVar, null, false, false, false, null, null, null, null, null, null, false, null, null, null, new g.a(aVar.a, aVar.b, jVar.b, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, aVar.j), null, null, null, null, null, null, false, null, 8372223);
    }

    @Override // xsna.nuq0
    public final com.vk.profile.user.impl.ui.g d(com.vk.profile.user.impl.ui.g gVar, b.k kVar) {
        return gVar;
    }
}
