package xsna;

import android.net.Uri;
import com.vk.core.voip.VoipCallSource;
import com.vk.eduauth.RequireSwitchAccountDialogContent;

/* compiled from: VoipCallsJoinToCallByPasswordNavigationEvent.kt */
/* loaded from: classes7.dex */
public interface clw0 {

    /* compiled from: VoipCallsJoinToCallByPasswordNavigationEvent.kt */
    public static final class a implements clw0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -868290059;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: VoipCallsJoinToCallByPasswordNavigationEvent.kt */
    public static final class b implements clw0 {
        public final String a;

        public b(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("OpenAnonymousJoinScreen(link="), this.a, ')');
        }
    }

    /* compiled from: VoipCallsJoinToCallByPasswordNavigationEvent.kt */
    public static final class c implements clw0 {
        public final String a;
        public final VoipCallSource b;

        public c(String str, VoipCallSource voipCallSource) {
            this.a = str;
            this.b = voipCallSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OpenPreviewJoinScreen(link=" + this.a + ", callSource=" + this.b + ')';
        }
    }

    /* compiled from: VoipCallsJoinToCallByPasswordNavigationEvent.kt */
    public static final class d implements clw0 {
        public final Uri a;
        public final RequireSwitchAccountDialogContent b;

        public d(Uri uri, RequireSwitchAccountDialogContent requireSwitchAccountDialogContent) {
            this.a = uri;
            this.b = requireSwitchAccountDialogContent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OpenSwitchAccountDialog(uri=" + this.a + ", content=" + this.b + ')';
        }
    }

    /* compiled from: VoipCallsJoinToCallByPasswordNavigationEvent.kt */
    public static final class e implements clw0 {
        public final t89 a;
        public final boolean b;

        public e(t89 t89Var, boolean z) {
            this.a = t89Var;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && this.b == eVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowError(errorPreview=");
            sb.append(this.a);
            sb.append(", isChangeIconColor=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }
}
