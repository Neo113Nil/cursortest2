package xsna;

import java.util.Calendar;

/* compiled from: TimeUtils.kt */
/* loaded from: classes6.dex */
public final class rvo0 {
    public static final a a = new a();

    /* compiled from: TimeUtils.kt */
    public static final class a extends ThreadLocal<Calendar> {
        @Override // java.lang.ThreadLocal
        public final Calendar initialValue() {
            return Calendar.getInstance();
        }
    }
}
