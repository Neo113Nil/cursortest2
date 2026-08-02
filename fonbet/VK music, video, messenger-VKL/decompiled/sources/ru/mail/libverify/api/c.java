package ru.mail.libverify.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.regex.Pattern;
import ru.mail.libverify.api.e;
import ru.mail.libverify.api.h;
import ru.mail.libverify.n.c;

/* loaded from: classes9.dex */
final class c implements c.a {
    final /* synthetic */ h.a a;
    final /* synthetic */ e.b b;
    final /* synthetic */ ru.mail.libverify.m.m c;

    public c(h.a aVar, e.b bVar, ru.mail.libverify.m.m mVar) {
        this.a = aVar;
        this.b = bVar;
        this.c = mVar;
    }

    @Override // ru.mail.libverify.n.c.a
    public final boolean a(@Nullable String str) throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        boolean contains = this.c.d().contains(str);
        e.b bVar = this.b;
        if (!bVar.a) {
            bVar.a = contains;
        }
        return contains;
    }

    @Override // ru.mail.libverify.n.c.a
    @Nullable
    public final String b(@NonNull String str) throws InterruptedException {
        Pattern pattern;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        String d = h.d(str, this.a);
        if (!this.b.b && TextUtils.isEmpty(d) && !TextUtils.isEmpty(str)) {
            e.b bVar = this.b;
            pattern = e.j;
            bVar.b = pattern.matcher(str).matches();
        }
        return d;
    }

    @Override // ru.mail.libverify.n.c.a
    public final int c() {
        return this.c.b();
    }

    @Override // ru.mail.libverify.n.c.a
    public final long d() {
        return this.c.f();
    }

    @Override // ru.mail.libverify.n.c.a
    public final long a() {
        return this.c.e();
    }

    @Override // ru.mail.libverify.n.c.a
    public final int b() {
        return this.c.a();
    }
}
