package xsna;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: FragmentStateMonitor.java */
/* loaded from: classes13.dex */
public final class zcs extends FragmentManager.m {
    public static final ra2 f = ra2.d();
    public final WeakHashMap<Fragment, Trace> a = new WeakHashMap<>();
    public final bvf b;
    public final xop0 c;
    public final u93 d;
    public final pfs e;

    public zcs(bvf bvfVar, xop0 xop0Var, u93 u93Var, pfs pfsVar) {
        this.b = bvfVar;
        this.c = xop0Var;
        this.d = u93Var;
        this.e = pfsVar;
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public final void e(@NonNull Fragment fragment) {
        kt80 kt80Var;
        Object[] objArr = {fragment.getClass().getSimpleName()};
        ra2 ra2Var = f;
        ra2Var.b("FragmentMonitor %s.onFragmentPaused ", objArr);
        WeakHashMap<Fragment, Trace> weakHashMap = this.a;
        if (!weakHashMap.containsKey(fragment)) {
            ra2Var.i("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = weakHashMap.get(fragment);
        weakHashMap.remove(fragment);
        pfs pfsVar = this.e;
        HashMap hashMap = pfsVar.c;
        ra2 ra2Var2 = pfs.e;
        if (!pfsVar.d) {
            ra2Var2.a();
            kt80Var = new kt80();
        } else if (hashMap.containsKey(fragment)) {
            ofs ofsVar = (ofs) hashMap.remove(fragment);
            kt80<ofs> a = pfsVar.a();
            if (a.b()) {
                ofs a2 = a.a();
                kt80Var = new kt80(new ofs(a2.a - ofsVar.a, a2.b - ofsVar.b, a2.c - ofsVar.c));
            } else {
                ra2Var2.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                kt80Var = new kt80();
            }
        } else {
            ra2Var2.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            kt80Var = new kt80();
        }
        if (!kt80Var.b()) {
            ra2Var.i("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            edh0.a(trace, (ofs) kt80Var.a());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public final void g(@NonNull Fragment fragment) {
        f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace("_st_".concat(fragment.getClass().getSimpleName()), this.c, this.b, this.d);
        trace.start();
        trace.putAttribute("Parent_fragment", fragment.getParentFragment() == null ? "No parent" : fragment.getParentFragment().getClass().getSimpleName());
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.a.put(fragment, trace);
        pfs pfsVar = this.e;
        HashMap hashMap = pfsVar.c;
        ra2 ra2Var = pfs.e;
        if (!pfsVar.d) {
            ra2Var.a();
            return;
        }
        if (hashMap.containsKey(fragment)) {
            ra2Var.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        kt80<ofs> a = pfsVar.a();
        if (a.b()) {
            hashMap.put(fragment, a.a());
        } else {
            ra2Var.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }
}
