package xsna;

import com.vkontakte.android.R;

/* compiled from: SimplePostingType.kt */
/* loaded from: classes4.dex */
public abstract class csj0 {
    public final int a;
    public final int b;

    /* compiled from: SimplePostingType.kt */
    public static final class a extends csj0 {
        public static final a c = new a(R.drawable.vk_icon_logo_clips_outline_28, R.string.newsfeed_newpost_clip);
    }

    /* compiled from: SimplePostingType.kt */
    public static final class b extends csj0 {
        public static final b c = new b(R.drawable.vk_icon_picture_outline_28, R.string.newsfeed_newpost_photo);
    }

    /* compiled from: SimplePostingType.kt */
    public static final class c extends csj0 {
        public static final c c = new c(R.drawable.vk_icon_write_square_outline_28, R.string.newsfeed_newpost_post);
    }

    /* compiled from: SimplePostingType.kt */
    public static final class d extends csj0 {
        public static final d c = new d(R.drawable.vk_icon_story_outline_28, R.string.newsfeed_newpost_story);
    }

    /* compiled from: SimplePostingType.kt */
    public static final class e extends csj0 {
        public static final e c = new e(R.drawable.vk_icon_video_square_outline_28, R.string.newsfeed_newpost_video);
    }

    public csj0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
