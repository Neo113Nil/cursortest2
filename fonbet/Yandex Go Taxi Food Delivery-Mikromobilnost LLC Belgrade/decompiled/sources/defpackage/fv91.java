package defpackage;

import com.google.android.gms.internal.play_billing.zzkn;

/* loaded from: classes11.dex */
public final class fv91 implements u6a1 {
    public static final fv91 b = new fv91(0);
    public static final fv91 c = new fv91(1);
    public static final fv91 d = new fv91(2);
    public static final fv91 e = new fv91(3);
    public static final fv91 f = new fv91(4);
    public static final fv91 g = new fv91(5);
    public final /* synthetic */ int a;

    public /* synthetic */ fv91(int i) {
        this.a = i;
    }

    @Override // defpackage.u6a1
    public final boolean zza(int i) {
        switch (this.a) {
            case 0:
                switch (i) {
                }
            case 1:
                if ((i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : zzkn.ALTERNATIVE_BILLING_ACTION : zzkn.LOCAL_PURCHASES_UPDATED_ACTION : zzkn.PURCHASES_UPDATED_ACTION : zzkn.BROADCAST_ACTION_UNSPECIFIED) != null) {
                }
                break;
            case 2:
                if (i == 0 || i == 1 || i == 2 || i == 3) {
                }
                break;
            case 3:
                if (i != 17 && i != 18) {
                    switch (i) {
                    }
                }
                break;
            case 4:
                if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
                }
                break;
            default:
                if (i == 0 || i == 1) {
                }
                break;
        }
        return true;
    }
}
