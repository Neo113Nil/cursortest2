package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.user.UserProfile;
import com.vk.search.fragment.RestoreSearchFragment;
import com.vkontakte.android.R;

/* compiled from: SearchRestoreUserHolder.kt */
/* loaded from: classes5.dex */
public final class eyh0 extends ekq0<UserProfile> {
    public final TextView w;

    public eyh0(ViewGroup viewGroup, RestoreSearchFragment.b.a aVar) {
        super(viewGroup, R.layout.vk_restore_search_user_item, false, false);
        this.q = this.itemView.findViewById(R.id.verified);
        this.w = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.t = new lfa(18, this, aVar);
    }

    @Override // xsna.ekq0, xsna.vif0
    /* renamed from: q6, reason: merged with bridge method [inline-methods] */
    public final void i6(UserProfile userProfile) {
        super.i6(userProfile);
        boolean isEmpty = TextUtils.isEmpty(userProfile.r);
        TextView textView = this.w;
        if (isEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setText(userProfile.r);
            textView.setVisibility(0);
        }
    }
}
