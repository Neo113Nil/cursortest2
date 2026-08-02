package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.work.WorkInfo$State;
import com.yandex.go.suggest.impl.data.flex.document.d;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.analytics.p;
import com.yandex.passport.internal.sso.c;
import com.yandex.passport.internal.sso.g;
import com.yandex.passport.internal.ui.challenge.changecurrent.SetCurrentComposeActivity;
import com.yandex.passport.internal.ui.sloth.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.map_common.map.MapViewInflateStrategy;

/* loaded from: classes8.dex */
public final /* synthetic */ class fgw0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fgw0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        int i3 = 2;
        int i4 = 1;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                bwp0 bwp0Var = (bwp0) obj3;
                d dVar = (d) obj2;
                Map map = (Map) obj;
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put("text", bwp0Var.a);
                mapBuilder.put("search_session_id", dVar.b.a());
                String str = bwp0Var.b;
                if (str != null) {
                }
                mapBuilder.put("style", dVar.d.getIdentifier());
                zvv zvvVar = dVar.c;
                Map map2 = bwp0Var == zvvVar.a ? (Map) zvvVar.c.getAndSet(null) : null;
                if (map2 != null && !map2.isEmpty()) {
                    mapBuilder.putAll(map2);
                }
                map.put("search_context", mapBuilder.j());
                return zy11Var;
            case 1:
                ((d3x0) obj3).b.d((oll0) obj, (b3x0) obj2);
                return zy11Var;
            case 2:
                w3j0 w3j0Var = (w3j0) obj;
                w3j0Var.d("strategy", ((MapViewInflateStrategy) obj3).getEventName());
                w3j0Var.a.put(CRLReasonCodeExtension.REASON, (String) obj2);
                return w3j0Var;
            case 3:
                zx01 zx01Var = (zx01) obj3;
                zx01 zx01Var2 = (zx01) obj2;
                zx01Var.j.add(zx01Var2);
                return new jy01(zx01Var, zx01Var2, 0);
            case 4:
                return new jy01((zx01) obj3, (ox01) obj2, 1);
            case 5:
                ((v951) obj3).b.d((oll0) obj, (u951) obj2);
                return zy11Var;
            case 6:
                WorkInfo$State workInfo$State = (WorkInfo$State) obj3;
                String str2 = (String) obj2;
                oll0 oll0Var = (oll0) obj;
                ull0 T0 = oll0Var.T0("UPDATE workspec SET state=? WHERE id=?");
                try {
                    T0.b(1, gtq0.R(workInfo$State));
                    T0.g1(2, str2);
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 7:
                ong ongVar = (ong) obj3;
                String str3 = (String) obj2;
                ull0 T02 = ((oll0) obj).T0("UPDATE workspec SET output=? WHERE id=?");
                try {
                    ong ongVar2 = ong.b;
                    T02.m(1, bb1.O(ongVar));
                    T02.g1(2, str3);
                    T02.q();
                    return zy11Var;
                } finally {
                }
            case 8:
                String str4 = (String) obj3;
                ia51 ia51Var = (ia51) obj2;
                oll0 oll0Var2 = (oll0) obj;
                ull0 T03 = oll0Var2.T0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)");
                try {
                    T03.g1(1, str4);
                    w53 w53Var = new w53();
                    w53 w53Var2 = new w53();
                    while (T03.q()) {
                        String Y1 = T03.Y1(0);
                        if (!w53Var.containsKey(Y1)) {
                            w53Var.put(Y1, new ArrayList());
                        }
                        String Y12 = T03.Y1(0);
                        if (!w53Var2.containsKey(Y12)) {
                            w53Var2.put(Y12, new ArrayList());
                        }
                    }
                    T03.reset();
                    ia51Var.b(oll0Var2, w53Var);
                    ia51Var.a(oll0Var2, w53Var2);
                    ArrayList arrayList = new ArrayList();
                    while (T03.q()) {
                        String Y13 = T03.Y1(i2);
                        WorkInfo$State s = gtq0.s((int) T03.getLong(i4));
                        byte[] blob = T03.getBlob(i3);
                        ong ongVar3 = ong.b;
                        w53 w53Var3 = w53Var2;
                        arrayList.add(new ea51(Y13, s, bb1.l(blob), T03.getLong(14), T03.getLong(15), T03.getLong(16), new k8e(gtq0.U(T03.getBlob(6)), gtq0.q((int) T03.getLong(5)), ((int) T03.getLong(7)) != 0, ((int) T03.getLong(8)) != 0, ((int) T03.getLong(9)) != 0, ((int) T03.getLong(10)) != 0, T03.getLong(11), T03.getLong(12), gtq0.d(T03.getBlob(13))), (int) T03.getLong(3), gtq0.p((int) T03.getLong(17)), T03.getLong(18), T03.getLong(19), (int) T03.getLong(20), (int) T03.getLong(4), T03.getLong(21), (int) T03.getLong(22), (List) b.g(T03.Y1(0), w53Var), (List) b.g(T03.Y1(0), w53Var3)));
                        w53Var2 = w53Var3;
                        i2 = 0;
                        i3 = 2;
                        i4 = 1;
                    }
                    return arrayList;
                } catch (Throwable th) {
                    throw th;
                }
            case 9:
                ((ia51) obj3).b.d((oll0) obj, (fa51) obj2);
                return zy11Var;
            case 10:
                ((ka51) obj3).b.d((oll0) obj, (ja51) obj2);
                return zy11Var;
            case 11:
                Exception exc = (Exception) obj;
                String a = ((c) obj2).a();
                c0 c0Var = ((g) obj3).c;
                if (c0Var != null) {
                    p pVar = p.c;
                    w53 w53Var4 = new w53();
                    w53Var4.put("remote_package_name", a);
                    w53Var4.put("error", Log.getStackTraceString(exc));
                    c0Var.a.a(pVar, w53Var4);
                }
                return zy11Var;
            default:
                SetCurrentComposeActivity setCurrentComposeActivity = (SetCurrentComposeActivity) obj2;
                Boolean bool = (Boolean) obj;
                Uid uid = ((com.yandex.passport.internal.ui.challenge.changecurrent.g) obj3).a;
                Boolean bool2 = Boolean.TRUE;
                if (!jl40.l(bool, bool2)) {
                    uid = null;
                }
                int i5 = jl40.l(bool, bool2) ? -1 : 6;
                Bundle q = uid != null ? e.q(com.yandex.passport.internal.util.p.A(uid)) : null;
                Intent intent = new Intent();
                if (q != null) {
                    intent.putExtras(q);
                }
                setCurrentComposeActivity.setResult(i5, intent);
                setCurrentComposeActivity.finish();
                return zy11Var;
        }
    }
}
