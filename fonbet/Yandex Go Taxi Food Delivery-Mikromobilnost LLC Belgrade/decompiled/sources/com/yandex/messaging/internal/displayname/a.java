package com.yandex.messaging.internal.displayname;

import android.app.Activity;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.chat.g;
import defpackage.j4t;
import defpackage.mth;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class a {
    public final Activity a;
    public final j4t b;
    public final g c;

    public a(Activity activity, j4t j4tVar, g gVar) {
        this.a = activity;
        this.b = j4tVar;
        this.c = gVar;
    }

    public final mth a(ChatRequest chatRequest, int i) {
        return e.B(this.c.a(chatRequest), new ChatViewDataProvider$getChatUiData$1(this, chatRequest, i, null));
    }
}
