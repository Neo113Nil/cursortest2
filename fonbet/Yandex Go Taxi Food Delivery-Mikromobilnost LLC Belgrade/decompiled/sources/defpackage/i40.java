package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.view.f;

/* loaded from: classes10.dex */
public final class i40 extends f {
    public Intent E;
    public String F;

    @Override // androidx.view.f
    public final void e(Context context, AttributeSet attributeSet) {
        super.e(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, k2i0.ActivityNavigator);
        String string = obtainAttributes.getString(k2i0.ActivityNavigator_targetPackage);
        String v = string != null ? cvu0.v(string, "${applicationId}", context.getPackageName(), false) : null;
        if (this.E == null) {
            this.E = new Intent();
        }
        this.E.setPackage(v);
        String string2 = obtainAttributes.getString(k2i0.ActivityNavigator_android_name);
        if (string2 != null) {
            if (string2.charAt(0) == '.') {
                string2 = context.getPackageName() + string2;
            }
            ComponentName componentName = new ComponentName(context, string2);
            if (this.E == null) {
                this.E = new Intent();
            }
            this.E.setComponent(componentName);
        }
        String string3 = obtainAttributes.getString(k2i0.ActivityNavigator_action);
        if (this.E == null) {
            this.E = new Intent();
        }
        this.E.setAction(string3);
        String string4 = obtainAttributes.getString(k2i0.ActivityNavigator_data);
        String v2 = string4 != null ? cvu0.v(string4, "${applicationId}", context.getPackageName(), false) : null;
        if (v2 != null) {
            Uri parse = Uri.parse(v2);
            if (this.E == null) {
                this.E = new Intent();
            }
            this.E.setData(parse);
        }
        String string5 = obtainAttributes.getString(k2i0.ActivityNavigator_dataPattern);
        this.F = string5 != null ? cvu0.v(string5, "${applicationId}", context.getPackageName(), false) : null;
        obtainAttributes.recycle();
    }

    @Override // androidx.view.f
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof i40) && super.equals(obj)) {
            Intent intent = this.E;
            if ((intent != null ? intent.filterEquals(((i40) obj).E) : ((i40) obj).E == null) && jl40.l(this.F, ((i40) obj).F)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.view.f
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Intent intent = this.E;
        int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.F;
        return filterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // androidx.view.f
    public final String toString() {
        Intent intent = this.E;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (component != null) {
            sb.append(" class=");
            sb.append(component.getClassName());
        } else {
            Intent intent2 = this.E;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb.append(" action=");
                sb.append(action);
            }
        }
        return sb.toString();
    }
}
