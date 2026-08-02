package com.yandex.quark.contracts.internal.alice;

import defpackage.ag3;
import defpackage.at1;
import defpackage.bg3;
import defpackage.bt1;
import defpackage.ny61;
import defpackage.va90;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zs1;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar, va90 va90Var, bg3 bg3Var) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        StartConversationAudioFocusManager$special$$inlined$map$1$2$1 startConversationAudioFocusManager$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof StartConversationAudioFocusManager$special$$inlined$map$1$2$1) {
            startConversationAudioFocusManager$special$$inlined$map$1$2$1 = (StartConversationAudioFocusManager$special$$inlined$map$1$2$1) continuation;
            int i2 = startConversationAudioFocusManager$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                startConversationAudioFocusManager$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = startConversationAudioFocusManager$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = startConversationAudioFocusManager$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    b.b(obj2);
                    bt1 bt1Var = (bt1) obj;
                    if (!(bt1Var instanceof at1) && !(bt1Var instanceof zs1)) {
                        w511.b();
                        return null;
                    }
                    startConversationAudioFocusManager$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(ag3.a, startConversationAudioFocusManager$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                return zy11.a;
            }
        }
        startConversationAudioFocusManager$special$$inlined$map$1$2$1 = new StartConversationAudioFocusManager$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = startConversationAudioFocusManager$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = startConversationAudioFocusManager$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
