package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.action.decoder.custom.CustomActionDecoderModule;
import defpackage.kg5;
import defpackage.ku;
import defpackage.lu;
import defpackage.qid;
import defpackage.uoh;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ#\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/module/flex/action/FlexActionDecodersModule;", "", "<init>", "()V", "", "Llu;", "actionDecoderModules", "Lku;", "provideActionDecoderFactory", "(Ljava/util/Set;)Lku;", "provideRemoteActionDecoderModule", "()Llu;", "provideScenarioActionDecoderModule", "provideListActionDecoderModule", "provideNavigationActionDecoderModule", "provideTimedActionDecoderModule", "provideTemplatedActionDecoderModule", "", "Lkg5;", "Lig5;", "actionsInfo", "provideCustomActionDecoderModule", "(Ljava/util/List;)Llu;", "provideDocumentActionDecoderModule", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlexActionDecodersModule {
    public final ku provideActionDecoderFactory(Set<lu> actionDecoderModules) {
        return new ku(new qid(a.J0(actionDecoderModules)));
    }

    public final lu provideCustomActionDecoderModule(List<kg5> actionsInfo) {
        return new CustomActionDecoderModule(actionsInfo);
    }

    public final lu provideDocumentActionDecoderModule() {
        return uoh.c;
    }

    public final lu provideListActionDecoderModule() {
        return uoh.f;
    }

    public final lu provideNavigationActionDecoderModule() {
        return uoh.g;
    }

    public final lu provideRemoteActionDecoderModule() {
        return uoh.i;
    }

    public final lu provideScenarioActionDecoderModule() {
        return uoh.j;
    }

    public final lu provideTemplatedActionDecoderModule() {
        return uoh.m;
    }

    public final lu provideTimedActionDecoderModule() {
        return uoh.n;
    }
}
