package defpackage;

import com.yx360.design.compose.atoms.DsAvatar$Form;
import com.yx360.design.compose.atoms.DsAvatar$Size;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class hom {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DsAvatar$Size.values().length];
        try {
            iArr[DsAvatar$Size.M12.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DsAvatar$Size.M13.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DsAvatar$Size.M16.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DsAvatar$Size.M20.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DsAvatar$Size.M24.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DsAvatar$Size.M28.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DsAvatar$Size.M36.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[DsAvatar$Size.M40.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
        int[] iArr2 = new int[DsAvatar$Form.values().length];
        try {
            iArr2[DsAvatar$Form.Circle.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[DsAvatar$Form.Square.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr2;
    }
}
