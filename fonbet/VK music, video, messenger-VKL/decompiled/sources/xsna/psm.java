package xsna;

import android.content.Context;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.engine.models.dialogs.MsgReadAsLastData;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.log.L;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.observers.BlockingObserver;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedTransferQueue;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.bfz;
import xsna.drz;
import xsna.dtm;
import xsna.em20;
import xsna.i5e0;
import xsna.io8;
import xsna.ng20;
import xsna.num;
import xsna.ytm;

/* compiled from: DialogsListFeature.kt */
/* loaded from: classes18.dex */
public final class psm extends di6<oum, ytm, num, dtm> {
    public io.reactivex.rxjava3.disposables.c A;
    public boolean B;
    public final esm h;
    public final tum i;
    public final htm j;
    public final jsm k;
    public final odw l;
    public final a1w m;
    public final mxv n;
    public final FolderType o;
    public final k0w p;
    public final io.reactivex.rxjava3.core.w q;
    public final rum r;
    public final io.reactivex.rxjava3.subjects.f<Set<Peer>> s;
    public final io.reactivex.rxjava3.subjects.f<Boolean> t;
    public io.reactivex.rxjava3.disposables.c u;
    public final io.reactivex.rxjava3.subjects.f<Set<Peer>> v;
    public final io.reactivex.rxjava3.subjects.f<Boolean> w;
    public io.reactivex.rxjava3.disposables.c x;
    public final bpn0 y;
    public final io.reactivex.rxjava3.subjects.f<Boolean> z;

    /* compiled from: DialogsListFeature.kt */
    public static final class a<T> implements io.reactivex.rxjava3.functions.f {
        public a() {
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(Object obj) {
            psm psmVar = psm.this;
            psmVar.q(new ma(9, psmVar, (Set) obj));
        }
    }

