package xsna;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: SideWriter.kt */
/* loaded from: classes7.dex */
public final class ilj0 {
    public final BufferedWriter a;
    public final ExecutorService b = Executors.newSingleThreadExecutor();
    public final a c = new a();

    /* compiled from: SideWriter.kt */
    public static final class a extends ThreadLocal<Calendar> {
        @Override // java.lang.ThreadLocal
        public final Calendar initialValue() {
            return Calendar.getInstance();
        }
    }

    public ilj0(String str) {
        this.a = new BufferedWriter(new FileWriter(str));
    }
}
