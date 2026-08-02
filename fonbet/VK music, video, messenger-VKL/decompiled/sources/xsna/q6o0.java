package xsna;

import android.database.Cursor;
import android.os.Trace;
import com.vk.api.generated.messages.dto.MessagesCountersFilterDto;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MessageSource;
import com.vk.im.engine.internal.api_commands.diff.ExtendedFilter;
import com.vk.im.engine.internal.api_commands.diff.MessageFlag;
import com.vk.im.engine.internal.longpoll.MissedLoaderContactsNotFoundException;
import com.vk.im.engine.internal.longpoll.polling_tasks.messages.LoopedMissedLoaderHistoryMessagesException;
import com.vk.im.engine.internal.longpoll.tasks.ContactsRemoveLpTask;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.dialogs.FoldersSupportedType;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.reporters.api.engine.LongPollExpiredReporter;
import com.vk.im.reporters.api.engine.LongPollHistoryReporter;
import com.vk.im.reporters.api.util.PerformanceReporters;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.a400;
import xsna.bsj;
import xsna.te20;
import xsna.v400;

/* compiled from: TaskLongPollHistoryMessagesDiffImpl.kt */
/* loaded from: classes2.dex */
public final class q6o0 implements o6o0 {
    public static final List<ExtendedFilter> c = e43.l(ExtendedFilter.COUNTERS, ExtendedFilter.FOLDERS, ExtendedFilter.FOLDERS_WITH_PEERS, ExtendedFilter.MESSAGES, ExtendedFilter.SERVER_VERSION, ExtendedFilter.CREDENTIALS, ExtendedFilter.SERVER_TIME);
    public static final List<MessagesCountersFilterDto> d = e43.l(MessagesCountersFilterDto.MESSAGES, MessagesCountersFilterDto.MESSAGES_UNREAD_UNMUTED, MessagesCountersFilterDto.MESSAGES_ARCHIVE, MessagesCountersFilterDto.MESSAGES_ARCHIVE_UNREAD, MessagesCountersFilterDto.MESSAGES_ARCHIVE_UNREAD_UNMUTED, MessagesCountersFilterDto.MESSAGES_ARCHIVE_MENTIONS_COUNT, MessagesCountersFilterDto.MESSAGE_REQUESTS, MessagesCountersFilterDto.MESSAGES_FOLDERS, MessagesCountersFilterDto.BUSINESS_NOTIFY, MessagesCountersFilterDto.BUSINESS_NOTIFY_ALL);
    public final aox a;
    public final r4k b;

    public q6o0(aox aoxVar, r4k r4kVar) {
        this.a = aoxVar;
        this.b = r4kVar;
        LongPollType longPollType = LongPollType.MESSAGES;
    }

