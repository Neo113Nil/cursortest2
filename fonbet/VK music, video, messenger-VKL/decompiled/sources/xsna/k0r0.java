package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.auth.ui.AuthExchangeAvatarControlView;
import com.vk.superapp.api.dto.auth.UserItem;
import com.vkontakte.android.R;

/* compiled from: UserViewHolder.kt */
/* loaded from: classes15.dex */
public final class k0r0 extends RecyclerView.e0 {
    public final exi0 l;
    public final qhg0 m;
    public final AuthExchangeAvatarControlView n;
    public final TextView o;
    public final x01 p;
    public UserItem q;

    /* compiled from: UserViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountProfileType.values().length];
            try {
                iArr[AccountProfileType.EDU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public k0r0(ViewGroup viewGroup, exi0 exi0Var, qhg0 qhg0Var) {
        super(tf3.b(viewGroup, R.layout.vk_auth_carousel_user_item, viewGroup, false));
        this.l = exi0Var;
        this.m = qhg0Var;
        AuthExchangeAvatarControlView authExchangeAvatarControlView = (AuthExchangeAvatarControlView) this.itemView.findViewById(R.id.user_controller);
        this.n = authExchangeAvatarControlView;
        this.o = (TextView) this.itemView.findViewById(R.id.name);
        this.p = new x01(this, 8);
        authExchangeAvatarControlView.getDeleteButton().setOnClickListener(new k1(this, 15));
    }
}
