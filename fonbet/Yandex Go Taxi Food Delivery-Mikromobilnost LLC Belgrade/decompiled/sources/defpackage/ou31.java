package defpackage;

import android.util.ArrayMap;
import android.view.View;
import com.yandex.bricks.BrickViewLifecycle;
import com.yandex.div.state.db.StateEntry;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes15.dex */
public final class ou31 extends BrickViewLifecycle {
    public final /* synthetic */ pu31 w;

    public ou31(pu31 pu31Var) {
        this.w = pu31Var;
    }

    @Override // com.yandex.bricks.BrickViewLifecycle, defpackage.ak6
    public final void onBrickPause() {
        super.onBrickPause();
        View b = b();
        StringBuilder sb = new StringBuilder(128);
        StringBuilder sb2 = new StringBuilder(128);
        m4j0 a = m4j0.a(b);
        Objects.requireNonNull(a);
        l4j0 a2 = l4j0.a(b);
        z83.d(a2.a, null);
        a2.a = null;
        String str = a2.b;
        Objects.requireNonNull(str);
        sb.insert(0, a.a).insert(0, "/");
        sb2.insert(0, a.b).insert(0, "/");
        View view = b.getParent() instanceof View ? (View) b.getParent() : null;
        String str2 = str;
        boolean z = true;
        while (view != null) {
            m4j0 a3 = m4j0.a(view);
            if (a3 != null) {
                String str3 = l4j0.a(view).b;
                Objects.requireNonNull(str3);
                boolean z2 = view == b;
                sb.insert(0, a3.a).insert(0, "/");
                sb2.insert(0, a3.b).insert(0, "/");
                str2 = str3;
                z = z2;
            }
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
        z83.h(null, sb.length() > 0);
        z83.h(null, sb2.length() > 0);
        pu31 pu31Var = this.w;
        pu31Var.a.h("q_hidden", StateEntry.COLUMN_PATH, sb.toString(), "args", sb2.toString(), "show_id", str2);
        if (z) {
            pu31Var.a.pauseSession();
        }
    }

    @Override // com.yandex.bricks.BrickViewLifecycle, defpackage.ak6
    public final void onBrickResume() {
        super.onBrickResume();
        View b = b();
        x22 x22Var = this.w.a;
        StringBuilder sb = new StringBuilder(128);
        StringBuilder sb2 = new StringBuilder(128);
        View view = b;
        boolean z = false;
        String str = null;
        while (view != null) {
            m4j0 a = m4j0.a(view);
            if (a != null) {
                l4j0 a2 = l4j0.a(view);
                if (a2.a == null) {
                    String uuid = UUID.randomUUID().toString();
                    a2.a = uuid;
                    a2.b = uuid;
                }
                str = a2.a;
                z = view == b;
                sb.insert(0, a.a).insert(0, "/");
                sb2.insert(0, a.b).insert(0, "/");
            }
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
        z83.h(null, sb.length() > 0);
        z83.h(null, sb2.length() > 0);
        if (z) {
            x22Var.resumeSession();
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(StateEntry.COLUMN_PATH, sb.toString());
        arrayMap.put("args", sb2.toString());
        Objects.requireNonNull(str);
        arrayMap.put("show_id", str);
        arrayMap.put("version", "250.2");
        x22Var.reportEvent("q_shown", arrayMap);
    }
}
