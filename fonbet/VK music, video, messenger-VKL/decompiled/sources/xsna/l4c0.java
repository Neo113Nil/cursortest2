package xsna;

import android.graphics.drawable.Drawable;
import com.vk.dto.newsfeed.activities.LikesActivity;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.reactions.ReactionAsset;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import xsna.ayv0;

/* compiled from: PostLikesActivityTransformer.kt */
/* loaded from: classes4.dex */
public final class l4c0 implements gn60<Pair<? extends Post, ? extends LikesActivity>, wm60> {
    public final boolean b;

    public l4c0(boolean z) {
        this.b = z;
    }

    public final List<ol60> a(int i, Pair<Post, LikesActivity> pair, wm60 wm60Var) {
        CharSequence charSequence;
        ReactionAsset reactionAsset;
        String str;
        String str2;
        ReactionMeta d;
        Post i2 = pair.i();
        LikesActivity j = pair.j();
        String str3 = j.d;
        ArrayList<String> arrayList = j.c;
        if (str3 == null || str3.length() == 0) {
            charSequence = "";
        } else {
            ucp ucpVar = ucp.a;
            charSequence = ucp.i(n420.b(str3));
        }
        ReactionSet reactionSet = i2.V;
        if (reactionSet == null || (d = c2f0.d(reactionSet, 0)) == null) {
            reactionAsset = null;
            str = null;
        } else {
            reactionAsset = d.d();
            str = null;
        }
        ArrayList arrayList2 = new ArrayList();
        String str4 = str;
        ArrayList arrayList3 = new ArrayList();
        String str5 = (String) j5g.a0(arrayList);
        boolean z = this.b;
        if (z) {
            String a = js5.a(50, str5);
            if (a != null) {
                arrayList3.add(a);
            }
            String a2 = js5.a(50, (String) j5g.b0(1, arrayList));
            if (a2 != null) {
                arrayList3.add(a2);
            }
        } else {
            Drawable a3 = dhr0.t.a(R.drawable.vk_icon_reaction_like_color_16);
            if (a3 != null) {
                arrayList2.add(new ayv0.a(a3));
            }
            if (str5 != null) {
                itj0.d(str5, arrayList2);
            }
        }
        if (reactionAsset != null && (str2 = reactionAsset.b) != null && z) {
            str4 = str2;
        }
        return Collections.singletonList(new k4c0(i2, arrayList2, arrayList3, str4, this.b, u11.f(tlo0.Companion, charSequence), j.e.size()));
    }

    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a(0, pair, bp5Var);
    }
}
