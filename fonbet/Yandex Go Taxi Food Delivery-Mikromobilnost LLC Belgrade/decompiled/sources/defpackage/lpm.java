package defpackage;

import com.yx360.design.compose.atoms.DsButton$Size;
import com.yx360.design.compose.atoms.DsButton$State;
import com.yx360.design.compose.atoms.DsButton$Style;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class lpm {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[DsButton$Style.values().length];
        try {
            iArr[DsButton$Style.Brand.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DsButton$Style.Neutral.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DsButton$Style.Contrast.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DsButton$Style.StaticLight.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DsButton$Style.Danger.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DsButton$Style.Success.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DsButton$Style.Warning.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[DsButton$Style.Info.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
        int[] iArr2 = new int[DsButton$Size.values().length];
        try {
            iArr2[DsButton$Size.Lg.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[DsButton$Size.Md.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[DsButton$Size.Sm.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        b = iArr2;
        int[] iArr3 = new int[DsButton$State.values().length];
        try {
            iArr3[DsButton$State.Disabled.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[DsButton$State.Default.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[DsButton$State.Pressed.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        c = iArr3;
    }
}
