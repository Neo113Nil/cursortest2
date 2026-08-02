package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import java.util.List;

/* compiled from: BookingAnalyticsEvent.kt */
/* loaded from: classes18.dex */
public abstract class mm7 {
    public final UserId a;
    public final Integer b;

    /* compiled from: BookingAnalyticsEvent.kt */
    public static abstract class a extends mm7 {

        /* compiled from: BookingAnalyticsEvent.kt */
        /* renamed from: xsna.mm7$a$a, reason: collision with other inner class name */
        public static final class C3351a extends a {
            public final BookingServiceType c;

            public C3351a(UserId userId, Integer num, BookingServiceType bookingServiceType) {
                super(userId, num);
                this.c = bookingServiceType;
            }
        }

        /* compiled from: BookingAnalyticsEvent.kt */
        public static final class b extends a {
        }

        /* compiled from: BookingAnalyticsEvent.kt */
        public static final class c extends a {
            public final BookingServiceType c;

            public c(UserId userId, BookingServiceType bookingServiceType) {
                super(userId, null);
                this.c = bookingServiceType;
            }
        }

        /* compiled from: BookingAnalyticsEvent.kt */
        public static final class d extends a {
            public final BookingServiceType c;

            public d(UserId userId, BookingServiceType bookingServiceType) {
                super(userId, null);
                this.c = bookingServiceType;
            }
        }

        /* compiled from: BookingAnalyticsEvent.kt */
        public static final class e extends a {
            public final BookingServiceType c;
            public final Integer d;

            public e(UserId userId, Integer num, BookingServiceType bookingServiceType, Integer num2) {
                super(userId, num);
                this.c = bookingServiceType;
                this.d = num2;
            }
        }

        /* compiled from: BookingAnalyticsEvent.kt */
        public static final class f extends a {
            public final BookingServiceType c;

            public f(UserId userId, Integer num, BookingServiceType bookingServiceType) {
                super(userId, num);
                this.c = bookingServiceType;
            }
        }
    }

    /* compiled from: BookingAnalyticsEvent.kt */
    public static abstract class b extends mm7 {

        /* compiled from: BookingAnalyticsEvent.kt */
        public static final class a extends b {
            public final BookingServiceType c;

            public a(UserId userId, Integer num, BookingServiceType bookingServiceType) {
                super(userId, num);
                this.c = bookingServiceType;
            }
        }

        /* compiled from: BookingAnalyticsEvent.kt */
        /* renamed from: xsna.mm7$b$b, reason: collision with other inner class name */
        public static final class C3352b extends b {
            public final BookingServiceType c;

            public C3352b(UserId userId, Integer num, BookingServiceType bookingServiceType) {
                super(userId, num);
                this.c = bookingServiceType;
            }
        }

        /* compiled from: BookingAnalyticsEvent.kt */
        public static final class c extends b {
            public final BookingServiceType c;

            public c(UserId userId, Integer num, BookingServiceType bookingServiceType) {
                super(userId, num);
                this.c = bookingServiceType;
            }
        }

        /* compiled from: BookingAnalyticsEvent.kt */
        public static final class d extends b {
        }

        /* compiled from: BookingAnalyticsEvent.kt */
        public static final class e extends b {
        }

        /* compiled from: BookingAnalyticsEvent.kt */
        public static final class f extends b {
        }

        /* compiled from: BookingAnalyticsEvent.kt */
        public static final class g extends b {
            public final BookingServiceType c;
            public final boolean d;

            public g(UserId userId, Integer num, BookingServiceType bookingServiceType, boolean z) {
                super(userId, num);
                this.c = bookingServiceType;
                this.d = z;
            }
        }

        /* compiled from: BookingAnalyticsEvent.kt */
        public static final class h extends b {
            public final BookingServiceType c;

            public h(UserId userId, Integer num, BookingServiceType bookingServiceType) {
                super(userId, num);
                this.c = bookingServiceType;
            }
        }
    }

    /* compiled from: BookingAnalyticsEvent.kt */
    public static abstract class c extends mm7 {

        /* compiled from: BookingAnalyticsEvent.kt */
        public static final class a extends c {
            public final List<Integer> c;

            public a(UserId userId, List<Integer> list) {
                super(userId, null);
                this.c = list;
            }
        }
    }

    public mm7(UserId userId, Integer num) {
        this.a = userId;
        this.b = num;
    }
}
