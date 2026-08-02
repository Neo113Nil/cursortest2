package defpackage;

import com.squareup.moshi.Types;
import com.yandex.messaging.core.net.entities.Bucket;
import com.yandex.messaging.core.net.entities.BucketsData;
import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.core.net.entities.GetUserGapsParam;
import com.yandex.messaging.core.net.entities.SearchData;
import com.yandex.messaging.core.net.entities.SearchParams;
import com.yandex.messaging.core.net.entities.UserGap;
import com.yandex.messaging.core.net.entities.UserGaps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public final class jo3 extends w920 {
    public final /* synthetic */ int a;
    public final /* synthetic */ to3 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public jo3(yjt yjtVar, to3 to3Var, SearchParams searchParams, ho3 ho3Var) {
        this.a = 2;
        this.c = yjtVar;
        this.b = to3Var;
        this.w = searchParams;
        this.x = ho3Var;
    }

    @Override // defpackage.w920
    public final gg70 d(kvj0 kvj0Var) {
        UserGap[] userGapArr;
        Object g;
        Bucket a;
        int i = this.a;
        Object obj = this.c;
        to3 to3Var = this.b;
        switch (i) {
            case 0:
                gg70 b = ouu.b(to3Var.b, "change_chat_avatar/%s", ChatData.class, kvj0Var);
                return b instanceof dg70 ? new dg70(((dg70) b).a) : new fg70(b.c(), 1);
            case 1:
                String str = (String) obj;
                gg70 b2 = ouu.b(to3Var.b, "staff_proxy", Types.newParameterizedType(Map.class, String.class, UserGaps.class), kvj0Var);
                if (!(b2 instanceof dg70)) {
                    return gg70.b(404, "User not found");
                }
                Object obj2 = ((dg70) b2).a;
                if (((Map) obj2).get(str) == null) {
                    g = new ArrayList();
                } else {
                    UserGaps userGaps = (UserGaps) ((Map) obj2).get(str);
                    if (userGaps == null || (userGapArr = userGaps.gaps) == null) {
                        userGapArr = new UserGap[0];
                    }
                    g = scc.g(Arrays.copyOf(userGapArr, userGapArr.length));
                }
                return new dg70(g);
            case 2:
                yjt yjtVar = (yjt) obj;
                if (yjtVar != null) {
                    yjtVar.a(3);
                }
                gg70 b3 = ouu.b(to3Var.b, "search", SearchData.class, kvj0Var);
                if (yjtVar != null) {
                    yjtVar.a(4);
                }
                return b3;
            default:
                gg70 b4 = ouu.b(to3Var.b, "set_bucket", BucketsData.class, kvj0Var);
                return (!(b4 instanceof dg70) || (a = ((BucketsData) ((dg70) b4).a).a((Class) this.w)) == null) ? gg70.b(kvj0Var.w, kvj0Var.c) : new dg70(a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.w920
    public boolean e(ngz ngzVar) {
        int i = this.a;
        Object obj = this.x;
        switch (i) {
            case 0:
                return false;
            case 1:
            default:
                return super.e(ngzVar);
            case 2:
                ((ho3) obj).mo103c(ngzVar.b);
                return false;
            case 3:
                eo3 eo3Var = (eo3) obj;
                if (ngzVar.b == 409) {
                    eo3Var.k();
                    return false;
                }
                eo3Var.d();
                return true;
        }
    }

    @Override // defpackage.w920
    public final void g(Object obj) {
        int i = this.a;
        Object obj2 = this.x;
        switch (i) {
            case 0:
                ((p1b) obj2).D((ChatData) obj);
                break;
            case 1:
                ((bp5) obj2).D((List) obj);
                break;
            case 2:
                ((ho3) obj2).D((SearchData) obj);
                break;
            default:
                ((eo3) obj2).j((Bucket) obj);
                break;
        }
    }

    @Override // defpackage.w920
    public final t4j0 i() {
        int i = this.a;
        Object obj = this.w;
        Object obj2 = this.c;
        to3 to3Var = this.b;
        switch (i) {
            case 0:
                evu evuVar = to3Var.c;
                String format = String.format("change_chat_avatar/%s", Arrays.copyOf(new Object[]{(String) obj2}, 1));
                evuVar.getClass();
                t4j0 c = evuVar.c(format, new HashMap());
                c.e("POST", (gwd) obj);
                return c;
            case 1:
                return to3Var.b.a((GetUserGapsParam) obj, "staff_proxy");
            case 2:
                yjt yjtVar = (yjt) obj2;
                if (yjtVar != null) {
                    yjtVar.a(2);
                }
                return to3Var.b.a((SearchParams) obj, "search");
            default:
                return to3Var.b.a((Bucket) obj2, "set_bucket");
        }
    }

    public /* synthetic */ jo3(to3 to3Var, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = to3Var;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
    }

    public jo3(to3 to3Var, GetUserGapsParam getUserGapsParam, String str, bp5 bp5Var) {
        this.a = 1;
        this.b = to3Var;
        this.w = getUserGapsParam;
        this.c = str;
        this.x = bp5Var;
    }
}
