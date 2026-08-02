package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.yandex.messaging.contacts.sync.SyncContactController$SyncState;
import com.yandex.messaging.contacts.sync.b;
import com.yandex.messaging.core.net.entities.ContactsUploadData;
import com.yandex.messaging.core.net.entities.ContactsUploadParam;
import com.yandex.messaging.internal.authorized.sync.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes15.dex */
public final class gd21 {
    public static final int[] s = {403, NetworkRequestException.TOO_MANY_REQUESTS};
    public final Handler a;
    public final Executor b;
    public final String c;
    public final to3 d;
    public final s2x0 e;
    public final w1x0 f;
    public final p1z g;
    public wor0 h;
    public final x22 i;
    public final d j;
    public final lqo k;
    public final long l;
    public final String m;
    public final AtomicBoolean n = new AtomicBoolean();
    public int o;
    public xo3 p;
    public int q;
    public boolean r;

    public gd21(Handler handler, Executor executor, String str, to3 to3Var, s2x0 s2x0Var, w1x0 w1x0Var, p1z p1zVar, wor0 wor0Var, x22 x22Var, d dVar, lqo lqoVar, long j, String str2) {
        this.a = handler;
        this.b = executor;
        this.c = str;
        this.d = to3Var;
        this.e = s2x0Var;
        this.f = w1x0Var;
        this.g = p1zVar;
        this.h = wor0Var;
        this.i = x22Var;
        this.j = dVar;
        this.k = lqoVar;
        this.l = j;
        this.m = str2;
    }

    public static final void a(gd21 gd21Var, r2x0 r2x0Var) {
        if (gd21Var.n.get() || r2x0Var == null || ((ArrayList) r2x0Var.c).size() == 0) {
            gd21Var.b(1, 7);
        } else if (gd21Var.b(1, 2)) {
            gd21Var.a.post(new ed21(gd21Var, r2x0Var));
        }
    }

    public final boolean b(int i, int i2) {
        Long l = null;
        z83.b(null, this.a.getLooper(), Looper.myLooper());
        int i3 = this.o;
        if (i3 != i) {
            z83.i();
            return false;
        }
        if (i3 == 0 ? i2 != 1 : i3 == 1 ? !(i2 == 2 || i2 == 7) : !(i3 == 2 || i3 == 3 ? i2 == 4 || i2 == 6 || i2 == 7 : i3 == 4 ? i2 == 5 || i2 == 7 : i3 == 5 && (i2 == 6 || i2 == 7))) {
            z83.i();
            return false;
        }
        this.o = i2;
        if (i2 == 6 || i2 == 7) {
            this.p = null;
            wor0 wor0Var = this.h;
            if (wor0Var != null) {
                boolean z = this.r;
                b bVar = (b) wor0Var.a;
                Long l2 = bVar.Q;
                bVar.M = null;
                bVar.G.d();
                gd21 gd21Var = bVar.N;
                if (gd21Var != null) {
                    bVar.M = gd21Var;
                    bVar.N = null;
                    if (gd21Var.b(0, 1)) {
                        gd21Var.b.execute(new dd21(gd21Var));
                        return true;
                    }
                } else {
                    bVar.h(SyncContactController$SyncState.IDLE);
                    x22 x22Var = bVar.E;
                    String str = bVar.w;
                    long f = bVar.b.f();
                    if (l2 != null) {
                        l = Long.valueOf(SystemClock.elapsedRealtime() - l2.longValue());
                    }
                    aqb1.d(x22Var, "sync_upload_success", kotlin.collections.b.i(new Pair("uuid", str), new Pair("version", Long.valueOf(f)), new Pair("duration", l), new Pair("type", bVar.f())));
                    if (z) {
                        bVar.c(true);
                    }
                }
            }
        }
        return true;
    }

    public final void c(String str, Throwable th) {
        Map i = kotlin.collections.b.i(new Pair("uuid", this.c), new Pair("version", Long.valueOf(this.l)), new Pair(CRLReasonCodeExtension.REASON, str), new Pair("type", this.m));
        x22 x22Var = this.i;
        aqb1.d(x22Var, "sync_upload_failed", i);
        if (th != null) {
            x22Var.e("contact_book/sync_upload_failed/".concat(str), th);
        }
    }

    public final void d(ContactsUploadParam.Record[] recordArr, String[] strArr, ContactsUploadData.Record[] recordArr2) {
        z83.c(null, !this.k.a(tz10.A));
        boolean z = !((Boolean) this.j.l.getValue()).booleanValue();
        int min = Math.min(recordArr.length, 100);
        Object[] copyOfRange = Arrays.copyOfRange(recordArr, 0, min);
        Object[] copyOfRange2 = Arrays.copyOfRange(recordArr, min, recordArr.length);
        int min2 = Math.min(strArr.length, 100);
        ContactsUploadParam.Record[] recordArr3 = (ContactsUploadParam.Record[]) copyOfRange;
        ContactsUploadParam.Record[] recordArr4 = (ContactsUploadParam.Record[]) copyOfRange2;
        String[] strArr2 = (String[]) Arrays.copyOfRange(strArr, 0, min2);
        String[] strArr3 = (String[]) Arrays.copyOfRange(strArr, min2, strArr.length);
        ContactsUploadParam contactsUploadParam = new ContactsUploadParam(this.c, z, recordArr3, strArr2);
        fd21 fd21Var = new fd21(this, recordArr4, strArr3, recordArr2, recordArr3.length + strArr2.length);
        to3 to3Var = this.d;
        this.p = to3Var.a.a(new ko3(to3Var, contactsUploadParam, fd21Var));
    }
}
