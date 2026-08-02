package com.yandex.messaging.internal.menu;

import android.app.Activity;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.domain.chat.e;
import com.yandex.messaging.domain.chat.h;
import com.yandex.messaging.internal.g;
import com.yandex.messaging.internal.view.chat.f;
import defpackage.ab4;
import defpackage.b00;
import defpackage.c3b;
import defpackage.i1b;
import defpackage.io9;
import defpackage.key0;
import defpackage.lqo;
import defpackage.nka1;
import defpackage.p4t;
import defpackage.sfl0;
import defpackage.sk7;
import defpackage.tje;
import defpackage.w270;
import defpackage.y4b;
import defpackage.zrm;

/* loaded from: classes15.dex */
public final class c {
    public final Activity a;
    public final b00 b;
    public final c3b c;
    public final sfl0 d;
    public final y4b e;
    public final com.yandex.messaging.ui.settings.c f;
    public final p4t g;
    public final g h;
    public final f i;
    public final e j;
    public final h k;
    public final zrm l;
    public final ab4 m;
    public final w270 n;
    public final key0 o;
    public final io9 p;
    public final com.yandex.messaging.domain.folders.c q;
    public final com.yandex.messaging.domain.statuses.e r;
    public final lqo s;
    public sk7 t;

    public c(Activity activity, b00 b00Var, c3b c3bVar, sfl0 sfl0Var, y4b y4bVar, com.yandex.messaging.ui.settings.c cVar, p4t p4tVar, g gVar, f fVar, e eVar, h hVar, zrm zrmVar, ab4 ab4Var, w270 w270Var, key0 key0Var, io9 io9Var, com.yandex.messaging.domain.folders.c cVar2, com.yandex.messaging.domain.statuses.e eVar2, i1b i1bVar, lqo lqoVar) {
        this.a = activity;
        this.b = b00Var;
        this.c = c3bVar;
        this.d = sfl0Var;
        this.e = y4bVar;
        this.f = cVar;
        this.g = p4tVar;
        this.h = gVar;
        this.i = fVar;
        this.j = eVar;
        this.k = hVar;
        this.l = zrmVar;
        this.m = ab4Var;
        this.n = w270Var;
        this.o = key0Var;
        this.p = io9Var;
        this.q = cVar2;
        this.r = eVar2;
        this.s = lqoVar;
    }

    public final void a(ExistingChatRequest existingChatRequest) {
        tje.N(nka1.c(this.a), null, null, new ChatHolderDialogMenuViewController$showChatMenu$1(this, existingChatRequest, "chat list", null), 3);
    }
}
