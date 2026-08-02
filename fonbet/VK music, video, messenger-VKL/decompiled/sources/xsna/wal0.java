package xsna;

import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* compiled from: StickersLogger.kt */
/* loaded from: classes11.dex */
public interface wal0 {

    /* compiled from: StickersLogger.kt */
    public static final class a {
        public static volatile wal0 a = new C3921a();

        /* compiled from: StickersLogger.kt */
        /* renamed from: xsna.wal0$a$a, reason: collision with other inner class name */
        public static final class C3921a implements wal0 {
            @Override // xsna.wal0
            public final void a(Throwable th, String... strArr) {
                Log.e("DefaultStickersLogger", rl3.Z(strArr, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, null, 62) + "\nError: " + mnh0.A(th));
            }
        }
    }

    void a(Throwable th, String... strArr);
}
