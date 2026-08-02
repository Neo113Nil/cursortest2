package xsna;

import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.settings.api.di.NotificationsSettingsComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class jia implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ jia(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (ClipEditComponent) this.c.a(fpf0.a(ClipEditComponent.class));
            default:
                return (NotificationsSettingsComponent) this.c.a(fpf0.a(NotificationsSettingsComponent.class));
        }
    }
}
