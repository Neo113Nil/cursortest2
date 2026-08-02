package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ll13;", "", "Companion", "j13", "k13", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class l13 {
    public static final k13 Companion = new k13();
    public final boolean a;
    public final String b;
    public final String c;
    public final int d;
    public final long e;
    public final long f;

    public /* synthetic */ l13(int i, boolean z, String str, String str2, int i2, long j) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i2;
        }
        this.e = 0L;
        if ((i & 16) == 0) {
            this.f = 0L;
        } else {
            this.f = j;
        }
    }

    public l13(boolean z, String str, String str2, int i, long j, long j2) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = j;
        this.f = j2;
    }

    public l13() {
        this(false, (String) null, (String) null, 0, 0L, 0L);
    }
}
