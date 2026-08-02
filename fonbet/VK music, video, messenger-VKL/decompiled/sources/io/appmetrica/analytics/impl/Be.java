package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;

/* loaded from: classes8.dex */
public final class Be implements U6 {
    public final File a;
    public final Tg b;

    public Be(File file, Tg tg) {
        this.a = file;
        this.b = tg;
    }

    @Override // io.appmetrica.analytics.impl.U6
    public final File a(Context context, String str) {
        return new File(this.a, this.b.a(str));
    }
}
