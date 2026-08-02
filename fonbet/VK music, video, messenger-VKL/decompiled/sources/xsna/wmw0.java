package xsna;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.vk.voip.ui.avatars.stack.VoipStackAvatarView;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: VoipConfirmAddUsersToCallModalDialog.kt */
/* loaded from: classes7.dex */
public final class wmw0 extends dw20 {
    public static final /* synthetic */ int i1 = 0;
    public m99 g1;
    public final p490 f1 = r99.a.a();
    public final io.reactivex.rxjava3.disposables.b h1 = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: VoipConfirmAddUsersToCallModalDialog.kt */
    public static final class a extends dw20.b {
        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new wmw0();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g1 = this.f1.v();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.g1 = null;
        this.f1.w();
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.voip_confirm_add_users_to_call_modal_dialog, (ViewGroup) null, false);
        hvt0.a(R.id.back_btn, inflate, new m2l0(this, 26));
        VoipStackAvatarView voipStackAvatarView = (VoipStackAvatarView) inflate.findViewById(R.id.add_users_avatars_stack);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.checkbox);
        View findViewById = inflate.findViewById(R.id.confirm_btn);
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new obc(this, 3));
        asu0 asu0Var = asu0.a;
        this.h1.b(io.reactivex.rxjava3.kotlin.c.e(vVar.q(asu0Var.c()).m(asu0Var.d()), new d7l0(21), new ykt0(voipStackAvatarView, 9)));
        jjc.g(findViewById, new wkt0(2, this, checkBox));
        dw20.Rn(this, inflate, 6);
        return super.yn(bundle);
    }
}
