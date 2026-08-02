package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockList;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: CatalogSectionPresenter.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class mea extends AdaptedFunctionReference implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mea(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((izs) this.receiver).invoke((UIBlockList) obj);
                break;
            default:
                bn40.c((Throwable) obj, new Object[0]);
                break;
        }
        return s3q0.a;
    }
}
