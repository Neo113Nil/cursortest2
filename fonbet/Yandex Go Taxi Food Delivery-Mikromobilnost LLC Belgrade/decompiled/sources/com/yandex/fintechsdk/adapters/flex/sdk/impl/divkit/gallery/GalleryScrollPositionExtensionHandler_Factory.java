package com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.gallery;

import android.content.Context;
import com.yandex.div.core.expression.variables.a;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class GalleryScrollPositionExtensionHandler_Factory implements v7p {
    private final xvf0 contextProvider;
    private final xvf0 variableControllerProvider;

    private GalleryScrollPositionExtensionHandler_Factory(xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.contextProvider = xvf0Var;
        this.variableControllerProvider = xvf0Var2;
    }

    public static GalleryScrollPositionExtensionHandler_Factory create(xvf0 xvf0Var, xvf0 xvf0Var2) {
        return new GalleryScrollPositionExtensionHandler_Factory(xvf0Var, xvf0Var2);
    }

    public static GalleryScrollPositionExtensionHandler newInstance(Context context, a aVar) {
        return new GalleryScrollPositionExtensionHandler(context, aVar);
    }

    @Override // defpackage.yvf0
    public GalleryScrollPositionExtensionHandler get() {
        return newInstance((Context) this.contextProvider.get(), (a) this.variableControllerProvider.get());
    }
}
