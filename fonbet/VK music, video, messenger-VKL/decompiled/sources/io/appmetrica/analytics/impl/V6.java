package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import java.io.File;

@DoNotInline
/* loaded from: classes8.dex */
public final class V6 implements U6 {
    private final Tg a;

    public V6(Tg tg) {
        this.a = tg;
    }

    @Override // io.appmetrica.analytics.impl.U6
    public File a(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), this.a.a(str));
    }
}
