package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lh03;", "", "Companion", "f03", "g03", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class h03 {
    public static final g03 Companion = new g03();
    public final Integer a;
    public final Integer b;
    public final Long c;
    public final Integer d;
    public final Integer e;
    public final long f;

    public /* synthetic */ h03(int i, Integer num, Integer num2, Long l, Integer num3, Integer num4, long j) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num4;
        }
        if ((i & 32) == 0) {
            this.f = 0L;
        } else {
            this.f = j;
        }
    }

    public h03(Integer num, Integer num2, Long l, Integer num3, Integer num4, long j) {
        this.a = num;
        this.b = num2;
        this.c = l;
        this.d = num3;
        this.e = num4;
        this.f = j;
    }

    public h03() {
        this(null, null, null, null, null, 0L);
    }
}
