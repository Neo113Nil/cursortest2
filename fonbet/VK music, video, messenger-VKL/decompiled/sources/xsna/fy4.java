package xsna;

import android.widget.ImageView;
import com.vk.im.ui.views.RichEditText;
import com.vk.writebar.WriteBar;
import java.util.Iterator;

/* compiled from: AudioStateListener.java */
/* loaded from: classes3.dex */
public final class fy4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fy4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ImageView buttonFullscreen;
        RichEditText writeBarEdit;
        switch (this.b) {
            case 0:
                Iterator it = ((dy4) this.c).i.iterator();
                while (it.hasNext()) {
                    ((com.vk.music.player.e) it.next()).K1();
                }
                break;
            case 1:
                ktu.a((lq9) this.c);
                break;
            default:
                WriteBar writeBar = (WriteBar) this.c;
                if (writeBar.U.l) {
                    writeBarEdit = writeBar.getWriteBarEdit();
                    if (writeBarEdit.getLineCount() >= 3 && !writeBar.e0.n) {
                        z = true;
                        buttonFullscreen = writeBar.getButtonFullscreen();
                        awt0.v(buttonFullscreen, z);
                        break;
                    }
                }
                z = false;
                buttonFullscreen = writeBar.getButtonFullscreen();
                awt0.v(buttonFullscreen, z);
                break;
        }
    }
}
