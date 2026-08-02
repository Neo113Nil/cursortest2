package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.transition.Transition;
import defpackage.nwt0;
import defpackage.ny61;
import defpackage.owt0;
import defpackage.rnz;
import defpackage.sor;
import defpackage.w4n;
import defpackage.w53;
import defpackage.x4n;
import defpackage.y4n;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes.dex */
public abstract class Transition implements Cloneable {
    public static final Animator[] d0 = new Animator[0];
    public static final int[] e0 = {2, 1, 3, 4};
    public static final PathMotion f0 = new AnonymousClass1();
    public static final ThreadLocal g0 = new ThreadLocal();
    public ArrayList K;
    public ArrayList L;
    public TransitionListener[] M;
    public TransitionPropagation V;
    public EpicenterCallback W;
    public long a0;
    public SeekController b0;
    public long c0;
    public final String a = getClass().getName();
    public long b = -1;
    public long c = -1;
    public TimeInterpolator w = null;
    public final ArrayList x = new ArrayList();
    public final ArrayList y = new ArrayList();
    public ArrayList z = null;
    public ArrayList A = null;
    public ArrayList B = null;
    public ArrayList C = null;
    public ArrayList D = null;
    public ArrayList E = null;
    public ArrayList F = null;
    public TransitionValuesMaps G = new TransitionValuesMaps();
    public TransitionValuesMaps H = new TransitionValuesMaps();
    public TransitionSet I = null;
    public final int[] J = e0;
    public final ArrayList N = new ArrayList();
    public Animator[] O = d0;
    public int P = 0;
    public boolean Q = false;
    public boolean R = false;
    public Transition S = null;
    public ArrayList T = null;
    public ArrayList U = new ArrayList();
    public PathMotion Z = f0;

    /* renamed from: androidx.transition.Transition$1, reason: invalid class name */
    /* loaded from: classes10.dex */
    public class AnonymousClass1 extends PathMotion {
        @Override // androidx.transition.PathMotion
        public final Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* loaded from: classes10.dex */
    public static class AnimationInfo {
        public View a;
        public String b;
        public TransitionValues c;
        public WindowId d;
        public Transition e;
        public Animator f;
    }

    public static class ArrayListManager {
        public static ArrayList a(ArrayList arrayList, Object obj) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
            return arrayList;
        }
    }

    /* loaded from: classes10.dex */
    public static abstract class EpicenterCallback {
        public abstract Rect a();
    }

    /* loaded from: classes10.dex */
    public static class Impl26 {
        public static long a(Animator animator) {
            return animator.getTotalDuration();
        }

