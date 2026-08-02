package sg.bigo.ads.core.mraid;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.common.utils.v;
import xsna.w11;

/* loaded from: classes9.dex */
public final class p {

    @NonNull
    final WeakReference<View> a;

    @Nullable
    b b;
    boolean c;

    @NonNull
    private final ViewTreeObserver.OnPreDrawListener j;

    @NonNull
    private WeakReference<ViewTreeObserver> k;
    float d = -1.0f;
    Rect e = new Rect();
    boolean f = false;
    boolean g = false;

    @NonNull
    private final Handler i = new Handler();

    @NonNull
    private final a h = new a();

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            View view;
            float f;
            p pVar;
            p pVar2;
            p pVar3;
            b bVar;
            sg.bigo.ads.core.mraid.b bVar2;
            p pVar4 = p.this;
            boolean z = false;
            pVar4.c = false;
            if (pVar4.b == null || (view = pVar4.a.get()) == null) {
                return;
            }
            Rect rect = new Rect();
            view.getLocalVisibleRect(rect);
            Rect rect2 = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            boolean isShown = view.isShown();
            float alpha = view.getAlpha();
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            boolean z2 = alpha == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            List arrayList = new ArrayList();
            if (globalVisibleRect && isShown && !z2) {
                Pair a = p.a(rect2, view);
                if (!((Boolean) a.first).booleanValue()) {
                    m mVar = new m((List) a.second, iArr);
                    float a2 = mVar.a();
                    float height = view.getHeight() * view.getWidth();
                    float height2 = rect.height() * rect.width();
                    if (height > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f = ((height2 - a2) * 100.0f) / height;
                        f2 = (height2 * 100.0f) / height;
                    } else {
                        f = 0.0f;
                    }
                    arrayList = mVar.a;
                    pVar = p.this;
                    if (f2 == pVar.d || !rect.equals(pVar.e)) {
                        pVar2 = p.this;
                        if (pVar2.f) {
                            f2 = f;
                        }
                        pVar2.d = f2;
                        pVar2.e = rect;
                        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                        pVar3 = p.this;
                        if (pVar3.f) {
                            bVar = pVar3.b;
                            if (globalVisibleRect && isShown && !z2) {
                                z = true;
                            }
                            bVar2 = new sg.bigo.ads.core.mraid.b(pVar3.d, p.a(pVar3.e, displayMetrics.densityDpi), null);
                        } else {
                            bVar = pVar3.b;
                            if (globalVisibleRect && isShown && !z2) {
                                z = true;
                            }
                            bVar2 = new sg.bigo.ads.core.mraid.b(pVar3.d, p.a(pVar3.e, displayMetrics.densityDpi), p.a(arrayList, displayMetrics.densityDpi));
                        }
                        bVar.a(z, bVar2);
                    }
                    return;
                }
            }
            f = 0.0f;
            pVar = p.this;
            if (f2 == pVar.d) {
            }
            pVar2 = p.this;
            if (pVar2.f) {
            }
            pVar2.d = f2;
            pVar2.e = rect;
            DisplayMetrics displayMetrics2 = view.getResources().getDisplayMetrics();
            pVar3 = p.this;
            if (pVar3.f) {
            }
            bVar.a(z, bVar2);
        }
    }

    public interface b {
        void a(boolean z, sg.bigo.ads.core.mraid.b bVar);
    }

    public p(@NonNull View view) {
        this.a = new WeakReference<>(view);
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: sg.bigo.ads.core.mraid.p.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                p.this.a();
                return true;
            }
        };
        this.j = onPreDrawListener;
        this.k = new WeakReference<>(null);
        Context context = view.getContext();
        ViewTreeObserver viewTreeObserver = this.k.get();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            View a2 = v.a(context, view);
            if (a2 == null) {
                sg.bigo.ads.bn.a.a(0, "VisibilityTracker", "Unable to set Visibility Tracker due to no available root view.");
                return;
            }
            ViewTreeObserver viewTreeObserver2 = a2.getViewTreeObserver();
            if (!viewTreeObserver2.isAlive()) {
                sg.bigo.ads.bn.a.a(0, "VisibilityTracker", "Visibility Tracker was unable to track views because the root view tree observer was not alive");
            } else {
                this.k = new WeakReference<>(viewTreeObserver2);
                viewTreeObserver2.addOnPreDrawListener(onPreDrawListener);
            }
        }
    }

    public static Rect a(Rect rect, int i) {
        return new Rect((rect.left * 160) / i, (rect.top * 160) / i, (rect.right * 160) / i, (rect.bottom * 160) / i);
    }

    public static /* synthetic */ Pair a(Rect rect, View view) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view.getRootView();
        ViewParent parent = view.getParent();
        View view2 = view;
        loop0: while (true) {
            ViewGroup viewGroup2 = (ViewGroup) parent;
            View view3 = view2;
            ViewGroup viewGroup3 = viewGroup2;
            while (true) {
                if (viewGroup3 == null) {
                    z = false;
                    break loop0;
                }
                z = true;
                if (viewGroup3.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    break loop0;
                }
                for (int indexOfChild = viewGroup3.indexOfChild(view3) + 1; indexOfChild < viewGroup3.getChildCount(); indexOfChild++) {
                    View childAt = viewGroup3.getChildAt(indexOfChild);
                    if (childAt.getVisibility() == 0) {
                        Rect d = w11.d(childAt);
                        if (Rect.intersects(rect, d)) {
                            arrayList.add(new Rect(Math.max(rect.left, d.left), Math.max(rect.top, d.top), Math.min(rect.right, d.right), Math.min(rect.bottom, d.bottom)));
                        }
                    }
                }
                if (viewGroup3 != viewGroup) {
                    break;
                }
                viewGroup3 = null;
            }
            parent = viewGroup3.getParent();
            view2 = viewGroup3;
        }
        return new Pair(Boolean.valueOf(z), arrayList);
    }

    public static /* synthetic */ List a(List list, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((Rect) it.next(), i));
        }
        return arrayList;
    }

    public final void a() {
        if (!this.c && this.g) {
            this.c = true;
            this.i.removeCallbacks(this.h);
            this.i.postDelayed(this.h, 500L);
        }
    }
}
