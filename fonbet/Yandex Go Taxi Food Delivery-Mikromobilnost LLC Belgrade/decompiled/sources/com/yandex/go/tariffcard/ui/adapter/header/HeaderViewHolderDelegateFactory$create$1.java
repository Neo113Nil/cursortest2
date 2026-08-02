package com.yandex.go.tariffcard.ui.adapter.header;

import android.net.Uri;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$Invisible;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$SurgeAlert;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$SurgeBalance;
import com.yandex.go.zone.dto.objects.e5;
import com.yandex.go.zone.dto.objects.f5;
import defpackage.hxx;
import defpackage.iix0;
import defpackage.jl40;
import defpackage.m950;
import defpackage.pep0;
import defpackage.pex0;
import defpackage.sls;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class HeaderViewHolderDelegateFactory$create$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        iix0 iix0Var = (iix0) this.receiver;
        iix0Var.getClass();
        pex0 m = ((k) iix0Var.z).m();
        f5 f5Var = m != null ? m.w0 : null;
        if (f5Var instanceof ServiceLevelWidget$SurgeAlert) {
            iix0Var.K.a(Uri.parse(((ServiceLevelWidget$SurgeAlert) f5Var).a.c), DeeplinkSource.UNSPECIFIED);
        } else if (f5Var instanceof ServiceLevelWidget$SurgeBalance) {
            ((pep0) iix0Var.D).f((m950) iix0Var.C.get(), "tariff_card_price", hxx.a);
        } else if (!(f5Var instanceof ServiceLevelWidget$Invisible) && !jl40.l(f5Var, e5.INSTANCE) && f5Var != null) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