    public static ListBuilder b(w2w w2wVar, te20.b bVar, me20 me20Var, LongPollExpiredReporter.Reason reason, boolean z) {
        w2w w2wVar2;
        List<MessageFlag> list;
        long j;
        w2w w2wVar3 = w2wVar;
        ListBuilder e = e43.e();
        if (reason != null) {
            e.add(new pd3(w2wVar3, reason));
        }
        if (reason != LongPollExpiredReporter.Reason.LOOPED_MISSED_LOADER) {
            for (bsj bsjVar : bVar.a) {
                long a = bsjVar.a();
                Map<Integer, List<MessageFlag>> map = bsjVar.g;
                int b = bsjVar.b(w2wVar3);
                for (Map.Entry<Integer, List<MessageFlag>> entry : map.entrySet()) {
                    int intValue = entry.getKey().intValue();
                    List<MessageFlag> value = entry.getValue();
                    if (value.contains(MessageFlag.DELETED) || value.contains(MessageFlag.CASPER_DELETION)) {
                        list = value;
                        e.add(new gi30(w2wVar3, intValue, intValue, a, b));
                    } else {
                        list = value;
                    }
                    if (list.contains(MessageFlag.EDITED)) {
                        w2wVar3 = w2wVar;
                        e.add(new pi30(w2wVar3, intValue, intValue, a));
                    } else {
                        w2wVar3 = w2wVar;
                    }
                    if (list.contains(MessageFlag.RESTORED)) {
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        e.add(new zxf(w2wVar3, Peer.a.b(a), intValue));
                    }
                    if (list.contains(MessageFlag.LISTENED_AUDIO)) {
                        Serializer.c<Peer> cVar2 = Peer.CREATOR;
                        j = a;
                        e.add(new vxf(w2wVar3, Peer.a.b(a), intValue, true));
                    } else {
                        j = a;
                    }
                    MessageFlag messageFlag = MessageFlag.IMPORTANT;
                    if (list.contains(messageFlag) || list.contains(MessageFlag.UNIMPORTANT)) {
                        Serializer.c<Peer> cVar3 = Peer.CREATOR;
                        e.add(new rxf(w2wVar3, Peer.a.b(j), intValue, list.contains(messageFlag)));
                    }
                    a = j;
                }
                for (k9x k9xVar : bsjVar.f) {
                    e.add(new gi30(w2wVar3, k9xVar.b, k9xVar.c, bsjVar.a(), bsjVar.b(w2wVar3)));
                    w2wVar3 = w2wVar;
                }
                List<k9x> list2 = bsjVar.e;
                for (k9x k9xVar2 : list2) {
                    e.add(new pi30(w2wVar, k9xVar2.b, k9xVar2.c, bsjVar.a()));
                }
                Iterator<T> it = bsjVar.h.iterator();
                while (it.hasNext()) {
                    int intValue2 = ((Number) it.next()).intValue();
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((k9x) it2.next()).e(intValue2)) {
                                break;
                            }
                        }
                    }
                    if (!map.isEmpty()) {
                        for (Map.Entry<Integer, List<MessageFlag>> entry2 : map.entrySet()) {
                            int intValue3 = entry2.getKey().intValue();
                            List<MessageFlag> value2 = entry2.getValue();
                            if (intValue3 != intValue2 || !value2.contains(MessageFlag.EDITED)) {
                            }
                        }
                    }
                    e.add(new pi30(w2wVar, intValue2, intValue2, bsjVar.a()));
                }
                w2wVar3 = w2wVar;
            }
            e.add(new com.vk.im.engine.internal.longpoll.tasks.a(w2wVar, bVar.a, bVar.b, bVar.j, reason != null, z));
        }
        ai30 ai30Var = bVar.c;
        if (ai30Var != null) {
            w2wVar2 = w2wVar;
            e.add(new e5q0(w2wVar2, ai30Var.a, ai30Var.b, null, ai30Var.e, ai30Var.d, ai30Var.g, ai30Var.h, ai30Var.i, ai30Var.f));
            e.add(new aim(ai30Var.c, w2wVar2));
        } else {
            w2wVar2 = w2wVar;
        }
        List<spm> list3 = bVar.d;
        if (list3 != null) {
            e.add(new bqm(list3, w2wVar2));
        }
        if (me20Var != null) {
            if (me20Var.d) {
                e.add(new ucj(w2wVar2));
            } else {
                List x = rdi.x(me20Var.c);
                if (x != null) {
                    e.add(new ContactsRemoveLpTask(w2wVar2, x));
                }
                List x2 = rdi.x(me20Var.b);
                if (x2 != null) {
                    e.add(new com.vk.im.engine.internal.longpoll.tasks.b(w2wVar2, x2));
                }
            }
            w2wVar2.getConfig().l().X0(me20Var.a);
            wak wakVar = me20Var.e;
            if (wakVar != null) {
                List list4 = (List) wakVar.c;
                if (list4 != null) {
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        long j2 = ((ke20) it3.next()).a;
                        Serializer.c<Peer> cVar4 = Peer.CREATOR;
                        e.add(new x6p(w2wVar2, Peer.a.b(j2)));
                    }
                }
                List list5 = (List) wakVar.b;
                if (list5 != null) {
                    Iterator it4 = list5.iterator();
                    while (it4.hasNext()) {
                        long j3 = ((ke20) it4.next()).a;
                        Serializer.c<Peer> cVar5 = Peer.CREATOR;
                        e.add(new h7p(w2wVar2, Peer.a.b(j3)));
                    }
                }
            }
        }
        return e.g();
    }

    public static boolean d(bsj bsjVar, w2w w2wVar) {
        Boolean bool;
        boolean booleanValue;
        boolean booleanValue2;
        if (w2wVar.getExperiments().e()) {
            return true;
        }
        if (w2wVar.getExperiments().E()) {
            com.vk.im.engine.models.dialogs.a aVar = bsjVar.a;
            if (aVar != null) {
                booleanValue2 = aVar.C;
            } else {
                bsj.a aVar2 = bsjVar.b;
                bool = aVar2 != null ? aVar2.h : null;
                booleanValue2 = bool != null ? bool.booleanValue() : false;
            }
            if (!booleanValue2 || j5g.M(bsjVar.d()) || j5g.M(bsjVar.e(w2wVar))) {
                return true;
            }
        } else {
            com.vk.im.engine.models.dialogs.a aVar3 = bsjVar.a;
            if (aVar3 != null) {
                booleanValue = aVar3.C;
            } else {
                bsj.a aVar4 = bsjVar.b;
                bool = aVar4 != null ? aVar4.h : null;
                booleanValue = bool != null ? bool.booleanValue() : false;
            }
            if (!booleanValue || j5g.M(bsjVar.d())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0355, code lost:
    
        r3 = xsna.s3q0.a;
        r2.f(r0, null);
        r3 = r8.a(com.vk.im.reporters.api.engine.LongPollHistoryReporter.Span.MISSED_TOTAL);
        r2.c(r3);
        r18 = r8;
        r22 = r13;
        r19 = r15;
        r21 = r6;
        r5 = r2;
        r3 = r38;
        r18 = r14;
        r14 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x037e, code lost:
    
        r0 = xsna.s6o0.c(r16, r3, r4, r5, r3, r7, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0383, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0384, code lost:
    
        r0 = new kotlin.Result.Failure(r0);
     */
    @Override // xsna.o6o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a400 a(w2w w2wVar, v400 v400Var, Long l) throws Exception {
        mdz mdzVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        te20.b bVar;
        List<bsj> list;
        Long l2;
        me20 me20Var;
        ListBuilder b;
        LongPollExpiredReporter.Reason reason;
        afl0 afl0Var;
        Integer num;
        boolean z;
        aox aoxVar;
        mdz a;
        mdz mdzVar2;
        Long l3;
        Long l4;
        ArrayList arrayList4;
        LongPollHistoryReporter longPollHistoryReporter;
        Long l5;
        ArrayList arrayList5;
        Object failure;
        LongPollExpiredReporter.Reason reason2;
        LongPollHistoryReporter longPollHistoryReporter2;
        ListBuilder listBuilder;
        te20.a aVar;
        Long l6;
        String str;
        ArrayList arrayList6;
        ArrayList arrayList7;
        w2w w2wVar2 = w2wVar;
        Integer num2 = 30;
        c();
        v400 v400Var2 = w2wVar2.getConfig().k() ? null : v400Var;
        if (w2wVar2.getConfig().k()) {
            w2wVar2.getConfig().l().X0(0L);
        }
        LongPollHistoryReporter m = w2wVar2.K().n().m(UUID.randomUUID().toString(), k9q0.p(w2wVar2) ? PerformanceReporters.ChatType.GROUP_CHAT : PerformanceReporters.ChatType.CHAT);
        mdz mdzVar3 = new mdz(0L, LongPollHistoryReporter.Span.ROOT, null);
        m.c(mdzVar3);
        v400.b bVar2 = v400Var2 instanceof v400.b ? (v400.b) v400Var2 : null;
        Long valueOf = bVar2 != null ? Long.valueOf(bVar2.a) : null;
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        f900 f900Var = f900.a;
        StringBuilder sb = new StringBuilder("Start LongPollHistoryDiff pts=");
        sb.append(valueOf);
        sb.append(" time=");
        mdz mdzVar4 = mdzVar3;
        sb.append(System.currentTimeMillis());
        f900Var.a(sb.toString());
        Long l7 = null;
        Long l8 = null;
        String str2 = null;
        boolean z2 = true;
        boolean z3 = false;
        te20.a aVar2 = null;
        while (true) {
            if (z2) {
                mdzVar = mdzVar4;
                m.c(mdzVar.a(LongPollHistoryReporter.Span.REQUEST));
            } else {
                mdzVar = mdzVar4;
            }
            Set<Long> K = sn.c(w2wVar2).K(EmptyList.b);
            ArrayList arrayList11 = new ArrayList(c5g.u(K, 10));
            Iterator<T> it = K.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                arrayList11.add(Peer.a.b(longValue));
            }
            hpm e = w2wVar2.I0().b().e();
            e.getClass();
            ArrayList arrayList12 = arrayList11;
            Long l9 = l7;
            Cursor d2 = e.b.b().d(qlb0.a(System.currentTimeMillis() - 5184000000L, " \n            SELECT d.id\n            FROM (\n                SELECT id, sort_id_server\n                FROM dialogs\n                ORDER BY sort_id_server DESC\n                LIMIT 100\n            ) d\n            WHERE EXISTS (\n                SELECT 1\n                FROM messages m\n                WHERE m.dialog_id = d.id\n                AND m.time >= ", "\n            )\n        "), null);
            ArrayList arrayList13 = new ArrayList(d2.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                if (d2.moveToFirst()) {
                    while (!d2.isAfterLast()) {
                        long j = d2.getLong(0);
                        Serializer.c<Peer> cVar2 = Peer.CREATOR;
                        arrayList13.add(Peer.a.b(j));
                        d2.moveToNext();
                    }
                }
                try {
                    Trace.endSection();
                    ArrayList arrayList14 = new ArrayList(arrayList13);
                    if (!arrayList12.isEmpty() && !arrayList14.isEmpty()) {
                        Iterator it2 = arrayList14.iterator();
                        while (it2.hasNext()) {
                            arrayList = arrayList12;
                            if (arrayList.contains((Peer) it2.next())) {
                                arrayList14.removeAll(arrayList);
                                break;
                            }
                            arrayList12 = arrayList;
                        }
                    }
                    arrayList = arrayList12;
                    if (l != null) {
                        long longValue2 = l.longValue();
                        Serializer.c<Peer> cVar3 = Peer.CREATOR;
                        Peer b2 = Peer.a.b(longValue2);
                        if (arrayList14.contains(b2) || arrayList.contains(b2)) {
                            arrayList2 = arrayList8;
                            arrayList3 = arrayList9;
                        } else {
                            arrayList2 = arrayList8;
                            arrayList3 = arrayList9;
                            if (sn.c(w2wVar2).c(l.longValue()) != null) {
                                arrayList14.add(b2);
                            }
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } else {
                        arrayList2 = arrayList8;
                        arrayList3 = arrayList9;
                    }
                    List<MessagesCountersFilterDto> list2 = z2 ? d : null;
                    List<ExtendedFilter> list3 = z2 ? c : null;
                    com.vk.im.engine.models.c experiments = w2wVar2.getExperiments();
                    ListBuilder e2 = e43.e();
                    e2.add(FoldersSupportedType.CHANNELS);
                    p4g.a(FoldersSupportedType.BUSINESS, e2, experiments.o());
                    e2.add(FoldersSupportedType.PERSONAL);
                    p4g.a(FoldersSupportedType.MANAGED_GROUPS, e2, BuildInfo.s());
                    bVar = (te20.b) fo50.v(new te20(valueOf, l8, str2, list3, list2, e2.g(), l != null ? MessageSource.DIFF_LAST_MESSAGE_PUSH : MessageSource.DIFF_LAST_MESSAGE, (!z2 || valueOf == null || w2wVar2.getConfig().l().O0() == null) ? false : true, w2wVar2.getConfig().l().O0(), w2wVar2.getConfig().n(), arrayList, arrayList14, l != null ? new Pair(Long.valueOf(l.longValue()), num2) : null, w2wVar2.Q0()), w2wVar2, "MessagesGetDiffApiCmd", 2);
                    Long l10 = bVar.f;
                    Long l11 = bVar.k;
                    list = bVar.a;
                    if (l10 != null) {
                        Long valueOf2 = Long.valueOf(l10.longValue());
                        s3q0 s3q0Var2 = s3q0.a;
                        l2 = valueOf2;
                    } else {
                        l2 = l9;
                    }
                    ArrayList arrayList15 = new ArrayList();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        Iterator it4 = it3;
                        if (((bsj) next).j) {
                            arrayList15.add(next);
                        }
                        it3 = it4;
                    }
                    ArrayList arrayList16 = new ArrayList(c5g.u(arrayList15, 10));
                    Iterator it5 = arrayList15.iterator();
                    while (it5.hasNext()) {
                        arrayList16.add(Long.valueOf(((bsj) it5.next()).a()));
                    }
                    arrayList10.addAll(arrayList16);
                    c();
                    if (z2) {
                        m.f(mdzVar.a(LongPollHistoryReporter.Span.REQUEST), null);
                    }
                    c();
                    me20Var = bVar.l;
                    boolean z4 = list.size() < 20;
                    mdz a2 = mdzVar.a(LongPollHistoryReporter.Span.UPDATE_TIME);
                    m.c(a2);
                    if (l11 != null) {
                        long longValue3 = l11.longValue();
                        xuo0.a.getClass();
                        xuo0.e(longValue3);
                        s3q0 s3q0Var3 = s3q0.a;
                    }
                    m.f(a2, null);
                    LongPollExpiredReporter.Reason reason3 = bVar.i ? LongPollExpiredReporter.Reason.LONG_POLL_HISTORY : null;
                    b = b(w2wVar2, bVar, me20Var, reason3, z4);
                    reason = reason3;
                    afl0Var = new afl0(bVar, 6);
                    bpn0 bpn0Var = s6o0.a;
                    mdz a3 = mdzVar.a(LongPollHistoryReporter.Span.PREPARE_TASKS);
                    m.c(a3);
                    Iterator<E> it6 = b.iterator();
                    while (true) {
                        boolean hasNext = it6.hasNext();
                        num = num2;
                        z = z4;
                        aoxVar = this.a;
                        if (!hasNext) {
                            break;
                        }
                        e500 e500Var = (e500) it6.next();
                        aoxVar.b();
                        if (e500Var.b) {
                            throw new IllegalStateException("Prepare data already called!");
                        }
                        e500Var.b = true;
                        e500Var.c();
                        num2 = num;
                        z4 = z;
                    }
                    aVar2 = aVar;
                    str2 = str;
                    m = longPollHistoryReporter2;
                    arrayList9 = arrayList6;
                    mdzVar4 = mdzVar2;
                    z2 = false;
                    num2 = num;
                    arrayList10 = arrayList4;
                    l7 = l3;
                    l8 = l6;
                    arrayList8 = arrayList5;
                    valueOf = l5;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
            }
        }
        Throwable a4 = Result.a(failure);
        if (a4 == null) {
            reason2 = reason;
            listBuilder = b;
            longPollHistoryReporter2 = longPollHistoryReporter;
        } else {
            if (!(a4 instanceof LoopedMissedLoaderHistoryMessagesException) && !(a4 instanceof MissedLoaderContactsNotFoundException)) {
                throw a4;
            }
            com.vk.metrics.eventtracking.b.a.a(a4);
            if (BuildInfo.h()) {
                cvk.w(a4.getMessage(), true);
            }
            LongPollExpiredReporter.Reason reason4 = LongPollExpiredReporter.Reason.LOOPED_MISSED_LOADER;
            ListBuilder<e500> b3 = b(w2wVar2, bVar, me20Var, reason4, z);
            aoxVar.b();
            for (e500 e500Var2 : b3) {
                aoxVar.b();
                if (e500Var2.b) {
                    throw new IllegalStateException("Prepare data already called!");
                }
                e500Var2.b = true;
                e500Var2.c();
            }
            reason2 = reason4;
            failure = s6o0.a(b3, w2wVar2, afl0Var, longPollHistoryReporter, a, aoxVar);
            longPollHistoryReporter2 = longPollHistoryReporter;
            listBuilder = b3;
        }
        kotlin.a.a(failure);
        c400 c400Var = (c400) failure;
        longPollHistoryReporter2.f(a, null);
        mdz a5 = mdzVar2.a(LongPollHistoryReporter.Span.SYNC_CHANGES);
        longPollHistoryReporter2.c(a5);
        w2wVar2.K0(false);
        try {
            w2wVar2.I0().u(new mtl0(w2wVar2, listBuilder, aoxVar, c400Var, 1));
            w2wVar2.K0(true);
            Iterator<E> it7 = listBuilder.iterator();
            while (it7.hasNext()) {
                ((e500) it7.next()).d(c400Var);
            }
            z300 z300Var = new z300();
            Iterator<E> it8 = listBuilder.iterator();
            while (it8.hasNext()) {
                ((e500) it8.next()).b(z300Var);
            }
            w2wVar2.K().u().a();
            longPollHistoryReporter2.f(a5, null);
            Pair pair = new Pair(z300Var, reason2);
            z300 z300Var2 = (z300) pair.d();
            boolean z5 = ((LongPollExpiredReporter.Reason) pair.g()) != null;
            if (z5) {
                w2wVar2.e1(this, new OnCacheInvalidateEvent("TaskLongPollHistoryMessagesDiffImpl", OnCacheInvalidateEvent.Reason.SPACE));
                w2wVar2.e1(this, new q680("TaskLongPollHistoryMessagesDiffImpl"));
            } else {
                w2wVar2.T0(this, z300Var2.n(w2wVar2, this, LongPollType.MESSAGES));
            }
            c();
            aVar = bVar.g;
            if (aVar != null) {
                s3q0 s3q0Var4 = s3q0.a;
            } else {
                aVar = aVar2;
            }
            Long l12 = bVar.f;
            if (l12 != null) {
                l6 = Long.valueOf(l12.longValue());
                s3q0 s3q0Var5 = s3q0.a;
            } else {
                l6 = l4;
            }
            str = bVar.h;
            L l13 = L.a;
            l13.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.LogType logType = L.LogType.d;
                StringBuilder sb2 = new StringBuilder("getDiffContent request warmup ");
                sb2.append(l != null ? "for " + l + " only" : "full");
                L.u(l13, logType, new Object[]{"getDiff", sb2.toString()});
            }
            if (z2) {
                if (l == null) {
                    arrayList7 = new ArrayList();
                    for (Object obj : list) {
                        if (d((bsj) obj, w2wVar2)) {
                            arrayList7.add(obj);
                        }
                    }
                } else {
                    arrayList7 = new ArrayList();
                    for (Object obj2 : list) {
                        if (((bsj) obj2).a() == l.longValue()) {
                            arrayList7.add(obj2);
                        }
                    }
                    z3 = true;
                }
                arrayList5.addAll(arrayList7);
                arrayList6 = arrayList3;
            } else {
                ArrayList arrayList17 = new ArrayList();
                for (Object obj3 : list) {
                    if (d((bsj) obj3, w2wVar2)) {
                        arrayList17.add(obj3);
                    }
                }
                arrayList6 = arrayList3;
                arrayList6.addAll(arrayList17);
            }
            c();
            if (str == null || z5) {
                c();
                tgl0 tgl0Var = w2wVar2.I0().b().e().b;
                String g0 = j5g.g0(arrayList4, StringUtils.COMMA, null, null, 0, null, 62);
                tgl0Var.b().execSQL("\n            UPDATE dialog_members_meta\n            SET last_update_pts = " + l3 + "\n            WHERE last_update_pts != null AND is_diff_dirty = 0 " + (arrayList4.isEmpty() ? "" : air.b(')', "AND dialog_id NOT IN (", g0)) + "\n            ");
                if (!arrayList4.isEmpty()) {
                    tgl0Var.b().execSQL(zr.a("\n                UPDATE dialog_members_meta\n                SET is_diff_dirty = 1\n                WHERE dialog_id IN (", g0, ")\n                "));
                }
                if (arrayList6.isEmpty()) {
                    L l14 = L.a;
                    l14.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l14, L.LogType.d, new Object[]{"getDiffContent", "nothing else to warmup"});
                    }
                } else if (l != null && !z3) {
                    arrayList5.addAll(arrayList6);
                }
                f900.a.a("Stop LongPollHistoryDiff hasSpaces=" + z5 + " pts=toPts time=" + System.currentTimeMillis());
                abx0 abx0Var = j5g.M(arrayList5) ? new abx0(arrayList5, l != null) : null;
                if (aVar == null) {
                    throw new IllegalArgumentException("No credentials found in response");
                }
                if (abx0Var != null) {
                    ((io.reactivex.rxjava3.disposables.g) this.b.b).b(itg0.n(new io.reactivex.rxjava3.internal.operators.single.v(new dwk(1, w2wVar2, abx0Var)).q(asu0.a.c())));
                    s3q0 s3q0Var6 = s3q0.a;
                }
                long j2 = aVar.b;
                if (l6 == null) {
                    throw new IllegalArgumentException("No serverVersion in response");
                }
                a400.b bVar3 = new a400.b(new v400.b(l6.longValue(), j2), aVar.a, aVar.c, aVar.d);
                longPollHistoryReporter2.f(mdzVar2, null);
                return bVar3;
            }
            aVar2 = aVar;
            str2 = str;
            m = longPollHistoryReporter2;
            arrayList9 = arrayList6;
            mdzVar4 = mdzVar2;
            z2 = false;
            num2 = num;
            arrayList10 = arrayList4;
            l7 = l3;
            l8 = l6;
            arrayList8 = arrayList5;
            valueOf = l5;
        } catch (Throwable th2) {
            w2wVar2.K0(true);
            throw th2;
        }
    }

    public final void c() {
        this.a.b();
    }
}
