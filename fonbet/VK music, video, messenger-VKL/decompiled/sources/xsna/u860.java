package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.user.RequestUserProfile;
import com.vkontakte.android.R;

/* compiled from: NewRequestsHeader.kt */
/* loaded from: classes16.dex */
public final class u860 extends o8g0 {
    @Override // xsna.awu.b
    public final void b(RecyclerView.e0 e0Var) {
        p8g0.V5((p8g0) e0Var, R.string.requests_list_requests);
    }

    @Override // xsna.awu.b
    public final boolean e(RequestUserProfile requestUserProfile) {
        return this.a.l > 0;
    }

    @Override // xsna.awu.b
    public final /* bridge */ /* synthetic */ boolean f(int i, Object obj, Object obj2) {
        return false;
    }
}
