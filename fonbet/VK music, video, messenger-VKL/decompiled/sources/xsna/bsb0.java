package xsna;

import android.content.Context;
import com.vk.permission.PermissionHelper;
import com.vk.search.params.api.domain.model.education.University;
import com.vkontakte.android.R;

/* compiled from: PollUserSpanClickListener.kt */
/* loaded from: classes4.dex */
public final class bsb0 implements jph0 {
    public final Context b;

    public boolean a() {
        PermissionHelper.a.getClass();
        return PermissionHelper.b(this.b, PermissionHelper.w);
    }

    @Override // xsna.jph0
    public hfz h(boolean z, cph0 cph0Var, int i) {
        return null;
    }

    @Override // xsna.jph0
    public hfz n(int i, Object obj, boolean z) {
        University university = (University) obj;
        return new iph0(university.c, university.b, null, z, i);
    }

    @Override // xsna.jph0
    public hfz o(boolean z) {
        return new iph0(Integer.MIN_VALUE, this.b.getString(R.string.search_params_any_institution_title), null, z, -1);
    }

    public bsb0(Context context, vmb0 vmb0Var) {
        this.b = context;
    }
}
