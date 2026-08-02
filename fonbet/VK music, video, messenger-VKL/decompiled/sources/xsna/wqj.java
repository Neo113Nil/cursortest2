package xsna;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: ControlsParams.kt */
/* loaded from: classes2.dex */
public final class wqj {
    public final TextView a;
    public final Drawable b;
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable g;
    public final Drawable h;
    public final Drawable i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;

    public wqj(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, hny hnyVar, hny hnyVar2, int i) {
        Drawable drawable5;
        Drawable drawable6;
        TextView textView2 = (i & 1) != 0 ? null : textView;
        Drawable a = (i & 2) != 0 ? m33.a(R.drawable.ic_sound_off_shadow_48, e43.a) : drawable;
        Drawable a2 = (i & 4) != 0 ? m33.a(R.drawable.ic_volume_shadow_48, e43.a) : drawable2;
        Drawable a3 = m33.a(R.drawable.vk_icon_mute_cross_16, e43.a);
        Drawable a4 = m33.a(R.drawable.vk_icon_volume_16, e43.a);
        Drawable a5 = (i & 32) != 0 ? m33.a(R.drawable.subtitles_slash_shadow_48, e43.a) : drawable3;
        Drawable a6 = (i & 64) != 0 ? m33.a(R.drawable.subtitles_shadow_48, e43.a) : drawable4;
        if ((i & 128) != 0) {
            drawable5 = m33.a(R.drawable.vk_icon_done_outline_24, e43.a);
            drawable5.setTint(e43.a.getColor(R.color.vk_white));
        } else {
            drawable5 = hnyVar;
        }
        if ((i & 256) != 0) {
            drawable6 = m33.a(R.drawable.vk_icon_clock_24, e43.a);
            drawable6.setTint(e43.a.getColor(R.color.vk_white));
        } else {
            drawable6 = hnyVar2;
        }
        int i2 = (i & 512) != 0 ? R.drawable.ic_sound_off_shadow_48 : R.drawable.vk_icon_mute_24;
        int i3 = (i & 1024) != 0 ? R.drawable.ic_volume_shadow_48 : R.drawable.vk_icon_volume_20;
        int i4 = (i & 8192) != 0 ? R.drawable.subtitles_slash_shadow_48 : R.drawable.vk_icon_subtitles_slash_24;
        int i5 = (i & 16384) != 0 ? R.drawable.subtitles_shadow_48 : R.drawable.vk_icon_subtitles_24;
        this.a = textView2;
        this.b = a;
        this.c = a2;
        this.d = a3;
        this.e = a4;
        this.f = a5;
        this.g = a6;
        this.h = drawable5;
        this.i = drawable6;
        this.j = i2;
        this.k = i3;
        this.l = R.drawable.vk_icon_mute_cross_16;
        this.m = R.drawable.vk_icon_volume_16;
        this.n = i4;
        this.o = i5;
    }
}
