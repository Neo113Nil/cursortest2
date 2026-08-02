package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.user.RequestUserProfile;
import xsna.awu;

/* compiled from: RequestsHeader.kt */
/* loaded from: classes16.dex */
public abstract class o8g0 extends awu.b<RequestUserProfile> {
    public final ijs a;

    public o8g0(ijs ijsVar) {
        this.a = ijsVar;
    }

    @Override // xsna.awu.b
    public final int a() {
        return 0;
    }

    @Override // xsna.awu.b
    public final RecyclerView.e0 c(ViewGroup viewGroup) {
        return new p8g0(viewGroup);
    }

    @Override // xsna.awu.b
    public final /* bridge */ /* synthetic */ boolean d(RequestUserProfile requestUserProfile) {
        return false;
    }
}
