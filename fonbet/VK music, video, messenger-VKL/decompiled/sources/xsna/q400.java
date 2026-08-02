package xsna;

import android.os.SystemClock;
import com.vk.im.reporters.api.engine.LongPollReporter;
import com.vk.metrics.eventtracking.Event;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: LongPollReporterImpl.kt */
/* loaded from: classes5.dex */
public final class q400 implements LongPollReporter {
    public static long b;
    public static final q400 a = new q400();
    public static final HashMap<LongPollReporter.LongPollTask, Collection<Integer>> c = new HashMap<>();
    public static final HashMap<LongPollReporter.LongPollTask, Collection<Integer>> d = new HashMap<>();

    public static void e(long j) {
        int i;
        int i2;
        int i3 = 0;
        String str = j >= 2000 ? "CRUCIAL.IM.LONG_POLL_STORAGE_2000MS" : j >= 1000 ? "CRUCIAL.IM.LONG_POLL_STORAGE_1000MS" : j >= 500 ? "CRUCIAL.IM.LONG_POLL_STORAGE_500MS" : null;
        if (str == null) {
            return;
        }
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g(str);
        aVar.b("storage_users_count", 0);
        aVar.b("storage_dialogs_count", 0);
        aVar.b("storage_dialogs_members_count", 0);
        aVar.b("storage_msgs_count", 0);
        aVar.j(e43.l("FirebaseTracker", "LoggingTracker"));
        List l = e43.l(LongPollReporter.LongPollTask.DIALOG_LEAVE_LP_TASK, LongPollReporter.LongPollTask.DIALOG_MEMBER_ADD_LP_TASK, LongPollReporter.LongPollTask.DIALOG_MEMBER_REMOVE_LP_TASK, LongPollReporter.LongPollTask.DIALOG_RETURN_LP_TASK);
        HashMap<LongPollReporter.LongPollTask, Collection<Integer>> hashMap = d;
        if (hashMap.isEmpty()) {
            i = 0;
        } else {
            Iterator<Map.Entry<LongPollReporter.LongPollTask, Collection<Integer>>> it = hashMap.entrySet().iterator();
            i = 0;
            while (it.hasNext()) {
                if (l.contains(it.next().getKey())) {
                    i++;
                }
            }
        }
        if (i > 0) {
            List list = l;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Collection<Integer> collection = hashMap.get((LongPollReporter.LongPollTask) it2.next());
                if (collection == null) {
                    collection = EmptyList.b;
                }
                arrayList.add(collection);
            }
            Iterator it3 = arrayList.iterator();
            int i4 = 0;
            while (it3.hasNext()) {
                i4 += j5g.F0((Collection) it3.next());
            }
            aVar.b("dialog_member_update_event_count", Integer.valueOf(i));
            aVar.b("dialog_member_update_storage_duration", Integer.valueOf(i4));
        }
        LongPollReporter.LongPollTask longPollTask = LongPollReporter.LongPollTask.DIALOG_CNV_READ_TILL_FOR_INCOMING_TASK;
        boolean containsKey = hashMap.containsKey(longPollTask);
        HashMap<LongPollReporter.LongPollTask, Collection<Integer>> hashMap2 = c;
        if (containsKey) {
            Collection<Integer> collection2 = hashMap2.get(longPollTask);
            if (collection2 == null) {
                collection2 = EmptyList.b;
            }
            Collection<Integer> collection3 = hashMap.get(longPollTask);
            if (collection3 == null) {
                collection3 = EmptyList.b;
            }
            int F0 = j5g.F0(collection3) + j5g.F0(collection2);
            aVar.b("dialog_read_till_in_events_count", Integer.valueOf(collection3.size()));
            aVar.b("dialog_read_till_in_storage_duration", Integer.valueOf(F0));
        }
        LongPollReporter.LongPollTask longPollTask2 = LongPollReporter.LongPollTask.DIALOG_CNV_READ_TILL_FOR_OUTGOING_TASK;
        if (hashMap.containsKey(longPollTask2)) {
            Collection<Integer> collection4 = hashMap2.get(longPollTask2);
            if (collection4 == null) {
                collection4 = EmptyList.b;
            }
            Collection<Integer> collection5 = hashMap.get(longPollTask2);
            if (collection5 == null) {
                collection5 = EmptyList.b;
            }
            int F02 = j5g.F0(collection5) + j5g.F0(collection4);
            aVar.b("dialog_read_till_out_events_count", Integer.valueOf(collection5.size()));
            aVar.b("dialog_read_till_out_storage_duration", Integer.valueOf(F02));
        }
        LongPollReporter.LongPollTask longPollTask3 = LongPollReporter.LongPollTask.CNV_MSG_ADD_BATCH_TASK;
        if (hashMap.containsKey(longPollTask3)) {
            Collection<Integer> collection6 = hashMap2.get(longPollTask3);
            if (collection6 == null) {
                collection6 = EmptyList.b;
            }
            Collection<Integer> collection7 = hashMap.get(longPollTask3);
            if (collection7 == null) {
                collection7 = EmptyList.b;
            }
            aVar.b("msg_add_events_count", Integer.valueOf(collection7.size()));
            aVar.b("msg_add_find_missed_duration", Integer.valueOf(j5g.F0(collection6)));
            aVar.b("msg_add_storage_duration", Integer.valueOf(j5g.F0(collection7)));
        }
        List l2 = e43.l(LongPollReporter.LongPollTask.CNV_MSG_DELETE_TASK, LongPollReporter.LongPollTask.CNV_MSG_DELETE_TILL_TASK);
        if (hashMap.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<Map.Entry<LongPollReporter.LongPollTask, Collection<Integer>>> it4 = hashMap.entrySet().iterator();
            i2 = 0;
            while (it4.hasNext()) {
                if (l2.contains(it4.next().getKey())) {
                    i2++;
                }
            }
        }
        if (i2 > 0) {
            List list2 = l2;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator it5 = list2.iterator();
            while (it5.hasNext()) {
                Collection<Integer> collection8 = hashMap.get((LongPollReporter.LongPollTask) it5.next());
                if (collection8 == null) {
                    collection8 = EmptyList.b;
                }
                arrayList2.add(collection8);
            }
            Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                i3 += j5g.F0((Collection) it6.next());
            }
            aVar.b("msg_delete_events_count", Integer.valueOf(i2));
            aVar.b("msg_delete_storage_duration", Integer.valueOf(i3));
        }
        LongPollReporter.LongPollTask longPollTask4 = LongPollReporter.LongPollTask.USER_MERGE_TASK;
        if (hashMap.containsKey(longPollTask4)) {
            Collection<Integer> collection9 = hashMap.get(longPollTask4);
            if (collection9 == null) {
                collection9 = EmptyList.b;
            }
            aVar.b("users_merge_storage_duration", Integer.valueOf(j5g.F0(collection9)));
        }
        com.vk.metrics.eventtracking.b.a.k(aVar.e());
    }

    @Override // com.vk.im.reporters.api.engine.LongPollReporter
    public final void a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = b;
        long j2 = uptimeMillis - j;
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g("CRUCIAL.IM.LONG_POLL");
        aVar.b("request_duration", 0L);
        aVar.b("missed_duration", Long.valueOf(j));
        aVar.b("storage_duration", Long.valueOf(j2));
        aVar.b("parse_duration", 0L);
        aVar.b("full_duration", Long.valueOf(uptimeMillis));
        aVar.a(Boolean.FALSE, "apply_spaces");
        aVar.i("StatlogTracker");
        bVar.k(aVar.e());
        try {
            e(j2);
        } catch (Throwable unused) {
        }
    }

    @Override // com.vk.im.reporters.api.engine.LongPollReporter
    public final void b() {
        b = SystemClock.uptimeMillis();
    }

    @Override // com.vk.im.reporters.api.engine.LongPollReporter
    public final void c(LongPollReporter.LongPollTask longPollTask, long j) {
        HashMap<LongPollReporter.LongPollTask, Collection<Integer>> hashMap = c;
        Collection<Integer> collection = hashMap.get(longPollTask);
        if (collection == null) {
            collection = new ArrayList<>();
            hashMap.put(longPollTask, collection);
        }
        collection.add(Integer.valueOf((int) j));
    }

    @Override // com.vk.im.reporters.api.engine.LongPollReporter
    public final void d(LongPollReporter.LongPollTask longPollTask, long j) {
        HashMap<LongPollReporter.LongPollTask, Collection<Integer>> hashMap = d;
        Collection<Integer> collection = hashMap.get(longPollTask);
        if (collection == null) {
            collection = new ArrayList<>();
            hashMap.put(longPollTask, collection);
        }
        collection.add(Integer.valueOf((int) j));
    }
}
