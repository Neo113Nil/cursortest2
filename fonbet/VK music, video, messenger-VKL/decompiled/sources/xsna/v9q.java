package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class v9q implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v9q(int i, tpo tpoVar) {
        this.b = 3;
        this.c = i;
        this.d = tpoVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                w9q.a(ne7.I(1), this.c, (androidx.compose.runtime.a) obj, q630Var);
                break;
            case 1:
                ((Integer) obj2).intValue();
                kb00.a((qa8) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((su10) this.d).b(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            case 3:
                tpo tpoVar = (tpo) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1773817326, intValue, -1, "com.vk.catalog2.feature.music.holders.MusicDynamicGridItemVh.bind.<anonymous> (MusicDynamicGridItemVh.kt:49)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-1006565513, new moa(this.c, tpoVar), aVar), aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((ala0) this.d).c(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            default:
                ((Integer) obj2).intValue();
                ((clm0) this.d).Y0(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ v9q(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    public /* synthetic */ v9q(q630 q630Var, int i, int i2) {
        this.b = 0;
        this.d = q630Var;
        this.c = i2;
    }
}
