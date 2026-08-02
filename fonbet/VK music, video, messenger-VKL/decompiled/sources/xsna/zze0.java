package xsna;

import android.content.Context;
import com.vk.im.reactions.impl.assets.a;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class zze0 implements Callable {
    public final /* synthetic */ zaw b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ zze0(zaw zawVar, Context context, int i, int i2) {
        this.b = zawVar;
        this.c = context;
        this.d = i;
        this.e = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new a.C1134a(null, null, this.b.b(this.c, false, this.d, this.e));
    }
}
