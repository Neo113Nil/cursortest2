package defpackage;

import com.yandex.go.taxi.order.titles.f;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class k980 implements vpr {
    public final /* synthetic */ f a;
    public final /* synthetic */ l980 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int w;

    public k980(f fVar, l980 l980Var, int i, int i2) {
        this.a = fVar;
        this.b = l980Var;
        this.c = i;
        this.w = i2;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        zxs0 zxs0Var = this.a.j;
        int i = this.c;
        int i2 = this.w;
        zxs0Var.d(this.b, (hxx0) obj, i, i2);
        return zy11.a;
    }
}
