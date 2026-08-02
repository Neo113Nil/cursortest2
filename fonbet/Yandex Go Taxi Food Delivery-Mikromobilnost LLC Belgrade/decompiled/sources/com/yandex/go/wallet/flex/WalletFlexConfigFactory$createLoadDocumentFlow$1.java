package com.yandex.go.wallet.flex;

import defpackage.avj0;
import defpackage.c231;
import defpackage.d0m;
import defpackage.h2m;
import defpackage.ig90;
import defpackage.jg90;
import defpackage.kg90;
import defpackage.kwh0;
import defpackage.l2m;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pwy;
import defpackage.q3m;
import defpackage.u1m;
import defpackage.uyg;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wls;
import defpackage.y841;
import defpackage.zy11;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lkr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.wallet.flex.WalletFlexConfigFactory$createLoadDocumentFlow$1", f = "WalletFlexConfigFactory.kt", l = {150, 151, 164}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class WalletFlexConfigFactory$createLoadDocumentFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ d0m $documentJsonProvider;
    final /* synthetic */ boolean $isForce;
    final /* synthetic */ boolean $usePreview;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletFlexConfigFactory$createLoadDocumentFlow$1(a aVar, boolean z, d0m d0mVar, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$usePreview = z;
        this.$documentJsonProvider = d0mVar;
        this.$isForce = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WalletFlexConfigFactory$createLoadDocumentFlow$1 walletFlexConfigFactory$createLoadDocumentFlow$1 = new WalletFlexConfigFactory$createLoadDocumentFlow$1(this.this$0, this.$usePreview, this.$documentJsonProvider, this.$isForce, continuation);
        walletFlexConfigFactory$createLoadDocumentFlow$1.L$0 = obj;
        return walletFlexConfigFactory$createLoadDocumentFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletFlexConfigFactory$createLoadDocumentFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
    
        if (r0.emit(r4, r8) != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0052, code lost:
    
        if (r9 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0042, code lost:
    
        if (r9.a(r8) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q3m q3mVar;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.wallet.divkit.b bVar = this.this$0.j;
            this.L$0 = vprVar;
            this.label = 1;
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
            kotlin.b.b(obj);
            u1m u1mVar = (u1m) obj;
            if (this.$usePreview) {
                y841 y841Var = this.this$0.h;
                d0m d0mVar = this.$documentJsonProvider;
                y841Var.getClass();
                l2m l2mVar = new l2m(d0mVar, (uyg) null);
                InputStream openRawResource = ((avj0) y841Var.a).a.getResources().openRawResource(kwh0.wallet_preview);
                try {
                    kg90 kg90Var = (kg90) l2mVar.b(u1mVar, null, null).a(kotlin.collections.b.f(), openRawResource);
                    ooc.g(openRawResource, null);
                    if (kg90Var instanceof jg90) {
                        q3mVar = new q3m(((h2m) ((jg90) kg90Var).a).a, EmptyList.a);
                        if (q3mVar != null) {
                            Collection collection = q3mVar.b;
                            com.yandex.div.core.expression.variables.a aVar = this.this$0.m;
                            c231[] c231VarArr = (c231[]) collection.toArray(new c231[0]);
                            aVar.i((c231[]) Arrays.copyOf(c231VarArr, c231VarArr.length));
                        }
                        pwy pwyVar = new pwy(u1mVar, q3mVar == null ? q3mVar.a : null, this.$isForce);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 3;
                    } else if (!(kg90Var instanceof ig90)) {
                        w511.b();
                        return null;
                    }
                } finally {
                }
            }
            q3mVar = null;
            if (q3mVar != null) {
            }
            pwy pwyVar2 = new pwy(u1mVar, q3mVar == null ? q3mVar.a : null, this.$isForce);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
        }
        com.yandex.go.wallet.data.a aVar2 = this.this$0.d;
        this.L$0 = vprVar;
        this.label = 2;
        obj = aVar2.a(this);
    }
}
