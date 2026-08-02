package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.superapp.ui.uniwidgets.blocks.ButtonBlock;
import com.vk.superapp.ui.uniwidgets.blocks.IconBlock;
import com.vk.superapp.ui.uniwidgets.blocks.ImageBlock;
import kotlin.NoWhenBranchMatchedException;
import xsna.thn0;

/* compiled from: ConstructorUtils.kt */
/* loaded from: classes6.dex */
public final class z6j {

    /* compiled from: ConstructorUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[ButtonBlock.Style.values().length];
            try {
                iArr[ButtonBlock.Style.TERTIARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonBlock.Style.TERTIARY_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonBlock.Style.TERTIARY_ICON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonBlock.Style.TERTIARY_WITH_ICON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonBlock.Style.OUTLINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ButtonBlock.Style.OUTLINE_TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ButtonBlock.Style.OUTLINE_WITH_ICON.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ButtonBlock.Style.OUTLINE_ICON.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ButtonBlock.Style.PRIMARY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ButtonBlock.Style.SECONDARY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImageBlock.Style.Size.values().length];
            try {
                iArr2[ImageBlock.Style.Size.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ImageBlock.Style.Size.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ImageBlock.Style.Size.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ImageBlock.Style.Size.EXTRA_LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[ImageBlock.Style.Size.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ImageBlock.Style.Outline.values().length];
            try {
                iArr3[ImageBlock.Style.Outline.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[ImageBlock.Style.Outline.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[ImageBlock.Style.Outline.TV.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[ImageBlock.Style.Outline.APP.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[ImageBlock.Style.Outline.POSTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[IconBlock.Size.values().length];
            try {
                iArr4[IconBlock.Size.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[IconBlock.Size.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static thn0.a a(ButtonBlock.Style style) {
        switch (a.$EnumSwitchMapping$0[style.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                thn0 thn0Var = m3q0.b;
                return (thn0Var != null ? thn0Var : null).f.c;
            case 5:
            case 6:
            case 7:
            case 8:
                thn0 thn0Var2 = m3q0.b;
                return (thn0Var2 != null ? thn0Var2 : null).f.d;
            case 9:
                thn0 thn0Var3 = m3q0.b;
                return (thn0Var3 != null ? thn0Var3 : null).f.a;
            case 10:
                thn0 thn0Var4 = m3q0.b;
                return (thn0Var4 != null ? thn0Var4 : null).f.b;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static thn0.h b(IconBlock.Size size) {
        int i = a.$EnumSwitchMapping$3[size.ordinal()];
        if (i == 1) {
            thn0 thn0Var = m3q0.b;
            return (thn0Var != null ? thn0Var : null).b.a;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        thn0 thn0Var2 = m3q0.b;
        return (thn0Var2 != null ? thn0Var2 : null).b.b;
    }

    public static thn0.f c(ImageBlock.Style style) {
        int i = a.$EnumSwitchMapping$2[style.c.ordinal()];
        if (i == 1) {
            thn0 thn0Var = m3q0.b;
            return (thn0Var != null ? thn0Var : null).a.a;
        }
        if (i == 2) {
            thn0 thn0Var2 = m3q0.b;
            return (thn0Var2 != null ? thn0Var2 : null).a.b;
        }
        if (i == 3) {
            thn0 thn0Var3 = m3q0.b;
            return (thn0Var3 != null ? thn0Var3 : null).a.d;
        }
        if (i == 4) {
            thn0 thn0Var4 = m3q0.b;
            return (thn0Var4 != null ? thn0Var4 : null).a.c;
        }
        if (i != 5) {
            thn0 thn0Var5 = m3q0.b;
            return (thn0Var5 != null ? thn0Var5 : null).a.b;
        }
        thn0 thn0Var6 = m3q0.b;
        return (thn0Var6 != null ? thn0Var6 : null).a.e;
    }

    public static float d(ImageBlock.Style style) {
        thn0.h e = e(style.b, c(style));
        return e != null ? e.c : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static thn0.h e(ImageBlock.Style.Size size, thn0.f fVar) {
        int i = a.$EnumSwitchMapping$1[size.ordinal()];
        if (i == 1) {
            return fVar.a;
        }
        if (i == 2) {
            return fVar.b;
        }
        if (i == 3) {
            return fVar.c;
        }
        if (i == 4) {
            return fVar.d;
        }
        if (i == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int f(ImageBlock.Style style) {
        return iah0.a(e(style.b, c(style)) != null ? r1.a : 0);
    }
}
