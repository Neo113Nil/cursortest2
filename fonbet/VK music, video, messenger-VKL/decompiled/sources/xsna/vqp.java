package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vqp implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vqp(int i, NewsEntry newsEntry) {
        this.b = 0;
        this.c = i;
        this.d = newsEntry;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = true;
        int i2 = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                NewsEntry newsEntry = (NewsEntry) obj2;
                u1c0 u1c0Var = (u1c0) obj;
                if (u1c0Var.c != i2 || (!epx.f(u1c0Var.b, newsEntry) && !epx.f(u1c0Var.a, newsEntry))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                UserId userId = (UserId) obj2;
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM story_statistics_question WHERE owner_id = ? AND story_id = ?");
                try {
                    bpn0 bpn0Var = bfm0.a;
                    V0.bindLong(1, userId.b);
                    V0.bindLong(2, i2);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 2:
                ((n6) obj2).invoke(new rbt0(this.c, 50, 0, 16, EmptyList.b));
                return s3q0.a;
            default:
                ((tux0) obj2).b.put(Integer.valueOf(i2), (List) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ vqp(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}
