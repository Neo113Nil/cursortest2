package ru.ok.tracer.base.ucum;

import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UcumUtils.kt */
/* loaded from: classes9.dex */
public final class UcumUtils {
    public static final String UCUM_DAYS = "d";
    public static final String UCUM_HOURS = "h";
    public static final String UCUM_MICROSECONDS = "us";
    public static final String UCUM_MILLISECODS = "ms";
    public static final String UCUM_MINUTES = "min";
    public static final String UCUM_NANOSECONDS = "ns";
    public static final String UCUM_SECONDS = "s";

    /* compiled from: UcumUtils.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getToUcumString(TimeUnit timeUnit) {
        switch (WhenMappings.$EnumSwitchMapping$0[timeUnit.ordinal()]) {
            case 1:
                return UCUM_NANOSECONDS;
            case 2:
                return UCUM_MICROSECONDS;
            case 3:
                return UCUM_MILLISECODS;
            case 4:
                return UCUM_SECONDS;
            case 5:
                return UCUM_MINUTES;
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
