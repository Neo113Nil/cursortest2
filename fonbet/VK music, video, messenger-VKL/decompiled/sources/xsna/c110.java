package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MarketItemCommentsNavigationEvent.kt */
/* loaded from: classes17.dex */
public interface c110 {

    /* compiled from: MarketItemCommentsNavigationEvent.kt */
    public static final class a implements c110 {
        public final int a;
        public final UserId b;

        public a(int i, UserId userId) {
            this.a = i;
            this.b = userId;
        }
    }

    /* compiled from: MarketItemCommentsNavigationEvent.kt */
    public static final class b implements c110 {
        public final int a;
        public final UserId b;

        public b(int i, UserId userId) {
            this.a = i;
            this.b = userId;
        }
    }

    /* compiled from: MarketItemCommentsNavigationEvent.kt */
    public static final class c implements c110 {
        public final UserId a;
        public final UserId b;

        public c(UserId userId, UserId userId2) {
            this.a = userId;
            this.b = userId2;
        }
    }

    /* compiled from: MarketItemCommentsNavigationEvent.kt */
    public static final class d implements c110 {
    }
}
