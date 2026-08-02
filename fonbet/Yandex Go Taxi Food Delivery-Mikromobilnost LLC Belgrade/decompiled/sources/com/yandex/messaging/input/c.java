package com.yandex.messaging.input;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.base.rights.ChatRightsFlag;
import com.yandex.messaging.internal.auth.AuthorizationObservable$AuthState;
import defpackage.ayj0;
import defpackage.bvf0;
import defpackage.e1k;
import defpackage.eyj0;
import defpackage.in3;
import defpackage.j3b;
import defpackage.jn3;
import defpackage.kgx;
import defpackage.lyv;
import defpackage.mdb;
import defpackage.ryv;
import defpackage.s8b;
import defpackage.tje;
import defpackage.w511;
import defpackage.wbz0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class c {
    public final ChatRequest a;
    public final com.yandex.messaging.internal.e b;
    public final jn3 c;
    public final eyj0 d;
    public final ryv e;
    public final r0 f;
    public j3b g;
    public boolean h;
    public boolean i;
    public ayj0 j;
    public e1k k;

    public c(ChatRequest chatRequest, com.yandex.messaging.internal.e eVar, com.yandex.messaging.navigation.c cVar, jn3 jn3Var, eyj0 eyj0Var, ryv ryvVar, mdb mdbVar) {
        this.a = chatRequest;
        this.b = eVar;
        this.c = jn3Var;
        this.d = eyj0Var;
        this.e = ryvVar;
        InputState inputState = InputState.EMPTY;
        r0 c = bvf0.c(inputState);
        this.f = c;
        if (!mdbVar.e) {
            c.l(inputState);
            return;
        }
        tje.N(cVar, null, null, new InputDispatcher$1(this, null), 3);
        cVar.a(new InputDispatcher$2(1, this, c.class, "onDestroy", "onDestroy()V", 4));
        this.k = jn3Var.d(new in3(1, this));
        c();
    }

    public static s8b a(j3b j3bVar) {
        wbz0 wbz0Var = s8b.c;
        int i = j3bVar.i;
        wbz0Var.getClass();
        return new s8b(i);
    }

    public final InputState b(j3b j3bVar, InputState inputState, InputState inputState2) {
        jn3 jn3Var = this.c;
        jn3Var.getClass();
        tje.e();
        AuthorizationObservable$AuthState authorizationObservable$AuthState = jn3Var.i;
        if (authorizationObservable$AuthState == null) {
            authorizationObservable$AuthState = jn3Var.a();
            jn3Var.i = authorizationObservable$AuthState;
        }
        int i = lyv.a[authorizationObservable$AuthState.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return j3bVar.r ? InputState.AUTHORIZATION : InputState.AUTHORIZATION_WITHOUT_PHONE;
        }
        if (i == 4) {
            return inputState2;
        }
        if (i == 5) {
            return inputState;
        }
        w511.b();
        return null;
    }

    public final void c() {
        InputState inputState;
        j3b j3bVar = this.g;
        if (this.h) {
            inputState = InputState.SEARCH_NAVIGATION;
        } else if (this.e.e) {
            inputState = InputState.EDIT;
        } else if (j3bVar == null) {
            inputState = InputState.EMPTY;
        } else {
            String str = j3bVar.e;
            boolean z = j3bVar.C;
            boolean z2 = j3bVar.G;
            if (j3bVar.J) {
                if (z2) {
                    inputState = InputState.WRITING_WITHOUT_AUTH;
                } else if (j3bVar.q || a(j3bVar).m() || a(j3bVar).l()) {
                    InputState inputState2 = InputState.WRITING_WITHOUT_AUTH;
                    InputState inputState3 = InputState.WRITING_WITH_AUTH;
                    inputState = b(j3bVar, inputState2, inputState3);
                    if ((inputState == inputState2 || inputState == inputState3) && z && str != null && this.i) {
                        inputState = InputState.UNBLOCKING;
                    }
                } else {
                    inputState = InputState.EMPTY;
                }
            } else if (j3bVar.I) {
                inputState = a(j3bVar).l() ? b(j3bVar, InputState.WRITING_WITHOUT_AUTH, InputState.WRITING_WITH_AUTH) : InputState.CHANNEL;
            } else if (j3bVar.M) {
                inputState = a(j3bVar).l() ? InputState.WRITING_WITHOUT_AUTH : InputState.EMPTY;
            } else if (!j3bVar.l && !a(j3bVar).l()) {
                s8b a = a(j3bVar);
                ChatRightsFlag chatRightsFlag = ChatRightsFlag.Join;
                kgx kgxVar = s8b.d[0];
                if (chatRightsFlag.c(a).booleanValue()) {
                    InputState inputState4 = InputState.JOIN;
                    inputState = b(j3bVar, inputState4, inputState4);
                } else {
                    inputState = InputState.EMPTY;
                }
            } else if (!a(j3bVar).l()) {
                inputState = InputState.EMPTY;
            } else if (j3bVar.D || z2) {
                inputState = InputState.WRITING_WITHOUT_AUTH;
            } else {
                InputState inputState5 = InputState.WRITING_WITHOUT_AUTH;
                InputState inputState6 = InputState.WRITING_WITH_AUTH;
                inputState = b(j3bVar, inputState5, inputState6);
                if ((inputState == inputState5 || inputState == inputState6) && z && str != null && this.i) {
                    inputState = InputState.UNBLOCKING;
                }
            }
        }
        this.f.l(inputState);
    }
}
