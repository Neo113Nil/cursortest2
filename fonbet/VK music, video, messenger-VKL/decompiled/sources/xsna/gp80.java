package xsna;

import android.content.Context;
import com.vk.api.generated.users.dto.UsersOnlineInfoDto;
import com.vk.dto.user.InvisibleLastSeenStatus;
import com.vk.dto.user.InvisibleStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.VisibleStatus;
import com.vkontakte.android.R;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: OnlineFormatter.kt */
/* loaded from: classes17.dex */
public final class gp80 {
    public static final /* synthetic */ qcy<Object>[] i;
    public final Context a;
    public final hp80 b;
    public final bpn0 c;
    public final bpn0 d;
    public final bpn0 e;
    public final bpn0 f;
    public final mto0 g;
    public final wqo0 h;

    /* compiled from: OnlineFormatter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InvisibleLastSeenStatus.values().length];
            try {
                iArr[InvisibleLastSeenStatus.RECENTLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InvisibleLastSeenStatus.LAST_WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InvisibleLastSeenStatus.LAST_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InvisibleLastSeenStatus.LONG_AGO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InvisibleLastSeenStatus.NOT_SHOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InvisibleLastSeenStatus.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[UsersOnlineInfoDto.StatusDto.values().length];
            try {
                iArr2[UsersOnlineInfoDto.StatusDto.RECENTLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[UsersOnlineInfoDto.StatusDto.LAST_WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[UsersOnlineInfoDto.StatusDto.LAST_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[UsersOnlineInfoDto.StatusDto.LONG_AGO.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[UsersOnlineInfoDto.StatusDto.NOT_SHOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(gp80.class, "sb", "getSb()Ljava/lang/StringBuilder;", 0);
        fpf0.a.getClass();
        i = new qcy[]{propertyReference1Impl};
    }

    public gp80(Context context, hp80 hp80Var) {
        this.a = context;
        this.b = hp80Var;
        this.c = new bpn0(new de4(29));
        this.d = new bpn0(new ee4(28));
        this.e = new bpn0(new k7z(this, 14));
        this.f = new bpn0(new gd70(this, 3));
        this.g = mto0.a;
        this.h = new wqo0(new w9(25));
    }

    public static boolean f(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    public final String a(String str) {
        if (!this.b.b) {
            return str;
        }
        if (str.length() <= 0) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public final String b(boolean z, long j) {
        e().setLength(0);
        StringBuilder e = e();
        if (j < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "lastSeen must be >= 0. Given: "));
        }
        if (j != 0) {
            iom0 iom0Var = z ? (k6r) this.f.getValue() : (og00) this.e.getValue();
            bpn0 bpn0Var = this.c;
            ((Calendar) bpn0Var.getValue()).setTimeInMillis(j);
            bpn0 bpn0Var2 = this.d;
            Calendar calendar = (Calendar) bpn0Var2.getValue();
            xuo0.a.getClass();
            calendar.setTimeInMillis(xuo0.a());
            long timeInMillis = ((Calendar) bpn0Var2.getValue()).getTimeInMillis() - ((Calendar) bpn0Var.getValue()).getTimeInMillis();
            long j2 = j + xuo0.c;
            if (timeInMillis < TimeUnit.MINUTES.toMillis(1L)) {
                long j3 = timeInMillis / 1000;
                iom0Var.f(e);
            } else {
                TimeUnit timeUnit = TimeUnit.HOURS;
                if (timeInMillis < timeUnit.toMillis(1L)) {
                    iom0Var.b((int) ((timeInMillis / 60) / 1000), e);
                } else if (timeInMillis < timeUnit.toMillis(3L)) {
                    long j4 = 60;
                    iom0Var.g((int) (((timeInMillis / j4) / j4) / 1000), e);
                } else if (f((Calendar) bpn0Var.getValue(), (Calendar) bpn0Var2.getValue())) {
                    iom0Var.c(j2, e);
                } else {
                    Calendar calendar2 = (Calendar) bpn0Var.getValue();
                    Calendar calendar3 = (Calendar) bpn0Var2.getValue();
                    calendar3.add(5, -1);
                    boolean f = f(calendar2, calendar3);
                    calendar3.add(5, 1);
                    if (f) {
                        iom0Var.a(j2, e);
                    } else {
                        if (((Calendar) bpn0Var.getValue()).get(1) == ((Calendar) bpn0Var2.getValue()).get(1)) {
                            iom0Var.d(j2, e);
                        } else {
                            iom0Var.e(j2, e);
                        }
                    }
                }
            }
        }
        return e().toString();
    }

    public final String c(boolean z, OnlineInfo onlineInfo) {
        String string;
        if (onlineInfo instanceof InvisibleStatus) {
            string = d(z, ((InvisibleStatus) onlineInfo).b);
        } else {
            if (!(onlineInfo instanceof VisibleStatus)) {
                throw new NoWhenBranchMatchedException();
            }
            VisibleStatus visibleStatus = (VisibleStatus) onlineInfo;
            boolean z2 = visibleStatus.c;
            Context context = this.a;
            string = (z2 && visibleStatus.Cb()) ? context.getString(R.string.vkme_online) : z2 ? context.getString(R.string.online) : b(z, visibleStatus.b);
        }
        return a(string);
    }

    public final String d(boolean z, InvisibleLastSeenStatus invisibleLastSeenStatus) {
        int i2 = a.$EnumSwitchMapping$0[invisibleLastSeenStatus.ordinal()];
        Context context = this.a;
        switch (i2) {
            case 1:
                return z ? context.getString(R.string.online_recently_f) : context.getString(R.string.online_recently_m);
            case 2:
                return z ? context.getString(R.string.online_last_week_f) : context.getString(R.string.online_last_week_m);
            case 3:
                return z ? context.getString(R.string.online_last_month_f) : context.getString(R.string.online_last_month_m);
            case 4:
                return z ? context.getString(R.string.online_long_ago_f) : context.getString(R.string.online_long_ago_m);
            case 5:
                return context.getString(R.string.online_status_offline);
            case 6:
                return "";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final StringBuilder e() {
        qcy<Object> qcyVar = i[0];
        wqo0 wqo0Var = this.h;
        wqo0Var.getClass();
        return (StringBuilder) wqo0Var.get();
    }

    public gp80(Context context) {
        this(context, hp80.c);
    }
}
