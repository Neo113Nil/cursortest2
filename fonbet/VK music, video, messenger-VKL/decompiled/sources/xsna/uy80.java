package xsna;

import android.content.Context;
import com.vk.photoviewer.PhotoViewer;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: OrientationHelper.kt */
/* loaded from: classes3.dex */
public final class uy80 {
    public final Context a;
    public final PhotoViewer b;
    public int c;
    public boolean d;
    public final io.reactivex.rxjava3.disposables.c e;

    public uy80(Context context, PhotoViewer photoViewer) {
        this.a = context;
        this.b = photoViewer;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        this.e = new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.q(new nsn(context, ref$ObjectRef)), io.reactivex.rxjava3.internal.functions.a.d, new eki0(ref$ObjectRef, 0)).y(300L, TimeUnit.MILLISECONDS).a0(asu0.a.d()), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new zyu(new w7u(this, 26), 15));
    }
}
