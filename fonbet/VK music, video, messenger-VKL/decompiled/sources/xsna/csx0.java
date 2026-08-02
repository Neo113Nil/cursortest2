package xsna;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseIntArray;
import android.view.Window;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.jmk;

/* compiled from: WindowsFrameFreezeChecker.kt */
/* loaded from: classes3.dex */
public final class csx0 implements efs {
    public final qus a;
    public final jmk b;
    public final bpn0 c;
    public final LinkedHashMap<ScrollScreenType, WeakReference<Runnable>> d;

    public csx0(qus qusVar) {
        jmk jmkVar = new jmk();
        bpn0 bpn0Var = new bpn0(new uv80(21));
        this.a = qusVar;
        this.b = jmkVar;
        this.c = bpn0Var;
        this.d = new LinkedHashMap<>();
    }

    @Override // xsna.efs
    public final void a(Window window, mbs mbsVar, ScrollScreenType scrollScreenType, long j) {
        mbsVar.a(new a(window, scrollScreenType, j, mbsVar));
    }

    @Override // xsna.efs
    public final void b(Activity activity, mbs mbsVar, ScrollScreenType scrollScreenType, long j) {
        a(activity.getWindow(), mbsVar, scrollScreenType, j);
    }

    public final void c(ScrollScreenType scrollScreenType, WeakReference<Runnable> weakReference) {
        SparseIntArray[] sparseIntArrayArr;
        SparseIntArray sparseIntArray;
        Runnable runnable = weakReference.get();
        if (runnable != null) {
            ((Handler) this.c.getValue()).removeCallbacks(runnable);
        }
        jmk jmkVar = this.b;
        try {
            jmk.a aVar = jmkVar.a;
            ArrayList<WeakReference<Window>> arrayList = aVar.c;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                WeakReference<Window> weakReference2 = arrayList.get(size);
                Window window = weakReference2.get();
                if (weakReference2.get() != null) {
                    if (window != null) {
                        window.removeOnFrameMetricsAvailableListener(aVar.d);
                    }
                    arrayList.remove(size);
                }
            }
            sparseIntArrayArr = aVar.b;
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(th);
        }
        if (sparseIntArrayArr != null && (sparseIntArray = sparseIntArrayArr[0]) != null) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"WindowsFrameFreezeChecker: Send FTR for screen = " + scrollScreenType});
            }
            qus qusVar = this.a;
            qusVar.getClass();
            new io.reactivex.rxjava3.internal.operators.single.v(new hae(sparseIntArray, 1)).q(io.reactivex.rxjava3.schedulers.a.a()).subscribe(new qs2(new hn0(14, qusVar, scrollScreenType), 17));
            jmk.a aVar2 = jmkVar.a;
            SparseIntArray[] sparseIntArrayArr2 = aVar2.b;
            aVar2.b = new SparseIntArray[9];
        }
    }

    /* compiled from: WindowsFrameFreezeChecker.kt */
    public static final class a implements obs {
        public final mls0 b;
        public final /* synthetic */ ScrollScreenType d;
        public final /* synthetic */ long e;
        public final /* synthetic */ mbs f;

        public a(Window window, ScrollScreenType scrollScreenType, long j, mbs mbsVar) {
            this.d = scrollScreenType;
            this.e = j;
            this.f = mbsVar;
            this.b = new mls0(csx0.this, window, scrollScreenType, 1);
        }

        @Override // xsna.obs
        public final void onDestroy() {
            this.f.d(this);
        }

        @Override // xsna.obs
        public final void onPause() {
            Runnable runnable;
            Runnable runnable2;
            csx0 csx0Var = csx0.this;
            bpn0 bpn0Var = csx0Var.c;
            Map.Entry entry = (Map.Entry) j5g.j0(csx0Var.d.entrySet());
            ScrollScreenType scrollScreenType = entry != null ? (ScrollScreenType) entry.getKey() : null;
            ScrollScreenType scrollScreenType2 = this.d;
            if (scrollScreenType != scrollScreenType2) {
                WeakReference<Runnable> weakReference = csx0Var.d.get(scrollScreenType2);
                if (weakReference != null && (runnable = weakReference.get()) != null) {
                    ((Handler) bpn0Var.getValue()).removeCallbacks(runnable);
                }
                csx0Var.d.remove(scrollScreenType2);
                return;
            }
            WeakReference<Runnable> weakReference2 = csx0Var.d.get(scrollScreenType2);
            if (weakReference2 != null) {
                csx0Var.c(scrollScreenType2, weakReference2);
                csx0Var.d.remove(scrollScreenType2);
            }
            Map.Entry entry2 = (Map.Entry) j5g.j0(csx0Var.d.entrySet());
            if (entry2 == null || (runnable2 = (Runnable) ((WeakReference) entry2.getValue()).get()) == null) {
                return;
            }
            ((Handler) bpn0Var.getValue()).removeCallbacks(runnable2);
            ((Handler) bpn0Var.getValue()).postDelayed(runnable2, dx90.V);
        }

        @Override // xsna.obs
        public final void onResume() {
            csx0 csx0Var = csx0.this;
            Map.Entry entry = (Map.Entry) j5g.j0(csx0Var.d.entrySet());
            if (entry != null) {
                csx0Var.c((ScrollScreenType) entry.getKey(), (WeakReference) entry.getValue());
            }
            LinkedHashMap<ScrollScreenType, WeakReference<Runnable>> linkedHashMap = csx0Var.d;
            mls0 mls0Var = this.b;
            linkedHashMap.put(this.d, new WeakReference<>(mls0Var));
            ((Handler) csx0Var.c.getValue()).postDelayed(mls0Var, this.e);
        }

        @Override // xsna.obs
        public final void b() {
        }

        @Override // xsna.obs
        public final void c() {
        }

        @Override // xsna.obs
        public final void onDestroyView() {
        }

        @Override // xsna.obs
        public final void onStop() {
        }

        @Override // xsna.obs
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // xsna.obs
        public final void onCreate(Bundle bundle) {
        }

        @Override // xsna.obs
        public final void onActivityResult(int i, int i2, Intent intent) {
        }
    }
}
