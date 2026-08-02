package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.errorhandler.DocumentServiceErrorHandlerImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.parser.ActionTemplatesSharedDataParser;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.performance.DecodingVelocityMonitoringImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.NetworkCachingImpl;
import defpackage.axl;
import defpackage.bvf0;
import defpackage.d0m;
import defpackage.ekm0;
import defpackage.enr0;
import defpackage.hv90;
import defpackage.ihe;
import defpackage.jp50;
import defpackage.jse;
import defpackage.l2m;
import defpackage.lu00;
import defpackage.m0m;
import defpackage.mdh;
import defpackage.p1m;
import defpackage.r1m;
import defpackage.r2m;
import defpackage.r370;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyg;
import defpackage.uyi0;
import defpackage.uyj;
import defpackage.v1m;
import defpackage.vg5;
import defpackage.zw;
import flex.core.loader.network.d;
import flex.core.loader.network.e;
import flex.parser.transition.h;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.coroutines.EmptyCoroutineContext;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010$\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0010H\u0007¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020 H\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0004H\u0007¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020/H\u0007¢\u0006\u0004\b0\u00101J\u0019\u00104\u001a\u00020\u00062\b\u00103\u001a\u0004\u0018\u000102H\u0007¢\u0006\u0004\b4\u00105¨\u00066"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/module/flex/network/FlexNetworkModule;", "", "<init>", "()V", "Ljse;", "coroutineDispatcher", "Luyg;", "decodingVelocityMonitoring", "Ll2m;", "documentResponseParserFactory", "Lr2m;", "errorHandler", "Llu00;", "mapiClient", "Ljp50;", "networkCaching", "", "Lhv90;", "payloadExtenders", "Lm0m;", "provideDocumentLoader", "(Ljse;Luyg;Ll2m;Lr2m;Llu00;Ljp50;Ljava/util/Set;)Lm0m;", "Ld0m;", "documentJsonProvider", "provideDocumentResponseParserFactory", "(Ld0m;)Ll2m;", "Lihe;", "contentParser", "Lekm0;", "scaffoldParser", "Lzw;", "actionParser", "Lenr0;", "sharedDataParser", "Lr1m;", "documentParserExtensions", "provideDocumentJsonProvider", "(Lihe;Lekm0;Lzw;Lenr0;Ljava/util/Set;)Ld0m;", "provideSharedDataParser", "()Lenr0;", "provideNetworkCaching", "()Ljp50;", "provideCoroutineDispatcher", "()Ljse;", "Ltse;", "provideCoroutineScope", "()Ltse;", "Lvg5;", "provideDocumentServiceErrorHandler", "(Lvg5;)Lr2m;", "Luyi0;", "renderingEventsListener", "provideDecodingVelocityMonitoring", "(Luyi0;)Luyg;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlexNetworkModule {
    public final jse provideCoroutineDispatcher() {
        sjh sjhVar = uyj.a;
        return mdh.b;
    }

    public final tse provideCoroutineScope() {
        return bvf0.a(EmptyCoroutineContext.a);
    }

    public final uyg provideDecodingVelocityMonitoring(uyi0 renderingEventsListener) {
        return new DecodingVelocityMonitoringImpl(renderingEventsListener);
    }

    public final d0m provideDocumentJsonProvider(ihe contentParser, ekm0 scaffoldParser, zw actionParser, enr0 sharedDataParser, Set<r1m> documentParserExtensions) {
        return new d0m(new p1m(), new v1m(), new axl(), contentParser, scaffoldParser, actionParser, sharedDataParser, new r370(), new h(), a.J0(documentParserExtensions));
    }

    public final m0m provideDocumentLoader(jse coroutineDispatcher, uyg decodingVelocityMonitoring, l2m documentResponseParserFactory, r2m errorHandler, lu00 mapiClient, jp50 networkCaching, Set<hv90> payloadExtenders) {
        return new e(new d(mapiClient, documentResponseParserFactory, coroutineDispatcher, errorHandler, networkCaching, null, null, decodingVelocityMonitoring, 0), a.J0(payloadExtenders));
    }

    public final l2m provideDocumentResponseParserFactory(d0m documentJsonProvider) {
        return new l2m(documentJsonProvider, (uyg) null);
    }

    public final r2m provideDocumentServiceErrorHandler(vg5 errorHandler) {
        return new DocumentServiceErrorHandlerImpl(errorHandler);
    }

    public final jp50 provideNetworkCaching() {
        return new NetworkCachingImpl();
    }

    public final enr0 provideSharedDataParser() {
        return new enr0(Collections.singletonList(new ActionTemplatesSharedDataParser()), null);
    }
}
