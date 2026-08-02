package com.yandex.payment.sdk.transportcards.nfc;

import android.nfc.tech.MifareClassic;
import com.yandex.payment.sdk.transportcards.nfc.exception.DetectedTypeReadingException;
import com.yandex.payment.sdk.transportcards.nfc.model.ReadBlocks;
import com.yandex.payment.sdk.transportcards.nfc.model.ReadBlocksResult;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;
import defpackage.ahr;
import defpackage.dgr;
import defpackage.eg01;
import defpackage.g6u;
import defpackage.gw00;
import defpackage.igr;
import defpackage.j73;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.of11;
import defpackage.ofu;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sjh;
import defpackage.sv90;
import defpackage.tse;
import defpackage.u111;
import defpackage.uyj;
import defpackage.vfc;
import defpackage.w511;
import defpackage.wj00;
import defpackage.wls;
import defpackage.y22;
import defpackage.y891;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.sdk.transportcards.nfc.TroikaNfcController$readBlocksAction$2", f = "TroikaNfcController.kt", l = {211, 216}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class TroikaNfcController$readBlocksAction$2 extends SuspendLambda implements wls {
    final /* synthetic */ igr $params;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.payment.sdk.transportcards.nfc.TroikaNfcController$readBlocksAction$2$1", f = "TroikaNfcController.kt", l = {}, m = "invokeSuspend", v = 1)
    /* renamed from: com.yandex.payment.sdk.transportcards.nfc.TroikaNfcController$readBlocksAction$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ List<ReadBlocks> $blocks;
        final /* synthetic */ igr $params;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list, a aVar, igr igrVar, Continuation continuation) {
            super(2, continuation);
            this.$blocks = list;
            this.this$0 = aVar;
            this.$params = igrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$blocks, this.this$0, this.$params, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            u111 viewModel;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            boolean isEmpty = this.$blocks.isEmpty();
            if (!isEmpty) {
                a aVar = this.this$0;
                aVar.h = null;
                eg01 eg01Var = aVar.a;
                ReadBlocksResult readBlocksResult = new ReadBlocksResult(this.$blocks);
                viewModel = ((TransportCardsActivity) eg01Var.a).getViewModel();
                ahr ahrVar = viewModel.b;
                if (ahrVar != null) {
                    ((com.yandex.payment.sdk.flex.impl.b) ahrVar).h(gw00.e(new Pair("TicketWriteState", gw00.e(new Pair("readBlocksResult", readBlocksResult)))));
                }
                this.$params.b.invoke();
            } else {
                if (!isEmpty) {
                    w511.b();
                    return null;
                }
                this.this$0.h();
                this.this$0.h = null;
                this.$params.c.invoke();
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TroikaNfcController$readBlocksAction$2(a aVar, igr igrVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$params = igrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TroikaNfcController$readBlocksAction$2(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TroikaNfcController$readBlocksAction$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0198, code lost:
    
        if (defpackage.tje.k0(r0, r3, r16) == r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x019a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x017c, code lost:
    
        if (r9 != r2) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        boolean authenticateSectorWithKeyB;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            MifareClassic mifareClassic = aVar.e;
            ArrayList arrayList2 = this.$params.a;
            this.label = 1;
            rwo rwoVar = aVar.b;
            int i2 = 0;
            if (rwoVar != null) {
                ((y22) rwoVar).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Начало чтения блоков карты", "nfc_read_blocks_start"));
            }
            if (mifareClassic != null) {
                try {
                    arrayList = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj2 : arrayList2) {
                        Integer num = new Integer(((dgr) obj2).a);
                        Object obj3 = linkedHashMap.get(num);
                        if (obj3 == null) {
                            obj3 = new ArrayList();
                            linkedHashMap.put(num, obj3);
                        }
                        ((List) obj3).add(obj2);
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        int intValue = ((Number) entry.getKey()).intValue();
                        List list = (List) entry.getValue();
                        int blockToSector = mifareClassic.blockToSector(intValue);
                        Iterator it = list.iterator();
                        boolean z = false;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            dgr dgrVar = (dgr) it.next();
                            for (int i3 = 0; i3 < 5; i3++) {
                                String str = dgrVar.d;
                                String str2 = dgrVar.e;
                                if (jl40.l(str, "A")) {
                                    authenticateSectorWithKeyB = mifareClassic.authenticateSectorWithKeyA(blockToSector, ofu.a(str2));
                                } else {
                                    if (!jl40.l(str, "B")) {
                                        throw new DetectedTypeReadingException(dgrVar.d);
                                    }
                                    authenticateSectorWithKeyB = mifareClassic.authenticateSectorWithKeyB(blockToSector, ofu.a(str2));
                                }
                                z = authenticateSectorWithKeyB;
                                if (z) {
                                    break;
                                }
                            }
                            if (z) {
                                arrayList.add(new ReadBlocks(dgrVar.a, j73.K(mifareClassic.readBlock(dgrVar.a), "", new of11(i2), 30)));
                                break;
                            }
                        }
                        if (!z && rwoVar != null) {
                            qv90.a.getClass();
                            ((y22) rwoVar).a(sv90.y("Failed to authenticate the sector: " + blockToSector));
                        }
                    }
                    if (rwoVar != null) {
                        qv90.a.getClass();
                        wj00 wj00Var = new wj00(0);
                        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Успешное чтения блоков карты");
                        ((y22) rwoVar).a(y891.c("nfc_read_blocks_success", wj00Var));
                    }
                } catch (Exception e) {
                    if (rwoVar != null) {
                        sv90 sv90Var = qv90.a;
                        String valueOf = String.valueOf(e.getMessage());
                        sv90Var.getClass();
                        ((y22) rwoVar).a(sv90.y(valueOf));
                    }
                }
            }
            arrayList = EmptyList.a;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            b.b(obj);
            arrayList = obj;
        }
        sjh sjhVar = uyj.a;
        g6u g6uVar = o400.a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1((List) arrayList, this.this$0, this.$params, null);
        this.L$0 = null;
        this.label = 2;
    }
}
