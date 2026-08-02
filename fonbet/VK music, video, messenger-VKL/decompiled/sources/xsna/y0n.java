package xsna;

import android.graphics.PorterDuff;
import android.widget.ImageView;
import com.vk.dto.stories.model.ads.DisclaimerType;
import com.vkontakte.android.R;

/* compiled from: DisclaimerDelegate.kt */
/* loaded from: classes6.dex */
public final class y0n {
    public final ImageView a;

    /* compiled from: DisclaimerDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisclaimerType.values().length];
            try {
                iArr[DisclaimerType.SUPPLEMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisclaimerType.DRUGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisclaimerType.LOANS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisclaimerType.BANKRUPTCY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DisclaimerType.ENERGETICS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DisclaimerType.DECLARATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public y0n(ImageView imageView) {
        this.a = imageView;
    }

    public final void a(dt50 dt50Var) {
        DisclaimerType disclaimerType = dt50Var != null ? dt50Var.f : null;
        int i = disclaimerType == null ? -1 : a.$EnumSwitchMapping$0[disclaimerType.ordinal()];
        ImageView imageView = this.a;
        switch (i) {
            case 1:
                b(R.drawable.vk_icon_illustration_disclaimer_bad_feed_360w, R.string.story_my_target_disclaimer_supplements);
                break;
            case 2:
                b(R.drawable.vk_icon_illustration_disclaimer_contraindications_feed_360w, R.string.story_my_target_disclaimer_meds);
                break;
            case 3:
                b(R.drawable.vk_icon_illustration_disclaimer_credits_feed_360w, R.string.story_my_target_disclaimer_loans);
                break;
            case 4:
                b(R.drawable.vk_icon_illustration_disclaimer_bankruptcy_360w, R.string.story_my_target_disclaimer_bankruptcy);
                break;
            case 5:
                b(R.drawable.vk_icon_illustration_disclaimer_energy_drinks_360w, R.string.story_my_target_disclaimer_energetics);
                break;
            case 6:
                if (imageView != null) {
                    bwt0.p0(imageView, false);
                    break;
                }
                break;
            default:
                if (imageView != null) {
                    bwt0.p0(imageView, false);
                    break;
                }
                break;
        }
    }

    public final void b(int i, int i2) {
        ImageView imageView = this.a;
        if (imageView != null) {
            bwt0.p0(imageView, true);
            imageView.setImageResource(i);
            imageView.setContentDescription(imageView.getContext().getString(i2));
            imageView.setColorFilter(imageView.getContext().getColor(R.color.vk_white), PorterDuff.Mode.SRC_IN);
        }
    }
}
