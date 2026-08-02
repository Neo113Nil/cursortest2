package xsna;

import java.util.List;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zvd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ zvd(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.clips.editor.state.model.a aVar = (com.vk.clips.editor.state.model.a) obj;
                return aVar.i(aVar.c.get(this.c).j);
            default:
                return io.reactivex.rxjava3.core.q.T(new Pair(Integer.valueOf(this.c), (List) obj));
        }
    }
}
