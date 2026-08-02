package xsna;

import com.vk.core.preference.Preference;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class nyw implements gzs {
    public final /* synthetic */ JSONObject b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ nyw(JSONObject jSONObject, boolean z) {
        this.b = jSONObject;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z;
        pyw pywVar = new pyw(this.c);
        ow90.e.getClass();
        long m = Preference.m(-1L, "performance", "__app_performance_was_anr_or_crashed__");
        if (m != -1) {
            if (m >= 3) {
                Preference.C("performance", "__app_performance_was_anr_or_crashed__");
            } else {
                Preference.F(m + 1, "performance", "__app_performance_was_anr_or_crashed__");
            }
            o2l.a.getClass();
            if (!o2l.b("__dbg_allow_iar_with_crashes", false)) {
                z = true;
                o2l.a.getClass();
                com.vk.inappreview.impl.a.a(this.b, pywVar, z, o2l.b("__dbg_allow_iar_with_crashes", false) ? 0L : Preference.m(0L, "performance", "__app_performance_anr_or_crashed_time__"));
                return s3q0.a;
            }
        }
        z = false;
        o2l.a.getClass();
        com.vk.inappreview.impl.a.a(this.b, pywVar, z, o2l.b("__dbg_allow_iar_with_crashes", false) ? 0L : Preference.m(0L, "performance", "__app_performance_anr_or_crashed_time__"));
        return s3q0.a;
    }
}
