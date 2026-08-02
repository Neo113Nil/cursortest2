package com.yandex.passport.internal.ui.authsdk;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.passport.R;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.network.requester.ImageLoadingClient;
import com.yandex.passport.internal.network.response.ExternalApplicationPermissionsResult;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.base.BaseBottomSheetDialogFragment;
import defpackage.jl40;
import defpackage.ls31;
import defpackage.pq60;
import defpackage.w53;
import defpackage.wuj0;
import defpackage.ycc;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 V2\u00020\u00012\u00020\u0002:\u0001WB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\rJ)\u0010\"\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b-\u0010\tJ\u000f\u0010.\u001a\u00020\u0007H\u0016¢\u0006\u0004\b.\u0010\u0004J\u000f\u0010/\u001a\u00020\u0007H\u0016¢\u0006\u0004\b/\u0010\u0004J\u0017\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00072\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b8\u00107R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010>R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010BR\u0016\u0010D\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010BR\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010IR\u0016\u0010K\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010IR\u0016\u0010L\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010IR\u0016\u0010N\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006X"}, d2 = {"Lcom/yandex/passport/internal/ui/authsdk/TurboAppFragment;", "Lcom/yandex/passport/internal/ui/base/BaseBottomSheetDialogFragment;", "Lcom/yandex/passport/internal/ui/authsdk/r;", "<init>", "()V", "Lcom/yandex/passport/internal/ModernAccount;", "account", "Lzy11;", "showAccount", "(Lcom/yandex/passport/internal/ModernAccount;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "outState", "onSaveInstanceState", "", "requestCode", "resultCode", "Landroid/content/Intent;", Constants.KEY_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/yandex/passport/internal/network/response/ExternalApplicationPermissionsResult;", "permissionsResult", "selectedAccount", "showContent", "(Lcom/yandex/passport/internal/network/response/ExternalApplicationPermissionsResult;Lcom/yandex/passport/internal/ModernAccount;)V", "Lcom/yandex/passport/internal/ui/EventError;", ErrorResponseData.JSON_ERROR_CODE, "onErrorCode", "(Lcom/yandex/passport/internal/ui/EventError;Lcom/yandex/passport/internal/ModernAccount;)V", "showProgress", "onDeclined", "onCanceled", "Lcom/yandex/passport/internal/ui/authsdk/AuthSdkResultContainer;", "resultContainer", "onResultReceived", "(Lcom/yandex/passport/internal/ui/authsdk/AuthSdkResultContainer;)V", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "onDismiss", "Lcom/yandex/passport/internal/network/requester/ImageLoadingClient;", "imageLoadingClient", "Lcom/yandex/passport/internal/network/requester/ImageLoadingClient;", "Landroid/widget/ImageView;", "imageAppIcon", "Landroid/widget/ImageView;", "imageAvatar", "Landroid/widget/TextView;", "textTitle", "Landroid/widget/TextView;", "textDisplayName", "textScopes", "Landroid/widget/ProgressBar;", "progressWithAccount", "Landroid/widget/ProgressBar;", "layoutContent", "Landroid/view/View;", "layoutButtons", "layoutAppIcon", "layoutAccount", "Landroid/widget/Button;", "buttonRetry", "Landroid/widget/Button;", "Lcom/yandex/passport/internal/ui/authsdk/s;", "commonViewModel", "Lcom/yandex/passport/internal/ui/authsdk/s;", "Lcom/yandex/passport/internal/ui/authsdk/l;", "viewModel", "Lcom/yandex/passport/internal/ui/authsdk/l;", "Companion", "com/yandex/passport/internal/ui/authsdk/x", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TurboAppFragment extends BaseBottomSheetDialogFragment implements r {
    public static final int $stable = 8;
    public static final x Companion = new x();
    private Button buttonRetry;
    private s commonViewModel;
    private ImageView imageAppIcon;
    private ImageView imageAvatar;
    private ImageLoadingClient imageLoadingClient;
    private View layoutAccount;
    private View layoutAppIcon;
    private View layoutButtons;
    private View layoutContent;
    private ProgressBar progressWithAccount;
    private TextView textDisplayName;
    private TextView textScopes;
    private TextView textTitle;
    private l viewModel;

    /* JADX INFO: Access modifiers changed from: private */
    public static final l onCreate$lambda$0(PassportProcessGlobalComponent passportProcessGlobalComponent, TurboAppFragment turboAppFragment, AuthSdkProperties authSdkProperties, Bundle bundle) {
        c0 eventReporter = passportProcessGlobalComponent.getEventReporter();
        com.yandex.passport.internal.core.accounts.d accountsRetriever = passportProcessGlobalComponent.getAccountsRetriever();
        com.yandex.passport.internal.core.accounts.g accountsUpdater = passportProcessGlobalComponent.getAccountsUpdater();
        com.yandex.passport.internal.network.client.c clientChooser = passportProcessGlobalComponent.getClientChooser();
        turboAppFragment.requireActivity().getApplication();
        passportProcessGlobalComponent.getPersonProfileHelper();
        return new l(eventReporter, accountsRetriever, accountsUpdater, clientChooser, authSdkProperties, passportProcessGlobalComponent.getSuggestedLanguageUseCase(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(TurboAppFragment turboAppFragment, View view) {
        l lVar = turboAppFragment.viewModel;
        if (lVar == null) {
            lVar = null;
        }
        lVar.b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(TurboAppFragment turboAppFragment, View view) {
        l lVar = turboAppFragment.viewModel;
        if (lVar == null) {
            lVar = null;
        }
        lVar.A.l(new i(1));
        c0 c0Var = lVar.G;
        String clientId = lVar.I.getClientId();
        c0Var.getClass();
        w53 w53Var = new w53();
        w53Var.put("reporter", clientId);
        c0Var.a.a(com.yandex.passport.internal.analytics.o.c, w53Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(TurboAppFragment turboAppFragment, View view) {
        l lVar = turboAppFragment.viewModel;
        if (lVar == null) {
            lVar = null;
        }
        lVar.d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(TurboAppFragment turboAppFragment, com.yandex.passport.internal.ui.base.l lVar) {
        turboAppFragment.startActivityForResult(lVar.a(turboAppFragment.requireContext()), lVar.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$6(TurboAppFragment turboAppFragment, EventError eventError) {
        s sVar = turboAppFragment.commonViewModel;
        if (sVar == null) {
            sVar = null;
        }
        sVar.x.add(eventError.getErrorCode());
    }

    private final void showAccount(ModernAccount account) {
        String m296getAvatarUrlxSnV4o;
        View view = this.layoutAccount;
        if (view == null) {
            view = null;
        }
        view.setVisibility(0);
        TextView textView = this.textDisplayName;
        if (textView == null) {
            textView = null;
        }
        Context requireContext = requireContext();
        String primaryDisplayName = account.getPrimaryDisplayName();
        SpannableString spannableString = new SpannableString(primaryDisplayName);
        if (!TextUtils.isEmpty(primaryDisplayName)) {
            spannableString.setSpan(new ForegroundColorSpan(requireContext.getColor(R.color.passport_login_first_character)), 0, 1, 33);
        }
        textView.setText(spannableString);
        if (account.isAvatarEmpty() || (m296getAvatarUrlxSnV4o = account.m296getAvatarUrlxSnV4o()) == null) {
            m296getAvatarUrlxSnV4o = null;
        }
        ImageView imageView = this.imageAvatar;
        if (m296getAvatarUrlxSnV4o == null) {
            ImageView imageView2 = imageView != null ? imageView : null;
            Resources resources = getResources();
            int i = R.drawable.passport_ico_user;
            Resources.Theme theme = requireActivity().getTheme();
            ThreadLocal threadLocal = wuj0.a;
            imageView2.setImageDrawable(resources.getDrawable(i, theme));
            return;
        }
        if (imageView == null) {
            imageView = null;
        }
        if (jl40.l(imageView.getTag(), m296getAvatarUrlxSnV4o)) {
            return;
        }
        ImageView imageView3 = this.imageAvatar;
        if (imageView3 == null) {
            imageView3 = null;
        }
        Resources resources2 = getResources();
        int i2 = R.drawable.passport_ico_user;
        Resources.Theme theme2 = requireActivity().getTheme();
        ThreadLocal threadLocal2 = wuj0.a;
        imageView3.setImageDrawable(resources2.getDrawable(i2, theme2));
        ImageView imageView4 = this.imageAvatar;
        if (imageView4 == null) {
            imageView4 = null;
        }
        String m296getAvatarUrlxSnV4o2 = account.m296getAvatarUrlxSnV4o();
        if (m296getAvatarUrlxSnV4o2 == null) {
            m296getAvatarUrlxSnV4o2 = null;
        }
        imageView4.setTag(m296getAvatarUrlxSnV4o2);
        l lVar = this.viewModel;
        if (lVar == null) {
            lVar = null;
        }
        ImageLoadingClient imageLoadingClient = this.imageLoadingClient;
        if (imageLoadingClient == null) {
            imageLoadingClient = null;
        }
        String m296getAvatarUrlxSnV4o3 = account.m296getAvatarUrlxSnV4o();
        lVar.w.a.add(new com.yandex.passport.legacy.lx.f(imageLoadingClient.d(m296getAvatarUrlxSnV4o3 != null ? m296getAvatarUrlxSnV4o3 : null)).e(new com.yandex.passport.internal.ui.o(3, this, account), new com.yandex.passport.common.util.b(7)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAccount$lambda$14(TurboAppFragment turboAppFragment, ModernAccount modernAccount, Bitmap bitmap) {
        ImageView imageView = turboAppFragment.imageAvatar;
        if (imageView == null) {
            imageView = null;
        }
        String str = (String) imageView.getTag();
        String m296getAvatarUrlxSnV4o = modernAccount.m296getAvatarUrlxSnV4o();
        if (m296getAvatarUrlxSnV4o == null) {
            m296getAvatarUrlxSnV4o = null;
        }
        if (TextUtils.equals(str, m296getAvatarUrlxSnV4o)) {
            ImageView imageView2 = turboAppFragment.imageAvatar;
            (imageView2 != null ? imageView2 : null).setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAccount$lambda$16(Throwable th) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Error loading app icon", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showContent$lambda$10(TurboAppFragment turboAppFragment, String str, Bitmap bitmap) {
        ImageView imageView = turboAppFragment.imageAppIcon;
        if (imageView == null) {
            imageView = null;
        }
        if (TextUtils.equals((String) imageView.getTag(), str)) {
            ImageView imageView2 = turboAppFragment.imageAppIcon;
            (imageView2 != null ? imageView2 : null).setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showContent$lambda$12(Throwable th) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Error loading app icon", th);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        l lVar = this.viewModel;
        if (lVar == null) {
            lVar = null;
        }
        lVar.getClass();
        if (requestCode != 400) {
            com.yandex.passport.legacy.a.d(new IllegalStateException("Unknown request or illegal state"));
            return;
        }
        if (resultCode == -1 && data != null) {
            lVar.F = new InitialState(com.yandex.passport.internal.util.p.B(a0.e(data.getExtras()).a));
            lVar.d0();
            return;
        }
        WaitingAccountState waitingAccountState = (WaitingAccountState) lVar.F;
        if (waitingAccountState.uid != null && !waitingAccountState.isReLoginRequired) {
            lVar.F = new InitialState(waitingAccountState.uid);
            lVar.d0();
            com.yandex.passport.legacy.a.e(4, "Change account cancelled", null);
        } else {
            lVar.A.l(new i(0));
            c0 c0Var = lVar.G;
            c0Var.getClass();
            w53 w53Var = new w53();
            w53Var.put("step", "1");
            c0Var.a.a(com.yandex.passport.internal.analytics.g.c, w53Var);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        s sVar = this.commonViewModel;
        if (sVar == null) {
            sVar = null;
        }
        sVar.w.l(zy11.a);
    }

    @Override // com.yandex.passport.internal.ui.authsdk.r
    public void onCanceled() {
        s sVar = this.commonViewModel;
        if (sVar == null) {
            sVar = null;
        }
        sVar.w.l(zy11.a);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m mVar = AuthSdkProperties.Companion;
        Bundle requireArguments = requireArguments();
        mVar.getClass();
        final AuthSdkProperties authSdkProperties = (AuthSdkProperties) requireArguments.getParcelable("auth_sdk_properties");
        final PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.imageLoadingClient = a.getImageLoadingClient();
        this.viewModel = (l) com.yandex.passport.internal.u.b(this, new Callable() { // from class: com.yandex.passport.internal.ui.authsdk.u
            @Override // java.util.concurrent.Callable
            public final Object call() {
                l onCreate$lambda$0;
                onCreate$lambda$0 = TurboAppFragment.onCreate$lambda$0(PassportProcessGlobalComponent.this, this, authSdkProperties, savedInstanceState);
                return onCreate$lambda$0;
            }
        });
        this.commonViewModel = (s) new ls31(requireActivity()).b(s.class);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog onCreateDialog = super.onCreateDialog(savedInstanceState);
        onCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.yandex.passport.internal.ui.authsdk.v
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                TurboAppFragment.this.expandDialog();
            }
        });
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.passport_dialog_turboapp_scopes, container, false);
    }

    @Override // com.yandex.passport.internal.ui.authsdk.r
    public void onDeclined() {
        s sVar = this.commonViewModel;
        if (sVar == null) {
            sVar = null;
        }
        sVar.b.l(zy11.a);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        s sVar = this.commonViewModel;
        if (sVar == null) {
            sVar = null;
        }
        sVar.w.l(zy11.a);
    }

    @Override // com.yandex.passport.internal.ui.authsdk.r
    public void onErrorCode(EventError errorCode, ModernAccount account) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, errorCode.getErrorCode(), 8);
        }
        ProgressBar progressBar = this.progressWithAccount;
        if (progressBar == null) {
            progressBar = null;
        }
        progressBar.setVisibility(8);
        View view = this.layoutAppIcon;
        if (view == null) {
            view = null;
        }
        view.setVisibility(8);
        TextView textView = this.textScopes;
        if (textView == null) {
            textView = null;
        }
        textView.setVisibility(8);
        View view2 = this.layoutButtons;
        if (view2 == null) {
            view2 = null;
        }
        view2.setVisibility(8);
        Button button = this.buttonRetry;
        if (button == null) {
            button = null;
        }
        button.setVisibility(0);
        TextView textView2 = this.textTitle;
        if (textView2 == null) {
            textView2 = null;
        }
        com.yandex.passport.legacy.d.l(textView2, 16);
        Throwable exception = errorCode.getException();
        if (exception instanceof IOException) {
            TextView textView3 = this.textTitle;
            (textView3 != null ? textView3 : null).setText(R.string.passport_error_network);
        } else if (!(exception instanceof FailedResponseException)) {
            TextView textView4 = this.textTitle;
            (textView4 != null ? textView4 : null).setText(R.string.passport_am_error_try_again);
        } else if ("app_id.not_matched".equals(exception.getMessage()) || "fingerprint.not_matched".equals(exception.getMessage())) {
            TextView textView5 = this.textTitle;
            (textView5 != null ? textView5 : null).setText(R.string.passport_error_auth_sdk_developer_error);
        } else {
            TextView textView6 = this.textTitle;
            (textView6 != null ? textView6 : null).setText(getString(R.string.passport_am_error_try_again) + "\n(" + errorCode.getErrorCode() + ')');
        }
        showAccount(account);
    }

    @Override // com.yandex.passport.internal.ui.authsdk.r
    public void onResultReceived(AuthSdkResultContainer resultContainer) {
        s sVar = this.commonViewModel;
        if (sVar == null) {
            sVar = null;
        }
        sVar.c.l(resultContainer);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        l lVar = this.viewModel;
        if (lVar == null) {
            lVar = null;
        }
        outState.putParcelable(ClidProvider.STATE, lVar.F);
    }

    @Override // com.yandex.passport.internal.ui.base.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView imageView = (ImageView) view.findViewById(R.id.image_app_icon);
        this.imageAppIcon = imageView;
        if (imageView == null) {
            imageView = null;
        }
        final int i = 1;
        imageView.setClipToOutline(true);
        this.imageAvatar = (ImageView) view.findViewById(R.id.image_avatar);
        this.textTitle = (TextView) view.findViewById(R.id.text_title);
        this.textDisplayName = (TextView) view.findViewById(R.id.text_primary_display_name);
        this.textScopes = (TextView) view.findViewById(R.id.text_scopes);
        this.progressWithAccount = (ProgressBar) view.findViewById(R.id.progress_with_account);
        this.layoutContent = view.findViewById(R.id.layout_content);
        this.layoutButtons = view.findViewById(R.id.layout_buttons);
        this.layoutAppIcon = view.findViewById(R.id.layout_app_icon);
        this.layoutAccount = view.findViewById(R.id.layout_account);
        this.buttonRetry = (Button) view.findViewById(R.id.button_retry);
        Context requireContext = requireContext();
        ProgressBar progressBar = this.progressWithAccount;
        if (progressBar == null) {
            progressBar = null;
        }
        com.yandex.passport.legacy.d.b(requireContext, progressBar, R.color.passport_progress_bar);
        final int i2 = 0;
        ((Button) view.findViewById(R.id.button_accept)).setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.authsdk.t
            public final /* synthetic */ TurboAppFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                TurboAppFragment turboAppFragment = this.b;
                switch (i3) {
                    case 0:
                        TurboAppFragment.onViewCreated$lambda$1(turboAppFragment, view2);
                        break;
                    case 1:
                        TurboAppFragment.onViewCreated$lambda$2(turboAppFragment, view2);
                        break;
                    default:
                        TurboAppFragment.onViewCreated$lambda$3(turboAppFragment, view2);
                        break;
                }
            }
        });
        ((Button) view.findViewById(R.id.button_decline)).setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.authsdk.t
            public final /* synthetic */ TurboAppFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i;
                TurboAppFragment turboAppFragment = this.b;
                switch (i3) {
                    case 0:
                        TurboAppFragment.onViewCreated$lambda$1(turboAppFragment, view2);
                        break;
                    case 1:
                        TurboAppFragment.onViewCreated$lambda$2(turboAppFragment, view2);
                        break;
                    default:
                        TurboAppFragment.onViewCreated$lambda$3(turboAppFragment, view2);
                        break;
                }
            }
        });
        Button button = this.buttonRetry;
        if (button == null) {
            button = null;
        }
        final int i3 = 2;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.authsdk.t
            public final /* synthetic */ TurboAppFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i32 = i3;
                TurboAppFragment turboAppFragment = this.b;
                switch (i32) {
                    case 0:
                        TurboAppFragment.onViewCreated$lambda$1(turboAppFragment, view2);
                        break;
                    case 1:
                        TurboAppFragment.onViewCreated$lambda$2(turboAppFragment, view2);
                        break;
                    default:
                        TurboAppFragment.onViewCreated$lambda$3(turboAppFragment, view2);
                        break;
                }
            }
        });
        l lVar = this.viewModel;
        if (lVar == null) {
            lVar = null;
        }
        lVar.B.f(getViewLifecycleOwner(), new pq60(this) { // from class: com.yandex.passport.internal.ui.authsdk.w
            public final /* synthetic */ TurboAppFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i4 = i2;
                TurboAppFragment turboAppFragment = this.b;
                switch (i4) {
                    case 0:
                        TurboAppFragment.onViewCreated$lambda$4(turboAppFragment, (com.yandex.passport.internal.ui.base.l) obj);
                        break;
                    case 1:
                        ((h) obj).a(turboAppFragment);
                        break;
                    default:
                        TurboAppFragment.onViewCreated$lambda$6(turboAppFragment, (EventError) obj);
                        break;
                }
            }
        });
        l lVar2 = this.viewModel;
        if (lVar2 == null) {
            lVar2 = null;
        }
        lVar2.A.f(getViewLifecycleOwner(), new pq60(this) { // from class: com.yandex.passport.internal.ui.authsdk.w
            public final /* synthetic */ TurboAppFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i4 = i;
                TurboAppFragment turboAppFragment = this.b;
                switch (i4) {
                    case 0:
                        TurboAppFragment.onViewCreated$lambda$4(turboAppFragment, (com.yandex.passport.internal.ui.base.l) obj);
                        break;
                    case 1:
                        ((h) obj).a(turboAppFragment);
                        break;
                    default:
                        TurboAppFragment.onViewCreated$lambda$6(turboAppFragment, (EventError) obj);
                        break;
                }
            }
        });
        l lVar3 = this.viewModel;
        (lVar3 != null ? lVar3 : null).b.f(getViewLifecycleOwner(), new pq60(this) { // from class: com.yandex.passport.internal.ui.authsdk.w
            public final /* synthetic */ TurboAppFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i4 = i3;
                TurboAppFragment turboAppFragment = this.b;
                switch (i4) {
                    case 0:
                        TurboAppFragment.onViewCreated$lambda$4(turboAppFragment, (com.yandex.passport.internal.ui.base.l) obj);
                        break;
                    case 1:
                        ((h) obj).a(turboAppFragment);
                        break;
                    default:
                        TurboAppFragment.onViewCreated$lambda$6(turboAppFragment, (EventError) obj);
                        break;
                }
            }
        });
    }

    @Override // com.yandex.passport.internal.ui.authsdk.r
    public void showContent(ExternalApplicationPermissionsResult permissionsResult, ModernAccount selectedAccount) {
        if (permissionsResult.getRequestedScopes().isEmpty()) {
            l lVar = this.viewModel;
            (lVar != null ? lVar : null).b0();
            return;
        }
        ProgressBar progressBar = this.progressWithAccount;
        if (progressBar == null) {
            progressBar = null;
        }
        int i = 8;
        progressBar.setVisibility(8);
        View view = this.layoutAppIcon;
        if (view == null) {
            view = null;
        }
        view.setVisibility(0);
        TextView textView = this.textScopes;
        if (textView == null) {
            textView = null;
        }
        textView.setVisibility(0);
        View view2 = this.layoutButtons;
        if (view2 == null) {
            view2 = null;
        }
        view2.setVisibility(0);
        Button button = this.buttonRetry;
        if (button == null) {
            button = null;
        }
        button.setVisibility(8);
        TextView textView2 = this.textTitle;
        if (textView2 == null) {
            textView2 = null;
        }
        com.yandex.passport.legacy.d.l(textView2, 24);
        TextView textView3 = this.textTitle;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setText(getString(R.string.passport_turboapp_app_title, permissionsResult.getTitle()));
        List<ExternalApplicationPermissionsResult.Scope> requestedScopes = permissionsResult.getRequestedScopes();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = requestedScopes.iterator();
        while (it.hasNext()) {
            ycc.r(((ExternalApplicationPermissionsResult.Scope) it.next()).getPermissions(), arrayList);
        }
        String X = kotlin.collections.a.X(arrayList, Extension.FIX_SPACE, null, null, new com.yandex.passport.internal.core.announcing.f(12), 30);
        TextView textView4 = this.textScopes;
        if (textView4 == null) {
            textView4 = null;
        }
        textView4.setText(getString(R.string.passport_turboapp_app_scopes, X));
        String iconUrl = permissionsResult.getIconUrl();
        if (!TextUtils.isEmpty(iconUrl)) {
            ImageView imageView = this.imageAppIcon;
            if (imageView == null) {
                imageView = null;
            }
            imageView.setTag(iconUrl);
            l lVar2 = this.viewModel;
            if (lVar2 == null) {
                lVar2 = null;
            }
            ImageLoadingClient imageLoadingClient = this.imageLoadingClient;
            lVar2.w.a.add(new com.yandex.passport.legacy.lx.f((imageLoadingClient != null ? imageLoadingClient : null).d(iconUrl)).e(new com.yandex.passport.internal.ui.o(2, this, iconUrl), new com.yandex.passport.common.util.b(i)));
        }
        showAccount(selectedAccount);
    }

    @Override // com.yandex.passport.internal.ui.authsdk.r
    public void showProgress(ModernAccount account) {
        View view = this.layoutAppIcon;
        if (view == null) {
            view = null;
        }
        view.setVisibility(8);
        TextView textView = this.textScopes;
        if (textView == null) {
            textView = null;
        }
        textView.setVisibility(8);
        View view2 = this.layoutButtons;
        if (view2 == null) {
            view2 = null;
        }
        view2.setVisibility(8);
        Button button = this.buttonRetry;
        if (button == null) {
            button = null;
        }
        button.setVisibility(8);
        TextView textView2 = this.textTitle;
        if (textView2 == null) {
            textView2 = null;
        }
        com.yandex.passport.legacy.d.l(textView2, 16);
        ProgressBar progressBar = this.progressWithAccount;
        if (progressBar == null) {
            progressBar = null;
        }
        progressBar.setVisibility(0);
        TextView textView3 = this.textTitle;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setText(R.string.passport_turboapp_progress_message);
        if (account != null) {
            showAccount(account);
        } else {
            View view3 = this.layoutAccount;
            (view3 != null ? view3 : null).setVisibility(4);
        }
    }
}
