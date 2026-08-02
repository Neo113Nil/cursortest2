package xsna;

import com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.ecomm.avito.api.MarketAvitoComponent;
import com.vk.ecomm.market.impl.di.MarketInternalComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class e7f implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ e7f(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((ClipsTemplatesEditorComponent) this.c.a(fpf0.a(ClipsTemplatesEditorComponent.class))).l4();
            case 1:
                return ((MarketAvitoComponent) this.c.mo408a(fpf0.a(MarketAvitoComponent.class))).getDelegate();
            case 2:
                return (MarketInternalComponent) this.c.mo408a(fpf0.a(MarketInternalComponent.class));
            default:
                return ((ClipsUploadSdkUploaderComponent) this.c.a(fpf0.a(ClipsUploadSdkUploaderComponent.class))).Zb();
        }
    }
}
