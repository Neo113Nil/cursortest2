package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.ironsource.C4504q2;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import xsna.vlp0;
import xsna.woo;

/* compiled from: Transition.java */
/* loaded from: classes.dex */
public abstract class vlp0 implements Cloneable {
    private ArrayList<gnp0> mEndValuesList;
    private f mEpicenterCallback;
    private i[] mListenersCache;
    private zk3<String, String> mNameOverrides;
    bnp0 mPropagation;
    h mSeekController;
    long mSeekOffsetInParent;
    private ArrayList<gnp0> mStartValuesList;
    long mTotalDuration;
    private static final Animator[] EMPTY_ANIMATOR_ARRAY = new Animator[0];
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final pq90 STRAIGHT_PATH_MOTION = new c();
    private static ThreadLocal<zk3<Animator, d>> sRunningAnimators = new ThreadLocal<>();
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private hnp0 mStartValues = new hnp0();
    private hnp0 mEndValues = new hnp0();
    dnp0 mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private Animator[] mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
    int mNumInstances = 0;
    private boolean mPaused = false;
    boolean mEnded = false;
    private vlp0 mCloneParent = null;
    private ArrayList<i> mListeners = null;
    ArrayList<Animator> mAnimators = new ArrayList<>();
    private pq90 mPathMotion = STRAIGHT_PATH_MOTION;

    /* compiled from: Transition.java */
    /* loaded from: classes12.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ zk3 b;

        public a(zk3 zk3Var) {
            this.b = zk3Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.b.remove(animator);
            vlp0.this.mCurrentAnimators.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            vlp0.this.mCurrentAnimators.add(animator);
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes12.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            vlp0.this.end();
            animator.removeListener(this);
        }
    }

    /* compiled from: Transition.java */
    public class c extends pq90 {
        @Override // xsna.pq90
        public final Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes12.dex */
    public static class d {
        public final View a;
        public final String b;
        public final gnp0 c;
        public final WindowId d;
        public final vlp0 e;
        public final Animator f;

