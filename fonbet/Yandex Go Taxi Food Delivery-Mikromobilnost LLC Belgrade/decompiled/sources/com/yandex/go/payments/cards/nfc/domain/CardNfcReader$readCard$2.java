package com.yandex.go.payments.cards.nfc.domain;

import android.content.Intent;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import com.yandex.go.payments.cards.nfc.enums.CommandEnum;
import com.yandex.go.payments.cards.nfc.enums.EmvCardScheme;
import com.yandex.go.payments.cards.nfc.enums.SwEnum;
import defpackage.bvu0;
import defpackage.ddb1;
import defpackage.ffx;
import defpackage.jl40;
import defpackage.l4x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oqb1;
import defpackage.rg7;
import defpackage.rxn;
import defpackage.s6x0;
import defpackage.tse;
import defpackage.txn;
import defpackage.unr0;
import defpackage.wls;
import defpackage.xna1;
import defpackage.ylm0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lylm0;", "<anonymous>", "(Ltse;)Lylm0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.cards.nfc.domain.CardNfcReader$readCard$2", f = "CardNfcReader.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CardNfcReader$readCard$2 extends SuspendLambda implements wls {
    final /* synthetic */ Intent $intent;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNfcReader$readCard$2(a aVar, Intent intent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$intent = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardNfcReader$readCard$2(this.this$0, this.$intent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardNfcReader$readCard$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Tag tag;
        String[] techList;
        int length;
        Object obj2;
        int length2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        Intent intent = this.$intent;
        if (aVar.b.isEnabled() && ((jl40.l(intent.getAction(), "android.nfc.action.TECH_DISCOVERED") || jl40.l(intent.getAction(), "android.nfc.action.TAG_DISCOVERED")) && (tag = (Tag) ffx.P(intent, "android.nfc.extra.TAG", Tag.class)) != null && (techList = tag.getTechList()) != null)) {
            int length3 = techList.length;
            int i = 0;
            while (true) {
                if (i >= length3) {
                    break;
                }
                if (jl40.l(techList[i], IsoDep.class.getName())) {
                    IsoDep isoDep = IsoDep.get(tag);
                    if (isoDep != null) {
                        isoDep.connect();
                        rxn rxnVar = new rxn(isoDep);
                        CommandEnum commandEnum = CommandEnum.SELECT;
                        byte[] bArr = rxn.c;
                        int cla = commandEnum.getCla();
                        int ins = commandEnum.getIns();
                        int p1 = commandEnum.getP1();
                        int p2 = commandEnum.getP2();
                        int length4 = bArr.length;
                        int i2 = 4;
                        byte[] bArr2 = new byte[(bArr.length == 0 ? 4 : bArr.length + 5) + 1];
                        bArr2[0] = (byte) cla;
                        bArr2[1] = (byte) ins;
                        bArr2[2] = (byte) p1;
                        bArr2[3] = (byte) p2;
                        if (bArr.length == 0) {
                            length = 4;
                        } else {
                            bArr2[4] = (byte) length4;
                            System.arraycopy(bArr, 0, bArr2, 5, bArr.length);
                            length = bArr.length + 5;
                        }
                        bArr2[length] = (byte) (bArr2[length] + ((byte) 0));
                        byte[] transceive = isoDep.transceive(bArr2);
                        SwEnum swEnum = SwEnum.SW_9000;
                        if (xna1.c(transceive, swEnum)) {
                            byte[] e = oqb1.e(transceive, txn.b);
                            if (e != null) {
                                int a = ddb1.a(e);
                                CommandEnum commandEnum2 = CommandEnum.READ_RECORD;
                                int i3 = (a << 3) | 4;
                                int cla2 = commandEnum2.getCla();
                                int ins2 = commandEnum2.getIns();
                                byte[] bArr3 = new byte[0];
                                obj2 = null;
                                byte[] bArr4 = new byte[(bArr3.length == 0 ? 4 : bArr3.length + 5) + 1];
                                bArr4[0] = (byte) cla2;
                                bArr4[1] = (byte) ins2;
                                bArr4[2] = (byte) a;
                                bArr4[3] = (byte) i3;
                                if (bArr3.length == 0) {
                                    length2 = 4;
                                } else {
                                    bArr4[4] = (byte) 0;
                                    System.arraycopy(bArr3, 0, bArr4, 5, bArr3.length);
                                    length2 = bArr3.length + 5;
                                }
                                bArr4[length2] = (byte) (bArr4[length2] + ((byte) 0));
                                byte[] transceive2 = isoDep.transceive(bArr4);
                                if (xna1.c(transceive2, SwEnum.SW_6C)) {
                                    byte b = transceive2[transceive2.length - 1];
                                    int cla3 = commandEnum2.getCla();
                                    int ins3 = commandEnum2.getIns();
                                    byte[] bArr5 = new byte[0];
                                    byte[] bArr6 = new byte[(bArr5.length == 0 ? 4 : bArr5.length + 5) + 1];
                                    bArr6[0] = (byte) cla3;
                                    bArr6[1] = (byte) ins3;
                                    bArr6[2] = (byte) a;
                                    bArr6[3] = (byte) i3;
                                    if (bArr5.length != 0) {
                                        bArr6[4] = (byte) 0;
                                        System.arraycopy(bArr5, 0, bArr6, 5, bArr5.length);
                                        i2 = 5 + bArr5.length;
                                    }
                                    bArr6[i2] = (byte) (bArr6[i2] + b);
                                    transceive = isoDep.transceive(bArr6);
                                } else {
                                    transceive = transceive2;
                                }
                            } else {
                                obj2 = null;
                            }
                            if (xna1.c(transceive, swEnum)) {
                                ArrayList arrayList = new ArrayList();
                                Iterator it = oqb1.c(transceive, txn.c, txn.t).iterator();
                                while (it.hasNext()) {
                                    l4x0 l4x0Var = (l4x0) it.next();
                                    s6x0 s6x0Var = l4x0Var.a;
                                    byte[] bArr7 = l4x0Var.b;
                                    if (!s6x0Var.equals(txn.t) || arrayList.isEmpty()) {
                                        arrayList.add(bArr7);
                                    } else {
                                        byte[] bArr8 = (byte[]) unr0.k(1, arrayList);
                                        byte[] bArr9 = new byte[bArr8.length + bArr7.length];
                                        System.arraycopy(bArr8, 0, bArr9, 0, bArr8.length);
                                        System.arraycopy(bArr7, 0, bArr9, bArr8.length, bArr7.length);
                                        arrayList.add(bArr9);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        if (rxnVar.a((byte[]) it2.next())) {
                                            break;
                                        }
                                    }
                                }
                            }
                        } else {
                            obj2 = null;
                        }
                        Iterator it3 = EmvCardScheme.b().iterator();
                        loop3: while (it3.hasNext()) {
                            for (byte[] bArr10 : ((EmvCardScheme) it3.next()).getAidsByte()) {
                                if (bArr10 != null && rxnVar.a(bArr10)) {
                                    break loop3;
                                }
                            }
                        }
                        rg7 rg7Var = rxnVar.b;
                        return rg7Var.a.length() != 0 ? new ylm0(rg7Var.a, bvu0.l(10, rg7Var.b), bvu0.l(10, rg7Var.c)) : obj2;
                    }
                } else {
                    i++;
                }
            }
        }
        return null;
    }
}
