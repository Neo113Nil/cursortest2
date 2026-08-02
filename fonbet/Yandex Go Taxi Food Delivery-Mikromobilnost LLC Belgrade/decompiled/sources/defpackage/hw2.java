package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.m;
import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class hw2 implements qa50 {
    public final FragmentActivity a;
    public final int b;
    public final FragmentManager c;
    public final m d;
    public String e;
    public final ArrayList f = new ArrayList();

    public hw2(FragmentActivity fragmentActivity, int i, FragmentManager fragmentManager, m mVar) {
        this.a = fragmentActivity;
        this.b = i;
        this.c = fragmentManager;
        this.d = mVar;
    }

    public static void j(FragmentManager fragmentManager) {
        try {
            fragmentManager.W(0, null);
        } catch (Throwable unused) {
        }
    }

    public void a() {
        e().finish();
    }

    public final void b(dlc[] dlcVarArr) {
        h().C();
        ArrayList arrayList = this.f;
        arrayList.clear();
        int K = h().K();
        for (int i = 0; i < K; i++) {
            String str = ((a) h().J(i)).i;
            if (str == null) {
                ny61.r(qv10.g(i, "No back stack entry at "));
                return;
            }
            arrayList.add(str);
        }
        for (dlc dlcVar : dlcVarArr) {
            if (dlcVar instanceof vjc) {
                Screen screen = ((vjc) dlcVar).a;
                if (screen instanceof FragmentScreen) {
                    d((FragmentScreen) screen, i());
                }
            } else if (dlcVar instanceof jkc) {
                Screen screen2 = ((jkc) dlcVar).a;
                if (screen2 instanceof FragmentScreen) {
                    if (arrayList.isEmpty()) {
                        d((FragmentScreen) screen2, false);
                    } else {
                        j(h());
                        arrayList.remove(scc.f(arrayList));
                        d((FragmentScreen) screen2, i());
                    }
                }
            } else if (dlcVar instanceof ujc) {
                ujc ujcVar = (ujc) dlcVar;
                List list = ujcVar.b;
                Screen screen3 = ujcVar.a;
                if (screen3 == null) {
                    c();
                } else {
                    String screenKey = screen3.getScreenKey();
                    Iterator it = arrayList.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        } else if (jl40.l((String) it.next(), screenKey)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 != -1) {
                        try {
                            h().W(ujcVar.c ? 1 : 0, (String) arrayList.get(i2));
                        } catch (Throwable unused) {
                        }
                        if (i2 != arrayList.size()) {
                            arrayList.subList(i2 + 1, arrayList.size()).clear();
                        }
                    } else if (jl40.l(screenKey, this.e)) {
                        c();
                    } else {
                        List list2 = list;
                        if (list2 == null || list2.isEmpty()) {
                            c();
                        } else {
                            c();
                            int i3 = 0;
                            for (Object obj : list) {
                                int i4 = i3 + 1;
                                if (i3 < 0) {
                                    scc.m();
                                    throw null;
                                }
                                Screen screen4 = (Screen) obj;
                                if (i3 == 0) {
                                    if (screen4 instanceof FragmentScreen) {
                                        if (arrayList.isEmpty()) {
                                            d((FragmentScreen) screen4, false);
                                        } else {
                                            j(h());
                                            arrayList.remove(scc.f(arrayList));
                                            d((FragmentScreen) screen4, i());
                                        }
                                    }
                                } else if (screen4 instanceof FragmentScreen) {
                                    d((FragmentScreen) screen4, i());
                                }
                                i3 = i4;
                            }
                        }
                    }
                }
            } else if (!(dlcVar instanceof tjc)) {
                w511.b();
            } else if (arrayList.isEmpty()) {
                a();
            } else {
                j(h());
                arrayList.remove(scc.f(arrayList));
            }
        }
    }

    public final void c() {
        this.f.clear();
        try {
            h().W(1, null);
        } catch (Throwable unused) {
        }
    }

    public final void d(FragmentScreen fragmentScreen, boolean z) {
        Fragment createFragment = fragmentScreen.createFragment(g());
        FragmentManager h = h();
        a h2 = g8e.h(h, h);
        h2.p = true;
        k(h2, h().E(f()), createFragment, z);
        if (fragmentScreen.getClearContainer()) {
            h2.h(f(), createFragment, fragmentScreen.getScreenKey());
        } else {
            h2.f(f(), createFragment, fragmentScreen.getScreenKey(), 1);
        }
        ArrayList arrayList = this.f;
        if (z) {
            h2.c(fragmentScreen.getScreenKey());
            arrayList.add(fragmentScreen.getScreenKey());
        } else if (arrayList.isEmpty()) {
            this.e = fragmentScreen.getScreenKey();
        }
        h2.l(true, true);
    }

    public FragmentActivity e() {
        return this.a;
    }

    public int f() {
        return this.b;
    }

    public m g() {
        return this.d;
    }

    public FragmentManager h() {
        return this.c;
    }

    public final boolean i() {
        return h().E(f()) != null;
    }

    public void k(a aVar, Fragment fragment, Fragment fragment2, boolean z) {
    }
}
