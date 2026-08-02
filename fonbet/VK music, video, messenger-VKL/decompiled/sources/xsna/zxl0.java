package xsna;

import android.content.res.Resources;
import com.vkontakte.android.R;
import xsna.xxl0;

/* compiled from: StoryAvatarConfigs.kt */
/* loaded from: classes6.dex */
public abstract class zxl0 implements xxl0 {

    /* compiled from: StoryAvatarConfigs.kt */
    public static final class a extends zxl0 {
        public final int a;
        public final int c;
        public final int d;
        public final int b = iah0.a(4);
        public final int e = R.layout.story_circle_preview;
        public final int f = R.layout.pds_story_new_item;
        public final boolean g = true;

        public a(Resources resources) {
            this.a = (int) resources.getDimension(R.dimen.story_preview_image_size);
            this.c = resources.getDimensionPixelSize(R.dimen.story_card_width);
            this.d = resources.getDimensionPixelSize(R.dimen.story_card_height);
        }

        @Override // xsna.xxl0
        public final int a() {
            return this.f;
        }

        @Override // xsna.xxl0
        public final boolean b() {
            return this.g;
        }

        @Override // xsna.xxl0
        public final int c() {
            return this.d;
        }

        @Override // xsna.xxl0
        public final int d() {
            return this.c;
        }

        @Override // xsna.xxl0
        public final xxl0.a e() {
            return null;
        }

        @Override // xsna.xxl0
        public final int f() {
            return this.e;
        }

        @Override // xsna.xxl0
        public final int g() {
            return this.b;
        }

        @Override // xsna.xxl0
        public final xxl0.a h() {
            return null;
        }

        @Override // xsna.xxl0
        public final int i() {
            return this.a;
        }
    }
}
