package xsna;

import com.vk.vmoji.storage.impl.database.VmojiStorageDatabase_Impl;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import xsna.rhw0;
import xsna.shw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class hbw0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hbw0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new w8w0((VmojiStorageDatabase_Impl) obj);
            default:
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) obj;
                int i2 = VoipCallServiceFragment.Y;
                rhw0.z zVar = new rhw0.z(shw0.b.a);
                voipCallServiceFragment.getClass();
                xn50.a.c(voipCallServiceFragment, zVar);
                return s3q0.a;
        }
    }
}
