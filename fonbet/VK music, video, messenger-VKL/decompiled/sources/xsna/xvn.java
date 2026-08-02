package xsna;

import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class xvn implements Function {
    public final /* synthetic */ int a = 1;

    public /* synthetic */ xvn() {
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return io.reactivex.rxjava3.subjects.d.N0();
            default:
                String str = (String) obj;
                return str.endsWith("Message") ? qoy.c(7, 0, str) : str;
        }
    }

    public /* synthetic */ xvn(qt qtVar) {
    }
}