        public static void b(Animator animator, long j) {
            ((AnimatorSet) animator).setCurrentPlayTime(j);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes10.dex */
    public @interface MatchOrder {
    }

    /* loaded from: classes10.dex */
    public class SeekController extends TransitionListenerAdapter implements TransitionSeekController, x4n {
        public final /* synthetic */ TransitionSet A;
        public boolean b;
        public boolean c;
        public nwt0 x;
        public final VelocityTracker1D y;
        public Runnable z;
        public long a = -1;
        public int w = 0;

        public SeekController(TransitionSet transitionSet) {
            this.A = transitionSet;
            VelocityTracker1D velocityTracker1D = new VelocityTracker1D();
            long[] jArr = new long[20];
            velocityTracker1D.a = jArr;
            velocityTracker1D.b = new float[20];
            velocityTracker1D.c = 0;
            Arrays.fill(jArr, Long.MIN_VALUE);
            this.y = velocityTracker1D;
        }

        @Override // androidx.transition.TransitionSeekController
        public final void a() {
            if (this.b) {
                e();
                this.x.i(this.A.a0 + 1);
            } else {
                this.w = 1;
                this.z = null;
            }
        }

        @Override // androidx.transition.TransitionSeekController
        public final void b(long j) {
            if (this.x != null) {
                ny61.r("setCurrentPlayTimeMillis() called after animation has been started");
                return;
            }
            long j2 = this.a;
            if (j == j2 || !this.b) {
                return;
            }
            if (!this.c) {
                TransitionSet transitionSet = this.A;
                if (j != 0 || j2 <= 0) {
                    long j3 = transitionSet.a0;
                    if (j == j3 && j2 < j3) {
                        j = 1 + j3;
                    }
                } else {
                    j = -1;
                }
                if (j != j2) {
                    transitionSet.O(j, j2);
                    this.a = j;
                }
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            VelocityTracker1D velocityTracker1D = this.y;
            int i = (velocityTracker1D.c + 1) % 20;
            velocityTracker1D.c = i;
            velocityTracker1D.a[i] = currentAnimationTimeMillis;
            velocityTracker1D.b[i] = j;
        }

        @Override // androidx.transition.TransitionSeekController
        public final void c(Runnable runnable) {
            this.z = runnable;
            if (!this.b) {
                this.w = 2;
            } else {
                e();
                this.x.i(0.0f);
            }
        }

        @Override // defpackage.x4n
        public final void d(float f) {
            TransitionSet transitionSet = this.A;
            long max = Math.max(-1L, Math.min(transitionSet.a0 + 1, Math.round(f)));
            transitionSet.O(max, this.a);
            this.a = max;
        }

        public final void e() {
            char c;
            float f;
            if (this.x != null) {
                return;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f2 = this.a;
            VelocityTracker1D velocityTracker1D = this.y;
            int i = velocityTracker1D.c;
            float[] fArr = velocityTracker1D.b;
            long[] jArr = velocityTracker1D.a;
            char c2 = 20;
            int i2 = (i + 1) % 20;
            velocityTracker1D.c = i2;
            jArr[i2] = currentAnimationTimeMillis;
            fArr[i2] = f2;
            this.x = new nwt0(new sor());
            owt0 owt0Var = new owt0();
            owt0Var.a(1.0f);
            owt0Var.b(200.0f);
            nwt0 nwt0Var = this.x;
            nwt0Var.u = owt0Var;
            nwt0Var.g(this.a);
            this.x.b(this);
            nwt0 nwt0Var2 = this.x;
            int i3 = velocityTracker1D.c;
            long j = Long.MIN_VALUE;
            float f3 = 0.0f;
            if (i3 != 0 || jArr[i3] != Long.MIN_VALUE) {
                long j2 = jArr[i3];
                int i4 = 0;
                long j3 = j2;
                while (true) {
                    long j4 = jArr[i3];
                    if (j4 != j) {
                        float f4 = j2 - j4;
                        float abs = Math.abs(j4 - j3);
                        if (f4 > 100.0f || abs > 40.0f) {
                            break;
                        }
                        if (i3 == 0) {
                            i3 = 20;
                        }
                        i3--;
                        i4++;
                        if (i4 >= 20) {
                            break;
                        }
                        j3 = j4;
                        j = Long.MIN_VALUE;
                    } else {
                        break;
                    }
                }
                if (i4 >= 2) {
                    int i5 = velocityTracker1D.c;
                    float f5 = 1000.0f;
                    if (i4 == 2) {
                        int i6 = i5 == 0 ? 19 : i5 - 1;
                        float f6 = jArr[i5] - jArr[i6];
                        if (f6 != 0.0f) {
                            f3 = ((fArr[i5] - fArr[i6]) / f6) * 1000.0f;
                        }
                    } else {
                        int i7 = ((i5 - i4) + 21) % 20;
                        int i8 = (i5 + 21) % 20;
                        long j5 = jArr[i7];
                        float f7 = fArr[i7];
                        int i9 = i7 + 1;
                        int i10 = i9 % 20;
                        float f8 = 0.0f;
                        while (i10 != i8) {
                            long j6 = jArr[i10];
                            float f9 = f3;
                            int i11 = i8;
                            float f10 = j6 - j5;
                            if (f10 == f9) {
                                c = c2;
                                f = f5;
                            } else {
                                float f11 = fArr[i10];
                                c = c2;
                                f = f5;
                                float f12 = (f11 - f7) / f10;
                                float abs2 = (Math.abs(f12) * (f12 - ((float) (Math.sqrt(2.0f * Math.abs(f8)) * Math.signum(f8))))) + f8;
                                if (i10 == i9) {
                                    abs2 *= 0.5f;
                                }
                                f8 = abs2;
                                f7 = f11;
                                j5 = j6;
                            }
                            i10 = (i10 + 1) % 20;
                            f3 = f9;
                            i8 = i11;
                            c2 = c;
                            f5 = f;
                        }
                        f3 = ((float) (Math.sqrt(Math.abs(f8) * 2.0f) * Math.signum(f8))) * f5;
                    }
                }
            }
            nwt0Var2.a = f3;
            nwt0 nwt0Var3 = this.x;
            nwt0Var3.g = this.A.a0 + 1;
            nwt0Var3.h = -1.0f;
            nwt0Var3.e(4.0f);
            this.x.a(new w4n() { // from class: androidx.transition.a
                @Override // defpackage.w4n
                public final void a(y4n y4nVar, boolean z, float f13, float f14) {
                    Transition.SeekController seekController = Transition.SeekController.this;
                    TransitionSet transitionSet = seekController.A;
                    if (z) {
                        return;
                    }
                    Transition.TransitionNotification transitionNotification = Transition.TransitionNotification.b;
                    if (f13 >= 1.0f) {
                        transitionSet.G(transitionSet, transitionNotification, false);
                        return;
                    }
                    long j7 = transitionSet.a0;
                    Transition a0 = transitionSet.a0(0);
                    Transition transition = a0.S;
                    a0.S = null;
                    transitionSet.O(-1L, seekController.a);
                    transitionSet.O(j7, -1L);
                    seekController.a = j7;
                    Runnable runnable = seekController.z;
                    if (runnable != null) {
                        runnable.run();
                    }
                    transitionSet.U.clear();
                    if (transition != null) {
                        transition.G(transition, transitionNotification, true);
                    }
                }
            });
        }

        @Override // androidx.transition.TransitionSeekController
        public final long f() {
            return this.A.a0;
        }

        public final void g() {
            TransitionSet transitionSet = this.A;
            long j = transitionSet.a0 == 0 ? 1L : 0L;
            transitionSet.O(j, this.a);
            this.a = j;
        }

        public final void h() {
            this.b = true;
            int i = this.w;
            if (i == 1) {
                this.w = 0;
                a();
            } else if (i == 2) {
                this.w = 0;
                c(this.z);
            }
        }

        @Override // androidx.transition.TransitionSeekController
        public final boolean isReady() {
            return this.b;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
            this.c = true;
        }
    }

    public interface TransitionListener {
        void onTransitionCancel(Transition transition);

        void onTransitionEnd(Transition transition);

        default void onTransitionEnd(Transition transition, boolean z) {
            onTransitionEnd(transition);
        }

        void onTransitionPause(Transition transition);

        void onTransitionResume(Transition transition);

        void onTransitionStart(Transition transition);

        default void onTransitionStart(Transition transition, boolean z) {
            onTransitionStart(transition);
        }
    }

    public interface TransitionNotification {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.transition.b] */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.transition.b] */
        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.transition.b] */
        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.transition.b] */
        /* JADX WARN: Type inference failed for: r0v4, types: [androidx.transition.b] */
        static {
            final int i = 0;
            a = new TransitionNotification() { // from class: androidx.transition.b
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z) {
                    switch (i) {
                        case 0:
                            transitionListener.onTransitionStart(transition, z);
                            break;
                        case 1:
                            transitionListener.onTransitionEnd(transition, z);
                            break;
                        case 2:
                            transitionListener.onTransitionCancel(transition);
                            break;
                        case 3:
                            transitionListener.onTransitionPause(transition);
                            break;
                        default:
                            transitionListener.onTransitionResume(transition);
                            break;
                    }
                }
            };
            final int i2 = 1;
            b = new TransitionNotification() { // from class: androidx.transition.b
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z) {
                    switch (i2) {
                        case 0:
                            transitionListener.onTransitionStart(transition, z);
                            break;
                        case 1:
                            transitionListener.onTransitionEnd(transition, z);
                            break;
                        case 2:
                            transitionListener.onTransitionCancel(transition);
                            break;
                        case 3:
                            transitionListener.onTransitionPause(transition);
                            break;
                        default:
                            transitionListener.onTransitionResume(transition);
                            break;
                    }
                }
            };
            final int i3 = 2;
            c = new TransitionNotification() { // from class: androidx.transition.b
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z) {
                    switch (i3) {
                        case 0:
                            transitionListener.onTransitionStart(transition, z);
                            break;
                        case 1:
                            transitionListener.onTransitionEnd(transition, z);
                            break;
                        case 2:
                            transitionListener.onTransitionCancel(transition);
                            break;
                        case 3:
                            transitionListener.onTransitionPause(transition);
                            break;
                        default:
                            transitionListener.onTransitionResume(transition);
                            break;
                    }
                }
            };
            final int i4 = 3;
            d = new TransitionNotification() { // from class: androidx.transition.b
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z) {
                    switch (i4) {
                        case 0:
                            transitionListener.onTransitionStart(transition, z);
                            break;
                        case 1:
                            transitionListener.onTransitionEnd(transition, z);
                            break;
                        case 2:
                            transitionListener.onTransitionCancel(transition);
                            break;
                        case 3:
                            transitionListener.onTransitionPause(transition);
                            break;
                        default:
                            transitionListener.onTransitionResume(transition);
                            break;
                    }
                }
            };
            final int i5 = 4;
            e = new TransitionNotification() { // from class: androidx.transition.b
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z) {
                    switch (i5) {
                        case 0:
                            transitionListener.onTransitionStart(transition, z);
                            break;
                        case 1:
                            transitionListener.onTransitionEnd(transition, z);
                            break;
                        case 2:
                            transitionListener.onTransitionCancel(transition);
                            break;
                        case 3:
                            transitionListener.onTransitionPause(transition);
                            break;
                        default:
                            transitionListener.onTransitionResume(transition);
                            break;
                    }
                }
            };
        }

        void a(TransitionListener transitionListener, Transition transition, boolean z);
    }

    public static void e(TransitionValuesMaps transitionValuesMaps, View view, TransitionValues transitionValues) {
        w53 w53Var = transitionValuesMaps.a;
        w53 w53Var2 = transitionValuesMaps.d;
        SparseArray sparseArray = transitionValuesMaps.b;
        rnz rnzVar = transitionValuesMaps.c;
        w53Var.put(view, transitionValues);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        String g = ViewCompat$Api21Impl.g(view);
        if (g != null) {
            if (w53Var2.containsKey(g)) {
                w53Var2.put(g, null);
            } else {
                w53Var2.put(g, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (rnzVar.e(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    rnzVar.h(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) rnzVar.c(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    rnzVar.h(itemIdAtPosition, null);
                }
            }
        }
    }

    public static ArrayList s(int i, ArrayList arrayList) {
        return i > 0 ? ArrayListManager.a(arrayList, Integer.valueOf(i)) : arrayList;
    }

    public static w53 z() {
        ThreadLocal threadLocal = g0;
        w53 w53Var = (w53) threadLocal.get();
        if (w53Var != null) {
            return w53Var;
        }
        w53 w53Var2 = new w53();
        threadLocal.set(w53Var2);
        return w53Var2;
    }

    public String[] A() {
        return null;
    }

    public final TransitionValues B(View view, boolean z) {
        TransitionSet transitionSet = this.I;
        if (transitionSet != null) {
            return transitionSet.B(view, z);
        }
        return (TransitionValues) (z ? this.G : this.H).a.get(view);
    }

    public boolean C() {
        return !this.N.isEmpty();
    }

    public boolean D() {
        return this instanceof ChangeBounds;
    }

    public boolean E(TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues != null) {
            HashMap hashMap = transitionValues.a;
            if (transitionValues2 != null) {
                HashMap hashMap2 = transitionValues2.a;
                String[] A = A();
                if (A != null) {
                    for (String str : A) {
                        Object obj = hashMap.get(str);
                        Object obj2 = hashMap2.get(str);
                        if ((obj == null && obj2 == null) ? false : (obj == null || obj2 == null) ? true : !obj.equals(obj2)) {
                            return true;
                        }
                    }
                } else {
                    for (String str2 : hashMap.keySet()) {
                        Object obj3 = hashMap.get(str2);
                        Object obj4 = hashMap2.get(str2);
                        if ((obj3 == null && obj4 == null) ? false : (obj3 == null || obj4 == null) ? true : !obj3.equals(obj4)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean F(View view) {
        ArrayList arrayList;
        int id = view.getId();
        ArrayList arrayList2 = this.A;
        if (arrayList2 != null && arrayList2.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList3 = this.B;
        if (arrayList3 != null && arrayList3.contains(view)) {
            return false;
        }
        ArrayList arrayList4 = this.C;
        if (arrayList4 != null) {
            int size = arrayList4.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.C.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.D != null) {
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            if (ViewCompat$Api21Impl.g(view) != null && this.D.contains(ViewCompat$Api21Impl.g(view))) {
                return false;
            }
        }
        ArrayList arrayList5 = this.x;
        int size2 = arrayList5.size();
        ArrayList arrayList6 = this.y;
        if ((size2 == 0 && arrayList6.size() == 0 && ((arrayList = this.z) == null || arrayList.isEmpty())) || arrayList5.contains(Integer.valueOf(id)) || arrayList6.contains(view)) {
            return true;
        }
        ArrayList arrayList7 = this.z;
        if (arrayList7 != null) {
            WeakHashMap weakHashMap2 = androidx.core.view.b.a;
            if (arrayList7.contains(ViewCompat$Api21Impl.g(view))) {
                return true;
            }
        }
        return false;
    }

    public final void G(Transition transition, TransitionNotification transitionNotification, boolean z) {
        Transition transition2 = this.S;
        if (transition2 != null) {
            transition2.G(transition, transitionNotification, z);
        }
        ArrayList arrayList = this.T;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.T.size();
        TransitionListener[] transitionListenerArr = this.M;
        if (transitionListenerArr == null) {
            transitionListenerArr = new TransitionListener[size];
        }
        this.M = null;
        TransitionListener[] transitionListenerArr2 = (TransitionListener[]) this.T.toArray(transitionListenerArr);
        for (int i = 0; i < size; i++) {
            transitionNotification.a(transitionListenerArr2[i], transition, z);
            transitionListenerArr2[i] = null;
        }
        this.M = transitionListenerArr2;
    }

    public void H(View view) {
        if (this.R) {
            return;
        }
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.O);
        this.O = d0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.O = animatorArr;
        G(this, TransitionNotification.d, false);
        this.Q = true;
    }

    public void J() {
        w53 z = z();
        this.a0 = 0L;
        int i = 0;
        while (true) {
            int size = this.U.size();
            ArrayList arrayList = this.U;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            Animator animator = (Animator) arrayList.get(i);
            AnimationInfo animationInfo = (AnimationInfo) z.get(animator);
            if (animator != null && animationInfo != null) {
                Animator animator2 = animationInfo.f;
                long j = this.c;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.b;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.w;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.N.add(animator);
                this.a0 = Math.max(this.a0, Impl26.a(animator));
            }
            i++;
        }
    }

    public Transition K(TransitionListener transitionListener) {
        Transition transition;
        ArrayList arrayList = this.T;
        if (arrayList != null) {
            if (!arrayList.remove(transitionListener) && (transition = this.S) != null) {
                transition.K(transitionListener);
            }
            if (this.T.size() == 0) {
                this.T = null;
            }
        }
        return this;
    }

    public void L(View view) {
        this.y.remove(view);
    }

    public void M(View view) {
        if (this.Q) {
            if (!this.R) {
                ArrayList arrayList = this.N;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.O);
                this.O = d0;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.O = animatorArr;
                G(this, TransitionNotification.e, false);
            }
            this.Q = false;
        }
    }

    public void N() {
        V();
        final w53 z = z();
        Iterator it = this.U.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (z.containsKey(animator)) {
                V();
                if (animator != null) {
                    animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.transition.Transition.2
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator2) {
                            z.remove(animator2);
                            Transition.this.N.remove(animator2);
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator2) {
                            Transition.this.N.add(animator2);
                        }
                    });
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.w;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.transition.Transition.3
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator2) {
                            Transition.this.q();
                            animator2.removeListener(this);
                        }
                    });
                    animator.start();
                }
            }
        }
        this.U.clear();
        q();
    }

    public void O(long j, long j2) {
        long j3 = this.a0;
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.R = false;
            G(this, TransitionNotification.a, z);
        }
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.O);
        this.O = d0;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            Impl26.b(animator, Math.min(Math.max(0L, j), Impl26.a(animator)));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.O = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.R = true;
        }
        G(this, TransitionNotification.b, z);
    }

    public void P(long j) {
        this.c = j;
    }

    public void Q(EpicenterCallback epicenterCallback) {
        this.W = epicenterCallback;
    }

    public void R(TimeInterpolator timeInterpolator) {
        this.w = timeInterpolator;
    }

    public void S(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.Z = f0;
        } else {
            this.Z = pathMotion;
        }
    }

    public void T(TransitionPropagation transitionPropagation) {
        this.V = transitionPropagation;
    }

    public void U(long j) {
        this.b = j;
    }

    public final void V() {
        if (this.P == 0) {
            G(this, TransitionNotification.a, false);
            this.R = false;
        }
        this.P++;
    }

    public String W(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(Extension.COLON_SPACE);
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(Extension.C_BRAKE_SPACE);
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(Extension.C_BRAKE_SPACE);
        }
        if (this.w != null) {
            sb.append("interp(");
            sb.append(this.w);
            sb.append(Extension.C_BRAKE_SPACE);
        }
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        ArrayList arrayList2 = this.y;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(Extension.FIX_SPACE);
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(Extension.FIX_SPACE);
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(Extension.C_BRAKE);
        }
        return sb.toString();
    }

    public void a(TransitionListener transitionListener) {
        if (this.T == null) {
            this.T = new ArrayList();
        }
        this.T.add(transitionListener);
    }

    public Transition b(String str) {
        if (this.z == null) {
            this.z = new ArrayList();
        }
        this.z.add(str);
        return this;
    }

    public void c(int i) {
        if (i != 0) {
            this.x.add(Integer.valueOf(i));
        }
    }

    public void cancel() {
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.O);
        this.O = d0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.O = animatorArr;
        G(this, TransitionNotification.c, false);
    }

    public void d(View view) {
        this.y.add(view);
    }

    public abstract void f(TransitionValues transitionValues);

    public final void g(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.A;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.B;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.C;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (((Class) this.C.get(i)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    TransitionValues transitionValues = new TransitionValues(view);
                    if (z) {
                        i(transitionValues);
                    } else {
                        f(transitionValues);
                    }
                    transitionValues.c.add(this);
                    h(transitionValues);
                    if (z) {
                        e(this.G, view, transitionValues);
                    } else {
                        e(this.H, view, transitionValues);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.E;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.F;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                                g(viewGroup.getChildAt(i2), z);
                            }
                        }
                    }
                }
            }
        }
    }

    public void h(TransitionValues transitionValues) {
        HashMap hashMap = transitionValues.a;
        if (this.V == null || hashMap.isEmpty()) {
            return;
        }
        this.V.getClass();
        for (int i = 0; i < 2; i++) {
            if (!hashMap.containsKey(VisibilityPropagation.a[i])) {
                this.V.a(transitionValues);
                return;
            }
        }
    }

    public abstract void i(TransitionValues transitionValues);

    public final void j(ViewGroup viewGroup, boolean z) {
        ArrayList arrayList;
        l(z);
        ArrayList arrayList2 = this.x;
        int size = arrayList2.size();
        ArrayList arrayList3 = this.y;
        if ((size <= 0 && arrayList3.size() <= 0) || ((arrayList = this.z) != null && !arrayList.isEmpty())) {
            g(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList2.get(i)).intValue());
            if (findViewById != null) {
                TransitionValues transitionValues = new TransitionValues(findViewById);
                if (z) {
                    i(transitionValues);
                } else {
                    f(transitionValues);
                }
                transitionValues.c.add(this);
                h(transitionValues);
                if (z) {
                    e(this.G, findViewById, transitionValues);
                } else {
                    e(this.H, findViewById, transitionValues);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            View view = (View) arrayList3.get(i2);
            TransitionValues transitionValues2 = new TransitionValues(view);
            if (z) {
                i(transitionValues2);
            } else {
                f(transitionValues2);
            }
            transitionValues2.c.add(this);
            h(transitionValues2);
            if (z) {
                e(this.G, view, transitionValues2);
            } else {
                e(this.H, view, transitionValues2);
            }
        }
    }

    public final void l(boolean z) {
        if (z) {
            this.G.a.clear();
            this.G.b.clear();
            this.G.c.clear();
        } else {
            this.H.a.clear();
            this.H.b.clear();
            this.H.c.clear();
        }
    }

    @Override // 
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.U = new ArrayList();
            transition.G = new TransitionValuesMaps();
            transition.H = new TransitionValuesMaps();
            transition.K = null;
            transition.L = null;
            transition.b0 = null;
            transition.S = this;
            transition.T = null;
            return transition;
        } catch (CloneNotSupportedException e) {
            ny61.j(e);
            return null;
        }
    }

    public Animator o(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0120 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p(ViewGroup viewGroup, TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2, ArrayList arrayList, ArrayList arrayList2) {
        Animator o;
        int i;
        boolean z;
        int i2;
        View view;
        TransitionValues transitionValues;
        w53 z2 = z();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z3 = y().b0 != null;
        long j = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        int i3 = 0;
        while (i3 < size) {
            TransitionValues transitionValues2 = (TransitionValues) arrayList.get(i3);
            TransitionValues transitionValues3 = (TransitionValues) arrayList2.get(i3);
            if (transitionValues2 != null && !transitionValues2.c.contains(this)) {
                transitionValues2 = null;
            }
            if (transitionValues3 != null && !transitionValues3.c.contains(this)) {
                transitionValues3 = null;
            }
            if (!(transitionValues2 == null && transitionValues3 == null) && ((transitionValues2 == null || transitionValues3 == null || E(transitionValues2, transitionValues3)) && (o = o(viewGroup, transitionValues2, transitionValues3)) != null)) {
                String str = this.a;
                if (transitionValues3 != null) {
                    view = transitionValues3.b;
                    i = size;
                    String[] A = A();
                    z = z3;
                    if (A == null || A.length <= 0) {
                        i2 = i3;
                    } else {
                        transitionValues = new TransitionValues(view);
                        i2 = i3;
                        TransitionValues transitionValues4 = (TransitionValues) transitionValuesMaps2.a.get(view);
                        if (transitionValues4 != null) {
                            int i4 = 0;
                            while (i4 < A.length) {
                                String str2 = A[i4];
                                transitionValues.a.put(str2, transitionValues4.a.get(str2));
                                i4++;
                                A = A;
                            }
                        }
                        int i5 = z2.c;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                break;
                            }
                            AnimationInfo animationInfo = (AnimationInfo) z2.get((Animator) z2.f(i6));
                            if (animationInfo.c != null && animationInfo.a == view && animationInfo.b.equals(str) && animationInfo.c.equals(transitionValues)) {
                                o = null;
                                break;
                            }
                            i6++;
                        }
                        if (o != null) {
                            TransitionPropagation transitionPropagation = this.V;
                            if (transitionPropagation != null) {
                                long b = transitionPropagation.b(viewGroup, this, transitionValues2, transitionValues3);
                                sparseIntArray.put(this.U.size(), (int) b);
                                j = Math.min(b, j);
                            }
                            WindowId windowId = viewGroup.getWindowId();
                            AnimationInfo animationInfo2 = new AnimationInfo();
                            animationInfo2.a = view;
                            animationInfo2.b = str;
                            animationInfo2.c = transitionValues;
                            animationInfo2.d = windowId;
                            animationInfo2.e = this;
                            animationInfo2.f = o;
                            if (z) {
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.play(o);
                                o = animatorSet;
                            }
                            z2.put(o, animationInfo2);
                            this.U.add(o);
                        }
                    }
                } else {
                    i = size;
                    z = z3;
                    i2 = i3;
                    view = transitionValues2.b;
                }
                transitionValues = null;
                if (o != null) {
                }
            } else {
                i = size;
                z = z3;
                i2 = i3;
            }
            i3 = i2 + 1;
            size = i;
            z3 = z;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                AnimationInfo animationInfo3 = (AnimationInfo) z2.get((Animator) this.U.get(sparseIntArray.keyAt(i7)));
                animationInfo3.f.setStartDelay(animationInfo3.f.getStartDelay() + (sparseIntArray.valueAt(i7) - j));
            }
        }
    }

    public final void q() {
        int i = this.P - 1;
        this.P = i;
        if (i == 0) {
            G(this, TransitionNotification.b, false);
            for (int i2 = 0; i2 < this.G.c.j(); i2++) {
                View view = (View) this.G.c.l(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < this.H.c.j(); i3++) {
                View view2 = (View) this.H.c.l(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.R = true;
        }
    }

    public final void r(View view) {
        this.F = ArrayListManager.a(this.F, view);
    }

    public final void t() {
        this.D = ArrayListManager.a(this.D, "plaque_notification_container_transition_name");
    }

    public final String toString() {
        return W("");
    }

    public void u(View view) {
        ArrayList arrayList = this.B;
        if (view != null) {
            arrayList = ArrayListManager.a(arrayList, view);
        }
        this.B = arrayList;
    }

    public void v() {
        this.C = ArrayListManager.a(this.C, TextView.class);
    }

    public void w(ViewGroup viewGroup) {
        w53 z = z();
        int i = z.c;
        if (viewGroup == null || i == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        w53 w53Var = new w53(z);
        z.clear();
        for (int i2 = i - 1; i2 >= 0; i2--) {
            AnimationInfo animationInfo = (AnimationInfo) w53Var.j(i2);
            if (animationInfo.a != null && windowId.equals(animationInfo.d)) {
                ((Animator) w53Var.f(i2)).end();
            }
        }
    }

    public final TransitionValues x(View view, boolean z) {
        TransitionSet transitionSet = this.I;
        if (transitionSet != null) {
            return transitionSet.x(view, z);
        }
        ArrayList arrayList = z ? this.K : this.L;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            TransitionValues transitionValues = (TransitionValues) arrayList.get(i);
            if (transitionValues == null) {
                return null;
            }
            if (transitionValues.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (TransitionValues) (z ? this.L : this.K).get(i);
        }
        return null;
    }

    public final Transition y() {
        TransitionSet transitionSet = this.I;
        return transitionSet != null ? transitionSet.y() : this;
    }
}
