package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.serializer.ContentSerializerSelectorImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.serializer.ScaffoldSerializerSelectorImpl;
import defpackage.cy;
import defpackage.ekm0;
import defpackage.gkm0;
import defpackage.ihe;
import defpackage.jw;
import defpackage.ku;
import defpackage.m530;
import defpackage.pge;
import defpackage.phe;
import defpackage.qir;
import defpackage.zjm0;
import defpackage.zw;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/module/flex/network/FlexParsersModule;", "", "<init>", "()V", "Lcy;", "actionSerializerSelector", "Lzw;", "provideActionParser", "(Lcy;)Lzw;", "Lphe;", "serializerSelector", "Lihe;", "provideContentParser", "(Lphe;)Lihe;", "Lgkm0;", "Lekm0;", "provideScaffoldParser", "(Lgkm0;)Lekm0;", "provideContentSerializerSelector", "()Lphe;", "provideScaffoldSerializerSelector", "()Lgkm0;", "Lku;", "actionDecoderFactory", "provideActionSerializerSelector", "(Lku;)Lcy;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlexParsersModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void provideActionParser$lambda$0(jw jwVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void provideContentParser$lambda$1(pge pgeVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void provideScaffoldParser$lambda$2(zjm0 zjm0Var) {
    }

    public final zw provideActionParser(cy actionSerializerSelector) {
        return new zw(actionSerializerSelector, new qir(3), null);
    }

    public final cy provideActionSerializerSelector(ku actionDecoderFactory) {
        return new m530(actionDecoderFactory.a);
    }

    public final ihe provideContentParser(phe serializerSelector) {
        return new ihe(serializerSelector, new qir(4), null);
    }

    public final phe provideContentSerializerSelector() {
        return new ContentSerializerSelectorImpl();
    }

    public final ekm0 provideScaffoldParser(gkm0 serializerSelector) {
        return new ekm0(serializerSelector, new qir(5), null);
    }

    public final gkm0 provideScaffoldSerializerSelector() {
        return new ScaffoldSerializerSelectorImpl();
    }
}
