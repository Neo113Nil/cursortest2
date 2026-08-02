package com.yandex.go.feedback_common.data.model;

import com.yandex.go.feedback_common.data.model.FeedbackParam;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class a {
    public static FeedbackParam a(FeedbackParam.a aVar) {
        String str = aVar.a;
        if (str == null) {
            str = "";
        }
        return new FeedbackParam(str, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i);
    }

    public final KSerializer serializer() {
        return FeedbackParam$$serializer.INSTANCE;
    }
}
