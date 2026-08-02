package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes8.dex */
public final class Bo implements Co {
    @Override // io.appmetrica.analytics.impl.Co
    public final Ao a(@Nullable List<Ao> list) {
        LinkedList linkedList = new LinkedList();
        boolean z = true;
        for (Ao ao : list) {
            if (!ao.a) {
                linkedList.add(ao.b);
                z = false;
            }
        }
        return z ? new Ao(this, true, "") : new Ao(this, false, TextUtils.join(", ", linkedList));
    }
}
