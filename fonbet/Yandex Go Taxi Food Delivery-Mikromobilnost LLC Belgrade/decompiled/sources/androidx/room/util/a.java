package androidx.room.util;

import androidx.room.RoomDatabase;
import androidx.room.coroutines.g;
import defpackage.fse;
import defpackage.he01;
import defpackage.ike;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tls;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public abstract class a {
    public static final fse a(RoomDatabase roomDatabase, boolean z, ContinuationImpl continuationImpl) {
        he01 he01Var = (he01) continuationImpl.get_context().get(he01.b);
        fse fseVar = he01Var != null ? he01Var.a : null;
        if (!roomDatabase.I0()) {
            ike ikeVar = roomDatabase.a;
            fse fseVar2 = (ikeVar != null ? ikeVar : null).a;
            if (fseVar == null) {
                fseVar = EmptyCoroutineContext.a;
            }
            return fseVar2.plus(fseVar);
        }
        if (fseVar != null) {
            ike ikeVar2 = roomDatabase.a;
            return (ikeVar2 != null ? ikeVar2 : null).a.plus(fseVar);
        }
        if (!z) {
            ike ikeVar3 = roomDatabase.a;
            return (ikeVar3 != null ? ikeVar3 : null).a;
        }
        fse fseVar3 = roomDatabase.b;
        if (fseVar3 == null) {
            return null;
        }
        return fseVar3;
    }

    public static final Object b(RoomDatabase roomDatabase, boolean z, boolean z2, tls tlsVar) {
        roomDatabase.t0();
        roomDatabase.u0();
        fse fseVar = (fse) roomDatabase.i.get();
        if (fseVar == null) {
            fseVar = EmptyCoroutineContext.a;
        }
        return g.a(new DBUtil__DBUtil_androidKt$performBlocking$1(fseVar, roomDatabase, z2, z, tlsVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(tls tlsVar, RoomDatabase roomDatabase, Continuation continuation, boolean z, boolean z2) {
        DBUtil__DBUtil_androidKt$performSuspending$1 dBUtil__DBUtil_androidKt$performSuspending$1;
        int i;
        tls tlsVar2;
        RoomDatabase roomDatabase2;
        boolean z3;
        boolean z4;
        if (continuation instanceof DBUtil__DBUtil_androidKt$performSuspending$1) {
            dBUtil__DBUtil_androidKt$performSuspending$1 = (DBUtil__DBUtil_androidKt$performSuspending$1) continuation;
            int i2 = dBUtil__DBUtil_androidKt$performSuspending$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dBUtil__DBUtil_androidKt$performSuspending$1.label = i2 - Integer.MIN_VALUE;
                DBUtil__DBUtil_androidKt$performSuspending$1 dBUtil__DBUtil_androidKt$performSuspending$12 = dBUtil__DBUtil_androidKt$performSuspending$1;
                Object obj = dBUtil__DBUtil_androidKt$performSuspending$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dBUtil__DBUtil_androidKt$performSuspending$12.label;
                if (i != 0) {
                    b.b(obj);
                    if (roomDatabase.I0() && roomDatabase.N0() && roomDatabase.J0()) {
                        DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(tlsVar, roomDatabase, null, z2, z);
                        dBUtil__DBUtil_androidKt$performSuspending$12.label = 1;
                        Object R0 = roomDatabase.R0(z, dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1, dBUtil__DBUtil_androidKt$performSuspending$12);
                        if (R0 != coroutineSingletons) {
                            return R0;
                        }
                    } else {
                        dBUtil__DBUtil_androidKt$performSuspending$12.L$0 = roomDatabase;
                        dBUtil__DBUtil_androidKt$performSuspending$12.L$1 = tlsVar;
                        dBUtil__DBUtil_androidKt$performSuspending$12.Z$0 = z;
                        dBUtil__DBUtil_androidKt$performSuspending$12.Z$1 = z2;
                        dBUtil__DBUtil_androidKt$performSuspending$12.label = 2;
                        fse a = a(roomDatabase, z2, dBUtil__DBUtil_androidKt$performSuspending$12);
                        if (a != coroutineSingletons) {
                            tlsVar2 = tlsVar;
                            roomDatabase2 = roomDatabase;
                            obj = a;
                            z3 = z;
                            z4 = z2;
                        }
                    }
                }
                if (i == 1) {
                    b.b(obj);
                    return obj;
                }
                if (i != 2) {
                    if (i == 3) {
                        b.b(obj);
                        return obj;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z5 = dBUtil__DBUtil_androidKt$performSuspending$12.Z$1;
                boolean z6 = dBUtil__DBUtil_androidKt$performSuspending$12.Z$0;
                tls tlsVar3 = (tls) dBUtil__DBUtil_androidKt$performSuspending$12.L$1;
                RoomDatabase roomDatabase3 = (RoomDatabase) dBUtil__DBUtil_androidKt$performSuspending$12.L$0;
                b.b(obj);
                z4 = z5;
                z3 = z6;
                tlsVar2 = tlsVar3;
                roomDatabase2 = roomDatabase3;
                DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 dBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 = new DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1(tlsVar2, roomDatabase2, null, z3, z4);
                dBUtil__DBUtil_androidKt$performSuspending$12.L$0 = null;
                dBUtil__DBUtil_androidKt$performSuspending$12.L$1 = null;
                dBUtil__DBUtil_androidKt$performSuspending$12.label = 3;
                Object k0 = tje.k0((fse) obj, dBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1, dBUtil__DBUtil_androidKt$performSuspending$12);
                return k0 != coroutineSingletons ? coroutineSingletons : k0;
            }
        }
        dBUtil__DBUtil_androidKt$performSuspending$1 = new DBUtil__DBUtil_androidKt$performSuspending$1(continuation);
        DBUtil__DBUtil_androidKt$performSuspending$1 dBUtil__DBUtil_androidKt$performSuspending$122 = dBUtil__DBUtil_androidKt$performSuspending$1;
        Object obj2 = dBUtil__DBUtil_androidKt$performSuspending$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dBUtil__DBUtil_androidKt$performSuspending$122.label;
        if (i != 0) {
        }
        DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 dBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$12 = new DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1(tlsVar2, roomDatabase2, null, z3, z4);
        dBUtil__DBUtil_androidKt$performSuspending$122.L$0 = null;
        dBUtil__DBUtil_androidKt$performSuspending$122.L$1 = null;
        dBUtil__DBUtil_androidKt$performSuspending$122.label = 3;
        Object k02 = tje.k0((fse) obj2, dBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$12, dBUtil__DBUtil_androidKt$performSuspending$122);
        if (k02 != coroutineSingletons2) {
        }
    }
}
