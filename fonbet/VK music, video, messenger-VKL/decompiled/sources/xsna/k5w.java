package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.X3;
import com.vk.channels.api.Channel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Triple;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.d8w;

/* compiled from: ImItemHistoryRemoteLoader.kt */
/* loaded from: classes2.dex */
public final class k5w {
    public static final bpn0 a = new bpn0(new d1(19));

    /* compiled from: ImItemHistoryRemoteLoader.kt */
    public static final class a {
        public final int a;
        public final boolean b;
        public final AtomicBoolean c = new AtomicBoolean();
        public final List<wy1> d = dez0.b();
        public volatile d8w.b e;

        /* compiled from: ImItemHistoryRemoteLoader.kt */
        /* renamed from: xsna.k5w$a$a, reason: collision with other inner class name */
        public static final class C3164a extends IllegalStateException {
        }

        /* compiled from: Comparisons.kt */
        public static final class b<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return jw5.b(((a5w) t2).y9(), ((a5w) t).y9());
            }
        }

        public a(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public static void b(w2w w2wVar) {
            Long l;
            t7w j = w2wVar.I0().j();
            x7w x7wVar = x7w.g;
            x7w x7wVar2 = x7w.f;
            ArrayList arrayList = j.h(x7wVar, x7wVar2, x7wVar, x7wVar2, 40).a;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(((v7w) it.next()).a.a));
            }
            x7w x7wVar3 = x7w.g;
            d8w.b bVar = (d8w.b) fo50.v(new d8w(new wy1(x7wVar3, x7wVar3), 40, false), w2wVar, "ImItemHistoryRemoteLoader", 2);
            List<pmm> list = bVar.b;
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                com.vk.im.engine.models.dialogs.b bVar2 = new com.vk.im.engine.models.dialogs.b(((pmm) it2.next()).a, null, null, null, 0, 0, null, null, null, false, null, null, null, false, false, false, null, false, 0, false, false, null, -2, 2097151);
                Dialog a = w0w.a(w2wVar, bVar2, null);
                vjm vjmVar = bVar2.d;
                a.cd(com.vk.im.engine.models.im_item.b.e(vjmVar.b, false, bVar2.b0, ImItemType.DIALOG, vjmVar.c, bVar2.i, 0L));
                arrayList3.add(a);
            }
            List<eeb> list2 = bVar.a;
            ProfilesSimpleInfo profilesSimpleInfo = bVar.e;
            ArrayList arrayList4 = new ArrayList();
            for (eeb eebVar : list2) {
                LinkedHashMap linkedHashMap = profilesSimpleInfo.e;
                yta ytaVar = eebVar.a;
                Long l2 = ytaVar.g;
                if (l2 != null) {
                    long longValue = l2.longValue();
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    l = Long.valueOf(Peer.a.d(longValue));
                } else {
                    l = null;
                }
                Group group = (Group) linkedHashMap.get(l);
                if (group != null) {
                    Channel c = tua.c(eebVar, group);
                    vjm vjmVar2 = ytaVar.d.b;
                    int i = vjmVar2.b;
                    int i2 = vjmVar2.c;
                    ImItemType imItemType = ImItemType.CHANNEL;
                    Msg msg = eebVar.b;
                    c.P = com.vk.im.engine.models.im_item.b.e(i, false, i2, imItemType, i2, msg != null ? msg.b : 0, ytaVar.a);
                    arrayList4.add(c);
                }
            }
            List D0 = j5g.D0(new b(), j5g.u0(arrayList4, arrayList3));
            ArrayList arrayList5 = new ArrayList(c5g.u(D0, 10));
            Iterator it3 = D0.iterator();
            while (it3.hasNext()) {
                arrayList5.add(Long.valueOf(((a5w) it3.next()).t3().a));
            }
            String str = "CacheHistoryIds: " + arrayList2 + " <> serverHistoryIds: " + arrayList5;
            L l3 = L.a;
            l3.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l3, L.LogType.d, new Object[]{"MethodFloodFix", str});
            }
            com.vk.metrics.eventtracking.b.a.q(new C3164a(str));
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x021d  */
        /* JADX WARN: Removed duplicated region for block: B:102:0x019e  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0172  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x019b  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0216  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x022a  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x024d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(w2w w2wVar, d5w d5wVar, wy1 wy1Var) {
            Object obj;
            ArrayList arrayList;
            int i;
            d8w.b bVar;
            x7w x7wVar;
            x7w x7wVar2;
            String sb;
            List<eeb> list;
            List<eeb> list2;
            Iterator<T> it;
            List<pmm> list3;
            List<pmm> list4;
            b5w t3;
            com.vk.im.engine.models.im_item.a meta = w2wVar.I0().j().getMeta();
            Iterator<T> it2 = d5wVar.a.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (epx.f(((a5w) obj).y9(), wy1Var.a)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            a5w a5wVar = (a5w) obj;
            Long valueOf = (a5wVar == null || (t3 = a5wVar.t3()) == null) ? null : Long.valueOf(t3.a);
            List<a5w> list5 = d5wVar.a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list5) {
                if (((a5w) obj2).M8() == ImItemType.DIALOG) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Long.valueOf(((a5w) it3.next()).t3().a));
            }
            d8w.b bVar2 = this.e;
            if (bVar2 == null || (list4 = bVar2.b) == null) {
                arrayList = null;
            } else {
                List<pmm> list6 = list4;
                arrayList = new ArrayList(c5g.u(list6, 10));
                Iterator<T> it4 = list6.iterator();
                while (it4.hasNext()) {
                    arrayList.add(Long.valueOf(((pmm) it4.next()).a.a));
                }
            }
            d8w.b bVar3 = this.e;
            int i2 = 0;
            if (bVar3 != null && (list3 = bVar3.b) != null) {
                List<pmm> list7 = list3;
                if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                    Iterator<T> it5 = list7.iterator();
                    i = 0;
                    while (it5.hasNext()) {
                        if (((pmm) it5.next()).b != null && (i = i + 1) < 0) {
                            e43.s();
                            throw null;
                        }
                    }
                    bVar = this.e;
                    if (bVar != null && (list = bVar.a) != null) {
                        list2 = list;
                        if ((list2 instanceof Collection) || !list2.isEmpty()) {
                            it = list2.iterator();
                            while (it.hasNext()) {
                                if (((eeb) it.next()).b != null && (i2 = i2 + 1) < 0) {
                                    e43.s();
                                    throw null;
                                }
                            }
                        }
                    }
                    int i3 = i + i2;
                    String g0 = j5g.g0(d5wVar.c, ", ", X3.j.d, X3.j.e, 0, new wr0(24), 24);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(wy1Var);
                    sb2.append(" <> AnchorForApi: ");
                    StringBuilder sb3 = new StringBuilder("conversations");
                    x7w x7wVar3 = wy1Var.a;
                    x7wVar = wy1Var.b;
                    x7wVar2 = x7w.g;
                    sb3.append(x7wVar3.equals(x7wVar2) ? BundleUtil.UNDERLINE_TAG + com.vk.im.engine.models.im_item.b.d(wy1Var.a) : "_0");
                    String sb4 = sb3.toString();
                    StringBuilder sb5 = new StringBuilder(RTCStatsConstants.KEY_CHANNELS);
                    if (x7wVar.equals(x7wVar2)) {
                        StringBuilder sb6 = new StringBuilder(BundleUtil.UNDERLINE_TAG);
                        sb6.append(com.vk.im.engine.models.im_item.b.d(x7wVar));
                        sb6.append('_');
                        Long c = com.vk.im.engine.models.im_item.b.c(x7wVar);
                        sb6.append(c != null ? c.longValue() : 0L);
                        sb = sb6.toString();
                    } else {
                        sb = "_0_0";
                    }
                    sb5.append(sb);
                    sb2.append(j5g.g0(e43.l(sb4, sb5.toString()), StringUtils.COMMA, null, null, 0, null, 62));
                    sb2.append(" <> DialogByAnchor: ");
                    sb2.append(valueOf);
                    sb2.append(" <> HistoryDialogIds: ");
                    sb2.append(arrayList3);
                    sb2.append(" <> HistoryExpired: ");
                    sb2.append(g0);
                    sb2.append(" <> ResponseDialogsIds: ");
                    sb2.append(arrayList);
                    sb2.append(" <> ResponseMsgSize: ");
                    sb2.append(i3);
                    sb2.append(" <> Total: ");
                    d8w.b bVar4 = this.e;
                    sb2.append(bVar4 == null ? Integer.valueOf(bVar4.d) : null);
                    sb2.append(", ");
                    d8w.b bVar5 = this.e;
                    sb2.append(bVar5 != null ? Integer.valueOf(bVar5.c) : null);
                    sb2.append(" <> ");
                    sb2.append(meta);
                    String sb7 = sb2.toString();
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"MethodFloodFix", sb7});
                    }
                    com.vk.metrics.eventtracking.b.a.q(new C3164a(sb7));
                }
            }
            i = 0;
            bVar = this.e;
            if (bVar != null) {
                list2 = list;
                if (list2 instanceof Collection) {
                }
                it = list2.iterator();
                while (it.hasNext()) {
                }
            }
            int i32 = i + i2;
            String g02 = j5g.g0(d5wVar.c, ", ", X3.j.d, X3.j.e, 0, new wr0(24), 24);
            StringBuilder sb22 = new StringBuilder();
            sb22.append(wy1Var);
            sb22.append(" <> AnchorForApi: ");
            StringBuilder sb32 = new StringBuilder("conversations");
            x7w x7wVar32 = wy1Var.a;
            x7wVar = wy1Var.b;
            x7wVar2 = x7w.g;
            if (x7wVar32.equals(x7wVar2)) {
            }
            sb32.append(x7wVar32.equals(x7wVar2) ? BundleUtil.UNDERLINE_TAG + com.vk.im.engine.models.im_item.b.d(wy1Var.a) : "_0");
            String sb42 = sb32.toString();
            StringBuilder sb52 = new StringBuilder(RTCStatsConstants.KEY_CHANNELS);
            if (x7wVar.equals(x7wVar2)) {
            }
            sb52.append(sb);
            sb22.append(j5g.g0(e43.l(sb42, sb52.toString()), StringUtils.COMMA, null, null, 0, null, 62));
            sb22.append(" <> DialogByAnchor: ");
            sb22.append(valueOf);
            sb22.append(" <> HistoryDialogIds: ");
            sb22.append(arrayList3);
            sb22.append(" <> HistoryExpired: ");
            sb22.append(g02);
            sb22.append(" <> ResponseDialogsIds: ");
            sb22.append(arrayList);
            sb22.append(" <> ResponseMsgSize: ");
            sb22.append(i32);
            sb22.append(" <> Total: ");
            d8w.b bVar42 = this.e;
            sb22.append(bVar42 == null ? Integer.valueOf(bVar42.d) : null);
            sb22.append(", ");
            d8w.b bVar52 = this.e;
            sb22.append(bVar52 != null ? Integer.valueOf(bVar52.c) : null);
            sb22.append(" <> ");
            sb22.append(meta);
            String sb72 = sb22.toString();
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
            }
            com.vk.metrics.eventtracking.b.a.q(new C3164a(sb72));
        }
    }

    public static Pair a(d8w.b bVar, boolean z) {
        x7w x7wVar;
        pmm pmmVar = (pmm) j5g.k0(bVar.b);
        x7w x7wVar2 = null;
        if (pmmVar != null) {
            com.vk.im.engine.models.dialogs.a aVar = pmmVar.a;
            vjm vjmVar = aVar.c;
            Pair<Integer, Integer> pair = com.vk.im.engine.models.im_item.b.a;
            x7wVar = com.vk.im.engine.models.im_item.b.e(z ? vjmVar.b : 0, false, aVar.L, ImItemType.DIALOG, vjmVar.c, 0, 0L);
        } else {
            x7wVar = null;
        }
        eeb eebVar = (eeb) j5g.k0(bVar.a);
        if (eebVar != null) {
            yta ytaVar = eebVar.a;
            vjm vjmVar2 = ytaVar.d.b;
            Pair<Integer, Integer> pair2 = com.vk.im.engine.models.im_item.b.a;
            int i = z ? vjmVar2.b : 0;
            int i2 = vjmVar2.c;
            x7wVar2 = com.vk.im.engine.models.im_item.b.e(i, false, i2, ImItemType.CHANNEL, i2, 0, ytaVar.a);
        }
        return new Pair(x7wVar, x7wVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r3.compareTo(r4 == null ? xsna.x7w.g : r4) < 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x7w b(boolean z, boolean z2, Triple triple, Pair pair) {
        x7w x7wVar;
        x7w x7wVar2 = (x7w) triple.d();
        x7w x7wVar3 = (x7w) triple.g();
        x7w x7wVar4 = (x7w) triple.h();
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        if (!z2 || z) {
            if (!z && x7wVar3 != null) {
                if (intValue <= intValue2 || !x7wVar2.equals(x7w.g)) {
                    if (x7wVar2.compareTo(x7wVar4 == null ? x7w.g : x7wVar4) >= 0) {
                    }
                }
            }
            x7wVar = x7wVar4;
            L.d(new mjh(x7wVar2, x7wVar3, x7wVar4, x7wVar, 1));
            return x7wVar;
        }
        x7wVar = x7wVar3;
        L.d(new mjh(x7wVar2, x7wVar3, x7wVar4, x7wVar, 1));
        return x7wVar;
    }

    public static d5w c(final w2w w2wVar, final wy1 wy1Var, int i, boolean z) {
        int i2;
        wy1 wy1Var2;
        com.vk.im.engine.models.im_item.a meta = w2wVar.I0().j().getMeta();
        if (meta != null) {
            int a2 = cq.a(w2wVar);
            int j = w2wVar.I0().system().j();
            if (meta.e && meta.c == a2 && meta.d == j && epx.f(meta.a, wy1Var.a) && epx.f(meta.b, wy1Var.b)) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"IM_ITEMS_LOADER ImItemHistoryRemoteLoader. Skip network loading"});
                }
                return e5w.a.a(w2wVar, wy1Var, i);
            }
        }
        a aVar = (a) a.getValue();
        if (aVar != null) {
            List<wy1> list = aVar.d;
            if ((list instanceof Collection) && list.isEmpty()) {
                i2 = 0;
            } else {
                Iterator<T> it = list.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (epx.f((wy1) it.next(), wy1Var) && (i2 = i2 + 1) < 0) {
                        e43.s();
                        throw null;
                    }
                }
            }
            if (i2 == aVar.a) {
                d5w a3 = e5w.a.a(w2wVar, wy1Var, i);
                bpn0 bpn0Var = a;
                a aVar2 = (a) bpn0Var.getValue();
                if (aVar2 != null && aVar2.b) {
                    a3 = d5w.a(a3, null, null, null, false, 255);
                }
                a aVar3 = (a) bpn0Var.getValue();
                if (aVar3 != null && (wy1Var2 = (wy1) j5g.k0(aVar3.d)) != null && !aVar3.c.getAndSet(true)) {
                    try {
                        aVar3.a(w2wVar, a3, wy1Var2);
                        a.b(w2wVar);
                        return a3;
                    } catch (Exception e) {
                        com.vk.metrics.eventtracking.b.a.q(new a.C3164a("Cannot create message. Cause " + e));
                    }
                }
                return a3;
            }
        }
        final d8w.b bVar = (d8w.b) aqw.n(w2wVar, new bv1(18, new i5w(wy1Var, i, Source.NETWORK, z), w2wVar)).g();
        L l2 = L.a;
        l2.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l2, L.LogType.d, new Object[]{"IM_ITEMS_LOADER ImItemHistoryRemoteLoader.loadFromNetwork: response received"});
        }
        Pair a4 = a(bVar, false);
        final x7w x7wVar = (x7w) a4.d();
        final x7w x7wVar2 = (x7w) a4.g();
        final boolean z2 = bVar.a.size() + bVar.b.size() < i;
        bpn0 bpn0Var2 = a;
        a aVar4 = (a) bpn0Var2.getValue();
        if (aVar4 != null) {
            aVar4.e = bVar;
        }
        w2wVar.I0().u(new izs() { // from class: xsna.j5w
            /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                java.lang.NullPointerException
                */
            @Override // xsna.izs
            public final java.lang.Object invoke(
            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
                	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                */
            /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                java.lang.NullPointerException
                */
        });
        a aVar5 = (a) bpn0Var2.getValue();
        if (aVar5 != null) {
            List<wy1> list2 = aVar5.d;
            x7w x7wVar3 = wy1Var.a;
            x7w x7wVar4 = x7w.g;
            if (!x7wVar3.equals(x7wVar4) || !wy1Var.b.equals(x7wVar4)) {
                list2.add(wy1Var);
                if (list2.size() > aVar5.a) {
                    g5g.H(list2);
                }
            }
        }
        l2.getClass();
        if (!L.m(loggerOutputTarget)) {
            L.u(l2, L.LogType.d, new Object[]{"IM_ITEMS_LOADER ImItemHistoryRemoteLoader.load: merging completed, loading from cache"});
        }
        return e5w.a.a(w2wVar, wy1Var, i);
    }
}
