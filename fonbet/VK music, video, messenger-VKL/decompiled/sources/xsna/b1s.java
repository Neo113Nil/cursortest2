package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: FoldersEventsObserverImpl.kt */
/* loaded from: classes18.dex */
public final class b1s implements g4z {
    public final io.reactivex.rxjava3.disposables.b b;
    public final io.reactivex.rxjava3.subjects.f<a1s> c;

    public b1s(a1w a1wVar) {
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.b = bVar;
        this.c = new io.reactivex.rxjava3.subjects.f<>();
        io.reactivex.rxjava3.core.w c = asu0.a.c();
        bVar.b(a1wVar.l.a().r0(c).a0(c).subscribe(new io1(new zkh(this, 15), 26)));
    }

    public final io.reactivex.rxjava3.subjects.f a() {
        return this.c;
    }

    public final void d(a1s a1sVar) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"Folders", "onFolderEvent " + a1sVar});
        }
        this.c.onNext(a1sVar);
    }

    @Override // xsna.g4z
    public final void onDestroy() {
        this.b.e();
        this.c.onComplete();
    }
}
