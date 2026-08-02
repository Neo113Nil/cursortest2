package defpackage;

import android.os.Bundle;
import com.adjust.sdk.Constants;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public final class n550 extends t550 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n550(boolean z, int i) {
        super(z);
        this.r = i;
    }

    @Override // defpackage.t550
    public final Object a(Bundle bundle, String str) {
        switch (this.r) {
            case 0:
                return (Boolean) bundle.get(str);
            case 1:
                return (Float) bundle.get(str);
            case 2:
                return (Integer) bundle.get(str);
            case 3:
                return (Long) bundle.get(str);
            case 4:
                return (Integer) bundle.get(str);
            default:
                return (String) bundle.get(str);
        }
    }

    @Override // defpackage.t550
    public final String b() {
        switch (this.r) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return Constants.LONG;
            case 4:
                return "reference";
            default:
                return "string";
        }
    }

    @Override // defpackage.t550
    public final Object d(String str) {
        int parseInt;
        long parseLong;
        int parseInt2;
        boolean z = true;
        switch (this.r) {
            case 0:
                if (!str.equals("true")) {
                    if (!str.equals("false")) {
                        ny61.g("A boolean NavType only accepts \"true\" or \"false\" values.");
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                if (cvu0.x(str, HexString.STR_0x, false)) {
                    String substring = str.substring(2);
                    rza.a(16);
                    parseInt = Integer.parseInt(substring, 16);
                } else {
                    parseInt = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt);
            case 3:
                String g = cvu0.s(str, "L", false) ? oyr.g(1, 0, str) : str;
                if (cvu0.x(str, HexString.STR_0x, false)) {
                    String substring2 = g.substring(2);
                    rza.a(16);
                    parseLong = Long.parseLong(substring2, 16);
                } else {
                    parseLong = Long.parseLong(g);
                }
                return Long.valueOf(parseLong);
            case 4:
                if (cvu0.x(str, HexString.STR_0x, false)) {
                    String substring3 = str.substring(2);
                    rza.a(16);
                    parseInt2 = Integer.parseInt(substring3, 16);
                } else {
                    parseInt2 = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt2);
            default:
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // defpackage.t550
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.r) {
            case 0:
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                break;
            case 1:
                bundle.putFloat(str, ((Number) obj).floatValue());
                break;
            case 2:
                bundle.putInt(str, ((Number) obj).intValue());
                break;
            case 3:
                bundle.putLong(str, ((Number) obj).longValue());
                break;
            case 4:
                bundle.putInt(str, ((Number) obj).intValue());
                break;
            default:
                bundle.putString(str, (String) obj);
                break;
        }
    }
}
