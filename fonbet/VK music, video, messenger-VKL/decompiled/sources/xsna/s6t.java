package xsna;

import android.view.View;
import com.vk.games.presentation.utils.HapticHelper;
import com.vk.music.haptic.MusicHapticEvent;
import xsna.o9t;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class s6t implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ izs d;

    public /* synthetic */ s6t(int i, View view, izs izsVar) {
        this.b = i;
        this.c = view;
        this.d = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                fdi.D(this.c, HapticHelper.RIGID);
                this.d.invoke(o9t.q.e.b);
                break;
            default:
                cl40.a(this.c, MusicHapticEvent.LIGHT);
                this.d.invoke(sx40.r.b);
                break;
        }
        return s3q0.a;
    }
}
