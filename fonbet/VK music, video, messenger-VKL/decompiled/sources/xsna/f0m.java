package xsna;

import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import ru.ok.media.OkmpStreamPublisher;
import ru.ok.media.OkmpStreamPublisher$createPublisherCallback$1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class f0m implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f0m(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        s3q0 handleError$lambda$1;
        switch (this.b) {
            case 0:
                ((DeprecatedAttachActivity) this.d).z.smoothScrollToPosition(this.c + 1);
                return null;
            default:
                handleError$lambda$1 = OkmpStreamPublisher$createPublisherCallback$1.handleError$lambda$1((OkmpStreamPublisher) this.d, this.c);
                return handleError$lambda$1;
        }
    }
}
