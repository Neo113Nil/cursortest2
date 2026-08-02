package com.yandex.go.vault.data;

import com.yandex.go.vault.flexsdk.descriptors.widget.VaultRarity;
import defpackage.a331;
import defpackage.cmt;
import defpackage.jst;
import defpackage.l331;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tcc;
import defpackage.tw11;
import defpackage.x231;
import defpackage.x991;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class e {
    public final tw11 a;
    public final po21 b;
    public final com.yandex.go.zone.repository.d c;

    public e(tw11 tw11Var, po21 po21Var, com.yandex.go.zone.repository.d dVar) {
        this.a = tw11Var;
        this.b = po21Var;
        this.c = dVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(4:18|19|(1:21)|22))(1:25))(3:37|38|(2:40|24))|26|27|(1:29)(1:35)|(1:31)|32|(4:34|19|(0)|22)|24))|43|6|7|(0)(0)|26|27|(0)(0)|(0)|32|(0)|24) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c8, code lost:
    
        if (ru.yandex.taxi.network.api.a.d(r13, r0) != r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004f, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0065, code lost:
    
        defpackage.jst.e.k(r14, "Error while fetching location");
        r14 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        VaultRepository$accept$1 vaultRepository$accept$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        mo21 mo21Var;
        a331 a331Var;
        String str;
        Object a;
        String str2;
        if (continuationImpl instanceof VaultRepository$accept$1) {
            vaultRepository$accept$1 = (VaultRepository$accept$1) continuationImpl;
            int i2 = vaultRepository$accept$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vaultRepository$accept$1.label = i2 - Integer.MIN_VALUE;
                Object obj = vaultRepository$accept$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vaultRepository$accept$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    po21 po21Var = this.b;
                    vaultRepository$accept$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).f(vaultRepository$accept$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    str2 = (String) vaultRepository$accept$1.L$2;
                    a331Var = (a331) vaultRepository$accept$1.L$1;
                    kotlin.b.b(obj);
                    String str3 = (String) obj;
                    cmt<zy11> a2 = ((VaultInternalApi) a331Var.a.getValue()).a(str3 != null ? str3 : "", str2);
                    vaultRepository$accept$1.L$0 = null;
                    vaultRepository$accept$1.L$1 = null;
                    vaultRepository$accept$1.L$2 = null;
                    vaultRepository$accept$1.label = 3;
                }
                mo21Var = (mo21) obj;
                a331Var = (a331) this.a.get();
                if (mo21Var == null) {
                    str = mo21Var.a + ";" + mo21Var.b;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                vaultRepository$accept$1.L$0 = null;
                vaultRepository$accept$1.L$1 = a331Var;
                vaultRepository$accept$1.L$2 = str;
                vaultRepository$accept$1.label = 2;
                a = com.yandex.go.zone.interactors.f.a(this.c, ",", vaultRepository$accept$1);
                if (a != coroutineSingletons) {
                    String str4 = str;
                    obj = a;
                    str2 = str4;
                    String str32 = (String) obj;
                    cmt<zy11> a22 = ((VaultInternalApi) a331Var.a.getValue()).a(str32 != null ? str32 : "", str2);
                    vaultRepository$accept$1.L$0 = null;
                    vaultRepository$accept$1.L$1 = null;
                    vaultRepository$accept$1.L$2 = null;
                    vaultRepository$accept$1.label = 3;
                }
                return coroutineSingletons;
            }
        }
        vaultRepository$accept$1 = new VaultRepository$accept$1(this, continuationImpl);
        Object obj2 = vaultRepository$accept$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vaultRepository$accept$1.label;
        if (i != 0) {
        }
        mo21Var = (mo21) obj2;
        a331Var = (a331) this.a.get();
        if (mo21Var == null) {
        }
        if (str == null) {
        }
        vaultRepository$accept$1.L$0 = null;
        vaultRepository$accept$1.L$1 = a331Var;
        vaultRepository$accept$1.L$2 = str;
        vaultRepository$accept$1.label = 2;
        a = com.yandex.go.zone.interactors.f.a(this.c, ",", vaultRepository$accept$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(1:(1:(6:12|13|(2:16|14)|17|18|19)(2:21|22))(4:23|24|(1:26)|27))(2:30|31))(6:43|44|45|46|47|(2:49|29))|32|33|(1:35)(1:41)|(1:37)|38|(4:40|24|(0)|27)|29))|55|6|7|(0)(0)|32|33|(0)(0)|(0)|38|(0)|29|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fa, code lost:
    
        if (r0 != r3) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0064, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(VaultRarity vaultRarity, ContinuationImpl continuationImpl) {
        VaultRepository$openVault$1 vaultRepository$openVault$1;
        CoroutineSingletons coroutineSingletons;
        ?? r4;
        mo21 mo21Var;
        Object obj;
        String str;
        Object a;
        String str2;
        String str3;
        if (continuationImpl instanceof VaultRepository$openVault$1) {
            vaultRepository$openVault$1 = (VaultRepository$openVault$1) continuationImpl;
            int i = vaultRepository$openVault$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vaultRepository$openVault$1.label = i - Integer.MIN_VALUE;
                Object obj2 = vaultRepository$openVault$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                r4 = vaultRepository$openVault$1.label;
                if (r4 != 0) {
                    kotlin.b.b(obj2);
                    try {
                        po21 po21Var = this.b;
                        VaultRarity vaultRarity2 = vaultRarity;
                        vaultRepository$openVault$1.L$0 = vaultRarity2;
                        vaultRepository$openVault$1.label = 1;
                        obj2 = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).f(vaultRepository$openVault$1);
                        r4 = vaultRarity2;
                    } catch (Exception e) {
                        e = e;
                        r4 = vaultRarity;
                        jst.e.k(e, "Error while fetching location");
                        mo21Var = null;
                        obj = r4;
                        String lowerCase = obj.toString().toLowerCase(Locale.ROOT);
                        if (mo21Var != null) {
                        }
                        if (str == null) {
                        }
                        vaultRepository$openVault$1.L$0 = null;
                        vaultRepository$openVault$1.L$1 = null;
                        vaultRepository$openVault$1.L$2 = lowerCase;
                        vaultRepository$openVault$1.L$3 = str;
                        vaultRepository$openVault$1.label = 2;
                        a = com.yandex.go.zone.interactors.f.a(this.c, ",", vaultRepository$openVault$1);
                        if (a != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (r4 == 1) {
                    VaultRarity vaultRarity3 = (VaultRarity) vaultRepository$openVault$1.L$0;
                    kotlin.b.b(obj2);
                    r4 = vaultRarity3;
                } else {
                    if (r4 != 2) {
                        if (r4 != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        VaultPrizeResponse vaultPrizeResponse = ((VaultResponse) obj2).a;
                        String str4 = vaultPrizeResponse.a;
                        String str5 = vaultPrizeResponse.b;
                        String str6 = vaultPrizeResponse.c;
                        String str7 = vaultPrizeResponse.d;
                        String str8 = vaultPrizeResponse.e;
                        List<VaultActionButtonResponse> list = vaultPrizeResponse.f;
                        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                        for (VaultActionButtonResponse vaultActionButtonResponse : list) {
                            arrayList.add(new x231(x991.b(vaultActionButtonResponse.a), vaultActionButtonResponse.b, vaultActionButtonResponse.c, vaultActionButtonResponse.d, vaultActionButtonResponse.e, vaultActionButtonResponse.f, true));
                        }
                        return new l331(str4, str5, str6, str7, str8, arrayList, true);
                    }
                    str2 = (String) vaultRepository$openVault$1.L$3;
                    str3 = (String) vaultRepository$openVault$1.L$2;
                    kotlin.b.b(obj2);
                    String str9 = (String) obj2;
                    cmt<VaultResponse> b = ((VaultInternalApi) ((a331) this.a.get()).a.getValue()).b(new VaultOpenParam(str3, str2, str9 != null ? str9 : ""));
                    vaultRepository$openVault$1.L$0 = null;
                    vaultRepository$openVault$1.L$1 = null;
                    vaultRepository$openVault$1.L$2 = null;
                    vaultRepository$openVault$1.L$3 = null;
                    vaultRepository$openVault$1.label = 3;
                    obj2 = ru.yandex.taxi.network.api.a.d(b, vaultRepository$openVault$1);
                }
                mo21Var = (mo21) obj2;
                obj = r4;
                String lowerCase2 = obj.toString().toLowerCase(Locale.ROOT);
                str = mo21Var != null ? mo21Var.a + ";" + mo21Var.b : null;
                if (str == null) {
                    str = "";
                }
                vaultRepository$openVault$1.L$0 = null;
                vaultRepository$openVault$1.L$1 = null;
                vaultRepository$openVault$1.L$2 = lowerCase2;
                vaultRepository$openVault$1.L$3 = str;
                vaultRepository$openVault$1.label = 2;
                a = com.yandex.go.zone.interactors.f.a(this.c, ",", vaultRepository$openVault$1);
                if (a != coroutineSingletons) {
                    str2 = str;
                    obj2 = a;
                    str3 = lowerCase2;
                    String str92 = (String) obj2;
                    cmt<VaultResponse> b2 = ((VaultInternalApi) ((a331) this.a.get()).a.getValue()).b(new VaultOpenParam(str3, str2, str92 != null ? str92 : ""));
                    vaultRepository$openVault$1.L$0 = null;
                    vaultRepository$openVault$1.L$1 = null;
                    vaultRepository$openVault$1.L$2 = null;
                    vaultRepository$openVault$1.L$3 = null;
                    vaultRepository$openVault$1.label = 3;
                    obj2 = ru.yandex.taxi.network.api.a.d(b2, vaultRepository$openVault$1);
                }
                return coroutineSingletons;
            }
        }
        vaultRepository$openVault$1 = new VaultRepository$openVault$1(this, continuationImpl);
        Object obj22 = vaultRepository$openVault$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        r4 = vaultRepository$openVault$1.label;
        if (r4 != 0) {
        }
        mo21Var = (mo21) obj22;
        obj = r4;
        String lowerCase22 = obj.toString().toLowerCase(Locale.ROOT);
        if (mo21Var != null) {
        }
        if (str == null) {
        }
        vaultRepository$openVault$1.L$0 = null;
        vaultRepository$openVault$1.L$1 = null;
        vaultRepository$openVault$1.L$2 = lowerCase22;
        vaultRepository$openVault$1.L$3 = str;
        vaultRepository$openVault$1.label = 2;
        a = com.yandex.go.zone.interactors.f.a(this.c, ",", vaultRepository$openVault$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
