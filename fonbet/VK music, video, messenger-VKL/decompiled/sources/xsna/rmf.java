package xsna;

import com.vk.dto.common.VideoFile;
import java.util.List;

/* compiled from: ClipsVideoAttachmentState.kt */
/* loaded from: classes16.dex */
public final class rmf implements km50 {
    public final String b;
    public final Boolean c;
    public final List<VideoFile> d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final String j;
    public final String k;
    public final String l;

    /* JADX WARN: Multi-variable type inference failed */
    public rmf(String str, Boolean bool, List<? extends VideoFile> list, int i, String str2, String str3, String str4, int i2, String str5, String str6, String str7) {
        this.b = str;
        this.c = bool;
        this.d = list;
        this.e = i;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = i2;
        this.j = str5;
        this.k = str6;
        this.l = str7;
    }

    public static rmf a(rmf rmfVar, List list, int i, String str, String str2, String str3, int i2, String str4, int i3) {
        String str5 = rmfVar.b;
        Boolean bool = rmfVar.c;
        if ((i3 & 4) != 0) {
            list = rmfVar.d;
        }
        List list2 = list;
        if ((i3 & 8) != 0) {
            i = rmfVar.e;
        }
        int i4 = i;
        String str6 = (i3 & 16) != 0 ? rmfVar.f : str;
        String str7 = (i3 & 32) != 0 ? rmfVar.g : str2;
        String str8 = (i3 & 64) != 0 ? rmfVar.h : str3;
        int i5 = (i3 & 128) != 0 ? rmfVar.i : i2;
        String str9 = (i3 & 256) != 0 ? rmfVar.j : str4;
        String str10 = rmfVar.k;
        String str11 = rmfVar.l;
        rmfVar.getClass();
        return new rmf(str5, bool, list2, i4, str6, str7, str8, i5, str9, str10, str11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmf)) {
            return false;
        }
        rmf rmfVar = (rmf) obj;
        return epx.f(this.b, rmfVar.b) && epx.f(this.c, rmfVar.c) && epx.f(this.d, rmfVar.d) && this.e == rmfVar.e && epx.f(this.f, rmfVar.f) && epx.f(this.g, rmfVar.g) && epx.f(this.h, rmfVar.h) && this.i == rmfVar.i && epx.f(this.j, rmfVar.j) && epx.f(this.k, rmfVar.k) && epx.f(this.l, rmfVar.l);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Boolean bool = this.c;
        int a = shy.a(this.e, fw3.a((hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.d), 31);
        String str = this.f;
        int hashCode2 = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return this.l.hashCode() + urd0.a(urd0.a(shy.a(this.i, (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsVideoAttachmentState(clipVideoId=");
        sb.append(this.b);
        sb.append(", publishing=");
        sb.append(this.c);
        sb.append(", videos=");
        sb.append(this.d);
        sb.append(", clipsPerVideoLimit=");
        sb.append(this.e);
        sb.append(", chosenVideoId=");
        sb.append(this.f);
        sb.append(", initialVideoId=");
        sb.append(this.g);
        sb.append(", nextFrom=");
        sb.append(this.h);
        sb.append(", albumId=");
        sb.append(this.i);
        sb.append(", title=");
        sb.append(this.j);
        sb.append(", attachButtonTitle=");
        sb.append(this.k);
        sb.append(", attachButtonDescription=");
        return ho8.a(sb, this.l, ')');
    }
}
