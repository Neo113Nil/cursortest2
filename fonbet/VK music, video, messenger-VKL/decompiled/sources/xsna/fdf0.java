package xsna;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.fdf0;
import xsna.vvs;

/* compiled from: RecommendedGamesAdapter.kt */
/* loaded from: classes6.dex */
public final class fdf0 extends zoj0<WebApiApplication, b> {
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public final a e;
    public final boolean f;
    public final gzs<s3q0> g;
    public final boolean h;
    public boolean i;
    public final Handler j;

    /* compiled from: RecommendedGamesAdapter.kt */
    public interface a {
        void a(WebApiApplication webApiApplication);
    }

    /* compiled from: RecommendedGamesAdapter.kt */
    public final class b extends RecyclerView.e0 {
        public final View l;
        public final int m;
        public final VkImage n;
        public final VkText o;
        public final /* synthetic */ fdf0 p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fdf0 fdf0Var, View view) {
            super(view);
            boolean z = fdf0Var.h;
            this.p = fdf0Var;
            this.l = view;
            boolean z2 = fdf0Var.i;
            int i = z2 ? fdf0.k : z ? fdf0.l : fdf0.n;
            this.m = i;
            int i2 = z2 ? fdf0.k : z ? fdf0.l : fdf0.n;
            VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.vk_apps_recommended_game_image);
            if (vkImage != null) {
                vkImage.setCornerRadius(iah0.b(16.0f));
                if (fdf0Var.i) {
                    f4m.n(i2, vkImage);
                    f4m.p(i, vkImage);
                } else {
                    f4m.n(i2, vkImage);
                    f4m.p(i, vkImage);
                }
            } else {
                vkImage = null;
            }
            this.n = vkImage;
            VkText vkText = (VkText) this.itemView.findViewById(R.id.title);
            vkText.setWidth(fdf0Var.i ? fdf0.p : z ? fdf0.m : fdf0.o);
            this.o = vkText;
        }
    }

    static {
        float f = 96;
        k = iah0.a(f);
        float f2 = 80;
        l = iah0.a(f2);
        m = iah0.a(f2);
        float f3 = 64;
        n = iah0.a(f3);
        o = iah0.a(f3);
        p = iah0.a(f);
    }

    public fdf0() {
        this(null, 15);
    }

    public static final void K0(final Ref$IntRef ref$IntRef, final int i, final fdf0 fdf0Var, final int i2, final RecyclerView recyclerView) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator withEndAction;
        gzs<s3q0> gzsVar;
        if (ref$IntRef.element == i && (gzsVar = fdf0Var.g) != null) {
            gzsVar.invoke();
        }
        int i3 = ref$IntRef.element;
        if (i3 > i - i2) {
            return;
        }
        RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i3 + i2);
        final b bVar = findViewHolderForAdapterPosition instanceof b ? (b) findViewHolderForAdapterPosition : null;
        if (bVar == null) {
            ref$IntRef.element++;
            K0(ref$IntRef, i, fdf0Var, i2, recyclerView);
            return;
        }
        VkImage vkImage = bVar.n;
        if (vkImage == null || (animate = vkImage.animate()) == null || (scaleX = animate.scaleX(1.1f)) == null || (scaleY = scaleX.scaleY(1.1f)) == null || (duration = scaleY.setDuration(200L)) == null || (withEndAction = duration.withEndAction(new Runnable() { // from class: xsna.ddf0
            @Override // java.lang.Runnable
            public final void run() {
                ViewPropertyAnimator scaleX2;
                ViewPropertyAnimator scaleY2;
                ViewPropertyAnimator duration2;
                ViewPropertyAnimator animate2 = fdf0.b.this.n.animate();
                if (animate2 == null || (scaleX2 = animate2.scaleX(1.0f)) == null || (scaleY2 = scaleX2.scaleY(1.0f)) == null || (duration2 = scaleY2.setDuration(50L)) == null) {
                    return;
                }
                final Ref$IntRef ref$IntRef2 = ref$IntRef;
                final int i4 = i;
                final fdf0 fdf0Var2 = fdf0Var;
                final int i5 = i2;
                final RecyclerView recyclerView2 = recyclerView;
                ViewPropertyAnimator withEndAction2 = duration2.withEndAction(new Runnable() { // from class: xsna.edf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Ref$IntRef ref$IntRef3 = Ref$IntRef.this;
                        ref$IntRef3.element++;
                        fdf0.K0(ref$IntRef3, i4, fdf0Var2, i5, recyclerView2);
                    }
                });
                if (withEndAction2 != null) {
                    withEndAction2.start();
                }
            }
        })) == null) {
            return;
        }
        withEndAction.start();
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.d = recyclerView;
        if (this.f && this.h) {
            recyclerView.post(new kw6(8, recyclerView, this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        b bVar = (b) e0Var;
        WebApiApplication webApiApplication = (WebApiApplication) this.c.c(i);
        String str = webApiApplication.d.a(bVar.m).b;
        VkImage vkImage = bVar.n;
        if (vkImage != null) {
            vkImage.o0(str, null);
        }
        bVar.o.setText(webApiApplication.c);
        bVar.l.setOnClickListener(new ba(5, bVar.p, webApiApplication));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(this, this.h ? tf3.b(viewGroup, R.layout.vk_apps_new_recommended_game_holder, viewGroup, false) : tf3.b(viewGroup, R.layout.vk_apps_recommended_game_holder, viewGroup, false));
    }

    public /* synthetic */ fdf0(vvs.b bVar, int i) {
        this((i & 1) != 0 ? null : bVar, false, null, false);
    }

    public fdf0(a aVar, boolean z, vo50 vo50Var, boolean z2) {
        this.e = aVar;
        this.f = z;
        this.g = vo50Var;
        this.h = z2;
        this.i = true;
        this.j = new Handler(Looper.getMainLooper());
    }
}
