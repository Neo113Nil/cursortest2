package defpackage;

import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import androidx.work.impl.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes.dex */
public final class a951 extends z851 {
    public final b a;
    public final String b;
    public final ExistingWorkPolicy c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f = new ArrayList();
    public boolean g;
    public kc70 h;

    static {
        hgz.o("WorkContinuationImpl");
    }

    public a951(b bVar, String str, ExistingWorkPolicy existingWorkPolicy, List list, int i) {
        this.a = bVar;
        this.b = str;
        this.c = existingWorkPolicy;
        this.d = list;
        this.e = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (existingWorkPolicy == ExistingWorkPolicy.REPLACE && ((ba51) list.get(i2)).b.u != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                ny61.g("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String uuid = ((ba51) list.get(i2)).a.toString();
            this.e.add(uuid);
            this.f.add(uuid);
        }
    }

    public static HashSet b(a951 a951Var) {
        HashSet hashSet = new HashSet();
        a951Var.getClass();
        return hashSet;
    }

    public final ec70 a() {
        if (this.g) {
            hgz g = hgz.g();
            TextUtils.join(Extension.FIX_SPACE, this.e);
            g.getClass();
        } else {
            b bVar = this.a;
            this.h = s8o.H(bVar.b.o, "EnqueueRunnable_" + this.c.name(), ((t951) bVar.d).a, new oay0(21, this));
        }
        return this.h;
    }
}
