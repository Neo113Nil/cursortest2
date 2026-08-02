package com.yandex.passport.internal.ui.base;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat$Api21Impl;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.analytics.a0;
import com.yandex.passport.internal.ui.util.o;
import de.hdodenhof.circleimageview.CircleImageView;
import defpackage.n751;
import defpackage.u1w;
import defpackage.uc20;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.common.DialogContent;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000 B2\u00020\u0001:\u0001CB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0003R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010.\u001a\u00020'8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\"\u00101\u001a\u00020'8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b1\u0010)\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-R\"\u00105\u001a\u0002048\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010<\u001a\u00020;8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lcom/yandex/passport/internal/ui/base/BaseNotificationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/yandex/passport/api/PassportTheme;", "getPassportTheme", "()Lcom/yandex/passport/api/PassportTheme;", "onDismiss", "", "displayLogin", "onDialogClick", "(Ljava/lang/String;)V", "onPause", "outState", "onSaveInstanceState", "finish", "forceFinish", "Lcom/yandex/passport/internal/ui/autologin/e;", "dismissHelper", "Lcom/yandex/passport/internal/ui/autologin/e;", "getDismissHelper", "()Lcom/yandex/passport/internal/ui/autologin/e;", "setDismissHelper", "(Lcom/yandex/passport/internal/ui/autologin/e;)V", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "Landroid/view/ViewGroup;", DialogContent.INTENT_PARAM_DIALOG_CONTENT, "Landroid/view/ViewGroup;", "getDialogContent$passport_release", "()Landroid/view/ViewGroup;", "setDialogContent$passport_release", "(Landroid/view/ViewGroup;)V", "Landroid/widget/TextView;", "textMessage", "Landroid/widget/TextView;", "getTextMessage$passport_release", "()Landroid/widget/TextView;", "setTextMessage$passport_release", "(Landroid/widget/TextView;)V", "textEmail", "getTextEmail$passport_release", "setTextEmail$passport_release", "textSubMessage", "getTextSubMessage$passport_release", "setTextSubMessage$passport_release", "Lde/hdodenhof/circleimageview/CircleImageView;", "imageAvatar", "Lde/hdodenhof/circleimageview/CircleImageView;", "getImageAvatar$passport_release", "()Lde/hdodenhof/circleimageview/CircleImageView;", "setImageAvatar$passport_release", "(Lde/hdodenhof/circleimageview/CircleImageView;)V", "Landroid/widget/Button;", "buttonAction", "Landroid/widget/Button;", "getButtonAction$passport_release", "()Landroid/widget/Button;", "setButtonAction$passport_release", "(Landroid/widget/Button;)V", "Companion", "com/yandex/passport/internal/ui/base/e", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseNotificationActivity extends AppCompatActivity {
    public static final int $stable = 8;
    public static final e Companion = new e();
    private static final int PADDING = (int) (16.0f * uc20.a.density);
    public Button buttonAction;
    public ViewGroup dialogContent;
    public com.yandex.passport.internal.ui.autologin.e dismissHelper;
    private GestureDetector gestureDetector;
    public CircleImageView imageAvatar;
    public TextView textEmail;
    public TextView textMessage;
    public TextView textSubMessage;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$0(PassportTheme passportTheme, Resources resources) {
        return passportTheme == PassportTheme.DARK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$1(BaseNotificationActivity baseNotificationActivity, View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = baseNotificationActivity.gestureDetector;
        if (gestureDetector == null) {
            gestureDetector = null;
        }
        if (gestureDetector.onTouchEvent(motionEvent) && motionEvent.getAction() == 1) {
            view.performClick();
            baseNotificationActivity.onDialogClick(null);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 onCreate$lambda$2(View view, n751 n751Var) {
        u1w g = n751Var.a.g(647);
        int i = PADDING;
        view.setPadding(i, g.b + i, i, i);
        return n751.b;
    }

    @Override // android.app.Activity
    public void finish() {
        ViewPropertyAnimator duration = getDialogContent$passport_release().animate().translationY(-getDialogContent$passport_release().getMeasuredHeight()).setDuration(getResources().getInteger(R.integer.passport_animation_duration));
        duration.setListener(new AnimatorListenerAdapter() { // from class: com.yandex.passport.internal.ui.base.BaseNotificationActivity$finish$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                super/*android.app.Activity*/.finish();
            }
        });
        duration.start();
    }

    public final void forceFinish() {
        getDialogContent$passport_release().setVisibility(8);
        super.finish();
    }

    public final Button getButtonAction$passport_release() {
        Button button = this.buttonAction;
        if (button != null) {
            return button;
        }
        return null;
    }

    public final ViewGroup getDialogContent$passport_release() {
        ViewGroup viewGroup = this.dialogContent;
        if (viewGroup != null) {
            return viewGroup;
        }
        return null;
    }

    public final com.yandex.passport.internal.ui.autologin.e getDismissHelper() {
        com.yandex.passport.internal.ui.autologin.e eVar = this.dismissHelper;
        if (eVar != null) {
            return eVar;
        }
        return null;
    }

    public final CircleImageView getImageAvatar$passport_release() {
        CircleImageView circleImageView = this.imageAvatar;
        if (circleImageView != null) {
            return circleImageView;
        }
        return null;
    }

    public abstract PassportTheme getPassportTheme();

    public final TextView getTextEmail$passport_release() {
        TextView textView = this.textEmail;
        if (textView != null) {
            return textView;
        }
        return null;
    }

    public final TextView getTextMessage$passport_release() {
        TextView textView = this.textMessage;
        if (textView != null) {
            return textView;
        }
        return null;
    }

    public final TextView getTextSubMessage$passport_release() {
        TextView textView = this.textSubMessage;
        if (textView != null) {
            return textView;
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        a0 a0Var = new a0(7, o.g(this, getPassportTheme()));
        com.yandex.passport.internal.ui.util.m mVar = new com.yandex.passport.internal.ui.util.m(0, 0, a0Var);
        int i = com.yandex.passport.internal.ui.util.g.a;
        int i2 = com.yandex.passport.internal.ui.util.g.b;
        com.yandex.passport.internal.core.announcing.f fVar = new com.yandex.passport.internal.core.announcing.f(21);
        com.yandex.passport.internal.ui.util.m mVar2 = new com.yandex.passport.internal.ui.util.m(i, i2, fVar);
        View decorView = getWindow().getDecorView();
        boolean booleanValue = ((Boolean) a0Var.invoke(decorView.getResources())).booleanValue();
        boolean booleanValue2 = ((Boolean) fVar.invoke(decorView.getResources())).booleanValue();
        com.yandex.passport.internal.ui.util.c eVar = Build.VERSION.SDK_INT >= 30 ? new com.yandex.passport.internal.ui.util.e() : new com.yandex.passport.internal.ui.util.d();
        eVar.a(mVar, mVar2, getWindow(), decorView, booleanValue, booleanValue2);
        eVar.b(getWindow());
        super.onCreate(savedInstanceState);
        setTheme(o.c(getPassportTheme(), this));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.gravity = 48;
        attributes.width = -1;
        attributes.height = -2;
        getWindow().setAttributes(attributes);
        getWindow().setDimAmount(0.0f);
        getWindow().addFlags(32);
        setContentView(R.layout.passport_activity_autologin);
        setDialogContent$passport_release((ViewGroup) findViewById(R.id.dialog_content));
        setTextMessage$passport_release((TextView) findViewById(R.id.text_message));
        setTextEmail$passport_release((TextView) findViewById(R.id.text_email));
        setTextSubMessage$passport_release((TextView) findViewById(R.id.text_sub_message));
        setImageAvatar$passport_release((CircleImageView) findViewById(R.id.image_avatar));
        setButtonAction$passport_release((Button) findViewById(R.id.button_action));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relative_layout);
        setDismissHelper(new com.yandex.passport.internal.ui.autologin.e(this, savedInstanceState, new BaseNotificationActivity$onCreate$2(0, this, BaseNotificationActivity.class, "onDismiss", "onDismiss()V", 0), 5000L));
        overridePendingTransition(0, 0);
        this.gestureDetector = new GestureDetector(this, new GestureDetector.SimpleOnGestureListener() { // from class: com.yandex.passport.internal.ui.base.BaseNotificationActivity$onCreate$3
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent e) {
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onScroll: " + distanceY, 8);
                }
                if (distanceY <= 30.0f) {
                    return super.onScroll(e1, e2, distanceX, distanceY);
                }
                BaseNotificationActivity.this.onDismiss();
                BaseNotificationActivity.this.getDialogContent$passport_release().setOnTouchListener(null);
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }
        });
        getDialogContent$passport_release().setOnTouchListener(new View.OnTouchListener() { // from class: com.yandex.passport.internal.ui.base.d
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean onCreate$lambda$1;
                onCreate$lambda$1 = BaseNotificationActivity.onCreate$lambda$1(BaseNotificationActivity.this, view, motionEvent);
                return onCreate$lambda$1;
            }
        });
        if (savedInstanceState == null) {
            getDialogContent$passport_release().setTranslationY(-getResources().getDimension(R.dimen.passport_autologin_dialog_height));
            getDialogContent$passport_release().animate().translationY(0.0f).setDuration(getResources().getInteger(R.integer.passport_animation_duration)).start();
        }
        View childAt = getDialogContent$passport_release().getChildAt(0);
        float c = com.yandex.passport.legacy.d.c(8, this);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.m(childAt, c);
        ViewCompat$Api21Impl.o(relativeLayout, new com.yandex.passport.common.util.b(9));
    }

    public void onDialogClick(String displayLogin) {
    }

    public abstract void onDismiss();

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putLong("create_time", getDismissHelper().a);
    }

    public final void setButtonAction$passport_release(Button button) {
        this.buttonAction = button;
    }

    public final void setDialogContent$passport_release(ViewGroup viewGroup) {
        this.dialogContent = viewGroup;
    }

    public final void setDismissHelper(com.yandex.passport.internal.ui.autologin.e eVar) {
        this.dismissHelper = eVar;
    }

    public final void setImageAvatar$passport_release(CircleImageView circleImageView) {
        this.imageAvatar = circleImageView;
    }

    public final void setTextEmail$passport_release(TextView textView) {
        this.textEmail = textView;
    }

    public final void setTextMessage$passport_release(TextView textView) {
        this.textMessage = textView;
    }

    public final void setTextSubMessage$passport_release(TextView textView) {
        this.textSubMessage = textView;
    }
}
