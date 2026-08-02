package com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.transfer.version2.api.TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType;
import com.ybsdk.feature.transfer.version2.api.TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType;
import com.ybsdk.feature.transfer.version2.api.entities.MiddleNameEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisiteFieldValidatorEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisiteFieldValidatorRegexEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesHcsTransferFieldsEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesHcsTransferPayloadEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesLegalTransferFieldsEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesLegalTransferPayloadEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesPersonTransferFieldsEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesPersonTransferPayloadEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.main.domain.entities.RequisitesTransferPayloadEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.RequisiteTarget;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteScreenParams;
import defpackage.ar01;
import defpackage.byy;
import defpackage.cr01;
import defpackage.dzh0;
import defpackage.eyy;
import defpackage.hfb1;
import defpackage.j73;
import defpackage.kwg0;
import defpackage.l9s;
import defpackage.mq01;
import defpackage.nq01;
import defpackage.ny61;
import defpackage.oo01;
import defpackage.oq01;
import defpackage.po01;
import defpackage.pq01;
import defpackage.qo01;
import defpackage.qq01;
import defpackage.rq01;
import defpackage.rr51;
import defpackage.sq01;
import defpackage.tq01;
import defpackage.unr0;
import defpackage.uqj0;
import defpackage.vqj0;
import defpackage.w511;
import defpackage.wqj0;
import defpackage.xqj0;
import defpackage.ynb1;
import defpackage.zq01;
import defpackage.zxy;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public abstract class a {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(TransferRequisiteScreenParams transferRequisiteScreenParams, qo01 qo01Var, ContinuationImpl continuationImpl) {
        TransferRequisiteStateKt$buildInitialState$1 transferRequisiteStateKt$buildInitialState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object f;
        TransferRequisiteScreenParams transferRequisiteScreenParams2;
        sq01 sq01Var;
        Object e;
        sq01 sq01Var2;
        qq01 qq01Var;
        if (continuationImpl instanceof TransferRequisiteStateKt$buildInitialState$1) {
            transferRequisiteStateKt$buildInitialState$1 = (TransferRequisiteStateKt$buildInitialState$1) continuationImpl;
            int i2 = transferRequisiteStateKt$buildInitialState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferRequisiteStateKt$buildInitialState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferRequisiteStateKt$buildInitialState$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferRequisiteStateKt$buildInitialState$1.label;
                if (i != 0) {
                    b.b(obj);
                    transferRequisiteStateKt$buildInitialState$1.L$0 = transferRequisiteScreenParams;
                    transferRequisiteStateKt$buildInitialState$1.L$1 = qo01Var;
                    transferRequisiteStateKt$buildInitialState$1.label = 1;
                    obj = g(transferRequisiteScreenParams, qo01Var, transferRequisiteStateKt$buildInitialState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qq01Var = (qq01) transferRequisiteStateKt$buildInitialState$1.L$1;
                            sq01Var2 = (sq01) transferRequisiteStateKt$buildInitialState$1.L$0;
                            b.b(obj);
                            return new zq01(j73.A(new tq01[]{sq01Var2, qq01Var, (oq01) obj}), 12);
                        }
                        sq01Var = (sq01) transferRequisiteStateKt$buildInitialState$1.L$2;
                        qo01Var = (qo01) transferRequisiteStateKt$buildInitialState$1.L$1;
                        transferRequisiteScreenParams2 = (TransferRequisiteScreenParams) transferRequisiteStateKt$buildInitialState$1.L$0;
                        b.b(obj);
                        qq01 qq01Var2 = (qq01) obj;
                        transferRequisiteStateKt$buildInitialState$1.L$0 = sq01Var;
                        transferRequisiteStateKt$buildInitialState$1.L$1 = qq01Var2;
                        transferRequisiteStateKt$buildInitialState$1.L$2 = null;
                        transferRequisiteStateKt$buildInitialState$1.label = 3;
                        e = e(transferRequisiteScreenParams2, qo01Var, transferRequisiteStateKt$buildInitialState$1);
                        if (e != coroutineSingletons) {
                            sq01Var2 = sq01Var;
                            qq01Var = qq01Var2;
                            obj = e;
                            return new zq01(j73.A(new tq01[]{sq01Var2, qq01Var, (oq01) obj}), 12);
                        }
                        return coroutineSingletons;
                    }
                    qo01Var = (qo01) transferRequisiteStateKt$buildInitialState$1.L$1;
                    transferRequisiteScreenParams = (TransferRequisiteScreenParams) transferRequisiteStateKt$buildInitialState$1.L$0;
                    b.b(obj);
                }
                sq01 sq01Var3 = (sq01) obj;
                transferRequisiteStateKt$buildInitialState$1.L$0 = transferRequisiteScreenParams;
                transferRequisiteStateKt$buildInitialState$1.L$1 = qo01Var;
                transferRequisiteStateKt$buildInitialState$1.L$2 = sq01Var3;
                transferRequisiteStateKt$buildInitialState$1.label = 2;
                f = f(transferRequisiteScreenParams, qo01Var, transferRequisiteStateKt$buildInitialState$1);
                if (f != coroutineSingletons) {
                    transferRequisiteScreenParams2 = transferRequisiteScreenParams;
                    sq01Var = sq01Var3;
                    obj = f;
                    qq01 qq01Var22 = (qq01) obj;
                    transferRequisiteStateKt$buildInitialState$1.L$0 = sq01Var;
                    transferRequisiteStateKt$buildInitialState$1.L$1 = qq01Var22;
                    transferRequisiteStateKt$buildInitialState$1.L$2 = null;
                    transferRequisiteStateKt$buildInitialState$1.label = 3;
                    e = e(transferRequisiteScreenParams2, qo01Var, transferRequisiteStateKt$buildInitialState$1);
                    if (e != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        transferRequisiteStateKt$buildInitialState$1 = new TransferRequisiteStateKt$buildInitialState$1(continuationImpl);
        Object obj2 = transferRequisiteStateKt$buildInitialState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferRequisiteStateKt$buildInitialState$1.label;
        if (i != 0) {
        }
        sq01 sq01Var32 = (sq01) obj2;
        transferRequisiteStateKt$buildInitialState$1.L$0 = transferRequisiteScreenParams;
        transferRequisiteStateKt$buildInitialState$1.L$1 = qo01Var;
        transferRequisiteStateKt$buildInitialState$1.L$2 = sq01Var32;
        transferRequisiteStateKt$buildInitialState$1.label = 2;
        f = f(transferRequisiteScreenParams, qo01Var, transferRequisiteStateKt$buildInitialState$1);
        if (f != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x029d, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b4, code lost:
    
        if (r15 != null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02cc, code lost:
    
        if (r15 != null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x009f, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x00f0, code lost:
    
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0143, code lost:
    
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0299, code lost:
    
        if (r15 != null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x029b, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x021e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final vqj0 b(mq01 mq01Var, TransferRequisiteScreenParams transferRequisiteScreenParams, qo01 qo01Var) {
        int i;
        Text text;
        boolean z;
        String accountNumber;
        MiddleNameEntity middleName;
        hfb1 hfb1Var;
        l9s l9sVar;
        l9s l9sVar2;
        RequisiteFieldValidatorEntity d;
        List<RequisiteFieldValidatorRegexEntity> list;
        List<RequisiteFieldValidatorRegexEntity> list2;
        RequisiteFieldValidatorEntity d2;
        TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType transferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType;
        Iterator it;
        Object obj;
        oo01 oo01Var;
        Object failure;
        Object obj2;
        Object obj3;
        po01 po01Var;
        vqj0 vqj0Var;
        ItemType itemType;
        int[] iArr;
        int i2;
        int i3;
        DivDataDto divDataDto;
        DivDataDto divDataDto2;
        int i4;
        DivDataDto divDataDto3;
        List<RequisiteFieldValidatorRegexEntity> input;
        RequisiteTarget target;
        ItemType itemType2 = mq01Var.getItemType();
        int[] iArr2 = ar01.a;
        Object obj4 = null;
        switch (iArr2[itemType2.ordinal()]) {
            case 1:
                i = dzh0.ybsdk_transfer_requisite_account_number_title;
                text = new Text.Resource(i);
                TransferRequisiteResultEntity result = transferRequisiteScreenParams.getResult();
                Text c = c(mq01Var, (result != null || (target = result.getTarget()) == null) ? null : target.getTitle());
                TransferRequisiteResultEntity result2 = transferRequisiteScreenParams.getResult();
                z = mq01Var instanceof TransferRequisiteFormItemType$LegalFormItemType;
                String str = "";
                if (!z) {
                    if (!(mq01Var instanceof TransferRequisiteFormItemType$PersonFormItemType)) {
                        if (!(mq01Var instanceof TransferRequisiteFormItemType$HcsFormItemType)) {
                            w511.b();
                            break;
                        } else {
                            TransferRequisiteFormItemType$HcsFormItemType transferRequisiteFormItemType$HcsFormItemType = (TransferRequisiteFormItemType$HcsFormItemType) mq01Var;
                            TransferRequisiteResultEntity.Hcs hcs = result2 instanceof TransferRequisiteResultEntity.Hcs ? (TransferRequisiteResultEntity.Hcs) result2 : null;
                            switch (ar01.d[transferRequisiteFormItemType$HcsFormItemType.ordinal()]) {
                                case 1:
                                case 8:
                                    accountNumber = null;
                                    break;
                                case 2:
                                    if (hcs != null) {
                                        accountNumber = hcs.getAccountNumber();
                                        break;
                                    }
                                    accountNumber = null;
                                    break;
                                case 3:
                                    if (hcs != null) {
                                        accountNumber = hcs.getBic();
                                        break;
                                    }
                                    accountNumber = null;
                                    break;
                                case 4:
                                    if (hcs != null) {
                                        accountNumber = hcs.getInn();
                                        break;
                                    }
                                    accountNumber = null;
                                    break;
                                case 5:
                                    if (hcs != null) {
                                        accountNumber = hcs.getBeneficiaryName();
                                        break;
                                    }
                                    accountNumber = null;
                                    break;
                                case 6:
                                    if (hcs != null) {
                                        accountNumber = hcs.getHcsPersonalAccount();
                                        break;
                                    }
                                    accountNumber = null;
                                    break;
                                case 7:
                                    if (hcs != null) {
                                        accountNumber = hcs.getPaymentPeriod();
                                        break;
                                    }
                                    accountNumber = null;
                                    break;
                                case 9:
                                    if (hcs != null) {
                                        accountNumber = hcs.getPaymentPurpose();
                                        break;
                                    }
                                    accountNumber = null;
                                    break;
                                default:
                                    w511.b();
                                    break;
                            }
                        }
                    } else {
                        TransferRequisiteFormItemType$PersonFormItemType transferRequisiteFormItemType$PersonFormItemType = (TransferRequisiteFormItemType$PersonFormItemType) mq01Var;
                        TransferRequisiteResultEntity.Person person = result2 instanceof TransferRequisiteResultEntity.Person ? (TransferRequisiteResultEntity.Person) result2 : null;
                        switch (ar01.c[transferRequisiteFormItemType$PersonFormItemType.ordinal()]) {
                            case 1:
                            case 7:
                                accountNumber = null;
                                break;
                            case 2:
                                if (person != null) {
                                    accountNumber = person.getAccountNumber();
                                    break;
                                }
                                accountNumber = null;
                                break;
                            case 3:
                                if (person != null) {
                                    accountNumber = person.getBic();
                                    break;
                                }
                                accountNumber = null;
                                break;
                            case 4:
                                if (person != null) {
                                    accountNumber = person.getLastName();
                                    break;
                                }
                                accountNumber = null;
                                break;
                            case 5:
                                if (person != null) {
                                    accountNumber = person.getFirstName();
                                    break;
                                }
                                accountNumber = null;
                                break;
                            case 6:
                                if (person != null && (middleName = person.getMiddleName()) != null) {
                                    accountNumber = middleName.getName();
                                    break;
                                }
                                accountNumber = null;
                                break;
                            case 8:
                                if (person != null) {
                                    accountNumber = person.getPaymentPurpose();
                                    break;
                                }
                                accountNumber = null;
                                break;
                            default:
                                w511.b();
                                break;
                        }
                    }
                } else {
                    TransferRequisiteFormItemType$LegalFormItemType transferRequisiteFormItemType$LegalFormItemType = (TransferRequisiteFormItemType$LegalFormItemType) mq01Var;
                    TransferRequisiteResultEntity.Legal legal = result2 instanceof TransferRequisiteResultEntity.Legal ? (TransferRequisiteResultEntity.Legal) result2 : null;
                    switch (ar01.b[transferRequisiteFormItemType$LegalFormItemType.ordinal()]) {
                        case 1:
                        case 6:
                            accountNumber = null;
                            break;
                        case 2:
                            if (legal != null) {
                                accountNumber = legal.getAccountNumber();
                                break;
                            }
                            accountNumber = null;
                            break;
                        case 3:
                            if (legal != null) {
                                accountNumber = legal.getBic();
                                break;
                            }
                            accountNumber = null;
                            break;
                        case 4:
                            if (legal != null) {
                                accountNumber = legal.getInn();
                                break;
                            }
                            accountNumber = null;
                            break;
                        case 5:
                            if (legal != null) {
                                accountNumber = legal.getBeneficiaryName();
                                break;
                            }
                            accountNumber = null;
                            break;
                        case 7:
                            if (legal != null) {
                                accountNumber = legal.getPaymentPurpose();
                                break;
                            }
                            accountNumber = null;
                            break;
                        default:
                            w511.b();
                            break;
                    }
                }
                Text.Empty empty = Text.Empty.INSTANCE;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        hfb1Var = byy.a;
                        break;
                    case 4:
                        hfb1Var = zxy.a;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 11:
                    case 12:
                        hfb1Var = eyy.d;
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 13:
                        hfb1Var = eyy.c;
                        break;
                    default:
                        w511.b();
                        break;
                }
                hfb1 hfb1Var2 = hfb1Var;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                    case 1:
                        l9sVar = cr01.b;
                        l9sVar2 = l9sVar;
                        d = d(mq01Var, transferRequisiteScreenParams.getRequisitePayload());
                        list = EmptyList.a;
                        if (d != null || (input = d.getInput()) == null) {
                            list2 = list;
                        } else {
                            list = input;
                            list2 = list;
                        }
                        d2 = d(mq01Var, transferRequisiteScreenParams.getRequisitePayload());
                        if (d2 != null || (r11 = d2.getUnfocus()) == null) {
                            List<RequisiteFieldValidatorRegexEntity> list3 = list2;
                        }
                        if (!z) {
                            if (!(mq01Var instanceof TransferRequisiteFormItemType$PersonFormItemType)) {
                                if (!(mq01Var instanceof TransferRequisiteFormItemType$HcsFormItemType)) {
                                    w511.b();
                                    break;
                                } else {
                                    transferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType = TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType.HCS;
                                }
                            } else {
                                transferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType = TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType.PERSON;
                            }
                        } else {
                            transferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType = TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType.LEGAL;
                        }
                        it = qo01Var.a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (((oo01) obj).a == transferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadEntity$FormEntityType) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        oo01Var = (oo01) obj;
                        int i5 = 160;
                        switch (ar01.a[mq01Var.getItemType().ordinal()]) {
                            case 1:
                                i5 = 24;
                                break;
                            case 2:
                                i5 = 9;
                                break;
                            case 3:
                                i5 = 12;
                                break;
                            case 4:
                                i5 = 7;
                                break;
                            case 5:
                            case 8:
                            case 9:
                            case 10:
                                break;
                            case 6:
                                if (!z) {
                                    if (!(mq01Var instanceof TransferRequisiteFormItemType$HcsFormItemType)) {
                                        if (!(mq01Var instanceof TransferRequisiteFormItemType$PersonFormItemType)) {
                                            w511.b();
                                            break;
                                        }
                                    } else {
                                        i5 = HProv.PP_LICENSE;
                                        break;
                                    }
                                } else {
                                    i5 = 190;
                                    break;
                                }
                                break;
                            case 7:
                            case 11:
                            case 12:
                                i5 = 0;
                                break;
                            case 13:
                                i5 = 30;
                                break;
                            default:
                                w511.b();
                                break;
                        }
                        if (oo01Var != null) {
                            try {
                                failure = TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType.valueOf(mq01Var.getItemType().name());
                            } catch (Throwable th) {
                                failure = new Result.Failure(th);
                            }
                            if (failure instanceof Result.Failure) {
                                failure = null;
                            }
                            TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType transferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType = (TransferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType) failure;
                            if (transferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType == null) {
                                po01Var = null;
                                vqj0Var = 0;
                            } else {
                                Iterator it2 = oo01Var.b.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        obj2 = obj4;
                                        if (((po01) obj3).a != transferRemoteConfig$TransfersRequisitesFormPayloadsEntity$FormPayloadItemEntity$FormPayloadItemEntityType) {
                                            obj4 = obj2;
                                        }
                                    } else {
                                        obj2 = obj4;
                                        obj3 = obj2;
                                    }
                                }
                                po01Var = (po01) obj3;
                                vqj0Var = obj2;
                            }
                            if (po01Var != null) {
                                i5 = po01Var.b;
                            }
                        } else {
                            vqj0Var = 0;
                        }
                        itemType = mq01Var.getItemType();
                        iArr = ar01.a;
                        switch (iArr[itemType.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                                i2 = kwg0.ybsdk_requisite_with_hint_min_height;
                                i3 = i2;
                                if (!z) {
                                    if (!(mq01Var instanceof TransferRequisiteFormItemType$PersonFormItemType)) {
                                        if (!(mq01Var instanceof TransferRequisiteFormItemType$HcsFormItemType)) {
                                            w511.b();
                                            break;
                                        } else {
                                            RequisitesHcsTransferPayloadEntity hcsValidation = transferRequisiteScreenParams.getRequisitePayload().getHcsValidation();
                                            if (hcsValidation == null) {
                                                divDataDto = vqj0Var;
                                                break;
                                            } else {
                                                divDataDto = hcsValidation.getDivkitWidget();
                                                break;
                                            }
                                        }
                                    } else {
                                        RequisitesPersonTransferPayloadEntity personValidation = transferRequisiteScreenParams.getRequisitePayload().getPersonValidation();
                                        if (personValidation == null) {
                                            divDataDto2 = vqj0Var;
                                            break;
                                        } else {
                                            divDataDto2 = personValidation.getDivkitWidget();
                                            break;
                                        }
                                    }
                                } else {
                                    RequisitesLegalTransferPayloadEntity legalValidation = transferRequisiteScreenParams.getRequisitePayload().getLegalValidation();
                                    if (legalValidation == null) {
                                        divDataDto3 = vqj0Var;
                                        break;
                                    } else {
                                        divDataDto3 = legalValidation.getDivkitWidget();
                                        break;
                                    }
                                }
                                if (z) {
                                    switch (ar01.b[((TransferRequisiteFormItemType$LegalFormItemType) mq01Var).ordinal()]) {
                                        case 1:
                                            i4 = 0;
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            i4++;
                                            break;
                                        case 4:
                                            i4 += 2;
                                            break;
                                        case 5:
                                            i4 += 3;
                                            break;
                                        case 6:
                                            i4 += 4;
                                            break;
                                        case 7:
                                            i4 += 5;
                                            break;
                                        default:
                                            w511.b();
                                            break;
                                    }
                                    break;
                                } else {
                                    if (!(mq01Var instanceof TransferRequisiteFormItemType$PersonFormItemType)) {
                                        if (!(mq01Var instanceof TransferRequisiteFormItemType$HcsFormItemType)) {
                                            w511.b();
                                            break;
                                        } else {
                                            switch (ar01.d[((TransferRequisiteFormItemType$HcsFormItemType) mq01Var).ordinal()]) {
                                                case 1:
                                                    break;
                                                case 2:
                                                    break;
                                                case 3:
                                                    break;
                                                case 4:
                                                    break;
                                                case 5:
                                                    break;
                                                case 6:
                                                    break;
                                                case 7:
                                                    break;
                                                case 8:
                                                    break;
                                                case 9:
                                                    i4 += 7;
                                                    break;
                                                default:
                                                    w511.b();
                                                    break;
                                            }
                                        }
                                    } else {
                                        switch (ar01.c[((TransferRequisiteFormItemType$PersonFormItemType) mq01Var).ordinal()]) {
                                            case 1:
                                                break;
                                            case 2:
                                                break;
                                            case 3:
                                                break;
                                            case 4:
                                                break;
                                            case 5:
                                                break;
                                            case 6:
                                                break;
                                            case 7:
                                                break;
                                            case 8:
                                                i4 += 6;
                                                break;
                                            default:
                                                w511.b();
                                                break;
                                        }
                                    }
                                }
                            case 4:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 13:
                                i2 = kwg0.ybsdk_requisite_min_height;
                                i3 = i2;
                                if (!z) {
                                }
                                if (z) {
                                }
                                break;
                            case 7:
                            case 11:
                            case 12:
                                i3 = 0;
                                if (!z) {
                                }
                                if (z) {
                                }
                                break;
                            default:
                                w511.b();
                                break;
                        }
                        break;
                    case 2:
                        l9sVar = cr01.c;
                        l9sVar2 = l9sVar;
                        d = d(mq01Var, transferRequisiteScreenParams.getRequisitePayload());
                        list = EmptyList.a;
                        if (d != null) {
                            break;
                        }
                        list2 = list;
                        d2 = d(mq01Var, transferRequisiteScreenParams.getRequisitePayload());
                        if (d2 != null) {
                            break;
                        }
                        List<RequisiteFieldValidatorRegexEntity> list32 = list2;
                        if (!z) {
                        }
                        it = qo01Var.a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        oo01Var = (oo01) obj;
                        int i52 = 160;
                        switch (ar01.a[mq01Var.getItemType().ordinal()]) {
                        }
                        if (oo01Var != null) {
                        }
                        itemType = mq01Var.getItemType();
                        iArr = ar01.a;
                        switch (iArr[itemType.ordinal()]) {
                        }
                    case 3:
                        l9sVar = cr01.d;
                        l9sVar2 = l9sVar;
                        d = d(mq01Var, transferRequisiteScreenParams.getRequisitePayload());
                        list = EmptyList.a;
                        if (d != null) {
                        }
                        list2 = list;
                        d2 = d(mq01Var, transferRequisiteScreenParams.getRequisitePayload());
                        if (d2 != null) {
                        }
                        List<RequisiteFieldValidatorRegexEntity> list322 = list2;
                        if (!z) {
                        }
                        it = qo01Var.a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        oo01Var = (oo01) obj;
                        int i522 = 160;
                        switch (ar01.a[mq01Var.getItemType().ordinal()]) {
                        }
                        if (oo01Var != null) {
                        }
                        itemType = mq01Var.getItemType();
                        iArr = ar01.a;
                        switch (iArr[itemType.ordinal()]) {
                        }
                    case 4:
                        l9sVar = cr01.e;
                        l9sVar2 = l9sVar;
                        d = d(mq01Var, transferRequisiteScreenParams.getRequisitePayload());
                        list = EmptyList.a;
                        if (d != null) {
                        }
                        list2 = list;
                        d2 = d(mq01Var, transferRequisiteScreenParams.getRequisitePayload());
                        if (d2 != null) {
                        }
                        List<RequisiteFieldValidatorRegexEntity> list3222 = list2;
                        if (!z) {
                        }
                        it = qo01Var.a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        oo01Var = (oo01) obj;
                        int i5222 = 160;
                        switch (ar01.a[mq01Var.getItemType().ordinal()]) {
                        }
                        if (oo01Var != null) {
                        }
                        itemType = mq01Var.getItemType();
                        iArr = ar01.a;
                        switch (iArr[itemType.ordinal()]) {
                        }
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        l9sVar2 = null;
                        d = d(mq01Var, transferRequisiteScreenParams.getRequisitePayload());
                        list = EmptyList.a;
                        if (d != null) {
                        }
                        list2 = list;
                        d2 = d(mq01Var, transferRequisiteScreenParams.getRequisitePayload());
                        if (d2 != null) {
                        }
                        List<RequisiteFieldValidatorRegexEntity> list32222 = list2;
                        if (!z) {
                        }
                        it = qo01Var.a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        oo01Var = (oo01) obj;
                        int i52222 = 160;
                        switch (ar01.a[mq01Var.getItemType().ordinal()]) {
                        }
                        if (oo01Var != null) {
                        }
                        itemType = mq01Var.getItemType();
                        iArr = ar01.a;
                        switch (iArr[itemType.ordinal()]) {
                        }
                    default:
                        w511.b();
                        break;
                }
            case 2:
                i = dzh0.ybsdk_transfer_requisite_bic_title;
                text = new Text.Resource(i);
                TransferRequisiteResultEntity result3 = transferRequisiteScreenParams.getResult();
                if (result3 != null) {
                    break;
                }
                Text c2 = c(mq01Var, (result3 != null || (target = result3.getTarget()) == null) ? null : target.getTitle());
                TransferRequisiteResultEntity result22 = transferRequisiteScreenParams.getResult();
                z = mq01Var instanceof TransferRequisiteFormItemType$LegalFormItemType;
                String str2 = "";
                if (!z) {
                }
                Text.Empty empty2 = Text.Empty.INSTANCE;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                }
                hfb1 hfb1Var22 = hfb1Var;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                }
            case 3:
                i = dzh0.ybsdk_transfer_requisite_legal_inn_title;
                text = new Text.Resource(i);
                TransferRequisiteResultEntity result32 = transferRequisiteScreenParams.getResult();
                Text c22 = c(mq01Var, (result32 != null || (target = result32.getTarget()) == null) ? null : target.getTitle());
                TransferRequisiteResultEntity result222 = transferRequisiteScreenParams.getResult();
                z = mq01Var instanceof TransferRequisiteFormItemType$LegalFormItemType;
                String str22 = "";
                if (!z) {
                }
                Text.Empty empty22 = Text.Empty.INSTANCE;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                }
                hfb1 hfb1Var222 = hfb1Var;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                }
            case 4:
                i = dzh0.ybsdk_transfer_requisite_hcs_payment_period_title;
                text = new Text.Resource(i);
                TransferRequisiteResultEntity result322 = transferRequisiteScreenParams.getResult();
                Text c222 = c(mq01Var, (result322 != null || (target = result322.getTarget()) == null) ? null : target.getTitle());
                TransferRequisiteResultEntity result2222 = transferRequisiteScreenParams.getResult();
                z = mq01Var instanceof TransferRequisiteFormItemType$LegalFormItemType;
                String str222 = "";
                if (!z) {
                }
                Text.Empty empty222 = Text.Empty.INSTANCE;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                }
                hfb1 hfb1Var2222 = hfb1Var;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                }
            case 5:
                i = dzh0.ybsdk_transfer_requisite_legal_recipient_name_title;
                text = new Text.Resource(i);
                TransferRequisiteResultEntity result3222 = transferRequisiteScreenParams.getResult();
                Text c2222 = c(mq01Var, (result3222 != null || (target = result3222.getTarget()) == null) ? null : target.getTitle());
                TransferRequisiteResultEntity result22222 = transferRequisiteScreenParams.getResult();
                z = mq01Var instanceof TransferRequisiteFormItemType$LegalFormItemType;
                String str2222 = "";
                if (!z) {
                }
                Text.Empty empty2222 = Text.Empty.INSTANCE;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                }
                hfb1 hfb1Var22222 = hfb1Var;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                }
            case 6:
                i = dzh0.ybsdk_transfer_requisite_payment_purpose_title;
                text = new Text.Resource(i);
                TransferRequisiteResultEntity result32222 = transferRequisiteScreenParams.getResult();
                Text c22222 = c(mq01Var, (result32222 != null || (target = result32222.getTarget()) == null) ? null : target.getTitle());
                TransferRequisiteResultEntity result222222 = transferRequisiteScreenParams.getResult();
                z = mq01Var instanceof TransferRequisiteFormItemType$LegalFormItemType;
                String str22222 = "";
                if (!z) {
                }
                Text.Empty empty22222 = Text.Empty.INSTANCE;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                }
                hfb1 hfb1Var222222 = hfb1Var;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                }
            case 7:
            case 11:
            case 12:
                text = Text.Empty.INSTANCE;
                TransferRequisiteResultEntity result322222 = transferRequisiteScreenParams.getResult();
                Text c222222 = c(mq01Var, (result322222 != null || (target = result322222.getTarget()) == null) ? null : target.getTitle());
                TransferRequisiteResultEntity result2222222 = transferRequisiteScreenParams.getResult();
                z = mq01Var instanceof TransferRequisiteFormItemType$LegalFormItemType;
                String str222222 = "";
                if (!z) {
                }
                Text.Empty empty222222 = Text.Empty.INSTANCE;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                }
                hfb1 hfb1Var2222222 = hfb1Var;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                }
            case 8:
                i = dzh0.ybsdk_transfer_requisite_last_name_title;
                text = new Text.Resource(i);
                TransferRequisiteResultEntity result3222222 = transferRequisiteScreenParams.getResult();
                Text c2222222 = c(mq01Var, (result3222222 != null || (target = result3222222.getTarget()) == null) ? null : target.getTitle());
                TransferRequisiteResultEntity result22222222 = transferRequisiteScreenParams.getResult();
                z = mq01Var instanceof TransferRequisiteFormItemType$LegalFormItemType;
                String str2222222 = "";
                if (!z) {
                }
                Text.Empty empty2222222 = Text.Empty.INSTANCE;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                }
                hfb1 hfb1Var22222222 = hfb1Var;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                }
            case 9:
                i = dzh0.ybsdk_uprid_first_name_title;
                text = new Text.Resource(i);
                TransferRequisiteResultEntity result32222222 = transferRequisiteScreenParams.getResult();
                Text c22222222 = c(mq01Var, (result32222222 != null || (target = result32222222.getTarget()) == null) ? null : target.getTitle());
                TransferRequisiteResultEntity result222222222 = transferRequisiteScreenParams.getResult();
                z = mq01Var instanceof TransferRequisiteFormItemType$LegalFormItemType;
                String str22222222 = "";
                if (!z) {
                }
                Text.Empty empty22222222 = Text.Empty.INSTANCE;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                }
                hfb1 hfb1Var222222222 = hfb1Var;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                }
            case 10:
                i = dzh0.ybsdk_transfer_requisite_middle_name_title;
                text = new Text.Resource(i);
                TransferRequisiteResultEntity result322222222 = transferRequisiteScreenParams.getResult();
                Text c222222222 = c(mq01Var, (result322222222 != null || (target = result322222222.getTarget()) == null) ? null : target.getTitle());
                TransferRequisiteResultEntity result2222222222 = transferRequisiteScreenParams.getResult();
                z = mq01Var instanceof TransferRequisiteFormItemType$LegalFormItemType;
                String str222222222 = "";
                if (!z) {
                }
                Text.Empty empty222222222 = Text.Empty.INSTANCE;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                }
                hfb1 hfb1Var2222222222 = hfb1Var;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                }
            case 13:
                i = dzh0.ybsdk_transfer_requisite_hcs_personal_account_title;
                text = new Text.Resource(i);
                TransferRequisiteResultEntity result3222222222 = transferRequisiteScreenParams.getResult();
                Text c2222222222 = c(mq01Var, (result3222222222 != null || (target = result3222222222.getTarget()) == null) ? null : target.getTitle());
                TransferRequisiteResultEntity result22222222222 = transferRequisiteScreenParams.getResult();
                z = mq01Var instanceof TransferRequisiteFormItemType$LegalFormItemType;
                String str2222222222 = "";
                if (!z) {
                }
                Text.Empty empty2222222222 = Text.Empty.INSTANCE;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                }
                hfb1 hfb1Var22222222222 = hfb1Var;
                switch (iArr2[mq01Var.getItemType().ordinal()]) {
                }
            default:
                w511.b();
                break;
        }
        return null;
    }

    public static final Text c(mq01 mq01Var, String str) {
        int i;
        switch (ar01.a[mq01Var.getItemType().ordinal()]) {
            case 1:
                if ((mq01Var instanceof TransferRequisiteFormItemType$LegalFormItemType) || (mq01Var instanceof TransferRequisiteFormItemType$HcsFormItemType)) {
                    i = dzh0.ybsdk_transfer_requisite_legal_account_number_hint;
                } else {
                    if (!(mq01Var instanceof TransferRequisiteFormItemType$PersonFormItemType)) {
                        w511.b();
                        return null;
                    }
                    i = dzh0.ybsdk_transfer_requisite_account_number_hint;
                }
                return new Text.Resource(i);
            case 2:
                return str != null ? new Text.Constant(str) : new Text.Resource(dzh0.ybsdk_transfer_requisite_bic_hint);
            case 3:
                return new Text.Resource(dzh0.ybsdk_transfer_requisite_legal_inn_hint);
            case 4:
                return new Text.Resource(dzh0.ybsdk_transfer_requisite_hcs_payment_period_hint);
            default:
                w511.b();
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return null;
        }
    }

    public static final RequisiteFieldValidatorEntity d(mq01 mq01Var, RequisitesTransferPayloadEntity requisitesTransferPayloadEntity) {
        RequisitesHcsTransferFieldsEntity validation;
        RequisitesPersonTransferFieldsEntity validation2;
        RequisitesLegalTransferFieldsEntity validation3;
        if (mq01Var instanceof TransferRequisiteFormItemType$LegalFormItemType) {
            TransferRequisiteFormItemType$LegalFormItemType transferRequisiteFormItemType$LegalFormItemType = (TransferRequisiteFormItemType$LegalFormItemType) mq01Var;
            RequisitesLegalTransferPayloadEntity legalValidation = requisitesTransferPayloadEntity.getLegalValidation();
            if (legalValidation != null && (validation3 = legalValidation.getValidation()) != null) {
                switch (ar01.b[transferRequisiteFormItemType$LegalFormItemType.ordinal()]) {
                    case 1:
                    case 6:
                        break;
                    case 2:
                        return validation3.getAccountNumber();
                    case 3:
                        return validation3.getBic();
                    case 4:
                        return validation3.getInn();
                    case 5:
                        return validation3.getBeneficiaryName();
                    case 7:
                        return validation3.getPaymentPurpose();
                    default:
                        w511.b();
                        return null;
                }
            }
            return null;
        }
        if (mq01Var instanceof TransferRequisiteFormItemType$PersonFormItemType) {
            TransferRequisiteFormItemType$PersonFormItemType transferRequisiteFormItemType$PersonFormItemType = (TransferRequisiteFormItemType$PersonFormItemType) mq01Var;
            RequisitesPersonTransferPayloadEntity personValidation = requisitesTransferPayloadEntity.getPersonValidation();
            if (personValidation != null && (validation2 = personValidation.getValidation()) != null) {
                switch (ar01.c[transferRequisiteFormItemType$PersonFormItemType.ordinal()]) {
                    case 1:
                    case 7:
                        break;
                    case 2:
                        return validation2.getAccountNumber();
                    case 3:
                        return validation2.getBic();
                    case 4:
                        return validation2.getLastName();
                    case 5:
                        return validation2.getFirstName();
                    case 6:
                        return validation2.getMiddleName();
                    case 8:
                        return validation2.getPaymentPurpose();
                    default:
                        w511.b();
                        return null;
                }
            }
            return null;
        }
        if (!(mq01Var instanceof TransferRequisiteFormItemType$HcsFormItemType)) {
            w511.b();
            return null;
        }
        TransferRequisiteFormItemType$HcsFormItemType transferRequisiteFormItemType$HcsFormItemType = (TransferRequisiteFormItemType$HcsFormItemType) mq01Var;
        RequisitesHcsTransferPayloadEntity hcsValidation = requisitesTransferPayloadEntity.getHcsValidation();
        if (hcsValidation != null && (validation = hcsValidation.getValidation()) != null) {
            switch (ar01.d[transferRequisiteFormItemType$HcsFormItemType.ordinal()]) {
                case 1:
                case 8:
                    break;
                case 2:
                    return validation.getAccountNumber();
                case 3:
                    return validation.getBic();
                case 4:
                    return validation.getInn();
                case 5:
                    return validation.getLegalName();
                case 6:
                    return validation.getHcsPersonalAccount();
                case 7:
                    return validation.getPaymentPeriod();
                case 9:
                    return validation.getPaymentPurpose();
                default:
                    w511.b();
                    return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(TransferRequisiteScreenParams transferRequisiteScreenParams, qo01 qo01Var, ContinuationImpl continuationImpl) {
        TransferRequisiteStateKt$initialHcsState$1 transferRequisiteStateKt$initialHcsState$1;
        int i;
        nq01 nq01Var;
        TransferRequisiteScreenParams transferRequisiteScreenParams2;
        qo01 qo01Var2;
        uqj0 uqj0Var;
        rr51 rr51Var;
        if (continuationImpl instanceof TransferRequisiteStateKt$initialHcsState$1) {
            transferRequisiteStateKt$initialHcsState$1 = (TransferRequisiteStateKt$initialHcsState$1) continuationImpl;
            int i2 = transferRequisiteStateKt$initialHcsState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferRequisiteStateKt$initialHcsState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferRequisiteStateKt$initialHcsState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferRequisiteStateKt$initialHcsState$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (transferRequisiteScreenParams.getRequisitePayload().getHcsValidation() == null) {
                        return null;
                    }
                    DivDataDto divkitWidget = transferRequisiteScreenParams.getRequisitePayload().getHcsValidation().getDivkitWidget();
                    nq01 nq01Var2 = oq01.c;
                    if (divkitWidget == null) {
                        nq01Var = nq01Var2;
                        transferRequisiteScreenParams2 = transferRequisiteScreenParams;
                        qo01Var2 = qo01Var;
                        uqj0Var = null;
                        vqj0 b = b(TransferRequisiteFormItemType$HcsFormItemType.ACCOUNT_NUMBER, transferRequisiteScreenParams2, qo01Var2);
                        vqj0 b2 = b(TransferRequisiteFormItemType$HcsFormItemType.BIC, transferRequisiteScreenParams2, qo01Var2);
                        vqj0 b3 = b(TransferRequisiteFormItemType$HcsFormItemType.INN, transferRequisiteScreenParams2, qo01Var2);
                        vqj0 b4 = b(TransferRequisiteFormItemType$HcsFormItemType.BENEFICIARY_NAME, transferRequisiteScreenParams2, qo01Var2);
                        vqj0 b5 = b(TransferRequisiteFormItemType$HcsFormItemType.PERSONAL_ACCOUNT, transferRequisiteScreenParams2, qo01Var2);
                        vqj0 b6 = b(TransferRequisiteFormItemType$HcsFormItemType.PAYMENT_PERIOD, transferRequisiteScreenParams2, qo01Var2);
                        TransferRequisiteFormItemType$HcsFormItemType transferRequisiteFormItemType$HcsFormItemType = TransferRequisiteFormItemType$HcsFormItemType.VAT;
                        TransferRequisiteResultEntity result = transferRequisiteScreenParams2.getResult();
                        TransferRequisiteResultEntity.Hcs hcs = !(result instanceof TransferRequisiteResultEntity.Hcs) ? (TransferRequisiteResultEntity.Hcs) result : null;
                        xqj0 xqj0Var = new xqj0(transferRequisiteFormItemType$HcsFormItemType, hcs != null ? Boolean.valueOf(hcs.getVatIncluded()) : null, false);
                        vqj0 b7 = b(TransferRequisiteFormItemType$HcsFormItemType.PAYMENT_PURPOSE, transferRequisiteScreenParams2, qo01Var2);
                        boolean z = transferRequisiteScreenParams2.getResult() instanceof TransferRequisiteResultEntity.Legal;
                        nq01Var.getClass();
                        return new oq01(z, ynb1.b(new Pair(ItemType.DIV_WIDGET, uqj0Var), new Pair(ItemType.ACCOUNT_NUMBER, b), new Pair(ItemType.BIC, b2), new Pair(ItemType.INN, b3), new Pair(ItemType.BENEFICIARY_NAME, b4), new Pair(ItemType.PERSONAL_ACCOUNT, b5), new Pair(ItemType.PAYMENT_PERIOD, b6), new Pair(ItemType.VAT, xqj0Var), new Pair(ItemType.PAYMENT_PURPOSE, b7)));
                    }
                    transferRequisiteStateKt$initialHcsState$1.L$0 = transferRequisiteScreenParams;
                    transferRequisiteStateKt$initialHcsState$1.L$1 = qo01Var;
                    transferRequisiteStateKt$initialHcsState$1.L$2 = nq01Var2;
                    transferRequisiteStateKt$initialHcsState$1.label = 1;
                    obj = h(divkitWidget, transferRequisiteStateKt$initialHcsState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    nq01Var = nq01Var2;
                    transferRequisiteScreenParams2 = transferRequisiteScreenParams;
                    qo01Var2 = qo01Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nq01Var = (nq01) transferRequisiteStateKt$initialHcsState$1.L$2;
                    qo01Var2 = (qo01) transferRequisiteStateKt$initialHcsState$1.L$1;
                    transferRequisiteScreenParams2 = (TransferRequisiteScreenParams) transferRequisiteStateKt$initialHcsState$1.L$0;
                    b.b(obj);
                }
                rr51Var = (rr51) obj;
                if (rr51Var != null) {
                    uqj0Var = new uqj0(TransferRequisiteFormItemType$LegalFormItemType.DIV_WIDGET, rr51Var);
                    vqj0 b8 = b(TransferRequisiteFormItemType$HcsFormItemType.ACCOUNT_NUMBER, transferRequisiteScreenParams2, qo01Var2);
                    vqj0 b22 = b(TransferRequisiteFormItemType$HcsFormItemType.BIC, transferRequisiteScreenParams2, qo01Var2);
                    vqj0 b32 = b(TransferRequisiteFormItemType$HcsFormItemType.INN, transferRequisiteScreenParams2, qo01Var2);
                    vqj0 b42 = b(TransferRequisiteFormItemType$HcsFormItemType.BENEFICIARY_NAME, transferRequisiteScreenParams2, qo01Var2);
                    vqj0 b52 = b(TransferRequisiteFormItemType$HcsFormItemType.PERSONAL_ACCOUNT, transferRequisiteScreenParams2, qo01Var2);
                    vqj0 b62 = b(TransferRequisiteFormItemType$HcsFormItemType.PAYMENT_PERIOD, transferRequisiteScreenParams2, qo01Var2);
                    TransferRequisiteFormItemType$HcsFormItemType transferRequisiteFormItemType$HcsFormItemType2 = TransferRequisiteFormItemType$HcsFormItemType.VAT;
                    TransferRequisiteResultEntity result2 = transferRequisiteScreenParams2.getResult();
                    if (!(result2 instanceof TransferRequisiteResultEntity.Hcs)) {
                    }
                    xqj0 xqj0Var2 = new xqj0(transferRequisiteFormItemType$HcsFormItemType2, hcs != null ? Boolean.valueOf(hcs.getVatIncluded()) : null, false);
                    vqj0 b72 = b(TransferRequisiteFormItemType$HcsFormItemType.PAYMENT_PURPOSE, transferRequisiteScreenParams2, qo01Var2);
                    boolean z2 = transferRequisiteScreenParams2.getResult() instanceof TransferRequisiteResultEntity.Legal;
                    nq01Var.getClass();
                    return new oq01(z2, ynb1.b(new Pair(ItemType.DIV_WIDGET, uqj0Var), new Pair(ItemType.ACCOUNT_NUMBER, b8), new Pair(ItemType.BIC, b22), new Pair(ItemType.INN, b32), new Pair(ItemType.BENEFICIARY_NAME, b42), new Pair(ItemType.PERSONAL_ACCOUNT, b52), new Pair(ItemType.PAYMENT_PERIOD, b62), new Pair(ItemType.VAT, xqj0Var2), new Pair(ItemType.PAYMENT_PURPOSE, b72)));
                }
                uqj0Var = null;
                vqj0 b82 = b(TransferRequisiteFormItemType$HcsFormItemType.ACCOUNT_NUMBER, transferRequisiteScreenParams2, qo01Var2);
                vqj0 b222 = b(TransferRequisiteFormItemType$HcsFormItemType.BIC, transferRequisiteScreenParams2, qo01Var2);
                vqj0 b322 = b(TransferRequisiteFormItemType$HcsFormItemType.INN, transferRequisiteScreenParams2, qo01Var2);
                vqj0 b422 = b(TransferRequisiteFormItemType$HcsFormItemType.BENEFICIARY_NAME, transferRequisiteScreenParams2, qo01Var2);
                vqj0 b522 = b(TransferRequisiteFormItemType$HcsFormItemType.PERSONAL_ACCOUNT, transferRequisiteScreenParams2, qo01Var2);
                vqj0 b622 = b(TransferRequisiteFormItemType$HcsFormItemType.PAYMENT_PERIOD, transferRequisiteScreenParams2, qo01Var2);
                TransferRequisiteFormItemType$HcsFormItemType transferRequisiteFormItemType$HcsFormItemType22 = TransferRequisiteFormItemType$HcsFormItemType.VAT;
                TransferRequisiteResultEntity result22 = transferRequisiteScreenParams2.getResult();
                if (!(result22 instanceof TransferRequisiteResultEntity.Hcs)) {
                }
                xqj0 xqj0Var22 = new xqj0(transferRequisiteFormItemType$HcsFormItemType22, hcs != null ? Boolean.valueOf(hcs.getVatIncluded()) : null, false);
                vqj0 b722 = b(TransferRequisiteFormItemType$HcsFormItemType.PAYMENT_PURPOSE, transferRequisiteScreenParams2, qo01Var2);
                boolean z22 = transferRequisiteScreenParams2.getResult() instanceof TransferRequisiteResultEntity.Legal;
                nq01Var.getClass();
                return new oq01(z22, ynb1.b(new Pair(ItemType.DIV_WIDGET, uqj0Var), new Pair(ItemType.ACCOUNT_NUMBER, b82), new Pair(ItemType.BIC, b222), new Pair(ItemType.INN, b322), new Pair(ItemType.BENEFICIARY_NAME, b422), new Pair(ItemType.PERSONAL_ACCOUNT, b522), new Pair(ItemType.PAYMENT_PERIOD, b622), new Pair(ItemType.VAT, xqj0Var22), new Pair(ItemType.PAYMENT_PURPOSE, b722)));
            }
        }
        transferRequisiteStateKt$initialHcsState$1 = new TransferRequisiteStateKt$initialHcsState$1(continuationImpl);
        Object obj2 = transferRequisiteStateKt$initialHcsState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferRequisiteStateKt$initialHcsState$1.label;
        if (i != 0) {
        }
        rr51Var = (rr51) obj2;
        if (rr51Var != null) {
        }
        uqj0Var = null;
        vqj0 b822 = b(TransferRequisiteFormItemType$HcsFormItemType.ACCOUNT_NUMBER, transferRequisiteScreenParams2, qo01Var2);
        vqj0 b2222 = b(TransferRequisiteFormItemType$HcsFormItemType.BIC, transferRequisiteScreenParams2, qo01Var2);
        vqj0 b3222 = b(TransferRequisiteFormItemType$HcsFormItemType.INN, transferRequisiteScreenParams2, qo01Var2);
        vqj0 b4222 = b(TransferRequisiteFormItemType$HcsFormItemType.BENEFICIARY_NAME, transferRequisiteScreenParams2, qo01Var2);
        vqj0 b5222 = b(TransferRequisiteFormItemType$HcsFormItemType.PERSONAL_ACCOUNT, transferRequisiteScreenParams2, qo01Var2);
        vqj0 b6222 = b(TransferRequisiteFormItemType$HcsFormItemType.PAYMENT_PERIOD, transferRequisiteScreenParams2, qo01Var2);
        TransferRequisiteFormItemType$HcsFormItemType transferRequisiteFormItemType$HcsFormItemType222 = TransferRequisiteFormItemType$HcsFormItemType.VAT;
        TransferRequisiteResultEntity result222 = transferRequisiteScreenParams2.getResult();
        if (!(result222 instanceof TransferRequisiteResultEntity.Hcs)) {
        }
        xqj0 xqj0Var222 = new xqj0(transferRequisiteFormItemType$HcsFormItemType222, hcs != null ? Boolean.valueOf(hcs.getVatIncluded()) : null, false);
        vqj0 b7222 = b(TransferRequisiteFormItemType$HcsFormItemType.PAYMENT_PURPOSE, transferRequisiteScreenParams2, qo01Var2);
        boolean z222 = transferRequisiteScreenParams2.getResult() instanceof TransferRequisiteResultEntity.Legal;
        nq01Var.getClass();
        return new oq01(z222, ynb1.b(new Pair(ItemType.DIV_WIDGET, uqj0Var), new Pair(ItemType.ACCOUNT_NUMBER, b822), new Pair(ItemType.BIC, b2222), new Pair(ItemType.INN, b3222), new Pair(ItemType.BENEFICIARY_NAME, b4222), new Pair(ItemType.PERSONAL_ACCOUNT, b5222), new Pair(ItemType.PAYMENT_PERIOD, b6222), new Pair(ItemType.VAT, xqj0Var222), new Pair(ItemType.PAYMENT_PURPOSE, b7222)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(TransferRequisiteScreenParams transferRequisiteScreenParams, qo01 qo01Var, ContinuationImpl continuationImpl) {
        TransferRequisiteStateKt$initialLegalState$1 transferRequisiteStateKt$initialLegalState$1;
        int i;
        pq01 pq01Var;
        TransferRequisiteScreenParams transferRequisiteScreenParams2;
        qo01 qo01Var2;
        uqj0 uqj0Var;
        rr51 rr51Var;
        if (continuationImpl instanceof TransferRequisiteStateKt$initialLegalState$1) {
            transferRequisiteStateKt$initialLegalState$1 = (TransferRequisiteStateKt$initialLegalState$1) continuationImpl;
            int i2 = transferRequisiteStateKt$initialLegalState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferRequisiteStateKt$initialLegalState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferRequisiteStateKt$initialLegalState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferRequisiteStateKt$initialLegalState$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (transferRequisiteScreenParams.getRequisitePayload().getLegalValidation() == null) {
                        return null;
                    }
                    DivDataDto divkitWidget = transferRequisiteScreenParams.getRequisitePayload().getLegalValidation().getDivkitWidget();
                    pq01 pq01Var2 = qq01.c;
                    if (divkitWidget == null) {
                        pq01Var = pq01Var2;
                        transferRequisiteScreenParams2 = transferRequisiteScreenParams;
                        qo01Var2 = qo01Var;
                        uqj0Var = null;
                        vqj0 b = b(TransferRequisiteFormItemType$LegalFormItemType.ACCOUNT_NUMBER, transferRequisiteScreenParams2, qo01Var2);
                        vqj0 b2 = b(TransferRequisiteFormItemType$LegalFormItemType.BIC, transferRequisiteScreenParams2, qo01Var2);
                        vqj0 b3 = b(TransferRequisiteFormItemType$LegalFormItemType.INN, transferRequisiteScreenParams2, qo01Var2);
                        vqj0 b4 = b(TransferRequisiteFormItemType$LegalFormItemType.BENEFICIARY_NAME, transferRequisiteScreenParams2, qo01Var2);
                        TransferRequisiteFormItemType$LegalFormItemType transferRequisiteFormItemType$LegalFormItemType = TransferRequisiteFormItemType$LegalFormItemType.VAT;
                        TransferRequisiteResultEntity result = transferRequisiteScreenParams2.getResult();
                        TransferRequisiteResultEntity.Legal legal = !(result instanceof TransferRequisiteResultEntity.Legal) ? (TransferRequisiteResultEntity.Legal) result : null;
                        xqj0 xqj0Var = new xqj0(transferRequisiteFormItemType$LegalFormItemType, legal != null ? Boolean.valueOf(legal.getVatIncluded()) : null, false);
                        vqj0 b5 = b(TransferRequisiteFormItemType$LegalFormItemType.PAYMENT_PURPOSE, transferRequisiteScreenParams2, qo01Var2);
                        boolean z = transferRequisiteScreenParams2.getResult() instanceof TransferRequisiteResultEntity.Legal;
                        pq01Var.getClass();
                        return new qq01(z, ynb1.b(new Pair(ItemType.DIV_WIDGET, uqj0Var), new Pair(ItemType.ACCOUNT_NUMBER, b), new Pair(ItemType.BIC, b2), new Pair(ItemType.INN, b3), new Pair(ItemType.BENEFICIARY_NAME, b4), new Pair(ItemType.VAT, xqj0Var), new Pair(ItemType.PAYMENT_PURPOSE, b5)));
                    }
                    transferRequisiteStateKt$initialLegalState$1.L$0 = transferRequisiteScreenParams;
                    transferRequisiteStateKt$initialLegalState$1.L$1 = qo01Var;
                    transferRequisiteStateKt$initialLegalState$1.L$2 = pq01Var2;
                    transferRequisiteStateKt$initialLegalState$1.label = 1;
                    obj = h(divkitWidget, transferRequisiteStateKt$initialLegalState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    pq01Var = pq01Var2;
                    transferRequisiteScreenParams2 = transferRequisiteScreenParams;
                    qo01Var2 = qo01Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pq01Var = (pq01) transferRequisiteStateKt$initialLegalState$1.L$2;
                    qo01Var2 = (qo01) transferRequisiteStateKt$initialLegalState$1.L$1;
                    transferRequisiteScreenParams2 = (TransferRequisiteScreenParams) transferRequisiteStateKt$initialLegalState$1.L$0;
                    b.b(obj);
                }
                rr51Var = (rr51) obj;
                if (rr51Var != null) {
                    uqj0Var = new uqj0(TransferRequisiteFormItemType$LegalFormItemType.DIV_WIDGET, rr51Var);
                    vqj0 b6 = b(TransferRequisiteFormItemType$LegalFormItemType.ACCOUNT_NUMBER, transferRequisiteScreenParams2, qo01Var2);
                    vqj0 b22 = b(TransferRequisiteFormItemType$LegalFormItemType.BIC, transferRequisiteScreenParams2, qo01Var2);
                    vqj0 b32 = b(TransferRequisiteFormItemType$LegalFormItemType.INN, transferRequisiteScreenParams2, qo01Var2);
                    vqj0 b42 = b(TransferRequisiteFormItemType$LegalFormItemType.BENEFICIARY_NAME, transferRequisiteScreenParams2, qo01Var2);
                    TransferRequisiteFormItemType$LegalFormItemType transferRequisiteFormItemType$LegalFormItemType2 = TransferRequisiteFormItemType$LegalFormItemType.VAT;
                    TransferRequisiteResultEntity result2 = transferRequisiteScreenParams2.getResult();
                    if (!(result2 instanceof TransferRequisiteResultEntity.Legal)) {
                    }
                    xqj0 xqj0Var2 = new xqj0(transferRequisiteFormItemType$LegalFormItemType2, legal != null ? Boolean.valueOf(legal.getVatIncluded()) : null, false);
                    vqj0 b52 = b(TransferRequisiteFormItemType$LegalFormItemType.PAYMENT_PURPOSE, transferRequisiteScreenParams2, qo01Var2);
                    boolean z2 = transferRequisiteScreenParams2.getResult() instanceof TransferRequisiteResultEntity.Legal;
                    pq01Var.getClass();
                    return new qq01(z2, ynb1.b(new Pair(ItemType.DIV_WIDGET, uqj0Var), new Pair(ItemType.ACCOUNT_NUMBER, b6), new Pair(ItemType.BIC, b22), new Pair(ItemType.INN, b32), new Pair(ItemType.BENEFICIARY_NAME, b42), new Pair(ItemType.VAT, xqj0Var2), new Pair(ItemType.PAYMENT_PURPOSE, b52)));
                }
                uqj0Var = null;
                vqj0 b62 = b(TransferRequisiteFormItemType$LegalFormItemType.ACCOUNT_NUMBER, transferRequisiteScreenParams2, qo01Var2);
                vqj0 b222 = b(TransferRequisiteFormItemType$LegalFormItemType.BIC, transferRequisiteScreenParams2, qo01Var2);
                vqj0 b322 = b(TransferRequisiteFormItemType$LegalFormItemType.INN, transferRequisiteScreenParams2, qo01Var2);
                vqj0 b422 = b(TransferRequisiteFormItemType$LegalFormItemType.BENEFICIARY_NAME, transferRequisiteScreenParams2, qo01Var2);
                TransferRequisiteFormItemType$LegalFormItemType transferRequisiteFormItemType$LegalFormItemType22 = TransferRequisiteFormItemType$LegalFormItemType.VAT;
                TransferRequisiteResultEntity result22 = transferRequisiteScreenParams2.getResult();
                if (!(result22 instanceof TransferRequisiteResultEntity.Legal)) {
                }
                xqj0 xqj0Var22 = new xqj0(transferRequisiteFormItemType$LegalFormItemType22, legal != null ? Boolean.valueOf(legal.getVatIncluded()) : null, false);
                vqj0 b522 = b(TransferRequisiteFormItemType$LegalFormItemType.PAYMENT_PURPOSE, transferRequisiteScreenParams2, qo01Var2);
                boolean z22 = transferRequisiteScreenParams2.getResult() instanceof TransferRequisiteResultEntity.Legal;
                pq01Var.getClass();
                return new qq01(z22, ynb1.b(new Pair(ItemType.DIV_WIDGET, uqj0Var), new Pair(ItemType.ACCOUNT_NUMBER, b62), new Pair(ItemType.BIC, b222), new Pair(ItemType.INN, b322), new Pair(ItemType.BENEFICIARY_NAME, b422), new Pair(ItemType.VAT, xqj0Var22), new Pair(ItemType.PAYMENT_PURPOSE, b522)));
            }
        }
        transferRequisiteStateKt$initialLegalState$1 = new TransferRequisiteStateKt$initialLegalState$1(continuationImpl);
        Object obj2 = transferRequisiteStateKt$initialLegalState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferRequisiteStateKt$initialLegalState$1.label;
        if (i != 0) {
        }
        rr51Var = (rr51) obj2;
        if (rr51Var != null) {
        }
        uqj0Var = null;
        vqj0 b622 = b(TransferRequisiteFormItemType$LegalFormItemType.ACCOUNT_NUMBER, transferRequisiteScreenParams2, qo01Var2);
        vqj0 b2222 = b(TransferRequisiteFormItemType$LegalFormItemType.BIC, transferRequisiteScreenParams2, qo01Var2);
        vqj0 b3222 = b(TransferRequisiteFormItemType$LegalFormItemType.INN, transferRequisiteScreenParams2, qo01Var2);
        vqj0 b4222 = b(TransferRequisiteFormItemType$LegalFormItemType.BENEFICIARY_NAME, transferRequisiteScreenParams2, qo01Var2);
        TransferRequisiteFormItemType$LegalFormItemType transferRequisiteFormItemType$LegalFormItemType222 = TransferRequisiteFormItemType$LegalFormItemType.VAT;
        TransferRequisiteResultEntity result222 = transferRequisiteScreenParams2.getResult();
        if (!(result222 instanceof TransferRequisiteResultEntity.Legal)) {
        }
        xqj0 xqj0Var222 = new xqj0(transferRequisiteFormItemType$LegalFormItemType222, legal != null ? Boolean.valueOf(legal.getVatIncluded()) : null, false);
        vqj0 b5222 = b(TransferRequisiteFormItemType$LegalFormItemType.PAYMENT_PURPOSE, transferRequisiteScreenParams2, qo01Var2);
        boolean z222 = transferRequisiteScreenParams2.getResult() instanceof TransferRequisiteResultEntity.Legal;
        pq01Var.getClass();
        return new qq01(z222, ynb1.b(new Pair(ItemType.DIV_WIDGET, uqj0Var), new Pair(ItemType.ACCOUNT_NUMBER, b622), new Pair(ItemType.BIC, b2222), new Pair(ItemType.INN, b3222), new Pair(ItemType.BENEFICIARY_NAME, b4222), new Pair(ItemType.VAT, xqj0Var222), new Pair(ItemType.PAYMENT_PURPOSE, b5222)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(TransferRequisiteScreenParams transferRequisiteScreenParams, qo01 qo01Var, ContinuationImpl continuationImpl) {
        TransferRequisiteStateKt$initialPersonState$1 transferRequisiteStateKt$initialPersonState$1;
        int i;
        TransferRequisiteResultEntity.Person person;
        rq01 rq01Var;
        TransferRequisiteScreenParams transferRequisiteScreenParams2;
        qo01 qo01Var2;
        DivDataDto divkitWidget;
        MiddleNameEntity middleName;
        rr51 rr51Var;
        if (continuationImpl instanceof TransferRequisiteStateKt$initialPersonState$1) {
            transferRequisiteStateKt$initialPersonState$1 = (TransferRequisiteStateKt$initialPersonState$1) continuationImpl;
            int i2 = transferRequisiteStateKt$initialPersonState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferRequisiteStateKt$initialPersonState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferRequisiteStateKt$initialPersonState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferRequisiteStateKt$initialPersonState$1.label;
                uqj0 uqj0Var = null;
                boolean z = true;
                if (i != 0) {
                    b.b(obj);
                    if (transferRequisiteScreenParams.getRequisitePayload().getPersonValidation() == null) {
                        return null;
                    }
                    TransferRequisiteResultEntity result = transferRequisiteScreenParams.getResult();
                    person = result instanceof TransferRequisiteResultEntity.Person ? (TransferRequisiteResultEntity.Person) result : null;
                    RequisitesPersonTransferPayloadEntity personValidation = transferRequisiteScreenParams.getRequisitePayload().getPersonValidation();
                    rq01 rq01Var2 = sq01.c;
                    if (personValidation == null || (divkitWidget = personValidation.getDivkitWidget()) == null) {
                        rq01Var = rq01Var2;
                        transferRequisiteScreenParams2 = transferRequisiteScreenParams;
                        qo01Var2 = qo01Var;
                        vqj0 b = b(TransferRequisiteFormItemType$PersonFormItemType.ACCOUNT_NUMBER, transferRequisiteScreenParams2, qo01Var2);
                        vqj0 b2 = b(TransferRequisiteFormItemType$PersonFormItemType.BIC, transferRequisiteScreenParams2, qo01Var2);
                        vqj0 b3 = b(TransferRequisiteFormItemType$PersonFormItemType.LAST_NAME, transferRequisiteScreenParams2, qo01Var2);
                        vqj0 b4 = b(TransferRequisiteFormItemType$PersonFormItemType.FIRST_NAME, transferRequisiteScreenParams2, qo01Var2);
                        vqj0 b5 = b(TransferRequisiteFormItemType$PersonFormItemType.MIDDLE_NAME, transferRequisiteScreenParams2, qo01Var2);
                        wqj0 wqj0Var = new wqj0(TransferRequisiteFormItemType$PersonFormItemType.MIDDLE_NAME_RADIO_BUTTON, (person != null || (middleName = person.getMiddleName()) == null) ? false : middleName.getNoMiddleNameSelected(), unr0.h(Text.Companion, dzh0.ybsdk_transfer_requisite_no_middle_name_label));
                        vqj0 b6 = b(TransferRequisiteFormItemType$PersonFormItemType.PAYMENT_PURPOSE, transferRequisiteScreenParams2, qo01Var2);
                        if (transferRequisiteScreenParams2.getResult() != null && !(transferRequisiteScreenParams2.getResult() instanceof TransferRequisiteResultEntity.Person)) {
                            z = false;
                        }
                        rq01Var.getClass();
                        return new sq01(z, ynb1.b(new Pair(ItemType.DIV_WIDGET, uqj0Var), new Pair(ItemType.ACCOUNT_NUMBER, b), new Pair(ItemType.BIC, b2), new Pair(ItemType.LAST_NAME, b3), new Pair(ItemType.FIRST_NAME, b4), new Pair(ItemType.MIDDLE_NAME, b5), new Pair(ItemType.MIDDLE_NAME_RADIO_BUTTON, wqj0Var), new Pair(ItemType.PAYMENT_PURPOSE, b6)));
                    }
                    transferRequisiteStateKt$initialPersonState$1.L$0 = transferRequisiteScreenParams;
                    transferRequisiteStateKt$initialPersonState$1.L$1 = qo01Var;
                    transferRequisiteStateKt$initialPersonState$1.L$2 = person;
                    transferRequisiteStateKt$initialPersonState$1.L$3 = rq01Var2;
                    transferRequisiteStateKt$initialPersonState$1.label = 1;
                    obj = h(divkitWidget, transferRequisiteStateKt$initialPersonState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rq01Var = rq01Var2;
                    transferRequisiteScreenParams2 = transferRequisiteScreenParams;
                    qo01Var2 = qo01Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rq01Var = (rq01) transferRequisiteStateKt$initialPersonState$1.L$3;
                    person = (TransferRequisiteResultEntity.Person) transferRequisiteStateKt$initialPersonState$1.L$2;
                    qo01Var2 = (qo01) transferRequisiteStateKt$initialPersonState$1.L$1;
                    transferRequisiteScreenParams2 = (TransferRequisiteScreenParams) transferRequisiteStateKt$initialPersonState$1.L$0;
                    b.b(obj);
                }
                rr51Var = (rr51) obj;
                if (rr51Var != null) {
                    uqj0Var = new uqj0(TransferRequisiteFormItemType$PersonFormItemType.DIV_WIDGET, rr51Var);
                }
                vqj0 b7 = b(TransferRequisiteFormItemType$PersonFormItemType.ACCOUNT_NUMBER, transferRequisiteScreenParams2, qo01Var2);
                vqj0 b22 = b(TransferRequisiteFormItemType$PersonFormItemType.BIC, transferRequisiteScreenParams2, qo01Var2);
                vqj0 b32 = b(TransferRequisiteFormItemType$PersonFormItemType.LAST_NAME, transferRequisiteScreenParams2, qo01Var2);
                vqj0 b42 = b(TransferRequisiteFormItemType$PersonFormItemType.FIRST_NAME, transferRequisiteScreenParams2, qo01Var2);
                vqj0 b52 = b(TransferRequisiteFormItemType$PersonFormItemType.MIDDLE_NAME, transferRequisiteScreenParams2, qo01Var2);
                wqj0 wqj0Var2 = new wqj0(TransferRequisiteFormItemType$PersonFormItemType.MIDDLE_NAME_RADIO_BUTTON, (person != null || (middleName = person.getMiddleName()) == null) ? false : middleName.getNoMiddleNameSelected(), unr0.h(Text.Companion, dzh0.ybsdk_transfer_requisite_no_middle_name_label));
                vqj0 b62 = b(TransferRequisiteFormItemType$PersonFormItemType.PAYMENT_PURPOSE, transferRequisiteScreenParams2, qo01Var2);
                if (transferRequisiteScreenParams2.getResult() != null) {
                    z = false;
                }
                rq01Var.getClass();
                return new sq01(z, ynb1.b(new Pair(ItemType.DIV_WIDGET, uqj0Var), new Pair(ItemType.ACCOUNT_NUMBER, b7), new Pair(ItemType.BIC, b22), new Pair(ItemType.LAST_NAME, b32), new Pair(ItemType.FIRST_NAME, b42), new Pair(ItemType.MIDDLE_NAME, b52), new Pair(ItemType.MIDDLE_NAME_RADIO_BUTTON, wqj0Var2), new Pair(ItemType.PAYMENT_PURPOSE, b62)));
            }
        }
        transferRequisiteStateKt$initialPersonState$1 = new TransferRequisiteStateKt$initialPersonState$1(continuationImpl);
        Object obj2 = transferRequisiteStateKt$initialPersonState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferRequisiteStateKt$initialPersonState$1.label;
        uqj0 uqj0Var2 = null;
        boolean z2 = true;
        if (i != 0) {
        }
        rr51Var = (rr51) obj2;
        if (rr51Var != null) {
        }
        vqj0 b72 = b(TransferRequisiteFormItemType$PersonFormItemType.ACCOUNT_NUMBER, transferRequisiteScreenParams2, qo01Var2);
        vqj0 b222 = b(TransferRequisiteFormItemType$PersonFormItemType.BIC, transferRequisiteScreenParams2, qo01Var2);
        vqj0 b322 = b(TransferRequisiteFormItemType$PersonFormItemType.LAST_NAME, transferRequisiteScreenParams2, qo01Var2);
        vqj0 b422 = b(TransferRequisiteFormItemType$PersonFormItemType.FIRST_NAME, transferRequisiteScreenParams2, qo01Var2);
        vqj0 b522 = b(TransferRequisiteFormItemType$PersonFormItemType.MIDDLE_NAME, transferRequisiteScreenParams2, qo01Var2);
        wqj0 wqj0Var22 = new wqj0(TransferRequisiteFormItemType$PersonFormItemType.MIDDLE_NAME_RADIO_BUTTON, (person != null || (middleName = person.getMiddleName()) == null) ? false : middleName.getNoMiddleNameSelected(), unr0.h(Text.Companion, dzh0.ybsdk_transfer_requisite_no_middle_name_label));
        vqj0 b622 = b(TransferRequisiteFormItemType$PersonFormItemType.PAYMENT_PURPOSE, transferRequisiteScreenParams2, qo01Var2);
        if (transferRequisiteScreenParams2.getResult() != null) {
        }
        rq01Var.getClass();
        return new sq01(z2, ynb1.b(new Pair(ItemType.DIV_WIDGET, uqj0Var2), new Pair(ItemType.ACCOUNT_NUMBER, b72), new Pair(ItemType.BIC, b222), new Pair(ItemType.LAST_NAME, b322), new Pair(ItemType.FIRST_NAME, b422), new Pair(ItemType.MIDDLE_NAME, b522), new Pair(ItemType.MIDDLE_NAME_RADIO_BUTTON, wqj0Var22), new Pair(ItemType.PAYMENT_PURPOSE, b622)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(DivDataDto divDataDto, ContinuationImpl continuationImpl) {
        TransferRequisiteStateKt$parseDivkitWidget$1 transferRequisiteStateKt$parseDivkitWidget$1;
        int i;
        Object b;
        if (continuationImpl instanceof TransferRequisiteStateKt$parseDivkitWidget$1) {
            transferRequisiteStateKt$parseDivkitWidget$1 = (TransferRequisiteStateKt$parseDivkitWidget$1) continuationImpl;
            int i2 = transferRequisiteStateKt$parseDivkitWidget$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferRequisiteStateKt$parseDivkitWidget$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferRequisiteStateKt$parseDivkitWidget$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferRequisiteStateKt$parseDivkitWidget$1.label;
                if (i != 0) {
                    b.b(obj);
                    com.ybsdk.feature.divkit.api.domain.a aVar = new com.ybsdk.feature.divkit.api.domain.a(null);
                    transferRequisiteStateKt$parseDivkitWidget$1.label = 1;
                    b = aVar.b(divDataDto, transferRequisiteStateKt$parseDivkitWidget$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (b instanceof Result.Failure) {
                    return b;
                }
                return null;
            }
        }
        transferRequisiteStateKt$parseDivkitWidget$1 = new TransferRequisiteStateKt$parseDivkitWidget$1(continuationImpl);
        Object obj2 = transferRequisiteStateKt$parseDivkitWidget$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferRequisiteStateKt$parseDivkitWidget$1.label;
        if (i != 0) {
        }
        if (b instanceof Result.Failure) {
        }
    }
}
