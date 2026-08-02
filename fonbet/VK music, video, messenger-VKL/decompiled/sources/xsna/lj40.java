package xsna;

import com.vkontakte.android.R;

/* compiled from: MusicDownloadsSettingsViewState.kt */
/* loaded from: classes3.dex */
public final class lj40 implements lm50 {
    public final boolean b;
    public final a c;

    /* compiled from: MusicDownloadsSettingsViewState.kt */
    public interface a {

        /* compiled from: MusicDownloadsSettingsViewState.kt */
        /* renamed from: xsna.lj40$a$a, reason: collision with other inner class name */
        public static final class C3270a implements a {
            public final String a;

            public C3270a(String str) {
                this.a = str;
            }

            @Override // xsna.lj40.a
            public final String a() {
                return this.a;
            }

            @Override // xsna.lj40.a
            public final Integer b() {
                return null;
            }

            @Override // xsna.lj40.a
            public final boolean c() {
                return false;
            }

            @Override // xsna.lj40.a
            public final int d() {
                return R.string.downloads_empty_option_title;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3270a) && epx.f(this.a, ((C3270a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Empty(downloadsSize="), this.a, ')');
            }
        }

        /* compiled from: MusicDownloadsSettingsViewState.kt */
        public static final class b implements a {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            @Override // xsna.lj40.a
            public final String a() {
                return this.a;
            }

            @Override // xsna.lj40.a
            public final Integer b() {
                return Integer.valueOf(R.string.downloads_clear_subtitle);
            }

            @Override // xsna.lj40.a
            public final boolean c() {
                return true;
            }

            @Override // xsna.lj40.a
            public final int d() {
                return R.string.downloads_clear_title;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("NonEmpty(downloadsSize="), this.a, ')');
            }
        }

        String a();

        Integer b();

        boolean c();

        int d();
    }

    public lj40(boolean z, a aVar) {
        this.b = z;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj40)) {
            return false;
        }
        lj40 lj40Var = (lj40) obj;
        lj40Var.getClass();
        return this.b == lj40Var.b && this.c.equals(lj40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qoy.b(Integer.hashCode(R.string.downloads_settings_title) * 31, 31, this.b);
    }

    public final String toString() {
        return "MusicDownloadsSettingsViewState(screenTitle=2131955918, isMobileNetworkDownloadEnabled=" + this.b + ", downloadsState=" + this.c + ')';
    }
}
