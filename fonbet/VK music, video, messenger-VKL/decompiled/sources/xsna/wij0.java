package xsna;

import android.util.SparseArray;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.inappreview.InAppReviewConditionKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: ShowMsgTranscriptCmd.kt */
/* loaded from: classes2.dex */
public final class wij0 extends le6<s3q0> {
    public final int b;
    public final int c;
    public final Peer d;

    public wij0(int i, int i2, Peer peer) {
        this.b = i;
        this.c = i2;
        this.d = peer;
    }

    @Override // xsna.le6
    public final s3q0 e(final w2w w2wVar) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        final Ref$BooleanRef ref$BooleanRef3 = new Ref$BooleanRef();
        w2wVar.I0().u(new izs() { // from class: xsna.vij0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                d040 o = ((xgl0) obj).o();
                wij0 wij0Var = wij0.this;
                SparseArray<Msg> C = o.C(Collections.singletonList(Integer.valueOf(wij0Var.b)));
                u4q0 u4q0Var = zik0.a;
                xik0 xik0Var = new xik0(C);
                ArrayList arrayList = new ArrayList();
                Iterator<Object> it = xik0Var.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof MsgFromUser) {
                        arrayList.add(next);
                    }
                }
                MsgFromUser msgFromUser = (MsgFromUser) j5g.a0(arrayList);
                if (msgFromUser == null) {
                    Msg msg = (Msg) j5g.Z(xik0Var);
                    if (msg != null) {
                        com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Unexpected msg " + msg.getClass()));
                    }
                    return s3q0.a;
                }
                Attach ac = msgFromUser.ac(wij0Var.c);
                if (ac instanceof AttachWithTranscription) {
                    AttachWithTranscription attachWithTranscription = (AttachWithTranscription) ac;
                    if (!attachWithTranscription.m4()) {
                        if (msgFromUser.H6() || msgFromUser.Pb()) {
                            ref$BooleanRef2.element = true;
                            attachWithTranscription.na(1);
                        } else if (attachWithTranscription.l3() || ((attachWithTranscription instanceof AttachVideoMsg) && ((AttachVideoMsg) attachWithTranscription).r.length() == 0)) {
                            ref$BooleanRef.element = true;
                            attachWithTranscription.na(1);
                        }
                        ref$BooleanRef3.element = true;
                        attachWithTranscription.k9(true);
                        w2wVar.I0().o().s0(ac);
                        return s3q0.a;
                    }
                }
                return s3q0.a;
            }
        });
        if (ref$BooleanRef3.element) {
            w2wVar.S0().s(this.b, null);
        }
        if (ref$BooleanRef2.element) {
            w2wVar.J0(this, new com.vk.im.engine.commands.messages.g(this.b, this.d));
        }
        if (ref$BooleanRef.element) {
            w2wVar.J0(this, new c8g0(this.b, this.c));
        }
        if (!o25.b(o25.a())) {
            itg0.j(fsk.c.b(InAppReviewConditionKey.REQUEST_AUDIO_MSG_TRANSCRIPTION, jgp.b), null, 3);
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wij0)) {
            return false;
        }
        wij0 wij0Var = (wij0) obj;
        return this.b == wij0Var.b && this.c == wij0Var.c && epx.f(this.d, wij0Var.d);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.d.b) + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowMsgTranscriptCmd(msgLocalId=");
        sb.append(this.b);
        sb.append(", attachLocalId=");
        sb.append(this.c);
        sb.append(", peer=");
        return eq.a(sb, this.d, ')');
    }
}
