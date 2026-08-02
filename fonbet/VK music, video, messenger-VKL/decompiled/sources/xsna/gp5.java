package xsna;

import com.vk.dto.common.data.ApiApplication;
import com.vkontakte.android.R;

/* compiled from: AvailableGameItem.kt */
/* loaded from: classes17.dex */
public final class gp5 extends zif0 {
    public final ApiApplication a;

    public gp5(ApiApplication apiApplication) {
        this.a = apiApplication;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_games_available_game_item;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gp5) && epx.f(this.a, ((gp5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AvailableGameItem(app=" + this.a + ')';
    }
}
