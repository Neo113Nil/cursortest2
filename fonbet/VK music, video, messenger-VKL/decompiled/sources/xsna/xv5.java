package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.ui.components.theme_chooser.c;
import com.vkontakte.android.R;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import xsna.mw5;

/* compiled from: BackgroundAdapter.kt */
/* loaded from: classes2.dex */
public final class xv5 extends androidx.recyclerview.widget.x<mw5, rx5<? super mw5>> {
    public final LayoutInflater c;
    public final c.a d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xv5(LayoutInflater layoutInflater, c.a aVar) {
        super(new androidx.recyclerview.widget.c(null, r2, r0));
        mw5.a aVar2 = mw5.a;
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
        return (getItemViewType(i) << 32) | getItem(i).a().hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        mw5 item = getItem(i);
        if (item instanceof p4t) {
            return 0;
        }
        if (item instanceof mka0) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((rx5) e0Var).V5(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = this.c.inflate(R.layout.im_settings_choose_background_holder, viewGroup, false);
        c.a aVar = this.d;
        if (i != 0) {
            return i != 1 ? new rx5(inflate, aVar) : new cla0(inflate, aVar);
        }
        n5t n5tVar = new n5t(inflate, aVar, R.drawable.bg_chooser_button_round_corners);
        ImageView imageView = (ImageView) ((ViewStub) n5tVar.itemView.findViewById(R.id.vkim_icon_image_view)).inflate();
        imageView.setImageResource(R.drawable.vk_icon_picture_outline_28);
        imageView.setColorFilter(dhr0.t.c(R.attr.vk_legacy_accent));
        bwt0.p0(n5tVar.n, false);
        return n5tVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.e0 e0Var) {
        d3m.b(((rx5) e0Var).n, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
    }
}
