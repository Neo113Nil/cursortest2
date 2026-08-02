package com.yandex.payment.sdk.flex.impl.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.presentation.bottomsheet.CustomBottomSheetStorageKt;
import defpackage.je4;
import defpackage.myl;
import defpackage.xif;
import defpackage.yta1;
import defpackage.yvf0;
import defpackage.z0i0;
import flex.engine.a;
import flex.feature.document.fragment.DocumentBottomSheetFragment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u0003¨\u0006\u000f"}, d2 = {"Lcom/yandex/payment/sdk/flex/impl/fragment/CustomBottomSheetFragment;", "Lflex/feature/document/fragment/DocumentBottomSheetFragment;", "<init>", "()V", "Lflex/engine/a;", "createDocumentEngine", "()Lflex/engine/a;", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Companion", "xif", "flex-impl-18-1-0_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomBottomSheetFragment extends DocumentBottomSheetFragment {
    public static final xif Companion = new xif();

    @Override // flex.feature.document.fragment.DocumentBottomSheetFragment
    public a createDocumentEngine() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(CustomBottomSheetStorageKt.ENGINE_LABEL_KEY) : null;
        yvf0 yvf0Var = string != null ? (yvf0) myl.a.get(string) : null;
        if (yvf0Var != null) {
            return (a) yvf0Var.get();
        }
        return null;
    }

    @Override // flex.feature.document.fragment.DocumentBottomSheetFragment, defpackage.ucs
    public /* bridge */ /* synthetic */ void onBackStackChangeCancelled() {
    }

    @Override // flex.feature.document.fragment.DocumentBottomSheetFragment, defpackage.ucs
    public /* bridge */ /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
    }

    @Override // flex.feature.document.fragment.DocumentBottomSheetFragment, defpackage.ucs
    public /* bridge */ /* synthetic */ void onBackStackChangeProgressed(je4 je4Var) {
    }

    @Override // flex.feature.document.fragment.DocumentBottomSheetFragment, defpackage.ucs
    public /* bridge */ /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
    }

    @Override // flex.feature.document.fragment.DocumentBottomSheetFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isDimBackground()) {
            setStyle(1, z0i0.DocumentBottomSheetPaymentSdk_Dimmed);
        } else {
            setStyle(1, z0i0.DocumentBottomSheetPaymentSdk_Transparent);
        }
    }

    @Override // flex.feature.document.fragment.DocumentBottomSheetFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (yta1.b(this)) {
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString(CustomBottomSheetStorageKt.ENGINE_LABEL_KEY) : null;
            if (string != null) {
                myl.a.remove(string);
            }
        }
    }
}
