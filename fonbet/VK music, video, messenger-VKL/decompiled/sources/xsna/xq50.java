package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MyTargetInternalNativeAdCarouselViewHolder.kt */
/* loaded from: classes4.dex */
public final class xq50 extends rp6<wq50, MyTargetNativeAdEntry> {
    public final rq50 E;
    public final Object F;
    public cjx G;
    public final b H;
    public final Object I;

    /* compiled from: MyTargetInternalNativeAdCarouselViewHolder.kt */
    public final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            xq50 xq50Var = xq50.this;
            cjx cjxVar = xq50Var.G;
            if (cjxVar == null) {
                cjxVar = null;
            }
            cjxVar.q(xq50Var.H);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            xq50 xq50Var = xq50.this;
            cjx cjxVar = xq50Var.G;
            if (cjxVar == null) {
                cjxVar = null;
            }
            cjxVar.f(xq50Var.H);
        }
    }

    /* compiled from: MyTargetInternalNativeAdCarouselViewHolder.kt */
    public static final class b implements vix {
        public final RecyclerView b;

        public b(RecyclerView recyclerView) {
            this.b = recyclerView;
        }

        @Override // xsna.vix
        public final ViewGroup a() {
            return this.b;
        }

        @Override // xsna.vix
        public final zgx b() {
            return null;
        }
    }

    public xq50(ViewGroup viewGroup) {
        super(R.layout.news_internal_native_ad_carousel_view_holder, viewGroup);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.recycler_items);
        rq50 rq50Var = new rq50();
        this.E = rq50Var;
        l1i l1iVar = new l1i(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.F = msy.a(lazyThreadSafetyMode, l1iVar);
        this.H = new b(recyclerView);
        this.I = msy.a(lazyThreadSafetyMode, new wf40(viewGroup, 2));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(rq50Var);
        int b2 = cn70.b(12);
        int b3 = cn70.b(8);
        recyclerView.addItemDecoration(new v98(b2, b3, b3, true));
        this.itemView.addOnAttachStateChangeListener(new a());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rp6
    public final void R6(wq50 wq50Var) {
        wq50 wq50Var2 = wq50Var;
        fkz0 b2 = ((yix) this.F.getValue()).b(wq50Var2.h);
        this.G = b2;
        b2.q(this.H);
        ArrayList arrayList = wq50Var2.j;
        ps7 ps7Var = new ps7(7, this, wq50Var2);
        i8c i8cVar = new i8c(8, this, wq50Var2);
        int intValue = ((Number) this.I.getValue()).intValue();
        cjx cjxVar = this.G;
        if (cjxVar == null) {
            cjxVar = null;
        }
        this.E.x0(arrayList, ps7Var, i8cVar, intValue, cjxVar);
    }
}
