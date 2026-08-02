package com.yandex.messaging.domain.statuses;

import android.app.Activity;
import com.yandex.messaging.ChatRequest;
import defpackage.fft;
import defpackage.g92;
import defpackage.h3y;
import defpackage.pdt;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.u9u0;

/* loaded from: classes15.dex */
public final class f {
    public final Activity a;
    public final pdt b;
    public final fft c;
    public final h3y d;
    public final com.yandex.messaging.domain.chat.c e;
    public final com.yandex.messaging.domain.personal.a f;

    public f(Activity activity, pdt pdtVar, fft fftVar, h3y h3yVar, com.yandex.messaging.domain.chat.c cVar, com.yandex.messaging.domain.personal.a aVar) {
        this.a = activity;
        this.b = pdtVar;
        this.c = fftVar;
        this.d = h3yVar;
        this.e = cVar;
        this.f = aVar;
    }

    public final tpr a(ChatRequest chatRequest) {
        return !((u9u0) this.d.get()).w ? new g92(2, null) : kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(new rol0(new GetDndWarningUseCase$execute$1(this, chatRequest, null)), new GetDndWarningUseCase$execute$$inlined$flatMapLatest$1(this, null)));
    }
}
