package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ActivityRepostToStoryHolder.kt */
/* loaded from: classes4.dex */
public final class ta0 extends qi6<Post> implements View.OnClickListener, w8i {
    public static final /* synthetic */ int H = 0;
    public final View C;
    public final TextView D;
    public final Object E;
    public final Object F;
    public final Object G;

    public ta0(ViewGroup viewGroup) {
        super(R.layout.post_activity_repost_to_story_v3, viewGroup);
        View findViewById = this.itemView.findViewById(R.id.close);
        this.C = findViewById;
        this.D = (TextView) this.itemView.findViewById(R.id.repost_to_story_title);
        na naVar = new na(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.E = msy.a(lazyThreadSafetyMode, naVar);
        this.F = msy.a(lazyThreadSafetyMode, new ra0(this, 0));
        this.G = msy.a(lazyThreadSafetyMode, new sa0(this, 0));
        bwt0.h0(this, this.itemView);
        bwt0.h0(this, findViewById);
    }

    @Override // xsna.qi6
    public final void E6(Post post) {
        UserId userId = post.m;
        if (userId == null) {
            userId = UserId.d;
        }
        boolean b = fkq0.b(userId);
        TextView textView = this.D;
        if (b) {
            textView.setText(R.string.post_activity_repost_to_story_title_community_v3);
        } else {
            textView.setText(R.string.post_activity_repost_to_story_title_v3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Post q6;
        String str;
        if (!epx.f(view, this.C)) {
            if (!epx.f(view, this.itemView) || (q6 = q6()) == null || (str = this.u) == null) {
                return;
            }
            i6().sa(new NewsfeedExternalAction.Navigation.v(str, q6));
            return;
        }
        Post q62 = q6();
        if (q62 != null) {
            ((p870) this.G.getValue()).e(129, q62);
        }
        jbc0 jbc0Var = (jbc0) this.F.getValue();
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        jbc0Var.g();
        Post q63 = q6();
        if (q63 != null) {
            int i = q63.n;
            UserId userId = q63.m;
            sfa0 sfa0Var = new sfa0("wall.hideRepostToStoryActivity");
            sfa0Var.C(i, "post_id");
            sfa0Var.F(userId, "owner_id");
            sfa0Var.p();
        }
    }
}
