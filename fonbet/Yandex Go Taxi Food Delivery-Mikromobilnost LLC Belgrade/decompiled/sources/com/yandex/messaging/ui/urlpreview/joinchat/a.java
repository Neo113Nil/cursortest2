package com.yandex.messaging.ui.urlpreview.joinchat;

import defpackage.bab;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.o430;
import defpackage.p9x;
import defpackage.r9x;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tls;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class a implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ JoinWallFragment b;

    public /* synthetic */ a(JoinWallFragment joinWallFragment, int i) {
        this.a = i;
        this.b = joinWallFragment;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        p9x args;
        p9x args2;
        p9x args3;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        o430 o430Var = did.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                JoinWallFragment joinWallFragment = this.b;
                args = joinWallFragment.getArgs();
                String str = args.b;
                args2 = joinWallFragment.getArgs();
                String str2 = args2.c;
                args3 = joinWallFragment.getArgs();
                String str3 = args3.d;
                bts btsVar2 = (bts) fidVar;
                btsVar2.e0(-1165374760);
                boolean e = btsVar2.e(joinWallFragment);
                Object Q = btsVar2.Q();
                if (e || Q == o430Var) {
                    Q = new JoinWallFragment$onCreateView$1$1$3$1$1$1(0, joinWallFragment, JoinWallFragment.class, "dismiss", "dismiss()V", 0);
                    btsVar2.o0(Q);
                }
                btsVar2.t(false);
                r9x.a(str, str2, str3, (sls) ((tfx) Q), btsVar2, 0);
                break;
            default:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        break;
                    }
                }
                bts btsVar4 = (bts) fidVar2;
                btsVar4.e0(-1858118038);
                JoinWallFragment joinWallFragment2 = this.b;
                boolean e2 = btsVar4.e(joinWallFragment2);
                Object Q2 = btsVar4.Q();
                if (e2 || Q2 == o430Var) {
                    Q2 = new JoinWallFragment$onCreateView$1$1$1$1(joinWallFragment2, null);
                    btsVar4.o0(Q2);
                }
                tls tlsVar = (tls) Q2;
                btsVar4.t(false);
                btsVar4.e0(-1858115629);
                boolean e3 = btsVar4.e(joinWallFragment2);
                Object Q3 = btsVar4.Q();
                if (e3 || Q3 == o430Var) {
                    Q3 = new JoinWallFragment$onCreateView$1$1$2$1(joinWallFragment2, null);
                    btsVar4.o0(Q3);
                }
                btsVar4.t(false);
                com.yandex.messaging.ui.di.a.a(tlsVar, (tls) Q3, wwg.S(1038381054, true, new bab(5, joinWallFragment2), btsVar4), btsVar4, 384);
                break;
        }
        return zy11Var;
    }
}
