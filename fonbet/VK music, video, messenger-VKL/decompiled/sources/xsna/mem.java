package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.components.dialog_header.DialogHeaderController;
import com.vk.im.ui.components.msg_search.analytics.ImSearchAnalytics;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.toggle.features.ImFeatures;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.hg1;
import xsna.ug30;

/* compiled from: DialogHeaderActionsComponent.kt */
/* loaded from: classes2.dex */
public final class mem extends j8i {
    public final Context i;
    public final a1w j;
    public final kkm k;
    public final sdm l;
    public io.reactivex.rxjava3.disposables.c o;
    public io.reactivex.rxjava3.disposables.c p;
    public io.reactivex.rxjava3.disposables.c q;
    public sem s;
    public DialogHeaderController.b t;
    public final String m = "DialogHeaderActionsComponent";
    public final io.reactivex.rxjava3.disposables.b n = new io.reactivex.rxjava3.disposables.b();
    public ltk0 r = new ltk0();

    /* compiled from: DialogHeaderActionsComponent.kt */
    public final class a {
        public a() {
        }

        public final void a() {
            mem memVar = mem.this;
            DialogHeaderController.b bVar = memVar.t;
            if (bVar != null) {
                bVar.a();
            }
            DialogHeaderController.b bVar2 = memVar.t;
            if (bVar2 != null) {
                List<? extends Msg> list = memVar.r.f;
                DialogHeaderController dialogHeaderController = DialogHeaderController.this;
                DialogHeaderController.a aVar = dialogHeaderController.d;
                mxv mxvVar = aVar.b;
                ImSearchItemLoggingInfo imSearchItemLoggingInfo = ChatFragment.this.h0;
                if (imSearchItemLoggingInfo != null) {
                    ImSearchAnalytics.d(ImSearchAnalytics.ClickAction.SHARE_OUT, imSearchItemLoggingInfo);
                }
                o0w.C(mxvVar.b(), aVar.c, mxvVar.b().b(aVar.a.q(), list), dialogHeaderController.c, 4);
            }
        }

        public final void b(Integer num) {
            mem memVar = mem.this;
            DialogHeaderController.b bVar = memVar.t;
            if (bVar != null) {
                bVar.a();
            }
            List<? extends Msg> list = memVar.r.f;
            if (mem.Y0(memVar.p) || list.isEmpty()) {
                return;
            }
            sem semVar = memVar.s;
            if (semVar != null) {
                com.vk.im.popup.a c = semVar.c();
                ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                imFeatures.getClass();
                c.b(new b040(com.vk.toggle.b.A.a(imFeatures)), new yqf(semVar, 10));
            }
            Serializer.c<Peer> cVar = Peer.CREATOR;
            int i = 19;
            memVar.p = memVar.j.E(memVar, new fi30(Peer.a.b(memVar.r.b), mem.a1(list), false, num, l5j.a, 4)).subscribe(new wf1(new hy0(memVar, 5), i), new fu0(new cu4(memVar, 4), i));
        }
    }

    public mem(Context context, a1w a1wVar, kkm kkmVar, sdm sdmVar) {
        this.i = context;
        this.j = a1wVar;
        this.k = kkmVar;
        this.l = sdmVar;
    }

    public static boolean Y0(io.reactivex.rxjava3.disposables.c cVar) {
        return (cVar == null || cVar.h()) ? false : true;
    }

