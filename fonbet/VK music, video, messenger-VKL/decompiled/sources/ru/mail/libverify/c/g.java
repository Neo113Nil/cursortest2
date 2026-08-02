package ru.mail.libverify.c;

import android.content.Context;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;
import ru.mail.libverify.R;
import ru.mail.libverify.api.VerificationFactory;
import ru.mail.verify.core.utils.FileLog;
import xsna.bpn0;
import xsna.drm0;
import xsna.gzs;

/* loaded from: classes9.dex */
public final class g {
    private final Context a;
    private final Lazy b = new bpn0(new b());
    private final Lazy c = new bpn0(new a());
    private final Lazy d = new bpn0(new c());

    public static final class a extends Lambda implements gzs<String> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final String invoke() {
            return g.a(g.this, R.string.libverify_application_key, VerificationFactory.LIBVERIFY_RESOURCE_APPLICATION_KEY_KEY, VerificationFactory.LIBVERIFY_MANIFEST_APPLICATION_KEY_KEY);
        }
    }

    public static final class b extends Lambda implements gzs<String> {
        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final String invoke() {
            return g.a(g.this, R.string.libverify_application_name, VerificationFactory.LIBVERIFY_RESOURCE_APPLICATION_NAME_KEY, VerificationFactory.LIBVERIFY_MANIFEST_APPLICATION_NAME_KEY);
        }
    }

    public static final class c extends Lambda implements gzs<String> {
        public c() {
            super(0);
        }

        @Override // xsna.gzs
        public final String invoke() {
            return ru.mail.libverify.d0.a.d(g.this.a);
        }
    }

    public g(Context context) {
        this.a = context;
    }

    public final String b() {
        return (String) this.b.getValue();
    }

    public final String c() {
        return (String) this.d.getValue();
    }

    public final String a() {
        return (String) this.c.getValue();
    }

    public static final String a(g gVar, int i, String str, String str2) {
        String string = gVar.a.getString(i);
        if (string == null || drm0.N(string)) {
            string = ru.mail.libverify.n0.e.a(gVar.a, str2);
        }
        if (string != null && !drm0.N(string)) {
            return string;
        }
        FileLog.e("ResourceParamsBase", "String resource must be set in file libverify.xml ('%s') or in Manifest ('%s')", str, str2);
        throw new IllegalArgumentException("String resource must be set in resource file or in Manifest");
    }
}
