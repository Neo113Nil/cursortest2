package ru.mail.libverify.requests;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.net.MalformedURLException;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.u.w;
import ru.mail.libverify.u.x;
import ru.mail.verify.core.utils.json.JsonParseException;

/* loaded from: classes9.dex */
public final class a extends c<a, ru.mail.libverify.m.a> {

    @NonNull
    private final ru.mail.libverify.j0.i l;

    @NonNull
    private final b m;

    @NonNull
    private final x n;

    @Nullable
    private ru.mail.libverify.j0.f o;

    private a(@NonNull w wVar, @NonNull String str, @NonNull String str2, @NonNull VerificationApi.VerificationSource verificationSource, @NonNull String str3) throws MalformedURLException {
        super(wVar);
        this.o = null;
        this.l = new ru.mail.libverify.j0.i(str);
        this.m = new b(str, str2, verificationSource, str3);
        this.n = new x(this, wVar);
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public final ru.mail.libverify.k0.a a(@NonNull String str) throws JsonParseException {
        ru.mail.libverify.m.a aVar = (ru.mail.libverify.m.a) ru.mail.libverify.q0.a.a(str, ru.mail.libverify.m.a.class);
        if (aVar.i() != null) {
            ru.mail.libverify.m.f i = aVar.i();
            this.h.u();
            i.b(System.currentTimeMillis());
        }
        return aVar;
    }

    @Override // ru.mail.libverify.requests.c, ru.mail.libverify.j0.k
    @NonNull
    public final String c() {
        return this.l.a();
    }

    @Override // ru.mail.libverify.requests.c, ru.mail.libverify.j0.k
    @NonNull
    public final String e() {
        return this.l.b();
    }

    @Override // ru.mail.libverify.requests.c, ru.mail.libverify.j0.k
    @NonNull
    public final String o() {
        return this.l.c();
    }

    @Override // ru.mail.libverify.requests.c, ru.mail.libverify.j0.k
    @NonNull
    public final ru.mail.libverify.j0.f p() {
        String a = this.n.a();
        ru.mail.libverify.j0.f fVar = this.o;
        if (fVar != null && !fVar.isEmpty()) {
            return this.o;
        }
        this.o = new ru.mail.libverify.j0.f(this.l.d());
        if (!TextUtils.isEmpty(a)) {
            this.o.put(CommonUrlParts.REQUEST_ID, a);
        }
        this.o.put("application", this.h.G());
        this.o.put("platform", "android");
        this.o.put("code", this.m.code);
        this.o.put("application_id", this.m.applicationId);
        this.o.put("code_source", this.m.codeSource.toString());
        return this.o;
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public final ru.mail.libverify.j0.l r() {
        return this.m;
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public final ru.mail.libverify.j0.m t() throws JsonParseException {
        return new ru.mail.libverify.j0.m(ru.mail.libverify.q0.a.f(this.m));
    }

    @Override // ru.mail.libverify.requests.c
    public final boolean w() {
        return false;
    }

    public a(@NonNull w wVar, @NonNull String str, @NonNull String str2, @NonNull VerificationApi.VerificationSource verificationSource) throws MalformedURLException {
        this(wVar, str, str2, verificationSource, wVar.getId());
    }

    public a(@NonNull w wVar, @NonNull String str, @NonNull String str2, @NonNull String str3) throws MalformedURLException {
        this(wVar, str, str2, VerificationApi.VerificationSource.APPLICATION_EXTERNAL, str3);
    }

    public a(@NonNull w wVar, @NonNull ru.mail.libverify.j0.m mVar) throws JsonParseException, MalformedURLException {
        super(wVar);
        this.o = null;
        b bVar = (b) ru.mail.libverify.q0.a.a(mVar.a, b.class);
        this.m = bVar;
        this.l = new ru.mail.libverify.j0.i(bVar.verificationUrl);
        this.n = new x(this, wVar);
    }
}
