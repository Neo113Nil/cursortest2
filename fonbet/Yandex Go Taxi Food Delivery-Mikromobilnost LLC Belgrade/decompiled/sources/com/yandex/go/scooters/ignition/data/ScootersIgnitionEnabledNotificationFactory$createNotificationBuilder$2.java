package com.yandex.go.scooters.ignition.data;

import android.net.Uri;
import androidx.core.app.v;
import com.yandex.go.scooters.domain.model.ScootersNotificationType;
import defpackage.m2o0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o2o0;
import defpackage.pux0;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.domain.q;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Landroidx/core/app/v;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Ltse;)Landroidx/core/app/v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.data.ScootersIgnitionEnabledNotificationFactory$createNotificationBuilder$2", f = "ScootersIgnitionEnabledNotificationFactory.kt", l = {28, 29}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionEnabledNotificationFactory$createNotificationBuilder$2 extends SuspendLambda implements wls {
    final /* synthetic */ FormattedText $subtitle;
    final /* synthetic */ FormattedText $title;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionEnabledNotificationFactory$createNotificationBuilder$2(c cVar, FormattedText formattedText, FormattedText formattedText2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$title = formattedText;
        this.$subtitle = formattedText2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersIgnitionEnabledNotificationFactory$createNotificationBuilder$2 scootersIgnitionEnabledNotificationFactory$createNotificationBuilder$2 = new ScootersIgnitionEnabledNotificationFactory$createNotificationBuilder$2(this.this$0, this.$title, this.$subtitle, continuation);
        scootersIgnitionEnabledNotificationFactory$createNotificationBuilder$2.L$0 = obj;
        return scootersIgnitionEnabledNotificationFactory$createNotificationBuilder$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionEnabledNotificationFactory$createNotificationBuilder$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        noh h;
        m2o0 m2o0Var;
        ScootersNotificationType scootersNotificationType;
        ScootersNotificationType scootersNotificationType2;
        CharSequence charSequence;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new ScootersIgnitionEnabledNotificationFactory$createNotificationBuilder$2$asyncTitle$1(this.this$0, this.$title, null), 3);
            h = tje.h(tseVar, null, null, new ScootersIgnitionEnabledNotificationFactory$createNotificationBuilder$2$asyncSubtitle$1(this.this$0, this.$subtitle, null), 3);
            m2o0 m2o0Var2 = this.this$0.c;
            ScootersNotificationType scootersNotificationType3 = ScootersNotificationType.SYSTEM;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = m2o0Var2;
            this.L$4 = scootersNotificationType3;
            this.label = 1;
            obj = h2.s(this);
            if (obj != coroutineSingletons) {
                m2o0Var = m2o0Var2;
                scootersNotificationType = scootersNotificationType3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            charSequence = (CharSequence) this.L$5;
            scootersNotificationType2 = (ScootersNotificationType) this.L$4;
            m2o0Var = (m2o0) this.L$3;
            kotlin.b.b(obj);
            v b = ((o2o0) m2o0Var).b(scootersNotificationType2, charSequence, (CharSequence) obj);
            c cVar = this.this$0;
            m2o0 m2o0Var3 = cVar.c;
            q qVar = cVar.a;
            qVar.getClass();
            Uri.Builder builder = new Uri.Builder();
            ((pux0) qVar.a).getClass();
            b.h = ((o2o0) m2o0Var3).d(builder.scheme(pux0.c).authority("scooters").appendPath("ignition").build());
            b.h(2, true);
            b.h(16, false);
            b.n = false;
            b.h(8, true);
            b.A = -1;
            b.x = Constants.KEY_SERVICE;
            return b;
        }
        scootersNotificationType = (ScootersNotificationType) this.L$4;
        m2o0Var = (m2o0) this.L$3;
        h = (noh) this.L$2;
        kotlin.b.b(obj);
        CharSequence charSequence2 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = m2o0Var;
        this.L$4 = scootersNotificationType;
        this.L$5 = charSequence2;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            scootersNotificationType2 = scootersNotificationType;
            charSequence = charSequence2;
            obj = k;
            v b2 = ((o2o0) m2o0Var).b(scootersNotificationType2, charSequence, (CharSequence) obj);
            c cVar2 = this.this$0;
            m2o0 m2o0Var32 = cVar2.c;
            q qVar2 = cVar2.a;
            qVar2.getClass();
            Uri.Builder builder2 = new Uri.Builder();
            ((pux0) qVar2.a).getClass();
            b2.h = ((o2o0) m2o0Var32).d(builder2.scheme(pux0.c).authority("scooters").appendPath("ignition").build());
            b2.h(2, true);
            b2.h(16, false);
            b2.n = false;
            b2.h(8, true);
            b2.A = -1;
            b2.x = Constants.KEY_SERVICE;
            return b2;
        }
        return coroutineSingletons;
    }
}
