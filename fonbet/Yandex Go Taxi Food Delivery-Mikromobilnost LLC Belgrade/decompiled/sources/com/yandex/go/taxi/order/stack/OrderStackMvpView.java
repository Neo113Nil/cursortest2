package com.yandex.go.taxi.order.stack;

import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.k4o;
import defpackage.l050;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/yandex/go/taxi/order/stack/OrderStackMvpView;", "Ll050;", "AnimationType", "com/yandex/go/taxi/order/stack/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface OrderStackMvpView extends l050 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/stack/OrderStackMvpView$AnimationType;", "", "HORIZONTAL_TRANSLATION", "FADE", JCP.RAW_PREFIX, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class AnimationType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AnimationType[] $VALUES;
        public static final AnimationType FADE;
        public static final AnimationType HORIZONTAL_TRANSLATION;
        public static final AnimationType NONE;

        static {
            AnimationType animationType = new AnimationType("HORIZONTAL_TRANSLATION", 0);
            HORIZONTAL_TRANSLATION = animationType;
            AnimationType animationType2 = new AnimationType("FADE", 1);
            FADE = animationType2;
            AnimationType animationType3 = new AnimationType(JCP.RAW_PREFIX, 2);
            NONE = animationType3;
            AnimationType[] animationTypeArr = {animationType, animationType2, animationType3};
            $VALUES = animationTypeArr;
            $ENTRIES = kotlin.enums.a.a(animationTypeArr);
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) $VALUES.clone();
        }
    }

    void Xa(a aVar);

    void Y7(int i, AnimationType animationType, OrderScreen orderScreen);

    void forceAnchor();

    void forceCollapse();

    void h3(int i, AnimationType animationType);

    void jd();

    void pauseShortcuts();

    void resumeShortcuts();

    void u8();

    boolean ue(TaxiCardNavigationAction taxiCardNavigationAction);
}