        public d(View view, String str, vlp0 vlp0Var, WindowId windowId, gnp0 gnp0Var, Animator animator) {
            this.a = view;
            this.b = str;
            this.c = gnp0Var;
            this.d = windowId;
            this.e = vlp0Var;
            this.f = animator;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes12.dex */
    public static class e {
        public static ArrayList a(Object obj, ArrayList arrayList) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
            return arrayList;
        }

        public static ArrayList b(Object obj, ArrayList arrayList) {
            if (arrayList != null) {
                arrayList.remove(obj);
                if (arrayList.isEmpty()) {
                    return null;
                }
            }
            return arrayList;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes12.dex */
    public static abstract class f {
        public abstract Rect a();
    }

    /* compiled from: Transition.java */
    /* loaded from: classes12.dex */
    public static class g {
        public static long a(Animator animator) {
            return animator.getTotalDuration();
        }

        public static void b(Animator animator, long j) {
            ((AnimatorSet) animator).setCurrentPlayTime(j);
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes12.dex */
    public class h extends ymp0 implements cnp0, woo.l {
        public boolean c;
        public boolean d;
        public smk0 f;
        public final mmr0 g;
        public Runnable h;
        public long b = -1;
        public int e = 0;

        public h() {
            mmr0 mmr0Var = new mmr0();
            long[] jArr = new long[20];
            mmr0Var.a = jArr;
            mmr0Var.b = new float[20];
            mmr0Var.c = 0;
            Arrays.fill(jArr, Long.MIN_VALUE);
            this.g = mmr0Var;
        }

        @Override // xsna.cnp0
        public final long b() {
            return vlp0.this.getTotalDurationMillis();
        }

        @Override // xsna.cnp0
        public final void c() {
            if (this.c) {
                h();
                this.f.j(vlp0.this.getTotalDurationMillis() + 1);
            } else {
                this.e = 1;
                this.h = null;
            }
        }

        @Override // xsna.cnp0
        public final void d(long j) {
            if (this.f != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            long j2 = this.b;
            if (j == j2 || !this.c) {
                return;
            }
            if (!this.d) {
                vlp0 vlp0Var = vlp0.this;
                if (j != 0 || j2 <= 0) {
                    long totalDurationMillis = vlp0Var.getTotalDurationMillis();
                    if (j == totalDurationMillis && this.b < totalDurationMillis) {
                        j = 1 + totalDurationMillis;
                    }
                } else {
                    j = -1;
                }
                long j3 = this.b;
                if (j != j3) {
                    vlp0Var.setCurrentPlayTimeMillis(j, j3);
                    this.b = j;
                }
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            mmr0 mmr0Var = this.g;
            int i = (mmr0Var.c + 1) % 20;
            mmr0Var.c = i;
            mmr0Var.a[i] = currentAnimationTimeMillis;
            mmr0Var.b[i] = j;
        }

        @Override // xsna.cnp0
        public final void e(Runnable runnable) {
            this.h = runnable;
            if (!this.c) {
                this.e = 2;
            } else {
                h();
                this.f.j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }

        @Override // xsna.woo.l
        public final void f(float f) {
            vlp0 vlp0Var = vlp0.this;
            long max = Math.max(-1L, Math.min(vlp0Var.getTotalDurationMillis() + 1, Math.round(f)));
            vlp0Var.setCurrentPlayTimeMillis(max, this.b);
            this.b = max;
        }

        public final void h() {
            float f;
            if (this.f != null) {
                return;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f2 = this.b;
            mmr0 mmr0Var = this.g;
            int i = (mmr0Var.c + 1) % 20;
            mmr0Var.c = i;
            mmr0Var.a[i] = currentAnimationTimeMillis;
            mmr0Var.b[i] = f2;
            qqr qqrVar = new qqr();
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            qqrVar.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f = new smk0(qqrVar);
            vmk0 vmk0Var = new vmk0();
            vmk0Var.a(1.0f);
            vmk0Var.b(200.0f);
            smk0 smk0Var = this.f;
            smk0Var.u = vmk0Var;
            smk0Var.b = this.b;
            smk0Var.c = true;
            smk0Var.c(this);
            smk0 smk0Var2 = this.f;
            float[] fArr = mmr0Var.b;
            long[] jArr = mmr0Var.a;
            int i2 = mmr0Var.c;
            long j = Long.MIN_VALUE;
            if (i2 != 0 || jArr[i2] != Long.MIN_VALUE) {
                long j2 = jArr[i2];
                int i3 = 0;
                long j3 = j2;
                while (true) {
                    long j4 = jArr[i2];
                    if (j4 != j) {
                        float f4 = j2 - j4;
                        float abs = Math.abs(j4 - j3);
                        if (f4 > 100.0f || abs > 40.0f) {
                            break;
                        }
                        if (i2 == 0) {
                            i2 = 20;
                        }
                        i2--;
                        i3++;
                        if (i3 >= 20) {
                            break;
                        }
                        j3 = j4;
                        j = Long.MIN_VALUE;
                    } else {
                        break;
                    }
                }
                if (i3 >= 2) {
                    float f5 = 1000.0f;
                    if (i3 == 2) {
                        int i4 = mmr0Var.c;
                        int i5 = i4 == 0 ? 19 : i4 - 1;
                        float f6 = jArr[i4] - jArr[i5];
                        if (f6 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            f3 = ((fArr[i4] - fArr[i5]) / f6) * 1000.0f;
                        }
                    } else {
                        int i6 = mmr0Var.c;
                        int i7 = ((i6 - i3) + 21) % 20;
                        int i8 = (i6 + 21) % 20;
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
                                f = f5;
                            } else {
                                float f11 = fArr[i10];
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
                            f5 = f;
                        }
                        f3 = ((float) (Math.sqrt(Math.abs(f8) * 2.0f) * Math.signum(f8))) * f5;
                    }
                }
            }
            smk0Var2.a = f3;
            this.f.g = vlp0.this.getTotalDurationMillis() + 1;
            smk0 smk0Var3 = this.f;
            smk0Var3.h = -1.0f;
            smk0Var3.j = 4.0f;
            smk0Var3.b(new woo.k() { // from class: xsna.xlp0
                @Override // xsna.woo.k
                public final void a(woo wooVar, boolean z, float f13, float f14) {
                    vlp0 vlp0Var;
                    vlp0.h hVar = vlp0.h.this;
                    vlp0 vlp0Var2 = vlp0.this;
                    if (z) {
                        return;
                    }
                    ajl0 ajl0Var = vlp0.j.C7;
                    if (f13 >= 1.0f) {
                        vlp0Var2.notifyListeners(ajl0Var, false);
                        return;
                    }
                    long totalDurationMillis = vlp0Var2.getTotalDurationMillis();
                    vlp0 d = ((dnp0) vlp0Var2).d(0);
                    vlp0Var = d.mCloneParent;
                    d.mCloneParent = null;
                    vlp0Var2.setCurrentPlayTimeMillis(-1L, hVar.b);
                    vlp0Var2.setCurrentPlayTimeMillis(totalDurationMillis, -1L);
                    hVar.b = totalDurationMillis;
                    Runnable runnable = hVar.h;
                    if (runnable != null) {
                        runnable.run();
                    }
                    vlp0Var2.mAnimators.clear();
                    if (vlp0Var != null) {
                        vlp0Var.notifyListeners(ajl0Var, true);
                    }
                }
            });
        }

        public final void i() {
            vlp0 vlp0Var = vlp0.this;
            long j = vlp0Var.getTotalDurationMillis() == 0 ? 1L : 0L;
            vlp0Var.setCurrentPlayTimeMillis(j, this.b);
            this.b = j;
        }

        @Override // xsna.cnp0
        public final boolean isReady() {
            return this.c;
        }

        public final void j() {
            this.c = true;
            int i = this.e;
            if (i == 1) {
                this.e = 0;
                c();
            } else if (i == 2) {
                this.e = 0;
                e(this.h);
            }
        }

        @Override // xsna.ymp0, xsna.vlp0.i
        public final void onTransitionCancel(vlp0 vlp0Var) {
            this.d = true;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes12.dex */
    public interface i {
        default void a(vlp0 vlp0Var) {
            onTransitionEnd(vlp0Var);
        }

        default void g(vlp0 vlp0Var) {
            onTransitionStart(vlp0Var);
        }

        void onTransitionCancel(vlp0 vlp0Var);

        void onTransitionEnd(vlp0 vlp0Var);

        void onTransitionPause(vlp0 vlp0Var);

        void onTransitionResume(vlp0 vlp0Var);

        void onTransitionStart(vlp0 vlp0Var);
    }

    /* compiled from: Transition.java */
    /* loaded from: classes12.dex */
    public interface j {
        public static final ajl0 C7;
        public static final trk0 D7;
        public static final ky80 B7 = new ky80(10);
        public static final xga0 E7 = new xga0(6);
        public static final ly80 F7 = new ly80(8);

        static {
            int i = 3;
            C7 = new ajl0(i);
            D7 = new trk0(i);
        }

        void a(i iVar, vlp0 vlp0Var, boolean z);
    }

    public vlp0() {
    }

    private void addUnmatched(zk3<View, gnp0> zk3Var, zk3<View, gnp0> zk3Var2) {
        for (int i2 = 0; i2 < zk3Var.d; i2++) {
            gnp0 j2 = zk3Var.j(i2);
            if (isValidTarget(j2.b)) {
                this.mStartValuesList.add(j2);
                this.mEndValuesList.add(null);
            }
        }
        for (int i3 = 0; i3 < zk3Var2.d; i3++) {
            gnp0 j3 = zk3Var2.j(i3);
            if (isValidTarget(j3.b)) {
                this.mEndValuesList.add(j3);
                this.mStartValuesList.add(null);
            }
        }
    }

    private static void addViewValues(hnp0 hnp0Var, View view, gnp0 gnp0Var) {
        zk3<View, gnp0> zk3Var = hnp0Var.a;
        zk3<String, View> zk3Var2 = hnp0Var.d;
        SparseArray<View> sparseArray = hnp0Var.b;
        x500<View> x500Var = hnp0Var.c;
        zk3Var.put(view, gnp0Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (zk3Var2.containsKey(transitionName)) {
                zk3Var2.put(transitionName, null);
            } else {
                zk3Var2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (x500Var.indexOfKey(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    x500Var.put(itemIdAtPosition, view);
                    return;
                }
                View view2 = x500Var.get(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    x500Var.put(itemIdAtPosition, null);
                }
            }
        }
    }

    private static boolean alreadyContains(int[] iArr, int i2) {
        int i3 = iArr[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            if (iArr[i4] == i3) {
                return true;
            }
        }
        return false;
    }

    private void captureHierarchy(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (this.mTargetTypeExcludes.get(i2).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    gnp0 gnp0Var = new gnp0(view);
                    if (z) {
                        captureStartValues(gnp0Var);
                    } else {
                        captureEndValues(gnp0Var);
                    }
                    gnp0Var.c.add(this);
                    capturePropagationValues(gnp0Var);
                    if (z) {
                        addViewValues(this.mStartValues, view, gnp0Var);
                    } else {
                        addViewValues(this.mEndValues, view, gnp0Var);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    if (this.mTargetTypeChildExcludes.get(i3).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                captureHierarchy(viewGroup.getChildAt(i4), z);
                            }
                        }
                    }
                }
            }
        }
    }

    private ArrayList<Integer> excludeId(ArrayList<Integer> arrayList, int i2, boolean z) {
        return i2 > 0 ? z ? e.a(Integer.valueOf(i2), arrayList) : e.b(Integer.valueOf(i2), arrayList) : arrayList;
    }

    private static <T> ArrayList<T> excludeObject(ArrayList<T> arrayList, T t, boolean z) {
        return t != null ? z ? e.a(t, arrayList) : e.b(t, arrayList) : arrayList;
    }

    private ArrayList<Class<?>> excludeType(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z) {
        return cls != null ? z ? e.a(cls, arrayList) : e.b(cls, arrayList) : arrayList;
    }

    private ArrayList<View> excludeView(ArrayList<View> arrayList, View view, boolean z) {
        return view != null ? z ? e.a(view, arrayList) : e.b(view, arrayList) : arrayList;
    }

    private static zk3<Animator, d> getRunningAnimators() {
        zk3<Animator, d> zk3Var = sRunningAnimators.get();
        if (zk3Var != null) {
            return zk3Var;
        }
        zk3<Animator, d> zk3Var2 = new zk3<>();
        sRunningAnimators.set(zk3Var2);
        return zk3Var2;
    }

    private static boolean isValidMatch(int i2) {
        return i2 >= 1 && i2 <= 4;
    }

    private static boolean isValueChanged(gnp0 gnp0Var, gnp0 gnp0Var2, String str) {
        Object obj = gnp0Var.a.get(str);
        Object obj2 = gnp0Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void matchIds(zk3<View, gnp0> zk3Var, zk3<View, gnp0> zk3Var2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            View valueAt = sparseArray.valueAt(i2);
            if (valueAt != null && isValidTarget(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i2))) != null && isValidTarget(view)) {
                gnp0 gnp0Var = zk3Var.get(valueAt);
                gnp0 gnp0Var2 = zk3Var2.get(view);
                if (gnp0Var != null && gnp0Var2 != null) {
                    this.mStartValuesList.add(gnp0Var);
                    this.mEndValuesList.add(gnp0Var2);
                    zk3Var.remove(valueAt);
                    zk3Var2.remove(view);
                }
            }
        }
    }

    private void matchInstances(zk3<View, gnp0> zk3Var, zk3<View, gnp0> zk3Var2) {
        gnp0 remove;
        for (int i2 = zk3Var.d - 1; i2 >= 0; i2--) {
            View f2 = zk3Var.f(i2);
            if (f2 != null && isValidTarget(f2) && (remove = zk3Var2.remove(f2)) != null && isValidTarget(remove.b)) {
                this.mStartValuesList.add(zk3Var.h(i2));
                this.mEndValuesList.add(remove);
            }
        }
    }

    private void matchItemIds(zk3<View, gnp0> zk3Var, zk3<View, gnp0> zk3Var2, x500<View> x500Var, x500<View> x500Var2) {
        View view;
        int size = x500Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            View valueAt = x500Var.valueAt(i2);
            if (valueAt != null && isValidTarget(valueAt) && (view = x500Var2.get(x500Var.keyAt(i2))) != null && isValidTarget(view)) {
                gnp0 gnp0Var = zk3Var.get(valueAt);
                gnp0 gnp0Var2 = zk3Var2.get(view);
                if (gnp0Var != null && gnp0Var2 != null) {
                    this.mStartValuesList.add(gnp0Var);
                    this.mEndValuesList.add(gnp0Var2);
                    zk3Var.remove(valueAt);
                    zk3Var2.remove(view);
                }
            }
        }
    }

    private void matchNames(zk3<View, gnp0> zk3Var, zk3<View, gnp0> zk3Var2, zk3<String, View> zk3Var3, zk3<String, View> zk3Var4) {
        View view;
        int i2 = zk3Var3.d;
        for (int i3 = 0; i3 < i2; i3++) {
            View j2 = zk3Var3.j(i3);
            if (j2 != null && isValidTarget(j2) && (view = zk3Var4.get(zk3Var3.f(i3))) != null && isValidTarget(view)) {
                gnp0 gnp0Var = zk3Var.get(j2);
                gnp0 gnp0Var2 = zk3Var2.get(view);
                if (gnp0Var != null && gnp0Var2 != null) {
                    this.mStartValuesList.add(gnp0Var);
                    this.mEndValuesList.add(gnp0Var2);
                    zk3Var.remove(j2);
                    zk3Var2.remove(view);
                }
            }
        }
    }

    private void matchStartAndEnd(hnp0 hnp0Var, hnp0 hnp0Var2) {
        zk3<View, gnp0> zk3Var = new zk3<>(hnp0Var.a);
        zk3<View, gnp0> zk3Var2 = new zk3<>(hnp0Var2.a);
        int i2 = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i2 >= iArr.length) {
                addUnmatched(zk3Var, zk3Var2);
                return;
            }
            int i3 = iArr[i2];
            if (i3 == 1) {
                matchInstances(zk3Var, zk3Var2);
            } else if (i3 == 2) {
                matchNames(zk3Var, zk3Var2, hnp0Var.d, hnp0Var2.d);
            } else if (i3 == 3) {
                matchIds(zk3Var, zk3Var2, hnp0Var.b, hnp0Var2.b);
            } else if (i3 == 4) {
                matchItemIds(zk3Var, zk3Var2, hnp0Var.c, hnp0Var2.c);
            }
            i2++;
        }
    }

    private void notifyFromTransition(vlp0 vlp0Var, j jVar, boolean z) {
        vlp0 vlp0Var2 = this.mCloneParent;
        if (vlp0Var2 != null) {
            vlp0Var2.notifyFromTransition(vlp0Var, jVar, z);
        }
        ArrayList<i> arrayList = this.mListeners;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.mListeners.size();
        i[] iVarArr = this.mListenersCache;
        if (iVarArr == null) {
            iVarArr = new i[size];
        }
        this.mListenersCache = null;
        i[] iVarArr2 = (i[]) this.mListeners.toArray(iVarArr);
        for (int i2 = 0; i2 < size; i2++) {
            jVar.a(iVarArr2[i2], vlp0Var, z);
            iVarArr2[i2] = null;
        }
        this.mListenersCache = iVarArr2;
    }

    private static int[] parseMatchOrder(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, StringUtils.COMMA);
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i2] = 3;
            } else if (C4504q2.p.equalsIgnoreCase(trim)) {
                iArr[i2] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i2] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                iArr[i2] = 4;
            } else {
                if (!trim.isEmpty()) {
                    throw new InflateException(zr.a("Unknown match type in matchOrder: '", trim, "'"));
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                i2--;
                iArr = iArr2;
            }
            i2++;
        }
        return iArr;
    }

