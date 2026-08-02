package xsna;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class j8p implements View.OnLayoutChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j8p(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.b) {
            case 0:
                k8p k8pVar = (k8p) this.c;
                List<TabLayout.g> list = (List) this.d;
                int width = k8pVar.c.getWidth() / list.size();
                for (TabLayout.g gVar : list) {
                    if (gVar.h.getWidth() != width) {
                        bwt0.r0(width, gVar.h);
                    }
                }
                break;
            default:
                ((View) this.c).postDelayed(new tk50(1, (gzs) this.d), 0L);
                break;
        }
    }
}
