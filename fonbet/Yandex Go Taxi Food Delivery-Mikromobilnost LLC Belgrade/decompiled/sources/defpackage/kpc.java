package defpackage;

import com.ybsdk.core.common.data.network.dto.CommonSheet;
import com.ybsdk.core.common.data.network.dto.CommonSheetButton;
import com.ybsdk.core.common.domain.entities.CommonSheetButtonEntity;
import com.ybsdk.core.common.domain.entities.CommonSheetEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;

/* loaded from: classes15.dex */
public abstract class kpc {
    public static final CommonSheetEntity a(CommonSheet commonSheet) {
        b bVar = Text.Companion;
        Text.Constant i = g8e.i(bVar, commonSheet.getTitle());
        Text.Constant i2 = g8e.i(bVar, commonSheet.getDescription());
        CommonSheetButton primaryButton = commonSheet.getPrimaryButton();
        return new CommonSheetEntity(i, i2, new CommonSheetButtonEntity(g8e.i(bVar, primaryButton.getText()), primaryButton.getDeeplink()));
    }
}
