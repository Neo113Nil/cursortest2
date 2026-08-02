package xsna;

import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class mhw implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;

    public /* synthetic */ mhw(List list, int i) {
        this.b = i;
        this.c = list;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int size;
        switch (this.b) {
            case 0:
                size = this.c.size();
                break;
            default:
                size = this.c.size();
                break;
        }
        return Integer.valueOf(size);
    }
}