    /* compiled from: DialogsListFeature.kt */
    public static final class b<T> implements io.reactivex.rxjava3.functions.f {
        public b() {
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(Object obj) {
            psm psmVar = psm.this;
            psmVar.q(new com.vk.movika.sdk.base.ui.s0(11, psmVar, (Set) obj));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public psm(esm esmVar, tum tumVar, io.reactivex.rxjava3.internal.operators.observable.m1 m1Var, htm htmVar, ksm ksmVar, cau0 cau0Var, odw odwVar, a1w a1wVar, mxv mxvVar, FolderType folderType, k0w k0wVar) {
        super(new oum(r1, r2, r3, r4, r5, r5, r7, r8, r9, r9, r4, r12));
        EmptyList emptyList = EmptyList.b;
        DialogsHistory dialogsHistory = new DialogsHistory(0, 29);
        ProfilesInfo profilesInfo = new ProfilesInfo();
        EmptySet emptySet = EmptySet.b;
        io8.a aVar = io8.a.a;
        ng20.a aVar2 = ng20.a.a;
        bfz.a.b bVar = bfz.a.b.a;
        i5e0.b bVar2 = i5e0.b.a;
        jgp jgpVar = jgp.b;
        this.h = esmVar;
        this.i = tumVar;
        this.j = htmVar;
        this.k = ksmVar;
        this.l = odwVar;
        this.m = a1wVar;
        this.n = mxvVar;
        this.o = folderType;
        this.p = k0wVar;
        io.reactivex.rxjava3.core.w b2 = io.reactivex.rxjava3.schedulers.a.b();
        this.q = b2;
        dhr0.a.getClass();
        this.r = new rum(dhr0.E(), esmVar.c());
        io.reactivex.rxjava3.subjects.f<Set<Peer>> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.s = fVar;
        io.reactivex.rxjava3.subjects.f<Boolean> fVar2 = new io.reactivex.rxjava3.subjects.f<>();
        this.t = fVar2;
        io.reactivex.rxjava3.subjects.f<Set<Peer>> fVar3 = new io.reactivex.rxjava3.subjects.f<>();
        this.v = fVar3;
        io.reactivex.rxjava3.subjects.f<Boolean> fVar4 = new io.reactivex.rxjava3.subjects.f<>();
        this.w = fVar4;
        this.y = new bpn0(new b1j(this, 10));
        this.z = new io.reactivex.rxjava3.subjects.f<>();
        if (!esmVar.k()) {
            v();
        }
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = htmVar.d().a0(asu0Var.c());
        sv svVar = new sv(this, 25);
        a.n nVar = io.reactivex.rxjava3.internal.functions.a.e;
        i(a0, nVar, svVar);
        i(odwVar.a().a0(b2), nVar, new om1(this, 12));
        di6.l(this, tumVar.a().m(io.reactivex.rxjava3.schedulers.a.b()), new js1(this, 25), 1);
        i(m1Var.a0(b2), nVar, new tz(this, 14));
        i(esmVar.i().a0(b2).r0(b2), nVar, new c40(this, 15));
        i(esmVar.j().a0(b2).r0(b2), nVar, new m5(this, 20));
        int i = 11;
        i(esmVar.g().a().a0(b2).r0(b2), nVar, new j41(this, i));
        i(esmVar.b().a().r0(b2), nVar, new defpackage.x(this, 18));
        di6.k(this, new io.reactivex.rxjava3.internal.operators.completable.o(new com.vk.im.ui.fragments.chat.b()).q(asu0Var.c()), null, null, 3);
        io.reactivex.rxjava3.core.q<R> L = fVar.c(fVar2.a0(b2)).L(new zj0(new dam(1), i), false);
        nz nzVar = new nz(new tc(20), 16);
        L.getClass();
        i(new io.reactivex.rxjava3.internal.operators.observable.i0(L, nzVar), nVar, new x8(this, 17));
        int i2 = 14;
        io.reactivex.rxjava3.core.q<R> L2 = fVar3.c(fVar4.a0(b2)).L(new z8(new y8(18), i2), false);
        b9 b9Var = new b9(new qm(17), i2);
        L2.getClass();
        i(new io.reactivex.rxjava3.internal.operators.observable.i0(L2, b9Var), nVar, new bf2(this, 14));
    }

    public static int s(ArrayList arrayList, DialogsHistory dialogsHistory) {
        Iterator<Dialog> it = dialogsHistory.iterator();
        Dialog dialog = null;
        while (it.hasNext()) {
            Dialog next = it.next();
            if (next.Bc()) {
                dialog = next;
            }
        }
        Dialog dialog2 = dialog;
        int i = 0;
        if (dialog2 == null) {
            return 0;
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            pgm pgmVar = (pgm) it2.next();
            if ((pgmVar instanceof zfm) && ((zfm) pgmVar).b.b == dialog2.Zb().b) {
                break;
            }
            i++;
        }
        return i + 1;
    }

    @Override // xsna.di6
    public final void d(ytm ytmVar) {
        Object obj;
        int i;
        Integer num;
        ytm ytmVar2 = ytmVar;
        if (ytmVar2 instanceof ytm.v) {
            v();
            return;
        }
        if (ytmVar2 instanceof ytm.i) {
            r(new rh4(12, ytmVar2, this));
            return;
        }
        if (ytmVar2 instanceof ytm.l) {
            ytm.l lVar = (ytm.l) ytmVar2;
            q(new fs5(lVar.b, lVar.c, this));
            return;
        }
        boolean z = ytmVar2 instanceof ytm.d;
        a1w a1wVar = this.m;
        jsm jsmVar = this.k;
        if (z) {
            Iterator<T> it = g().b.k().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (epx.f(((Dialog) obj).Zb(), ((ytm.d) ytmVar2).b)) {
                        break;
                    }
                }
            }
            Dialog dialog = (Dialog) obj;
            com.vk.im.engine.models.dialogs.c ic = dialog != null ? dialog.ic() : null;
            int Jb = dialog != null ? dialog.Jb() : 0;
            jsmVar.a().a(ic);
            if (dialog != null && dialog.Gb()) {
                long longValue = dialog.Sb().longValue();
                Msg msg = g().b.s().get(Long.valueOf(dialog.Zb().b));
                cew.b.getClass();
                MsgReadAsLastData f = cew.f(longValue);
                if (f != null) {
                    MsgFromUser msgFromUser = msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
                    if (msgFromUser != null && (((i = msgFromUser.d) == f.a || ((num = f.d) != null && i == num.intValue())) && f.b == 1 && msgFromUser.T == null)) {
                        this.p.k(longValue, f.e.i());
                    }
                }
            }
            m(new dtm.e(((ytm.d) ytmVar2).b, a1wVar.q(), ic, Jb, this.o));
            return;
        }
        if ((ytmVar2 instanceof ytm.g) || (ytmVar2 instanceof ytm.a0)) {
            return;
        }
        if (ytmVar2 instanceof ytm.e) {
            r(new v74(9, ytmVar2, this));
            return;
        }
        if (ytmVar2 instanceof ytm.h) {
            if (((ytm.h) ytmVar2).b) {
                return;
            }
            n(num.f.a);
            return;
        }
        if (ytmVar2 instanceof ytm.b0) {
            n(num.a.a);
            return;
        }
        if (ytmVar2.equals(ytm.a.b)) {
            m(dtm.a.a);
            return;
        }
        if (ytmVar2.equals(ytm.k.b)) {
            m(dtm.j.a);
            return;
        }
        if (ytmVar2.equals(ytm.c.b)) {
            m(new dtm.c(a1wVar.q()));
            return;
        }
        if (ytmVar2.equals(ytm.c0.b)) {
            n(num.e.a);
            return;
        }
        if (ytmVar2.equals(ytm.m.b)) {
            m(dtm.b.a);
            return;
        }
        if (ytmVar2.equals(ytm.b.b)) {
            m(dtm.d.a);
            return;
        }
        if (ytmVar2 instanceof ytm.o) {
            q(new dxh(this, 6));
            return;
        }
        if (ytmVar2 instanceof ytm.t) {
            m(dtm.k.a);
            return;
        }
        if (ytmVar2 instanceof ytm.f) {
            jsmVar.c().b(((ytm.f) ytmVar2).b);
            return;
        }
        if (ytmVar2 instanceof ytm.n) {
            jsmVar.c().c(((ytm.n) ytmVar2).b);
            return;
        }
        if (ytmVar2 instanceof ytm.y) {
            m(new dtm.h(((ytm.y) ytmVar2).b));
            return;
        }
        if (ytmVar2 instanceof ytm.r) {
            ytm.r rVar = (ytm.r) ytmVar2;
            di6.k(this, jsmVar.c().a(rVar.b, rVar.c).g(new osm(0, ytmVar2, this)), null, null, 3);
            return;
        }
        if (ytmVar2 instanceof ytm.q) {
            n(new num.h(((ytm.q) ytmVar2).b));
            return;
        }
        if (ytmVar2 instanceof ytm.s) {
            n(new num.d(((ytm.s) ytmVar2).b));
            return;
        }
        if (ytmVar2 instanceof ytm.p) {
            m(new dtm.g());
            return;
        }
        if (ytmVar2 instanceof ytm.z) {
            m(new dtm.i(((ytm.z) ytmVar2).b));
            return;
        }
        if (ytmVar2.equals(ytm.w.b)) {
            m(dtm.f.a);
            return;
        }
        if (ytmVar2.equals(ytm.u.b)) {
            Context context = e43.a;
            y9w.b(2, context != null ? context : null, new l9h(this, 10));
            return;
        }
        if (ytmVar2 instanceof ytm.x) {
            r(new l22(13, ytmVar2, this));
            return;
        }
        if (ytmVar2 instanceof ytm.f0) {
            this.v.onNext(((ytm.f0) ytmVar2).b);
            if (this.x == null) {
                this.w.onNext(Boolean.TRUE);
                return;
            }
            return;
        }
        if (ytmVar2 instanceof ytm.j) {
            this.h.b().b(((ytm.j) ytmVar2).b);
            return;
        }
        if (ytmVar2 instanceof ytm.e0) {
            this.s.onNext(((ytm.e0) ytmVar2).b);
            if (this.u == null) {
                this.t.onNext(Boolean.TRUE);
                return;
            }
            return;
        }
        if (!(ytmVar2 instanceof ytm.d0)) {
            throw new NoWhenBranchMatchedException();
        }
        ((io.reactivex.rxjava3.subjects.f) this.y.getValue()).onNext(((ytm.d0) ytmVar2).b);
        if (this.A == null) {
            this.z.onNext(Boolean.TRUE);
        }
    }

