package defpackage;

import com.yandex.go.settings.email.a;
import java.util.function.Consumer;

/* loaded from: classes13.dex */
public final /* synthetic */ class csn implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ csn(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.D.l((Boolean) obj);
                break;
            default:
                ((xrn) aVar.Dg()).setProgressing(false);
                ((xrn) aVar.Dg()).T4((String) obj);
                break;
        }
    }
}
