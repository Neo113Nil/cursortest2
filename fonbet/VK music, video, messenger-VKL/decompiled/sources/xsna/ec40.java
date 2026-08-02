package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: MusicBottomSheetAction.kt */
/* loaded from: classes3.dex */
public final class ec40<T> {
    public final int a;
    public final T b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final Integer h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final String l;

    /* compiled from: MusicBottomSheetAction.kt */
    public interface a<T> {
        default boolean a(T t) {
            return false;
        }

        boolean b(ec40<T> ec40Var);
    }

    public ec40() {
        throw null;
    }

    public /* synthetic */ ec40(int i, Object obj, int i2, int i3, int i4, int i5, int i6, int i7) {
        this(i, obj, i2, i3, (i7 & 16) != 0 ? -1 : i4, (i7 & 32) != 0 ? R.attr.vk_ui_icon_accent : i5, (i7 & 64) != 0 ? R.attr.vk_ui_text_primary : i6, (i7 & 128) != 0 ? null : Integer.valueOf(R.string.music_podcast_episode_download_unavailable_subtitle), (i7 & 256) == 0, true);
    }

    public final String a(Context context) {
        int i = this.d;
        if (i != -1 && i != 0) {
            return context.getString(i);
        }
        String str = this.l;
        return str == null ? "" : str;
    }

    public final String b(Context context) {
        int i = this.c;
        if (i != -1 && i != 0) {
            return context.getString(i);
        }
        String str = this.k;
        return str == null ? "" : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec40)) {
            return false;
        }
        ec40 ec40Var = (ec40) obj;
        return this.a == ec40Var.a && epx.f(this.b, ec40Var.b) && this.c == ec40Var.c && this.d == ec40Var.d && this.e == ec40Var.e && this.f == ec40Var.f && this.g == ec40Var.g && epx.f(this.h, ec40Var.h) && this.i == ec40Var.i && this.j == ec40Var.j;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        T t = this.b;
        int a2 = shy.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, (hashCode + (t == null ? 0 : t.hashCode())) * 31, 31), 31), 31), 31), 31);
        Integer num = this.h;
        return Boolean.hashCode(this.j) + qoy.b((a2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicBottomSheetAction(actionId=");
        sb.append(this.a);
        sb.append(", item=");
        sb.append(this.b);
        sb.append(", titleRes=");
        sb.append(this.c);
        sb.append(", contentDescriptionRes=");
        sb.append(this.d);
        sb.append(", iconRes=");
        sb.append(this.e);
        sb.append(", tintColorRes=");
        sb.append(this.f);
        sb.append(", tintTextRes=");
        sb.append(this.g);
        sb.append(", subtitleRes=");
        sb.append(this.h);
        sb.append(", isDisableState=");
        sb.append(this.i);
        sb.append(", isClickable=");
        return defpackage.q0.a(sb, this.j, ')');
    }

    public ec40(int i, T t, int i2, int i3, int i4, int i5, int i6, Integer num, boolean z, boolean z2) {
        this.a = i;
        this.b = t;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = num;
        this.i = z;
        this.j = z2;
    }

    public ec40(int i, Object obj, int i2, int i3, boolean z, boolean z2, int i4) {
        this(i, obj, i2, i2, i3, (i4 & 16) != 0 ? R.attr.vk_ui_icon_accent : R.attr.vk_ui_icon_accent_themed, R.attr.vk_ui_text_primary, (Integer) null, (i4 & 128) != 0 ? false : z, (i4 & 256) != 0 ? true : z2);
    }

    public ec40(int i, T t, String str, String str2, int i2, int i3, int i4, Integer num, boolean z, boolean z2) {
        this(i, t, -1, -1, i2, i3, i4, num, z, z2);
        this.k = str;
        this.l = str2;
    }
}
