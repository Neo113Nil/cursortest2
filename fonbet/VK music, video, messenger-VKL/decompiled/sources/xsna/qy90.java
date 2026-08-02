package xsna;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.dialogs.bottomsheet.PersistentBottomSheetBehavior;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PersistentBottomSheet.kt */
/* loaded from: classes17.dex */
public abstract class qy90 extends CoordinatorLayout implements View.OnClickListener, too0 {
    public static final float T = iah0.b(12.0f);
    public static final int U;
    public float A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public float F;
    public float G;
    public gzs<? extends View> H;
    public boolean I;
    public final float[] J;
    public final d K;
    public final LinkedHashSet L;
    public final b M;
    public final PersistentBottomSheetBehavior N;
    public final qog0 O;
    public final FrameLayout P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final e S;
    public float z;

    /* compiled from: PersistentBottomSheet.kt */
    public static final class b extends CustomisableBottomSheetBehavior.b {
        public final LinkedHashSet a;

        public b(LinkedHashSet linkedHashSet) {
            this.a = linkedHashSet;
        }

        @Override // com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior.b
        public final void a(View view, float f) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((CustomisableBottomSheetBehavior.b) it.next()).a(view, f);
            }
        }

        @Override // com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior.b
        public final void b(int i, View view) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((CustomisableBottomSheetBehavior.b) it.next()).b(i, view);
            }
        }
    }

    /* compiled from: PersistentBottomSheet.kt */
    public interface c {
        void c();

        void hide();

        void q();
    }

    /* compiled from: PersistentBottomSheet.kt */
    public static final class d extends ViewOutlineProvider {
        public float a;

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), an10.b(view.getHeight() + this.a), this.a);
        }
    }

    /* compiled from: PersistentBottomSheet.kt */
    public static final class e extends CustomisableBottomSheetBehavior.b {
        public e() {
        }

        @Override // com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior.b
        public final void a(View view, float f) {
            Context context;
            qy90 qy90Var = qy90.this;
            boolean z = true;
            if (f > qy90Var.getHeightToStartRoundingToolbar() && qy90Var.getNeedUpdateCornerInScrolling()) {
                qy90Var.y0(((f - qy90Var.getHeightToStartRoundingToolbar()) * qy90Var.getTopCornerMaxRadius()) / (1 - qy90Var.getHeightToStartRoundingToolbar()));
            }
            if (qy90Var.getNeedRecolorStatusBarInScrolling()) {
                if (!dhr0.M() && f >= 0.3f) {
                    z = false;
                }
                if (qy90Var.I != z && (context = qy90Var.getContext()) != null && e3m.h(context) != null) {
                    mnh0.w(qy90Var.H.invoke(), z);
                    qy90Var.I = z;
                }
            }
            qy90Var.getBackgroundShadowView().setAlpha(qy90Var.getBackgroundShadowAlpha() * f);
        }

        @Override // com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior.b
        public final void b(int i, View view) {
            Context context;
            qy90 qy90Var = qy90.this;
            if (i == 3) {
                qy90Var.getBackgroundShadowView().setClickable(qy90Var.getNeedBackgroundShadow());
                return;
            }
            if (i != 4) {
                if (i != 5) {
                    return;
                }
                qy90Var.getBackgroundShadowView().setClickable(false);
                qy90Var.getBackgroundShadowView().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
            if (!dhr0.M() && qy90Var.getNeedBackgroundShadow() && !qy90Var.I && (context = qy90Var.getContext()) != null && e3m.h(context) != null) {
                mnh0.w(qy90Var.H.invoke(), true);
                qy90Var.I = true;
            }
            qy90Var.y0(qy90Var.getNeedUpdateCornerInScrolling() ? qy90Var.getTopCornerMinRadius() : qy90Var.getTopCornerMaxRadius());
            qy90Var.getBackgroundShadowView().setClickable(false);
        }
    }

    static {
        iah0.b(5.0f);
        U = iah0.a(72);
    }

    public qy90(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void Ng() {
        int c2 = dhr0.t.c(R.attr.vk_ui_background_content);
        qog0 qog0Var = this.O;
        if (qog0Var.n != c2) {
            qog0Var.n = c2;
            qog0Var.invalidateSelf();
        }
    }

    public final boolean a0() {
        if (getState() != 3) {
            return false;
        }
        setState(4);
        return true;
    }

    public final float getBackgroundShadowAlpha() {
        return this.G;
    }

    public final FrameLayout getBackgroundShadowView() {
        return this.R;
    }

    public final PersistentBottomSheetBehavior getBottomSheetBehavior() {
        return this.N;
    }

    public final Set<CustomisableBottomSheetBehavior.b> getBottomSheetCallbackListeners() {
        return this.L;
    }

    public final boolean getCanInteract() {
        return !this.Q.isClickable();
    }

    public final FrameLayout getContentLayout() {
        return this.P;
    }

    public final float[] getCornerRadii() {
        return this.J;
    }

    public final gzs<View> getDecorViewProvider() {
        return this.H;
    }

    public final b getDelegateSheetCallbackImpl() {
        return this.M;
    }

    public final FrameLayout getDisableLayout() {
        return this.Q;
    }

    public final float getHeightToStartRoundingToolbar() {
        return this.F;
    }

    public final CoordinatorLayout.f getMatchParentLayoutParams() {
        return new CoordinatorLayout.f(-1, -1);
    }

    public final int getMaxHeightBottomSheet() {
        return this.D;
    }

    public final boolean getNeedBackgroundShadow() {
        return this.E;
    }

    public final boolean getNeedRecolorStatusBarInScrolling() {
        return this.C;
    }

    public final boolean getNeedUpdateCornerInScrolling() {
        return this.B;
    }

    public final int getPeekHeight() {
        PersistentBottomSheetBehavior persistentBottomSheetBehavior = this.N;
        if (persistentBottomSheetBehavior.d) {
            return -1;
        }
        return persistentBottomSheetBehavior.c;
    }

    public final qog0 getRoundedDrawable() {
        return this.O;
    }

    public final CustomisableBottomSheetBehavior.b getShadowAndToolbarRoundChangingBottomSheetCallback() {
        return this.S;
    }

    public final int getState() {
        return this.N.j;
    }

    public final boolean getStatusBarIsLight() {
        return this.I;
    }

    public final float getTopCornerMaxRadius() {
        return this.z;
    }

    public final float getTopCornerMinRadius() {
        return this.A;
    }

    public final d getUpdatingRoundedOutlineProvider() {
        return this.K;
    }

    public void onClick(View view) {
        if (view == null || view.getId() != R.id.shadow || getState() == 5) {
            return;
        }
        setState(4);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        w0(this.P);
    }

    public final void setBackgroundShadowAlpha(float f) {
        this.G = f;
    }

    public final void setBackgroundShadowColor(int i) {
        this.R.setBackgroundColor(i);
    }

    public final void setBackgroundShadowColorByAttr(int i) {
        setBackgroundShadowColor(e3m.f(i, getContext()));
    }

    public final void setCanInteract(final boolean z) {
        FrameLayout frameLayout = this.Q;
        removeView(frameLayout);
        if (!z) {
            addView(frameLayout, -1, this.P.getLayoutParams());
        }
        frameLayout.setClickable(!z);
        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.py90
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                float f = qy90.T;
                return !z;
            }
        });
    }

    public final void setContentViewColor(int i) {
        qog0 qog0Var = this.O;
        if (qog0Var.n != i) {
            qog0Var.n = i;
            qog0Var.invalidateSelf();
        }
    }

    public final void setContentViewColorByAttr(int i) {
        setContentViewColor(e3m.f(i, getContext()));
    }

    public final void setDecorViewProvider(gzs<? extends View> gzsVar) {
        this.H = gzsVar;
    }

    public final void setHeightToStartRoundingToolbar(float f) {
        this.F = f;
    }

    public final void setHideable(boolean z) {
        this.N.h = z;
    }

    public final void setMaxHeightBottomSheet(int i) {
        this.D = i;
        FrameLayout frameLayout = this.P;
        if (frameLayout.getLayoutParams().height != i) {
            frameLayout.getLayoutParams().height = i;
            frameLayout.requestLayout();
        }
    }

    public final void setNeedBackgroundShadow(boolean z) {
        this.E = z;
        setBackgroundShadowColor(z ? -16777216 : 0);
    }

    public final void setNeedRecolorStatusBarInScrolling(boolean z) {
        this.C = z;
    }

    public final void setNeedUpdateCornerInScrolling(boolean z) {
        this.B = z;
    }

    public final void setPeekHeight(int i) {
        this.N.I(i);
    }

    public final void setState(int i) {
        this.N.J(i);
    }

    public final void setStatusBarIsLight(boolean z) {
        this.I = z;
    }

    public final void setTopCornerMaxRadius(float f) {
        this.z = f;
    }

    public final void setTopCornerMinRadius(float f) {
        this.A = f;
    }

    public abstract void w0(FrameLayout frameLayout);

    public final void y0(float f) {
        float[] fArr = this.J;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f;
        fArr[3] = f;
        this.O.i(fArr);
        this.K.a = f;
    }

    public final void z3(CustomisableBottomSheetBehavior.b bVar) {
        this.L.add(bVar);
    }

    public qy90(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.z = T;
        this.B = true;
        this.C = true;
        this.D = -1;
        this.E = true;
        this.G = 0.8f;
        this.H = new ll7(context, 3);
        this.I = dhr0.M();
        float f = this.A;
        this.J = new float[]{f, f, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        float f2 = this.A;
        d dVar = new d();
        dVar.a = f2;
        this.K = dVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.L = linkedHashSet;
        b bVar = new b(linkedHashSet);
        this.M = bVar;
        PersistentBottomSheetBehavior persistentBottomSheetBehavior = new PersistentBottomSheetBehavior(context);
        persistentBottomSheetBehavior.r = bVar;
        persistentBottomSheetBehavior.I(U);
        persistentBottomSheetBehavior.h = false;
        persistentBottomSheetBehavior.J(4);
        this.N = persistentBottomSheetBehavior;
        qog0 qog0Var = new qog0(dhr0.t.c(R.attr.vk_ui_background_content));
        this.O = qog0Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(qog0Var);
        frameLayout.setOutlineProvider(dVar);
        frameLayout.setFocusableInTouchMode(true);
        frameLayout.setFocusable(true);
        frameLayout.setClipChildren(true);
        frameLayout.setClipToOutline(true);
        frameLayout.setClipToPadding(true);
        frameLayout.setClickable(true);
        this.P = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(new ColorDrawable(0));
        frameLayout2.setElevation(iah0.b(11.0f));
        this.Q = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.shadow);
        frameLayout3.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        frameLayout3.setOnClickListener(this);
        frameLayout3.setClickable(false);
        frameLayout3.setImportantForAccessibility(2);
        frameLayout3.setBackgroundColor(-16777216);
        this.R = frameLayout3;
        e eVar = new e();
        this.S = eVar;
        CoordinatorLayout.f matchParentLayoutParams = getMatchParentLayoutParams();
        matchParentLayoutParams.c(persistentBottomSheetBehavior);
        addView(frameLayout3, getMatchParentLayoutParams());
        addView(frameLayout, matchParentLayoutParams);
        z3(eVar);
        y0(this.A);
    }

    /* compiled from: PersistentBottomSheet.kt */
    /* loaded from: classes.dex */
    public static class a extends CustomisableBottomSheetBehavior.b {
        @Override // com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior.b
        public void a(View view, float f) {
        }
    }
}
