package defpackage;

import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;

/* loaded from: classes3.dex */
public abstract class ns {
    public static final ActionButtonEntity a(ActionButtonDto actionButtonDto) {
        return new ActionButtonEntity(g8e.i(Text.Companion, actionButtonDto.getText()), actionButtonDto.getAction(), false, d.g(actionButtonDto.getSubtitle()), 4, null);
    }
}
