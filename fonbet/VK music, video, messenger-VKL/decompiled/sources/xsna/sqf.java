package xsna;

import android.view.LayoutInflater;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.core.apps.BuildInfo;
import java.util.LinkedHashSet;

/* compiled from: ClipsWrapperFeedHost.kt */
/* loaded from: classes17.dex */
public final class sqf implements iwc, cge, e7e, yfe, age, wfe, sfe, ege {
    public final /* synthetic */ vfe b;
    public final ClipsWrapperFragment c;
    public final cge d;
    public final nie e;
    public final ufe f;
    public final dge g;
    public final ClipsWrapperInputArguments h;
    public final ClipsWrapperFragment.f i;
    public final boolean j;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if ((r2 != null ? r2.o : false) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sqf(ClipsWrapperFragment clipsWrapperFragment, ouf oufVar, nie nieVar, ufe ufeVar, dge dgeVar, ClipsWrapperInputArguments clipsWrapperInputArguments, ClipsWrapperFragment.f fVar) {
        boolean z;
        this.b = new vfe(clipsWrapperFragment);
        this.c = clipsWrapperFragment;
        this.d = oufVar;
        this.e = nieVar;
        this.f = ufeVar;
        this.g = dgeVar;
        this.h = clipsWrapperInputArguments;
        this.i = fVar;
        if (!clipsWrapperFragment.o) {
            Fragment parentFragment = clipsWrapperFragment.getParentFragment();
            androidx.fragment.app.d dVar = parentFragment instanceof androidx.fragment.app.d ? (androidx.fragment.app.d) parentFragment : null;
            z = false;
        }
        z = true;
        this.j = z;
    }

    @Override // xsna.wfe
    public final void a() {
        this.f.a();
    }

    @Override // xsna.sfe
    public final boolean b() {
        return this.f.b();
    }

    @Override // xsna.age
    public final void c(String str) {
        this.f.c(str);
    }

    @Override // xsna.iwc
    public final boolean d(Fragment fragment) {
        return fragment.isResumed() && e();
    }

    @Override // xsna.iwc
    public final boolean e() {
        ClipsWrapperFragment clipsWrapperFragment = this.c;
        if (clipsWrapperFragment.isHidden()) {
            return false;
        }
        Fragment parentFragment = clipsWrapperFragment.getParentFragment();
        if (parentFragment != null && parentFragment.isHidden()) {
            return false;
        }
        LayoutInflater.Factory activity = clipsWrapperFragment.getActivity();
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
        fcn z = Y != null ? Y.z() : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            if (z == null || z.equals(clipsWrapperFragment.getParentFragment())) {
                break;
            }
            if (z instanceof ClipsOwnerSwipeFragment) {
                return false;
            }
            if (linkedHashSet.add(z)) {
                z = Y != null ? Y.v(z) : null;
            } else if (BuildInfo.h()) {
                throw new IllegalStateException("Same dialog found in stack more then once: " + z);
            }
        }
        return true;
    }

    @Override // xsna.iwc
    public final void f(boolean z) {
        dge dgeVar = this.g;
        ((urf) dgeVar.c).b((String) dgeVar.b, new quf(z));
    }

    @Override // xsna.iwc
    public final void finish() {
        this.i.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.iwc
    public final boolean g() {
        ClipsWrapperInputArguments clipsWrapperInputArguments = this.h;
        return (clipsWrapperInputArguments.e() || ((Boolean) clipsWrapperInputArguments.m.getValue()).booleanValue()) ? false : true;
    }

    @Override // xsna.ege
    public final Window getWindow() {
        return this.b.getWindow();
    }

    @Override // xsna.iwc
    public final boolean h() {
        return this.j;
    }

    @Override // xsna.e7e
    public final void i(int i, hfz hfzVar, boolean z) {
        this.e.i(i, hfzVar, z);
    }

    @Override // xsna.wfe
    public final void j(hjj0 hjj0Var) {
        this.f.j(hjj0Var);
    }

    @Override // xsna.cge
    public final void k(ClipFeedListFragment clipFeedListFragment) {
        this.d.k(clipFeedListFragment);
    }

    @Override // xsna.yfe
    public final void m(String str) {
        this.f.m(str);
    }
}
