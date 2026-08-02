package com.yandex.passport.internal.sloth.performers.usermenu;

import com.yandex.passport.sloth.command.t;
import defpackage.evu0;
import defpackage.fyc;
import defpackage.tls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ fyc b;

    public /* synthetic */ c(fyc fycVar, int i) {
        this.a = i;
        this.b = fycVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        fyc fycVar = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                if (str != null && !evu0.J(str)) {
                    fycVar.T(com.yandex.passport.internal.ui.sloth.e.b(new Pair("command", str)));
                    break;
                } else {
                    fycVar.T(new com.yandex.passport.sloth.command.b(new JSONObject()));
                    break;
                }
                break;
            case 1:
                fycVar.T(new t((Map) obj));
                break;
            default:
                String str2 = (String) obj;
                if (str2 != null && !evu0.J(str2)) {
                    fycVar.T(com.yandex.passport.internal.ui.sloth.e.b(new Pair("phoneNumber", str2)));
                    break;
                } else {
                    fycVar.T(new com.yandex.passport.sloth.command.b(new JSONObject()));
                    break;
                }
        }
        return zy11Var;
    }
}
