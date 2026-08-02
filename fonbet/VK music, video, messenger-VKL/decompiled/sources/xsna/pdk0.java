package xsna;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.telephony.TelephonyManager;
import android.util.LongSparseArray;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class pdk0 implements Callable {
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8 A[Catch: Exception -> 0x00b6, LOOP:0: B:16:0x00a4->B:18:0x00a8, LOOP_END, TryCatch #2 {Exception -> 0x00b6, blocks: (B:10:0x001b, B:15:0x0090, B:16:0x00a4, B:18:0x00a8, B:20:0x00b8, B:31:0x00c0, B:32:0x00c3, B:34:0x0045, B:37:0x004c, B:38:0x004f, B:40:0x005c, B:41:0x0075, B:14:0x008e, B:13:0x0085, B:28:0x00be), top: B:9:0x001b, inners: #0, #3 }] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        j9x it;
        String str = "";
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        try {
            String line1Number = ((TelephonyManager) context.getSystemService("phone")).getLine1Number();
            if (line1Number != null) {
                str = line1Number;
            }
        } catch (Exception unused) {
        }
        String str2 = str;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            LongSparseArray longSparseArray = new LongSparseArray();
            Cursor query = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"data1", "raw_contact_id", "display_name"}, "mimetype=? AND data2=?", new String[]{"vnd.android.cursor.item/phone_v2", "2"}, null);
            if (query != null) {
                try {
                    if (query.getCount() != 0) {
                        query.moveToFirst();
                        do {
                            long j = query.getLong(1);
                            t7j t7jVar = (t7j) longSparseArray.get(j);
                            if (t7jVar == null) {
                                t7jVar = new t7j(query.getString(2), new LinkedList());
                                u4q0 u4q0Var = zik0.a;
                                longSparseArray.put(j, t7jVar);
                            }
                            t7jVar.b.add(query.getString(0));
                        } while (query.moveToNext());
                        s3q0 s3q0Var = s3q0.a;
                        ro.e(query, null);
                        ArrayList arrayList = new ArrayList();
                        it = swe0.q(0, longSparseArray.size()).iterator();
                        while (it.d) {
                            arrayList.add((t7j) longSparseArray.valueAt(it.nextInt()));
                        }
                        return new raj(str2, arrayList);
                    }
                } finally {
                }
            }
            L.G("cursor.count = 0");
            s3q0 s3q0Var2 = s3q0.a;
            ro.e(query, null);
            ArrayList arrayList2 = new ArrayList();
            it = swe0.q(0, longSparseArray.size()).iterator();
            while (it.d) {
            }
            return new raj(str2, arrayList2);
        } catch (Exception e) {
            L.i(e);
            return new raj(str2, new ArrayList());
        }
    }
}
