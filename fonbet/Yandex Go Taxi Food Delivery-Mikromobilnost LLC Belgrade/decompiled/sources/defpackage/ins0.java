package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ScrollView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.RecyclerView;
import com.lightside.slab.SaveStateView;
import com.lightside.slab.SlabController;
import com.lightside.slab.SlabHookResultFragment;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public abstract class ins0 implements lns0, tse, v40 {
    public sls A;
    public final a B;
    public final AtomicInteger C;
    public final es90 a;
    public final qhw0 b;
    public final SlabController c;
    public Bundle w;
    public SaveStateView x;
    public String y;
    public boolean z;

    public static final class a implements pey {
        public final t a = new t(this, true);

        @Override // defpackage.pey
        public final Lifecycle getLifecycle() {
            return this.a;
        }
    }

    public ins0() {
        sjh sjhVar = uyj.a;
        this.a = new es90(o400.a.x);
        this.b = jl40.a();
        this.c = new SlabController(this, true);
        this.A = new bgc(12);
        this.B = new a();
        this.C = new AtomicInteger();
    }

    @Override // defpackage.lns0
    public void a() {
        sls ppr0Var;
        es90 es90Var = this.a;
        es90Var.w = false;
        Iterator it = es90Var.x.iterator();
        while (it.hasNext()) {
            ds90 ds90Var = (ds90) it.next();
            it.remove();
            ds90Var.c.o(ds90Var.a, ds90Var.b);
        }
        f(this.w);
        this.w = null;
        Object context = e().getContext();
        Lifecycle lifecycle = context instanceof pey ? ((pey) context).getLifecycle() : null;
        if (lifecycle == null) {
            ppr0Var = new bgc(12);
        } else {
            wj6 wj6Var = new wj6(6, this);
            lifecycle.a(wj6Var);
            ppr0Var = new ppr0(11, lifecycle, wj6Var);
        }
        this.A = ppr0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if ((r0 instanceof android.widget.ScrollView) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View b() {
        ViewGroup viewGroup;
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            Looper.getMainLooper();
            Looper.myLooper();
        }
        if (!this.z) {
            this.z = true;
            g();
            e().addOnAttachStateChangeListener(this.c);
        }
        View e = e();
        if (e instanceof ViewGroup) {
            viewGroup = (ViewGroup) e;
            if (!(viewGroup instanceof RecyclerView)) {
            }
        }
        viewGroup = null;
        if (e().getId() != -1 && viewGroup != null && this.x == null) {
            SaveStateView saveStateView = new SaveStateView(e().getContext(), this);
            saveStateView.setVisibility(8);
            saveStateView.setId((e().getId() & 16777215) | 419430400);
            this.x = saveStateView;
            viewGroup.addView(saveStateView, new ViewGroup.LayoutParams(-2, -2));
        }
        ViewGroup.LayoutParams j = j(e());
        if (j != null) {
            e().setLayoutParams(j);
        }
        return e();
    }

    public String d() {
        String str = this.y;
        if (str != null) {
            return str;
        }
        String uuid = UUID.randomUUID().toString();
        this.y = uuid;
        return uuid;
    }

    public abstract View e();

    public void f(Bundle bundle) {
    }

    public void g() {
        this.B.a.i(Lifecycle.State.CREATED);
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        return this.a.plus(this.b);
    }

    public void h() {
        this.b.a(null);
        es90 es90Var = this.a;
        es90Var.w = true;
        es90Var.x.clear();
        this.B.a.i(Lifecycle.State.DESTROYED);
    }

    public void i(Bundle bundle) {
    }

    public ViewGroup.LayoutParams j(View view) {
        return null;
    }

    public final View k(View view) {
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            Looper.getMainLooper();
            Looper.myLooper();
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = null;
        if (!(parent instanceof ViewGroup)) {
            ny61.r("viewToReplace must be attached to parent");
            return null;
        }
        if (e() == view) {
            return view;
        }
        if (!this.z) {
            this.z = true;
            g();
            e().addOnAttachStateChangeListener(this.c);
        }
        ViewGroup viewGroup2 = (ViewGroup) parent;
        int indexOfChild = viewGroup2.indexOfChild(view);
        viewGroup2.removeViewInLayout(view);
        if (view.getId() != -1) {
            e().setId(view.getId());
        }
        View e = e();
        if (e instanceof ViewGroup) {
            ViewGroup viewGroup3 = (ViewGroup) e;
            if (!(viewGroup3 instanceof RecyclerView) && !(viewGroup3 instanceof ScrollView)) {
                viewGroup = viewGroup3;
            }
        }
        if (view.getId() != -1 && viewGroup != null && this.x == null) {
            SaveStateView saveStateView = new SaveStateView(e().getContext(), this);
            saveStateView.setVisibility(8);
            saveStateView.setId((view.getId() & 16777215) | 419430400);
            this.x = saveStateView;
            viewGroup.addView(saveStateView, new ViewGroup.LayoutParams(-2, -2));
        }
        ViewGroup.LayoutParams j = j(e());
        if (j == null) {
            j = view.getLayoutParams();
        }
        if (j != null) {
            viewGroup2.addView(e(), indexOfChild, j);
        } else {
            viewGroup2.addView(e(), indexOfChild);
        }
        return e();
    }

    @Override // defpackage.lns0
    public void onDetach() {
        this.A.invoke();
        this.a.w = true;
        kotlinx.coroutines.a.h(this.b);
    }

    @Override // defpackage.lns0
    public void onPause() {
        this.B.a.i(Lifecycle.State.STARTED);
    }

    @Override // defpackage.lns0
    public void onResume() {
        this.B.a.i(Lifecycle.State.RESUMED);
    }

    @Override // defpackage.lns0
    public void onStart() {
        this.B.a.i(Lifecycle.State.STARTED);
    }

    @Override // defpackage.lns0
    public void onStop() {
        this.B.a.i(Lifecycle.State.CREATED);
    }

    @Override // defpackage.v40
    public final m50 registerForActivityResult(x40 x40Var, u40 u40Var) {
        SlabHookResultFragment slabHookResultFragment;
        Activity b = pdb1.b(e().getContext());
        if (!(b instanceof ComponentActivity)) {
            b = null;
        }
        x50 x50Var = (ComponentActivity) b;
        if (x50Var == null) {
            Activity b2 = pdb1.b(e().getContext());
            FragmentActivity fragmentActivity = b2 instanceof FragmentActivity ? (FragmentActivity) b2 : null;
            if (fragmentActivity == null) {
                ny61.r("not a fragment activity");
                return null;
            }
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Fragment F = supportFragmentManager.F(SlabHookResultFragment.FRAGMENT_TAG);
            if (F instanceof SlabHookResultFragment) {
                slabHookResultFragment = (SlabHookResultFragment) F;
            } else {
                slabHookResultFragment = new SlabHookResultFragment();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.f(0, slabHookResultFragment, SlabHookResultFragment.FRAGMENT_TAG, 1);
                aVar.n();
            }
            x50Var = slabHookResultFragment.requireActivity();
        }
        return x50Var.getActivityResultRegistry().d("slab_" + d() + "_rq#" + this.C.getAndIncrement(), this.B, x40Var, u40Var);
    }
}
