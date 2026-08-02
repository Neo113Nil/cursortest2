package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import java.util.List;
import xsna.by1;
import xsna.ihz;
import xsna.lbf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class sff implements pcs, ihz.a, yads.ff0 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sff(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // yads.ff0
    public List a(int i, yads.l83 l83Var, int[] iArr) {
        return yads.if0.a((yads.af0) this.b, (int[]) this.c, i, l83Var, iArr);
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).S((by1.a) this.b, (pr10) this.c);
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        ClipsUploadFragmentImpl clipsUploadFragmentImpl = (ClipsUploadFragmentImpl) this.b;
        hjf hjfVar = (hjf) this.c;
        String str2 = ClipsUploadFragmentImpl.a0;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("playlist_selected", ClipsPlaylist.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("playlist_selected");
            if (!(parcelable3 instanceof ClipsPlaylist)) {
                parcelable3 = null;
            }
            parcelable = (ClipsPlaylist) parcelable3;
        }
        ClipsPlaylist clipsPlaylist = (ClipsPlaylist) parcelable;
        if (clipsPlaylist != null) {
            hjfVar.b(new lbf.c.o.C3256c(new ClipsDraftablePlaylist(clipsPlaylist.b, clipsPlaylist.c, clipsPlaylist.d, clipsPlaylist.f)));
        }
        clipsUploadFragmentImpl.getChildFragmentManager().f("playlist_request");
    }
}
