package ru.mail.libverify.platform.firebase;

import android.content.Context;
import android.content.Intent;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;
import ru.mail.libverify.platform.core.IInternalFactory;
import ru.mail.libverify.platform.core.ILog;
import ru.mail.libverify.platform.core.ISmsRetrieverService;
import ru.mail.libverify.platform.core.JwsService;
import ru.mail.libverify.platform.firebase.FirebaseCoreService;
import xsna.bpn0;
import xsna.gzs;
import xsna.uqi;

/* loaded from: classes11.dex */
public final class a {
    public static ILog a;
    public static IInternalFactory c;
    public static ISmsRetrieverService e;
    public static final Lazy<ILog> b = new bpn0(b.a);
    public static final C2213a d = new C2213a();
    public static final ISmsRetrieverService f = new uqi();
    public static final ru.mail.libverify.platform.firebase.d.a g = new ru.mail.libverify.platform.firebase.d.a();
    public static final Lazy<ru.mail.libverify.platform.firebase.b.b> h = new bpn0(c.a);
    public static final Lazy<ru.mail.libverify.platform.firebase.c.a> i = new bpn0(e.a);
    public static final Lazy<JwsService> j = new bpn0(d.a);

    public static final class b extends Lambda implements gzs<ILog> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final ILog invoke() {
            return new ru.mail.libverify.platform.firebase.b();
        }
    }

    public static final class c extends Lambda implements gzs<ru.mail.libverify.platform.firebase.b.b> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // xsna.gzs
        public final ru.mail.libverify.platform.firebase.b.b invoke() {
            FirebaseCoreService.Companion.getClass();
            return new ru.mail.libverify.platform.firebase.b.b(FirebaseCoreService.a.a());
        }
    }

    public static final class d extends Lambda implements gzs<JwsService> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // xsna.gzs
        public final JwsService invoke() {
            return new ru.mail.libverify.platform.firebase.a.b();
        }
    }

    public static final class e extends Lambda implements gzs<ru.mail.libverify.platform.firebase.c.a> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // xsna.gzs
        public final ru.mail.libverify.platform.firebase.c.a invoke() {
            return new ru.mail.libverify.platform.firebase.c.a();
        }
    }

    /* renamed from: ru.mail.libverify.platform.firebase.a$a, reason: collision with other inner class name */
    public static final class C2213a implements IInternalFactory {
        @Override // ru.mail.libverify.platform.core.IInternalFactory
        public final void refreshGcmToken(Context context) {
        }

        @Override // ru.mail.libverify.platform.core.IInternalFactory
        public final void deliverGcmMessageIntent(Context context, String str, Map<String, String> map) {
        }
    }

    public static final void a(Context context, Intent intent) {
    }
}
