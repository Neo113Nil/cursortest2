package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.settings.api.dto.settings.types.SetSettingType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lj4r0;", "", "Companion", "h4r0", "i4r0", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class j4r0 {
    public static final i4r0 Companion = new i4r0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new iwq0(14))};
    public final String a;
    public final SetSettingType b;

    public /* synthetic */ j4r0(int i, String str, SetSettingType setSettingType) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = SetSettingType.NONE;
        } else {
            this.b = setSettingType;
        }
    }

    public j4r0() {
        this(0);
    }

    public j4r0(int i) {
        SetSettingType setSettingType = SetSettingType.NONE;
        this.a = "";
        this.b = setSettingType;
    }
}
