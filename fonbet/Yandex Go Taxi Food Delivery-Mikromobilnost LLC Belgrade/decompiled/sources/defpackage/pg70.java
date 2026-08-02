package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lpg70;", "", "Companion", "hg70", "ig70", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class pg70 {
    public static final ig70 Companion = new ig70();
    public final String a;
    public final String b;
    public final Integer c;
    public final int[] d;

    public /* synthetic */ pg70(int i, String str, String str2, Integer num, int[] iArr) {
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
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = iArr;
        }
    }

    /* renamed from: a, reason: from getter */
    public final int[] getD() {
        return this.d;
    }

    public pg70() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
