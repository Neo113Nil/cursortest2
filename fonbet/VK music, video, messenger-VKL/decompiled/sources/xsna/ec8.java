package xsna;

import com.vk.clips.clipchecker.api.di.ClipCheckerComponent;
import com.vk.games.di.GamesCatalogComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ec8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ ec8(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (ClipCheckerComponent) this.c.a(fpf0.a(ClipCheckerComponent.class));
            default:
                return (GamesCatalogComponent) this.c.a(fpf0.a(GamesCatalogComponent.class));
        }
    }
}
