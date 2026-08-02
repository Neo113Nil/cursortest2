package defpackage;

import androidx.compose.ui.semantics.f;
import com.yandex.mapkit.navigation.transport.Navigation;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final /* synthetic */ class lv21 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ lv21(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        int i = this.a;
        int i2 = 26;
        boolean z = false;
        zy11 zy11Var = zy11.a;
        String str = this.b;
        switch (i) {
            case 0:
                T0 = ((oll0) obj).T0("SELECT has_contact FROM users_to_talk WHERE user_id = ?");
                try {
                    T0.g1(1, str);
                    if (T0.q()) {
                        if (((int) T0.getLong(0)) != 0) {
                            z = true;
                        }
                    }
                    T0.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 1:
                mnq0 mnq0Var = (mnq0) obj;
                f.p(mnq0Var, 0);
                f.l(mnq0Var, str);
                return zy11Var;
            case 2:
                ((vw20) obj).a.r(new vsq(str, i2));
                return zy11Var;
            case 3:
                ((vw20) obj).a.r(new vsq(str, i2));
                return zy11Var;
            case 4:
                ((Navigation) obj).resolveUri(str);
                return zy11Var;
            case 5:
                T0 = ((oll0) obj).T0("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    T0.g1(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        arrayList.add(T0.Y1(0));
                    }
                    return arrayList;
                } finally {
                }
            case 6:
                oll0 oll0Var = (oll0) obj;
                T0 = oll0Var.T0("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    T0.g1(1, str);
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 7:
                oll0 oll0Var2 = (oll0) obj;
                T0 = oll0Var2.T0("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    T0.g1(1, str);
                    T0.q();
                    int x2 = jx81.x(oll0Var2);
                    T0.close();
                    return Integer.valueOf(x2);
                } finally {
                }
            case 8:
                T0 = ((oll0) obj).T0("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    T0.g1(1, str);
                    T0.q();
                    return zy11Var;
                } finally {
                }
            default:
                T0 = ((oll0) obj).T0("DELETE FROM worktag WHERE work_spec_id=?");
                try {
                    T0.g1(1, str);
                    T0.q();
                    return zy11Var;
                } finally {
                }
        }
    }
}
