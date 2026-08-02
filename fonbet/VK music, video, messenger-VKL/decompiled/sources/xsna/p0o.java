package xsna;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.PhotoStackView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.newsfeed.Owner;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DonutLinkAttachment;
import java.util.List;

/* compiled from: DonutLinkHolder.kt */
/* loaded from: classes4.dex */
public final class p0o extends m56<DonutLinkAttachment> implements View.OnClickListener, blc0 {
    public static final /* synthetic */ int T = 0;
    public final View D;
    public final VkImage E;
    public final View F;
    public final TextView G;
    public final View H;
    public final TextView I;
    public final View J;
    public final TextView K;
    public final PhotoStackView L;
    public final TextView M;
    public final View N;
    public final StringBuilder O;
    public boolean P;
    public View.OnClickListener Q;
    public e6o R;
    public e6o S;

    public p0o(ViewGroup viewGroup) {
        super(R.layout.attach_donut_link, viewGroup);
        this.D = this.itemView.findViewById(R.id.container);
        VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.photo);
        this.E = vkImage;
        View findViewById = this.itemView.findViewById(R.id.badge);
        this.F = findViewById;
        this.G = (TextView) this.itemView.findViewById(R.id.title);
        this.H = this.itemView.findViewById(R.id.icon);
        this.I = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.J = this.itemView.findViewById(R.id.info_container);
        this.K = (TextView) this.itemView.findViewById(R.id.description);
        PhotoStackView photoStackView = (PhotoStackView) this.itemView.findViewById(R.id.photos);
        this.L = photoStackView;
        this.M = (TextView) this.itemView.findViewById(R.id.button);
        this.N = this.itemView.findViewById(R.id.attach_snippet_bg_remove_button);
        this.O = new StringBuilder();
        this.P = true;
        vkImage.setPlaceholderImage(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_image_placeholder)));
        photoStackView.setMarginBetweenImages(1.0f);
        photoStackView.setBorderWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        photoStackView.setOverlapOffset(0.6875f);
        X6();
        bwt0.X(R.drawable.vk_icon_donut_color_16, findViewById);
        findViewById.setOutlineProvider(p0w0.a);
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        bwt0.p0(this.N, z);
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        ba baVar = s6oVar.e;
        this.R = s6oVar.a(this, baVar);
        View.OnClickListener onClickListener = this.Q;
        if (onClickListener != null) {
            this.S = s6oVar.a(onClickListener, baVar);
        }
        X6();
    }

    @Override // xsna.m56
    public final void T6(DonutLinkAttachment donutLinkAttachment) {
        Image image;
        List<Owner> list;
        DonutLinkAttachment donutLinkAttachment2 = donutLinkAttachment;
        CharSequence charSequence = donutLinkAttachment2.o;
        Owner owner = donutLinkAttachment2.f;
        if (owner == null || (image = owner.g) == null) {
            image = Image.d;
        }
        ImageSize Cb = image.Cb(cn70.b(40), true, false);
        this.E.o0(Cb != null ? Cb.d.d : null, null);
        this.G.setText(donutLinkAttachment2.n);
        TextView textView = this.I;
        textView.setText(charSequence);
        bwt0.p0(textView, !(charSequence == null || charSequence.length() == 0));
        Owner owner2 = donutLinkAttachment2.f;
        VerifyInfo verifyInfo = owner2 != null ? owner2.f : null;
        boolean z = (verifyInfo != null && verifyInfo.b) || (verifyInfo != null && verifyInfo.c);
        View view = this.H;
        if (verifyInfo != null && z) {
            view.setBackground(VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, this.itemView.getContext(), null, 28));
        }
        bwt0.p0(view, z);
        StringBuilder sb = this.O;
        sb.setLength(0);
        int i = donutLinkAttachment2.i;
        int i2 = donutLinkAttachment2.j;
        if (i > 0) {
            sb.append(s6(R.plurals.donors, i, uqm0.f(i)));
        }
        if (i2 > 0) {
            if (sb.length() > 0) {
                sb.append(" · ");
            }
            sb.append(s6(R.plurals.friends_quantity, i2, uqm0.f(i2)));
        }
        TextView textView2 = this.K;
        textView2.setText(sb);
        bwt0.p0(textView2, sb.length() > 0);
        List<Owner> list2 = donutLinkAttachment2.k;
        boolean z2 = this.P;
        PhotoStackView photoStackView = this.L;
        if (!z2 || (list = list2) == null || list.isEmpty()) {
            bwt0.p0(photoStackView, false);
        } else {
            int size = list2.size();
            if (size > 3) {
                size = 3;
            }
            photoStackView.setCount(size);
            for (int i3 = 0; i3 < size; i3++) {
                photoStackView.h(i3, list2.get(i3).f(cn70.b(16)));
            }
            bwt0.p0(photoStackView, true);
        }
        this.M.setText(donutLinkAttachment2.l.b);
    }

    public final void X6() {
        View.OnClickListener onClickListener = this.R;
        if (onClickListener == null) {
            onClickListener = this;
        }
        this.itemView.setOnClickListener(onClickListener);
        this.M.setOnClickListener(onClickListener);
        View.OnClickListener onClickListener2 = this.Q;
        if (onClickListener2 != null) {
            e6o e6oVar = this.S;
            if (e6oVar != null) {
                onClickListener2 = e6oVar;
            }
            this.N.setOnClickListener(onClickListener2);
        }
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
        this.Q = onClickListener;
        s6o s6oVar = this.q;
        this.S = s6oVar != null ? s6oVar.a(onClickListener, s6oVar.e) : null;
        X6();
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        if (epx.f(view, this.itemView)) {
            W6(view);
        } else if (epx.f(view, this.M)) {
            U6(view);
        }
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
    }
}
