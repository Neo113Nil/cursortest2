package xsna;

import androidx.room.l;
import com.vk.uxpolls.data.db.UxPollsDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import xsna.nxn0;

/* compiled from: UxPollsDatabase_Impl.kt */
/* loaded from: classes6.dex */
public final class t4r0 extends androidx.room.l {
    public final /* synthetic */ UxPollsDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4r0(UxPollsDatabase_Impl uxPollsDatabase_Impl) {
        super(4, "f24fef25e2c0561d7734e7b024c5f0d2", "89fd99f2b50ba6516c18da4b1d3400ed");
        this.d = uxPollsDatabase_Impl;
    }

    @Override // androidx.room.l
    public final void a(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `polls` (`id` INTEGER NOT NULL, `triggers` TEXT NOT NULL, `initialHeight` INTEGER, `status` TEXT, `metadata` TEXT, PRIMARY KEY(`id`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        p7i.e(hyg0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f24fef25e2c0561d7734e7b024c5f0d2')");
    }

    @Override // androidx.room.l
    public final void b(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `polls`");
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
        linkedHashMap.put("id", new nxn0.a(1, "id", "INTEGER", null, true, 1));
        linkedHashMap.put("triggers", new nxn0.a(0, "triggers", "TEXT", null, true, 1));
        linkedHashMap.put("initialHeight", new nxn0.a(0, "initialHeight", "INTEGER", null, false, 1));
        linkedHashMap.put("status", new nxn0.a(0, "status", "TEXT", null, false, 1));
        nxn0 nxn0Var = new nxn0("polls", linkedHashMap, b690.a(linkedHashMap, "metadata", new nxn0.a(0, "metadata", "TEXT", null, false, 1)), new LinkedHashSet());
        nxn0 a = nxn0.b.a(hyg0Var, "polls");
        return !nxn0Var.equals(a) ? new l.a(false, t3j0.a("polls(com.vk.uxpolls.data.db.entity.PollEntity).\n Expected:\n", nxn0Var, "\n Found:\n", a)) : new l.a(true, null);
    }

    @Override // androidx.room.l
    public final void c() {
    }

    @Override // androidx.room.l
    public final void e() {
    }
}
