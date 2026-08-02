package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import com.ybsdk.feature.cashback.impl.dto.responses.CashbackSelectorCategoryResponse;
import com.ybsdk.feature.cashback.impl.entities.CashbackSelectorCategoryEntity;
import com.ybsdk.feature.cashback.impl.entities.types.CategoryID;

/* loaded from: classes3.dex */
public abstract class f49 {
    public static final CashbackSelectorCategoryEntity a(CashbackSelectorCategoryResponse cashbackSelectorCategoryResponse) {
        String m398constructorimpl = CategoryID.m398constructorimpl(cashbackSelectorCategoryResponse.getCategoryInfo().getCategoryId());
        b bVar = Text.Companion;
        String title = cashbackSelectorCategoryResponse.getCategoryInfo().getTitle();
        bVar.getClass();
        Text.Constant constant = new Text.Constant(title);
        String subtitle = cashbackSelectorCategoryResponse.getCategoryInfo().getSubtitle();
        bVar.getClass();
        Text.Constant constant2 = new Text.Constant(subtitle);
        ThemedImageUrlEntity c = qxy0.c(cashbackSelectorCategoryResponse.getCategoryInfo().getThemedImage(), cashbackSelectorCategoryResponse.getCategoryInfo().getImage());
        String percent = cashbackSelectorCategoryResponse.getCategoryInfo().getPercent();
        Boolean isSelected = cashbackSelectorCategoryResponse.isSelected();
        return new CashbackSelectorCategoryEntity(m398constructorimpl, constant, constant2, c, cashbackSelectorCategoryResponse.getCategoryInfo().getSelectionType(), percent, isSelected != null ? isSelected.booleanValue() : false, null);
    }
}
