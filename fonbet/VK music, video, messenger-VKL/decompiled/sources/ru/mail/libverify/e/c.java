package ru.mail.libverify.e;

/* loaded from: classes9.dex */
public abstract class c {
    private final String a;
    private final String[] b;

    public static final class a extends c {
        public static final a c = new a();

        private a() {
            super("tg", new String[]{"org.telegram.messenger", "org.telegram.messenger.web"});
        }
    }

    public static final class b extends c {
        public static final b c = new b();

        private b() {
            super("vb", new String[]{"com.viber.voip"});
        }
    }

    /* renamed from: ru.mail.libverify.e.c$c, reason: collision with other inner class name */
    public static final class C2192c extends c {
        public static final C2192c c = new C2192c();

        private C2192c() {
            super("wa", new String[]{"com.whatsapp", "com.whatsapp.w4b"});
        }
    }

    public c(String str, String[] strArr) {
        this.a = str;
        this.b = strArr;
    }

    public final String a() {
        return this.a;
    }

    public final String[] b() {
        return this.b;
    }
}
