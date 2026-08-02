package xsna;

import ru.ok.android.util.FileUtilKt;

/* compiled from: CallFinishHandler.kt */
/* loaded from: classes8.dex */
public final class n39<T> implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ ear b;

    public n39(ear earVar) {
        this.b = earVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        ear earVar = this.b;
        earVar.getClass();
        FileUtilKt.deleteSafely$default(earVar.a, null, 1, null);
    }
}
