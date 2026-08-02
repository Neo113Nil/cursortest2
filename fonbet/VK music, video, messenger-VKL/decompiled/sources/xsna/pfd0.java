package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vk.avatar.api.VKAvatarView;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.k1u0;
import xsna.kr5;
import xsna.tlo0;

/* compiled from: PrivacyStoryUserHolder.kt */
/* loaded from: classes5.dex */
public final class pfd0 extends vif0<UserProfile> {
    public final VKImageView n;
    public final Context o;
    public final izs<UserProfile, s3q0> p;
    public final izs<UserProfile, s3q0> q;

    /* compiled from: PrivacyStoryUserHolder.kt */
    public final class a implements VkCell.d {
        public final FrameLayout a;

        public a(VkCell.Left.Main.Size size) {
            FrameLayout frameLayout = new FrameLayout(pfd0.this.o);
            int k = size.k(frameLayout.getContext());
            frameLayout.addView(pfd0.this.n, new FrameLayout.LayoutParams(k, k));
            this.a = frameLayout;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            if ((fVar instanceof c ? (c) fVar : null) != null) {
                VKImageView vKImageView = pfd0.this.n;
                boolean z = vKImageView instanceof VKAvatarView;
                int i = R.drawable.group_placeholder;
                if (z) {
                    VKAvatarView vKAvatarView = (VKAvatarView) vKImageView;
                    UserProfile userProfile = ((c) fVar).a;
                    if (!userProfile.C()) {
                        i = R.drawable.user_placeholder;
                    }
                    kr5.a aVar = new kr5.a(new dqz0(userProfile));
                    aVar.b(i);
                    s3q0 s3q0Var = s3q0.a;
                    vKAvatarView.Y0(aVar.a());
                    return;
                }
                if (vKImageView instanceof VKCircleImageView) {
                    VKCircleImageView vKCircleImageView = (VKCircleImageView) vKImageView;
                    UserProfile userProfile2 = ((c) fVar).a;
                    if (!userProfile2.C()) {
                        i = R.drawable.user_placeholder_icon;
                    }
                    vKCircleImageView.A0(i, ImageView.ScaleType.FIT_XY);
                    if (TextUtils.isEmpty(userProfile2.h)) {
                        vKCircleImageView.clear();
                    } else {
                        vKCircleImageView.o0(userProfile2.h, null);
                    }
                }
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: PrivacyStoryUserHolder.kt */
    public final class b implements VkCell.e {
        public final VkCell.Left.Main.Size a;

        public b(VkCell.Left.Main.Size size) {
            this.a = size;
        }

        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return pfd0.this.new a(this.a);
        }
    }

    /* compiled from: PrivacyStoryUserHolder.kt */
    public static final class c implements VkCell.f {
        public final UserProfile a;

        public c(UserProfile userProfile) {
            this.a = userProfile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AvatarViewParams(item=" + this.a + ')';
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pfd0(VKImageView vKImageView, Context context, izs<? super UserProfile, s3q0> izsVar, izs<? super UserProfile, s3q0> izsVar2) {
        super(r0);
        VkCell vkCell = new VkCell(context, null, 6, 0);
        vkCell.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.n = vKImageView;
        this.o = context;
        this.p = izsVar;
        this.q = izsVar2;
        ((VkCell) this.itemView).setLeftMainAvatarController(new b(VkCell.Left.Main.Size.Medium));
    }

    @Override // xsna.vif0
    public final void i6(UserProfile userProfile) {
        String str;
        UserProfile userProfile2 = userProfile;
        VkCell vkCell = (VkCell) this.itemView;
        vkCell.setOnClickListener(new ofd0(0, this, userProfile2));
        vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.a(new c(userProfile2), VkCell.Left.Main.Size.Medium), new VkCell.Left.c.b(new vq6(20, this, userProfile2), new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), 2)));
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        tlo0.a aVar2 = tlo0.Companion;
        VerifyInfo verifyInfo = userProfile2.B;
        if (verifyInfo.Cb()) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) userProfile2.b;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder(userProfile2.e);
                spannableStringBuilder.append((char) 160);
                spannableStringBuilder.append((char) 160);
                Drawable h = VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, this.o, null, 28);
                if (h != null) {
                    spannableStringBuilder.setSpan(new dqa(h), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                }
            }
            userProfile2.b = spannableStringBuilder;
            str = spannableStringBuilder.toString();
        } else {
            str = userProfile2.e;
        }
        vkCell.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(oq.d(aVar2, str), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14));
    }
}
