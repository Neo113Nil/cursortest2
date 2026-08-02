package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class f4b implements b4b {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final int c;

    public f4b(ViewGroup viewGroup) {
        this.a = viewGroup;
        this.c = viewGroup.getContext().getResources().getDimensionPixelSize(gvg0.timeline_message_max_width);
    }

    public final int a(int i) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        ViewGroup viewGroup = this.a;
        int min = Math.min(Math.min(((View) viewGroup.getParent()).getWidth(), this.c), size);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((j4b) it.next()).setMaxSize((min - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight());
        }
        return View.MeasureSpec.makeMeasureSpec(min, mode);
    }

    @Override // defpackage.b4b
    public final void addLimitedView(j4b j4bVar) {
        this.b.add(j4bVar);
    }

    @Override // defpackage.b4b
    public final void cleanup() {
        this.b.clear();
    }
}
