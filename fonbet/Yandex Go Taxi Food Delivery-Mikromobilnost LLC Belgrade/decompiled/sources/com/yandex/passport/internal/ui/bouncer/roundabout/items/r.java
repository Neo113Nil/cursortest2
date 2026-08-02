package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.text.BidiFormatter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.chip.Chip;
import com.yandex.passport.R;
import com.yandex.passport.common.resources.StringResource;
import com.yandex.passport.internal.badges.MaxLinesChipGroup;
import com.yandex.passport.internal.ui.bouncer.roundabout.c0;
import defpackage.b64;
import defpackage.bev;
import defpackage.evu0;
import defpackage.h2b1;
import defpackage.li91;
import defpackage.ny61;
import defpackage.uc20;
import defpackage.w511;
import defpackage.y4h0;
import java.util.List;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public abstract class r {
    public static final void a(f fVar, x xVar) {
        Context context = fVar.getRoot().getContext();
        String avatarUrl = xVar.getAvatarUrl();
        if (avatarUrl != null) {
            ImageView imageView = fVar.x;
            coil.c f = h2b1.f(imageView.getContext());
            bev bevVar = new bev(imageView.getContext());
            bevVar.c = avatarUrl;
            bevVar.o(imageView);
            String e = b64.e(com.yandex.passport.internal.properties.u.z(context), avatarUrl);
            bevVar.g = e;
            bevVar.i(e);
            bevVar.e();
            bevVar.j(R.drawable.passport_icon_user_unknown);
            bevVar.p(new com.yandex.passport.internal.ui.bouncer.roundabout.avatar.c(xVar.getHasPlus()), new com.yandex.passport.internal.ui.bouncer.roundabout.avatar.b(context, xVar.c()));
            f.b(bevVar.d());
        }
    }

    public static final void b(f fVar, x xVar) {
        int i = q.a[xVar.a().ordinal()];
        if (i == 1) {
            fVar.getRoot().setBackground(fVar.getRoot().getContext().getDrawable(R.drawable.passport_roundabout_account));
            return;
        }
        if (i == 2) {
            fVar.getRoot().setBackground(fVar.getRoot().getContext().getDrawable(R.drawable.passport_roundabout_master_upper));
            return;
        }
        if (i == 3) {
            fVar.getRoot().setBackground(fVar.getRoot().getContext().getDrawable(R.drawable.passport_roundabout_master_middle));
        } else if (i == 4) {
            fVar.getRoot().setBackground(fVar.getRoot().getContext().getDrawable(R.drawable.passport_roundabout_master_lower));
        } else {
            w511.b();
        }
    }

    public static final void c(f fVar, x xVar) {
        String str;
        MaxLinesChipGroup maxLinesChipGroup = fVar.A;
        Context context = fVar.getRoot().getContext();
        List g = xVar.g();
        if (g.isEmpty()) {
            g = null;
        }
        if (g == null || (str = context.getString(R.string.passport_recyclerview_item_description_badges, kotlin.collections.a.X(g, Extension.FIX_SPACE, null, null, new com.yandex.passport.internal.core.announcing.f(15), 30))) == null) {
            str = "";
        }
        fVar.getRoot().setContentDescription(context.getString(R.string.passport_recyclerview_item_description_account, fVar.y.getText(), fVar.z.getText(), str));
        maxLinesChipGroup.setVisibility(!xVar.g().isEmpty() ? 0 : 8);
        if (maxLinesChipGroup.getVisibility() == 0) {
            maxLinesChipGroup.removeAllViews();
            for (com.yandex.passport.internal.badges.a aVar : xVar.g()) {
                String b = com.yandex.passport.internal.badges.a.b(aVar);
                Chip chip = new Chip(fVar.w);
                DisplayMetrics displayMetrics = uc20.a;
                chip.setMaxWidth((int) (200.0f * displayMetrics.density));
                chip.setMinHeight((int) (displayMetrics.density * 24.0f));
                chip.setChipMinHeight(24.0f * displayMetrics.density);
                chip.setChipIconSize(displayMetrics.density * 14.0f);
                chip.setChipStartPadding(displayMetrics.density * 6.0f);
                chip.setChipEndPadding(6.0f * displayMetrics.density);
                chip.setIconStartPadding(displayMetrics.density * 2.0f);
                chip.setIconEndPadding(2.0f * displayMetrics.density);
                chip.setTextStartPadding(3.0f * displayMetrics.density);
                c0.d.getClass();
                chip.setTextSize(14.0f);
                li91.l(chip, R.color.passport_roundabout_text_primary);
                li91.k(chip, y4h0.ys_text_regular);
                chip.setEllipsize(TextUtils.TruncateAt.END);
                chip.setText(b);
                chip.setEnsureMinTouchTargetSize(false);
                chip.ensureAccessibleTouchTarget(0);
                chip.setClickable(false);
                chip.setShapeAppearanceModel(chip.getShapeAppearanceModel().a(8.0f * displayMetrics.density));
                chip.setRippleColor(ColorStateList.valueOf(0));
                chip.setStateListAnimator(null);
                chip.setChipBackgroundColor(ColorStateList.valueOf(chip.getContext().getColor(R.color.passport_roundabout_background)));
                chip.setPadding(chip.getPaddingLeft(), 0, chip.getPaddingRight(), 0);
                maxLinesChipGroup.addView(chip);
                String a = com.yandex.passport.internal.badges.a.a(Locale.getDefault().getLanguage(), com.yandex.passport.internal.properties.u.z(context) == 32 ? aVar.d : aVar.c);
                coil.c f = h2b1.f(chip.getContext());
                bev bevVar = new bev(chip.getContext());
                bevVar.c = a;
                bevVar.d = new com.yandex.passport.internal.utils.a(chip);
                bevVar.l();
                bevVar.j(R.drawable.passport_roundabout_account_badge_icon_placeholder);
                bevVar.u = Integer.valueOf(R.drawable.passport_roundabout_account_badge_icon_placeholder);
                bevVar.v = null;
                bevVar.h = Bitmap.Config.ARGB_8888;
                f.b(bevVar.d());
                chip.setImportantForAccessibility(2);
            }
        }
    }

    public static final void d(f fVar, x xVar) {
        String k;
        Integer valueOf;
        Context context = fVar.getRoot().getContext();
        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
        TextView textView = fVar.z;
        o c = xVar.c();
        if (c instanceof l) {
            k = com.yandex.passport.internal.properties.u.k(bidiFormatter.unicodeWrap(xVar.getPhoneNumber()), xVar.b());
        } else if ((c instanceof k) || (c instanceof j) || (c instanceof i)) {
            k = com.yandex.passport.internal.properties.u.k(bidiFormatter.unicodeWrap(xVar.getPhoneNumber()), xVar.getEmail());
        } else {
            if (c instanceof m) {
                String unicodeWrap = bidiFormatter.unicodeWrap(xVar.getPhoneNumber());
                switch (q.b[((m) c).a.ordinal()]) {
                    case 1:
                        valueOf = Integer.valueOf(R.string.passport_am_social_fb);
                        break;
                    case 2:
                        valueOf = Integer.valueOf(R.string.passport_am_social_google);
                        break;
                    case 3:
                        valueOf = Integer.valueOf(R.string.passport_am_social_mailru);
                        break;
                    case 4:
                        valueOf = Integer.valueOf(R.string.passport_am_social_ok);
                        break;
                    case 5:
                        valueOf = Integer.valueOf(R.string.passport_am_social_twitter);
                        break;
                    case 6:
                        valueOf = Integer.valueOf(R.string.passport_am_social_vk);
                        break;
                    case 7:
                        valueOf = Integer.valueOf(R.string.passport_am_social_esia);
                        break;
                    case 8:
                        valueOf = null;
                        break;
                    default:
                        w511.b();
                        return;
                }
                k = com.yandex.passport.internal.properties.u.k(unicodeWrap, valueOf != null ? StringResource.m281getimpl(StringResource.m277constructorimpl(valueOf.intValue())) : null);
            } else {
                k = c instanceof g ? com.yandex.passport.internal.properties.u.k(context.getString(R.string.passport_child_label), xVar.b()) : c instanceof n ? com.yandex.passport.internal.properties.u.k(null, xVar.getEmail()) : com.yandex.passport.internal.properties.u.k(bidiFormatter.unicodeWrap(xVar.getPhoneNumber()), null);
            }
        }
        textView.setText(k);
        CharSequence text = textView.getText();
        textView.setVisibility((text == null || evu0.J(text)) ? 8 : 0);
    }

    public static final void e(f fVar, x xVar) {
        int i = q.a[xVar.a().ordinal()];
        if (i == 3 || i == 4) {
            ConstraintLayout root = fVar.getRoot();
            ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = (int) (2.0f * uc20.a.density);
            root.setLayoutParams(marginLayoutParams);
            return;
        }
        ConstraintLayout root2 = fVar.getRoot();
        ViewGroup.LayoutParams layoutParams2 = root2.getLayoutParams();
        if (layoutParams2 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin = (int) (6.0f * uc20.a.density);
        root2.setLayoutParams(marginLayoutParams2);
    }
}
