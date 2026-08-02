package com.yandex.messaging.profile;

import android.database.Cursor;
import android.os.SystemClock;
import defpackage.g0c;
import defpackage.h3y;
import defpackage.hkw0;
import defpackage.ooc;
import defpackage.qoi0;
import defpackage.tje;
import kotlin.NotImplementedError;
import kotlin.Pair;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes15.dex */
public final class f {
    public final /* synthetic */ h3y a;

    public f(h3y h3yVar) {
        this.a = h3yVar;
    }

    public final void a(hkw0 hkw0Var) {
        Integer num;
        long j;
        boolean z;
        Integer num2;
        Object valueOf;
        Object valueOf2;
        b bVar = (b) this.a.get();
        if (!bVar.g.c) {
            return;
        }
        bVar.b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Cursor W1 = hkw0Var.W1("SELECT COUNT(*) FROM chats");
        Cursor cursor = W1;
        try {
            Cursor cursor2 = cursor;
            boolean moveToFirst = W1.moveToFirst();
            Class cls = Boolean.TYPE;
            Class cls2 = Double.TYPE;
            Class cls3 = Float.TYPE;
            Class cls4 = Short.TYPE;
            Class cls5 = Integer.TYPE;
            Class cls6 = Long.TYPE;
            if (moveToFirst) {
                g0c a = qoi0.a(Integer.class);
                if (a.equals(qoi0.a(String.class))) {
                    valueOf2 = W1.getString(0);
                } else if (a.equals(qoi0.a(cls6))) {
                    valueOf2 = Long.valueOf(W1.getLong(0));
                } else if (a.equals(qoi0.a(cls5))) {
                    valueOf2 = Integer.valueOf(W1.getInt(0));
                } else if (a.equals(qoi0.a(cls4))) {
                    valueOf2 = Short.valueOf(W1.getShort(0));
                } else if (a.equals(qoi0.a(cls3))) {
                    valueOf2 = Float.valueOf(W1.getFloat(0));
                } else if (a.equals(qoi0.a(cls2))) {
                    valueOf2 = Double.valueOf(W1.getDouble(0));
                } else if (a.equals(qoi0.a(byte[].class))) {
                    valueOf2 = W1.getBlob(0);
                } else {
                    if (!a.equals(qoi0.a(cls))) {
                        throw new NotImplementedError("No mapping defined for class " + qoi0.a(Integer.class).c());
                    }
                    valueOf2 = Boolean.valueOf(W1.getInt(0) != 0);
                }
                num = (Integer) valueOf2;
            } else {
                num = null;
            }
            ooc.g(cursor, null);
            Integer valueOf3 = Integer.valueOf(num != null ? num.intValue() : -1);
            Cursor W12 = hkw0Var.W1("SELECT COUNT(*) FROM chats WHERE \n             chat_internal_id\n                NOT IN (\n                    SELECT chat_internal_id as internal_id FROM chats_view\n                    UNION\n                    SELECT thread_internal_id as internal_id FROM threads_view\n                )\n            ");
            cursor = W12;
            try {
                Cursor cursor3 = cursor;
                if (W12.moveToFirst()) {
                    g0c a2 = qoi0.a(Integer.class);
                    j = elapsedRealtime;
                    if (a2.equals(qoi0.a(String.class))) {
                        z = false;
                        valueOf = W12.getString(0);
                    } else {
                        if (a2.equals(qoi0.a(cls6))) {
                            valueOf = Long.valueOf(W12.getLong(0));
                        } else if (a2.equals(qoi0.a(cls5))) {
                            valueOf = Integer.valueOf(W12.getInt(0));
                        } else if (a2.equals(qoi0.a(cls4))) {
                            valueOf = Short.valueOf(W12.getShort(0));
                        } else if (a2.equals(qoi0.a(cls3))) {
                            valueOf = Float.valueOf(W12.getFloat(0));
                        } else if (a2.equals(qoi0.a(cls2))) {
                            valueOf = Double.valueOf(W12.getDouble(0));
                        } else if (a2.equals(qoi0.a(byte[].class))) {
                            z = false;
                            valueOf = W12.getBlob(0);
                        } else {
                            z = false;
                            if (!a2.equals(qoi0.a(cls))) {
                                throw new NotImplementedError("No mapping defined for class " + qoi0.a(Integer.class).c());
                            }
                            valueOf = Boolean.valueOf(W12.getInt(0) != 0);
                        }
                        z = false;
                    }
                    num2 = (Integer) valueOf;
                } else {
                    j = elapsedRealtime;
                    z = false;
                    num2 = null;
                }
                ooc.g(cursor, null);
                Pair pair = new Pair(valueOf3, Integer.valueOf(num2 != null ? num2.intValue() : -1));
                int intValue = ((Number) pair.getFirst()).intValue();
                int intValue2 = ((Number) pair.getSecond()).intValue();
                if (intValue > 0) {
                    hkw0Var.r("DELETE FROM chats WHERE \n             chat_internal_id\n                NOT IN (\n                    SELECT chat_internal_id as internal_id FROM chats_view\n                    UNION\n                    SELECT thread_internal_id as internal_id FROM threads_view\n                )\n            ");
                }
                bVar.h = intValue2 > 0 ? true : z;
                bVar.c.reportEvent("tech_db_cleanup_chats", kotlin.collections.b.i(new Pair(RemoteBioParameters.TIME, Long.valueOf(SystemClock.elapsedRealtime() - j)), new Pair("all", Integer.valueOf(intValue)), new Pair("deleted", Integer.valueOf(intValue2))));
                tje.N(bVar.d, null, null, new AppDatabaseCleaner$scheduleCleanupUnusedResources$1(bVar, null), 3);
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
