package one.video.ad.ux.controls;

import android.view.View;
import xsna.asp;
import xsna.ba30;
import xsna.h5s;
import xsna.n9c0;
import xsna.qej0;
import xsna.qoy;
import xsna.rh0;
import xsna.sc0;
import xsna.shy;
import xsna.sws0;
import xsna.zjw;
import xsna.zrp;

/* compiled from: OneVideoAdBaseControls.kt */
/* loaded from: classes8.dex */
public interface OneVideoAdBaseControls {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OneVideoAdBaseControls.kt */
    public static final class SoundState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SoundState[] $VALUES;
        public static final SoundState OFF;
        public static final SoundState ON;

        static {
            SoundState soundState = new SoundState("ON", 0);
            ON = soundState;
            SoundState soundState2 = new SoundState("OFF", 1);
            OFF = soundState2;
            SoundState[] soundStateArr = {soundState, soundState2};
            $VALUES = soundStateArr;
            $ENTRIES = new asp(soundStateArr);
        }

        public SoundState() {
            throw null;
        }

        public static SoundState valueOf(String str) {
            return (SoundState) Enum.valueOf(SoundState.class, str);
        }

        public static SoundState[] values() {
            return (SoundState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OneVideoAdBaseControls.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CATALOG_LARGE;
        public static final Type CATALOG_SMALL;
        public static final Type DISCOVERY;
        public static final Type FULLSCREEN;
        public static final Type PIP;

        static {
            Type type = new Type("CATALOG_LARGE", 0);
            CATALOG_LARGE = type;
            Type type2 = new Type("CATALOG_SMALL", 1);
            CATALOG_SMALL = type2;
            Type type3 = new Type("DISCOVERY", 2);
            DISCOVERY = type3;
            Type type4 = new Type("FULLSCREEN", 3);
            FULLSCREEN = type4;
            Type type5 = new Type("PIP", 4);
            PIP = type5;
            Type[] typeArr = {type, type2, type3, type4, type5};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: OneVideoAdBaseControls.kt */
    public interface b {
        void a(boolean z);

        void b(ba30 ba30Var);

        void c(sws0 sws0Var);
    }

    /* compiled from: OneVideoAdBaseControls.kt */
    public static final class c {
        public final Type a;
        public final SoundState b;
        public final boolean c;
        public final int d;
        public final int e;

        public c(Type type, SoundState soundState, boolean z, int i, int i2) {
            this.a = type;
            this.b = soundState;
            this.c = z;
            this.d = i;
            this.e = i2;
        }

        public static c a(c cVar, SoundState soundState, int i, int i2, int i3) {
            Type type = cVar.a;
            if ((i3 & 2) != 0) {
                soundState = cVar.b;
            }
            SoundState soundState2 = soundState;
            boolean z = (i3 & 4) != 0 ? cVar.c : true;
            if ((i3 & 8) != 0) {
                i = cVar.d;
            }
            int i4 = i;
            if ((i3 & 16) != 0) {
                i2 = cVar.e;
            }
            cVar.getClass();
            return new c(type, soundState2, z, i4, i2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + shy.a(this.d, qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(type=");
            sb.append(this.a);
            sb.append(", soundState=");
            sb.append(this.b);
            sb.append(", isPostViewState=");
            sb.append(this.c);
            sb.append(", postViewWidth=");
            sb.append(this.d);
            sb.append(", postViewHeight=");
            return h5s.c(this.e, ")", sb);
        }
    }

    void V2();

    void c1();

    b getMotionDelegate();

    n9c0 getPostView();

    c getState();

    View getView();

    void setAdBannerData(sc0 sc0Var);

    void setAdProgress(rh0 rh0Var);

    void setImageLoader(zjw zjwVar);

    void setListener(a aVar);

    void setPlayPauseControl(boolean z);

    void setShoppableAdViewListener(qej0 qej0Var);

    void setShowAdShoppableProducts(boolean z);

    void setState(c cVar);

    /* compiled from: OneVideoAdBaseControls.kt */
    public interface a {
        default void b() {
        }

        default void c() {
        }

        default void d() {
        }

        default void e() {
        }

        default void a(boolean z) {
        }
    }
}
