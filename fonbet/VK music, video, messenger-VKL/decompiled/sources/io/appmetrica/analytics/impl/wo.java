package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* loaded from: classes8.dex */
public final class wo implements Wa {
    @Override // io.appmetrica.analytics.impl.Wa
    @Nullable
    public final String a(@NonNull Context context) {
        IdentifiersResult q = new C4834ff(C5030n4.l().c(context).a(context)).q();
        if (TextUtils.isEmpty(q.id)) {
            return null;
        }
        return q.id;
    }
}
