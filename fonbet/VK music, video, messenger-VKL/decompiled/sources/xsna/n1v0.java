package xsna;

import com.vk.android.launcher.icons.IconAlias;
import com.vkontakte.android.R;
import xsna.k1v0;

/* compiled from: VkLauncherIconItem.kt */
/* loaded from: classes.dex */
public final class n1v0 extends k1v0.b {
    public static final n1v0 a = new n1v0();
    public static final int b = R.mipmap.ic_launcher_constellation_background;
    public static final int c = R.mipmap.ic_launcher_constellation_foreground;
    public static final int d = R.string.settings_appearance_constellation_icon_title;
    public static final IconAlias e = IconAlias.EventIcon4;

    @Override // xsna.ymy
    public final int d() {
        return d;
    }

    @Override // xsna.ymy
    public final IconAlias e() {
        return e;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof n1v0);
    }

    @Override // xsna.k1v0, xsna.ymy
    public final Integer f() {
        return Integer.valueOf(c);
    }

    @Override // xsna.ymy
    public final int g() {
        return b;
    }

    public final int hashCode() {
        return 1933398559;
    }

    public final String toString() {
        return "Constellation";
    }
}
