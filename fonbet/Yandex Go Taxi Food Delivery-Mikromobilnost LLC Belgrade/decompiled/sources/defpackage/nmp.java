package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import ru.yandex.taxi.controller.feature.compat.FeatureStubFragment;

/* loaded from: classes9.dex */
public final class nmp {
    public static FeatureStubFragment a(omp ompVar, Screen screen, fje fjeVar) {
        FeatureStubFragment featureStubFragment = new FeatureStubFragment(null);
        featureStubFragment.config = ompVar;
        featureStubFragment.screen = screen;
        if (fjeVar != null) {
            featureStubFragment.contentViewFactory = fjeVar;
        }
        return featureStubFragment;
    }
}
