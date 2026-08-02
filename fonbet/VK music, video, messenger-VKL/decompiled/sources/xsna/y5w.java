package xsna;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.im.engine.di.ImExperimentsComponent;
import com.vk.log.L;
import java.util.ArrayList;

/* compiled from: ImItemListFragmentFix.kt */
/* loaded from: classes18.dex */
public final class y5w {
    public final Fragment a;
    public final odm b;
    public final com.vk.im.engine.models.c c;
    public final Class<? extends Fragment> d;
    public long e;

    public y5w(u5w u5wVar, Fragment fragment, odm odmVar) {
        this.a = fragment;
        this.b = odmVar;
        com.vk.im.engine.models.c experiments = ((ImExperimentsComponent) m7m.d(fragment).a(fpf0.a(ImExperimentsComponent.class))).getExperiments();
        this.c = experiments;
        this.d = u5wVar.b();
        fragment.getViewLifecycleOwner().getLifecycle().addObserver(new w5w(this));
        experiments.t(new x5w(this));
    }

    public final void a() {
        ViewPager2 viewPager2;
        try {
            if (System.currentTimeMillis() - this.e >= 500 && (viewPager2 = (ViewPager2) this.b.invoke()) != null) {
                RecyclerView.Adapter adapter = viewPager2.getAdapter();
                j1s j1sVar = adapter instanceof j1s ? (j1s) adapter : null;
                if (j1sVar == null) {
                    return;
                }
                ArrayList arrayList = j1sVar.p;
                Fragment J0 = j1sVar.J0(0);
                if (J0 == null) {
                    return;
                }
                boolean n = this.c.n();
                Class<? extends Fragment> cls = this.d;
                if (n) {
                    if (J0.getClass().equals(cls)) {
                        return;
                    }
                    j1sVar.B += 1000;
                    arrayList.clear();
                    j1sVar.notifyDataSetChanged();
                    this.e = System.currentTimeMillis();
                    return;
                }
                if (J0.getClass().equals(cls)) {
                    j1sVar.B += 1000;
                    arrayList.clear();
                    j1sVar.notifyDataSetChanged();
                    this.e = System.currentTimeMillis();
                }
            }
        } catch (Exception e) {
            L.i(e);
        }
    }
}
