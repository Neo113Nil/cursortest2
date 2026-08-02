package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.div.internal.widget.tabs.TabView;

/* loaded from: classes.dex */
public final class d5x0 implements ar31 {
    public final Context a;

    public d5x0(Context context) {
        this.a = context;
    }

    @Override // defpackage.ar31
    public final View a() {
        return new TabView(this.a);
    }
}
