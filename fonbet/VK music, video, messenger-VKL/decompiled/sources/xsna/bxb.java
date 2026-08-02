package xsna;

import com.vk.im.engine.models.attaches.MediaType;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class bxb implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bxb(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        List singletonList;
        switch (this.b) {
            case 0:
                mxv mxvVar = (mxv) this.c;
                DialogExt dialogExt = (DialogExt) this.d;
                cxb cxbVar = (cxb) this.e;
                e8v e8vVar = (e8v) this.f;
                mxvVar.getClass();
                n0v0 n0v0Var = n0v0.a;
                Dialog Cb = dialogExt.Cb();
                if (Cb == null || !Cb.Jc()) {
                    boolean zb = cxbVar.c.f.zb();
                    singletonList = !zb ? Collections.singletonList(new o8v(MediaType.APPS)) : zb ? Collections.singletonList(new o8v(MediaType.APPS)) : EmptyList.b;
                } else {
                    singletonList = EmptyList.b;
                }
                ArrayList b = n0v0Var.b(singletonList);
                ArrayList arrayList = new ArrayList(b.size() + 1);
                arrayList.add(new sxb(cxbVar.u));
                g5g.z(arrayList, new ulp0(new i5g(b), new b1a(2, e8vVar, dialogExt)));
                return arrayList;
            default:
                one.video.player.j jVar = (one.video.player.j) this.c;
                OneVideoPlaybackException oneVideoPlaybackException = (OneVideoPlaybackException) this.d;
                sht0 sht0Var = (sht0) this.e;
                OneVideoPlayer oneVideoPlayer = (OneVideoPlayer) this.f;
                Iterator<OneVideoPlayer.c> it = jVar.b.iterator();
                while (it.hasNext()) {
                    it.next().q(oneVideoPlaybackException, sht0Var, oneVideoPlayer);
                }
                return s3q0.a;
        }
    }
}
