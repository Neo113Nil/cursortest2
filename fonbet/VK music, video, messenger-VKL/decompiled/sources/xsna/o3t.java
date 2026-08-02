package xsna;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: GalleryFilesCounterImpl.kt */
/* loaded from: classes6.dex */
public final class o3t implements m3t {
    public volatile Long a;
    public volatile JSONObject b;

    /* compiled from: GalleryFilesCounterImpl.kt */
    public static abstract class a {
        public final long a;
        public final long b;
        public final String c;

        /* compiled from: GalleryFilesCounterImpl.kt */
        /* renamed from: xsna.o3t$a$a, reason: collision with other inner class name */
        public static final class C3440a extends a {
        }

        /* compiled from: GalleryFilesCounterImpl.kt */
        public static final class b extends a {
        }

        /* compiled from: GalleryFilesCounterImpl.kt */
        public static final class c extends a {
        }

        /* compiled from: GalleryFilesCounterImpl.kt */
        public static final class d extends a {
        }

        public a(long j, long j2, String str) {
            this.a = j;
            this.b = j2;
            this.c = str;
        }
    }

    @Override // xsna.m3t
    public final io.reactivex.rxjava3.core.x<JSONObject> a(Context context) {
        Long l = this.a;
        JSONObject jSONObject = this.b;
        if (l != null && jSONObject != null && System.currentTimeMillis() - l.longValue() < 900000) {
            return io.reactivex.rxjava3.core.x.k(jSONObject);
        }
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime minusMonths = now.minusMonths(6L);
        LocalDateTime minusMonths2 = now.minusMonths(1L);
        LocalDateTime minusWeeks = now.minusWeeks(1L);
        LocalDateTime minusDays = now.minusDays(1L);
        sm0 sm0Var = new sm0(21);
        long longValue = ((Number) sm0Var.invoke(now)).longValue();
        long longValue2 = ((Number) sm0Var.invoke(minusMonths)).longValue();
        long longValue3 = ((Number) sm0Var.invoke(minusMonths2)).longValue();
        long longValue4 = ((Number) sm0Var.invoke(minusWeeks)).longValue();
        long longValue5 = ((Number) sm0Var.invoke(minusDays)).longValue();
        int i = 0;
        List l2 = e43.l(new a.b(longValue2, longValue, "__half_year"), new a.c(longValue3, longValue, "__last_month"), new a.d(longValue4, longValue, "__last_week"), new a.C3440a(longValue5, longValue, "__last_day"));
        a aVar = (a) j5g.a0(l2);
        if (aVar == null) {
            return io.reactivex.rxjava3.core.x.k(new JSONObject());
        }
        final yz10 a2 = iz10.a(context);
        final long j = aVar.a;
        final long j2 = aVar.b;
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.rz10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = yz10.this.a.a;
                bpn0 bpn0Var = i0q0.a;
                ArrayList arrayList = new ArrayList();
                String str = gz80.a(29) ? "date_modified" : "datetaken";
                String[] strArr = gz80.a(30) ? new String[]{"is_favorite", str, "_data", "bucket_display_name"} : new String[]{str, "_data", "bucket_display_name"};
                long j3 = j / 1000;
                long j4 = j2 / 1000;
                String concat = str.concat(" BETWEEN ? AND ?");
                String[] strArr2 = {String.valueOf(j3), String.valueOf(j4)};
                Cursor query = context2.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, concat, strArr2, null);
                if (query != null) {
                    try {
                        arrayList.addAll(rq10.d(query, str));
                        query.close();
                    } finally {
                    }
                }
                query = context2.getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, strArr, concat, strArr2, null);
                if (query == null) {
                    return arrayList;
                }
                try {
                    arrayList.addAll(rq10.d(query, str));
                    query.close();
                    return arrayList;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
        });
        asu0 asu0Var = asu0.a;
        return new io.reactivex.rxjava3.internal.operators.single.o(vVar.q(asu0Var.c()).l(new rf1(new j20(16, this, l2), 26)), new n3t(new f2s(this, 5), i)).q(asu0Var.c()).m(asu0Var.d());
    }
}
