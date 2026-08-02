package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.ybsdk.rconfig.configs.PollingConfig;
import com.ybsdk.rconfig.configs.YbCommonBackoffPollingStrategyConfig;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes9.dex */
public final class er51 implements JsonAdapter.Factory {
    public static final er51 a = new er51();

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public final JsonAdapter create(Type type, Set set, Moshi moshi) {
        if (set.isEmpty() && type == YbCommonBackoffPollingStrategyConfig.class) {
            return new xoc(moshi.adapter(PollingConfig.class));
        }
        return null;
    }
}
