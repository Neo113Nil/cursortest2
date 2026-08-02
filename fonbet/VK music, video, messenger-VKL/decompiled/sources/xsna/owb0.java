package xsna;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.window.OnBackInvokedCallback;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$LongRef;

/* compiled from: AndroidPopup.android.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes11.dex */
public final class owb0 extends td {
    public static final a F = a.i;
    public final ibk0 A;
    public vw2 B;
    public final wh50 C;
    public boolean D;
    public final int[] E;
    public gzs<s3q0> l;
    public gxb0 m;
    public String n;
    public final View o;
    public final boolean p;
    public final wwb0 q;
    public final WindowManager r;
    public final WindowManager.LayoutParams s;
    public fxb0 t;
    public LayoutDirection u;
    public final wh50 v;
    public final wh50 w;
    public l9x x;
    public final f1m y;
    public final Rect z;

    /* compiled from: AndroidPopup.android.kt */
    public static final class a extends Lambda implements izs<owb0, s3q0> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final s3q0 invoke(owb0 owb0Var) {
            owb0 owb0Var2 = owb0Var;
            if (owb0Var2.isAttachedToWindow()) {
                owb0Var2.E();
            }
            return s3q0.a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    public static final class b extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            owb0.this.o(ne7.I(this.$$changed | 1), aVar);
            return s3q0.a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    public static final class d extends Lambda implements gzs<s3q0> {
        final /* synthetic */ l9x $parentBounds;
        final /* synthetic */ long $popupContentSize;
        final /* synthetic */ Ref$LongRef $popupPosition;
        final /* synthetic */ long $windowSize;
        final /* synthetic */ owb0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Ref$LongRef ref$LongRef, owb0 owb0Var, l9x l9xVar, long j, long j2) {
            super(0);
            this.$popupPosition = ref$LongRef;
            this.this$0 = owb0Var;
            this.$parentBounds = l9xVar;
            this.$windowSize = j;
            this.$popupContentSize = j2;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.$popupPosition.element = this.this$0.getPositionProvider().b(this.$parentBounds, this.$windowSize, this.this$0.getParentLayoutDirection(), this.$popupContentSize);
            return s3q0.a;
        }
    }

