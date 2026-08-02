package xsna;

import android.view.MotionEvent;
import android.view.View;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.stories.ImStoryState;
import java.lang.ref.WeakReference;
import java.util.Set;

/* compiled from: ImItemListMviAction.kt */
/* loaded from: classes2.dex */
public interface i6w extends lj50 {

    /* compiled from: ImItemListMviAction.kt */
    public static final class a implements i6w {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 920857477;
        }

        public final String toString() {
            return "LoadMore";
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class a0 implements i6w {
        public final long b;

        public a0(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a0) && this.b == ((a0) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("OnUnarchiveChannelClick(channelId="));
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class b implements i6w {
        public final long b;
        public final u8m c;

        public b(long j, u8m u8mVar) {
            this.b = j;
            this.c = u8mVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "OnChannelActionClick(channelId=" + this.b + ", action=" + this.c + ')';
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class b0 implements i6w {
        public static final b0 b = new b0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b0);
        }

        public final int hashCode() {
            return 1818147180;
        }

        public final String toString() {
            return "ScrollToTopRequest";
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class c implements i6w {
        public final long b;

        public c(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("OnChannelClick(channelId="));
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class c0 implements i6w {
        public final Set<Peer> b;

        /* JADX WARN: Multi-variable type inference failed */
        public c0(Set<? extends Peer> set) {
            this.b = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c0) && epx.f(this.b, ((c0) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ur.c(new StringBuilder("UpdateStories(peers="), this.b, ')');
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class d implements i6w {
        public final long b;

        public d(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("OnChannelLongClick(channelId="));
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class e implements i6w {
        public final long b;
        public final ImStoryState c;
        public final WeakReference<View> d;

        public e(long j, ImStoryState imStoryState, WeakReference<View> weakReference) {
            this.b = j;
            this.c = imStoryState;
            this.d = weakReference;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && this.c == eVar.c && epx.f(this.d, eVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + (Long.hashCode(this.b) * 31)) * 31);
        }

        public final String toString() {
            return "OnChannelStoryClick(channelId=" + this.b + ", storyState=" + this.c + ", anchorViewRef=" + this.d + ')';
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class f implements i6w {
        public final boolean b;

        public f(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("OnContactsSyncPermissionChanged(granted="), this.b, ')');
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class g implements i6w {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -330630997;
        }

        public final String toString() {
            return "OnCreateChatClick";
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class h implements i6w {
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
            return vu5.a(')', this.b, new StringBuilder("OnDeleteChannelSubmitClick(channelId="));
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class i implements i6w {
        public final Peer b;

        public i(Peer peer) {
            this.b = peer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return eq.a(new StringBuilder("OnDialogClick(peer="), this.b, ')');
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class j implements i6w {
        public final Peer b;

        public j(Peer peer) {
            this.b = peer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return eq.a(new StringBuilder("OnDialogLongClick(peer="), this.b, ')');
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class k implements i6w {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 640299577;
        }

        public final String toString() {
            return "OnDialogPreviewHide";
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class l implements i6w {
        public final Peer b;
        public final io.reactivex.rxjava3.core.q<MotionEvent> c;

        public l(Peer peer, io.reactivex.rxjava3.core.q<MotionEvent> qVar) {
            this.b = peer;
            this.c = qVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return epx.f(this.b, lVar.b) && epx.f(this.c, lVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            return "OnDialogPreviewRequest(peer=" + this.b + ", touchEvents=" + this.c + ')';
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class m implements i6w {
        public static final m b = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -1936356724;
        }

        public final String toString() {
            return "OnInAppNotificationsEnabled";
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class n implements i6w {
        public final String b;

        public n(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.b, ((n) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OnInfoBarAdvertiserClick(advertiserLink="), this.b, ')');
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class o implements i6w {
        public final InfoBar b;
        public final InfoBar.Button c;

        public o(InfoBar infoBar, InfoBar.Button button) {
            this.b = infoBar;
            this.c = button;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return epx.f(this.b, oVar.b) && epx.f(this.c, oVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "OnInfoBarButtonClick(infoBar=" + this.b + ", button=" + this.c + ')';
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class p implements i6w {
        public final InfoBar b;

        public p(InfoBar infoBar) {
            this.b = infoBar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && epx.f(this.b, ((p) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnInfoBarFriendsBirthdayClick(infoBar=" + this.b + ')';
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class q implements i6w {
        public final InfoBar b;

        public q(InfoBar infoBar) {
            this.b = infoBar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && epx.f(this.b, ((q) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnInfoBarHideClick(infoBar=" + this.b + ')';
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class r implements i6w {
        public final UserId b;

        public r(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && epx.f(this.b, ((r) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OnInfoBarUserAvatarClick(userId="), this.b, ')');
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class s implements i6w {
        public final long b;

        public s(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.b == ((s) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("OnLeaveChannelCancelClick(channelId="));
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class t implements i6w {
        public final long b;

        public t(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.b == ((t) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("OnLeaveChannelSubmitClick(channelId="));
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class u implements i6w {
        public static final u b = new u();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public final int hashCode() {
            return -1167605157;
        }

        public final String toString() {
            return "OnOpenContactClick";
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class v implements i6w {
        public final DialogExt b;
        public final lse0 c;

        public v(DialogExt dialogExt, lse0 lse0Var) {
            this.b = dialogExt;
            this.c = lse0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return epx.f(this.b, vVar.b) && epx.f(this.c, vVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "OnPreviewQuickAction(dialogExt=" + this.b + ", action=" + this.c + ')';
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class w implements i6w {
        public final long b;

        public w(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.b == ((w) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("OnReturnChannelInAllFolderClick(channelId="));
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class x implements i6w {
        public final Peer b;
        public final ImStoryState c;
        public final WeakReference<View> d;

        public x(Peer peer, ImStoryState imStoryState, WeakReference<View> weakReference) {
            this.b = peer;
            this.c = imStoryState;
            this.d = weakReference;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return epx.f(this.b, xVar.b) && this.c == xVar.c && epx.f(this.d, xVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31);
        }

        public final String toString() {
            return "OnStoryClick(peer=" + this.b + ", storyState=" + this.c + ", anchorViewRef=" + this.d + ')';
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class y implements i6w {
        public static final y b = new y();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return -2026885743;
        }

        public final String toString() {
            return "OnSyncContactsClick";
        }
    }

    /* compiled from: ImItemListMviAction.kt */
    public static final class z implements i6w {
        public static final z b = new z();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof z);
        }

        public final int hashCode() {
            return -1646064865;
        }

        public final String toString() {
            return "OnSyncEduChatsClick";
        }
    }
}
