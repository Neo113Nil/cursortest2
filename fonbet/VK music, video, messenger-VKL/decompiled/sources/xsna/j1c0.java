package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.common.presentation.model.items.CoownershipStatusUiDto;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PostCoownersInviteBannerHolder.kt */
/* loaded from: classes4.dex */
public final class j1c0 extends rp6<m1c0, Post> implements w8i {
    public final Object E;
    public final Object F;
    public final Object G;
    public final MotionLayout H;
    public final VKImageView I;
    public final VKImageView J;
    public final TextView K;
    public final TextView L;
    public final VkButton M;
    public final VkButton N;
    public final VkButton O;
    public final ImageView P;
    public final int Q;

    /* compiled from: PostCoownersInviteBannerHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoownershipStatusUiDto.values().length];
            try {
                iArr[CoownershipStatusUiDto.Approved.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoownershipStatusUiDto.Rejected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoownershipStatusUiDto.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoownershipStatusUiDto.Closed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public j1c0(ViewGroup viewGroup) {
        super(R.layout.feed_post_coowners_invite_banner, viewGroup);
        tu80 tu80Var = new tu80(this, 9);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.E = msy.a(lazyThreadSafetyMode, tu80Var);
        this.F = msy.a(lazyThreadSafetyMode, new dj60(this, 12));
        this.G = msy.a(lazyThreadSafetyMode, new ob0(24));
        this.H = (MotionLayout) this.itemView.findViewById(R.id.feed_coauthors_photos);
        this.I = (VKImageView) this.itemView.findViewById(R.id.feed_coauthors_author_photo);
        this.J = (VKImageView) this.itemView.findViewById(R.id.feed_coauthors_coauthor_photo);
        this.K = (TextView) this.itemView.findViewById(R.id.feed_coowners_invite_title);
        this.L = (TextView) this.itemView.findViewById(R.id.feed_coowners_invite_accepted_subtitle);
        VkButton vkButton = (VkButton) this.itemView.findViewById(R.id.feed_coowners_invite_accept_button);
        this.M = vkButton;
        VkButton vkButton2 = (VkButton) this.itemView.findViewById(R.id.feed_coowners_invite_decline_button);
        this.N = vkButton2;
        VkButton vkButton3 = (VkButton) this.itemView.findViewById(R.id.feed_coowners_invite_settings_button);
        this.O = vkButton3;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.feed_coowners_invite_close_button);
        this.P = imageView;
        this.Q = cn70.b(28);
        jjc.g(vkButton, new x2y(this, 28));
        jjc.g(vkButton2, new es00(this, 23));
        jjc.g(imageView, new fda0(this, 3));
        jjc.g(vkButton3, new gda0(this, 3));
    }

    @Override // xsna.rp6
    public final void R6(m1c0 m1c0Var) {
        m1c0 m1c0Var2 = m1c0Var;
        TextView textView = this.L;
        bwt0.p0(textView, false);
        VkButton vkButton = this.N;
        bwt0.p0(vkButton, false);
        VkButton vkButton2 = this.M;
        bwt0.p0(vkButton2, false);
        ImageView imageView = this.P;
        bwt0.p0(imageView, false);
        VkButton vkButton3 = this.O;
        bwt0.p0(vkButton3, false);
        Owner owner = m1c0Var2.i;
        int i = this.Q;
        this.I.load(owner.f(i));
        this.J.load(m1c0Var2.j.f(i));
        int i2 = a.$EnumSwitchMapping$0[m1c0Var2.p.ordinal()];
        MotionLayout motionLayout = this.H;
        TextView textView2 = this.K;
        if (i2 == 1) {
            motionLayout.k5(R.id.coownershipApproved);
            xo9.A(textView, m1c0Var2.m);
            textView2.setText(m1c0Var2.l);
            textView2.setTextAppearance(R.style.VkUiTypography_SubheadMedium);
            bwt0.p0(imageView, true);
            return;
        }
        if (i2 == 2) {
            motionLayout.k5(R.id.coownershipRejected);
            textView2.setTextAppearance(R.style.VkUiTypography_SubheadMedium);
            textView2.setText(v6(R.string.coowners_invite_rejected_title));
            bwt0.p0(vkButton3, true);
            bwt0.p0(imageView, true);
            return;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        motionLayout.k5(R.id.start);
        textView2.setTextAppearance(R.style.VkUiTypography_SubheadNormal);
        textView2.setText(m1c0Var2.k);
        bwt0.p0(vkButton, true);
        bwt0.p0(vkButton2, true);
    }
}
