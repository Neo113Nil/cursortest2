package xsna;

import android.content.Context;
import java.util.Collection;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class y040 implements io.reactivex.rxjava3.core.a0 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ a1w c;
    public final /* synthetic */ Collection d;

    public /* synthetic */ y040(Context context, a1w a1wVar, Collection collection) {
        this.b = context;
        this.c = a1wVar;
        this.d = collection;
    }

    @Override // io.reactivex.rxjava3.core.a0
    public final void subscribe(io.reactivex.rxjava3.core.y yVar) {
        try {
            yVar.onSuccess(z040.a.a(this.b, this.c, this.d));
        } catch (Exception e) {
            yVar.b(e);
        }
    }
}
