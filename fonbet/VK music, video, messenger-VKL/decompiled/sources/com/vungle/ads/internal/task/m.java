package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import com.vungle.ads.internal.util.PathProvider;
import kotlin.LazyThreadSafetyMode;
import xsna.msy;

/* loaded from: classes7.dex */
public final class m implements d {
    public final Context a;

    public m(Context context, PathProvider pathProvider) {
        this.a = context;
    }

    @Override // com.vungle.ads.internal.task.d
    public final int a(Bundle bundle, h hVar) {
        ((com.vungle.ads.internal.network.r) msy.a(LazyThreadSafetyMode.SYNCHRONIZED, new l(this.a)).getValue()).b();
        return 0;
    }
}
