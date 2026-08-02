package defpackage;

import androidx.fragment.app.Fragment;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.SilentPaymentFragment;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.SuccessFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class jcs0 implements y23 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Fragment y;
    public final /* synthetic */ Object z;

    public /* synthetic */ jcs0(Fragment fragment, int i, int i2, int i3, int i4, Object obj, int i5) {
        this.a = i5;
        this.y = fragment;
        this.b = i;
        this.c = i2;
        this.w = i3;
        this.x = i4;
        this.z = obj;
    }

    @Override // defpackage.y23
    public final void b(u1w u1wVar) {
        int i = this.a;
        Object obj = this.z;
        Fragment fragment = this.y;
        switch (i) {
            case 0:
                SilentPaymentFragment.applyInsets$lambda$5$lambda$3((SilentPaymentFragment) fragment, this.b, this.c, this.w, this.x, (hed0) obj, u1wVar);
                break;
            default:
                SuccessFragment.applyInsets$lambda$6$lambda$4((SuccessFragment) fragment, this.b, this.c, this.w, this.x, (s3v0) obj, u1wVar);
                break;
        }
    }
}
