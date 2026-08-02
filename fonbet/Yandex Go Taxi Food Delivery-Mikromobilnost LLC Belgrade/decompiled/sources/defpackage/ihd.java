package defpackage;

import android.graphics.Rect;
import com.yandex.go.summary.interactor.core.a;
import com.yandex.go.summary.repository.MarginSource;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class ihd implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ ihd(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object value;
        LinkedHashMap linkedHashMap;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.e.a.Lc("SummaryMapOverlayInteractor", (Rect) obj);
                return zy11Var;
            case 1:
                Rect rect = (Rect) obj;
                ggv0 ggv0Var = aVar.d;
                MarginSource marginSource = MarginSource.ExternalState;
                r0 r0Var = ggv0Var.a;
                do {
                    value = r0Var.getValue();
                    linkedHashMap = new LinkedHashMap((Map) value);
                    linkedHashMap.put(marginSource, rect);
                } while (!r0Var.k(value, linkedHashMap));
                return zy11Var;
            default:
                Object a = aVar.j.a(new rg((String) obj), continuation);
                return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11Var;
        }
    }
}
