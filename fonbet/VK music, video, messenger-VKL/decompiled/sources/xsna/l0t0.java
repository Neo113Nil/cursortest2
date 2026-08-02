package xsna;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vkontakte.android.R;
import xsna.ky6;

/* compiled from: VideoOfflineStatusViewHolder.kt */
/* loaded from: classes3.dex */
public final class l0t0 extends RecyclerView.e0 implements View.OnClickListener {
    public final ky6 l;
    public final View m;
    public final TextView n;
    public final View o;
    public final TextView p;
    public final TextView q;
    public final ImageView r;
    public final View s;
    public final VkSimpleButton t;
    public final VkSimpleButton u;

    public l0t0(View view, lqs0 lqs0Var) {
        super(view);
        this.l = Preference.j();
        this.m = view.findViewById(R.id.collapsed_container);
        this.n = (TextView) view.findViewById(R.id.collapsed_status);
        View findViewById = view.findViewById(R.id.expanded_container);
        this.o = findViewById;
        this.p = (TextView) findViewById.findViewById(R.id.offline_placeholder_view_title);
        this.q = (TextView) findViewById.findViewById(R.id.offline_placeholder_view_description);
        this.r = (ImageView) findViewById.findViewById(R.id.offline_placeholder_view_image);
        View findViewById2 = view.findViewById(R.id.dismiss_button);
        this.s = findViewById2;
        VkSimpleButton vkSimpleButton = (VkSimpleButton) view.findViewById(R.id.primary_button);
        this.t = vkSimpleButton;
        VkSimpleButton vkSimpleButton2 = (VkSimpleButton) view.findViewById(R.id.collapsed_primary_button);
        this.u = vkSimpleButton2;
        findViewById2.setOnClickListener(this);
        bwt0.i0(vkSimpleButton, new vth(4, lqs0Var));
        bwt0.i0(vkSimpleButton2, new k0t0(0, lqs0Var));
    }

    public final void V5() {
        if (!this.l.getBoolean("video_offline_placeholder_collapse_needed", true) || BuildInfo.q()) {
            bwt0.p0(this.m, true);
            bwt0.p0(this.s, false);
            bwt0.p0(this.o, false);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        ky6.a aVar = (ky6.a) this.l.edit();
        aVar.putBoolean("video_offline_placeholder_collapse_needed", false);
        aVar.commit();
        V5();
    }
}
