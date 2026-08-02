package defpackage;

import android.os.Bundle;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.presentation.bottomsheet.CustomBottomSheetStorageKt;
import flex.feature.document.fragment.DocumentDialogFragment;
import flex.feature.navigation.fragments.DocumentEngineDialogFragment;
import java.util.Map;

/* loaded from: classes4.dex */
public final class oyl implements djh {
    public final yvf0 a;

    public oyl(yvf0 yvf0Var) {
        this.a = yvf0Var;
    }

    public final DocumentEngineDialogFragment a(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, Map map) {
        DocumentEngineDialogFragment.Companion.getClass();
        DocumentEngineDialogFragment documentEngineDialogFragment = new DocumentEngineDialogFragment();
        DocumentDialogFragment.Companion.getClass();
        Bundle bundle = new Bundle(4);
        if (u1mVar != null) {
            bundle.putBundle("query", hk91.c(u1mVar));
        }
        if (ywlVar != null) {
            bundle.putString("document_label", h3m.b.b(ywlVar));
        }
        bundle.putBoolean("fullscreen", z);
        bundle.putBoolean("animated", z2);
        if (map != null) {
            c9y.h(bundle, map);
        }
        bundle.putString(CustomBottomSheetStorageKt.ENGINE_LABEL_KEY, lyl.b.b(this.a));
        documentEngineDialogFragment.setArguments(bundle);
        return documentEngineDialogFragment;
    }
}
