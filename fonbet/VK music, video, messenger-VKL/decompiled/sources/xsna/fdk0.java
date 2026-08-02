package xsna;

import android.graphics.Point;
import android.graphics.Rect;
import com.vk.profile.design.view.cover.SnowballsCoverView;
import com.vk.profile.user.impl.ui.viewdelegates.SnowballsCoverHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;
import xsna.d9f0;

/* compiled from: SnowballsCoverHolder.kt */
/* loaded from: classes5.dex */
public final class fdk0<V> implements Callable {
    public final /* synthetic */ SnowballsCoverHolder b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public fdk0(SnowballsCoverHolder snowballsCoverHolder, int i, int i2) {
        this.b = snowballsCoverHolder;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SnowballsCoverHolder snowballsCoverHolder = this.b;
        d9f0 d9f0Var = snowballsCoverHolder.c;
        int i = snowballsCoverHolder.f;
        int i2 = snowballsCoverHolder.b;
        SnowballsCoverView snowballsCoverView = snowballsCoverHolder.a;
        if (d9f0Var == null) {
            return EmptyList.b;
        }
        ArrayList arrayList = d9f0Var.a;
        ArrayList arrayList2 = new ArrayList();
        int i3 = this.c;
        int i4 = 1;
        if (1 <= i3) {
            while (true) {
                int i5 = this.d;
                Point b = snowballsCoverView.b(i2, i5);
                int i6 = 0;
                while (i6 <= i) {
                    int i7 = b.x;
                    int i8 = b.y;
                    Iterator it = snowballsCoverView.b.iterator();
                    while (it.hasNext()) {
                        if (((Rect) it.next()).contains(i7, i8)) {
                            b = i6 == i ? new Point((snowballsCoverView.getRight() - snowballsCoverView.getLeft()) / 2, (snowballsCoverView.getBottom() - snowballsCoverView.getTop()) / 2) : snowballsCoverView.b(i2, i5);
                            i6++;
                        }
                    }
                    break;
                }
                d9f0.b bVar = (d9f0.b) arrayList.get(i4 % arrayList.size());
                int i9 = b.x;
                int i10 = b.y;
                arrayList2.add(new SnowballsCoverView.b(new Rect(i9 - i2, i10 - i2, i9 + i2, i10 + i2), bVar));
                if (i4 == i3) {
                    break;
                }
                i4++;
            }
        }
        return arrayList2;
    }
}
