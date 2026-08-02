package com.yandex.messaging.ui.imageviewer;

import android.os.Bundle;
import defpackage.aos;
import defpackage.av4;
import defpackage.br10;
import defpackage.ccg;
import defpackage.chv;
import defpackage.gc;
import defpackage.i5m;
import defpackage.jhv;
import defpackage.kt11;
import defpackage.n3w;
import defpackage.ny61;
import defpackage.os11;
import defpackage.vng;
import defpackage.vpr;
import defpackage.vu;
import defpackage.xat;
import defpackage.xvf0;
import defpackage.ybg;
import defpackage.ys10;
import defpackage.z83;
import defpackage.zbg;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ImageViewerActivity b;
    public final /* synthetic */ Bundle c;

    public b(vpr vprVar, ImageViewerActivity imageViewerActivity, Bundle bundle) {
        this.a = vprVar;
        this.b = imageViewerActivity;
        this.c = bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ImageViewerActivity$onCreate$$inlined$map$1$2$1 imageViewerActivity$onCreate$$inlined$map$1$2$1;
        int i;
        com.yandex.alicekit.core.permissions.b bVar;
        os11 ui;
        int i2;
        if (continuation instanceof ImageViewerActivity$onCreate$$inlined$map$1$2$1) {
            imageViewerActivity$onCreate$$inlined$map$1$2$1 = (ImageViewerActivity$onCreate$$inlined$map$1$2$1) continuation;
            int i3 = imageViewerActivity$onCreate$$inlined$map$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                imageViewerActivity$onCreate$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = imageViewerActivity$onCreate$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = imageViewerActivity$onCreate$$inlined$map$1$2$1.label;
                int i4 = 1;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj2);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj2);
                kt11 kt11Var = (kt11) obj;
                ImageViewerActivity imageViewerActivity = this.b;
                imageViewerActivity.getIntent().getExtras();
                z83.i();
                Bundle extras = imageViewerActivity.getIntent().getExtras();
                if (extras == null) {
                    i2 = 1;
                } else {
                    ccg ccgVar = ((ccg) kt11Var).b;
                    String string = extras.getString("chat_id");
                    ImageViewerInfo imageViewerInfo = (ImageViewerInfo) vng.u(extras, ImageViewerInfo.class, "initial");
                    ArrayList v = vng.v(extras, ImageViewerInfo.class, "gallery");
                    ImageViewerMessageActions imageViewerMessageActions = (ImageViewerMessageActions) vng.u(extras, ImageViewerMessageActions.class, "message_actions");
                    ImageViewerArgs$Sender imageViewerArgs$Sender = (ImageViewerArgs$Sender) vng.w(extras, ImageViewerArgs$Sender.class, "sender");
                    if (imageViewerArgs$Sender == null) {
                        imageViewerArgs$Sender = ImageViewerArgs$Sender.Chat;
                    }
                    chv chvVar = new chv(string, imageViewerInfo, v, imageViewerMessageActions, imageViewerArgs$Sender);
                    bVar = imageViewerActivity.permissionManager;
                    bVar.getClass();
                    n3w a = n3w.a(imageViewerActivity);
                    n3w a2 = n3w.a(chvVar);
                    xvf0 b = i5m.b(new aos(a2, 2));
                    n3w a3 = n3w.a(bVar);
                    ybg ybgVar = ccgVar.m;
                    ys10 ys10Var = new ys10((xvf0) a, (xvf0) new br10(ybgVar, 3), 0);
                    xvf0 b2 = i5m.b(new vu(a, ccgVar.Q, ybgVar, 9));
                    n3w b3 = n3w.b(this.c);
                    xvf0 b4 = i5m.b(new xat(i5m.b(new gc(a, a2, ccgVar.F, ccgVar.G, ccgVar.m0, i5m.b(new aos(a, i4)), b3, ccgVar.j0, ccgVar.b0)), 22));
                    zbg zbgVar = ccgVar.Q;
                    jhv jhvVar = (jhv) i5m.b(new gc(a, b, zbgVar, a3, ys10Var, b2, b3, new av4(b4, a, zbgVar, ccgVar.m, ccgVar.h, 3), ccgVar.f)).get();
                    imageViewerActivity.brick = jhvVar;
                    ui = imageViewerActivity.getUi();
                    ui.c.a(jhvVar);
                    i2 = 1;
                }
                imageViewerActivity$onCreate$$inlined$map$1$2$1.label = i2;
                return this.a.emit(zy11Var, imageViewerActivity$onCreate$$inlined$map$1$2$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        imageViewerActivity$onCreate$$inlined$map$1$2$1 = new ImageViewerActivity$onCreate$$inlined$map$1$2$1(this, continuation);
        Object obj22 = imageViewerActivity$onCreate$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = imageViewerActivity$onCreate$$inlined$map$1$2$1.label;
        int i42 = 1;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
