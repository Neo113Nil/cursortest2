package defpackage;

import androidx.compose.foundation.text.selection.CrossStatus;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes10.dex */
public final class dfq0 {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final dry0 f;

    public dfq0(long j, int i, int i2, int i3, int i4, dry0 dry0Var) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = dry0Var;
    }

    public final bkq0 a(int i) {
        return new bkq0(y8b1.d(this.f, i), i, this.a);
    }

    public final CrossStatus b() {
        int i = this.c;
        int i2 = this.d;
        return i < i2 ? CrossStatus.NOT_CROSSED : i > i2 ? CrossStatus.CROSSED : CrossStatus.COLLAPSED;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=");
        sb.append(this.a);
        sb.append(", range=(");
        int i = this.c;
        sb.append(i);
        sb.append(LicenseUtility.SEPARATOR);
        dry0 dry0Var = this.f;
        sb.append(y8b1.d(dry0Var, i));
        sb.append(HexString.CHAR_COMMA);
        int i2 = this.d;
        sb.append(i2);
        sb.append(LicenseUtility.SEPARATOR);
        sb.append(y8b1.d(dry0Var, i2));
        sb.append("), prevOffset=");
        return oyr.s(sb, this.e, ')');
    }
}
