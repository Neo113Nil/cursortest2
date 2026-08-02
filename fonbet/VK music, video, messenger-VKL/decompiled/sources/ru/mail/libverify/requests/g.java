package ru.mail.libverify.requests;

import android.content.Context;
import android.net.Network;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.UnknownHostException;
import ru.mail.libverify.g0.q;
import ru.mail.verify.core.utils.ClientException;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.ServerException;
import ru.mail.verify.core.utils.json.JsonParseException;
import ru.ok.android.commons.http.Http;

/* loaded from: classes9.dex */
public final class g extends e<ru.mail.libverify.m.h, g> {

    @NonNull
    private final String i;

    public g(@NonNull Context context, @NonNull q qVar, @NonNull String str, @Nullable Network network) {
        super(context, qVar, new ru.mail.libverify.j0.h(str, ""));
        this.i = str;
        this.a = network;
    }

    @Override // ru.mail.libverify.j0.k
    @Nullable
    public final /* bridge */ /* synthetic */ ru.mail.libverify.k0.a a(@NonNull String str) throws JsonParseException {
        return null;
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public final ru.mail.libverify.k0.a e(@NonNull ru.mail.verify.core.utils.b bVar) throws ClientException, ServerException, IOException {
        long parseLong;
        try {
            ru.mail.verify.core.utils.c cVar = (ru.mail.verify.core.utils.c) bVar;
            String a = cVar.a(Http.Header.CONTENT_LENGTH, true);
            if (a != null) {
                try {
                    parseLong = Long.parseLong(a);
                } catch (Exception unused) {
                }
                return new ru.mail.libverify.m.h(cVar.f(), cVar.a("location", true), parseLong);
            }
            parseLong = 0;
            return new ru.mail.libverify.m.h(cVar.f(), cVar.a("location", true), parseLong);
        } catch (Exception e) {
            e.printStackTrace();
            FileLog.e("MobileIdRequest", "mobileId response error:", e);
            return e instanceof UnknownHostException ? new ru.mail.libverify.m.h(-4, null, 0L) : e instanceof ServerException ? new ru.mail.libverify.m.h(((ServerException) e).a(), null, 0L) : new ru.mail.libverify.m.h(-1, null, 0L);
        }
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public final String j() {
        return this.i;
    }

    @Override // ru.mail.libverify.requests.e, ru.mail.libverify.j0.k
    @Nullable
    public final String o() {
        return null;
    }

    @Override // ru.mail.libverify.requests.e, ru.mail.libverify.j0.k
    @Nullable
    public final ru.mail.libverify.j0.l r() {
        return null;
    }

    @Override // ru.mail.libverify.j0.k
    @Nullable
    public final ru.mail.libverify.j0.m t() throws JsonParseException {
        throw null;
    }
}
