package xsna;

import android.content.Context;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.credentials.UserCredentials;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.reporters.api.analytics.click.ImChatManagementClickAnalyticsItem;
import com.vk.im.ui.components.common.DndPeriod;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cwb0;
import xsna.pdg0;
import xsna.u8m;
import xsna.uum;

/* compiled from: DialogsListActionsUIController.kt */
/* loaded from: classes2.dex */
public final class asm {
    public final Context a;
    public final a1w b;
    public final fo50 c;
    public final nsm d;
    public final bpn0 e;
    public final bpn0 f;
    public final zmx0 g;
    public final io.reactivex.rxjava3.disposables.b h;
    public final String i;

    public asm(Context context, a1w a1wVar, fo50 fo50Var, nsm nsmVar) {
        this.a = context;
        this.b = a1wVar;
        this.c = fo50Var;
        this.d = nsmVar;
        this.e = new bpn0(new ldl(this, 1));
        this.f = new bpn0(new yce(this, 13));
        this.g = new zmx0(context.getApplicationContext(), a1wVar);
        this.h = new io.reactivex.rxjava3.disposables.b();
        this.i = "DialogsListActionsUIController";
    }

    public final void a(DialogExt dialogExt, boolean z) {
        Peer peer = dialogExt.f;
        peer.getClass();
        if (peer.Ab(Peer.Type.GROUP)) {
            this.h.b(itg0.n(this.b.E("DialogsListActionsUIController", new fpu(dialogExt.f, z))));
        }
    }

    public final void b(DialogExt dialogExt, boolean z, DndPeriod dndPeriod) {
        Dialog Cb = dialogExt.Cb();
        Boolean valueOf = Cb != null ? Boolean.valueOf(Cb.notificationsIsUseSound) : null;
        valueOf.getClass();
        uum.a aVar = new uum.a();
        aVar.a = dialogExt.f;
        aVar.a(dndPeriod.h(), z);
        aVar.c = valueOf;
        this.b.D(this, new uum(aVar));
    }

    public final void c() {
        e().a();
    }

    public final void d(DialogExt dialogExt, boolean z) {
        if (z) {
            b(dialogExt, true, DndPeriod.NEVER);
            return;
        }
        if (!z) {
            g2v.c().getClass();
            b(dialogExt, false, DndPeriod.FOREVER);
        } else {
            if (z) {
                return;
            }
            g2v.c().getClass();
        }
    }

