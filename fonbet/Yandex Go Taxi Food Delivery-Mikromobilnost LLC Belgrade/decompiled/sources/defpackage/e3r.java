package defpackage;

import java.util.Arrays;

/* loaded from: classes15.dex */
public final class e3r implements k120 {
    public final /* synthetic */ int a;
    public final b220 b;

    public /* synthetic */ e3r(b220 b220Var, int i) {
        this.a = i;
        this.b = b220Var;
    }

    public static String a(String str) {
        return String.format("https://%s/reactions/", Arrays.copyOf(new Object[]{str}, 1));
    }

    @Override // defpackage.k120
    public final Object j() {
        String str;
        String str2;
        int i = this.a;
        b220 b220Var = this.b;
        switch (i) {
            case 0:
                b5o c = b220Var.c();
                return (c == null || (str = c.a) == null) ? "files.messenger.yandex.net" : str;
            default:
                b5o f = b220Var.f();
                if (f == null || (str2 = f.a) == null) {
                    str2 = "images.messenger.yandex.net";
                }
                return a(str2);
        }
    }

    @Override // defpackage.k120
    public final Object k() {
        switch (this.a) {
            case 0:
                return "files.messenger.yandex.net";
            default:
                return a("images.messenger.yandex.net");
        }
    }

    @Override // defpackage.k120
    public final Object l() {
        switch (this.a) {
            case 0:
                return "files.messenger.test.yandex.net";
            default:
                return a("images.messenger.test.yandex.net");
        }
    }

    @Override // defpackage.k120
    public final Object m() {
        switch (this.a) {
            case 0:
                return "files.messenger.alpha.yandex.net";
            default:
                return a("images.messenger.alpha.yandex.net");
        }
    }

    @Override // defpackage.k120
    public final Object o() {
        String str;
        String str2;
        int i = this.a;
        b220 b220Var = this.b;
        switch (i) {
            case 0:
                b5o c = b220Var.c();
                return (c == null || (str = c.a) == null) ? "files.messenger.test.yandex.net" : str;
            default:
                b5o f = b220Var.f();
                if (f == null || (str2 = f.b) == null) {
                    str2 = "images.messenger.test.yandex.net";
                }
                return a(str2);
        }
    }

    @Override // defpackage.k120
    public final Object s() {
        switch (this.a) {
            case 0:
                return "files.messenger.alpha.yandex.net";
            default:
                return a("images.messenger.alpha.yandex.net");
        }
    }
}
