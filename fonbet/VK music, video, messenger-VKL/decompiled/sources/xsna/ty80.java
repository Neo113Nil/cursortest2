package xsna;

import android.view.ContextThemeWrapper;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: OrientationHelper.kt */
/* loaded from: classes4.dex */
public final class ty80 {
    public final ContextThemeWrapper a;
    public final com.vk.newsfeed.posting.market_picker.presentation.base.view.e b;
    public int c;
    public boolean d;
    public final io.reactivex.rxjava3.disposables.c e;

    public ty80(ContextThemeWrapper contextThemeWrapper, com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar) {
        this.a = contextThemeWrapper;
        this.b = eVar;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        this.e = new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.q(new nsn(contextThemeWrapper, ref$ObjectRef)), io.reactivex.rxjava3.internal.functions.a.d, new eki0(ref$ObjectRef, 0)).y(300L, TimeUnit.MILLISECONDS).a0(asu0.a.d()), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new y730(new w110(this, 12), 6));
    }
}
