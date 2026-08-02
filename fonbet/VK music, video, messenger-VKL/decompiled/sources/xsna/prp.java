package xsna;

import com.vk.metrics.eventtracking.Event;
import java.util.ArrayList;

/* compiled from: EntryPointReporter.kt */
/* loaded from: classes2.dex */
public final class prp {
    public static io.reactivex.rxjava3.disposables.c b;
    public static final Object a = new Object();
    public static final ArrayList c = new ArrayList();

    /* compiled from: EntryPointReporter.kt */
    public static final class a {
        public final long a;
        public final String b;

        public a(long j, String str) {
            this.a = j;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LogEvent(peerId=");
            sb.append(this.a);
            sb.append(", entry=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public static void a(long j, String str, w2w w2wVar) {
        synchronized (a) {
            try {
                a aVar = new a(j, str);
                ArrayList arrayList = c;
                if (arrayList.contains(aVar)) {
                    return;
                }
                arrayList.add(aVar);
                if (!"unknown".equals(str)) {
                    ohp0 ohp0Var = w2wVar.getConfig().g;
                    el3 el3Var = Event.b;
                    Event.a aVar2 = new Event.a();
                    aVar2.g("message_from_entrypoint");
                    aVar2.c("entry_point", str);
                    aVar2.i("StatlogTracker");
                    ohp0Var.k(aVar2.e());
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
