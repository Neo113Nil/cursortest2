package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.e3m;

/* compiled from: MusicCommonTrackHolder.kt */
/* loaded from: classes3.dex */
public final class sf40 extends se50<MusicTrack> {
    public final boolean n;
    public final gzs<Boolean> o;
    public final ThumbsImageView p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final ImageView t;
    public final TextView u;
    public final TextView v;
    public final TextView w;
    public final ViewGroup x;

    public sf40(View view, gzs gzsVar, boolean z) {
        super(view);
        this.n = z;
        this.o = gzsVar;
        this.p = (ThumbsImageView) view.findViewById(R.id.audio_image);
        this.q = (TextView) view.findViewById(R.id.audio_title);
        this.r = (TextView) view.findViewById(R.id.audio_artist);
        this.s = (TextView) view.findViewById(R.id.audio_duration);
        this.t = (ImageView) view.findViewById(R.id.audio_menu);
        this.u = (TextView) view.findViewById(R.id.audio_lyrics);
        this.v = (TextView) view.findViewById(R.id.adult_content_tv);
        this.w = (TextView) view.findViewById(R.id.foreign_agent_notice_tv);
        this.x = (ViewGroup) view.findViewById(R.id.music_audio_item_playlist_image_container);
    }

    public static SpannableString l6(int i, String str) {
        SpannableString valueOf = SpannableString.valueOf(str);
        int i2 = i - 1;
        valueOf.setSpan(new StyleSpan(1), i2, str.length(), 17);
        valueOf.setSpan(new ForegroundColorSpan(dhr0.t.c(R.attr.vk_ui_text_subhead)), i2, str.length(), 17);
        return valueOf;
    }

