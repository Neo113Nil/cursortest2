package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: FeedbackButtonsFeature.kt */
/* loaded from: classes7.dex */
public final class s5r {
    public final lrt a;
    public final io.reactivex.rxjava3.subjects.f<t5r> b;
    public final io.reactivex.rxjava3.disposables.b c;

    public s5r(lrt lrtVar) {
        this.a = lrtVar;
        io.reactivex.rxjava3.subjects.f<t5r> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.b = fVar;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.c = bVar;
        bVar.b(fVar.w0(100L, TimeUnit.MILLISECONDS).subscribe(new defpackage.i0(new dh5(this, 25), 21)));
    }
}
