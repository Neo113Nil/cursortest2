package xsna;

import kotlin.Result;

/* compiled from: MarketPickerCallback.kt */
/* loaded from: classes4.dex */
public final class ea10 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ea10(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return new Result((e0o0) this.c);
            default:
                ((wow) this.c).get(((Number) obj).intValue());
                return null;
        }
    }
}
