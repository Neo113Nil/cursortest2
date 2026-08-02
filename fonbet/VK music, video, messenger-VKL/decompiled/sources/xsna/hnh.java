package xsna;

import com.vk.fave.di.FaveComponent;
import com.vk.sharing.api.di.SharingComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class hnh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ hnh(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((FaveComponent) this.c.mo408a(fpf0.a(FaveComponent.class))).xf();
            default:
                return (SharingComponent) this.c.a(fpf0.a(SharingComponent.class));
        }
    }
}
