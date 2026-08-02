package xsna;

import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.im.chat.api.ChatComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class knh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ knh(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((ReviewsComponent) this.c.a(fpf0.a(ReviewsComponent.class))).Md();
            default:
                return ((ChatComponent) this.c.a(fpf0.a(ChatComponent.class))).Cf();
        }
    }
}
