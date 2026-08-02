package xsna;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.a;
import com.vk.navigation.SwipableTabsView;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.Pair;

/* compiled from: NavigationDelegateBottom.kt */
/* loaded from: classes.dex */
public final class rx50 implements a.InterfaceC0769a {
    public final /* synthetic */ nx50<AppCompatActivity> a;

    public rx50(nx50<AppCompatActivity> nx50Var) {
        this.a = nx50Var;
    }

    @Override // com.vk.core.fragments.a.InterfaceC0769a
    public final int a(FragmentImpl fragmentImpl) {
        View childAt;
        FragmentEntry Kn = fragmentImpl.Kn();
        Integer num = null;
        Bundle bundle = Kn != null ? Kn.c : null;
        boolean z = bundle != null ? bundle.getBoolean("over_bottom_bar", false) : false;
        nx50<AppCompatActivity> nx50Var = this.a;
        Class<?> p = nx50Var.y0().p(fragmentImpl);
        if (p == null) {
            p = fragmentImpl.getClass();
        }
        SwipableTabsView swipableTabsView = nx50Var.C;
        if (swipableTabsView != null) {
            Iterator<T> it = swipableTabsView.i.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                if (epx.f(((Pair) next).j(), p)) {
                    break;
                }
                i++;
            }
            Integer valueOf = i == -1 ? null : Integer.valueOf(i);
            if (valueOf != null && (childAt = swipableTabsView.getChildAt(valueOf.intValue())) != null) {
                num = Integer.valueOf(childAt.getId());
            }
        }
        SwipableTabsView swipableTabsView2 = nx50Var.C;
        if (swipableTabsView2 != null) {
            f4m.E(swipableTabsView2, num != null);
        }
        return num != null ? num.intValue() : (com.vk.toggle.d.J() && z) ? R.id.fragment_without_bottom_bar_wrapper : R.id.fragment_wrapper;
    }
}
