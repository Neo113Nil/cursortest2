package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.ironsource.InterfaceC4319fe;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dw20;

/* compiled from: FaveBaseHalfScreenView.kt */
/* loaded from: classes4.dex */
public abstract class omq extends LinearLayout implements c.l<List<? extends FaveTag>>, View.OnAttachStateChangeListener {
    public static final /* synthetic */ int f = 0;
    public final RecyclerPaginatedView b;
    public com.vk.lists.c c;
    public WeakReference<androidx.fragment.app.d> d;
    public final nmq e;

    /* JADX WARN: Type inference failed for: r4v4, types: [xsna.nmq] */
    public omq(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(R.layout.fave_base_bottom_sheet_view, this);
        setOrientation(1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) findViewById(R.id.tags_list);
        this.b = recyclerPaginatedView;
        int minHeightForRecyclerView = getMinHeightForRecyclerView();
        recyclerPaginatedView.setMinimumHeight(minHeightForRecyclerView);
        int abs = Math.abs((minHeightForRecyclerView / 2) - iah0.a(50));
        View progressView = recyclerPaginatedView.getProgressView();
        if (progressView != null) {
            bwt0.b0(1, progressView);
            f4m.t(abs, progressView);
        }
        ee errorView = recyclerPaginatedView.getErrorView();
        if (errorView != null) {
            bwt0.b0(1, errorView);
            f4m.t(abs, errorView);
        }
        addOnAttachStateChangeListener(this);
        this.e = new bd70() { // from class: xsna.nmq
            @Override // xsna.bd70
            public final void x0(int i, int i2, Object obj) {
                omq omqVar = omq.this;
                if (i == 1205 && (obj instanceof FaveTag)) {
                    omqVar.c((FaveTag) obj);
                    return;
                }
                if (i == 1206 && (obj instanceof FaveTag)) {
                    omqVar.a((FaveTag) obj);
                    return;
                }
                if (i == 1204 && (obj instanceof FaveTag)) {
                    omqVar.b((FaveTag) obj);
                } else if (i == 1207 && (obj instanceof List)) {
                    omqVar.d((List) obj);
                }
            }
        };
    }

    public abstract void a(FaveTag faveTag);

    public abstract void b(FaveTag faveTag);

    public abstract void c(FaveTag faveTag);

    public abstract void d(List<FaveTag> list);

    public final void e() {
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
        RecyclerPaginatedView recyclerPaginatedView = this.b;
        recyclerPaginatedView.getClass();
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(layoutType, recyclerPaginatedView);
        dVar.f = 1;
        dVar.a();
        recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        recyclerPaginatedView.setSwipeRefreshEnabled(false);
        c.h hVar = new c.h(this);
        hVar.s = 0;
        com.vk.lists.f.a(hVar, recyclerPaginatedView);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, xsna.dw20] */
    public final void f() {
        dw20.a c;
        int i = gsq.f;
        Context context = getContext();
        gsq gsqVar = new gsq(context);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        c = ((dw20.b) new dw20.b(context, tzp0.a(null, 3)).v0(R.string.fave_tags_title).D0(gsqVar, false).u0(dhr0.C().c).F(uko.e(m33.a(R.drawable.vk_icon_done_outline_24, context), ColorStateList.valueOf(dhr0.t.c(R.attr.vk_ui_icon_accent))), context.getResources().getString(R.string.accessibility_save))).b0(new dkg(ref$ObjectRef, 15)).c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
        dw20.b I = ((dw20.b) c).I(true);
        Activity h = e3m.h(context);
        AppCompatActivity appCompatActivity = h instanceof AppCompatActivity ? (AppCompatActivity) h : null;
        FragmentManager supportFragmentManager = appCompatActivity != null ? appCompatActivity.getSupportFragmentManager() : null;
        z1h0 H = supportFragmentManager != null ? supportFragmentManager.H("omq") : null;
        dw20 dw20Var = H instanceof dw20 ? (dw20) H : null;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        ref$ObjectRef.element = I.I0(gsq.class.getSimpleName());
    }

    public final WeakReference<androidx.fragment.app.d> getDialogHolder() {
        return this.d;
    }

    public int getMinHeightForRecyclerView() {
        return (iah0.f().heightPixels / 2) - iah0.a(56);
    }

    public final RecyclerPaginatedView getPaginatedView() {
        return this.b;
    }

    public final com.vk.lists.c getPaginationHelper() {
        return this.c;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        p870 f2 = p870.f();
        nmq nmqVar = this.e;
        f2.b(1205, nmqVar);
        p870.f().b(InterfaceC4319fe.a.e, nmqVar);
        p870.f().b(1204, nmqVar);
        p870.f().b(1207, nmqVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        p870.f().g(this.e);
    }

    public final void setDialogHolder(WeakReference<androidx.fragment.app.d> weakReference) {
        this.d = weakReference;
    }

    public final void setPaginationHelper(com.vk.lists.c cVar) {
        this.c = cVar;
    }
}
