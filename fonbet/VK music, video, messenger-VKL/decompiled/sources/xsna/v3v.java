package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.im.engine.models.messages.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: HideImageRestrictionLocallyCmd.kt */
/* loaded from: classes2.dex */
public final class v3v extends le6<s3q0> {
    public final long b;
    public final UserId c;
    public final boolean d;
    public final bpn0 e = new bpn0(new xqf(this, 25));

    public v3v(long j, UserId userId, boolean z) {
        this.b = j;
        this.c = userId;
        this.d = z;
    }

    public static Attach f(Attach attach) {
        AttachImage attachImage = attach instanceof AttachImage ? (AttachImage) attach : null;
        if (attachImage == null) {
            return attach;
        }
        PhotoRestriction photoRestriction = attachImage.v;
        if (!(photoRestriction != null ? photoRestriction.d : false)) {
            attachImage = null;
        }
        if (attachImage == null) {
            return attach;
        }
        AttachImage attachImage2 = new AttachImage(attachImage);
        attachImage2.v = null;
        return attachImage2;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        knf knfVar = w2wVar.getConfig().h0;
        ddg0 ddg0Var = ddg0.a;
        boolean z = this.d;
        UserId userId = this.c;
        long j = this.b;
        if (z) {
            ddg0Var.a();
        } else {
            ddg0Var.b(j, userId);
        }
        List<Msg> Y = w2wVar.I0().o().Y(AttachImage.class, userId, Long.valueOf(j));
        ArrayList arrayList = new ArrayList();
        for (Object obj : Y) {
            if (obj instanceof MsgFromUser) {
                arrayList.add(obj);
            }
        }
        Map<Long, PinnedMsg> I = w2wVar.I0().b().e().I(AttachImage.class, userId, Long.valueOf(j));
        if (!arrayList.isEmpty() || !I.isEmpty()) {
            boolean isEmpty = I.isEmpty();
            bpn0 bpn0Var = this.e;
            if (!isEmpty) {
                Iterator<Map.Entry<Long, PinnedMsg>> it = I.entrySet().iterator();
                while (it.hasNext()) {
                    PinnedMsg value = it.next().getValue();
                    izs izsVar = (izs) bpn0Var.getValue();
                    r8 r8Var = new r8(1, this, v3v.class, "doReplace", "doReplace(Lcom/vk/dto/attaches/Attach;)Lcom/vk/dto/attaches/Attach;", 0, 8);
                    value.getClass();
                    a.C1125a.f(value, izsVar, r8Var);
                }
                w2wVar.S0().n("HideImageRestrictionLocallyCmd", I.keySet());
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    MsgFromUser msgFromUser = (MsgFromUser) it2.next();
                    izs izsVar2 = (izs) bpn0Var.getValue();
                    s8 s8Var = new s8(1, this, v3v.class, "doReplace", "doReplace(Lcom/vk/dto/attaches/Attach;)Lcom/vk/dto/attaches/Attach;", 0, 8);
                    msgFromUser.getClass();
                    a.C1125a.f(msgFromUser, izsVar2, s8Var);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    g5g.y(((MsgFromUser) it3.next()).X9((izs) bpn0Var.getValue()), arrayList2);
                }
                List H0 = j5g.H0(j5g.D0(new tyj(1), arrayList2), 10);
                ArrayList arrayList3 = new ArrayList(c5g.u(H0, 10));
                Iterator it4 = H0.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(new y080((Attach) it4.next(), "HideImageRestrictionLocallyCmd"));
                }
                w2wVar.T0(this, arrayList3);
            }
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3v)) {
            return false;
        }
        v3v v3vVar = (v3v) obj;
        return this.b == v3vVar.b && epx.f(this.c, v3vVar.c) && this.d == v3vVar.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.d) + bh10.a(Long.hashCode(this.b) * 31, 31, this.c.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("HideImageRestrictionLocallyCmd(photoId=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", unblurAllForOwner=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
