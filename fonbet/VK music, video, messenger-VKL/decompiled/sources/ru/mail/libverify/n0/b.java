package ru.mail.libverify.n0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.SmartException;
import xsna.bqy;

/* loaded from: classes9.dex */
public final class b {

    @Nullable
    private static volatile a a;

    @Nullable
    private static bqy<ru.mail.libverify.o.d> b;

    public interface a {
        void a(@Nullable String str, @NonNull SmartException smartException);
    }

    public static void a(@NonNull String str, @Nullable String str2, @NonNull Throwable th) {
        if (str2 == null) {
            str2 = "";
        }
        a(str, th, str2, new Object[0]);
    }

    public static void a(@Nullable bqy<ru.mail.libverify.o.d> bqyVar) {
        b = bqyVar;
    }

    public static void a(@Nullable a aVar) {
        a = aVar;
    }

    @NonNull
    public static SmartException a(@NonNull String str, @NonNull Throwable th, @NonNull String str2, @NonNull Object... objArr) {
        FileLog.e(str, th, str2, objArr);
        a aVar = a;
        String format = String.format(Locale.US, str2, objArr);
        SmartException smartException = new SmartException(format, th);
        bqy<ru.mail.libverify.o.d> bqyVar = b;
        if (bqyVar != null) {
            bqyVar.get().a(th, true);
        }
        if (aVar != null) {
            aVar.a(format, smartException);
        }
        return smartException;
    }
}
