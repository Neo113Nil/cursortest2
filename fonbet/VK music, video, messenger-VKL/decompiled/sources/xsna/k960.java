package xsna;

import com.vkontakte.android.R;

/* compiled from: WidgetSettingItem.kt */
/* loaded from: classes6.dex */
public final class k960 extends tnx0 {
    public final qnx0 b;

    public k960(qnx0 qnx0Var) {
        super(qnx0Var);
        this.b = qnx0Var;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.new_item_widget_settings;
    }

    @Override // xsna.tnx0
    public final qnx0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k960) && epx.f(this.b, ((k960) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "NewWidgetSettingItem(data=" + this.b + ')';
    }
}
