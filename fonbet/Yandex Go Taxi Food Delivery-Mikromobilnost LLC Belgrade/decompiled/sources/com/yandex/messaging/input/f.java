package com.yandex.messaging.input;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.messaging.internal.view.input.mesix.Mesix;
import com.yandex.messaging.views.KeyboardAwareEmojiEditText;
import defpackage.as10;
import defpackage.b7p0;
import defpackage.e9h0;
import defpackage.eci0;
import defpackage.evu0;
import defpackage.ffx;
import defpackage.fxa1;
import defpackage.h3y;
import defpackage.hek0;
import defpackage.ike;
import defpackage.jng0;
import defpackage.jqr;
import defpackage.mlg0;
import defpackage.olh0;
import defpackage.oqq0;
import defpackage.oyg0;
import defpackage.oyh0;
import defpackage.pqq0;
import defpackage.qoi0;
import defpackage.rqq0;
import defpackage.sls;
import defpackage.tje;
import defpackage.uqq0;
import defpackage.uyo0;
import defpackage.vse;
import defpackage.wy31;
import defpackage.xbg0;
import defpackage.y3b1;
import defpackage.zo1;
import defpackage.zy11;
import kotlin.UninitializedPropertyAccessException;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes15.dex */
public final class f {
    public final com.yandex.messaging.internal.view.input.c a;
    public final Mesix b;
    public final Activity c;
    public final h3y d;
    public final wy31 e;
    public KeyboardAwareEmojiEditText f;
    public Dialog g;
    public boolean h;
    public final boolean i;
    public final ike j;
    public final n0 k;
    public final eci0 l;
    public final com.yandex.messaging.internal.view.input.b m;

    public f(SharedPreferences sharedPreferences, vse vseVar, com.yandex.messaging.internal.view.input.c cVar, Mesix mesix, Activity activity, h3y h3yVar, wy31 wy31Var) {
        this.a = cVar;
        this.b = mesix;
        this.c = activity;
        this.d = h3yVar;
        this.e = wy31Var;
        this.i = cVar.i;
        this.j = vseVar.c(true);
        n0 c = ffx.c(0, 1, null, 5);
        this.k = c;
        this.l = kotlinx.coroutines.flow.e.c(c);
        this.m = new com.yandex.messaging.internal.view.input.b(oyh0.messaging_tooltip_sending_settings, sharedPreferences, "IS_SENDING_SETTINGS_PANEL_OPENED");
    }

