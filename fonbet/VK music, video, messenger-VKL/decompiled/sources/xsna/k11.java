package xsna;

import com.vk.ads.stats.api.di.AdPixelStatsComponent;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k11 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ e7m c;

    public /* synthetic */ k11(e7m e7mVar, int i) {
        this.b = i;
        this.c = e7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (AdPixelStatsComponent) this.c.a(fpf0.a(AdPixelStatsComponent.class));
            default:
                return (AttachmentMappersComponent) this.c.b(fpf0.a(AttachmentMappersComponent.class));
        }
    }
}
