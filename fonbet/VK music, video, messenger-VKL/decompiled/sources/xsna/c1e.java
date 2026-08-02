package xsna;

import android.net.Uri;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipGridParams;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class c1e implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c1e(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        UserId c;
        String url;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                a1e a1eVar = ((com.vk.clips.editor.voiceover.impl.a) obj).l;
                return Boolean.valueOf(vhk0.b((a1eVar != null ? a1eVar : null).c));
            case 1:
                jwe e = g620.f().e();
                ClipGridParams.OnlyId zb = ((com.vk.clips.viewer.impl.grid.b) obj).d.zb();
                ClipGridParams.OnlyId.Profile profile = zb instanceof ClipGridParams.OnlyId.Profile ? (ClipGridParams.OnlyId.Profile) zb : null;
                if (profile == null || (c = profile.b) == null) {
                    c = o25.a().c();
                }
                e.x(c);
                return s3q0.a;
            case 2:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Set) obj) {
                    Peer peer = (Peer) obj2;
                    peer.getClass();
                    if (peer.Ab(Peer.Type.USER) || peer.Ab(Peer.Type.GROUP) || peer.Ab(Peer.Type.CHANNEL)) {
                        arrayList.add(obj2);
                    }
                }
                return j5g.S0(arrayList);
            case 3:
                t6g0 t6g0Var = t6g0.b;
                return t6g0.b().C0((UserId) obj);
            default:
                ImageSize imageSize = (ImageSize) obj;
                if (imageSize == null || (url = imageSize.getUrl()) == null) {
                    return null;
                }
                return Uri.parse(url);
        }
    }
}
