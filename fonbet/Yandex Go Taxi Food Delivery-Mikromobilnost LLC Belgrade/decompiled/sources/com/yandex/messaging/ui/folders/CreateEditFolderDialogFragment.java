package com.yandex.messaging.ui.folders;

import androidx.compose.material3.p;
import androidx.compose.material3.w;
import com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment;
import com.yandex.messaging.ui.settings.folder.addChat.i;
import defpackage.aii0;
import defpackage.azd;
import defpackage.bts;
import defpackage.c530;
import defpackage.ccg;
import defpackage.di9;
import defpackage.did;
import defpackage.ds31;
import defpackage.ec0;
import defpackage.exa1;
import defpackage.f530;
import defpackage.fid;
import defpackage.g4f0;
import defpackage.g6;
import defpackage.g8e;
import defpackage.gtq0;
import defpackage.hs31;
import defpackage.hxe;
import defpackage.i9a1;
import defpackage.ic0;
import defpackage.in91;
import defpackage.jhd;
import defpackage.jjo;
import defpackage.k0n;
import defpackage.kt11;
import defpackage.leb1;
import defpackage.ljs0;
import defpackage.lnr0;
import defpackage.m3u0;
import defpackage.mcb1;
import defpackage.n3w;
import defpackage.ncb;
import defpackage.noh;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.p91;
import defpackage.q7u;
import defpackage.qnm;
import defpackage.qoi0;
import defpackage.r720;
import defpackage.rs31;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.u4f;
import defpackage.vfc;
import defpackage.vng;
import defpackage.w4;
import defpackage.w4f;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wwg;
import defpackage.x4f;
import defpackage.y4f;
import defpackage.yr31;
import defpackage.z1c;
import defpackage.z4f;
import defpackage.zpn;
import defpackage.zwv;
import defpackage.zy11;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0015H\u0094@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0015¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\"²\u0006\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010 \u001a\u00020\u001e8\nX\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u00020\u001e8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/yandex/messaging/ui/folders/CreateEditFolderDialogFragment;", "Lcom/yandex/messaging/navigation/ComposeBottomSheetDialogFragment;", "Lu4f;", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Lnoh;Lnoh;)V", "Lf530;", "modifier", "Lkotlin/Function0;", "Lzy11;", "onDismissRequest", "Lcom/yandex/messaging/ui/folders/e;", "viewModel", "CreateEditFolderDialogRoot", "(Lf530;Lsls;Lcom/yandex/messaging/ui/folders/e;Lfid;II)V", "Lec0;", "args", "Lhs31;", "createAddChatViewModelFactory", "(Lcom/yandex/messaging/ui/folders/e;Lec0;)Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DialogContent", "(Lf530;Lfid;I)V", "Lcom/yandex/messaging/ui/folders/CancelDialogSource;", "cancelDialogSource", "", "showAddChatDialog", "keyboardState", "isLandscape", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CreateEditFolderDialogFragment extends ComposeBottomSheetDialogFragment<u4f> {
    public static final int $stable = 0;

    public CreateEditFolderDialogFragment(noh nohVar, noh nohVar2) {
        super(nohVar, nohVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void CreateEditFolderDialogRoot(f530 f530Var, sls slsVar, e eVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        sls slsVar2;
        e eVar2;
        int i4;
        int i5;
        Object obj;
        final sls slsVar3;
        f530 f530Var3;
        final oz40 c;
        Object Q;
        final oz40 oz40Var;
        Object k;
        oz40 oz40Var2;
        Object Q2;
        boolean z;
        Object Q3;
        boolean k2;
        Object Q4;
        boolean k3;
        Object Q5;
        boolean k4;
        Object Q6;
        final CancelDialogSource CreateEditFolderDialogRoot$lambda$4;
        sls slsVar4;
        e eVar3;
        sls slsVar5;
        f530 f530Var4;
        aii0 v;
        int i6;
        bts btsVar = (bts) fidVar;
        btsVar.g0(715631182);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            slsVar2 = slsVar;
            i3 |= btsVar.e(slsVar2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    eVar2 = eVar;
                    if (btsVar.e(eVar2)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                } else {
                    eVar2 = eVar;
                }
                i6 = 128;
                i3 |= i6;
            } else {
                eVar2 = eVar;
            }
            if ((i2 & 8) == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= btsVar.k(this) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !btsVar.E()) {
                btsVar.a0();
                i5 = i & 1;
                obj = did.a;
                int i9 = 0;
                if (i5 != 0 || btsVar.C()) {
                    f530 f530Var5 = i7 == 0 ? c530.a : f530Var2;
                    if (i8 == 0) {
                        btsVar.e0(197232537);
                        Object Q7 = btsVar.Q();
                        if (Q7 == obj) {
                            Q7 = new hxe(9);
                            btsVar.o0(Q7);
                        }
                        slsVar3 = (sls) Q7;
                        btsVar.t(false);
                    } else {
                        slsVar3 = slsVar2;
                    }
                    if ((i2 & 4) == 0) {
                        btsVar.e0(-897180073);
                        rs31 b = jjo.b(btsVar);
                        hs31 a = jjo.a(btsVar);
                        btsVar.e0(544794079);
                        boolean e = btsVar.e(a);
                        Object Q8 = btsVar.Q();
                        if (e || Q8 == obj) {
                            Q8 = new w4(a, 10);
                            btsVar.o0(Q8);
                        }
                        btsVar.t(false);
                        yr31 G = ooc.G(qoi0.a(e.class), b, null, vfc.h(e.class, new zwv(), (tls) Q8), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
                        btsVar = btsVar;
                        btsVar.t(false);
                        i4 &= -897;
                        f530Var3 = f530Var5;
                        eVar2 = (e) G;
                    } else {
                        f530Var3 = f530Var5;
                    }
                } else {
                    btsVar.Y();
                    if ((i2 & 4) != 0) {
                        i4 &= -897;
                    }
                    f530Var3 = f530Var2;
                    slsVar3 = slsVar2;
                }
                int i10 = i4;
                btsVar.u();
                c = androidx.lifecycle.compose.a.c(eVar2.E, null, btsVar, 0, 7);
                btsVar.e0(197238349);
                Q = btsVar.Q();
                if (Q == obj) {
                    Q = androidx.compose.runtime.f.j(null);
                    btsVar.o0(Q);
                }
                oz40Var = (oz40) Q;
                k = g8e.k(197241145, btsVar, false);
                if (k == obj) {
                    k = androidx.compose.runtime.f.j(Boolean.FALSE);
                    btsVar.o0(k);
                }
                oz40Var2 = (oz40) k;
                btsVar.t(false);
                oz40 c2 = mcb1.c(btsVar);
                final w f = p.f(6, 2, btsVar, null);
                Q2 = btsVar.Q();
                if (Q2 == obj) {
                    Q2 = zpn.j(EmptyCoroutineContext.a, btsVar);
                    btsVar.o0(Q2);
                }
                final tse tseVar = (tse) Q2;
                di9 di9Var = eVar2.c;
                btsVar.e0(197249927);
                int i11 = i10 & 112;
                e eVar4 = eVar2;
                z = i11 != 32;
                Q3 = btsVar.Q();
                if (!z || Q3 == obj) {
                    Q3 = new ic0(15, slsVar3);
                    btsVar.o0(Q3);
                }
                btsVar.t(false);
                com.yandex.messaging.core.ui.a.a(di9Var, (tls) Q3, btsVar, 0);
                btsVar.e0(197257708);
                k2 = btsVar.k(c) | (i11 != 32);
                Q4 = btsVar.Q();
                if (!k2 || Q4 == obj) {
                    Q4 = new tls() { // from class: com.yandex.messaging.ui.folders.a
                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            zy11 CreateEditFolderDialogRoot$lambda$13$lambda$12;
                            CreateEditFolderDialogRoot$lambda$13$lambda$12 = CreateEditFolderDialogFragment.CreateEditFolderDialogRoot$lambda$13$lambda$12(c, slsVar3, oz40Var, (CancelDialogSource) obj2);
                            return CreateEditFolderDialogRoot$lambda$13$lambda$12;
                        }
                    };
                    btsVar.o0(Q4);
                }
                tls tlsVar = (tls) Q4;
                btsVar.t(false);
                btsVar.e0(197264271);
                k3 = btsVar.k(tlsVar);
                Q5 = btsVar.Q();
                int i12 = 3;
                if (!k3 || Q5 == obj) {
                    Q5 = new azd(i12, tlsVar);
                    btsVar.o0(Q5);
                }
                sls slsVar6 = (sls) Q5;
                btsVar.t(false);
                btsVar.e0(197266992);
                k4 = btsVar.k(tlsVar);
                Q6 = btsVar.Q();
                if (!k4 || Q6 == obj) {
                    Q6 = new azd(4, tlsVar);
                    btsVar.o0(Q6);
                }
                btsVar.t(false);
                qnm qnmVar = qnm.a;
                long a2 = qnm.c(btsVar).a();
                long c3 = qnm.c(btsVar).c();
                f530 b2 = i9a1.b(i9a1.g(ljs0.c));
                f530 f530Var6 = f530Var3;
                androidx.compose.runtime.internal.a S = wwg.S(288731696, true, new z1c(slsVar6, f530Var3, c2, c, eVar4, oz40Var2), btsVar);
                bts btsVar2 = btsVar;
                sls slsVar7 = slsVar3;
                p.a((sls) Q6, b2, f, 0.0f, false, null, a2, 0L, c3, null, null, null, S, btsVar2, 0, 6584);
                btsVar = btsVar2;
                CreateEditFolderDialogRoot$lambda$4 = CreateEditFolderDialogRoot$lambda$4(oz40Var);
                btsVar.e0(197364938);
                if (CreateEditFolderDialogRoot$lambda$4 != null) {
                    slsVar4 = slsVar7;
                } else if (((z4f) c.getValue()).a) {
                    btsVar.e0(-949263772);
                    btsVar.e0(-2108828017);
                    boolean e2 = btsVar.e(eVar4);
                    Object Q9 = btsVar.Q();
                    if (e2 || Q9 == obj) {
                        Q9 = new jhd(17, eVar4, oz40Var);
                        btsVar.o0(Q9);
                    }
                    sls slsVar8 = (sls) Q9;
                    btsVar.t(false);
                    btsVar.e0(-2108822964);
                    boolean k5 = btsVar.k(CreateEditFolderDialogRoot$lambda$4) | btsVar.e(tseVar) | btsVar.k(f);
                    Object Q10 = btsVar.Q();
                    if (k5 || Q10 == obj) {
                        final int i13 = 0;
                        Q10 = new sls() { // from class: com.yandex.messaging.ui.folders.b
                            @Override // defpackage.sls
                            public final Object invoke() {
                                zy11 CreateEditFolderDialogRoot$lambda$24$lambda$21$lambda$20;
                                zy11 CreateEditFolderDialogRoot$lambda$24$lambda$23$lambda$22;
                                int i14 = i13;
                                oz40 oz40Var3 = oz40Var;
                                w wVar = f;
                                tse tseVar2 = tseVar;
                                CancelDialogSource cancelDialogSource = CreateEditFolderDialogRoot$lambda$4;
                                switch (i14) {
                                    case 0:
                                        CreateEditFolderDialogRoot$lambda$24$lambda$21$lambda$20 = CreateEditFolderDialogFragment.CreateEditFolderDialogRoot$lambda$24$lambda$21$lambda$20(cancelDialogSource, tseVar2, wVar, oz40Var3);
                                        return CreateEditFolderDialogRoot$lambda$24$lambda$21$lambda$20;
                                    default:
                                        CreateEditFolderDialogRoot$lambda$24$lambda$23$lambda$22 = CreateEditFolderDialogFragment.CreateEditFolderDialogRoot$lambda$24$lambda$23$lambda$22(cancelDialogSource, tseVar2, wVar, oz40Var3);
                                        return CreateEditFolderDialogRoot$lambda$24$lambda$23$lambda$22;
                                }
                            }
                        };
                        btsVar.o0(Q10);
                    }
                    btsVar.t(false);
                    slsVar4 = slsVar7;
                    exa1.a(slsVar4, slsVar8, (sls) Q10, null, btsVar, (i10 >> 3) & 14);
                    btsVar.t(false);
                } else {
                    slsVar4 = slsVar7;
                    btsVar.e0(-948714359);
                    btsVar.e0(-2108809364);
                    boolean k6 = btsVar.k(CreateEditFolderDialogRoot$lambda$4) | btsVar.e(tseVar) | btsVar.k(f);
                    Object Q11 = btsVar.Q();
                    if (k6 || Q11 == obj) {
                        final int i14 = 1;
                        Q11 = new sls() { // from class: com.yandex.messaging.ui.folders.b
                            @Override // defpackage.sls
                            public final Object invoke() {
                                zy11 CreateEditFolderDialogRoot$lambda$24$lambda$21$lambda$20;
                                zy11 CreateEditFolderDialogRoot$lambda$24$lambda$23$lambda$22;
                                int i142 = i14;
                                oz40 oz40Var3 = oz40Var;
                                w wVar = f;
                                tse tseVar2 = tseVar;
                                CancelDialogSource cancelDialogSource = CreateEditFolderDialogRoot$lambda$4;
                                switch (i142) {
                                    case 0:
                                        CreateEditFolderDialogRoot$lambda$24$lambda$21$lambda$20 = CreateEditFolderDialogFragment.CreateEditFolderDialogRoot$lambda$24$lambda$21$lambda$20(cancelDialogSource, tseVar2, wVar, oz40Var3);
                                        return CreateEditFolderDialogRoot$lambda$24$lambda$21$lambda$20;
                                    default:
                                        CreateEditFolderDialogRoot$lambda$24$lambda$23$lambda$22 = CreateEditFolderDialogFragment.CreateEditFolderDialogRoot$lambda$24$lambda$23$lambda$22(cancelDialogSource, tseVar2, wVar, oz40Var3);
                                        return CreateEditFolderDialogRoot$lambda$24$lambda$23$lambda$22;
                                }
                            }
                        };
                        btsVar.o0(Q11);
                    }
                    btsVar.t(false);
                    leb1.a((i10 >> 3) & 14, btsVar, slsVar4, (sls) Q11, null);
                    btsVar.t(false);
                }
                btsVar.t(false);
                if (CreateEditFolderDialogRoot$lambda$7(oz40Var2)) {
                    in91.a(null, wwg.S(1578819023, true, new w4f(i9, eVar4, this, oz40Var2), btsVar), btsVar, 48, 1);
                }
                eVar3 = eVar4;
                slsVar5 = slsVar4;
                f530Var4 = f530Var6;
            } else {
                btsVar.Y();
                f530Var4 = f530Var2;
                slsVar5 = slsVar2;
                eVar3 = eVar2;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new p91(this, f530Var4, slsVar5, eVar3, i, i2, 3);
                return;
            }
            return;
        }
        slsVar2 = slsVar;
        if ((i & 384) != 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i3;
        if ((i4 & 1171) == 1170) {
        }
        btsVar.a0();
        i5 = i & 1;
        obj = did.a;
        int i92 = 0;
        if (i5 != 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if ((i2 & 4) == 0) {
        }
        int i102 = i4;
        btsVar.u();
        c = androidx.lifecycle.compose.a.c(eVar2.E, null, btsVar, 0, 7);
        btsVar.e0(197238349);
        Q = btsVar.Q();
        if (Q == obj) {
        }
        oz40Var = (oz40) Q;
        k = g8e.k(197241145, btsVar, false);
        if (k == obj) {
        }
        oz40Var2 = (oz40) k;
        btsVar.t(false);
        oz40 c22 = mcb1.c(btsVar);
        final w f2 = p.f(6, 2, btsVar, null);
        Q2 = btsVar.Q();
        if (Q2 == obj) {
        }
        final tse tseVar2 = (tse) Q2;
        di9 di9Var2 = eVar2.c;
        btsVar.e0(197249927);
        int i112 = i102 & 112;
        e eVar42 = eVar2;
        if (i112 != 32) {
        }
        Q3 = btsVar.Q();
        if (!z) {
        }
        Q3 = new ic0(15, slsVar3);
        btsVar.o0(Q3);
        btsVar.t(false);
        com.yandex.messaging.core.ui.a.a(di9Var2, (tls) Q3, btsVar, 0);
        btsVar.e0(197257708);
        k2 = btsVar.k(c) | (i112 != 32);
        Q4 = btsVar.Q();
        if (!k2) {
        }
        Q4 = new tls() { // from class: com.yandex.messaging.ui.folders.a
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                zy11 CreateEditFolderDialogRoot$lambda$13$lambda$12;
                CreateEditFolderDialogRoot$lambda$13$lambda$12 = CreateEditFolderDialogFragment.CreateEditFolderDialogRoot$lambda$13$lambda$12(c, slsVar3, oz40Var, (CancelDialogSource) obj2);
                return CreateEditFolderDialogRoot$lambda$13$lambda$12;
            }
        };
        btsVar.o0(Q4);
        tls tlsVar2 = (tls) Q4;
        btsVar.t(false);
        btsVar.e0(197264271);
        k3 = btsVar.k(tlsVar2);
        Q5 = btsVar.Q();
        int i122 = 3;
        if (!k3) {
        }
        Q5 = new azd(i122, tlsVar2);
        btsVar.o0(Q5);
        sls slsVar62 = (sls) Q5;
        btsVar.t(false);
        btsVar.e0(197266992);
        k4 = btsVar.k(tlsVar2);
        Q6 = btsVar.Q();
        if (!k4) {
        }
        Q6 = new azd(4, tlsVar2);
        btsVar.o0(Q6);
        btsVar.t(false);
        qnm qnmVar2 = qnm.a;
        long a22 = qnm.c(btsVar).a();
        long c32 = qnm.c(btsVar).c();
        f530 b22 = i9a1.b(i9a1.g(ljs0.c));
        f530 f530Var62 = f530Var3;
        androidx.compose.runtime.internal.a S2 = wwg.S(288731696, true, new z1c(slsVar62, f530Var3, c22, c, eVar42, oz40Var2), btsVar);
        bts btsVar22 = btsVar;
        sls slsVar72 = slsVar3;
        p.a((sls) Q6, b22, f2, 0.0f, false, null, a22, 0L, c32, null, null, null, S2, btsVar22, 0, 6584);
        btsVar = btsVar22;
        CreateEditFolderDialogRoot$lambda$4 = CreateEditFolderDialogRoot$lambda$4(oz40Var);
        btsVar.e0(197364938);
        if (CreateEditFolderDialogRoot$lambda$4 != null) {
        }
        btsVar.t(false);
        if (CreateEditFolderDialogRoot$lambda$7(oz40Var2)) {
        }
        eVar3 = eVar42;
        slsVar5 = slsVar4;
        f530Var4 = f530Var62;
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 CreateEditFolderDialogRoot$lambda$11$lambda$10(sls slsVar, y4f y4fVar) {
        if (y4fVar instanceof x4f) {
            slsVar.invoke();
            return zy11.a;
        }
        w511.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 CreateEditFolderDialogRoot$lambda$13$lambda$12(m3u0 m3u0Var, sls slsVar, oz40 oz40Var, CancelDialogSource cancelDialogSource) {
        if (((z4f) m3u0Var.getValue()).e) {
            slsVar.invoke();
        } else {
            oz40Var.setValue(cancelDialogSource);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 CreateEditFolderDialogRoot$lambda$15$lambda$14(tls tlsVar) {
        tlsVar.invoke(CancelDialogSource.CloseButton);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 CreateEditFolderDialogRoot$lambda$17$lambda$16(tls tlsVar) {
        tlsVar.invoke(CancelDialogSource.SwipeDismiss);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 CreateEditFolderDialogRoot$lambda$24$lambda$19$lambda$18(e eVar, oz40 oz40Var) {
        oz40Var.setValue(null);
        eVar.getClass();
        tje.N(ds31.a(eVar), null, null, new CreateEditFolderViewModel$saveChanges$1(eVar, null), 3);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 CreateEditFolderDialogRoot$lambda$24$lambda$21$lambda$20(CancelDialogSource cancelDialogSource, tse tseVar, w wVar, oz40 oz40Var) {
        if (cancelDialogSource == CancelDialogSource.SwipeDismiss) {
            tje.N(tseVar, null, null, new CreateEditFolderDialogFragment$CreateEditFolderDialogRoot$4$2$1$1(wVar, null), 3);
        }
        oz40Var.setValue(null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 CreateEditFolderDialogRoot$lambda$24$lambda$23$lambda$22(CancelDialogSource cancelDialogSource, tse tseVar, w wVar, oz40 oz40Var) {
        if (cancelDialogSource == CancelDialogSource.SwipeDismiss) {
            tje.N(tseVar, null, null, new CreateEditFolderDialogFragment$CreateEditFolderDialogRoot$4$3$1$1(wVar, null), 3);
        }
        oz40Var.setValue(null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 CreateEditFolderDialogRoot$lambda$25(CreateEditFolderDialogFragment createEditFolderDialogFragment, f530 f530Var, sls slsVar, e eVar, int i, int i2, fid fidVar, int i3) {
        createEditFolderDialogFragment.CreateEditFolderDialogRoot(f530Var, slsVar, eVar, fidVar, vng.O(i | 1), i2);
        return zy11.a;
    }

    private static final CancelDialogSource CreateEditFolderDialogRoot$lambda$4(oz40 oz40Var) {
        return (CancelDialogSource) oz40Var.getValue();
    }

    private static final boolean CreateEditFolderDialogRoot$lambda$7(oz40 oz40Var) {
        return ((Boolean) oz40Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CreateEditFolderDialogRoot$lambda$8(oz40 oz40Var, boolean z) {
        oz40Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CreateEditFolderDialogRoot$lambda$9(m3u0 m3u0Var) {
        return ((Boolean) m3u0Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hs31 createAddChatViewModelFactory(e viewModel, ec0 args) {
        ccg ccgVar = ((ccg) viewModel.B).b;
        args.getClass();
        g6 g6Var = new g6(n3w.a(args), ccgVar.F0, ccgVar.G0, new k0n(ccgVar.B0, ccgVar.C0, 11), ccgVar.P);
        LinkedHashMap A = gtq0.A(4);
        A.put(lnr0.class, ccgVar.c);
        A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
        A.put(g4f0.class, ccgVar.e);
        A.put(i.class, g6Var);
        return new r720(0, A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
    }

    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    public void DialogContent(f530 f530Var, fid fidVar, int i) {
        Object createEditFolderDialogFragment$DialogContent$1$1;
        CreateEditFolderDialogFragment createEditFolderDialogFragment;
        bts btsVar = (bts) fidVar;
        btsVar.e0(138228309);
        btsVar.e0(-29836735);
        boolean z = (((i & 112) ^ 48) > 32 && btsVar.k(this)) || (i & 48) == 32;
        Object Q = btsVar.Q();
        if (z || Q == did.a) {
            createEditFolderDialogFragment$DialogContent$1$1 = new CreateEditFolderDialogFragment$DialogContent$1$1(0, this, CreateEditFolderDialogFragment.class, "dismiss", "dismiss()V", 0);
            createEditFolderDialogFragment = this;
            btsVar.o0(createEditFolderDialogFragment$DialogContent$1$1);
        } else {
            createEditFolderDialogFragment$DialogContent$1$1 = Q;
            createEditFolderDialogFragment = this;
        }
        btsVar.t(false);
        createEditFolderDialogFragment.CreateEditFolderDialogRoot(null, (sls) ((tfx) createEditFolderDialogFragment$DialogContent$1$1), null, btsVar, (i << 6) & 7168, 5);
        btsVar.t(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getViewModelFactory(Continuation<? super hs31> continuation) {
        CreateEditFolderDialogFragment$getViewModelFactory$1 createEditFolderDialogFragment$getViewModelFactory$1;
        int i;
        if (continuation instanceof CreateEditFolderDialogFragment$getViewModelFactory$1) {
            createEditFolderDialogFragment$getViewModelFactory$1 = (CreateEditFolderDialogFragment$getViewModelFactory$1) continuation;
            int i2 = createEditFolderDialogFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                createEditFolderDialogFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = createEditFolderDialogFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = createEditFolderDialogFragment$getViewModelFactory$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    noh profileComponentAsync = getProfileComponentAsync();
                    createEditFolderDialogFragment$getViewModelFactory$1.L$0 = this;
                    createEditFolderDialogFragment$getViewModelFactory$1.label = 1;
                    obj = profileComponentAsync.k(createEditFolderDialogFragment$getViewModelFactory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (CreateEditFolderDialogFragment) createEditFolderDialogFragment$getViewModelFactory$1.L$0;
                    kotlin.b.b(obj);
                }
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                u4f arguments = this.getArguments();
                arguments.getClass();
                ncb ncbVar = new ncb(n3w.a(arguments), ccgVar.z0, ccgVar.A0, new k0n(ccgVar.B0, ccgVar.C0, 11), ccgVar.D0, ccgVar.u);
                LinkedHashMap A = gtq0.A(4);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(e.class, ncbVar);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        createEditFolderDialogFragment$getViewModelFactory$1 = new CreateEditFolderDialogFragment$getViewModelFactory$1(this, continuation);
        Object obj2 = createEditFolderDialogFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = createEditFolderDialogFragment$getViewModelFactory$1.label;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        u4f arguments2 = this.getArguments();
        arguments2.getClass();
        ncb ncbVar2 = new ncb(n3w.a(arguments2), ccgVar2.z0, ccgVar2.A0, new k0n(ccgVar2.B0, ccgVar2.C0, 11), ccgVar2.D0, ccgVar2.u);
        LinkedHashMap A2 = gtq0.A(4);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(e.class, ncbVar2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }
}
