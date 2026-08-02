package xsna;

import com.vkontakte.android.R;

/* compiled from: MenuListViewStyle.kt */
/* loaded from: classes3.dex */
public abstract class z720 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    /* compiled from: MenuListViewStyle.kt */
    public static final class a extends z720 {
        public a(int i, int i2) {
            super(R.color.vk_black, R.color.color_list_left_menu_text, i, i2, R.color.vk_black, R.color.vk_white, R.color.vk_white);
        }
    }

    /* compiled from: MenuListViewStyle.kt */
    public static final class b extends z720 {
        public final int h;

        public b(int i) {
            super(R.attr.vk_ui_background_secondary, R.attr.vk_ui_text_primary, i, R.drawable.drawer_item_bg, R.attr.vk_ui_text_contrast_themed, R.drawable.left_notify, R.drawable.left_notify_tablet_collapsed);
            this.h = i;
        }
    }

    public z720(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
    }
}
