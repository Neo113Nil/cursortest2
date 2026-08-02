package com.yandex.passport.internal.autologin.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.internal.common.m;
import com.yandex.passport.internal.properties.AutoLoginProperties;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.ui.util.o;
import defpackage.b64;
import defpackage.bev;
import defpackage.evu0;
import defpackage.h2b1;
import defpackage.li91;
import defpackage.sls;
import defpackage.wuj0;
import defpackage.x4h0;
import defpackage.y4h0;
import java.net.URL;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/passport/internal/autologin/ui/AutologinSuccessView;", "Landroid/widget/FrameLayout;", "Landroid/app/Activity;", "activity", "Lcom/yandex/passport/api/i;", "account", "", "subtitle", "Lcom/yandex/passport/internal/properties/AutoLoginProperties;", "properties", "Lkotlin/Function0;", "Lzy11;", "closeCallback", "<init>", "(Landroid/app/Activity;Lcom/yandex/passport/api/i;Ljava/lang/String;Lcom/yandex/passport/internal/properties/AutoLoginProperties;Lsls;)V", "Landroid/content/Context;", "Lcom/yandex/passport/api/PassportTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "withNightMode", "(Landroid/content/Context;Lcom/yandex/passport/api/PassportTheme;)Landroid/content/Context;", "Landroid/graphics/drawable/Drawable;", "selectableItemBackgroundBorderless", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "Lcom/yandex/passport/api/i;", "Ljava/lang/String;", "Lsls;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AutologinSuccessView extends FrameLayout {
    public static final int $stable = 8;
    private final com.yandex.passport.api.i account;
    private final sls closeCallback;
    private final String subtitle;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x018e, code lost:
    
        if (r15 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AutologinSuccessView(Activity activity, com.yandex.passport.api.i iVar, String str, AutoLoginProperties autoLoginProperties, sls slsVar) {
        super(activity);
        LinearLayout linearLayout;
        String message;
        String str2;
        this.account = iVar;
        this.subtitle = str;
        this.closeCallback = slsVar;
        Context withNightMode = withNightMode(activity, autoLoginProperties.getTheme());
        int s = com.yandex.passport.internal.ui.c.s(24);
        int s2 = com.yandex.passport.internal.ui.c.s(16);
        int s3 = com.yandex.passport.internal.ui.c.s(44);
        int s4 = com.yandex.passport.internal.ui.c.s(48);
        int s5 = com.yandex.passport.internal.ui.c.s(2);
        float f = 28.0f * Resources.getSystem().getDisplayMetrics().density;
        CardView cardView = new CardView(withNightMode);
        cardView.setCardBackgroundColor(withNightMode.getColor(R.color.passport_autologin_notification_background));
        cardView.setRadius(f);
        cardView.setCardElevation(2.0f * Resources.getSystem().getDisplayMetrics().density);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(s, com.yandex.passport.internal.ui.c.s(2), s, s);
        cardView.setLayoutParams(layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(withNightMode);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(withNightMode);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(s3, s3);
        int i = s2 / 2;
        layoutParams2.setMargins(s2, s2, i, s2);
        imageView.setLayoutParams(layoutParams2);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        String avatarUrl = iVar.getAvatarUrl();
        if (avatarUrl != null) {
            try {
                new URL(avatarUrl).toURI();
            } catch (Exception unused) {
            }
            coil.c f2 = h2b1.f(imageView.getContext());
            bev bevVar = new bev(imageView.getContext());
            bevVar.c = avatarUrl;
            bevVar.o(imageView);
            String e = b64.e(u.z(getContext()), avatarUrl);
            bevVar.g = e;
            bevVar.i(e);
            bevVar.e();
            bevVar.j(R.drawable.passport_icon_user_unknown);
            com.yandex.passport.internal.ui.bouncer.roundabout.avatar.c cVar = new com.yandex.passport.internal.ui.bouncer.roundabout.avatar.c(this.account.getHasPlus());
            new m();
            String nativeDefaultEmail = this.account.getNativeDefaultEmail();
            bevVar.p(cVar, new a(withNightMode, nativeDefaultEmail == null ? m.a.h(nativeDefaultEmail) : false));
            f2.b(bevVar.d());
            linearLayout = new LinearLayout(withNightMode);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(16);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams3.setMargins(0, s2, 0, s2);
            linearLayout.setLayoutParams(layoutParams3);
            String firstName = this.account.getFirstName();
            firstName = TextUtils.isEmpty(firstName) ? null : firstName;
            firstName = firstName == null ? this.account.getPrimaryDisplayName() : firstName;
            TextView textView = new TextView(withNightMode);
            textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            textView.setText(textView.getContext().getString(R.string.passport_autologin_text, firstName));
            textView.setTextSize(16.0f);
            li91.l(textView, R.color.passport_roundabout_text_primary);
            li91.k(textView, x4h0.ys_text_medium);
            linearLayout.addView(textView);
            message = autoLoginProperties.getMessage();
            if (message != null) {
                str2 = !evu0.J(message) ? message : null;
            }
            str2 = this.subtitle;
            if (str2 != null && str2.length() != 0) {
                TextView textView2 = new TextView(withNightMode);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams4.topMargin = s5;
                textView2.setLayoutParams(layoutParams4);
                textView2.setText(str2);
                textView2.setTextSize(14.0f);
                li91.l(textView2, R.color.passport_roundabout_text_primary);
                li91.k(textView2, y4h0.ys_text_regular);
                linearLayout.addView(textView2);
            }
            ImageButton imageButton = new ImageButton(withNightMode);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(s4, s4);
            layoutParams5.setMargins(i, s2, s2, s2);
            imageButton.setLayoutParams(layoutParams5);
            imageButton.setImageResource(R.drawable.passport_notification_close);
            imageButton.setImageTintList(wuj0.a(withNightMode.getResources(), R.color.passport_autologin_text_secondary, withNightMode.getTheme()));
            imageButton.setBackground(selectableItemBackgroundBorderless(withNightMode));
            imageButton.setContentDescription(imageButton.getContext().getString(R.string.passport_button_close_for_error));
            imageButton.setOnClickListener(new b(0, this));
            linearLayout2.addView(imageView);
            linearLayout2.addView(linearLayout);
            linearLayout2.addView(imageButton);
            cardView.addView(linearLayout2);
            addView(cardView);
        }
        avatarUrl = null;
        coil.c f22 = h2b1.f(imageView.getContext());
        bev bevVar2 = new bev(imageView.getContext());
        bevVar2.c = avatarUrl;
        bevVar2.o(imageView);
        String e2 = b64.e(u.z(getContext()), avatarUrl);
        bevVar2.g = e2;
        bevVar2.i(e2);
        bevVar2.e();
        bevVar2.j(R.drawable.passport_icon_user_unknown);
        com.yandex.passport.internal.ui.bouncer.roundabout.avatar.c cVar2 = new com.yandex.passport.internal.ui.bouncer.roundabout.avatar.c(this.account.getHasPlus());
        new m();
        String nativeDefaultEmail2 = this.account.getNativeDefaultEmail();
        bevVar2.p(cVar2, new a(withNightMode, nativeDefaultEmail2 == null ? m.a.h(nativeDefaultEmail2) : false));
        f22.b(bevVar2.d());
        linearLayout = new LinearLayout(withNightMode);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams32 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams32.setMargins(0, s2, 0, s2);
        linearLayout.setLayoutParams(layoutParams32);
        String firstName2 = this.account.getFirstName();
        if (TextUtils.isEmpty(firstName2)) {
        }
        if (firstName2 == null) {
        }
        TextView textView3 = new TextView(withNightMode);
        textView3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView3.setText(textView3.getContext().getString(R.string.passport_autologin_text, firstName2));
        textView3.setTextSize(16.0f);
        li91.l(textView3, R.color.passport_roundabout_text_primary);
        li91.k(textView3, x4h0.ys_text_medium);
        linearLayout.addView(textView3);
        message = autoLoginProperties.getMessage();
        if (message != null) {
        }
        str2 = this.subtitle;
        if (str2 != null) {
            TextView textView22 = new TextView(withNightMode);
            LinearLayout.LayoutParams layoutParams42 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams42.topMargin = s5;
            textView22.setLayoutParams(layoutParams42);
            textView22.setText(str2);
            textView22.setTextSize(14.0f);
            li91.l(textView22, R.color.passport_roundabout_text_primary);
            li91.k(textView22, y4h0.ys_text_regular);
            linearLayout.addView(textView22);
        }
        ImageButton imageButton2 = new ImageButton(withNightMode);
        LinearLayout.LayoutParams layoutParams52 = new LinearLayout.LayoutParams(s4, s4);
        layoutParams52.setMargins(i, s2, s2, s2);
        imageButton2.setLayoutParams(layoutParams52);
        imageButton2.setImageResource(R.drawable.passport_notification_close);
        imageButton2.setImageTintList(wuj0.a(withNightMode.getResources(), R.color.passport_autologin_text_secondary, withNightMode.getTheme()));
        imageButton2.setBackground(selectableItemBackgroundBorderless(withNightMode));
        imageButton2.setContentDescription(imageButton2.getContext().getString(R.string.passport_button_close_for_error));
        imageButton2.setOnClickListener(new b(0, this));
        linearLayout2.addView(imageView);
        linearLayout2.addView(linearLayout);
        linearLayout2.addView(imageButton2);
        cardView.addView(linearLayout2);
        addView(cardView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$17$lambda$16(AutologinSuccessView autologinSuccessView, View view) {
        autologinSuccessView.closeCallback.invoke();
    }

    private final Drawable selectableItemBackgroundBorderless(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true);
        return context.getDrawable(typedValue.resourceId);
    }

    private final Context withNightMode(Context context, PassportTheme passportTheme) {
        int i = c.a[o.g(context, passportTheme).ordinal()] == 1 ? 32 : 16;
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.uiMode = i | (configuration.uiMode & (-49));
        return context.createConfigurationContext(configuration);
    }
}
