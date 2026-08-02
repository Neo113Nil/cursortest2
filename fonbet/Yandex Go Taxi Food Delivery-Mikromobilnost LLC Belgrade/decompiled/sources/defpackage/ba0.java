package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.payment_options.model.pci_dss.CardType;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lba0;", "Ll050;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ba0 extends l050 {
    void setCardImage(CardType cardType);

    void setCardScanButtonVisible(boolean z);

    void setConfirmButtonEnabled(boolean z);

    void setNfcCardScanIconVisible(boolean z);

    void setNfcCardScanTooltipText(String str, String str2);

    void setYbContentDescription(String str);

    void setYbLogoVisibility(int i);

    void showTopTrailing(String str, String str2);

    void updateCardIconVisibility(boolean z);

    void updateCvnComment(int i);
}
