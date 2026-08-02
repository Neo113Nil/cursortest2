package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.controller;

import android.content.Context;
import com.yandex.div.core.Div2Context;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.annotation.FlexContentKey;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.contentcontroller.DivkitContentControllerFactory;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.contentcontroller.SkeletonContentControllerFactory;
import defpackage.aks0;
import defpackage.etl;
import defpackage.jfe;
import defpackage.lfe;
import defpackage.omb1;
import defpackage.pey;
import defpackage.see;
import defpackage.thr;
import defpackage.vh5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u001a\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/module/flex/controller/FlexContentControllersModule;", "", "<init>", "()V", "", "Ljava/lang/Class;", "Lsee;", "Llfe;", "controllerFactories", "Ljfe;", "provideContentControllerAdapter", "(Ljava/util/Map;)Ljfe;", "Lcom/yandex/div/core/Div2Context;", "div2Context", "provideDivkitContentControllerFactory", "(Lcom/yandex/div/core/Div2Context;)Llfe;", "Lvh5;", "themeProvider", "provideSkeletonContentControllerFactory", "(Lvh5;)Llfe;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlexContentControllersModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Div2Context provideDivkitContentControllerFactory$lambda$0(Div2Context div2Context, Context context, pey peyVar) {
        return div2Context;
    }

    public final jfe provideContentControllerAdapter(Map<Class<? extends see>, lfe> controllerFactories) {
        return new jfe(omb1.d(controllerFactories), EmptyList.a, true);
    }

    @FlexContentKey(etl.class)
    public final lfe provideDivkitContentControllerFactory(Div2Context div2Context) {
        return new DivkitContentControllerFactory(new thr(div2Context, 0));
    }

    @FlexContentKey(aks0.class)
    public final lfe provideSkeletonContentControllerFactory(vh5 themeProvider) {
        return new SkeletonContentControllerFactory(themeProvider);
    }
}
