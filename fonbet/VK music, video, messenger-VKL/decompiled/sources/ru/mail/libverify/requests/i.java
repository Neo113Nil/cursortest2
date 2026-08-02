package ru.mail.libverify.requests;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.mail.libverify.u.w;
import ru.mail.verify.core.utils.json.JsonParseException;

/* loaded from: classes9.dex */
public final class i extends c<i, ru.mail.libverify.m.j> {

    @NonNull
    private final w l;

    @NonNull
    private final String m;

    @NonNull
    private final String n;

    @Nullable
    private final String o;
    private final boolean p;

    public i(@NonNull w wVar, @NonNull String str, @NonNull String str2, @Nullable String str3, boolean z) {
        super(wVar);
        this.l = wVar;
        this.m = str;
        this.n = str2;
        this.o = str3;
        this.p = z;
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public final ru.mail.libverify.k0.a a(@NonNull String str) throws JsonParseException {
        return (ru.mail.libverify.m.j) ru.mail.libverify.q0.a.a(str, ru.mail.libverify.m.j.class);
    }

    @Override // ru.mail.libverify.requests.c, ru.mail.libverify.j0.k
    @NonNull
    public final String o() {
        return "smsphoneinfo";
    }

    @Override // ru.mail.libverify.requests.c, ru.mail.libverify.j0.k
    @NonNull
    public final ru.mail.libverify.j0.f p() {
        ru.mail.libverify.j0.f fVar = new ru.mail.libverify.j0.f();
        if (!TextUtils.isEmpty(this.o)) {
            fVar.put("id", this.o);
        }
        fVar.put("lang", ru.mail.libverify.n0.e.a(this.l.d()));
        fVar.put("service", this.n);
        fVar.put("phone", this.m);
        fVar.put("platform", "android");
        String j = this.l.b().j();
        if (!TextUtils.isEmpty(j)) {
            fVar.put("iso_country_code", j);
        }
        if (this.p) {
            fVar.put("info", "typing_check,iso_country_code");
        }
        return fVar;
    }

    @Override // ru.mail.libverify.j0.k
    @Nullable
    public final ru.mail.libverify.j0.l r() {
        return null;
    }

    @Override // ru.mail.libverify.j0.k
    @Nullable
    public final ru.mail.libverify.j0.m t() {
        throw null;
    }

    @Override // ru.mail.libverify.requests.c, ru.mail.libverify.j0.k
    public final boolean u() {
        return false;
    }

    @Override // ru.mail.libverify.requests.c
    public final boolean w() {
        return false;
    }
}
