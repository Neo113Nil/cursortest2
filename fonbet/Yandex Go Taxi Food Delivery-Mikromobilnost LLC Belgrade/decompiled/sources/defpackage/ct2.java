package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.yandex.div.state.db.StateEntry;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.messaging.profile.f;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class ct2 extends RoomDatabase.a {
    public final f a;
    public final x22 b;
    public volatile boolean c;
    public boolean d;

    public ct2(f fVar, x22 x22Var) {
        this.a = fVar;
        this.b = x22Var;
    }

    public static void d(hkw0 hkw0Var) {
        hkw0Var.r("INSERT OR IGNORE INTO internal_id(row_id, next_internal_id) values(1, 1);");
        hkw0Var.r("\n                INSERT OR IGNORE INTO revisions(row_id,\n                    last_message_timestamp, last_thread_message_timestamp, max_role_version,\n                    workspace_version, contacts_last_version, max_history_version\n                ) values(1, 0, 0, 0, null, 0, 0);\n                ");
        hkw0Var.r("INSERT OR IGNORE INTO unseen_view(row_id, unseen, unseen_show, threads_unseen_show) values(1, 0, 0, 0);");
        BackendConfig.INSTANCE.getClass();
        BackendConfig a = BackendConfig.Companion.a();
        Iterator<T> it = a.hiddenNamespaces.iterator();
        while (it.hasNext()) {
            hkw0Var.r("INSERT OR IGNORE INTO hidden_namespaces VALUES(" + ((Number) it.next()).intValue() + ");");
        }
        Iterator<T> it2 = a.noPhoneNamespaces.iterator();
        while (it2.hasNext()) {
            hkw0Var.r("INSERT OR IGNORE INTO no_phone_namespaces VALUES(" + ((Number) it2.next()).intValue() + ");");
        }
    }

    @Override // androidx.room.RoomDatabase.a
    public final void a(hkw0 hkw0Var) {
        d(hkw0Var);
        this.b.reportEvent("tech_db_created", gw00.e(new Pair(StateEntry.COLUMN_PATH, hkw0Var.getPath())));
    }

    @Override // androidx.room.RoomDatabase.a
    public final void b(hkw0 hkw0Var) {
        this.d = true;
        this.b.reportEvent("tech_db_destructed", gw00.e(new Pair(StateEntry.COLUMN_PATH, hkw0Var.getPath())));
    }

    @Override // androidx.room.RoomDatabase.a
    public final void c(hkw0 hkw0Var) {
        try {
            Cursor W1 = hkw0Var.W1("SELECT 0 FROM internal_id");
            try {
                int count = W1.getCount();
                ooc.g(W1, null);
                this.b.reportEvent("tech_db_constants", b.i(new Pair("count", Integer.valueOf(count)), new Pair("destructed", Boolean.valueOf(this.d))));
                if (count == 0) {
                    hkw0Var.i();
                    try {
                        d(hkw0Var);
                        hkw0Var.s();
                    } finally {
                    }
                } else if (count != 1) {
                    hkw0Var.i();
                    try {
                        hkw0Var.r("UPDATE OR REPLACE internal_id SET row_id=1;");
                        hkw0Var.r("UPDATE OR REPLACE revisions SET row_id=1;");
                        hkw0Var.r("UPDATE OR REPLACE unseen_view SET row_id=1;");
                        hkw0Var.s();
                        hkw0Var.t();
                    } finally {
                    }
                }
                x22 x22Var = this.b;
                W1 = hkw0Var.W1("SELECT 0 FROM internal_id");
                try {
                    int count2 = W1.getCount();
                    ooc.g(W1, null);
                    x22Var.reportEvent("tech_db_constants_updated", gw00.e(new Pair("count", Integer.valueOf(count2))));
                    f fVar = this.a;
                    if (fVar != null) {
                        fVar.a(hkw0Var);
                    }
                    this.c = true;
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th) {
            this.b.reportError("tech_db_open_error", th);
            throw th;
        }
    }
}
