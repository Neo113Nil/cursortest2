package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.view.f;

/* loaded from: classes10.dex */
public final class eds extends f {
    public String E;

    @Override // androidx.view.f
    public final void e(Context context, AttributeSet attributeSet) {
        super.e(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, m2i0.FragmentNavigator);
        String string = obtainAttributes.getString(m2i0.FragmentNavigator_android_name);
        if (string != null) {
            this.E = string;
        }
        obtainAttributes.recycle();
    }

    @Override // androidx.view.f
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof eds) && super.equals(obj) && jl40.l(this.E, ((eds) obj).E);
    }

    @Override // androidx.view.f
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.E;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // androidx.view.f
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        String str = this.E;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        return sb.toString();
    }
}