    private void runAnimator(Animator animator, zk3<Animator, d> zk3Var) {
        if (animator != null) {
            animator.addListener(new a(zk3Var));
            animate(animator);
        }
    }

    public vlp0 addListener(i iVar) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(iVar);
        return this;
    }

    public vlp0 addTarget(View view) {
        this.mTargets.add(view);
        return this;
    }

    public void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(animator.getStartDelay() + getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new b());
        animator.start();
    }

    public void cancel() {
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.cancel();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(j.D7, false);
    }

    public abstract void captureEndValues(gnp0 gnp0Var);

    public void capturePropagationValues(gnp0 gnp0Var) {
        if (this.mPropagation == null || gnp0Var.a.isEmpty()) {
            return;
        }
        this.mPropagation.getClass();
        for (int i2 = 0; i2 < 2; i2++) {
            if (!gnp0Var.a.containsKey(z4u0.a[i2])) {
                this.mPropagation.a(gnp0Var);
                return;
            }
        }
    }

    public abstract void captureStartValues(gnp0 gnp0Var);

    public void captureValues(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        zk3<String, String> zk3Var;
        clearValues(z);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i2 = 0; i2 < this.mTargetIds.size(); i2++) {
                View findViewById = viewGroup.findViewById(this.mTargetIds.get(i2).intValue());
                if (findViewById != null) {
                    gnp0 gnp0Var = new gnp0(findViewById);
                    if (z) {
                        captureStartValues(gnp0Var);
                    } else {
                        captureEndValues(gnp0Var);
                    }
                    gnp0Var.c.add(this);
                    capturePropagationValues(gnp0Var);
                    if (z) {
                        addViewValues(this.mStartValues, findViewById, gnp0Var);
                    } else {
                        addViewValues(this.mEndValues, findViewById, gnp0Var);
                    }
                }
            }
            for (int i3 = 0; i3 < this.mTargets.size(); i3++) {
                View view = this.mTargets.get(i3);
                gnp0 gnp0Var2 = new gnp0(view);
                if (z) {
                    captureStartValues(gnp0Var2);
                } else {
                    captureEndValues(gnp0Var2);
                }
                gnp0Var2.c.add(this);
                capturePropagationValues(gnp0Var2);
                if (z) {
                    addViewValues(this.mStartValues, view, gnp0Var2);
                } else {
                    addViewValues(this.mEndValues, view, gnp0Var2);
                }
            }
        } else {
            captureHierarchy(viewGroup, z);
        }
        if (z || (zk3Var = this.mNameOverrides) == null) {
            return;
        }
        int i4 = zk3Var.d;
        ArrayList arrayList3 = new ArrayList(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            arrayList3.add(this.mStartValues.d.remove(this.mNameOverrides.f(i5)));
        }
        for (int i6 = 0; i6 < i4; i6++) {
            View view2 = (View) arrayList3.get(i6);
            if (view2 != null) {
                this.mStartValues.d.put(this.mNameOverrides.j(i6), view2);
            }
        }
    }

    public void clearValues(boolean z) {
        if (z) {
            this.mStartValues.a.clear();
            this.mStartValues.b.clear();
            this.mStartValues.c.clear();
        } else {
            this.mEndValues.a.clear();
            this.mEndValues.b.clear();
            this.mEndValues.c.clear();
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, gnp0 gnp0Var, gnp0 gnp0Var2) {
        return null;
    }

    public void createAnimators(ViewGroup viewGroup, hnp0 hnp0Var, hnp0 hnp0Var2, ArrayList<gnp0> arrayList, ArrayList<gnp0> arrayList2) {
        Animator createAnimator;
        Animator animator;
        int i2;
        boolean z;
        int i3;
        View view;
        gnp0 gnp0Var;
        Animator animator2;
        View view2;
        Animator animator3;
        zk3<Animator, d> runningAnimators = getRunningAnimators();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z2 = getRootTransition().mSeekController != null;
        long j2 = Long.MAX_VALUE;
        int i4 = 0;
        while (i4 < size) {
            gnp0 gnp0Var2 = arrayList.get(i4);
            gnp0 gnp0Var3 = arrayList2.get(i4);
            if (gnp0Var2 != null && !gnp0Var2.c.contains(this)) {
                gnp0Var2 = null;
            }
            if (gnp0Var3 != null && !gnp0Var3.c.contains(this)) {
                gnp0Var3 = null;
            }
            if (!(gnp0Var2 == null && gnp0Var3 == null) && ((gnp0Var2 == null || gnp0Var3 == null || isTransitionRequired(gnp0Var2, gnp0Var3)) && (createAnimator = createAnimator(viewGroup, gnp0Var2, gnp0Var3)) != null)) {
                if (gnp0Var3 != null) {
                    View view3 = gnp0Var3.b;
                    String[] transitionProperties = getTransitionProperties();
                    if (transitionProperties != null && transitionProperties.length > 0) {
                        gnp0Var = new gnp0(view3);
                        i2 = size;
                        z = z2;
                        gnp0 gnp0Var4 = hnp0Var2.a.get(view3);
                        i3 = i4;
                        if (gnp0Var4 != null) {
                            int i5 = 0;
                            while (i5 < transitionProperties.length) {
                                String str = transitionProperties[i5];
                                gnp0Var.a.put(str, gnp0Var4.a.get(str));
                                i5++;
                                transitionProperties = transitionProperties;
                            }
                        }
                        int i6 = runningAnimators.d;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                view2 = view3;
                                animator3 = createAnimator;
                                break;
                            }
                            d dVar = runningAnimators.get(runningAnimators.f(i7));
                            if (dVar.c != null && dVar.a == view3) {
                                view2 = view3;
                                if (dVar.b.equals(getName()) && dVar.c.equals(gnp0Var)) {
                                    animator3 = null;
                                    break;
                                }
                            } else {
                                view2 = view3;
                            }
                            i7++;
                            view3 = view2;
                        }
                    } else {
                        view2 = view3;
                        i2 = size;
                        z = z2;
                        i3 = i4;
                        animator3 = createAnimator;
                        gnp0Var = null;
                    }
                    animator = animator3;
                    view = view2;
                } else {
                    animator = createAnimator;
                    i2 = size;
                    z = z2;
                    i3 = i4;
                    view = gnp0Var2.b;
                    gnp0Var = null;
                }
                if (animator != null) {
                    bnp0 bnp0Var = this.mPropagation;
                    if (bnp0Var != null) {
                        long b2 = bnp0Var.b(viewGroup, this, gnp0Var2, gnp0Var3);
                        sparseIntArray.put(this.mAnimators.size(), (int) b2);
                        j2 = Math.min(b2, j2);
                    }
                    long j3 = j2;
                    View view4 = view;
                    gnp0 gnp0Var5 = gnp0Var;
                    Animator animator4 = animator;
                    d dVar2 = new d(view4, getName(), this, viewGroup.getWindowId(), gnp0Var5, animator4);
                    if (z) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animator4);
                        animator2 = animatorSet;
                    } else {
                        animator2 = animator4;
                    }
                    runningAnimators.put(animator2, dVar2);
                    this.mAnimators.add(animator2);
                    j2 = j3;
                }
            } else {
                i2 = size;
                z = z2;
                i3 = i4;
            }
            i4 = i3 + 1;
            size = i2;
            z2 = z;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                d dVar3 = runningAnimators.get(this.mAnimators.get(sparseIntArray.keyAt(i8)));
                dVar3.f.setStartDelay(dVar3.f.getStartDelay() + (sparseIntArray.valueAt(i8) - j2));
            }
        }
    }

    public cnp0 createSeekController() {
        h hVar = new h();
        this.mSeekController = hVar;
        addListener(hVar);
        return this.mSeekController;
    }

    public void end() {
        int i2 = this.mNumInstances - 1;
        this.mNumInstances = i2;
        if (i2 == 0) {
            notifyListeners(j.C7, false);
            for (int i3 = 0; i3 < this.mStartValues.c.size(); i3++) {
                View valueAt = this.mStartValues.c.valueAt(i3);
                if (valueAt != null) {
                    valueAt.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < this.mEndValues.c.size(); i4++) {
                View valueAt2 = this.mEndValues.c.valueAt(i4);
                if (valueAt2 != null) {
                    valueAt2.setHasTransientState(false);
                }
            }
            this.mEnded = true;
        }
    }

    public vlp0 excludeChildren(View view, boolean z) {
        this.mTargetChildExcludes = excludeView(this.mTargetChildExcludes, view, z);
        return this;
    }

    public vlp0 excludeTarget(View view, boolean z) {
        this.mTargetExcludes = excludeView(this.mTargetExcludes, view, z);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void forceToEnd(ViewGroup viewGroup) {
        zk3<Animator, d> runningAnimators = getRunningAnimators();
        int i2 = runningAnimators.d;
        if (viewGroup == null || i2 == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        zk3 zk3Var = new zk3(runningAnimators);
        runningAnimators.clear();
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            d dVar = (d) zk3Var.j(i3);
            if (dVar.a != null && windowId.equals(dVar.d)) {
                ((Animator) zk3Var.f(i3)).end();
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    public Rect getEpicenter() {
        f fVar = this.mEpicenterCallback;
        if (fVar == null) {
            return null;
        }
        return fVar.a();
    }

    public f getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    public gnp0 getMatchedTransitionValues(View view, boolean z) {
        dnp0 dnp0Var = this.mParent;
        if (dnp0Var != null) {
            return dnp0Var.getMatchedTransitionValues(view, z);
        }
        ArrayList<gnp0> arrayList = z ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            }
            gnp0 gnp0Var = arrayList.get(i2);
            if (gnp0Var == null) {
                return null;
            }
            if (gnp0Var.b == view) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return (z ? this.mEndValuesList : this.mStartValuesList).get(i2);
        }
        return null;
    }

    public String getName() {
        return this.mName;
    }

    public pq90 getPathMotion() {
        return this.mPathMotion;
    }

    public bnp0 getPropagation() {
        return this.mPropagation;
    }

    public final vlp0 getRootTransition() {
        dnp0 dnp0Var = this.mParent;
        return dnp0Var != null ? dnp0Var.getRootTransition() : this;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    public List<View> getTargets() {
        return this.mTargets;
    }

    public final long getTotalDurationMillis() {
        return this.mTotalDuration;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public gnp0 getTransitionValues(View view, boolean z) {
        dnp0 dnp0Var = this.mParent;
        if (dnp0Var != null) {
            return dnp0Var.getTransitionValues(view, z);
        }
        return (z ? this.mStartValues : this.mEndValues).a.get(view);
    }

    public boolean hasAnimators() {
        return !this.mCurrentAnimators.isEmpty();
    }

    public boolean isSeekingSupported() {
        return false;
    }

    public boolean isTransitionRequired(gnp0 gnp0Var, gnp0 gnp0Var2) {
        if (gnp0Var != null && gnp0Var2 != null) {
            String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (String str : transitionProperties) {
                    if (isValueChanged(gnp0Var, gnp0Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = gnp0Var.a.keySet().iterator();
                while (it.hasNext()) {
                    if (isValueChanged(gnp0Var, gnp0Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.mTargetTypeExcludes.get(i2).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (view.getTransitionName() != null && this.mTargetNameExcludes.contains(view.getTransitionName())) {
                return false;
            }
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null) {
            WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
            if (arrayList6.contains(view.getTransitionName())) {
                return true;
            }
        }
        if (this.mTargetTypes != null) {
            for (int i3 = 0; i3 < this.mTargetTypes.size(); i3++) {
                if (this.mTargetTypes.get(i3).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void notifyListeners(j jVar, boolean z) {
        notifyFromTransition(this, jVar, z);
    }

    public void pause(View view) {
        if (this.mEnded) {
            return;
        }
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.pause();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(j.E7, false);
        this.mPaused = true;
    }

    public void playTransition(ViewGroup viewGroup) {
        d dVar;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        matchStartAndEnd(this.mStartValues, this.mEndValues);
        zk3<Animator, d> runningAnimators = getRunningAnimators();
        int i2 = runningAnimators.d;
        WindowId windowId = viewGroup.getWindowId();
        ArrayList arrayList = new ArrayList();
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            Animator f2 = runningAnimators.f(i3);
            if (f2 != null && (dVar = runningAnimators.get(f2)) != null) {
                vlp0 vlp0Var = dVar.e;
                View view = dVar.a;
                if (view != null && windowId.equals(dVar.d)) {
                    gnp0 gnp0Var = dVar.c;
                    gnp0 transitionValues = getTransitionValues(view, true);
                    gnp0 matchedTransitionValues = getMatchedTransitionValues(view, true);
                    if (transitionValues == null && matchedTransitionValues == null) {
                        matchedTransitionValues = this.mEndValues.a.get(view);
                    }
                    if ((transitionValues != null || matchedTransitionValues != null) && vlp0Var.isTransitionRequired(gnp0Var, matchedTransitionValues)) {
                        if (vlp0Var.getRootTransition().mSeekController != null) {
                            f2.cancel();
                            vlp0Var.mCurrentAnimators.remove(f2);
                            runningAnimators.h(i3);
                            if (vlp0Var.mCurrentAnimators.size() == 0) {
                                arrayList.add(vlp0Var);
                            }
                        } else if (f2.isRunning() || f2.isStarted()) {
                            f2.cancel();
                        } else {
                            runningAnimators.h(i3);
                        }
                    }
                }
            }
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            vlp0 vlp0Var2 = (vlp0) arrayList.get(i4);
            vlp0Var2.notifyListeners(j.D7, false);
            if (!vlp0Var2.mEnded) {
                vlp0Var2.mEnded = true;
                vlp0Var2.notifyListeners(j.C7, false);
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        if (this.mSeekController == null) {
            runAnimators();
        } else if (Build.VERSION.SDK_INT >= 34) {
            prepareAnimatorsForSeeking();
            this.mSeekController.i();
            this.mSeekController.j();
        }
    }

    public void prepareAnimatorsForSeeking() {
        zk3<Animator, d> runningAnimators = getRunningAnimators();
        this.mTotalDuration = 0L;
        for (int i2 = 0; i2 < this.mAnimators.size(); i2++) {
            Animator animator = this.mAnimators.get(i2);
            d dVar = runningAnimators.get(animator);
            if (animator != null && dVar != null) {
                Animator animator2 = dVar.f;
                if (getDuration() >= 0) {
                    animator2.setDuration(getDuration());
                }
                if (getStartDelay() >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + getStartDelay());
                }
                if (getInterpolator() != null) {
                    animator2.setInterpolator(getInterpolator());
                }
                this.mCurrentAnimators.add(animator);
                this.mTotalDuration = Math.max(this.mTotalDuration, g.a(animator));
            }
        }
        this.mAnimators.clear();
    }

    public vlp0 removeListener(i iVar) {
        vlp0 vlp0Var;
        ArrayList<i> arrayList = this.mListeners;
        if (arrayList != null) {
            if (!arrayList.remove(iVar) && (vlp0Var = this.mCloneParent) != null) {
                vlp0Var.removeListener(iVar);
            }
            if (this.mListeners.size() == 0) {
                this.mListeners = null;
            }
        }
        return this;
    }

    public vlp0 removeTarget(View view) {
        this.mTargets.remove(view);
        return this;
    }

    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                int size = this.mCurrentAnimators.size();
                Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
                this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    Animator animator = animatorArr[i2];
                    animatorArr[i2] = null;
                    animator.resume();
                }
                this.mAnimatorCache = animatorArr;
                notifyListeners(j.F7, false);
            }
            this.mPaused = false;
        }
    }

    public void runAnimators() {
        start();
        zk3<Animator, d> runningAnimators = getRunningAnimators();
        Iterator<Animator> it = this.mAnimators.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (runningAnimators.containsKey(next)) {
                start();
                runAnimator(next, runningAnimators);
            }
        }
        this.mAnimators.clear();
        end();
    }

    public void setCurrentPlayTimeMillis(long j2, long j3) {
        long totalDurationMillis = getTotalDurationMillis();
        int i2 = 0;
        boolean z = j2 < j3;
        if ((j3 < 0 && j2 >= 0) || (j3 > totalDurationMillis && j2 <= totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(j.B7, z);
        }
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        while (i2 < size) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            g.b(animator, Math.min(Math.max(0L, j2), g.a(animator)));
            i2++;
            totalDurationMillis = totalDurationMillis;
        }
        long j4 = totalDurationMillis;
        this.mAnimatorCache = animatorArr;
        if ((j2 <= j4 || j3 > j4) && (j2 >= 0 || j3 < 0)) {
            return;
        }
        if (j2 > j4) {
            this.mEnded = true;
        }
        notifyListeners(j.C7, z);
    }

    public vlp0 setDuration(long j2) {
        this.mDuration = j2;
        return this;
    }

    public void setEpicenterCallback(f fVar) {
        this.mEpicenterCallback = fVar;
    }

    public vlp0 setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!isValidMatch(iArr[i2])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (alreadyContains(iArr, i2)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    public void setPathMotion(pq90 pq90Var) {
        if (pq90Var == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = pq90Var;
        }
    }

    public void setPropagation(bnp0 bnp0Var) {
        this.mPropagation = bnp0Var;
    }

    public vlp0 setStartDelay(long j2) {
        this.mStartDelay = j2;
        return this;
    }

    public void start() {
        if (this.mNumInstances == 0) {
            notifyListeners(j.B7, false);
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public String toString() {
        return toString("");
    }

    public vlp0 addTarget(int i2) {
        if (i2 != 0) {
            this.mTargetIds.add(Integer.valueOf(i2));
        }
        return this;
    }

    @Override // 
    public vlp0 clone() {
        try {
            vlp0 vlp0Var = (vlp0) super.clone();
            vlp0Var.mAnimators = new ArrayList<>();
            vlp0Var.mStartValues = new hnp0();
            vlp0Var.mEndValues = new hnp0();
            vlp0Var.mStartValuesList = null;
            vlp0Var.mEndValuesList = null;
            vlp0Var.mSeekController = null;
            vlp0Var.mCloneParent = this;
            vlp0Var.mListeners = null;
            return vlp0Var;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public vlp0 excludeChildren(int i2, boolean z) {
        this.mTargetIdChildExcludes = excludeId(this.mTargetIdChildExcludes, i2, z);
        return this;
    }

    public vlp0 excludeTarget(int i2, boolean z) {
        this.mTargetIdExcludes = excludeId(this.mTargetIdExcludes, i2, z);
        return this;
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.mDuration != -1) {
            sb.append("dur(");
            sb.append(this.mDuration);
            sb.append(") ");
        }
        if (this.mStartDelay != -1) {
            sb.append("dly(");
            sb.append(this.mStartDelay);
            sb.append(") ");
        }
        if (this.mInterpolator != null) {
            sb.append("interp(");
            sb.append(this.mInterpolator);
            sb.append(") ");
        }
        if (this.mTargetIds.size() > 0 || this.mTargets.size() > 0) {
            sb.append("tgts(");
            if (this.mTargetIds.size() > 0) {
                for (int i2 = 0; i2 < this.mTargetIds.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.mTargetIds.get(i2));
                }
            }
            if (this.mTargets.size() > 0) {
                for (int i3 = 0; i3 < this.mTargets.size(); i3++) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.mTargets.get(i3));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public vlp0 addTarget(String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    public vlp0 excludeTarget(String str, boolean z) {
        this.mTargetNameExcludes = excludeObject(this.mTargetNameExcludes, str, z);
        return this;
    }

    public vlp0 excludeTarget(Class<?> cls, boolean z) {
        this.mTargetTypeExcludes = excludeType(this.mTargetTypeExcludes, cls, z);
        return this;
    }

    public vlp0 addTarget(Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    public vlp0(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jtm0.b);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long f2 = ytp0.f(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (f2 >= 0) {
            setDuration(f2);
        }
        long f3 = ytp0.f(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (f3 > 0) {
            setStartDelay(f3);
        }
        int g2 = ytp0.g(obtainStyledAttributes, xmlResourceParser);
        if (g2 > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, g2));
        }
        String h2 = ytp0.h(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (h2 != null) {
            setMatchOrder(parseMatchOrder(h2));
        }
        obtainStyledAttributes.recycle();
    }
}
