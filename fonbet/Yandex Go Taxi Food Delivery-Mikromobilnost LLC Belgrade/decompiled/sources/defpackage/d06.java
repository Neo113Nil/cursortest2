package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.common.a;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class d06 implements puj0, e001 {
    public final Resources a;

    public d06(Resources resources, int i) {
        switch (i) {
            case 1:
                resources.getClass();
                this.a = resources;
                break;
            default:
                this.a = resources;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String a(a aVar) {
        String str;
        String e;
        String str2 = aVar.d;
        String str3 = aVar.b;
        if (!TextUtils.isEmpty(str2) && !"und".equals(str2)) {
            Locale forLanguageTag = Locale.forLanguageTag(str2);
            Locale locale = tw21.a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
            str = forLanguageTag.getDisplayName(locale);
            if (!TextUtils.isEmpty(str)) {
                try {
                    int offsetByCodePoints = str.offsetByCodePoints(0, 1);
                    str = str.substring(0, offsetByCodePoints).toUpperCase(locale) + str.substring(offsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
                e = e(str, c(aVar));
                if (TextUtils.isEmpty(e)) {
                    return e;
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = "";
                }
                return str3;
            }
        }
        str = "";
        e = e(str, c(aVar));
        if (TextUtils.isEmpty(e)) {
        }
    }

    @Override // defpackage.puj0
    public otj0 b(otj0 otj0Var, mg70 mg70Var) {
        if (otj0Var == null) {
            return null;
        }
        return new h16(this.a, otj0Var);
    }

    public String c(a aVar) {
        int i = aVar.f;
        int i2 = aVar.f;
        int i3 = i & 2;
        Resources resources = this.a;
        String string = i3 != 0 ? resources.getString(i0i0.exo_track_role_alternate) : "";
        if ((i2 & 4) != 0) {
            string = e(string, resources.getString(i0i0.exo_track_role_supplementary));
        }
        if ((i2 & 8) != 0) {
            string = e(string, resources.getString(i0i0.exo_track_role_commentary));
        }
        return (i2 & 1088) != 0 ? e(string, resources.getString(i0i0.exo_track_role_closed_captions)) : string;
    }

    public String d(a aVar) {
        String a;
        String str = aVar.n;
        int i = aVar.j;
        int i2 = aVar.D;
        int i3 = aVar.v;
        int i4 = aVar.u;
        String str2 = aVar.k;
        int i5 = eh20.i(str);
        if (i5 == -1) {
            if (eh20.k(str2) == null) {
                if (eh20.b(str2) == null) {
                    if (i4 == -1 && i3 == -1) {
                        if (i2 == -1 && aVar.E == -1) {
                            i5 = -1;
                        }
                    }
                }
                i5 = 1;
            }
            i5 = 2;
        }
        Resources resources = this.a;
        if (i5 == 2) {
            a = e(c(aVar), (i4 == -1 || i3 == -1) ? "" : resources.getString(i0i0.exo_track_resolution, Integer.valueOf(i4), Integer.valueOf(i3)), i != -1 ? resources.getString(i0i0.exo_track_bitrate, Float.valueOf(i / 1000000.0f)) : "");
        } else if (i5 == 1) {
            a = e(a(aVar), (i2 == -1 || i2 < 1) ? "" : i2 != 1 ? i2 != 2 ? (i2 == 6 || i2 == 7) ? resources.getString(i0i0.exo_track_surround_5_point_1) : i2 != 8 ? resources.getString(i0i0.exo_track_surround) : resources.getString(i0i0.exo_track_surround_7_point_1) : resources.getString(i0i0.exo_track_stereo) : resources.getString(i0i0.exo_track_mono), i != -1 ? resources.getString(i0i0.exo_track_bitrate, Float.valueOf(i / 1000000.0f)) : "");
        } else {
            a = a(aVar);
        }
        if (a.length() != 0) {
            return a;
        }
        String str3 = aVar.d;
        return (str3 == null || str3.trim().isEmpty()) ? resources.getString(i0i0.exo_track_unknown) : resources.getString(i0i0.exo_track_unknown_name, str3);
    }

    public String e(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                str = TextUtils.isEmpty(str) ? str2 : this.a.getString(i0i0.exo_item_list, str, str2);
            }
        }
        return str;
    }

    public d06(Context context) {
        this.a = context.getResources();
    }
}
