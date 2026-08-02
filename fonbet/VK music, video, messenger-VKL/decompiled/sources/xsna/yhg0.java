package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: ReviewRepliesRepositoryImpl.kt */
/* loaded from: classes18.dex */
public final class yhg0 implements xhg0 {
    @Override // xsna.xhg0
    public final io.reactivex.rxjava3.core.a a(int i, long j) {
        tfx tfxVar = new tfx("market.deleteCommunityReviewComment", new vq(21), new wq(22));
        tfx.l(tfxVar, "review_id", i, 0, 0, 12);
        tfx.m(tfxVar, "comment_id", j, 0L, 12);
        return rsg0.Z(yfb.x(tfxVar));
    }

    @Override // xsna.xhg0
    public final io.reactivex.rxjava3.core.x b(int i, Integer num, ArrayList arrayList) {
        tfx tfxVar = new tfx("market.getCommunityReviewComments", new fr(23), new gr(20));
        tfx.l(tfxVar, "review_id", i, 0, 0, 12);
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 12);
        tfx.l(tfxVar, SignalingProtocol.KEY_LIMIT, 20, 0, 0, 12);
        if (arrayList != null) {
            tfxVar.i("comments_profile_fields", arrayList);
        }
        return rsg0.w0(yfb.x(tfxVar));
    }

    @Override // xsna.xhg0
    public final io.reactivex.rxjava3.core.x c(int i, UserId userId, Integer num, String str, List list) {
        tfx tfxVar = new tfx("market.createCommunityReviewComment", new wd10(0), new hr(21));
        tfx.l(tfxVar, "review_id", i, 0, 0, 12);
        tfx.n(tfxVar, "author_id", userId, 0L, 0L, 12);
        tfx.o(tfxVar, "text", str, 0, 0, 12);
        if (num != null) {
            tfx.l(tfxVar, "reply_to_comment", num.intValue(), 0, 0, 8);
        }
        if (list != null) {
            tfxVar.i("attachments", list);
        }
        return rsg0.w0(yfb.x(tfxVar));
    }

    @Override // xsna.xhg0
    public final io.reactivex.rxjava3.core.a d(int i, long j) {
        tfx tfxVar = new tfx("market.restoreCommunityReviewComment", new dn(22), new en(25));
        tfx.l(tfxVar, "review_id", i, 0, 0, 12);
        tfx.m(tfxVar, "comment_id", j, 0L, 12);
        return rsg0.Z(yfb.x(tfxVar));
    }

    @Override // xsna.xhg0
    public final io.reactivex.rxjava3.core.x e(int i, int i2, String str, List list) {
        tfx tfxVar = new tfx("market.editCommunityReviewComment", new com.vk.movika.sdk.android.defaultplayer.view.a(21), new er(23));
        tfx.l(tfxVar, "review_id", i, 0, 0, 12);
        tfx.m(tfxVar, "comment_id", i2, 0L, 12);
        tfx.o(tfxVar, "text", str, 0, 0, 12);
        if (list != null) {
            tfxVar.i("attachments", list);
        }
        return rsg0.w0(yfb.x(tfxVar));
    }
}
