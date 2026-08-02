package xsna;

import android.content.Context;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.models.CallState;
import com.vk.im.engine.models.ConversationCard;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.attaches.AttachQuestion;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgCallAsrFailed;
import com.vk.im.engine.models.messages.MsgChatAvatarRemove;
import com.vk.im.engine.models.messages.MsgChatAvatarUpdate;
import com.vk.im.engine.models.messages.MsgChatCreate;
import com.vk.im.engine.models.messages.MsgChatDonKick;
import com.vk.im.engine.models.messages.MsgChatMemberInvite;
import com.vk.im.engine.models.messages.MsgChatMemberInviteByCall;
import com.vk.im.engine.models.messages.MsgChatMemberInviteByCallLink;
import com.vk.im.engine.models.messages.MsgChatMemberInviteByMr;
import com.vk.im.engine.models.messages.MsgChatMemberKick;
import com.vk.im.engine.models.messages.MsgChatMemberKickCallBlock;
import com.vk.im.engine.models.messages.MsgChatOwnerUpdate;
import com.vk.im.engine.models.messages.MsgChatStyleUpdate;
import com.vk.im.engine.models.messages.MsgChatTitleUpdate;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgGroupCallStarted;
import com.vk.im.engine.models.messages.MsgIncomingCallPrivacy;
import com.vk.im.engine.models.messages.MsgJoinByLink;
import com.vk.im.engine.models.messages.MsgMrAccepted;
import com.vk.im.engine.models.messages.MsgPin;
import com.vk.im.engine.models.messages.MsgRejectMessageRequest;
import com.vk.im.engine.models.messages.MsgScreenshot;
import com.vk.im.engine.models.messages.MsgSentMessageRequest;
import com.vk.im.engine.models.messages.MsgServiceCustom;
import com.vk.im.engine.models.messages.MsgUnPin;
import com.vk.im.engine.models.messages.MsgUnsupported;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.BannerButton;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.VhMsgServiceChatOwnerUpdateItem;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.qh30;

/* compiled from: MsgItemContentBuilderDefault.kt */
/* loaded from: classes2.dex */
public final class lk30 implements ik30 {
    public final cau0 a;
    public final com.vk.im.ui.components.viewcontrollers.msg_list.entry.a b;
    public final o040 c;
    public final Peer d;
    public final boolean e;
    public final ne7 f;

    public lk30(boolean z) {
        a1w a1wVar = q1w.a;
        cau0 cau0Var = (a1wVar == null ? null : a1wVar).a.h;
        com.vk.im.ui.components.viewcontrollers.msg_list.entry.a aVar = new com.vk.im.ui.components.viewcontrollers.msg_list.entry.a(cau0Var);
        o040 o040Var = new o040();
        a1w a1wVar2 = q1w.a;
        Peer q = (a1wVar2 != null ? a1wVar2 : null).q();
        this.a = cau0Var;
        this.b = aVar;
        this.c = o040Var;
        this.d = q;
        this.e = z;
        this.f = new ne7();
    }

    public static nsr0 j(Msg msg, uk30 uk30Var) {
        return o140.c(AdapterEntryType.TYPE_SERVICE_UNSUPPORTED, msg, null, 0, null, null, uk30Var, 60);
    }

