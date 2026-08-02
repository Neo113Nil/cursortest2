package defpackage;

import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.zzw;
import defpackage.atx0;
import defpackage.avb1;
import defpackage.e491;

/* loaded from: classes11.dex */
public final class e491 extends ust {
    public static final zm2 k = new zm2("SmsRetriever.API", new esw(9), new pm2());

    public final zzw e() {
        ysx0 a = zsx0.a();
        a.a = new pui0() { // from class: com.google.android.gms.internal.auth-api-phone.a
            @Override // defpackage.pui0
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((avb1) obj).i()).zzg(new zzz(e491.this, (atx0) obj2));
            }
        };
        a.c = new Feature[]{j491.a};
        a.d = 1567;
        return d(1, a.a());
    }
}
