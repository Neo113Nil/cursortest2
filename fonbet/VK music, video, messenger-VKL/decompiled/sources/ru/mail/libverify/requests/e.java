package ru.mail.libverify.requests;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.mail.libverify.g0.q;
import ru.mail.libverify.j0.k;
import ru.mail.libverify.k0.a;

/* loaded from: classes9.dex */
abstract class e<RESP extends ru.mail.libverify.k0.a<RESP, REQ>, REQ extends ru.mail.libverify.j0.k<REQ, RESP>> extends ru.mail.libverify.j0.k<REQ, RESP> {

    @NonNull
    protected final ru.mail.libverify.j0.h h;

    public e(@NonNull Context context, @NonNull q qVar, @NonNull ru.mail.libverify.j0.h hVar) {
        super(context, qVar);
        this.h = hVar;
    }

    @Override // ru.mail.libverify.j0.k
    public final boolean a() {
        return false;
    }

    @Override // ru.mail.libverify.j0.k
    @Nullable
    public final String c() {
        return null;
    }

    @Override // ru.mail.libverify.j0.k
    @Nullable
    public String o() {
        return this.h.a();
    }

    @Override // ru.mail.libverify.j0.k
    @Nullable
    public ru.mail.libverify.j0.l r() {
        return this.h;
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public final String s() {
        return this.h.a();
    }
}
