package androidx.compose.ui.layout;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.view.ViewCompat$Api21Impl;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.bi91;
import defpackage.bmm0;
import defpackage.bx60;
import defpackage.bzj;
import defpackage.cji0;
import defpackage.dji0;
import defpackage.hz40;
import defpackage.iz40;
import defpackage.jl40;
import defpackage.k851;
import defpackage.n751;
import defpackage.oz40;
import defpackage.q2t0;
import defpackage.q651;
import defpackage.t651;
import defpackage.u1w;
import defpackage.u651;
import defpackage.u751;
import defpackage.udq0;
import defpackage.wx40;
import defpackage.xy40;
import defpackage.yx40;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u0017J\u001f\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b)\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R#\u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\t058\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010<\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R#\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0A0@8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020H0G8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006M"}, d2 = {"Landroidx/compose/ui/layout/InsetsListener;", "Landroidx/core/view/e;", "Ljava/lang/Runnable;", "Lbx60;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "composeView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Lk851;", "insetsValue", "Lu651;", "animation", "Lzy11;", "updateInsetAnimationInfo", "(Lk851;Lu651;)V", "stopAnimationForRuler", "(Lk851;)V", "Ln751;", "insets", "updateInsets", "(Ln751;)V", "onPrepare", "(Lu651;)V", "Lq651;", "bounds", "onStart", "(Lu651;Lq651;)Lq651;", "", "runningAnimations", "onProgress", "(Ln751;Ljava/util/List;)Ln751;", "onEnd", "Landroid/view/View;", "view", "onApplyWindowInsets", "(Landroid/view/View;Ln751;)Ln751;", "run", "()V", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Landroidx/compose/ui/platform/AndroidComposeView;", "getComposeView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "", "prepared", "Z", "", "runningAnimationMask", CA20Status.STATUS_USER_I, "savedInsets", "Ln751;", "Lbmm0;", "", "insetsValues", "Lbmm0;", "getInsetsValues", "()Lbmm0;", "Lyx40;", "generation", "Lyx40;", "getGeneration", "()Lyx40;", "Lxy40;", "Loz40;", "Landroid/graphics/Rect;", "displayCutouts", "Lxy40;", "getDisplayCutouts", "()Lxy40;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcji0;", "displayCutoutRulers", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getDisplayCutoutRulers", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InsetsListener extends androidx.core.view.e implements Runnable, bx60, View.OnAttachStateChangeListener {
    public static final int $stable = 8;
    private final AndroidComposeView composeView;
    private final SnapshotStateList<cji0> displayCutoutRulers;
    private final xy40 displayCutouts;
    private final yx40 generation;
    private final bmm0 insetsValues;
    private boolean prepared;
    private int runningAnimationMask;
    private n751 savedInsets;

    public InsetsListener(AndroidComposeView androidComposeView) {
        super(1);
        this.composeView = androidComposeView;
        hz40 hz40Var = new hz40(9);
        v.a.getClass();
        hz40Var.o(u751.b, new k851("caption bar"));
        hz40Var.o(u751.c, new k851("display cutout"));
        hz40Var.o(u751.d, new k851("ime"));
        hz40Var.o(u751.e, new k851("mandatory system gestures"));
        hz40Var.o(u751.f, new k851("navigation bars"));
        hz40Var.o(u751.g, new k851("status bars"));
        hz40Var.o(u751.h, new k851("system gestures"));
        hz40Var.o(u751.i, new k851("tappable element"));
        hz40Var.o(u751.j, new k851("waterfall"));
        this.insetsValues = hz40Var;
        this.generation = androidx.compose.runtime.f.g(0);
        this.displayCutouts = new xy40(4);
        this.displayCutoutRulers = new SnapshotStateList<>();
    }

    private final void stopAnimationForRuler(k851 insetsValue) {
        insetsValue.b.setValue(Boolean.FALSE);
        insetsValue.j = -1L;
        insetsValue.k = -1L;
    }

    private final void updateInsetAnimationInfo(k851 insetsValue, u651 animation) {
        insetsValue.c.setFloatValue(animation.a.c());
        t651 t651Var = animation.a;
        insetsValue.e.setFloatValue(t651Var.a());
        insetsValue.d.setLongValue(t651Var.b());
    }

    private final void updateInsets(n751 insets) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j2;
        int i;
        wx40 wx40Var = x.a;
        int[] iArr3 = wx40Var.b;
        Object[] objArr3 = wx40Var.c;
        long[] jArr3 = wx40Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = HexString.CHAR_SPACE;
            while (true) {
                long j3 = jArr3[i2];
                z = true;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = MoneyInputEditView.DEFAULT_VALUE;
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            v vVar = (v) objArr3[i6];
                            u1w g = insets.a.g(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j4 = (g.a << 48) | (g.b << 32) | (g.c << 16) | g.d;
                            k851 k851Var = (k851) this.insetsValues.d(vVar);
                            j2 = j3;
                            if (!udq0.n(j4, k851Var.h)) {
                                k851Var.h = j4;
                                z2 = true;
                                if (!udq0.n(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                u1w h = insets.a.h(i7);
                                objArr2 = objArr3;
                                long j5 = (h.b << 32) | (h.a << 48) | (h.c << 16) | h.d;
                                if (!udq0.n(k851Var.i, j5)) {
                                    k851Var.i = j5;
                                    z2 = true;
                                    if (!udq0.n(j5, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            k851Var.a.setValue(Boolean.valueOf(insets.a.q(i7)));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j2 = j3;
                            i = i3;
                        }
                        j3 = j2 >> i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c3 = MoneyInputEditView.DEFAULT_VALUE;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c = 16;
            c2 = HexString.CHAR_SPACE;
            z = true;
            c3 = MoneyInputEditView.DEFAULT_VALUE;
            z2 = false;
            z3 = false;
        }
        bzj f = insets.a.f();
        if (f == null) {
            j = 0;
        } else {
            u1w a = f.a();
            j = (a.a << c3) | (a.b << c2) | (a.c << c) | a.d;
        }
        bmm0 bmm0Var = this.insetsValues;
        v.a.getClass();
        k851 k851Var2 = (k851) bmm0Var.d(u751.j);
        k851Var2.a.setValue(Boolean.valueOf(!udq0.n(j, 0L)));
        if (!udq0.n(k851Var2.h, j)) {
            k851Var2.h = j;
            k851Var2.i = j;
            z2 = z;
            if (!udq0.n(j, 0L)) {
                z3 = z2;
            }
        }
        if (f == null) {
            xy40 xy40Var = this.displayCutouts;
            if (xy40Var.b > 0) {
                xy40Var.j();
                this.displayCutoutRulers.clear();
                z2 = z;
            }
        } else {
            List a2 = bi91.a(f.a);
            int size = a2.size();
            xy40 xy40Var2 = this.displayCutouts;
            if (size < xy40Var2.b) {
                xy40Var2.n(a2.size(), this.displayCutouts.b);
                this.displayCutoutRulers.removeRange(a2.size(), this.displayCutoutRulers.size());
                z2 = z;
            } else {
                int size2 = a2.size() - this.displayCutouts.b;
                int i8 = 0;
                while (i8 < size2) {
                    xy40 xy40Var3 = this.displayCutouts;
                    xy40Var3.g(androidx.compose.runtime.f.j(a2.get(xy40Var3.b)));
                    this.displayCutoutRulers.add(new dji0("display cutout rect " + this.displayCutouts.b));
                    i8++;
                    z2 = z;
                }
            }
            List list = a2;
            int size3 = list.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) a2.get(i9);
                oz40 oz40Var = (oz40) this.displayCutouts.b(i9);
                if (!jl40.l(oz40Var.getValue(), rect)) {
                    oz40Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!list.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.generation.getIntValue() != 0) && z2) {
            yx40 yx40Var = this.generation;
            yx40Var.setIntValue(yx40Var.getIntValue() + 1);
            synchronized (q2t0.c) {
                iz40 iz40Var = q2t0.j.h;
                if (iz40Var != null) {
                    boolean z5 = z;
                    z4 = iz40Var.h() == z5 ? z5 : false;
                }
            }
            if (z4) {
                q2t0.a();
            }
        }
    }

    public final AndroidComposeView getComposeView() {
        return this.composeView;
    }

    public final SnapshotStateList<cji0> getDisplayCutoutRulers() {
        return this.displayCutoutRulers;
    }

    public final xy40 getDisplayCutouts() {
        return this.displayCutouts;
    }

    public final yx40 getGeneration() {
        return this.generation;
    }

    public final bmm0 getInsetsValues() {
        return this.insetsValues;
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 insets) {
        if (this.prepared) {
            this.savedInsets = insets;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return insets;
            }
        } else if (this.runningAnimationMask == 0) {
            updateInsets(insets);
        }
        return insets;
    }

    @Override // androidx.core.view.e
    public void onEnd(u651 animation) {
        boolean z = false;
        this.prepared = false;
        int d = animation.a.d();
        this.runningAnimationMask &= ~d;
        this.savedInsets = null;
        v vVar = (v) x.a.b(d);
        if (vVar != null) {
            k851 k851Var = (k851) this.insetsValues.d(vVar);
            k851Var.c.setFloatValue(0.0f);
            k851Var.e.setFloatValue(1.0f);
            k851Var.d.setLongValue(0L);
            k851Var.c.setFloatValue(0.0f);
            stopAnimationForRuler(k851Var);
            yx40 yx40Var = this.generation;
            yx40Var.setIntValue(yx40Var.getIntValue() + 1);
            synchronized (q2t0.c) {
                iz40 iz40Var = q2t0.j.h;
                if (iz40Var != null) {
                    if (iz40Var.h()) {
                        z = true;
                    }
                }
            }
            if (z) {
                q2t0.a();
            }
        }
    }

    @Override // androidx.core.view.e
    public void onPrepare(u651 animation) {
        this.prepared = true;
    }

    @Override // androidx.core.view.e
    public n751 onProgress(n751 insets, List<u651> runningAnimations) {
        int size = runningAnimations.size();
        for (int i = 0; i < size; i++) {
            u651 u651Var = runningAnimations.get(i);
            v vVar = (v) x.a.b(u651Var.a.d());
            if (vVar != null) {
                k851 k851Var = (k851) this.insetsValues.d(vVar);
                if (((Boolean) k851Var.b.getValue()).booleanValue()) {
                    updateInsetAnimationInfo(k851Var, u651Var);
                }
            }
        }
        updateInsets(insets);
        return insets;
    }

    @Override // androidx.core.view.e
    public q651 onStart(u651 animation, q651 bounds) {
        n751 n751Var = this.savedInsets;
        boolean z = false;
        this.prepared = false;
        this.savedInsets = null;
        if (animation.a.b() > 0 && n751Var != null) {
            int d = animation.a.d();
            this.runningAnimationMask |= d;
            v vVar = (v) x.a.b(d);
            if (vVar != null) {
                k851 k851Var = (k851) this.insetsValues.d(vVar);
                u1w g = n751Var.a.g(d);
                long j = (g.a << 48) | (g.b << 32) | (g.c << 16) | g.d;
                long j2 = k851Var.h;
                if (!udq0.n(j, j2)) {
                    k851Var.j = j2;
                    k851Var.k = j;
                    k851Var.b.setValue(Boolean.TRUE);
                    updateInsetAnimationInfo(k851Var, animation);
                    yx40 yx40Var = this.generation;
                    yx40Var.setIntValue(yx40Var.getIntValue() + 1);
                    synchronized (q2t0.c) {
                        iz40 iz40Var = q2t0.j.h;
                        if (iz40Var != null) {
                            if (iz40Var.h()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        q2t0.a();
                        return bounds;
                    }
                }
            }
        }
        return bounds;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(view, this);
        androidx.core.view.b.u(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(view, null);
        androidx.core.view.b.u(view, null);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prepared) {
            this.runningAnimationMask = 0;
            this.prepared = false;
            n751 n751Var = this.savedInsets;
            if (n751Var != null) {
                updateInsets(n751Var);
                this.savedInsets = null;
            }
        }
    }
}
