package ru.mail.libverify.q;

import androidx.annotation.NonNull;
import java.util.HashMap;
import ru.mail.libverify.p.g;

/* loaded from: classes9.dex */
public final class c implements b {

    @NonNull
    private final g a;

    public c(@NonNull g gVar) {
        this.a = gVar;
    }

    @Override // ru.mail.libverify.q.b
    public final void a(@NonNull HashMap hashMap) {
        hashMap.put("current_session", Integer.valueOf(this.a.a()));
        hashMap.put("total_sessions", Integer.valueOf(this.a.b()));
    }
}
