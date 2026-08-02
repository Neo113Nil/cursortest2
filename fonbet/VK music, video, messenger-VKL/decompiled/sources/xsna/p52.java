package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.node.Invalidation;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.a;
import androidx.compose.ui.node.j;
import androidx.compose.ui.node.o;
import androidx.compose.ui.node.q;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.e0;
import com.facebook.soloader.MinElf;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b72;
import xsna.ci50;
import xsna.dak0;
import xsna.ia30;
import xsna.ibk0;
import xsna.l5z;
import xsna.n4s;
import xsna.o62;
import xsna.o6j;
import xsna.q630;
import xsna.qbk;
import xsna.tra0;
import xsna.ura0;
import xsna.v4s;

/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes11.dex */
public final class p52 extends ViewGroup implements androidx.compose.ui.node.p, lta0, androidx.compose.ui.node.q, qn10, nhl, s090, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, uvr {
    public static Class<?> O0;
    public static Method P0;
    public static Method Q0;
    public static final fh50<p52> R0 = new fh50<>((Object) null);
    public static o52 S0;
    public static Method T0;
    public final y52 A;
    public final fh50<gzs<s3q0>> A0;
    public b72 B;
    public float B0;
    public final p12 C;
    public float C0;
    public final c92 D;
    public final o D0;
    public final no5 E;
    public final nf0 E0;
    public final fh50<m490> F;
    public boolean F0;
    public fh50<m490> G;
    public final ruw G0;
    public boolean H;
    public final n H0;
    public boolean I;
    public final mz8 I0;
    public final ia30 J;
    public boolean J0;
    public final amb0 K;
    public boolean K0;
    public final wh50 L;
    public final yeh0 L0;
    public final f1m M;
    public View M0;
    public final u22 N;
    public final m N0;
    public final v22 O;
    public boolean P;
    public final i52 Q;
    public final h52 R;
    public final t590 S;
    public boolean T;
    public be2 U;
    public o6j V;
    public boolean W;
    public final androidx.compose.ui.node.j a0;
    public final wh50 b;
    public long b0;
    public long c;
    public final int[] c0;
    public final boolean d;
    public final float[] d0;
    public muw e;
    public final float[] e0;
    public final toy f;
    public final float[] f0;
    public l5z.a g;
    public long g0;
    public l5z.b h;
    public boolean h0;
    public reg0 i;
    public long i0;
    public final sk3<gzs<s3q0>> j;
    public final wh50 j0;
    public final m52 k;
    public final f1m k0;
    public final wh50 l;
    public izs<? super iri, s3q0> l0;
    public final View m;
    public nio0 m0;
    public final gwr n;
    public mio0 n0;
    public kotlin.coroutines.d o;
    public final AtomicReference<jui0<kb2>> o0;
    public final b82 p;
    public iul p0;
    public final hyy q;
    public final n4s.a q0;
    public final wh50 r;
    public final wh50 r0;
    public final f1m s;
    public final wh50 s0;
    public final ir9 t;
    public final vtu t0;
    public final ud2 u;
    public final o2x u0;
    public final m4x v;
    public final z630 v0;
    public final LayoutNode w;
    public final hd2 w0;
    public final pg50<LayoutNode> x;
    public MotionEvent x0;
    public final fif0 y;
    public long y0;
    public final mgi0 z;
    public final ah3 z0;

