package xsna;

import androidx.room.l;
import com.vk.donut.video.subscription.impl.data.db.CachedSubscriptionsDb_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import xsna.nxn0;

/* compiled from: CachedSubscriptionsDb_Impl.kt */
/* loaded from: classes.dex */
public final class ry8 extends androidx.room.l {
    public final /* synthetic */ CachedSubscriptionsDb_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry8(CachedSubscriptionsDb_Impl cachedSubscriptionsDb_Impl) {
        super(1, "ffb189017c0fd480d281772bf9bb4b07", "d2145f0e274a22eb14445d760ff28eb2");
        this.d = cachedSubscriptionsDb_Impl;
    }

    @Override // androidx.room.l
    public final void a(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `cached_subscription` (`user_id` INTEGER NOT NULL, `owner_id` INTEGER NOT NULL, `status` TEXT NOT NULL, `next_payment_date` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`owner_id`, `user_id`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        p7i.e(hyg0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ffb189017c0fd480d281772bf9bb4b07')");
    }

    @Override // androidx.room.l
    public final void b(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `cached_subscription`");
    }

    @Override // androidx.room.l
    public final void d(hyg0 hyg0Var) {
        this.d.r(hyg0Var);
    }

    @Override // androidx.room.l
    public final void f(hyg0 hyg0Var) {
        urk.a(hyg0Var);
    }

    @Override // androidx.room.l
    public final l.a g(hyg0 hyg0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("user_id", new nxn0.a(2, "user_id", "INTEGER", null, true, 1));
        linkedHashMap.put("owner_id", new nxn0.a(1, "owner_id", "INTEGER", null, true, 1));
        linkedHashMap.put("status", new nxn0.a(0, "status", "TEXT", null, true, 1));
        linkedHashMap.put("next_payment_date", new nxn0.a(0, "next_payment_date", "INTEGER", null, true, 1));
        nxn0 nxn0Var = new nxn0("cached_subscription", linkedHashMap, b690.a(linkedHashMap, "updated_at", new nxn0.a(0, "updated_at", "INTEGER", null, true, 1)), new LinkedHashSet());
        nxn0 a = nxn0.b.a(hyg0Var, "cached_subscription");
        return !nxn0Var.equals(a) ? new l.a(false, t3j0.a("cached_subscription(com.vk.donut.video.subscription.impl.data.db.CachedSubscriptionEntity).\n Expected:\n", nxn0Var, "\n Found:\n", a)) : new l.a(true, null);
    }

    @Override // androidx.room.l
    public final void c() {
    }

    @Override // androidx.room.l
    public final void e() {
    }
}
