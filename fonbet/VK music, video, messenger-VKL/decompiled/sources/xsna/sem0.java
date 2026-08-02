package xsna;

import com.vk.dto.common.id.UserId;
import java.util.HashSet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class sem0 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ UserId c;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        qyg0 V0;
        int i = this.b;
        Object obj2 = null;
        UserId userId = this.c;
        switch (i) {
            case 0:
                V0 = ((hyg0) obj).V0("SELECT * FROM story_statistics_excluded_users WHERE owner_id = ? LIMIT 1");
                try {
                    bpn0 bpn0Var = bfm0.a;
                    V0.bindLong(1, userId.b);
                    int k = egi.k(V0, "owner_id");
                    int k2 = egi.k(V0, "excludedUsers");
                    if (V0.step()) {
                        UserId userId2 = new UserId(V0.getLong(k));
                        HashSet a = qem0.a(V0.l2(k2));
                        if (a == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Set<com.vk.dto.common.id.UserId>', but it was NULL.");
                        }
                        obj2 = new uem0(userId2, a);
                    }
                    return obj2;
                } catch (Throwable th) {
                    throw th;
                }
            default:
                V0 = ((hyg0) obj).V0("SELECT user, file, last_access from user_vmoji_files where user=?");
                try {
                    V0.bindLong(1, userId.b);
                    if (V0.step()) {
                        obj2 = new o8w0(V0.getLong(2), new UserId(V0.getLong(0)), V0.l2(1));
                    }
                    return obj2;
                } finally {
                    V0.close();
                }
        }
    }
}
