package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.api.likes.LikesGetList;
import com.vk.dto.badges.BadgeInfo;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.data.CommentThread;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nw60 implements izs {
    public final /* synthetic */ UserId b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Context f;

    public /* synthetic */ nw60(int i, int i2, int i3, Context context, UserId userId) {
        this.b = userId;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = context;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        NewsComment newsComment = (NewsComment) obj;
        CommentThread commentThread = newsComment.L;
        BadgeInfo badgeInfo = newsComment.X;
        boolean z = commentThread != null ? commentThread.c : false;
        boolean z2 = commentThread != null ? commentThread.d : false;
        CommentThreadFragment.a aVar = new CommentThreadFragment.a(this.b, this.c, 0);
        Bundle bundle = aVar.j;
        bundle.putInt("comment_id", this.d);
        bundle.putInt("arg_start_comment_id", this.e);
        bundle.putBoolean("arg_can_comment", z);
        bundle.putBoolean("arg_can_group_comment", z2);
        bundle.putString("arg_item_likes_type", LikesGetList.Type.POST.i());
        bundle.putBoolean("arg_badgeable_disabled", badgeInfo != null ? badgeInfo.b : false);
        bundle.putParcelable("arg_badgeable_info", badgeInfo);
        bundle.putBoolean("arg_show_options_menu", true);
        aVar.k(this.f);
        return s3q0.a;
    }
}
