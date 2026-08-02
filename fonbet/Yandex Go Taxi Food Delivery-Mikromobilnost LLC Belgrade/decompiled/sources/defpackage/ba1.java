package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes14.dex */
public final class ba1 implements qgu0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ba1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.qgu0
    public final Drawable a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((szu) obj).b.b;
            case 1:
                return ((rzu) obj).b.b;
            default:
                return vng.t(f1h0.ic_summary_destination_point, ((avj0) ((zuj0) obj)).a);
        }
    }

    @Override // defpackage.qgu0
    public final Drawable b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((szu) obj).b.b;
            case 1:
                return ((rzu) obj).b.b;
            default:
                return vng.t(zyg0.ic_disabled_destination_point, ((avj0) ((zuj0) obj)).a);
        }
    }
}
