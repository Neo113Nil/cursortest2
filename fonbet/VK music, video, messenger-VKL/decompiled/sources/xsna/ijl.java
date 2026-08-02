package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import kotlin.Pair;
import xsna.loh0;
import xsna.sum0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ijl implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ijl(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((njl) this.d).d((String) this.e, (String) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((kq01) this.d).e((Pair) this.e, (zzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((uzp) this.d).e((String) this.e, (yzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                ((t5v) this.d).c((q630) this.e, (Cell$Middle.Size) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((koh0) this.d).i((loh0.c) this.e, (c1h) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                ((sum0) this.d).h((sum0.d) this.e, (izs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ves0.d((n2m) this.d, (izs) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }
}
