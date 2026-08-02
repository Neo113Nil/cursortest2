package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.sdk.facade.api.MyTargetFacadeClickTarget;
import com.vk.clips.sdk.facade.api.MyTargetFacadeCustomStatType;
import com.vk.clips.sdk.facade.api.MyTargetVideoPlaybackErrorType;

/* compiled from: MyTargetFacadeEvent.kt */
/* loaded from: classes17.dex */
public interface xp50 {

    /* compiled from: MyTargetFacadeEvent.kt */
    public static final class a implements xp50 {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("AdChoiceClick(adChoiceAlias="), this.a, ')');
        }
    }

    /* compiled from: MyTargetFacadeEvent.kt */
    public static final class b implements xp50 {
    }

    /* compiled from: MyTargetFacadeEvent.kt */
    public static final class c implements xp50 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 621547264;
        }

        public final String toString() {
            return "AdVideoPlaybackCompleted";
        }
    }

    /* compiled from: MyTargetFacadeEvent.kt */
    public static final class d implements xp50 {
        public final MyTargetVideoPlaybackErrorType a;

        public d(MyTargetVideoPlaybackErrorType myTargetVideoPlaybackErrorType) {
            this.a = myTargetVideoPlaybackErrorType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AdVideoPlaybackError(errorType=" + this.a + ')';
        }
    }

    /* compiled from: MyTargetFacadeEvent.kt */
    public static final class e implements xp50 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1437711207;
        }

        public final String toString() {
            return "AdVideoPlaybackPaused";
        }
    }

    /* compiled from: MyTargetFacadeEvent.kt */
    public static final class f implements xp50 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 268369868;
        }

        public final String toString() {
            return "AdVideoPlaybackResumed";
        }
    }

    /* compiled from: MyTargetFacadeEvent.kt */
    public static final class g implements xp50 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1568604790;
        }

        public final String toString() {
            return "AdVideoPlaybackStarted";
        }
    }

    /* compiled from: MyTargetFacadeEvent.kt */
    public static final class h implements xp50 {
        public final boolean a;

        public h(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a == ((h) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("AdVideoVolumeChanged(isOn="), this.a, ')');
        }
    }

    /* compiled from: MyTargetFacadeEvent.kt */
    public static final class i implements xp50 {
        public final View a;
        public final String b;
        public final MyTargetFacadeClickTarget c;

        public i(View view, String str, MyTargetFacadeClickTarget myTargetFacadeClickTarget) {
            this.a = view;
            this.b = str;
            this.c = myTargetFacadeClickTarget;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.a, iVar.a) && epx.f(this.b, iVar.b) && this.c == iVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "CardClick(view=" + this.a + ", cardId=" + this.b + ", clickTarget=" + this.c + ')';
        }
    }

    /* compiled from: MyTargetFacadeEvent.kt */
    public static final class j implements xp50 {
        public final View a;
        public final MyTargetFacadeClickTarget b;

        public j(View view, MyTargetFacadeClickTarget myTargetFacadeClickTarget) {
            this.a = view;
            this.b = myTargetFacadeClickTarget;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.a, jVar.a) && this.b == jVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Click(view=" + this.a + ", clickTarget=" + this.b + ')';
        }
    }

    /* compiled from: MyTargetFacadeEvent.kt */
    public static final class k implements xp50 {
        public final MyTargetFacadeCustomStatType a;

        public k(MyTargetFacadeCustomStatType myTargetFacadeCustomStatType) {
            this.a = myTargetFacadeCustomStatType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.a == ((k) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "PromoClipClick(type=" + this.a + ')';
        }
    }

    /* compiled from: MyTargetFacadeEvent.kt */
    public static final class l implements xp50 {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1956766315;
        }

        public final String toString() {
            return "Register";
        }
    }

    /* compiled from: MyTargetFacadeEvent.kt */
    public static final class m implements xp50 {
        public final String a;
        public final ViewGroup b;

        public m(ViewGroup viewGroup, String str) {
            this.a = str;
            this.b = viewGroup;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.a, mVar.a) && epx.f(this.b, mVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "RegisterCard(cardId=" + this.a + ", itemView=" + this.b + ')';
        }
    }

    /* compiled from: MyTargetFacadeEvent.kt */
    public static final class n implements xp50 {
        public static final n a = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 1962702340;
        }

        public final String toString() {
            return "Unregister";
        }
    }

    /* compiled from: MyTargetFacadeEvent.kt */
    public static final class o implements xp50 {
        public final String a;

        public o(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && epx.f(this.a, ((o) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("UnregisterCard(cardId="), this.a, ')');
        }
    }
}
