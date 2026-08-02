package com.yandex.go.vault.flexsdk.descriptors.widget.view;

import com.yandex.go.image.domain.requests.g;
import com.yandex.go.vault.data.e;
import com.yandex.go.vault.flexsdk.descriptors.widget.VaultRarity;
import defpackage.c431;
import defpackage.l331;
import defpackage.mnj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.obv;
import defpackage.pzt0;
import defpackage.qcx;
import defpackage.s8o;
import defpackage.tje;
import defpackage.tse;
import defpackage.wgr;
import defpackage.wls;
import defpackage.xnt;
import defpackage.xxn;
import defpackage.z231;
import defpackage.zy11;
import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.vault.flexsdk.descriptors.widget.view.VaultsPagerPresenter$openVault$1", f = "VaultsPagerPresenter.kt", l = {HProv.PP_INFO, HProv.PP_VERSION_TIMESTAMP, HProv.PP_FAST_CODE, HProv.PP_ENUM_LOG}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VaultsPagerPresenter$openVault$1 extends SuspendLambda implements wls {
    final /* synthetic */ VaultRarity $rarity;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.vault.flexsdk.descriptors.widget.view.VaultsPagerPresenter$openVault$1$1", f = "VaultsPagerPresenter.kt", l = {Constants.VPN_TRAFFIC}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.vault.flexsdk.descriptors.widget.view.VaultsPagerPresenter$openVault$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                this.label = 1;
                if (kotlinx.coroutines.a.i(5000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            ((c431) this.this$0.Dg()).enableUserInput();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultsPagerPresenter$openVault$1(b bVar, VaultRarity vaultRarity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$rarity = vaultRarity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VaultsPagerPresenter$openVault$1 vaultsPagerPresenter$openVault$1 = new VaultsPagerPresenter$openVault$1(this.this$0, this.$rarity, continuation);
        vaultsPagerPresenter$openVault$1.L$0 = obj;
        return vaultsPagerPresenter$openVault$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VaultsPagerPresenter$openVault$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x009f, code lost:
    
        if (r11.a(r2, r10) == r1) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4 A[Catch: all -> 0x0059, CancellationException -> 0x0178, TryCatch #2 {all -> 0x0059, blocks: (B:18:0x010d, B:38:0x0054, B:39:0x00dc, B:41:0x00e4), top: B:37:0x0054 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b bVar;
        kotlinx.serialization.json.b bVar2;
        String g;
        wgr wgrVar;
        xxn xxnVar;
        b bVar3;
        b bVar4;
        b bVar5;
        b bVar6;
        l331 l331Var;
        b bVar7;
        b bVar8;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
            } catch (Throwable th) {
                th = th;
                bVar = tseVar;
            }
            if (i == 0) {
                kotlin.b.b(obj);
                z231 z231Var = this.this$0.B;
                VaultRarity vaultRarity = this.$rarity;
                o7r0 o7r0Var = z231Var.a;
                String lowerCase = vaultRarity.toString().toLowerCase(Locale.ROOT);
                o7r0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("vault_type", lowerCase);
                o7r0Var.a.a("Vault.Open", hashMap, 1, new HashMap());
                wgr wgrVar2 = this.this$0.y;
                mnj mnjVar = new mnj();
                this.L$0 = tseVar;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            bVar7 = (b) this.L$2;
                            bVar8 = (b) this.L$1;
                            kotlin.b.b(obj);
                            ((Result) obj).getClass();
                            bVar5 = bVar8;
                            bVar = bVar7;
                            ((c431) bVar5.Dg()).onVaultOpen();
                            return zy11.a;
                        }
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bVar3 = (b) this.L$1;
                        kotlin.b.b(obj);
                        ((c431) bVar3.Dg()).onVaultError();
                        ((c431) bVar3.Dg()).enableUserInput();
                        return zy11.a;
                    }
                    bVar4 = (b) this.L$3;
                    bVar = (b) this.L$2;
                    bVar5 = (b) this.L$1;
                    try {
                        kotlin.b.b(obj);
                        bVar6 = bVar;
                        bVar4.H = (l331) obj;
                        l331Var = bVar5.H;
                        bVar = bVar6;
                    } catch (Throwable th2) {
                        th = th2;
                        BufferedInputStream N = s8o.N(th);
                        bVar.getClass();
                        if (N != null) {
                            try {
                                bVar2 = (kotlinx.serialization.json.b) ((c) ((xnt) bVar.G).b(N, c.Companion.serializer())).get(io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE);
                            } catch (Exception unused) {
                            }
                            if (bVar2 != null) {
                                g = qcx.g(qcx.n(bVar2));
                                bVar.Mg(g);
                                wgrVar = bVar.y;
                                xxnVar = new xxn();
                                this.L$0 = null;
                                this.L$1 = bVar;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 4;
                                if (wgrVar.a(xxnVar, this) != coroutineSingletons) {
                                    bVar3 = bVar;
                                    ((c431) bVar3.Dg()).onVaultError();
                                    ((c431) bVar3.Dg()).enableUserInput();
                                    return zy11.a;
                                }
                                return coroutineSingletons;
                            }
                        }
                        g = null;
                        bVar.Mg(g);
                        wgrVar = bVar.y;
                        xxnVar = new xxn();
                        this.L$0 = null;
                        this.L$1 = bVar;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 4;
                        if (wgrVar.a(xxnVar, this) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (l331Var != null) {
                        g gVar = (g) bVar5.z.e();
                        gVar.b(new obv(l331Var.e, null, 6, 0));
                        this.L$0 = null;
                        this.L$1 = bVar5;
                        this.L$2 = bVar6;
                        this.L$3 = null;
                        this.label = 3;
                        if (ru.yandex.taxi.utils.a.e(gVar, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        bVar7 = bVar6;
                        bVar8 = bVar5;
                        bVar5 = bVar8;
                        bVar = bVar7;
                    }
                    ((c431) bVar5.Dg()).onVaultOpen();
                    return zy11.a;
                }
                kotlin.b.b(obj);
            }
            ((c431) this.this$0.Dg()).disableUserInput();
            b bVar9 = this.this$0;
            bVar9.I = tje.N(tseVar, null, null, new AnonymousClass1(bVar9, null), 3);
            bVar4 = this.this$0;
            VaultRarity vaultRarity2 = this.$rarity;
            pzt0 pzt0Var = bVar4.I;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            e eVar = bVar4.A;
            this.L$0 = null;
            this.L$1 = bVar4;
            this.L$2 = bVar4;
            this.L$3 = bVar4;
            this.label = 2;
            obj = eVar.b(vaultRarity2, this);
            if (obj != coroutineSingletons) {
                b bVar10 = bVar4;
                bVar5 = bVar10;
                bVar6 = bVar10;
                bVar4.H = (l331) obj;
                l331Var = bVar5.H;
                bVar = bVar6;
                if (l331Var != null) {
                }
                ((c431) bVar5.Dg()).onVaultOpen();
                return zy11.a;
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
