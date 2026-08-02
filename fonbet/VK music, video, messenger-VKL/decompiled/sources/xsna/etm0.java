package xsna;

import android.content.Context;
import com.vk.stickers.api.styles.AccentStyleColor;
import com.vk.stickers.api.styles.StickerColorToken;
import com.vk.stickers.api.styles.StickerCommonStyle;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StyleInfo.kt */
/* loaded from: classes5.dex */
public final class etm0 implements com.vk.stickers.api.styles.a {
    public final StickerCommonStyle b;
    public final List<StickerCommonStyle> c;
    public final AccentStyleColor d;
    public v2l0 e;

    /* compiled from: StyleInfo.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StickerCommonStyle.values().length];
            try {
                iArr[StickerCommonStyle.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickerCommonStyle.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StickerCommonStyle.ACCENT_BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StickerCommonStyle.LIGHT_WITHOUT_BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StickerCommonStyle.DARK_UNIQUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StickerCommonStyle.LIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StickerCommonStyle.DARK_WITHOUT_BACKGROUND.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StickerCommonStyle.LIGHT_UNIQUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StickerCommonStyle.ACCENT_CONTENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public etm0(StickerCommonStyle stickerCommonStyle, List<? extends StickerCommonStyle> list, AccentStyleColor accentStyleColor, v2l0 v2l0Var) {
        this.b = stickerCommonStyle;
        this.c = list;
        this.d = accentStyleColor;
        this.e = v2l0Var;
    }

    @Override // com.vk.stickers.api.styles.a
    public final void b(v2l0 v2l0Var) {
        this.e = v2l0Var;
    }

    @Override // com.vk.stickers.api.styles.a
    public final StickerCommonStyle c() {
        return this.b;
    }

    @Override // com.vk.stickers.api.styles.a
    public final boolean d() {
        return this.e != null;
    }

    @Override // com.vk.stickers.api.styles.a
    public final com.vk.stickers.api.styles.a e() {
        StickerCommonStyle stickerCommonStyle = this.b;
        List<StickerCommonStyle> list = this.c;
        int indexOf = list.indexOf(stickerCommonStyle);
        int size = (indexOf + 1) % list.size();
        v2l0 v2l0Var = this.e;
        if ((v2l0Var == null || !v2l0Var.c()) && list.get(size) == StickerCommonStyle.ACCENT) {
            size = (indexOf + 2) % list.size();
        }
        return new etm0(list.get(size), list, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etm0)) {
            return false;
        }
        etm0 etm0Var = (etm0) obj;
        return this.b == etm0Var.b && epx.f(this.c, etm0Var.c) && this.d == etm0Var.d && epx.f(this.e, etm0Var.e);
    }

    @Override // com.vk.stickers.api.styles.a
    public final Integer f() {
        int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 5) {
            return Integer.valueOf(dhr0.t.c(R.attr.vk_ui_text_subhead));
        }
        if (i != 8) {
            return null;
        }
        return Integer.valueOf(dhr0.t.c(R.attr.vk_ui_text_secondary));
    }

    @Override // com.vk.stickers.api.styles.a
    public final int g(Context context) {
        v2l0 v2l0Var = this.e;
        StickerCommonStyle stickerCommonStyle = this.b;
        if (v2l0Var != null) {
            return v2l0Var.b(context, stickerCommonStyle, StickerColorToken.BACKGROUND);
        }
        int i = a.$EnumSwitchMapping$0[stickerCommonStyle.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return context.getColor(this.d.h());
            }
            if (i != 5) {
                return (i == 6 || i == 8 || i == 9) ? dhr0.t.c(R.attr.vk_ui_background_contrast) : dhr0.t.c(R.attr.vk_ui_transparent);
            }
        }
        return dhr0.t.c(R.attr.vk_ui_background_contrast_inverse);
    }

    @Override // com.vk.stickers.api.styles.a
    public final int h(Context context) {
        v2l0 v2l0Var = this.e;
        StickerCommonStyle stickerCommonStyle = this.b;
        if (v2l0Var != null) {
            return v2l0Var.b(context, stickerCommonStyle, StickerColorToken.CONTENT);
        }
        switch (a.$EnumSwitchMapping$0[stickerCommonStyle.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return dhr0.t.c(R.attr.vk_ui_text_contrast);
            case 5:
                return dhr0.t.c(R.attr.vk_ui_text_contrast);
            case 6:
            case 7:
            case 8:
                return dhr0.t.c(R.attr.vk_ui_text_primary_invariably);
            case 9:
                return context.getColor(this.d.h());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + fw3.a(this.b.hashCode() * 31, 31, this.c)) * 31;
        v2l0 v2l0Var = this.e;
        return hashCode + (v2l0Var == null ? 0 : v2l0Var.hashCode());
    }

    public final String toString() {
        return "StyleInfo(selectedStyle=" + this.b + ", availableStyles=" + this.c + ", accentColor=" + this.d + ", stickerColors=" + this.e + ')';
    }
}
