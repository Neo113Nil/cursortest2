package xsna;

import android.view.View;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.music.stickyplayer.domain.PlayerContext;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class cva0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ izs d;

    public /* synthetic */ cva0(int i, View view, izs izsVar) {
        this.b = i;
        this.c = view;
        this.d = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                cl40.a(this.c, MusicHapticEvent.LIGHT);
                this.d.invoke(new sx40.g0(PlayerContext.FULL));
                break;
            default:
                cl40.a(this.c, MusicHapticEvent.LIGHT);
                this.d.invoke(sx40.z.b);
                break;
        }
        return s3q0.a;
    }
}
