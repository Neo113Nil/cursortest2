package xsna;

import android.view.MotionEvent;
import android.view.View;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.ui.components.dialogs_list.InfoModalBottomSheet;
import java.lang.ref.WeakReference;
import java.util.Set;

/* compiled from: DialogsListViewAction.kt */
/* loaded from: classes18.dex */
public abstract class ytm implements kj50 {

    /* compiled from: DialogsListViewAction.kt */
    public static final class a extends ytm {
        public static final a b = new a();
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class a0 extends ytm {
        public final Peer b;
        public final io.reactivex.rxjava3.core.q<MotionEvent> c;

        public a0(Peer peer, io.reactivex.rxjava3.core.q<MotionEvent> qVar) {
            this.b = peer;
            this.c = qVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            return epx.f(this.b, a0Var.b) && epx.f(this.c, a0Var.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            return "PreviewRequest(peer=" + this.b + ", touchEvents=" + this.c + ')';
        }
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class b extends ytm {
        public static final b b = new b();
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class b0 extends ytm {
        public static final b0 b = new b0();
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class c extends ytm {
        public static final c b = new c();
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class c0 extends ytm {
        public static final c0 b = new c0();
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class d extends ytm {
        public final Peer b;

        public d(Peer peer) {
            this.b = peer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return eq.a(new StringBuilder("DialogClick(peer="), this.b, ')');
        }
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class d0 extends ytm {
        public final Set<Peer> b;

        /* JADX WARN: Multi-variable type inference failed */
        public d0(Set<? extends Peer> set) {
            this.b = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d0) && epx.f(this.b, ((d0) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ur.c(new StringBuilder("UpdateDeadDialogs(peers="), this.b, ')');
        }
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class e extends ytm {
        public final Peer b;

        public e(Peer peer) {
            this.b = peer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return eq.a(new StringBuilder("DialogMenuRequest(peer="), this.b, ')');
        }
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class e0 extends ytm {
        public final Set<Peer> b;

        /* JADX WARN: Multi-variable type inference failed */
        public e0(Set<? extends Peer> set) {
            this.b = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e0) && epx.f(this.b, ((e0) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ur.c(new StringBuilder("UpdateNonFriendsStatus(peers="), this.b, ')');
        }
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class f extends ytm {
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
            return ho8.a(new StringBuilder("HideInfoBar(name="), this.b, ')');
        }
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class f0 extends ytm {
        public final Set<Peer> b;

        /* JADX WARN: Multi-variable type inference failed */
        public f0(Set<? extends Peer> set) {
            this.b = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f0) && epx.f(this.b, ((f0) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ur.c(new StringBuilder("UpdateStories(peers="), this.b, ')');
        }
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class g extends ytm {
        public static final g b = new g();
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class h extends ytm {
        public final boolean b;

        public h(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.b == ((h) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("IfScrolledToTopResponse(scrolledToTop="), this.b, ')');
        }
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class i extends ytm {
        public final int b;

        public i(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("LoadMoreRequest(lastVisibleItem="), this.b, ')');
        }
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class j extends ytm {
        public final String b;

        public j(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("MarkPromoLinkAsRead(promoLinkId="), this.b, ')');
        }
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class k extends ytm {
        public static final k b = new k();
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class l extends ytm {
        public final pgm b;
        public final int c;

        public l(pgm pgmVar, int i) {
            this.b = pgmVar;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return epx.f(this.b, lVar.b) && this.c == lVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MovePinnedItem(item=");
            sb.append(this.b);
            sb.append(", position=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class m extends ytm {
        public static final m b = new m();
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class n extends ytm {
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
            return ho8.a(new StringBuilder("OnCloseInfoBarClick(name="), this.b, ')');
        }
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class o extends ytm {
        public final boolean b;

        public o(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.b == ((o) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("OnContactsSyncPermissionChanged(isGranted="), this.b, ')');
        }
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class p extends ytm {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            ((p) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "OnEduSwitchAccountClick(accountType=null)";
        }
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class q extends ytm {
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
            return "OnFriendsBirthdayInfoBarClick(infoBar=" + this.b + ')';
        }
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class r extends ytm {
        public final String b;
        public final String c;
        public final boolean d;

        public r(String str, String str2, boolean z) {
            this.b = str;
            this.c = str2;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return epx.f(this.b, rVar.b) && epx.f(this.c, rVar.c) && this.d == rVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnInfoBarClick(name=");
            sb.append(this.b);
            sb.append(", callback=");
            sb.append(this.c);
            sb.append(", hideOnComplete=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class s extends ytm {
        public final UserId b;

        public s(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && epx.f(this.b, ((s) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OnInfoBarUserAvatarClick(userId="), this.b, ')');
        }
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class t extends ytm {
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class u extends ytm {
        public static final u b = new u();
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class v extends ytm {
        public static final v b = new v();
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class w extends ytm {
        public static final w b = new w();
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class x extends ytm {
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

    /* compiled from: DialogsListViewAction.kt */
    public static final class y extends ytm {
        public final InfoModalBottomSheet.Params b;

        public y(InfoModalBottomSheet.Params params) {
            this.b = params;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && epx.f(this.b, ((y) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OpenInfoPopup(params=" + this.b + ')';
        }
    }

    /* compiled from: DialogsListViewAction.kt */
    public static final class z extends ytm {
        public final String b;

        public z(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && epx.f(this.b, ((z) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenLink(url="), this.b, ')');
        }
    }
}
