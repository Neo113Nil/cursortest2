package xsna;

import kotlin.LazyThreadSafetyMode;

/* compiled from: AlbumsListDataSource.kt */
/* loaded from: classes4.dex */
public final class ko1 {
    public final Object a;
    public final Object b;

    public ko1() {
        com.vk.movika.sdk.base.model.props.d dVar = new com.vk.movika.sdk.base.model.props.d(2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = msy.a(lazyThreadSafetyMode, dVar);
        this.b = msy.a(lazyThreadSafetyMode, new com.vk.movika.tools.controls.seekbar.n(2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final io.reactivex.rxjava3.disposables.c a(io.reactivex.rxjava3.subjects.f fVar, String str) {
        return ((hz10) this.a.getValue()).b(111, str).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ho1(new go1(fVar, 0), 0), new io1(new ul1(fVar, 1), 0));
    }
}
