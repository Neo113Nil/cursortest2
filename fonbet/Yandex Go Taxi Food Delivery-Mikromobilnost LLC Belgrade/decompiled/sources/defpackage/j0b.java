package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.LongSparseArray;
import com.yandex.messaging.core.net.entities.proto.PostMessageResponse;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.ReadMarker;
import com.yandex.messaging.core.net.entities.proto.message.Report;
import com.yandex.messaging.core.net.entities.proto.message.SeenMarker;
import com.yandex.messaging.internal.entities.SeenMarkerEntity;
import java.util.Random;

/* loaded from: classes15.dex */
public final class j0b extends ree0 {
    public final /* synthetic */ int a;
    public long b;
    public Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ j0b(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
    }

    @Override // defpackage.ree0
    public final ClientMessage b() {
        int i = this.a;
        Object obj = this.w;
        switch (i) {
            case 0:
                ((jwa0) ((bc) this.c).w).getClass();
                this.b = SystemClock.elapsedRealtime();
                return new ClientMessage(null, null, null, null, null, null, null, null, (Report) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, 268435199, null);
            case 1:
                ((jwa0) ((nta0) this.c).b.get()).getClass();
                this.b = SystemClock.elapsedRealtime();
                SeenMarkerEntity seenMarkerEntity = (SeenMarkerEntity) obj;
                return new ClientMessage(null, null, new SeenMarker(seenMarkerEntity.c, seenMarkerEntity.a, seenMarkerEntity.b, seenMarkerEntity.d), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, 268435451, null);
            default:
                qbi0 qbi0Var = (qbi0) obj;
                Handler handler = qbi0Var.b;
                z83.g(null, handler.getLooper(), Looper.myLooper());
                z83.g(null, handler.getLooper(), Looper.myLooper());
                ReadMarker readMarker = new ReadMarker();
                readMarker.chatId = qbi0Var.a;
                LongSparseArray longSparseArray = qbi0Var.c;
                readMarker.timestamps = new long[longSparseArray.size()];
                int size = longSparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    readMarker.timestamps[i2] = longSparseArray.keyAt(i2);
                }
                this.c = readMarker;
                ((rbi0) this.x).c.getClass();
                this.b = SystemClock.elapsedRealtime();
                return new ClientMessage(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (ReadMarker) this.c, null, null, null, null, null, null, null, null, null, false, 0, false, 268402687, null);
        }
    }

    @Override // defpackage.ree0
    public final void g(PostMessageResponse postMessageResponse) {
        int i = this.a;
        Object obj = this.x;
        switch (i) {
            case 0:
                ((jwa0) ((bc) this.c).w).d(this.b, "time2ack_report");
                ((oxe0) obj).run();
                break;
            case 1:
                nta0 nta0Var = (nta0) this.c;
                z83.g(null, nta0Var.d, Looper.myLooper());
                ((jwa0) nta0Var.b.get()).a(this.b, "time2ack_seen_marker");
                String str = (String) obj;
                nta0Var.e.remove(str);
                p370 p370Var = nta0Var.f;
                ((v2b0) p370Var.w).a((String) p370Var.b, str);
                break;
            default:
                qbi0 qbi0Var = (qbi0) this.w;
                qbi0Var.e = null;
                ReadMarker readMarker = (ReadMarker) this.c;
                if (readMarker == null) {
                    ny61.g("Required value was null.");
                    break;
                } else {
                    long j = this.b;
                    LongSparseArray longSparseArray = qbi0Var.c;
                    int i2 = 0;
                    for (long j2 : readMarker.timestamps) {
                        longSparseArray.remove(j2);
                    }
                    if (longSparseArray.size() != 0) {
                        qbi0Var.f.c.getClass();
                        long max = (long) Math.max(0.0d, (new Random().nextInt(9000) + 1000) - (SystemClock.elapsedRealtime() - j));
                        pbi0 pbi0Var = new pbi0(qbi0Var, i2);
                        qbi0Var.d = pbi0Var;
                        qbi0Var.b.postDelayed(pbi0Var, max);
                        break;
                    }
                }
                break;
        }
    }

    public j0b(qbi0 qbi0Var, rbi0 rbi0Var) {
        this.a = 2;
        this.w = qbi0Var;
        this.x = rbi0Var;
    }
}
