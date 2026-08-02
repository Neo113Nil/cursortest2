package com.yandex.go.shortcuts.impl.view.adapter.market.recommendation;

import com.yandex.go.shortcuts.dto.response.Title;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.view.adapter.market.recommendation.MarketRecommendationViewHolder$convertTitle$1", f = "MarketRecommendationViewHolder.kt", l = {221}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MarketRecommendationViewHolder$convertTitle$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onConverted;
    final /* synthetic */ Title $title;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketRecommendationViewHolder$convertTitle$1(a aVar, Title title, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$title = title;
        this.$onConverted = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MarketRecommendationViewHolder$convertTitle$1(this.this$0, this.$title, this.$onConverted, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MarketRecommendationViewHolder$convertTitle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tls tlsVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar = this.this$0;
                Title title = this.$title;
                tls tlsVar2 = this.$onConverted;
                c cVar = aVar.T;
                FormattedText formattedText = title.b;
                this.L$0 = tlsVar2;
                this.label = 1;
                obj = c.e(cVar, formattedText, null, false, this, 30);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                tlsVar = tlsVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tlsVar = (tls) this.L$0;
                kotlin.b.b(obj);
            }
            CharSequence charSequence = (CharSequence) (((CharSequence) obj).length() > 0 ? obj : null);
            if (charSequence != null) {
                tlsVar.invoke(charSequence);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Market recommendation text fail loading");
        }
        return zy11.a;
    }
}
