package ru.mail.libverify.n;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import ru.mail.libverify.n.c;
import ru.mail.verify.core.utils.FileLog;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;

/* loaded from: classes9.dex */
public final class d implements c {

    @NonNull
    private final Context a;

    public d(@NonNull Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ef A[LOOP:0: B:13:0x0081->B:20:0x00ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00eb A[EDGE_INSN: B:21:0x00eb->B:22:0x00eb BREAK  A[LOOP:0: B:13:0x0081->B:20:0x00ef], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3 A[Catch: all -> 0x0058, InterruptedException -> 0x005b, TryCatch #3 {InterruptedException -> 0x005b, all -> 0x0058, blocks: (B:3:0x0032, B:5:0x0050, B:10:0x005e, B:14:0x0085, B:18:0x00e5, B:28:0x00a6, B:30:0x00b8, B:32:0x00c2, B:34:0x00c8, B:35:0x00dc, B:37:0x00e3, B:45:0x00f8), top: B:2:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2 A[SYNTHETIC] */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<k> a(@NonNull c.a aVar) throws InterruptedException {
        int i;
        int i2;
        long j;
        c.a aVar2 = aVar;
        int b = aVar2.b();
        int c = aVar2.c();
        long a = aVar2.a();
        long d = aVar2.d();
        FileLog.d("KnownSmsFinder", "start query with params: depth %d, maxCount %d, maxTimeShift %d, minTimeShift %d", Integer.valueOf(b), Integer.valueOf(c), Long.valueOf(a), Long.valueOf(d));
        Cursor cursor = null;
        try {
            try {
                Cursor query = this.a.getContentResolver().query(a.b, null, null, null, "date DESC LIMIT " + b);
                if (query == null) {
                    List<k> list = Collections.EMPTY_LIST;
                    if (query != null) {
                        query.close();
                    }
                    return list;
                }
                int columnIndex = query.getColumnIndex(RTCStatsConstants.KEY_ADDRESS);
                int columnIndex2 = query.getColumnIndex("body");
                int columnIndex3 = query.getColumnIndex("date");
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                if (!query.moveToFirst()) {
                    List<k> list2 = Collections.EMPTY_LIST;
                    query.close();
                    return list2;
                }
                int i3 = 0;
                while (i3 <= b) {
                    long currentTimeMillis = System.currentTimeMillis() - query.getLong(columnIndex3);
                    if (currentTimeMillis >= 0 && currentTimeMillis >= d) {
                        if (currentTimeMillis > a) {
                            break;
                        }
                        i = b;
                        String string = query.getString(columnIndex);
                        i2 = columnIndex;
                        String string2 = query.getString(columnIndex2);
                        if (aVar2.a(string)) {
                            String b2 = aVar2.b(string2);
                            if (!TextUtils.isEmpty(b2) && !hashSet.contains(b2)) {
                                hashSet.add(b2);
                                j = a;
                                arrayList.add(new k(query.getLong(columnIndex3), string, b2));
                                if (arrayList.size() <= c) {
                                    break;
                                }
                                i3++;
                                if (query.moveToNext()) {
                                    break;
                                }
                                aVar2 = aVar;
                                b = i;
                                columnIndex = i2;
                                a = j;
                            }
                        }
                        j = a;
                        if (arrayList.size() <= c) {
                        }
                    }
                    i2 = columnIndex;
                    i = b;
                    j = a;
                    if (query.moveToNext()) {
                    }
                }
                query.close();
                return arrayList;
            } finally {
                if (0 != 0) {
                    cursor.close();
                }
            }
        } catch (InterruptedException e) {
            FileLog.e("KnownSmsFinder", "query sms database interrupted", e);
            throw e;
        } catch (Throwable th) {
            FileLog.e("KnownSmsFinder", "failed to query sms database", th);
            return Collections.EMPTY_LIST;
        }
    }
}
