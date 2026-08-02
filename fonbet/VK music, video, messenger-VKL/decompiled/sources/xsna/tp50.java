package xsna;

import android.view.View;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import xsna.zu50;

/* compiled from: MyTargetExt.kt */
/* loaded from: classes4.dex */
public final class tp50 implements zu50.c {
    public final /* synthetic */ io.reactivex.rxjava3.core.y<bs50> a;
    public final /* synthetic */ bp50 b;
    public final /* synthetic */ MyTargetNativeAdEntry c;

    public tp50(io.reactivex.rxjava3.core.y<bs50> yVar, bp50 bp50Var, MyTargetNativeAdEntry myTargetNativeAdEntry) {
        this.a = yVar;
        this.b = bp50Var;
        this.c = myTargetNativeAdEntry;
    }

    @Override // xsna.zu50.c
    public final void c(iaz0 iaz0Var, zu50 zu50Var) {
        this.a.onError(new Exception("Loading Error [" + iaz0Var.a + "]: " + iaz0Var.b));
    }

    @Override // xsna.zu50.c
    public final void d(cw50 cw50Var, zu50 zu50Var) {
        MyTargetNativeAdEntry myTargetNativeAdEntry = this.c;
        up50.b(this.a, zu50Var, this.b, null, up50.d(myTargetNativeAdEntry.p, myTargetNativeAdEntry.o));
    }

    @Override // xsna.zu50.c
    public final void onClick() {
    }

    @Override // xsna.zu50.c
    public final void onVideoComplete() {
    }

    @Override // xsna.zu50.c
    public final void onVideoPause() {
    }

    @Override // xsna.zu50.c
    public final void onVideoPlay() {
    }

    @Override // xsna.zu50.c
    public final void b(zu50 zu50Var) {
    }

    @Override // xsna.zu50.c
    public final void a(View view, zu50 zu50Var) {
    }
}
