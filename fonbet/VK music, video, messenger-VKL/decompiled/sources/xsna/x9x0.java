package xsna;

import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.writebar.WriteBar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class x9x0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x9x0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((NewsFeedComponent) ((k7m) m7m.f((y9x0) this.c)).a(fpf0.a(NewsFeedComponent.class))).Vb();
            case 1:
                WriteBar writeBar = (WriteBar) this.c;
                if (writeBar.e0.n) {
                    writeBar.post(new yh9(writeBar, 16));
                }
                return s3q0.a;
            default:
                return ((c1y0) this.c).b().getButtonSend();
        }
    }
}
