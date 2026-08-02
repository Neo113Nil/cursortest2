package com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.state.bottom_sheet;

import defpackage.bvf0;
import defpackage.k4o;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class RideCardChangeStateEventRepository {
    public final r0 a = bvf0.c(new Object());
    public volatile ChangeStateEvent b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/presentation/modal/state/bottom_sheet/RideCardChangeStateEventRepository$ChangeStateEvent;", "", "EXPAND_CARD", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ChangeStateEvent {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ChangeStateEvent[] $VALUES;
        public static final ChangeStateEvent EXPAND_CARD;

        static {
            ChangeStateEvent changeStateEvent = new ChangeStateEvent("EXPAND_CARD", 0);
            EXPAND_CARD = changeStateEvent;
            ChangeStateEvent[] changeStateEventArr = {changeStateEvent};
            $VALUES = changeStateEventArr;
            $ENTRIES = kotlin.enums.a.a(changeStateEventArr);
        }

        public static ChangeStateEvent valueOf(String str) {
            return (ChangeStateEvent) Enum.valueOf(ChangeStateEvent.class, str);
        }

        public static ChangeStateEvent[] values() {
            return (ChangeStateEvent[]) $VALUES.clone();
        }
    }
}
