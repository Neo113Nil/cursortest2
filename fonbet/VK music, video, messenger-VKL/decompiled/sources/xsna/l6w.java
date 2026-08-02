package xsna;

import android.view.View;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.ui.components.dialogs_list.InfoModalBottomSheet;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: ImItemListMviEvent.kt */
/* loaded from: classes2.dex */
public interface l6w extends pk50 {

    /* compiled from: ImItemListMviEvent.kt */
    public interface a extends l6w {

        /* compiled from: ImItemListMviEvent.kt */
        /* renamed from: xsna.l6w$a$a, reason: collision with other inner class name */
        public static final class C3236a implements a {
            public static final C3236a a = new C3236a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3236a);
            }

            public final int hashCode() {
                return -157370696;
            }

            public final String toString() {
                return "OpenCallsPrivacySettings";
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class b implements a {
            public final long a;

            public b(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a) * 31;
            }

            public final String toString() {
                return efz.b(this.a, ", entryPoint=null)", new StringBuilder("OpenChannel(channelId="));
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class c implements a {
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

        /* compiled from: ImItemListMviEvent.kt */
        public static final class d implements a {
            public final long a;

            public d(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a == ((d) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return vu5.a(')', this.a, new StringBuilder("OpenComplainToChannel(channelId="));
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class e implements a {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1042256461;
            }

            public final String toString() {
                return "OpenConnectEduChats";
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class f implements a {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -629799652;
            }

            public final String toString() {
                return "OpenContactList";
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class g implements a {
            public final Peer a;
            public final com.vk.im.engine.models.dialogs.c b;
            public final int c;
            public final FolderType d;

            public g(Peer peer, com.vk.im.engine.models.dialogs.c cVar, int i, FolderType folderType) {
                this.a = peer;
                this.b = cVar;
                this.c = i;
                this.d = folderType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && this.c == gVar.c && this.d == gVar.d;
            }

            public final int hashCode() {
                int hashCode = Long.hashCode(this.a.b) * 961;
                com.vk.im.engine.models.dialogs.c cVar = this.b;
                return this.d.hashCode() + shy.a(this.c, (hashCode + (cVar == null ? 0 : cVar.a.hashCode())) * 31, 31);
            }

            public final String toString() {
                return "OpenDialog(peer=" + this.a + ", owner=null, themeId=" + this.b + ", countUnread=" + this.c + ", folderType=" + this.d + ')';
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class h implements a {
            public final UserId a;

            public h(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("OpenDialogWithUser(userId="), this.a, ')');
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class i implements a {
            public final InfoBar a;

            public i(InfoBar infoBar) {
                this.a = infoBar;
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
                return "OpenFriendsBirthdayBanner(infoBar=" + this.a + ')';
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class j implements a {
            public final InfoModalBottomSheet.Params a;

            public j(InfoModalBottomSheet.Params params) {
                this.a = params;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && epx.f(this.a, ((j) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OpenInfoPopup(params=" + this.a + ')';
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class k implements a {
            public final String a;

            public k(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("OpenLink(url="), this.a, ')');
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class l implements a {
            public static final l a = new l();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof l);
            }

            public final int hashCode() {
                return -443166497;
            }

            public final String toString() {
                return "OpenPushSettings";
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class m implements a {
            public final qtd0 a;
            public final boolean b;
            public final WeakReference<View> c;

            public m(qtd0 qtd0Var, boolean z, WeakReference<View> weakReference) {
                this.a = qtd0Var;
                this.b = z;
                this.c = weakReference;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof m)) {
                    return false;
                }
                m mVar = (m) obj;
                return epx.f(this.a, mVar.a) && this.b == mVar.b && epx.f(this.c, mVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                return "OpenStoryViewer(profile=" + this.a + ", hasUnseenStories=" + this.b + ", anchorViewRef=" + this.c + ')';
            }
        }
    }

    /* compiled from: ImItemListMviEvent.kt */
    public interface b extends l6w {

        /* compiled from: ImItemListMviEvent.kt */
        public static final class a implements b {
            public final DialogExt a;
            public final u8m b;

            public a(DialogExt dialogExt, u8m u8mVar) {
                this.a = dialogExt;
                this.b = u8mVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "HandlePreviewQuickAction(dialogExt=" + this.a + ", dialogAction=" + this.b + ')';
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        /* renamed from: xsna.l6w$b$b, reason: collision with other inner class name */
        public static final class C3237b implements b {
            public static final C3237b a = new C3237b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3237b);
            }

            public final int hashCode() {
                return 438891686;
            }

            public final String toString() {
                return "HideDialogPreview";
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class c implements b {
            public final long a;
            public final List<u8m> b;

            public c(long j, ListBuilder listBuilder) {
                this.a = j;
                this.b = listBuilder;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && epx.f(this.b, cVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Long.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenChannelActionMenu(channelId=");
                sb.append(this.a);
                sb.append(", actions=");
                return ms9.a(')', sb, this.b);
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class d implements b {
            public final DialogExt a;

            public d(DialogExt dialogExt) {
                this.a = dialogExt;
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
                return "OpenDialogActionMenu(dialogExt=" + this.a + ')';
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class e implements b {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 684608421;
            }

            public final String toString() {
                return "RequestSyncContacts";
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class f implements b {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 1715731829;
            }

            public final String toString() {
                return "ScrollToTop";
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class g implements b {
            public final long a;

            public g(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.a == ((g) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return vu5.a(')', this.a, new StringBuilder("ShowChannelHiddenInAllFolderSnackbar(channelId="));
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class h implements b {
            public static final h a = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return 1918654700;
            }

            public final String toString() {
                return "ShowChannelShownInAllFolderSnackbar";
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class i implements b {
            public final boolean a;

            public i(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && this.a == ((i) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("ShowContactsSyncedSnackBar(successful="), this.a, ')');
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class j implements b {
            public final long a;

            public j(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && this.a == ((j) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return vu5.a(')', this.a, new StringBuilder("ShowDeleteChannelSubmit(channelId="));
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class k implements b {
            public final DialogExt a;
            public final io.reactivex.rxjava3.internal.operators.observable.i0 b;

            public k(DialogExt dialogExt, io.reactivex.rxjava3.internal.operators.observable.i0 i0Var) {
                this.a = dialogExt;
                this.b = i0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                k kVar = (k) obj;
                return this.a.equals(kVar.a) && this.b.equals(kVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "ShowDialogPreview(dialogExt=" + this.a + ", moveEvents=" + this.b + ')';
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class l implements b {
            public final Throwable a;

            public l(Throwable th) {
                this.a = th;
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
                return oq.c(new StringBuilder("ShowError(error="), this.a, ')');
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class m implements b {
            public final long a;

            public m(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && this.a == ((m) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return vu5.a(')', this.a, new StringBuilder("ShowLeaveChannelSubmit(channelId="));
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class n implements b {
            public static final n a = new n();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof n);
            }

            public final int hashCode() {
                return 843901474;
            }

            public final String toString() {
                return "ShowPrivateMessageNotificationEnabledSnackBar";
            }
        }

        /* compiled from: ImItemListMviEvent.kt */
        public static final class o implements b {
            public final long a;

            public o(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof o) && this.a == ((o) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return vu5.a(')', this.a, new StringBuilder("ShowUnarchiveSnackbar(channelId="));
            }
        }
    }
}
