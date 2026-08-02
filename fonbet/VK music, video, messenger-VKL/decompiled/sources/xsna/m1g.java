package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.web.StoryBoxPrepared;
import com.vk.libvideo.autoplay.b;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoCommentClick;
import java.util.ArrayList;
import xsna.ltv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1g implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m1g(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        yg5 yg5Var;
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ((n1g) obj2).m.invoke(Integer.valueOf(i2));
                return s3q0.a;
            case 1:
                ktv ktvVar = (ktv) obj2;
                ktvVar.T(new ltv.e(i2, (StoryBoxPrepared) obj));
                ktvVar.C(new ssv(i2 + 1));
                return s3q0.a;
            case 2:
                UserId userId = (UserId) obj2;
                qyg0 V0 = ((hyg0) obj).V0("SELECT * FROM story_statistics_viewer WHERE owner_id = ? AND story_id = ? ORDER BY ordinal_id");
                try {
                    bpn0 bpn0Var = bfm0.a;
                    V0.bindLong(1, userId.b);
                    V0.bindLong(2, i2);
                    int k = egi.k(V0, "ordinal_id");
                    int k2 = egi.k(V0, "owner_id");
                    int k3 = egi.k(V0, "story_id");
                    int k4 = egi.k(V0, "user_id");
                    int k5 = egi.k(V0, "storyStatisticsViewer");
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        int i3 = (int) V0.getLong(k);
                        long j = V0.getLong(k2);
                        bpn0 bpn0Var2 = bfm0.a;
                        UserId userId2 = new UserId(j);
                        int i4 = (int) V0.getLong(k3);
                        UserId userId3 = new UserId(V0.getLong(k4));
                        rhm0 r = x1o0.r(V0.l2(k5));
                        if (r == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.vk.story.viewer.stat.`data`.cache.viewers.viewer.model.StoryStatisticsViewerDbModel', but it was NULL.");
                        }
                        arrayList.add(new shm0(i3, userId2, i4, userId3, r));
                    }
                    V0.close();
                    return arrayList;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            default:
                lns0 lns0Var = (lns0) obj2;
                long longValue = ((Long) obj).longValue();
                bpn0 bpn0Var3 = com.vk.libvideo.autoplay.b.B;
                xh5 xh5Var = b.C1208b.a().c;
                if (xh5Var != null && (yg5Var = xh5Var.a) != null) {
                    yg5Var.seek(longValue);
                }
                if (lns0Var.b != null) {
                    vbs0.a(MobileOfficialAppsVideoStat$TypeVideoCommentClick.Event.TIMECODE_TAP, i2);
                }
                return s3q0.a;
        }
    }
}
