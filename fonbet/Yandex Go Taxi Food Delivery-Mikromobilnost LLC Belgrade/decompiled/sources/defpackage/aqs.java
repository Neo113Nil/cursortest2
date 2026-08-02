package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.savings.internal.network.dto.ActionButtonDto;

/* loaded from: classes3.dex */
public abstract class aqs {
    public static final ms a(ActionButtonDto actionButtonDto) {
        return new ms(g8e.i(Text.Companion, actionButtonDto.getText()), actionButtonDto.getAction());
    }
}
