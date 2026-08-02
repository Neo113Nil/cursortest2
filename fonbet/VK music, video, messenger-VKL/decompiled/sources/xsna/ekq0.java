package xsna;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.vk.avatar.api.VKAvatarView;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.Platform;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.VisibleStatus;
import com.vk.imageloader.view.VKCircleImageView;
import com.vkontakte.android.R;
import xsna.kr5;

/* compiled from: UserHolder.java */
/* loaded from: classes5.dex */
public class ekq0<T extends UserProfile> extends vif0<T> implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    public final TextView n;
    public final View o;
    public final ImageView p;
    public View q;

    @Nullable
    public final View r;

    @Nullable
    public final CompoundButton s;

    @Nullable
    public izs<UserProfile, s3q0> t;

    @Nullable
    public izs<UserProfile, s3q0> u;

    @Nullable
    public com.vk.movika.tools.controls.seekbar.h v;

    public ekq0(ViewGroup viewGroup, int i, boolean z, boolean z2) {
        super(viewGroup, i, 0);
        TextView textView = (TextView) this.itemView.findViewById(R.id.title);
        this.n = textView;
        this.o = this.itemView.findViewById(R.id.photo);
        this.p = (ImageView) this.itemView.findViewById(R.id.online);
        if (z2) {
            View findViewById = this.itemView.findViewById(R.id.action);
            this.r = findViewById;
            if (findViewById != null) {
                findViewById.setOnClickListener(this);
            }
        } else {
            this.r = null;
        }
        if (z) {
            CompoundButton compoundButton = (CompoundButton) this.itemView.findViewById(R.id.check);
            this.s = compoundButton;
            if (compoundButton != null) {
                compoundButton.setOnCheckedChangeListener(this);
            }
        } else {
            this.s = null;
        }
        this.itemView.setOnClickListener(this);
        jno0.c(textView, R.attr.vk_ui_text_primary);
    }

    public static void s6(@Nullable ImageView imageView, @Nullable UserProfile userProfile, Integer num) {
        if (imageView == null || userProfile == null) {
            return;
        }
        OnlineInfo onlineInfo = userProfile.n;
        if (!onlineInfo.Ab()) {
            long j = userProfile.c.b;
            if (j >= -2000000000 && j < 2000000000) {
                LayerDrawable layerDrawable = (LayerDrawable) m33.a(((VisibleStatus) onlineInfo).e == Platform.MOBILE ? R.drawable.ic_online_mobile_vkapp_composite_16 : R.drawable.ic_online_web_composite_16, imageView.getContext());
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.online_composite_background);
                if (findDrawableByLayerId != null && num != null) {
                    findDrawableByLayerId.setTint(num.intValue());
                }
                imageView.setImageDrawable(layerDrawable);
                imageView.setVisibility(0);
                return;
            }
        }
        imageView.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        UserProfile userProfile = (UserProfile) this.m;
        if (userProfile.l != z) {
            userProfile.l = z;
            com.vk.movika.tools.controls.seekbar.h hVar = this.v;
            if (hVar != null) {
                hVar.invoke(userProfile, Boolean.valueOf(z));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        izs<UserProfile, s3q0> izsVar;
        if (view != this.itemView) {
            View view2 = this.r;
            if (view2 == null || view != view2 || (izsVar = this.u) == null) {
                return;
            }
            izsVar.invoke((UserProfile) this.m);
            return;
        }
        CompoundButton compoundButton = this.s;
        if (compoundButton != null) {
            compoundButton.toggle();
            return;
        }
        izs<UserProfile, s3q0> izsVar2 = this.t;
        if (izsVar2 != null) {
            izsVar2.invoke((UserProfile) this.m);
        }
    }

    @Override // xsna.vif0
    /* renamed from: q6 */
    public void i6(T t) {
        VerifyInfo verifyInfo = t.B;
        boolean Cb = verifyInfo.Cb();
        TextView textView = this.n;
        if (!Cb || (this instanceof eyh0)) {
            textView.setText(t.e);
        } else {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) t.b;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder(t.e);
                spannableStringBuilder.append((char) 160);
                spannableStringBuilder.append((char) 160);
                Drawable h = VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, this.itemView.getContext(), null, 28);
                if (h != null) {
                    spannableStringBuilder.setSpan(new dqa(h), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                }
            }
            t.b = spannableStringBuilder;
            textView.setText(spannableStringBuilder);
        }
        if (!(this instanceof eyh0) || this.q == null) {
            View view = this.q;
            if (view != null) {
                view.setVisibility(8);
            }
        } else if (verifyInfo.Cb()) {
            this.q.setVisibility(0);
            this.q.setBackground(VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, this.itemView.getContext(), null, 28));
        } else {
            this.q.setVisibility(8);
        }
        s6(this.p, t, null);
        CompoundButton compoundButton = this.s;
        if (compoundButton != null) {
            compoundButton.setChecked(t.l);
        }
        View view2 = this.o;
        boolean z = view2 instanceof VKAvatarView;
        int i = R.drawable.group_placeholder;
        if (z) {
            VKAvatarView vKAvatarView = (VKAvatarView) view2;
            if (!t.C()) {
                i = R.drawable.user_placeholder;
            }
            kr5.a aVar = new kr5.a(new dqz0(t));
            aVar.b(i);
            s3q0 s3q0Var = s3q0.a;
            vKAvatarView.Y0(aVar.a());
            return;
        }
        if (view2 instanceof VKCircleImageView) {
            VKCircleImageView vKCircleImageView = (VKCircleImageView) view2;
            if (!t.C()) {
                i = R.drawable.user_placeholder_icon;
            }
            vKCircleImageView.A0(i, ImageView.ScaleType.FIT_XY);
            if (TextUtils.isEmpty(t.h)) {
                vKCircleImageView.clear();
            } else {
                vKCircleImageView.o0(t.h, null);
            }
        }
    }
}
