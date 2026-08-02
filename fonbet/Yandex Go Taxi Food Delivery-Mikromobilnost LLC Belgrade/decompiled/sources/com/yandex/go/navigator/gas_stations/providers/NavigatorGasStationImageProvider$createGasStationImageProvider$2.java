package com.yandex.go.navigator.gas_stations.providers;

import android.content.Context;
import android.graphics.PointF;
import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.go.pin.api.v2.d;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.ImageProvider;
import defpackage.avj0;
import defpackage.b0c0;
import defpackage.bdc;
import defpackage.bl00;
import defpackage.h1c0;
import defpackage.i1c0;
import defpackage.mqg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.v2h0;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lbl00;", "<anonymous>", "(Ltse;)Lbl00;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.gas_stations.providers.NavigatorGasStationImageProvider$createGasStationImageProvider$2", f = "NavigatorGasStationImageProvider.kt", l = {90}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NavigatorGasStationImageProvider$createGasStationImageProvider$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ String $title;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorGasStationImageProvider$createGasStationImageProvider$2(boolean z, a aVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.$isSelected = z;
        this.this$0 = aVar;
        this.$subtitle = str;
        this.$title = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigatorGasStationImageProvider$createGasStationImageProvider$2(this.$isSelected, this.this$0, this.$subtitle, this.$title, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigatorGasStationImageProvider$createGasStationImageProvider$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SourceOnMapControl.a.C0122a c0122a;
        SourceOnMapControl.a aVar;
        i1c0 i1c0Var;
        Object c;
        Context context;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (this.$isSelected) {
                c0122a = new SourceOnMapControl.a.C0122a(new Integer(v2h0.selected_gas_pin_backgorund), new bdc(xng0.textInvert), new bdc(xng0.bgInvert));
            } else {
                c0122a = new SourceOnMapControl.a.C0122a(new Integer(v2h0.gas_pin_backgorund), new bdc(xng0.textMain), new bdc(xng0.bgMain));
            }
            aVar = new SourceOnMapControl.a(new b0c0(tje.y(v2h0.ic_gas_station_icon, this.this$0.a), ((avj0) this.this$0.c).a(mqg0.component_blue_toxic)), this.$subtitle, this.$title, false, true, null, c0122a, 952);
            i1c0Var = new i1c0(((avj0) this.this$0.c).a(mqg0.white), ((avj0) this.this$0.c).a(mqg0.component_blue_toxic));
            a aVar2 = this.this$0;
            Context context2 = aVar2.a;
            ru.yandex.taxi.design.utils.b bVar = aVar2.d;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = aVar;
            this.L$3 = i1c0Var;
            this.L$4 = context2;
            this.label = 1;
            c = bVar.c(this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
            context = context2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = (Context) this.L$4;
            i1c0Var = (i1c0) this.L$3;
            SourceOnMapControl.a aVar3 = (SourceOnMapControl.a) this.L$2;
            b.b(obj);
            aVar = aVar3;
            c = obj;
        }
        bl00 a = d.a(new PinV2Component(context, (h1c0) c), i1c0Var, PinV2Component.Position.ANCHORED, aVar);
        float f = this.$isSelected ? 1.0f : 0.8f;
        ImageProvider imageProvider = a.a;
        IconStyle iconStyle = new IconStyle();
        iconStyle.setAnchor(new PointF(0.5f, 0.9f));
        iconStyle.setScale(new Float(f));
        return new bl00(imageProvider, iconStyle);
    }
}
