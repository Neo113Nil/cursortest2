package com.yandex.go.ultima_mode.ui.progress_bar.state;

import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import defpackage.bvf0;
import defpackage.ief;
import defpackage.xdf;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class a {
    public final xdf a;
    public final e b;

    public a(xdf xdfVar, e eVar) {
        this.a = xdfVar;
        this.b = eVar;
    }

    public final Object a(UltimaModeResponse.ProgressBar progressBar, ief iefVar, SuspendLambda suspendLambda) {
        return bvf0.n(new UltimaModeProgressBarUiStateMapper$map$2(iefVar, progressBar, this, null), suspendLambda);
    }
}
