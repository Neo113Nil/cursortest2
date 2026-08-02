package androidx.media3.exoplayer;

import defpackage.do31;
import defpackage.rdf;
import defpackage.ruy;
import defpackage.w820;
import defpackage.xaj;
import defpackage.xxc0;
import java.util.List;

/* loaded from: classes10.dex */
public final /* synthetic */ class c implements ruy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ruy
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((xxc0) obj).onCues((rdf) obj2);
                break;
            case 1:
                ((ExoPlayerImpl$ComponentListener) obj2).lambda$onMetadata$4((xxc0) obj);
                break;
            case 2:
                ((xxc0) obj).onMetadata((w820) obj2);
                break;
            case 3:
                ((xxc0) obj).onCues((List) obj2);
                break;
            case 4:
                ((xxc0) obj).onVideoSizeChanged((do31) obj2);
                break;
            default:
                ((xxc0) obj).onDeviceInfoChanged((xaj) obj2);
                break;
        }
    }
}
