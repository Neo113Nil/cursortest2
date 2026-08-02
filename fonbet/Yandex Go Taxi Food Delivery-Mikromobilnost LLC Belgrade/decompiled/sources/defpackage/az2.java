package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.AppUpdateDto;
import com.ybsdk.rconfig.configs.AppUpdateUiDataDto;

/* loaded from: classes9.dex */
public abstract class az2 {
    public static final dfr a;

    static {
        byte[] bArr = tje.K0;
        byte[] bArr2 = new byte[31];
        for (int i = 0; i < 31; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, AppUpdateDto.class), new CommonExperiment(new AppUpdateDto(false, String.valueOf(Long.parseLong("11302") - 1), 7, 1, new AppUpdateUiDataDto(unr0.h(Text.Companion, dzh0.ybsdk_app_update_bottom_sheet_title), new Text.Resource(dzh0.ybsdk_app_update_bottom_sheet_subtitle), new Text.Resource(dzh0.ybsdk_app_update_bottom_sheet_button_text))), ExperimentApplyType.LATEST));
    }
}
