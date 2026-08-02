package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.view.Window;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.cameraui.impl.a;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import xsna.dw20;
import xsna.ikv0;

/* compiled from: ShowCollectionView.kt */
/* loaded from: classes16.dex */
public final class xhj0 implements xpj {
    public final Context b;
    public uhj0 c;
    public int d;
    public int e;
    public int f;
    public RecyclerPaginatedView g;
    public dw20 h;
    public final bpn0 i = new bpn0(new gwd0(4));

    /* compiled from: ShowCollectionView.kt */
    public static final class a implements hz20 {
        public a() {
        }

        @Override // xsna.hz20
        public final void a(int i) {
            uhj0 uhj0Var = xhj0.this.c;
            if (uhj0Var != null) {
                ActionLink actionLink = uhj0Var.t;
                if (actionLink == null) {
                    xhj0 xhj0Var = uhj0Var.k;
                    (xhj0Var != null ? xhj0Var : null).d(R.string.collection_add_empty_selection);
                    return;
                }
                if (uhj0Var.g) {
                    xhj0 xhj0Var2 = uhj0Var.k;
                    (xhj0Var2 != null ? xhj0Var2 : null).dismiss();
                }
                com.vk.movika.sdk.base.observable.k kVar = uhj0Var.c;
                if (kVar != null) {
                    kVar.invoke(actionLink);
                }
            }
        }
    }

    /* compiled from: ShowCollectionView.kt */
    public static final class b implements gz20 {
        public b() {
        }

        @Override // xsna.gz20
        public final void onCancel() {
            a.j jVar;
            uhj0 uhj0Var = xhj0.this.c;
            if (uhj0Var == null || (jVar = uhj0Var.j) == null) {
                return;
            }
            jVar.onDismiss(null);
        }
    }

    public xhj0(Context context) {
        this.b = context;
    }

    public final void b(boolean z) {
        TextView Kn;
        TextView Kn2;
        TextView Kn3;
        TextView Kn4;
        if (z) {
            dw20 dw20Var = this.h;
            if (dw20Var != null && (Kn4 = dw20Var.Kn()) != null) {
                Kn4.setClickable(true);
            }
            dw20 dw20Var2 = this.h;
            if (dw20Var2 == null || (Kn3 = dw20Var2.Kn()) == null) {
                return;
            }
            Kn3.setAlpha(1.0f);
            return;
        }
        dw20 dw20Var3 = this.h;
        if (dw20Var3 != null && (Kn2 = dw20Var3.Kn()) != null) {
            Kn2.setClickable(false);
        }
        dw20 dw20Var4 = this.h;
        if (dw20Var4 == null || (Kn = dw20Var4.Kn()) == null) {
            return;
        }
        Kn.setAlpha(0.5f);
    }

    public final void c() {
        dw20.a c;
        uhj0 uhj0Var = this.c;
        if (uhj0Var != null && uhj0Var.f) {
            if (uhj0Var != null) {
                uhj0Var.g0();
                return;
            }
            return;
        }
        Context context = this.b;
        RecyclerPaginatedView recyclerPaginatedView = new RecyclerPaginatedView(context);
        this.g = recyclerPaginatedView;
        recyclerPaginatedView.getRecyclerView().setItemAnimator(new androidx.recyclerview.widget.g());
        RecyclerPaginatedView recyclerPaginatedView2 = this.g;
        if (recyclerPaginatedView2 == null) {
            recyclerPaginatedView2 = null;
        }
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
        recyclerPaginatedView2.getClass();
        new AbstractPaginatedView.d(layoutType, recyclerPaginatedView2).a();
        RecyclerPaginatedView recyclerPaginatedView3 = this.g;
        if (recyclerPaginatedView3 == null) {
            recyclerPaginatedView3 = null;
        }
        recyclerPaginatedView3.setMinimumHeight(iah0.f().heightPixels);
        dw20.b r0 = new dw20.b(context, tzp0.a(null, 3)).v0(this.e).r0(this.f);
        RecyclerPaginatedView recyclerPaginatedView4 = this.g;
        c = r0.D0(recyclerPaginatedView4 != null ? recyclerPaginatedView4 : null, false).c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
        dw20.b f0 = ((dw20.b) c).Y(new b()).Z(new kn40(this, 3)).f0(new b140(this, 21));
        if (!fnj.d(context)) {
            f0.I(true);
        }
        uhj0 uhj0Var2 = this.c;
        if (uhj0Var2 != null && uhj0Var2.d) {
            dw20.a.k0(f0, context.getString(this.d), new a(), null, null, 12);
        }
        this.h = f0.I0("ShowCollectionView");
        uhj0 uhj0Var3 = this.c;
        if (uhj0Var3 == null || !uhj0Var3.d) {
            return;
        }
        ((Handler) this.i.getValue()).post(new rc4(this, 17));
    }

    public final void d(int i) {
        f(this.b.getString(i));
    }

    @Override // xsna.xpj
    public final void dismiss() {
        a.j jVar;
        dw20 dw20Var = this.h;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        uhj0 uhj0Var = this.c;
        if (uhj0Var == null || (jVar = uhj0Var.j) == null) {
            return;
        }
        jVar.onDismiss(null);
    }

    public final void f(String str) {
        Dialog dialog;
        Window window;
        dw20 dw20Var = this.h;
        if (dw20Var == null || (dialog = dw20Var.s) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        ikv0.a aVar = new ikv0.a(this.b);
        aVar.u = new ikv0.d(str, (String) null, (ikv0.d.a) null, 6);
        aVar.p(window);
    }
}
