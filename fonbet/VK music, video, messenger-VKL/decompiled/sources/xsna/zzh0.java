package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: SearchViewFactoryImpl.kt */
/* loaded from: classes5.dex */
public final class zzh0<V extends View> implements yzh0<V> {
    public final yzs<Context, AttributeSet, Integer, V> a;

    /* JADX WARN: Multi-variable type inference failed */
    public zzh0(yzs<? super Context, ? super AttributeSet, ? super Integer, ? extends V> yzsVar) {
        this.a = yzsVar;
    }

    @Override // xsna.yzh0
    public final View o0(Context context) {
        return this.a.invoke(context, null, 0);
    }
}
