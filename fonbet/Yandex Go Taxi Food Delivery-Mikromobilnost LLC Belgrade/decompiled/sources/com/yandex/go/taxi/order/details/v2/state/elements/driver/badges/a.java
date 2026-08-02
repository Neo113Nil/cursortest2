package com.yandex.go.taxi.order.details.v2.state.elements.driver.badges;

import android.content.Context;
import com.yandex.go.taxi.order.models.api.response.driver.DriverInfoBadgesBlock;
import com.yandex.go.taxi.order.models.api.response.driver.DriverInfoBadgesBlock$Badge$Background$Fill;
import com.yandex.go.taxi.order.models.api.response.driver.DriverInfoBadgesBlock$Badge$Background$LinearGradient;
import com.yandex.go.taxi.order.models.api.response.driver.i;
import defpackage.cvu0;
import defpackage.igk0;
import defpackage.jgk0;
import defpackage.kdc;
import defpackage.kgk0;
import defpackage.lgk0;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.s8o;
import defpackage.ufu;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class a {
    public final Context a;
    public final pdc b;
    public final c c;

    public a(Context context, pdc pdcVar, c cVar) {
        this.a = context;
        this.b = pdcVar;
        this.c = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0088, code lost:
    
        if (r12 == r4) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(DriverInfoBadgesBlock driverInfoBadgesBlock, ContinuationImpl continuationImpl) {
        RideCardDriverBadgesDataSource$createUiState$1 rideCardDriverBadgesDataSource$createUiState$1;
        int i;
        DriverInfoBadgesBlock.Badge badge;
        FormattedText formattedText;
        Object i2;
        boolean z;
        DriverInfoBadgesBlock$Badge$Background$LinearGradient driverInfoBadgesBlock$Badge$Background$LinearGradient;
        String str;
        ufu ufuVar;
        kdc b;
        kdc b2;
        kgk0 jgk0Var;
        kgk0 kgk0Var;
        CharSequence charSequence;
        FormattedText.FontStyle fontStyle;
        kdc b3;
        DriverInfoBadgesBlock driverInfoBadgesBlock2 = driverInfoBadgesBlock;
        if (continuationImpl instanceof RideCardDriverBadgesDataSource$createUiState$1) {
            rideCardDriverBadgesDataSource$createUiState$1 = (RideCardDriverBadgesDataSource$createUiState$1) continuationImpl;
            int i3 = rideCardDriverBadgesDataSource$createUiState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rideCardDriverBadgesDataSource$createUiState$1.label = i3 - Integer.MIN_VALUE;
                Object obj = rideCardDriverBadgesDataSource$createUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardDriverBadgesDataSource$createUiState$1.label;
                c cVar = this.c;
                if (i != 0) {
                    b.b(obj);
                    badge = (DriverInfoBadgesBlock.Badge) kotlin.collections.a.R(driverInfoBadgesBlock2.a);
                    if (badge != null && (formattedText = badge.a) != null) {
                        rideCardDriverBadgesDataSource$createUiState$1.L$0 = driverInfoBadgesBlock2;
                        rideCardDriverBadgesDataSource$createUiState$1.L$1 = badge;
                        rideCardDriverBadgesDataSource$createUiState$1.L$2 = formattedText;
                        rideCardDriverBadgesDataSource$createUiState$1.label = 1;
                        i2 = c.i(cVar, formattedText, null, rideCardDriverBadgesDataSource$createUiState$1, 30);
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kgk0Var = (kgk0) rideCardDriverBadgesDataSource$createUiState$1.L$4;
                    charSequence = (CharSequence) rideCardDriverBadgesDataSource$createUiState$1.L$3;
                    b.b(obj);
                    CharSequence charSequence2 = (CharSequence) obj;
                    return new lgk0(charSequence.subSequence(0, Math.min(charSequence.length(), 10)), kgk0Var, charSequence2 != null ? charSequence2.subSequence(0, Math.min(charSequence2.length(), 10)) : null);
                }
                FormattedText formattedText2 = (FormattedText) rideCardDriverBadgesDataSource$createUiState$1.L$2;
                badge = (DriverInfoBadgesBlock.Badge) rideCardDriverBadgesDataSource$createUiState$1.L$1;
                DriverInfoBadgesBlock driverInfoBadgesBlock3 = (DriverInfoBadgesBlock) rideCardDriverBadgesDataSource$createUiState$1.L$0;
                b.b(obj);
                formattedText = formattedText2;
                driverInfoBadgesBlock2 = driverInfoBadgesBlock3;
                i2 = obj;
                CharSequence charSequence3 = (CharSequence) i2;
                i iVar = badge.b;
                z = iVar instanceof DriverInfoBadgesBlock$Badge$Background$Fill;
                Context context = this.a;
                pdc pdcVar = this.b;
                if (z) {
                    if ((iVar instanceof DriverInfoBadgesBlock$Badge$Background$LinearGradient) && (str = (driverInfoBadgesBlock$Badge$Background$LinearGradient = (DriverInfoBadgesBlock$Badge$Background$LinearGradient) iVar).a) != null && (b = (ufuVar = (ufu) pdcVar).b(str)) != null) {
                        int m = s8o.m(b, context);
                        String str2 = driverInfoBadgesBlock$Badge$Background$LinearGradient.b;
                        if (str2 != null && (b2 = ufuVar.b(str2)) != null) {
                            jgk0Var = new jgk0(m, s8o.m(b2, context));
                            kgk0Var = jgk0Var;
                        }
                    }
                    kgk0Var = null;
                } else {
                    String str3 = ((DriverInfoBadgesBlock$Badge$Background$Fill) iVar).a;
                    if (str3 != null && (b3 = ((ufu) pdcVar).b(str3)) != null) {
                        jgk0Var = new igk0(s8o.m(b3, context));
                        kgk0Var = jgk0Var;
                    }
                    kgk0Var = null;
                }
                if (kgk0Var != null) {
                    int size = driverInfoBadgesBlock2.a.size();
                    rideCardDriverBadgesDataSource$createUiState$1.L$0 = null;
                    rideCardDriverBadgesDataSource$createUiState$1.L$1 = null;
                    rideCardDriverBadgesDataSource$createUiState$1.L$2 = null;
                    rideCardDriverBadgesDataSource$createUiState$1.L$3 = charSequence3;
                    rideCardDriverBadgesDataSource$createUiState$1.L$4 = kgk0Var;
                    rideCardDriverBadgesDataSource$createUiState$1.label = 2;
                    int i4 = size - 1;
                    if (i4 > 0) {
                        String v = cvu0.v("+$COUNT$", "$COUNT$", String.valueOf(i4), false);
                        List list = formattedText.a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (obj2 instanceof FormattedText.h) {
                                arrayList.add(obj2);
                            }
                        }
                        FormattedText.h hVar = (FormattedText.h) kotlin.collections.a.R(arrayList);
                        ru.yandex.taxi.common_models.net.b bVar = FormattedText.Companion;
                        Integer num = hVar != null ? hVar.d : null;
                        if (hVar == null || (fontStyle = hVar.b) == null) {
                            fontStyle = FormattedText.FontStyle.NORMAL;
                        }
                        obj = c.i(cVar, ru.yandex.taxi.common_models.net.b.b(bVar, v, num, "#FFFFFFFF", fontStyle, hVar != null ? hVar.c : null, 8), null, rideCardDriverBadgesDataSource$createUiState$1, 30);
                    } else {
                        obj = null;
                    }
                    if (obj != coroutineSingletons) {
                        charSequence = charSequence3;
                        CharSequence charSequence22 = (CharSequence) obj;
                        return new lgk0(charSequence.subSequence(0, Math.min(charSequence.length(), 10)), kgk0Var, charSequence22 != null ? charSequence22.subSequence(0, Math.min(charSequence22.length(), 10)) : null);
                    }
                    return coroutineSingletons;
                }
                return null;
            }
        }
        rideCardDriverBadgesDataSource$createUiState$1 = new RideCardDriverBadgesDataSource$createUiState$1(this, continuationImpl);
        Object obj3 = rideCardDriverBadgesDataSource$createUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardDriverBadgesDataSource$createUiState$1.label;
        c cVar2 = this.c;
        if (i != 0) {
        }
        CharSequence charSequence32 = (CharSequence) i2;
        i iVar2 = badge.b;
        z = iVar2 instanceof DriverInfoBadgesBlock$Badge$Background$Fill;
        Context context2 = this.a;
        pdc pdcVar2 = this.b;
        if (z) {
        }
        if (kgk0Var != null) {
        }
        return null;
    }
}
