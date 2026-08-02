package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: PhotoFlowPopupMenuItem.kt */
/* loaded from: classes4.dex */
public abstract class d8a0 {
    public String a(Context context) {
        Integer b2 = b();
        String string = b2 != null ? context.getString(b2.intValue()) : null;
        return string == null ? "" : string;
    }

    public abstract Integer b();

    /* compiled from: PhotoFlowPopupMenuItem.kt */
    public static abstract class b extends d8a0 {
        public final int a;
        public final int b;
        public final int c;

        /* compiled from: PhotoFlowPopupMenuItem.kt */
        public static final class a extends b {
            public static final a d = new a(R.drawable.vk_icon_archive_outline_28, R.string.photo_flow_item_dialog_archive);
        }

        /* compiled from: PhotoFlowPopupMenuItem.kt */
        /* renamed from: xsna.d8a0$b$b, reason: collision with other inner class name */
        public static final class C2713b extends b {
            public static final C2713b d = new C2713b(R.drawable.vk_icon_arrow_right_square_outline_28, R.string.photo_flow_item_dialog_change_album);
        }

        /* compiled from: PhotoFlowPopupMenuItem.kt */
        public static final class c extends b {
            public static final c d = new c(R.drawable.vk_icon_delete_outline_28, R.string.photo_flow_item_dialog_delete, R.attr.vk_ui_icon_negative);
        }

        /* compiled from: PhotoFlowPopupMenuItem.kt */
        public static final class d extends b {
            public static final d d = new d(R.drawable.vk_icon_download_outline_28, R.string.photo_flow_item_dialog_download);
        }

        /* compiled from: PhotoFlowPopupMenuItem.kt */
        public static final class e extends b {
            public static final e d = new e(R.drawable.vk_icon_check_circle_outline_28, R.string.photo_flow_item_dialog_multi_select);
        }

        /* compiled from: PhotoFlowPopupMenuItem.kt */
        public static final class f extends b {
            public static final f d = new f(R.drawable.vk_icon_picture_stack_outline_28, R.string.photo_flow_item_dialog_navigate_to_album);
        }

        /* compiled from: PhotoFlowPopupMenuItem.kt */
        public static final class g extends b {
            public static final g d = new g(R.drawable.vk_icon_pin_outline_28, R.string.photo_flow_item_dialog_pin);
        }

        /* compiled from: PhotoFlowPopupMenuItem.kt */
        public static final class h extends b {
            public static final h d = new h(R.drawable.vk_icon_share_outline_28, R.string.photo_flow_item_dialog_share);
        }

        /* compiled from: PhotoFlowPopupMenuItem.kt */
        public static final class i extends b {
            public static final i d = new i(R.drawable.vk_icon_unpin_outline_28, R.string.photo_flow_item_dialog_unpin);
        }

        public b(int i2, int i3, int i4) {
            this.a = i2;
            this.b = i3;
            this.c = i4;
        }

        @Override // xsna.d8a0
        public final Integer b() {
            return Integer.valueOf(this.b);
        }

        public /* synthetic */ b(int i2, int i3) {
            this(i2, i3, R.attr.colorAccent);
        }
    }

    /* compiled from: PhotoFlowPopupMenuItem.kt */
    public static abstract class a extends d8a0 {
        public final int a;
        public final Integer b;
        public final Integer c;
        public final int d;

        /* compiled from: PhotoFlowPopupMenuItem.kt */
        /* renamed from: xsna.d8a0$a$a, reason: collision with other inner class name */
        public static final class C2712a extends a {
            public final int e;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public C2712a(int i) {
                super(R.drawable.vk_icon_archive_outline_28, 8, r0);
                Integer valueOf = Integer.valueOf(R.string.photo_flow_item_dialog_archive);
                this.e = i;
            }

            @Override // xsna.d8a0
            public final String a(Context context) {
                Integer num;
                Integer num2 = this.b;
                if (num2 == null || (num = this.c) == null) {
                    return "";
                }
                int i = this.e;
                return i == 1 ? context.getString(num2.intValue()) : enj.f(num.intValue(), i, context);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2712a) && this.e == ((C2712a) obj).e;
            }

            public final int hashCode() {
                return Integer.hashCode(this.e);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Archive(selectedPhotosCount="), this.e, ')');
            }
        }

        /* compiled from: PhotoFlowPopupMenuItem.kt */
        public static final class b extends a {
            public static final b e;

            static {
                Integer valueOf = Integer.valueOf(R.string.photo_flow_header_dialog_change_album);
                e = new b(R.drawable.vk_icon_arrow_right_square_outline_28, 12, valueOf);
            }
        }

        /* compiled from: PhotoFlowPopupMenuItem.kt */
        public static final class c extends a {
            public final int e;

            public c(int i) {
                super(R.drawable.vk_icon_delete_outline_28, R.attr.vk_ui_icon_negative, Integer.valueOf(R.string.photo_flow_item_dialog_delete), Integer.valueOf(R.plurals.photo_flow_header_dialog_delete_multiple));
                this.e = i;
            }

            @Override // xsna.d8a0
            public final String a(Context context) {
                Integer num;
                Integer num2 = this.b;
                if (num2 == null || (num = this.c) == null) {
                    return "";
                }
                int i = this.e;
                return i == 1 ? context.getString(num2.intValue()) : enj.f(num.intValue(), i, context);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.e == ((c) obj).e;
            }

            public final int hashCode() {
                return Integer.hashCode(this.e);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Delete(selectedPhotosCount="), this.e, ')');
            }
        }

        /* compiled from: PhotoFlowPopupMenuItem.kt */
        public static final class d extends a {
            public static final d e;

            static {
                Integer valueOf = Integer.valueOf(R.string.photo_flow_header_dialog_download);
                e = new d(R.drawable.vk_icon_download_outline_28, 12, valueOf);
            }
        }

        /* compiled from: PhotoFlowPopupMenuItem.kt */
        public static final class e extends a {
            public static final e e;

            static {
                Integer valueOf = Integer.valueOf(R.string.photo_flow_header_dialog_share);
                e = new e(R.drawable.vk_icon_share_outline_28, 12, valueOf);
            }
        }

        public a(int i, int i2, Integer num, Integer num2) {
            this.a = i;
            this.b = num;
            this.c = num2;
            this.d = i2;
        }

        @Override // xsna.d8a0
        public final Integer b() {
            return this.b;
        }

        public /* synthetic */ a(int i, int i2, Integer num) {
            this(i, R.attr.colorAccent, num, (i2 & 4) != 0 ? null : Integer.valueOf(R.plurals.photo_flow_header_dialog_archive_multiple));
        }
    }
}
