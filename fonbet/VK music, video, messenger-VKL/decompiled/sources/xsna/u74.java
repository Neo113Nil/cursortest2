package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.dto.common.Image;
import com.vk.dto.music.Thumb;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.view.ThumbsImageView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: AttachmentTypes.java */
/* loaded from: classes5.dex */
public final class u74 {

    /* compiled from: AttachmentTypes.java */
    public static final class a extends e {
        public TextView b;
        public ThumbsImageView c;

        @Override // xsna.w74
        public final void a(@NonNull Bundle bundle) {
            this.c.setThumbs(bundle.getParcelableArrayList("thumbs"));
            this.b.setText(bundle.getString("artist"));
        }

        @Override // xsna.u74.e
        @NonNull
        public final View b(@NonNull Context context, @NonNull LinearLayout linearLayout) {
            View a = u74.a(context, linearLayout);
            this.c = (ThumbsImageView) a.findViewById(R.id.playlist_image);
            this.b = (TextView) a.findViewById(R.id.playlist_title);
            ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).setMarginStart(iah0.a(16));
            a.setBackground(null);
            a.findViewById(R.id.playlist_snippet1).setVisibility(8);
            a.findViewById(R.id.playlist_snippet2).setVisibility(8);
            a.findViewById(R.id.playlist_menu).setVisibility(8);
            return a;
        }
    }

    /* compiled from: AttachmentTypes.java */
    public static final class b extends e {
        public ThumbsImageView b;
        public TextView c;
        public TextView d;

        @Override // xsna.w74
        public final void a(@NonNull Bundle bundle) {
            this.b.setThumb((Thumb) bundle.getParcelable("thumb"));
            this.c.setText(bundle.getString("title"));
            this.d.setText(bundle.getString("artist"));
        }

        @Override // xsna.u74.e
        @NonNull
        public final View b(@NonNull Context context, @NonNull LinearLayout linearLayout) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.music_audio_item_playlist, (ViewGroup) linearLayout, false);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) inflate.findViewById(R.id.music_audio_item_playlist_image_container).getLayoutParams();
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.leftMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            this.b = (ThumbsImageView) inflate.findViewById(R.id.audio_image);
            this.c = (TextView) inflate.findViewById(R.id.audio_title);
            this.d = (TextView) inflate.findViewById(R.id.audio_artist);
            inflate.setBackground(null);
            inflate.findViewById(R.id.audio_menu).setVisibility(8);
            return inflate;
        }
    }

    /* compiled from: AttachmentTypes.java */
    public static class c extends e {
        public final int b;

        @Nullable
        public VKCircleImageView c;

        @Nullable
        public TextView d;

        public c(int i, @Nullable Bundle bundle) {
            super(bundle);
            this.b = i;
        }

        @Override // xsna.w74
        public final void a(@NonNull Bundle bundle) {
            VKCircleImageView vKCircleImageView = this.c;
            if (vKCircleImageView != null) {
                vKCircleImageView.o0(bundle.getString("authorPhotoUrl"), null);
            }
            TextView textView = this.d;
            if (textView != null) {
                textView.setText(bundle.getString("authorName"));
            }
        }

        @Override // xsna.u74.e
        @NonNull
        public final View b(@NonNull Context context, @NonNull LinearLayout linearLayout) {
            FrameLayout frameLayout = new FrameLayout(context);
            VKCircleImageView vKCircleImageView = new VKCircleImageView(context);
            this.c = vKCircleImageView;
            vKCircleImageView.setPlaceholderImage(R.drawable.user_placeholder);
            int a = iah0.a(48);
            frameLayout.addView(this.c, new FrameLayout.LayoutParams(a, a));
            int a2 = iah0.a(60);
            TextView textView = new TextView(context);
            this.d = textView;
            FontFamily fontFamily = FontFamily.MEDIUM;
            com.vk.typography.b.k(textView, fontFamily, Float.valueOf(15.0f), 4);
            this.d.setTextColor(context.getColor(R.color.muted_blue_old));
            this.d.setIncludeFontPadding(false);
            this.d.setMaxLines(1);
            this.d.setEllipsize(TextUtils.TruncateAt.END);
            float f = 4;
            this.d.setCompoundDrawablePadding(iah0.a(f));
            hno0.a(this.d, e3m.c(R.attr.vk_ui_icon_secondary, context));
            this.d.setCompoundDrawablesWithIntrinsicBounds(m33.a(R.drawable.vk_icon_repost_16, context), (Drawable) null, (Drawable) null, (Drawable) null);
            this.d.setGravity(16);
            float f2 = 20;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iah0.a(f2));
            layoutParams.setMargins(a2, iah0.a(f), 0, 0);
            frameLayout.addView(this.d, layoutParams);
            TextView textView2 = new TextView(context);
            textView2.setText(this.b);
            com.vk.typography.b.k(textView2, fontFamily, Float.valueOf(14.0f), 4);
            textView2.setTextColor(context.getColor(R.color.cool_grey));
            textView2.setIncludeFontPadding(false);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, iah0.a(f2));
            layoutParams2.setMargins(a2, iah0.a(26), 0, 0);
            frameLayout.addView(textView2, layoutParams2);
            return frameLayout;
        }
    }

    /* compiled from: AttachmentTypes.java */
    public static final class d extends e {
        public TextView b;
        public ThumbsImageView c;

        @Override // xsna.w74
        public final void a(@NonNull Bundle bundle) {
            this.c.setThumbs(bundle.getParcelableArrayList("thumbs"));
            this.b.setText(bundle.getString("curator"));
        }

        @Override // xsna.u74.e
        @NonNull
        public final View b(@NonNull Context context, @NonNull LinearLayout linearLayout) {
            View a = u74.a(context, linearLayout);
            this.c = (ThumbsImageView) a.findViewById(R.id.playlist_image);
            this.b = (TextView) a.findViewById(R.id.playlist_title);
            ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).setMarginStart(iah0.a(16));
            a.setBackground(null);
            a.findViewById(R.id.playlist_snippet1).setVisibility(8);
            a.findViewById(R.id.playlist_snippet2).setVisibility(8);
            a.findViewById(R.id.playlist_menu).setVisibility(8);
            return a;
        }
    }

    /* compiled from: AttachmentTypes.java */
    public static abstract class e implements w74 {

        @Nullable
        public final Bundle a;

        public e(@Nullable Bundle bundle) {
            this.a = bundle;
        }

        @NonNull
        public abstract View b(@NonNull Context context, @NonNull LinearLayout linearLayout);
    }

    /* compiled from: AttachmentTypes.java */
    public static final class f extends e {

        @Nullable
        public VKImageView b;

        @Nullable
        public TextView c;

        @Override // xsna.w74
        public final void a(@NonNull Bundle bundle) {
            String s6;
            VKImageView vKImageView = this.b;
            if (vKImageView != null) {
                vKImageView.L0(Uri.parse(bundle.getString("thumbUrl")), ImageScreenSize.SMALL);
            }
            TextView textView = this.c;
            if (textView != null) {
                String string = bundle.getString("extension");
                long j = bundle.getLong("size");
                Resources resources = this.c.getResources();
                if (string == null) {
                    s6 = j > 0 ? dun.s6(j, resources) : "";
                } else if (j > 0) {
                    s6 = string.toUpperCase() + ", " + dun.s6(j, resources);
                } else {
                    s6 = string.toUpperCase();
                }
                textView.setText(s6);
            }
        }

        @Override // xsna.u74.e
        @NonNull
        public final View b(@NonNull Context context, @NonNull LinearLayout linearLayout) {
            FrameLayout frameLayout = new FrameLayout(context);
            FrameLayout frameLayout2 = new FrameLayout(context);
            VKImageView vKImageView = new VKImageView(context);
            this.b = vKImageView;
            vKImageView.setCornerRadius(iah0.a(6));
            this.b.setPlaceholderImage(new ColorDrawable(context.getColor(R.color.pale_grey)));
            frameLayout2.addView(this.b, new FrameLayout.LayoutParams(iah0.a(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE), iah0.a(76)));
            TextView textView = new TextView(context);
            this.c = textView;
            com.vk.typography.b.k(textView, FontFamily.MEDIUM, Float.valueOf(12.0f), 4);
            this.c.setTextColor(-1);
            this.c.setIncludeFontPadding(false);
            int a = iah0.a(4);
            this.c.setPadding(a, a, a, a);
            this.c.setBackgroundResource(R.drawable.bg_video_duration_label_old);
            frameLayout2.addView(this.c, new FrameLayout.LayoutParams(-2, -2, 81));
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }
    }

    /* compiled from: AttachmentTypes.java */
    public static final class g extends e {

        @Nullable
        public VKImageView b;

        @Nullable
        public TextView c;

        @Nullable
        public TextView d;

        @Override // xsna.w74
        public final void a(@NonNull Bundle bundle) {
            Image image;
            if (this.b != null && (image = (Image) bundle.getParcelable("thumb")) != null) {
                bwt0.S(this.b, new v74(0, this, image));
            }
            TextView textView = this.c;
            if (textView != null) {
                textView.setText(bundle.getString("title"));
            }
            TextView textView2 = this.d;
            if (textView2 != null) {
                textView2.setText(bundle.getString("cost"));
            }
        }

        @Override // xsna.u74.e
        @NonNull
        public final View b(@NonNull Context context, @NonNull LinearLayout linearLayout) {
            FrameLayout frameLayout = new FrameLayout(context);
            int a = iah0.a(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
            int a2 = iah0.a(76);
            FrameLayout frameLayout2 = new FrameLayout(context);
            VKImageView vKImageView = new VKImageView(context);
            this.b = vKImageView;
            vKImageView.setPlaceholderImage(new ColorDrawable(context.getColor(R.color.pale_grey)));
            frameLayout2.addView(this.b, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackgroundResource(R.drawable.bg_video_duration_label_old);
            int a3 = iah0.a(4);
            frameLayout3.setPadding(a3, a3, a3, a3);
            frameLayout2.addView(frameLayout3, new FrameLayout.LayoutParams(-1, -1));
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            TextView textView = new TextView(context);
            this.c = textView;
            FontFamily fontFamily = FontFamily.REGULAR;
            Float valueOf = Float.valueOf(12.0f);
            com.vk.typography.b.k(textView, fontFamily, valueOf, 4);
            this.c.setTextColor(-1);
            this.c.setIncludeFontPadding(false);
            this.c.setMaxLines(2);
            TextView textView2 = this.c;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView2.setEllipsize(truncateAt);
            this.c.setGravity(1);
            linearLayout2.addView(this.c, new LinearLayout.LayoutParams(-1, -2));
            TextView textView3 = new TextView(context);
            this.d = textView3;
            com.vk.typography.b.k(textView3, FontFamily.MEDIUM, valueOf, 4);
            this.d.setTextColor(-1);
            this.d.setIncludeFontPadding(false);
            this.d.setMaxLines(1);
            this.d.setEllipsize(truncateAt);
            this.d.setGravity(1);
            linearLayout2.addView(this.d, new LinearLayout.LayoutParams(-1, -2));
            frameLayout3.addView(linearLayout2, new FrameLayout.LayoutParams(-1, -2, 17));
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(a, a2));
            return frameLayout;
        }
    }

    /* compiled from: AttachmentTypes.java */
    public static final class h extends e {

        @Nullable
        public VKImageView b;
        public final String c;

        public h(@Nullable Bundle bundle, String str) {
            super(bundle);
            this.c = str;
        }

        @Override // xsna.w74
        public final void a(@NonNull Bundle bundle) {
            VKImageView vKImageView = this.b;
            if (vKImageView != null) {
                vKImageView.o0(bundle.getString(this.c), null);
            }
        }

        @Override // xsna.u74.e
        @NonNull
        public final View b(@NonNull Context context, @NonNull LinearLayout linearLayout) {
            FrameLayout frameLayout = new FrameLayout(context);
            VKImageView vKImageView = new VKImageView(context);
            this.b = vKImageView;
            vKImageView.setCornerRadius(iah0.a(6));
            this.b.setPlaceholderImage(R.drawable.photo_loading);
            frameLayout.addView(this.b, new FrameLayout.LayoutParams(iah0.a(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE), iah0.a(76)));
            return frameLayout;
        }
    }

    /* compiled from: AttachmentTypes.java */
    public static final class i extends e {
        public ThumbsImageView b;
        public TextView c;

        @Override // xsna.w74
        public final void a(@NonNull Bundle bundle) {
            this.b.setThumbs(bundle.getParcelableArrayList("thumbs"));
            this.c.setText(bundle.getString("title"));
        }

        @Override // xsna.u74.e
        @NonNull
        public final View b(@NonNull Context context, @NonNull LinearLayout linearLayout) {
            View a = u74.a(context, linearLayout);
            this.b = (ThumbsImageView) a.findViewById(R.id.playlist_image);
            this.c = (TextView) a.findViewById(R.id.playlist_title);
            a.setBackground(null);
            a.findViewById(R.id.playlist_snippet1).setVisibility(8);
            a.findViewById(R.id.playlist_snippet2).setVisibility(8);
            a.findViewById(R.id.playlist_menu).setVisibility(8);
            return a;
        }
    }

    /* compiled from: AttachmentTypes.java */
    public static final class j extends e {

        @Nullable
        public VKImageView b;

        @Nullable
        public TextView c;

        @Nullable
        public TextView d;

        @Override // xsna.w74
        public final void a(@NonNull Bundle bundle) {
            String str;
            if (this.b != null) {
                String string = bundle.getString("thumbUrl");
                this.b.L0(!TextUtils.isEmpty(string) ? Uri.parse(string) : null, ImageScreenSize.SMALL);
            }
            if (this.c != null) {
                int i = bundle.getInt("duration");
                TextView textView = this.c;
                if (i > 0) {
                    gpt0 gpt0Var = gpt0.a;
                    str = z8s.a(i);
                } else {
                    str = "";
                }
                textView.setText(str);
            }
            TextView textView2 = this.d;
            if (textView2 != null) {
                textView2.setText(bundle.getString("title"));
            }
        }

        @Override // xsna.u74.e
        @NonNull
        public final View b(@NonNull Context context, @NonNull LinearLayout linearLayout) {
            LinearLayout linearLayout2 = new LinearLayout(context);
            FrameLayout frameLayout = new FrameLayout(context);
            VKImageView vKImageView = new VKImageView(context);
            this.b = vKImageView;
            vKImageView.setCornerRadius(iah0.a(6));
            this.b.setPlaceholderImage(R.drawable.ic_videos_placeholder);
            frameLayout.addView(this.b, new FrameLayout.LayoutParams(iah0.a(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE), iah0.a(76)));
            TextView textView = new TextView(context);
            this.c = textView;
            com.vk.typography.b.k(textView, FontFamily.MEDIUM, Float.valueOf(12.0f), 4);
            this.c.setTextColor(-1);
            this.c.setIncludeFontPadding(false);
            int a = iah0.a(3);
            float f = 8;
            int a2 = iah0.a(f);
            this.c.setPadding(a2, a, a2, a);
            this.c.setBackgroundResource(R.drawable.bg_video_duration_label_old);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 85);
            layoutParams.bottomMargin = iah0.a(f);
            layoutParams.rightMargin = iah0.a(f);
            frameLayout.addView(this.c, layoutParams);
            linearLayout2.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
            TextView textView2 = new TextView(context);
            this.d = textView2;
            com.vk.typography.b.k(textView2, FontFamily.REGULAR, Float.valueOf(16.0f), 4);
            this.d.setMaxLines(4);
            this.d.setEllipsize(TextUtils.TruncateAt.END);
            this.d.setGravity(19);
            this.d.setTextAlignment(5);
            jno0.c(this.d, R.attr.vk_ui_text_primary);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams.leftMargin = iah0.a(12);
            linearLayout2.addView(this.d, marginLayoutParams);
            return linearLayout2;
        }
    }

    public static View a(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.music_playlist_item1, viewGroup, false);
        inflate.getLayoutParams().height = -2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) inflate.findViewById(R.id.playlist_image).getLayoutParams();
        marginLayoutParams.setMarginStart(0);
        marginLayoutParams.leftMargin = 0;
        marginLayoutParams.topMargin = 0;
        marginLayoutParams.bottomMargin = 0;
        return inflate;
    }
}
