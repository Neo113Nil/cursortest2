package com.yandex.go.vault.flexsdk.descriptors.widget.view;

import android.content.Context;
import com.yandex.go.vault.analytics.VaultErrorNotificationType;
import com.yandex.go.vault.data.e;
import com.yandex.go.vault.flexsdk.descriptors.widget.VaultRarity;
import com.yandex.go.vault.ui.VaultErrorNotification;
import defpackage.ad5;
import defpackage.c431;
import defpackage.d431;
import defpackage.i331;
import defpackage.kyh0;
import defpackage.l331;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.pav;
import defpackage.pzt0;
import defpackage.tj60;
import defpackage.wgr;
import defpackage.wnt;
import defpackage.x331;
import defpackage.ytz;
import defpackage.z231;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b extends ad5 {
    public final e A;
    public final z231 B;
    public final tj60 C;
    public final ytz D;
    public final i331 E;
    public final com.yandex.go.vault.data.b F;
    public final wnt G;
    public l331 H;
    public pzt0 I;
    public final Context x;
    public final wgr y;
    public final pav z;

    public b(Context context, wgr wgrVar, pav pavVar, e eVar, z231 z231Var, tj60 tj60Var, ytz ytzVar, i331 i331Var, com.yandex.go.vault.data.b bVar, wnt wntVar) {
        super(c431.class);
        this.x = context;
        this.y = wgrVar;
        this.z = pavVar;
        this.A = eVar;
        this.B = z231Var;
        this.C = tj60Var;
        this.D = ytzVar;
        this.E = i331Var;
        this.F = bVar;
        this.G = wntVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(3:18|19|20))(1:23))(3:27|28|(2:30|22))|24|(2:26|22)|20))|34|6|7|(0)(0)|24|(0)|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r2.a((defpackage.kr) r8, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        r7.Mg(null);
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(b bVar, Continuation continuation) {
        VaultsPagerPresenter$handleVaultAcceptAction$1 vaultsPagerPresenter$handleVaultAcceptAction$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        wgr wgrVar;
        bVar.getClass();
        if (continuation instanceof VaultsPagerPresenter$handleVaultAcceptAction$1) {
            vaultsPagerPresenter$handleVaultAcceptAction$1 = (VaultsPagerPresenter$handleVaultAcceptAction$1) continuation;
            int i2 = vaultsPagerPresenter$handleVaultAcceptAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vaultsPagerPresenter$handleVaultAcceptAction$1.label = i2 - Integer.MIN_VALUE;
                obj = vaultsPagerPresenter$handleVaultAcceptAction$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vaultsPagerPresenter$handleVaultAcceptAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = bVar.A;
                    vaultsPagerPresenter$handleVaultAcceptAction$1.label = 1;
                    if (eVar.a(vaultsPagerPresenter$handleVaultAcceptAction$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wgrVar = (wgr) vaultsPagerPresenter$handleVaultAcceptAction$1.L$0;
                    kotlin.b.b(obj);
                    vaultsPagerPresenter$handleVaultAcceptAction$1.L$0 = null;
                    vaultsPagerPresenter$handleVaultAcceptAction$1.label = 3;
                }
                wgrVar = bVar.y;
                com.yandex.go.vault.data.b bVar2 = bVar.F;
                vaultsPagerPresenter$handleVaultAcceptAction$1.L$0 = wgrVar;
                vaultsPagerPresenter$handleVaultAcceptAction$1.label = 2;
                obj = bVar2.a(null, vaultsPagerPresenter$handleVaultAcceptAction$1);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                vaultsPagerPresenter$handleVaultAcceptAction$1.L$0 = null;
                vaultsPagerPresenter$handleVaultAcceptAction$1.label = 3;
            }
        }
        vaultsPagerPresenter$handleVaultAcceptAction$1 = new VaultsPagerPresenter$handleVaultAcceptAction$1(bVar, continuation);
        obj = vaultsPagerPresenter$handleVaultAcceptAction$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vaultsPagerPresenter$handleVaultAcceptAction$1.label;
        if (i != 0) {
        }
        wgrVar = bVar.y;
        com.yandex.go.vault.data.b bVar22 = bVar.F;
        vaultsPagerPresenter$handleVaultAcceptAction$1.L$0 = wgrVar;
        vaultsPagerPresenter$handleVaultAcceptAction$1.label = 2;
        obj = bVar22.a(null, vaultsPagerPresenter$handleVaultAcceptAction$1);
        if (obj == coroutineSingletons) {
        }
        vaultsPagerPresenter$handleVaultAcceptAction$1.L$0 = null;
        vaultsPagerPresenter$handleVaultAcceptAction$1.label = 3;
    }

    public final void Lg(x331 x331Var) {
        String obj;
        String obj2;
        o7r0 o7r0Var = this.B.a;
        VaultRarity vaultRarity = x331Var.b;
        String str = null;
        String lowerCase = (vaultRarity == null || (obj2 = vaultRarity.toString()) == null) ? null : obj2.toLowerCase(Locale.ROOT);
        VaultRarity vaultRarity2 = x331Var.a;
        if (vaultRarity2 != null && (obj = vaultRarity2.toString()) != null) {
            str = obj.toLowerCase(Locale.ROOT);
        }
        String lowerCase2 = x331Var.d.toString().toLowerCase(Locale.ROOT);
        Integer valueOf = Integer.valueOf(x331Var.c);
        o7r0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", lowerCase2);
        hashMap.put("key_amount", valueOf);
        if (lowerCase != null) {
            hashMap.put("next_vault_type", lowerCase);
        }
        if (str != null) {
            hashMap.put("previous_vault_type", str);
        }
        o7r0Var.a.a("Vault.MainScreen.Tapped", hashMap, 1, new HashMap());
    }

    public final void Mg(String str) {
        Context context = this.x;
        if (str == null) {
            str = context.getString(kyh0.strongbox_data_load_failed_notification_subtitle);
        }
        String str2 = str;
        this.B.a(VaultErrorNotificationType.NETWORK_ERROR, str2);
        VaultErrorNotification vaultErrorNotification = new VaultErrorNotification("vault_error", context.getString(kyh0.strongbox_data_load_failed_notification_title), str2, this.x, false, null, 0, 112, null);
        vaultErrorNotification.startExpiresTimer(5000L);
        vaultErrorNotification.setExpiresListener(new d431(this, vaultErrorNotification, 0));
        this.C.e(vaultErrorNotification);
    }
}
