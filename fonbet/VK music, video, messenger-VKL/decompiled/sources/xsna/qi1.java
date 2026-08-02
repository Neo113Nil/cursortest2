package xsna;

import com.vk.video.ui.upload.impl.videoviewer.presentation.compose.screen.IconViewState;
import xsna.oe60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qi1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qi1(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.e = obj2;
        this.d = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                String str = (String) this.c;
                String str2 = (String) this.e;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                xi1.b(ne7.I(1), (androidx.compose.runtime.a) obj, str, str2, q630Var);
                break;
            case 1:
                String str3 = (String) this.c;
                gzs gzsVar = (gzs) this.e;
                q630 q630Var2 = (q630) this.d;
                ((Integer) obj2).getClass();
                qh00.a(ne7.I(385), (androidx.compose.runtime.a) obj, str3, gzsVar, q630Var2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((ne60) this.c).h((oe60.a.C3451a) this.e, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((a4b0) this.e).m((String) this.c, (gzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 4:
                ((Integer) obj2).getClass();
                kch0.b((IconViewState) this.c, (gzs) this.e, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                o8i0.a((String) this.c, (gzs) this.e, (gzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ qi1(a4b0 a4b0Var, String str, gzs gzsVar, int i) {
        this.b = 3;
        this.e = a4b0Var;
        this.c = str;
        this.d = gzsVar;
    }
}
