package com.yandex.messaging.navigation;

import androidx.fragment.app.Fragment;
import defpackage.bab;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.o430;
import defpackage.tls;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class a implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ a(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Fragment fragment = this.b;
        o430 o430Var = did.a;
        int i2 = 1;
        int i3 = 2;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                ComposeBottomSheetDialogFragment composeBottomSheetDialogFragment = (ComposeBottomSheetDialogFragment) fragment;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                bts btsVar2 = (bts) fidVar;
                btsVar2.e0(-602288181);
                boolean e = btsVar2.e(composeBottomSheetDialogFragment);
                Object Q = btsVar2.Q();
                if (e || Q == o430Var) {
                    Q = new ComposeBottomSheetDialogFragment$onCreateView$1$1$1$1(composeBottomSheetDialogFragment, null);
                    btsVar2.o0(Q);
                }
                tls tlsVar = (tls) Q;
                btsVar2.t(false);
                btsVar2.e0(-602285772);
                boolean e2 = btsVar2.e(composeBottomSheetDialogFragment);
                Object Q2 = btsVar2.Q();
                if (e2 || Q2 == o430Var) {
                    Q2 = new ComposeBottomSheetDialogFragment$onCreateView$1$1$2$1(composeBottomSheetDialogFragment, null);
                    btsVar2.o0(Q2);
                }
                btsVar2.t(false);
                com.yandex.messaging.ui.di.a.a(tlsVar, (tls) Q2, wwg.S(296966939, true, new bab(i2, composeBottomSheetDialogFragment), btsVar2), btsVar2, 384);
                break;
            default:
                fid fidVar2 = (fid) obj;
                ComposeMessengerFragment composeMessengerFragment = (ComposeMessengerFragment) fragment;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        break;
                    }
                }
                bts btsVar4 = (bts) fidVar2;
                btsVar4.e0(1952558036);
                boolean k = btsVar4.k(composeMessengerFragment);
                Object Q3 = btsVar4.Q();
                if (k || Q3 == o430Var) {
                    Q3 = new ComposeMessengerFragment$onCreateView$1$1$1$1(composeMessengerFragment, null);
                    btsVar4.o0(Q3);
                }
                tls tlsVar2 = (tls) Q3;
                btsVar4.t(false);
                btsVar4.e0(1952560317);
                boolean k2 = btsVar4.k(composeMessengerFragment);
                Object Q4 = btsVar4.Q();
                if (k2 || Q4 == o430Var) {
                    Q4 = new ComposeMessengerFragment$onCreateView$1$1$2$1(composeMessengerFragment, null);
                    btsVar4.o0(Q4);
                }
                btsVar4.t(false);
                com.yandex.messaging.ui.di.a.a(tlsVar2, (tls) Q4, wwg.S(-365453423, true, new bab(i3, composeMessengerFragment), btsVar4), btsVar4, 384);
                break;
        }
        return zy11Var;
    }
}
