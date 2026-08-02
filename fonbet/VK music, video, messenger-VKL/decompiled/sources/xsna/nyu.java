package xsna;

import android.content.Context;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.core.view.mediapicker.VkMediaPicker;
import java.util.List;

/* compiled from: HeaderWithAlbumsView.kt */
/* loaded from: classes17.dex */
public final class nyu extends VkTopBar implements com.vk.core.view.mediapicker.a {
    public boolean J;
    public a K;

    /* compiled from: HeaderWithAlbumsView.kt */
    public interface a {
        void a();

        void b(int i);
    }

    public nyu(Context context) {
        super(context, null, 0);
        this.J = true;
    }

    public final a getCallback() {
        return this.K;
    }

    @Override // com.vk.core.view.mediapicker.a
    public void setAlbums(VkMediaPicker.a aVar) {
        awt0.v(this, aVar != null);
        if (aVar == null) {
            return;
        }
        List<String> list = aVar.a;
        String str = (String) j5g.b0(aVar.b, list);
        if (str == null) {
            str = (String) j5g.Y(list);
        }
        setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(oq.d(tlo0.Companion, str), new wx0(9, this, aVar), new VkTopBar.Middle.Text.Title.a.C0870a(null), null, null, 24), null, null, null, 14));
        if (this.J) {
            setBefore(new VkTopBar.c.d(null, new m1i(this, 18), null, null, 13));
        }
    }

    public final void setCallback(a aVar) {
        this.K = aVar;
    }

    public final void setShowCloseButton(boolean z) {
        this.J = z;
    }

    @Override // com.vk.core.view.mediapicker.a
    public nyu getView() {
        return this;
    }
}
