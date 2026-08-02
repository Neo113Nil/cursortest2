package xsna;

import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;

/* compiled from: DBUtil.kt */
/* loaded from: classes12.dex */
public final /* synthetic */ class urk {
    public static final void a(hyg0 hyg0Var) {
        ListBuilder e = e43.e();
        qyg0 V0 = hyg0Var.V0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (V0.step()) {
            try {
                e.add(V0.l2(0));
            } finally {
            }
        }
        s3q0 s3q0Var = s3q0.a;
        yfb.d(V0, null);
        ListIterator listIterator = e.g().listIterator(0);
        while (true) {
            ListBuilder.a aVar = (ListBuilder.a) listIterator;
            if (!aVar.hasNext()) {
                return;
            }
            String str = (String) aVar.next();
            if (brm0.B(str, "room_fts_content_sync_", false)) {
                p7i.e(hyg0Var, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }
}
