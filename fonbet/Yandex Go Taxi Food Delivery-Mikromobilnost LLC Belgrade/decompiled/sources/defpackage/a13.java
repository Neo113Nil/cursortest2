package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"La13;", "", "Companion", "y03", "z03", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a13 {
    public static final z03 Companion = new z03();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final zzs e;
    public final String f;
    public final String g;
    public final String h;

    public /* synthetic */ a13(int i, String str, String str2, String str3, String str4, zzs zzsVar, String str5, String str6, String str7) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = zzsVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str7;
        }
    }

    public a13() {
        this((String) null, (String) null, (String) null, (String) null, (zzs) null, (String) null, (String) null, (String) null, 255);
    }

    public a13(String str, String str2, String str3, String str4, zzs zzsVar, String str5, String str6, String str7, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        zzsVar = (i & 16) != 0 ? null : zzsVar;
        str5 = (i & 32) != 0 ? null : str5;
        str6 = (i & 64) != 0 ? null : str6;
        str7 = (i & 128) != 0 ? null : str7;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = zzsVar;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }
}
