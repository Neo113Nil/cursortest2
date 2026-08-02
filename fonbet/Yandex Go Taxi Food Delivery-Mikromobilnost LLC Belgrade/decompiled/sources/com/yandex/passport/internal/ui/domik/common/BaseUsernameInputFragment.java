package com.yandex.passport.internal.ui.domik.common;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.passport.R;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.domik.BaseTrack;
import com.yandex.passport.internal.ui.domik.base.BaseDomikFragment;
import com.yandex.passport.internal.ui.domik.base.b;
import com.yandex.passport.internal.ui.g;
import com.yandex.passport.internal.ui.util.SimpleTextWatcher;
import defpackage.cvu0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0007J\u000f\u0010\u0019\u001a\u00020\bH\u0004¢\u0006\u0004\b\u0019\u0010\u0007J\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH$¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0014¢\u0006\u0004\b$\u0010\u0007J\u0017\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020\u001aH\u0014¢\u0006\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\u00020(8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00104¨\u00066"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/common/BaseUsernameInputFragment;", "Lcom/yandex/passport/internal/ui/domik/base/b;", CA20Status.STATUS_CERTIFICATE_V, "Lcom/yandex/passport/internal/ui/domik/BaseTrack;", "T", "Lcom/yandex/passport/internal/ui/domik/base/BaseDomikFragment;", "<init>", "()V", "Lzy11;", "updateNextButtonStatus", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "validate", "", "firstName", "lastName", "upgradePhonish", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/yandex/passport/internal/ui/g;", "errors", ErrorResponseData.JSON_ERROR_CODE, "showFieldError", "(Lcom/yandex/passport/internal/ui/g;Ljava/lang/String;)V", "hideFieldError", "", "isFieldErrorSupported", "(Ljava/lang/String;)Z", "Landroid/widget/EditText;", "editFirstName", "Landroid/widget/EditText;", "getEditFirstName", "()Landroid/widget/EditText;", "setEditFirstName", "(Landroid/widget/EditText;)V", "editLastName", "getEditLastName", "setEditLastName", "Landroid/widget/TextView;", "textErrorFirstName", "Landroid/widget/TextView;", "textErrorLastName", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseUsernameInputFragment<V extends com.yandex.passport.internal.ui.domik.base.b, T extends BaseTrack> extends BaseDomikFragment<V, T> {
    public static final int $stable = 8;
    protected EditText editFirstName;
    protected EditText editLastName;
    private TextView textErrorFirstName;
    private TextView textErrorLastName;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(BaseUsernameInputFragment baseUsernameInputFragment, View view) {
        if (baseUsernameInputFragment.getEditFirstName().isFocused()) {
            baseUsernameInputFragment.getEditLastName().requestFocus();
        } else {
            baseUsernameInputFragment.validate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFieldError$lambda$5(BaseUsernameInputFragment baseUsernameInputFragment, TextView textView) {
        baseUsernameInputFragment.scrollView.smoothScrollTo(0, textView.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNextButtonStatus() {
        hideFieldError();
    }

    public final EditText getEditFirstName() {
        EditText editText = this.editFirstName;
        if (editText != null) {
            return editText;
        }
        return null;
    }

    public final EditText getEditLastName() {
        EditText editText = this.editLastName;
        if (editText != null) {
            return editText;
        }
        return null;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment
    public void hideFieldError() {
        TextView textView = this.textErrorFirstName;
        if (textView == null) {
            textView = null;
        }
        textView.setVisibility(8);
        TextView textView2 = this.textErrorLastName;
        (textView2 != null ? textView2 : null).setVisibility(8);
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment
    public boolean isFieldErrorSupported(String errorCode) {
        return "first_name.empty".equals(errorCode) || "last_name.empty".equals(errorCode);
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment, com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.statefulReporter = com.yandex.passport.internal.di.a.a().getStatefulReporter();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(getDomikComponent().getDomikDesignProvider().f, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getEditLastName().getText().length() > 0) {
            postShowSoftKeyboard(getEditLastName(), this.textMessage);
        } else {
            postShowSoftKeyboard(getEditFirstName(), this.textMessage);
        }
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment, com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        this.textErrorFirstName = (TextView) view.findViewById(R.id.text_error_first_name);
        this.textErrorLastName = (TextView) view.findViewById(R.id.text_error_last_name);
        super.onViewCreated(view, savedInstanceState);
        setEditFirstName((EditText) view.findViewById(R.id.edit_first_name));
        setEditLastName((EditText) view.findViewById(R.id.edit_last_name));
        this.buttonNext.setOnClickListener(new com.yandex.passport.internal.autologin.ui.b(6, this));
        final int i = 0;
        getEditFirstName().addTextChangedListener(new SimpleTextWatcher(new com.yandex.passport.legacy.lx.a(this) { // from class: com.yandex.passport.internal.ui.domik.common.f
            public final /* synthetic */ BaseUsernameInputFragment b;

            {
                this.b = this;
            }

            @Override // com.yandex.passport.legacy.lx.a
            /* renamed from: a */
            public final void mo290a(Object obj) {
                int i2 = i;
                BaseUsernameInputFragment baseUsernameInputFragment = this.b;
                switch (i2) {
                    case 0:
                        baseUsernameInputFragment.updateNextButtonStatus();
                        break;
                    default:
                        baseUsernameInputFragment.updateNextButtonStatus();
                        break;
                }
            }
        }));
        final int i2 = 1;
        getEditLastName().addTextChangedListener(new SimpleTextWatcher(new com.yandex.passport.legacy.lx.a(this) { // from class: com.yandex.passport.internal.ui.domik.common.f
            public final /* synthetic */ BaseUsernameInputFragment b;

            {
                this.b = this;
            }

            @Override // com.yandex.passport.legacy.lx.a
            /* renamed from: a */
            public final void mo290a(Object obj) {
                int i22 = i2;
                BaseUsernameInputFragment baseUsernameInputFragment = this.b;
                switch (i22) {
                    case 0:
                        baseUsernameInputFragment.updateNextButtonStatus();
                        break;
                    default:
                        baseUsernameInputFragment.updateNextButtonStatus();
                        break;
                }
            }
        }));
        updateNextButtonStatus();
    }

    public final void setEditFirstName(EditText editText) {
        this.editFirstName = editText;
    }

    public final void setEditLastName(EditText editText) {
        this.editLastName = editText;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment
    public void showFieldError(g errors, String errorCode) {
        TextView textView;
        if (!cvu0.x(errorCode, "first_name", false) ? (textView = this.textErrorLastName) == null : (textView = this.textErrorFirstName) == null) {
            textView = null;
        }
        textView.setText(errors.b(errorCode));
        textView.setVisibility(0);
        TextView textView2 = this.textError;
        if (textView2 != null) {
            textView2.performAccessibilityAction(64, null);
        }
        if (textView2 != null) {
            textView2.sendAccessibilityEvent(32768);
        }
        ScrollView scrollView = this.scrollView;
        if (scrollView != null) {
            scrollView.post(new com.yandex.passport.internal.interaction.a(7, this, textView));
        }
    }

    public abstract void upgradePhonish(String firstName, String lastName);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v1, types: [V extends com.yandex.passport.internal.ui.base.h, com.yandex.passport.internal.ui.base.h] */
    /* JADX WARN: Type inference failed for: r9v3, types: [V extends com.yandex.passport.internal.ui.base.h, com.yandex.passport.internal.ui.base.h] */
    public final void validate() {
        this.statefulReporter.f();
        String obj = getEditFirstName().getText().toString();
        int length = obj.length() - 1;
        int i = 0;
        ?? r5 = false;
        while (i <= length) {
            ?? r7 = jl40.q(obj.charAt(r5 == false ? i : length), 32) <= 0;
            if (r5 == true) {
                if (r7 != true) {
                    break;
                } else {
                    length--;
                }
            } else if (r7 == true) {
                i++;
            } else {
                r5 = true;
            }
        }
        String obj2 = obj.subSequence(i, length + 1).toString();
        String obj3 = getEditLastName().getText().toString();
        int length2 = obj3.length() - 1;
        int i2 = 0;
        ?? r72 = false;
        while (i2 <= length2) {
            ?? r8 = jl40.q(obj3.charAt(r72 == false ? i2 : length2), 32) <= 0;
            if (r72 == true) {
                if (r8 != true) {
                    break;
                } else {
                    length2--;
                }
            } else if (r8 == true) {
                i2++;
            } else {
                r72 = true;
            }
        }
        String obj4 = obj3.subSequence(i2, length2 + 1).toString();
        int i3 = 2;
        Throwable th = null;
        ?? r4 = 0;
        ?? r42 = 0;
        ?? r43 = 0;
        if (TextUtils.isEmpty(obj2)) {
            this.viewModel.b.m(new EventError("first_name.empty", th, i3, r43 == true ? 1 : 0));
        } else if (TextUtils.isEmpty(obj4)) {
            this.viewModel.b.m(new EventError("last_name.empty", r42 == true ? 1 : 0, i3, r4 == true ? 1 : 0));
        } else {
            this.statefulReporter.f();
            upgradePhonish(obj2, obj4);
        }
    }
}
