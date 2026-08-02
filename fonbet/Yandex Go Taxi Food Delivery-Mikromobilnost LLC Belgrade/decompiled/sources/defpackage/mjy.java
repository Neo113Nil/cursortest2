package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.persuggest.api.zerosuggest.SectionType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lmjy;", "Lnyp0;", "Companion", "kjy", "ljy", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class mjy extends nyp0 {
    public static final ljy Companion = new ljy();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new vix(28))};
    public final List a;

    public /* synthetic */ mjy(int i, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
    }

    @Override // defpackage.nyp0
    public final SectionType a() {
        return SectionType.LINES_SECTION;
    }

    public mjy() {
        this.a = null;
    }
}
