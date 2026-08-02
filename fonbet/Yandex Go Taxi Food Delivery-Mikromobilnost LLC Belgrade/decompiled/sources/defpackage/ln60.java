package defpackage;

import com.google.gson.reflect.TypeToken;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes11.dex */
public final class ln60 implements ol11 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ln60(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ol11
    public final nl11 create(u3u u3uVar, TypeToken typeToken) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (typeToken.getRawType() == Number.class) {
                    return (nn60) obj;
                }
                return null;
            case 1:
                if (typeToken.getRawType() == Object.class) {
                    return new yp60(u3uVar, (sjz0) obj);
                }
                return null;
            default:
                Class rawType = typeToken.getRawType();
                if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
                    return (f7x) obj;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((f7x) this.b) + "]";
            default:
                return super.toString();
        }
    }
}
