package ru.mail.libverify.l0;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;

/* loaded from: classes9.dex */
public final class i {
    private static final d a = new d();
    private static File b;

    public static boolean a(@NonNull Context context) {
        d dVar = a;
        if (b == null) {
            b = new File(ru.mail.libverify.n0.e.c(context), "NOTIFY_INSTALLATION");
        }
        return dVar.a(b);
    }
}
