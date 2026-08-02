package xsna;

import com.vk.stat.scheme.CommonUxpollsStat$TypeUxpollsEvent;
import com.vk.video.polls.entrypoint.model.UxPollEntryPoint;
import java.security.SecureRandom;
import java.util.HashMap;

/* compiled from: UxPollsAnalyticsSessionManager.kt */
/* loaded from: classes6.dex */
public final class o4r0 {
    public final SecureRandom a = new SecureRandom();
    public final HashMap<Integer, Long> b = new HashMap<>();
    public final HashMap<Integer, Long> c = new HashMap<>();

    /* compiled from: UxPollsAnalyticsSessionManager.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommonUxpollsStat$TypeUxpollsEvent.EventType.values().length];
            try {
                iArr[CommonUxpollsStat$TypeUxpollsEvent.EventType.INVITE_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonUxpollsStat$TypeUxpollsEvent.EventType.INVITE_HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommonUxpollsStat$TypeUxpollsEvent.EventType.SHOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommonUxpollsStat$TypeUxpollsEvent.EventType.ANSWER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CommonUxpollsStat$TypeUxpollsEvent.EventType.HIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CommonUxpollsStat$TypeUxpollsEvent.EventType.COMPLETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r9 != 6) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(UxPollEntryPoint uxPollEntryPoint, CommonUxpollsStat$TypeUxpollsEvent.EventType eventType) {
        long abs;
        int i = uxPollEntryPoint.b.b;
        int[] iArr = a.$EnumSwitchMapping$0;
        int i2 = iArr[eventType.ordinal()];
        SecureRandom secureRandom = this.a;
        HashMap<Integer, Long> hashMap = this.c;
        switch (i2) {
            case 1:
            case 2:
                int i3 = iArr[eventType.ordinal()];
                HashMap<Integer, Long> hashMap2 = this.b;
                if (i3 == 1) {
                    long abs2 = Math.abs(secureRandom.nextLong());
                    hashMap2.put(Integer.valueOf(i), Long.valueOf(abs2));
                    return abs2;
                }
                if (i3 == 2) {
                    Long remove = hashMap2.remove(Integer.valueOf(i));
                    if (remove != null) {
                        hashMap.put(Integer.valueOf(i), remove);
                    }
                    if (remove != null) {
                        return remove.longValue();
                    }
                    return -1L;
                }
                return -1L;
            case 3:
            case 4:
            case 5:
            case 6:
                int i4 = iArr[eventType.ordinal()];
                if (i4 == 3) {
                    if (uxPollEntryPoint.d) {
                        Long l = hashMap.get(Integer.valueOf(i));
                        abs = l != null ? l.longValue() : Math.abs(secureRandom.nextLong());
                    } else {
                        abs = Math.abs(secureRandom.nextLong());
                    }
                    hashMap.put(Integer.valueOf(i), Long.valueOf(abs));
                    return abs;
                }
                if (i4 != 4) {
                    if (i4 == 5) {
                        Long remove2 = hashMap.remove(Integer.valueOf(i));
                        if (remove2 != null) {
                            return remove2.longValue();
                        }
                        return -1L;
                    }
                    break;
                }
                Long l2 = hashMap.get(Integer.valueOf(i));
                if (l2 != null) {
                    return l2.longValue();
                }
                return -1L;
            default:
                return -1L;
        }
    }
}