    public static ArrayList a1(Collection collection) {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Msg) it.next()).b));
        }
        return arrayList;
    }

    @Override // xsna.j8i
    public final void K0(Configuration configuration) {
        c1();
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        sem semVar = new sem(layoutInflater, viewStub, this.k, this.l.i);
        this.s = semVar;
        semVar.l = new a();
        b1();
        io.reactivex.rxjava3.subjects.f<xvg0> fVar = h4l0.a.a;
        hg1.b1 b1Var = new hg1.b1();
        fVar.getClass();
        this.q = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, b1Var).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new eu0(new b5h(this, 8), 22));
        return this.s.d;
    }

    @Override // xsna.j8i
    public final void M0() {
        if (this.r.a) {
            this.n.e();
            this.r = new ltk0();
            b1();
        }
        io.reactivex.rxjava3.disposables.c cVar = this.o;
        if (cVar != null) {
            cVar.dispose();
        }
        this.o = null;
        io.reactivex.rxjava3.disposables.c cVar2 = this.p;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.p = null;
    }

    @Override // xsna.j8i
    public final void N0() {
        sem semVar = this.s;
        if (semVar != null) {
            semVar.l = null;
        }
        if (semVar != null) {
            semVar.c().dismiss();
            p870.f().g(semVar.m);
        }
        this.s = null;
        io.reactivex.rxjava3.disposables.c cVar = this.q;
        if (cVar != null) {
            cVar.dispose();
        }
        this.q = null;
    }

    public final void X0() {
        if (this.r.d.f()) {
            ltk0 ltk0Var = this.r;
            if (ltk0Var.k || ltk0Var.l) {
                return;
            }
            ltk0Var.l = true;
            long j = ltk0Var.b;
            String str = l5j.a;
            this.n.b(this.j.F(this, new koz(j)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new tf1(new oem(1, this, mem.class, "onUpdateAllByActualSuccess", "onUpdateAllByActualSuccess(Lcom/vk/im/ui/components/dialog_header/actions/tasks/LoadAllByActualCmd$Response;)V", 0), 18), new com.vk.im.ui.components.dialogs_list.b(new dh8(1, this, mem.class, "onUpdateAllByActualError", "onUpdateAllByActualError(Ljava/lang/Throwable;)V", 0, 2), 20)));
        }
    }

    public final void Z0(long j) {
        ltk0 ltk0Var = new ltk0();
        this.r = ltk0Var;
        ltk0Var.a = true;
        ltk0Var.b = j;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        ltk0Var.c = Peer.a.b(j);
        a1w a1wVar = this.j;
        io.reactivex.rxjava3.disposables.c subscribe = a1wVar.l.a().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new lyp(this));
        io.reactivex.rxjava3.disposables.b bVar = this.n;
        bVar.b(subscribe);
        b1();
        if (a1wVar.u()) {
            ltk0 ltk0Var2 = this.r;
            if (ltk0Var2.k) {
                return;
            }
            ltk0Var2.k = true;
            b1();
            long j2 = this.r.b;
            String str = l5j.a;
            int i = 23;
            bVar.b(a1wVar.F(this, new npz(j2)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new bn3(new nem(1, this, mem.class, "onLoadInitSuccess", "onLoadInitSuccess(Lcom/vk/im/ui/components/dialog_header/actions/tasks/LoadInitCmd$Response;)V", 0), i), new f60(new e15(1, this, mem.class, "onLoadInitError", "onLoadInitError(Ljava/lang/Throwable;)V", 0, 8), i)));
        }
    }

    public final void b1() {
        sem semVar;
        sem semVar2;
        c1();
        if (Y0(this.o) && (semVar2 = this.s) != null) {
            com.vk.im.popup.a c = semVar2.c();
            ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
            imFeatures.getClass();
            c.b(new ji30(com.vk.toggle.b.A.a(imFeatures)), new z4f(semVar2, 15));
        }
        if (!Y0(this.p) || (semVar = this.s) == null) {
            return;
        }
        com.vk.im.popup.a c2 = semVar.c();
        ImFeatures imFeatures2 = ImFeatures.IM_CHAT_MODALS_REDESIGN;
        imFeatures2.getClass();
        c2.b(new b040(com.vk.toggle.b.A.a(imFeatures2)), new yqf(semVar, 10));
    }

    public final void c1() {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        List<? extends ug30> list;
        sem semVar = this.s;
        if (semVar != null) {
            ltk0 ltk0Var = this.r;
            List<? extends Msg> list2 = ltk0Var.f;
            Dialog dialog = (Dialog) ltk0Var.d.c.get(Long.valueOf(ltk0Var.b));
            a1w a1wVar = this.j;
            if (dialog == null) {
                list = EmptyList.b;
            } else {
                List<? extends Msg> list3 = this.r.f;
                ArrayList a2 = com.vk.im.ui.components.common.a.a(a1wVar, dialog, list3);
                boolean contains = a1wVar.r().Z.getValue().contains(dialog.Sb());
                Set<Long> f = a1wVar.r().f();
                boolean contains2 = f.contains(dialog.Sb());
                Set<Long> value = a1wVar.r().W.getValue();
                boolean contains3 = value.contains(dialog.Sb());
                List<? extends Msg> list4 = list3;
                boolean z4 = list4 instanceof Collection;
                if (!z4 || !list4.isEmpty()) {
                    Iterator<T> it = list4.iterator();
                    while (it.hasNext()) {
                        if (f.contains(Long.valueOf(((Msg) it.next()).getFrom().b))) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z4 || !list4.isEmpty()) {
                    Iterator<T> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        if (value.contains(Long.valueOf(((Msg) it2.next()).getFrom().b))) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                a2.remove(ug30.t.a);
                a2.remove(ug30.r.a);
                a2.remove(new ug30.w(true));
                a2.remove(new ug30.x(true));
                ug30.c cVar = ug30.c.a;
                List<? extends Msg> list5 = this.r.f;
                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                    loop0: for (Msg msg : list5) {
                        if ((msg instanceof MsgFromUser) && ((arrayList = ((MsgFromUser) msg).H) == null || !arrayList.isEmpty())) {
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                if (!((Attach) it3.next()).Ya()) {
                                    z3 = true;
                                    break loop0;
                                }
                            }
                        }
                    }
                }
                z3 = false;
                ChatSettings Hb = dialog.Hb();
                p4g.l(a2, cVar, z3 || (Hb != null && !Hb.N));
                ug30.q qVar = ug30.q.a;
                ltk0 ltk0Var2 = this.r;
                p4g.l(a2, qVar, !ltk0Var2.g || ltk0Var2.f.size() > 1 || contains2 || z);
                ug30.j jVar = ug30.j.a;
                ltk0 ltk0Var3 = this.r;
                p4g.l(a2, jVar, !ltk0Var3.h || ltk0Var3.f.size() > 1 || contains);
                ug30.m mVar = ug30.m.a;
                ChatSettings Hb2 = dialog.Hb();
                p4g.l(a2, mVar, !this.r.i || (Hb2 != null && !Hb2.N));
                ug30.i iVar = ug30.i.a;
                ChatSettings Hb3 = dialog.Hb();
                p4g.l(a2, iVar, (Hb3 == null || Hb3.N) ? false : true);
                p4g.l(a2, ug30.g.a, !this.r.j);
                p4g.l(a2, ug30.s.a, contains3 || z2);
                p4g.l(a2, ug30.p.a, this.r.f.size() > 1);
                p4g.l(a2, ug30.b0.a, this.r.f.size() > 1);
                list = a2;
            }
            List<Peer.Type> list6 = com.vk.im.engine.utils.a.b;
            ltk0 ltk0Var4 = this.r;
            semVar.e(list2, list, com.vk.im.engine.utils.a.e(a1wVar != null ? a1wVar.r() : null, (Dialog) ltk0Var4.d.c.get(Long.valueOf(ltk0Var4.b)), this.r.f), this.r.e);
        }
    }
}
