package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import xsna.emb;
import xsna.go9;
import xsna.ho8;
import xsna.lhg;

/* renamed from: io.appmetrica.analytics.impl.ag, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC4706ag {
    public static final String a(C5113q9 c5113q9) {
        String str;
        StringBuilder sb = new StringBuilder("Event sent: ");
        int i = c5113q9.c;
        String str2 = c5113q9.d;
        byte[] bArr = c5113q9.e;
        if (i == 1) {
            str = "Attribution";
        } else if (i == 2) {
            str = "Session start";
        } else if (i == 4) {
            if (str2 == null) {
                str2 = "null";
            }
            StringBuilder sb2 = new StringBuilder(str2);
            if (bArr != null) {
                String str3 = new String(bArr, emb.b);
                if (!TextUtils.isEmpty(str3)) {
                    sb2.append(" with value ");
                    sb2.append(str3);
                }
            }
            str = sb2.toString();
        } else if (i == 5) {
            str = "Referrer";
        } else if (i == 7) {
            str = "Session heartbeat";
        } else if (i == 13) {
            str = "The very first event";
        } else if (i == 35) {
            str = "E-Commerce";
        } else if (i == 40) {
            str = "Ad revenue (ILRD)";
        } else if (i == 42) {
            str = "External attribution";
        } else if (i == 16) {
            str = "Open";
        } else if (i == 17) {
            str = "Update";
        } else if (i == 20) {
            str = "User profile update";
        } else if (i != 21) {
            switch (i) {
                case 25:
                    str = "ANR";
                    break;
                case 26:
                    str = go9.b("Crash: ", str2);
                    break;
                case 27:
                    str = go9.b("Error: ", str2);
                    break;
                default:
                    str = lhg.a(i, "type=");
                    break;
            }
        } else {
            str = "Revenue";
        }
        sb.append(str);
        return sb.toString();
    }

    public static final String a(String str, EnumC5037nb enumC5037nb, String str2, String str3) {
        if (!I9.d.contains(EnumC5037nb.a(enumC5037nb.a))) {
            return null;
        }
        StringBuilder b = ho8.b(str, ": ");
        b.append(enumC5037nb.name());
        if (I9.f.contains(enumC5037nb) && !TextUtils.isEmpty(str2)) {
            b.append(" with name ");
            b.append(str2);
        }
        if (I9.e.contains(enumC5037nb) && !TextUtils.isEmpty(str3)) {
            b.append(" with value ");
            b.append(str3);
        }
        return b.toString();
    }
}
