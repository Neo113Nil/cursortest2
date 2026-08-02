package com.yandex.div.core;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.DivTooltip;
import xsna.jqn;

/* loaded from: classes7.dex */
public interface DivTooltipRestrictor {
    public static final DivTooltipRestrictor STUB = new jqn();

    public interface DivTooltipShownCallback {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$0(Div2View div2View, View view, DivTooltip divTooltip, boolean z) {
        return true;
    }

    boolean canShowTooltip(@NonNull Div2View div2View, @NonNull View view, @NonNull DivTooltip divTooltip, boolean z);

    @Nullable
    default DivTooltipShownCallback getTooltipShownCallback() {
        return null;
    }
}
