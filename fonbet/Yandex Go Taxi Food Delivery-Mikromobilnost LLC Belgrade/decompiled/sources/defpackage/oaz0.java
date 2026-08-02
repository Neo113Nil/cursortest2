package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.widget.timeline.TimelineBar;
import ru.yandex.taxi.widget.timeline.TimelineItemViewGroup;

/* loaded from: classes6.dex */
public final class oaz0 {
    public int b;
    public final ArrayList a = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public final void a(int i) {
        this.b = i;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            j9z0 j9z0Var = (j9z0) it.next();
            int i2 = j9z0Var.a;
            View view = j9z0Var.b;
            switch (i2) {
                case 0:
                    TimelineBar._init_$lambda$1((TimelineBar) view);
                    break;
                default:
                    TimelineItemViewGroup._init_$lambda$1((TimelineItemViewGroup) view);
                    break;
            }
        }
    }

    public final void b(List list) {
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.addAll(list);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i9z0 i9z0Var = (i9z0) it.next();
            int i = i9z0Var.a;
            View view = i9z0Var.b;
            switch (i) {
                case 0:
                    TimelineBar._init_$lambda$0((TimelineBar) view, arrayList);
                    break;
                default:
                    TimelineItemViewGroup._init_$lambda$0((TimelineItemViewGroup) view, arrayList);
                    break;
            }
        }
    }
}
