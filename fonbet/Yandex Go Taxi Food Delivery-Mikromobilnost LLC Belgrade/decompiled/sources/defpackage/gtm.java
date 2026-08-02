package defpackage;

import com.yx360.design.compose.atoms.DsStatus$OnlineStatus;
import com.yx360.design.compose.atoms.DsStatus$Preset;
import com.yx360.design.compose.atoms.DsStatus$Size;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class gtm {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[DsStatus$Size.values().length];
        try {
            iArr[DsStatus$Size.Xs.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DsStatus$Size.Sm.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DsStatus$Size.Md.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DsStatus$Size.Lg.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[DsStatus$Preset.values().length];
        try {
            iArr2[DsStatus$Preset.Success.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[DsStatus$Preset.Danger.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DsStatus$Preset.Unknown.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[DsStatus$OnlineStatus.values().length];
        try {
            iArr3[DsStatus$OnlineStatus.Online.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[DsStatus$OnlineStatus.Away.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[DsStatus$OnlineStatus.Busy.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
    }
}
