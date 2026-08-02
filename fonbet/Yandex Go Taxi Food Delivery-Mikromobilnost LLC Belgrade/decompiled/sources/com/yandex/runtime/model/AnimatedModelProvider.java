package com.yandex.runtime.model;

import java.util.UUID;

/* loaded from: classes8.dex */
public abstract class AnimatedModelProvider {
    public static AnimatedModelProvider fromAnimatedModel(final AnimatedModel animatedModel) {
        final String str = "animation/model:" + UUID.randomUUID().toString();
        return new AnimatedModelProvider() { // from class: com.yandex.runtime.model.AnimatedModelProvider.1
            @Override // com.yandex.runtime.model.AnimatedModelProvider
            public String getId() {
                return str;
            }

            @Override // com.yandex.runtime.model.AnimatedModelProvider
            public AnimatedModel getModel() {
                return animatedModel;
            }
        };
    }

    public abstract String getId();

    public abstract AnimatedModel getModel();
}
