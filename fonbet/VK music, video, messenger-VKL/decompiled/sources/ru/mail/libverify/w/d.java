package ru.mail.libverify.w;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import ru.mail.libverify.v.a;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
public final class d {
    private final OutputStream a;
    final /* synthetic */ OutputStream b;
    final /* synthetic */ a.c c;
    final /* synthetic */ c d;
    final /* synthetic */ String e;
    final /* synthetic */ String f;

    public d(OutputStream outputStream, a.c cVar, c cVar2, String str, String str2) {
        this.b = outputStream;
        this.c = cVar;
        this.d = cVar2;
        this.e = str;
        this.f = str2;
        this.a = outputStream;
    }

    public final void a() {
        this.c.a();
        try {
            this.b.close();
            ru.mail.libverify.v.a a = c.a(this.d);
            FileLog.v("DiskCache", "Drop cache item result: %s for key: %s", a != null ? Boolean.valueOf(a.d(this.e)) : null, this.e);
        } catch (IOException e) {
            FileLog.e("DiskCache", e, "Failed to close cache item stream for key: %s", this.e);
        }
    }

    public final InputStream b() {
        try {
            this.b.close();
            this.c.b();
            ru.mail.libverify.v.a a = c.a(this.d);
            if (a != null) {
                a.a();
            }
            FileLog.v("DiskCache", "Item cached for key: %s", this.e);
            ru.mail.libverify.v.a a2 = c.a(this.d);
            a.e b = a2 != null ? a2.b(this.f) : null;
            if (b != null) {
                return b.a();
            }
        } catch (IOException e) {
            FileLog.e("DiskCache", e, "Failed to commit cache item for key: %s", this.e);
            a();
        }
        return null;
    }

    public final OutputStream c() {
        return this.a;
    }
}
