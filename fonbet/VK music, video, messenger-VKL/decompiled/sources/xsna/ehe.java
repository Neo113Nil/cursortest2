package xsna;

import com.vk.api.generated.uxpolls.dto.UxpollsAnswerDto;
import com.vk.dto.uxpolls.PollAnswer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ehe implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ehe(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                fhe fheVar = (fhe) this.c;
                List list = (List) this.d;
                e2f e2fVar = fheVar.c;
                e2f e2fVar2 = e2fVar != null ? new e2f(e2fVar.a, e2fVar.b, list) : null;
                if (e2fVar2 == null) {
                    e2fVar2 = new e2f(false, true, list);
                }
                fheVar.c = e2fVar2;
                return e2fVar2;
            default:
                Map map = (Map) this.c;
                r4r0 r4r0Var = ((m5r0) this.d).b;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    r4r0Var.getClass();
                    arrayList.add(new UxpollsAnswerDto(((Number) entry.getKey()).intValue(), j5g.O0(((PollAnswer) entry.getValue()).b), ((PollAnswer) entry.getValue()).c));
                }
                return arrayList;
        }
    }
}
