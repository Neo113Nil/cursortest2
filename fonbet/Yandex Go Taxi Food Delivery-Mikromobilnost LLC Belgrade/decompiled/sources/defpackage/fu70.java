package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes6.dex */
public final class fu70 {
    public static final eu70 Companion = new eu70();
    public final boolean a;
    public final boolean b;

    public /* synthetic */ fu70(int i, boolean z, boolean z2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, du70.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = z2;
    }

    public final String toString() {
        return ly3.o("TollRoadsParam(userHadChoice=", ", userChoseTollRoad=", Extension.C_BRAKE, this.a, this.b);
    }

    public fu70(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
