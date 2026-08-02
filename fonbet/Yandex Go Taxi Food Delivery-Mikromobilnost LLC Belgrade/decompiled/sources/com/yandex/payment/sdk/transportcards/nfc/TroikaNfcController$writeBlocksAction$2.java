package com.yandex.payment.sdk.transportcards.nfc;

import android.nfc.tech.MifareClassic;
import com.yandex.payment.sdk.transportcards.nfc.exception.AuthenticateSectorReadingException;
import com.yandex.payment.sdk.transportcards.nfc.exception.AuthenticateSectorWritingException;
import com.yandex.payment.sdk.transportcards.nfc.exception.CompareDataException;
import com.yandex.payment.sdk.transportcards.nfc.exception.ReadingException;
import com.yandex.payment.sdk.transportcards.nfc.exception.WritingException;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocksResult;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;
import defpackage.ahr;
import defpackage.eg01;
import defpackage.g6u;
import defpackage.gw00;
import defpackage.kgr;
import defpackage.lgr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.ofu;
import defpackage.qub1;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sjh;
import defpackage.sv90;
import defpackage.tse;
import defpackage.u111;
import defpackage.uyj;
import defpackage.vfc;
import defpackage.wls;
import defpackage.y22;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.sdk.transportcards.nfc.TroikaNfcController$writeBlocksAction$2", f = "TroikaNfcController.kt", l = {PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC, 241}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class TroikaNfcController$writeBlocksAction$2 extends SuspendLambda implements wls {
    final /* synthetic */ kgr $params;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.payment.sdk.transportcards.nfc.TroikaNfcController$writeBlocksAction$2$1", f = "TroikaNfcController.kt", l = {}, m = "invokeSuspend", v = 1)
    /* renamed from: com.yandex.payment.sdk.transportcards.nfc.TroikaNfcController$writeBlocksAction$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ WriteBlocksResult $blocks;
        final /* synthetic */ kgr $params;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, WriteBlocksResult writeBlocksResult, kgr kgrVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$blocks = writeBlocksResult;
            this.$params = kgrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$blocks, this.$params, continuation);
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
            a aVar = this.this$0;
            aVar.h = null;
            eg01 eg01Var = aVar.a;
            WriteBlocksResult writeBlocksResult = this.$blocks;
            viewModel = ((TransportCardsActivity) eg01Var.a).getViewModel();
            ahr ahrVar = viewModel.b;
            if (ahrVar != null) {
                ((com.yandex.payment.sdk.flex.impl.b) ahrVar).h(gw00.e(new Pair("TicketWriteState", gw00.e(new Pair("writeBlocksResult", writeBlocksResult)))));
            }
            this.$params.b.invoke();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TroikaNfcController$writeBlocksAction$2(a aVar, kgr kgrVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$params = kgrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TroikaNfcController$writeBlocksAction$2(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TroikaNfcController$writeBlocksAction$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x01f9, code lost:
    
        if (defpackage.tje.k0(r5, r6, r17) == r2) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x01fb, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01df, code lost:
    
        if (r0 == r2) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Object writeBlocksResult;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = this.label;
        if (i6 == 0) {
            b.b(obj);
            a aVar = this.this$0;
            MifareClassic mifareClassic = aVar.e;
            ArrayList arrayList = this.$params.a;
            this.label = 1;
            rwo rwoVar = aVar.b;
            int i7 = 0;
            if (rwoVar != null) {
                ((y22) rwoVar).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Начало записи блоков на карту", "nfc_write_blocks_start"));
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i8 = 0; i8 < size; i8++) {
                arrayList2.add(new WriteBlocks(((lgr) arrayList.get(i8)).a, WriteBlocks.NO_WRITE));
            }
            if (mifareClassic == null) {
                writeBlocksResult = new WriteBlocksResult(arrayList2);
            } else {
                try {
                    Iterator it = arrayList.iterator();
                    int i9 = 0;
                    while (it.hasNext()) {
                        try {
                            lgr lgrVar = (lgr) it.next();
                            int i10 = lgrVar.a;
                            String str = lgrVar.b;
                            int blockToSector = mifareClassic.blockToSector(i10);
                            int i11 = i7;
                            ?? r16 = i11;
                            while (i11 < 5 && (r16 = qub1.d(lgrVar, mifareClassic, blockToSector)) == 0) {
                                i11++;
                                r16 = r16;
                            }
                            if (r16 == 0) {
                                throw new AuthenticateSectorWritingException(blockToSector);
                            }
                            try {
                                mifareClassic.writeBlock(i10, ofu.a(str));
                                boolean z = false;
                                for (int i12 = 0; i12 < 5; i12++) {
                                    z = qub1.b(lgrVar, mifareClassic, blockToSector);
                                    if (z) {
                                        break;
                                    }
                                }
                                if (!z) {
                                    throw new AuthenticateSectorReadingException(blockToSector);
                                }
                                try {
                                    if (!Arrays.equals(mifareClassic.readBlock(i10), ofu.a(str))) {
                                        throw new CompareDataException();
                                    }
                                    ((WriteBlocks) arrayList2.get(i9)).setValue(WriteBlocks.OK);
                                    i9++;
                                    i7 = 0;
                                } catch (Exception e) {
                                    throw new ReadingException(e.toString());
                                }
                            } catch (Exception e2) {
                                throw new WritingException(e2.toString());
                            }
                        } catch (CompareDataException e3) {
                            e = e3;
                            i5 = i9;
                            if (rwoVar != null) {
                                sv90 sv90Var = qv90.a;
                                String valueOf = String.valueOf(e.getMessage());
                                sv90Var.getClass();
                                ((y22) rwoVar).a(sv90.A(valueOf));
                            }
                            ((WriteBlocks) arrayList2.get(i5)).setValue(WriteBlocks.COMPARE_ERROR);
                            writeBlocksResult = new WriteBlocksResult(arrayList2);
                        } catch (ReadingException e4) {
                            e = e4;
                            i4 = i9;
                            if (rwoVar != null) {
                                sv90 sv90Var2 = qv90.a;
                                String valueOf2 = String.valueOf(e.getMessage());
                                sv90Var2.getClass();
                                ((y22) rwoVar).a(sv90.A(valueOf2));
                            }
                            ((WriteBlocks) arrayList2.get(i4)).setValue(WriteBlocks.READ_ERROR);
                            writeBlocksResult = new WriteBlocksResult(arrayList2);
                        } catch (WritingException e5) {
                            e = e5;
                            i3 = i9;
                            if (rwoVar != null) {
                                sv90 sv90Var3 = qv90.a;
                                String valueOf3 = String.valueOf(e.getMessage());
                                sv90Var3.getClass();
                                ((y22) rwoVar).a(sv90.A(valueOf3));
                            }
                            ((WriteBlocks) arrayList2.get(i3)).setValue(WriteBlocks.WRITE_ERROR);
                            writeBlocksResult = new WriteBlocksResult(arrayList2);
                        } catch (NullPointerException e6) {
                            e = e6;
                            i2 = i9;
                            if (rwoVar != null) {
                                sv90 sv90Var4 = qv90.a;
                                String valueOf4 = String.valueOf(e.getMessage());
                                sv90Var4.getClass();
                                ((y22) rwoVar).a(sv90.A(valueOf4));
                            }
                            ((WriteBlocks) arrayList2.get(i2)).setValue(WriteBlocks.WRITE_ERROR);
                            writeBlocksResult = new WriteBlocksResult(arrayList2);
                        } catch (Exception e7) {
                            e = e7;
                            i = i9;
                            if (rwoVar != null) {
                                sv90 sv90Var5 = qv90.a;
                                String valueOf5 = String.valueOf(e.getMessage());
                                sv90Var5.getClass();
                                ((y22) rwoVar).a(sv90.A(valueOf5));
                            }
                            ((WriteBlocks) arrayList2.get(i)).setValue(WriteBlocks.WRITE_ERROR);
                            writeBlocksResult = new WriteBlocksResult(arrayList2);
                        }
                    }
                    if (rwoVar != null) {
                        qv90.a.getClass();
                        ((y22) rwoVar).a(sv90.B());
                    }
                } catch (CompareDataException e8) {
                    e = e8;
                    i5 = 0;
                } catch (ReadingException e9) {
                    e = e9;
                    i4 = 0;
                } catch (WritingException e10) {
                    e = e10;
                    i3 = 0;
                } catch (NullPointerException e11) {
                    e = e11;
                    i2 = 0;
                } catch (Exception e12) {
                    e = e12;
                    i = 0;
                }
                writeBlocksResult = new WriteBlocksResult(arrayList2);
            }
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            b.b(obj);
            writeBlocksResult = obj;
        }
        sjh sjhVar = uyj.a;
        g6u g6uVar = o400.a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, (WriteBlocksResult) writeBlocksResult, this.$params, null);
        this.L$0 = null;
        this.label = 2;
    }
}
