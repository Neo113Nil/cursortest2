package ru.mail.libverify.u;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public final class x {

    @NonNull
    private final ru.mail.libverify.requests.c b;

    @NonNull
    private final w c;
    private boolean a = false;
    private final ru.mail.libverify.storage.m d = new ru.mail.libverify.storage.m();

    public x(@NonNull ru.mail.libverify.requests.c cVar, @NonNull w wVar) {
        this.b = cVar;
        this.c = wVar;
    }

    @Nullable
    public final String a() {
        String str = null;
        if (this.a) {
            return null;
        }
        this.a = true;
        try {
            str = this.d.a(this.b, this.c);
        } catch (IllegalStateException e) {
            ru.mail.libverify.n0.b.a("Runner", "Failed to execute request: ", e);
        } catch (Exception unused) {
        }
        return str == null ? "" : str;
    }
}
