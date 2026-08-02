package xsna;

import android.os.SystemClock;
import com.vk.im.engine.internal.longpoll.MissedLoaderContactsNotFoundException;
import com.vk.im.engine.internal.longpoll.polling_tasks.messages.LoopedMissedLoaderHistoryMessagesException;
import com.vk.im.reporters.api.engine.LongPollHistoryReporter;
import com.vk.im.reporters.api.engine.LongPollReporter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import xsna.os20;

/* compiled from: TaskLongPollHistoryTasksExecutionHelper.kt */
/* loaded from: classes2.dex */
public final class s6o0 {
    public static final bpn0 a = new bpn0(new vqe0(7));
    public static final Object b = pn00.k(new Pair(mgm.class, LongPollReporter.LongPollTask.DIALOG_LEAVE_LP_TASK), new Pair(ahm.class, LongPollReporter.LongPollTask.DIALOG_MEMBER_ADD_LP_TASK), new Pair(fhm.class, LongPollReporter.LongPollTask.DIALOG_MEMBER_REMOVE_LP_TASK), new Pair(ojm.class, LongPollReporter.LongPollTask.DIALOG_RETURN_LP_TASK), new Pair(fcm.class, LongPollReporter.LongPollTask.DIALOG_CNV_READ_TILL_FOR_INCOMING_TASK), new Pair(gcm.class, LongPollReporter.LongPollTask.DIALOG_CNV_READ_TILL_FOR_OUTGOING_TASK), new Pair(hxf.class, LongPollReporter.LongPollTask.CNV_MSG_ADD_BATCH_TASK), new Pair(jxf.class, LongPollReporter.LongPollTask.CNV_MSG_DELETE_TASK), new Pair(lxf.class, LongPollReporter.LongPollTask.CNV_MSG_DELETE_TILL_TASK), new Pair(i1r0.class, LongPollReporter.LongPollTask.USER_MERGE_TASK));

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            os20.a.l lVar = os20.a.l.a;
            return jw5.b(Boolean.valueOf(epx.f((os20.a) t, lVar)), Boolean.valueOf(epx.f((os20.a) t2, lVar)));
        }
    }

    public static final c400 a(List list, w2w w2wVar, afl0 afl0Var, LongPollHistoryReporter longPollHistoryReporter, mdz mdzVar, aox aoxVar) {
        LongPollReporter u = w2wVar.K().u();
        f400 f400Var = new f400();
        c400 c400Var = (c400) afl0Var.invoke();
        os20 os20Var = new os20(w2wVar, w2wVar.c(), w2wVar.getDeviceId(), longPollHistoryReporter, mdzVar);
        HashSet hashSet = new HashSet();
        while (true) {
            b(list, aoxVar, u, c400Var, f400Var);
            if (f400Var.g()) {
                u.b();
                return c400Var;
            }
            if (!hashSet.add(Integer.valueOf(f400Var.hashCode()))) {
                longPollHistoryReporter.b();
                List list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e500) it.next()).a);
                }
                throw new LoopedMissedLoaderHistoryMessagesException("Fall in infinite loop due to fail of MissedLoader in TaskLongPollHistory. Missed info: " + arrayList + " - " + f400Var);
            }
            os20Var.a(f400Var, c400Var, (os20.a[]) a.getValue(), new r6o0(aoxVar, f400Var, list, u));
            c400Var.o = true;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static final void b(List<? extends e500> list, aox aoxVar, LongPollReporter longPollReporter, c400 c400Var, f400 f400Var) {
        f400Var.f();
        for (e500 e500Var : list) {
            aoxVar.b();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            e500Var.a(c400Var, f400Var);
            LongPollReporter.LongPollTask longPollTask = (LongPollReporter.LongPollTask) b.get(e500Var.getClass());
            if (longPollTask != null) {
                longPollReporter.c(longPollTask, SystemClock.elapsedRealtime() - elapsedRealtime);
            }
        }
    }

    public static final c400 c(List list, w2w w2wVar, afl0 afl0Var, LongPollHistoryReporter longPollHistoryReporter, mdz mdzVar, aox aoxVar, int i) {
        Object failure;
        try {
            failure = a(list, w2wVar, afl0Var, longPollHistoryReporter, mdzVar, aoxVar);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            if (!(a2 instanceof LoopedMissedLoaderHistoryMessagesException) && !(a2 instanceof MissedLoaderContactsNotFoundException)) {
                throw a2;
            }
            if (i >= 3) {
                throw a2;
            }
            failure = c(list, w2wVar, afl0Var, longPollHistoryReporter, mdzVar, aoxVar, i + 1);
        }
        kotlin.a.a(failure);
        return (c400) failure;
    }
}
