package xsna;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1;
import androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1;
import androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: NoOpPoolStatsTracker.java */
/* loaded from: classes.dex */
public final class u370 implements gvb0 {
    public static u370 a;

    public static final kotlin.coroutines.d b(RoomDatabase roomDatabase, boolean z, ContinuationImpl continuationImpl) {
        kotlin.coroutines.c cVar;
        kotlin.coroutines.d plus;
        if (!roomDatabase.o()) {
            hpj hpjVar = roomDatabase.b;
            return (hpjVar != null ? hpjVar : null).b;
        }
        uip0 uip0Var = (uip0) continuationImpl.getContext().get(uip0.d);
        if (uip0Var != null && (cVar = uip0Var.b) != null && (plus = roomDatabase.j().plus(cVar)) != null) {
            return plus;
        }
        if (!z) {
            return roomDatabase.j();
        }
        kotlin.coroutines.d dVar = roomDatabase.c;
        if (dVar == null) {
            return null;
        }
        return dVar;
    }

    public static synchronized u370 c() {
        u370 u370Var;
        synchronized (u370.class) {
            try {
                if (a == null) {
                    a = new u370();
                }
                u370Var = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return u370Var;
    }

    public static final NotificationChannelGroup d(NotificationManager notificationManager, String str) {
        if (gz80.a(28)) {
            return notificationManager.getNotificationChannelGroup(str);
        }
        if (!gz80.a(26)) {
            return null;
        }
        for (NotificationChannelGroup notificationChannelGroup : notificationManager.getNotificationChannelGroups()) {
            if (epx.f(notificationChannelGroup.getId(), str)) {
                return notificationChannelGroup;
            }
        }
        return null;
    }

    public static final boolean e(NotificationManager notificationManager, String str) {
        if (gz80.a(28)) {
            NotificationChannelGroup d = d(notificationManager, str);
            return (d == null || d.isBlocked()) ? false : true;
        }
        if (!gz80.a(26)) {
            return true;
        }
        if (d(notificationManager, str) == null) {
            return false;
        }
        List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
        ArrayList arrayList = new ArrayList();
        for (Object obj : notificationChannels) {
            if (epx.f(((NotificationChannel) obj).getGroup(), str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String id = ((NotificationChannel) it.next()).getId();
            if (!gz80.a(26)) {
                return true;
            }
            NotificationChannel notificationChannel = gz80.a(26) ? notificationManager.getNotificationChannel(id) : null;
            if (notificationChannel != null && notificationChannel.getImportance() != 0) {
                return true;
            }
        }
        return false;
    }

    public static final Object f(RoomDatabase roomDatabase, boolean z, boolean z2, izs izsVar) {
        roomDatabase.a();
        roomDatabase.b();
        return wrg0.a(new DBUtil__DBUtil_androidKt$performBlocking$1(roomDatabase, null, izsVar, z2, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(RoomDatabase roomDatabase, spj spjVar, izs izsVar, boolean z, boolean z2) {
        vrk vrkVar;
        int i;
        RoomDatabase roomDatabase2;
        izs izsVar2;
        boolean z3;
        boolean z4;
        if (spjVar instanceof vrk) {
            vrkVar = (vrk) spjVar;
            int i2 = vrkVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vrkVar.label = i2 - Integer.MIN_VALUE;
                vrk vrkVar2 = vrkVar;
                Object obj = vrkVar2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vrkVar2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (roomDatabase.o() && roomDatabase.s() && roomDatabase.p()) {
                        DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(roomDatabase, null, izsVar, z2, z);
                        vrkVar2.label = 1;
                        Object x = roomDatabase.x(z, dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1, vrkVar2);
                        if (x != coroutineSingletons) {
                            return x;
                        }
                    } else {
                        vrkVar2.L$0 = roomDatabase;
                        vrkVar2.L$1 = izsVar;
                        vrkVar2.Z$0 = z;
                        vrkVar2.Z$1 = z2;
                        vrkVar2.label = 2;
                        kotlin.coroutines.d b = b(roomDatabase, z2, vrkVar2);
                        if (b != coroutineSingletons) {
                            roomDatabase2 = roomDatabase;
                            izsVar2 = izsVar;
                            obj = b;
                            z3 = z2;
                            z4 = z;
                        }
                    }
                }
                if (i == 1) {
                    kotlin.a.a(obj);
                    return obj;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return obj;
                }
                boolean z5 = vrkVar2.Z$1;
                boolean z6 = vrkVar2.Z$0;
                izs izsVar3 = (izs) vrkVar2.L$1;
                RoomDatabase roomDatabase3 = (RoomDatabase) vrkVar2.L$0;
                kotlin.a.a(obj);
                z3 = z5;
                z4 = z6;
                izsVar2 = izsVar3;
                roomDatabase2 = roomDatabase3;
                DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 dBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 = new DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1(roomDatabase2, null, izsVar2, z4, z3);
                vrkVar2.L$0 = null;
                vrkVar2.L$1 = null;
                vrkVar2.label = 3;
                Object k = myc0.k((kotlin.coroutines.d) obj, dBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1, vrkVar2);
                return k != coroutineSingletons ? coroutineSingletons : k;
            }
        }
        vrkVar = new vrk(spjVar);
        vrk vrkVar22 = vrkVar;
        Object obj2 = vrkVar22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vrkVar22.label;
        if (i != 0) {
        }
        DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 dBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$12 = new DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1(roomDatabase2, null, izsVar2, z4, z3);
        vrkVar22.L$0 = null;
        vrkVar22.L$1 = null;
        vrkVar22.label = 3;
        Object k2 = myc0.k((kotlin.coroutines.d) obj2, dBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$12, vrkVar22);
        if (k2 != coroutineSingletons2) {
        }
    }

    public static final Cursor h(RoomDatabase roomDatabase, xin0 xin0Var, boolean z) {
        roomDatabase.a();
        roomDatabase.b();
        Cursor query = roomDatabase.i().getWritableDatabase().query(xin0Var);
        if (z && (query instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) query;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(query.getColumnNames(), query.getCount());
                    while (query.moveToNext()) {
                        Object[] objArr = new Object[query.getColumnCount()];
                        int columnCount = query.getColumnCount();
                        for (int i = 0; i < columnCount; i++) {
                            int type = query.getType(i);
                            if (type == 0) {
                                objArr[i] = null;
                            } else if (type == 1) {
                                objArr[i] = Long.valueOf(query.getLong(i));
                            } else if (type == 2) {
                                objArr[i] = Double.valueOf(query.getDouble(i));
                            } else if (type == 3) {
                                objArr[i] = query.getString(i);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i] = query.getBlob(i);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    query.close();
                    return matrixCursor;
                } finally {
                }
            }
        }
        return query;
    }

    public lel a() {
        return new lel();
    }
}