    public owb0() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owb0(gzs gzsVar, gxb0 gxb0Var, String str, View view, azl azlVar, fxb0 fxb0Var, UUID uuid, boolean z) {
        super(view.getContext(), null, 6, 0);
        int i = Build.VERSION.SDK_INT;
        wwb0 vwb0Var = i >= 30 ? new vwb0() : i >= 29 ? new swb0() : new wwb0();
        this.l = gzsVar;
        this.m = gxb0Var;
        this.n = str;
        this.o = view;
        this.p = z;
        this.q = vwb0Var;
        this.r = (WindowManager) view.getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        gxb0 gxb0Var2 = this.m;
        boolean b2 = nb2.b(view);
        boolean z2 = gxb0Var2.b;
        int i2 = gxb0Var2.a;
        if (z2 && b2) {
            i2 |= 8192;
        } else if (z2 && !b2) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = this.m.g;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.s = layoutParams;
        this.t = fxb0Var;
        this.u = LayoutDirection.Ltr;
        this.v = androidx.compose.runtime.k.b(null);
        this.w = androidx.compose.runtime.k.b(null);
        this.y = bbk0.b(new pwb0(this));
        this.z = new Rect();
        this.A = new ibk0(new qwb0(this));
        setId(android.R.id.content);
        gqo.f(this, gqo.e(view));
        ro.o(this, ro.h(view));
        lyd.h(this, lyd.f(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(azlVar.I0((float) 8));
        setOutlineProvider(new nwb0());
        this.C = androidx.compose.runtime.k.b(uai.a);
        this.E = new int[2];
    }

    private final wzs<androidx.compose.runtime.a, Integer, s3q0> getContent() {
        return (wzs) ((zak0) this.C).getValue();
    }

    private final l9x getDisplayBounds() {
        int i = this.m.a & 512;
        View view = this.o;
        wwb0 wwb0Var = this.q;
        Rect rect = this.z;
        if (i == 0) {
            wwb0Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            wwb0Var.a(rect, view);
        }
        pqo pqoVar = nb2.a;
        return new l9x(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tny getParentLayoutCoordinates() {
        return (tny) ((zak0) this.w).getValue();
    }

    private final void setContent(wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
        ((zak0) this.C).setValue(wzsVar);
    }

    private final void setParentLayoutCoordinates(tny tnyVar) {
        ((zak0) this.w).setValue(tnyVar);
    }

    public final void A(cvi cviVar, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
        setParentCompositionContext(cviVar);
        setContent(wzsVar);
        this.D = true;
    }

    public final void B(gzs<s3q0> gzsVar, gxb0 gxb0Var, String str, LayoutDirection layoutDirection) {
        this.l = gzsVar;
        this.n = str;
        if (!epx.f(this.m, gxb0Var)) {
            boolean z = gxb0Var.f;
            WindowManager.LayoutParams layoutParams = this.s;
            if (z && !this.m.f) {
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            this.m = gxb0Var;
            boolean b2 = nb2.b(this.o);
            boolean z2 = gxb0Var.b;
            int i = gxb0Var.a;
            if (z2 && b2) {
                i |= 8192;
            } else if (z2 && !b2) {
                i &= -8193;
            }
            layoutParams.flags = i;
            this.q.getClass();
            this.r.updateViewLayout(this, layoutParams);
        }
        int i2 = c.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            i3 = 0;
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i3);
    }

    public final void C() {
        tny parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.e()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long a2 = parentLayoutCoordinates.a();
            long k = this.p ? parentLayoutCoordinates.k(0L) : parentLayoutCoordinates.U(0L);
            long round = (Math.round(Float.intBitsToFloat((int) (k >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (k & 4294967295L))) & 4294967295L);
            int i = (int) (round >> 32);
            int i2 = (int) (round & 4294967295L);
            l9x l9xVar = new l9x(i, i2, ((int) (a2 >> 32)) + i, ((int) (a2 & 4294967295L)) + i2);
            if (l9xVar.equals(this.x)) {
                return;
            }
            this.x = l9xVar;
            E();
        }
    }

    public final void D(tny tnyVar) {
        setParentLayoutCoordinates(tnyVar);
        C();
    }

    public final void E() {
        q9x m414getPopupContentSizebOM6tXw;
        l9x l9xVar = this.x;
        if (l9xVar == null || (m414getPopupContentSizebOM6tXw = m414getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = m414getPopupContentSizebOM6tXw.a;
        l9x displayBounds = getDisplayBounds();
        long b2 = (displayBounds.b() & 4294967295L) | (displayBounds.d() << 32);
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = 0L;
        this.A.d(this, F, new d(ref$LongRef, this, l9xVar, b2, j));
        long j2 = ref$LongRef.element;
        WindowManager.LayoutParams layoutParams = this.s;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.m.e;
        wwb0 wwb0Var = this.q;
        if (z) {
            wwb0Var.b(this, (int) (b2 >> 32), (int) (b2 & 4294967295L));
        }
        wwb0Var.getClass();
        this.r.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.m.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                gzs<s3q0> gzsVar = this.l;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.y.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.s;
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.u;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final q9x m414getPopupContentSizebOM6tXw() {
        return (q9x) ((zak0) this.v).getValue();
    }

    public final fxb0 getPositionProvider() {
        return this.t;
    }

    @Override // xsna.td
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.D;
    }

    public final String getTestTag() {
        return this.n;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // xsna.td
    public final void o(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-857613600);
        if ((i & 6) == 0) {
            i2 = (M.y(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-857613600, i2, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:715)");
            }
            getContent().invoke(M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b(i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [xsna.vw2] */
    @Override // xsna.td, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A.e();
        if (!this.m.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.B == null) {
            final gzs<s3q0> gzsVar = this.l;
            this.B = new OnBackInvokedCallback() { // from class: xsna.vw2
                public final void onBackInvoked() {
                    gzs gzsVar2 = gzs.this;
                    if (gzsVar2 != null) {
                        gzsVar2.invoke();
                    }
                }
            };
        }
        ww2.a(this, this.B);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ibk0 ibk0Var = this.A;
        cak0 cak0Var = ibk0Var.h;
        if (cak0Var != null) {
            cak0Var.dispose();
        }
        ibk0Var.a();
        if (Build.VERSION.SDK_INT >= 33) {
            ww2.b(this, this.B);
        }
        this.B = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.m.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || motionEvent.getX() >= getWidth() || motionEvent.getY() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || motionEvent.getY() >= getHeight())) {
            gzs<s3q0> gzsVar = this.l;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        gzs<s3q0> gzsVar2 = this.l;
        if (gzsVar2 != null) {
            gzsVar2.invoke();
        }
        return true;
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        this.u = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m415setPopupContentSizefhxjrPA(q9x q9xVar) {
        ((zak0) this.v).setValue(q9xVar);
    }

    public final void setPositionProvider(fxb0 fxb0Var) {
        this.t = fxb0Var;
    }

    public final void setTestTag(String str) {
        this.n = str;
    }

    @Override // xsna.td
    public final void u(int i, int i2, int i3, int i4, boolean z) {
        View childAt;
        super.u(i, i2, i3, i4, z);
        if (this.m.f || (childAt = getChildAt(0)) == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.s;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.q.getClass();
        this.r.updateViewLayout(this, layoutParams);
    }

    @Override // xsna.td
    public final void v(int i, int i2) {
        if (this.m.f) {
            super.v(i, i2);
        } else {
            l9x displayBounds = getDisplayBounds();
            super.v(View.MeasureSpec.makeMeasureSpec(displayBounds.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.b(), Integer.MIN_VALUE));
        }
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public td getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
