package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.parser.nested.NestedActionParserExtension;
import defpackage.f6x;
import defpackage.fj2;
import defpackage.hxk;
import defpackage.ki2;
import defpackage.mui0;
import defpackage.ph2;
import defpackage.r1m;
import defpackage.zgl;
import defpackage.zw;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/module/flex/network/FlexDocumentParserExtensionsModule;", "", "<init>", "()V", "Lhxk;", "divKit", "Lr1m;", "provideDivkitDocumentParserExtension", "(Lhxk;)Lr1m;", "provideJasonStateParserExtension", "()Lr1m;", "provideRemoteActionParserExtension", "Lfj2;", "animationSerializerSelector", "provideAnimationDocumentParserExtension", "(Lfj2;)Lr1m;", "Lzw;", "actionParser", "provideNestedActionParserExtension", "(Lzw;)Lr1m;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlexDocumentParserExtensionsModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void provideAnimationDocumentParserExtension$lambda$0(ki2 ki2Var) {
    }

    public final r1m provideAnimationDocumentParserExtension(fj2 animationSerializerSelector) {
        return new ph2(animationSerializerSelector, new zgl(29), null);
    }

    public final r1m provideDivkitDocumentParserExtension(hxk divKit) {
        return new ph2(divKit, null);
    }

    public final r1m provideJasonStateParserExtension() {
        return new f6x();
    }

    public final r1m provideNestedActionParserExtension(zw actionParser) {
        return new NestedActionParserExtension(actionParser);
    }

    public final r1m provideRemoteActionParserExtension() {
        return new mui0();
    }
}
