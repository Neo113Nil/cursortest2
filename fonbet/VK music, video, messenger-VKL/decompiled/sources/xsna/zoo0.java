package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.ui.components.theme_chooser.c;
import com.vkontakte.android.R;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import xsna.jpo0;

/* compiled from: ThemeAdapter.kt */
/* loaded from: classes2.dex */
public final class zoo0 extends androidx.recyclerview.widget.x<jpo0, fp6<jpo0>> {
    public final LayoutInflater c;
    public final c.a d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zoo0(LayoutInflater layoutInflater, c.a aVar) {
        super(new androidx.recyclerview.widget.c(null, r2, r0));
        jpo0.b bVar = jpo0.b;
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        ExecutorService h = asu0.h();
        if (h == null) {
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
            h = c.a.b;
        }
        this.c = layoutInflater;
        this.d = aVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return (getItemViewType(i) << 32) | getItem(i).a.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        jpo0 item = getItem(i);
        if (item instanceof jpo0.a) {
            return 0;
        }
        if (item instanceof jpo0.c) {
            return 2;
        }
        if (item instanceof jpo0.d) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        fp6 fp6Var = (fp6) e0Var;
        T t = (T) getItem(i);
        ImageView imageView = fp6Var.m;
        fp6Var.q = t;
        fp6Var.V5(t);
        if (t.isChecked()) {
            ViewPropertyAnimator animate = imageView.animate();
            animate.cancel();
            animate.scaleX(1.0f).scaleY(1.0f).setDuration(100L).withStartAction(new wk(fp6Var, 3)).start();
        } else {
            ViewPropertyAnimator animate2 = imageView.animate();
            animate2.cancel();
            animate2.scaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).scaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(100L).withEndAction(new gv2(fp6Var, 2)).start();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = this.c.inflate(R.layout.im_settings_choose_theme_holder, viewGroup, false);
        c.a aVar = this.d;
        if (i == 0) {
            return new yoo0(inflate, aVar);
        }
        if (i != 1) {
            if (i == 2) {
                return new uok(inflate, aVar);
            }
            throw new IllegalStateException("unreachable");
        }
        zol zolVar = new zol(inflate, aVar);
        TextView textView = zolVar.p;
        textView.setText(R.string.vkim_theme_name_custom);
        textView.setText(R.string.vkim_theme_name_default);
        return zolVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.e0 e0Var) {
        fp6 fp6Var = (fp6) e0Var;
        ImageView imageView = fp6Var.m;
        d3m.b(imageView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        fp6Var.q = null;
        super.onViewRecycled(fp6Var);
    }
}
