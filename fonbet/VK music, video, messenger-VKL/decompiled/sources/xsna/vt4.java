package xsna;

import com.vk.dto.music.reactions.Reaction;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;

/* compiled from: AudioReactionsAction.kt */
/* loaded from: classes3.dex */
public interface vt4 extends kj50 {

    /* compiled from: AudioReactionsAction.kt */
    public static final class a implements vt4 {
        public final Reaction b;
        public final boolean c;

        public a(Reaction reaction, boolean z) {
            this.b = reaction;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClickReaction(reaction=");
            sb.append(this.b);
            sb.append(", select=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: AudioReactionsAction.kt */
    public static final class b implements vt4 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -717833216;
        }

        public final String toString() {
            return "CloseAction";
        }
    }

    /* compiled from: AudioReactionsAction.kt */
    public static final class c implements vt4 {
        public final String b;
        public final MusicBottomSheetLaunchPoint c;

        public c(String str, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint) {
            this.b = str;
            this.c = musicBottomSheetLaunchPoint;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            String str = this.b;
            return this.c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "Init(selectedId=" + this.b + ", launchPoint=" + this.c + ')';
        }
    }

    /* compiled from: AudioReactionsAction.kt */
    public static final class d implements vt4 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 625594318;
        }

        public final String toString() {
            return "RetryClick";
        }
    }
}
