package com.yandex.div.core.view2.reuse.util;

import com.yandex.div.core.view2.reuse.ExistingToken;
import com.yandex.div.core.view2.reuse.NewToken;

/* compiled from: RebindTokenUtils.kt */
/* loaded from: classes7.dex */
public final class RebindTokenUtilsKt {
    public static final ExistingToken combineTokens(ExistingToken existingToken, NewToken newToken) {
        return new ExistingToken(newToken.getItem(), newToken.getChildIndex(), existingToken.getView(), existingToken.getParentToken());
    }
}
