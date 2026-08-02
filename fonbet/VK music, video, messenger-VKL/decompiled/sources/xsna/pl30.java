package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;

/* compiled from: MsgListLoaderEvent.kt */
/* loaded from: classes2.dex */
public abstract class pl30 {

    /* compiled from: MsgListLoaderEvent.kt */
    public static final class a extends pl30 {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("DataUpdateStateChanged(isUpdating="), this.a, ')');
        }
    }

    /* compiled from: MsgListLoaderEvent.kt */
    public static final class b extends pl30 {
        public final Dialog a;

        public b(Dialog dialog) {
            this.a = dialog;
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
            return "DialogUpdated(updatedDialog=" + this.a + ')';
        }
    }

    /* compiled from: MsgListLoaderEvent.kt */
    public static final class c extends pl30 {
        public final Throwable a;

        public c(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
        }
    }

    /* compiled from: MsgListLoaderEvent.kt */
    public static final class d extends pl30 {
        public final w8v a;

        public d(w8v w8vVar) {
            this.a = w8vVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "MsgHistoryUpdated(historyUpdate=" + this.a + ')';
        }
    }

    /* compiled from: MsgListLoaderEvent.kt */
    public static final class e extends pl30 {
        public final f1e0 a;
        public final ProfilesInfo b;

        public e(ProfilesInfo profilesInfo, f1e0 f1e0Var) {
            this.a = f1e0Var;
            this.b = profilesInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProfilesUpdated(updatedProfilesIds=");
            sb.append(this.a);
            sb.append(", allProfiles=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.c(sb, this.b, ')');
        }
    }
}
