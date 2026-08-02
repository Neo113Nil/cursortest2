package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import com.ybsdk.core.utils.text.c;
import com.ybsdk.feature.card.api.CardManagementSettingStatus;
import com.ybsdk.feature.card.api.CardManagementSettingTextData;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.k;
import com.ybsdk.widgets.common.l;
import java.util.Map;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public final class gd8 implements ev31 {
    public final Map a;

    public gd8(Map map) {
        this.a = map;
    }

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        k kVar;
        Text b;
        Text h;
        Text h2;
        Text h3;
        Text h4;
        Text h5;
        Text h6;
        Text h7;
        zc8 zc8Var = (zc8) obj;
        CardManagementSettingStatus cardManagementSettingStatus = CardManagementSettingStatus.LANDING;
        Map map = this.a;
        CardManagementSettingTextData cardManagementSettingTextData = (CardManagementSettingTextData) map.get(cardManagementSettingStatus);
        CardManagementSettingTextData cardManagementSettingTextData2 = (CardManagementSettingTextData) map.get(CardManagementSettingStatus.SUCCESS);
        CardManagementSettingTextData cardManagementSettingTextData3 = (CardManagementSettingTextData) map.get(CardManagementSettingStatus.IN_PROGRESS);
        CardManagementSettingTextData cardManagementSettingTextData4 = (CardManagementSettingTextData) map.get(CardManagementSettingStatus.ERROR);
        int i = fd8.a[zc8Var.c.ordinal()];
        if (i == 1) {
            kVar = new k(oc70.a, null, null, null, null, null, null, 196);
        } else if (i == 2) {
            if (cardManagementSettingTextData3 == null || (h = cardManagementSettingTextData3.getTitle()) == null) {
                h = unr0.h(Text.Companion, dzh0.ybsdk_card_deletion_loading_title);
            }
            kVar = new k(pc70.a, h, null, null, null, null, null, 196);
        } else if (i == 3) {
            l lVar = new l(OperationProgressView.StatusIcon.ERROR);
            if (cardManagementSettingTextData4 == null || (h2 = cardManagementSettingTextData4.getTitle()) == null) {
                h2 = unr0.h(Text.Companion, dzh0.ybsdk_card_deletion_error_title);
            }
            Text text = h2;
            if (cardManagementSettingTextData4 == null || (h3 = cardManagementSettingTextData4.getPrimaryButtonText()) == null) {
                h3 = unr0.h(Text.Companion, dzh0.ybsdk_card_deletion_retry_button_title);
            }
            Text text2 = h3;
            if (cardManagementSettingTextData4 == null || (h4 = cardManagementSettingTextData4.getSecondaryButtonText()) == null) {
                h4 = unr0.h(Text.Companion, dzh0.ybsdk_card_card_activation_button_support);
            }
            kVar = new k(lVar, text, null, null, text2, h4, new nbv(txg0.ybsdk_ic_support, null), HProv.PP_CONTAINER_EXTENSION);
        } else {
            if (i != 4) {
                w511.b();
                return null;
            }
            l lVar2 = new l(OperationProgressView.StatusIcon.SUCCESS);
            if (cardManagementSettingTextData2 == null || (h5 = cardManagementSettingTextData2.getTitle()) == null) {
                h5 = unr0.h(Text.Companion, dzh0.ybsdk_card_deletion_success_title);
            }
            Text text3 = h5;
            if (cardManagementSettingTextData2 == null || (h6 = cardManagementSettingTextData2.getDescription()) == null) {
                h6 = unr0.h(Text.Companion, dzh0.ybsdk_card_deletion_success_subtitle);
            }
            Text text4 = h6;
            if (cardManagementSettingTextData2 == null || (h7 = cardManagementSettingTextData2.getPrimaryButtonText()) == null) {
                h7 = unr0.h(Text.Companion, dzh0.ybsdk_card_deletion_success_button_title);
            }
            kVar = new k(lVar2, text3, null, text4, h7, null, null, 196);
        }
        if (cardManagementSettingTextData == null || (b = cardManagementSettingTextData.getTitle()) == null) {
            b bVar = Text.Companion;
            int i2 = dzh0.ybsdk_card_deletion_title_format;
            c cVar = Text.Formatted.Arg.Companion;
            String str = zc8Var.b;
            cVar.getClass();
            Text.Formatted.Arg[] argArr = {new Text.Formatted.Arg.StringArg(str)};
            bVar.getClass();
            b = b.b(i2, argArr);
        }
        return new ed8(kVar, b, zc8Var.d);
    }
}
