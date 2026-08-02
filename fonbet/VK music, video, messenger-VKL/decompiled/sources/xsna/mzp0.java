package xsna;

import android.view.View;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import java.util.UUID;

/* compiled from: UiMeasuringSession.kt */
/* loaded from: classes17.dex */
public interface mzp0 {

    /* compiled from: UiMeasuringSession.kt */
    public static final class a {
        public final irk0 a;
        public final UUID b;
        public final UiMeasuringScreen c;
        public final String d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final Integer j;

        public a(int i, int i2, int i3, int i4, int i5, UiMeasuringScreen uiMeasuringScreen, Integer num, String str, UUID uuid, irk0 irk0Var) {
            this.a = irk0Var;
            this.b = uuid;
            this.c = uiMeasuringScreen;
            this.d = str;
            this.e = i;
            this.f = i2;
            this.g = i3;
            this.h = i4;
            this.i = i5;
            this.j = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && epx.f(this.j, aVar.j);
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
            String str = this.d;
            int a = shy.a(this.i, shy.a(this.h, shy.a(this.g, shy.a(this.f, shy.a(this.e, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31);
            Integer num = this.j;
            return a + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TimelineUiMeasuringEventData(stat=");
            sb.append(this.a);
            sb.append(", uuid=");
            sb.append(this.b);
            sb.append(", screen=");
            sb.append(this.c);
            sb.append(", screenTag=");
            sb.append(this.d);
            sb.append(", timeToFirstViewCreated=");
            sb.append(this.e);
            sb.append(", timeToInteractive=");
            sb.append(this.f);
            sb.append(", timeToDataLoadStart=");
            sb.append(this.g);
            sb.append(", timeToContent=");
            sb.append(this.h);
            sb.append(", timeToDataLoaded=");
            sb.append(this.i);
            sb.append(", timeToFirstFrameDrawn=");
            return uqi.b(sb, this.j, ')');
        }
    }

    /* compiled from: UiMeasuringSession.kt */
    public interface b {
        void a(a aVar);
    }

    /* compiled from: UiMeasuringSession.kt */
    public static final class c {
        public final irk0 a;
        public final UUID b;
        public final UiMeasuringScreen c;
        public final String d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;

        public c(int i, int i2, int i3, int i4, UiMeasuringScreen uiMeasuringScreen, String str, UUID uuid, irk0 irk0Var) {
            this.a = irk0Var;
            this.b = uuid;
            this.c = uiMeasuringScreen;
            this.d = str;
            this.e = i;
            this.f = i2;
            this.g = i3;
            this.h = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && this.c == cVar.c && epx.f(this.d, cVar.d) && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g && this.h == cVar.h;
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
            String str = this.d;
            return Integer.hashCode(this.h) + shy.a(this.g, shy.a(this.f, shy.a(this.e, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("W3UIMeasuringEventData(stat=");
            sb.append(this.a);
            sb.append(", uuid=");
            sb.append(this.b);
            sb.append(", screen=");
            sb.append(this.c);
            sb.append(", screenTag=");
            sb.append(this.d);
            sb.append(", fcp=");
            sb.append(this.e);
            sb.append(", tti=");
            sb.append(this.f);
            sb.append(", contentFcp=");
            sb.append(this.g);
            sb.append(", contentTti=");
            return vu5.b(sb, this.h, ')');
        }
    }

    /* compiled from: UiMeasuringSession.kt */
    public interface d {
        void a(c cVar);
    }

    UUID Y0();

    void a();

    void b();

    void c(boolean z);

    void d(View view);

    void e(View view);

    void f();

    void g();

    void h();

    void i();

    void init();

    void j();

    void k(String str);

    void start();
}
