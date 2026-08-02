package xsna;

import com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent;
import com.vk.ecomm.onlinebooking.api.router.di.OnlineBookingComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ria implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ ria(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (ClipsTemplatesEditorComponent) this.c.a(fpf0.a(ClipsTemplatesEditorComponent.class));
            default:
                return (OnlineBookingComponent) this.c.a(fpf0.a(OnlineBookingComponent.class));
        }
    }
}