    @Override // xsna.se50
    public final void b6(MusicTrack musicTrack) {
        String str;
        MusicTrack musicTrack2 = musicTrack;
        TextView textView = this.q;
        if (textView != null) {
            Context context = textView.getContext();
            String str2 = musicTrack2.d;
            String str3 = musicTrack2.e;
            Float valueOf = Float.valueOf(textView.getTextSize());
            ucp ucpVar = ucp.a;
            textView.setText(ucp.j(s490.d(context, str2, str3, R.attr.vk_ui_text_secondary), valueOf));
        }
        ThumbsImageView thumbsImageView = this.p;
        if (thumbsImageView != null) {
            thumbsImageView.setThumb(musicTrack2.Jb());
        }
        if (thumbsImageView != null) {
            thumbsImageView.setContentDescription(this.itemView.getContext().getString(musicTrack2.Bb() == 1 ? R.string.music_talkback_track_cover_one_author : R.string.music_talkback_track_cover_many_authors, musicTrack2.d, musicTrack2.h));
        }
        boolean Vb = musicTrack2.Vb();
        boolean z = false;
        str = "";
        TextView textView2 = this.r;
        TextView textView3 = this.s;
        if (Vb) {
            if (thumbsImageView != null) {
                thumbsImageView.setEmptyPlaceholder(R.drawable.vk_icon_podcast_24);
            }
            if (textView2 != null) {
                Context context2 = this.itemView.getContext();
                String q = f870.q(musicTrack2.f);
                String str4 = musicTrack2.h;
                textView2.setText(context2.getString(R.string.music_dot_delimiter, str4 != null ? str4 : "", q));
            }
            TextView textView4 = this.v;
            if (textView4 != null) {
                bwt0.p0(textView4, musicTrack2.Lb());
            }
            TextView textView5 = this.w;
            if (textView5 != null) {
                bwt0.p0(textView5, (musicTrack2.Q & 4) != 0);
            }
        } else {
            if (textView2 != null) {
                float textSize = textView2.getTextSize();
                ucp ucpVar2 = ucp.a;
                StringBuilder sb = new StringBuilder();
                List<Artist> list = musicTrack2.t;
                if (list != null) {
                    str = s490.i(list);
                } else {
                    String str5 = musicTrack2.h;
                    if (str5 != null) {
                        str = str5;
                    }
                }
                sb.append(str);
                sb.append(' ');
                sb.append(s490.c(musicTrack2.u));
                textView2.setText(ucp.j(drm0.p0(sb.toString()).toString(), Float.valueOf(textSize)));
            }
            if (textView != null) {
                Context context3 = textView.getContext();
                e3m.a aVar = e3m.a;
                Drawable a = m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, context3);
                if (musicTrack2.Lb()) {
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, a, (Drawable) null);
                } else {
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                textView.setCompoundDrawablePadding(iah0.a(5));
            }
            if (textView3 != null) {
                textView3.setText(f870.q(musicTrack2.f));
                textView3.setContentDescription(f870.p(textView3.getContext(), musicTrack2.f, musicTrack2.s));
            }
        }
        if (musicTrack2.B() || (musicTrack2.Pb() && !this.o.invoke().booleanValue())) {
            z = true;
        }
        float f = z ? 0.5f : 1.0f;
        if (textView != null) {
            textView.setAlpha(f);
        }
        if (textView2 != null) {
            textView2.setAlpha(f);
        }
        if (textView3 != null) {
            textView3.setEnabled(!z);
        }
        if (thumbsImageView != null) {
            thumbsImageView.setAlpha(f);
        }
        ImageView imageView = this.t;
        if (imageView != null) {
            imageView.setContentDescription(this.itemView.getContext().getString(R.string.music_talkback_more));
        }
        boolean z2 = this.n;
        if (imageView != null) {
            bwt0.p0(imageView, z2);
        }
        if (z2) {
            if (textView3 != null) {
                f4m.r(cn70.b(4), textView3);
            }
        } else if (textView3 != null) {
            f4m.r(cn70.b(16), textView3);
        }
    }

    @Override // xsna.se50
    public final void g6(final String str, boolean z) {
        final boolean z2 = str.length() > 0;
        int b = cn70.b(z2 ? 8 : 0);
        ViewGroup viewGroup = this.x;
        if (viewGroup != null) {
            bwt0.t0(viewGroup, 0, b, 0, b, 5);
        }
        ImageView imageView = this.t;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (z2) {
                int b2 = cn70.b(10);
                int marginStart = marginLayoutParams.getMarginStart();
                int i = marginLayoutParams.topMargin;
                int i2 = marginLayoutParams.bottomMargin;
                marginLayoutParams.setMarginStart(marginStart);
                marginLayoutParams.topMargin = i;
                marginLayoutParams.setMarginEnd(b2);
                marginLayoutParams.bottomMargin = i2;
                imageView.setImageResource(R.drawable.vk_icon_more_vertical_16);
                omw.a(imageView, R.color.vk_azure_300);
            } else {
                int b3 = cn70.b(4);
                int marginStart2 = marginLayoutParams.getMarginStart();
                int i3 = marginLayoutParams.topMargin;
                int i4 = marginLayoutParams.bottomMargin;
                marginLayoutParams.setMarginStart(marginStart2);
                marginLayoutParams.topMargin = i3;
                marginLayoutParams.setMarginEnd(b3);
                marginLayoutParams.bottomMargin = i4;
                imageView.setImageResource(R.drawable.ic_actions_small_24);
                imageView.setImageTintList(e3m.c(R.attr.vk_ui_icon_secondary, imageView.getContext()));
            }
            imageView.setLayoutParams(marginLayoutParams);
        }
        TextView textView = this.s;
        if (textView != null && z2) {
            f4m.j(textView);
        }
        final TextView textView2 = this.u;
        if (textView2 != null) {
            bwt0.p0(textView2, z2);
            bwt0.V(textView2, new gzs(z2, textView2, str, this) { // from class: xsna.rf40
                public final /* synthetic */ boolean b;
                public final /* synthetic */ TextView c;
                public final /* synthetic */ String d;

                @Override // xsna.gzs
                public final Object invoke() {
                    SpannableString l6;
                    if (this.b) {
                        TextView textView3 = this.c;
                        String string = textView3.getContext().getString(R.string.music_search_lyrics);
                        String str2 = this.d;
                        String format = String.format(string, str2);
                        int K = drm0.K(0, 6, format, str2, false);
                        if (textView3.getPaint().measureText(format) <= textView3.getWidth()) {
                            l6 = sf40.l6(K, format);
                        } else {
                            String E0 = erm0.E0(1, format);
                            l6 = sf40.l6(K, TextUtils.ellipsize(format, textView3.getPaint(), textView3.getWidth() - textView3.getPaint().measureText(E0), TextUtils.TruncateAt.END) + E0);
                        }
                        textView3.setText(l6);
                    }
                    return s3q0.a;
                }
            });
        }
    }
}
