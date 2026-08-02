package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.b;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lfvo0;", "Lw96;", "Lc6z;", "Companion", "a", "gvo0", "cvo0", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class fvo0 extends w96 implements c6z {
    public static final gvo0 Companion = new gvo0();
    public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zqn0(29)), null, null};
    public static final fvo0 g = new fvo0(0);
    public final boolean b;
    public final Map c;
    public final long d;
    public final a e;

    public /* synthetic */ fvo0(int i, boolean z, Map map, long j, a aVar) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = 10L;
        } else {
            this.d = j;
        }
        if ((i & 8) == 0) {
            this.e = new a(0);
        } else {
            this.e = aVar;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lfvo0$a;", "", "Companion", "dvo0", "evo0", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final evo0 Companion = new evo0();
        public final FormattedText a;
        public final FormattedText b;
        public final FormattedText c;

        public /* synthetic */ a(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = FormattedText.c;
            } else {
                this.c = formattedText3;
            }
        }

        public a() {
            this(0);
        }

        public a(int i) {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
            this.c = formattedText;
        }
    }

    public fvo0() {
        this(0);
    }

    public fvo0(int i) {
        Map f2 = b.f();
        a aVar = new a(0);
        this.b = false;
        this.c = f2;
        this.d = 10L;
        this.e = aVar;
    }
}
