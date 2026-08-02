package com.yandex.go.scooters.offers.v2.components.options;

import android.content.Context;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.o86;
import defpackage.qfh0;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/scooters/offers/v2/components/options/ScootersCardBonusPassesHolderComponent;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "Lo86;", "bonusPasses", "Lzy11;", "setBonusPasses", "(Ljava/util/List;)V", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersCardBonusPassesHolderComponent extends GoLinearLayout {
    public static final int $stable = 8;

    public ScootersCardBonusPassesHolderComponent(Context context) {
        super(context, null, 0, 0, 14, null);
        setId(qfh0.scooters_component_option_bonus_passes_holder);
        setVisibility(8);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public final void setBonusPasses(List<o86> bonusPasses) {
        removeAllViews();
        List<o86> list = bonusPasses;
        if (list == null || list.isEmpty()) {
            setVisibility(8);
            return;
        }
        for (o86 o86Var : bonusPasses) {
            ScootersCardBonusPassComponent scootersCardBonusPassComponent = new ScootersCardBonusPassComponent(getContext());
            scootersCardBonusPassComponent.setBonusPass(o86Var);
            addView(scootersCardBonusPassComponent);
        }
        setVisibility(0);
    }
}
