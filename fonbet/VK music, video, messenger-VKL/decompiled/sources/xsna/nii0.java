package xsna;

import com.vk.sharing.core.view.TargetSendActionView;
import java.util.List;

/* compiled from: SendStoryUsersAction.kt */
/* loaded from: classes16.dex */
public abstract class nii0 implements kj50 {

    /* compiled from: SendStoryUsersAction.kt */
    public static final class a extends nii0 {
        public static final a b = new a();
    }

    /* compiled from: SendStoryUsersAction.kt */
    public static final class b extends nii0 {
        public static final b b = new b();
    }

    /* compiled from: SendStoryUsersAction.kt */
    public static final class c extends nii0 {
        public static final c b = new c();
    }

    /* compiled from: SendStoryUsersAction.kt */
    public static final class d extends nii0 {
        public static final d b = new d();
    }

    /* compiled from: SendStoryUsersAction.kt */
    public static final class e extends nii0 {
        public final List<s8m> b;
        public final String c;

        public e(List<s8m> list, String str) {
            this.b = list;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnNewDialogs(list=");
            sb.append(this.b);
            sb.append(", query=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: SendStoryUsersAction.kt */
    public static final class f extends nii0 {
        public final String b;

        public f(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OnSearchQuery(query="), this.b, ')');
        }
    }

    /* compiled from: SendStoryUsersAction.kt */
    public static final class g extends nii0 {
        public final long b;

        public g(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("OpenDialog(dialogId="));
        }
    }

    /* compiled from: SendStoryUsersAction.kt */
    public static final class h extends nii0 {
        public final long b;

        public h(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.b == ((h) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("Send(dialogId="));
        }
    }

    /* compiled from: SendStoryUsersAction.kt */
    public static final class i extends nii0 {
        public final long b;
        public final TargetSendActionView.State c;

        public i(long j, TargetSendActionView.State state) {
            this.b = j;
            this.c = state;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.b == iVar.b && this.c == iVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "UpdateDialogState(dialogId=" + this.b + ", state=" + this.c + ')';
        }
    }
}
