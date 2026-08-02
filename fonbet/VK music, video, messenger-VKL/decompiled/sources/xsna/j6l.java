package xsna;

import com.vk.core.compose.component.group.footer.GroupFooter;
import xsna.b78;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class j6l implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j6l(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.e = obj2;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                r6l.d((gzs) this.c, (gzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                gzs gzsVar = (gzs) this.c;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                gct.a(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, gzsVar, q630Var);
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((GroupFooter.Loader.b) this.c).a((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                ((le30) this.c).a((ksr) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                ((q8d0) this.c).a((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                x8u0.g((b78.g) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }
}
