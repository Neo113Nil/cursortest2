package com.yandex.passport.internal.ui.domik.identifier;

import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Screen;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.ui.domik.AuthTrack;
import com.yandex.passport.internal.ui.domik.CredentialManagerDomikResult;
import com.yandex.passport.internal.ui.domik.base.BaseDomikFragment;
import com.yandex.passport.internal.ui.util.j;
import com.yandex.passport.internal.ui.util.l;
import defpackage.eja1;
import defpackage.tje;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 )2\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/identifier/IdentifierCredentialManagerFragment;", "Lcom/yandex/passport/internal/ui/domik/base/BaseDomikFragment;", "Lcom/yandex/passport/internal/ui/domik/identifier/d;", "Lcom/yandex/passport/internal/ui/domik/AuthTrack;", "<init>", "()V", "Lcom/yandex/passport/internal/ModernAccount;", "", "getUsernameSuggest", "(Lcom/yandex/passport/internal/ModernAccount;)Ljava/lang/String;", "Landroid/util/Pair;", "Lcom/yandex/passport/internal/ui/domik/CredentialManagerDomikResult;", "resultAndTrack", "Lzy11;", "saveToCredentialManager", "(Landroid/util/Pair;)V", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "component", "createViewModel", "(Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;)Lcom/yandex/passport/internal/ui/domik/identifier/d;", "Lcom/yandex/passport/internal/analytics/DomikStatefulReporter$Screen;", "getScreenId", "()Lcom/yandex/passport/internal/analytics/DomikStatefulReporter$Screen;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "outState", "onSaveInstanceState", ErrorResponseData.JSON_ERROR_CODE, "", "isFieldErrorSupported", "(Ljava/lang/String;)Z", "Lcom/yandex/passport/internal/sloth/credentialmanager/d;", "credentialManager", "Lcom/yandex/passport/internal/sloth/credentialmanager/d;", "credentialManagerRequested", "Z", "domikResult", "Lcom/yandex/passport/internal/ui/domik/CredentialManagerDomikResult;", "Companion", "com/yandex/passport/internal/ui/domik/identifier/c", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IdentifierCredentialManagerFragment extends BaseDomikFragment<d, AuthTrack> {
    public static final int $stable = 8;
    public static final c Companion = new c();
    private static final String EMPTY_USERNAME_SUGGEST = "";
    public static final String FRAGMENT_TAG = "com.yandex.passport.internal.ui.domik.identifier.IdentifierCredentialManagerFragment";
    private static final String KEY_CREDENTIAL_MANAGER_REQUESTED = "credential_manager_requested";
    private static final String KEY_DOMIK_RESULT = "credential_manager_result";
    private com.yandex.passport.internal.sloth.credentialmanager.d credentialManager;
    private boolean credentialManagerRequested;
    private CredentialManagerDomikResult domikResult;

    private final String getUsernameSuggest(ModernAccount modernAccount) {
        if (modernAccount.getUserInfo().getPrimaryAliasType() == 10) {
            return modernAccount.getName();
        }
        if (modernAccount.getUserInfo().getPrimaryAliasType() == 6 || modernAccount.getUserInfo().getPrimaryAliasType() == 12) {
            return "";
        }
        if (com.yandex.passport.internal.ui.c.t(modernAccount.getUid().getEnvironment())) {
            return modernAccount.getUserInfo().getNormalizedDisplayLogin().concat(ModernAccount.ACCOUNT_NAME_SUFFIX_TEAM);
        }
        String normalizedDisplayLogin = modernAccount.getUserInfo().getNormalizedDisplayLogin();
        return normalizedDisplayLogin == null ? "" : normalizedDisplayLogin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(IdentifierCredentialManagerFragment identifierCredentialManagerFragment, Boolean bool) {
        if (!identifierCredentialManagerFragment.credentialManagerRequested) {
            tje.N(eja1.s(identifierCredentialManagerFragment), null, null, new IdentifierCredentialManagerFragment$onCreate$1$1(identifierCredentialManagerFragment, null), 3);
            return;
        }
        l lVar = identifierCredentialManagerFragment.commonViewModel.C;
        CredentialManagerRequestResult.Companion.getClass();
        lVar.m(new CredentialManagerRequestResult(null, null, null, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveToCredentialManager(Pair<CredentialManagerDomikResult, AuthTrack> resultAndTrack) {
        CredentialManagerDomikResult credentialManagerDomikResult = (CredentialManagerDomikResult) resultAndTrack.first;
        Object obj = resultAndTrack.second;
        if (obj != null) {
            this.currentTrack = (T) obj;
        }
        requireArguments().putParcelable(KEY_DOMIK_RESULT, credentialManagerDomikResult);
        this.domikResult = credentialManagerDomikResult;
        if (com.yandex.passport.internal.ui.c.t(credentialManagerDomikResult.getDomikResult().getModernAccount().getUid().getEnvironment())) {
            this.commonViewModel.E.m(this.domikResult);
        } else {
            tje.N(eja1.s(this), null, null, new IdentifierCredentialManagerFragment$saveToCredentialManager$1(this, new com.yandex.passport.internal.sloth.credentialmanager.a(getUsernameSuggest(credentialManagerDomikResult.getModernAccount()), credentialManagerDomikResult.getPassword(), false), null), 3);
        }
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment
    public d createViewModel(PassportProcessGlobalComponent component) {
        return getDomikComponent().newIdentifierCredentialManagerViewModel();
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment
    public DomikStatefulReporter$Screen getScreenId() {
        return DomikStatefulReporter$Screen.NONE;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment
    public boolean isFieldErrorSupported(String errorCode) {
        return false;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment, com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final int i = 0;
        if (savedInstanceState != null) {
            this.credentialManagerRequested = savedInstanceState.getBoolean(KEY_CREDENTIAL_MANAGER_REQUESTED, false);
        }
        this.domikResult = (CredentialManagerDomikResult) requireArguments().getParcelable(KEY_DOMIK_RESULT);
        com.yandex.passport.internal.sloth.credentialmanager.d credentialManagerInterface = com.yandex.passport.internal.di.a.a().getCredentialManagerInterface();
        this.credentialManager = credentialManagerInterface;
        if (credentialManagerInterface == null) {
            credentialManagerInterface = null;
        }
        credentialManagerInterface.d(requireActivity());
        this.commonViewModel.B.n(this, new j(this) { // from class: com.yandex.passport.internal.ui.domik.identifier.b
            public final /* synthetic */ IdentifierCredentialManagerFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i2 = i;
                IdentifierCredentialManagerFragment identifierCredentialManagerFragment = this.b;
                switch (i2) {
                    case 0:
                        IdentifierCredentialManagerFragment.onCreate$lambda$0(identifierCredentialManagerFragment, (Boolean) obj);
                        break;
                    default:
                        identifierCredentialManagerFragment.saveToCredentialManager((Pair) obj);
                        break;
                }
            }
        });
        final int i2 = 1;
        this.commonViewModel.D.n(this, new j(this) { // from class: com.yandex.passport.internal.ui.domik.identifier.b
            public final /* synthetic */ IdentifierCredentialManagerFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i22 = i2;
                IdentifierCredentialManagerFragment identifierCredentialManagerFragment = this.b;
                switch (i22) {
                    case 0:
                        IdentifierCredentialManagerFragment.onCreate$lambda$0(identifierCredentialManagerFragment, (Boolean) obj);
                        break;
                    default:
                        identifierCredentialManagerFragment.saveToCredentialManager((Pair) obj);
                        break;
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.commonViewModel.D.k(this);
        this.commonViewModel.B.k(this);
        super.onDestroy();
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean(KEY_CREDENTIAL_MANAGER_REQUESTED, this.credentialManagerRequested);
    }
}
