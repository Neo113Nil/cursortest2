package com.yandex.messaging.ui.folders.selectDialog;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.f;
import com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment;
import com.yx360.design.compose.atoms.DsListItem$Divider;
import defpackage.add;
import defpackage.aii0;
import defpackage.arm;
import defpackage.bts;
import defpackage.c530;
import defpackage.ccg;
import defpackage.crm;
import defpackage.did;
import defpackage.egb;
import defpackage.f530;
import defpackage.fid;
import defpackage.g4f0;
import defpackage.gtq0;
import defpackage.hs31;
import defpackage.i9a1;
import defpackage.jjo;
import defpackage.kt11;
import defpackage.ldc;
import defpackage.lnr0;
import defpackage.m3u0;
import defpackage.m6y;
import defpackage.mbq0;
import defpackage.mrm;
import defpackage.n3w;
import defpackage.nbq0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o430;
import defpackage.obq0;
import defpackage.ohb1;
import defpackage.ooc;
import defpackage.oqm;
import defpackage.oyh0;
import defpackage.p91;
import defpackage.pbq0;
import defpackage.q1z;
import defpackage.q7u;
import defpackage.qbq0;
import defpackage.qc0;
import defpackage.qnm;
import defpackage.qoi0;
import defpackage.r720;
import defpackage.rbq0;
import defpackage.rc0;
import defpackage.rs31;
import defpackage.sbq0;
import defpackage.sc0;
import defpackage.sfl0;
import defpackage.sls;
import defpackage.srm;
import defpackage.tfx;
import defpackage.tls;
import defpackage.twr;
import defpackage.tyo0;
import defpackage.u3a1;
import defpackage.u6y;
import defpackage.ubq0;
import defpackage.vfc;
import defpackage.vng;
import defpackage.w0q0;
import defpackage.w4;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wrh;
import defpackage.wwg;
import defpackage.xs4;
import defpackage.ybg;
import defpackage.yr31;
import defpackage.yrm;
import defpackage.z9b;
import defpackage.zwv;
import defpackage.zy11;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0003¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0094@¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0015¢\u0006\u0004\b!\u0010\"¨\u0006%²\u0006\f\u0010$\u001a\u00020#8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/yandex/messaging/ui/folders/selectDialog/SelectFolderDialogFragment;", "Lcom/yandex/messaging/navigation/ComposeBottomSheetDialogFragment;", "Lmbq0;", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Lnoh;Lnoh;)V", "Lf530;", "modifier", "Lkotlin/Function0;", "Lzy11;", "onDismissRequest", "SelectFolderDialogRoot", "(Lf530;Lsls;Lfid;II)V", "Lcom/yandex/messaging/ui/folders/selectDialog/e;", "viewModel", "SelectFolderDialogContent", "(Lf530;Lcom/yandex/messaging/ui/folders/selectDialog/e;Lsls;Lfid;II)V", "Ltwr;", "folder", "onClick", "", "isLastElement", "FolderListItem", "(Ltwr;Lsls;Lf530;ZLfid;II)V", "CreateFolderListItem", "(Lsls;Lf530;Lfid;II)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DialogContent", "(Lf530;Lfid;I)V", "Lsbq0;", "uiState", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SelectFolderDialogFragment extends ComposeBottomSheetDialogFragment<mbq0> {
    public static final int $stable = 0;

    public static final class a implements tls {
        public static final a a = new a();

        @Override // defpackage.tls
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    public SelectFolderDialogFragment(noh nohVar, noh nohVar2) {
        super(nohVar, nohVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void CreateFolderListItem(sls slsVar, f530 f530Var, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2023992089);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.e(slsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
            f530Var2 = f530Var;
        } else {
            f530 f530Var3 = i4 != 0 ? c530.a : f530Var;
            int i5 = i3;
            String e = ohb1.e(btsVar, oyh0.create_new_folder_btn);
            qnm qnmVar = qnm.a;
            crm crmVar = new crm(e, new ldc(qnm.b(btsVar).i), 6, 1);
            add.a.getClass();
            mrm.f(crmVar, arm.a, f530Var3, oqm.a, false, add.c, null, slsVar, btsVar, ((i5 << 3) & 896) | 199728 | ((i5 << 24) & 234881024), 208);
            f530Var2 = f530Var3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nbq0(this, slsVar, f530Var2, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 CreateFolderListItem$lambda$17(SelectFolderDialogFragment selectFolderDialogFragment, sls slsVar, f530 f530Var, int i, int i2, fid fidVar, int i3) {
        selectFolderDialogFragment.CreateFolderListItem(slsVar, f530Var, fidVar, vng.O(i | 1), i2);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FolderListItem(twr twrVar, sls slsVar, f530 f530Var, boolean z, fid fidVar, int i, int i2) {
        int i3;
        sls slsVar2;
        f530 f530Var2;
        int i4;
        boolean z2;
        androidx.compose.runtime.internal.a aVar;
        f530 f530Var3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-391251898);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(twrVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            slsVar2 = slsVar;
        } else {
            slsVar2 = slsVar;
            if ((i & 48) == 0) {
                i3 |= btsVar.e(slsVar2) ? 32 : 16;
            }
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                z2 = z;
                i3 |= btsVar.a(z2) ? 2048 : 1024;
                if ((i3 & 1171) == 1170 || !btsVar.E()) {
                    f530 f530Var4 = i5 != 0 ? c530.a : f530Var2;
                    boolean z3 = i4 != 0 ? false : z2;
                    crm crmVar = new crm(twrVar.b, null, 14, 1);
                    if (twrVar.e) {
                        add.a.getClass();
                        aVar = add.b;
                    } else {
                        aVar = null;
                    }
                    mrm.f(crmVar, arm.a, f530Var4, oqm.a, false, aVar, z3 ? DsListItem$Divider.Compact : null, slsVar2, btsVar, (i3 & 896) | 3120 | ((i3 << 21) & 234881024), 144);
                    z2 = z3;
                    f530Var3 = f530Var4;
                } else {
                    btsVar.Y();
                    f530Var3 = f530Var2;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new egb(this, twrVar, slsVar, f530Var3, z2, i, i2);
                    return;
                }
                return;
            }
            z2 = z;
            if ((i3 & 1171) == 1170) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            crm crmVar2 = new crm(twrVar.b, null, 14, 1);
            if (twrVar.e) {
            }
            if (z3) {
            }
            mrm.f(crmVar2, arm.a, f530Var4, oqm.a, false, aVar, z3 ? DsListItem$Divider.Compact : null, slsVar2, btsVar, (i3 & 896) | 3120 | ((i3 << 21) & 234881024), 144);
            z2 = z3;
            f530Var3 = f530Var4;
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i3 & 1171) == 1170) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        crm crmVar22 = new crm(twrVar.b, null, 14, 1);
        if (twrVar.e) {
        }
        if (z3) {
        }
        mrm.f(crmVar22, arm.a, f530Var4, oqm.a, false, aVar, z3 ? DsListItem$Divider.Compact : null, slsVar2, btsVar, (i3 & 896) | 3120 | ((i3 << 21) & 234881024), 144);
        z2 = z3;
        f530Var3 = f530Var4;
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 FolderListItem$lambda$16(SelectFolderDialogFragment selectFolderDialogFragment, twr twrVar, sls slsVar, f530 f530Var, boolean z, int i, int i2, fid fidVar, int i3) {
        selectFolderDialogFragment.FolderListItem(twrVar, slsVar, f530Var, z, fidVar, vng.O(i | 1), i2);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void SelectFolderDialogContent(f530 f530Var, e eVar, sls slsVar, fid fidVar, int i, int i2) {
        int i3;
        bts btsVar;
        e eVar2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1141521711);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar2.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && btsVar2.e(eVar)) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar2.e(slsVar) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.k(this) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && btsVar2.E()) {
            btsVar2.Y();
            aii0 v = btsVar2.v();
            if (v != null) {
                v.d = new p91(this, f530Var, eVar, slsVar, i, i2, 11);
                return;
            }
            return;
        }
        btsVar2.a0();
        if ((i & 1) == 0 || btsVar2.C()) {
            int i5 = i2 & 2;
            o430 o430Var = did.a;
            if (i5 != 0) {
                btsVar2.e0(-897180073);
                rs31 b = jjo.b(btsVar2);
                hs31 a2 = jjo.a(btsVar2);
                btsVar2.e0(544794079);
                boolean e = btsVar2.e(a2);
                Object Q = btsVar2.Q();
                if (e || Q == o430Var) {
                    Q = new w4(a2, 22);
                    btsVar2.o0(Q);
                }
                btsVar2.t(false);
                btsVar = btsVar2;
                yr31 G = ooc.G(qoi0.a(e.class), b, null, vfc.h(e.class, new zwv(), (tls) Q), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
                btsVar.t(false);
                eVar2 = (e) G;
            } else {
                btsVar = btsVar2;
                eVar2 = eVar;
            }
            if (i4 != 0) {
                btsVar.e0(-1568736098);
                Object Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    Q2 = new w0q0(24);
                    btsVar.o0(Q2);
                }
                btsVar.t(false);
            }
        } else {
            btsVar2.Y();
            btsVar = btsVar2;
            eVar2 = eVar;
        }
        btsVar.u();
        f.b(eVar2.B, btsVar);
        btsVar.m(q1z.a).getClass();
        ny61.u();
    }

    private static final zy11 SelectFolderDialogContent$lambda$13$lambda$12(m3u0 m3u0Var, SelectFolderDialogFragment selectFolderDialogFragment, e eVar, u6y u6yVar) {
        List list = SelectFolderDialogContent$lambda$6(m3u0Var).a;
        tyo0 tyo0Var = new tyo0(21);
        a aVar = a.a;
        ((m6y) u6yVar).f(list.size(), new qc0(list, 29, tyo0Var), new rc0(list, 14, aVar), new androidx.compose.runtime.internal.a(802480018, new sc0(list, selectFolderDialogFragment, eVar, m3u0Var, 4), true));
        if (SelectFolderDialogContent$lambda$6(m3u0Var).b) {
            u6y.b(u6yVar, null, new androidx.compose.runtime.internal.a(-1804567041, new z9b(18, selectFolderDialogFragment, eVar), true), 3);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 SelectFolderDialogContent$lambda$14(SelectFolderDialogFragment selectFolderDialogFragment, f530 f530Var, e eVar, sls slsVar, int i, int i2, fid fidVar, int i3) {
        selectFolderDialogFragment.SelectFolderDialogContent(f530Var, eVar, slsVar, fidVar, vng.O(i | 1), i2);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sbq0 SelectFolderDialogContent$lambda$6(m3u0 m3u0Var) {
        return (sbq0) m3u0Var.getValue();
    }

    private static final zy11 SelectFolderDialogContent$lambda$8$lambda$7(sls slsVar, sfl0 sfl0Var, Context context, rbq0 rbq0Var) {
        if (rbq0Var instanceof pbq0) {
            slsVar.invoke();
            sfl0Var.getClass();
        } else if (rbq0Var instanceof obq0) {
            slsVar.invoke();
        } else {
            if (!(rbq0Var instanceof qbq0)) {
                w511.b();
                return null;
            }
            Toast.makeText(context, ((qbq0) rbq0Var).a.a(context), 0).show();
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void SelectFolderDialogRoot(f530 f530Var, sls slsVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        sls slsVar2;
        sls slsVar3;
        sls slsVar4;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-978951656);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            slsVar2 = slsVar;
            i3 |= btsVar.e(slsVar2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= btsVar.k(this) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !btsVar.E()) {
                f530 f530Var3 = i4 == 0 ? c530.a : f530Var2;
                if (i5 == 0) {
                    btsVar.e0(606681825);
                    Object Q = btsVar.Q();
                    if (Q == did.a) {
                        Q = new w0q0(25);
                        btsVar.o0(Q);
                    }
                    btsVar.t(false);
                    slsVar3 = (sls) Q;
                } else {
                    slsVar3 = slsVar2;
                }
                com.yx360.design.compose.atoms.modal.a.a(slsVar3, u3a1.d(i9a1.f(f530Var3), "add_to_folder_dialog"), srm.a, ohb1.e(btsVar, oyh0.add_to_folder_btn_text), null, null, null, yrm.f(btsVar), wwg.S(-1618204444, true, new xs4(8, this, slsVar3), btsVar), btsVar, ((i3 >> 3) & 14) | 817889280, 112);
                f530Var2 = f530Var3;
                slsVar4 = slsVar3;
            } else {
                btsVar.Y();
                slsVar4 = slsVar2;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new nbq0(this, f530Var2, slsVar4, i, i2);
                return;
            }
            return;
        }
        slsVar2 = slsVar;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        com.yx360.design.compose.atoms.modal.a.a(slsVar3, u3a1.d(i9a1.f(f530Var3), "add_to_folder_dialog"), srm.a, ohb1.e(btsVar, oyh0.add_to_folder_btn_text), null, null, null, yrm.f(btsVar), wwg.S(-1618204444, true, new xs4(8, this, slsVar3), btsVar), btsVar, ((i3 >> 3) & 14) | 817889280, 112);
        f530Var2 = f530Var3;
        slsVar4 = slsVar3;
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 SelectFolderDialogRoot$lambda$3(SelectFolderDialogFragment selectFolderDialogFragment, f530 f530Var, sls slsVar, int i, int i2, fid fidVar, int i3) {
        selectFolderDialogFragment.SelectFolderDialogRoot(f530Var, slsVar, fidVar, vng.O(i | 1), i2);
        return zy11.a;
    }

    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    public void DialogContent(f530 f530Var, fid fidVar, int i) {
        Object selectFolderDialogFragment$DialogContent$1$1;
        SelectFolderDialogFragment selectFolderDialogFragment;
        bts btsVar = (bts) fidVar;
        btsVar.e0(508228011);
        btsVar.e0(70455759);
        boolean z = (((i & 112) ^ 48) > 32 && btsVar.k(this)) || (i & 48) == 32;
        Object Q = btsVar.Q();
        if (z || Q == did.a) {
            selectFolderDialogFragment$DialogContent$1$1 = new SelectFolderDialogFragment$DialogContent$1$1(0, this, SelectFolderDialogFragment.class, "dismiss", "dismiss()V", 0);
            selectFolderDialogFragment = this;
            btsVar.o0(selectFolderDialogFragment$DialogContent$1$1);
        } else {
            selectFolderDialogFragment$DialogContent$1$1 = Q;
            selectFolderDialogFragment = this;
        }
        btsVar.t(false);
        selectFolderDialogFragment.SelectFolderDialogRoot(null, (sls) ((tfx) selectFolderDialogFragment$DialogContent$1$1), btsVar, (i << 3) & 896, 1);
        btsVar.t(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getViewModelFactory(Continuation<? super hs31> continuation) {
        SelectFolderDialogFragment$getViewModelFactory$1 selectFolderDialogFragment$getViewModelFactory$1;
        int i;
        if (continuation instanceof SelectFolderDialogFragment$getViewModelFactory$1) {
            selectFolderDialogFragment$getViewModelFactory$1 = (SelectFolderDialogFragment$getViewModelFactory$1) continuation;
            int i2 = selectFolderDialogFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectFolderDialogFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectFolderDialogFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectFolderDialogFragment$getViewModelFactory$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    noh profileComponentAsync = getProfileComponentAsync();
                    selectFolderDialogFragment$getViewModelFactory$1.L$0 = this;
                    selectFolderDialogFragment$getViewModelFactory$1.label = 1;
                    obj = profileComponentAsync.k(selectFolderDialogFragment$getViewModelFactory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (SelectFolderDialogFragment) selectFolderDialogFragment$getViewModelFactory$1.L$0;
                    kotlin.b.b(obj);
                }
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                mbq0 arguments = this.getArguments();
                arguments.getClass();
                n3w a2 = n3w.a(arguments);
                ybg ybgVar = ccgVar.x;
                ybg ybgVar2 = ccgVar.y;
                ybg ybgVar3 = ccgVar.j;
                ubq0 ubq0Var = new ubq0(a2, new wrh(ybgVar, ybgVar2, ybgVar3, 24), new wrh(ybgVar, ybgVar2, ybgVar3, 23), ccgVar.H0, ccgVar.I0, ccgVar.E, ccgVar.P, 0);
                LinkedHashMap A = gtq0.A(4);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(e.class, ubq0Var);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        selectFolderDialogFragment$getViewModelFactory$1 = new SelectFolderDialogFragment$getViewModelFactory$1(this, continuation);
        Object obj2 = selectFolderDialogFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectFolderDialogFragment$getViewModelFactory$1.label;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        mbq0 arguments2 = this.getArguments();
        arguments2.getClass();
        n3w a22 = n3w.a(arguments2);
        ybg ybgVar4 = ccgVar2.x;
        ybg ybgVar22 = ccgVar2.y;
        ybg ybgVar32 = ccgVar2.j;
        ubq0 ubq0Var2 = new ubq0(a22, new wrh(ybgVar4, ybgVar22, ybgVar32, 24), new wrh(ybgVar4, ybgVar22, ybgVar32, 23), ccgVar2.H0, ccgVar2.I0, ccgVar2.E, ccgVar2.P, 0);
        LinkedHashMap A2 = gtq0.A(4);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(e.class, ubq0Var2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }
}
