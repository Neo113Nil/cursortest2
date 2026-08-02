package com.yandex.messaging.internal.view.messagemenu;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.yandex.alicekit.core.permissions.Permission;
import com.yandex.bricks.Brick;
import com.yandex.bricks.BrickSlotView;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.poll.PollMessageVote$OperationType;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.r;
import com.yandex.messaging.internal.view.messagemenu.MessageMenuReporter$Item;
import com.yandex.messaging.internal.view.timeline.g0;
import com.yandex.messaging.views.bottomsheet.NavConfiguration;
import com.yandex.messaging.views.bottomsheet.b;
import defpackage.b700;
import defpackage.d9t;
import defpackage.dct;
import defpackage.e1k;
import defpackage.e8m;
import defpackage.e9h0;
import defpackage.eu10;
import defpackage.gvg0;
import defpackage.gw00;
import defpackage.h3y;
import defpackage.hi91;
import defpackage.jng0;
import defpackage.jqr;
import defpackage.k9b;
import defpackage.ll10;
import defpackage.lu10;
import defpackage.mu10;
import defpackage.olh0;
import defpackage.oyh0;
import defpackage.ps10;
import defpackage.q4g;
import defpackage.rai0;
import defpackage.scc;
import defpackage.sls;
import defpackage.tcc;
import defpackage.uds0;
import defpackage.uk10;
import defpackage.wwg0;
import defpackage.xi3;
import defpackage.y4t;
import defpackage.yvf0;
import defpackage.zoi;
import defpackage.zwc;
import defpackage.zxo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class a extends Brick implements b {
    public MessageMenuDialog A;
    public String B;
    public Spannable C;
    public e1k D;
    public final View E;
    public final TextView F;
    public final FrameLayout G;
    public final BrickSlotView H;
    public final TextView I;
    public final TextView J;
    public final View K;
    public final NestedScrollView L;
    public boolean M;
    public rai0 N;
    public final uk10 O;
    public final Map P;
    public final List Q;
    public final LinkedHashMap R;
    public final LinkedHashMap S;
    public final Activity a;
    public final yvf0 b;
    public final com.yandex.messaging.internal.backendconfig.a c;
    public final ChatRequest w;
    public final y4t x;
    public final lu10 y;
    public final h3y z;

    public a(Activity activity, yvf0 yvf0Var, com.yandex.messaging.internal.backendconfig.a aVar, ChatRequest chatRequest, y4t y4tVar, lu10 lu10Var, h3y h3yVar) {
        this.a = activity;
        this.b = yvf0Var;
        this.c = aVar;
        this.w = chatRequest;
        this.x = y4tVar;
        this.y = lu10Var;
        this.z = h3yVar;
        View inflate = View.inflate(activity, olh0.msg_d_message_popup_dialog, null);
        this.E = inflate;
        this.F = (TextView) inflate.findViewById(e9h0.message_reactions);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(e9h0.messaging_reactions_layout);
        this.G = frameLayout;
        BrickSlotView brickSlotView = (BrickSlotView) inflate.findViewById(e9h0.messaging_reactions_slot);
        this.H = brickSlotView;
        this.I = (TextView) inflate.findViewById(e9h0.popup_dialog_message);
        this.J = (TextView) inflate.findViewById(e9h0.popup_dialog_info);
        this.K = inflate.findViewById(e9h0.popup_dialog_separator);
        this.L = (NestedScrollView) inflate.findViewById(e9h0.popup_dialog_menu_scroll);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(e9h0.popup_dialog_header_layout);
        this.O = new uk10(this);
        if (((zxo) h3yVar.get()).c) {
            linearLayout.setPadding(0, e8m.a(32), 0, 0);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            hi91.h(e8m.a(16), brickSlotView);
        } else {
            hi91.h(e8m.a(32), frameLayout);
        }
        int i = e9h0.message_reply;
        MenuSection menuSection = MenuSection.First;
        ll10 ll10Var = new ll10(i, menuSection);
        ll10 ll10Var2 = new ll10(e9h0.message_forward, menuSection);
        ll10 ll10Var3 = new ll10(e9h0.message_share, menuSection);
        ll10 ll10Var4 = new ll10(e9h0.message_show_thread, menuSection);
        ll10 ll10Var5 = new ll10(e9h0.message_reply_in_thread, menuSection);
        ll10 ll10Var6 = new ll10(e9h0.message_copy_link, menuSection);
        int i2 = e9h0.message_open_file;
        MenuSection menuSection2 = MenuSection.Second;
        ll10 ll10Var7 = new ll10(i2, menuSection2);
        ll10 ll10Var8 = new ll10(e9h0.message_download, menuSection2);
        int i3 = e9h0.message_copy;
        MenuSection menuSection3 = MenuSection.Third;
        ll10 ll10Var9 = new ll10(i3, menuSection3);
        ll10 ll10Var10 = new ll10(e9h0.message_added_to_saved_messages, menuSection3);
        ll10 ll10Var11 = new ll10(e9h0.message_mark_unread, menuSection3);
        ll10 ll10Var12 = new ll10(e9h0.thread_mark_read, menuSection3);
        ll10 ll10Var13 = new ll10(e9h0.message_revote, menuSection3);
        ll10 ll10Var14 = new ll10(e9h0.message_pin, menuSection3);
        ll10 ll10Var15 = new ll10(e9h0.message_change_starred_status, menuSection3);
        int i4 = e9h0.message_edit;
        MenuSection menuSection4 = MenuSection.Fourth;
        ll10 ll10Var16 = new ll10(i4, menuSection4);
        ll10 ll10Var17 = new ll10(e9h0.message_select, menuSection4);
        ll10 ll10Var18 = new ll10(e9h0.message_retry, menuSection4);
        int i5 = e9h0.message_cancel;
        MenuSection menuSection5 = MenuSection.DangerZone;
        List g = scc.g(ll10Var, ll10Var2, ll10Var3, ll10Var4, ll10Var5, ll10Var6, ll10Var7, ll10Var8, ll10Var9, ll10Var10, ll10Var11, ll10Var12, ll10Var13, ll10Var14, ll10Var15, ll10Var16, ll10Var17, ll10Var18, new ll10(i5, menuSection5), new ll10(e9h0.report, menuSection5), new ll10(e9h0.hide, menuSection5), new ll10(e9h0.block_user, menuSection5), new ll10(e9h0.message_delete, menuSection5));
        this.P = kotlin.collections.b.i(new Pair(menuSection, Integer.valueOf(e9h0.message_menu_divider_first_block)), new Pair(menuSection2, Integer.valueOf(e9h0.message_menu_divider_second_block)), new Pair(menuSection3, Integer.valueOf(e9h0.message_menu_divider_third_block)), new Pair(menuSection4, Integer.valueOf(e9h0.message_menu_divider_fourth_block)), new Pair(menuSection5, Integer.valueOf(e9h0.message_menu_divider_danger_zone)));
        this.Q = scc.g(menuSection, menuSection2, menuSection3, menuSection4, menuSection5);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : g) {
            MenuSection menuSection6 = ((ll10) obj).b;
            Object obj2 = linkedHashMap.get(menuSection6);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(menuSection6, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(this.E.findViewById(((ll10) it.next()).a));
            }
            linkedHashMap2.put(key, arrayList);
        }
        this.R = linkedHashMap2;
        Map map = this.P;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry2 : map.entrySet()) {
            linkedHashMap3.put(entry2.getKey(), this.E.findViewById(((Number) entry2.getValue()).intValue()));
        }
        this.S = linkedHashMap3;
    }

    public static void q(a aVar, int i, int i2, sls slsVar, int i3, Integer num, int i4) {
        if ((i4 & 8) != 0) {
            i3 = jng0.messagingCommonIconsPrimaryColor;
        }
        if ((i4 & 16) != 0) {
            num = null;
        }
        int i5 = jng0.messagingCommonIconsSecondaryColor;
        int i6 = 1;
        boolean z = (i4 & 64) != 0;
        TextView textView = (TextView) aVar.E.findViewById(i);
        textView.setCompoundDrawablesWithIntrinsicBounds(aVar.u(i2, i3), (Drawable) null, num != null ? aVar.u(num.intValue(), i5) : null, (Drawable) null);
        if (slsVar != null) {
            textView.setVisibility(0);
            textView.setOnClickListener(new zwc(slsVar, z, aVar, i6));
        } else {
            textView.setVisibility(8);
            textView.setOnClickListener(null);
        }
        aVar.w();
    }

    public static final void v(a aVar, rai0 rai0Var) {
        View view = aVar.E;
        View view2 = aVar.E;
        int height = view.getHeight();
        if (height <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.height = height;
        view2.setLayoutParams(layoutParams);
        rai0Var.F = true;
        rai0Var.q();
        aVar.I.setVisibility(8);
        aVar.J.setVisibility(8);
        aVar.K.setVisibility(8);
        aVar.L.setVisibility(8);
        aVar.M = true;
        view2.requestLayout();
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.E;
    }

    @Override // com.yandex.messaging.views.bottomsheet.b
    public final Brick j() {
        return this;
    }

    @Override // com.yandex.messaging.views.bottomsheet.b
    public final NavConfiguration k() {
        return ((zxo) this.z.get()).c ? new NavConfiguration(0) : NavConfiguration.a(new NavConfiguration(0), this.a.getResources().getDimensionPixelSize(gvg0.reactions_chooser_height), null, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        sls slsVar;
        ?? r8;
        a aVar;
        e1k e1kVar;
        super.onBrickAttach();
        lu10 lu10Var = this.y;
        final ps10 ps10Var = lu10Var.l;
        ps10 ps10Var2 = lu10Var.l;
        final mu10 mu10Var = lu10Var.b;
        final eu10 eu10Var = new eu10(mu10Var, lu10Var.c.toString(), this);
        dct dctVar = mu10Var.b;
        ChatRequest chatRequest = mu10Var.e;
        final uds0 c = dctVar.c(chatRequest, new k9b(10, lu10Var));
        if (lu10Var.d) {
            final int i = 0;
            q(this, e9h0.message_download, wwg0.msg_ic_download, new sls() { // from class: ju10
                @Override // defpackage.sls
                public final Object invoke() {
                    Long l;
                    Long l2;
                    Long l3;
                    int i2 = i;
                    zy11 zy11Var = zy11.a;
                    ps10 ps10Var3 = ps10Var;
                    mu10 mu10Var2 = mu10Var;
                    switch (i2) {
                        case 0:
                            mu10Var2.i.a(MessageMenuReporter$Item.DOWNLOAD);
                            com.yandex.alicekit.core.permissions.b bVar = ps10Var3.l;
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var = ps10Var3.F;
                            String str = nu10Var != null ? nu10Var.g : null;
                            String str2 = nu10Var != null ? nu10Var.f : null;
                            Permission permission = Permission.WRITE_EXTERNAL_STORAGE;
                            if (!bVar.b(permission) && Build.VERSION.SDK_INT < 30) {
                                bVar.e(new hza0(Collections.singletonList(permission), new ArrayList(), 100));
                                break;
                            } else {
                                ps10.D(ps10Var3.j, str, str2);
                                break;
                            }
                        case 1:
                            mu10Var2.i.a(MessageMenuReporter$Item.HIDE);
                            z83.i();
                            nu10 nu10Var2 = ps10Var3.F;
                            if (nu10Var2 != null && (l = nu10Var2.d) != null) {
                                long longValue = l.longValue();
                                g0 g0Var = ps10Var3.e;
                                abz0 abz0Var = new abz0(longValue);
                                g0Var.getClass();
                                tje.e();
                                b00 b00Var = g0Var.a;
                                ((Handler) b00Var.a.get()).post(new rz(b00Var, g0Var.b, abz0Var, false, 1));
                                break;
                            }
                            break;
                        case 2:
                            mu10Var2.i.a(MessageMenuReporter$Item.COPY);
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var3 = ps10Var3.F;
                            if (nu10Var3 != null && (l2 = nu10Var3.d) != null) {
                                ps10Var3.e.a(new abz0(l2.longValue()));
                                break;
                            }
                            break;
                        case 3:
                            mu10Var2.i.a(MessageMenuReporter$Item.SHARE);
                            nu10 nu10Var4 = ps10Var3.F;
                            if (nu10Var4 != null && (l3 = nu10Var4.d) != null) {
                                long longValue2 = l3.longValue();
                                g0 g0Var2 = ps10Var3.e;
                                abz0 abz0Var2 = new abz0(longValue2);
                                g0Var2.getClass();
                                g0Var2.c(Collections.singleton(abz0Var2));
                                break;
                            }
                            break;
                        case 4:
                            mu10Var2.i.a(MessageMenuReporter$Item.SELECT);
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var5 = ps10Var3.F;
                            ((uv10) ps10Var3.f.get()).d(new sv10(nu10Var5 != null ? nu10Var5.a : 0L, nu10Var5 != null ? nu10Var5.d : null, nu10Var5 != null ? nu10Var5.e : null, nu10Var5 != null ? nu10Var5.c : null));
                            break;
                        default:
                            mu10Var2.i.a(MessageMenuReporter$Item.REVOTE);
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var6 = ps10Var3.F;
                            if (nu10Var6 != null) {
                                PollMessageVote$OperationType pollMessageVote$OperationType = PollMessageVote$OperationType.ResetVote;
                                lxd0 lxd0Var = new lxd0();
                                String str3 = nu10Var6.h;
                                Long l4 = nu10Var6.i;
                                String str4 = nu10Var6.j;
                                lxd0Var.b = str3;
                                boolean z = nu10Var6.k;
                                lxd0Var.a = z ? nu10Var6.e : nu10Var6.d;
                                if (z) {
                                    z83.d(str4, null);
                                    z83.d(l4, null);
                                }
                                if (str4 == null || !z) {
                                    str4 = null;
                                }
                                lxd0Var.f = str4;
                                if (l4 == null || !z) {
                                    l4 = null;
                                }
                                lxd0Var.e = l4;
                                lxd0Var.c = EmptyList.a;
                                lxd0Var.d = pollMessageVote$OperationType;
                                if (lxd0Var.a == null) {
                                    ny61.g("message timestamp should be presented");
                                } else if (lxd0Var.b == null) {
                                    ny61.g("message chat id should be presented");
                                } else if ((l4 == null && str4 == null) || (str4 != null && l4 != null)) {
                                    nxd0 nxd0Var = new nxd0(lxd0Var);
                                    g0 g0Var3 = ps10Var3.e;
                                    g0Var3.getClass();
                                    tje.e();
                                    b00 b00Var2 = g0Var3.a;
                                    ((Handler) b00Var2.a.get()).post(new lz(9, b00Var2, g0Var3.b, nxd0Var));
                                    break;
                                } else {
                                    ny61.g("defining at least one attribute of forward message you should define 2 others");
                                }
                                break;
                            }
                            break;
                    }
                    return zy11Var;
                }
            }, jng0.messagingCommonIconsPrimaryColor, null, 112);
            slsVar = null;
        } else {
            q(this, e9h0.message_download, wwg0.msg_ic_download, null, jng0.messagingCommonIconsPrimaryColor, null, 112);
            slsVar = null;
        }
        if (lu10Var.e) {
            mu10Var = mu10Var;
            chatRequest = chatRequest;
            c = c;
            eu10Var = eu10Var;
            q(this, e9h0.message_open_file, wwg0.msg_ic_file, new zoi(lu10Var.b, ps10Var2, lu10Var.k, lu10Var.m, lu10Var.n, lu10Var.o, 2), jng0.messagingCommonIconsPrimaryColor, null, 112);
        } else {
            q(this, e9h0.message_open_file, wwg0.msg_ic_file, slsVar, jng0.messagingCommonIconsPrimaryColor, null, 112);
        }
        if (lu10Var.f) {
            final int i2 = 1;
            q(this, e9h0.hide, wwg0.msg_ic_hide, new sls() { // from class: ju10
                @Override // defpackage.sls
                public final Object invoke() {
                    Long l;
                    Long l2;
                    Long l3;
                    int i22 = i2;
                    zy11 zy11Var = zy11.a;
                    ps10 ps10Var3 = ps10Var;
                    mu10 mu10Var2 = mu10Var;
                    switch (i22) {
                        case 0:
                            mu10Var2.i.a(MessageMenuReporter$Item.DOWNLOAD);
                            com.yandex.alicekit.core.permissions.b bVar = ps10Var3.l;
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var = ps10Var3.F;
                            String str = nu10Var != null ? nu10Var.g : null;
                            String str2 = nu10Var != null ? nu10Var.f : null;
                            Permission permission = Permission.WRITE_EXTERNAL_STORAGE;
                            if (!bVar.b(permission) && Build.VERSION.SDK_INT < 30) {
                                bVar.e(new hza0(Collections.singletonList(permission), new ArrayList(), 100));
                                break;
                            } else {
                                ps10.D(ps10Var3.j, str, str2);
                                break;
                            }
                        case 1:
                            mu10Var2.i.a(MessageMenuReporter$Item.HIDE);
                            z83.i();
                            nu10 nu10Var2 = ps10Var3.F;
                            if (nu10Var2 != null && (l = nu10Var2.d) != null) {
                                long longValue = l.longValue();
                                g0 g0Var = ps10Var3.e;
                                abz0 abz0Var = new abz0(longValue);
                                g0Var.getClass();
                                tje.e();
                                b00 b00Var = g0Var.a;
                                ((Handler) b00Var.a.get()).post(new rz(b00Var, g0Var.b, abz0Var, false, 1));
                                break;
                            }
                            break;
                        case 2:
                            mu10Var2.i.a(MessageMenuReporter$Item.COPY);
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var3 = ps10Var3.F;
                            if (nu10Var3 != null && (l2 = nu10Var3.d) != null) {
                                ps10Var3.e.a(new abz0(l2.longValue()));
                                break;
                            }
                            break;
                        case 3:
                            mu10Var2.i.a(MessageMenuReporter$Item.SHARE);
                            nu10 nu10Var4 = ps10Var3.F;
                            if (nu10Var4 != null && (l3 = nu10Var4.d) != null) {
                                long longValue2 = l3.longValue();
                                g0 g0Var2 = ps10Var3.e;
                                abz0 abz0Var2 = new abz0(longValue2);
                                g0Var2.getClass();
                                g0Var2.c(Collections.singleton(abz0Var2));
                                break;
                            }
                            break;
                        case 4:
                            mu10Var2.i.a(MessageMenuReporter$Item.SELECT);
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var5 = ps10Var3.F;
                            ((uv10) ps10Var3.f.get()).d(new sv10(nu10Var5 != null ? nu10Var5.a : 0L, nu10Var5 != null ? nu10Var5.d : null, nu10Var5 != null ? nu10Var5.e : null, nu10Var5 != null ? nu10Var5.c : null));
                            break;
                        default:
                            mu10Var2.i.a(MessageMenuReporter$Item.REVOTE);
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var6 = ps10Var3.F;
                            if (nu10Var6 != null) {
                                PollMessageVote$OperationType pollMessageVote$OperationType = PollMessageVote$OperationType.ResetVote;
                                lxd0 lxd0Var = new lxd0();
                                String str3 = nu10Var6.h;
                                Long l4 = nu10Var6.i;
                                String str4 = nu10Var6.j;
                                lxd0Var.b = str3;
                                boolean z = nu10Var6.k;
                                lxd0Var.a = z ? nu10Var6.e : nu10Var6.d;
                                if (z) {
                                    z83.d(str4, null);
                                    z83.d(l4, null);
                                }
                                if (str4 == null || !z) {
                                    str4 = null;
                                }
                                lxd0Var.f = str4;
                                if (l4 == null || !z) {
                                    l4 = null;
                                }
                                lxd0Var.e = l4;
                                lxd0Var.c = EmptyList.a;
                                lxd0Var.d = pollMessageVote$OperationType;
                                if (lxd0Var.a == null) {
                                    ny61.g("message timestamp should be presented");
                                } else if (lxd0Var.b == null) {
                                    ny61.g("message chat id should be presented");
                                } else if ((l4 == null && str4 == null) || (str4 != null && l4 != null)) {
                                    nxd0 nxd0Var = new nxd0(lxd0Var);
                                    g0 g0Var3 = ps10Var3.e;
                                    g0Var3.getClass();
                                    tje.e();
                                    b00 b00Var2 = g0Var3.a;
                                    ((Handler) b00Var2.a.get()).post(new lz(9, b00Var2, g0Var3.b, nxd0Var));
                                    break;
                                } else {
                                    ny61.g("defining at least one attribute of forward message you should define 2 others");
                                }
                                break;
                            }
                            break;
                    }
                    return zy11Var;
                }
            }, jng0.messagingCommonDestructiveIconsColor, null, 112);
        } else {
            q(this, e9h0.hide, wwg0.msg_ic_hide, slsVar, jng0.messagingCommonDestructiveIconsColor, null, 112);
        }
        if (lu10Var.g) {
            final int i3 = 2;
            q(this, e9h0.message_copy, wwg0.msg_ic_copy, new sls() { // from class: ju10
                @Override // defpackage.sls
                public final Object invoke() {
                    Long l;
                    Long l2;
                    Long l3;
                    int i22 = i3;
                    zy11 zy11Var = zy11.a;
                    ps10 ps10Var3 = ps10Var;
                    mu10 mu10Var2 = mu10Var;
                    switch (i22) {
                        case 0:
                            mu10Var2.i.a(MessageMenuReporter$Item.DOWNLOAD);
                            com.yandex.alicekit.core.permissions.b bVar = ps10Var3.l;
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var = ps10Var3.F;
                            String str = nu10Var != null ? nu10Var.g : null;
                            String str2 = nu10Var != null ? nu10Var.f : null;
                            Permission permission = Permission.WRITE_EXTERNAL_STORAGE;
                            if (!bVar.b(permission) && Build.VERSION.SDK_INT < 30) {
                                bVar.e(new hza0(Collections.singletonList(permission), new ArrayList(), 100));
                                break;
                            } else {
                                ps10.D(ps10Var3.j, str, str2);
                                break;
                            }
                        case 1:
                            mu10Var2.i.a(MessageMenuReporter$Item.HIDE);
                            z83.i();
                            nu10 nu10Var2 = ps10Var3.F;
                            if (nu10Var2 != null && (l = nu10Var2.d) != null) {
                                long longValue = l.longValue();
                                g0 g0Var = ps10Var3.e;
                                abz0 abz0Var = new abz0(longValue);
                                g0Var.getClass();
                                tje.e();
                                b00 b00Var = g0Var.a;
                                ((Handler) b00Var.a.get()).post(new rz(b00Var, g0Var.b, abz0Var, false, 1));
                                break;
                            }
                            break;
                        case 2:
                            mu10Var2.i.a(MessageMenuReporter$Item.COPY);
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var3 = ps10Var3.F;
                            if (nu10Var3 != null && (l2 = nu10Var3.d) != null) {
                                ps10Var3.e.a(new abz0(l2.longValue()));
                                break;
                            }
                            break;
                        case 3:
                            mu10Var2.i.a(MessageMenuReporter$Item.SHARE);
                            nu10 nu10Var4 = ps10Var3.F;
                            if (nu10Var4 != null && (l3 = nu10Var4.d) != null) {
                                long longValue2 = l3.longValue();
                                g0 g0Var2 = ps10Var3.e;
                                abz0 abz0Var2 = new abz0(longValue2);
                                g0Var2.getClass();
                                g0Var2.c(Collections.singleton(abz0Var2));
                                break;
                            }
                            break;
                        case 4:
                            mu10Var2.i.a(MessageMenuReporter$Item.SELECT);
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var5 = ps10Var3.F;
                            ((uv10) ps10Var3.f.get()).d(new sv10(nu10Var5 != null ? nu10Var5.a : 0L, nu10Var5 != null ? nu10Var5.d : null, nu10Var5 != null ? nu10Var5.e : null, nu10Var5 != null ? nu10Var5.c : null));
                            break;
                        default:
                            mu10Var2.i.a(MessageMenuReporter$Item.REVOTE);
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var6 = ps10Var3.F;
                            if (nu10Var6 != null) {
                                PollMessageVote$OperationType pollMessageVote$OperationType = PollMessageVote$OperationType.ResetVote;
                                lxd0 lxd0Var = new lxd0();
                                String str3 = nu10Var6.h;
                                Long l4 = nu10Var6.i;
                                String str4 = nu10Var6.j;
                                lxd0Var.b = str3;
                                boolean z = nu10Var6.k;
                                lxd0Var.a = z ? nu10Var6.e : nu10Var6.d;
                                if (z) {
                                    z83.d(str4, null);
                                    z83.d(l4, null);
                                }
                                if (str4 == null || !z) {
                                    str4 = null;
                                }
                                lxd0Var.f = str4;
                                if (l4 == null || !z) {
                                    l4 = null;
                                }
                                lxd0Var.e = l4;
                                lxd0Var.c = EmptyList.a;
                                lxd0Var.d = pollMessageVote$OperationType;
                                if (lxd0Var.a == null) {
                                    ny61.g("message timestamp should be presented");
                                } else if (lxd0Var.b == null) {
                                    ny61.g("message chat id should be presented");
                                } else if ((l4 == null && str4 == null) || (str4 != null && l4 != null)) {
                                    nxd0 nxd0Var = new nxd0(lxd0Var);
                                    g0 g0Var3 = ps10Var3.e;
                                    g0Var3.getClass();
                                    tje.e();
                                    b00 b00Var2 = g0Var3.a;
                                    ((Handler) b00Var2.a.get()).post(new lz(9, b00Var2, g0Var3.b, nxd0Var));
                                    break;
                                } else {
                                    ny61.g("defining at least one attribute of forward message you should define 2 others");
                                }
                                break;
                            }
                            break;
                    }
                    return zy11Var;
                }
            }, 0, null, 120);
        } else {
            q(this, e9h0.message_copy, wwg0.msg_ic_copy, slsVar, 0, null, 120);
        }
        final int i4 = 3;
        if (lu10Var.h) {
            q(this, e9h0.message_share, wwg0.msg_ic_share, new sls() { // from class: ju10
                @Override // defpackage.sls
                public final Object invoke() {
                    Long l;
                    Long l2;
                    Long l3;
                    int i22 = i4;
                    zy11 zy11Var = zy11.a;
                    ps10 ps10Var3 = ps10Var;
                    mu10 mu10Var2 = mu10Var;
                    switch (i22) {
                        case 0:
                            mu10Var2.i.a(MessageMenuReporter$Item.DOWNLOAD);
                            com.yandex.alicekit.core.permissions.b bVar = ps10Var3.l;
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var = ps10Var3.F;
                            String str = nu10Var != null ? nu10Var.g : null;
                            String str2 = nu10Var != null ? nu10Var.f : null;
                            Permission permission = Permission.WRITE_EXTERNAL_STORAGE;
                            if (!bVar.b(permission) && Build.VERSION.SDK_INT < 30) {
                                bVar.e(new hza0(Collections.singletonList(permission), new ArrayList(), 100));
                                break;
                            } else {
                                ps10.D(ps10Var3.j, str, str2);
                                break;
                            }
                        case 1:
                            mu10Var2.i.a(MessageMenuReporter$Item.HIDE);
                            z83.i();
                            nu10 nu10Var2 = ps10Var3.F;
                            if (nu10Var2 != null && (l = nu10Var2.d) != null) {
                                long longValue = l.longValue();
                                g0 g0Var = ps10Var3.e;
                                abz0 abz0Var = new abz0(longValue);
                                g0Var.getClass();
                                tje.e();
                                b00 b00Var = g0Var.a;
                                ((Handler) b00Var.a.get()).post(new rz(b00Var, g0Var.b, abz0Var, false, 1));
                                break;
                            }
                            break;
                        case 2:
                            mu10Var2.i.a(MessageMenuReporter$Item.COPY);
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var3 = ps10Var3.F;
                            if (nu10Var3 != null && (l2 = nu10Var3.d) != null) {
                                ps10Var3.e.a(new abz0(l2.longValue()));
                                break;
                            }
                            break;
                        case 3:
                            mu10Var2.i.a(MessageMenuReporter$Item.SHARE);
                            nu10 nu10Var4 = ps10Var3.F;
                            if (nu10Var4 != null && (l3 = nu10Var4.d) != null) {
                                long longValue2 = l3.longValue();
                                g0 g0Var2 = ps10Var3.e;
                                abz0 abz0Var2 = new abz0(longValue2);
                                g0Var2.getClass();
                                g0Var2.c(Collections.singleton(abz0Var2));
                                break;
                            }
                            break;
                        case 4:
                            mu10Var2.i.a(MessageMenuReporter$Item.SELECT);
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var5 = ps10Var3.F;
                            ((uv10) ps10Var3.f.get()).d(new sv10(nu10Var5 != null ? nu10Var5.a : 0L, nu10Var5 != null ? nu10Var5.d : null, nu10Var5 != null ? nu10Var5.e : null, nu10Var5 != null ? nu10Var5.c : null));
                            break;
                        default:
                            mu10Var2.i.a(MessageMenuReporter$Item.REVOTE);
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var6 = ps10Var3.F;
                            if (nu10Var6 != null) {
                                PollMessageVote$OperationType pollMessageVote$OperationType = PollMessageVote$OperationType.ResetVote;
                                lxd0 lxd0Var = new lxd0();
                                String str3 = nu10Var6.h;
                                Long l4 = nu10Var6.i;
                                String str4 = nu10Var6.j;
                                lxd0Var.b = str3;
                                boolean z = nu10Var6.k;
                                lxd0Var.a = z ? nu10Var6.e : nu10Var6.d;
                                if (z) {
                                    z83.d(str4, null);
                                    z83.d(l4, null);
                                }
                                if (str4 == null || !z) {
                                    str4 = null;
                                }
                                lxd0Var.f = str4;
                                if (l4 == null || !z) {
                                    l4 = null;
                                }
                                lxd0Var.e = l4;
                                lxd0Var.c = EmptyList.a;
                                lxd0Var.d = pollMessageVote$OperationType;
                                if (lxd0Var.a == null) {
                                    ny61.g("message timestamp should be presented");
                                } else if (lxd0Var.b == null) {
                                    ny61.g("message chat id should be presented");
                                } else if ((l4 == null && str4 == null) || (str4 != null && l4 != null)) {
                                    nxd0 nxd0Var = new nxd0(lxd0Var);
                                    g0 g0Var3 = ps10Var3.e;
                                    g0Var3.getClass();
                                    tje.e();
                                    b00 b00Var2 = g0Var3.a;
                                    ((Handler) b00Var2.a.get()).post(new lz(9, b00Var2, g0Var3.b, nxd0Var));
                                    break;
                                } else {
                                    ny61.g("defining at least one attribute of forward message you should define 2 others");
                                }
                                break;
                            }
                            break;
                    }
                    return zy11Var;
                }
            }, 0, null, 120);
        } else {
            q(this, e9h0.message_share, wwg0.msg_ic_share, slsVar, 0, null, 120);
        }
        if (lu10Var.i) {
            final int i5 = 4;
            q(this, e9h0.message_select, wwg0.msg_ic_select, new sls() { // from class: ju10
                @Override // defpackage.sls
                public final Object invoke() {
                    Long l;
                    Long l2;
                    Long l3;
                    int i22 = i5;
                    zy11 zy11Var = zy11.a;
                    ps10 ps10Var3 = ps10Var;
                    mu10 mu10Var2 = mu10Var;
                    switch (i22) {
                        case 0:
                            mu10Var2.i.a(MessageMenuReporter$Item.DOWNLOAD);
                            com.yandex.alicekit.core.permissions.b bVar = ps10Var3.l;
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var = ps10Var3.F;
                            String str = nu10Var != null ? nu10Var.g : null;
                            String str2 = nu10Var != null ? nu10Var.f : null;
                            Permission permission = Permission.WRITE_EXTERNAL_STORAGE;
                            if (!bVar.b(permission) && Build.VERSION.SDK_INT < 30) {
                                bVar.e(new hza0(Collections.singletonList(permission), new ArrayList(), 100));
                                break;
                            } else {
                                ps10.D(ps10Var3.j, str, str2);
                                break;
                            }
                        case 1:
                            mu10Var2.i.a(MessageMenuReporter$Item.HIDE);
                            z83.i();
                            nu10 nu10Var2 = ps10Var3.F;
                            if (nu10Var2 != null && (l = nu10Var2.d) != null) {
                                long longValue = l.longValue();
                                g0 g0Var = ps10Var3.e;
                                abz0 abz0Var = new abz0(longValue);
                                g0Var.getClass();
                                tje.e();
                                b00 b00Var = g0Var.a;
                                ((Handler) b00Var.a.get()).post(new rz(b00Var, g0Var.b, abz0Var, false, 1));
                                break;
                            }
                            break;
                        case 2:
                            mu10Var2.i.a(MessageMenuReporter$Item.COPY);
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var3 = ps10Var3.F;
                            if (nu10Var3 != null && (l2 = nu10Var3.d) != null) {
                                ps10Var3.e.a(new abz0(l2.longValue()));
                                break;
                            }
                            break;
                        case 3:
                            mu10Var2.i.a(MessageMenuReporter$Item.SHARE);
                            nu10 nu10Var4 = ps10Var3.F;
                            if (nu10Var4 != null && (l3 = nu10Var4.d) != null) {
                                long longValue2 = l3.longValue();
                                g0 g0Var2 = ps10Var3.e;
                                abz0 abz0Var2 = new abz0(longValue2);
                                g0Var2.getClass();
                                g0Var2.c(Collections.singleton(abz0Var2));
                                break;
                            }
                            break;
                        case 4:
                            mu10Var2.i.a(MessageMenuReporter$Item.SELECT);
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var5 = ps10Var3.F;
                            ((uv10) ps10Var3.f.get()).d(new sv10(nu10Var5 != null ? nu10Var5.a : 0L, nu10Var5 != null ? nu10Var5.d : null, nu10Var5 != null ? nu10Var5.e : null, nu10Var5 != null ? nu10Var5.c : null));
                            break;
                        default:
                            mu10Var2.i.a(MessageMenuReporter$Item.REVOTE);
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var6 = ps10Var3.F;
                            if (nu10Var6 != null) {
                                PollMessageVote$OperationType pollMessageVote$OperationType = PollMessageVote$OperationType.ResetVote;
                                lxd0 lxd0Var = new lxd0();
                                String str3 = nu10Var6.h;
                                Long l4 = nu10Var6.i;
                                String str4 = nu10Var6.j;
                                lxd0Var.b = str3;
                                boolean z = nu10Var6.k;
                                lxd0Var.a = z ? nu10Var6.e : nu10Var6.d;
                                if (z) {
                                    z83.d(str4, null);
                                    z83.d(l4, null);
                                }
                                if (str4 == null || !z) {
                                    str4 = null;
                                }
                                lxd0Var.f = str4;
                                if (l4 == null || !z) {
                                    l4 = null;
                                }
                                lxd0Var.e = l4;
                                lxd0Var.c = EmptyList.a;
                                lxd0Var.d = pollMessageVote$OperationType;
                                if (lxd0Var.a == null) {
                                    ny61.g("message timestamp should be presented");
                                } else if (lxd0Var.b == null) {
                                    ny61.g("message chat id should be presented");
                                } else if ((l4 == null && str4 == null) || (str4 != null && l4 != null)) {
                                    nxd0 nxd0Var = new nxd0(lxd0Var);
                                    g0 g0Var3 = ps10Var3.e;
                                    g0Var3.getClass();
                                    tje.e();
                                    b00 b00Var2 = g0Var3.a;
                                    ((Handler) b00Var2.a.get()).post(new lz(9, b00Var2, g0Var3.b, nxd0Var));
                                    break;
                                } else {
                                    ny61.g("defining at least one attribute of forward message you should define 2 others");
                                }
                                break;
                            }
                            break;
                    }
                    return zy11Var;
                }
            }, 0, null, 120);
        } else {
            q(this, e9h0.message_select, wwg0.msg_ic_select, slsVar, 0, null, 120);
        }
        if (lu10Var.j) {
            final int i6 = 5;
            q(this, e9h0.message_revote, wwg0.msg_ic_revote, new sls() { // from class: ju10
                @Override // defpackage.sls
                public final Object invoke() {
                    Long l;
                    Long l2;
                    Long l3;
                    int i22 = i6;
                    zy11 zy11Var = zy11.a;
                    ps10 ps10Var3 = ps10Var;
                    mu10 mu10Var2 = mu10Var;
                    switch (i22) {
                        case 0:
                            mu10Var2.i.a(MessageMenuReporter$Item.DOWNLOAD);
                            com.yandex.alicekit.core.permissions.b bVar = ps10Var3.l;
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var = ps10Var3.F;
                            String str = nu10Var != null ? nu10Var.g : null;
                            String str2 = nu10Var != null ? nu10Var.f : null;
                            Permission permission = Permission.WRITE_EXTERNAL_STORAGE;
                            if (!bVar.b(permission) && Build.VERSION.SDK_INT < 30) {
                                bVar.e(new hza0(Collections.singletonList(permission), new ArrayList(), 100));
                                break;
                            } else {
                                ps10.D(ps10Var3.j, str, str2);
                                break;
                            }
                        case 1:
                            mu10Var2.i.a(MessageMenuReporter$Item.HIDE);
                            z83.i();
                            nu10 nu10Var2 = ps10Var3.F;
                            if (nu10Var2 != null && (l = nu10Var2.d) != null) {
                                long longValue = l.longValue();
                                g0 g0Var = ps10Var3.e;
                                abz0 abz0Var = new abz0(longValue);
                                g0Var.getClass();
                                tje.e();
                                b00 b00Var = g0Var.a;
                                ((Handler) b00Var.a.get()).post(new rz(b00Var, g0Var.b, abz0Var, false, 1));
                                break;
                            }
                            break;
                        case 2:
                            mu10Var2.i.a(MessageMenuReporter$Item.COPY);
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var3 = ps10Var3.F;
                            if (nu10Var3 != null && (l2 = nu10Var3.d) != null) {
                                ps10Var3.e.a(new abz0(l2.longValue()));
                                break;
                            }
                            break;
                        case 3:
                            mu10Var2.i.a(MessageMenuReporter$Item.SHARE);
                            nu10 nu10Var4 = ps10Var3.F;
                            if (nu10Var4 != null && (l3 = nu10Var4.d) != null) {
                                long longValue2 = l3.longValue();
                                g0 g0Var2 = ps10Var3.e;
                                abz0 abz0Var2 = new abz0(longValue2);
                                g0Var2.getClass();
                                g0Var2.c(Collections.singleton(abz0Var2));
                                break;
                            }
                            break;
                        case 4:
                            mu10Var2.i.a(MessageMenuReporter$Item.SELECT);
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var5 = ps10Var3.F;
                            ((uv10) ps10Var3.f.get()).d(new sv10(nu10Var5 != null ? nu10Var5.a : 0L, nu10Var5 != null ? nu10Var5.d : null, nu10Var5 != null ? nu10Var5.e : null, nu10Var5 != null ? nu10Var5.c : null));
                            break;
                        default:
                            mu10Var2.i.a(MessageMenuReporter$Item.REVOTE);
                            z83.d(ps10Var3.F, null);
                            nu10 nu10Var6 = ps10Var3.F;
                            if (nu10Var6 != null) {
                                PollMessageVote$OperationType pollMessageVote$OperationType = PollMessageVote$OperationType.ResetVote;
                                lxd0 lxd0Var = new lxd0();
                                String str3 = nu10Var6.h;
                                Long l4 = nu10Var6.i;
                                String str4 = nu10Var6.j;
                                lxd0Var.b = str3;
                                boolean z = nu10Var6.k;
                                lxd0Var.a = z ? nu10Var6.e : nu10Var6.d;
                                if (z) {
                                    z83.d(str4, null);
                                    z83.d(l4, null);
                                }
                                if (str4 == null || !z) {
                                    str4 = null;
                                }
                                lxd0Var.f = str4;
                                if (l4 == null || !z) {
                                    l4 = null;
                                }
                                lxd0Var.e = l4;
                                lxd0Var.c = EmptyList.a;
                                lxd0Var.d = pollMessageVote$OperationType;
                                if (lxd0Var.a == null) {
                                    ny61.g("message timestamp should be presented");
                                } else if (lxd0Var.b == null) {
                                    ny61.g("message chat id should be presented");
                                } else if ((l4 == null && str4 == null) || (str4 != null && l4 != null)) {
                                    nxd0 nxd0Var = new nxd0(lxd0Var);
                                    g0 g0Var3 = ps10Var3.e;
                                    g0Var3.getClass();
                                    tje.e();
                                    b00 b00Var2 = g0Var3.a;
                                    ((Handler) b00Var2.a.get()).post(new lz(9, b00Var2, g0Var3.b, nxd0Var));
                                    break;
                                } else {
                                    ny61.g("defining at least one attribute of forward message you should define 2 others");
                                }
                                break;
                            }
                            break;
                    }
                    return zy11Var;
                }
            }, 0, null, 120);
            r8 = slsVar;
        } else {
            sls slsVar2 = slsVar;
            q(this, e9h0.message_revote, wwg0.msg_ic_revote, slsVar2, 0, null, 120);
            r8 = slsVar2;
        }
        LocalMessageRef localMessageRef = lu10Var.k;
        if (localMessageRef == null) {
            e1kVar = new xi3(8, eu10Var, c);
            aVar = this;
        } else {
            r rVar = mu10Var.d;
            q4g q4gVar = new q4g(this, mu10Var, ps10Var2, localMessageRef, lu10Var.a, 29);
            aVar = this;
            rVar.getClass();
            final uds0 c2 = rVar.c(new d9t(chatRequest, localMessageRef), new k9b(6, q4gVar));
            e1kVar = new e1k() { // from class: ku10
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    eu10.this.close();
                    c2.close();
                    c.close();
                }
            };
        }
        aVar.D = e1kVar;
        if (aVar.c.a().reactionsEnabled) {
            e.H(aVar.getBrickScope(), new jqr(aVar.x.a(aVar.w), new MessageMenuBrick$onBrickAttach$1(aVar, r8), i4));
        }
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        e1k e1kVar = this.D;
        if (e1kVar != null) {
            e1kVar.close();
            this.D = null;
        }
    }

    public final void r(b700 b700Var, boolean z) {
        int i = e9h0.message_change_starred_status;
        View view = this.E;
        TextView textView = (TextView) view.findViewById(i);
        if (b700Var == null) {
            textView.setVisibility(8);
            textView.setOnClickListener(null);
        } else if (z) {
            textView.setText(view.getContext().getString(oyh0.menu_message_make_unstarred));
            q(this, e9h0.message_change_starred_status, wwg0.msg_ic_star_filled, b700Var, 0, null, 120);
        } else {
            textView.setText(view.getContext().getString(oyh0.menu_message_make_starred));
            q(this, e9h0.message_change_starred_status, wwg0.msg_ic_star_outline, b700Var, 0, null, 120);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.text.Spannable] */
    public final Editable s(Editable editable) {
        ?? r2;
        String str = this.B;
        View view = this.E;
        TextView textView = str == null ? (TextView) view.findViewById(e9h0.popup_dialog_message) : (TextView) view.findViewById(e9h0.popup_dialog_info);
        View findViewById = view.findViewById(e9h0.popup_dialog_separator);
        if (TextUtils.isEmpty(editable) && (r2 = this.C) != 0) {
            editable = r2;
        }
        if (TextUtils.isEmpty(editable)) {
            textView.setVisibility(8);
            findViewById.setVisibility(8);
        } else {
            textView.setText(editable, TextView.BufferType.EDITABLE);
            textView.setVisibility(0);
            findViewById.setVisibility(0);
            this.C = editable;
        }
        Editable editableText = textView.getEditableText();
        return editableText == null ? new SpannableStringBuilder("") : editableText;
    }

    public final Drawable u(int i, int i2) {
        View view = this.E;
        Drawable drawable = view.getContext().getDrawable(i);
        if (drawable != null) {
            TypedValue typedValue = new TypedValue();
            view.getContext().getTheme().resolveAttribute(i2, typedValue, true);
            drawable.setTint(typedValue.data);
        }
        return drawable;
    }

    public final void w() {
        Object obj;
        View view;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : this.R.entrySet()) {
            MenuSection menuSection = (MenuSection) entry.getKey();
            List list = (List) entry.getValue();
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((View) it.next()).getVisibility() == 0) {
                            linkedHashSet.add(menuSection);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap = this.S;
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (true) {
            int i = 8;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it2.next();
            MenuSection menuSection2 = (MenuSection) entry2.getKey();
            View view2 = (View) entry2.getValue();
            if (linkedHashSet.contains(menuSection2)) {
                i = 0;
            }
            view2.setVisibility(i);
        }
        if (this.F.getVisibility() == 0) {
            return;
        }
        Iterator it3 = this.Q.iterator();
        while (true) {
            if (it3.hasNext()) {
                obj = it3.next();
                if (linkedHashSet.contains((MenuSection) obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        MenuSection menuSection3 = (MenuSection) obj;
        if (menuSection3 == null || (view = (View) linkedHashMap.get(menuSection3)) == null) {
            return;
        }
        view.setVisibility(8);
    }
}
