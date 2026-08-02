package xsna;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import com.vk.im.ui.components.theme_chooser.c;
import com.vk.im.ui.components.theme_chooser.coloradapter.ColorView;
import com.vkontakte.android.R;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import xsna.q6g;

/* compiled from: ColorAdapter.kt */
/* loaded from: classes2.dex */
public final class m5g extends androidx.recyclerview.widget.x<q6g, e9g> {
    public final LayoutInflater c;
    public final c.a d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m5g(LayoutInflater layoutInflater, c.a aVar) {
        super(new androidx.recyclerview.widget.c(null, r2, r0));
        q6g.a aVar2 = q6g.e;
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        ExecutorService n = asu0.n();
        if (n == null) {
            synchronized (c.a.a) {
                try {
                    if (c.a.b == null) {
                        asu0Var.getClass();
                        ExecutorService D = asu0.D();
                        c.a.b = D == null ? Executors.newFixedThreadPool(2) : D;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            n = c.a.b;
        }
        this.c = layoutInflater;
        this.d = aVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return getItem(i).a.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        e9g e9gVar = (e9g) e0Var;
        q6g item = getItem(i);
        e9gVar.n = item;
        ColorView colorView = e9gVar.m;
        colorView.setColors(dhr0.M() ? item.c : item.b);
        colorView.setChecked(item.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new e9g(this.c.inflate(R.layout.im_settings_choose_color_holder, viewGroup, false), this.d);
    }
}
