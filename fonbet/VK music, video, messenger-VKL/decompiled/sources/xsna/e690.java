package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.voip.ui.avatars.VoipAvatarViewContainer;
import com.vk.voip.ui.broadcast.views.config.BroadcastConfigViewParams;
import com.vkontakte.android.R;

/* compiled from: OwnersViewHolder.kt */
/* loaded from: classes7.dex */
public final class e690 extends RecyclerView.e0 {
    public static final /* synthetic */ int s = 0;
    public final View l;
    public final VoipAvatarViewContainer m;
    public final View n;
    public final TextView o;
    public final gdp p;
    public z590 q;
    public ud8 r;

    public e690(View view, BroadcastConfigViewParams broadcastConfigViewParams) {
        super(view);
        Integer num;
        this.l = view;
        VoipAvatarViewContainer voipAvatarViewContainer = (VoipAvatarViewContainer) view.findViewById(R.id.avatar);
        this.m = voipAvatarViewContainer;
        View findViewById = view.findViewById(R.id.selected);
        this.n = findViewById;
        TextView textView = (TextView) view.findViewById(R.id.name);
        this.o = textView;
        this.p = new gdp();
        if (broadcastConfigViewParams != null && (num = broadcastConfigViewParams.j) != null) {
            int intValue = num.intValue();
            ViewGroup.LayoutParams layoutParams = voipAvatarViewContainer.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = intValue;
            layoutParams2.height = intValue;
            voipAvatarViewContainer.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.width = intValue;
            layoutParams4.topMargin = cn70.b(8) + intValue;
            textView.setLayoutParams(layoutParams4);
            ViewGroup.LayoutParams layoutParams5 = findViewById.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
            layoutParams6.setMarginStart(intValue - layoutParams6.width);
            layoutParams6.topMargin = intValue - layoutParams6.height;
            findViewById.setLayoutParams(layoutParams6);
        }
        bwt0.i0(view, new eiz(this, 18));
    }
}
