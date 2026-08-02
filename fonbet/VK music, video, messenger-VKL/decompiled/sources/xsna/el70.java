package xsna;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.voip.ui.sessionrooms.dialog.NotifyRoomsClosedDialog$Builder$DialogType;
import com.vkontakte.android.R;

/* compiled from: NotifyRoomsClosedDialog.kt */
/* loaded from: classes7.dex */
public final class el70 extends lwi0 {
    public static final /* synthetic */ int g1 = 0;
    public io.reactivex.rxjava3.disposables.c f1;

    /* compiled from: NotifyRoomsClosedDialog.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotifyRoomsClosedDialog$Builder$DialogType.values().length];
            try {
                iArr[NotifyRoomsClosedDialog$Builder$DialogType.RECORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotifyRoomsClosedDialog$Builder$DialogType.TRANSLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.lwi0
    public final View Yn() {
        Object obj;
        Object serializable;
        NotifyRoomsClosedDialog$Builder$DialogType notifyRoomsClosedDialog$Builder$DialogType = null;
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.voip_inform_rooms_closed_dialog, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.session_room_inform_dialog_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.session_room_inform_dialog_description);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments.getSerializable("dialogType", NotifyRoomsClosedDialog$Builder$DialogType.class);
                obj = serializable;
            } else {
                Object serializable2 = arguments.getSerializable("dialogType");
                obj = (NotifyRoomsClosedDialog$Builder$DialogType) (serializable2 instanceof NotifyRoomsClosedDialog$Builder$DialogType ? serializable2 : null);
            }
            notifyRoomsClosedDialog$Builder$DialogType = (NotifyRoomsClosedDialog$Builder$DialogType) obj;
        }
        int i = notifyRoomsClosedDialog$Builder$DialogType == null ? -1 : a.$EnumSwitchMapping$0[notifyRoomsClosedDialog$Builder$DialogType.ordinal()];
        if (i == 1) {
            textView.setText(R.string.voip_session_room_rooms_closed_dialog_record_title);
            textView2.setText(R.string.voip_session_room_rooms_closed);
            bwt0.p0(textView2, true);
        } else if (i == 2) {
            textView.setText(R.string.voip_session_room_rooms_closed_dialog_translation_title);
            textView2.setText(R.string.voip_session_room_rooms_closed);
            bwt0.p0(textView2, true);
        }
        bwt0.i0(inflate.findViewById(R.id.close_inform_dialog_button), new o440(this, 6));
        return inflate;
    }

    @Override // xsna.lwi0, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            return;
        }
        com.vk.voip.ui.c.b.getClass();
        io.reactivex.rxjava3.core.q m = io.reactivex.rxjava3.core.q.m(com.vk.voip.ui.c.B0.b().U(new rj4(new y510(8), 24)), com.vk.voip.ui.c.H0(true), new sj4(new wni(7), 24));
        t34 t34Var = new t34(new dl70(0), 24);
        m.getClass();
        this.f1 = new io.reactivex.rxjava3.internal.operators.observable.i0(m, t34Var).a0(asu0.a.d()).subscribe(new j41(new ayo(this, 28), 29));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar = this.f1;
        if (cVar != null) {
            cVar.dispose();
        }
        super.onDestroy();
    }
}
