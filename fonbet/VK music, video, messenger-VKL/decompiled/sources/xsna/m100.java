package xsna;

import android.util.Log;
import androidx.annotation.NonNull;

/* compiled from: Logger.java */
/* loaded from: classes.dex */
public abstract class m100 {
    public static final Object a = new Object();
    public static volatile a b;

    /* compiled from: Logger.java */
    public static class a extends m100 {
        public final int c;

        public a(int i) {
            this.c = i;
        }

        @Override // xsna.m100
        public final void a(@NonNull String str, @NonNull String str2) {
            if (this.c <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // xsna.m100
        public final void b(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
            if (this.c <= 6) {
                Log.e(str, str2, th);
            }
        }
    }

    @NonNull
    public static m100 c() {
        a aVar;
        synchronized (a) {
            try {
                if (b == null) {
                    b = new a(3);
                }
                aVar = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @NonNull
    public static String d(@NonNull String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(@NonNull String str, @NonNull String str2);

    public abstract void b(@NonNull String str, @NonNull String str2, @NonNull Throwable th);
}
