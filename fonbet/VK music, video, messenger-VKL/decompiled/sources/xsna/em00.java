package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.profile.user.impl.ui.UserProfileAction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class em00 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ RecyclerView.e0 d;

    public /* synthetic */ em00(int i, int i2, RecyclerView.e0 e0Var) {
        this.b = i2;
        this.d = e0Var;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                bwt0.c0(this.c, ((im00) this.d).itemView);
                break;
            default:
                ((arq0) this.d).n.a(new UserProfileAction.d.b.a.c(this.c));
                break;
        }
        return s3q0.a;
    }
}
