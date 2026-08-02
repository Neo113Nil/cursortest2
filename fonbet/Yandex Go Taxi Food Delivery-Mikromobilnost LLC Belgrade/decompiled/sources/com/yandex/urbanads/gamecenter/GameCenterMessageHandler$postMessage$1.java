package com.yandex.urbanads.gamecenter;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vss;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.urbanads.gamecenter.GameCenterMessageHandler$postMessage$1", f = "GameCenterMessageHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GameCenterMessageHandler$postMessage$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $message;
    int label;
    final /* synthetic */ GameCenterMessageHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameCenterMessageHandler$postMessage$1(String str, GameCenterMessageHandler gameCenterMessageHandler, Continuation continuation) {
        super(2, continuation);
        this.$message = str;
        this.this$0 = gameCenterMessageHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GameCenterMessageHandler$postMessage$1(this.$message, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GameCenterMessageHandler$postMessage$1 gameCenterMessageHandler$postMessage$1 = (GameCenterMessageHandler$postMessage$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        gameCenterMessageHandler$postMessage$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        GameCenterHapticType gameCenterHapticType = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        try {
            JSONObject jSONObject = new JSONObject(this.$message);
            vss vssVar = GameCenterMessageType.Companion;
            String optString = jSONObject.optString("type");
            vssVar.getClass();
            Iterator<E> it = GameCenterMessageType.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (jl40.l(((GameCenterMessageType) obj2).getValue(), optString)) {
                    break;
                }
            }
            GameCenterMessageType gameCenterMessageType = (GameCenterMessageType) obj2;
            if (gameCenterMessageType == null) {
                gameCenterMessageType = GameCenterMessageType.UNKNOWN;
            }
            int i = a.a[gameCenterMessageType.ordinal()];
            if (i == 1) {
                this.this$0.c.invoke();
            } else if (i == 2) {
                JSONObject optJSONObject = jSONObject.optJSONObject(Constants.KEY_DATA);
                String optString2 = optJSONObject != null ? optJSONObject.optString("impact") : null;
                if (optString2 != null) {
                    GameCenterHapticType.Companion.getClass();
                    Iterator<E> it2 = GameCenterHapticType.c().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (jl40.l(((GameCenterHapticType) next).getValue(), optString2)) {
                            gameCenterHapticType = next;
                            break;
                        }
                    }
                    gameCenterHapticType = gameCenterHapticType;
                }
                if (gameCenterHapticType != null) {
                    GameCenterMessageHandler.a(this.this$0, gameCenterHapticType);
                }
            } else if (i == 3) {
                this.this$0.d.invoke();
            } else if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        } catch (Exception unused) {
        }
        return zy11.a;
    }
}
