package defpackage;

import android.view.View;
import com.yandex.mapkit.navigation.balloons.BalloonAnchor;
import com.yandex.mapkit.navigation.balloons.HorizontalPosition;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class pas0 extends xo4 {
    public final View j;
    public final View k;
    public final View l;

    public pas0(View view, View view2, View view3, vo4 vo4Var, float f, float f2) {
        super(vo4Var, f, f2);
        this.j = view;
        this.k = view2;
        this.l = view3;
    }

    @Override // defpackage.xo4
    public final View a(BalloonAnchor balloonAnchor) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        View view = this.l;
        if (view != null) {
            arrayList.add(view);
        }
        arrayList.add(balloonAnchor.getHorizontal() == HorizontalPosition.RIGHT ? this.k : this.j);
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                View view2 = (View) next;
                int measuredWidth = view2.getMeasuredWidth() * view2.getMeasuredHeight();
                do {
                    Object next2 = it.next();
                    View view3 = (View) next2;
                    int measuredWidth2 = view3.getMeasuredWidth() * view3.getMeasuredHeight();
                    if (measuredWidth > measuredWidth2) {
                        next = next2;
                        measuredWidth = measuredWidth2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (View) obj;
    }
}
