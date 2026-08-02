package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.user.RequestUserProfile;
import com.vkontakte.android.R;
import xsna.awu;

/* compiled from: ShowAllHeader.kt */
/* loaded from: classes16.dex */
public final class nhj0 extends awu.b<RequestUserProfile> {
    public final ijs a;
    public final enh b;

    /* compiled from: ShowAllHeader.kt */
    public static final class a extends RecyclerView.e0 {
    }

    public nhj0(ijs ijsVar, enh enhVar) {
        this.a = ijsVar;
        this.b = enhVar;
    }

    @Override // xsna.awu.b
    public final int a() {
        return 1;
    }

    @Override // xsna.awu.b
    public final RecyclerView.e0 c(ViewGroup viewGroup) {
        a aVar = new a(tf3.b(viewGroup, R.layout.requests_list_show_all_header, viewGroup, false));
        aVar.itemView.setOnClickListener(new n14(this, 7));
        return aVar;
    }

    @Override // xsna.awu.b
    public final boolean d(RequestUserProfile requestUserProfile) {
        RequestUserProfile requestUserProfile2 = requestUserProfile;
        ijs ijsVar = this.a;
        return ijsVar.m - ijsVar.l > 2 && ijsVar.n.b() == null && requestUserProfile2 != null && !requestUserProfile2.n0;
    }

    @Override // xsna.awu.b
    public final /* bridge */ /* synthetic */ boolean e(RequestUserProfile requestUserProfile) {
        return false;
    }

    @Override // xsna.awu.b
    public final boolean f(int i, Object obj, Object obj2) {
        RequestUserProfile requestUserProfile = (RequestUserProfile) obj;
        RequestUserProfile requestUserProfile2 = (RequestUserProfile) obj2;
        ijs ijsVar = this.a;
        if (ijsVar.m - ijsVar.l <= 2 || ijsVar.n.b() != null || requestUserProfile == null || requestUserProfile.n0) {
            return false;
        }
        return requestUserProfile2 == null || requestUserProfile2.n0;
    }

    @Override // xsna.awu.b
    public final void b(RecyclerView.e0 e0Var) {
    }
}
