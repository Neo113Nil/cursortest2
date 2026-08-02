package com.yandex.payment.sdk.flex.actions.ftrequestaction;

import defpackage.agr;
import defpackage.bvf0;
import defpackage.g8e;
import defpackage.iho;
import defpackage.lkr;
import defpackage.mgr;
import defpackage.nkr;
import defpackage.o400;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sjh;
import defpackage.sv90;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vfc;
import defpackage.vfr;
import defpackage.wj00;
import defpackage.y22;
import defpackage.y891;
import defpackage.yfr;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class a implements vfr {
    public final com.yandex.payment.sdk.network.a a;
    public final lkr b;
    public final nkr c;
    public final rwo d;

    public a(com.yandex.payment.sdk.network.a aVar, lkr lkrVar, nkr nkrVar, rwo rwoVar) {
        this.a = aVar;
        this.b = lkrVar;
        this.c = nkrVar;
        this.d = rwoVar;
    }

    public static final String c(a aVar, Object obj) {
        aVar.getClass();
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return ((Number) obj).toString();
        }
        if (obj instanceof Boolean) {
            return String.valueOf(((Boolean) obj).booleanValue());
        }
        return null;
    }

    @Override // defpackage.vfr
    public final void a(mgr mgrVar, yfr yfrVar) {
        agr agrVar = (agr) mgrVar;
        sv90 sv90Var = qv90.a;
        String str = agrVar.b;
        String str2 = agrVar.c;
        String valueOf = String.valueOf(agrVar.d);
        String obj = agrVar.a.toString();
        sv90Var.getClass();
        StringBuilder sb = new StringBuilder("\"Выполнение действия произвольного похода в сеть для BDUI сценария: методом ");
        sb.append(obj);
        sb.append(" в ручку ");
        sb.append(str);
        wj00 i = vfc.i(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, g8e.r(sb, str2, " с ttl ", valueOf, "\""), "url", str);
        i.k("target_path", str2);
        i.k("timeout", valueOf);
        iho c = y891.c("ft_request_action", i);
        ((y22) this.d).a(c);
        sjh sjhVar = uyj.a;
        tje.N(bvf0.a(o400.a), null, null, new FTRequestActionHandler$handle$1(yfrVar, this, agrVar, c, null), 3);
    }

    @Override // defpackage.vfr
    public final String b() {
        return "FTRequestAction";
    }
}
