package xsna;

import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.OnlineInfo;
import com.vk.voip.api.dto.VoipCallOnStartAction;
import java.util.Set;
import kotlin.collections.EmptySet;
import org.json.JSONObject;

/* compiled from: VoipCallManager.kt */
/* loaded from: classes11.dex */
public interface khw0 {
    void a(UserId userId, OnlineInfo onlineInfo);

    void b();

    void c(String str, JSONObject jSONObject);

    void d(a aVar);

    /* compiled from: VoipCallManager.kt */
    /* loaded from: classes7.dex */
    public static final class a {
        public final zqk0 a;
        public final VoipCallSource b;
        public final UserId c;
        public final String d;
        public final Set<VoipCallOnStartAction> e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(zqk0 zqk0Var, VoipCallSource voipCallSource, UserId userId, String str, Set<? extends VoipCallOnStartAction> set) {
            this.a = zqk0Var;
            this.b = voipCallSource;
            this.c = userId;
            this.d = str;
            this.e = set;
        }

        public a(zqk0 zqk0Var, VoipCallSource voipCallSource, UserId userId, String str, Set set, int i) {
            this(zqk0Var, voipCallSource, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? EmptySet.b : set);
        }
    }
}
