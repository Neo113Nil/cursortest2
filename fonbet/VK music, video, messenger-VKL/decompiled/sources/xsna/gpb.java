package xsna;

import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.log.L;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.epb;
import xsna.hpb;
import xsna.ipb;
import xsna.jpb;

/* compiled from: ChatClipsTopBarDecorationFeature.kt */
/* loaded from: classes2.dex */
public final class gpb extends wk50<npb, hpb, epb, jpb> {
    public final gob f;
    public final f4z g;
    public a h;
    public DialogExt i;

    /* compiled from: ChatClipsTopBarDecorationFeature.kt */
    public static final class a {
        public final long a;
        public final int b;
        public final int c;

        public a(long j, int i, int i2) {
            this.a = j;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, Long.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CurrentBindData(dialogId=");
            sb.append(this.a);
            sb.append(", cnvMsgId=");
            sb.append(this.b);
            sb.append(", attachPosition=");
            return vu5.b(sb, this.c, ')');
        }
    }

    public gpb(gob gobVar) {
        super(epb.d.b, new kpb(hpb.a.b));
        this.f = gobVar;
        this.g = new f4z();
    }

    @Override // xsna.wk50
    public final void N(hpb hpbVar, epb epbVar) {
        epb epbVar2 = epbVar;
        boolean z = epbVar2 instanceof epb.d;
        gob gobVar = this.f;
        if (z) {
            a7f0.a.e(this, gobVar.k(), null, new com.vk.movika.sdk.base.logic.interactor.d(this, 24), new pba(L.a, 1), null, 9);
            return;
        }
        a aVar = null;
        if (epbVar2 instanceof epb.a) {
            epb.a aVar2 = (epb.a) epbVar2;
            int i = aVar2.d;
            int i2 = aVar2.c;
            long j = aVar2.b;
            if (new a(j, i2, i).equals(this.h)) {
                return;
            }
            this.h = new a(j, i2, i);
            a7f0.a.f(this, gobVar.g(j, i2, null), new u6(8, this, epbVar2), new td5(L.a, 2), 1);
            return;
        }
        if (!(epbVar2 instanceof epb.b)) {
            if (epbVar2 instanceof epb.c) {
                this.h = null;
                DialogExt dialogExt = this.i;
                if (dialogExt != null) {
                    T(new jpb.c(dialogExt));
                    return;
                }
                return;
            }
            boolean z2 = epbVar2 instanceof epb.f;
            f4z f4zVar = this.g;
            if (z2) {
                f4zVar.b(new ipb.b());
                return;
            } else {
                if (!(epbVar2 instanceof epb.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(ipb.a.a);
                return;
            }
        }
        a aVar3 = this.h;
        if (aVar3 != null) {
            epb.b bVar = (epb.b) epbVar2;
            if (bVar.b.d == aVar3.b && bVar.c == aVar3.c) {
                return;
            }
        }
        if (aVar3 != null) {
            epb.b bVar2 = (epb.b) epbVar2;
            aVar = new a(aVar3.a, bVar2.b.d, bVar2.c);
        }
        this.h = aVar;
        if (this.i == null) {
            a7f0.a.f(this, gobVar.c(((epb.b) epbVar2).b.c), new d50(6, this, epbVar2), new com.vk.channels.impl.channel_screen.send_msg.e(L.a, 4), 1);
        } else {
            epb.b bVar3 = (epb.b) epbVar2;
            T(new jpb.b(bVar3.b, bVar3.c));
        }
    }
}
