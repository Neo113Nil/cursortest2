package xsna;

import android.view.View;
import com.vk.profile.user.impl.ui.viewdelegates.SnowballsCoverHolder;

/* compiled from: ViewExt.kt */
/* loaded from: classes5.dex */
public final class edk0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ SnowballsCoverHolder b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public edk0(SnowballsCoverHolder snowballsCoverHolder, int i, int i2) {
        this.b = snowballsCoverHolder;
        this.c = i;
        this.d = i2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        SnowballsCoverHolder snowballsCoverHolder = this.b;
        io.reactivex.rxjava3.disposables.c cVar = snowballsCoverHolder.d;
        if (cVar != null) {
            cVar.dispose();
        }
        snowballsCoverHolder.e.e();
        snowballsCoverHolder.d = new io.reactivex.rxjava3.internal.operators.single.n(new io.reactivex.rxjava3.internal.operators.mixed.q(new io.reactivex.rxjava3.internal.operators.single.v(new fdk0(snowballsCoverHolder, this.c, this.d)).q(io.reactivex.rxjava3.schedulers.a.a()), new SnowballsCoverHolder.c(new com.vk.profile.user.impl.ui.viewdelegates.b(snowballsCoverHolder))).E0().m(io.reactivex.rxjava3.android.schedulers.a.b()), new SnowballsCoverHolder.b(new it40(snowballsCoverHolder, 1))).subscribe(new SnowballsCoverHolder.b(new idk0(snowballsCoverHolder)));
    }
}
