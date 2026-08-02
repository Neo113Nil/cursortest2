package xsna;

import com.vk.dto.common.data.VKList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class dx7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dx7(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((ex7) this.d).a((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                c3k.b((m3k) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((sco0) this.d).a((lgu0) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                return s3q0.a;
            case 3:
                izs izsVar = (izs) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                p8p0.c(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var);
                return s3q0.a;
            default:
                VKList vKList = new VKList(((com.vk.libvideo.a) this.d).c.invoke((List) this.e, (List) obj, (List) obj2));
                vKList.o(this.c);
                return vKList;
        }
    }

    public /* synthetic */ dx7(sco0 sco0Var, lgu0 lgu0Var, int i) {
        this.b = 2;
        this.d = sco0Var;
        this.e = lgu0Var;
        this.c = i;
    }
}
