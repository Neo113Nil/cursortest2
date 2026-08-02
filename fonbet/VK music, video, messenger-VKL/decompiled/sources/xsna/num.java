package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.DialogExt;

/* compiled from: DialogsListViewEvent.kt */
/* loaded from: classes18.dex */
public abstract class num implements yn50 {

    /* compiled from: DialogsListViewEvent.kt */
    public static final class a extends num {
        public static final a a = new a();
    }

    /* compiled from: DialogsListViewEvent.kt */
    public static final class b extends num {
        public static final b a = new b();
    }

    /* compiled from: DialogsListViewEvent.kt */
    public static final class c extends num {
        public static final c a = new c();
    }

    /* compiled from: DialogsListViewEvent.kt */
    public static final class d extends num {
        public final UserId a;

        public d(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenChatWithUser(userId="), this.a, ')');
        }
    }

    /* compiled from: DialogsListViewEvent.kt */
    public static final class e extends num {
        public static final e a = new e();
    }

    /* compiled from: DialogsListViewEvent.kt */
    public static final class f extends num {
        public static final f a = new f();
    }

    /* compiled from: DialogsListViewEvent.kt */
    public static final class g extends num {
        public final DialogExt a;

        public g(DialogExt dialogExt) {
            this.a = dialogExt;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowDialogMenu(dialogExt=" + this.a + ')';
        }
    }

    /* compiled from: DialogsListViewEvent.kt */
    public static final class h extends num {
        public final InfoBar a;

        public h(InfoBar infoBar) {
            this.a = infoBar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowFriendsBirthdayBannerModalPage(infoBar=" + this.a + ')';
        }
    }
}
