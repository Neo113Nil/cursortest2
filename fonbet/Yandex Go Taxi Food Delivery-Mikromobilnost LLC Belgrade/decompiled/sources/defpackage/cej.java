package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.view.b;
import androidx.view.c;
import androidx.view.f;
import androidx.view.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcej;", "Landroidx/navigation/j;", "Lzdj;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@oa50("dialog")
/* loaded from: classes10.dex */
public final class cej extends j {
    public final Context c;
    public final FragmentManager d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final bej f = new bej(this);
    public final LinkedHashMap g = new LinkedHashMap();

    public cej(Context context, FragmentManager fragmentManager) {
        this.c = context;
        this.d = fragmentManager;
    }

    @Override // androidx.view.j
    public final f a() {
        return new zdj(this);
    }

    @Override // androidx.view.j
    public final void d(List list, k550 k550Var) {
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.S()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            k(bVar).show(fragmentManager, bVar.y);
            b bVar2 = (b) a.b0((List) b().e.a.getValue());
            boolean G = a.G((Iterable) b().f.a.getValue(), bVar2);
            b().h(bVar);
            if (bVar2 != null && !G) {
                b().b(bVar2);
            }
        }
    }

    @Override // androidx.view.j
    public final void e(c cVar) {
        Lifecycle lifecycle;
        super.e(cVar);
        Iterator it = ((List) cVar.e.a.getValue()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            FragmentManager fragmentManager = this.d;
            if (!hasNext) {
                fragmentManager.q.add(new ydj(0, this));
                return;
            }
            b bVar = (b) it.next();
            DialogFragment dialogFragment = (DialogFragment) fragmentManager.F(bVar.y);
            if (dialogFragment == null || (lifecycle = dialogFragment.getLifecycle()) == null) {
                this.e.add(bVar.y);
            } else {
                lifecycle.a(this.f);
            }
        }
    }

    @Override // androidx.view.j
    public final void f(b bVar) {
        String str = bVar.y;
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.S()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        DialogFragment dialogFragment = (DialogFragment) this.g.get(str);
        if (dialogFragment == null) {
            Fragment F = fragmentManager.F(str);
            dialogFragment = F instanceof DialogFragment ? (DialogFragment) F : null;
        }
        if (dialogFragment != null) {
            dialogFragment.getLifecycle().d(this.f);
            dialogFragment.dismiss();
        }
        k(bVar).show(fragmentManager, str);
        kf50 b = b();
        List list = (List) b.e.a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            b bVar2 = (b) listIterator.previous();
            if (jl40.l(bVar2.y, str)) {
                r0 r0Var = b.c;
                r0Var.m(null, v4r0.i(v4r0.i((Set) r0Var.getValue(), bVar2), bVar));
                b.c(bVar);
                return;
            }
        }
        w511.i("List contains no element matching the predicate.");
    }

    @Override // androidx.view.j
    public final void i(b bVar, boolean z) {
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.S()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().e.a.getValue();
        int indexOf = list.indexOf(bVar);
        Iterator it = a.q0(list.subList(indexOf, list.size())).iterator();
        while (it.hasNext()) {
            Fragment F = fragmentManager.F(((b) it.next()).y);
            if (F != null) {
                ((DialogFragment) F).dismiss();
            }
        }
        l(indexOf, bVar, z);
    }

    public final DialogFragment k(b bVar) {
        zdj zdjVar = (zdj) bVar.b;
        String str = zdjVar.E;
        if (str == null) {
            ny61.r("DialogFragment class was not set");
            return null;
        }
        char charAt = str.charAt(0);
        Context context = this.c;
        if (charAt == '.') {
            str = context.getPackageName() + str;
        }
        Fragment a = this.d.M().a(context.getClassLoader(), str);
        if (DialogFragment.class.isAssignableFrom(a.getClass())) {
            DialogFragment dialogFragment = (DialogFragment) a;
            dialogFragment.setArguments(bVar.a());
            dialogFragment.getLifecycle().a(this.f);
            this.g.put(bVar.y, dialogFragment);
            return dialogFragment;
        }
        StringBuilder sb = new StringBuilder("Dialog destination ");
        String str2 = zdjVar.E;
        if (str2 != null) {
            w511.f(oyr.t(sb, str2, " is not an instance of DialogFragment"));
            return null;
        }
        ny61.r("DialogFragment class was not set");
        return null;
    }

    public final void l(int i, b bVar, boolean z) {
        b bVar2 = (b) a.S(i - 1, (List) b().e.a.getValue());
        boolean G = a.G((Iterable) b().f.a.getValue(), bVar2);
        b().e(bVar, z);
        if (bVar2 == null || G) {
            return;
        }
        b().b(bVar2);
    }
}
