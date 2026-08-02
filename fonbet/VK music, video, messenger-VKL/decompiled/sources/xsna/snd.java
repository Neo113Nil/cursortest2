package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.api.likes.LikesGetList;
import com.vk.dto.badges.BadgeInfo;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.impl.fragments.ClipsCommentThreadFragment;

/* compiled from: ClipsCommentsListPresenter.kt */
/* loaded from: classes4.dex */
public final class snd extends lfg<d9c0> {
    public io.reactivex.rxjava3.disposables.c o0;

    @Override // xsna.lfg
    public final void N8(Context context, int i, Integer num, NewsComment newsComment, String str) {
        BadgeInfo badgeInfo;
        boolean z = (newsComment == null || (badgeInfo = newsComment.X) == null) ? false : badgeInfo.b;
        UserId userId = this.i;
        int i2 = this.j;
        int i3 = this.p;
        ClipsCommentThreadFragment.a aVar = new ClipsCommentThreadFragment.a(ClipsCommentThreadFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putParcelable("owner_id", userId);
        bundle.putInt("id", i2);
        bundle.putInt("type", i3);
        bundle.putInt("comment_id", i);
        bundle.putParcelable("uid", this.u);
        bundle.putString("ref_source", this.s);
        bundle.putString("referrer", str);
        bundle.putString("track_code", this.r);
        bundle.putString("access_key", this.q);
        bundle.putBoolean("arg_can_comment", this.w);
        bundle.putBoolean("arg_can_share_comments", this.A);
        bundle.putBoolean("arg_can_share_comments_link", this.B);
        bundle.putBoolean("arg_can_share_on_wall", this.z);
        bundle.putBoolean("arg_can_group_comment", this.v);
        bundle.putBoolean("arg_without_negative_replies_placeholder", this.G);
        LikesGetList.Type type = this.D;
        if (type == null) {
            type = LikesGetList.Type.POST;
        }
        bundle.putString("arg_item_likes_type", type.i());
        if (num != null) {
            bundle.putInt("arg_start_comment_id", num.intValue());
        }
        bundle.putBoolean("arg_badgeable_disabled", this.F || z);
        bundle.putParcelable("arg_badgeable_info", newsComment != null ? newsComment.X : null);
        aVar.k(context);
    }

    @Override // xsna.lfg, xsna.mdg, xsna.afg
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o0 = ond.h0.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new is1(new s9(this, 21), 12));
    }

    @Override // xsna.mdg, xsna.cc6
    public final void onDestroy() {
        super.onDestroy();
        io.reactivex.rxjava3.disposables.c cVar = this.o0;
        if (cVar != null) {
            cVar.dispose();
        }
        this.o0 = null;
    }
}
