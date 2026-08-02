package com.yandex.go.lootbox.impl.presentation.modal;

import android.net.Uri;
import com.yandex.go.lootbox.api.domain.analytics.LootBoxAnalytics$ButtonType;
import com.yandex.go.lootbox.api.domain.entities.lootbox.action.LootBoxActionTypeEntity;
import com.yandex.go.lootbox.impl.domain.interactors.animation.e;
import defpackage.ad5;
import defpackage.apz;
import defpackage.bqz;
import defpackage.iqz;
import defpackage.jqz;
import defpackage.lqz;
import defpackage.n3h;
import defpackage.o61;
import defpackage.qoz;
import defpackage.ruc;
import defpackage.tje;
import defpackage.toz;
import defpackage.uoz;
import defpackage.woz;
import java.util.HashMap;
import ru.yandex.taxi.communications.n;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes12.dex */
public final class c extends ad5 {
    public final e A;
    public final iqz B;
    public final apz C;
    public final ruc D;
    public final String E;
    public final String F;
    public final String G;
    public final String H;
    public final n3h x;
    public final bqz y;
    public final com.yandex.go.lootbox.impl.domain.interactors.activation.a z;

    public c(n3h n3hVar, bqz bqzVar, com.yandex.go.lootbox.impl.domain.interactors.activation.a aVar, e eVar, iqz iqzVar, apz apzVar, ruc rucVar, String str, String str2, String str3, String str4) {
        super(lqz.class);
        this.x = n3hVar;
        this.y = bqzVar;
        this.z = aVar;
        this.A = eVar;
        this.B = iqzVar;
        this.C = apzVar;
        this.D = rucVar;
        this.E = str;
        this.F = str2;
        this.G = str3;
        this.H = str4;
    }

    public static final void Kg(c cVar) {
        tje.N(cVar.Jg(), null, null, new LootBoxModalViewPresenter$slideOut$1(cVar, null), 3);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        ((jqz) this.B).a();
    }

    public final void Lg(LootBoxAnalytics$ButtonType lootBoxAnalytics$ButtonType, toz tozVar) {
        if (tozVar instanceof qoz) {
            this.x.a(Uri.parse(((qoz) tozVar).a), DeeplinkSource.UNSPECIFIED);
        } else if (tozVar instanceof uoz) {
            this.y.a((uoz) tozVar);
        } else if (tozVar instanceof woz) {
            woz wozVar = (woz) tozVar;
            ((n) this.D).b(wozVar.a, wozVar.b);
        }
        LootBoxActionTypeEntity type = tozVar != null ? tozVar.getType() : null;
        o61 o61Var = this.C.b;
        String event = lootBoxAnalytics$ButtonType.getEvent();
        String analyticsName = type != null ? type.getAnalyticsName() : null;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button", event);
        if (analyticsName != null) {
            hashMap.put("action", analyticsName);
        }
        o61Var.a.a("LootboxGift.Tapped", hashMap, 1, new HashMap());
    }
}