    public final void u(DialogsHistory dialogsHistory) {
        ArrayList arrayList = new ArrayList(c5g.u(dialogsHistory, 10));
        Iterator<Dialog> it = dialogsHistory.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().Zb());
        }
        tum tumVar = this.i;
        di6.l(this, tumVar.c(arrayList).m(io.reactivex.rxjava3.schedulers.a.b()), new a(), 1);
        di6.l(this, tumVar.b(arrayList).m(io.reactivex.rxjava3.schedulers.a.b()), new b(), 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r3 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v() {
        if (this.B) {
            return;
        }
        this.B = true;
        io.reactivex.rxjava3.core.w b2 = io.reactivex.rxjava3.schedulers.a.b();
        esm esmVar = this.h;
        drz<xrm> m = esmVar.m();
        io.reactivex.rxjava3.core.q<drz.a<xrm>> state = m.getState();
        LinkedTransferQueue linkedTransferQueue = new LinkedTransferQueue();
        state.subscribe(new BlockingObserver(linkedTransferQueue));
        Object peek = linkedTransferQueue.peek();
        if (peek == NotificationLite.COMPLETE) {
            L.G("Observable is completed");
        }
        peek = null;
        drz.a aVar = (drz.a) peek;
        if (aVar != null) {
            this.c.onNext(new ri0(12, this, aVar).invoke(g()));
        }
        i(new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.y(m.getState().a0(b2), new o40(new dh5(19), 15), io.reactivex.rxjava3.internal.functions.b.a), io.reactivex.rxjava3.internal.functions.a.d, new sd6(m, 3)), io.reactivex.rxjava3.internal.functions.a.e, new cp0(this, 22));
        m.a(esmVar.l());
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final oum w(oum oumVar, Set<Long> set) {
        DialogsHistory dialogsHistory;
        esm esmVar;
        DialogsHistory dialogsHistory2;
        bfz.a aVar;
        bfz.a aVar2;
        Map<Peer, ImStoryState> map;
        i5e0 i5e0Var;
        io8 io8Var;
        ng20 ng20Var;
        MsgReadAsLastData msgReadAsLastData;
        zfm b2;
        MsgReadAsLastData msgReadAsLastData2;
        DialogsHistory dialogsHistory3 = oumVar.b;
        List<pgm> list = oumVar.a;
        Map<Peer, List<vh30>> map2 = oumVar.d;
        Set<Peer> set2 = oumVar.e;
        Set<Peer> set3 = oumVar.f;
        ProfilesInfo profilesInfo = oumVar.c;
        io8 io8Var2 = oumVar.g;
        ng20 ng20Var2 = oumVar.h;
        bfz.a aVar3 = oumVar.i;
        bfz.a aVar4 = oumVar.j;
        Map<Peer, ImStoryState> map3 = oumVar.k;
        i5e0 i5e0Var2 = oumVar.l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof zfm) {
                arrayList.add(obj);
            }
        }
        int e = on00.e(c5g.u(arrayList, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(Long.valueOf(((zfm) next).b.b), next);
            io8Var2 = io8Var2;
            ng20Var2 = ng20Var2;
        }
        io8 io8Var3 = io8Var2;
        ng20 ng20Var3 = ng20Var2;
        ArrayList arrayList2 = new ArrayList();
        Iterator<Dialog> it2 = dialogsHistory3.iterator();
        while (it2.hasNext()) {
            Dialog next2 = it2.next();
            boolean contains = set.contains(Long.valueOf(next2.Zb().b));
            a1w a1wVar = this.m;
            if (contains) {
                ng20 ng20Var4 = ng20Var3;
                Peer q = a1wVar.q();
                ProfilesInfo profilesInfo2 = profilesInfo;
                bfz.a aVar5 = aVar3;
                Msg msg = dialogsHistory3.s().get(Long.valueOf(next2.Zb().b));
                List<vh30> list2 = map2.get(next2.Zb());
                if (list2 == null) {
                    list2 = EmptyList.b;
                }
                boolean contains2 = set2.contains(next2.Zb());
                boolean contains3 = set3.contains(next2.Zb());
                List<vh30> list3 = list2;
                ImStoryState imStoryState = map3.get(next2.Zb());
                if (imStoryState == null) {
                    imStoryState = ImStoryState.NONE;
                }
                if (next2.Gb()) {
                    cew cewVar = cew.b;
                    long longValue = next2.Sb().longValue();
                    cewVar.getClass();
                    msgReadAsLastData2 = cew.f(longValue);
                } else {
                    msgReadAsLastData2 = null;
                }
                ng20Var = ng20Var4;
                dialogsHistory2 = dialogsHistory3;
                map = map3;
                aVar2 = aVar4;
                i5e0Var = i5e0Var2;
                io8Var = io8Var3;
                aVar = aVar5;
                profilesInfo = profilesInfo2;
                b2 = this.r.b(next2, profilesInfo, msg, list3, contains2, contains3, imStoryState, msgReadAsLastData2, false, q);
            } else {
                dialogsHistory2 = dialogsHistory3;
                aVar = aVar3;
                aVar2 = aVar4;
                map = map3;
                i5e0Var = i5e0Var2;
                io8Var = io8Var3;
                ng20Var = ng20Var3;
                if (linkedHashMap.containsKey(Long.valueOf(next2.Zb().b))) {
                    b2 = (zfm) pn00.h(Long.valueOf(next2.Zb().b), linkedHashMap);
                } else {
                    Peer q2 = a1wVar.q();
                    Msg msg2 = dialogsHistory2.s().get(Long.valueOf(next2.Zb().b));
                    List<vh30> list4 = map2.get(next2.Zb());
                    if (list4 == null) {
                        list4 = EmptyList.b;
                    }
                    List<vh30> list5 = list4;
                    boolean contains4 = set2.contains(next2.Zb());
                    boolean contains5 = set3.contains(next2.Zb());
                    ImStoryState imStoryState2 = map.get(next2.Zb());
                    if (imStoryState2 == null) {
                        imStoryState2 = ImStoryState.NONE;
                    }
                    ImStoryState imStoryState3 = imStoryState2;
                    if (next2.Gb()) {
                        cew cewVar2 = cew.b;
                        long longValue2 = next2.Sb().longValue();
                        cewVar2.getClass();
                        msgReadAsLastData = cew.f(longValue2);
                    } else {
                        msgReadAsLastData = null;
                    }
                    b2 = this.r.b(next2, profilesInfo, msg2, list5, contains4, contains5, imStoryState3, msgReadAsLastData, false, q2);
                }
            }
            arrayList2.add(b2);
            map3 = map;
            dialogsHistory3 = dialogsHistory2;
            ng20Var3 = ng20Var;
            io8Var3 = io8Var;
            aVar3 = aVar;
            aVar4 = aVar2;
            i5e0Var2 = i5e0Var;
        }
        DialogsHistory dialogsHistory4 = dialogsHistory3;
        bfz.a aVar6 = aVar3;
        bfz.a aVar7 = aVar4;
        i5e0 i5e0Var3 = i5e0Var2;
        io8 io8Var4 = io8Var3;
        ng20 ng20Var5 = ng20Var3;
        if (i5e0Var3 instanceof i5e0.a) {
            arrayList2.add(0, new l5e0((i5e0.a) i5e0Var3));
        }
        boolean z = ng20Var5 instanceof ng20.b;
        rum rumVar = this.r;
        if (z) {
            ng20.b bVar = (ng20.b) ng20Var5;
            if (bVar.a > 0) {
                dialogsHistory = dialogsHistory4;
                int s = s(arrayList2, dialogsHistory);
                rumVar.getClass();
                int i = bVar.a;
                String c = rumVar.k.c(bVar.b, bVar.c);
                Msg msg3 = bVar.d;
                arrayList2.add(s, new og20(i, msg3 != null ? Long.valueOf(msg3.g) : null, c));
                if (io8Var4 instanceof io8.b) {
                    io8.b bVar2 = (io8.b) io8Var4;
                    if (bVar2.a > 0) {
                        int s2 = s(arrayList2, dialogsHistory);
                        rumVar.getClass();
                        int i2 = bVar2.a;
                        String c2 = rumVar.k.c(bVar2.b, bVar2.d);
                        Msg msg4 = bVar2.c;
                        arrayList2.add(s2, new jo8(i2, msg4 != null ? Long.valueOf(msg4.g) : null, c2));
                    }
                }
                bfz.a.g gVar = !(aVar7 instanceof bfz.a.g) ? (bfz.a.g) aVar7 : null;
                boolean f = gVar != null ? false : epx.f(gVar.b.b, "dialogs_list_info_bar_connect_edu_chats");
                esmVar = this.h;
                if (esmVar.c().a) {
                    boolean o = dialogsHistory.o();
                    boolean z2 = arrayList2.size() <= 2;
                    if (o && z2) {
                        boolean a2 = this.k.d().a();
                        boolean z3 = esmVar.c().b;
                        if (f) {
                            arrayList2.add(em20.b.c);
                        } else if (a2 || !z3) {
                            arrayList2.add(em20.c.c);
                        } else {
                            arrayList2.add(em20.a.c);
                        }
                    }
                }
                if (!(aVar6 instanceof bfz.a.e) || (aVar6 instanceof bfz.a.C2608a) || (aVar6 instanceof bfz.a.d) || (aVar6 instanceof bfz.a.c) || (aVar6 instanceof bfz.a.f)) {
                    rumVar.getClass();
                    arrayList2.add(0, rum.a(aVar6));
                }
                if (dialogsHistory.u()) {
                    arrayList2.add(new s990(arrayList2.isEmpty()));
                }
                return oum.a(oumVar, arrayList2, null, null, null, null, null, null, null, null, null, null, null, 4094);
            }
        }
        dialogsHistory = dialogsHistory4;
        if (io8Var4 instanceof io8.b) {
        }
        if (!(aVar7 instanceof bfz.a.g)) {
        }
        if (gVar != null) {
        }
        esmVar = this.h;
        if (esmVar.c().a) {
        }
        if (!(aVar6 instanceof bfz.a.e)) {
        }
        rumVar.getClass();
        arrayList2.add(0, rum.a(aVar6));
        if (dialogsHistory.u()) {
        }
        return oum.a(oumVar, arrayList2, null, null, null, null, null, null, null, null, null, null, null, 4094);
    }
}
