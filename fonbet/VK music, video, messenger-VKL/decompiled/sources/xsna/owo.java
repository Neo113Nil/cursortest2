package xsna;

import com.vk.ads.easypromote.impl.domain.model.FaqSource;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFeatureCell;
import xsna.dyq0;
import xsna.ehg0;
import xsna.uvo;
import xsna.yaf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class owo implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ owo(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new uvo.f(FaqSource.DURATION));
                break;
            case 1:
                this.c.invoke(new yaf.b.d(ClipsUploadFeatureCell.LicenseAgreementBanner.ordinal(), (String) obj));
                break;
            case 2:
                this.c.invoke(new dyq0.d((faf0) obj));
                break;
            default:
                this.c.invoke(new ehg0.d(((Long) obj).longValue()));
                break;
        }
        return s3q0.a;
    }
}
