package xsna;

import com.vk.channels.impl.comments.domain.DeleteCommentFailedException;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoListWithTotalCount;
import io.jsonwebtoken.JwtParser;
import xsna.mwa;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class lwa implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lwa(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                mwa mwaVar = (mwa) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    return io.reactivex.rxjava3.core.x.i(new DeleteCommentFailedException(uqi.a("Couldn't delete comment with id=", i2, JwtParser.SEPARATOR_CHAR)));
                }
                mwa.a a = mwaVar.a();
                return io.reactivex.rxjava3.core.x.k(mwa.a.a(a, rbg.d(a.b, i2, true), null, 5));
            case 1:
                com.vk.music.track.a aVar = (com.vk.music.track.a) obj2;
                Boolean bool = (Boolean) obj;
                bn40.g("audio.followRadioStation", bool);
                if (bool.booleanValue()) {
                    aVar.d.b(new ave0(i2));
                }
                return s3q0.a;
            case 2:
                UserId userId = (UserId) obj2;
                qyg0 V0 = ((hyg0) obj).V0("SELECT * FROM story_statistics_questions_meta WHERE owner_id = ? AND story_id = ? LIMIT 1");
                try {
                    bpn0 bpn0Var = bfm0.a;
                    V0.bindLong(1, userId.b);
                    V0.bindLong(2, i2);
                    return V0.step() ? new hgm0(new UserId(V0.getLong(egi.k(V0, "owner_id"))), (int) V0.getLong(egi.k(V0, "story_id")), (int) V0.getLong(egi.k(V0, "totalQuestionsCount"))) : null;
                } finally {
                    V0.close();
                }
            default:
                VideoListWithTotalCount videoListWithTotalCount = (VideoListWithTotalCount) obj;
                ((b8j0) obj2).invoke(new rbt0(this.c, 50, videoListWithTotalCount.c, 48, com.vk.video.ui.discovery.minimizable.related_videos.d.b(videoListWithTotalCount.b)));
                return s3q0.a;
        }
    }

    public /* synthetic */ lwa(b8j0 b8j0Var, com.vk.video.ui.discovery.minimizable.related_videos.d dVar, int i) {
        this.b = 3;
        this.d = b8j0Var;
        this.c = i;
    }
}
