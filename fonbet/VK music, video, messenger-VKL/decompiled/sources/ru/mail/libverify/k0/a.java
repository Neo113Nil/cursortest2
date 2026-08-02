package ru.mail.libverify.k0;

import androidx.annotation.Nullable;
import ru.mail.libverify.j0.k;
import ru.mail.libverify.k0.a;
import ru.mail.verify.core.utils.Gsonable;

/* loaded from: classes9.dex */
public abstract class a<RESP extends a<RESP, REQ>, REQ extends k<REQ, RESP>> implements Gsonable {

    @Nullable
    private transient REQ a;
    private transient long b = 0;
    private transient long c = 0;

    @Nullable
    public final REQ a() {
        return this.a;
    }

    public final void b(long j) {
        this.b = j;
    }

    public final long c() {
        return this.b;
    }

    public final void a(@Nullable REQ req) {
        this.a = req;
    }

    public final long b() {
        return this.c;
    }

    public final void a(long j) {
        this.c = j;
    }
}
