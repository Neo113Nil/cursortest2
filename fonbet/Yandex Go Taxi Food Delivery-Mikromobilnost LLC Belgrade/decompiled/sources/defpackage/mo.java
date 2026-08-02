package defpackage;

import com.yandex.quark.alice.AliceSessionType;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class mo {
    public static final lo Companion = new lo();
    public static final i3y[] e = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new pd(15))};
    public final byte[] a;
    public final gej b;
    public final String c;
    public final AliceSessionType d;

    public /* synthetic */ mo(int i, byte[] bArr, gej gejVar, String str, AliceSessionType aliceSessionType) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, ko.a.getDescriptor());
            throw null;
        }
        this.a = bArr;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = gejVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = AliceSessionType.TEXT;
        } else {
            this.d = aliceSessionType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!mo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        mo moVar = (mo) obj;
        return Arrays.equals(this.a, moVar.a) && jl40.l(this.b, moVar.b) && this.d == moVar.d;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.a) * 31;
        gej gejVar = this.b;
        return this.d.hashCode() + ((hashCode + (gejVar != null ? gejVar.hashCode() : 0)) * 31);
    }

    public mo(byte[] bArr) {
        AliceSessionType aliceSessionType = AliceSessionType.TEXT;
        this.a = bArr;
        this.b = null;
        this.c = null;
        this.d = aliceSessionType;
    }
}
