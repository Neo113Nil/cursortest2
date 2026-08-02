package com.yandex.div.internal.viewpool.optimization;

import android.content.Context;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.yt31;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class a {
    public static final WeakHashMap c = new WeakHashMap();
    public final Context a;
    public final yt31 b;

    public a(Context context, yt31 yt31Var) {
        this.a = context;
        this.b = yt31Var;
    }

    public final Object a(String str, Continuation continuation) {
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new ViewPreCreationProfileRepository$get$2(this, str, null), continuation);
    }
}
