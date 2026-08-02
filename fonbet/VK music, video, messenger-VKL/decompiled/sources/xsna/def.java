package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.update.core.AvailabilityState;
import com.vk.update.core.DownloadState;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class def implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ def(int i, Object obj, int i2) {
        this.b = i2;
        this.c = i;
        this.d = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        qyg0 V0;
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                com.vk.clips.upload.vk.impl.uploader.c cVar = com.vk.clips.upload.vk.impl.uploader.c.a;
                String str = ((xdd) obj2).i;
                cVar.getClass();
                com.vk.clips.upload.vk.impl.uploader.c.h(i2, str, th, false);
                L.i(th);
                return s3q0.a;
            case 1:
                String str2 = (String) obj2;
                V0 = ((hyg0) obj).V0("UPDATE episode SET downloading_state = ? WHERE mid = ?");
                try {
                    V0.bindLong(1, i2);
                    V0.D3(2, str2);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } finally {
                    V0.close();
                }
            case 2:
                UserId userId = (UserId) obj2;
                V0 = ((hyg0) obj).V0("SELECT * FROM story_statistics_question WHERE owner_id = ? AND story_id = ? ORDER BY date DESC, question_id DESC");
                try {
                    bpn0 bpn0Var = bfm0.a;
                    V0.bindLong(1, userId.b);
                    V0.bindLong(2, i2);
                    int k = egi.k(V0, "owner_id");
                    int k2 = egi.k(V0, "story_id");
                    int k3 = egi.k(V0, "question_id");
                    int k4 = egi.k(V0, "date");
                    int k5 = egi.k(V0, "storyStatisticsQuestion");
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        long j = V0.getLong(k);
                        bpn0 bpn0Var2 = bfm0.a;
                        UserId userId2 = new UserId(j);
                        int i3 = (int) V0.getLong(k2);
                        int i4 = (int) V0.getLong(k3);
                        int i5 = (int) V0.getLong(k4);
                        bgm0 z = fvr.z(V0.l2(k5));
                        if (z == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.vk.story.viewer.stat.`data`.cache.stickers.question.model.StoryStatisticsQuestionDbModel', but it was NULL.");
                        }
                        arrayList.add(new cgm0(userId2, i3, i4, i5, z));
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    throw th2;
                }
            default:
                vni0 vni0Var = (vni0) obj;
                String str3 = ((wcr0) obj2).b;
                int i6 = vni0Var.b;
                return new wrw(str3, i6, i2 < i6 ? AvailabilityState.UPDATE_AVAILABLE : AvailabilityState.UPDATE_NOT_AVAILABLE, DownloadState.NOT_LOADED, v8o.c, vni0Var);
        }
    }

    public /* synthetic */ def(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}
