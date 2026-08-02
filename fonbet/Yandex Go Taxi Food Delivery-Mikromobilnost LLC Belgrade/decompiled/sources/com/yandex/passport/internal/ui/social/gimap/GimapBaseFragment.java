package com.yandex.passport.internal.ui.social.gimap;

import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.passport.R;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.base.BaseBackStackActivity;
import com.yandex.passport.internal.ui.base.BaseNextFragment;
import com.yandex.passport.internal.ui.base.FragmentBackStack;
import com.yandex.passport.internal.ui.base.h;
import defpackage.ls31;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class GimapBaseFragment<V extends com.yandex.passport.internal.ui.base.h> extends BaseNextFragment<V> {
    private static final float ERROR_SNACKBAR_TEXT_PROPORTION = 1.2f;
    private final com.yandex.passport.internal.ui.base.k fragmentStackListener = new d(this);
    private Dialog progressDialog;
    private static final String REGEX_EMAIL = ".+@.+";
    private static final Pattern PATTERN_EMAIL = Pattern.compile(REGEX_EMAIL, 2);

    /* JADX INFO: Access modifiers changed from: private */
    public FragmentBackStack getFragmentBackStack() {
        return ((BaseBackStackActivity) requireActivity()).getFragmentBackStack();
    }

    public boolean emailIsValid(String str) {
        return !TextUtils.isEmpty(str) && PATTERN_EMAIL.matcher(str).find();
    }

    public abstract void fillFromTrack(GimapTrack gimapTrack);

    public final o getGimapViewModel() {
        return (o) new ls31(requireActivity()).b(o.class);
    }

    public GimapTrack getTrack() {
        GimapTrack gimapTrack;
        o gimapViewModel = getGimapViewModel();
        synchronized (gimapViewModel) {
            gimapTrack = gimapViewModel.E;
        }
        return gimapTrack;
    }

    public abstract GimapTrack modifyTrack(GimapTrack gimapTrack);

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.progressDialog = com.yandex.passport.internal.ui.k.a(requireContext());
        FragmentBackStack fragmentBackStack = getFragmentBackStack();
        fragmentBackStack.b.add(this.fragmentStackListener);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment
    public final void onErrorCode(EventError eventError) {
        GimapError gimapError;
        String errorCode = eventError.getErrorCode();
        GimapError[] values = GimapError.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                gimapError = null;
                break;
            }
            gimapError = values[i];
            if (gimapError.errorMessage.equals(errorCode)) {
                break;
            } else {
                i++;
            }
        }
        if (gimapError == null) {
            com.yandex.passport.internal.di.a.a().getEventReporter().k(eventError.getException());
            if (eventError.getErrorCode().equals("network error")) {
                showErrorSnackbar(getString(R.string.passport_error_network_fail));
            } else {
                showErrorSnackbar(getString(R.string.passport_error_unknown));
                return;
            }
        }
        switch (gimapError.ordinal()) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
                showErrorSnackbar(getString(gimapError.titleRes));
                break;
            case 12:
            default:
                processGimapError(gimapError);
                break;
        }
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment
    public final void onShowProgress(boolean z) {
        Dialog dialog = this.progressDialog;
        if (z) {
            dialog.show();
        } else {
            dialog.dismiss();
        }
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (getView() == null) {
            return;
        }
        if (bundle == null) {
            fillFromTrack(getTrack());
        }
        Bundle arguments = getArguments();
        arguments.getClass();
        restoreFromArgs(arguments);
    }

    public abstract void processGimapError(GimapError gimapError);

    public abstract void restoreFromArgs(Bundle bundle);

    public void showErrorSnackbar(String str) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
        valueOf.setSpan(new RelativeSizeSpan(1.2f), 0, valueOf.length(), 0);
        com.google.android.material.snackbar.c.f(requireActivity().findViewById(R.id.container), valueOf).g();
    }

    public final GimapTrack updateCurrentTrack() {
        GimapTrack modifyTrack;
        o gimapViewModel = getGimapViewModel();
        synchronized (gimapViewModel) {
            modifyTrack = modifyTrack(gimapViewModel.E);
            gimapViewModel.E = modifyTrack;
        }
        return modifyTrack;
    }
}
