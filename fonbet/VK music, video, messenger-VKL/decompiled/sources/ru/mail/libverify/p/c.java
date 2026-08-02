package ru.mail.libverify.p;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.preference.Preference;
import java.io.File;
import ru.mail.libverify.p.f;
import ru.mail.libverify.p.f.c;

/* loaded from: classes9.dex */
public final class c {
    private static final c b = new c();

    @Nullable
    private f.c a;

    private c() {
    }

    @NonNull
    public static c a() {
        return b;
    }

    public final boolean b() {
        a a;
        synchronized (this) {
            f.c cVar = this.a;
            if (cVar == null) {
                throw new IllegalStateException("Trying to access latest data before method 'init' called");
            }
            a = cVar.a();
        }
        return a.b();
    }

    public final synchronized void c() {
        f.c cVar = this.a;
        if (cVar == null) {
            throw new IllegalStateException("Should be called after 'init' method");
        }
        cVar.d();
        this.a.b();
    }

    public final synchronized void a(@NonNull Context context, @NonNull d dVar) {
        if (this.a != null) {
            return;
        }
        File file = new File(context.getFilesDir(), "libverify_omicron");
        b bVar = dVar.d;
        ru.mail.libverify.s.a aVar = new ru.mail.libverify.s.a(file, bVar);
        ru.mail.libverify.r.b bVar2 = new ru.mail.libverify.r.b(dVar.a, bVar);
        ru.mail.libverify.t.a aVar2 = new ru.mail.libverify.t.a(Preference.h(context, 0, "ru_mail_libverify_omicron_".concat("timetable")), dVar.h);
        g gVar = new g(Preference.h(context, 0, "ru_mail_libverify_omicron_".concat("session_counter")), ru.mail.libverify.n0.e.a(context));
        gVar.c();
        dVar.c.add(new ru.mail.libverify.q.a(context));
        dVar.c.add(new ru.mail.libverify.q.c(gVar));
        f.c cVar = new f(aVar, bVar2, aVar2, dVar.h, dVar.i).new c(dVar);
        this.a = cVar;
        cVar.b();
    }
}
