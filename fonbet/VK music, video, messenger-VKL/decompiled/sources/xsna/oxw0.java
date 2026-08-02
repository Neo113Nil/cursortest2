package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState;
import com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.pxw0;

/* compiled from: VoipScheduleCallView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class oxw0 extends CoordinatorLayout {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final pxw0 J;
    public final qxw0<pxw0> z;

    public oxw0(Context context, VoipCreateScheduleCallFragment.b bVar, boolean z) {
        super(context, null);
        int i;
        int i2;
        this.z = bVar;
        jds0 jds0Var = new jds0(this, 10);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.A = msy.a(lazyThreadSafetyMode, jds0Var);
        this.B = msy.a(lazyThreadSafetyMode, new h8n0(this, 20));
        this.C = msy.a(lazyThreadSafetyMode, new nrq0(this, 9));
        this.D = msy.a(lazyThreadSafetyMode, new iri0(this, 26));
        this.E = msy.a(lazyThreadSafetyMode, new xbt0(this, 3));
        this.F = msy.a(lazyThreadSafetyMode, new fcs0(this, 12));
        this.G = msy.a(lazyThreadSafetyMode, new acp0(this, 11));
        this.H = msy.a(lazyThreadSafetyMode, new i8n0(this, 18));
        this.I = msy.a(lazyThreadSafetyMode, new prq0(this, 25));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LayoutInflater.from(context).inflate(R.layout.voip_schedule_call_view, (ViewGroup) this, true);
        if (z) {
            this.J = pxw0.a.a;
            i = R.string.voip_schedule_call_edit_title;
            i2 = R.string.voip_schedule_call_save_call;
        } else {
            this.J = pxw0.o.a;
            i = R.string.voip_schedule_call_title;
            i2 = R.string.voip_schedule_call_schedule_call;
        }
        getToolbarTitle().setText(i);
        getActionCallButton().setText(i2);
        ViewFlipper viewFlipper = getViewFlipper();
        AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        alphaAnimation.setDuration(200L);
        viewFlipper.setInAnimation(alphaAnimation);
        ViewFlipper viewFlipper2 = getViewFlipper();
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        alphaAnimation2.setDuration(200L);
        viewFlipper2.setOutAnimation(alphaAnimation2);
        bwt0.i0(getActionCallButton(), new dso0(this, 25));
        RecyclerView recycler = getRecycler();
        getContext();
        recycler.setLayoutManager(new LinearLayoutManager());
        getRecycler().setAdapter(getAdapter());
        float f = 16;
        float f2 = 8;
        getRecycler().addItemDecoration(new ddv(R.attr.vk_ui_separator_primary, iah0.a(0.5f), iah0.a(f), iah0.a(f2), iah0.a(f), 0, new jxw0(this), new kxw0()));
        getRecycler().addItemDecoration(new ugk0(iah0.a(f2), new lxw0(this), new mxw0()));
        getRecycler().addOnScrollListener(new nxw0(this));
        getToolbar().setNavigationIcon(dhr0.t.b(R.drawable.vk_icon_arrow_left_outline_28, R.attr.vk_ui_icon_accent_themed));
        dhr0.a.V(getToolbar());
        getToolbar().setNavigationOnClickListener(new qp4(this, 13));
        bwt0.i0(getErrorButton(), new dgu0(this, 3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getActionCallButton() {
        return (TextView) this.G.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final sxm getAdapter() {
        return (sxm) this.A.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final FrameLayout getContentOverlayLoading() {
        return (FrameLayout) this.H.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getErrorButton() {
        return (TextView) this.E.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getErrorText() {
        return (TextView) this.D.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final RecyclerView getRecycler() {
        return (RecyclerView) this.B.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Toolbar getToolbar() {
        return (Toolbar) this.C.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getToolbarTitle() {
        return (TextView) this.I.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ViewFlipper getViewFlipper() {
        return (ViewFlipper) this.F.getValue();
    }

    private final void setContentVisible(VoipScheduleCallViewState.ScreenState.a aVar) {
        if (getViewFlipper().getDisplayedChild() != 1) {
            getViewFlipper().setDisplayedChild(1);
        }
        Integer num = aVar.b;
        if (num != null) {
            RecyclerView.o layoutManager = getRecycler().getLayoutManager();
            if (layoutManager == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            }
            ((LinearLayoutManager) layoutManager).scrollToPosition(num.intValue());
        }
        getAdapter().setItems(aVar.a);
        if (aVar.c) {
            d3m.c(getContentOverlayLoading(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            d3m.e(getContentOverlayLoading(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
    }

    private final void setError(VoipScheduleCallViewState.ScreenState.b bVar) {
        if (getViewFlipper().getDisplayedChild() != 2) {
            getViewFlipper().setDisplayedChild(2);
        }
        getErrorText().setText(bVar.a);
    }

    public final void y0(VoipScheduleCallViewState.ScreenState screenState) {
        if (screenState instanceof VoipScheduleCallViewState.ScreenState.c) {
            if (getViewFlipper().getDisplayedChild() != 0) {
                getViewFlipper().setDisplayedChild(0);
            }
        } else if (screenState instanceof VoipScheduleCallViewState.ScreenState.a) {
            setContentVisible((VoipScheduleCallViewState.ScreenState.a) screenState);
        } else {
            if (!(screenState instanceof VoipScheduleCallViewState.ScreenState.b)) {
                throw new NoWhenBranchMatchedException();
            }
            setError((VoipScheduleCallViewState.ScreenState.b) screenState);
        }
        s3q0 s3q0Var = s3q0.a;
    }
}
