package com.yandex.go.taxi.order.details.v2.state.elements.buttons;

import com.yandex.go.slot.dto.SlotButtonDto;
import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.bdc;
import defpackage.ddk0;
import defpackage.g92;
import defpackage.irs0;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.lbk0;
import defpackage.ndk0;
import defpackage.o2y0;
import defpackage.spl0;
import defpackage.tpr;
import defpackage.uw40;
import defpackage.xng0;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;

/* loaded from: classes14.dex */
public final class f {
    public final o2y0 a;
    public final uw40 b;
    public final ru.yandex.taxi.widget.utils.e c;
    public final com.yandex.go.taxi.order.util.slot.a d;
    public final irs0 e;
    public final lbk0 f;
    public final zuj0 g;
    public final ndk0 h;
    public final ddk0 i;
    public final spl0 j;

    public f(o2y0 o2y0Var, uw40 uw40Var, ru.yandex.taxi.widget.utils.e eVar, com.yandex.go.taxi.order.util.slot.a aVar, irs0 irs0Var, lbk0 lbk0Var, zuj0 zuj0Var, ndk0 ndk0Var, ddk0 ddk0Var, spl0 spl0Var) {
        this.a = o2y0Var;
        this.b = uw40Var;
        this.c = eVar;
        this.d = aVar;
        this.e = irs0Var;
        this.f = lbk0Var;
        this.g = zuj0Var;
        this.h = ndk0Var;
        this.i = ddk0Var;
        this.j = spl0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        if (r4 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008b, code lost:
    
        if (r7.V().H == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008d, code lost:
    
        if (r4 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a1, code lost:
    
        if (r4 != false) goto L48;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g a(String str, SlotButtonDto slotButtonDto, String str2, SlotItemDto slotItemDto, List list) {
        boolean z;
        kdc bdcVar;
        tpr g92Var;
        tpr d;
        ddk0 ddk0Var = this.i;
        ndk0 ndk0Var = this.h;
        o2y0 o2y0Var = this.a;
        String str3 = slotButtonDto.b;
        ChangeOrderState$Source changeOrderState$Source = jl40.l(str3, "already_coming_button") ? ChangeOrderState$Source.USER_READY : jl40.l(str3, "cancel_button") ? ChangeOrderState$Source.CANCEL : null;
        List list2 = list;
        boolean z2 = true;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((com.yandex.go.taxi.order.models.api.e) it.next()).getB() == changeOrderState$Source) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        int hashCode = str2.hashCode();
        if (hashCode != -1819760951) {
            if (hashCode != 660471959) {
                if (hashCode == 989304983) {
                    if (str2.equals("cancel_button")) {
                    }
                }
            } else if (str2.equals("save_ride_button")) {
                TaxiOrder b = o2y0Var.b();
                if (!b.l.getC()) {
                }
            }
        } else if (str2.equals("already_coming_button")) {
            if (o2y0Var.b().H()) {
            }
        }
        SlotButtonDto.Properties properties = slotButtonDto.f;
        if ((str2.equals("already_coming_button") || str2.equals("save_ride_button")) && !z2) {
            bdcVar = new bdc(xng0.controlMain);
        } else {
            bdcVar = this.c.d(properties.d);
            if (bdcVar == null) {
                bdcVar = new bdc(xng0.controlMinor);
            }
        }
        switch (str2.hashCode()) {
            case -930066114:
                if (str2.equals("communicate_button")) {
                    g92Var = new m0(kotlinx.coroutines.flow.e.d(ndk0Var.b), kotlinx.coroutines.flow.e.d(ddk0Var.b), new RideCardButtonMapper$map$stateAdapterFlow$1(3, null));
                    break;
                }
                g92Var = new g92(2, zy11.a);
                break;
            case -747314125:
                if (str2.equals("call_button")) {
                    d = kotlinx.coroutines.flow.e.d(ddk0Var.b);
                    g92Var = d;
                    break;
                }
                g92Var = new g92(2, zy11.a);
                break;
            case -724128858:
                if (str2.equals("create_order_button")) {
                    g92Var = new n(this.b.d, new RideCardButtonMapper$map$stateAdapterFlow$2(this, null));
                    break;
                }
                g92Var = new g92(2, zy11.a);
                break;
            case 1527190847:
                if (str2.equals("safety_button")) {
                    d = kotlinx.coroutines.flow.e.t(new e(((com.yandex.go.safety.center.b) this.j).b(o2y0Var)));
                    g92Var = d;
                    break;
                }
                g92Var = new g92(2, zy11.a);
                break;
            case 1636802041:
                if (str2.equals("chat_button")) {
                    d = kotlinx.coroutines.flow.e.d(ndk0Var.b);
                    g92Var = d;
                    break;
                }
                g92Var = new g92(2, zy11.a);
                break;
            default:
                g92Var = new g92(2, zy11.a);
                break;
        }
        return kotlinx.coroutines.flow.e.I(g92Var, new RideCardButtonMapper$map$1(bdcVar, slotButtonDto, slotItemDto, this, str2, str, null, z, z2));
    }
}
