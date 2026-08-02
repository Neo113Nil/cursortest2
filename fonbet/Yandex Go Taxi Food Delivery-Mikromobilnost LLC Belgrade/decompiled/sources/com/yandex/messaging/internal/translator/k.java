package com.yandex.messaging.internal.translator;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import com.yandex.messaging.ChatRequest;
import defpackage.ffx;
import defpackage.fz01;
import defpackage.lqo;
import defpackage.mdb;
import defpackage.nz01;
import defpackage.r96;
import defpackage.r99;
import defpackage.tga1;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tz10;
import defpackage.w0c;
import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes15.dex */
public final class k {
    public final Lifecycle a;
    public final g b;
    public final lqo c;
    public final mdb d;
    public final w0c e;
    public final r99 f;
    public final nz01 g;
    public final LinkedHashMap h = new LinkedHashMap();

    public k(Lifecycle lifecycle, g gVar, lqo lqoVar, mdb mdbVar, w0c w0cVar, r99 r99Var, nz01 nz01Var) {
        this.a = lifecycle;
        this.b = gVar;
        this.c = lqoVar;
        this.d = mdbVar;
        this.e = w0cVar;
        this.f = r99Var;
        this.g = nz01Var;
    }

    public final void a(ChatRequest chatRequest) {
        r96 r96Var = tz10.s;
        lqo lqoVar = this.c;
        if (lqoVar.a(r96Var)) {
            if (!tga1.d(lqoVar)) {
                w0c w0cVar = this.e;
                tje.N(w0cVar.c, null, null, new ClearChatTranslationUseCase$execute$1(w0cVar, chatRequest, null), 3);
            }
            c(chatRequest).a.g(null);
        }
    }

    public final tpr b(ChatRequest chatRequest) {
        return kotlinx.coroutines.flow.e.t(c(chatRequest).b);
    }

    public final fz01 c(ChatRequest chatRequest) {
        tje.e();
        LinkedHashMap linkedHashMap = this.h;
        Object obj = linkedHashMap.get(chatRequest);
        if (obj == null) {
            n0 c = ffx.c(1, 0, null, 6);
            n0 c2 = ffx.c(1, 0, null, 6);
            tje.N(r.a(this.a), null, null, new TranslationLanguageUiController$createFlow$1(this, c2, c, chatRequest, null), 3);
            obj = new fz01(c, c2);
            linkedHashMap.put(chatRequest, obj);
        }
        return (fz01) obj;
    }

    public final Object d(ChatRequest chatRequest, ContinuationImpl continuationImpl) {
        if (this.c.a(tz10.s)) {
            return kotlinx.coroutines.flow.e.y(b(chatRequest), continuationImpl);
        }
        return null;
    }

    public final void e(ChatRequest chatRequest, String str) {
        if (this.c.a(tz10.s)) {
            r99 r99Var = this.f;
            tje.N(r99Var.c, null, null, new ChangeChatTranslationUseCase$execute$1(r99Var, chatRequest, str, null), 3);
            c(chatRequest).a.g(str);
        }
    }
}
