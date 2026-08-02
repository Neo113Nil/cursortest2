package defpackage;

import com.ybsdk.feature.autotopup.internal.network.dto.regular.DayOfWeekDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.RegularAutotopupStatusDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.RegularAutotopupTypeDto;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class bsi0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[DayOfWeekDto.values().length];
        try {
            iArr[DayOfWeekDto.MON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DayOfWeekDto.TUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DayOfWeekDto.WED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DayOfWeekDto.THU.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DayOfWeekDto.FRI.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DayOfWeekDto.SAT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DayOfWeekDto.SUN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
        int[] iArr2 = new int[RegularAutotopupTypeDto.values().length];
        try {
            iArr2[RegularAutotopupTypeDto.ONCE_PER_WEEK.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[RegularAutotopupTypeDto.ONCE_PER_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[RegularAutotopupTypeDto.TWICE_PER_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr2;
        int[] iArr3 = new int[RegularAutotopupStatusDto.values().length];
        try {
            iArr3[RegularAutotopupStatusDto.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[RegularAutotopupStatusDto.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        c = iArr3;
    }
}
