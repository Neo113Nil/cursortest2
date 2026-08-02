package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.attaches.AttachUgcSticker;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.components.dialog_header.DialogHeaderController;
import com.vk.im.ui.components.msg_search.analytics.ImSearchAnalytics;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.permission.PermissionHelper;
import com.vk.toggle.features.ImFeatures;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.mem;
import xsna.ug30;

/* compiled from: DialogHeaderActionsVc.kt */
/* loaded from: classes2.dex */
public final class sem {
    public static final Object n;
    public static final float o;
    public static final List<Integer> p;
    public final kkm a;
    public final tdm b;
    public final Context c;
    public final View d;
    public final Toolbar e;
    public final bpn0 f;
    public int g;
    public long h;
    public List<? extends ug30> i;
    public boolean j;
    public boolean k;
    public mem.a l;
    public final rem m;

    /* compiled from: _Sequences.kt */
    public static final class a implements izs<Object, Boolean> {
        public static final a b = new a();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof AttachUgcSticker);
        }
    }

    static {
        ug30.q qVar = ug30.q.a;
        Integer valueOf = Integer.valueOf(R.id.action_reply);
        Pair pair = new Pair(qVar, valueOf);
        ug30.g gVar = ug30.g.a;
        Integer valueOf2 = Integer.valueOf(R.id.action_delete);
        Pair pair2 = new Pair(gVar, valueOf2);
        ug30.m mVar = ug30.m.a;
        Integer valueOf3 = Integer.valueOf(R.id.action_forward);
        Pair pair3 = new Pair(mVar, valueOf3);
        ug30.c cVar = ug30.c.a;
        Integer valueOf4 = Integer.valueOf(R.id.action_copy);
        Pair pair4 = new Pair(cVar, valueOf4);
        Pair pair5 = new Pair(ug30.f.a, Integer.valueOf(R.id.action_copy_transcript));
        ug30.s sVar = ug30.s.a;
        Integer valueOf5 = Integer.valueOf(R.id.action_report);
        Pair pair6 = new Pair(sVar, valueOf5);
        ug30.i iVar = ug30.i.a;
        Integer valueOf6 = Integer.valueOf(R.id.action_download);
        Pair pair7 = new Pair(iVar, valueOf6);
        ug30.j jVar = ug30.j.a;
        Integer valueOf7 = Integer.valueOf(R.id.action_edit);
        Pair pair8 = new Pair(jVar, valueOf7);
        ug30.p pVar = ug30.p.a;
        Integer valueOf8 = Integer.valueOf(R.id.action_pin);
        Pair pair9 = new Pair(pVar, valueOf8);
        ug30.b0 b0Var = ug30.b0.a;
        Integer valueOf9 = Integer.valueOf(R.id.action_unpin);
        n = pn00.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(b0Var, valueOf9));
        o = cn70.a() * 52.0f;
        p = j5g.y0(e43.l(valueOf5, valueOf6, valueOf4, valueOf, valueOf8, valueOf9, valueOf3, valueOf7, valueOf2));
    }

    public sem(LayoutInflater layoutInflater, ViewStub viewStub, kkm kkmVar, tdm tdmVar) {
        this.a = kkmVar;
        this.b = tdmVar;
        this.c = layoutInflater.getContext();
        ImFeatures imFeatures = ImFeatures.IM_CHAT_TOOLBAR_REDESIGN;
        imFeatures.getClass();
        viewStub.setLayoutResource(com.vk.toggle.b.A.a(imFeatures) ? R.layout.vkim_dialog_header_actions_milkshake : R.layout.vkim_dialog_header_actions_old);
        View inflate = viewStub.inflate();
        this.d = inflate;
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        this.e = toolbar;
        this.f = new bpn0(new zqf(this, 15));
        List<? extends ug30> list = EmptyList.b;
        this.i = list;
        rem remVar = new rem(this, 0);
        this.m = remVar;
        toolbar.setNavigationOnClickListener(new v6d(this, 2));
        toolbar.l(R.menu.vkim_dialog_header_actions_old);
        toolbar.setOnMenuItemClickListener(new dg1(this, 16));
        ((View) ((bpn0) tdmVar.c).getValue()).setOnClickListener(new uzb(this, 3));
        ((View) ((bpn0) tdmVar.d).getValue()).setOnClickListener(new bc(this, 4));
        e(list, list, false, false);
        p870.f().b(9, remVar);
    }

    public static final void a(final sem semVar) {
        List list;
        Toolbar toolbar = semVar.e;
        MenuItem findItem = toolbar.getMenu().findItem(R.id.overflow);
        if (findItem == null) {
            return;
        }
        hfr j = rli0.j(new u720(toolbar.getMenu()), new qcl(findItem, 1));
        di1 di1Var = new di1(2);
        List B = rli0.B(j);
        g5g.L(B, di1Var);
        Iterator it = ((ArrayList) B).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                ArrayList b = y57.b(next);
                while (it.hasNext()) {
                    b.add(it.next());
                }
                list = b;
            } else {
                list = Collections.singletonList(next);
            }
        } else {
            list = EmptyList.b;
        }
        int width = toolbar.getWidth();
        Integer valueOf = Integer.valueOf(width);
        if (width <= 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : iah0.f().widthPixels;
        Drawable navigationIcon = toolbar.getNavigationIcon();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float intrinsicWidth = navigationIcon != null ? navigationIcon.getIntrinsicWidth() : 0.0f;
        TextView titleTextView = toolbar.getTitleTextView();
        if (titleTextView != null) {
            f = titleTextView.getWidth();
        }
        float paddingStart = (((intValue - toolbar.getPaddingStart()) - toolbar.getPaddingEnd()) - intrinsicWidth) - f;
        float f2 = o;
        int i = (int) ((paddingStart - f2) / f2);
        if (i <= 0 || list.size() - i < 1) {
            findItem.setVisible(false);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            MenuItem menuItem = (MenuItem) obj;
            if (i2 < i) {
                menuItem.setVisible(true);
            } else {
                menuItem.setVisible(false);
                arrayList.add(menuItem);
            }
            i2 = i3;
        }
        findItem.setVisible(true);
        findItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: xsna.qem
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem2) {
                String obj2;
                sem semVar2 = sem.this;
                View findViewById = semVar2.e.findViewById(menuItem2.getItemId());
                if (findViewById == null) {
                    return true;
                }
                int c = dhr0.u.c(R.attr.vk_ui_text_accent);
                findViewById.getContext();
                e.b bVar = new e.b(findViewById, null, null, c, 6);
                bVar.w = R.layout.ds_internal_context_menu_item;
                for (MenuItem menuItem3 : arrayList) {
                    CharSequence title = menuItem3.getTitle();
                    if (title != null && (obj2 = title.toString()) != null) {
                        VkContextMenu.c.d(bVar, obj2, menuItem3.getIcon(), false, new k75(4, semVar2, menuItem3), 28);
                    }
                }
                bVar.j();
                return true;
            }
        });
    }

    public final AttachUgcSticker b(Collection<? extends com.vk.im.engine.models.messages.a> collection) {
        Collection<? extends com.vk.im.engine.models.messages.a> collection2 = collection;
        List A = rli0.A(rli0.y(rli0.h(rli0.j(rli0.p(new i5g(collection2), new ob(20)), a.b)), 1));
        if (!A.isEmpty()) {
            return (AttachUgcSticker) j5g.a0(A);
        }
        Iterator it = rli0.h(rli0.t(new i5g(collection2), new com.vk.movika.sdk.base.observable.o(this, 28))).iterator();
        Object obj = null;
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            }
        }
        return (AttachUgcSticker) obj;
    }

    public final com.vk.im.popup.a c() {
        return (com.vk.im.popup.a) this.f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0235  */
    /* JADX WARN: Type inference failed for: r13v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v23, types: [xsna.l0v0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i) {
        MsgFromUser msgFromUser;
        mem.a aVar;
        ArrayList arrayList;
        ?? r13;
        AttachUgcSticker b;
        Object obj;
        ImSearchItemLoggingInfo imSearchItemLoggingInfo;
        DialogHeaderController.b bVar;
        DialogHeaderController.b bVar2;
        Context context = this.c;
        ?? r1 = n;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : r1.entrySet()) {
            if (epx.f(entry.getValue(), valueOf)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ug30 ug30Var = (ug30) j5g.Z(linkedHashMap.keySet());
        if (ug30Var != null) {
            Object obj2 = xg30.a;
            xg30.a(ug30Var, this.h, false);
        }
        if (i == R.id.action_edit) {
            mem.a aVar2 = this.l;
            if (aVar2 != null) {
                mem memVar = mem.this;
                DialogHeaderController.b bVar3 = memVar.t;
                if (bVar3 != null) {
                    bVar3.a();
                }
                Msg msg = (Msg) j5g.a0(memVar.r.f);
                if (msg == null || (bVar2 = memVar.t) == null) {
                    return;
                }
                ChatFragment chatFragment = ChatFragment.this;
                ImSearchItemLoggingInfo imSearchItemLoggingInfo2 = chatFragment.h0;
                if (imSearchItemLoggingInfo2 != null) {
                    ImSearchAnalytics.d(ImSearchAnalytics.ClickAction.EDIT_MESSAGE_OUT, imSearchItemLoggingInfo2);
                }
                ChatFragment.fo(chatFragment, (MsgFromUser) msg);
                return;
            }
            return;
        }
        if (i == R.id.action_reply) {
            mem.a aVar3 = this.l;
            if (aVar3 != null) {
                mem memVar2 = mem.this;
                DialogHeaderController.b bVar4 = memVar2.t;
                if (bVar4 != null) {
                    bVar4.a();
                }
                Msg msg2 = (Msg) j5g.a0(memVar2.r.f);
                if (msg2 == null || (bVar = memVar2.t) == null) {
                    return;
                }
                ChatFragment chatFragment2 = ChatFragment.this;
                ImSearchItemLoggingInfo imSearchItemLoggingInfo3 = chatFragment2.h0;
                if (imSearchItemLoggingInfo3 != null) {
                    ImSearchAnalytics.d(ImSearchAnalytics.ClickAction.REPLY_OUT, imSearchItemLoggingInfo3);
                }
                imv imvVar = chatFragment2.J0;
                (imvVar != null ? imvVar : null).t(msg2);
                return;
            }
            return;
        }
        if (i == R.id.action_forward) {
            mem.a aVar4 = this.l;
            if (aVar4 != null) {
                aVar4.a();
                return;
            }
            return;
        }
        if (i == R.id.action_copy) {
            mem.a aVar5 = this.l;
            if (aVar5 != null) {
                mem memVar3 = mem.this;
                DialogHeaderController.b bVar5 = memVar3.t;
                if (bVar5 != null) {
                    bVar5.a();
                }
                DialogHeaderController.b bVar6 = memVar3.t;
                if (bVar6 != null && (imSearchItemLoggingInfo = ChatFragment.this.h0) != null) {
                    ImSearchAnalytics.d(ImSearchAnalytics.ClickAction.COPY_MESSAGE_OUT, imSearchItemLoggingInfo);
                }
                List<? extends Msg> list = memVar3.r.f;
                if (list.isEmpty()) {
                    return;
                }
                memVar3.n.b(new io.reactivex.rxjava3.internal.operators.single.b(new y040(memVar3.i, memVar3.j, mem.a1(list))).q(asu0.a.c()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new kl6(new o1g(memVar3, 3), 14), new np3(new vze(memVar3, 3), 18)));
                return;
            }
            return;
        }
        int i2 = 1;
        if (i == R.id.action_download) {
            mem.a aVar6 = this.l;
            if (aVar6 != null) {
                mem memVar4 = mem.this;
                DialogHeaderController.b bVar7 = memVar4.t;
                if (bVar7 != null) {
                    bVar7.a();
                }
                DialogHeaderController.b bVar8 = memVar4.t;
                if (bVar8 != null) {
                    List<? extends Msg> list2 = memVar4.r.f;
                    ChatFragment chatFragment3 = ChatFragment.this;
                    ImSearchItemLoggingInfo imSearchItemLoggingInfo4 = chatFragment3.h0;
                    if (imSearchItemLoggingInfo4 != null) {
                        ImSearchAnalytics.d(ImSearchAnalytics.ClickAction.DOWNLOAD_OUT, imSearchItemLoggingInfo4);
                    }
                    xq1 xq1Var = new xq1(i2, chatFragment3, list2);
                    if (gz80.a(34)) {
                        xq1Var.invoke();
                        return;
                    }
                    PermissionHelper permissionHelper = PermissionHelper.a;
                    FragmentActivity kn = chatFragment3.kn();
                    permissionHelper.getClass();
                    PermissionHelper.h(permissionHelper, kn, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, xq1Var, null, 96);
                    return;
                }
                return;
            }
            return;
        }
        if (i == R.id.action_delete) {
            f();
            return;
        }
        if (i != R.id.action_report) {
            if (i == R.id.action_pin) {
                com.vk.im.popup.a.d(c(), ooa0.j, new x5i(this, 7), null, null, 12);
                return;
            } else {
                if (i == R.id.action_unpin) {
                    com.vk.im.popup.a.d(c(), poa0.j, new ocg(this, 12), null, null, 12);
                    return;
                }
                return;
            }
        }
        mem.a aVar7 = this.l;
        if (aVar7 != null) {
            Iterator it = mem.this.r.f.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((Msg) obj) instanceof MsgFromUser) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj instanceof MsgFromUser) {
                msgFromUser = (MsgFromUser) obj;
                if (msgFromUser == null && (b = b(Collections.singletonList(msgFromUser))) != null) {
                    g2v.c().getClass();
                    long j = b.f.c;
                    UserId userId = b.d;
                    int i3 = ReportFragment.a0;
                    ReportFragment.a a2 = ReportFragment.b.a();
                    a2.K("ugc_sticker");
                    a2.D(j);
                    a2.G(userId);
                    a2.s(true);
                    a2.k(context);
                    return;
                }
                aVar = this.l;
                if (aVar == null) {
                    List<? extends Msg> list3 = mem.this.r.f;
                    arrayList = new ArrayList();
                    for (Msg msg3 : list3) {
                        MsgFromUser msgFromUser2 = msg3 instanceof MsgFromUser ? (MsgFromUser) msg3 : null;
                        if (msgFromUser2 != null) {
                            arrayList.add(msgFromUser2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                MsgFromUser msgFromUser3 = arrayList != null ? (MsgFromUser) j5g.a0(arrayList) : null;
                long j2 = msgFromUser3 == null ? msgFromUser3.c : 0L;
                if (arrayList == null) {
                    r13 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        r13.add(Integer.valueOf(((MsgFromUser) it2.next()).d));
                    }
                } else {
                    r13 = EmptyList.b;
                }
                r3y.a("VKWebAppReturnReason", new ih4(new pcg(this, 13), 5));
                g2v.c().getClass();
                ?? r12 = l0v0.a;
                gzs<s3q0> gzsVar = fkq0.a;
                r12.b(context, new UserId(j2), r13);
            }
        }
        msgFromUser = null;
        if (msgFromUser == null) {
        }
        aVar = this.l;
        if (aVar == null) {
        }
        if (arrayList != null) {
        }
        if (msgFromUser3 == null) {
        }
        if (arrayList == null) {
        }
        r3y.a("VKWebAppReturnReason", new ih4(new pcg(this, 13), 5));
        g2v.c().getClass();
        ?? r122 = l0v0.a;
        gzs<s3q0> gzsVar2 = fkq0.a;
        r122.b(context, new UserId(j2), r13);
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.Map] */
    public final void e(List<? extends Msg> list, List<? extends ug30> list2, boolean z, boolean z2) {
        Msg msg = (Msg) j5g.a0(list);
        this.h = msg != null ? msg.c : 0L;
        this.g = list.size();
        this.i = list2;
        this.j = z;
        this.k = z2;
        tdm tdmVar = this.b;
        ((View) ((bpn0) tdmVar.c).getValue()).setVisibility(list2.contains(ug30.g.a) ? 0 : 8);
        ((View) ((bpn0) tdmVar.d).getValue()).setVisibility(list2.contains(ug30.m.a) ? 0 : 8);
        List<? extends ug30> list3 = this.i;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            ug30 ug30Var = (ug30) obj;
            if (!epx.f(ug30Var, ug30.g.a) && !epx.f(ug30Var, ug30.m.a)) {
                arrayList.add(obj);
            }
        }
        String valueOf = String.valueOf(this.g);
        Toolbar toolbar = this.e;
        toolbar.setTitle(valueOf);
        for (Map.Entry entry : n.entrySet()) {
            ug30 ug30Var2 = (ug30) entry.getKey();
            MenuItem findItem = toolbar.getMenu().findItem(((Number) entry.getValue()).intValue());
            if (findItem != null) {
                findItem.setVisible(arrayList.contains(ug30Var2));
                findItem.setShowAsAction(2);
            }
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (toolbar.isLaidOut()) {
            a(this);
        } else {
            toolbar.addOnLayoutChangeListener(new tem(this));
        }
        kkm kkmVar = this.a;
        kkmVar.getClass();
        kkmVar.a(toolbar, "toolbarTitleColor", new ifg(kkmVar, 9));
        kkmVar.b(toolbar, R.attr.vk_ui_text_accent_themed);
        kkmVar.a(toolbar, "toolbarNavIcon", new bhh(kkmVar, 7));
    }

    public final void f() {
        c().e(new ki30(this.g, this.c, this.j, this.k), new l2i(this, 4));
    }
}
