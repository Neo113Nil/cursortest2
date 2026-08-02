package xsna;

import java.util.function.Function;
import java.util.stream.Stream;
import xsna.jhy0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class yvn implements Function {
    public final /* synthetic */ int a = 1;

    public /* synthetic */ yvn() {
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return io.reactivex.rxjava3.subjects.d.N0();
            default:
                jhy0.a aVar = new jhy0.a();
                aVar.b = ((jhy0) obj).b;
                return Stream.generate(aVar).limit((int) ((r6.b - r6.a) + 1));
        }
    }

    public /* synthetic */ yvn(ol olVar) {
    }
}
