package xsna;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CalendarContentRepositoryImpl.kt */
/* loaded from: classes7.dex */
public final class qz8 {
    public final ContentResolver a;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Long.valueOf(((hfw0) t2).a), Long.valueOf(((hfw0) t).a));
        }
    }

    /* compiled from: CalendarContentRepositoryImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements wzs<Cursor, Integer, String> {
        public static final b b = new b(2, Cursor.class, "getString", "getString(I)Ljava/lang/String;", 0);

        @Override // xsna.wzs
        public final String invoke(Cursor cursor, Integer num) {
            return cursor.getString(num.intValue());
        }
    }

    /* compiled from: CalendarContentRepositoryImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements wzs<Cursor, Integer, Long> {
        public static final c b = new c(2, Cursor.class, "getLong", "getLong(I)J", 0);

        @Override // xsna.wzs
        public final Long invoke(Cursor cursor, Integer num) {
            return Long.valueOf(cursor.getLong(num.intValue()));
        }
    }

    /* compiled from: CalendarContentRepositoryImpl.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements wzs<Cursor, Integer, String> {
        public static final d b = new d(2, Cursor.class, "getString", "getString(I)Ljava/lang/String;", 0);

        @Override // xsna.wzs
        public final String invoke(Cursor cursor, Integer num) {
            return cursor.getString(num.intValue());
        }
    }

    public qz8(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public static Object a(Cursor cursor, String str, wzs wzsVar) {
        int columnIndex = cursor.getColumnIndex(str);
        Integer valueOf = Integer.valueOf(columnIndex);
        if (columnIndex < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return wzsVar.invoke(cursor, Integer.valueOf(valueOf.intValue()));
        }
        return null;
    }

    public final List<hfw0> b(String str) {
        ArrayList arrayList = new ArrayList();
        long time = new Date().getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        String[] strArr = {air.b('%', "%", str), String.valueOf(calendar.getTime().getTime())};
        Uri uri = CalendarContract.Events.CONTENT_URI;
        Cursor query = this.a.query(uri, new String[]{"_id", "title", "description"}, "description like ? AND dtstart > ?", strArr, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    Long l = (Long) a(query, "_id", c.b);
                    String str2 = (String) a(query, "title", d.b);
                    String str3 = (String) a(query, "description", b.b);
                    if (l != null && str2 != null && str3 != null) {
                        arrayList.add(new hfw0(l.longValue()));
                    }
                } finally {
                }
            }
            s3q0 s3q0Var = s3q0.a;
            query.close();
        }
        return j5g.D0(new a(), arrayList);
    }
}
