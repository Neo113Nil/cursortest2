package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.dto.user.UserProfile;
import com.vk.libvideo.live.impl.views.stat.StatAdapter;
import com.vkontakte.android.R;

/* compiled from: LiveUserHolder.kt */
/* loaded from: classes7.dex */
public final class vmz extends ekq0<UserProfile> {
    public final long A;
    public StatAdapter.c B;
    public final ImageView w;
    public boolean x;
    public UserProfile y;
    public final long z;

    public vmz(ViewGroup viewGroup) {
        super(viewGroup, R.layout.stat_user, false, true);
        this.w = (ImageView) this.itemView.findViewById(R.id.action);
        this.z = 5000L;
        this.A = 500L;
    }

    @Override // xsna.ekq0, android.view.View.OnClickListener
    public final void onClick(View view) {
        super.onClick(view);
        if (epx.f(view, this.w)) {
            StatAdapter.c cVar = this.B;
            if (cVar == null) {
                cVar = null;
            }
            UserProfile userProfile = this.y;
            cVar.invoke(userProfile != null ? userProfile : null, Integer.valueOf(getAdapterPosition()));
        }
    }
}
