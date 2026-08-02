package xsna;

import android.content.Context;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import xsna.yks0;

/* compiled from: VideoFileController.kt */
/* loaded from: classes17.dex */
public final class bls0 extends fhs0<Boolean> {
    public final /* synthetic */ yks0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bls0(Context context, yks0 yks0Var) {
        super(context);
        this.d = yks0Var;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        yks0 yks0Var = this.d;
        yks0Var.e.Xa(booleanValue);
        Iterator<T> it = yks0Var.f.iterator();
        while (it.hasNext()) {
            ((yks0.a) it.next()).He(EmptyList.b, yks0Var.e);
        }
    }

    @Override // xsna.fhs0, io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
    }
}
