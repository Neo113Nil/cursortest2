package com.ybsdk.widgets.common.bottomsheet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import defpackage.tls;

/* loaded from: classes4.dex */
public final class a {
    public static BottomSheetDialogView a(a aVar, FragmentActivity fragmentActivity, Context context, BottomSheetDialogView.State state, final View.OnClickListener onClickListener, final View.OnClickListener onClickListener2, tls tlsVar, int i) {
        if ((i & 32) != 0) {
            onClickListener2 = null;
        }
        if ((i & 64) != 0) {
            tlsVar = null;
        }
        aVar.getClass();
        final BottomSheetDialogView bottomSheetDialogView = new BottomSheetDialogView(context, null, 0, 6, null);
        bottomSheetDialogView.render(state);
        bottomSheetDialogView.show(fragmentActivity, (ViewGroup) null);
        final int i2 = 0;
        bottomSheetDialogView.onPrimaryAction(new View.OnClickListener() { // from class: jf6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                View.OnClickListener onClickListener3 = onClickListener;
                BottomSheetDialogView bottomSheetDialogView2 = bottomSheetDialogView;
                switch (i3) {
                    case 0:
                        bottomSheetDialogView2.dismiss();
                        if (onClickListener3 != null) {
                            onClickListener3.onClick(view);
                            break;
                        }
                        break;
                    default:
                        bottomSheetDialogView2.dismiss();
                        if (onClickListener3 != null) {
                            onClickListener3.onClick(view);
                            break;
                        }
                        break;
                }
            }
        });
        final int i3 = 1;
        bottomSheetDialogView.onSecondaryAction(new View.OnClickListener() { // from class: jf6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                View.OnClickListener onClickListener3 = onClickListener2;
                BottomSheetDialogView bottomSheetDialogView2 = bottomSheetDialogView;
                switch (i32) {
                    case 0:
                        bottomSheetDialogView2.dismiss();
                        if (onClickListener3 != null) {
                            onClickListener3.onClick(view);
                            break;
                        }
                        break;
                    default:
                        bottomSheetDialogView2.dismiss();
                        if (onClickListener3 != null) {
                            onClickListener3.onClick(view);
                            break;
                        }
                        break;
                }
            }
        });
        if (tlsVar != null) {
            bottomSheetDialogView.onDismiss(tlsVar);
        }
        return bottomSheetDialogView;
    }
}
