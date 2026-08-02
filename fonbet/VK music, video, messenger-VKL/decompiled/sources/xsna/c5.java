package xsna;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.bottomsheet.notifications.SubscriptionAction;
import com.vk.video.ui.upload.impl.publish.domain.model.VideoAuthorDo;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.vmoji.character.model.VmojiProductUnlockInfoButtonModel;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipSelectVideoPlaylistsFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.b4;
import xsna.gm50;
import xsna.p0x0;
import xsna.tra0;
import xsna.w4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c5(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        b4 b4Var;
        ArrayList arrayList;
        VideoAuthorDo videoAuthorDo;
        int i = this.b;
        int i2 = 1;
        boolean z = true;
        VideoAuthorDo videoAuthorDo2 = null;
        int i3 = 0;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                w4 w4Var = (w4) obj3;
                Context context = (Context) obj2;
                SubscriptionAction subscriptionAction = (SubscriptionAction) obj;
                if (((SubscriptionAction) obj4) == subscriptionAction) {
                    return s3q0.a;
                }
                switch (w4.b.a.$EnumSwitchMapping$0[subscriptionAction.ordinal()]) {
                    case 1:
                        b4Var = b4.c.b.a.a;
                        break;
                    case 2:
                        b4Var = b4.c.b.C2585c.a;
                        break;
                    case 3:
                        b4Var = b4.c.b.C2584b.a;
                        break;
                    case 4:
                        b4Var = new b4.c.h(null, w4Var.g, new d5(i3, w4Var, context));
                        break;
                    case 5:
                        b4Var = b4.c.g.a;
                        break;
                    case 6:
                        b4Var = b4.c.a.a;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                w4Var.b.d(b4Var);
                return s3q0.a;
            case 1:
                List list = (List) obj3;
                VideoAuthorDo videoAuthorDo3 = (VideoAuthorDo) obj2;
                PublishState publishState = (PublishState) obj;
                UserId userId = publishState.h;
                if (((gce0) obj4).h.l1()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj5 : list) {
                        if (fkq0.b(((VideoAuthorDo) obj5).b)) {
                            arrayList2.add(obj5);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList = e43.m(videoAuthorDo3);
                    } else {
                        if (fkq0.b(userId)) {
                            Iterator it = arrayList2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    ?? next = it.next();
                                    if (((VideoAuthorDo) next).b.equals(userId)) {
                                        videoAuthorDo2 = next;
                                    }
                                }
                            }
                            videoAuthorDo = videoAuthorDo2;
                        } else {
                            Iterator it2 = arrayList2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    ?? next2 = it2.next();
                                    if (fkq0.b(((VideoAuthorDo) next2).b)) {
                                        videoAuthorDo2 = next2;
                                    }
                                }
                            }
                            videoAuthorDo = videoAuthorDo2;
                        }
                        videoAuthorDo3 = videoAuthorDo;
                        arrayList = arrayList2;
                    }
                } else {
                    ArrayList u0 = j5g.u0(list, e43.m(videoAuthorDo3));
                    Iterator it3 = u0.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            ?? next3 = it3.next();
                            if (((VideoAuthorDo) next3).b.equals(userId)) {
                                videoAuthorDo2 = next3;
                            }
                        }
                    }
                    videoAuthorDo3 = videoAuthorDo2;
                    arrayList = u0;
                }
                return PublishState.a(publishState, null, null, null, null, false, null, null, arrayList, null, videoAuthorDo3, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -641, 2047);
            case 2:
                xgl0 xgl0Var = (xgl0) obj4;
                w2w w2wVar = (w2w) obj2;
                uib a = xgl0Var.a();
                long j = ((tdb) obj3).c.b;
                bdb c = a.c(j);
                if (c == null) {
                    return null;
                }
                vcb vcbVar = c.i;
                xgl0Var.a().x(j, vcb.b(vcbVar, vcbVar.b.j(0), 0L, 2));
                xgl0 I0 = w2wVar.I0();
                List singletonList = Collections.singletonList(Long.valueOf(j));
                return (aeb) (singletonList.isEmpty() ? jgp.b : (Map) I0.u(new beb(singletonList, z ? 1 : 0, I0))).get(Long.valueOf(j));
            case 3:
                pdo pdoVar = (pdo) obj4;
                rxd rxdVar = (rxd) obj3;
                String str = (String) obj2;
                ArrayList arrayList3 = pdoVar.d;
                ((ClipsDraftPersistentStore) obj).getClass();
                if (ClipsDraftPersistentStore.j() != null || arrayList3.isEmpty()) {
                    rxdVar.a.a.c(new yv6(rxdVar, i2));
                } else {
                    int i4 = 13;
                    rxdVar.c.b(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new uod(rxdVar, pdoVar)), new yh1(new pxd(pdoVar.f, pdoVar, wrp.a(str)), 7)).h(new x8(new com.vk.movika.sdk.base.observable.u(i4), 11)).q(io.reactivex.rxjava3.schedulers.a.b()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new defpackage.n(new com.vk.movika.sdk.base.observable.w(rxdVar, 23), 15), new defpackage.p(new ec(rxdVar, 29), i4)));
                }
                return s3q0.a;
            case 4:
                xwk.d().e().a(((FrameLayout) obj4).getContext(), (String) obj3);
                dw20 dw20Var = ((sce) obj2).a;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 5:
                tra0 tra0Var = (tra0) obj4;
                tra0 tra0Var2 = (tra0) obj3;
                o6j o6jVar = (o6j) obj2;
                tra0.a aVar = (tra0.a) obj;
                if (tra0Var != null) {
                    tra0.a.x(aVar, tra0Var, 0, 0);
                }
                tra0.a.x(aVar, tra0Var2, o6j.i(o6jVar.a) - tra0Var2.b, 0);
                return s3q0.a;
            case 6:
                ((izs) obj4).invoke((VmojiProductUnlockInfoButtonModel) obj3);
                dw20 dw20Var2 = ((q4q0) obj2).b;
                if (dw20Var2 != null) {
                    dw20Var2.dismiss();
                }
                return s3q0.a;
            default:
                int i5 = VoipSelectVideoPlaylistsFragment.S;
                gm50.a.a((VoipSelectVideoPlaylistsFragment) obj4, ((p0x0.a) obj).a, new een0(9, (szw0) obj3, (SwipeRefreshLayout) obj2));
                return s3q0.a;
        }
    }
}
