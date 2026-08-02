package com.yandex.messaging.input.util;

import android.graphics.Rect;
import android.view.View;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.bvf0;
import defpackage.dkx;
import defpackage.kjs0;
import defpackage.o6;
import defpackage.zq60;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.r0;
import kotlinx.coroutines.flow.t0;

/* loaded from: classes15.dex */
public final class a {
    public final View a;
    public final zq60 b = new zq60();
    public final dkx c = new dkx();
    public final r0 d;
    public final k e;
    public final o6 f;

    public a(View view) {
        this.a = view;
        r0 c = bvf0.c(Boolean.valueOf(a()));
        this.d = c;
        this.e = new k(new t0(c, new KeyboardDetector$keyboardVisibility$1(this, null)), new KeyboardDetector$keyboardVisibility$2(this, null));
        this.f = new o6(6, this);
    }

    public final boolean a() {
        Rect rect = new Rect();
        View view = this.a;
        view.getWindowVisibleDisplayFrame(rect);
        return view.getRootView().getHeight() - rect.height() > kjs0.b(PollMessageDraft.MAX_ANSWER_LENGTH);
    }
}
