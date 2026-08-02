package xsna;

import java.io.Serializable;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class yzg implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ yzs f;

    public /* synthetic */ yzg(zzg zzgVar, Pair pair, jai jaiVar, int i) {
        this.d = zzgVar;
        this.e = pair;
        this.f = jaiVar;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((zzg) this.d).a((Pair) this.e, (jai) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                int I = ne7.I(this.c | 1);
                ((q7o) this.d).e((String) this.e, this.f, (androidx.compose.runtime.a) obj, I);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ yzg(q7o q7oVar, String str, yzs yzsVar, int i) {
        this.d = q7oVar;
        this.e = str;
        this.f = yzsVar;
        this.c = i;
    }
}
