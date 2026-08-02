package com.yandex.go.address_confirmation;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.b1c0;
import defpackage.e0c0;
import defpackage.e1c0;
import defpackage.evu0;
import defpackage.f1c0;
import defpackage.g92;
import defpackage.iv70;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.p2c0;
import defpackage.r0c0;
import defpackage.tpr;
import defpackage.uze0;
import defpackage.vtb0;
import defpackage.wiq0;
import defpackage.ybo;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.f;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes12.dex */
public final class e extends b1c0 {
    public final wiq0 a;
    public final f1c0 b;
    public final iv70 c;
    public final uze0 d;
    public final AddressResolveRepository e;
    public final vtb0 f;
    public final p2c0 g;
    public final SourceOnMapControl.a h;
    public final SourceOnMapControl.a i;
    public final SourceOnMapControl.a j;
    public final g92 k;
    public final String l;

    /* JADX WARN: Multi-variable type inference failed */
    public e(PointType pointType, r0c0 r0c0Var, ru.yandex.taxi.widget.utils.e eVar, wiq0 wiq0Var, f1c0 f1c0Var, iv70 iv70Var, uze0 uze0Var, AddressResolveRepository addressResolveRepository, vtb0 vtb0Var, p2c0 p2c0Var) {
        this.a = wiq0Var;
        this.b = f1c0Var;
        this.c = iv70Var;
        this.d = uze0Var;
        this.e = addressResolveRepository;
        this.f = vtb0Var;
        this.g = p2c0Var;
        String str = null;
        boolean z = false;
        this.h = new SourceOnMapControl.a(pointType.a() ? r0c0Var.h() : r0c0Var.b(), null, str, false, z, null, null, 2046);
        String str2 = null;
        boolean z2 = false;
        this.i = new SourceOnMapControl.a(e0c0.a, str, str2, z, z2, 0 == true ? 1 : 0, null, 2046);
        this.j = new SourceOnMapControl.a(r0c0Var.d(), str2, null, z2, false, 0 == true ? 1 : 0, null, 2046);
        this.k = new g92(2, pointType.a() ? r0c0Var.i() : r0c0Var.c());
        this.l = eVar.a.getString(kyh0.date_format_min);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(e eVar, boolean z, ybo yboVar, ContinuationImpl continuationImpl) {
        SourceAddressConfirmationPinV2DataRepository$createLoadedState$1 sourceAddressConfirmationPinV2DataRepository$createLoadedState$1;
        int i;
        e eVar2;
        String str;
        String str2;
        eVar.getClass();
        if (continuationImpl instanceof SourceAddressConfirmationPinV2DataRepository$createLoadedState$1) {
            sourceAddressConfirmationPinV2DataRepository$createLoadedState$1 = (SourceAddressConfirmationPinV2DataRepository$createLoadedState$1) continuationImpl;
            int i2 = sourceAddressConfirmationPinV2DataRepository$createLoadedState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourceAddressConfirmationPinV2DataRepository$createLoadedState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sourceAddressConfirmationPinV2DataRepository$createLoadedState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourceAddressConfirmationPinV2DataRepository$createLoadedState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = yboVar.a > 0 ? 1 : 0;
                    if (!z || i3 == 0) {
                        return (z && i3 == 0) ? eVar.h : eVar.i;
                    }
                    f1c0 f1c0Var = eVar.b;
                    sourceAddressConfirmationPinV2DataRepository$createLoadedState$1.L$0 = yboVar;
                    sourceAddressConfirmationPinV2DataRepository$createLoadedState$1.L$1 = eVar;
                    sourceAddressConfirmationPinV2DataRepository$createLoadedState$1.Z$0 = z;
                    sourceAddressConfirmationPinV2DataRepository$createLoadedState$1.I$0 = i3;
                    sourceAddressConfirmationPinV2DataRepository$createLoadedState$1.label = 1;
                    obj = f1c0Var.a(sourceAddressConfirmationPinV2DataRepository$createLoadedState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    eVar2 = eVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eVar2 = (e) sourceAddressConfirmationPinV2DataRepository$createLoadedState$1.L$1;
                    yboVar = (ybo) sourceAddressConfirmationPinV2DataRepository$createLoadedState$1.L$0;
                    kotlin.b.b(obj);
                }
                e1c0 e1c0Var = (e1c0) obj;
                SourceOnMapControl.a aVar = eVar.h;
                eVar2.getClass();
                str = yboVar.b;
                if (evu0.J(str)) {
                    str = yboVar.a + " " + eVar2.l;
                }
                String str3 = str;
                str2 = (String) e1c0Var.c.get(e1c0Var.d);
                if (str2 == null) {
                    str2 = "";
                }
                return SourceOnMapControl.a.a(aVar, null, str2, str3, false, null, false, false, null, 2041);
            }
        }
        sourceAddressConfirmationPinV2DataRepository$createLoadedState$1 = new SourceAddressConfirmationPinV2DataRepository$createLoadedState$1(eVar, continuationImpl);
        Object obj2 = sourceAddressConfirmationPinV2DataRepository$createLoadedState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourceAddressConfirmationPinV2DataRepository$createLoadedState$1.label;
        if (i != 0) {
        }
        e1c0 e1c0Var2 = (e1c0) obj2;
        SourceOnMapControl.a aVar2 = eVar.h;
        eVar2.getClass();
        str = yboVar.b;
        if (evu0.J(str)) {
        }
        String str32 = str;
        str2 = (String) e1c0Var2.c.get(e1c0Var2.d);
        if (str2 == null) {
        }
        return SourceOnMapControl.a.a(aVar2, null, str2, str32, false, null, false, false, null, 2041);
    }

    @Override // defpackage.b1c0
    public final tpr a(tpr tprVar) {
        return new m0(tprVar, this.e.b, new SourceAddressConfirmationPinV2DataRepository$positionFlow$1(this.g.a(), null));
    }

    @Override // defpackage.b1c0
    public final tpr b(tpr tprVar) {
        AddressResolveRepository addressResolveRepository = this.e;
        return kotlinx.coroutines.flow.e.m(addressResolveRepository.a, kotlinx.coroutines.flow.e.t(new b(((k) this.d).j.a())), kotlinx.coroutines.flow.e.t(new d(((k) this.a).j.b(), this)), ((f) this.f).a(addressResolveRepository.a, this.h), new SourceAddressConfirmationPinV2DataRepository$stateFlow$2(this, null));
    }

    @Override // defpackage.b1c0
    public final tpr c() {
        return this.k;
    }

    @Override // defpackage.b1c0
    public final tpr d() {
        return new g92(2, Boolean.TRUE);
    }
}
