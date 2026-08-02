package xsna;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.VideoFile;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.voip.ui.broadcast.list.ui.PastBroadcastsFragment;
import xsna.b9a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class co90 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ co90(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                int i3 = PastBroadcastsFragment.U;
                g7s0.m(fxc0.B(), (FragmentActivity) obj2, (VideoFile) obj, o25.a().c(), null, null, 24);
                break;
            default:
                ((com.vk.photos.root.photoflow.presentation.j) obj2).e.invoke(new a.s.b(((b9a0.c.a) obj).a));
                break;
        }
    }
}
