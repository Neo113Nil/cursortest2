package xsna;

import androidx.compose.runtime.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ae1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ ae1(izs izsVar, int i) {
        this.b = 1;
        this.c = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
        Integer num = (Integer) obj2;
        switch (this.b) {
            case 0:
                int intValue = num.intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2009753590, intValue, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.screen.AlbumChooseView.<anonymous> (AlbumChooseView.kt:48)");
                    }
                    izs izsVar = this.c;
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new me0(izsVar, 1);
                        aVar.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    boolean J2 = aVar.J(izsVar);
                    Object x2 = aVar.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new yd1(izsVar, 0);
                        aVar.R(x2);
                    }
                    i3p0.a(0, aVar, gzsVar, (gzs) x2, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                num.getClass();
                yeo.a(this.c, aVar, ne7.I(1));
                break;
            default:
                int intValue2 = num.intValue();
                if (aVar.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1411405335, intValue2, -1, "com.vk.importcontacts.impl.presentation.main.view.ImportContactsView.Content.<anonymous> (ImportContactsView.kt:34)");
                    }
                    rqw.a(this.c, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ae1(izs izsVar, int i, byte b) {
        this.b = i;
        this.c = izsVar;
    }
}
