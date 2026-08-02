package com.yandex.go.chargers.station.data.mapper;

import com.yandex.go.chargers.station.data.model.ChargersStationDetailsResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zqa;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzqa;", "<anonymous>", "(Ltse;)Lzqa;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.station.data.mapper.ChargersStationDetailsMapper$prepareBricks$2$1", f = "ChargersStationDetailsMapper.kt", l = {HProv.PP_DELETE_KEYSET, HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersStationDetailsMapper$prepareBricks$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersStationDetailsResponse.AboutLocation.DetailsBrick $brick;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersStationDetailsMapper$prepareBricks$2$1(a aVar, ChargersStationDetailsResponse.AboutLocation.DetailsBrick detailsBrick, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$brick = detailsBrick;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersStationDetailsMapper$prepareBricks$2$1(this.this$0, this.$brick, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersStationDetailsMapper$prepareBricks$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r8 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0.f;
            FormattedText formattedText = this.$brick.a;
            this.label = 1;
            obj = c.i(cVar, formattedText, null, this, 30);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                charSequence = (CharSequence) this.L$0;
                kotlin.b.b(obj);
                return new zqa(charSequence, (CharSequence) obj);
            }
            kotlin.b.b(obj);
        }
        CharSequence charSequence2 = (CharSequence) obj;
        c cVar2 = this.this$0.f;
        FormattedText formattedText2 = this.$brick.b;
        this.L$0 = charSequence2;
        this.label = 2;
        Object i2 = c.i(cVar2, formattedText2, null, this, 30);
        if (i2 != coroutineSingletons) {
            obj = i2;
            charSequence = charSequence2;
            return new zqa(charSequence, (CharSequence) obj);
        }
        return coroutineSingletons;
    }
}
