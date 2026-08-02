package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;
import com.vk.core.fragments.FragmentImpl;
import com.vk.music.fragment.impl.MusicCatalogFragment;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import xsna.k840;

/* compiled from: VkAppHeadsetNotificationRouter.kt */
/* loaded from: classes.dex */
public final class dau0 implements k840.d {
    @Override // xsna.k840.d
    public final void a(Context context) {
        new oz50(SettingsGeneralFragment.class, null, q9k.a("pref_to_highlight", "showMusicSuggestNotification")).k(context);
    }

    @Override // xsna.k840.d
    public final boolean b(Context context) {
        ww50<?> Y;
        ComponentCallbacks2 h = e3m.h(context);
        FragmentImpl fragmentImpl = null;
        ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
        if (ey50Var != null && (Y = ey50Var.Y()) != null) {
            fragmentImpl = Y.u();
        }
        return !(fragmentImpl instanceof SettingsGeneralFragment);
    }

    @Override // xsna.k840.d
    public final void c(Context context, String str) {
        yk40 yk40Var = new yk40();
        yk40Var.E(str);
        yk40Var.B(context);
    }

    @Override // xsna.k840.d
    public final boolean d(Context context) {
        ww50<?> Y;
        ComponentCallbacks2 h = e3m.h(context);
        FragmentImpl fragmentImpl = null;
        ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
        if (ey50Var != null && (Y = ey50Var.Y()) != null) {
            fragmentImpl = Y.u();
        }
        return !(fragmentImpl instanceof MusicCatalogFragment);
    }
}
