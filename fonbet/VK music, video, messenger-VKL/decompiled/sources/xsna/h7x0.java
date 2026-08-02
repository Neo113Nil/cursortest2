package xsna;

import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.fi20;
import xsna.vr10;

/* compiled from: VorbisComment.java */
@Deprecated
/* loaded from: classes12.dex */
public class h7x0 implements fi20.a {
    public final String a;
    public final String b;

    public h7x0(String str, String str2) {
        this.a = o19.v(str);
        this.b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xsna.fi20.a
    public final void c(vr10.a aVar) {
        String str = this.a;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals(NativeAdContent.ViewTag.AD_TITLE)) {
                    c = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals(NativeAdContent.ViewTag.AD_DESCRIPTION)) {
                    c = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = '\b';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = '\t';
                    break;
                }
                break;
        }
        String str2 = this.b;
        switch (c) {
            case 0:
                Integer z = ipx.z(str2);
                if (z != null) {
                    aVar.i = z;
                    break;
                }
                break;
            case 1:
                Integer z2 = ipx.z(str2);
                if (z2 != null) {
                    aVar.v = z2;
                    break;
                }
                break;
            case 2:
                Integer z3 = ipx.z(str2);
                if (z3 != null) {
                    aVar.h = z3;
                    break;
                }
                break;
            case 3:
                aVar.c = str2;
                break;
            case 4:
                aVar.w = str2;
                break;
            case 5:
                aVar.a = str2;
                break;
            case 6:
                aVar.e = str2;
                break;
            case 7:
                Integer z4 = ipx.z(str2);
                if (z4 != null) {
                    aVar.u = z4;
                    break;
                }
                break;
            case '\b':
                aVar.d = str2;
                break;
            case '\t':
                aVar.b = str2;
                break;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            h7x0 h7x0Var = (h7x0) obj;
            if (this.a.equals(h7x0Var.a) && this.b.equals(h7x0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + urd0.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
