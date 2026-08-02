package xsna;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetFragment;
import xsna.qpk;

/* compiled from: ModalBottomSheetController.kt */
/* loaded from: classes17.dex */
public interface gw20 {
    boolean a();

    izs<Configuration, s3q0> d();

    DialogInterface.OnCancelListener e();

    DialogInterface.OnShowListener f();

    DialogInterface.OnKeyListener g();

    CustomisableBottomSheetBehavior<FrameLayout> getBehavior();

    Integer i();

    boolean k();

    DialogInterface.OnDismissListener q();

    int s();

    qpk.a w();

    View x(CustomisableBottomSheetFragment customisableBottomSheetFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    default void onDestroy() {
    }

    default void onPause() {
    }

    default void onResume() {
    }
}
