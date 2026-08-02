package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;

/* loaded from: classes12.dex */
public final class pjd extends cy4 {
    public final List e;
    public final String f;

    public pjd(List list) {
        this.e = list;
        this.f = ((cy4) a.P(list)).a();
    }

    @Override // defpackage.v66
    public final String a() {
        return this.f;
    }

    @Override // defpackage.v66
    public final void c() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((v66) it.next()).c();
        }
    }

    @Override // defpackage.cy4
    public final void e(Map map, View view) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((cy4) it.next()).e(map, view);
        }
    }
}