    public static Pair k(List list, boolean z) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            Attach attach = (Attach) obj;
            if (list.size() == 1) {
                if (attach instanceof AttachVideo) {
                    AttachVideo attachVideo = (AttachVideo) attach;
                    if (!attachVideo.isExternal() && !attachVideo.k()) {
                        z2 = true;
                    }
                }
                z2 = false;
            } else {
                z2 = attach instanceof AttachVideo;
            }
            if (z2 || (attach instanceof AttachImage) || ((attach instanceof AttachDoc) && ((AttachDoc) attach).i()) || (((attach instanceof AttachStory) && z) || (attach instanceof AttachQuestion))) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return new Pair(arrayList, arrayList2);
    }

    public static void l(ArrayList arrayList, MsgFromUser msgFromUser, uk30 uk30Var) {
        if (!uk30Var.w || msgFromUser.S.isEmpty()) {
            return;
        }
        arrayList.add(o140.c(AdapterEntryType.TYPE_REACTIONS, msgFromUser, null, 0, null, null, uk30Var, 60));
    }

    @Override // xsna.ik30
    public final rvr0 a(long j, uk30 uk30Var) {
        return new rvr0(null, uk30Var.q, AdapterEntryType.TYPE_UNREAD_FROM, j, uk30Var.o.a);
    }

    @Override // xsna.ik30
    public final nsr0 b(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2, uk30 uk30Var) {
        Peer peer;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E0;
        boolean S = gVar.S();
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E02 = gVar.E0();
        c.C1166c c1166c = E02 != null ? E02.D : null;
        if (uk30Var.u && !S && c1166c != null) {
            if (c1166c.u) {
                oh30 oh30Var = oh30.q;
                oh30 oh30Var2 = oh30.l;
                if (!epx.f(gVar.M0(), oh30Var) && !epx.f(gVar.M0(), oh30Var2)) {
                    c.C1166c c1166c2 = (gVar2 == null || (E0 = gVar2.E0()) == null) ? null : E0.D;
                    boolean f = epx.f(c1166c2 != null ? c1166c2.a : null, c1166c.a);
                    boolean z = c1166c2 == null || !c1166c2.h;
                    if (c1166c2 == null || !f || !z || Math.abs(c1166c.G - c1166c2.G) >= xh30.a) {
                        List<CallState> list = o140.a;
                        nsr0 nsr0Var = gVar instanceof nsr0 ? (nsr0) gVar : null;
                        if (nsr0Var != null) {
                            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f fVar = nsr0Var.b;
                            ProfilesInfo profilesInfo = uk30Var.e;
                            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = fVar.k;
                            qtd0 Bb = profilesInfo.Bb(cVar != null ? cVar.j : null);
                            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f fVar2 = nsr0Var.b;
                            AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_USER_NAME;
                            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f a = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f.a(fVar2, adapterEntryType, null, false, false, null, null, null, null, false, 0, false, null, null, false, false, false, false, false, false, null, false, false, false, null, null, false, -6, 2047);
                            a.S = fVar.S;
                            a.R = fVar.R;
                            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar2 = fVar.k;
                            if (cVar2 == null || (peer = cVar2.j) == null) {
                                peer = Peer.Unknown.e;
                            }
                            return new nsr0(a, new hu30(peer, Bb, Bb != null && o25.b(o25.a()) && Bb.t1() && Bb.q9().b, adapterEntryType));
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // xsna.ik30
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.h c(ConversationCard conversationCard, uk30 uk30Var) {
        BannerButton bannerButton;
        ConversationCard.ConversationButton conversationButton;
        vk30 vk30Var = uk30Var.a;
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_GIFT_BANNER;
        String str = conversationCard.h;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        List<ConversationCard.ConversationButton> list = conversationCard.g;
        if (list == null || (conversationButton = (ConversationCard.ConversationButton) j5g.a0(list)) == null) {
            bannerButton = null;
        } else {
            ConversationCard.ConversationButton.StyleType styleType = conversationButton.e;
            ConversationCard.ConversationButton.LayoutType layoutType = conversationButton.b;
            bannerButton = new BannerButton(conversationButton.c, BannerButton.b.b(conversationButton), BannerButton.b.a(layoutType, styleType), BannerButton.b.c(layoutType, styleType), vk30Var.c(0L, false, true), vk30Var.c(0L, false, false));
        }
        return new com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.h(adapterEntryType, str, bannerButton);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v10 java.lang.String, still in use, count: 2, list:
          (r6v10 java.lang.String) from 0x002c: IF  (r6v10 java.lang.String) == (null java.lang.String)  -> B:11:0x002e A[HIDDEN] (LINE:45)
          (r6v10 java.lang.String) from 0x003b: PHI (r6v5 java.lang.String) = (r6v3 java.lang.String), (r6v7 java.lang.String), (r6v10 java.lang.String) binds: [B:34:0x0038, B:11:0x002e, B:10:0x002c] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:53)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:40)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    @Override // xsna.ik30
    public final xsna.wur0 d(com.vk.im.engine.models.ConversationCard r20, xsna.uk30 r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            xsna.vk30 r2 = r1.a
            com.vk.im.engine.models.ProfilesInfo r3 = r1.e
            com.vk.dto.common.Peer r4 = r1.h
            xsna.qtd0 r3 = r3.Bb(r4)
            com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType r5 = com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType.TYPE_PROFILE_BANNER
            r4 = 0
            if (r3 == 0) goto L18
            java.lang.String r6 = r3.h8()
            goto L19
        L18:
            r6 = r4
        L19:
            java.lang.String r7 = ""
            if (r6 == 0) goto L30
            boolean r6 = xsna.drm0.N(r6)
            if (r6 == 0) goto L24
            goto L30
        L24:
            if (r3 == 0) goto L2b
            java.lang.String r6 = r3.h8()
            goto L2c
        L2b:
            r6 = r4
        L2c:
            if (r6 != 0) goto L3b
        L2e:
            r6 = r7
            goto L3b
        L30:
            if (r3 == 0) goto L37
            java.lang.String r6 = r3.B3()
            goto L38
        L37:
            r6 = r4
        L38:
            if (r6 != 0) goto L3b
            goto L2e
        L3b:
            com.vk.dto.common.Peer r8 = r1.h
            if (r3 == 0) goto L44
            com.vk.dto.common.im.ImageList r3 = r3.C8()
            goto L45
        L44:
            r3 = r4
        L45:
            java.lang.String r9 = r0.e
            if (r9 != 0) goto L4a
            r9 = r7
        L4a:
            xsna.n6p r11 = r1.W
            java.util.List<com.vk.im.engine.models.ConversationCard$ConversationButton> r0 = r0.g
            if (r0 == 0) goto L98
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r1 = 10
            int r1 = xsna.c5g.u(r0, r1)
            r4.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L61:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L98
            java.lang.Object r1 = r0.next()
            com.vk.im.engine.models.ConversationCard$ConversationButton r1 = (com.vk.im.engine.models.ConversationCard.ConversationButton) r1
            java.lang.String r13 = r1.c
            com.vk.im.engine.models.ConversationCard$ConversationButton$StyleType r7 = r1.e
            com.vk.im.engine.models.ConversationCard$ConversationButton$LayoutType r10 = r1.b
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.BannerButton$a r14 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.BannerButton.b.b(r1)
            int r15 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.BannerButton.b.a(r10, r7)
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.BannerButton$TextColorStyle r16 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.BannerButton.b.c(r10, r7)
            r20 = r0
            r0 = 0
            r7 = 0
            com.vk.im.engine.models.dialogs.BubbleColors r18 = r2.c(r0, r7, r7)
            r10 = 1
            com.vk.im.engine.models.dialogs.BubbleColors r17 = r2.c(r0, r7, r10)
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.BannerButton r12 = new com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.BannerButton
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r4.add(r12)
            r0 = r20
            goto L61
        L98:
            if (r4 != 0) goto L9c
            kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.b
        L9c:
            r12 = r4
            xsna.wur0 r4 = new xsna.wur0
            r10 = 0
            r7 = r6
            r6 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.lk30.d(com.vk.im.engine.models.ConversationCard, xsna.uk30):xsna.wur0");
    }

    @Override // xsna.ik30
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.e e(ConversationCard conversationCard, uk30 uk30Var) {
        BannerButton bannerButton;
        ConversationCard.ConversationButton conversationButton;
        vk30 vk30Var = uk30Var.a;
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_CUSTOM_BANNER;
        String str = conversationCard.c;
        if (str == null) {
            str = "";
        }
        String str2 = conversationCard.f;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = conversationCard.d;
        if (str3 == null) {
            str3 = "";
        }
        List<ConversationCard.ConversationButton> list = conversationCard.g;
        if (list == null || (conversationButton = (ConversationCard.ConversationButton) j5g.a0(list)) == null) {
            bannerButton = null;
        } else {
            ConversationCard.ConversationButton.StyleType styleType = conversationButton.e;
            ConversationCard.ConversationButton.LayoutType layoutType = conversationButton.b;
            bannerButton = new BannerButton(conversationButton.c, BannerButton.b.b(conversationButton), BannerButton.b.a(layoutType, styleType), BannerButton.b.c(layoutType, styleType), vk30Var.c(0L, false, true), vk30Var.c(0L, false, false));
        }
        return new com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.e(adapterEntryType, str, str2, str3, bannerButton);
    }

    @Override // xsna.ik30
    public final xqr0 f(long j, uk30 uk30Var) {
        return new xqr0(uk30Var.q, AdapterEntryType.TYPE_DATE, j, null, uk30Var.L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0887  */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    @Override // xsna.ik30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList g(Msg msg, uk30 uk30Var) {
        boolean z;
        MsgFromUser msgFromUser;
        boolean z2;
        zwk ssr0Var;
        VhMsgServiceChatOwnerUpdateItem.Type type;
        boolean z3;
        ?? r5;
        int i;
        boolean z4;
        boolean z5;
        uk30 uk30Var2;
        lk30 lk30Var = this;
        boolean z6 = uk30Var.q;
        ProfilesInfo profilesInfo = uk30Var.e;
        Peer peer = uk30Var.l;
        ArrayList arrayList = new ArrayList();
        boolean z7 = msg instanceof MsgFromUser;
        com.vk.im.ui.components.viewcontrollers.msg_list.entry.a aVar = lk30Var.b;
        if (z7) {
            MsgFromUser msgFromUser2 = (MsgFromUser) msg;
            boolean z8 = msgFromUser2.w != null;
            boolean z9 = !z8;
            if (msgFromUser2.D) {
                Object k0 = j5g.k0(arrayList);
                crr0 crr0Var = k0 instanceof crr0 ? (crr0) k0 : null;
                if (crr0Var != null) {
                    int h = e43.h(arrayList);
                    rmk0 rmk0Var = new rmk0(2);
                    rmk0Var.b(crr0Var.b.toArray(new Integer[0]));
                    rmk0Var.a(Integer.valueOf(msgFromUser2.b));
                    ArrayList<Object> arrayList2 = rmk0Var.a;
                    crr0 a = crr0.a(crr0Var, e43.l(arrayList2.toArray(new Integer[arrayList2.size()])), null, 510);
                    a.i = crr0Var.i;
                    s3q0 s3q0Var = s3q0.a;
                    arrayList.set(h, a);
                } else {
                    AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_DISAPPEARED;
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a2 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msgFromUser2, peer);
                    bw30.a.getClass();
                    crr0 crr0Var2 = new crr0(e43.o(Integer.valueOf(msgFromUser2.b)), msgFromUser2.b, a2, adapterEntryType, bw30.b(msgFromUser2), null, uk30Var.V);
                    crr0Var2.i = msgFromUser2;
                    arrayList.add(crr0Var2);
                }
                z = z7;
                z3 = false;
                msgFromUser = null;
                z4 = true;
            } else {
                boolean D3 = msgFromUser2.D3(AttachGift.class, false);
                cau0 cau0Var = lk30Var.a;
                if (D3) {
                    msgFromUser = null;
                    arrayList.addAll(aVar.a(new a.C1170a(msgFromUser2.H, msgFromUser2, (NestedMsg) null, 0, 0L, z9, uk30Var, 48)));
                    if (cau0Var.K()) {
                        l(arrayList, msgFromUser2, uk30Var);
                    }
                    z = z7;
                    z3 = false;
                    z4 = true;
                } else {
                    msgFromUser = null;
                    NestedMsg k7 = msgFromUser2.k7(NestedMsg.Type.REPLY);
                    if (msgFromUser2.p3() && k7 != null) {
                        arrayList.add(o140.c(AdapterEntryType.TYPE_REPLY, msgFromUser2, k7, 0, null, null, uk30Var, 48));
                    }
                    Pair k = k(msgFromUser2.H, true);
                    List list = (List) k.d();
                    List list2 = (List) k.g();
                    boolean z10 = true;
                    z = z7;
                    lk30Var.m(arrayList, msgFromUser2, list, z9, k7, uk30Var);
                    if (msgFromUser2.k8()) {
                        AdapterEntryType adapterEntryType2 = AdapterEntryType.TYPE_TEXT;
                        String str = msgFromUser2.F;
                        MsgTextFormat msgTextFormat = msgFromUser2.G;
                        ucp ucpVar = ucp.a;
                        arrayList.add(o140.c(adapterEntryType2, msgFromUser2, null, 0, msgFromUser2.H, o040.b(lk30Var.c, str, msgTextFormat, com.vk.im.ui.components.viewcontrollers.msg_list.a.a(msgFromUser2), false, 24), uk30Var, 12));
                        z10 = true;
                    }
                    lk30Var.m(arrayList, msgFromUser2, list2, z9, k7, uk30Var);
                    if (msgFromUser2.db()) {
                        jk30 jk30Var = new jk30(this, msgFromUser2, arrayList, uk30Var, 0);
                        lk30Var = this;
                        arrayList = arrayList;
                        msgFromUser2.wb(jk30Var);
                        if (!z8 && !msgFromUser2.Qa()) {
                            z5 = z10;
                            arrayList.add(o140.c(AdapterEntryType.TYPE_FWD_TIME, msgFromUser2, null, 0, null, null, uk30Var, 60));
                            if (!msgFromUser2.k8() || msgFromUser2.j7() || msgFromUser2.g8()) {
                                z3 = false;
                            } else {
                                z3 = false;
                                arrayList.add(o140.c(AdapterEntryType.TYPE_EMPTY, msgFromUser2, null, 0, null, null, uk30Var, 52));
                            }
                            if (msgFromUser2.V2() != null) {
                                arrayList.add(o140.c(AdapterEntryType.TYPE_KEYBOARD, msgFromUser2, null, 0, null, null, uk30Var, 60));
                            }
                            if (msgFromUser2.dc()) {
                                uk30Var2 = uk30Var;
                                cau0Var.getClass();
                            } else {
                                msgFromUser2.K = msgFromUser2.K;
                                uk30Var2 = uk30Var;
                                arrayList.add(o140.c(AdapterEntryType.TYPE_CAROUSEL, msgFromUser2, null, 0, null, null, uk30Var2, 60));
                            }
                            l(arrayList, msgFromUser2, uk30Var2);
                            z4 = z5;
                        }
                    } else {
                        lk30Var = this;
                    }
                    z5 = z10;
                    if (msgFromUser2.k8()) {
                    }
                    z3 = false;
                    if (msgFromUser2.V2() != null) {
                    }
                    if (msgFromUser2.dc()) {
                    }
                    l(arrayList, msgFromUser2, uk30Var2);
                    z4 = z5;
                }
            }
        } else {
            z = z7;
            msgFromUser = null;
            boolean z11 = true;
            if (!(msg instanceof MsgFromChannel)) {
                z2 = false;
                if (msg instanceof MsgChatAvatarRemove) {
                    AdapterEntryType adapterEntryType3 = AdapterEntryType.TYPE_CHAT_AVATAR_REMOVE;
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a3 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msg, peer);
                    Peer peer2 = msg.h;
                    qtd0 Bb = profilesInfo.Bb(peer2);
                    boolean z12 = uk30Var.q;
                    boolean z13 = uk30Var.t;
                    bw30.a.getClass();
                    usr0 usr0Var = new usr0(bw30.b(msg), peer2, a3, adapterEntryType3, null, Bb, z12, z13);
                    usr0Var.j = msg;
                    arrayList.add(usr0Var);
                    r5 = z11;
                } else if (msg instanceof MsgChatAvatarUpdate) {
                    MsgChatAvatarUpdate msgChatAvatarUpdate = (MsgChatAvatarUpdate) msg;
                    AdapterEntryType adapterEntryType4 = AdapterEntryType.TYPE_CHAT_AVATAR_UPDATE;
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a4 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msgChatAvatarUpdate, peer);
                    Peer peer3 = msgChatAvatarUpdate.h;
                    ImageList imageList = msgChatAvatarUpdate.E;
                    qtd0 Bb2 = profilesInfo.Bb(peer3);
                    boolean z14 = uk30Var.q;
                    boolean z15 = uk30Var.t;
                    bw30.a.getClass();
                    wsr0 wsr0Var = new wsr0(z14, Bb2, peer3, z15, imageList, a4, adapterEntryType4, bw30.b(msgChatAvatarUpdate), null);
                    wsr0Var.k = msgChatAvatarUpdate;
                    arrayList.add(wsr0Var);
                    r5 = z11;
                } else if (msg instanceof MsgChatCreate) {
                    MsgChatCreate msgChatCreate = (MsgChatCreate) msg;
                    AdapterEntryType adapterEntryType5 = AdapterEntryType.TYPE_CHAT_CREATE;
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a5 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msgChatCreate, peer);
                    Peer peer4 = msgChatCreate.h;
                    String str2 = msgChatCreate.E;
                    qtd0 Bb3 = profilesInfo.Bb(peer4);
                    boolean z16 = uk30Var.q;
                    boolean z17 = uk30Var.t;
                    bw30.a.getClass();
                    ysr0 ysr0Var = new ysr0(z16, Bb3, peer4, z17, str2, a5, adapterEntryType5, bw30.b(msgChatCreate), null);
                    ysr0Var.k = msgChatCreate;
                    arrayList.add(ysr0Var);
                    r5 = z11;
                } else if (msg instanceof MsgChatMemberInvite) {
                    MsgChatMemberInvite msgChatMemberInvite = (MsgChatMemberInvite) msg;
                    if (epx.f(msgChatMemberInvite.h, msgChatMemberInvite.E)) {
                        AdapterEntryType adapterEntryType6 = AdapterEntryType.TYPE_CHAT_MEMBER_RETURN;
                        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a6 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msg, peer);
                        Peer peer5 = msg.h;
                        qtd0 Bb4 = profilesInfo.Bb(peer5);
                        boolean z18 = uk30Var.q;
                        bw30.a.getClass();
                        otr0 otr0Var = new otr0(z18, Bb4, peer5, a6, adapterEntryType6, bw30.b(msg), null);
                        otr0Var.i = msg;
                        arrayList.add(otr0Var);
                        r5 = z11;
                    } else {
                        ltx0 ltx0Var = (ltx0) msg;
                        boolean z19 = ltx0Var instanceof MsgChatMemberInviteByMr;
                        Peer from = z19 ? ((MsgChatMemberInviteByMr) ltx0Var).E : ltx0Var.getFrom();
                        Peer H0 = z19 ? ((MsgChatMemberInviteByMr) ltx0Var).h : ltx0Var.H0();
                        AdapterEntryType adapterEntryType7 = AdapterEntryType.TYPE_CHAT_MEMBER_INVITE;
                        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a7 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msg, peer);
                        qtd0 Bb5 = profilesInfo.Bb(H0);
                        qtd0 Bb6 = profilesInfo.Bb(from);
                        boolean z20 = uk30Var.q;
                        bw30.a.getClass();
                        gtr0 gtr0Var = new gtr0(z20, Bb6, Bb5, from, H0, a7, adapterEntryType7, bw30.b(msg), null);
                        gtr0Var.k = msg;
                        arrayList.add(gtr0Var);
                        r5 = z11;
                    }
                } else if (msg instanceof MsgChatMemberInviteByMr) {
                    ltx0 ltx0Var2 = (ltx0) msg;
                    AdapterEntryType adapterEntryType8 = AdapterEntryType.TYPE_CHAT_MEMBER_INVITE;
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a8 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msg, peer);
                    Peer from2 = ltx0Var2.getFrom();
                    Peer H02 = ltx0Var2.H0();
                    qtd0 Bb7 = profilesInfo.Bb(ltx0Var2.H0());
                    qtd0 Bb8 = profilesInfo.Bb(ltx0Var2.getFrom());
                    boolean z21 = uk30Var.q;
                    bw30.a.getClass();
                    gtr0 gtr0Var2 = new gtr0(z21, Bb8, Bb7, from2, H02, a8, adapterEntryType8, bw30.b(msg), null);
                    gtr0Var2.k = msg;
                    arrayList.add(gtr0Var2);
                    r5 = z11;
                } else if (msg instanceof MsgChatMemberInviteByCall) {
                    ltx0 ltx0Var3 = (ltx0) msg;
                    AdapterEntryType adapterEntryType9 = AdapterEntryType.TYPE_CHAT_MEMBER_INVITE_BY_CALL;
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a9 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msg, peer);
                    Peer from3 = ltx0Var3.getFrom();
                    Peer H03 = ltx0Var3.H0();
                    qtd0 Bb9 = profilesInfo.Bb(ltx0Var3.H0());
                    qtd0 Bb10 = profilesInfo.Bb(ltx0Var3.getFrom());
                    boolean z22 = uk30Var.q;
                    bw30.a.getClass();
                    dtr0 dtr0Var = new dtr0(z22, Bb10, Bb9, from3, H03, a9, adapterEntryType9, bw30.b(msg), null);
                    dtr0Var.k = msg;
                    arrayList.add(dtr0Var);
                    r5 = z11;
                } else if (msg instanceof MsgChatMemberInviteByCallLink) {
                    AdapterEntryType adapterEntryType10 = AdapterEntryType.TYPE_CHAT_MEMBER_INVITE_BY_CALL_LINK;
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a10 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msg, peer);
                    Peer peer6 = msg.h;
                    qtd0 Bb11 = profilesInfo.Bb(peer6);
                    boolean z23 = uk30Var.q;
                    bw30.a.getClass();
                    ftr0 ftr0Var = new ftr0(z23, Bb11, peer6, a10, adapterEntryType10, bw30.b(msg), null);
                    ftr0Var.i = msg;
                    arrayList.add(ftr0Var);
                    r5 = z11;
                } else if (msg instanceof MsgChatMemberKick) {
                    MsgChatMemberKick msgChatMemberKick = (MsgChatMemberKick) msg;
                    if (epx.f(msgChatMemberKick.h, msgChatMemberKick.E)) {
                        AdapterEntryType adapterEntryType11 = AdapterEntryType.TYPE_CHAT_MEMBER_LEAVE;
                        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a11 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msgChatMemberKick, peer);
                        Peer peer7 = msgChatMemberKick.h;
                        qtd0 Bb12 = profilesInfo.Bb(peer7);
                        boolean z24 = uk30Var.q;
                        bw30.a.getClass();
                        mtr0 mtr0Var = new mtr0(z24, Bb12, peer7, a11, adapterEntryType11, bw30.b(msgChatMemberKick), null);
                        mtr0Var.i = msgChatMemberKick;
                        arrayList.add(mtr0Var);
                        r5 = z11;
                    } else {
                        AdapterEntryType adapterEntryType12 = AdapterEntryType.TYPE_CHAT_MEMBER_KICK;
                        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a12 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msgChatMemberKick, peer);
                        Peer peer8 = msgChatMemberKick.h;
                        Peer peer9 = msgChatMemberKick.E;
                        qtd0 Bb13 = profilesInfo.Bb(peer9);
                        qtd0 Bb14 = profilesInfo.Bb(msgChatMemberKick.h);
                        boolean z25 = uk30Var.q;
                        bw30.a.getClass();
                        ktr0 ktr0Var = new ktr0(z25, Bb14, Bb13, peer8, peer9, a12, adapterEntryType12, bw30.b(msgChatMemberKick), null);
                        ktr0Var.k = msgChatMemberKick;
                        arrayList.add(ktr0Var);
                        r5 = z11;
                    }
                } else if (msg instanceof MsgChatMemberKickCallBlock) {
                    MsgChatMemberKickCallBlock msgChatMemberKickCallBlock = (MsgChatMemberKickCallBlock) msg;
                    AdapterEntryType adapterEntryType13 = AdapterEntryType.TYPE_CHAT_MEMBER_KICK_FROM_CALL;
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a13 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msgChatMemberKickCallBlock, peer);
                    Peer peer10 = msgChatMemberKickCallBlock.h;
                    qtd0 Bb15 = profilesInfo.Bb(peer10);
                    boolean z26 = uk30Var.q;
                    boolean z27 = uk30Var.t;
                    bw30.a.getClass();
                    jtr0 jtr0Var = new jtr0(bw30.b(msgChatMemberKickCallBlock), peer10, a13, adapterEntryType13, null, Bb15, z26, z27);
                    jtr0Var.j = msgChatMemberKickCallBlock;
                    arrayList.add(jtr0Var);
                    r5 = z11;
                } else if (msg instanceof MsgChatDonKick) {
                    AdapterEntryType adapterEntryType14 = AdapterEntryType.TYPE_CHAT_DON_KICK;
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a14 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msg, peer);
                    boolean z28 = uk30Var.q;
                    bw30.a.getClass();
                    atr0 atr0Var = new atr0(a14, z28, adapterEntryType14, bw30.b(msg), null);
                    atr0Var.g = msg;
                    arrayList.add(atr0Var);
                    r5 = z11;
                } else if (msg instanceof MsgChatTitleUpdate) {
                    MsgChatTitleUpdate msgChatTitleUpdate = (MsgChatTitleUpdate) msg;
                    AdapterEntryType adapterEntryType15 = AdapterEntryType.TYPE_CHAT_TITLE_UPDATE;
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a15 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msgChatTitleUpdate, peer);
                    Peer peer11 = msgChatTitleUpdate.h;
                    String str3 = msgChatTitleUpdate.E;
                    String str4 = msgChatTitleUpdate.F;
                    qtd0 Bb16 = profilesInfo.Bb(peer11);
                    boolean z29 = uk30Var.q;
                    boolean z30 = uk30Var.t;
                    bw30.a.getClass();
                    ttr0 ttr0Var = new ttr0(z29, Bb16, peer11, z30, str3, str4, a15, adapterEntryType15, bw30.b(msgChatTitleUpdate), null);
                    ttr0Var.l = msgChatTitleUpdate;
                    arrayList.add(ttr0Var);
                    r5 = z11;
                } else if (msg instanceof MsgPin) {
                    MsgPin msgPin = (MsgPin) msg;
                    AdapterEntryType adapterEntryType16 = AdapterEntryType.TYPE_SERVICE_PIN;
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a16 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msgPin, peer);
                    Peer peer12 = msgPin.h;
                    Peer peer13 = uk30Var.l;
                    qtd0 Bb17 = profilesInfo.Bb(peer12);
                    boolean z31 = uk30Var.q;
                    bw30.a.getClass();
                    fur0 fur0Var = new fur0(z31, Bb17, peer12, peer13, msgPin, a16, adapterEntryType16, bw30.b(msgPin), null);
                    fur0Var.k = msgPin;
                    arrayList.add(fur0Var);
                    r5 = z11;
                } else if (msg instanceof MsgUnPin) {
                    MsgUnPin msgUnPin = (MsgUnPin) msg;
                    AdapterEntryType adapterEntryType17 = AdapterEntryType.TYPE_SERVICE_UNPIN;
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a17 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msgUnPin, peer);
                    Peer peer14 = msgUnPin.h;
                    qtd0 Bb18 = profilesInfo.Bb(peer14);
                    boolean z32 = uk30Var.q;
                    bw30.a.getClass();
                    qur0 qur0Var = new qur0(z32, Bb18, peer14, a17, adapterEntryType17, bw30.b(msgUnPin), null);
                    qur0Var.i = msgUnPin;
                    arrayList.add(qur0Var);
                    r5 = z11;
                } else if (msg instanceof MsgJoinByLink) {
                    MsgJoinByLink msgJoinByLink = (MsgJoinByLink) msg;
                    AdapterEntryType adapterEntryType18 = AdapterEntryType.TYPE_SERVICE_JOIN_BY_LINK;
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a18 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msgJoinByLink, peer);
                    Peer peer15 = msgJoinByLink.h;
                    qtd0 Bb19 = profilesInfo.Bb(peer15);
                    boolean z33 = uk30Var.q;
                    bw30.a.getClass();
                    bur0 bur0Var = new bur0(z33, Bb19, peer15, a18, adapterEntryType18, bw30.b(msgJoinByLink), null);
                    bur0Var.i = msgJoinByLink;
                    arrayList.add(bur0Var);
                    r5 = z11;
                } else if (msg instanceof MsgScreenshot) {
                    MsgScreenshot msgScreenshot = (MsgScreenshot) msg;
                    AdapterEntryType adapterEntryType19 = AdapterEntryType.TYPE_SERVICE_SCREENSHOT;
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a19 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msgScreenshot, peer);
                    Peer peer16 = msgScreenshot.h;
                    qtd0 Bb20 = profilesInfo.Bb(peer16);
                    boolean z34 = uk30Var.q;
                    boolean z35 = uk30Var.t;
                    bw30.a.getClass();
                    hur0 hur0Var = new hur0(bw30.b(msgScreenshot), peer16, a19, adapterEntryType19, null, Bb20, z34, z35);
                    hur0Var.j = msgScreenshot;
                    arrayList.add(hur0Var);
                    r5 = z11;
                } else if (msg instanceof MsgGroupCallStarted) {
                    MsgGroupCallStarted msgGroupCallStarted = (MsgGroupCallStarted) msg;
                    AdapterEntryType adapterEntryType20 = AdapterEntryType.TYPE_SERVICE_GROUP_CALL;
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a20 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msgGroupCallStarted, peer);
                    Peer peer17 = msgGroupCallStarted.h;
                    qtd0 Bb21 = profilesInfo.Bb(peer17);
                    boolean z36 = uk30Var.q;
                    bw30.a.getClass();
                    ztr0 ztr0Var = new ztr0(z36, Bb21, peer17, a20, adapterEntryType20, bw30.b(msgGroupCallStarted), null);
                    ztr0Var.i = msgGroupCallStarted;
                    arrayList.add(ztr0Var);
                    r5 = z11;
                } else if (msg instanceof MsgMrAccepted) {
                    MsgMrAccepted msgMrAccepted = (MsgMrAccepted) msg;
                    AdapterEntryType adapterEntryType21 = AdapterEntryType.TYPE_MR_ACCEPTED;
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a21 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msgMrAccepted, peer);
                    Peer peer18 = msgMrAccepted.h;
                    qtd0 Bb22 = profilesInfo.Bb(peer18);
                    boolean z37 = uk30Var.q;
                    bw30.a.getClass();
                    dur0 dur0Var = new dur0(bw30.b(msgMrAccepted), peer18, a21, adapterEntryType21, null, Bb22, z37, uk30Var.B);
                    dur0Var.j = msgMrAccepted;
                    arrayList.add(dur0Var);
                    r5 = z11;
                } else {
                    boolean z38 = msg instanceof MsgServiceCustom;
                    o040 o040Var = lk30Var.c;
                    if (z38) {
                        arrayList.add(qh30.a((MsgServiceCustom) msg, o040Var, uk30Var));
                        r5 = z11;
                    } else if (msg instanceof MsgChatStyleUpdate) {
                        MsgChatStyleUpdate msgChatStyleUpdate = (MsgChatStyleUpdate) msg;
                        AdapterEntryType adapterEntryType22 = AdapterEntryType.TYPE_CHAT_STYLE_UPDATE;
                        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a22 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msgChatStyleUpdate, peer);
                        Peer peer19 = msgChatStyleUpdate.h;
                        String str5 = msgChatStyleUpdate.E;
                        qtd0 Bb23 = profilesInfo.Bb(peer19);
                        boolean z39 = uk30Var.q;
                        boolean z40 = uk30Var.s;
                        ipo0 ipo0Var = uk30Var.X;
                        boolean z41 = uk30Var.A;
                        bw30.a.getClass();
                        rtr0 rtr0Var = new rtr0(z40, z39, Bb23, peer19, str5, z41, ipo0Var, a22, adapterEntryType22, bw30.b(msgChatStyleUpdate), null);
                        rtr0Var.m = msgChatStyleUpdate;
                        arrayList.add(rtr0Var);
                        r5 = z11;
                    } else if (msg instanceof MsgUnsupported) {
                        arrayList.add(j(msg, uk30Var));
                        r5 = z11;
                    } else if (msg instanceof MsgCallAsrFailed) {
                        AdapterEntryType adapterEntryType23 = AdapterEntryType.TYPE_SERVICE_CALL_ASR_FAILED;
                        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a23 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msg, peer);
                        bw30.a.getClass();
                        qsr0 qsr0Var = new qsr0(a23, uk30Var.q, adapterEntryType23, bw30.b(msg), null);
                        qsr0Var.g = msg;
                        arrayList.add(qsr0Var);
                        r5 = z11;
                    } else if (msg instanceof MsgSentMessageRequest) {
                        if (o25.b(o25.a())) {
                            lur0 lur0Var = new lur0(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msg, peer), AdapterEntryType.TYPE_SERVICE_MSG_CONVERSATION_REQUEST, epx.f(((MsgSentMessageRequest) msg).E, peer), z6);
                            lur0Var.f = msg;
                            arrayList.add(lur0Var);
                            r5 = z11;
                        } else {
                            arrayList.add(j(new MsgUnsupported(msg), uk30Var));
                            r5 = z11;
                        }
                    } else if (msg instanceof MsgRejectMessageRequest) {
                        if (o25.b(o25.a())) {
                            kur0 kur0Var = new kur0(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msg, peer), AdapterEntryType.TYPE_SERVICE_MSG_CONVERSATION_REQUEST_REJECTED, z6);
                            kur0Var.e = msg;
                            arrayList.add(kur0Var);
                            r5 = z11;
                        } else {
                            arrayList.add(j(new MsgUnsupported(msg), uk30Var));
                            r5 = z11;
                        }
                    } else if (msg instanceof MsgChatOwnerUpdate) {
                        MsgChatOwnerUpdate msgChatOwnerUpdate = (MsgChatOwnerUpdate) msg;
                        int i2 = qh30.a.$EnumSwitchMapping$0[msgChatOwnerUpdate.E.ordinal()];
                        if (i2 == 1) {
                            type = VhMsgServiceChatOwnerUpdateItem.Type.CHANGED;
                        } else if (i2 == 2) {
                            type = VhMsgServiceChatOwnerUpdateItem.Type.ANY_USER;
                        } else if (i2 == 3) {
                            type = VhMsgServiceChatOwnerUpdateItem.Type.USER;
                        } else {
                            if (i2 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            type = VhMsgServiceChatOwnerUpdateItem.Type.ANY_ADMIN;
                        }
                        VhMsgServiceChatOwnerUpdateItem.Type type2 = type;
                        AdapterEntryType adapterEntryType24 = AdapterEntryType.TYPE_SERVICE_CHAT_OWNER_UPDATE;
                        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a24 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msgChatOwnerUpdate, peer);
                        Peer peer20 = msgChatOwnerUpdate.F;
                        VhMsgServiceChatOwnerUpdateItem vhMsgServiceChatOwnerUpdateItem = new VhMsgServiceChatOwnerUpdateItem(a24, adapterEntryType24, profilesInfo.Bb(peer20), peer20, type2, uk30Var.q);
                        vhMsgServiceChatOwnerUpdateItem.h = msgChatOwnerUpdate;
                        arrayList.add(vhMsgServiceChatOwnerUpdateItem);
                        r5 = z11;
                    } else if (msg instanceof MsgIncomingCallPrivacy) {
                        MsgIncomingCallPrivacy msgIncomingCallPrivacy = (MsgIncomingCallPrivacy) msg;
                        com.vk.movika.sdk.android.defaultplayer.layout.a aVar2 = uk30Var.h0;
                        if (aVar2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        Context context = aVar2.a;
                        boolean z42 = msgIncomingCallPrivacy.i;
                        ne7 ne7Var = lk30Var.f;
                        if (z42) {
                            qtd0 Bb24 = profilesInfo.Bb(uk30Var.h);
                            if (Bb24 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo(Collections.singletonList(Bb24));
                            ne7Var.getClass();
                            ssr0Var = new ssr0(ne7.q(msgIncomingCallPrivacy, aVar2, profilesSimpleInfo), context.getString(R.string.vkim_msg_incoming_call_privacy_subtitle), context.getString(R.string.vkim_msg_incoming_call_privacy_button), false, new BubbleColors(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 1073741823, null), new BubbleColors(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 1073741823, null), 0, 0, AdapterEntryType.TYPE_CALL_SETTINGS_SNIPPET, msgIncomingCallPrivacy.g);
                        } else {
                            MsgServiceCustom msgServiceCustom = new MsgServiceCustom(msgIncomingCallPrivacy);
                            ProfilesSimpleInfo profilesSimpleInfo2 = new ProfilesSimpleInfo();
                            ne7Var.getClass();
                            msgServiceCustom.E = ne7.q(msgIncomingCallPrivacy, aVar2, profilesSimpleInfo2);
                            ssr0Var = qh30.a(msgServiceCustom, o040Var, uk30Var);
                        }
                        arrayList.add(ssr0Var);
                        r5 = z11;
                    } else {
                        arrayList.add(j(new MsgUnsupported(msg), uk30Var));
                        r5 = z11;
                    }
                }
                if (!arrayList.isEmpty()) {
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.i0(arrayList);
                    if (gVar.H0() && gVar.u0() && arrayList.size() > r5) {
                        int h2 = e43.h(arrayList) - r5;
                        arrayList.set(h2, ((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(h2)).y(r5));
                    } else {
                        arrayList.set(e43.h(arrayList), gVar.y(r5));
                    }
                    if ((msg instanceof MsgFromChannel) && !msg.Qb()) {
                        ListIterator listIterator = arrayList.listIterator(arrayList.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                i = -1;
                                break;
                            }
                            if (!((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) listIterator.previous()).j0()) {
                                i = listIterator.nextIndex();
                                break;
                            }
                        }
                        if (i >= 0 && i < arrayList.size()) {
                            arrayList.set(i, ((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(i)).y(r5));
                        }
                    }
                    MsgFromUser msgFromUser3 = z ? (MsgFromUser) msg : msgFromUser;
                    if (msgFromUser3 != null) {
                        boolean z43 = com.vk.im.engine.models.messages.a.Q7(msgFromUser3, new m1k(lk30Var, 29), z2) != null ? r5 : z2;
                        if (msgFromUser3.k8() && z43) {
                            for (int h3 = e43.h(arrayList); -1 < h3; h3--) {
                                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(h3);
                                if (gVar2.r0() != msgFromUser3.b) {
                                    break;
                                }
                                arrayList.set(h3, gVar2.y(gVar2.N()));
                            }
                        }
                        if (msgFromUser3.F0()) {
                            for (int h4 = e43.h(arrayList); -1 < h4; h4--) {
                                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar3 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(h4);
                                if (gVar3.r0() != msgFromUser3.b) {
                                    break;
                                }
                                arrayList.set(h4, gVar3.y(r5));
                            }
                        }
                    }
                }
                return arrayList;
            }
            MsgFromChannel msgFromChannel = (MsgFromChannel) msg;
            z3 = false;
            arrayList.addAll(aVar.a(new a.C1170a((List) msgFromChannel.E, (Msg) msgFromChannel, (NestedMsg) null, 0, 0L, true, uk30Var, 48)));
            z4 = z11;
        }
        z2 = z3;
        r5 = z4;
        if (!arrayList.isEmpty()) {
        }
        return arrayList;
    }

    @Override // xsna.ik30
    public final lvr0 h(Direction direction, Msg msg, uk30 uk30Var) {
        bw30.a.getClass();
        return new lvr0(uk30Var.p, direction, AdapterEntryType.TYPE_LOAD_MORE, bw30.b(msg), String.valueOf(msg.g), uk30Var.U);
    }

    public final void i(NestedMsg nestedMsg, final Msg msg, final int i, final ArrayList arrayList, final uk30 uk30Var) {
        ArrayList arrayList2;
        boolean z = msg.B;
        com.vk.im.ui.components.viewcontrollers.msg_list.entry.a aVar = this.b;
        if (z || (this.e && i == 1 && (nestedMsg.db() || nestedMsg.p3()))) {
            arrayList.add(o140.c(AdapterEntryType.TYPE_FWD_SENDER, msg, nestedMsg, 1, null, null, uk30Var, 48));
            Pair k = k(nestedMsg.j, false);
            List list = (List) k.d();
            List list2 = (List) k.g();
            if (!list.isEmpty()) {
                arrayList.addAll(aVar.a(new a.C1170a(list, msg, nestedMsg, 1, 0L, false, uk30Var, 112)));
            }
            if (nestedMsg.k8()) {
                arrayList.add(o140.c(AdapterEntryType.TYPE_TEXT, msg, nestedMsg, 1, null, o040.b(this.c, nestedMsg.h, nestedMsg.i, false, false, 28), uk30Var, 16));
            }
            if (!list2.isEmpty()) {
                arrayList.addAll(aVar.a(new a.C1170a(list2, msg, nestedMsg, 1, 0L, false, uk30Var, 112)));
            }
            arrayList.add(o140.c(AdapterEntryType.TYPE_FWD_BUTTON_SHOW_ALL, msg, nestedMsg, 1, null, null, uk30Var, 48));
            return;
        }
        arrayList.add(o140.c(AdapterEntryType.TYPE_FWD_SENDER, msg, nestedMsg, i, null, null, uk30Var, 48));
        Pair k2 = k(nestedMsg.j, false);
        List list3 = (List) k2.d();
        List list4 = (List) k2.g();
        if (!list3.isEmpty()) {
            arrayList.addAll(aVar.a(new a.C1170a(list3, msg, nestedMsg, i, 0L, false, uk30Var, 112)));
        }
        if (nestedMsg.k8()) {
            arrayList.add(o140.c(AdapterEntryType.TYPE_TEXT, msg, nestedMsg, i, null, o040.b(this.c, nestedMsg.h, nestedMsg.i, false, false, 28), uk30Var, 16));
        }
        if (!list4.isEmpty()) {
            arrayList.addAll(aVar.a(new a.C1170a(list4, msg, nestedMsg, i, 0L, false, uk30Var, 112)));
        }
        NestedMsg k7 = nestedMsg.k7(NestedMsg.Type.REPLY);
        if (nestedMsg.p3() && k7 != null) {
            i(k7, msg, i + 1, arrayList, uk30Var);
        }
        if (nestedMsg.db()) {
            arrayList2 = arrayList;
            nestedMsg.wb(new izs() { // from class: xsna.kk30
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    lk30.this.i((NestedMsg) obj, msg, i + 1, arrayList, uk30Var);
                    return s3q0.a;
                }
            });
        } else {
            arrayList2 = arrayList;
        }
        if (nestedMsg.k8() || nestedMsg.j7() || nestedMsg.g8()) {
            return;
        }
        arrayList2.add(o140.c(AdapterEntryType.TYPE_EMPTY, msg, null, i, null, null, uk30Var, 52));
    }

    public final void m(ArrayList arrayList, MsgFromUser msgFromUser, List list, boolean z, NestedMsg nestedMsg, uk30 uk30Var) {
        if (list.isEmpty()) {
            return;
        }
        arrayList.addAll(this.b.a(new a.C1170a(list, msgFromUser, msgFromUser.N() ? nestedMsg : null, 0, 0L, z, uk30Var, 48)));
    }
}
