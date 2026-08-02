package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.topbar.VkTopBar;
import java.util.HashSet;
import me.grishka.appkit.fragments.AppKitFragment;

/* compiled from: ToolbarHelper.kt */
/* loaded from: classes7.dex */
public final class h3p0 {
    public static final boolean a(FragmentImpl fragmentImpl) {
        LayoutInflater.Factory kn = fragmentImpl.kn();
        return kn instanceof ey50 ? ((ey50) kn).Y().k(fragmentImpl) : !fragmentImpl.kn().isTaskRoot();
    }

    public static final void b(FragmentImpl fragmentImpl) {
        LayoutInflater.Factory kn = fragmentImpl.kn();
        if (kn instanceof ey50) {
            ((ey50) kn).Y().L(fragmentImpl);
        } else if (a(fragmentImpl)) {
            fragmentImpl.finish();
        }
    }

    public static final void c(FragmentImpl fragmentImpl, Toolbar toolbar) {
        if (!f(fragmentImpl, toolbar) || toolbar == null) {
            return;
        }
        toolbar.setNavigationIcon((Drawable) null);
    }

    public static final void d(FragmentImpl fragmentImpl, VkTopBar vkTopBar) {
        if (!g(fragmentImpl, vkTopBar) || vkTopBar == null) {
            return;
        }
        vkTopBar.setBefore(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(FragmentActivity fragmentActivity, Context context) {
        boolean d;
        ey50 ey50Var = fragmentActivity instanceof ey50 ? (ey50) fragmentActivity : null;
        ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
        if (context == null) {
            return false;
        }
        if (Y != null) {
            HashSet hashSet = iah0.a;
            d = fnj.d(context);
        } else {
            HashSet hashSet2 = iah0.a;
            d = fnj.d(context);
        }
        return d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean f(FragmentImpl fragmentImpl, Toolbar toolbar) {
        FragmentActivity activity = fragmentImpl.getActivity();
        Context context = toolbar != null ? toolbar.getContext() : null;
        if ((fragmentImpl instanceof AppKitFragment) && !(activity instanceof ey50)) {
            return false;
        }
        if (activity instanceof ey50) {
            ((ey50) activity).Y().getClass();
        }
        return e(activity, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean g(FragmentImpl fragmentImpl, VkTopBar vkTopBar) {
        FragmentActivity activity = fragmentImpl.getActivity();
        Context context = vkTopBar != null ? vkTopBar.getContext() : null;
        if ((fragmentImpl instanceof AppKitFragment) && !(activity instanceof ey50)) {
            return false;
        }
        if (activity instanceof ey50) {
            ((ey50) activity).Y().getClass();
        }
        return e(activity, context);
    }
}
