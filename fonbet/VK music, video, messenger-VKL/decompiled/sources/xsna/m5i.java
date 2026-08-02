package xsna;

import com.facebook.drawee.generic.RoundingParams;
import com.vkontakte.android.R;

/* compiled from: CompactAttachmentType.kt */
/* loaded from: classes15.dex */
public abstract class m5i {
    public final int a;
    public final String b;
    public final tlo0 c;
    public final tlo0 d;
    public final boolean e;
    public final RoundingParams f;
    public final int g;

    /* compiled from: CompactAttachmentType.kt */
    public static final class a extends m5i {
    }

    /* compiled from: CompactAttachmentType.kt */
    public static final class b extends m5i {
    }

    /* compiled from: CompactAttachmentType.kt */
    public static final class c extends m5i {
    }

    /* compiled from: CompactAttachmentType.kt */
    public static final class d extends m5i {
        public d(String str, String str2, String str3) {
            super(R.drawable.vk_icon_arrow_up_right_outline_24, str, str2.length() == 0 ? tq.h(tlo0.Companion, R.string.url) : oq.d(tlo0.Companion, str2), str3 != null ? oq.d(tlo0.Companion, str3) : null, false, null, 112);
        }
    }

    /* compiled from: CompactAttachmentType.kt */
    public static final class e extends m5i {
    }

    /* compiled from: CompactAttachmentType.kt */
    public static final class f extends m5i {
    }

    /* compiled from: CompactAttachmentType.kt */
    public static final class g extends m5i {
    }

    /* compiled from: CompactAttachmentType.kt */
    public static final class h extends m5i {
    }

    /* compiled from: CompactAttachmentType.kt */
    public static final class i extends m5i {
        public static final i h = new i(R.drawable.vk_icon_attach_24, null, tq.h(tlo0.Companion, R.string.post_sticker_attachment_compact_title_unknown), null, false, null, 112);
    }

    public m5i(int i2, String str, tlo0 tlo0Var, tlo0 tlo0Var2, boolean z, RoundingParams roundingParams, int i3) {
        z = (i3 & 16) != 0 ? false : z;
        roundingParams = (i3 & 32) != 0 ? RoundingParams.b(cn70.a() * 8.0f) : roundingParams;
        int i4 = (i3 & 64) != 0 ? R.drawable.bg_post_sticker_attachment_icon : R.drawable.bg_post_sticker_circle;
        this.a = i2;
        this.b = str;
        this.c = tlo0Var;
        this.d = tlo0Var2;
        this.e = z;
        this.f = roundingParams;
        this.g = i4;
    }
}
