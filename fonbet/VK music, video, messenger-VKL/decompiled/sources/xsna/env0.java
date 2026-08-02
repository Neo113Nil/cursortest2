package xsna;

import com.vk.superapp.vksteps.utils.enums.AccountSyncState;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import org.json.JSONObject;
import xsna.pgn0;

/* compiled from: VkStepsUserStore.kt */
/* loaded from: classes11.dex */
public final class env0 {
    public static final /* synthetic */ qcy<Object>[] b;
    public final tw8 a = new tw8("VkStepsUserStore", "pref_vk_run_account_id_and_user_id");

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(env0.class, "stringPrefProperty", "getStringPrefProperty()Ljava/lang/String;", 0);
        fpf0.a.getClass();
        b = new qcy[]{mutablePropertyReference1Impl};
    }

    public final AccountSyncState a() {
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        int i = pgn0.a.a;
        long j = wdx0Var.c().b.b;
        qcy<Object> qcyVar = b[0];
        String b2 = this.a.b();
        return b2.length() > 0 ? new JSONObject(b2).getLong("vk_user_id") != j ? AccountSyncState.NEW_USER_ID : AccountSyncState.SYNC_AVAILABLE : AccountSyncState.NONE;
    }

    public final void b(String str) {
        if (a() == AccountSyncState.NONE) {
            wdx0 wdx0Var = e370.f;
            if (wdx0Var == null) {
                wdx0Var = null;
            }
            int i = pgn0.a.a;
            long j = wdx0Var.c().b.b;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vk_user_id", j);
            jSONObject.put("vk_run_account_id", str);
            String jSONObject2 = jSONObject.toString();
            qcy<Object> qcyVar = b[0];
            this.a.g(jSONObject2);
        }
    }
}
