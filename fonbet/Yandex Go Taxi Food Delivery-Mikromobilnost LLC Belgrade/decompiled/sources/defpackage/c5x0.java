package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.alicekit.core.widget.TabView;

/* loaded from: classes11.dex */
public final class c5x0 implements zq31 {
    public final Context a;

    public c5x0(Context context) {
        this.a = context;
    }

    @Override // defpackage.zq31
    public final View a() {
        return new TabView(this.a);
    }
}
