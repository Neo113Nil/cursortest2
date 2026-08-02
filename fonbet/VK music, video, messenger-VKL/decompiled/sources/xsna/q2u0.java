package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.user.RequestUserProfile;
import com.vkontakte.android.R;

/* compiled from: ViewedRequestsHeader.kt */
/* loaded from: classes16.dex */
public final class q2u0 extends o8g0 {
    @Override // xsna.awu.b
    public final void b(RecyclerView.e0 e0Var) {
        p8g0.V5((p8g0) e0Var, R.string.requests_list_viewed_requests);
    }

    @Override // xsna.awu.b
    public final boolean e(RequestUserProfile requestUserProfile) {
        ijs ijsVar = this.a;
        return ijsVar.l == 0 && ijsVar.m > 0;
    }

    @Override // xsna.awu.b
    public final boolean f(int i, Object obj, Object obj2) {
        ijs ijsVar = this.a;
        int i2 = ijsVar.m;
        int i3 = ijsVar.l;
        if (i2 - i3 > 0) {
            return i3 == 0 || i3 + 1 == i;
        }
        return false;
    }
}
