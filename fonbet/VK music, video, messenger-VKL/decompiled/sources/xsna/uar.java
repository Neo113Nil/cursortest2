package xsna;

import com.vk.dto.common.ImageSizeKey;
import com.vk.log.L;
import io.jsonwebtoken.JwtParser;
import java.io.File;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;

/* compiled from: FileTarget.kt */
/* loaded from: classes3.dex */
public final class uar extends u000 {
    public final hbr a;
    public final StringBuilder b;
    public final b c;
    public final Regex d;

    /* compiled from: FileTarget.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[L.LogType.values().length];
            try {
                iArr[L.LogType.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[L.LogType.v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[L.LogType.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[L.LogType.w.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[L.LogType.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: FileTarget.kt */
    public static final class b extends ThreadLocal<Calendar> {
        @Override // java.lang.ThreadLocal
        public final Calendar initialValue() {
            return Calendar.getInstance();
        }
    }

    public uar(jar jarVar, hbr hbrVar) {
        this.a = hbrVar;
        hbrVar.d = jarVar;
        String str = jarVar.d;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jarVar.b);
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(jarVar.a);
        sb.append(sb2.toString());
        sb.append(str2);
        sb.append(str);
        hbrVar.c = sb.toString();
        hbrVar.e = (ExecutorService) hbrVar.a.b.getValue();
        hbrVar.b();
        this.b = new StringBuilder();
        this.c = new b();
        this.d = new Regex("\n");
    }

    @Override // xsna.u000
    public final void b(L.LogType logType, String str, String str2, boolean z) {
        Collection collection;
        String str3;
        hbr hbrVar = this.a;
        StringBuilder sb = this.b;
        try {
            if (hbrVar.a()) {
                Calendar calendar = this.c.get();
                calendar.setTimeInMillis(System.currentTimeMillis());
                Calendar calendar2 = calendar;
                long timeInMillis = calendar2.getTimeInMillis() % 1000;
                List j = this.d.j(0, str2);
                if (!j.isEmpty()) {
                    ListIterator listIterator = j.listIterator(j.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            collection = j5g.H0(j, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                collection = EmptyList.b;
                String[] strArr = (String[]) collection.toArray(new String[0]);
                int i = a.$EnumSwitchMapping$0[logType.ordinal()];
                if (i == 1) {
                    str3 = "D";
                } else if (i == 2) {
                    str3 = "V";
                } else if (i == 3) {
                    str3 = "I";
                } else if (i == 4) {
                    str3 = "W";
                } else {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str3 = "E";
                }
                sb.setLength(0);
                int i2 = calendar2.get(5);
                if (i2 < 10) {
                    sb.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
                }
                sb.append(i2);
                sb.append(JwtParser.SEPARATOR_CHAR);
                int i3 = calendar2.get(2) + 1;
                if (i3 < 10) {
                    sb.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
                }
                sb.append(i3);
                sb.append(JwtParser.SEPARATOR_CHAR);
                sb.append(calendar2.get(1));
                sb.append(' ');
                sb.append(calendar2.get(11));
                sb.append(':');
                sb.append(calendar2.get(12));
                sb.append(':');
                sb.append(calendar2.get(13));
                sb.append(':');
                sb.append('\t');
                sb.append(timeInMillis);
                sb.append('\t');
                sb.append(str3);
                sb.append('\t');
                sb.append(str);
                String sb2 = sb.toString();
                for (String str4 : strArr) {
                    hbrVar.d(sb2, z);
                    hbrVar.d(str4, z);
                    hbrVar.d("\n", z);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // xsna.u000
    public final void c() {
        this.a.c();
    }
}