    public final bzb0 e() {
        return (bzb0) this.f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(DialogExt dialogExt, u8m u8mVar) {
        Peer peer = dialogExt.f;
        nsm nsmVar = this.d;
        Context context = this.a;
        io.reactivex.rxjava3.disposables.b bVar = this.h;
        if (nsmVar.a(context, u8mVar, dialogExt, bVar)) {
            return;
        }
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (u8mVar.equals(u8m.p.b)) {
            final long j = dialogExt.e;
            dv2 dv2Var = new dv2(11);
            wh6 wh6Var = new wh6(22);
            final zmx0 zmx0Var = this.g;
            LinkedHashMap linkedHashMap = zmx0Var.c;
            io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) linkedHashMap.get(Long.valueOf(j));
            if (cVar != null) {
                cVar.dispose();
            }
            int i2 = kwg0.a;
            io.reactivex.rxjava3.internal.operators.single.b bVar2 = new io.reactivex.rxjava3.internal.operators.single.b(new l340(new gzs() { // from class: xsna.wmx0
                @Override // xsna.gzs
                public final Object invoke() {
                    Object obj;
                    zmx0 zmx0Var2 = zmx0.this;
                    Context context2 = zmx0Var2.a;
                    a1w a1wVar = zmx0Var2.b;
                    Serializer.c<Peer> cVar2 = Peer.CREATOR;
                    long j2 = j;
                    pdg0 n = a1wVar.n(bdw.a, new uqm(new sqm(Peer.a.b(j2), Source.CACHE, false, (Object) null, 28)));
                    if (n instanceof pdg0.a) {
                        obj = new ipm(new wpp(), new ProfilesInfo());
                    } else {
                        if (!(n instanceof pdg0.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj = ((pdg0.b) n).a;
                    }
                    ipm ipmVar = (ipm) obj;
                    Dialog dialog = (Dialog) ipmVar.a.c.get(Long.valueOf(j2));
                    ProfilesSimpleInfo Ob = ipmVar.b.Ob();
                    if (dialog == null) {
                        throw new IllegalStateException("Dialog is null and not exists in cache");
                    }
                    String d = new DisplayNameFormatter(null, 3, null).d(dialog, Ob);
                    ShortcutManager shortcutManager = (ShortcutManager) context2.getSystemService("shortcut");
                    Bitmap a = up5.a(Math.max(shortcutManager.getIconMaxWidth(), shortcutManager.getIconMaxHeight()), new lh(17, dialog, Ob));
                    UserCredentials m = a1wVar.r().m();
                    long g = m != null ? m.g() : 0L;
                    Peer q = a1wVar.q();
                    q.getClass();
                    return new j0w(j2, d, a, g, q.Ab(Peer.Type.GROUP) ? q : null);
                }
            }, 9));
            asu0.a.getClass();
            linkedHashMap.put(Long.valueOf(j), new io.reactivex.rxjava3.internal.operators.single.j(bVar2.q(asu0.r()).m(io.reactivex.rxjava3.android.schedulers.a.b()), new io.reactivex.rxjava3.functions.a() { // from class: xsna.xmx0
                @Override // io.reactivex.rxjava3.functions.a
                public final void run() {
                    zmx0.this.c.remove(Long.valueOf(j));
                }
            }).subscribe(new k6w0(new ymx0(zmx0Var, dv2Var, i), 2), new ox80(wh6Var, 19)));
            return;
        }
        boolean equals = u8mVar.equals(u8m.d0.b);
        a1w a1wVar = this.b;
        if (equals) {
            Dialog Cb = dialogExt.Cb();
            if (Cb == null) {
                return;
            }
            int Ub = Cb.Ub();
            a1wVar.D(this, new qgm(Cb.Zb(), Ub, this.i, Boolean.TRUE));
            a1wVar.r().O.x().a(new ImChatManagementClickAnalyticsItem.c(true, ImChatManagementClickAnalyticsItem.Source.CHAT_LIST_LONGTAP));
            return;
        }
        if (u8mVar.equals(u8m.e0.b)) {
            a1wVar.D(this, new vgm(peer));
            a1wVar.r().O.x().a(new ImChatManagementClickAnalyticsItem.c(false, ImChatManagementClickAnalyticsItem.Source.CHAT_LIST_LONGTAP));
            return;
        }
        if (u8mVar.equals(u8m.g0.b)) {
            d(dialogExt, true);
            return;
        }
        if (u8mVar.equals(u8m.f0.b)) {
            d(dialogExt, false);
            return;
        }
        if (u8mVar.equals(u8m.x.b)) {
            a(dialogExt, true);
            return;
        }
        if (u8mVar.equals(u8m.v.b)) {
            a(dialogExt, false);
            return;
        }
        if (u8mVar.equals(u8m.y.b)) {
            a(dialogExt, false);
            return;
        }
        int i3 = 8;
        if (u8mVar.equals(u8m.t.b)) {
            bzb0.d(e(), new cwb0.v(context), new zv(i3, this, dialogExt), null, null, 28);
            return;
        }
        if (u8mVar.equals(u8m.m.b)) {
            Dialog Cb2 = dialogExt.Cb();
            if (Cb2 == null) {
                return;
            }
            bzb0.e(e(), new cwb0.q(context, Cb2, dialogExt.getTitle()), new s53(15, this, dialogExt));
            return;
        }
        if (u8mVar.equals(u8m.n.b)) {
            j(dialogExt, true);
            return;
        }
        if (u8mVar.equals(u8m.b0.b)) {
            j(dialogExt, false);
            return;
        }
        if (u8mVar.equals(u8m.c0.b)) {
            j(dialogExt, false);
            return;
        }
        if (u8mVar.equals(u8m.p0.b)) {
            h(dialogExt);
            return;
        }
        if (u8mVar.equals(u8m.q0.b)) {
            h(dialogExt);
            return;
        }
        if (u8mVar.equals(u8m.w.b)) {
            bzb0.d(e(), new cwb0.o(dialogExt.getTitle()), new u14(i3, this, dialogExt), null, null, 28);
            return;
        }
        if (u8mVar.equals(u8m.m0.b)) {
            ng3 ng3Var = new ng3(14, this, dialogExt);
            mim mimVar = new mim(Source.CACHE);
            zl0 zl0Var = new zl0(ng3Var, 21);
            int i4 = kwg0.a;
            bVar.b(a1wVar.E(this, mimVar).subscribe(zl0Var, new hwg0()));
            return;
        }
        if (u8mVar.equals(u8m.u0.b)) {
            a1wVar.D(this, new dmm(peer));
            a1wVar.r().O.x().a(new ImChatManagementClickAnalyticsItem.b(false, ImChatManagementClickAnalyticsItem.Source.CHAT_LIST_LONGTAP));
            return;
        }
        if (u8mVar.equals(u8m.c.b)) {
            a1wVar.D(this, new com.vk.im.engine.commands.dialogs.a(peer));
            a1wVar.r().O.x().a(new ImChatManagementClickAnalyticsItem.a(true, ImChatManagementClickAnalyticsItem.Source.CHAT_LIST_LONGTAP));
            return;
        }
        if (u8mVar.equals(u8m.t0.b)) {
            a1wVar.D(this, new com.vk.im.engine.commands.dialogs.b(peer));
            a1wVar.r().O.x().a(new ImChatManagementClickAnalyticsItem.a(false, ImChatManagementClickAnalyticsItem.Source.CHAT_LIST_LONGTAP));
            return;
        }
        int i5 = 12;
        if (u8mVar.equals(u8m.k.b)) {
            e().b(new cwb0.i(0), new com.vk.movika.sdk.base.logic.processor.d(i5, this, dialogExt), null);
        } else if (u8mVar.equals(u8m.l.b)) {
            a1wVar.D(this, new bdm(dialogExt.f, (boolean) (objArr2 == true ? 1 : 0), (int) (objArr == true ? 1 : 0), i5));
        }
    }

    public final void g() {
        c();
        this.h.e();
    }

    public final void h(DialogExt dialogExt) {
        Peer peer = dialogExt.f;
        String str = this.i;
        io.reactivex.rxjava3.internal.operators.single.j jVar = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(this.b.E(str, new ivm(peer, str)), new k41(new bv1(12, this, dialogExt), 15)), new lx6(this, 3));
        int i = kwg0.a;
        this.h.b(jVar.subscribe(new iwg0(), new bw(new xr0(24), 21)));
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, xsna.dw20] */
    public final void i(DialogExt dialogExt) {
        v8m.a = new Object();
        a1w a1wVar = this.b;
        a1wVar.getClass();
        ArrayList H = this.c.H(a1wVar.r().h, dialogExt, a1wVar.q());
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        int i = w8m.a;
        ArrayList c = w8m.c(new cwb0.z(H), ((Boolean) this.e.getValue()).booleanValue());
        w95 w95Var = new w95(ref$ObjectRef, this, dialogExt, 5);
        qe3 qe3Var = new qe3(19);
        Context context = this.a;
        ref$ObjectRef.element = new rew(context, c, w95Var, qe3Var).c.b(context, "IM_ACTIONS_CHOOSER_DIALOG_TAG");
    }

    public final void j(DialogExt dialogExt, boolean z) {
        ArrayList arrayList = new ArrayList();
        Dialog Cb = dialogExt.Cb();
        boolean z2 = false;
        if (Cb != null && Cb.Cb()) {
            z2 = true;
        }
        p4g.a(u8m.o0.b, arrayList, z2);
        bzb0.e(e(), new cwb0.h0(this.a, dialogExt, z, arrayList), new nkh(this, dialogExt, z, 1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public asm(Context context, a1w a1wVar) {
        this(context, a1wVar, new fo50(), new tq(10));
        g2v.c().getClass();
    }
}
