package xsna;

import androidx.compose.runtime.a;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.a;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class shf implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ shf(izs izsVar, int i) {
        this.b = 3;
        this.c = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-948092941, intValue, -1, "com.vk.clips.upload.ui.impl.compose.views.Content.<anonymous> (ClipsUploadScreen.kt:214)");
                    }
                    izs izsVar = this.c;
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new nhf(izsVar, 0);
                        aVar.R(x);
                    }
                    khf.c(48, aVar, (gzs) x, txj0.f(q630.a.a, 1.0f));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                ((Integer) obj).intValue();
                Integer num = (Integer) obj2;
                if (num.intValue() == 0) {
                    num = null;
                }
                this.c.invoke(new a.m(num));
                return s3q0.a;
            case 2:
                ((Integer) obj2).intValue();
                return (tfu) this.c.invoke((ery) obj);
            default:
                ((Integer) obj2).getClass();
                jjn0.d(this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ shf(izs izsVar, int i, byte b) {
        this.b = i;
        this.c = izsVar;
    }
}
