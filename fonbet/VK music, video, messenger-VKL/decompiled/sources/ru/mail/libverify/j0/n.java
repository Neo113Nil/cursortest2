package ru.mail.libverify.j0;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class n {
    public static void a(@NonNull b bVar, @NonNull ru.mail.libverify.requests.c cVar) {
        try {
            bVar.a(cVar);
        } catch (Throwable th) {
            ru.mail.libverify.n0.b.a("VerificationApi", th, "Failed to launch request", new Object[0]);
        }
    }
}
