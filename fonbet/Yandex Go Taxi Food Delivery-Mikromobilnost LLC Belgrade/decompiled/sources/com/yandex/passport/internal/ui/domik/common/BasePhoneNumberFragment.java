package com.yandex.passport.internal.ui.domik.common;

import android.app.PendingIntent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Space;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.tasks.zzw;
import com.yandex.passport.R;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.links.h;
import com.yandex.passport.internal.ui.base.g;
import com.yandex.passport.internal.ui.domik.BaseTrack;
import com.yandex.passport.internal.ui.domik.base.BaseDomikFragment;
import com.yandex.passport.internal.ui.domik.base.b;
import com.yandex.passport.internal.ui.util.SimpleTextWatcher;
import com.yandex.passport.internal.util.n;
import defpackage.a4b1;
import defpackage.dtx0;
import defpackage.k50;
import defpackage.m50;
import defpackage.zy11;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000 X*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001YB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0007J-\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\bH$¢\u0006\u0004\b\u001f\u0010\u0007J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\nH\u0014¢\u0006\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00108\u001a\u00020,8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b8\u0010.\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010>\u001a\u00020=8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010E\u001a\u00020D8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010MR\u0016\u0010O\u001a\u00020\n8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\n8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\bQ\u0010PR\u0016\u0010R\u001a\u00020\n8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\bR\u0010PR\"\u0010V\u001a\u0010\u0012\f\u0012\n U*\u0004\u0018\u00010T0T0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/common/BasePhoneNumberFragment;", "Lcom/yandex/passport/internal/ui/domik/base/b;", CA20Status.STATUS_CERTIFICATE_V, "Lcom/yandex/passport/internal/ui/domik/BaseTrack;", "T", "Lcom/yandex/passport/internal/ui/domik/base/BaseDomikFragment;", "<init>", "()V", "Lzy11;", "startPhoneNumberHint", "", "keyboardShowed", "updateKeyboardState", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "doOnNextButtonClick", "", ErrorResponseData.JSON_ERROR_CODE, "isFieldErrorSupported", "(Ljava/lang/String;)Z", "isSuperLiteRegistrationEnabled", "()Z", "Lcom/yandex/passport/internal/smsretriever/a;", "smsRetrieverHelper", "Lcom/yandex/passport/internal/smsretriever/a;", "Lcom/yandex/passport/internal/e;", "contextUtils", "Lcom/yandex/passport/internal/e;", "Landroid/widget/TextView;", "textLegal", "Landroid/widget/TextView;", "imageLogo", "Landroid/view/View;", "Landroid/widget/EditText;", "editPhone", "Landroid/widget/EditText;", "getEditPhone", "()Landroid/widget/EditText;", "setEditPhone", "(Landroid/widget/EditText;)V", "textViewMessage", "getTextViewMessage", "()Landroid/widget/TextView;", "setTextViewMessage", "(Landroid/widget/TextView;)V", "Landroid/widget/Button;", "buttonLiteNext", "Landroid/widget/Button;", "getButtonLiteNext", "()Landroid/widget/Button;", "setButtonLiteNext", "(Landroid/widget/Button;)V", "Landroid/widget/CheckBox;", "checkBoxUnsubscribeMailing", "Landroid/widget/CheckBox;", "getCheckBoxUnsubscribeMailing", "()Landroid/widget/CheckBox;", "setCheckBoxUnsubscribeMailing", "(Landroid/widget/CheckBox;)V", "Landroid/widget/Space;", "spacer1", "Landroid/widget/Space;", "spacer2", "isHintRequestSent", "Z", "keyboardShowedOnFirstEnter", "isUberTheme", "Lm50;", "Landroidx/activity/result/IntentSenderRequest;", "kotlin.jvm.PlatformType", "phoneNumberHintIntentResultLauncher", "Lm50;", "Companion", "com/yandex/passport/internal/ui/domik/common/b", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BasePhoneNumberFragment<V extends com.yandex.passport.internal.ui.domik.base.b, T extends BaseTrack> extends BaseDomikFragment<V, T> {
    public static final int $stable = 8;
    public static final b Companion = new b();
    public static final String KEY_HINT_REQUEST_SENT = "hint-request-sent";
    protected Button buttonLiteNext;
    protected CheckBox checkBoxUnsubscribeMailing;
    private com.yandex.passport.internal.e contextUtils;
    protected EditText editPhone;
    private View imageLogo;
    protected boolean isHintRequestSent;
    protected boolean isUberTheme;
    protected boolean keyboardShowedOnFirstEnter;
    private final m50 phoneNumberHintIntentResultLauncher = registerForActivityResult(new k50(), new h(this, 4));
    private com.yandex.passport.internal.smsretriever.a smsRetrieverHelper;
    private Space spacer1;
    private Space spacer2;
    private TextView textLegal;
    protected TextView textViewMessage;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7(BasePhoneNumberFragment basePhoneNumberFragment, View view) {
        basePhoneNumberFragment.statefulReporter.f();
        basePhoneNumberFragment.doOnNextButtonClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$8(BasePhoneNumberFragment basePhoneNumberFragment, boolean z) {
        basePhoneNumberFragment.updateKeyboardState(z);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void phoneNumberHintIntentResultLauncher$lambda$10(BasePhoneNumberFragment basePhoneNumberFragment, ActivityResult activityResult) {
        try {
            basePhoneNumberFragment.getEditPhone().setText(a4b1.a(basePhoneNumberFragment.requireActivity()).e(activityResult.getData()));
            basePhoneNumberFragment.doOnNextButtonClick();
            if (basePhoneNumberFragment.keyboardShowedOnFirstEnter) {
                basePhoneNumberFragment.postShowSoftKeyboard(basePhoneNumberFragment.getEditPhone(), basePhoneNumberFragment.textMessage);
            }
        } catch (Exception e) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.WARN, null, "Phone Number Hint launcher failed", e);
            }
        }
    }

    private final void startPhoneNumberHint() {
        try {
            GetPhoneNumberHintIntentRequest.builder().getClass();
            int i = 0;
            GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest = new GetPhoneNumberHintIntentRequest(0);
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Phone Number Hint started", 8);
            }
            zzw f = a4b1.a(requireActivity()).f(getPhoneNumberHintIntentRequest);
            int i2 = 10;
            com.yandex.passport.internal.ui.a aVar = new com.yandex.passport.internal.ui.a(i2, new a(this, i));
            f.getClass();
            f.g(dtx0.a, aVar);
            f.d(new com.yandex.passport.common.util.b(i2));
        } catch (Exception e) {
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.WARN, null, "Phone Number Hint failed", e);
            }
            this.eventReporter.k(e);
        }
        this.isHintRequestSent = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 startPhoneNumberHint$lambda$1(BasePhoneNumberFragment basePhoneNumberFragment, PendingIntent pendingIntent) {
        basePhoneNumberFragment.phoneNumberHintIntentResultLauncher.a(new IntentSenderRequest(pendingIntent.getIntentSender(), null, 0, 0));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startPhoneNumberHint$lambda$4(Exception exc) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.b(LogLevel.WARN, null, "Phone Number Hint failure", exc);
        }
    }

    private final void updateKeyboardState(boolean keyboardShowed) {
        boolean z = (keyboardShowed || this.keyboardShowedOnFirstEnter || !this.isUberTheme) ? false : true;
        View view = this.imageLogo;
        if (view == null) {
            view = null;
        }
        view.setVisibility(z ? 0 : 8);
        Space space = this.spacer1;
        if (space != null) {
            space.setVisibility(z ? 8 : 0);
        }
        Space space2 = this.spacer2;
        if (space2 != null) {
            space2.setVisibility(z ? 8 : 0);
        }
        TextView textView = this.textLegal;
        (textView != null ? textView : null).setVisibility(z ? 8 : 0);
    }

    public abstract void doOnNextButtonClick();

    public final Button getButtonLiteNext() {
        Button button = this.buttonLiteNext;
        if (button != null) {
            return button;
        }
        return null;
    }

    public final CheckBox getCheckBoxUnsubscribeMailing() {
        CheckBox checkBox = this.checkBoxUnsubscribeMailing;
        if (checkBox != null) {
            return checkBox;
        }
        return null;
    }

    public final EditText getEditPhone() {
        EditText editText = this.editPhone;
        if (editText != null) {
            return editText;
        }
        return null;
    }

    public final TextView getTextViewMessage() {
        TextView textView = this.textViewMessage;
        if (textView != null) {
            return textView;
        }
        return null;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment
    public boolean isFieldErrorSupported(String errorCode) {
        return true;
    }

    public boolean isSuperLiteRegistrationEnabled() {
        return false;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment, com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.smsRetrieverHelper = a.getSmsRetrieverHelper();
        this.contextUtils = a.getContextUtils();
        TypedArray obtainStyledAttributes = requireActivity().getTheme().obtainStyledAttributes(new int[]{R.attr.passportPhoneNumberScreenKeyboardShowed});
        try {
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            this.keyboardShowedOnFirstEnter = z;
            obtainStyledAttributes = requireActivity().getTheme().obtainStyledAttributes(new int[]{R.attr.passportUberLogo});
            try {
                boolean z2 = obtainStyledAttributes.getResourceId(0, -1) != -1;
                obtainStyledAttributes.recycle();
                this.isUberTheme = z2;
                super.onCreate(savedInstanceState);
            } finally {
            }
        } finally {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(getDomikComponent().getDomikDesignProvider().b, container, false);
        if (savedInstanceState != null) {
            this.isHintRequestSent = savedInstanceState.getBoolean(KEY_HINT_REQUEST_SENT, false);
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.isHintRequestSent) {
            if (com.google.android.gms.common.a.d.d(requireActivity(), 220000000) == 0) {
                startPhoneNumberHint();
                return;
            }
        }
        if (this.keyboardShowedOnFirstEnter) {
            postShowSoftKeyboard(getEditPhone(), this.textMessage);
        }
        View view = getView();
        CharSequence text = this.textMessage.getText();
        if (view != null) {
            view.announceForAccessibility(text);
        }
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        outState.putBoolean(KEY_HINT_REQUEST_SENT, this.isHintRequestSent);
        super.onSaveInstanceState(outState);
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment, com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setEditPhone((EditText) view.findViewById(R.id.edit_phone_number));
        setTextViewMessage((TextView) view.findViewById(R.id.text_message));
        this.imageLogo = view.findViewById(R.id.image_logo);
        this.spacer1 = (Space) view.findViewById(R.id.spacer_1);
        this.spacer2 = (Space) view.findViewById(R.id.spacer_2);
        this.textLegal = (TextView) view.findViewById(R.id.text_legal);
        setButtonLiteNext((Button) view.findViewById(R.id.button_lite_next));
        setCheckBoxUnsubscribeMailing((CheckBox) view.findViewById(R.id.checkbox_unsubscribe_mailing));
        com.yandex.passport.internal.e eVar = this.contextUtils;
        if (eVar == null) {
            eVar = null;
        }
        getEditPhone().addTextChangedListener(new PhoneNumberFormattingTextWatcher(eVar.a()));
        getEditPhone().addTextChangedListener(new SimpleTextWatcher(new com.yandex.passport.internal.ui.a(11, this)));
        getEditPhone().setText(n.a(requireContext()));
        getEditPhone().setSelection(getEditPhone().getText().length());
        this.buttonNext.setOnClickListener(new com.yandex.passport.internal.autologin.ui.b(4, this));
        getEditPhone().setContentDescription(this.textMessage.getText());
        this.commonViewModel.I.f(getViewLifecycleOwner(), new g(2, new a(this, 1)));
    }

    public final void setButtonLiteNext(Button button) {
        this.buttonLiteNext = button;
    }

    public final void setCheckBoxUnsubscribeMailing(CheckBox checkBox) {
        this.checkBoxUnsubscribeMailing = checkBox;
    }

    public final void setEditPhone(EditText editText) {
        this.editPhone = editText;
    }

    public final void setTextViewMessage(TextView textView) {
        this.textViewMessage = textView;
    }
}
