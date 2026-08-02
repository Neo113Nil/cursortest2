package defpackage;

import com.yandex.go.places.impl.ui.main.map.filters.f;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class i6c0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ i6c0(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        f fVar = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                ((g6c0) fVar.Dg()).b(floatValue, !(floatValue == 0.0f));
                break;
            default:
                ((g6c0) fVar.Dg()).render((sbc0) obj);
                break;
        }
        return zy11Var;
    }
}
