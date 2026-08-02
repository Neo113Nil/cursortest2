package com.yandex.go.flex.main_screen.experiments;

import com.yandex.go.flex.main_screen.experiments.SuperAppMainScreenDocumentLoaderExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class e {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SuperAppMainScreenDocumentLoaderExperiment.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
