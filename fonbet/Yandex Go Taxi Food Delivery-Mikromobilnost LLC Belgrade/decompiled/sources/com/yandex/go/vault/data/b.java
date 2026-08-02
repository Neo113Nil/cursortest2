package com.yandex.go.vault.data;

import defpackage.avj0;
import defpackage.cma1;
import defpackage.cvu0;
import defpackage.h2m;
import defpackage.ig90;
import defpackage.jg90;
import defpackage.jwh0;
import defpackage.k331;
import defpackage.kg90;
import defpackage.ny61;
import defpackage.pwy;
import defpackage.tls;
import defpackage.u1m;
import defpackage.uza;
import defpackage.w511;
import defpackage.yu00;
import defpackage.ywl;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class b {
    public final com.yandex.go.zone.repository.d a;
    public final k331 b;

    public b(com.yandex.go.zone.repository.d dVar, k331 k331Var) {
        this.a = dVar;
        this.b = k331Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        VaultLoadActionFactory$create$1 vaultLoadActionFactory$create$1;
        int i;
        String str2;
        String str3;
        b bVar;
        String str4;
        ywl ywlVar;
        if (continuationImpl instanceof VaultLoadActionFactory$create$1) {
            vaultLoadActionFactory$create$1 = (VaultLoadActionFactory$create$1) continuationImpl;
            int i2 = vaultLoadActionFactory$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vaultLoadActionFactory$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj = vaultLoadActionFactory$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vaultLoadActionFactory$create$1.label;
                ywl ywlVar2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    vaultLoadActionFactory$create$1.L$0 = str;
                    vaultLoadActionFactory$create$1.L$1 = "bdui/v1/vault/layout";
                    vaultLoadActionFactory$create$1.L$2 = this;
                    vaultLoadActionFactory$create$1.label = 1;
                    Object a = com.yandex.go.zone.interactors.f.a(this.a, ",", vaultLoadActionFactory$create$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = "bdui/v1/vault/layout";
                    obj = a;
                    str3 = str;
                    bVar = this;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = (b) vaultLoadActionFactory$create$1.L$2;
                    str2 = (String) vaultLoadActionFactory$create$1.L$1;
                    str3 = (String) vaultLoadActionFactory$create$1.L$0;
                    kotlin.b.b(obj);
                }
                str4 = (String) obj;
                if (str4 == null) {
                    str4 = "";
                }
                bVar.getClass();
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put("zone", str4);
                if (str3 != null) {
                    mapBuilder.put("redirect_on_show", str3);
                }
                u1m u1mVar = new u1m(2, str2, mapBuilder.j());
                k331 k331Var = this.b;
                ywlVar = k331Var.e;
                if (ywlVar == null) {
                    yu00 yu00Var = (yu00) ((tls) k331Var.d.getValue()).invoke(u1mVar);
                    InputStream openRawResource = ((avj0) k331Var.a).a.getResources().openRawResource(jwh0.vault_preview);
                    String string = k331Var.c.b.getString("main_screen_skeleton_shimmer_color", null);
                    if (string == null || string.length() == 0) {
                        string = null;
                    }
                    if (string == null) {
                        string = "#403F3F";
                    }
                    Charset charset = uza.a;
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, charset), 8192);
                    try {
                        String x0 = cma1.x0(bufferedReader);
                        bufferedReader.close();
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(cvu0.w(x0, "SKELETON_PLACEHOLDER", "(theme " + string + " 0p (col (padded 8p 12p (bone 148p 48p 24p)) (padded 12p 100p (bone 100% 32p 16p)) (padded 16p 48p 43p 48p (bone 100% 280p 48p)) (col (repeat 2 (padded 0p 8p 4p 8p (bone 100.0% 77p 16p))))))").getBytes(charset));
                        try {
                            kg90 kg90Var = (kg90) yu00Var.a(kotlin.collections.b.f(), byteArrayInputStream);
                            byteArrayInputStream.close();
                            if (kg90Var instanceof jg90) {
                                ywlVar2 = ((h2m) ((jg90) kg90Var).a).a;
                            } else if (!(kg90Var instanceof ig90)) {
                                w511.b();
                                return null;
                            }
                            k331Var.e = ywlVar2;
                            ywlVar = ywlVar2;
                        } finally {
                        }
                    } finally {
                    }
                }
                return new pwy(u1mVar, ywlVar, false, 4);
            }
        }
        vaultLoadActionFactory$create$1 = new VaultLoadActionFactory$create$1(this, continuationImpl);
        Object obj2 = vaultLoadActionFactory$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vaultLoadActionFactory$create$1.label;
        ywl ywlVar22 = null;
        if (i != 0) {
        }
        str4 = (String) obj2;
        if (str4 == null) {
        }
        bVar.getClass();
        MapBuilder mapBuilder2 = new MapBuilder();
        mapBuilder2.put("zone", str4);
        if (str3 != null) {
        }
        u1m u1mVar2 = new u1m(2, str2, mapBuilder2.j());
        k331 k331Var2 = this.b;
        ywlVar = k331Var2.e;
        if (ywlVar == null) {
        }
        return new pwy(u1mVar2, ywlVar, false, 4);
    }
}
