package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.api.likes.LikesGetList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.activities.CommentActivity;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.Lazy;

/* compiled from: ActivityCommentHolder.kt */
/* loaded from: classes4.dex */
public final class f90 extends qi6<Post> implements View.OnClickListener {
    public final Lazy C;
    public final VKCircleImageView D;
    public final TextView E;
    public final TextView F;

    public f90(ViewGroup viewGroup, bpn0 bpn0Var) {
        super(R.layout.post_activity_comment, viewGroup);
        this.C = bpn0Var;
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.content);
        this.D = (VKCircleImageView) this.itemView.findViewById(R.id.user_photo);
        this.E = (TextView) this.itemView.findViewById(R.id.title);
        this.F = (TextView) this.itemView.findViewById(R.id.text);
        this.itemView.setBackground(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_background_secondary)));
        linearLayout.setOnClickListener(this);
    }

    @Override // xsna.qi6
    public final void E6(Post post) {
        ArrayList<Comment> arrayList;
        Comment comment;
        String str;
        String str2;
        Activity activity = post.C;
        CommentActivity commentActivity = activity instanceof CommentActivity ? (CommentActivity) activity : null;
        if (commentActivity == null || (arrayList = commentActivity.d) == null || (comment = (Comment) j5g.a0(arrayList)) == null) {
            return;
        }
        Owner owner = commentActivity.e.get(comment.c);
        if (owner == null || (str = owner.c) == null) {
            str = "";
        }
        this.E.setText(str);
        ej90 ej90Var = comment.u;
        this.F.setText(ej90Var != null ? ej90Var.a : null);
        VKCircleImageView vKCircleImageView = this.D;
        if (owner == null || (str2 = owner.e) == null || str2.length() <= 0) {
            vKCircleImageView.clear();
        } else {
            vKCircleImageView.o0(owner.e, null);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList<Comment> arrayList;
        Comment comment;
        Post q6 = q6();
        if (q6 == null) {
            return;
        }
        Activity activity = q6.C;
        CommentActivity commentActivity = activity instanceof CommentActivity ? (CommentActivity) activity : null;
        if (commentActivity == null || (arrayList = commentActivity.d) == null || (comment = (Comment) j5g.a0(arrayList)) == null) {
            return;
        }
        int i = comment.b;
        int[] iArr = comment.l;
        Lazy lazy = this.C;
        if (iArr != null) {
            if (!(iArr.length == 0)) {
                Context context = this.itemView.getContext();
                Integer N = rl3.N(iArr);
                if (N != null) {
                    i = N.intValue();
                }
                int i2 = i;
                NewsfeedRouter newsfeedRouter = (NewsfeedRouter) lazy.getValue();
                UserId userId = q6.m;
                Flags flags = q6.l;
                newsfeedRouter.k(context, userId, q6.n, new NewsfeedRouter.a(i2, comment.b, flags.zb(2L), flags.zb(1L), flags.zb(PlaybackStateCompat.ACTION_PREPARE_FROM_URI), LikesGetList.Type.POST));
                return;
            }
        }
        NewsfeedRouter.E((NewsfeedRouter) lazy.getValue(), this.itemView.getContext(), q6, this.u, null, Integer.valueOf(i), null, null, 104);
    }
}
