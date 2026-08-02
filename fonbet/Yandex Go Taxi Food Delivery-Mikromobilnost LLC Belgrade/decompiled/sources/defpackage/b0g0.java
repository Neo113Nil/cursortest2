package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lb0g0;", "", "Companion", "a", "xzf0", "yzf0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class b0g0 {
    public static final yzf0 Companion = new yzf0();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlf0(15))};
    public final FormattedText a;
    public final FormattedText b;
    public final FormattedText c;
    public final List d;

    public /* synthetic */ b0g0(int i, List list, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lb0g0$a;", "", "Companion", "zzf0", "a0g0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final a0g0 Companion = new a0g0();
        public final FormattedText a;
        public final String b;

        public /* synthetic */ a(int i, String str, FormattedText formattedText) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = formattedText;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
        }

        public a() {
            this.a = null;
            this.b = null;
        }
    }

    public b0g0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
