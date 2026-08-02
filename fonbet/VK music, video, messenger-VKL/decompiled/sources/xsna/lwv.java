package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import xsna.mwv;

/* compiled from: ImAnalyticsCollector.kt */
/* loaded from: classes5.dex */
public final class lwv implements mwv<mwv.a> {
    public static final bpn0 b = new bpn0(new nh(13));
    public final List<Pair<a, Lazy<b>>> a;

    /* compiled from: ImAnalyticsCollector.kt */
    public interface a {
        boolean a(mwv.a aVar);
    }

    /* compiled from: ImAnalyticsCollector.kt */
    public interface b {
        boolean b(mwv.a aVar);
    }

    /* compiled from: ImAnalyticsCollector.kt */
    public static final class c extends vk6<SchemeStat$TypeNavgo> {
    }

    public lwv() {
        this(null);
    }

    @Override // xsna.mwv
    public final void a(mwv.a aVar) {
        List<Pair<a, Lazy<b>>> list = this.a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (((a) pair.i()).a(aVar) && ((b) ((Lazy) pair.j()).getValue()).b(aVar)) {
                    return;
                }
            }
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.w, new Object[]{"Analytics item " + aVar + " is lost, there is no necessary collector"});
        }
        if (BuildInfo.h()) {
            cvk.w("Событие клика аналитики не было отправлено, смотреть в логах", true);
        }
    }

    public lwv(Object obj) {
        this.a = (List) b.getValue();
    }
}
