package xsna;

import android.graphics.Rect;
import android.view.View;
import com.vk.core.view.components.cell.left.VkCellLeft;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.music.stickyplayer.domain.PlayerContext;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class fva0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ izs d;

    public /* synthetic */ fva0(int i, View view, izs izsVar) {
        this.b = i;
        this.c = view;
        this.d = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        izs izsVar = this.d;
        View view = this.c;
        switch (i) {
            case 0:
                cl40.a(view, MusicHapticEvent.RIGID);
                izsVar.invoke(new sx40.o0(PlayerContext.FULL));
                break;
            default:
                int i2 = VkCellLeft.r;
                if (!view.isAttachedToWindow()) {
                    break;
                } else {
                    Rect rect = new Rect();
                    view.getGlobalVisibleRect(rect);
                    izsVar.invoke(rect);
                    break;
                }
        }
        return s3q0.a;
    }
}
