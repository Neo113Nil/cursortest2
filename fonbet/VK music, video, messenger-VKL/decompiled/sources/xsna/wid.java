package xsna;

import com.vk.clips.config.viewers.api.experiments.models.ClipsAutoScrollConfig;
import java.util.Calendar;

/* compiled from: ClipsAutoScrollLocalDataSource.kt */
/* loaded from: classes17.dex */
public final class wid {
    public final hh1 a;
    public final xid b;
    public final bv0 c;
    public final cj4 d;
    public final io.reactivex.rxjava3.subjects.h e;
    public io.reactivex.rxjava3.disposables.c f;

    /* compiled from: ClipsAutoScrollLocalDataSource.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsAutoScrollConfig.ResetPeriod.values().length];
            try {
                iArr[ClipsAutoScrollConfig.ResetPeriod.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsAutoScrollConfig.ResetPeriod.N_DAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsAutoScrollConfig.ResetPeriod.WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipsAutoScrollConfig.ResetPeriod.SESSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public wid(hh1 hh1Var, xid xidVar) {
        bv0 bv0Var = new bv0(6);
        cj4 cj4Var = new cj4(5);
        this.a = hh1Var;
        this.b = xidVar;
        this.c = bv0Var;
        this.d = cj4Var;
        this.e = new io.reactivex.rxjava3.subjects.f().M0();
    }

    public static long a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.add(6, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static long b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(7);
        calendar.add(6, i != 2 ? (9 - i) % 7 : 7);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }
}
