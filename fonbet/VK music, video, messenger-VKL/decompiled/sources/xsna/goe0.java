package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import xsna.ane0;
import xsna.arf0;
import xsna.iv20;

/* compiled from: QrTvPresenter.kt */
/* loaded from: classes15.dex */
public final class goe0<V extends ane0 & arf0> extends cne0<V> {
    public final foe0 i;

    public goe0(Context context, foe0 foe0Var) {
        super(context, foe0Var);
        this.i = foe0Var;
    }

    @Override // xsna.wv20, xsna.hv20
    public final void L2() {
        new pqf0(this.i.u5(), new SchemeStatSak$TypeRegistrationItem(SchemeStatSak$TypeRegistrationItem.EventType.ENTRY_BY_DEVICE_CODE_CLOSER_TAP, null, null, null, null, null, null, d(), null, null, null, null, null, null, null, null, 65406, null)).q();
        super.L2();
    }

    @Override // xsna.wv20
    public final int a(boolean z) {
        return R.drawable.vk_icon_logo_vk_video_outline_28;
    }

    @Override // xsna.wv20
    public final void b(vgg vggVar) {
        foe0 foe0Var = this.i;
        new pqf0(foe0Var.u5(), new SchemeStatSak$TypeRegistrationItem(SchemeStatSak$TypeRegistrationItem.EventType.ALERT_DEVICE_CODE_CONNECTION_ERROR, null, null, null, null, null, null, d(), null, null, null, null, null, null, null, null, 65406, null)).q();
        LayoutInflater.Factory kn = foe0Var.kn();
        xv20 xv20Var = kn instanceof xv20 ? (xv20) kn : null;
        if (xv20Var != null) {
            xv20Var.A();
        }
        foe0Var.G8();
    }

    @Override // xsna.cne0, xsna.wv20
    public final void c() {
        foe0 foe0Var = this.i;
        new pqf0(foe0Var.u5(), new SchemeStatSak$TypeRegistrationItem(SchemeStatSak$TypeRegistrationItem.EventType.ENTRY_BY_DEVICE_CODE_CONFIRM_TAP, null, null, null, null, null, null, d(), null, null, null, null, null, null, null, null, 65406, null)).q();
        foe0Var.r4();
    }

    public final List<SchemeStatSak$RegistrationFieldItem> d() {
        SchemeStatSak$RegistrationFieldItem.Name name = SchemeStatSak$RegistrationFieldItem.Name.ENTRY_POINT;
        iv20.b bVar = this.d;
        if (bVar == null) {
            bVar = null;
        }
        return Collections.singletonList(new SchemeStatSak$RegistrationFieldItem(name, "", "", bVar.j ? "vkvideo_tv_qr_auth" : "vkvideo_tv_app_entry"));
    }
}