    public static final void a(final f fVar) {
        com.yandex.messaging.internal.view.input.b bVar = fVar.m;
        Activity activity = fVar.c;
        if (fVar.c() && fVar.g == null) {
            WindowManager.LayoutParams layoutParams = null;
            tje.N(fVar.j, null, null, new SendingMessagesSettingsController$emitEvent$1(fVar, pqq0.a, null), 3);
            boolean z = ((uqq0) fVar.a.f.a.getValue()).a;
            Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
            fVar.g = dialog;
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(activity).inflate(olh0.popup_sending_menu, (ViewGroup) null);
            LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(e9h0.menu_container);
            DimmedBackgroundView dimmedBackgroundView = (DimmedBackgroundView) frameLayout.findViewById(e9h0.dimmed_background);
            if (fVar.i) {
                fVar.b(linearLayout, oyg0.notification_off_outline_md, oyh0.menu_send_without_sound, new sls() { // from class: com.yandex.messaging.input.e
                    @Override // defpackage.sls
                    public final Object invoke() {
                        f fVar2 = f.this;
                        fVar2.a.b(true);
                        fVar2.e.get().getClass();
                        fVar2.d();
                        tje.N(fVar2.j, null, null, new SendingMessagesSettingsController$emitEvent$1(fVar2, rqq0.a, null), 3);
                        return zy11.a;
                    }
                });
            }
            if (fVar.h) {
                fVar.b(linearLayout, oyg0.lightning_outline_md, z ? oyh0.menu_message_make_unstarred : oyh0.menu_message_make_starred, new zo1(fVar, z, 16));
            }
            dimmedBackgroundView.setOnDimmedAreaClickListener(new b7p0(13, fVar));
            dimmedBackgroundView.setOnCutoutAreaClickListener(new uyo0(27, fVar));
            dialog.setContentView(frameLayout);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.setLayout(-1, -1);
                if (Build.VERSION.SDK_INT >= 30) {
                    window.setDecorFitsSystemWindows(false);
                } else {
                    window.getDecorView().setSystemUiVisibility(1792);
                }
                window.addFlags(776);
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (attributes != null) {
                    attributes.layoutInDisplayCutoutMode = 1;
                    layoutParams = attributes;
                }
                window.setAttributes(layoutParams);
            }
            frameLayout.setVisibility(4);
            dialog.show();
            frameLayout.post(new hek0(fVar, linearLayout, dimmedBackgroundView, frameLayout, 4));
            bVar.a(true);
            SharedPreferences.Editor edit = bVar.a.edit();
            edit.putBoolean(bVar.b, true);
            edit.apply();
        }
    }

    public final void b(LinearLayout linearLayout, int i, int i2, sls slsVar) {
        View inflate = LayoutInflater.from(this.c).inflate(olh0.item_sending_menu, (ViewGroup) linearLayout, false);
        ImageView imageView = (ImageView) inflate.findViewById(e9h0.menu_item_icon);
        ((TextView) inflate.findViewById(e9h0.menu_item_text)).setText(i2);
        Drawable f = y3b1.f(imageView.getContext(), i, fxa1.c(jng0.messagingCommonIconsPrimaryColor, imageView.getContext()).data);
        if (f != null) {
            imageView.setImageDrawable(f);
        }
        inflate.setOnClickListener(new xbg0(8, slsVar));
        linearLayout.addView(inflate);
    }

    public final boolean c() {
        Editable text;
        if (!this.h && !this.i) {
            return false;
        }
        this.e.get().getClass();
        KeyboardAwareEmojiEditText keyboardAwareEmojiEditText = this.f;
        return (keyboardAwareEmojiEditText == null || (text = keyboardAwareEmojiEditText.getText()) == null || !(evu0.J(text) ^ true)) ? false : true;
    }

    public final void d() {
        try {
            View a = ((mlg0) this.d.get()).a.a();
            if (a.getVisibility() != 0) {
                a = null;
            }
            if (a != null) {
                View findViewById = a.findViewById(e9h0.chat_input_panel_cutout_background);
                View findViewById2 = a.findViewById(e9h0.chat_input_panel_vertical_line);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                if (findViewById2 != null) {
                    findViewById2.setBackgroundColor(fxa1.c(jng0.messagingCommonIconsSecondaryColor, this.c).data);
                    findViewById2.setAlpha(0.5f);
                }
            }
        } catch (UninitializedPropertyAccessException unused) {
        }
        Dialog dialog = this.g;
        boolean z = dialog != null;
        if (dialog != null) {
            DimmedBackgroundView dimmedBackgroundView = (DimmedBackgroundView) dialog.findViewById(e9h0.dimmed_background);
            if (dimmedBackgroundView != null) {
                dimmedBackgroundView.clearCutouts();
            }
            dialog.dismiss();
            this.g = null;
        }
        if (z) {
            tje.N(this.j, null, null, new SendingMessagesSettingsController$emitEvent$1(this, oqq0.a, null), 3);
        }
    }

    public final void e(KeyboardAwareEmojiEditText keyboardAwareEmojiEditText) {
        this.f = keyboardAwareEmojiEditText;
        this.b.getLongClickListeners().put(qoi0.a(as10.class), new SendingMessagesSettingsController$bindUiListeners$1(0, this, f.class, "showMenu", "showMenu()V", 0));
        kotlinx.coroutines.flow.e.H(this.j, new jqr(this.a.h, new SendingMessagesSettingsController$bindStateFlows$1(this, null), 3));
        this.e.get().getClass();
    }

    public final void f() {
        tje.N(this.j, null, null, new SendingMessagesSettingsController$showTooltip$1(this, null), 3);
    }
}
