package xsna;

import android.os.Bundle;
import com.vkontakte.android.R;
import xsna.v1j;

/* compiled from: RenameSessionRoomDialog.kt */
/* loaded from: classes7.dex */
public final class ayf0 extends ym0 {
    @Override // xsna.ym0
    public final int Zn() {
        return R.string.voip_session_room_admin_rename_room_title;
    }

    @Override // xsna.ym0
    public final v1j ao(String str) {
        return new v1j.n(this.h1, str);
    }

    @Override // xsna.ym0, xsna.lwi0, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.h1 == null) {
            tn();
        }
    }
}
