package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.data.model.SuperPassesDisplayVersionDto;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lb4o;", "", "Companion", "b", "a", "y3o", "c4o", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class b4o {
    public static final c4o Companion = new c4o();
    public static final i3y[] h = {null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fgn(25))};
    public final FormattedText a;
    public final FormattedText b;
    public final String c;
    public final FormattedText d;
    public final b e;
    public final a f;
    public final SuperPassesDisplayVersionDto g;

    public /* synthetic */ b4o(int i, FormattedText formattedText, FormattedText formattedText2, String str, FormattedText formattedText3, b bVar, a aVar, SuperPassesDisplayVersionDto superPassesDisplayVersionDto) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = formattedText3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = aVar;
        }
        if ((i & 64) == 0) {
            this.g = SuperPassesDisplayVersionDto.V2;
        } else {
            this.g = superPassesDisplayVersionDto;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lb4o$b;", "", "Companion", "a", "e4o", "f4o", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class b {
        public static final f4o Companion = new f4o();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fgn(27))};
        public final FormattedText a;
        public final FormattedText b;
        public final List c;

        public /* synthetic */ b(int i, List list, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = EmptyList.a;
            } else {
                this.c = list;
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lb4o$b$a;", "", "Companion", "g4o", "h4o", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class a {
            public static final h4o Companion = new h4o();
            public final FormattedText a;
            public final String b;

            public /* synthetic */ a(int i, String str, FormattedText formattedText) {
                this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                if ((i & 2) == 0) {
                    this.b = "";
                } else {
                    this.b = str;
                }
            }

            public a() {
                this.a = FormattedText.c;
                this.b = "";
            }
        }

        public b() {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
            this.c = EmptyList.a;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lb4o$a;", "", "Companion", "z3o", "a4o", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final a4o Companion = new a4o();
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

    public b4o() {
        FormattedText formattedText = FormattedText.c;
        SuperPassesDisplayVersionDto superPassesDisplayVersionDto = SuperPassesDisplayVersionDto.V2;
        this.a = formattedText;
        this.b = formattedText;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = superPassesDisplayVersionDto;
    }
}
