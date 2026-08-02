package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.ecomm.design.view.DiscreteProgressBar;
import com.vkontakte.android.R;

/* compiled from: CommunityChecklistView.kt */
/* loaded from: classes17.dex */
public final class cxg extends CardView {
    public final bpn0 i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final bpn0 m;
    public final bpn0 n;
    public final bpn0 o;

    public cxg(Context context) {
        super(context, null, 0);
        this.i = new bpn0(new sfg(this, 1));
        this.j = new bpn0(new kd(this, 26));
        this.k = new bpn0(new ld(this, 25));
        this.l = new bpn0(new h6(this, 25));
        this.m = new bpn0(new we0(this, 29));
        this.n = new bpn0(new ozf(this, 3));
        this.o = new bpn0(new u40(this, 29));
        u11.h(-1, -2, LayoutInflater.from(context).inflate(R.layout.pds_item_community_checklist_banner, (ViewGroup) this, true));
    }

    private final VkSimpleButton getButton() {
        return (VkSimpleButton) this.m.getValue();
    }

    private final VkText getCaption() {
        return (VkText) this.j.getValue();
    }

    private final VkImageSimple getCloseButton() {
        return (VkImageSimple) this.n.getValue();
    }

    private final VkImage getImage() {
        return (VkImage) this.l.getValue();
    }

    private final VkText getProgressTitle() {
        return (VkText) this.k.getValue();
    }

    private final DiscreteProgressBar getProgressbar() {
        return (DiscreteProgressBar) this.o.getValue();
    }

    private final VkText getTitle() {
        return (VkText) this.i.getValue();
    }

    private final void setButton(dxg dxgVar) {
        getButton().setText(getContext().getString(R.string.community_start_tips_button_text));
        jjc.g(getButton(), new cqf(dxgVar, 6));
    }

    private final void setProgress(dxg dxgVar) {
        dxgVar.getClass();
        int i = dxgVar.b;
        int i2 = dxgVar.a;
        getProgressTitle().setText(getContext().getString(R.string.community_start_tips_progress, Integer.valueOf(i2), Integer.valueOf(i)));
        getProgressbar().setMax(i);
        getProgressbar().setProgress(i2);
    }

    public final void d(dxg dxgVar) {
        if (dxgVar == null) {
            f4m.j(this);
            return;
        }
        setVisibility(0);
        getTitle().setText(getContext().getString(R.string.community_start_tips_title));
        getCaption().setText(getContext().getString(R.string.community_start_tips_caption));
        setProgress(dxgVar);
        setButton(dxgVar);
        String str = dhr0.L() ? dxgVar.c : dxgVar.d;
        if (str != null && !drm0.N(str)) {
            getImage().o0(str, null);
        }
        getCloseButton().setOnClickListener(new a11(dxgVar, 3));
    }
}
