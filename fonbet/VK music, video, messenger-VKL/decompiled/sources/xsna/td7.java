package xsna;

import androidx.credentials.provider.CredentialEntry;
import one.video.calls.sdk.internal.upload.config.BitrateDumpGatheringConfig;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.sdk.config.BaseConfigProvider;

/* compiled from: BitrateDumpGatheringConfigProviderImpl.kt */
@CallInternalApi
/* loaded from: classes8.dex */
public final class td7 extends BaseConfigProvider<BitrateDumpGatheringConfig> {
    @Override // ru.ok.android.externcalls.sdk.config.BaseConfigProvider
    public final BitrateDumpGatheringConfig parseConfig(String str) {
        boolean z;
        if (str.equals("true")) {
            z = true;
        } else {
            if (!str.equals(CredentialEntry.FALSE_STRING)) {
                throw new IllegalArgumentException("The string doesn't represent a boolean value: ".concat(str));
            }
            z = false;
        }
        return new BitrateDumpGatheringConfig(z);
    }
}
