package xsna;

import android.content.Context;
import com.vk.profile.user.impl.ui.UserProfileAction;
import java.text.SimpleDateFormat;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class h59 implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h59(Context context, int i, i59 i59Var) {
        this.d = context;
        this.c = i;
        this.e = i59Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new SimpleDateFormat(((Context) this.d).getString(this.c), ((i59) this.e).d);
            default:
                UserProfileAction.a aVar = (UserProfileAction.a) this.d;
                jmq0 jmq0Var = (jmq0) this.e;
                StringBuilder sb = new StringBuilder("UserProfileAvatarFeatureDelegate: handleActivityResult(): action.isSuccess: ");
                sb.append(aVar.a());
                sb.append(", saltStableId = ");
                String str = jmq0Var.g;
                sb.append(str != null ? Integer.valueOf(str.hashCode()) : null);
                sb.append(", saltFallbackId = ");
                sb.append(jmq0Var.hashCode());
                sb.append(", action.reqCode = ");
                cgn.a(aVar.b, this.c, ", requestCode = ", ", action.resCode = ", sb);
                sb.append(aVar.c);
                return sb.toString();
        }
    }

    public /* synthetic */ h59(UserProfileAction.a aVar, jmq0 jmq0Var, int i) {
        this.d = aVar;
        this.e = jmq0Var;
        this.c = i;
    }
}
