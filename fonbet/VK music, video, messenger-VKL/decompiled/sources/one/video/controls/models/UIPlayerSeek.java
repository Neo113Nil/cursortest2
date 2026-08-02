package one.video.controls.models;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import xsna.akw;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.gp;
import xsna.h5s;
import xsna.ozl;
import xsna.qoy;
import xsna.shy;
import xsna.sni0;
import xsna.x5r0;
import xsna.xy6;
import xsna.zrp;
import xsna.zwo0;

/* compiled from: UIPlayerSeek.kt */
@ozl
/* loaded from: classes8.dex */
public interface UIPlayerSeek {

    /* compiled from: UIPlayerSeek.kt */
    public static final class IntervalsDisplayConfig {
        public static final int d = (int) x5r0.a(12, 1);
        public final boolean a;
        public final Set<Orientation> b;
        public final a c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UIPlayerSeek.kt */
        public static final class Orientation {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Orientation[] $VALUES;
            public static final Orientation LANDSCAPE;
            public static final Orientation PORTRAIT;

            static {
                Orientation orientation = new Orientation("LANDSCAPE", 0);
                LANDSCAPE = orientation;
                Orientation orientation2 = new Orientation("PORTRAIT", 1);
                PORTRAIT = orientation2;
                Orientation[] orientationArr = {orientation, orientation2};
                $VALUES = orientationArr;
                $ENTRIES = new asp(orientationArr);
            }

            public Orientation() {
                throw null;
            }

            public static Orientation valueOf(String str) {
                return (Orientation) Enum.valueOf(Orientation.class, str);
            }

            public static Orientation[] values() {
                return (Orientation[]) $VALUES.clone();
            }
        }

        /* compiled from: UIPlayerSeek.kt */
        public static final class a {
            public final String a;
            public final int b;
            public final int c;

            public a() {
                this(7);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
            }

            public final String toString() {
                return h5s.c(this.c, ")", xy6.b(this.b, "Separator(symbol=", this.a, ", leftMargin=", ", rightMargin="));
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public /* synthetic */ a(int i) {
                this("·", r0, r0);
                int i2 = IntervalsDisplayConfig.d;
            }

            public a(String str, int i, int i2) {
                this.a = str;
                this.b = i;
                this.c = i2;
            }
        }

        public IntervalsDisplayConfig() {
            this(null, 7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IntervalsDisplayConfig)) {
                return false;
            }
            IntervalsDisplayConfig intervalsDisplayConfig = (IntervalsDisplayConfig) obj;
            return this.a == intervalsDisplayConfig.a && epx.f(this.b, intervalsDisplayConfig.b) && epx.f(this.c, intervalsDisplayConfig.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + fw3.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return "IntervalsDisplayConfig(shouldShowCounter=" + this.a + ", supportedOrientations=" + this.b + ", separator=" + this.c + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IntervalsDisplayConfig(boolean z, Set<? extends Orientation> set, a aVar) {
            this.a = z;
            this.b = set;
            this.c = aVar;
        }

        public IntervalsDisplayConfig(a aVar, int i) {
            this(true, Collections.singleton(Orientation.LANDSCAPE), (i & 4) != 0 ? new a(7) : aVar);
        }
    }

    /* compiled from: UIPlayerSeek.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public a(boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder c = gp.c("Configuration(isLandscape=", ", isSeekVisible=", ", isTimeVisible=", this.a, this.b);
            c.append(this.c);
            c.append(", isReadOnlyMode=");
            c.append(this.d);
            c.append(")");
            return c.toString();
        }
    }

    /* compiled from: UIPlayerSeek.kt */
    public interface b {
        void c(float f);
    }

    /* compiled from: UIPlayerSeek.kt */
    public static final class c {
        public final boolean a;
        public final boolean b;

        public c(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return sni0.a("FastSeekMode(isActive=", ", isUiVisible=", ")", this.a, this.b);
        }
    }

    void C3(long j, long j2);

    void H3(int i, ArrayList arrayList);

    boolean K3();

    void O3(int i);

    void U1(c cVar);

    void W1(a aVar);

    View W3(Context context);

    int getSeekBarHeight();

    void setCurrentVideoDurationSeconds(long j);

    void setCurrentVideoPosition(long j);

    void setExtendSeekBarEnabled(boolean z);

    void setImageLoader(akw akwVar);

    void setIntervalsDisplayConfig(IntervalsDisplayConfig intervalsDisplayConfig);

    void setSeekBarAlwaysVisible(boolean z);

    void setTimelineThumbs(zwo0 zwo0Var);

    default void g2(View view) {
    }

    default void p1(boolean z) {
    }

    default void setButtonsClickListener(View.OnClickListener onClickListener) {
    }

    default void setExtendSeekBarListener(b bVar) {
    }

    default void setPreviewPlaceholder(Drawable drawable) {
    }
}
