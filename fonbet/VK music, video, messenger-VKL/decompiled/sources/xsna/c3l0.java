package xsna;

import android.content.Context;
import com.vk.stickers.api.styles.StickerColorToken;
import com.vk.stickers.styles.colorpalette.ColorPaletteType;
import com.vk.stickers.styles.colorpalette.ColorTone;
import com.vkontakte.android.R;
import java.util.HashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: StickerContentColorTheme.kt */
/* loaded from: classes6.dex */
public final class c3l0 implements u2l0, w8i {
    public final int b;
    public final Object c;
    public final Object d;

    /* compiled from: StickerContentColorTheme.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[StickerColorToken.values().length];
            try {
                iArr[StickerColorToken.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickerColorToken.CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StickerColorToken.QUESTION_CARD_BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StickerColorToken.QUESTION_INPUT_POINTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StickerColorToken.QUESTION_TITLE_INPUT_PLACEHOLDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StickerColorToken.QUESTION_TITLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StickerColorToken.QUESTION_CONTENT_INPUT_PLACEHOLDER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StickerColorToken.QUESTION_CONTENT_INPUT_BACKGROUND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StickerColorToken.QUESTION_CONTENT_INPUT_TEXT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[StickerColorToken.QUESTION_PRIMARY_BUTTON.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[StickerColorToken.QUESTION_SECONDARY_BUTTON.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[StickerColorToken.QUESTION_SELECTOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[StickerColorToken.POLL_PREVIEW_BACKGROUND.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[StickerColorToken.POLL_PREVIEW_CONTENT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[StickerColorToken.POLL_TITLE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[StickerColorToken.POLL_SUBTITLE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[StickerColorToken.POLL_OPTION_BACKGROUND.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[StickerColorToken.POLL_OPTION_RESULT_BACKGROUND.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[StickerColorToken.POLL_OPTION_RESULT_TEXT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[StickerColorToken.POLL_OPTION_TEXT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[StickerColorToken.POLL_BACKGROUND.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[StickerColorToken.POLL_MULTIVOTE_BUTTON_BACKGROUND_FILL.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[StickerColorToken.POLL_MULTIVOTE_BUTTON_BACKGROUND_PRESSED.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[StickerColorToken.POLL_MULTIVOTE_BUTTON_TEXT.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[StickerColorToken.POLL_MULTIVOTE_OPTION_CHECKBOX.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ColorPaletteType.values().length];
            try {
                iArr2[ColorPaletteType.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[ColorPaletteType.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public c3l0(int i) {
        this.b = i;
        lbc0 lbc0Var = new lbc0(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, lbc0Var);
        this.d = msy.a(lazyThreadSafetyMode, new myd0(this, 12));
    }

    @Override // xsna.u2l0
    public final int a(Context context, StickerColorToken stickerColorToken) {
        l7s v = bwt0.v(context);
        switch (a.$EnumSwitchMapping$0[stickerColorToken.ordinal()]) {
            case 1:
                return b(ColorPaletteType.PRIMARY, ColorTone.TONE_50);
            case 2:
                return dhr0.t.c(R.attr.vk_ui_text_contrast);
            case 3:
                return context.getColor(R.color.vk_white);
            case 4:
                return b(ColorPaletteType.PRIMARY, ColorTone.TONE_50);
            case 5:
                return dhr0.t.c(R.attr.vk_ui_text_tertiary);
            case 6:
                return b(ColorPaletteType.PRIMARY, ColorTone.TONE_5);
            case 7:
                return b(ColorPaletteType.SECONDARY, ColorTone.TONE_50);
            case 8:
                return b(ColorPaletteType.SECONDARY, ColorTone.TONE_95);
            case 9:
                return b(ColorPaletteType.SECONDARY, ColorTone.TONE_20);
            case 10:
                return b(ColorPaletteType.PRIMARY, ColorTone.TONE_50);
            case 11:
                return dhr0.t.c(R.attr.vk_ui_text_secondary);
            case 12:
                return b(ColorPaletteType.PRIMARY, ColorTone.TONE_90);
            case 13:
                return e3m.f(R.attr.vk_ui_background_contrast_themed, v);
            case 14:
                return b(ColorPaletteType.PRIMARY, ColorTone.TONE_80);
            case 15:
                return b(ColorPaletteType.PRIMARY, ColorTone.TONE_5);
            case 16:
                return e3m.f(R.attr.vk_ui_text_secondary, v);
            case 17:
                return b(ColorPaletteType.SECONDARY, ColorTone.TONE_95);
            case 18:
                return b(ColorPaletteType.PRIMARY, ColorTone.TONE_80);
            case 19:
                return b(ColorPaletteType.PRIMARY, ColorTone.TONE_50);
            case 20:
                return b(ColorPaletteType.PRIMARY, ColorTone.TONE_5);
            case 21:
                return e3m.f(R.attr.vk_ui_background_contrast, v);
            case 22:
                return b(ColorPaletteType.SECONDARY, ColorTone.TONE_50);
            case 23:
                return b(ColorPaletteType.PRIMARY, ColorTone.TONE_50);
            case 24:
                return e3m.f(R.attr.vk_ui_text_contrast_themed, v);
            case 25:
                return b(ColorPaletteType.PRIMARY, ColorTone.TONE_50);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x030f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(ColorPaletteType colorPaletteType, ColorTone colorTone) {
        k8g k8gVar;
        int i;
        int o;
        int i2;
        int i3;
        double degrees;
        double d;
        double d2;
        double[] dArr;
        int ceil;
        double floor;
        double[] dArr2;
        double[] dArr3;
        double[] C;
        int i4 = a.$EnumSwitchMapping$1[colorPaletteType.ordinal()];
        if (i4 == 1) {
            k8gVar = (k8g) this.c.getValue();
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            k8gVar = (k8g) this.d.getValue();
        }
        int h = colorTone.h();
        HashMap hashMap = k8gVar.b;
        Integer num = (Integer) hashMap.get(Integer.valueOf(h));
        if (num != null) {
            return num.intValue();
        }
        double d3 = k8gVar.c;
        double d4 = k8gVar.a;
        double d5 = h;
        double[] dArr4 = m200.f;
        int i5 = 1;
        int i6 = 8;
        if (d4 >= 1.0E-4d && d5 >= 1.0E-4d && d5 <= 99.9999d) {
            double d6 = d3 % 360.0d;
            if (d6 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                d6 += 360.0d;
            }
            double d7 = (d6 / 180.0d) * 3.141592653589793d;
            double G = q6x.G(d5);
            double sqrt = Math.sqrt(G) * 11.0d;
            a4u0 a4u0Var = a4u0.k;
            double pow = 1.0d / Math.pow(1.64d - Math.pow(0.29d, a4u0Var.f), 0.73d);
            double cos = (Math.cos(d7 + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * a4u0Var.e * a4u0Var.c;
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d7);
            int i7 = 0;
            while (true) {
                dArr = dArr4;
                if (i7 >= 5) {
                    i = h;
                    break;
                }
                double d8 = sin;
                double d9 = sqrt / 100.0d;
                double pow2 = Math.pow(((d4 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE || sqrt == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) ? 0.0d : d4 / Math.sqrt(d9)) * pow, 1.1111111111111112d);
                i = h;
                double pow3 = (Math.pow(d9, (1.0d / a4u0Var.d) / a4u0Var.j) * a4u0Var.a) / a4u0Var.b;
                double d10 = (((pow3 + 0.305d) * 23.0d) * pow2) / (((108.0d * pow2) * d8) + (((pow2 * 11.0d) * cos2) + (23.0d * cos)));
                double d11 = d10 * cos2;
                double d12 = d10 * d8;
                double d13 = pow3 * 460.0d;
                C = fdi.C(new double[]{m200.w(((288.0d * d12) + ((451.0d * d11) + d13)) / 1403.0d), m200.w(((d13 - (891.0d * d11)) - (261.0d * d12)) / 1403.0d), m200.w(((d13 - (d11 * 220.0d)) - (d12 * 6300.0d)) / 1403.0d)}, m200.e);
                double d14 = C[0];
                if (d14 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    break;
                }
                double d15 = C[1];
                if (d15 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    break;
                }
                double d16 = C[2];
                if (d16 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    break;
                }
                double d17 = (dArr[2] * d16) + (dArr[1] * d15) + (dArr[0] * d14);
                if (d17 <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    break;
                }
                if (i7 == 4) {
                    break;
                }
                double d18 = d17 - G;
                if (Math.abs(d18) < 0.002d) {
                    break;
                }
                sqrt -= (d18 * sqrt) / (d17 * 2.0d);
                i7++;
                dArr4 = dArr;
                sin = d8;
                h = i;
            }
            double d19 = C[0];
            if (d19 <= 100.01d && C[1] <= 100.01d && C[2] <= 100.01d) {
                i3 = (q6x.o(C[2]) & 255) | ((q6x.o(d19) & 255) << 16) | (-16777216) | ((q6x.o(C[1]) & 255) << 8);
                if (i3 == 0) {
                    double[] dArr5 = {-1.0d, -1.0d, -1.0d};
                    double[] dArr6 = dArr5;
                    boolean z = false;
                    int i8 = 0;
                    boolean z2 = true;
                    double d20 = 0.0d;
                    double d21 = 0.0d;
                    while (i8 < 12) {
                        double d22 = dArr[0];
                        double d23 = dArr[i5];
                        double d24 = dArr[2];
                        double d25 = i8 % 4 <= i5 ? 0.0d : 100.0d;
                        double d26 = i8 % 2 == 0 ? 0.0d : 100.0d;
                        if (i8 < 4) {
                            double d27 = ((G - (d23 * d25)) - (d24 * d26)) / d22;
                            dArr2 = m200.y(d27) ? new double[]{d27, d25, d26} : new double[]{-1.0d, -1.0d, -1.0d};
                        } else if (i8 < i6) {
                            double d28 = ((G - (d22 * d26)) - (d24 * d25)) / d23;
                            if (m200.y(d28)) {
                                dArr3 = new double[]{d26, d28, d25};
                                if (dArr3[0] >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                    double v = m200.v(dArr3);
                                    if (!z) {
                                        dArr5 = dArr3;
                                        dArr6 = dArr5;
                                        d20 = v;
                                        d21 = d20;
                                        z = true;
                                    } else if (z2 || m200.d(d20, v, d21)) {
                                        double d29 = d20;
                                        d20 = d29;
                                        if (m200.d(d29, d7, v)) {
                                            dArr6 = dArr3;
                                            z2 = false;
                                            d21 = v;
                                        } else {
                                            dArr5 = dArr3;
                                            z2 = false;
                                            d20 = v;
                                        }
                                    }
                                }
                                i8++;
                                i6 = 8;
                                i5 = 1;
                            } else {
                                dArr2 = new double[]{-1.0d, -1.0d, -1.0d};
                            }
                        } else {
                            double d30 = ((G - (d22 * d25)) - (d23 * d26)) / d24;
                            if (m200.y(d30)) {
                                dArr3 = new double[]{d25, d26, d30};
                                if (dArr3[0] >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                }
                                i8++;
                                i6 = 8;
                                i5 = 1;
                            } else {
                                dArr2 = new double[]{-1.0d, -1.0d, -1.0d};
                            }
                        }
                        dArr3 = dArr2;
                        if (dArr3[0] >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        }
                        i8++;
                        i6 = 8;
                        i5 = 1;
                    }
                    double[][] dArr7 = {dArr5, dArr6};
                    double[] dArr8 = dArr7[0];
                    double v2 = m200.v(dArr8);
                    double[] dArr9 = dArr7[1];
                    for (int i9 = 0; i9 < 3; i9++) {
                        double d31 = dArr8[i9];
                        double d32 = dArr9[i9];
                        if (d31 != d32) {
                            if (d31 < d32) {
                                ceil = (int) Math.floor(m200.F(d31) - 0.5d);
                                floor = Math.ceil(m200.F(dArr9[i9]) - 0.5d);
                            } else {
                                ceil = (int) Math.ceil(m200.F(d31) - 0.5d);
                                floor = Math.floor(m200.F(dArr9[i9]) - 0.5d);
                            }
                            int i10 = (int) floor;
                            double d33 = v2;
                            for (int i11 = 0; i11 < 8 && Math.abs(i10 - ceil) > 1; i11++) {
                                int floor2 = (int) Math.floor((ceil + i10) / 2.0d);
                                double d34 = m200.g[floor2];
                                double d35 = dArr8[i9];
                                double d36 = (d34 - d35) / (dArr9[i9] - d35);
                                double d37 = dArr8[0];
                                double d38 = ((dArr9[0] - d37) * d36) + d37;
                                double d39 = dArr8[1];
                                double d40 = ((dArr9[1] - d39) * d36) + d39;
                                double d41 = dArr8[2];
                                double[] dArr10 = {d38, d40, ((dArr9[2] - d41) * d36) + d41};
                                double v3 = m200.v(dArr10);
                                if (m200.d(d33, d7, v3)) {
                                    i10 = floor2;
                                    dArr9 = dArr10;
                                } else {
                                    ceil = floor2;
                                    dArr8 = dArr10;
                                    d33 = v3;
                                }
                            }
                            v2 = d33;
                        }
                    }
                    double[] dArr11 = {(dArr8[0] + dArr9[0]) / 2.0d, (dArr8[1] + dArr9[1]) / 2.0d, (dArr8[2] + dArr9[2]) / 2.0d};
                    i2 = ((q6x.o(dArr11[0]) & 255) << 16) | (-16777216) | ((q6x.o(dArr11[1]) & 255) << 8);
                    o = q6x.o(dArr11[2]) & 255;
                }
                a4u0 a4u0Var2 = a4u0.k;
                int i12 = i3 & 255;
                double B = q6x.B((16711680 & i3) >> 16);
                double B2 = q6x.B((65280 & i3) >> 8);
                double B3 = q6x.B(i12);
                double d42 = (0.18051042d * B3) + (0.35762064d * B2) + (0.41233895d * B);
                double d43 = (0.0722d * B3) + (0.7152d * B2) + (0.2126d * B);
                double d44 = (B3 * 0.95034478d) + (B2 * 0.11916382d) + (B * 0.01932141d);
                double[][] dArr12 = sd9.b;
                double[] dArr13 = dArr12[0];
                double d45 = (dArr13[2] * d44) + (dArr13[1] * d43) + (dArr13[0] * d42);
                double[] dArr14 = dArr12[1];
                double d46 = (dArr14[2] * d44) + (dArr14[1] * d43) + (dArr14[0] * d42);
                double[] dArr15 = dArr12[2];
                double d47 = (d44 * dArr15[2]) + (d43 * dArr15[1]) + (d42 * dArr15[0]);
                double[] dArr16 = a4u0Var2.g;
                double d48 = a4u0Var2.i;
                double d49 = a4u0Var2.d;
                int i13 = i3;
                double d50 = a4u0Var2.a;
                double d51 = dArr16[0] * d45;
                double d52 = dArr16[1] * d46;
                double d53 = dArr16[2] * d47;
                double d54 = a4u0Var2.h;
                double pow4 = Math.pow((Math.abs(d51) * d54) / 100.0d, 0.42d);
                double pow5 = Math.pow((Math.abs(d52) * d54) / 100.0d, 0.42d);
                double pow6 = Math.pow((Math.abs(d53) * d54) / 100.0d, 0.42d);
                double signum = ((Math.signum(d51) * 400.0d) * pow4) / (pow4 + 27.13d);
                double signum2 = ((Math.signum(d52) * 400.0d) * pow5) / (pow5 + 27.13d);
                double signum3 = ((Math.signum(d53) * 400.0d) * pow6) / (pow6 + 27.13d);
                double d55 = ((((-12.0d) * signum2) + (signum * 11.0d)) + signum3) / 11.0d;
                double d56 = ((signum + signum2) - (signum3 * 2.0d)) / 9.0d;
                double d57 = signum2 * 20.0d;
                double d58 = ((21.0d * signum3) + ((signum * 20.0d) + d57)) / 20.0d;
                double d59 = (((signum * 40.0d) + d57) + signum3) / 20.0d;
                degrees = Math.toDegrees(Math.atan2(d56, d55));
                if (degrees < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    degrees += 360.0d;
                } else if (degrees >= 360.0d) {
                    degrees -= 360.0d;
                }
                double radians = Math.toRadians(degrees);
                d = degrees;
                double pow7 = (Math.pow((d59 * a4u0Var2.b) / d50, a4u0Var2.j * d49) * 100.0d) / 100.0d;
                Math.sqrt(pow7);
                double d60 = d50 + 4.0d;
                if (d < 20.14d) {
                    d += 360.0d;
                }
                double pow8 = Math.pow((Math.hypot(d55, d56) * (((((Math.cos(Math.toRadians(d) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * a4u0Var2.e) * a4u0Var2.c)) / (d58 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, a4u0Var2.f), 0.73d);
                double sqrt2 = Math.sqrt(pow7) * pow8 * d48;
                Math.sqrt((pow8 * d49) / d60);
                Math.log1p(sqrt2 * 0.0228d);
                Math.cos(radians);
                Math.sin(radians);
                d2 = fdi.C(new double[]{q6x.B((i13 >> 16) & 255), q6x.B((i13 >> 8) & 255), q6x.B(i12)}, q6x.d)[1] / 100.0d;
                if (d2 > 0.008856451679035631d) {
                    Math.pow(d2, 0.3333333333333333d);
                }
                hashMap.put(Integer.valueOf(i), Integer.valueOf(i13));
                return i13;
            }
            i3 = 0;
            if (i3 == 0) {
            }
            a4u0 a4u0Var22 = a4u0.k;
            int i122 = i3 & 255;
            double B4 = q6x.B((16711680 & i3) >> 16);
            double B22 = q6x.B((65280 & i3) >> 8);
            double B32 = q6x.B(i122);
            double d422 = (0.18051042d * B32) + (0.35762064d * B22) + (0.41233895d * B4);
            double d432 = (0.0722d * B32) + (0.7152d * B22) + (0.2126d * B4);
            double d442 = (B32 * 0.95034478d) + (B22 * 0.11916382d) + (B4 * 0.01932141d);
            double[][] dArr122 = sd9.b;
            double[] dArr132 = dArr122[0];
            double d452 = (dArr132[2] * d442) + (dArr132[1] * d432) + (dArr132[0] * d422);
            double[] dArr142 = dArr122[1];
            double d462 = (dArr142[2] * d442) + (dArr142[1] * d432) + (dArr142[0] * d422);
            double[] dArr152 = dArr122[2];
            double d472 = (d442 * dArr152[2]) + (d432 * dArr152[1]) + (d422 * dArr152[0]);
            double[] dArr162 = a4u0Var22.g;
            double d482 = a4u0Var22.i;
            double d492 = a4u0Var22.d;
            int i132 = i3;
            double d502 = a4u0Var22.a;
            double d512 = dArr162[0] * d452;
            double d522 = dArr162[1] * d462;
            double d532 = dArr162[2] * d472;
            double d542 = a4u0Var22.h;
            double pow42 = Math.pow((Math.abs(d512) * d542) / 100.0d, 0.42d);
            double pow52 = Math.pow((Math.abs(d522) * d542) / 100.0d, 0.42d);
            double pow62 = Math.pow((Math.abs(d532) * d542) / 100.0d, 0.42d);
            double signum4 = ((Math.signum(d512) * 400.0d) * pow42) / (pow42 + 27.13d);
            double signum22 = ((Math.signum(d522) * 400.0d) * pow52) / (pow52 + 27.13d);
            double signum32 = ((Math.signum(d532) * 400.0d) * pow62) / (pow62 + 27.13d);
            double d552 = ((((-12.0d) * signum22) + (signum4 * 11.0d)) + signum32) / 11.0d;
            double d562 = ((signum4 + signum22) - (signum32 * 2.0d)) / 9.0d;
            double d572 = signum22 * 20.0d;
            double d582 = ((21.0d * signum32) + ((signum4 * 20.0d) + d572)) / 20.0d;
            double d592 = (((signum4 * 40.0d) + d572) + signum32) / 20.0d;
            degrees = Math.toDegrees(Math.atan2(d562, d552));
            if (degrees < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            }
            double radians2 = Math.toRadians(degrees);
            d = degrees;
            double pow72 = (Math.pow((d592 * a4u0Var22.b) / d502, a4u0Var22.j * d492) * 100.0d) / 100.0d;
            Math.sqrt(pow72);
            double d602 = d502 + 4.0d;
            if (d < 20.14d) {
            }
            double pow82 = Math.pow((Math.hypot(d552, d562) * (((((Math.cos(Math.toRadians(d) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * a4u0Var22.e) * a4u0Var22.c)) / (d582 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, a4u0Var22.f), 0.73d);
            double sqrt22 = Math.sqrt(pow72) * pow82 * d482;
            Math.sqrt((pow82 * d492) / d602);
            Math.log1p(sqrt22 * 0.0228d);
            Math.cos(radians2);
            Math.sin(radians2);
            d2 = fdi.C(new double[]{q6x.B((i132 >> 16) & 255), q6x.B((i132 >> 8) & 255), q6x.B(i122)}, q6x.d)[1] / 100.0d;
            if (d2 > 0.008856451679035631d) {
            }
            hashMap.put(Integer.valueOf(i), Integer.valueOf(i132));
            return i132;
        }
        i = h;
        o = q6x.o(q6x.G(d5)) & 255;
        i2 = (o << 16) | (-16777216) | (o << 8);
        i3 = i2 | o;
        a4u0 a4u0Var222 = a4u0.k;
        int i1222 = i3 & 255;
        double B42 = q6x.B((16711680 & i3) >> 16);
        double B222 = q6x.B((65280 & i3) >> 8);
        double B322 = q6x.B(i1222);
        double d4222 = (0.18051042d * B322) + (0.35762064d * B222) + (0.41233895d * B42);
        double d4322 = (0.0722d * B322) + (0.7152d * B222) + (0.2126d * B42);
        double d4422 = (B322 * 0.95034478d) + (B222 * 0.11916382d) + (B42 * 0.01932141d);
        double[][] dArr1222 = sd9.b;
        double[] dArr1322 = dArr1222[0];
        double d4522 = (dArr1322[2] * d4422) + (dArr1322[1] * d4322) + (dArr1322[0] * d4222);
        double[] dArr1422 = dArr1222[1];
        double d4622 = (dArr1422[2] * d4422) + (dArr1422[1] * d4322) + (dArr1422[0] * d4222);
        double[] dArr1522 = dArr1222[2];
        double d4722 = (d4422 * dArr1522[2]) + (d4322 * dArr1522[1]) + (d4222 * dArr1522[0]);
        double[] dArr1622 = a4u0Var222.g;
        double d4822 = a4u0Var222.i;
        double d4922 = a4u0Var222.d;
        int i1322 = i3;
        double d5022 = a4u0Var222.a;
        double d5122 = dArr1622[0] * d4522;
        double d5222 = dArr1622[1] * d4622;
        double d5322 = dArr1622[2] * d4722;
        double d5422 = a4u0Var222.h;
        double pow422 = Math.pow((Math.abs(d5122) * d5422) / 100.0d, 0.42d);
        double pow522 = Math.pow((Math.abs(d5222) * d5422) / 100.0d, 0.42d);
        double pow622 = Math.pow((Math.abs(d5322) * d5422) / 100.0d, 0.42d);
        double signum42 = ((Math.signum(d5122) * 400.0d) * pow422) / (pow422 + 27.13d);
        double signum222 = ((Math.signum(d5222) * 400.0d) * pow522) / (pow522 + 27.13d);
        double signum322 = ((Math.signum(d5322) * 400.0d) * pow622) / (pow622 + 27.13d);
        double d5522 = ((((-12.0d) * signum222) + (signum42 * 11.0d)) + signum322) / 11.0d;
        double d5622 = ((signum42 + signum222) - (signum322 * 2.0d)) / 9.0d;
        double d5722 = signum222 * 20.0d;
        double d5822 = ((21.0d * signum322) + ((signum42 * 20.0d) + d5722)) / 20.0d;
        double d5922 = (((signum42 * 40.0d) + d5722) + signum322) / 20.0d;
        degrees = Math.toDegrees(Math.atan2(d5622, d5522));
        if (degrees < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
        }
        double radians22 = Math.toRadians(degrees);
        d = degrees;
        double pow722 = (Math.pow((d5922 * a4u0Var222.b) / d5022, a4u0Var222.j * d4922) * 100.0d) / 100.0d;
        Math.sqrt(pow722);
        double d6022 = d5022 + 4.0d;
        if (d < 20.14d) {
        }
        double pow822 = Math.pow((Math.hypot(d5522, d5622) * (((((Math.cos(Math.toRadians(d) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * a4u0Var222.e) * a4u0Var222.c)) / (d5822 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, a4u0Var222.f), 0.73d);
        double sqrt222 = Math.sqrt(pow722) * pow822 * d4822;
        Math.sqrt((pow822 * d4922) / d6022);
        Math.log1p(sqrt222 * 0.0228d);
        Math.cos(radians22);
        Math.sin(radians22);
        d2 = fdi.C(new double[]{q6x.B((i1322 >> 16) & 255), q6x.B((i1322 >> 8) & 255), q6x.B(i1222)}, q6x.d)[1] / 100.0d;
        if (d2 > 0.008856451679035631d) {
        }
        hashMap.put(Integer.valueOf(i), Integer.valueOf(i1322));
        return i1322;
    }
}
