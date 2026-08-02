package com.yandex.messaging.activity.calls;

import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.alicekit.core.permissions.b;
import defpackage.ccg;
import defpackage.kt11;
import defpackage.ny61;
import defpackage.o020;
import defpackage.p020;
import defpackage.pvq;
import defpackage.r020;
import defpackage.vng;
import defpackage.vpr;
import defpackage.xbg;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ MessengerCallFeedbackActivity b;
    public final /* synthetic */ MessengerCallFeedbackActivity c;
    public final /* synthetic */ p020 w;

    public a(vpr vprVar, MessengerCallFeedbackActivity messengerCallFeedbackActivity, MessengerCallFeedbackActivity messengerCallFeedbackActivity2, p020 p020Var) {
        this.a = vprVar;
        this.b = messengerCallFeedbackActivity;
        this.c = messengerCallFeedbackActivity2;
        this.w = p020Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MessengerCallFeedbackActivity$ComponentDispatcher$componentFlow$$inlined$map$1$2$1 messengerCallFeedbackActivity$ComponentDispatcher$componentFlow$$inlined$map$1$2$1;
        int i;
        pvq ui;
        b bVar;
        if (continuation instanceof MessengerCallFeedbackActivity$ComponentDispatcher$componentFlow$$inlined$map$1$2$1) {
            messengerCallFeedbackActivity$ComponentDispatcher$componentFlow$$inlined$map$1$2$1 = (MessengerCallFeedbackActivity$ComponentDispatcher$componentFlow$$inlined$map$1$2$1) continuation;
            int i2 = messengerCallFeedbackActivity$ComponentDispatcher$componentFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                messengerCallFeedbackActivity$ComponentDispatcher$componentFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = messengerCallFeedbackActivity$ComponentDispatcher$componentFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = messengerCallFeedbackActivity$ComponentDispatcher$componentFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ccg ccgVar = ((ccg) ((kt11) obj)).b;
                    MessengerCallFeedbackActivity messengerCallFeedbackActivity = this.b;
                    ui = messengerCallFeedbackActivity.getUi();
                    ui.getRoot().getClass();
                    o020 o020Var = new o020(messengerCallFeedbackActivity);
                    bVar = messengerCallFeedbackActivity.permissionManager;
                    bVar.getClass();
                    r020 r020Var = MessengerCallFeedbackArguments.Companion;
                    Bundle extras = this.c.getIntent().getExtras();
                    if (extras == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    r020Var.getClass();
                    Parcelable parcelable = (Parcelable) vng.u(extras, MessengerCallFeedbackArguments.class, "call_feedback_arguments");
                    if (parcelable == null) {
                        ny61.r("missing required key call_feedback_arguments");
                        return null;
                    }
                    xbg xbgVar = new xbg(ccgVar, (MessengerCallFeedbackArguments) parcelable, messengerCallFeedbackActivity, o020Var);
                    this.w.b = xbgVar;
                    messengerCallFeedbackActivity$ComponentDispatcher$componentFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(xbgVar, messengerCallFeedbackActivity$ComponentDispatcher$componentFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        messengerCallFeedbackActivity$ComponentDispatcher$componentFlow$$inlined$map$1$2$1 = new MessengerCallFeedbackActivity$ComponentDispatcher$componentFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = messengerCallFeedbackActivity$ComponentDispatcher$componentFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = messengerCallFeedbackActivity$ComponentDispatcher$componentFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
