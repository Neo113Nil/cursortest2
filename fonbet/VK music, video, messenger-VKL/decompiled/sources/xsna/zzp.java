package xsna;

import com.google.gson.Gson;
import java.util.Map;

/* compiled from: EventIdGenerator.kt */
/* loaded from: classes11.dex */
public final class zzp {
    public final Object a;

    public zzp(int i) {
        switch (i) {
            case 2:
                this.a = new Gson();
                break;
            default:
                this.a = new bpn0(new r03(3));
                break;
        }
    }

    public String a(Map map) {
        return ((Gson) this.a).toJson(map);
    }

    public zzp(bpn0 bpn0Var) {
        this.a = bpn0Var;
    }
}
