package com.yandex.go.scooters.zones.info.ui;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.i9p0;
import defpackage.mvg;
import defpackage.n9p0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ln9p0;", "<anonymous>", "(Ltse;)Ln9p0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.zones.info.ui.ScootersZonesInfoContentItemMapper$mapZoneInfoItem$2$1$1", f = "ScootersZonesInfoContentItemMapper.kt", l = {52, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersZonesInfoContentItemMapper$mapZoneInfoItem$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $index;
    final /* synthetic */ i9p0 $item;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersZonesInfoContentItemMapper$mapZoneInfoItem$2$1$1(c cVar, i9p0 i9p0Var, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$item = i9p0Var;
        this.$index = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersZonesInfoContentItemMapper$mapZoneInfoItem$2$1$1(this.this$0, this.$item, this.$index, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersZonesInfoContentItemMapper$mapZoneInfoItem$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
    
        if (r8 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0057  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.widget.utils.e eVar = this.this$0.b;
            FormattedText formattedText = this.$item.a;
            this.label = 1;
            obj = eVar.t(formattedText, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                charSequence2 = (CharSequence) this.L$1;
                kotlin.b.b(obj);
                charSequence3 = (CharSequence) obj;
                if (charSequence3 == null) {
                    charSequence = charSequence2;
                    charSequence2 = charSequence;
                    charSequence3 = "";
                }
                return new n9p0(charSequence2, charSequence3, this.$index > 0);
            }
            kotlin.b.b(obj);
        }
        charSequence = (CharSequence) obj;
        FormattedText formattedText2 = this.$item.b;
        if (formattedText2 != null) {
            ru.yandex.taxi.widget.utils.e eVar2 = this.this$0.b;
            this.L$0 = null;
            this.L$1 = charSequence;
            this.label = 2;
            Object t = eVar2.t(formattedText2, this);
            if (t != coroutineSingletons) {
                charSequence2 = charSequence;
                obj = t;
                charSequence3 = (CharSequence) obj;
                if (charSequence3 == null) {
                }
                return new n9p0(charSequence2, charSequence3, this.$index > 0);
            }
            return coroutineSingletons;
        }
        charSequence2 = charSequence;
        charSequence3 = "";
        return new n9p0(charSequence2, charSequence3, this.$index > 0);
    }
}
