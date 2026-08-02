package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.BannerButton;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import java.util.List;

/* compiled from: ChatListModels.kt */
/* loaded from: classes2.dex */
public final class wur0 implements com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g {
    public final AdapterEntryType b;
    public final ImageList c;
    public final CharSequence d;
    public final Peer e;
    public final String f;
    public final CharSequence g;
    public final n6p h;
    public final List<BannerButton> i;

    public wur0(AdapterEntryType adapterEntryType, ImageList imageList, CharSequence charSequence, Peer peer, String str, CharSequence charSequence2, n6p n6pVar, List<BannerButton> list) {
        this.b = adapterEntryType;
        this.c = imageList;
        this.d = charSequence;
        this.e = peer;
        this.f = str;
        this.g = charSequence2;
        this.h = n6pVar;
        this.i = list;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean B() {
        return true;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final NestedMsg D0() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E0() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final CharSequence K() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean K0() {
        return false;
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final Msg Q() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wur0)) {
            return false;
        }
        wur0 wur0Var = (wur0) obj;
        return this.b == wur0Var.b && epx.f(this.c, wur0Var.c) && epx.f(this.d, wur0Var.d) && epx.f(this.e, wur0Var.e) && epx.f(this.f, wur0Var.f) && epx.f(this.g, wur0Var.g) && epx.f(this.h, wur0Var.h) && epx.f(this.i, wur0Var.i);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        ImageList imageList = this.c;
        int a = urd0.a(bh10.a(u11.c((hashCode + (imageList == null ? 0 : imageList.b.hashCode())) * 31, 31, this.d), 31, this.e.b), 31, this.f);
        CharSequence charSequence = this.g;
        int hashCode2 = (a + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        n6p n6pVar = this.h;
        return this.i.hashCode() + ((hashCode2 + (n6pVar != null ? n6pVar.hashCode() : 0)) * 31);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final AdapterEntryType l() {
        return this.b;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean q() {
        return false;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final y060 q0() {
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v7 java.lang.String, still in use, count: 2, list:
          (r12v7 java.lang.String) from 0x0027: IF  (r12v7 java.lang.String) == (null java.lang.String)  -> B:16:0x0034 A[HIDDEN] (LINE:40)
          (r12v7 java.lang.String) from 0x002a: PHI (r12v6 java.lang.String) = (r12v3 java.lang.String), (r12v5 java.lang.String), (r12v7 java.lang.String) binds: [B:19:0x0032, B:16:0x0034, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]
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
    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g s(com.vk.im.engine.models.ProfilesInfo r11, xsna.uk30 r12) {
        /*
            r10 = this;
            com.vk.dto.common.Peer r12 = r10.e
            xsna.qtd0 r11 = r11.Bb(r12)
            r12 = 0
            if (r11 == 0) goto Lf
            com.vk.dto.common.im.ImageList r0 = r11.C8()
            r3 = r0
            goto L10
        Lf:
            r3 = r12
        L10:
            if (r11 == 0) goto L17
            java.lang.String r0 = r11.h8()
            goto L18
        L17:
            r0 = r12
        L18:
            if (r0 == 0) goto L2c
            boolean r0 = xsna.drm0.N(r0)
            if (r0 == 0) goto L21
            goto L2c
        L21:
            if (r11 == 0) goto L27
            java.lang.String r12 = r11.h8()
        L27:
            if (r12 != 0) goto L2a
            goto L34
        L2a:
            r4 = r12
            goto L37
        L2c:
            if (r11 == 0) goto L32
            java.lang.String r12 = r11.B3()
        L32:
            if (r12 != 0) goto L2a
        L34:
            java.lang.String r12 = ""
            goto L2a
        L37:
            xsna.wur0 r1 = new xsna.wur0
            com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType r2 = r10.b
            com.vk.dto.common.Peer r5 = r10.e
            java.lang.String r6 = r10.f
            java.lang.CharSequence r7 = r10.g
            xsna.n6p r8 = r10.h
            java.util.List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.BannerButton> r9 = r10.i
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.wur0.s(com.vk.im.engine.models.ProfilesInfo, xsna.uk30):com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g");
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a s0() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final int t() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VhProfileBannerItem(viewType=");
        sb.append(this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", memberToName=");
        sb.append((Object) this.d);
        sb.append(", memberToPeer=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", memberOrganization=");
        sb.append((Object) this.g);
        sb.append(", mediator=");
        sb.append(this.h);
        sb.append(", buttons=");
        return ms9.a(')', sb, this.i);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, xsna.zwk
    public final long v() {
        return 0L;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean w0() {
        return false;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final Attach x() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g X(uk30 uk30Var) {
        return this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g n(oh30 oh30Var) {
        return this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g u(boolean z) {
        return this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g y(boolean z) {
        return this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g B0(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2, uk30 uk30Var) {
        return this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g H(Boolean bool, Boolean bool2, Integer num) {
        return this;
    }
}
