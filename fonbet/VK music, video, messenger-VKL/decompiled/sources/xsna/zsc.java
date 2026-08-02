package xsna;

import com.vk.clips.models.SdkClipOrdData;
import com.vk.clips.viewer.edit.presentation.feature.state.coauthors.ClipsEditCoauthorsState;
import java.util.List;

/* compiled from: ClipEditSdkMviPatch.kt */
/* loaded from: classes17.dex */
public interface zsc extends yl50 {

    /* compiled from: ClipEditSdkMviPatch.kt */
    public static final class a implements zsc {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 920893609;
        }

        public final String toString() {
            return "HideCoauthorResetDialog";
        }
    }

    /* compiled from: ClipEditSdkMviPatch.kt */
    public static final class b implements zsc {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -568874858;
        }

        public final String toString() {
            return "HideErrorSnackbar";
        }
    }

    /* compiled from: ClipEditSdkMviPatch.kt */
    public static final class c implements zsc {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -394824347;
        }

        public final String toString() {
            return "HideLoading";
        }
    }

    /* compiled from: ClipEditSdkMviPatch.kt */
    public static final class d implements zsc {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 70574446;
        }

        public final String toString() {
            return "HideVideoAttachResetDialog";
        }
    }

    /* compiled from: ClipEditSdkMviPatch.kt */
    public static final class e implements zsc {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1628036431;
        }

        public final String toString() {
            return "SetLoading";
        }
    }

    /* compiled from: ClipEditSdkMviPatch.kt */
    public static final class f implements zsc {
        public final List<String> a;

        public f(List<String> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("SetTrendingHashtags(hashtags="), this.a);
        }
    }

    /* compiled from: ClipEditSdkMviPatch.kt */
    public static final class g implements zsc {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1267518706;
        }

        public final String toString() {
            return "ShowCoauthorResetDialog";
        }
    }

    /* compiled from: ClipEditSdkMviPatch.kt */
    public static final class h implements zsc {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 836244155;
        }

        public final String toString() {
            return "ShowErrorSnackbar";
        }
    }

    /* compiled from: ClipEditSdkMviPatch.kt */
    public static final class i implements zsc {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1612115735;
        }

        public final String toString() {
            return "ShowVideoAttachResetDialog";
        }
    }

    /* compiled from: ClipEditSdkMviPatch.kt */
    public static final class j implements zsc {
        public final ClipsEditCoauthorsState.Enabled a;

        public j(ClipsEditCoauthorsState.Enabled enabled) {
            this.a = enabled;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a.equals(((j) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateCoauthors(newCoauthors=" + this.a + ')';
        }
    }

    /* compiled from: ClipEditSdkMviPatch.kt */
    public static final class k implements zsc {
        public final ClipsEditCoauthorsState.Enabled.InactiveReason a;

        public k(ClipsEditCoauthorsState.Enabled.InactiveReason inactiveReason) {
            this.a = inactiveReason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.a == ((k) obj).a;
        }

        public final int hashCode() {
            ClipsEditCoauthorsState.Enabled.InactiveReason inactiveReason = this.a;
            if (inactiveReason == null) {
                return 0;
            }
            return inactiveReason.hashCode();
        }

        public final String toString() {
            return "UpdateCoauthorsAvailability(unavailableReason=" + this.a + ')';
        }
    }

    /* compiled from: ClipEditSdkMviPatch.kt */
    public static final class l implements zsc {
        public final String a;

        public l(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("UpdateCover(newCoverPathUri="), this.a, ')');
        }
    }

    /* compiled from: ClipEditSdkMviPatch.kt */
    public static final class m implements zsc {
        public final String a;

        public m(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && epx.f(this.a, ((m) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("UpdateDescription(newDescr="), this.a, ')');
        }
    }

    /* compiled from: ClipEditSdkMviPatch.kt */
    public static final class n implements zsc {
        public final boolean a;

        public n(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.a == ((n) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UpdateIsPrivateClip(isPrivate="), this.a, ')');
        }
    }

    /* compiled from: ClipEditSdkMviPatch.kt */
    public static final class o implements zsc {
        public final boolean a;

        public o(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.a == ((o) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UpdateIsPrivateProfile(isPrivate="), this.a, ')');
        }
    }

    /* compiled from: ClipEditSdkMviPatch.kt */
    public static final class p implements zsc {
        public final SdkClipOrdData a;

        public p(SdkClipOrdData sdkClipOrdData) {
            this.a = sdkClipOrdData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && epx.f(this.a, ((p) obj).a);
        }

        public final int hashCode() {
            SdkClipOrdData sdkClipOrdData = this.a;
            if (sdkClipOrdData == null) {
                return 0;
            }
            return sdkClipOrdData.hashCode();
        }

        public final String toString() {
            return "UpdateOrd(newOrdData=" + this.a + ')';
        }
    }

    /* compiled from: ClipEditSdkMviPatch.kt */
    public static final class q implements zsc {
        public final e2s0 a;

        public q(e2s0 e2s0Var) {
            this.a = e2s0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && epx.f(this.a, ((q) obj).a);
        }

        public final int hashCode() {
            e2s0 e2s0Var = this.a;
            if (e2s0Var == null) {
                return 0;
            }
            return e2s0Var.hashCode();
        }

        public final String toString() {
            return "UpdateVideoAttach(newVideoAttachItem=" + this.a + ')';
        }
    }
}
