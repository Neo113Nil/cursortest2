package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.settings.api.dto.settings.types.SectionItemActionType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lil10;", "", "Companion", "gl10", "hl10", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class il10 {
    public static final hl10 Companion = new hl10();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new w410(17)), null};
    public final SectionItemActionType a;
    public final j4r0 b;

    public /* synthetic */ il10(int i, SectionItemActionType sectionItemActionType, j4r0 j4r0Var) {
        this.a = (i & 1) == 0 ? SectionItemActionType.NONE : sectionItemActionType;
        if ((i & 2) == 0) {
            this.b = new j4r0(0);
        } else {
            this.b = j4r0Var;
        }
    }

    public il10() {
        this(0);
    }

    public il10(int i) {
        SectionItemActionType sectionItemActionType = SectionItemActionType.NONE;
        j4r0 j4r0Var = new j4r0(0);
        this.a = sectionItemActionType;
        this.b = j4r0Var;
    }
}
