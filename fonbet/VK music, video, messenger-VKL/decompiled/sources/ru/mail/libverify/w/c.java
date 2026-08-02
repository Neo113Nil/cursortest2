package ru.mail.libverify.w;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;
import ru.mail.libverify.u.w;
import ru.mail.libverify.v.a;
import ru.mail.verify.core.utils.FileLog;
import xsna.bpn0;
import xsna.gzs;

/* loaded from: classes9.dex */
public final class c implements b {
    private final w a;
    private final Lazy b = new bpn0(new a());

    public static final class a extends Lambda implements gzs<ru.mail.libverify.v.a> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final ru.mail.libverify.v.a invoke() {
            try {
                return ru.mail.libverify.v.a.a(c.this.a.s());
            } catch (IOException e) {
                FileLog.e("DiskCache", "Failed to init disk cache", e);
                return null;
            }
        }
    }

    public c(w wVar) {
        this.a = wVar;
    }

    public static final ru.mail.libverify.v.a a(c cVar) {
        return (ru.mail.libverify.v.a) cVar.b.getValue();
    }

    @Override // ru.mail.libverify.w.b
    public final d b(String str) {
        String str2;
        String e = ru.mail.libverify.n0.e.e(str);
        try {
            ru.mail.libverify.v.a aVar = (ru.mail.libverify.v.a) this.b.getValue();
            a.c a2 = aVar != null ? aVar.a(e) : null;
            if (a2 == null) {
                FileLog.e("DiskCache", "Editor is in use for key: %s", str);
                return null;
            }
            str2 = str;
            try {
                return new d(a2.c(), a2, this, str2, e);
            } catch (IOException e2) {
                e = e2;
                FileLog.e("DiskCache", e, "Failed to open cache editor for key: %s", str2);
                return null;
            }
        } catch (IOException e3) {
            e = e3;
            str2 = str;
        }
    }

    @Override // ru.mail.libverify.w.b
    public final InputStream a(String str) {
        String e = ru.mail.libverify.n0.e.e(str);
        try {
            ru.mail.libverify.v.a aVar = (ru.mail.libverify.v.a) this.b.getValue();
            a.e b = aVar != null ? aVar.b(e) : null;
            if (b != null) {
                FileLog.v("DiskCache", "Cached item found for key: %s", str);
                return b.a();
            }
            FileLog.d("DiskCache", "Cached item not found for key: %s", str);
            return null;
        } catch (IOException e2) {
            FileLog.e("DiskCache", e2, "Failed to get cached item for key: %s", str);
            return null;
        }
    }
}
