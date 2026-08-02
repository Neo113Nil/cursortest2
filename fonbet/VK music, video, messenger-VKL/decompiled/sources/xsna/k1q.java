package xsna;

import android.annotation.SuppressLint;
import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.ExecutorService;

/* compiled from: EventsStorage.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class k1q {
    public final String a;
    public final ExecutorService b;
    public final bpn0 c;
    public volatile long e;
    public final bpn0 d = new bpn0(new c5o(this, 2));
    public final bpn0 f = new bpn0(new i1q(this, 0));
    public final bpn0 g = new bpn0(new wg9(this, 1));
    public final bpn0 h = new bpn0(new os0(this, 1));
    public final bpn0 i = new bpn0(new vwk(this, 1));
    public final bpn0 j = new bpn0(new yg9(this, 1));
    public final bpn0 k = new bpn0(new uia(this, 1));

    public k1q(Application application, long j, String str, ExecutorService executorService) {
        this.a = str;
        this.b = executorService;
        this.c = new bpn0(new bn(application, 2));
        this.e = j;
        executorService.execute(new j1q(this, 0));
    }

    public final SQLiteDatabase a() {
        return (SQLiteDatabase) this.d.getValue();
    }
}
