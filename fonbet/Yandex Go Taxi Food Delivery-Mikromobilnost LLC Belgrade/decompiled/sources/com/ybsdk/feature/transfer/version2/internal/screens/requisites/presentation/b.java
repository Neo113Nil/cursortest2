package com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation;

import android.content.Context;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferByDetailsOpenAccountType;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferByDetailsTypeSwitchClickAccountType;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferByDetailsValidationErrorAccountType;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.ItemType;
import defpackage.ah90;
import defpackage.arj0;
import defpackage.bh90;
import defpackage.bqg;
import defpackage.br01;
import defpackage.brj0;
import defpackage.ch90;
import defpackage.cqg;
import defpackage.crj0;
import defpackage.ct11;
import defpackage.dh90;
import defpackage.dqg;
import defpackage.ds31;
import defpackage.dzh0;
import defpackage.eg01;
import defpackage.em3;
import defpackage.er01;
import defpackage.fr01;
import defpackage.ftb1;
import defpackage.g3b0;
import defpackage.g8e;
import defpackage.gao;
import defpackage.gtu0;
import defpackage.gw00;
import defpackage.h791;
import defpackage.hr01;
import defpackage.i3y;
import defpackage.i5y0;
import defpackage.ir01;
import defpackage.j3h;
import defpackage.l15;
import defpackage.m15;
import defpackage.mq01;
import defpackage.n0t0;
import defpackage.n15;
import defpackage.n4u0;
import defpackage.nr01;
import defpackage.ny61;
import defpackage.oq01;
import defpackage.or01;
import defpackage.p8u;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qq01;
import defpackage.qz51;
import defpackage.rma1;
import defpackage.ro01;
import defpackage.rqj0;
import defpackage.scc;
import defpackage.sq01;
import defpackage.sqj0;
import defpackage.tc01;
import defpackage.tcc;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tq01;
import defpackage.u4s;
import defpackage.uc5;
import defpackage.v0h;
import defpackage.vay;
import defpackage.vqj0;
import defpackage.w511;
import defpackage.wjm;
import defpackage.wqj0;
import defpackage.x4e;
import defpackage.xqj0;
import defpackage.xz3;
import defpackage.yg90;
import defpackage.yj;
import defpackage.yyf;
import defpackage.zg90;
import defpackage.zq01;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class b extends uc5 {
    public final tfl0 B;
    public final TransferRequisiteScreenParams C;
    public final crj0 D;
    public final com.ybsdk.feature.transfer.version2.internal.screens.requisites.data.a E;
    public final Context F;
    public final j3h G;
    public final ro01 H;
    public pzt0 I;
    public pzt0 J;
    public pzt0 K;
    public boolean L;
    public final i3y M;
    public final wjm N;

    public b(br01 br01Var, tfl0 tfl0Var, TransferRequisiteScreenParams transferRequisiteScreenParams, crj0 crj0Var, com.ybsdk.feature.transfer.version2.internal.screens.requisites.data.a aVar, or01 or01Var, Context context, j3h j3hVar, ro01 ro01Var, u4s u4sVar) {
        super(new tc01(17), br01Var);
        TransferEvents$TransferByDetailsOpenAccountType transferEvents$TransferByDetailsOpenAccountType;
        this.B = tfl0Var;
        this.C = transferRequisiteScreenParams;
        this.D = crj0Var;
        this.E = aVar;
        this.F = context;
        this.G = j3hVar;
        this.H = ro01Var;
        this.M = kotlin.a.b(LazyThreadSafetyMode.NONE, new i5y0(29, or01Var, this));
        pz40 Y = Y();
        eg01 eg01Var = new eg01(this);
        yyf yyfVar = u4sVar.a;
        this.N = new wjm(Y, eg01Var, transferRequisiteScreenParams, (g3b0) yyfVar.a.a, (vay) yyfVar.b.a, (p8u) yyfVar.c.a);
        nr01 d0 = d0();
        TransferRequisiteResultEntity result = transferRequisiteScreenParams.getResult();
        em3 em3Var = d0.a.q0;
        if (result instanceof TransferRequisiteResultEntity.Legal) {
            transferEvents$TransferByDetailsOpenAccountType = TransferEvents$TransferByDetailsOpenAccountType.BUSINESS;
        } else if ((result instanceof TransferRequisiteResultEntity.Person) || result == null) {
            transferEvents$TransferByDetailsOpenAccountType = TransferEvents$TransferByDetailsOpenAccountType.PERSONAL;
        } else {
            if (!(result instanceof TransferRequisiteResultEntity.Hcs)) {
                w511.b();
                throw null;
            }
            transferEvents$TransferByDetailsOpenAccountType = TransferEvents$TransferByDetailsOpenAccountType.HCS;
        }
        String str = d0.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put("account_type", transferEvents$TransferByDetailsOpenAccountType.getOriginalValue());
        linkedHashMap.put("transfer_session_id", str);
        em3Var.a.a("transfer.by_details.open", linkedHashMap);
        tje.N(ds31.a(this), null, null, new TransferRequisiteViewModel$2(this, null), 3);
    }

    public static final boolean b0(b bVar) {
        List list;
        r0 r0Var;
        Object value;
        tq01 b = ((zq01) bVar.X()).b();
        if (b != null) {
            n15 n = bVar.N.n();
            crj0 crj0Var = (crj0) n.w;
            tq01 b2 = ((zq01) ((n4u0) n.b).getValue()).b();
            Object obj = null;
            if (b2 == null) {
                list = EmptyList.a;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = b2.b().entrySet().iterator();
                while (it.hasNext()) {
                    rqj0 rqj0Var = (rqj0) ((Map.Entry) it.next()).getValue();
                    ItemType itemType = rqj0Var.b().getItemType();
                    if (m15.a[itemType.ordinal()] == 3) {
                        sq01 sq01Var = b2 instanceof sq01 ? (sq01) b2 : null;
                        if (sq01Var != null) {
                            Object obj2 = sq01Var.b.get(ItemType.MIDDLE_NAME_RADIO_BUTTON);
                            wqj0 wqj0Var = obj2 instanceof wqj0 ? (wqj0) obj2 : null;
                            boolean z = wqj0Var != null && wqj0Var.b;
                            vqj0 c = sq01Var.c(itemType);
                            if (c != null) {
                                if (z && c.c.length() == 0) {
                                    arrayList.add(vqj0.c(c, null, false, null, null, false, 32743));
                                } else {
                                    arrayList.add(c.a(crj0Var));
                                }
                            }
                        }
                    } else {
                        arrayList.add(rqj0Var.a(crj0Var));
                    }
                }
                list = arrayList;
            }
            for (Object obj3 : list) {
                rqj0 rqj0Var2 = (rqj0) obj3;
                if (((rqj0Var2 instanceof vqj0) && ((vqj0) rqj0Var2).d) || ((rqj0Var2 instanceof xqj0) && ((xqj0) rqj0Var2).c)) {
                    obj = obj3;
                    break;
                }
            }
            rqj0 rqj0Var3 = (rqj0) obj;
            if (rqj0Var3 != null) {
                bVar.Z(new hr01(list.indexOf(rqj0Var3)));
                if (rqj0Var3 instanceof vqj0) {
                    vqj0 vqj0Var = (vqj0) rqj0Var3;
                    bVar.g0(vqj0Var.a.getItemType(), vqj0Var.e);
                }
            }
            rqj0[] rqj0VarArr = (rqj0[]) list.toArray(new rqj0[0]);
            tq01 e = b.e((rqj0[]) Arrays.copyOf(rqj0VarArr, rqj0VarArr.length));
            List list2 = ((zq01) bVar.X()).b;
            int c2 = ((zq01) bVar.X()).c();
            ArrayList arrayList2 = new ArrayList(list2);
            arrayList2.set(c2, e);
            pz40 Y = bVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, zq01.a((zq01) value, null, arrayList2, false, false, 13)));
            if (rqj0Var3 == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c0(boolean z, ContinuationImpl continuationImpl) {
        TransferRequisiteViewModel$checkAccountBic$1 transferRequisiteViewModel$checkAccountBic$1;
        int i;
        tq01 b;
        vqj0 c;
        tq01 b2;
        vqj0 c2;
        Object a;
        boolean z2;
        Throwable a2;
        tq01 b3;
        vqj0 c3;
        tq01 b4;
        vqj0 c4;
        r0 r0Var;
        Object value;
        zq01 zq01Var;
        ArrayList arrayList;
        if (continuationImpl instanceof TransferRequisiteViewModel$checkAccountBic$1) {
            transferRequisiteViewModel$checkAccountBic$1 = (TransferRequisiteViewModel$checkAccountBic$1) continuationImpl;
            int i2 = transferRequisiteViewModel$checkAccountBic$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferRequisiteViewModel$checkAccountBic$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferRequisiteViewModel$checkAccountBic$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferRequisiteViewModel$checkAccountBic$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if ((((zq01) X()).a instanceof ch90) && (b = ((zq01) X()).b()) != null && (c = b.c(ItemType.BIC)) != null && (b2 = ((zq01) X()).b()) != null && (c2 = b2.c(ItemType.ACCOUNT_NUMBER)) != null) {
                        String str = c.c;
                        String b5 = gtu0.b(c2.c);
                        transferRequisiteViewModel$checkAccountBic$1.Z$0 = z;
                        transferRequisiteViewModel$checkAccountBic$1.label = 1;
                        a = this.E.a(str, b5, transferRequisiteViewModel$checkAccountBic$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        z2 = z;
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = transferRequisiteViewModel$checkAccountBic$1.Z$0;
                kotlin.b.b(obj);
                a = ((Result) obj).getValue();
                a2 = Result.a(a);
                if (a2 != null) {
                    Object obj2 = (dqg) a;
                    if (!(obj2 instanceof bqg)) {
                        if (!(obj2 instanceof cqg)) {
                            w511.b();
                            return null;
                        }
                        tq01 b6 = ((zq01) X()).b();
                        if (b6 != null && (c3 = b6.c(ItemType.BIC)) != null && (b4 = ((zq01) X()).b()) != null && (c4 = b4.c(ItemType.ACCOUNT_NUMBER)) != null) {
                            yj yjVar = (yj) ((cqg) obj2).a;
                            String str2 = yjVar.b;
                            vqj0 c5 = vqj0.c(c3, null, str2 != null, str2 != null ? new Text.Constant(str2) : null, null, false, 32743);
                            String str3 = yjVar.a;
                            vqj0 c6 = vqj0.c(c4, null, str3 != null, str3 != null ? new Text.Constant(str3) : null, null, false, 32743);
                            tq01 b7 = ((zq01) X()).b();
                            if (b7 != null) {
                                tq01 e = b7.e(c5, c6);
                                boolean z3 = c6.d || c5.d;
                                pz40 Y = Y();
                                do {
                                    r0Var = (r0) Y;
                                    value = r0Var.getValue();
                                    zq01Var = (zq01) value;
                                    List list = zq01Var.b;
                                    int c7 = zq01Var.c();
                                    arrayList = new ArrayList(list);
                                    arrayList.set(c7, e);
                                } while (!r0Var.k(value, zq01.a(zq01Var, null, arrayList, false, z3, 5)));
                            }
                        }
                        return zy11Var;
                    }
                    if (z2) {
                        q0(new FailDataException((ct11) obj2));
                    }
                } else if (z2) {
                    Z(new ir01(gao.d(new Text.Resource(dzh0.ybsdk_transfer_server_error_title), new Text.Resource(dzh0.ybsdk_transfer_common_server_error_description), a2)));
                }
                b3 = ((zq01) X()).b();
                if (b3 != null) {
                    ItemType itemType = ItemType.ACCOUNT_NUMBER;
                    vqj0 c8 = b3.c(itemType);
                    ItemType itemType2 = ItemType.BIC;
                    vqj0 c9 = b3.c(itemType2);
                    if (((zq01) X()).d) {
                        if ((c8 != null ? c8.e : null) != null) {
                            g0(itemType, c8.e);
                            return zy11Var;
                        }
                        if ((c9 != null ? c9.e : null) != null) {
                            g0(itemType2, c9.e);
                        }
                    }
                }
                return zy11Var;
            }
        }
        transferRequisiteViewModel$checkAccountBic$1 = new TransferRequisiteViewModel$checkAccountBic$1(this, continuationImpl);
        Object obj3 = transferRequisiteViewModel$checkAccountBic$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferRequisiteViewModel$checkAccountBic$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        b3 = ((zq01) X()).b();
        if (b3 != null) {
        }
        return zy11Var2;
    }

    public final nr01 d0() {
        return (nr01) this.M.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e0(boolean z, ContinuationImpl continuationImpl) {
        TransferRequisiteViewModel$getPartnersByBic$1 transferRequisiteViewModel$getPartnersByBic$1;
        int i;
        zy11 zy11Var;
        vqj0 c;
        r0 r0Var;
        Object value;
        Object b;
        boolean z2;
        Throwable a;
        r0 r0Var2;
        Object value2;
        tq01 b2;
        ItemType itemType;
        vqj0 c2;
        Text text;
        vqj0 c3;
        vqj0 c4;
        String str;
        dh90 ah90Var;
        r0 r0Var3;
        Object value3;
        zq01 zq01Var;
        ArrayList arrayList;
        r0 r0Var4;
        Object value4;
        if (continuationImpl instanceof TransferRequisiteViewModel$getPartnersByBic$1) {
            transferRequisiteViewModel$getPartnersByBic$1 = (TransferRequisiteViewModel$getPartnersByBic$1) continuationImpl;
            int i2 = transferRequisiteViewModel$getPartnersByBic$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferRequisiteViewModel$getPartnersByBic$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferRequisiteViewModel$getPartnersByBic$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferRequisiteViewModel$getPartnersByBic$1.label;
                zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tq01 b3 = ((zq01) X()).b();
                    if (b3 != null && (c = b3.c(ItemType.BIC)) != null) {
                        String str2 = c.c;
                        pz40 Y = Y();
                        do {
                            r0Var = (r0) Y;
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, zq01.a((zq01) value, bh90.a, null, false, false, 14)));
                        transferRequisiteViewModel$getPartnersByBic$1.Z$0 = z;
                        transferRequisiteViewModel$getPartnersByBic$1.label = 1;
                        b = this.E.b(str2, transferRequisiteViewModel$getPartnersByBic$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        z2 = z;
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z3 = transferRequisiteViewModel$getPartnersByBic$1.Z$0;
                kotlin.b.b(obj);
                b = ((Result) obj).getValue();
                z2 = z3;
                a = Result.a(b);
                zg90 zg90Var = zg90.a;
                if (a != null) {
                    Object obj2 = (dqg) b;
                    if (!(obj2 instanceof bqg)) {
                        if (!(obj2 instanceof cqg)) {
                            w511.b();
                            return null;
                        }
                        qz51 qz51Var = (qz51) ((cqg) obj2).a;
                        List list = qz51Var.b;
                        String str3 = qz51Var.a;
                        yg90 yg90Var = list != null ? (yg90) kotlin.collections.a.R(list) : null;
                        tq01 b4 = ((zq01) X()).b();
                        if (b4 != null && (c3 = b4.c(ItemType.BIC)) != null) {
                            if (str3 != null) {
                                c4 = vqj0.c(c3, null, true, new Text.Constant(str3), null, false, 32743);
                            } else {
                                c4 = vqj0.c(c3, null, false, null, (yg90Var == null || (str = yg90Var.a) == null) ? c3.g : new Text.Constant(str), false, 32695);
                            }
                            tq01 b5 = ((zq01) X()).b();
                            if (b5 != null) {
                                tq01 e = b5.e(c4);
                                if (yg90Var != null) {
                                    ah90Var = new ch90(yg90Var);
                                } else {
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    ah90Var = new ah90(str3);
                                }
                                pz40 Y2 = Y();
                                do {
                                    r0Var3 = (r0) Y2;
                                    value3 = r0Var3.getValue();
                                    zq01Var = (zq01) value3;
                                    List list2 = zq01Var.b;
                                    int c5 = zq01Var.c();
                                    arrayList = new ArrayList(list2);
                                    arrayList.set(c5, e);
                                } while (!r0Var3.k(value3, zq01.a(zq01Var, ah90Var, arrayList, false, false, 12)));
                            }
                        }
                        return zy11Var;
                    }
                    if (z2) {
                        pz40 Y3 = Y();
                        do {
                            r0Var4 = (r0) Y3;
                            value4 = r0Var4.getValue();
                        } while (!r0Var4.k(value4, zq01.a((zq01) value4, zg90Var, null, false, false, 14)));
                        q0(new FailDataException((ct11) obj2));
                    }
                } else {
                    pz40 Y4 = Y();
                    do {
                        r0Var2 = (r0) Y4;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, zq01.a((zq01) value2, zg90Var, null, false, false, 14)));
                    if (z2) {
                        Z(new ir01(gao.d(new Text.Resource(dzh0.ybsdk_transfer_server_error_title), new Text.Resource(dzh0.ybsdk_transfer_common_server_error_description), a)));
                    }
                }
                b2 = ((zq01) X()).b();
                if (b2 != null && (c2 = b2.c((itemType = ItemType.BIC))) != null && (text = c2.e) != null) {
                    g0(itemType, text);
                    return zy11Var;
                }
                return zy11Var;
            }
        }
        transferRequisiteViewModel$getPartnersByBic$1 = new TransferRequisiteViewModel$getPartnersByBic$1(this, continuationImpl);
        Object obj3 = transferRequisiteViewModel$getPartnersByBic$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferRequisiteViewModel$getPartnersByBic$1.label;
        zy11Var = zy11.a;
        if (i != 0) {
        }
        a = Result.a(b);
        zg90 zg90Var2 = zg90.a;
        if (a != null) {
        }
        b2 = ((zq01) X()).b();
        if (b2 != null) {
            g0(itemType, text);
            return zy11Var;
        }
        return zy11Var;
    }

    public final boolean f0(mq01 mq01Var) {
        vqj0 c;
        tq01 b = ((zq01) X()).b();
        if (b != null && (c = b.c(mq01Var.getItemType())) != null) {
            boolean i = this.N.n().i(c);
            String str = c.c;
            this.D.getClass();
            mq01 mq01Var2 = c.a;
            rma1 a = crj0.a(mq01Var2, str, c.j, i, mq01Var2.getItemType() == ItemType.ACCOUNT_NUMBER);
            rma1 b2 = crj0.b(c, i);
            if (!(a instanceof arj0) && !(b2 instanceof arj0)) {
                return true;
            }
        }
        return false;
    }

    public final void g0(ItemType itemType, Text text) {
        vqj0 c;
        String valueOf;
        TransferEvents$TransferByDetailsValidationErrorAccountType transferEvents$TransferByDetailsValidationErrorAccountType;
        tq01 b = ((zq01) X()).b();
        if (b == null || (c = b.c(itemType)) == null) {
            return;
        }
        if (c.c.length() == 0) {
            valueOf = "empty";
        } else {
            valueOf = String.valueOf(text != null ? d.a(this.F, text) : null);
        }
        nr01 d0 = d0();
        String name = itemType.name();
        em3 em3Var = d0.a.q0;
        if (b instanceof qq01) {
            transferEvents$TransferByDetailsValidationErrorAccountType = TransferEvents$TransferByDetailsValidationErrorAccountType.BUSINESS;
        } else if (b instanceof sq01) {
            transferEvents$TransferByDetailsValidationErrorAccountType = TransferEvents$TransferByDetailsValidationErrorAccountType.PERSONAL;
        } else {
            if (!(b instanceof oq01)) {
                w511.b();
                return;
            }
            transferEvents$TransferByDetailsValidationErrorAccountType = TransferEvents$TransferByDetailsValidationErrorAccountType.HCS;
        }
        String str = d0.b;
        LinkedHashMap t = x4e.t(4, "field", name, "error", valueOf);
        t.put("account_type", transferEvents$TransferByDetailsValidationErrorAccountType.getOriginalValue());
        t.put("transfer_session_id", str);
        em3Var.a.a("transfer.by_details.validation_error", t);
    }

    public final void h0() {
        this.B.e();
    }

    public final void i0() {
        Z(fr01.a);
    }

    public final void j0() {
        nr01 d0 = d0();
        em3 em3Var = d0.a.q0;
        em3Var.a.a("transfer.by_details.enter.initiated", g8e.w(1, "transfer_session_id", d0.b));
        Z(er01.a);
        tq01 b = ((zq01) X()).b();
        if (b == null) {
            return;
        }
        this.K = tje.N(ds31.a(this), null, null, new TransferRequisiteViewModel$onConfirmButtonClick$1(this, b, null), 3);
    }

    public final boolean k0(String str) {
        return h791.e(this.G, str, false, null, 14) instanceof v0h;
    }

    public final void l0(mq01 mq01Var, boolean z) {
        tq01 b;
        vqj0 c;
        Text text;
        vqj0 c2;
        r0 r0Var;
        Object value;
        if (this.L || (b = ((zq01) X()).b()) == null || (c = b.c(mq01Var.getItemType())) == null) {
            return;
        }
        if (z) {
            Z(new hr01(c.n));
            c2 = vqj0.c(c, null, false, null, null, true, 32511);
        } else if (c.d) {
            c2 = vqj0.c(c, null, false, null, null, false, 32511);
        } else {
            this.D.getClass();
            rma1 b2 = crj0.b(c, true);
            boolean z2 = b2 instanceof arj0;
            if (z2) {
                text = ((arj0) b2).a;
            } else {
                if (!b2.equals(brj0.a)) {
                    w511.b();
                    return;
                }
                text = null;
            }
            c2 = vqj0.c(c, null, z2, text, c.g, false, 32423);
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ((zq01) value).d(c2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m0(mq01 mq01Var, String str) {
        vqj0 c;
        Text text;
        r0 r0Var;
        Object value;
        boolean z;
        tq01 b = ((zq01) X()).b();
        if (b == null || (c = b.c(mq01Var.getItemType())) == null) {
            return;
        }
        this.D.getClass();
        mq01 mq01Var2 = c.a;
        List list = c.j;
        ItemType itemType = mq01Var2.getItemType();
        ItemType itemType2 = ItemType.ACCOUNT_NUMBER;
        rma1 a = crj0.a(mq01Var2, str, list, true, itemType == itemType2);
        boolean z2 = a instanceof arj0;
        if (z2) {
            text = ((arj0) a).a;
        } else {
            if (!a.equals(brj0.a)) {
                w511.b();
                return;
            }
            text = null;
        }
        if (z2) {
            g0(mq01Var.getItemType(), text);
        }
        vqj0 c2 = vqj0.c(c, str, z2, text, com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.a.c(mq01Var, null), false, 32675);
        n15 n = this.N.n();
        eg01 eg01Var = (eg01) n.c;
        zq01 d = ((zq01) ((n4u0) n.b).getValue()).d(c2);
        int i = m15.a[mq01Var.getItemType().ordinal()];
        if (i == 1) {
            eg01Var.j(mq01Var.getItemType());
            d = zq01.a(d, null, null, false, true, 3);
        } else if (i == 2) {
            eg01Var.j(mq01Var.getItemType());
            d = zq01.a(d, zg90.a, null, false, true, 2);
        } else if (i == 3) {
            tq01 b2 = d.b();
            sq01 sq01Var = b2 instanceof sq01 ? (sq01) b2 : null;
            if (sq01Var != null) {
                if (c2.c.length() == 0) {
                    Object obj = sq01Var.b.get(ItemType.MIDDLE_NAME_RADIO_BUTTON);
                    wqj0 wqj0Var = obj instanceof wqj0 ? (wqj0) obj : null;
                    if (wqj0Var != null && wqj0Var.b) {
                        z = true;
                        d = zq01.a(d, null, ftb1.c(d.b, d.c(), new l15(sq01Var, z ? false : c2.d, !z ? null : c2.e, z, 0)), false, false, 13);
                    }
                }
                z = false;
                d = zq01.a(d, null, ftb1.c(d.b, d.c(), new l15(sq01Var, z ? false : c2.d, !z ? null : c2.e, z, 0)), false, false, 13);
            }
            if (mq01Var.getItemType() == ItemType.BIC || mq01Var.getItemType() == itemType2) {
                this.I = tje.N(ds31.a(this), null, null, new TransferRequisiteViewModel$onInputChanged$1(this, null), 3);
            }
            return;
        }
        b bVar = (b) eg01Var.a;
        pz40 Y = bVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, d));
        if (mq01Var.getItemType() == ItemType.BIC) {
            return;
        }
        this.I = tje.N(ds31.a(this), null, null, new TransferRequisiteViewModel$onInputChanged$1(this, null), 3);
    }

    public final void n0(boolean z) {
        r0 r0Var;
        Object value;
        n15 n = this.N.n();
        n4u0 n4u0Var = (n4u0) n.b;
        tq01 b = ((zq01) n4u0Var.getValue()).b();
        if (b == null) {
            return;
        }
        ArrayList c = ftb1.c(((zq01) n4u0Var.getValue()).b, ((zq01) n4u0Var.getValue()).c(), new xz3(b, z, 2));
        b bVar = (b) ((eg01) n.c).a;
        pz40 Y = bVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zq01.a((zq01) bVar.X(), null, c, false, false, 13)));
    }

    public final void o0(int i) {
        ArrayList arrayList;
        TransferEvents$TransferByDetailsTypeSwitchClickAccountType transferEvents$TransferByDetailsTypeSwitchClickAccountType;
        r0 r0Var;
        Object value;
        tq01 a;
        tq01 b = ((zq01) X()).b();
        if (b == null) {
            return;
        }
        List list = ((zq01) X()).b;
        ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            tq01 tq01Var = (tq01) obj;
            if (i2 == ((zq01) X()).c()) {
                Map b2 = tq01Var.b();
                LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(b2.size()));
                for (Map.Entry entry : b2.entrySet()) {
                    Object key = entry.getKey();
                    sqj0 sqj0Var = (rqj0) entry.getValue();
                    if (sqj0Var instanceof vqj0) {
                        sqj0Var = vqj0.c((vqj0) sqj0Var, null, false, null, null, false, 32511);
                    }
                    linkedHashMap.put(key, sqj0Var);
                }
                a = tq01Var.a(linkedHashMap, false);
            } else {
                TransferRequisiteViewModel$onTabSelected$updatedForms$1$1 transferRequisiteViewModel$onTabSelected$updatedForms$1$1 = new TransferRequisiteViewModel$onTabSelected$updatedForms$1$1(1, this, b.class, "validateFieldOnTabSelected", "validateFieldOnTabSelected(Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/adapter/items/RequisiteInputFieldItem;)Lcom/ybsdk/feature/transfer/version2/internal/screens/requisites/presentation/adapter/items/RequisiteInputFieldItem;", 0);
                for (ItemType itemType : scc.g(ItemType.ACCOUNT_NUMBER, ItemType.BIC, ItemType.PAYMENT_PURPOSE)) {
                    Object obj2 = b.b().get(itemType);
                    vqj0 vqj0Var = obj2 instanceof vqj0 ? (vqj0) obj2 : null;
                    if (vqj0Var != null) {
                        Object obj3 = tq01Var.b().get(itemType);
                        vqj0 vqj0Var2 = obj3 instanceof vqj0 ? (vqj0) obj3 : null;
                        if (vqj0Var2 != null) {
                            tq01Var = tq01Var.e((vqj0) transferRequisiteViewModel$onTabSelected$updatedForms$1$1.invoke(vqj0.c(vqj0Var2, vqj0Var.c, false, null, null, false, 32763)));
                        }
                    }
                }
                a = tq01Var.a(tq01Var.b(), true);
            }
            arrayList2.add(a);
            i2 = i3;
        }
        pz40 Y = Y();
        while (true) {
            r0 r0Var2 = (r0) Y;
            Object value2 = r0Var2.getValue();
            arrayList = arrayList2;
            if (r0Var2.k(value2, zq01.a((zq01) value2, null, arrayList, false, false, 13))) {
                break;
            } else {
                arrayList2 = arrayList;
            }
        }
        Z(er01.a);
        nr01 d0 = d0();
        tq01 tq01Var2 = (tq01) ((zq01) X()).b.get(i);
        em3 em3Var = d0.a.q0;
        if (tq01Var2 instanceof qq01) {
            transferEvents$TransferByDetailsTypeSwitchClickAccountType = TransferEvents$TransferByDetailsTypeSwitchClickAccountType.BUSINESS;
        } else if (tq01Var2 instanceof sq01) {
            transferEvents$TransferByDetailsTypeSwitchClickAccountType = TransferEvents$TransferByDetailsTypeSwitchClickAccountType.PERSONAL;
        } else {
            if (!(tq01Var2 instanceof oq01)) {
                w511.b();
                return;
            }
            transferEvents$TransferByDetailsTypeSwitchClickAccountType = TransferEvents$TransferByDetailsTypeSwitchClickAccountType.HCS;
        }
        String str = d0.b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(2);
        linkedHashMap2.put("account_type", transferEvents$TransferByDetailsTypeSwitchClickAccountType.getOriginalValue());
        linkedHashMap2.put("transfer_session_id", str);
        em3Var.a.a("transfer.by_details.type_switch.click", linkedHashMap2);
        pzt0 pzt0Var = this.K;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pz40 Y2 = Y();
        do {
            r0Var = (r0) Y2;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zq01.a((zq01) value, null, arrayList, false, true, 1)));
        Z(new hr01(0));
    }

    public final void p0(boolean z) {
        r0 r0Var;
        Object value;
        n15 n = this.N.n();
        n4u0 n4u0Var = (n4u0) n.b;
        tq01 b = ((zq01) n4u0Var.getValue()).b();
        if (b == null) {
            return;
        }
        List list = ((zq01) n4u0Var.getValue()).b;
        int c = ((zq01) n4u0Var.getValue()).c();
        ArrayList arrayList = new ArrayList(list);
        Object obj = b.b().get(ItemType.VAT);
        xqj0 xqj0Var = obj instanceof xqj0 ? (xqj0) obj : null;
        if (xqj0Var != null) {
            b = b.e(xqj0.c(xqj0Var, Boolean.valueOf(z), false, 1));
        }
        arrayList.set(c, b);
        b bVar = (b) ((eg01) n.c).a;
        pz40 Y = bVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zq01.a((zq01) bVar.X(), null, arrayList, false, false, 13)));
    }

    public final void q0(FailDataException failDataException) {
        Text.Constant constant = new Text.Constant(failDataException.getError());
        String description = failDataException.getDescription();
        if (description == null) {
            description = "";
        }
        Z(new ir01(new n0t0(constant, new Text.Constant(description))));
    }
}
