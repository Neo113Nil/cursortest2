package xsna;

import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.im.engine.models.messages.DraftMsg;
import com.vk.im.engine.models.messages.Msg;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: ImItemsHistoryMergeTask.kt */
/* loaded from: classes2.dex */
public final class h8w extends b920 {
    public final a c;

    /* compiled from: ImItemsHistoryMergeTask.kt */
    public interface a {

        /* compiled from: ImItemsHistoryMergeTask.kt */
        public static final class b implements a {
            public final Collection<com.vk.im.engine.models.dialogs.a> a;
            public final Map<Long, com.vk.im.engine.models.dialogs.b> b;
            public final Map<Long, lj30> c;
            public final int d;
            public final boolean e;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public b() {
                this(r1, r2, r2, 0, false);
                EmptyList emptyList = EmptyList.b;
                jgp jgpVar = jgp.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.e) + shy.a(this.d, v11.a(v11.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Dialogs(dialogsRemote=");
                sb.append(this.a);
                sb.append(", dialogsLocal=");
                sb.append(this.b);
                sb.append(", dialogsLastMessages=");
                sb.append(this.c);
                sb.append(", dialogsPhase=");
                sb.append(this.d);
                sb.append(", isBeforeLpSync=");
                return defpackage.q0.a(sb, this.e, ')');
            }

            public b(Collection<com.vk.im.engine.models.dialogs.a> collection, Map<Long, com.vk.im.engine.models.dialogs.b> map, Map<Long, lj30> map2, int i, boolean z) {
                this.a = collection;
                this.b = map;
                this.c = map2;
                this.d = i;
                this.e = z;
            }
        }

        /* compiled from: ImItemsHistoryMergeTask.kt */
        /* renamed from: xsna.h8w$a$a, reason: collision with other inner class name */
        public static final class C2980a implements a {
            public final Collection<eeb> a;
            public final Map<Long, Integer> b;

            public C2980a() {
                this(EmptyList.b, jgp.b);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2980a)) {
                    return false;
                }
                C2980a c2980a = (C2980a) obj;
                return epx.f(this.a, c2980a.a) && epx.f(this.b, c2980a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Channels(channels=");
                sb.append(this.a);
                sb.append(", channelsPhases=");
                return cjl0.a(sb, this.b, ')');
            }

            public C2980a(Collection<eeb> collection, Map<Long, Integer> map) {
                this.a = collection;
                this.b = map;
            }
        }
    }

    /* compiled from: ImItemsHistoryMergeTask.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImItemType.values().length];
            try {
                iArr[ImItemType.DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImItemType.CHANNEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public h8w(a aVar) {
        this.c = aVar;
    }

    public static void q(w2w w2wVar, com.vk.im.engine.models.im_item.a aVar, ArrayList arrayList) {
        v7w v7wVar = (v7w) j5g.A0(arrayList);
        if (v7wVar == null) {
            return;
        }
        x7w x7wVar = v7wVar.b;
        Pair<Integer, Integer> pair = com.vk.im.engine.models.im_item.b.a;
        int j = (int) xo9.j(x7wVar.b, com.vk.im.engine.models.im_item.b.a);
        int d = com.vk.im.engine.models.im_item.b.d(x7wVar);
        int j2 = (int) xo9.j(x7wVar.b, com.vk.im.engine.models.im_item.b.d);
        int i = b.$EnumSwitchMapping$0[v7wVar.a.b.ordinal()];
        com.vk.im.engine.models.im_item.a aVar2 = null;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (aVar.b == null) {
                ImItemType imItemType = ImItemType.CHANNEL;
                Long c = com.vk.im.engine.models.im_item.b.c(x7wVar);
                aVar2 = com.vk.im.engine.models.im_item.a.a(aVar, null, com.vk.im.engine.models.im_item.b.e(j, false, d, imItemType, d, 0, c != null ? c.longValue() : 0L), 125);
            }
        } else if (aVar.a == null) {
            aVar2 = com.vk.im.engine.models.im_item.a.a(aVar, com.vk.im.engine.models.im_item.b.e(j, false, j2, ImItemType.DIALOG, d, 0, 0L), null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        }
        if (aVar2 != null) {
            w2wVar.I0().j().f(aVar2);
        }
    }

    @Override // xsna.b920
    public final Object o(w2w w2wVar) {
        DraftMsg draftMsg;
        if (w2wVar.getExperiments().n()) {
            a aVar = this.c;
            if (aVar instanceof a.b) {
                a.b bVar = (a.b) aVar;
                ArrayList arrayList = new ArrayList();
                for (com.vk.im.engine.models.dialogs.a aVar2 : bVar.a) {
                    long j = aVar2.a;
                    ImItemType imItemType = ImItemType.DIALOG;
                    b5w b5wVar = new b5w(j, imItemType);
                    com.vk.im.engine.models.dialogs.b bVar2 = bVar.b.get(Long.valueOf(j));
                    lj30 lj30Var = bVar.c.get(Long.valueOf(aVar2.a));
                    vjm vjmVar = aVar2.c;
                    int i = (vjmVar.b == 0 && vjmVar.c == 0) ? 0 : aVar2.L;
                    boolean z = aVar2.D && bVar2 != null && bVar2.c();
                    boolean z2 = (bVar2 == null || (draftMsg = bVar2.v) == null || !draftMsg.d()) ? false : true;
                    arrayList.add(new v7w(b5wVar, com.vk.im.engine.models.im_item.b.e(vjmVar.c(z).b(z2).b, lj30Var != null && lj30Var.c(), i, imItemType, vjmVar.c, (lj30Var == null || lj30Var.j || !lj30Var.m) ? 0 : lj30Var.c, 0L), aVar2.f > 0, false, bVar.d));
                }
                w2wVar.I0().u(new s62(bVar, w2wVar, arrayList, this));
            } else {
                if (!(aVar instanceof a.C2980a)) {
                    throw new NoWhenBranchMatchedException();
                }
                a.C2980a c2980a = (a.C2980a) aVar;
                ArrayList arrayList2 = new ArrayList();
                for (eeb eebVar : c2980a.a) {
                    yta ytaVar = eebVar.a;
                    Integer num = c2980a.b.get(Long.valueOf(ytaVar.a));
                    int intValue = num != null ? num.intValue() : 0;
                    Msg msg = eebVar.b;
                    long j2 = ytaVar.a;
                    ImItemType imItemType2 = ImItemType.CHANNEL;
                    b5w b5wVar2 = new b5w(j2, imItemType2);
                    vjm vjmVar2 = ytaVar.d.b;
                    int i2 = vjmVar2.b;
                    int i3 = vjmVar2.c;
                    arrayList2.add(new v7w(b5wVar2, com.vk.im.engine.models.im_item.b.e(i2, false, i3, imItemType2, i3, 0, j2), (msg != null ? msg.d : 0) > 0, false, intValue));
                }
                w2wVar.I0().u(new sub(w2wVar, arrayList2, this, c2980a));
            }
        }
        return s3q0.a;
    }
}
