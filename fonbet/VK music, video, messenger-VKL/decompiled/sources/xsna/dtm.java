package xsna;

import android.view.View;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.ui.components.dialogs_list.InfoModalBottomSheet;
import java.lang.ref.WeakReference;

/* compiled from: DialogsListNavigationEvent.kt */
/* loaded from: classes18.dex */
public abstract class dtm implements vl50 {

    /* compiled from: DialogsListNavigationEvent.kt */
    public static final class a extends dtm {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 264717280;
        }

        public final String toString() {
            return "OpenBusinessNotifications";
        }
    }

    /* compiled from: DialogsListNavigationEvent.kt */
    public static final class b extends dtm {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -716391586;
        }

        public final String toString() {
            return "OpenCallsPrivacySettings";
        }
    }

    /* compiled from: DialogsListNavigationEvent.kt */
    public static final class c extends dtm {
        public final Peer a;

        public c(Peer peer) {
            this.a = peer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return eq.a(new StringBuilder("OpenChatCreation(ownerId="), this.a, ')');
        }
    }

    /* compiled from: DialogsListNavigationEvent.kt */
    public static final class d extends dtm {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1455578525;
        }

        public final String toString() {
            return "OpenConnectEduChatsMiniApp";
        }
    }

    /* compiled from: DialogsListNavigationEvent.kt */
    public static final class e extends dtm {
        public final Peer a;
        public final Peer b;
        public final com.vk.im.engine.models.dialogs.c c;
        public final int d;
        public final FolderType e;

        public e(Peer peer, Peer peer2, com.vk.im.engine.models.dialogs.c cVar, int i, FolderType folderType) {
            this.a = peer;
            this.b = peer2;
            this.c = cVar;
            this.d = i;
            this.e = folderType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && this.d == eVar.d && this.e == eVar.e;
        }

        public final int hashCode() {
            int a = bh10.a(Long.hashCode(this.a.b) * 31, 31, this.b.b);
            com.vk.im.engine.models.dialogs.c cVar = this.c;
            return this.e.hashCode() + shy.a(this.d, (a + (cVar == null ? 0 : cVar.a.hashCode())) * 31, 31);
        }

        public final String toString() {
            return "OpenDialog(peer=" + this.a + ", owner=" + this.b + ", themeId=" + this.c + ", countUnread=" + this.d + ", folderType=" + this.e + ')';
        }
    }

    /* compiled from: DialogsListNavigationEvent.kt */
    public static final class f extends dtm {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 2123819428;
        }

        public final String toString() {
            return "OpenEduAuthFlow";
        }
    }

    /* compiled from: DialogsListNavigationEvent.kt */
    public static final class g extends dtm {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "OpenEduSwitchAccount(accountType=null)";
        }
    }

    /* compiled from: DialogsListNavigationEvent.kt */
    public static final class h extends dtm {
        public final InfoModalBottomSheet.Params a;

        public h(InfoModalBottomSheet.Params params) {
            this.a = params;
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
            return "OpenInfoPopup(params=" + this.a + ')';
        }
    }

    /* compiled from: DialogsListNavigationEvent.kt */
    public static final class i extends dtm {
        public final String a;

        public i(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenLink(url="), this.a, ')');
        }
    }

    /* compiled from: DialogsListNavigationEvent.kt */
    public static final class j extends dtm {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -2136528040;
        }

        public final String toString() {
            return "OpenMessagesRequests";
        }
    }

    /* compiled from: DialogsListNavigationEvent.kt */
    public static final class k extends dtm {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 1782704930;
        }

        public final String toString() {
            return "OpenMiniApp";
        }
    }

    /* compiled from: DialogsListNavigationEvent.kt */
    public static final class l extends dtm {
        public final qtd0 a;
        public final boolean b;
        public final WeakReference<View> c;

        public l(qtd0 qtd0Var, boolean z, WeakReference<View> weakReference) {
            this.a = qtd0Var;
            this.b = z;
            this.c = weakReference;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return epx.f(this.a, lVar.a) && this.b == lVar.b && epx.f(this.c, lVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "OpenStoryViewer(profile=" + this.a + ", hasUnseenStories=" + this.b + ", anchorViewRef=" + this.c + ')';
        }
    }
}
