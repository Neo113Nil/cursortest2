package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.core.fragments.FragmentImpl;
import kotlin.LazyThreadSafetyMode;

/* compiled from: NewsfeedListOverlayFragmentLifecycleListener.kt */
/* loaded from: classes4.dex */
public final class nr60 implements obs {
    public FragmentImpl b;
    public final fo60 c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new d2(25));
    public final lr60 e = new mcs() { // from class: xsna.lr60
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.mcs
        public final void a(Fragment fragment) {
            if ((fragment instanceof y1r) && ((y1r) fragment).Sc()) {
                fragment.getLifecycle().addObserver(new mr60(nr60.this));
            }
        }
    };

    /* JADX WARN: Type inference failed for: r1v3, types: [xsna.lr60] */
    public nr60(FragmentImpl fragmentImpl, fo60 fo60Var) {
        this.b = fragmentImpl;
        this.c = fo60Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.obs
    public final void onCreate(Bundle bundle) {
        FragmentImpl fragmentImpl;
        FragmentActivity activity;
        FragmentManager supportFragmentManager;
        if (!((Boolean) this.d.getValue()).booleanValue() || (fragmentImpl = this.b) == null || (activity = fragmentImpl.getActivity()) == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.p.add(this.e);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.obs
    public final void onDestroy() {
        FragmentImpl fragmentImpl;
        FragmentActivity activity;
        FragmentManager supportFragmentManager;
        mbs mbsVar;
        FragmentImpl fragmentImpl2 = this.b;
        if (fragmentImpl2 != null && (mbsVar = fragmentImpl2.D) != null) {
            mbsVar.d(this);
        }
        if (((Boolean) this.d.getValue()).booleanValue() && (fragmentImpl = this.b) != null && (activity = fragmentImpl.getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager.p.remove(this.e);
        }
        this.b = null;
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
    public final void onPause() {
    }

    @Override // xsna.obs
    public final void onResume() {
    }

    @Override // xsna.obs
    public final void onStop() {
    }

    @Override // xsna.obs
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // xsna.obs
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
