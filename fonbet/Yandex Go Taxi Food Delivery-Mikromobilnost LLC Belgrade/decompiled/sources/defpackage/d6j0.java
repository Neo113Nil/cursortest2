package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.eatskit.dto.ErrorType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ld6j0;", "", "Companion", "b6j0", "c6j0", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d6j0 {
    public static final c6j0 Companion = new c6j0();
    public static final i3y[] f = {null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new lqi0(22))};
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final ErrorType e;

    public /* synthetic */ d6j0(int i, String str, String str2, String str3, Integer num, ErrorType errorType) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
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
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = errorType;
        }
    }

    public d6j0() {
        this(null, null, null, null, 31);
    }

    public d6j0(String str, String str2, Integer num, ErrorType errorType, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? "" : str2;
        num = (i & 8) != 0 ? null : num;
        errorType = (i & 16) != 0 ? null : errorType;
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = num;
        this.e = errorType;
    }
}
