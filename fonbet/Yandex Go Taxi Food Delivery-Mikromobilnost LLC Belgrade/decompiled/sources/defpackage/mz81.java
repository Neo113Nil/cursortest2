package defpackage;

import com.google.android.gms.dynamic.a;

/* loaded from: classes11.dex */
public final class mz81 implements uz81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ mz81(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.uz81
    public final int zaa() {
        switch (this.a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override // defpackage.uz81
    public final void zab() {
        switch (this.a) {
            case 0:
                this.b.a.onStart();
                break;
            default:
                this.b.a.onResume();
                break;
        }
    }
}
