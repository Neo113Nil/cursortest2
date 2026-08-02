package com.yandex.messaging.internal.view.timeline.poll;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.bricks.BrickSlotView;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.domain.poll.PollMessageVote$OperationType;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.PollMessageData;
import com.yandex.messaging.internal.view.timeline.c;
import com.yandex.messaging.internal.view.timeline.g0;
import com.yandex.messaging.internal.view.timeline.poll.options.b;
import defpackage.ai91;
import defpackage.b00;
import defpackage.d85;
import defpackage.e85;
import defpackage.e9h0;
import defpackage.fxa1;
import defpackage.gl;
import defpackage.hxd0;
import defpackage.ike;
import defpackage.j24;
import defpackage.j420;
import defpackage.j73;
import defpackage.jng0;
import defpackage.jqr;
import defpackage.jwf;
import defpackage.lqo;
import defpackage.lxd0;
import defpackage.lz;
import defpackage.nxd0;
import defpackage.ny61;
import defpackage.oyh0;
import defpackage.tcc;
import defpackage.tf;
import defpackage.tje;
import defpackage.tz10;
import defpackage.vb5;
import defpackage.vbt;
import defpackage.vse;
import defpackage.wz31;
import defpackage.yab;
import defpackage.ydz;
import defpackage.yxd0;
import defpackage.z83;
import defpackage.z9z0;
import defpackage.zx6;
import defpackage.zxd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public abstract class a extends c implements wz31 {
    public final ike B2;
    public final lqo C2;
    public final b H2;
    public final TextView N2;
    public final TextView T2;
    public final gl V2;
    public final zxd0 X2;
    public boolean v3;
    public final jwf x2;
    public final zx6 y2;

    public a(boolean z, View view, jwf jwfVar) {
        super(z, view, jwfVar);
        this.x2 = jwfVar;
        this.y2 = (zx6) jwfVar.F;
        this.B2 = ((vse) jwfVar.w).c(true);
        this.C2 = (lqo) jwfVar.i;
        b bVar = new b(view.getContext(), new j24(11, this), new d85(this, 0));
        this.H2 = bVar;
        this.N2 = (TextView) view.findViewById(e9h0.poll_message_title);
        TextView textView = (TextView) view.findViewById(e9h0.poll_show_results);
        textView.setOnClickListener(new tf(18, this));
        this.T2 = textView;
        BrickSlotView brickSlotView = (BrickSlotView) view.findViewById(e9h0.poll_message_votes_info);
        View findViewById = view.findViewById(e9h0.poll_message_options);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        recyclerView.setAdapter(bVar);
        recyclerView.setItemAnimator(null);
        View findViewById2 = view.findViewById(e9h0.poll_vote_btn_container);
        d85 d85Var = new d85(this, 1);
        gl glVar = new gl();
        glVar.b = findViewById2;
        glVar.c = d85Var;
        TextView textView2 = (TextView) findViewById2.findViewById(e9h0.poll_vote_btn_label);
        glVar.w = textView2;
        ImageView imageView = (ImageView) findViewById2.findViewById(e9h0.poll_vote_pending_indicator);
        glVar.x = imageView;
        findViewById2.setOnClickListener(new tf(19, glVar));
        findViewById2.setEnabled(false);
        textView2.setEnabled(false);
        ai91.c(imageView, false);
        this.V2 = glVar;
        zxd0 zxd0Var = (zxd0) jwfVar.b;
        this.X2 = zxd0Var;
        brickSlotView.insert(zxd0Var);
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final Drawable A0(z9z0 z9z0Var, boolean z, boolean z2) {
        return z9z0Var.a(z, z2, this.R, this.v2.x.F, G0());
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final ServerMessageRef D0() {
        ServerMessageRef D0 = super.D0();
        if (D0 != null && this.C2.a(tz10.h)) {
            return D0;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r0 == null) goto L11;
     */
    @Override // com.yandex.messaging.internal.view.timeline.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0(String str, boolean z) {
        String string;
        TextView textView = this.N2;
        CharSequence text = textView.getText();
        if (text != null && (string = text.toString()) != null) {
            if (string.length() <= 0) {
                string = null;
            }
        }
        string = this.a.getContext().getString(oyh0.messenger_message_with_poll_content_desc);
        textView.setContentDescription(z0(string, z));
        y0(textView);
    }

    public final e85 K0() {
        ArrayList arrayList = this.H2.w;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Boolean.valueOf(((hxd0) it.next()).d));
        }
        return new e85(arrayList2);
    }

    public final void L0() {
        ArrayList arrayList = this.H2.w;
        boolean z = false;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((hxd0) it.next()).d) {
                    z = true;
                    break;
                }
            }
        }
        gl glVar = this.V2;
        glVar.a = z;
        ((View) glVar.b).setEnabled(z);
        ((TextView) glVar.w).setEnabled(glVar.a);
    }

    public final void M0(List list) {
        Long l;
        Long l2 = null;
        z83.d(this.c0, null);
        z83.d(this.W, null);
        String str = this.c0;
        if (str == null || (l = this.W) == null) {
            return;
        }
        boolean z = this.l0;
        Long l3 = this.j0;
        Long l4 = this.Z;
        String str2 = this.a0;
        PollMessageVote$OperationType pollMessageVote$OperationType = PollMessageVote$OperationType.SetVote;
        lxd0 lxd0Var = new lxd0();
        lxd0Var.b = str;
        if (z) {
            l = l3;
        }
        lxd0Var.a = l;
        if (str2 == null || !z) {
            str2 = null;
        }
        lxd0Var.f = str2;
        if (l4 != null && z) {
            l2 = l4;
        }
        lxd0Var.e = l2;
        lxd0Var.c = list;
        lxd0Var.d = pollMessageVote$OperationType;
        if (l == null) {
            ny61.g("message timestamp should be presented");
            return;
        }
        if (!(l2 == null && str2 == null) && (str2 == null || l2 == null)) {
            ny61.g("defining at least one attribute of forward message you should define 2 others");
            return;
        }
        nxd0 nxd0Var = new nxd0(lxd0Var);
        g0 g0Var = e0().e;
        g0Var.getClass();
        tje.e();
        b00 b00Var = g0Var.a;
        ((Handler) b00Var.a.get()).post(new lz(9, b00Var, g0Var.b, nxd0Var));
    }

    @Override // defpackage.qdz0
    public final boolean W() {
        return this.v2.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0065  */
    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void X(yab yabVar, vb5 vb5Var) {
        boolean z;
        boolean z2;
        int i;
        String[] strArr;
        int[] iArr;
        int[] iArr2;
        boolean z3;
        int length;
        int i2;
        ike ikeVar;
        boolean z4;
        int[] iArr3;
        int i3;
        ArrayList arrayList;
        super.X(yabVar, vb5Var);
        String str = this.c0;
        if (str == null) {
            return;
        }
        long w0 = yabVar.w0();
        Long B = yabVar.B();
        BasePollMessageViewHolder$startDelayedUpdate$1 basePollMessageViewHolder$startDelayedUpdate$1 = new BasePollMessageViewHolder$startDelayedUpdate$1(str, B != null ? B.longValue() : w0, this, null);
        ike ikeVar2 = this.B2;
        tje.N(ikeVar2, null, null, basePollMessageViewHolder$startDelayedUpdate$1, 3);
        MessageData R = yabVar.R();
        PollMessageData pollMessageData = R instanceof PollMessageData ? (PollMessageData) R : null;
        if (pollMessageData != null) {
            e85 e85Var = vb5Var instanceof e85 ? (e85) vb5Var : null;
            this.N2.setText(pollMessageData.title);
            int[] iArr4 = pollMessageData.myChoices;
            if (iArr4 != null) {
                if (!(iArr4.length == 0)) {
                    z = true;
                    this.v3 = z;
                    z2 = pollMessageData.isMultiselect;
                    boolean z5 = !z2;
                    i = !z ? pollMessageData.results.voteCount : Integer.MAX_VALUE;
                    z83.i();
                    PollMessageData.VoteResult voteResult = pollMessageData.results;
                    boolean z6 = pollMessageData.isAnonymous;
                    ReducedUserInfo[] reducedUserInfoArr = voteResult.voters;
                    int i4 = voteResult.voteCount;
                    zxd0 zxd0Var = this.X2;
                    zxd0Var.getClass();
                    zxd0Var.a.w.setAvatarBorderColor(fxa1.c(!this.R ? jng0.messagingOutgoingBackgroundColor : jng0.messagingIncomingBackgroundColor, zxd0Var.b).data);
                    zxd0Var.y.setValue(zxd0Var, zxd0.z[0], new yxd0(reducedUserInfoArr, i4, z6));
                    strArr = pollMessageData.answers;
                    if (strArr == null) {
                        strArr = new String[0];
                    }
                    iArr = pollMessageData.results.answers;
                    if (iArr == null) {
                        iArr = new int[0];
                    }
                    iArr2 = pollMessageData.myChoices;
                    if (iArr2 == null) {
                        iArr2 = new int[0];
                    }
                    z3 = this.v3;
                    if (z3 || strArr.length == iArr.length) {
                        if (e85Var != null) {
                            e85Var.a.size();
                            z83.i();
                        }
                        ArrayList arrayList2 = new ArrayList();
                        length = strArr.length;
                        i2 = 0;
                        while (i2 < length) {
                            String[] strArr2 = strArr;
                            int[] iArr5 = iArr;
                            String str2 = strArr2[i2];
                            int i5 = length;
                            boolean w = j73.w(i2, iArr2);
                            if (z3) {
                                iArr3 = iArr2;
                                i3 = iArr5[i2];
                            } else {
                                iArr3 = iArr2;
                                i3 = 0;
                            }
                            ike ikeVar3 = ikeVar2;
                            arrayList2.add(new hxd0(str2, i3, w, (e85Var == null || (arrayList = e85Var.a) == null) ? false : ((Boolean) arrayList.get(i2)).booleanValue()));
                            i2++;
                            strArr = strArr2;
                            iArr = iArr5;
                            length = i5;
                            iArr2 = iArr3;
                            ikeVar2 = ikeVar3;
                        }
                        ikeVar = ikeVar2;
                        b bVar = this.H2;
                        bVar.x = z5;
                        ArrayList arrayList3 = bVar.w;
                        z4 = false;
                        bVar.notifyItemRangeChanged(0, arrayList3.size());
                        bVar.z = z3;
                        bVar.notifyItemRangeChanged(0, arrayList3.size());
                        bVar.A = i;
                        bVar.notifyItemRangeChanged(0, arrayList3.size());
                        arrayList3.clear();
                        arrayList3.addAll(arrayList2);
                        bVar.notifyDataSetChanged();
                    } else {
                        if (ydz.a.a()) {
                            ydz.b("PollMessageViewHolder", "inconsistent data answers count != votes count");
                        }
                        ikeVar = ikeVar2;
                        z4 = false;
                    }
                    boolean z7 = this.v3;
                    gl glVar = this.V2;
                    if (z2) {
                        ai91.c((View) glVar.b, z4);
                    } else if (z7) {
                        ai91.c((View) glVar.b, z4);
                    } else {
                        ai91.f((View) glVar.b, z4);
                    }
                    if (((Boolean) ((j420) this.x2.J).d.getValue()).booleanValue() && this.v3 && !pollMessageData.isAnonymous) {
                        z4 = true;
                    }
                    ai91.e(this.T2, z4);
                    L0();
                    e.H(ikeVar, new jqr(this.y2.a(new vbt(str, w0)), new BasePollMessageViewHolder$bindData$2(this, z5, null), 3));
                    this.v2.a(this.t0, yabVar, e0().f);
                }
            }
            z = false;
            this.v3 = z;
            z2 = pollMessageData.isMultiselect;
            boolean z52 = !z2;
            if (!z) {
            }
            z83.i();
            PollMessageData.VoteResult voteResult2 = pollMessageData.results;
            boolean z62 = pollMessageData.isAnonymous;
            ReducedUserInfo[] reducedUserInfoArr2 = voteResult2.voters;
            int i42 = voteResult2.voteCount;
            zxd0 zxd0Var2 = this.X2;
            zxd0Var2.getClass();
            zxd0Var2.a.w.setAvatarBorderColor(fxa1.c(!this.R ? jng0.messagingOutgoingBackgroundColor : jng0.messagingIncomingBackgroundColor, zxd0Var2.b).data);
            zxd0Var2.y.setValue(zxd0Var2, zxd0.z[0], new yxd0(reducedUserInfoArr2, i42, z62));
            strArr = pollMessageData.answers;
            if (strArr == null) {
            }
            iArr = pollMessageData.results.answers;
            if (iArr == null) {
            }
            iArr2 = pollMessageData.myChoices;
            if (iArr2 == null) {
            }
            z3 = this.v3;
            if (z3) {
            }
            if (e85Var != null) {
            }
            ArrayList arrayList22 = new ArrayList();
            length = strArr.length;
            i2 = 0;
            while (i2 < length) {
            }
            ikeVar = ikeVar2;
            b bVar2 = this.H2;
            bVar2.x = z52;
            ArrayList arrayList32 = bVar2.w;
            z4 = false;
            bVar2.notifyItemRangeChanged(0, arrayList32.size());
            bVar2.z = z3;
            bVar2.notifyItemRangeChanged(0, arrayList32.size());
            bVar2.A = i;
            bVar2.notifyItemRangeChanged(0, arrayList32.size());
            arrayList32.clear();
            arrayList32.addAll(arrayList22);
            bVar2.notifyDataSetChanged();
            boolean z72 = this.v3;
            gl glVar2 = this.V2;
            if (z2) {
            }
            if (((Boolean) ((j420) this.x2.J).d.getValue()).booleanValue()) {
                z4 = true;
            }
            ai91.e(this.T2, z4);
            L0();
            e.H(ikeVar, new jqr(this.y2.a(new vbt(str, w0)), new BasePollMessageViewHolder$bindData$2(this, z52, null), 3));
            this.v2.a(this.t0, yabVar, e0().f);
        }
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final boolean Y() {
        return false;
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final boolean b0() {
        return false;
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final boolean c0() {
        return false;
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final boolean d0() {
        return true;
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void f0() {
        super.f0();
        this.v2.e();
        kotlinx.coroutines.a.g(this.B2.a, null);
    }
}
