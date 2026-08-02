package com.yandex.go.ads.prefetch.impl;

import android.content.Context;
import android.content.res.Resources;
import defpackage.cvu0;
import defpackage.kdx;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.qcx;
import defpackage.xbx;
import defpackage.zd1;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public final class a {
    public final Context a;
    public final zd1 b;
    public final d c;

    public a(Context context, zd1 zd1Var, d dVar) {
        this.a = context;
        this.b = zd1Var;
        this.c = dVar;
    }

    public static kotlinx.serialization.json.a b(mo21 mo21Var) {
        xbx xbxVar = new xbx();
        xbxVar.a(qcx.b(Double.valueOf(mo21Var.b)));
        xbxVar.a(qcx.b(Double.valueOf(mo21Var.a)));
        return xbxVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(mo21 mo21Var, ContinuationImpl continuationImpl, boolean z) {
        AdsPrefetchArgsFactoryImpl$createArgs$1 adsPrefetchArgsFactoryImpl$createArgs$1;
        int i;
        mo21 mo21Var2;
        Object a;
        boolean z2;
        String str;
        if (continuationImpl instanceof AdsPrefetchArgsFactoryImpl$createArgs$1) {
            adsPrefetchArgsFactoryImpl$createArgs$1 = (AdsPrefetchArgsFactoryImpl$createArgs$1) continuationImpl;
            int i2 = adsPrefetchArgsFactoryImpl$createArgs$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adsPrefetchArgsFactoryImpl$createArgs$1.label = i2 - Integer.MIN_VALUE;
                Object obj = adsPrefetchArgsFactoryImpl$createArgs$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = adsPrefetchArgsFactoryImpl$createArgs$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mo21Var2 = mo21Var;
                    adsPrefetchArgsFactoryImpl$createArgs$1.L$0 = mo21Var2;
                    adsPrefetchArgsFactoryImpl$createArgs$1.Z$0 = z;
                    adsPrefetchArgsFactoryImpl$createArgs$1.label = 1;
                    a = this.c.a(adsPrefetchArgsFactoryImpl$createArgs$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z2 = z;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = adsPrefetchArgsFactoryImpl$createArgs$1.Z$0;
                    mo21 mo21Var3 = (mo21) adsPrefetchArgsFactoryImpl$createArgs$1.L$0;
                    kotlin.b.b(obj);
                    a = obj;
                    mo21Var2 = mo21Var3;
                }
                if (((Boolean) a).booleanValue()) {
                    return null;
                }
                String v = cvu0.v(UUID.randomUUID().toString(), "-", "", false);
                xbx xbxVar = new xbx();
                kdx kdxVar = new kdx();
                kdx kdxVar2 = new kdx();
                kdxVar2.b("id", qcx.c("feed"));
                kdxVar2.b("type", qcx.c("GoFeedSection"));
                kdxVar.b("raw", kdxVar2.a());
                kdx kdxVar3 = new kdx();
                kdxVar3.b("session_page_view_unique_id", qcx.c(v));
                kdxVar.b("refreshParams", kdxVar3.a());
                xbxVar.a(kdxVar.a());
                kotlinx.serialization.json.a b = xbxVar.b();
                this.b.a.set(b);
                kdx kdxVar4 = new kdx();
                Resources resources = this.a.getResources();
                float f = resources.getDisplayMetrics().density;
                kdx kdxVar5 = new kdx();
                double d = mo21Var2.b;
                double d2 = mo21Var2.a;
                if (Math.abs(d2) > Double.MAX_VALUE || Math.abs(d) > Double.MAX_VALUE || -90.0d > d2 || d2 > 90.0d || -180.0d > d || d > 180.0d) {
                    int i3 = resources.getConfiguration().uiMode & 48;
                    str = i3 != 16 ? i3 != 32 ? null : "dark" : "light";
                    if (str != null) {
                        kdx kdxVar6 = new kdx();
                        kdxVar6.b("choose_appearance_mode", qcx.c(str));
                        kdxVar5.b(ClidProvider.STATE, kdxVar6.a());
                    }
                } else {
                    kdxVar5.b("position", b(mo21Var2));
                    kdx kdxVar7 = new kdx();
                    kdxVar7.b("location", b(mo21Var2));
                    int i4 = resources.getConfiguration().uiMode & 48;
                    str = i4 != 16 ? i4 != 32 ? null : "dark" : "light";
                    if (str != null) {
                        kdxVar7.b("choose_appearance_mode", qcx.c(str));
                    }
                    kdxVar5.b(ClidProvider.STATE, kdxVar7.a());
                }
                kdx kdxVar8 = new kdx();
                kdxVar8.b(CommonUrlParts.SCREEN_WIDTH, qcx.b(Integer.valueOf((int) (r6.widthPixels / f))));
                kdxVar8.b(CommonUrlParts.SCREEN_HEIGHT, qcx.b(Integer.valueOf((int) (r6.heightPixels / f))));
                kdxVar8.b("scale", qcx.b(Float.valueOf(f)));
                kdxVar5.b("media_size_info", kdxVar8.a());
                kdxVar4.b("request", kdxVar5.a());
                kdxVar4.b("sections", b);
                if (z2) {
                    kdx kdxVar9 = new kdx();
                    kdx kdxVar10 = new kdx();
                    kdx kdxVar11 = new kdx();
                    xbx xbxVar2 = new xbx();
                    kdx kdxVar12 = new kdx();
                    kdxVar12.b("is_connected", qcx.a(Boolean.TRUE));
                    xbxVar2.a(kdxVar12.a());
                    kdxVar11.b("wifi_networks", xbxVar2.b());
                    kdxVar10.b(ClidProvider.STATE, kdxVar11.a());
                    kdxVar9.b("request", kdxVar10.a());
                    kdxVar4.b("payload", kdxVar9.a());
                }
                return kdxVar4.a();
            }
        }
        adsPrefetchArgsFactoryImpl$createArgs$1 = new AdsPrefetchArgsFactoryImpl$createArgs$1(this, continuationImpl);
        Object obj2 = adsPrefetchArgsFactoryImpl$createArgs$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = adsPrefetchArgsFactoryImpl$createArgs$1.label;
        if (i != 0) {
        }
        if (((Boolean) a).booleanValue()) {
        }
    }
}
