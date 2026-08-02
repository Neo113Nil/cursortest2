package com.yandex.passport.internal.ui.base;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.t;
import com.yandex.passport.internal.u;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.base.h;
import defpackage.pey;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class BaseNextFragment<V extends h> extends Fragment {
    private static final long SHOW_KEYBOARD_DELAY = 250;
    protected PassportProcessGlobalComponent component;
    private final List<WeakReference<Dialog>> dialogs = new ArrayList();
    protected V viewModel;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ h lambda$onCreate$0() throws Exception {
        return createViewModel(this.component);
    }

    public abstract V createViewModel(PassportProcessGlobalComponent passportProcessGlobalComponent);

    public boolean onBackPressed() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.component == null) {
            this.component = com.yandex.passport.internal.di.a.a();
        }
        this.viewModel = (V) u.b(this, new t(4, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Iterator<WeakReference<Dialog>> it = this.dialogs.iterator();
        while (it.hasNext()) {
            Dialog dialog = it.next().get();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
        this.dialogs.clear();
    }

    public abstract void onErrorCode(EventError eventError);

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.viewModel.Y(bundle);
    }

    public abstract void onShowProgress(boolean z);

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str = Build.MANUFACTURER;
        super.onViewCreated(view, bundle);
        final int i = 0;
        this.viewModel.b.n(getViewLifecycleOwner(), new com.yandex.passport.internal.ui.util.j(this) { // from class: com.yandex.passport.internal.ui.base.b
            public final /* synthetic */ BaseNextFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i2 = i;
                BaseNextFragment baseNextFragment = this.b;
                switch (i2) {
                    case 0:
                        baseNextFragment.onErrorCode((EventError) obj);
                        break;
                    default:
                        baseNextFragment.onShowProgress(((Boolean) obj).booleanValue());
                        break;
                }
            }
        });
        com.yandex.passport.internal.ui.util.i iVar = this.viewModel.c;
        pey viewLifecycleOwner = getViewLifecycleOwner();
        final int i2 = 1;
        com.yandex.passport.internal.ui.util.j jVar = new com.yandex.passport.internal.ui.util.j(this) { // from class: com.yandex.passport.internal.ui.base.b
            public final /* synthetic */ BaseNextFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i22 = i2;
                BaseNextFragment baseNextFragment = this.b;
                switch (i22) {
                    case 0:
                        baseNextFragment.onErrorCode((EventError) obj);
                        break;
                    default:
                        baseNextFragment.onShowProgress(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        iVar.getClass();
        iVar.f(viewLifecycleOwner, new com.yandex.passport.internal.ui.autologin.b(3, jVar));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        this.viewModel.X(bundle);
    }

    public void postHideSoftKeyboard(final View view) {
        com.yandex.passport.legacy.d.f(view);
        final int i = 0;
        view.post(new Runnable() { // from class: com.yandex.passport.internal.ui.base.c
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                View view2 = view;
                switch (i2) {
                    case 0:
                        com.yandex.passport.legacy.d.f(view2);
                        break;
                    default:
                        com.yandex.passport.legacy.d.f(view2);
                        break;
                }
            }
        });
        final int i2 = 1;
        view.postDelayed(new Runnable() { // from class: com.yandex.passport.internal.ui.base.c
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                View view2 = view;
                switch (i22) {
                    case 0:
                        com.yandex.passport.legacy.d.f(view2);
                        break;
                    default:
                        com.yandex.passport.legacy.d.f(view2);
                        break;
                }
            }
        }, 250L);
    }

    public void postShowSoftKeyboard(View view) {
        postShowSoftKeyboard(view, null);
    }

    public Dialog registerDialog(Dialog dialog) {
        this.dialogs.add(new WeakReference<>(dialog));
        return dialog;
    }

    public boolean shouldHideBackButton() {
        return false;
    }

    public boolean shouldHideConnectionStatus() {
        return false;
    }

    public void postShowSoftKeyboard(View view, TextView textView) {
        com.yandex.passport.legacy.d.m(view, textView);
    }
}
