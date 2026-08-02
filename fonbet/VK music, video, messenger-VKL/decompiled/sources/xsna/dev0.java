package xsna;

import android.net.Uri;

/* compiled from: VkProxy.kt */
/* loaded from: classes.dex */
public interface dev0 {
    public static final a a = a.a;

    boolean a();

    Uri b(Uri uri);

    boolean c(Uri uri);

    void disable();

    boolean enable();

    String getHost();

    lev0 getStat();

    boolean isEnabled();

    boolean refresh();

    /* compiled from: VkProxy.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final bpn0 b = new bpn0(new bpc0(10));

        public static dev0 a() {
            return (dev0) b.getValue();
        }

        /* compiled from: VkProxy.kt */
        /* renamed from: xsna.dev0$a$a, reason: collision with other inner class name */
        public static final class C2727a implements dev0 {
            public final C2728a b = new C2728a();

            /* compiled from: VkProxy.kt */
            /* renamed from: xsna.dev0$a$a$a, reason: collision with other inner class name */
            public static final class C2728a implements lev0 {
                @Override // xsna.lev0
                public final String a() {
                    return "";
                }
            }

            @Override // xsna.dev0
            public final boolean a() {
                return false;
            }

            @Override // xsna.dev0
            public final Uri b(Uri uri) {
                return null;
            }

            @Override // xsna.dev0
            public final boolean c(Uri uri) {
                return false;
            }

            @Override // xsna.dev0
            public final boolean enable() {
                return false;
            }

            @Override // xsna.dev0
            public final String getHost() {
                return "";
            }

            @Override // xsna.dev0
            public final lev0 getStat() {
                return this.b;
            }

            @Override // xsna.dev0
            public final boolean isEnabled() {
                return false;
            }

            @Override // xsna.dev0
            public final boolean refresh() {
                return false;
            }

            @Override // xsna.dev0
            public final void disable() {
            }
        }
    }
}
