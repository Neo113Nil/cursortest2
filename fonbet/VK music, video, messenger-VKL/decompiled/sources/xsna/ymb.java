package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgReaction;
import com.vk.log.L;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.utils.Logger;
import xsna.a7f0;
import xsna.gob;
import xsna.hg1;
import xsna.lnb;
import xsna.mnb;
import xsna.wmb;

/* compiled from: ChatClipsBottomBarDecorationFeature.kt */
/* loaded from: classes2.dex */
public final class ymb extends wk50<dob, knb, wmb, mnb> {
    public final gob f;
    public final f4z g;
    public long h;
    public DialogExt i;
    public Integer j;
    public final LinkedHashMap k;
    public final LinkedHashSet l;
    public boolean m;

    public ymb(gob gobVar) {
        super(wmb.h.b, new nnb());
        this.f = gobVar;
        this.g = new f4z();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wk50
    public final void N(knb knbVar, wmb wmbVar) {
        Pair pair;
        Integer num;
        wmb wmbVar2 = wmbVar;
        if (wmbVar2.equals(wmb.h.b)) {
            a1w a1wVar = q1w.a;
            if (a1wVar == null) {
                a1wVar = null;
            }
            io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar.l.a(), new hg1.z(dnb.c)).U(new hg1.y(enb.b));
            com.vk.movika.sdk.base.observable.m mVar = new com.vk.movika.sdk.base.observable.m(this, 21);
            L l = L.a;
            a7f0.a.e(this, U, null, mVar, new o99(l, 1), null, 9);
            a7f0.a.e(this, this.f.k(), null, new ec(this, 20), new jnb(l, 0), null, 9);
            a1w a1wVar2 = q1w.a;
            if (a1wVar2 == null) {
                a1wVar2 = null;
            }
            a7f0.a.e(this, new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar2.l.a(), new hg1.z(kg1.f)).U(new hg1.y(lg1.e)), null, new iz0(this, 8), null, null, 13);
            a1w a1wVar3 = q1w.a;
            if (a1wVar3 == null) {
                a1wVar3 = null;
            }
            a7f0.a.e(this, new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar3.l.a(), new hg1.z(hnb.b)).U(new hg1.y(inb.c)), new ps2(new j5(this, 13), 8)), null, new com.vk.movika.sdk.base.observable.k(this, 17), null, null, 13);
            a1w a1wVar4 = q1w.a;
            a7f0.a.e(this, new io.reactivex.rxjava3.internal.operators.observable.i0((a1wVar4 != null ? a1wVar4 : null).l.a(), new hg1.z(fnb.c)).U(new hg1.y(gnb.b)), null, new h5(this, 23), null, null, 13);
            return;
        }
        if (wmbVar2 instanceof wmb.b) {
            wmb.b bVar = (wmb.b) wmbVar2;
            int i = bVar.c;
            long j = bVar.b;
            Integer num2 = this.j;
            if (num2 != null && i == num2.intValue()) {
                return;
            }
            this.j = Integer.valueOf(i);
            this.h = j;
            this.m = bVar.e;
            if (V()) {
                return;
            }
            a7f0.a.f(this, this.f.g(j, i, bVar.d), new mb(this, 21), new zmb(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 1);
            return;
        }
        if (wmbVar2.equals(wmb.g.b)) {
            this.j = null;
            T(mnb.e.b);
            return;
        }
        if (wmbVar2 instanceof wmb.c) {
            wmb.c cVar = (wmb.c) wmbVar2;
            this.j = Integer.valueOf(cVar.b.d);
            LinkedHashMap linkedHashMap = this.k;
            Msg msg = cVar.b;
            linkedHashMap.putIfAbsent(Integer.valueOf(msg.d), new a(cVar.b, cVar.c, cVar.d));
            if (V()) {
                return;
            }
            a7f0.a.f(this, this.f.c(msg.c), new sz(this, 12), new anb(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 1);
            return;
        }
        if (wmbVar2 instanceof wmb.a) {
            wmb.a aVar = (wmb.a) wmbVar2;
            this.j = null;
            boolean contains = this.l.contains(aVar.b.a1());
            DialogExt dialogExt = this.i;
            if (dialogExt != null) {
                T(new mnb.b(dialogExt, aVar.b, contains));
                return;
            }
            return;
        }
        if (wmbVar2 instanceof wmb.l) {
            wmb.l lVar = (wmb.l) wmbVar2;
            if (this.m) {
                return;
            }
            U(lVar.b);
            return;
        }
        if (wmbVar2 instanceof wmb.m) {
            wmb.m mVar2 = (wmb.m) wmbVar2;
            T(new mnb.i(mVar2.b, mVar2.c));
            return;
        }
        if (wmbVar2 instanceof wmb.i) {
            U(((wmb.i) wmbVar2).b);
            return;
        }
        if (wmbVar2.equals(wmb.j.b)) {
            T(mnb.g.b);
            return;
        }
        if (wmbVar2.equals(wmb.f.b)) {
            T(mnb.d.b);
            return;
        }
        if (wmbVar2 instanceof wmb.k) {
            wmb.k kVar = (wmb.k) wmbVar2;
            T(mnb.d.b);
            a aVar2 = (a) this.k.get(Integer.valueOf(kVar.b));
            if (aVar2 != null) {
                Msg msg2 = aVar2.a;
                if (msg2.H6() || (num = kVar.d) == null) {
                    return;
                }
                W(kVar.b, this.f.h(msg2, kVar.c, num.intValue()), kVar.d, kVar.c, false);
                V();
                return;
            }
            return;
        }
        if (!(wmbVar2 instanceof wmb.d)) {
            if (!(wmbVar2 instanceof wmb.e)) {
                throw new NoWhenBranchMatchedException();
            }
            wmb.e eVar = (wmb.e) wmbVar2;
            Attach b = ca3.b(new VideoAttachment(eVar.b));
            if (b == null) {
                return;
            }
            a7f0.a.f(this, this.f.i(new gob.b(this.h, null, null, Collections.singletonList(b), null, null, 54)), new bnb(this, eVar), new cnb(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 1);
            return;
        }
        wmb.d dVar = (wmb.d) wmbVar2;
        gob gobVar = this.f;
        LinkedHashMap linkedHashMap2 = this.k;
        int i2 = dVar.b;
        boolean z = dVar.d;
        int i3 = dVar.c;
        a aVar3 = (a) linkedHashMap2.get(Integer.valueOf(i2));
        if (aVar3 != null) {
            Msg msg3 = aVar3.a;
            if (msg3.H6()) {
                return;
            }
            if (z) {
                pair = new Pair(gobVar.b(msg3, i3), Boolean.FALSE);
            } else {
                aux0 aux0Var = msg3 instanceof aux0 ? (aux0) msg3 : null;
                pair = new Pair(gobVar.h(msg3, aux0Var != null ? aux0Var.R5() : null, i3), Boolean.TRUE);
            }
            List<? extends MsgReaction> list = (List) pair.d();
            boolean booleanValue = ((Boolean) pair.g()).booleanValue();
            int i4 = dVar.b;
            Integer valueOf = z ? null : Integer.valueOf(i3);
            aux0 aux0Var2 = msg3 instanceof aux0 ? (aux0) msg3 : null;
            W(i4, list, valueOf, aux0Var2 != null ? aux0Var2.R5() : null, booleanValue);
            V();
        }
    }

    public final void U(int i) {
        T(mnb.d.b);
        DialogExt dialogExt = this.i;
        DialogExt dialogExt2 = dialogExt == null ? new DialogExt(this.h, (ProfilesInfo) null, 2, (zcl) null) : dialogExt;
        a aVar = (a) this.k.get(Integer.valueOf(i));
        if (aVar != null) {
            String str = aVar.c;
            Msg msg = aVar.a;
            boolean z = msg.i;
            Long l = null;
            String str2 = z ? str : null;
            if (z) {
                l = Long.valueOf(msg.getFrom().d);
            }
            this.g.b(new lnb.a(dialogExt2, i, str2, l, msg.i && str == null));
        }
    }

    public final boolean V() {
        DialogExt dialogExt = this.i;
        Integer num = this.j;
        LinkedHashMap linkedHashMap = this.k;
        Object obj = linkedHashMap.get(num);
        if (dialogExt == null || obj == null) {
            return false;
        }
        Msg msg = ((a) obj).a;
        this.f.j(msg).q(io.reactivex.rxjava3.schedulers.a.b()).m(yiz.f(com.vk.mvi.core.internal.executors.a.a)).subscribe(new xmb(new rd1(6)), new defpackage.n(new kf8(L.a, 1), 14));
        a aVar = (a) linkedHashMap.get(this.j);
        T(new mnb.a(dialogExt, msg, aVar != null ? aVar.c : null, this.m));
        return true;
    }

    public final void W(int i, List<? extends MsgReaction> list, Integer num, Integer num2, boolean z) {
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.k;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null || list == null) {
            return;
        }
        a aVar = (a) obj;
        Msg msg = aVar.a;
        if (z) {
            msg = msg.zb();
        }
        aux0 aux0Var = (aux0) msg;
        aux0Var.f5(list);
        aux0Var.d(num);
        linkedHashMap.put(Integer.valueOf(i), new a(msg, aVar.b, aVar.c, num2));
    }

    /* compiled from: ChatClipsBottomBarDecorationFeature.kt */
    public static final class a {
        public final Msg a;
        public final boolean b;
        public final String c;
        public final Integer d;

        public a(Msg msg, boolean z, String str, Integer num) {
            this.a = msg;
            this.b = z;
            this.c = str;
            this.d = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.d;
            return hashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MsgHolder(msg=");
            sb.append(this.a);
            sb.append(", isLocalMsg=");
            sb.append(this.b);
            sb.append(", linkedText=");
            sb.append(this.c);
            sb.append(", prevReaction=");
            return uqi.b(sb, this.d, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ a(Msg msg, boolean z, String str) {
            this(msg, z, str, r0 != null ? r0.R5() : null);
            aux0 aux0Var = msg instanceof aux0 ? (aux0) msg : null;
        }
    }
}
