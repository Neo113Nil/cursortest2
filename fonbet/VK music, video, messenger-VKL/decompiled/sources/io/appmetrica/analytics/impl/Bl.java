package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import ru.ok.proto.PublisherConfiguration;

/* loaded from: classes8.dex */
public final class Bl {
    public final Oc a;
    public final Nc b;

    public Bl(PublicLogger publicLogger, String str) {
        this(new Oc(str, publicLogger), new Nc(str, publicLogger));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized boolean a(Rc rc, String str, String str2) {
        try {
            int size = rc.size();
            int i = this.a.c.a;
            if (size >= i && (i != rc.size() || !rc.containsKey(str))) {
                Oc oc = this.a;
                oc.d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", oc.e, Integer.valueOf(oc.c.a), str);
                return false;
            }
            this.b.getClass();
            int i2 = rc.a;
            if (str2 != null) {
                i2 += str2.length();
            }
            if (rc.containsKey(str)) {
                String str3 = (String) rc.get(str);
                if (str3 != null) {
                    i2 -= str3.length();
                }
            } else {
                i2 += str.length();
            }
            if (i2 <= 4500) {
                rc.put(str, str2);
                return true;
            }
            Nc nc = this.b;
            nc.b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", nc.a, Integer.valueOf(PublisherConfiguration.DEFAULT_MAX_DELAY_MS), str);
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean b(Rc rc, String str, String str2) {
        if (rc == null) {
            return false;
        }
        String a = this.a.a.a(str);
        String a2 = this.a.b.a(str2);
        if (!rc.containsKey(a)) {
            if (a2 != null) {
                return a(rc, a, a2);
            }
            return false;
        }
        String str3 = (String) rc.get(a);
        if (a2 == null || !a2.equals(str3)) {
            return a(rc, a, a2);
        }
        return false;
    }

    public Bl(Oc oc, Nc nc) {
        this.a = oc;
        this.b = nc;
    }
}
