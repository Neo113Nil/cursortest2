package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: PlaylistViewHolder.kt */
/* loaded from: classes3.dex */
public final class zeb0 extends se50<Playlist> {
    public final ThumbsImageView n;
    public final ImageView o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final ImageView s;
    public final View t;

    public zeb0(View view) {
        super(view);
        this.n = (ThumbsImageView) view.findViewById(R.id.playlist_image);
        ImageView imageView = (ImageView) view.findViewById(R.id.playlist_explicit);
        Context context = imageView.getContext();
        e3m.a aVar = e3m.a;
        Drawable a = m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, context);
        if (a != null) {
            omw.c(R.attr.vk_ui_icon_tertiary, a, imageView);
        }
        this.o = imageView;
        this.p = (TextView) view.findViewById(R.id.playlist_title);
        this.q = (TextView) view.findViewById(R.id.playlist_snippet1);
        this.r = (TextView) view.findViewById(R.id.playlist_snippet2);
        this.s = (ImageView) view.findViewById(R.id.playlist_play_button_on_cover);
        this.t = view.findViewById(R.id.playlist_menu);
    }

    @Override // xsna.se50
    public final void b6(Playlist playlist) {
        Playlist playlist2 = playlist;
        String str = playlist2.i;
        Thumb thumb = playlist2.m;
        ThumbsImageView thumbsImageView = this.n;
        if (thumb != null) {
            thumbsImageView.setThumb(thumb);
        } else {
            thumbsImageView.setThumbs(playlist2.p);
        }
        String str2 = playlist2.h;
        TextView textView = this.p;
        textView.setText(str2);
        this.o.setVisibility(playlist2.k ? 0 : 8);
        int i = playlist2.C ? 2 : 1;
        TextView textView2 = this.q;
        textView2.setMaxLines(i);
        String str3 = "";
        ey2.i(textView2, (xx1.x(playlist2) && xx1.w(playlist2)) ? c9b0.d(this.itemView.getContext(), playlist2) : xx1.u(playlist2) ? str == null ? "" : str : c9b0.g(this.itemView.getContext(), playlist2));
        if (playlist2.Eb()) {
            Context context = this.itemView.getContext();
            int i2 = playlist2.l;
            boolean z = i2 != 0;
            boolean f = myc0.f(str);
            if (f && z) {
                str = context.getString(R.string.music_dot_delimiter, Integer.valueOf(i2), str);
            } else if (!f) {
                str = z ? String.valueOf(i2) : "";
            }
            str3 = str;
        }
        TextView textView3 = this.r;
        ey2.i(textView3, str3);
        ImageView imageView = this.s;
        if (imageView != null) {
            bwt0.p0(imageView, playlist2.D);
        }
        textView.setAlpha(1.0f);
        textView2.setAlpha(1.0f);
        textView3.setAlpha(1.0f);
        thumbsImageView.setAlpha(1.0f);
    }
}
