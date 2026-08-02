package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.animation;

import defpackage.ch2;
import defpackage.dh2;
import defpackage.fj2;
import defpackage.gj2;
import defpackage.jl40;
import defpackage.jys;
import defpackage.mjd;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/module/flex/animation/FlexAnimationsModule;", "", "<init>", "()V", "Lch2;", "provideAnimationDecoderFactory", "()Lch2;", "animationDecoderFactory", "Lfj2;", "provideAnimationSerializerSelector", "(Lch2;)Lfj2;", "Companion", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlexAnimationsModule {
    private static final Companion Companion = new Companion(null);
    private static final String GENERIC_ANIM_TYPE = "GenericAnimation";

    public final ch2 provideAnimationDecoderFactory() {
        return new ch2(new mjd(new dh2[]{new dh2() { // from class: com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.animation.FlexAnimationsModule$provideAnimationDecoderFactory$animationDecoderModule$1
            @Override // defpackage.dh2
            public jys decoder(String type) {
                if (jl40.l(type, "GenericAnimation")) {
                    return new jys();
                }
                return null;
            }
        }}));
    }

    public final fj2 provideAnimationSerializerSelector(ch2 animationDecoderFactory) {
        return new gj2(animationDecoderFactory.a);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/module/flex/animation/FlexAnimationsModule$Companion;", "", "<init>", "()V", "GENERIC_ANIM_TYPE", "", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
