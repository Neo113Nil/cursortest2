package com.yandex.go.about.domain;

import android.os.Build;
import defpackage.bpt;
import defpackage.iw00;
import defpackage.kb20;
import defpackage.ny61;
import defpackage.p0;
import defpackage.rs2;
import defpackage.s66;
import defpackage.w8h;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.am.k;

/* loaded from: classes.dex */
public final class c {
    public final kb20 a;
    public final k b;
    public final w8h c;
    public final s66 d;
    public final rs2 e;
    public final bpt f;

    public c(kb20 kb20Var, k kVar, w8h w8hVar, s66 s66Var, rs2 rs2Var, bpt bptVar) {
        this.a = kb20Var;
        this.b = kVar;
        this.c = w8hVar;
        this.d = s66Var;
        this.e = rs2Var;
        this.f = bptVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AboutAppInfoCopyInteractor$createData$1 aboutAppInfoCopyInteractor$createData$1;
        int i;
        String str;
        String str2;
        long j;
        boolean booleanValue;
        if (continuationImpl instanceof AboutAppInfoCopyInteractor$createData$1) {
            aboutAppInfoCopyInteractor$createData$1 = (AboutAppInfoCopyInteractor$createData$1) continuationImpl;
            int i2 = aboutAppInfoCopyInteractor$createData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aboutAppInfoCopyInteractor$createData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = aboutAppInfoCopyInteractor$createData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aboutAppInfoCopyInteractor$createData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kb20 kb20Var = this.a;
                    String b = kb20Var.b();
                    String a = kb20Var.a();
                    long Lg = this.b.Lg();
                    aboutAppInfoCopyInteractor$createData$1.L$0 = b;
                    aboutAppInfoCopyInteractor$createData$1.L$1 = a;
                    aboutAppInfoCopyInteractor$createData$1.J$0 = Lg;
                    aboutAppInfoCopyInteractor$createData$1.label = 1;
                    Object b2 = this.d.b.b(aboutAppInfoCopyInteractor$createData$1);
                    if (b2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = a;
                    obj = b2;
                    str2 = b;
                    j = Lg;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = aboutAppInfoCopyInteractor$createData$1.J$0;
                    str = (String) aboutAppInfoCopyInteractor$createData$1.L$1;
                    str2 = (String) aboutAppInfoCopyInteractor$createData$1.L$0;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                String str3 = this.f.a().c;
                MapBuilder mapBuilder = new MapBuilder();
                if (!booleanValue) {
                    mapBuilder.put("account_uid", new Long(j));
                }
                mapBuilder.put("AM_uuid", str2);
                mapBuilder.put("AM_device_id", str);
                mapBuilder.put("MOB_id", str3);
                if (booleanValue) {
                    this.e.getClass();
                    mapBuilder.put("Version", "5.89.0 (50128354)");
                    mapBuilder.put("Android", Build.VERSION.RELEASE + " (SDK " + Build.VERSION.SDK_INT + Extension.C_BRAKE);
                    mapBuilder.put("Device", Build.MODEL);
                    mapBuilder.putAll((MapBuilder) this.c.a().b);
                }
                return kotlin.collections.a.X(iw00.x(mapBuilder.j()), "\n", null, null, new p0(4), 30);
            }
        }
        aboutAppInfoCopyInteractor$createData$1 = new AboutAppInfoCopyInteractor$createData$1(this, continuationImpl);
        Object obj2 = aboutAppInfoCopyInteractor$createData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aboutAppInfoCopyInteractor$createData$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        String str32 = this.f.a().c;
        MapBuilder mapBuilder2 = new MapBuilder();
        if (!booleanValue) {
        }
        mapBuilder2.put("AM_uuid", str2);
        mapBuilder2.put("AM_device_id", str);
        mapBuilder2.put("MOB_id", str32);
        if (booleanValue) {
        }
        return kotlin.collections.a.X(iw00.x(mapBuilder2.j()), "\n", null, null, new p0(4), 30);
    }
}
