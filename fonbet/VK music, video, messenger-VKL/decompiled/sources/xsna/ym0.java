package xsna;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.vk.common.view.EditText;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: AddOrRenameSessionRoomDialog.kt */
/* loaded from: classes7.dex */
public abstract class ym0 extends lwi0 {
    public static final /* synthetic */ int k1 = 0;
    public a2j g1;
    public SessionRoomId.Room h1;
    public final io.reactivex.rxjava3.subjects.d<String> f1 = io.reactivex.rxjava3.subjects.d.O0("");
    public final Pattern i1 = Pattern.compile("^[\\w0-9_ \\-,:]*$");
    public final io.reactivex.rxjava3.disposables.b j1 = new io.reactivex.rxjava3.disposables.b();

    @Override // xsna.lwi0
    public final View Yn() {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.voip_session_rooms_admin_add_room_dialog, (ViewGroup) null, false);
        ((TextView) inflate.findViewById(R.id.session_room_create_dialog_title)).setText(Zn());
        EditText editText = (EditText) inflate.findViewById(R.id.session_room_name_input);
        View findViewById = inflate.findViewById(R.id.confirm_create_button);
        bwt0.i0(findViewById, new zx(this, 1));
        SessionRoomId.Room room = this.h1;
        io.reactivex.rxjava3.disposables.b bVar = this.j1;
        if (room != null) {
            com.vk.voip.ui.c.b.getClass();
            bVar.b(io.reactivex.rxjava3.kotlin.c.e(com.vk.voip.ui.c.B0.l().K(), new qm0(0), new vm0(this, editText)));
        }
        editText.addTextChangedListener(new wm0(this));
        TextView textView = (TextView) inflate.findViewById(R.id.session_room_name_error);
        io.reactivex.rxjava3.subjects.d<String> dVar = this.f1;
        dVar.getClass();
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.mixed.o(new io.reactivex.rxjava3.internal.operators.observable.y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).w0(200L, TimeUnit.MILLISECONDS).a0(asu0.a.d()), new q7(new rm0(0, this, textView), 2)), null, new sm0(0), new za(findViewById, 1)));
        bwt0.j(editText, new tm0(editText, 0));
        return inflate;
    }

    public abstract int Zn();

    public abstract v1j ao(String str);

    @Override // xsna.lwi0, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Integer d;
        super.onCreate(bundle);
        if (this.g1 == null) {
            tn();
        }
        Bundle arguments = getArguments();
        this.h1 = (arguments == null || (d = bo8.d(arguments, SignalingProtocol.KEY_ROOM_ID)) == null) ? null : new SessionRoomId.Room(d.intValue());
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.j1.dispose();
    }

    @Override // xsna.lwi0, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        Window window = yn.getWindow();
        if (window != null) {
            mhy.g(window);
        }
        return yn;
    }
}
