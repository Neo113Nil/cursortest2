package xsna;

import com.vkontakte.android.R;

/* compiled from: LocalityItem.kt */
/* loaded from: classes6.dex */
public final class uwz extends zif0 {
    public final qwz a;

    public uwz(qwz qwzVar) {
        this.a = qwzVar;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_item_superapp_locality;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uwz) && epx.f(this.a, ((uwz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LocalityItem(data=" + this.a + ')';
    }
}
