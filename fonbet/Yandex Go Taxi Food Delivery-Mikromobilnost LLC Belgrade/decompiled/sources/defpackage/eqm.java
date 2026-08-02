package defpackage;

import com.yx360.design.compose.atoms.DsHeading$Align;
import com.yx360.design.compose.atoms.DsHeading$Size;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class eqm {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DsHeading$Size.values().length];
        try {
            iArr[DsHeading$Size.Xl.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DsHeading$Size.Lg.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DsHeading$Size.Md.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DsHeading$Size.Sm.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DsHeading$Size.Xs.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DsHeading$Size.Xxs.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[DsHeading$Align.values().length];
        try {
            iArr2[DsHeading$Align.Start.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[DsHeading$Align.Center.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
