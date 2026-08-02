package com.yandex.passport.internal.ui.authbytrack.acceptdialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.yandex.passport.R;
import com.yandex.passport.internal.ui.base.BaseBottomSheetDialogFragment;
import defpackage.ls31;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/yandex/passport/internal/ui/authbytrack/acceptdialog/AcceptAuthFragmentDialog;", "Lcom/yandex/passport/internal/ui/base/BaseBottomSheetDialogFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "Companion", "com/yandex/passport/internal/ui/authbytrack/acceptdialog/b", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AcceptAuthFragmentDialog extends BaseBottomSheetDialogFragment {
    public static final int $stable = 0;
    public static final b Companion = new b();
    private static final String FRAGMENT_TAG = "com.yandex.passport.internal.ui.authbytrack.acceptdialog.AcceptAuthFragmentDialog";
    private static final String KEY_DISPLAY_NAME = "display_name";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(AcceptAuthFragmentDialog acceptAuthFragmentDialog, View view) {
        ((c) new ls31(acceptAuthFragmentDialog.requireActivity()).b(c.class)).A.m(Boolean.TRUE);
        acceptAuthFragmentDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(AcceptAuthFragmentDialog acceptAuthFragmentDialog, View view) {
        ((c) new ls31(acceptAuthFragmentDialog.requireActivity()).b(c.class)).B.m(Boolean.TRUE);
        acceptAuthFragmentDialog.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        ((c) new ls31(requireActivity()).b(c.class)).B.m(Boolean.TRUE);
        super.onCancel(dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.passport_dialog_accept_auth, container, false);
    }

    @Override // com.yandex.passport.internal.ui.base.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String string = getArguments().getString(KEY_DISPLAY_NAME);
        Button button = (Button) view.findViewById(R.id.button_accept);
        Button button2 = (Button) view.findViewById(R.id.button_cancel);
        TextView textView = (TextView) view.findViewById(R.id.qr_primary_text);
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.authbytrack.acceptdialog.a
            public final /* synthetic */ AcceptAuthFragmentDialog b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                AcceptAuthFragmentDialog acceptAuthFragmentDialog = this.b;
                switch (i2) {
                    case 0:
                        AcceptAuthFragmentDialog.onViewCreated$lambda$0(acceptAuthFragmentDialog, view2);
                        break;
                    default:
                        AcceptAuthFragmentDialog.onViewCreated$lambda$1(acceptAuthFragmentDialog, view2);
                        break;
                }
            }
        });
        final int i2 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.authbytrack.acceptdialog.a
            public final /* synthetic */ AcceptAuthFragmentDialog b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                AcceptAuthFragmentDialog acceptAuthFragmentDialog = this.b;
                switch (i22) {
                    case 0:
                        AcceptAuthFragmentDialog.onViewCreated$lambda$0(acceptAuthFragmentDialog, view2);
                        break;
                    default:
                        AcceptAuthFragmentDialog.onViewCreated$lambda$1(acceptAuthFragmentDialog, view2);
                        break;
                }
            }
        });
        textView.setText(getString(R.string.passport_enter_into_account, string));
    }
}
