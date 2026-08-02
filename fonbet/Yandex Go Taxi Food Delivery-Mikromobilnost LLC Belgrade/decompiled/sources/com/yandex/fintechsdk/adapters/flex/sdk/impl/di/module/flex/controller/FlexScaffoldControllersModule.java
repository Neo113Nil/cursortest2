package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.controller;

import android.content.Context;
import com.yandex.div.core.Div2Context;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.annotation.FlexScaffoldKey;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitScaffoldControllerFactory;
import defpackage.exy0;
import defpackage.mjm0;
import defpackage.omb1;
import defpackage.pey;
import defpackage.sjm0;
import defpackage.thr;
import defpackage.ujm0;
import defpackage.wul;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u001a\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/module/flex/controller/FlexScaffoldControllersModule;", "", "<init>", "()V", "", "Ljava/lang/Class;", "Lmjm0;", "Lujm0;", "controllerFactories", "Lsjm0;", "provideScaffoldControllerAdapter", "(Ljava/util/Map;)Lsjm0;", "Lcom/yandex/div/core/Div2Context;", "div2Context", "Lexy0;", "themedColorResolver", "provideDivkitScaffoldControllerFactory", "(Lcom/yandex/div/core/Div2Context;Lexy0;)Lujm0;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlexScaffoldControllersModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Div2Context provideDivkitScaffoldControllerFactory$lambda$0(Div2Context div2Context, Context context, pey peyVar) {
        return div2Context;
    }

    @FlexScaffoldKey(wul.class)
    public final ujm0 provideDivkitScaffoldControllerFactory(Div2Context div2Context, exy0 themedColorResolver) {
        return new DivkitScaffoldControllerFactory(new thr(div2Context, 1), themedColorResolver);
    }

    public final sjm0 provideScaffoldControllerAdapter(Map<Class<? extends mjm0>, ujm0> controllerFactories) {
        return new sjm0(omb1.d(controllerFactories), EmptyList.a, true);
    }
}
