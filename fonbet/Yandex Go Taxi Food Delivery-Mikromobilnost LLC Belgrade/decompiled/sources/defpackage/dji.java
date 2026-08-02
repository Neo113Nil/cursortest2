package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ldji;", "", "Companion", "bji", "cji", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class dji {
    public static final cji Companion = new cji();
    public final zzs a;
    public final String b;
    public final String c;

    public /* synthetic */ dji(int i, zzs zzsVar, String str, String str2) {
        this.a = (i & 1) == 0 ? zzs.f : zzsVar;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
    }

    public dji() {
        this(0);
    }

    public dji(int i) {
        this.a = zzs.f;
        this.b = "";
        this.c = "";
    }
}
