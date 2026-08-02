package xsna;

import com.vk.dto.common.DialogBackground;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ConversationCard;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import xsna.oh30;
import xsna.sk30;

/* compiled from: MsgListBuilder.kt */
/* loaded from: classes2.dex */
public final class tk30 {
    public final ik30 a;
    public final cdi b;
    public final b1y c;
    public uk30 d;
    public boolean e;
    public final sk30 f;

    public tk30(com.vk.movika.sdk.android.defaultplayer.layout.a aVar, lk30 lk30Var, tz30 tz30Var, com.vk.im.ui.formatters.a aVar2, b1y b1yVar, v1o v1oVar, VkOnboardingComponent vkOnboardingComponent, int i) {
        lk30 lk30Var2 = (i & 2) != 0 ? new lk30(true) : lk30Var;
        cdi cdiVar = new cdi();
        b1y b1yVar2 = (i & 32) != 0 ? null : b1yVar;
        VkOnboardingComponent vkOnboardingComponent2 = (i & 128) != 0 ? null : vkOnboardingComponent;
        a1w a1wVar = q1w.a;
        (a1wVar == null ? null : a1wVar).r().getClass();
        boolean b = o25.b(o25.a());
        a1w a1wVar2 = q1w.a;
        a1wVar2 = a1wVar2 == null ? null : a1wVar2;
        a1wVar2.getClass();
        q9 q9Var = new q9(a1wVar2, 16);
        EmptyList emptyList = EmptyList.b;
        ImBgSyncState imBgSyncState = ImBgSyncState.DISCONNECTED;
        uy2 uy2Var = DialogTheme.f;
        DialogTheme a = DialogTheme.a.a();
        ProfilesInfo profilesInfo = new ProfilesInfo();
        ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo();
        Peer.Unknown unknown = Peer.Unknown.e;
        h5q0 h5q0Var = new h5q0((Object) null);
        wz30 wz30Var = new wz30(0);
        a1w a1wVar3 = q1w.a;
        pzv r = (a1wVar3 == null ? null : a1wVar3).r();
        zdw zdwVar = i7o0.b;
        uk30 uk30Var = new uk30(emptyList, imBgSyncState, a, profilesInfo, profilesSimpleInfo, 0, unknown, emptyList, 0, 0L, unknown, null, false, h5q0Var, wz30Var, false, false, false, false, false, false, false, false, false, false, true, b, null, false, true, true, q9Var, r, (zdwVar != null ? zdwVar : null).e, (zdwVar == null ? null : zdwVar).g.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, vkOnboardingComponent2, tz30Var, v1oVar, qyd0.a, new DisplayNameFormatter(null, 3, null), aVar2, aVar, new o040(), wk30.c);
        hk30 hk30Var = new hk30(aVar);
        this.a = lk30Var2;
        this.b = cdiVar;
        this.c = b1yVar2;
        this.d = uk30Var;
        this.f = new sk30(hk30Var);
    }

    public static boolean r(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar) {
        return gVar.N0() || gVar.v0() || gVar.M() || gVar.G() || gVar.V() || gVar.A();
    }

    public final void A(boolean z) {
        s(uk30.d(this.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, z, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, 1073741823));
    }

    public final void B(boolean z) {
        s(uk30.d(this.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, z, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 1073741823));
    }

    public final void C(boolean z) {
        s(uk30.d(this.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, z, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65537, 1073741823));
    }

    public final void D(boolean z) {
        s(uk30.d(this.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, z, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, 1073741823));
    }

    public final void E(Integer num) {
        s(uk30.d(this.d, null, null, null, null, null, 0, null, null, num != null ? num.intValue() : 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, 1073741823));
    }

    public final void F(ProfilesInfo profilesInfo) {
        ProfilesInfo profilesInfo2 = this.d.e;
        profilesInfo2.Hb(profilesInfo);
        s(uk30.d(this.d, null, null, null, profilesInfo2, profilesInfo2.Ob(), 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -25, 1073741823));
        sk30.a aVar = this.f.b;
        ProfilesInfo profilesInfo3 = aVar.a;
        profilesInfo3.Hb(profilesInfo2);
        aVar.a = profilesInfo3;
    }

