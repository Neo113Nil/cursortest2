package xsna;

import java.util.Set;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.rx.core.RxApiClient;
import xsna.dda0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fca0 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fca0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((hca0) this.c).j.b(new dda0.c((Set) this.d));
                break;
            default:
                ((RxApiClient) this.c).lambda$executeCompletable$2((ApiExecutableRequest) this.d);
                break;
        }
    }
}
