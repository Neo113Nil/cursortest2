package xsna;

import com.vk.dto.common.Attachment;

/* compiled from: UploadListener.java */
/* loaded from: classes6.dex */
public final class ecq0 {
    public final a a;
    public final int b;
    public io.reactivex.rxjava3.disposables.c c;

    /* compiled from: UploadListener.java */
    public interface a {
        void a(Attachment attachment);

        void b();
    }

    public ecq0(int i, a aVar) {
        this.a = aVar;
        this.b = i;
    }

    public final void a() {
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        bj50 bj50Var = new bj50(this, 13);
        fVar.getClass();
        this.c = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, bj50Var).a0(asu0.a.d()).subscribe(new o330(this, 22));
    }
}
