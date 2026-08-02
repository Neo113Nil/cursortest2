package com.yandex.passport.internal.ui.domik.call;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.passport.R;
import com.yandex.passport.data.models.PhoneConfirmationResult;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Event;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Screen;
import com.yandex.passport.internal.analytics.a0;
import com.yandex.passport.internal.analytics.b0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.ui.base.g;
import com.yandex.passport.internal.ui.bouncer.error.n;
import com.yandex.passport.internal.ui.domik.RegTrack;
import com.yandex.passport.internal.ui.domik.base.BaseDomikFragment;
import com.yandex.passport.internal.ui.util.OnActionDoneListener;
import com.yandex.passport.legacy.lx.m;
import defpackage.ds31;
import defpackage.k5c;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 52\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0005J\u001f\u0010$\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/call/CallConfirmFragment;", "Lcom/yandex/passport/internal/ui/domik/base/BaseDomikFragment;", "Lcom/yandex/passport/internal/ui/domik/call/e;", "Lcom/yandex/passport/internal/ui/domik/RegTrack;", "<init>", "()V", "Lzy11;", "validate", "Lcom/yandex/passport/internal/analytics/DomikStatefulReporter$Screen;", "getScreenId", "()Lcom/yandex/passport/internal/analytics/DomikStatefulReporter$Screen;", "", ErrorResponseData.JSON_ERROR_CODE, "", "isFieldErrorSupported", "(Ljava/lang/String;)Z", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "component", "createViewModel", "(Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;)Lcom/yandex/passport/internal/ui/domik/call/e;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/yandex/passport/internal/ui/domik/call/f;", "menuUseSmsWrapper", "Lcom/yandex/passport/internal/ui/domik/call/f;", "menuUseSms", "Landroid/view/MenuItem;", "Lcom/yandex/passport/internal/ui/domik/call/d;", "viewHolderInstance", "Lcom/yandex/passport/internal/ui/domik/call/d;", "getViewHolder", "()Lcom/yandex/passport/internal/ui/domik/call/d;", "viewHolder", "Companion", "com/yandex/passport/internal/ui/domik/call/c", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CallConfirmFragment extends BaseDomikFragment<e, RegTrack> {
    public static final int $stable = 8;
    public static final c Companion = new c();
    private static final String FRAGMENT_TAG = "com.yandex.passport.internal.ui.domik.call.CallConfirmFragment";
    private static final String KEY_FIRST_CREATION_TIME = "first_creation_time";
    private static final String KEY_PHONE_CONFIRMATION_RESULT = "phone_confirmation_result";
    private MenuItem menuUseSms;
    private f menuUseSmsWrapper;
    private d viewHolderInstance;

    /* renamed from: getViewHolder, reason: from getter */
    private final d getViewHolderInstance() {
        return this.viewHolderInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(CallConfirmFragment callConfirmFragment, String str, boolean z) {
        if (z) {
            callConfirmFragment.validate();
        }
        callConfirmFragment.hideFieldError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$2(CallConfirmFragment callConfirmFragment, Boolean bool) {
        int i;
        Button button = callConfirmFragment.buttonNext;
        if (com.yandex.passport.legacy.d.g(button) && bool.booleanValue()) {
            View view = callConfirmFragment.getViewHolderInstance().c;
            if (view != null) {
                com.yandex.passport.internal.ui.sloth.e.n((int) view.getResources().getDimension(R.dimen.passport_domik_bottom_scrollable_padding_without_button), view);
            }
            i = 8;
        } else {
            View view2 = callConfirmFragment.getViewHolderInstance().c;
            if (view2 != null) {
                com.yandex.passport.internal.ui.sloth.e.n((int) view2.getResources().getDimension(R.dimen.passport_domik_bottom_scrollable_padding_full), view2);
            }
            i = 0;
        }
        button.setVisibility(i);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3(CallConfirmFragment callConfirmFragment) {
        callConfirmFragment.validate();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$4(CallConfirmFragment callConfirmFragment, String str, boolean z) {
        MenuItem menuItem = callConfirmFragment.menuUseSms;
        if (menuItem != null) {
            menuItem.setTitle(str);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$5(CallConfirmFragment callConfirmFragment) {
        b0 b0Var = callConfirmFragment.statefulReporter;
        b0Var.c(b0Var.x, DomikStatefulReporter$Event.USE_SMS_CLICK);
        e eVar = (e) callConfirmFragment.viewModel;
        RegTrack regTrack = (RegTrack) callConfirmFragment.currentTrack;
        eVar.getClass();
        k5c a = ds31.a(eVar);
        sjh sjhVar = uyj.a;
        tje.N(a, mdh.b, null, new CallConfirmViewModel$useSmsForConfirm$1(eVar, regTrack, null), 2);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validate() {
        this.statefulReporter.f();
        e eVar = (e) this.viewModel;
        RegTrack regTrack = (RegTrack) this.currentTrack;
        String code = getViewHolderInstance().a.getCode();
        com.yandex.passport.internal.interaction.b bVar = eVar.F;
        bVar.c.m(Boolean.TRUE);
        bVar.a.a.add(m.d(new com.yandex.passport.internal.interaction.f(bVar, regTrack, code, false)));
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment
    public e createViewModel(PassportProcessGlobalComponent component) {
        this.flagRepository = component.getFlagRepository();
        return getDomikComponent().newCallConfirmViewModel();
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment
    public DomikStatefulReporter$Screen getScreenId() {
        return DomikStatefulReporter$Screen.CALL_CONFIRM_ENTRY;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment
    public boolean isFieldErrorSupported(String errorCode) {
        return "confirmations_limit.exceeded".equals(errorCode) || "code.invalid".equals(errorCode) || "rate.limit_exceeded".equals(errorCode) || "code.empty".equals(errorCode);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.passport_call_confirm, menu);
        this.menuUseSms = menu.findItem(R.id.action_use_sms);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(getDomikComponent().getDomikDesignProvider().c, container, false);
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getViewHolderInstance().a.setOnEditorActionListener(null);
        this.viewHolderInstance = null;
        this.menuUseSms = null;
        f fVar = this.menuUseSmsWrapper;
        f fVar2 = fVar != null ? fVar : null;
        fVar2.e.removeCallbacks(fVar2.f);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != R.id.action_use_sms) {
            return super.onOptionsItemSelected(item);
        }
        f fVar = this.menuUseSmsWrapper;
        if (fVar == null) {
            fVar = null;
        }
        fVar.getClass();
        if (Math.max(0, (int) (((fVar.c + 30000) - SystemClock.elapsedRealtime()) / 1000)) > 0) {
            return true;
        }
        fVar.d.invoke();
        return true;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment, com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.viewHolderInstance = new d(view);
        this.buttonNext.setOnClickListener(new com.yandex.passport.internal.autologin.ui.b(3, this));
        int i = 0;
        getViewHolderInstance().a.addOnCodeChangedListener(new a(this, i));
        Parcelable parcelable = requireArguments().getParcelable(KEY_PHONE_CONFIRMATION_RESULT);
        if (parcelable == null) {
            ny61.r("Required value was null.");
            return;
        }
        PhoneConfirmationResult.CodePhoneConfirmationResult codePhoneConfirmationResult = (PhoneConfirmationResult.CodePhoneConfirmationResult) parcelable;
        String callingNumberTemplate = codePhoneConfirmationResult.getCallingNumberTemplate();
        if (callingNumberTemplate == null) {
            callingNumberTemplate = getString(R.string.passport_default_call_phone_template);
        }
        String quantityString = getResources().getQuantityString(R.plurals.passport_reg_call_message, codePhoneConfirmationResult.getCodeLength(), callingNumberTemplate, Integer.valueOf(codePhoneConfirmationResult.getCodeLength()));
        getViewHolderInstance().b.setText(quantityString);
        view.announceForAccessibility(quantityString);
        getViewHolderInstance().a.setCodeLength(codePhoneConfirmationResult.getCodeLength());
        int i2 = 1;
        this.commonViewModel.I.f(getViewLifecycleOwner(), new g(i2, new a0(17, this)));
        getViewHolderInstance().a.setOnEditorActionListener(new OnActionDoneListener(new b(this, i)));
        long j = requireArguments().getLong(KEY_FIRST_CREATION_TIME, SystemClock.elapsedRealtime());
        requireArguments().putLong(KEY_FIRST_CREATION_TIME, j);
        this.menuUseSmsWrapper = new f(requireContext(), new n(2, this), j, new b(this, i2));
        postShowSoftKeyboard(getViewHolderInstance().a, this.textMessage);
    }
}
