package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.user.ImageStatus;
import com.vk.im.engine.models.dialogs.MsgReadAsLastData;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vk.im.ui.views.dialogs.DialogItemView;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.zfm;

/* compiled from: DialogViewHolder.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes18.dex */
public final class jmm extends vfz<zfm> implements usx0, ytx0 {
    public final a l;
    public final DialogItemView m;
    public boolean n;
    public final io.reactivex.rxjava3.disposables.b o;
    public final k0w p;
    public final cew q;
    public zfm.a r;
    public zfm.h s;
    public Peer t;

    /* compiled from: DialogViewHolder.kt */
    public interface a {

        /* compiled from: DialogViewHolder.kt */
        /* renamed from: xsna.jmm$a$a, reason: collision with other inner class name */
        public static final class C3126a {
            public final Peer a;
            public final io.reactivex.rxjava3.core.q<MotionEvent> b;

            public C3126a(Peer peer, io.reactivex.rxjava3.core.q<MotionEvent> qVar) {
                this.a = peer;
                this.b = qVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3126a)) {
                    return false;
                }
                C3126a c3126a = (C3126a) obj;
                return epx.f(this.a, c3126a.a) && epx.f(this.b, c3126a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
            }

            public final String toString() {
                return "PreviewRequest(peer=" + this.a + ", touchEvents=" + this.b + ')';
            }
        }

        void K(Peer peer, ImStoryState imStoryState, WeakReference<View> weakReference);

        void n(C3126a c3126a);

        void s(Peer peer);

