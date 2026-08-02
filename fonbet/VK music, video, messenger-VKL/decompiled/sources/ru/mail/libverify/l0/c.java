package ru.mail.libverify.l0;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;

/* loaded from: classes9.dex */
public abstract class c {
    protected static final d a = new d();

    public static boolean a(@NonNull Context context) {
        return a.a(new File(ru.mail.libverify.n0.e.c(context), "VERIFY_INSTALLATION"));
    }
}
