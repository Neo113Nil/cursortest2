package xsna;

import com.vk.ads.stats.api.di.AdPixelStatsComponent;
import com.vk.music.pref.MusicPrefsComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class vb60 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ vb60(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (AdPixelStatsComponent) this.c.a(fpf0.a(AdPixelStatsComponent.class));
            default:
                return ((MusicPrefsComponent) this.c.a(fpf0.a(MusicPrefsComponent.class))).Q0();
        }
    }
}