    public final void G(boolean z) {
        s(uk30.d(this.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, z, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2097153, 1073741823));
    }

    public final void H(Integer num) {
        if (num == null || this.d.g < num.intValue()) {
            s(uk30.d(this.d, null, null, null, null, null, num != null ? num.intValue() : 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33, 1073741823));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r6.N0() == true) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> I(List<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list) {
        boolean z;
        if (list.isEmpty()) {
            this.e = false;
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        if (!this.e) {
            return arrayList;
        }
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.a0(list);
        if (gVar != null) {
            z = true;
        }
        z = false;
        a(arrayList, z);
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            arrayList.set(nextIndex, ((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex)).X(this.d));
            listIterator.next();
        }
        this.e = false;
        return arrayList;
    }

    public final void J(List<Integer> list) {
        s(uk30.d(this.d, null, null, null, null, null, 0, null, list, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, 1073741823));
    }

    public final void K(List<e0l0> list) {
        s(uk30.d(this.d, list, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 1073741823));
    }

    public final void a(ArrayList arrayList, boolean z) {
        int i;
        ConversationCard conversationCard = this.d.C;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            } else if (((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) listIterator.previous()).A()) {
                i = listIterator.nextIndex();
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (i == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
        }
        ConversationCard.ConversationBarType conversationBarType = conversationCard != null ? conversationCard.b : null;
        ConversationCard.ConversationBarType conversationBarType2 = ConversationCard.ConversationBarType.GIFT;
        ik30 ik30Var = this.a;
        if (conversationBarType == conversationBarType2) {
            String str = conversationCard.h;
            if (str != null) {
                t6g0 t6g0Var = t6g0.b;
                if (t6g0.d().O().a(str).isEmpty()) {
                    return;
                }
                arrayList.add(ik30Var.c(conversationCard, this.d));
                return;
            }
            return;
        }
        if (this.d.B) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i3, arrayList);
                if (gVar != null) {
                    if (!gVar.G() && !gVar.V()) {
                        gVar = null;
                    }
                    if (gVar != null) {
                    }
                }
                if (i3 == 1) {
                    break;
                } else {
                    i3++;
                }
            }
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.a0(arrayList);
            if (gVar2 != null && gVar2.N0()) {
                i2 = 1;
            }
            if (conversationCard == null || z) {
                return;
            }
            ConversationCard.ConversationBarType conversationBarType3 = conversationCard.b;
            if (conversationBarType3 == ConversationCard.ConversationBarType.CUSTOM) {
                arrayList.add(i2, ik30Var.e(conversationCard, this.d));
            } else if (conversationBarType3 == ConversationCard.ConversationBarType.PROFILE) {
                arrayList.add(i2, ik30Var.d(conversationCard, this.d));
            }
        }
    }

    public final void b(ArrayList arrayList, Msg msg) {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.k0(arrayList);
        boolean z = true;
        if (gVar == null || !gVar.N0()) {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) it.next()).v0()) {
                        break;
                    }
                }
            }
            z = false;
            boolean z2 = this.d.n;
            ik30 ik30Var = this.a;
            if (z2 && !z) {
                bw30.a.getClass();
                arrayList.add(ik30Var.a(bw30.b(msg), this.d));
            }
            arrayList.add(ik30Var.h(Direction.AFTER, msg, this.d));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> c(List<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list, List<? extends Msg> list2, boolean z, boolean z2, int i) {
        gkx0 gkx0Var;
        if (list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        boolean z3 = false;
        if (arrayList.isEmpty()) {
            arrayList.addAll(d(-1, false, list2, false));
            return arrayList;
        }
        do {
            if (!r((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.i0(arrayList))) {
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.i0(arrayList);
                Msg msg = (Msg) j5g.Y(list2);
                if (!gVar.C0()) {
                    break;
                }
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E0 = gVar.E0();
                if (E0 == null || (gkx0Var = E0.k) == null) {
                    gkx0Var = gkx0.c;
                }
                if (gkx0Var.compareTo(msg.p) < 0) {
                    break;
                }
            }
            arrayList.remove(e43.h(arrayList));
        } while (!arrayList.isEmpty());
        if (z2 && arrayList.isEmpty()) {
            arrayList.add(this.a.h(Direction.BEFORE, (Msg) j5g.Y(list2), this.d));
        }
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.k0(arrayList);
        long v = gVar2 != null ? gVar2.v() : -1L;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) it.next()).v0()) {
                    z3 = true;
                    break;
                }
            }
        }
        f(arrayList, list2, i, z3, v);
        if (z) {
            b(arrayList, (Msg) j5g.i0(list2));
        }
        a(arrayList, z2);
        g(i, arrayList);
        return arrayList;
    }

    public final ArrayList d(int i, boolean z, List list, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            a(arrayList, z);
            return arrayList;
        }
        if (z) {
            arrayList.add(this.a.h(Direction.BEFORE, (Msg) j5g.Y(list), this.d));
        }
        f(arrayList, list, i, false, -1L);
        if (z2) {
            b(arrayList, (Msg) j5g.i0(list));
        }
        a(arrayList, z);
        g(i, arrayList);
        return arrayList;
    }

    public final ArrayList e(gj30 gj30Var, int i) {
        return d(i, gj30Var.c, gj30Var.k(), gj30Var.e);
    }

    public final boolean f(ArrayList arrayList, List list, int i, boolean z, long j) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Msg msg = (Msg) it.next();
            b1y b1yVar = this.c;
            if (b1yVar != null) {
                List list2 = (List) b1yVar.c;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (((Boolean) ((izs) it2.next()).invoke(msg)).booleanValue()) {
                            break;
                        }
                    }
                }
            }
            bw30.a.getClass();
            long b = bw30.b(msg);
            this.b.getClass();
            ik30 ik30Var = this.a;
            if (i >= 0 && msg.Mb() && msg.i && msg.d > i && !z) {
                arrayList.add(ik30Var.a(b, this.d));
                z = true;
            }
            if (b != j) {
                arrayList.add(ik30Var.f(b, this.d));
            }
            arrayList.addAll(ik30Var.g(msg, this.d));
            j = b;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x02ed, code lost:
    
        if ((r14 != null ? r14.n0() : false) != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x02b7, code lost:
    
        if (r13.H0() == true) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x02c7, code lost:
    
        if (r13.j0() == r14) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x05af, code lost:
    
        if ((r6 != null ? r6.N0() : false) != false) goto L352;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x041c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x032a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, ArrayList arrayList) {
        oh30 b;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E0;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar3;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar4;
        char c;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E02;
        c.g gVar5;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E03;
        c.g gVar6;
        c.C1166c c1166c;
        nsr0 b2;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar7;
        boolean z9;
        boolean z10;
        ArrayList arrayList2 = new ArrayList();
        boolean z11 = true;
        g5g.D(arrayList, true, new t3v(3));
        ListIterator listIterator = arrayList.listIterator();
        int i2 = 0;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int i3 = nextIndex - 1;
            int i4 = nextIndex + 1;
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar8 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex);
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar9 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i3, arrayList);
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar10 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i4, arrayList);
            sk30 sk30Var = this.f;
            sk30Var.getClass();
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E04 = gVar8.E0();
            if (E04 != null) {
                boolean z12 = (gVar8.Q0(gVar9) || gVar8.Q0(gVar10)) ? false : z11;
                boolean z13 = (z12 || (!gVar8.Q0(gVar9) && (!gVar8.Q0(gVar10) || gVar10 == null || gVar10.H0()))) ? z11 : false;
                c.C1166c c1166c2 = E04.D;
                if (c1166c2 != null) {
                    boolean z14 = c1166c2.i;
                    boolean z15 = c1166c2.p;
                    boolean z16 = c1166c2.k;
                    boolean z17 = c1166c2.u;
                    if (z14) {
                        oh30 oh30Var = oh30.l;
                        b = oh30.a.b(z17);
                    } else if (z16 && (z15 || c1166c2.q)) {
                        oh30 oh30Var2 = oh30.l;
                        b = z17 ? oh30.z : oh30.A;
                    } else if (c1166c2.o && z13) {
                        oh30 oh30Var3 = oh30.l;
                        b = z17 ? oh30.l : oh30.m;
                    } else if (gVar8.F0() && ((z13 || (gVar10 != null && gVar10.y0())) && !z16)) {
                        oh30 oh30Var4 = oh30.l;
                        b = z17 ? oh30.l : oh30.m;
                    } else if ((z15 && c1166c2.m) || gVar8.N() || gVar8.L() || !(!gVar8.U() || !z13 || c1166c2.s || gVar8.e0() || gVar8.L0() || gVar8.D())) {
                        oh30 oh30Var5 = oh30.l;
                        b = oh30.a.a(z17);
                    } else if (gVar8.g0()) {
                        if (c1166c2.l || z16) {
                            oh30 oh30Var6 = oh30.l;
                            b = z17 ? oh30.s : oh30.t;
                        } else {
                            oh30 oh30Var7 = oh30.l;
                            b = oh30.a.a(z17);
                        }
                    } else if (gVar8.e0() || gVar8.L0()) {
                        oh30 oh30Var8 = oh30.l;
                        b = z17 ? oh30.x : oh30.y;
                    } else if (gVar8.x0() || gVar8.P0()) {
                        oh30 oh30Var9 = oh30.l;
                        b = z17 ? oh30.I : oh30.J;
                    } else if (gVar8.J() && gVar8.t() == 0) {
                        oh30 oh30Var10 = oh30.l;
                        b = z17 ? oh30.G : oh30.H;
                    } else if (gVar8.I()) {
                        oh30 oh30Var11 = oh30.l;
                        b = z17 ? oh30.v : oh30.w;
                    } else if (gVar8.K0()) {
                        oh30 oh30Var12 = oh30.l;
                        b = oh30.a.a(z17);
                    } else if (gVar8.H0()) {
                        oh30 M0 = gVar9 != null ? gVar9.M0() : null;
                        if (c1166c2.r) {
                            oh30 oh30Var13 = oh30.l;
                            b = oh30.a.a(z17);
                        } else if (gVar9 != null && gVar9.g0()) {
                            oh30 oh30Var14 = oh30.l;
                            b = oh30.a.a(z17);
                        } else if (M0 == null) {
                            oh30 oh30Var15 = oh30.l;
                            b = oh30.a.b(z17);
                        } else {
                            b = M0;
                        }
                    } else {
                        oh30 oh30Var16 = oh30.l;
                        b = oh30.a.b(z17);
                    }
                } else {
                    c.b bVar = E04.F;
                    if (bVar != null) {
                        if (bVar.b && z12) {
                            b = oh30.n;
                        } else if (gVar8.P0()) {
                            b = oh30.D;
                        } else if (gVar8.F0() && (z13 || (gVar10 != null && gVar10.y0()))) {
                            b = oh30.l;
                        } else if (gVar8.x0() && z12) {
                            b = oh30.C;
                        } else if (gVar8.x0() && !gVar8.c0()) {
                            b = oh30.D;
                        } else if (bVar.a) {
                            b = oh30.B;
                        } else if (bVar.c || gVar8.N() || (gVar8.U() && z12)) {
                            b = oh30.u;
                        } else if (gVar8.H0()) {
                            b = gVar9 != null ? gVar9.M0() : null;
                            if (b == null) {
                                b = oh30.F;
                            }
                        } else {
                            b = oh30.B;
                        }
                    } else if (E04.G != null) {
                        oh30 oh30Var17 = oh30.l;
                        b = oh30.a.b(E04.o);
                    }
                }
                arrayList.set(nextIndex, ((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex)).n(b));
                sk30.a aVar = sk30Var.b;
                hk30 hk30Var = sk30Var.a;
                gVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex);
                z = gVar.Q0((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i3, arrayList)) && !gVar.Q0((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i4, arrayList));
                if (!z) {
                    if (!gVar.Q0((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i3, arrayList)) && gVar.Q0((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i4, arrayList))) {
                        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar11 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i4, arrayList);
                        boolean z18 = gVar11 != null ? true : true;
                        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar12 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i4, arrayList);
                        if (gVar12 != null) {
                        }
                    }
                    z2 = false;
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar13 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i3, arrayList);
                    if (!gVar.F0() || gVar.y0()) {
                        if (!gVar.A0()) {
                        }
                        z3 = true;
                        int i5 = hk30Var.i((gVar.F0() || z3) ? false : true);
                        int i6 = i2;
                        z4 = z;
                        arrayList.set(nextIndex, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g.o0((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex), null, Integer.valueOf(i5), 3));
                        gVar2 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex);
                        boolean u0 = gVar2.u0();
                        if (!gVar2.C() && (u0 || (z2 && !gVar2.S0()))) {
                            int c2 = hk30Var.c(arrayList, nextIndex, aVar.a, i);
                            arrayList.set(nextIndex, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g.o0((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex), Boolean.valueOf(((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex)).H0() || c2 >= i5), null, 6));
                            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar14 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex);
                            if (gVar14.z()) {
                                arrayList.set(nextIndex, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g.o0(gVar14, null, Integer.valueOf(c2), 3));
                            } else if (gVar14.t0()) {
                                arrayList.set(nextIndex, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g.o0(gVar14, null, null, 5));
                            }
                        } else if ((z4 || ((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex)).S0()) && (!z2 || !((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex)).i0())) {
                            int c3 = hk30Var.c(arrayList, nextIndex, aVar.a, i);
                            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar15 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex);
                            E0 = gVar15.E0();
                            if (E0 != null || (c1166c = E0.D) == null || !c1166c.L || c1166c.k) {
                                gVar3 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex);
                                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar16 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i4, arrayList);
                                z5 = (gVar3.n0() || (E03 = gVar3.E0()) == null || (gVar6 = E03.E) == null || !gVar6.b) ? false : true;
                                if (gVar3.S() || gVar16 == null || !gVar16.n0() || (E02 = gVar16.E0()) == null || (gVar5 = E02.E) == null) {
                                    z6 = true;
                                } else {
                                    z6 = true;
                                    if (gVar5.b) {
                                        z7 = true;
                                        if ((!z5 || z7) ? z6 : false) {
                                            arrayList.set(nextIndex, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g.o0(gVar3, null, Integer.valueOf(c3), 3));
                                        } else {
                                            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar17 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex);
                                            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar18 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i3, arrayList);
                                            if ((gVar18 != null ? gVar18.E0() : null) != null) {
                                                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar19 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i3, arrayList);
                                                if (epx.f(gVar19 != null ? gVar19.E0() : null, gVar17.E0())) {
                                                    z8 = false;
                                                    if (z8) {
                                                        i2 = i6;
                                                    } else {
                                                        arrayList2.clear();
                                                        i2 = 0;
                                                    }
                                                    arrayList2.add(Integer.valueOf(nextIndex));
                                                    if (!((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex)).N()) {
                                                        i2 = Math.max(c3, i2);
                                                    }
                                                    gVar4 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex);
                                                    if (gVar4.y0() && !gVar4.A0()) {
                                                        i2 = c3;
                                                    }
                                                    if (!((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex)).Q0((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i4, arrayList))) {
                                                        int size = arrayList2.size();
                                                        for (int i7 = 0; i7 < size; i7++) {
                                                            int intValue = ((Number) arrayList2.get(i7)).intValue();
                                                            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar20 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(intValue);
                                                            if (gVar20.N()) {
                                                                arrayList.set(intValue, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g.o0(gVar20, null, Integer.valueOf(i5), 3));
                                                            } else if (gVar20.C() || gVar20.u0()) {
                                                                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar21 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(intValue);
                                                                c = 6;
                                                                arrayList.set(intValue, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g.o0(gVar21, Boolean.valueOf(i2 >= i5), null, 6));
                                                                if (gVar21.t0()) {
                                                                    arrayList.set(intValue, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g.o0(gVar21, null, null, 5));
                                                                }
                                                            } else {
                                                                arrayList.set(intValue, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g.o0(gVar20, null, Integer.valueOf(i2), 3));
                                                            }
                                                            c = 6;
                                                        }
                                                    }
                                                    b2 = this.a.b((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex), (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i3, arrayList), this.d);
                                                    gVar7 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i3, arrayList);
                                                    if (gVar7 != null) {
                                                        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar22 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex);
                                                        if ((gVar7 instanceof crr0) && (gVar22 instanceof crr0)) {
                                                            crr0 crr0Var = (crr0) gVar7;
                                                            rmk0 rmk0Var = new rmk0(2);
                                                            rmk0Var.b(crr0Var.b.toArray(new Integer[0]));
                                                            crr0 crr0Var2 = (crr0) gVar22;
                                                            rmk0Var.b(crr0Var2.b.toArray(new Integer[0]));
                                                            ArrayList<Object> arrayList3 = rmk0Var.a;
                                                            crr0 a = crr0.a(crr0Var, e43.l(arrayList3.toArray(new Integer[arrayList3.size()])), null, 510);
                                                            a.i = crr0Var2.i;
                                                            s3q0 s3q0Var = s3q0.a;
                                                            arrayList.set(i3, a);
                                                            z9 = true;
                                                            if (!z9) {
                                                                if (((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex)).M()) {
                                                                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar23 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i3, arrayList);
                                                                }
                                                                z10 = false;
                                                                if (b2 == null) {
                                                                    listIterator.add(b2);
                                                                    listIterator.previous();
                                                                } else if (z10) {
                                                                    listIterator.next();
                                                                    listIterator.remove();
                                                                } else {
                                                                    listIterator.next();
                                                                }
                                                                z11 = true;
                                                            }
                                                            z10 = true;
                                                            if (b2 == null) {
                                                            }
                                                            z11 = true;
                                                        }
                                                    }
                                                    z9 = false;
                                                    if (!z9) {
                                                    }
                                                    z10 = true;
                                                    if (b2 == null) {
                                                    }
                                                    z11 = true;
                                                }
                                            }
                                            z8 = z6;
                                            if (z8) {
                                            }
                                            arrayList2.add(Integer.valueOf(nextIndex));
                                            if (!((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex)).N()) {
                                            }
                                            gVar4 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex);
                                            if (gVar4.y0()) {
                                                i2 = c3;
                                            }
                                            if (!((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex)).Q0((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i4, arrayList))) {
                                            }
                                            b2 = this.a.b((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex), (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i3, arrayList), this.d);
                                            gVar7 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i3, arrayList);
                                            if (gVar7 != null) {
                                            }
                                            z9 = false;
                                            if (!z9) {
                                            }
                                            z10 = true;
                                            if (b2 == null) {
                                            }
                                            z11 = true;
                                        }
                                    }
                                }
                                z7 = false;
                                if ((!z5 || z7) ? z6 : false) {
                                }
                            } else {
                                arrayList.set(nextIndex, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g.o0(gVar15, null, Integer.valueOf(c3), 3));
                            }
                            i2 = c3;
                            b2 = this.a.b((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex), (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i3, arrayList), this.d);
                            gVar7 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i3, arrayList);
                            if (gVar7 != null) {
                            }
                            z9 = false;
                            if (!z9) {
                            }
                            z10 = true;
                            if (b2 == null) {
                            }
                            z11 = true;
                        }
                        i2 = i6;
                        b2 = this.a.b((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex), (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i3, arrayList), this.d);
                        gVar7 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i3, arrayList);
                        if (gVar7 != null) {
                        }
                        z9 = false;
                        if (!z9) {
                        }
                        z10 = true;
                        if (b2 == null) {
                        }
                        z11 = true;
                    }
                    z3 = false;
                    int i52 = hk30Var.i((gVar.F0() || z3) ? false : true);
                    int i62 = i2;
                    z4 = z;
                    arrayList.set(nextIndex, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g.o0((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex), null, Integer.valueOf(i52), 3));
                    gVar2 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex);
                    boolean u02 = gVar2.u0();
                    if (!gVar2.C()) {
                    }
                    if (z4) {
                    }
                    int c32 = hk30Var.c(arrayList, nextIndex, aVar.a, i);
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar152 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex);
                    E0 = gVar152.E0();
                    if (E0 != null) {
                    }
                    gVar3 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex);
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar162 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i4, arrayList);
                    if (gVar3.n0()) {
                    }
                    if (gVar3.S()) {
                    }
                    z6 = true;
                    z7 = false;
                    if ((!z5 || z7) ? z6 : false) {
                    }
                }
                z2 = true;
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar132 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i3, arrayList);
                if (!gVar.F0()) {
                }
                if (!gVar.A0()) {
                }
                z3 = true;
                int i522 = hk30Var.i((gVar.F0() || z3) ? false : true);
                int i622 = i2;
                z4 = z;
                arrayList.set(nextIndex, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g.o0((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex), null, Integer.valueOf(i522), 3));
                gVar2 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex);
                boolean u022 = gVar2.u0();
                if (!gVar2.C()) {
                }
                if (z4) {
                }
                int c322 = hk30Var.c(arrayList, nextIndex, aVar.a, i);
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar1522 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex);
                E0 = gVar1522.E0();
                if (E0 != null) {
                }
                gVar3 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex);
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar1622 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i4, arrayList);
                if (gVar3.n0()) {
                }
                if (gVar3.S()) {
                }
                z6 = true;
                z7 = false;
                if ((!z5 || z7) ? z6 : false) {
                }
            }
            b = null;
            arrayList.set(nextIndex, ((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex)).n(b));
            sk30.a aVar2 = sk30Var.b;
            hk30 hk30Var2 = sk30Var.a;
            gVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex);
            if (gVar.Q0((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i3, arrayList))) {
            }
            if (!z) {
            }
            z2 = true;
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar1322 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i3, arrayList);
            if (!gVar.F0()) {
            }
            if (!gVar.A0()) {
            }
            z3 = true;
            int i5222 = hk30Var2.i((gVar.F0() || z3) ? false : true);
            int i6222 = i2;
            z4 = z;
            arrayList.set(nextIndex, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g.o0((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex), null, Integer.valueOf(i5222), 3));
            gVar2 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex);
            boolean u0222 = gVar2.u0();
            if (!gVar2.C()) {
            }
            if (z4) {
            }
            int c3222 = hk30Var2.c(arrayList, nextIndex, aVar2.a, i);
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar15222 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex);
            E0 = gVar15222.E0();
            if (E0 != null) {
            }
            gVar3 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex);
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar16222 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i4, arrayList);
            if (gVar3.n0()) {
            }
            if (gVar3.S()) {
            }
            z6 = true;
            z7 = false;
            if ((!z5 || z7) ? z6 : false) {
            }
        }
        ListIterator listIterator2 = arrayList.listIterator();
        while (listIterator2.hasNext()) {
            int nextIndex2 = listIterator2.nextIndex();
            arrayList.set(nextIndex2, ((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(nextIndex2)).B0((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(nextIndex2 - 1, arrayList), (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(nextIndex2 + 1, arrayList), this.d));
            listIterator2.next();
        }
        this.e = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> h(List<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list, List<? extends Msg> list2, boolean z, boolean z2, int i) {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar;
        Long l;
        long a;
        gkx0 gkx0Var;
        if (list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.isEmpty()) {
            arrayList.addAll(d(-1, false, list2, false));
            return arrayList;
        }
        do {
            if (!r((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.Y(arrayList))) {
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.Y(arrayList);
                Msg msg = (Msg) j5g.i0(list2);
                if (!gVar2.C0()) {
                    break;
                }
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E0 = gVar2.E0();
                if (E0 == null || (gkx0Var = E0.k) == null) {
                    gkx0Var = gkx0.c;
                }
                if (gkx0Var.compareTo(msg.p) > 0) {
                    break;
                }
            }
            arrayList.remove(0);
        } while (!arrayList.isEmpty());
        ArrayList arrayList2 = new ArrayList();
        ik30 ik30Var = this.a;
        if (z2) {
            arrayList2.add(ik30Var.h(Direction.BEFORE, (Msg) j5g.Y(list2), this.d));
        }
        boolean f = f(arrayList2, list2, i, false, -1L);
        if (!arrayList.isEmpty() && ((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.Y(arrayList)).C0()) {
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar3 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.Y(arrayList);
            Msg msg2 = (Msg) j5g.i0(list2);
            bw30.a.getClass();
            long b = bw30.b(msg2);
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E02 = gVar3.E0();
            if (E02 != null) {
                c.b bVar = E02.F;
                if (bVar == null || !bVar.g) {
                    a = bw30.a(E02.h);
                } else {
                    a = bw30.a(bVar != null ? bVar.h : 0L);
                }
                l = Long.valueOf(a);
            } else {
                l = null;
            }
            if (E02 != null) {
                this.b.getClass();
                if (i >= 0 && E02.n && E02.o && E02.c > i && !f) {
                    arrayList2.add(ik30Var.a(b, this.d));
                }
            }
            if ((l == null || b != l.longValue()) && l != null) {
                arrayList2.add(ik30Var.f(l.longValue(), this.d));
            }
        }
        arrayList.addAll(0, arrayList2);
        a(arrayList, z2);
        g(i, arrayList);
        if (z && (gVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.k0(arrayList)) != null && !gVar.N0()) {
            b(arrayList, (Msg) j5g.i0(list2));
        }
        return arrayList;
    }

    public final void i(g34 g34Var) {
        s(uk30.d(this.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, g34Var, null, null, null, null, null, null, null, null, null, null, null, -1, 1073741311));
    }

    public final void j(kq4 kq4Var) {
        s(uk30.d(this.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, kq4Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1073741807));
    }

    public final void k(h1l h1lVar) {
        s(uk30.d(this.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, h1lVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1073741791));
    }

    public final void l(g5v g5vVar) {
        s(uk30.d(this.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, g5vVar, null, null, null, null, null, null, null, -1, 1073733631));
    }

    public final void m(b9w b9wVar) {
        s(uk30.d(this.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, b9wVar, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1073741567));
    }

    public final void n(w530 w530Var) {
        s(uk30.d(this.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, w530Var, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1073741695));
    }

    public final void o(rxd0 rxd0Var) {
        s(uk30.d(this.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, rxd0Var, null, null, null, null, null, null, null, null, -1, 1073737727));
    }

    public final void p(d2l0 d2l0Var) {
        s(uk30.d(this.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, d2l0Var, null, null, null, null, null, null, null, null, null, null, -1, 1073740799));
    }

    public final void q(nmx0 nmx0Var) {
        s(uk30.d(this.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, nmx0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1073741759));
    }

    public final void s(uk30 uk30Var) {
        if (epx.f(this.d, uk30Var)) {
            return;
        }
        this.d = uk30Var;
        this.e = true;
    }

    public final void t(boolean z) {
        s(uk30.d(this.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, z, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -131073, 1073741823));
    }

    public final void u(boolean z) {
        s(uk30.d(this.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, z, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, 1073741823));
    }

    public final void v(Peer peer) {
        s(uk30.d(this.d, null, null, null, null, null, 0, null, null, 0, 0L, peer, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 1073741823));
    }

    public final void w(Peer peer) {
        uk30 uk30Var = this.d;
        s(uk30.d(uk30Var, null, null, null, null, null, 0, peer == null ? Peer.Unknown.e : peer, null, 0, 0L, null, null, false, null, wz30.a(uk30Var.p, false, Long.valueOf(peer != null ? peer.b : Peer.Unknown.e.b), 253), false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16449, 1073741823));
    }

    public final void x(DialogTheme dialogTheme) {
        DialogBackground dialogBackground = dialogTheme.c;
        boolean z = !drm0.N(dhr0.M() ? dialogBackground.d : dialogBackground.c);
        uk30 uk30Var = this.d;
        s(uk30.d(uk30Var, null, null, dialogTheme, null, null, 0, null, null, 0, 0L, null, null, false, null, wz30.a(uk30Var.p, z, null, 254), z, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -49157, 1073741823));
    }

    public final void y(int i) {
        s(uk30.d(this.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, i > 0, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4097, 1073741823));
    }

    public final void z(boolean z) {
        s(uk30.d(this.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, z, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1048577, 1073741823));
    }
}
