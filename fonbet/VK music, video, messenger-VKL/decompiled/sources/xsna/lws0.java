package xsna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.vk.video.ui.discovery.minimizable.dialog.VideoDialogType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: VideoMinimizablePlayerCustomDialogsStackManager.kt */
/* loaded from: classes7.dex */
public final class lws0 {
    public static final ArrayList b;
    public final FragmentManager a;

    static {
        zrp<VideoDialogType> h = VideoDialogType.h();
        ArrayList arrayList = new ArrayList(c5g.u(h, 10));
        Iterator<E> it = h.iterator();
        while (it.hasNext()) {
            arrayList.add(((VideoDialogType) it.next()).i());
        }
        b = arrayList;
    }

    public lws0(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public final void a(String str, boolean z) {
        Iterator it = j5g.y0(b()).iterator();
        while (it.hasNext()) {
            String tag = ((Fragment) it.next()).getTag();
            if (epx.f(tag, str) && !z) {
                return;
            }
            c(tag);
            if (epx.f(tag, str)) {
                return;
            }
        }
    }

    public final ArrayList b() {
        List<Fragment> f = this.a.c.f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : f) {
            if (j5g.P(b, ((Fragment) obj).getTag())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void c(String str) {
        FragmentManager fragmentManager = this.a;
        Fragment H = fragmentManager.H(str);
        if (H != null) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
            aVar.q(H);
            aVar.l();
        }
        Fragment fragment = (Fragment) j5g.k0(b());
        if (fragment != null) {
            Lifecycle.State state = Lifecycle.State.RESUMED;
            fragmentManager.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager);
            aVar2.r(fragment, state);
            aVar2.l();
        }
    }
}
