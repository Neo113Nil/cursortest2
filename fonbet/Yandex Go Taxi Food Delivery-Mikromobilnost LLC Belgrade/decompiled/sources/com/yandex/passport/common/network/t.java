package com.yandex.passport.common.network;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.data.models.UserInfoData;
import com.yandex.passport.data.network.o0;
import com.yandex.passport.data.network.q0;
import com.yandex.passport.internal.methods.d1;
import com.yandex.passport.internal.methods.e1;
import com.yandex.passport.internal.methods.g1;
import com.yandex.passport.internal.methods.n1;
import com.yandex.passport.internal.methods.o1;
import com.yandex.passport.internal.methods.w1;
import com.yandex.passport.internal.methods.w2;
import defpackage.acx;
import defpackage.tls;
import defpackage.zy11;
import kotlin.collections.EmptySet;

/* loaded from: classes8.dex */
public final /* synthetic */ class t implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ t(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 json$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                acx acxVar = (acx) obj;
                acxVar.c = true;
                acxVar.a = true;
                return zy11Var;
            case 1:
                json$lambda$0 = UserInfoData.json$lambda$0((acx) obj);
                return json$lambda$0;
            case 2:
                return q0.e((o0) obj);
            case 3:
                return q0.e((o0) obj);
            case 4:
                acx acxVar2 = (acx) obj;
                acxVar2.c = true;
                acxVar2.m = true;
                return zy11Var;
            case 5:
                ((acx) obj).c = true;
                return zy11Var;
            case 6:
                return EmptySet.a;
            case 7:
                return null;
            case 8:
                ((acx) obj).c = true;
                return zy11Var;
            case 9:
                return d1.b;
            case 10:
                return e1.b;
            case 11:
                return w1.b;
            case 12:
                return w2.b;
            case 13:
                return g1.b;
            case 14:
                return o1.b;
            case 15:
                return n1.b;
            default:
                Uid uid = (Uid) obj;
                if (uid == null) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(uid.getEnvironment().getInteger());
                sb.append(':');
                sb.append(uid.getValue());
                return sb.toString();
        }
    }
}
