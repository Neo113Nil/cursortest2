package xsna;

import java.util.function.BiConsumer;
import xsna.dj80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class y1u implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ wzs b;

    public /* synthetic */ y1u(int i, wzs wzsVar) {
        this.a = i;
        this.b = wzsVar;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((b47) this.b).invoke(obj, obj2);
                break;
            default:
                ((dj80.a) this.b).invoke(obj, obj2);
                break;
        }
    }
}
