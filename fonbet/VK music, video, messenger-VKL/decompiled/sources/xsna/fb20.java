package xsna;

import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import xsna.oyg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class fb20 implements oyg0.a {
    public static int a(int i, int i2, int i3, int i4) {
        return ((i / i2) * i3) + i4;
    }

    public static io.reactivex.rxjava3.core.w b(TimeUnit timeUnit, String str, String str2) {
        io.reactivex.rxjava3.core.w a = io.reactivex.rxjava3.schedulers.a.a();
        Objects.requireNonNull(timeUnit, str);
        Objects.requireNonNull(a, str2);
        return a;
    }

    @Override // xsna.oyg0.a
    public Object apply(Object obj) {
        return (List) oyg0.v(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new v1v());
    }
}
