package com.yandex.go.address.search.common.models;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.EditAction;
import defpackage.a81;
import defpackage.avj0;
import defpackage.hgf;
import defpackage.kyh0;
import defpackage.mrj;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.q5z;
import defpackage.qje;
import defpackage.vpr;
import defpackage.xng0;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ pv0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ mrj x;

    public a(vpr vprVar, pv0 pv0Var, String str, boolean z, mrj mrjVar) {
        this.a = vprVar;
        this.b = pv0Var;
        this.c = str;
        this.w = z;
        this.x = mrjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AddressTextsSource$titleAndHintSourceFlow$$inlined$map$1$2$1 addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$2$1;
        int i;
        a81 a81Var;
        Address address;
        if (continuation instanceof AddressTextsSource$titleAndHintSourceFlow$$inlined$map$1$2$1) {
            addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$2$1 = (AddressTextsSource$titleAndHintSourceFlow$$inlined$map$1$2$1) continuation;
            int i2 = addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$2$1.label;
                String str = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    CharSequence charSequence = (CharSequence) obj;
                    int length = charSequence.length();
                    mrj mrjVar = this.x;
                    if (length == 0) {
                        charSequence = ((avj0) ((zuj0) mrjVar.b)).h(kyh0.address_search_modal_view_from);
                    }
                    pv0 pv0Var = this.b;
                    if (pv0Var == null || (address = pv0Var.a) == null) {
                        String str2 = this.c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        a81Var = new a81(str2, charSequence, 2);
                    } else {
                        EditAction editAction = address.getAddress().v;
                        String F = q5z.F(address);
                        boolean z = this.w;
                        boolean z2 = !z && ((hgf) mrjVar.w).isEnabled() && ((hgf) mrjVar.w).g().j && address.getGeoPointAcquisitionType() == GeoPointAcquisitionType.USER_LOCATION;
                        if (z2) {
                            F = ((hgf) mrjVar.w).a();
                        }
                        EditAction editAction2 = EditAction.CLEAR;
                        int i3 = 3;
                        if (editAction != editAction2 || z) {
                            a81Var = editAction == editAction2 ? new a81(str, charSequence, i3) : new a81(!z2, charSequence, F);
                        } else {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(F);
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(qje.t(xng0.textMain, ((avj0) ((zuj0) mrjVar.b)).a)), 0, spannableStringBuilder.length(), 17);
                            a81Var = new a81(str, spannableStringBuilder, i3);
                        }
                    }
                    addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$2$1.L$0 = null;
                    addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$2$1.L$1 = null;
                    addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$2$1.L$2 = null;
                    addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$2$1.L$3 = null;
                    addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a81Var, addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$2$1 = new AddressTextsSource$titleAndHintSourceFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$2$1.label;
        String str3 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