        void v(Peer peer);
    }

    /* compiled from: DialogViewHolder.kt */
    public static abstract class b {

        /* compiled from: DialogViewHolder.kt */
        public static final class a extends b {
            public final zfm.b a;

            public a(zfm.b bVar) {
                this.a = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.w.hashCode();
            }

            public final String toString() {
                return "Attributes(attributes=" + this.a + ')';
            }
        }

        /* compiled from: DialogViewHolder.kt */
        /* renamed from: xsna.jmm$b$b, reason: collision with other inner class name */
        public static final class C3127b extends b {
            public final zfm.c a;

            public C3127b(zfm.c cVar) {
                this.a = cVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3127b) && epx.f(this.a, ((C3127b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Avatar(avatar=" + this.a + ')';
            }
        }

        /* compiled from: DialogViewHolder.kt */
        public static final class c extends b {
            public final Integer a;

            public c(Integer num) {
                this.a = num;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                Integer num = this.a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public final String toString() {
                return uqi.b(new StringBuilder("CasperIconColor(color="), this.a, ')');
            }
        }

        /* compiled from: DialogViewHolder.kt */
        public static final class d {
            public static ListBuilder a(zfm zfmVar, zfm zfmVar2) {
                zfm.b bVar = zfmVar.j;
                zfm.d dVar = zfmVar2.i;
                zfm.f fVar = zfmVar2.h;
                zfm.h hVar = zfmVar2.g;
                zfm.g gVar = zfmVar2.f;
                zfm.e eVar = zfmVar2.e;
                Integer num = zfmVar2.l;
                String str = zfmVar2.d;
                zfm.b bVar2 = zfmVar2.j;
                ListBuilder e = e43.e();
                zfm.c cVar = zfmVar.c;
                zfm.c cVar2 = zfmVar2.c;
                if (!epx.f(cVar, cVar2)) {
                    e.add(new C3127b(cVar2));
                }
                if (!zfmVar.d.equals(str) || bVar.r() != bVar2.r()) {
                    e.add(new j(str, bVar2.r()));
                }
                if (!epx.f(zfmVar.l, num)) {
                    e.add(new c(num));
                }
                if (!epx.f(zfmVar.e, eVar)) {
                    e.add(new f(eVar));
                }
                if (!epx.f(zfmVar.f, gVar)) {
                    e.add(new i(gVar));
                }
                if (!epx.f(zfmVar.g, hVar)) {
                    e.add(new k(hVar));
                }
                if (!epx.f(zfmVar.h, fVar)) {
                    e.add(new g(fVar));
                }
                if (!bVar.equals(bVar2)) {
                    e.add(new a(bVar2));
                }
                if (!epx.f(zfmVar.i, dVar)) {
                    e.add(new e(dVar));
                }
                ImStoryState imStoryState = zfmVar.m;
                ImStoryState imStoryState2 = zfmVar2.m;
                if (imStoryState != imStoryState2) {
                    e.add(new h(imStoryState2));
                }
                return e.g();
            }
        }

        /* compiled from: DialogViewHolder.kt */
        public static final class e extends b {
            public final zfm.d a;

            public e(zfm.d dVar) {
                this.a = dVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Composing(composing=" + this.a + ')';
            }
        }

        /* compiled from: DialogViewHolder.kt */
        public static final class f extends b {
            public final zfm.e a;

            public f(zfm.e eVar) {
                this.a = eVar;
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
                return "Content(content=" + this.a + ')';
            }
        }

        /* compiled from: DialogViewHolder.kt */
        public static final class g extends b {
            public final zfm.f a;

            public g(zfm.f fVar) {
                this.a = fVar;
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
                return "OnlineStatus(onlineStatus=" + this.a + ')';
            }
        }

        /* compiled from: DialogViewHolder.kt */
        public static final class h extends b {
            public final ImStoryState a;

            public h(ImStoryState imStoryState) {
                this.a = imStoryState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.a == ((h) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Stories(state=" + this.a + ')';
            }
        }

        /* compiled from: DialogViewHolder.kt */
        public static final class i extends b {
            public final zfm.g a;

            public i(zfm.g gVar) {
                this.a = gVar;
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
                return "Time(time=" + this.a + ')';
            }
        }

        /* compiled from: DialogViewHolder.kt */
        public static final class j extends b {
            public final String a;
            public final boolean b;

            public j(String str, boolean z) {
                this.a = str;
                this.b = z;
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
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Title(title=");
                sb.append((Object) this.a);
                sb.append(", isService=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: DialogViewHolder.kt */
        public static final class k extends b {
            public final zfm.h a;

            public k(zfm.h hVar) {
                this.a = hVar;
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
                return "Unread(unread=" + this.a + ')';
            }
        }
    }

    public jmm(ViewGroup viewGroup, a aVar) {
        super(R.layout.vkim_dialogs_list_item_dialog, viewGroup);
        this.l = aVar;
        DialogItemView dialogItemView = (DialogItemView) this.itemView;
        this.m = dialogItemView;
        this.o = new io.reactivex.rxjava3.disposables.b();
        this.p = ((ImReportersComponent) ((k7m) m7m.c(dialogItemView)).a(fpf0.a(ImReportersComponent.class))).K().w();
        zdw zdwVar = i7o0.b;
        this.q = (zdwVar == null ? null : zdwVar).u;
        this.s = zfm.h.c.a;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.t = Peer.Unknown.e;
        dialogItemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.imm
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                jmm jmmVar = jmm.this;
                awt0.p(jmmVar.m);
                jmmVar.l.s(jmmVar.t);
                return true;
            }
        });
        dialogItemView.setOnClickListener(new wcd(this, 1));
        dialogItemView.setAvatarOnTouchListener(new uug0(dialogItemView.getContext(), new xcd(this, 17)));
    }

    public static void i6(DialogItemView dialogItemView, zfm.c cVar, String str) {
        if (str != null) {
            dialogItemView.setAvatarContentDescription(str);
        }
        if (cVar instanceof zfm.c.b) {
            zfm.c.b bVar = (zfm.c.b) cVar;
            dialogItemView.f(bVar.a, bVar.b, bVar.c);
        } else {
            if (!(cVar instanceof zfm.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            dialogItemView.a();
        }
    }

    public static void j6(DialogItemView dialogItemView, zfm.d dVar) {
        if (epx.f(dVar, zfm.d.b.a)) {
            dialogItemView.k();
        } else {
            if (!(dVar instanceof zfm.d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            dialogItemView.i();
            zfm.d.a aVar = (zfm.d.a) dVar;
            dialogItemView.q(aVar.a, aVar.b);
        }
    }

    public static void l6(DialogItemView dialogItemView, zfm.e eVar) {
        if (epx.f(eVar, zfm.e.a.a)) {
            dialogItemView.i();
        } else {
            if (!(eVar instanceof zfm.e.b)) {
                throw new NoWhenBranchMatchedException();
            }
            zfm.e.b bVar = (zfm.e.b) eVar;
            dialogItemView.h(bVar.a, bVar.b);
        }
    }

    public static void o6(DialogItemView dialogItemView, zfm.f fVar) {
        if (epx.f(fVar, zfm.f.c.a) || epx.f(fVar, zfm.f.a.a) || epx.f(fVar, zfm.f.d.a)) {
            dialogItemView.l();
        } else {
            if (!epx.f(fVar, zfm.f.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            dialogItemView.o();
        }
    }

    @Override // xsna.jsx0
    public final boolean H4() {
        return true;
    }

    @Override // xsna.usx0
    public final boolean M1() {
        return this.n;
    }

    @Override // xsna.ytx0
    public final Rect T5(Rect rect) {
        this.m.b(rect);
        return rect;
    }

    @Override // xsna.usx0
    public final List<Rect> V3() {
        return EmptyList.b;
    }

    @Override // xsna.vfz
    public final void V5() {
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        zdwVar.u.getClass();
        this.o.b(cew.g.subscribe(new hz(new ire(this, 12), 24)));
    }

    @Override // xsna.vfz
    public final void W5(zfm zfmVar) {
        zfm zfmVar2 = zfmVar;
        zfm.g gVar = zfmVar2.f;
        this.t = zfmVar2.b;
        zfm.c cVar = zfmVar2.c;
        DialogItemView dialogItemView = this.m;
        Context context = dialogItemView.getContext();
        CharSequence charSequence = zfmVar2.d;
        i6(dialogItemView, cVar, context.getString(R.string.vkim_accessibility_avatar_chat_name, charSequence));
        ImStoryState imStoryState = zfmVar2.m;
        dialogItemView.setStories(imStoryState);
        if (imStoryState.i()) {
            dialogItemView.setAvatarViewClickListener(new hmm(this, imStoryState, 0));
        } else {
            dialogItemView.setAvatarViewClickListener(new w16(this, 4));
        }
        zfm.b bVar = zfmVar2.j;
        dialogItemView.p(charSequence, bVar.r());
        Integer num = zfmVar2.l;
        if (num != null) {
            dialogItemView.setCasperIconColor(num.intValue());
        }
        ImageStatus imageStatus = zfmVar2.k;
        if (imageStatus != null) {
            dialogItemView.e(imageStatus.d);
            dialogItemView.setImageStatusContentDescription(imageStatus.c);
        }
        dialogItemView.setImageStatusVisible(imageStatus != null);
        l6(dialogItemView, zfmVar2.e);
        dialogItemView.setTime(gVar.a);
        dialogItemView.setAccessibilityTime(gVar.c);
        o6(dialogItemView, zfmVar2.h);
        this.s = zfmVar2.g;
        zfm.a aVar = this.r;
        if (aVar != null) {
            q6(dialogItemView, aVar, false);
        }
        zfm.a aVar2 = this.r;
        if (aVar2 != null) {
            m6(dialogItemView, aVar2);
        }
        j6(dialogItemView, zfmVar2.i);
        h6(dialogItemView, bVar);
    }

    @Override // xsna.vfz
    public final void a6() {
        this.o.e();
    }

    public final void h6(DialogItemView dialogItemView, zfm.a aVar) {
        this.r = aVar;
        dialogItemView.setVerified(new VerifyInfo(aVar.k(), false, aVar.g(), false, false, false, 58, null));
        dialogItemView.setDonutIconVisible(aVar.o1());
        dialogItemView.setMutedVisible(aVar.isMuted());
        dialogItemView.setUnreadInMuted(aVar.isMuted());
        boolean z = false;
        q6(dialogItemView, aVar, false);
        dialogItemView.setCasperIconVisible(aVar.e());
        dialogItemView.setWritingDisabledIconVisible(aVar.b());
        m6(dialogItemView, aVar);
        if (aVar.m() && !aVar.p() && !aVar.a()) {
            z = true;
        }
        dialogItemView.v(z, aVar.isMuted());
        if (aVar.n()) {
            dialogItemView.setSpecialStatusCall(aVar.i());
        } else if (aVar.h()) {
            dialogItemView.m();
        } else {
            dialogItemView.n();
        }
        this.n = aVar.Q();
        aVar.l();
    }

    public final void m6(DialogItemView dialogItemView, zfm.a aVar) {
        dialogItemView.j(aVar.t() ? DialogItemView.ExtraIcon.DRAG : aVar.p() ? DialogItemView.ExtraIcon.BOMB : aVar.a() ? DialogItemView.ExtraIcon.MENTION : aVar.Q() ? (!dialogItemView.c() || aVar.l()) ? DialogItemView.ExtraIcon.NONE : DialogItemView.ExtraIcon.PIN : DialogItemView.ExtraIcon.NONE, aVar.isMuted());
        boolean z = !dialogItemView.d() && dialogItemView.c() && aVar.l();
        dialogItemView.setReplyButtonInStatus(z);
        long j = this.t.b;
        this.q.getClass();
        MsgReadAsLastData f = cew.f(j);
        if (f == null || !z || f.c) {
            return;
        }
        this.p.i(j, f.e.i());
        MsgReadAsLastData g = cew.g(cew.h(), j);
        if (g == null) {
            return;
        }
        cew.k(cew.h(), j, MsgReadAsLastData.a(g));
    }

    @Override // xsna.usx0
    public final List<Rect> p2() {
        Rect rect = new Rect();
        this.m.getGlobalVisibleRect(rect);
        rect.left = rect.right - iah0.a(40);
        return Collections.singletonList(rect);
    }

    public final void q6(DialogItemView dialogItemView, zfm.a aVar, boolean z) {
        zfm.h hVar = this.s;
        zfm.h.c cVar = zfm.h.c.a;
        boolean z2 = false;
        if (!epx.f(hVar, cVar)) {
            zfm.h hVar2 = this.s;
            if (hVar2 instanceof zfm.h.a) {
                dialogItemView.r(((zfm.h.a) hVar2).a, z);
            } else if (epx.f(hVar2, zfm.h.b.a)) {
                dialogItemView.t();
            } else if (!epx.f(hVar2, cVar)) {
                throw new NoWhenBranchMatchedException();
            }
            dialogItemView.setSendingVisible(false);
            dialogItemView.setErrorVisible(false);
            dialogItemView.setUnreadOutVisible(false);
            dialogItemView.setReadOutVisible(false);
            return;
        }
        dialogItemView.u();
        dialogItemView.setSendingVisible(aVar.d());
        dialogItemView.setErrorVisible(aVar.f() && !aVar.d());
        dialogItemView.setUnreadOutVisible(aVar.o() && !aVar.c());
        boolean z3 = aVar.o() || aVar.c();
        boolean z4 = (aVar.f() || aVar.d()) ? false : true;
        if (!aVar.Q() && z4 && aVar.j() && !z3) {
            z2 = true;
        }
        dialogItemView.setReadOutVisible(z2);
    }

    @Override // xsna.ytx0
    public final boolean w1() {
        return true;
    }
}
