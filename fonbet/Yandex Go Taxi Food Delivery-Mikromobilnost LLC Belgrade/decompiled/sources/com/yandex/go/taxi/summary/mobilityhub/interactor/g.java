package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubFooterDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubOnboardingDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubOnboardingType;
import defpackage.cyu;
import defpackage.g92;
import defpackage.hyu;
import defpackage.qv10;
import defpackage.tpr;
import defpackage.uc31;
import defpackage.v0v;
import defpackage.w511;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class g {
    public final cyu a;
    public final uc31 b;
    public final com.yandex.go.taxi.summary.mobilityhub.mapper.d c;
    public final v0v d;

    public g(cyu cyuVar, uc31 uc31Var, com.yandex.go.taxi.summary.mobilityhub.mapper.d dVar, v0v v0vVar) {
        this.a = cyuVar;
        this.b = uc31Var;
        this.c = dVar;
        this.d = v0vVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        r0 = (com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubOnboardingDto) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r0 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        return r7.c.j(r0, (kotlin.coroutines.jvm.internal.ContinuationImpl) r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, List list, HubOnboardingType hubOnboardingType, Continuation continuation) {
        Object obj;
        v0v v0vVar;
        String str;
        gVar.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            HubOnboardingDto hubOnboardingDto = (HubOnboardingDto) obj;
            int i = hyu.a[hubOnboardingType.ordinal()];
            if (i == 1) {
                HubOnboardingType hubOnboardingType2 = hubOnboardingDto.e;
                if (hubOnboardingType2 != HubOnboardingType.ONLY_EXPANDED && hubOnboardingType2 != HubOnboardingType.FULL && hubOnboardingType2 != HubOnboardingType.UNKNOWN) {
                }
                v0vVar = gVar.d;
                str = hubOnboardingDto.a;
                int i2 = hubOnboardingDto.d;
                if (!v0vVar.b.contains(str)) {
                    break;
                    break;
                }
                continue;
            } else {
                if (i != 2 && i != 3) {
                    w511.b();
                    return null;
                }
                HubOnboardingType hubOnboardingType3 = hubOnboardingDto.e;
                if (hubOnboardingType3 != HubOnboardingType.FULL && hubOnboardingType3 != HubOnboardingType.UNKNOWN) {
                }
                v0vVar = gVar.d;
                str = hubOnboardingDto.a;
                int i22 = hubOnboardingDto.d;
                if (!v0vVar.b.contains(str) && qv10.d("shown_count_", str, v0vVar.a, 0) < i22) {
                    break;
                }
            }
        }
    }

    public final tpr b(HubFooterDto hubFooterDto) {
        if (hubFooterDto == null) {
            return new g92(2, null);
        }
        uc31 uc31Var = this.b;
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.n(uc31Var.b, this.a.b, new kotlinx.coroutines.flow.n(uc31Var.d, new HubFooterUiStateInteractor$stateFlow$1(2, null)), new HubFooterUiStateInteractor$stateFlow$2(4, null)), new HubFooterUiStateInteractor$stateFlow$3(this, hubFooterDto, null)));
    }
}