    /* compiled from: AndroidComposeView.android.kt */
    public static final class a {
        public static boolean a() {
            try {
                if (p52.O0 == null) {
                    p52.O0 = Class.forName("android.os.SystemProperties");
                }
                if (p52.P0 == null) {
                    Class<?> cls = p52.O0;
                    p52.P0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = p52.P0;
                Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                return epx.f(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    public static final class c {
    }

    /* compiled from: AndroidComposeView.android.kt */
    public static final class d {
    }

    /* compiled from: AndroidComposeView.android.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<xfj> {
        @Override // xsna.gzs
        public final xfj invoke() {
            ContentCaptureSession a;
            View view = (View) this.receiver;
            o62.a aVar = o62.a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                lut0.a(view);
            }
            if (i < 29 || (a = kut0.a(view)) == null) {
                return null;
            }
            return new wfj(a, view);
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    public static final class f extends Lambda implements gzs<Boolean> {
        public f() {
            super(0);
        }

        @Override // xsna.gzs
        public final Boolean invoke() {
            Boolean bool = (Boolean) ((zak0) p52.this.r).getValue();
            bool.booleanValue();
            return bool;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    public static final class g extends Lambda implements gzs<Boolean> {
        final /* synthetic */ KeyEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(KeyEvent keyEvent) {
            super(0);
            this.$event = keyEvent;
        }

        @Override // xsna.gzs
        public final Boolean invoke() {
            return Boolean.valueOf(p52.super.dispatchKeyEvent(this.$event));
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements yzs<vfo, mxj0, izs<? super oio, ? extends s3q0>, Boolean> {
        @Override // xsna.yzs
        public final Boolean invoke(vfo vfoVar, mxj0 mxj0Var, izs<? super oio, ? extends s3q0> izsVar) {
            p52 p52Var = (p52) this.receiver;
            Class<?> cls = p52.O0;
            Resources resources = p52Var.getContext().getResources();
            lpi lpiVar = new lpi(new dzl(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), mxj0Var.a, izsVar);
            return Boolean.valueOf(h62.a.a(p52Var, vfoVar, lpiVar));
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    public static final class i extends Lambda implements izs<dxr, Boolean> {
        final /* synthetic */ Ref$ObjectRef<dxr> $focusTarget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Ref$ObjectRef<dxr> ref$ObjectRef) {
            super(1);
            this.$focusTarget = ref$ObjectRef;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, xsna.dxr] */
        @Override // xsna.izs
        public final Boolean invoke(dxr dxrVar) {
            this.$focusTarget.element = dxrVar;
            return Boolean.TRUE;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    public static final class j extends Lambda implements izs<dxr, Boolean> {
        public static final j i = new j(1);

        @Override // xsna.izs
        public final /* bridge */ /* synthetic */ Boolean invoke(dxr dxrVar) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    public static final class k extends Lambda implements izs<ivr, s3q0> {
        public k() {
            super(1);
        }

        @Override // xsna.izs
        public final s3q0 invoke(ivr ivrVar) {
            p52.this.getFocusOwner().g(ivrVar.a, false);
            return s3q0.a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    public static final class l extends Lambda implements gzs<lwz> {
        public l() {
            super(0);
        }

        @Override // xsna.gzs
        public final lwz invoke() {
            mwz a = hyi.a(p52.this.getConfiguration());
            if (a.a.a.isEmpty()) {
                a = mwz.b(LocaleList.getDefault());
            }
            LocaleList localeList = a.a.a;
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new kwz(localeList.get(i)));
            }
            return new lwz(arrayList);
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    public static final class m implements vlb0 {
        public ulb0 a;

        public m() {
            ulb0.a.getClass();
        }

        @Override // xsna.vlb0
        public final void a(ulb0 ulb0Var) {
            this.a = ulb0Var;
        }

        @Override // xsna.vlb0
        public final ulb0 b() {
            return this.a;
        }

        @Override // xsna.vlb0
        public final void c(ulb0 ulb0Var) {
            if (ulb0Var == null) {
                ulb0.a.getClass();
                ulb0Var = y000.b;
            }
            m62.a.a(p52.this, ulb0Var);
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    public static final class n extends Lambda implements gzs<s3q0> {
        public n() {
            super(0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            int actionMasked;
            MotionEvent motionEvent = p52.this.x0;
            if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                p52.this.y0 = SystemClock.uptimeMillis();
                p52 p52Var = p52.this;
                p52Var.post(p52Var.D0);
            }
            return s3q0.a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    public static final class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int actionMasked;
            p52 p52Var = p52.this;
            p52Var.removeCallbacks(this);
            MotionEvent motionEvent = p52Var.x0;
            if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                return;
            }
            int i = 7;
            if (actionMasked != 7 && actionMasked != 9) {
                i = 2;
            }
            int i2 = i;
            p52 p52Var2 = p52.this;
            p52Var2.b0(motionEvent, i2, p52Var2.y0, false);
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    public static final class p extends d730<b> {
        public p() {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return p52.this.hashCode();
        }

        @Override // xsna.d730
        public final b r() {
            return p52.this.new b();
        }

        @Override // xsna.d730
        public final /* bridge */ /* synthetic */ void s(b bVar) {
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    public static final class q extends Lambda implements izs<gzs<? extends s3q0>, s3q0> {
        public q() {
            super(1);
        }

        @Override // xsna.izs
        public final s3q0 invoke(gzs<? extends s3q0> gzsVar) {
            gzs<? extends s3q0> gzsVar2 = gzsVar;
            p52.this.getUncaughtExceptionHandler$ui();
            Handler handler = p52.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                gzsVar2.invoke();
            } else {
                Handler handler2 = p52.this.getHandler();
                if (handler2 != null) {
                    handler2.post(new u52(0, gzsVar2));
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    public static final class r extends Lambda implements gzs<c> {
        public r() {
            super(0);
        }

        @Override // xsna.gzs
        public final c invoke() {
            return p52.this.get_viewTreeOwners();
        }
    }

    public p52(Context context, iri iriVar) {
        super(context);
        this.b = androidx.compose.runtime.k.b(iriVar);
        this.c = 9205357640488583168L;
        int i2 = 1;
        this.d = true;
        this.f = iriVar.r;
        this.i = fdi.d;
        this.j = new sk3<>();
        this.k = new m52(this, 0);
        this.l = androidx.compose.runtime.k.a(hpt0.d(context), hg10.g);
        this.n = new gwr(this, this);
        this.o = iriVar.b.k();
        this.p = new b82(new h(3, this, p52.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0));
        this.q = new hyy();
        this.r = androidx.compose.runtime.k.b(Boolean.FALSE);
        this.s = bbk0.b(new f());
        this.t = iriVar.t;
        this.u = iriVar.q;
        this.v = new m4x();
        LayoutNode layoutNode = new LayoutNode(3);
        layoutNode.n(kmg0.b);
        layoutNode.j0(getDensity());
        layoutNode.m0(getViewConfiguration());
        layoutNode.p(new p().g(getFocusOwner().c()).g(getDragAndDropManager().c));
        this.w = layoutNode;
        this.x = g9x.a();
        getLayoutNodes();
        this.y = new fif0(this);
        this.z = new mgi0(getRoot(), new fhp(), getLayoutNodes());
        y52 y52Var = new y52(this);
        this.A = y52Var;
        this.B = new b72(this, new e(0, this, o62.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1));
        this.C = iriVar.j;
        this.D = new c92(this);
        this.E = new no5();
        this.F = new fh50<>(r6);
        this.J = new ia30();
        this.K = new amb0(getRoot());
        this.L = androidx.compose.runtime.k.b(new Configuration(context.getResources().getConfiguration()));
        this.M = bbk0.b(new l());
        this.N = new u22(this, getAutofillTree());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw pm0.f("Autofill service could not be located.");
        }
        this.O = new v22(new gta0(autofillManager), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.Q = iriVar.l;
        this.R = iriVar.m;
        this.S = new t590(new q());
        this.a0 = new androidx.compose.ui.node.j(getRoot());
        long j2 = Integer.MAX_VALUE;
        this.b0 = (j2 & 4294967295L) | (j2 << 32);
        this.c0 = new int[]{0, 0};
        float[] a2 = en10.a();
        this.d0 = a2;
        this.e0 = en10.a();
        this.f0 = en10.a();
        this.g0 = -1L;
        this.i0 = 9187343241974906880L;
        this.j0 = androidx.compose.runtime.k.b(null);
        this.k0 = bbk0.b(new r());
        this.o0 = new AtomicReference<>(null);
        this.q0 = iriVar.n;
        this.r0 = iriVar.o;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = svr.a;
        LayoutDirection layoutDirection2 = layoutDirection != 0 ? layoutDirection != 1 ? null : LayoutDirection.Rtl : LayoutDirection.Ltr;
        this.s0 = androidx.compose.runtime.k.b(layoutDirection2 == null ? LayoutDirection.Ltr : layoutDirection2);
        this.t0 = iriVar.p;
        this.u0 = new o2x(isInTouchMode() ? 1 : 2, new d());
        this.v0 = new z630(this);
        hd2 hd2Var = new hd2();
        new mbo0(new gd2(hd2Var));
        TextToolbarStatus textToolbarStatus = TextToolbarStatus.Hidden;
        this.w0 = hd2Var;
        this.z0 = new ah3();
        this.A0 = new fh50<>(r6);
        this.D0 = new o();
        this.E0 = new nf0(this, i2);
        this.G0 = new ruw(context, new k());
        this.H0 = new n();
        int i3 = Build.VERSION.SDK_INT;
        this.I0 = i3 < 29 ? new nz8(a2) : new pz8();
        addOnAttachStateChangeListener(this.B);
        setWillNotDraw(false);
        setFocusable(true);
        n62.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        iut0.q(this, y52Var);
        setOnDragListener(getDragAndDropManager());
        getRoot().s(this);
        if (i3 >= 29) {
            g62.a.a(this);
        }
        if (P()) {
            View view = new View(context);
            u11.h(1, 1, view);
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.m = view;
            addView(view, -1);
        }
        this.L0 = i3 >= 31 ? new yeh0() : null;
        this.N0 = new m();
    }

    public static final void F(p52 p52Var, int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int c2;
        y52 y52Var = p52Var.A;
        if (epx.f(str, y52Var.C)) {
            int c3 = y52Var.A.c(i2, -1);
            if (c3 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, c3);
                return;
            }
            return;
        }
        if (!epx.f(str, y52Var.D) || (c2 = y52Var.B.c(i2, -1)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, c2);
    }

    public static void J(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof p52) {
                ((p52) childAt).h();
            } else if (childAt instanceof ViewGroup) {
                J((ViewGroup) childAt);
            }
        }
    }

    public static long K(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return (0 << 32) | size;
        }
        if (mode == 0) {
            return (0 << 32) | Integer.MAX_VALUE;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j2 = size;
        return j2 | (j2 << 32);
    }

    public static View L(int i2, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (epx.f(declaredMethod.invoke(view, null), Integer.valueOf(i2))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View L = L(i2, viewGroup.getChildAt(i3));
                    if (L != null) {
                        return L;
                    }
                }
            }
        }
        return null;
    }

    public static void N(LayoutNode layoutNode) {
        layoutNode.P();
        ci50<LayoutNode> L = layoutNode.L();
        LayoutNode[] layoutNodeArr = L.b;
        int i2 = L.d;
        for (int i3 = 0; i3 < i2; i3++) {
            N(layoutNodeArr[i3]);
        }
    }

    public static boolean P() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean Q(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i2 = 1; i2 < pointerCount; i2++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i2)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i2)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !ja30.a.a(motionEvent, i2));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.s.getValue()).booleanValue();
    }

    private final nio0 getLegacyTextInputServiceAndroid() {
        nio0 nio0Var = this.m0;
        if (nio0Var != null) {
            return nio0Var;
        }
        nio0 nio0Var2 = new nio0(getView(), this);
        this.m0 = nio0Var2;
        return nio0Var2;
    }

    private final iri get_composeViewContext() {
        return (iri) ((zak0) this.b).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c get_viewTreeOwners() {
        return (c) ((zak0) this.j0).getValue();
    }

    private final void setAttached(boolean z) {
        ((zak0) this.r).setValue(Boolean.valueOf(z));
    }

    private void setDensity(azl azlVar) {
        ((zak0) this.l).setValue(azlVar);
    }

    private void setFontFamilyResolver(v4s.a aVar) {
        this.r0.setValue(aVar);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        ((zak0) this.s0).setValue(layoutDirection);
    }

    private final void set_composeViewContext(iri iriVar) {
        ((zak0) this.b).setValue(iriVar);
    }

    private final void set_viewTreeOwners(c cVar) {
        ((zak0) this.j0).setValue(cVar);
    }

    @Override // androidx.compose.ui.node.p
    public final void A(LayoutNode layoutNode) {
        xfi0 d2;
        v22 v22Var = this.O;
        if (v22Var == null || (d2 = layoutNode.d()) == null || !d2.b.a(ngi0.r)) {
            return;
        }
        v22Var.i.b(layoutNode.c);
        v22Var.b.b(v22Var.d, layoutNode.c, true);
    }

    @Override // androidx.compose.ui.node.p
    public final void B(int i2, LayoutNode layoutNode) {
        v22 v22Var = this.O;
        if (v22Var != null) {
            p52 p52Var = v22Var.d;
            gta0 gta0Var = v22Var.b;
            qg50 qg50Var = v22Var.i;
            if (qg50Var.h(i2)) {
                gta0Var.b(p52Var, i2, false);
            }
            xfi0 d2 = layoutNode.d();
            if (d2 == null || !d2.b.a(ngi0.r)) {
                return;
            }
            qg50Var.b(layoutNode.c);
            gta0Var.b(p52Var, layoutNode.c, true);
        }
    }

    @Override // androidx.compose.ui.node.p
    public final void C(LayoutNode layoutNode) {
        getLayoutNodes().i(layoutNode.c);
        androidx.compose.ui.node.j jVar = this.a0;
        a1m a1mVar = jVar.b;
        a1mVar.a.h(layoutNode);
        a1mVar.b.h(layoutNode);
        a1mVar.c.h(layoutNode);
        ((ci50) jVar.e.b).j(layoutNode);
        this.P = true;
        v22 v22Var = this.O;
        if (v22Var == null || !v22Var.i.h(layoutNode.c)) {
            return;
        }
        v22Var.b.b(v22Var.d, layoutNode.c, false);
    }

    @Override // androidx.compose.ui.node.p
    public final m490 D(wzs wzsVar, o.f fVar, mdu mduVar) {
        ci50 ci50Var;
        Reference poll;
        Object obj;
        if (mduVar != null) {
            return new sdu(mduVar, null, this, wzsVar, fVar);
        }
        do {
            ah3 ah3Var = this.z0;
            ReferenceQueue referenceQueue = (ReferenceQueue) ah3Var.c;
            ci50Var = (ci50) ah3Var.b;
            poll = referenceQueue.poll();
            if (poll != null) {
                ci50Var.j(poll);
            }
        } while (poll != null);
        while (true) {
            int i2 = ci50Var.d;
            if (i2 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) ci50Var.k(i2 - 1)).get();
            if (obj != null) {
                break;
            }
        }
        m490 m490Var = (m490) obj;
        if (m490Var == null) {
            return new sdu(getGraphicsContext().a(), getGraphicsContext(), this, wzsVar, fVar);
        }
        m490Var.b(fVar, wzsVar);
        return m490Var;
    }

    @Override // androidx.compose.ui.node.p
    public final void E(LayoutNode layoutNode) {
        v22 v22Var = this.O;
        if (v22Var == null || !v22Var.i.h(layoutNode.c)) {
            return;
        }
        v22Var.b.b(v22Var.d, layoutNode.c, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b0, B:27:0x00b8, B:28:0x00bb, B:30:0x00bf, B:32:0x00c5, B:34:0x00c9, B:35:0x00cf, B:38:0x00d7, B:41:0x00df, B:42:0x00eb, B:44:0x00f1, B:46:0x00f7, B:48:0x00fd, B:49:0x0103, B:51:0x0107, B:52:0x010b, B:57:0x011e, B:59:0x0122, B:60:0x0129, B:66:0x013a, B:67:0x0144, B:69:0x014a, B:70:0x014d, B:76:0x0154), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b0, B:27:0x00b8, B:28:0x00bb, B:30:0x00bf, B:32:0x00c5, B:34:0x00c9, B:35:0x00cf, B:38:0x00d7, B:41:0x00df, B:42:0x00eb, B:44:0x00f1, B:46:0x00f7, B:48:0x00fd, B:49:0x0103, B:51:0x0107, B:52:0x010b, B:57:0x011e, B:59:0x0122, B:60:0x0129, B:66:0x013a, B:67:0x0144, B:69:0x014a, B:70:0x014d, B:76:0x0154), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b0, B:27:0x00b8, B:28:0x00bb, B:30:0x00bf, B:32:0x00c5, B:34:0x00c9, B:35:0x00cf, B:38:0x00d7, B:41:0x00df, B:42:0x00eb, B:44:0x00f1, B:46:0x00f7, B:48:0x00fd, B:49:0x0103, B:51:0x0107, B:52:0x010b, B:57:0x011e, B:59:0x0122, B:60:0x0129, B:66:0x013a, B:67:0x0144, B:69:0x014a, B:70:0x014d, B:76:0x0154), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b0, B:27:0x00b8, B:28:0x00bb, B:30:0x00bf, B:32:0x00c5, B:34:0x00c9, B:35:0x00cf, B:38:0x00d7, B:41:0x00df, B:42:0x00eb, B:44:0x00f1, B:46:0x00f7, B:48:0x00fd, B:49:0x0103, B:51:0x0107, B:52:0x010b, B:57:0x011e, B:59:0x0122, B:60:0x0129, B:66:0x013a, B:67:0x0144, B:69:0x014a, B:70:0x014d, B:76:0x0154), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0122 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b0, B:27:0x00b8, B:28:0x00bb, B:30:0x00bf, B:32:0x00c5, B:34:0x00c9, B:35:0x00cf, B:38:0x00d7, B:41:0x00df, B:42:0x00eb, B:44:0x00f1, B:46:0x00f7, B:48:0x00fd, B:49:0x0103, B:51:0x0107, B:52:0x010b, B:57:0x011e, B:59:0x0122, B:60:0x0129, B:66:0x013a, B:67:0x0144, B:69:0x014a, B:70:0x014d, B:76:0x0154), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013a A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b0, B:27:0x00b8, B:28:0x00bb, B:30:0x00bf, B:32:0x00c5, B:34:0x00c9, B:35:0x00cf, B:38:0x00d7, B:41:0x00df, B:42:0x00eb, B:44:0x00f1, B:46:0x00f7, B:48:0x00fd, B:49:0x0103, B:51:0x0107, B:52:0x010b, B:57:0x011e, B:59:0x0122, B:60:0x0129, B:66:0x013a, B:67:0x0144, B:69:0x014a, B:70:0x014d, B:76:0x0154), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014a A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b0, B:27:0x00b8, B:28:0x00bb, B:30:0x00bf, B:32:0x00c5, B:34:0x00c9, B:35:0x00cf, B:38:0x00d7, B:41:0x00df, B:42:0x00eb, B:44:0x00f1, B:46:0x00f7, B:48:0x00fd, B:49:0x0103, B:51:0x0107, B:52:0x010b, B:57:0x011e, B:59:0x0122, B:60:0x0129, B:66:0x013a, B:67:0x0144, B:69:0x014a, B:70:0x014d, B:76:0x0154), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014d A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b0, B:27:0x00b8, B:28:0x00bb, B:30:0x00bf, B:32:0x00c5, B:34:0x00c9, B:35:0x00cf, B:38:0x00d7, B:41:0x00df, B:42:0x00eb, B:44:0x00f1, B:46:0x00f7, B:48:0x00fd, B:49:0x0103, B:51:0x0107, B:52:0x010b, B:57:0x011e, B:59:0x0122, B:60:0x0129, B:66:0x013a, B:67:0x0144, B:69:0x014a, B:70:0x014d, B:76:0x0154), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x004e A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x0076, blocks: (B:90:0x0034, B:92:0x003e, B:97:0x004e, B:100:0x007d, B:102:0x0081, B:13:0x008d, B:21:0x00a0, B:23:0x00a6, B:103:0x0056, B:109:0x0062, B:112:0x006a), top: B:89:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int M(MotionEvent motionEvent) {
        boolean z;
        int actionMasked;
        MotionEvent motionEvent2;
        p52 p52Var;
        MotionEvent motionEvent3;
        int pointerId;
        int action;
        boolean z2;
        y8v y8vVar;
        removeCallbacks(this.D0);
        try {
            W(motionEvent);
            this.h0 = true;
            a(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent4 = this.x0;
                boolean z3 = motionEvent4 != null && motionEvent4.getToolType(0) == 3;
                amb0 amb0Var = this.K;
                if (motionEvent4 != null) {
                    try {
                        if (motionEvent4.getSource() == motionEvent.getSource() && motionEvent4.getToolType(0) == motionEvent.getToolType(0)) {
                            z = false;
                            if (z) {
                                if (motionEvent4.getButtonState() != 0 || (actionMasked = motionEvent4.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                    motionEvent2 = motionEvent4;
                                    if (!amb0Var.e) {
                                        amb0Var.c.a.clear();
                                        amb0Var.b.c();
                                    }
                                } else if (motionEvent4.getActionMasked() != 10 && z3) {
                                    b0(motionEvent4, 10, motionEvent4.getEventTime(), true);
                                    motionEvent2 = motionEvent4;
                                }
                                boolean z4 = motionEvent.getToolType(0) != 3;
                                if (z3 && z4 && actionMasked2 != 3 && actionMasked2 != 9 && R(motionEvent)) {
                                    p52Var = this;
                                    p52Var.b0(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    p52Var = this;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = p52Var.x0;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    MotionEvent motionEvent5 = p52Var.x0;
                                    pointerId = motionEvent5 == null ? motionEvent5.getPointerId(0) : -1;
                                    action = motionEvent.getAction();
                                    ia30 ia30Var = p52Var.J;
                                    if (action == 9 || motionEvent.getHistorySize() != 0) {
                                        if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                            MotionEvent motionEvent6 = p52Var.x0;
                                            float x = motionEvent6 == null ? motionEvent6.getX() : Float.NaN;
                                            MotionEvent motionEvent7 = p52Var.x0;
                                            z2 = x == motionEvent.getX() || (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) != motionEvent.getY();
                                            MotionEvent motionEvent8 = p52Var.x0;
                                            boolean z5 = (motionEvent8 == null ? motionEvent8.getEventTime() : -1L) == motionEvent.getEventTime();
                                            if (!z2 || z5) {
                                                if (pointerId >= 0) {
                                                    ia30Var.c.delete(pointerId);
                                                    ia30Var.b.delete(pointerId);
                                                }
                                                y8vVar = amb0Var.b;
                                                if (y8vVar.d) {
                                                    y8vVar.g.a.g();
                                                } else {
                                                    y8vVar.d = true;
                                                }
                                            }
                                        }
                                    } else if (pointerId >= 0) {
                                        ia30Var.c.delete(pointerId);
                                        ia30Var.b.delete(pointerId);
                                    }
                                }
                                p52Var.x0 = MotionEvent.obtainNoHistory(motionEvent);
                                int a0 = a0(motionEvent);
                                Trace.endSection();
                                p52Var.h0 = false;
                                return a0;
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                motionEvent2 = motionEvent4;
                if (motionEvent.getToolType(0) != 3) {
                }
                if (z3) {
                }
                p52Var = this;
                if (motionEvent2 != null) {
                }
                motionEvent3 = p52Var.x0;
                if (motionEvent3 != null) {
                    MotionEvent motionEvent52 = p52Var.x0;
                    if (motionEvent52 == null) {
                    }
                    action = motionEvent.getAction();
                    ia30 ia30Var2 = p52Var.J;
                    if (action == 9) {
                    }
                    if (motionEvent.getAction() == 0) {
                        MotionEvent motionEvent62 = p52Var.x0;
                        if (motionEvent62 == null) {
                        }
                        MotionEvent motionEvent72 = p52Var.x0;
                        if (motionEvent72 != null) {
                        }
                        if (x == motionEvent.getX()) {
                        }
                        MotionEvent motionEvent82 = p52Var.x0;
                        if ((motionEvent82 == null ? motionEvent82.getEventTime() : -1L) == motionEvent.getEventTime()) {
                        }
                        if (!z2) {
                        }
                        if (pointerId >= 0) {
                        }
                        y8vVar = amb0Var.b;
                        if (y8vVar.d) {
                        }
                    }
                }
                p52Var.x0 = MotionEvent.obtainNoHistory(motionEvent);
                int a02 = a0(motionEvent);
                Trace.endSection();
                p52Var.h0 = false;
                return a02;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.h0 = false;
            throw th3;
        }
    }

    public final void O(LayoutNode layoutNode) {
        this.a0.r(layoutNode, false);
        ci50<LayoutNode> L = layoutNode.L();
        LayoutNode[] layoutNodeArr = L.b;
        int i2 = L.d;
        for (int i3 = 0; i3 < i2; i3++) {
            O(layoutNodeArr[i3]);
        }
    }

    public final boolean R(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= x && x <= ((float) getWidth()) && UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= y && y <= ((float) getHeight());
    }

    public final boolean S(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.x0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final boolean T(int i2) {
        if (i2 == 7 || i2 == 8) {
            return false;
        }
        Integer c2 = svr.c(i2);
        if (c2 == null) {
            throw pm0.f("Invalid focus direction");
        }
        int intValue = c2.intValue();
        dxr b2 = getFocusOwner().b();
        if (b2 == null) {
            throw new IllegalStateException("findNextViewInEmbeddedView called when owner does not have anything focused.");
        }
        Integer c3 = svr.c(i2);
        if (c3 == null) {
            throw pm0.f("Invalid focus direction");
        }
        int intValue2 = c3.intValue();
        dxt0 dxt0Var = itl.f(b2).p;
        View interopView = dxt0Var != null ? dxt0Var.getInteropView() : null;
        View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) getRootView(), findFocus(), intValue2);
        if (findNextFocus == null || interopView == null || !o62.a(interopView, findNextFocus)) {
            findNextFocus = null;
        }
        if (findNextFocus != null) {
            return svr.b(findNextFocus, Integer.valueOf(intValue), null);
        }
        return false;
    }

    public final void U(m490 m490Var, boolean z) {
        fh50<m490> fh50Var = this.F;
        if (!z) {
            if (this.H) {
                return;
            }
            fh50Var.n(m490Var);
            fh50<m490> fh50Var2 = this.G;
            if (fh50Var2 != null) {
                fh50Var2.n(m490Var);
                return;
            }
            return;
        }
        if (!this.H) {
            fh50Var.j(m490Var);
            return;
        }
        fh50<m490> fh50Var3 = this.G;
        if (fh50Var3 == null) {
            fh50Var3 = new fh50<>((Object) null);
            this.G = fh50Var3;
        }
        fh50Var3.j(m490Var);
    }

    public final void V() {
        if (this.h0) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.g0) {
            this.g0 = currentAnimationTimeMillis;
            mz8 mz8Var = this.I0;
            float[] fArr = this.e0;
            mz8Var.d(this, fArr);
            s101.s(fArr, this.f0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.c0;
            view.getLocationOnScreen(iArr);
            float f2 = iArr[0];
            float f3 = iArr[1];
            view.getLocationInWindow(iArr);
            float f4 = iArr[0];
            float f5 = f3 - iArr[1];
            this.i0 = (Float.floatToRawIntBits(f2 - f4) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
        }
    }

    public final void W(MotionEvent motionEvent) {
        this.g0 = AnimationUtils.currentAnimationTimeMillis();
        mz8 mz8Var = this.I0;
        float[] fArr = this.e0;
        mz8Var.d(this, fArr);
        s101.s(fArr, this.f0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long b2 = en10.b((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (b2 >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (b2 & 4294967295L));
        this.i0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final void X(Object obj) {
        Runnable runnable = obj instanceof Runnable ? (Runnable) obj : null;
        if (runnable == null) {
            return;
        }
        removeCallbacks(runnable);
    }

    public final boolean Y() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void Z(LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (layoutNode != null) {
            while (layoutNode != null && layoutNode.F() == LayoutNode.UsageByParent.InMeasureBlock) {
                if (!this.W) {
                    LayoutNode I = layoutNode.I();
                    if (I == null) {
                        break;
                    }
                    long j2 = I.G.c.e;
                    if (o6j.g(j2) && o6j.f(j2)) {
                        break;
                    }
                }
                layoutNode = layoutNode.I();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    @Override // androidx.compose.ui.node.p
    public final void a(boolean z) {
        n nVar;
        androidx.compose.ui.node.j jVar = this.a0;
        if (jVar.b.c() || ((ci50) jVar.e.b).d != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    nVar = this.H0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                nVar = null;
            }
            if (jVar.l(nVar)) {
                requestLayout();
            }
            jVar.b(false);
            getRectManager().a();
            if (this.I) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.I = false;
            }
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a0(MotionEvent motionEvent) {
        Object obj;
        zlb0 zlb0Var;
        int a2;
        if (this.J0) {
            this.J0 = false;
            hyy hyyVar = getComposeViewContext().s;
            int metaState = motionEvent.getMetaState();
            hyyVar.getClass();
            ((zak0) tpx0.a).setValue(new jmb0(metaState));
        }
        ia30 ia30Var = this.J;
        q5o c2 = ia30Var.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        amb0 amb0Var = this.K;
        if (c2 == null) {
            if (!amb0Var.e) {
                amb0Var.c.a.clear();
                amb0Var.b.c();
            }
            return 0;
        }
        List list = (List) c2.b;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                obj = list.get(size);
                if (((zlb0) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                size = i2;
            }
            zlb0Var = (zlb0) obj;
            if (zlb0Var != null) {
                this.c = zlb0Var.d;
            }
            a2 = amb0Var.a(c2, this, R(motionEvent));
            c2.c = null;
            if ((actionMasked == 0 && actionMasked != 5) || (a2 & 1) != 0) {
                return a2;
            }
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            ia30Var.c.delete(pointerId);
            ia30Var.b.delete(pointerId);
            return a2;
        }
        obj = null;
        zlb0Var = (zlb0) obj;
        if (zlb0Var != null) {
        }
        a2 = amb0Var.a(c2, this, R(motionEvent));
        c2.c = null;
        if (actionMasked == 0) {
        }
        int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
        ia30Var.c.delete(pointerId2);
        ia30Var.b.delete(pointerId2);
        return a2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        if (getFocusOwner().u()) {
            super.addFocusables(arrayList, i2, i3);
            if (getFocusOwner().v() || arrayList == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray<AutofillValue> sparseArray) {
        xfi0 d2;
        izs izsVar;
        izs izsVar2;
        v22 v22Var = this.O;
        if (v22Var != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = sparseArray.keyAt(i2);
                AutofillValue autofillValue = sparseArray.get(keyAt);
                LayoutNode b2 = v22Var.c.c.b(keyAt);
                if (b2 != null && (d2 = b2.d()) != null) {
                    ck ckVar = (ck) zfi0.a(d2, wfi0.g);
                    if (ckVar != null && (izsVar2 = (izs) ckVar.b) != null) {
                    }
                    ck ckVar2 = (ck) zfi0.a(d2, wfi0.h);
                    if (ckVar2 != null && (izsVar = (izs) ckVar2.b) != null) {
                    }
                }
            }
        }
        u22 u22Var = this.N;
        if (u22Var != null) {
            no5 no5Var = u22Var.b;
            if (no5Var.a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i3 = 0; i3 < size2; i3++) {
                int keyAt2 = sparseArray.keyAt(i3);
                AutofillValue autofillValue2 = sparseArray.get(keyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                } else {
                    if (autofillValue2.isDate()) {
                        throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.p
    public final void b(LayoutNode layoutNode) {
        utb utbVar = this.a0.e;
        utbVar.getClass();
        if (layoutNode.Q > 0) {
            ((ci50) utbVar.b).b(layoutNode);
            layoutNode.P = true;
        }
        Z(null);
    }

    public final void b0(MotionEvent motionEvent, int i2, long j2, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int i3 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i3 = motionEvent.getActionIndex();
            }
        } else if (i2 != 9 && i2 != 10) {
            i3 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i3 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerPropertiesArr[i4] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i5 = 0; i5 < pointerCount; i5++) {
            pointerCoordsArr[i5] = new MotionEvent.PointerCoords();
        }
        int i6 = 0;
        while (i6 < pointerCount) {
            int i7 = ((i3 < 0 || i6 < i3) ? 0 : 1) + i6;
            motionEvent.getPointerProperties(i7, pointerPropertiesArr[i6]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i6];
            motionEvent.getPointerCoords(i7, pointerCoords);
            float f2 = pointerCoords.x;
            long k2 = k((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (k2 >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (k2 & 4294967295L));
            i6++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j2 : motionEvent.getDownTime(), j2, i2, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        this.K.a(this.J.c(obtain, this), this, true);
        obtain.recycle();
    }

    @Override // androidx.compose.ui.node.p
    public final void c() {
        invalidate();
    }

    public final void c0(Configuration configuration) {
        wh50<d1m> wh50Var;
        Configuration configuration2 = getConfiguration();
        if (epx.f(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(hpt0.d(getContext()));
        }
        o62.a aVar = o62.a;
        if ((configuration2.diff(configuration) & (-1342235264)) == 0 || (wh50Var = this.q.b) == null) {
            return;
        }
        ((zak0) wh50Var).setValue(se2.a(this));
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        return this.A.d(i2, this.c, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i2) {
        return this.A.d(i2, this.c, true);
    }

    @Override // xsna.qn10
    public final void d(float[] fArr) {
        V();
        en10.h(fArr, this.e0);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.i0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.i0 & 4294967295L));
        o62.a aVar = o62.a;
        float[] fArr2 = this.d0;
        en10.e(fArr2);
        en10.i(intBitsToFloat, intBitsToFloat2, fArr2);
        o62.c(fArr, fArr2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        fh50<m490> fh50Var = this.F;
        if (!isAttachedToWindow()) {
            N(getRoot());
        }
        a(true);
        qak0.j().m();
        this.H = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            ir9 ir9Var = this.t;
            d52 d52Var = ir9Var.a;
            Canvas canvas2 = d52Var.a;
            d52Var.a = canvas;
            getRoot().x(d52Var, null);
            ir9Var.a.a = canvas2;
            if (fh50Var.g()) {
                int i2 = fh50Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    fh50Var.d(i3).i();
                }
            }
            if (jyt0.j) {
                int save = canvas.save();
                canvas.clipRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(save);
            }
            fh50Var.m();
            this.H = false;
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
            fh50<m490> fh50Var2 = this.G;
            if (fh50Var2 != null) {
                fh50Var.l(fh50Var2);
                fh50Var2.m();
            }
            if (P()) {
                zw2.a(this, this.B0);
                View view = this.m;
                if (view != null) {
                    zw2.a(view, this.C0);
                    if (!Float.isNaN(this.C0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.B0 = Float.NaN;
                this.C0 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0252, code lost:
    
        if ((r2 / r3) >= 5.0f) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        int i2;
        fa2 fa2Var;
        long j2;
        muw muwVar;
        long j3;
        boolean z;
        int i3;
        int i4;
        long j4;
        boolean z2;
        long j5;
        ia30 ia30Var;
        long j6;
        boolean z3;
        boolean z4;
        if (this.F0) {
            nf0 nf0Var = this.E0;
            removeCallbacks(nf0Var);
            if (motionEvent.getActionMasked() == 8) {
                this.F0 = false;
            } else {
                nf0Var.run();
            }
        }
        if (Q(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int i5 = 1;
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (M(motionEvent) & 4) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            float f2 = -motionEvent.getAxisValue(26);
            getContext();
            float scaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor() * f2;
            getContext();
            return getFocusOwner().t(new smg0(motionEvent.getEventTime(), scaledVerticalScrollFactor, viewConfiguration.getScaledHorizontalScrollFactor() * f2, motionEvent.getDeviceId()), new r52(motionEvent, this));
        }
        if (!motionEvent.isFromSource(2097152)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        muw muwVar2 = this.e;
        ia30 ia30Var2 = this.J;
        x500<ia30.a> x500Var = ia30Var2.e;
        SparseLongArray sparseLongArray = ia30Var2.b;
        int actionMasked = motionEvent.getActionMasked();
        ia30Var2.b(motionEvent);
        if (actionMasked == 3) {
            sparseLongArray.clear();
            ia30Var2.c.clear();
            fa2Var = null;
        } else {
            ia30Var2.a(motionEvent);
            int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
            boolean z5 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
            int pointerCount = motionEvent.getPointerCount();
            ArrayList arrayList = new ArrayList(pointerCount);
            int i6 = 0;
            while (i6 < pointerCount) {
                int pointerId = motionEvent.getPointerId(i6);
                int i7 = i5;
                int indexOfKey = sparseLongArray.indexOfKey(pointerId);
                if (indexOfKey >= 0) {
                    muwVar = muwVar2;
                    j2 = sparseLongArray.valueAt(indexOfKey);
                } else {
                    j2 = ia30Var2.a;
                    muwVar = muwVar2;
                    ia30Var2.a = j2 + 1;
                    sparseLongArray.put(pointerId, j2);
                }
                long floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getX(i6)) << 32) | (Float.floatToRawIntBits(motionEvent.getY(i6)) & 4294967295L);
                boolean z6 = i6 != actionIndex ? i7 : 0;
                ia30.a aVar = x500Var.get(j2);
                if (i6 == actionIndex) {
                    x500Var.remove(j2);
                    j3 = j2;
                    z2 = 32;
                    i3 = actionIndex;
                    j4 = 2147483647L;
                    i4 = MinElf.PN_XNUM;
                } else {
                    if (z5) {
                        long eventTime = 1 | ((motionEvent.getEventTime() & 2147483647L) << i7);
                        z = 32;
                        i3 = actionIndex;
                        short intBitsToFloat = (short) Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                        i4 = MinElf.PN_XNUM;
                        j3 = j2;
                        x500Var.put(j3, new ia30.a(eventTime | (((((short) Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))) & 65535) | (intBitsToFloat << 16)) << 32)));
                    } else {
                        j3 = j2;
                        z = 32;
                        i3 = actionIndex;
                        i4 = MinElf.PN_XNUM;
                    }
                    j4 = 2147483647L;
                    z2 = z;
                }
                boolean z7 = z2;
                long eventTime2 = motionEvent.getEventTime();
                float pressure = motionEvent.getPressure(i6);
                long eventTime3 = aVar != null ? (aVar.a >> i7) & j4 : motionEvent.getEventTime();
                if (aVar != null) {
                    int i8 = i4;
                    ia30Var = ia30Var2;
                    int i9 = (int) (aVar.a >>> (z7 ? 1L : 0L));
                    float f3 = (short) (i9 >>> 16);
                    float f4 = (short) (i9 & i8);
                    j5 = j3;
                    j6 = (Float.floatToRawIntBits(f3) << (z7 ? 1L : 0L)) | (Float.floatToRawIntBits(f4) & 4294967295L);
                } else {
                    j5 = j3;
                    ia30Var = ia30Var2;
                    j6 = floatToRawIntBits;
                }
                if (aVar != null) {
                    z3 = (aVar.a & 1) != 0 ? i7 : 0;
                } else {
                    z3 = 0;
                }
                arrayList.add(new nuw(j5, eventTime2, floatToRawIntBits, z6, pressure, eventTime3, j6, z3));
                i6++;
                i5 = i7;
                muwVar2 = muwVar;
                actionIndex = i3;
                ia30Var2 = ia30Var;
            }
            muw muwVar3 = muwVar2;
            int i10 = i5;
            ia30Var2.e(motionEvent);
            if (muwVar3 != null) {
                i2 = muwVar3.a;
            } else {
                if (!motionEvent.isFromSource(2097152)) {
                    throw new IllegalArgumentException("MotionEvent must be a touch navigation source");
                }
                InputDevice device = motionEvent.getDevice();
                if (device != null) {
                    InputDevice.MotionRange motionRange = device.getMotionRange(0);
                    InputDevice.MotionRange motionRange2 = device.getMotionRange(i10);
                    if (motionRange == null || motionRange2 != null) {
                        if (motionRange2 == null || motionRange != null) {
                            if (motionRange != null && motionRange2 != null) {
                                float range = motionRange.getRange();
                                float range2 = motionRange2.getRange();
                                if (range <= range2 || (range2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && range / range2 < 5.0f)) {
                                    if (range2 > range) {
                                        if (range != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        }
                                    }
                                }
                            }
                        }
                        i2 = 2;
                    }
                    i2 = 1;
                }
                i2 = 0;
            }
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 2 || actionMasked != 5) {
            }
            fa2Var = new fa2(arrayList, i2, motionEvent);
        }
        ruw ruwVar = this.G0;
        if (fa2Var == null) {
            getFocusOwner().r();
            ruwVar.b = 0;
            ruwVar.c = true;
            return true;
        }
        boolean f5 = getFocusOwner().f(fa2Var);
        ruwVar.getClass();
        MotionEvent motionEvent2 = fa2Var.c;
        int action = motionEvent2.getAction();
        if (action != 0) {
            z4 = true;
            if ((action == 1 || action == 2) && f5) {
                ruwVar.b = 0;
                ruwVar.c = true;
            }
        } else {
            z4 = true;
            ruwVar.b = fa2Var.b;
            ruwVar.c = false;
        }
        ruwVar.d.onTouchEvent(motionEvent2);
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0152, code lost:
    
        if (S(r24) == false) goto L69;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i2;
        boolean z = this.F0;
        nf0 nf0Var = this.E0;
        if (z) {
            removeCallbacks(nf0Var);
            nf0Var.run();
        }
        if (!Q(motionEvent) && isAttachedToWindow()) {
            y52 y52Var = this.A;
            p52 p52Var = y52Var.b;
            AccessibilityManager accessibilityManager = y52Var.e;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    p52Var.a(true);
                    z8v z8vVar = new z8v();
                    LayoutNode root = p52Var.getRoot();
                    LayoutNode.c cVar = LayoutNode.S;
                    u470 u470Var = root.G;
                    androidx.compose.ui.node.o oVar = u470Var.d;
                    o.d dVar = androidx.compose.ui.node.o.R;
                    u470Var.d.L1(androidx.compose.ui.node.o.X, oVar.v1((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L)), z8vVar, 1, true);
                    for (int h2 = e43.h(z8vVar); -1 < h2; h2--) {
                        LayoutNode f2 = itl.f((q630.c) z8vVar.b.d(h2));
                        if (p52Var.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(f2) != null) {
                            break;
                        }
                        if (f2.G.d(8)) {
                            int q2 = y52Var.q(f2.c);
                            igi0 a2 = kgi0.a(f2, false);
                            if (qxm0.p(a2)) {
                                if (!a2.k().b.b(ngi0.B)) {
                                    i2 = q2;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i2 = Integer.MIN_VALUE;
                    p52Var.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i3 = y52Var.c;
                    if (i3 != i2) {
                        y52Var.c = i2;
                        y52.u(y52Var, i2, 128, null, 12);
                        y52.u(y52Var, i3, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i4 = y52Var.c;
                    if (i4 == Integer.MIN_VALUE) {
                        p52Var.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    } else if (i4 != Integer.MIN_VALUE) {
                        y52Var.c = Integer.MIN_VALUE;
                        y52.u(y52Var, Integer.MIN_VALUE, 128, null, 12);
                        y52.u(y52Var, i4, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && R(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.x0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.x0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.F0 = true;
                        postDelayed(nf0Var, 8L);
                        return false;
                    }
                }
                if ((M(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().i(keyEvent, new g(keyEvent));
        }
        hyy hyyVar = getComposeViewContext().s;
        int metaState = keyEvent.getMetaState();
        hyyVar.getClass();
        ((zak0) tpx0.a).setValue(new jmb0(metaState));
        return getFocusOwner().i(keyEvent, ewr.i) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().a(keyEvent)) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object we5Var;
        dxr b2;
        if (this.F0) {
            nf0 nf0Var = this.E0;
            removeCallbacks(nf0Var);
            MotionEvent motionEvent2 = this.x0;
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.F0 = false;
            } else {
                nf0Var.run();
            }
        }
        if (!Q(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || S(motionEvent))) {
            int M = M(motionEvent);
            if ((M & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (we5Var = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    we5Var = new we5(1);
                }
                if (we5Var.equals(new we5(1)) && (b2 = getFocusOwner().b()) != null) {
                    androidx.compose.ui.node.o e2 = itl.e(b2);
                    if (!jgz.p(e2).z(e2, true).a((Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L))) {
                        getFocusOwner().y(false);
                    }
                }
            }
            if ((M & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.node.p
    public final void e(LayoutNode layoutNode) {
        v22 v22Var = this.O;
        if (v22Var != null) {
            v22Var.e.b.e(layoutNode.c, new x22(v22Var, layoutNode));
        }
    }

    @Override // androidx.compose.ui.node.p
    public final void f(a.b bVar) {
        this.a0.f.b(bVar);
        Z(null);
    }

    public final View findViewByAccessibilityIdTraversal(int i2) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return L(i2, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i2));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i2) {
        zhf0 a2;
        if (view == null || this.a0.c) {
            return super.focusSearch(view, i2);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) getRootView(), view, i2);
        if (findNextFocus == null || !o62.a(this, findNextFocus)) {
            findNextFocus = null;
        }
        if (view == this) {
            a2 = getFocusOwner().w();
            if (a2 == null) {
                a2 = svr.a(view, this);
            }
        } else {
            a2 = svr.a(view, this);
        }
        ivr d2 = svr.d(i2);
        int i3 = d2 != null ? d2.a : 6;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (getFocusOwner().s(i3, a2, new i(ref$ObjectRef)) == null) {
            return view;
        }
        T t = ref$ObjectRef.element;
        if (t == 0) {
            if (findNextFocus == null) {
                return super.focusSearch(view, i2);
            }
        } else if (findNextFocus == null || i3 == 1 || i3 == 2 || gtp0.g(ixr.b((dxr) t), svr.a(findNextFocus, this), a2, i3)) {
            return this;
        }
        return findNextFocus;
    }

    @Override // androidx.compose.ui.node.p
    public final long g(long j2) {
        V();
        return en10.b(j2, this.f0);
    }

    public final be2 getAndroidViewsHandler$ui() {
        if (this.U == null) {
            be2 be2Var = new be2(getContext());
            this.U = be2Var;
            addView(be2Var, -1);
            requestLayout();
        }
        return this.U;
    }

    @Override // androidx.compose.ui.node.p
    public ho5 getAutofill() {
        return this.N;
    }

    @Override // androidx.compose.ui.node.p
    public lo5 getAutofillManager() {
        return this.O;
    }

    @Override // androidx.compose.ui.node.p
    public no5 getAutofillTree() {
        return this.E;
    }

    public final iri getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.K0;
    }

    public final Configuration getConfiguration() {
        return (Configuration) ((zak0) this.L).getValue();
    }

    public final b72 getContentCaptureManager$ui() {
        return this.B;
    }

    @Override // androidx.compose.ui.node.p
    public kotlin.coroutines.d getCoroutineContext() {
        return this.o;
    }

    @Override // androidx.compose.ui.node.p
    public azl getDensity() {
        return (azl) ((zak0) this.l).getValue();
    }

    @Override // xsna.lta0
    public zhf0 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            return getFocusOwner().w();
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return svr.a(findFocus, this);
        }
        return null;
    }

    @Override // androidx.compose.ui.node.p
    public fwr getFocusOwner() {
        return this.n;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        zhf0 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (epx.f(getFocusOwner().s(6, null, j.i), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // androidx.compose.ui.node.p
    public v4s.a getFontFamilyResolver() {
        return (v4s.a) this.r0.getValue();
    }

    @Override // androidx.compose.ui.node.p
    public n4s.a getFontLoader() {
        return this.q0;
    }

    public final l5z.a getFrameEndScheduler$ui() {
        return this.g;
    }

    @Override // androidx.compose.ui.node.p
    public kdu getGraphicsContext() {
        return this.D;
    }

    @Override // androidx.compose.ui.node.p
    public vtu getHapticFeedBack() {
        return this.t0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.a0.b.c() || !this.j.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // androidx.compose.ui.node.p
    public n2x getInputModeManager() {
        return this.u0;
    }

    public final m4x getInsetsListener() {
        return this.v;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.g0;
    }

    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.p
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) ((zak0) this.s0).getValue();
    }

    @Override // androidx.compose.ui.node.p
    public lwz getLocaleList() {
        return (lwz) this.M.getValue();
    }

    public long getMeasureIteration() {
        androidx.compose.ui.node.j jVar = this.a0;
        if (!jVar.c) {
            uzw.a("measureIteration should be only used during the measure/layout pass");
        }
        return jVar.g;
    }

    @Override // androidx.compose.ui.node.p
    public z630 getModifierLocalManager() {
        return this.v0;
    }

    @Override // androidx.compose.ui.node.p
    public tra0.a getPlacementScope() {
        ura0.a aVar = ura0.a;
        return new v090(this);
    }

    @Override // androidx.compose.ui.node.p
    public vlb0 getPointerIconService() {
        return this.N0;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final muw m418getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.e;
    }

    @Override // androidx.compose.ui.node.p
    public fif0 getRectManager() {
        return this.y;
    }

    @Override // androidx.compose.ui.node.p
    public reg0 getRetainedValuesStore() {
        return this.i;
    }

    @Override // androidx.compose.ui.node.p
    public LayoutNode getRoot() {
        return this.w;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        yeh0 yeh0Var;
        if (Build.VERSION.SDK_INT < 31 || (yeh0Var = this.L0) == null) {
            return false;
        }
        return ((Boolean) ((zak0) yeh0Var.a).getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.node.p
    public mgi0 getSemanticsOwner() {
        return this.z;
    }

    @Override // androidx.compose.ui.node.p
    public toy getSharedDrawScope() {
        return this.f;
    }

    @Override // androidx.compose.ui.node.p
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? tw2.a.a(this) : this.T;
    }

    @Override // androidx.compose.ui.node.p
    public t590 getSnapshotObserver() {
        return this.S;
    }

    @Override // androidx.compose.ui.node.p
    public nek0 getSoftwareKeyboardController() {
        iul iulVar = this.p0;
        if (iulVar != null) {
            return iulVar;
        }
        iul iulVar2 = new iul(getTextInputService());
        this.p0 = iulVar2;
        return iulVar2;
    }

    @Override // androidx.compose.ui.node.p
    public mio0 getTextInputService() {
        mio0 mio0Var = this.n0;
        if (mio0Var != null) {
            return mio0Var;
        }
        o62.a aVar = o62.a;
        nio0 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
        aVar.getClass();
        mio0 mio0Var2 = new mio0(legacyTextInputServiceAndroid);
        this.n0 = mio0Var2;
        return mio0Var2;
    }

    @Override // androidx.compose.ui.node.p
    public ymo0 getTextToolbar() {
        return this.w0;
    }

    public final q.a getUncaughtExceptionHandler$ui() {
        return null;
    }

    @Override // androidx.compose.ui.node.p
    public rut0 getViewConfiguration() {
        return this.u;
    }

    public final c getViewTreeOwners() {
        return (c) this.k0.getValue();
    }

    @Override // androidx.compose.ui.node.p
    public spx0 getWindowInfo() {
        return getComposeViewContext().s;
    }

    public final v22 get_autofillManager$ui() {
        return this.O;
    }

    @Override // androidx.compose.ui.node.p
    public final void h() {
        if (this.P) {
            ibk0 ibk0Var = getSnapshotObserver().a;
            m590 m590Var = m590.i;
            synchronized (ibk0Var.g) {
                try {
                    ci50<ibk0.a> ci50Var = ibk0Var.f;
                    int i2 = ci50Var.d;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        ibk0.a aVar = ci50Var.b[i4];
                        aVar.d(m590Var);
                        if (!aVar.f.g()) {
                            i3++;
                        } else if (i3 > 0) {
                            ibk0.a[] aVarArr = ci50Var.b;
                            aVarArr[i4 - i3] = aVarArr[i4];
                        }
                    }
                    int i5 = i2 - i3;
                    Arrays.fill(ci50Var.b, i5, i2, (Object) null);
                    ci50Var.d = i5;
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.P = false;
        }
        be2 be2Var = this.U;
        if (be2Var != null) {
            J(be2Var);
        }
        v22 v22Var = this.O;
        if (v22Var != null) {
            qg50 qg50Var = v22Var.i;
            if (qg50Var.d == 0 && v22Var.j) {
                v22Var.b.a.commit();
                v22Var.j = false;
            }
            if (qg50Var.d != 0) {
                v22Var.j = true;
            }
        }
        while (this.A0.g() && this.A0.d(0) != null) {
            int i6 = this.A0.b;
            for (int i7 = 0; i7 < i6; i7++) {
                gzs<s3q0> d2 = this.A0.d(i7);
                this.A0.r(i7, null);
                if (d2 != null) {
                    d2.invoke();
                }
            }
            this.A0.p(0, i6);
        }
    }

    @Override // androidx.compose.ui.node.p
    public final void i() {
        this.I = true;
    }

    @Override // androidx.compose.ui.node.p
    public final long j(long j2) {
        V();
        return en10.b(j2, this.e0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0() {
        boolean z;
        View view;
        float[] fArr;
        int i2;
        int[] iArr = this.c0;
        getLocationOnScreen(iArr);
        long j2 = this.b0;
        int i3 = (int) (j2 >> 32);
        int i4 = (int) (j2 & 4294967295L);
        int i5 = iArr[0];
        if (i3 != i5 || i4 != iArr[1] || this.g0 < 0) {
            this.b0 = (4294967295L & iArr[1]) | (i5 << 32);
            if (i3 != Integer.MAX_VALUE && i4 != Integer.MAX_VALUE) {
                ci50<LayoutNode> L = getRoot().L();
                LayoutNode[] layoutNodeArr = L.b;
                int i6 = L.d;
                for (int i7 = 0; i7 < i6; i7++) {
                    layoutNodeArr[i7].H.p.N0();
                }
                z = true;
                V();
                view = this.M0;
                if (view == null) {
                    view = getRootView();
                    this.M0 = view;
                }
                fif0 rectManager = getRectManager();
                long j3 = this.b0;
                long A = n34.A(this.i0);
                int width = view.getWidth();
                int height = view.getHeight();
                rectManager.getClass();
                fArr = this.e0;
                if (fArr.length >= 16) {
                    i2 = 0;
                } else {
                    i2 = (((fArr[0] == 1.0f && fArr[1] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[2] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[4] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[5] == 1.0f && fArr[6] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[8] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[9] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[13] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[14] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[15] == 1.0f) ? 1 : 0);
                }
                xro0 xro0Var = rectManager.c;
                if ((i2 & 2) != 0) {
                    fArr = null;
                }
                rectManager.f = !xro0Var.b(j3, A, fArr, width, height) || rectManager.f;
                this.a0.b(z);
                getRectManager().a();
            }
        }
        z = false;
        V();
        view = this.M0;
        if (view == null) {
        }
        fif0 rectManager2 = getRectManager();
        long j32 = this.b0;
        long A2 = n34.A(this.i0);
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        rectManager2.getClass();
        fArr = this.e0;
        if (fArr.length >= 16) {
        }
        xro0 xro0Var2 = rectManager2.c;
        if ((i2 & 2) != 0) {
        }
        rectManager2.f = !xro0Var2.b(j32, A2, fArr, width2, height2) || rectManager2.f;
        this.a0.b(z);
        getRectManager().a();
    }

    @Override // xsna.mzb0
    public final long k(long j2) {
        V();
        long b2 = en10.b(j2, this.e0);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.i0 >> 32)) + Float.intBitsToFloat((int) (b2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.i0 & 4294967295L)) + Float.intBitsToFloat((int) (b2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    @Override // androidx.compose.ui.node.p
    public final void l(LayoutNode layoutNode, boolean z) {
        this.a0.g(layoutNode, z);
    }

    @Override // androidx.compose.ui.node.p
    public final void m(LayoutNode layoutNode) {
        getLayoutNodes().k(layoutNode.c, layoutNode);
    }

    @Override // androidx.compose.ui.node.p
    public final void n(int i2, LayoutNode layoutNode) {
        getLayoutNodes().i(i2);
        getLayoutNodes().k(layoutNode.c, layoutNode);
    }

    @Override // androidx.compose.ui.node.p
    public final void o() {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        try {
            if (T0 == null) {
                Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                declaredMethod.setAccessible(true);
                T0 = declaredMethod;
            }
            Method method = T0;
            if (method != null) {
                method.invoke(viewTreeObserver, null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        reg0 reg0Var;
        Object obj;
        super.onAttachedToWindow();
        setAttached(true);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            setShowLayoutBounds(a.a());
        }
        this.v.onViewAttachedToWindow(this);
        int i3 = 0;
        if (i2 > 28) {
            if (S0 == null) {
                o52 o52Var = new o52(i3);
                S0 = o52Var;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (O0 == null) {
                        O0 = Class.forName("android.os.SystemProperties");
                    }
                    if (Q0 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class<?> cls = O0;
                        Q0 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = Q0;
                    if (method != null) {
                        method.invoke(null, o52Var);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            fh50<p52> fh50Var = R0;
            synchronized (fh50Var) {
                fh50Var.j(this);
                s3q0 s3q0Var = s3q0.a;
            }
        }
        if (!this.K0) {
            getComposeViewContext().c();
        }
        this.K0 = false;
        O(getRoot());
        N(getRoot());
        getSnapshotObserver().a.e();
        u22 u22Var = this.N;
        if (u22Var != null) {
            jo5 jo5Var = jo5.a;
            jo5Var.getClass();
            u22Var.c.registerCallback(jo5Var);
        }
        f5z f5zVar = getComposeViewContext().c;
        xyt0 xyt0Var = getComposeViewContext().e;
        l5z.a aVar = this.g;
        if (f5zVar == null || xyt0Var == null || aVar == null) {
            reg0Var = null;
        } else {
            vyt0 vyt0Var = new vyt0(xyt0Var.getViewModelStore(), new e0.d(), qbk.a.b);
            rfc a2 = fpf0.a(l5z.class);
            String h2 = a2.h();
            if (h2 == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            l5z l5zVar = (l5z) vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h2), a2);
            int id = ((View) getParent()).getId();
            pg50<fh50<l5z.b>> pg50Var = l5zVar.b;
            fh50<l5z.b> b2 = pg50Var.b(id);
            if (b2 == null) {
                b2 = new fh50<>(1);
                pg50Var.k(id, b2);
            }
            fh50<l5z.b> fh50Var2 = b2;
            Object[] objArr = fh50Var2.a;
            int i4 = fh50Var2.b;
            while (true) {
                if (i3 >= i4) {
                    obj = null;
                    break;
                }
                obj = objArr[i3];
                if (!((l5z.b) obj).c) {
                    break;
                } else {
                    i3++;
                }
            }
            l5z.b bVar = (l5z.b) obj;
            if (bVar == null) {
                bVar = new l5z.b();
                fh50Var2.j(bVar);
            }
            bVar.c = true;
            this.h = bVar;
            reg0Var = bVar.b;
        }
        if (reg0Var == null) {
            reg0Var = fdi.d;
        }
        this.i = reg0Var;
        izs<? super iri, s3q0> izsVar = this.l0;
        if (izsVar != null) {
            izsVar.invoke(getComposeViewContext());
            this.l0 = null;
        }
        Lifecycle lifecycle = getComposeViewContext().c.getLifecycle();
        lifecycle.addObserver(this);
        lifecycle.addObserver(this.B);
        ((zak0) this.u0.a).setValue(new m2x(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            l62.a.b(this);
        }
        v22 v22Var = this.O;
        if (v22Var != null) {
            getFocusOwner().p().j(v22Var);
            getSemanticsOwner().d.j(v22Var);
        }
        getFocusOwner().p().j(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        jui0<kb2> jui0Var = this.o0.get();
        kb2 kb2Var = jui0Var != null ? jui0Var.b : null;
        if (kb2Var == null) {
            return getLegacyTextInputServiceAndroid().d;
        }
        jui0<l2x> jui0Var2 = kb2Var.e.get();
        l2x l2xVar = jui0Var2 != null ? jui0Var2.b : null;
        return l2xVar != null && (l2xVar.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c0(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i2;
        int i3;
        int i4;
        jui0<kb2> jui0Var = this.o0.get();
        kb2 kb2Var = jui0Var != null ? jui0Var.b : null;
        if (kb2Var == null) {
            nio0 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
            if (legacyTextInputServiceAndroid.d) {
                rnw rnwVar = legacyTextInputServiceAndroid.h;
                tho0 tho0Var = legacyTextInputServiceAndroid.g;
                int i5 = rnwVar.e;
                boolean z = rnwVar.a;
                if (i5 != 1) {
                    if (i5 == 0) {
                        i2 = 1;
                    } else if (i5 == 2) {
                        i2 = 2;
                    } else if (i5 == 6) {
                        i2 = 5;
                    } else if (i5 == 5) {
                        i2 = 7;
                    } else if (i5 == 3) {
                        i2 = 3;
                    } else if (i5 == 4) {
                        i2 = 4;
                    } else {
                        if (i5 != 7) {
                            throw new IllegalStateException("invalid ImeAction");
                        }
                        i2 = 6;
                    }
                    editorInfo.imeOptions = i2;
                    i3 = rnwVar.d;
                    if (i3 == 1) {
                    }
                    if (!z) {
                    }
                    i4 = editorInfo.inputType;
                    if ((i4 & 1) == 1) {
                    }
                    long j2 = tho0Var.b;
                    int i6 = qko0.c;
                    editorInfo.initialSelStart = (int) (j2 >> 32);
                    editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
                    k4p.b(editorInfo, tho0Var.a.c);
                    editorInfo.imeOptions |= 33554432;
                    if (androidx.emoji2.text.c.d()) {
                    }
                    shf0 shf0Var = new shf0(legacyTextInputServiceAndroid.g, new vou(legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.h.c);
                    legacyTextInputServiceAndroid.i.add(new WeakReference(shf0Var));
                    return shf0Var;
                }
                if (!z) {
                    i2 = 0;
                    editorInfo.imeOptions = i2;
                    i3 = rnwVar.d;
                    if (i3 == 1) {
                        editorInfo.inputType = 1;
                    } else if (i3 == 2) {
                        editorInfo.inputType = 1;
                        editorInfo.imeOptions = Integer.MIN_VALUE | i2;
                    } else if (i3 == 3) {
                        editorInfo.inputType = 2;
                    } else if (i3 == 4) {
                        editorInfo.inputType = 3;
                    } else if (i3 == 5) {
                        editorInfo.inputType = 17;
                    } else if (i3 == 6) {
                        editorInfo.inputType = 33;
                    } else if (i3 == 7) {
                        editorInfo.inputType = 129;
                    } else if (i3 == 8) {
                        editorInfo.inputType = 18;
                    } else {
                        if (i3 != 9) {
                            throw new IllegalStateException("Invalid Keyboard Type");
                        }
                        editorInfo.inputType = 8194;
                    }
                    if (!z) {
                        int i7 = editorInfo.inputType;
                        if ((i7 & 1) == 1) {
                            editorInfo.inputType = i7 | 131072;
                            if (i5 == 1) {
                                editorInfo.imeOptions |= 1073741824;
                            }
                        }
                    }
                    i4 = editorInfo.inputType;
                    if ((i4 & 1) == 1) {
                        int i8 = rnwVar.b;
                        if (i8 == 1) {
                            editorInfo.inputType = i4 | 4096;
                        } else if (i8 == 2) {
                            editorInfo.inputType = i4 | 8192;
                        } else if (i8 == 3) {
                            editorInfo.inputType = i4 | 16384;
                        }
                        if (rnwVar.c) {
                            editorInfo.inputType |= 32768;
                        }
                    }
                    long j22 = tho0Var.b;
                    int i62 = qko0.c;
                    editorInfo.initialSelStart = (int) (j22 >> 32);
                    editorInfo.initialSelEnd = (int) (j22 & 4294967295L);
                    k4p.b(editorInfo, tho0Var.a.c);
                    editorInfo.imeOptions |= 33554432;
                    if (androidx.emoji2.text.c.d()) {
                        androidx.emoji2.text.c.a().i(editorInfo);
                    }
                    shf0 shf0Var2 = new shf0(legacyTextInputServiceAndroid.g, new vou(legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.h.c);
                    legacyTextInputServiceAndroid.i.add(new WeakReference(shf0Var2));
                    return shf0Var2;
                }
                i2 = 6;
                editorInfo.imeOptions = i2;
                i3 = rnwVar.d;
                if (i3 == 1) {
                }
                if (!z) {
                }
                i4 = editorInfo.inputType;
                if ((i4 & 1) == 1) {
                }
                long j222 = tho0Var.b;
                int i622 = qko0.c;
                editorInfo.initialSelStart = (int) (j222 >> 32);
                editorInfo.initialSelEnd = (int) (j222 & 4294967295L);
                k4p.b(editorInfo, tho0Var.a.c);
                editorInfo.imeOptions |= 33554432;
                if (androidx.emoji2.text.c.d()) {
                }
                shf0 shf0Var22 = new shf0(legacyTextInputServiceAndroid.g, new vou(legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.h.c);
                legacyTextInputServiceAndroid.i.add(new WeakReference(shf0Var22));
                return shf0Var22;
            }
        } else {
            jui0<l2x> jui0Var2 = kb2Var.e.get();
            l2x l2xVar = jui0Var2 != null ? jui0Var2.b : null;
            if (l2xVar != null) {
                synchronized (l2xVar.c) {
                    if (l2xVar.e) {
                        return null;
                    }
                    thf0 a2 = l2xVar.a.a(editorInfo);
                    k2x k2xVar = new k2x(l2xVar);
                    InputConnection an70Var = Build.VERSION.SDK_INT >= 34 ? new an70(a2, k2xVar) : new zm70(a2, k2xVar);
                    l2xVar.d.b(new ndx0(an70Var));
                    return an70Var;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        igi0 igi0Var;
        String b2;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        b72 b72Var = this.B;
        b72Var.getClass();
        for (long j2 : jArr) {
            lgi0 b3 = b72Var.d().b((int) j2);
            if (b3 != null && (igi0Var = b3.a) != null) {
                j72.b();
                ViewTranslationRequest.Builder c2 = i72.c(b72Var.b.getAutofillId(), igi0Var.f);
                List list = (List) zfi0.a(igi0Var.d, ngi0.C);
                if (list != null && (b2 = hgz.b(list, "\n", null, 62)) != null) {
                    forText = TranslationRequestValue.forText(new us2(b2));
                    c2.setValue("android:text", forText);
                    build = c2.build();
                    consumer.accept(build);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.v.onViewDetachedFromWindow(this);
        View view = this.m;
        if (P() && view != null) {
            removeView(view);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 28) {
            fh50<p52> fh50Var = R0;
            synchronized (fh50Var) {
                fh50Var.n(this);
                s3q0 s3q0Var = s3q0.a;
            }
        }
        getComposeViewContext().b();
        ibk0 ibk0Var = getSnapshotObserver().a;
        cak0 cak0Var = ibk0Var.h;
        if (cak0Var != null) {
            cak0Var.dispose();
        }
        ibk0Var.a();
        Lifecycle lifecycle = getComposeViewContext().c.getLifecycle();
        lifecycle.removeObserver(this.B);
        lifecycle.removeObserver(this);
        u22 u22Var = this.N;
        if (u22Var != null) {
            jo5 jo5Var = jo5.a;
            jo5Var.getClass();
            u22Var.c.unregisterCallback(jo5Var);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        l5z.b bVar = this.h;
        if (bVar != null) {
            bVar.c = false;
        }
        this.h = null;
        if (i2 >= 31) {
            l62.a.a(this);
        }
        v22 v22Var = this.O;
        if (v22Var != null) {
            getSemanticsOwner().d.n(v22Var);
            getFocusOwner().p().n(v22Var);
        }
        fif0 rectManager = getRectManager();
        rectManager.f = rectManager.c.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        fif0 rectManager2 = getRectManager();
        Object obj = rectManager2.h;
        if (obj != null) {
            rectManager2.a.X(obj);
            rectManager2.h = null;
        }
        getFocusOwner().p().n(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (z || hasFocus()) {
            return;
        }
        getFocusOwner().x();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.g0 = 0L;
        j0();
        int i2 = Build.VERSION.SDK_INT;
        if (32 > i2 || i2 >= 34) {
            return;
        }
        c0(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.g0 = 0L;
            this.a0.l(this.H0);
            this.V = null;
            j0();
            if (this.U != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i4 - i2, i5 - i3);
                    s3q0 s3q0Var = s3q0.a;
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
            s3q0 s3q0Var2 = s3q0.a;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        androidx.compose.ui.node.j jVar = this.a0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                O(getRoot());
            }
            long K = K(i2);
            long K2 = K(i3);
            long a2 = o6j.a.a((int) (K >>> 32), (int) (K & 4294967295L), (int) (K2 >>> 32), (int) (4294967295L & K2));
            o6j o6jVar = this.V;
            if (o6jVar == null) {
                this.V = new o6j(a2);
                this.W = false;
            } else if (!o6j.c(o6jVar.a, a2)) {
                this.W = true;
            }
            jVar.s(a2);
            jVar.n();
            setMeasuredDimension(getRoot().H.p.b, getRoot().H.p.c);
            if (this.U != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().H.p.b, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().H.p.c, 1073741824));
                    s3q0 s3q0Var = s3q0.a;
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
            s3q0 s3q0Var2 = s3q0.a;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        if (viewStructure != null) {
            v22 v22Var = this.O;
            if (v22Var != null) {
                LayoutNode layoutNode = v22Var.c.a;
                AutofillId autofillId = v22Var.h;
                String str = v22Var.f;
                fif0 fif0Var = v22Var.e;
                bwb0.a(viewStructure, layoutNode, autofillId, str, fif0Var);
                Object[] objArr = sp70.a;
                fh50 fh50Var = new fh50(2);
                fh50Var.j(layoutNode);
                fh50Var.j(viewStructure);
                while (fh50Var.g()) {
                    ViewStructure viewStructure2 = (ViewStructure) fh50Var.o(fh50Var.b - 1);
                    List<agi0> l2 = ((agi0) fh50Var.o(fh50Var.b - 1)).l();
                    int size = l2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        agi0 agi0Var = l2.get(i3);
                        if (!agi0Var.q() && agi0Var.e() && agi0Var.g()) {
                            xfi0 d2 = agi0Var.d();
                            if (d2 != null) {
                                ph50<sgi0<?>, Object> ph50Var = d2.b;
                                if (ph50Var.a(wfi0.g) || ph50Var.a(wfi0.h) || ph50Var.a(ngi0.r) || ph50Var.a(ngi0.s)) {
                                    ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    bwb0.a(newChild, agi0Var, autofillId, str, fif0Var);
                                    fh50Var.j(agi0Var);
                                    fh50Var.j(newChild);
                                }
                            }
                            fh50Var.j(agi0Var);
                            fh50Var.j(viewStructure2);
                        }
                    }
                }
            }
            u22 u22Var = this.N;
            if (u22Var != null) {
                no5 no5Var = u22Var.b;
                LinkedHashMap linkedHashMap = no5Var.a;
                LinkedHashMap linkedHashMap2 = no5Var.a;
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                Iterator it = linkedHashMap2.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    int intValue = ((Number) entry.getKey()).intValue();
                    mo5 mo5Var = (mo5) entry.getValue();
                    ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                    newChild2.setAutofillId(u22Var.d, intValue);
                    newChild2.setId(intValue, u22Var.a.getContext().getPackageName(), null, null);
                    newChild2.setAutofillType(1);
                    mo5Var.getClass();
                    throw null;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        ulb0 b2;
        int toolType = motionEvent.getToolType(i2);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (b2 = getPointerIconService().b()) == null)) {
            return super.onResolvePointerIcon(motionEvent, i2);
        }
        Context context = getContext();
        if (b2 instanceof lb2) {
            return null;
        }
        return b2 instanceof mb2 ? PointerIcon.getSystemIcon(context, ((mb2) b2).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // xsna.nhl
    public final void onResume(f5z f5zVar) {
        qq9 qq9Var;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(a.a());
        }
        l5z.b bVar = this.h;
        if (bVar != null) {
            l5z.a aVar = this.g;
            m0g0 m0g0Var = bVar.a;
            aj00 aj00Var = (aj00) m0g0Var.b;
            if (!aj00Var.b || aj00Var.d) {
                return;
            }
            try {
                qq9Var = aVar.a(new m5z(bVar));
            } catch (CancellationException unused) {
                aj00 aj00Var2 = (aj00) m0g0Var.b;
                if (!aj00Var2.c) {
                    if (aj00Var2.d) {
                        hxc0.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    aj00Var2.a();
                    aj00Var2.d = true;
                }
                qq9Var = null;
            }
            qq9 qq9Var2 = bVar.d;
            if (qq9Var2 != null) {
                qq9Var2.cancel();
            }
            bVar.d = qq9Var;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        if (this.d) {
            int[] iArr = svr.a;
            LayoutDirection layoutDirection = i2 != 0 ? i2 != 1 ? null : LayoutDirection.Rtl : LayoutDirection.Ltr;
            if (layoutDirection == null) {
                layoutDirection = LayoutDirection.Ltr;
            }
            setLayoutDirection(layoutDirection);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer<ScrollCaptureTarget> consumer) {
        yeh0 yeh0Var;
        if (Build.VERSION.SDK_INT < 31 || (yeh0Var = this.L0) == null) {
            return;
        }
        mgi0 semanticsOwner = getSemanticsOwner();
        kotlin.coroutines.d coroutineContext = getCoroutineContext();
        ci50 ci50Var = new ci50(new zeh0[16]);
        l370.H(semanticsOwner.a(), 0, new rg9(1, ci50Var, ci50.class, "add", "add(Ljava/lang/Object;)Z", 8, 1));
        Arrays.sort(ci50Var.b, 0, ci50Var.d, jw5.a(weh0.j, xeh0.i));
        int i2 = ci50Var.d;
        zeh0 zeh0Var = (zeh0) (i2 == 0 ? null : ci50Var.b[i2 - 1]);
        if (zeh0Var == null) {
            return;
        }
        l9x l9xVar = zeh0Var.c;
        kqi kqiVar = new kqi(zeh0Var.a, l9xVar, zvj.a(coroutineContext), yeh0Var, this);
        androidx.compose.ui.node.o oVar = zeh0Var.d;
        zhf0 z = jgz.p(oVar).z(oVar, true);
        long c2 = l9xVar.c();
        ScrollCaptureTarget a2 = veh0.a(this, zjq.m(d370.I(z)), new Point((int) (c2 >> 32), (int) (c2 & 4294967295L)), kqiVar);
        a2.setScrollBounds(zjq.m(l9xVar));
        consumer.accept(a2);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        j0();
    }

    @Override // xsna.nhl
    public final void onStop(f5z f5zVar) {
        l5z.b bVar = this.h;
        if (bVar != null) {
            aj00 aj00Var = (aj00) bVar.a.b;
            if (aj00Var.b && !aj00Var.d) {
                qq9 qq9Var = bVar.d;
                if (qq9Var != null) {
                    qq9Var.cancel();
                }
                bVar.d = null;
                return;
            }
            if (aj00Var.c) {
                return;
            }
            if (!aj00Var.d) {
                hxc0.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!aj00Var.e.f()) {
                hxc0.a("Attempted to start retaining exited values with pending exited values");
            }
            aj00Var.d = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        ((zak0) this.u0.a).setValue(new m2x(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray<ViewTranslationResponse> longSparseArray) {
        b72 b72Var = this.B;
        b72Var.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (epx.f(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            b72.b.a(b72Var, longSparseArray);
        } else {
            b72Var.b.post(new xsna.i(1, b72Var, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean a2;
        this.J0 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (a2 = a.a())) {
            return;
        }
        setShowLayoutBounds(a2);
        N(getRoot());
    }

    @Override // xsna.mzb0
    public final long p(long j2) {
        V();
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (this.i0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat((int) (this.i0 & 4294967295L));
        return en10.b((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), this.f0);
    }

    @Override // androidx.compose.ui.node.p
    public final void q(gzs<s3q0> gzsVar) {
        fh50<gzs<s3q0>> fh50Var = this.A0;
        if (fh50Var.b(gzsVar)) {
            return;
        }
        fh50Var.j(gzsVar);
    }

    @Override // xsna.uvr
    public final void r(cxr cxrVar, dxr dxrVar) {
        u470 u470Var;
        boolean z;
        u470 u470Var2;
        boolean z2;
        if (cxrVar != null) {
            if (!cxrVar.z().o) {
                uzw.b("visitAncestors called on an unattached node");
            }
            q630.c z3 = cxrVar.z();
            LayoutNode f2 = itl.f(cxrVar);
            qh50 qh50Var = null;
            ArrayList arrayList = null;
            while (f2 != null) {
                if ((f2.G.f.e & 2097152) != 0) {
                    while (z3 != null) {
                        if ((z3.d & 2097152) != 0) {
                            q630.c cVar = z3;
                            ci50 ci50Var = null;
                            while (cVar != null) {
                                if (cVar instanceof puw) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVar);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (cVar.d & 2097152) != 0 && (cVar instanceof ytl)) {
                                    int i2 = 0;
                                    for (q630.c cVar2 = ((ytl) cVar).q; cVar2 != null; cVar2 = cVar2.g) {
                                        if ((cVar2.d & 2097152) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVar = cVar2;
                                            } else {
                                                if (ci50Var == null) {
                                                    ci50Var = new ci50(new q630.c[16]);
                                                }
                                                if (cVar != null) {
                                                    ci50Var.b(cVar);
                                                    cVar = null;
                                                }
                                                ci50Var.b(cVar2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVar = itl.b(ci50Var);
                            }
                        }
                        z3 = z3.f;
                    }
                }
                f2 = f2.I();
                z3 = (f2 == null || (u470Var2 = f2.G) == null) ? null : u470Var2.e;
            }
            if (arrayList == null) {
                return;
            }
            if (dxrVar != null) {
                if (!dxrVar.b.o) {
                    uzw.b("visitAncestors called on an unattached node");
                }
                q630.c cVar3 = dxrVar.b;
                LayoutNode f3 = itl.f(dxrVar);
                qh50 qh50Var2 = null;
                while (f3 != null) {
                    if ((f3.G.f.e & 2097152) != 0) {
                        while (cVar3 != null) {
                            if ((cVar3.d & 2097152) != 0) {
                                q630.c cVar4 = cVar3;
                                ci50 ci50Var2 = null;
                                while (cVar4 != null) {
                                    if (cVar4 instanceof puw) {
                                        if (qh50Var2 == null) {
                                            qh50Var2 = k5h0.a();
                                        }
                                        qh50Var2.e(cVar4);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (cVar4.d & 2097152) != 0 && (cVar4 instanceof ytl)) {
                                        int i3 = 0;
                                        for (q630.c cVar5 = ((ytl) cVar4).q; cVar5 != null; cVar5 = cVar5.g) {
                                            if ((cVar5.d & 2097152) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    cVar4 = cVar5;
                                                } else {
                                                    if (ci50Var2 == null) {
                                                        ci50Var2 = new ci50(new q630.c[16]);
                                                    }
                                                    if (cVar4 != null) {
                                                        ci50Var2.b(cVar4);
                                                        cVar4 = null;
                                                    }
                                                    ci50Var2.b(cVar5);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    cVar4 = itl.b(ci50Var2);
                                }
                            }
                            cVar3 = cVar3.f;
                        }
                    }
                    f3 = f3.I();
                    cVar3 = (f3 == null || (u470Var = f3.G) == null) ? null : u470Var.e;
                }
                qh50Var = qh50Var2;
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                puw puwVar = (puw) arrayList.get(i4);
                if (!(qh50Var != null ? qh50Var.a(puwVar) : false)) {
                    puwVar.J0();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, Rect rect) {
        if (!isFocused()) {
            ivr d2 = svr.d(i2);
            int i3 = d2 != null ? d2.a : 7;
            Boolean s = getFocusOwner().s(i3, rect != null ? new zhf0(rect.left, rect.top, rect.right, rect.bottom) : null, new s52(i3));
            Boolean bool = Boolean.TRUE;
            if (!epx.f(s, bool) && !epx.f(getFocusOwner().s(i3, null, new t52(i3)), bool)) {
                if (!hasFocus()) {
                    return false;
                }
                if (i3 == 1 || i3 == 2) {
                    return getFocusOwner().e(i3);
                }
                return false;
            }
        }
        return true;
    }

    @Override // androidx.compose.ui.node.p
    public final void s(float f2) {
        if (P()) {
            if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (Float.isNaN(this.B0) || f2 > this.B0) {
                    this.B0 = f2;
                    return;
                }
                return;
            }
            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (Float.isNaN(this.C0) || f2 < this.C0) {
                    this.C0 = f2;
                }
            }
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j2) {
        this.A.f = j2;
    }

    public final void setComposeViewContext(iri iriVar) {
        if (getCoroutineContext() != iriVar.b.k() && !((ci50.a) getRoot().B()).isEmpty()) {
            uzw.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        dak0 a2 = dak0.a.a();
        izs<Object, s3q0> e2 = a2 != null ? a2.e() : null;
        dak0 b2 = dak0.a.b(a2);
        try {
            iri iriVar2 = get_composeViewContext();
            dak0.a.d(a2, b2, e2);
            if (iriVar.equals(iriVar2)) {
                return;
            }
            if (isAttachedToWindow()) {
                iriVar2.b();
                iriVar.c();
            }
            set_composeViewContext(iriVar);
            setCoroutineContext(iriVar.b.k());
        } catch (Throwable th) {
            dak0.a.d(a2, b2, e2);
            throw th;
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.K0 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        ((zak0) this.L).setValue(configuration);
    }

    public final void setContentCaptureManager$ui(b72 b72Var) {
        this.B = b72Var;
    }

    public void setCoroutineContext(kotlin.coroutines.d dVar) {
        this.o = dVar;
    }

    public final void setFrameEndScheduler$ui(l5z.a aVar) {
        this.g = aVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j2) {
        this.g0 = j2;
    }

    public final void setOnReadyForComposition(izs<? super iri, s3q0> izsVar) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.K0) {
            izsVar.invoke(getComposeViewContext());
        } else {
            this.l0 = izsVar;
        }
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m419setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(muw muwVar) {
        this.e = muwVar;
    }

    @Override // androidx.compose.ui.node.p
    public void setShowLayoutBounds(boolean z) {
        this.T = z;
    }

    public void setUncaughtExceptionHandler(q.a aVar) {
        this.a0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // xsna.s090
    public final void t(yoy yoyVar) {
        sk3<gzs<s3q0>> sk3Var = this.j;
        boolean isEmpty = sk3Var.isEmpty();
        sk3Var.addLast(yoyVar);
        if (isEmpty) {
            Handler handler = getHandler();
            if (handler == null) {
                throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
            handler.postAtFrontOfQueue(this.k);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.ui.node.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineSingletons u(wzs wzsVar, ContinuationImpl continuationImpl) {
        v52 v52Var;
        int i2;
        if (continuationImpl instanceof v52) {
            v52Var = (v52) continuationImpl;
            int i3 = v52Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v52Var.label = i3 - Integer.MIN_VALUE;
                Object obj = v52Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = v52Var.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    w52 w52Var = new w52(this);
                    v52Var.label = 1;
                    if (zvj.d(new kui0(w52Var, this.o0, wzsVar, null), v52Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                throw new KotlinNothingValueException();
            }
        }
        v52Var = new v52(this, continuationImpl);
        Object obj2 = v52Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = v52Var.label;
        if (i2 != 0) {
        }
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.node.p
    public final void v() {
        y52 y52Var = this.A;
        y52Var.w = true;
        Handler handler = y52Var.h;
        if (y52Var.l() && !y52Var.H && handler != null) {
            y52Var.H = true;
            handler.post(y52Var.J);
        }
        b72 b72Var = this.B;
        b72Var.h = true;
        Handler handler2 = b72Var.j;
        if (!b72Var.e() || b72Var.o || handler2 == null) {
            return;
        }
        b72Var.o = true;
        handler2.post(b72Var.p);
    }

    @Override // androidx.compose.ui.node.p
    public final void w(LayoutNode layoutNode, long j2) {
        androidx.compose.ui.node.j jVar = this.a0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            jVar.m(layoutNode, j2);
            if (!jVar.b.c()) {
                jVar.b(false);
                getRectManager().a();
                if (this.I) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.I = false;
                }
            }
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.p
    public final void x(LayoutNode layoutNode, boolean z, boolean z2, boolean z3) {
        LayoutNode I;
        LayoutNode I2;
        androidx.compose.ui.node.j jVar = this.a0;
        if (!z) {
            if (jVar.r(layoutNode, z2) && z3) {
                Z(layoutNode);
                return;
            }
            return;
        }
        a1m a1mVar = jVar.b;
        LayoutNode layoutNode2 = layoutNode.i;
        androidx.compose.ui.node.e eVar = layoutNode.H;
        if (layoutNode2 == null) {
            uzw.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i2 = j.b.$EnumSwitchMapping$0[eVar.d.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3 || i2 == 4) {
                jVar.h.b(new j.a(layoutNode, true, z2));
                return;
            }
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (!eVar.e || z2) {
                eVar.e = true;
                eVar.p.w = true;
                if (layoutNode.R) {
                    return;
                }
                if ((epx.f(layoutNode.T(), Boolean.TRUE) || androidx.compose.ui.node.j.i(layoutNode)) && ((I = layoutNode.I()) == null || !I.H.e)) {
                    a1mVar.a(layoutNode, Invalidation.LookaheadMeasurement);
                } else if ((layoutNode.g() || androidx.compose.ui.node.j.j(layoutNode)) && ((I2 = layoutNode.I()) == null || !I2.E())) {
                    a1mVar.a(layoutNode, Invalidation.Measurement);
                }
                if (jVar.d || !z3) {
                    return;
                }
                Z(layoutNode);
            }
        }
    }

    @Override // androidx.compose.ui.node.p
    public final void y(LayoutNode layoutNode, boolean z, boolean z2) {
        androidx.compose.ui.node.e eVar = layoutNode.H;
        androidx.compose.ui.node.j jVar = this.a0;
        if (!z) {
            jVar.getClass();
            int i2 = j.b.$EnumSwitchMapping$0[eVar.d.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                return;
            }
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            LayoutNode I = layoutNode.I();
            boolean z3 = I == null || I.g();
            if (!z2) {
                if (layoutNode.E()) {
                    return;
                }
                if (layoutNode.D() && layoutNode.g() == z3 && layoutNode.g() == eVar.p.v) {
                    return;
                }
            }
            androidx.compose.ui.node.k kVar = eVar.p;
            kVar.x = true;
            kVar.y = true;
            if (!layoutNode.R && kVar.v && z3) {
                if ((I == null || !I.D()) && (I == null || !I.E())) {
                    jVar.b.a(layoutNode, Invalidation.Placement);
                }
                if (jVar.d) {
                    return;
                }
                Z(null);
                return;
            }
            return;
        }
        a1m a1mVar = jVar.b;
        int i3 = j.b.$EnumSwitchMapping$0[eVar.d.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    return;
                }
                if (i3 != 4 && i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if ((eVar.e || eVar.f) && !z2) {
                return;
            }
            eVar.f = true;
            eVar.g = true;
            androidx.compose.ui.node.k kVar2 = eVar.p;
            kVar2.x = true;
            kVar2.y = true;
            if (layoutNode.R) {
                return;
            }
            LayoutNode I2 = layoutNode.I();
            if (epx.f(layoutNode.T(), Boolean.TRUE) && ((I2 == null || !I2.H.e) && (I2 == null || !I2.H.f))) {
                a1mVar.a(layoutNode, Invalidation.LookaheadPlacement);
            } else if (layoutNode.g() && ((I2 == null || !I2.D()) && (I2 == null || !I2.E()))) {
                a1mVar.a(layoutNode, Invalidation.Placement);
            }
            if (jVar.d) {
                return;
            }
            Z(null);
        }
    }

    @Override // androidx.compose.ui.node.p
    public final void z(LayoutNode layoutNode) {
        y52 y52Var = this.A;
        y52Var.w = true;
        if (y52Var.l()) {
            y52Var.m(layoutNode);
        }
        b72 b72Var = this.B;
        b72Var.h = true;
        if (b72Var.e()) {
            b72Var.i.f(s3q0.a);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i2, layoutParams, true);
    }

    @Override // androidx.compose.ui.node.p
    public p12 getAccessibilityManager() {
        return this.C;
    }

    @Override // androidx.compose.ui.node.p
    public h52 getClipboard() {
        return this.R;
    }

    @Override // androidx.compose.ui.node.p
    public i52 getClipboardManager() {
        return this.Q;
    }

    @Override // androidx.compose.ui.node.p
    public b82 getDragAndDropManager() {
        return this.p;
    }

    public pg50<LayoutNode> getLayoutNodes() {
        return this.x;
    }

    @Override // androidx.compose.ui.node.p
    public p52 getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, int i3) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i2;
        generateDefaultLayoutParams.height = i3;
        s3q0 s3q0Var = s3q0.a;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i2, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @ozl
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m417getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @ozl
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public androidx.compose.ui.node.q getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    /* compiled from: AndroidComposeView.android.kt */
    public final class b extends q630.c implements kc8, fgi0, rmg0, ndy, noy, npp0 {
        public int p = -1;
        public final c q = new c();

        /* compiled from: AndroidComposeView.android.kt */
        public static final class a extends Lambda implements izs<tra0.a, s3q0> {
            final /* synthetic */ tra0 $placeable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(tra0 tra0Var) {
                super(1);
                this.$placeable = tra0Var;
            }

            @Override // xsna.izs
            public final s3q0 invoke(tra0.a aVar) {
                aVar.q(this.$placeable, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            }
        }

        /* compiled from: AndroidComposeView.android.kt */
        /* renamed from: xsna.p52$b$b, reason: collision with other inner class name */
        public static final class C3492b extends Lambda implements izs<dxr, Boolean> {
            final /* synthetic */ ivr $focusDirection;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3492b(ivr ivrVar) {
                super(1);
                this.$focusDirection = ivrVar;
            }

            @Override // xsna.izs
            public final Boolean invoke(dxr dxrVar) {
                return Boolean.valueOf(dxrVar.v1(this.$focusDirection.a));
            }
        }

        /* compiled from: AndroidComposeView.android.kt */
        public static final class c extends Lambda implements izs<srg0, s3q0> {
            public c() {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.izs
            public final s3q0 invoke(srg0 srg0Var) {
                srg0 srg0Var2 = srg0Var;
                b bVar = b.this;
                bVar.p = ((wak0) p52.this.getInsetsListener().h).getIntValue();
                b bVar2 = b.this;
                int i = bVar2.p;
                p52 p52Var = p52.this;
                if (i > 0) {
                    pg50 pg50Var = brx0.a;
                    long a = srg0Var2.g1().a();
                    ph50 ph50Var = p52Var.getInsetsListener().g;
                    int i2 = (int) (a >> 32);
                    int i3 = (int) (a & 4294967295L);
                    for (zqx0 zqx0Var : brx0.b) {
                        bsx0 bsx0Var = (bsx0) ph50Var.d(zqx0Var);
                        brx0.a(srg0Var2, zqx0Var.a(), bsx0Var.h, i2, i3);
                        if (((Boolean) ((zak0) bsx0Var.b).getValue()).booleanValue()) {
                            brx0.a(srg0Var2, bsx0Var.f, bsx0Var.j, i2, i3);
                            brx0.a(srg0Var2, bsx0Var.g, bsx0Var.k, i2, i3);
                        }
                        brx0.a(srg0Var2, zqx0Var.b(), bsx0Var.i, i2, i3);
                    }
                    fh50<wh50<Rect>> fh50Var = p52Var.getInsetsListener().i;
                    if (fh50Var.g()) {
                        SnapshotStateList<iif0> snapshotStateList = p52Var.getInsetsListener().j;
                        Object[] objArr = fh50Var.a;
                        int i4 = fh50Var.b;
                        for (int i5 = 0; i5 < i4; i5++) {
                            wh50 wh50Var = (wh50) objArr[i5];
                            iif0 iif0Var = snapshotStateList.get(i5);
                            Rect rect = (Rect) wh50Var.getValue();
                            srg0Var2.e1(iif0Var.getLeft(), rect.left);
                            srg0Var2.e1(iif0Var.getTop(), rect.top);
                            srg0Var2.e1(iif0Var.getRight(), rect.right);
                            srg0Var2.e1(iif0Var.getBottom(), rect.bottom);
                        }
                    }
                }
                return s3q0.a;
            }
        }

        public b() {
        }

        @Override // xsna.ndy
        public final boolean J1(KeyEvent keyEvent) {
            ivr ivrVar;
            int[] iArr = svr.a;
            long u = zq70.u(keyEvent);
            boolean z = true;
            if (bdy.a(u, bdy.b)) {
                ivrVar = new ivr(2);
            } else if (bdy.a(u, bdy.c)) {
                ivrVar = new ivr(1);
            } else if (bdy.a(u, bdy.p)) {
                ivrVar = new ivr(keyEvent.isShiftPressed() ? 2 : 1);
            } else {
                ivrVar = bdy.a(u, bdy.g) ? new ivr(4) : bdy.a(u, bdy.f) ? new ivr(3) : (bdy.a(u, bdy.d) || bdy.a(u, bdy.C)) ? new ivr(5) : (bdy.a(u, bdy.e) || bdy.a(u, bdy.D)) ? new ivr(6) : (bdy.a(u, bdy.h) || bdy.a(u, bdy.r) || bdy.a(u, bdy.E)) ? new ivr(7) : (bdy.a(u, bdy.a) || bdy.a(u, bdy.u)) ? new ivr(8) : null;
            }
            if (ivrVar != null) {
                int i = ivrVar.a;
                if (zq70.w(keyEvent) == 2) {
                    p52 p52Var = p52.this;
                    dxr b = p52Var.getFocusOwner().b();
                    if (b == null || !b.p || !p52Var.T(i)) {
                        Boolean s = p52Var.getFocusOwner().s(i, p52Var.getEmbeddedViewFocusRect(), new C3492b(ivrVar));
                        if (!(s != null ? s.booleanValue() : true)) {
                            if (i != 1 && i != 2) {
                                z = false;
                            }
                            if (z) {
                                Integer c2 = svr.c(i);
                                View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) p52Var.getRootView(), p52Var.getView(), c2 != null ? c2.intValue() : 2);
                                if (findNextFocus == null || findNextFocus.equals(p52Var)) {
                                    return p52Var.getFocusOwner().e(i);
                                }
                            }
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // xsna.kc8
        public final Object S(androidx.compose.ui.node.o oVar, lc8 lc8Var, ContinuationImpl continuationImpl) {
            long D = oVar.D(0L);
            zhf0 zhf0Var = (zhf0) lc8Var.invoke();
            zhf0 j = zhf0Var != null ? zhf0Var.j(D) : null;
            if (j != null) {
                p52.this.requestRectangleOnScreen(zjq.n(j), false);
            }
            return s3q0.a;
        }

        @Override // xsna.ndy
        public final boolean T(KeyEvent keyEvent) {
            return false;
        }

        @Override // xsna.noy
        public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
            tra0 N = zo10Var.N(j);
            return ep10Var.F1(N.b, N.c, jgp.b, this.q, new a(N));
        }

        @Override // xsna.npp0
        public final Object g0() {
            return "androidx.compose.ui.layout.WindowInsetsRulers";
        }

        @Override // xsna.fgi0
        public final void l1(tgi0 tgi0Var) {
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(q.a aVar) {
    }
}
