package ru.mail.libverify.r;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import ru.mail.libverify.m.i;
import ru.mail.libverify.requests.h;
import ru.mail.libverify.u.w;
import ru.mail.verify.core.utils.ClientException;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.ServerException;

/* loaded from: classes9.dex */
public final class b {

    @NonNull
    private final w a;

    @NonNull
    private final ru.mail.libverify.p.b b;

    @Nullable
    private ru.mail.libverify.p.a c;

    public b(@NonNull w wVar, @NonNull ru.mail.libverify.p.b bVar) {
        this.a = wVar;
        this.b = bVar;
    }

    @NonNull
    public final c a(@NonNull String str, @NonNull a aVar) {
        try {
            i b = new h(this.a, this.b, str, aVar).b();
            this.c = b.h();
            return b.i();
        } catch (IOException | ClientException | ServerException e) {
            this.b.getClass();
            FileLog.d("Omicron", "onResponseError " + str + ", -1");
            ru.mail.libverify.n0.b.a("NetworkDataRetriever", "Failed to retrieve Omicron config", e);
            return c.ERROR;
        }
    }

    @NonNull
    public final ru.mail.libverify.p.a a() {
        ru.mail.libverify.p.a aVar = this.c;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Cannot get data if retrieve status is not SUCCESS");
    }
}
