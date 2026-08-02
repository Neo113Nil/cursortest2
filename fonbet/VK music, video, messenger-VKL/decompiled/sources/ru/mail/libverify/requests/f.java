package ru.mail.libverify.requests;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.net.MalformedURLException;
import java.util.List;
import ru.mail.libverify.m.e;
import ru.mail.libverify.u.w;
import ru.mail.verify.core.utils.json.JsonParseException;
import xsna.tdj;

/* loaded from: classes9.dex */
public final class f extends c<f, ru.mail.libverify.m.e> {

    @NonNull
    private final ru.mail.libverify.j0.i l;
    private final long m;

    @Nullable
    private final String n;

    public f(@NonNull w wVar, @NonNull String str, long j, @Nullable String str2) throws MalformedURLException {
        super(wVar);
        this.l = new ru.mail.libverify.j0.i(str);
        this.m = j;
        this.n = str2;
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public final ru.mail.libverify.k0.a a(@NonNull String str) throws JsonParseException {
        if (TextUtils.isEmpty(str)) {
            throw new JsonParseException("jsonAnswer can't be null");
        }
        int lastIndexOf = str.lastIndexOf("}");
        if (lastIndexOf != str.length() - 1 && lastIndexOf != -1) {
            str = str.substring(0, lastIndexOf + 1);
        }
        StringBuilder sb = new StringBuilder(str.length());
        if (!str.startsWith(X3.j.d) && !str.endsWith(X3.j.e)) {
            str = tdj.a(sb, X3.j.d, str, X3.j.e);
        }
        List<e.a> c = ru.mail.libverify.q0.a.c(str, e.a.class);
        for (e.a aVar : c) {
            if (aVar != null && aVar.a() != null) {
                ru.mail.libverify.m.f a = aVar.a();
                this.h.u();
                a.b(System.currentTimeMillis());
            }
        }
        return new ru.mail.libverify.m.e(c);
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

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public final Integer f() {
        return 40000;
    }

    @Override // ru.mail.libverify.j0.k
    @Nullable
    public final String l() {
        return this.n;
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public final Long n() {
        long j = this.m;
        if (j != 0) {
            return Long.valueOf(j);
        }
        this.h.u();
        return Long.valueOf(System.currentTimeMillis() - 1800000);
    }

    @Override // ru.mail.libverify.requests.c, ru.mail.libverify.j0.k
    @NonNull
    public final String o() {
        return this.l.c();
    }

    @Override // ru.mail.libverify.requests.c, ru.mail.libverify.j0.k
    @NonNull
    public final ru.mail.libverify.j0.f p() {
        ru.mail.libverify.j0.f p = super.p();
        p.put("application_id", this.h.h());
        return p;
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public final Integer q() {
        return 1800000;
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

    @Override // ru.mail.libverify.requests.c
    public final boolean w() {
        return true;
    }
}
