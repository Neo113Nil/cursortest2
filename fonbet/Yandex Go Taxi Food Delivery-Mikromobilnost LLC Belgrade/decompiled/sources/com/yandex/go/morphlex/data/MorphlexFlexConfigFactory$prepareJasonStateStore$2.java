package com.yandex.go.morphlex.data;

import android.media.AudioManager;
import com.yandex.go.morphlex.api.MorphlexScreenPayload$ParamType;
import defpackage.gw00;
import defpackage.h830;
import defpackage.k6x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q830;
import defpackage.t130;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lk6x;", "<anonymous>", "(Ltse;)Lk6x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.morphlex.data.MorphlexFlexConfigFactory$prepareJasonStateStore$2", f = "MorphlexFlexConfigFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MorphlexFlexConfigFactory$prepareJasonStateStore$2 extends SuspendLambda implements wls {
    final /* synthetic */ h830 $screen;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MorphlexFlexConfigFactory$prepareJasonStateStore$2(h830 h830Var, e eVar, Continuation continuation) {
        super(2, continuation);
        this.$screen = h830Var;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MorphlexFlexConfigFactory$prepareJasonStateStore$2(this.$screen, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MorphlexFlexConfigFactory$prepareJasonStateStore$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Boolean bool = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Map map = this.$screen.d;
        int i = 3;
        if (map != null) {
            k6x k6xVar = this.this$0.n;
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                k6xVar.d(new t130(i, (Map.Entry) it.next(), "deeplink_params"));
            }
        }
        e eVar = this.this$0;
        h830 h830Var = this.$screen;
        eVar.getClass();
        if (h830Var.b(MorphlexScreenPayload$ParamType.SYSTEM_SOUND_IS_MUTED)) {
            AudioManager audioManager = (AudioManager) ((q830) eVar.o.get()).a.getValue();
            boolean z = true;
            if (audioManager != null) {
                boolean isStreamMute = audioManager.isStreamMute(3);
                boolean z2 = audioManager.getStreamVolume(3) == 0;
                boolean z3 = audioManager.getRingerMode() == 0 || audioManager.getRingerMode() == 1;
                if (!isStreamMute && !z2 && !z3) {
                    z = false;
                }
            }
            bool = Boolean.valueOf(z);
        }
        if (bool != null) {
            e eVar2 = this.this$0;
            boolean booleanValue = bool.booleanValue();
            k6x k6xVar2 = eVar2.n;
            Iterator it2 = gw00.e(new Pair("SYSTEM_SOUND_IS_MUTED".toLowerCase(Locale.ROOT), String.valueOf(booleanValue))).entrySet().iterator();
            while (it2.hasNext()) {
                k6xVar2.d(new t130(i, (Map.Entry) it2.next(), "system_params"));
            }
        }
        return this.this$0.n;
    }
}
