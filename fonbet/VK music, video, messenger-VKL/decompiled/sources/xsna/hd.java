package xsna;

import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.a;
import com.vk.clips.editor.mapper.fragment.ClipsEditorFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.im.channelcreation.impl.g;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.toggle.Features;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.ij20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class hd implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x011d, code lost:
    
        if (xsna.fnj.b(r0) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object obj;
        int i = 6;
        boolean z = true;
        int i2 = 0;
        switch (this.b) {
            case 0:
                AbstractClipsGridListFragment abstractClipsGridListFragment = (AbstractClipsGridListFragment) this.c;
                int i3 = AbstractClipsGridListFragment.e0;
                abstractClipsGridListFragment.ko().d();
                break;
            case 1:
                AlbumDetailsFragment albumDetailsFragment = (AlbumDetailsFragment) this.c;
                int i4 = AlbumDetailsFragment.p0;
                break;
            case 2:
                ml2 ml2Var = (ml2) this.c;
                ml2Var.m = true;
                ml2Var.g(false);
                break;
            case 3:
                break;
            case 4:
                ArchiveFragment archiveFragment = (ArchiveFragment) this.c;
                int i5 = ArchiveFragment.e0;
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                j96 j96Var = (j96) this.c;
                StickersDrawingViewGroup stickersDrawingViewGroup = (StickersDrawingViewGroup) ((View) j96Var.g.invoke()).findViewById(R.id.sdv_stickers);
                t9l0 t9l0Var = new t9l0(j96Var, (u76) j96Var.e.invoke(), (b96) j96Var.f.invoke());
                stickersDrawingViewGroup.setSupportMoveStickersByTwoFingers(true);
                stickersDrawingViewGroup.setSupportViewOffset(false);
                stickersDrawingViewGroup.setLockStickersAlpha(true);
                float f = 74;
                jwf0 jwf0Var = new jwf0(iah0.a(f), iah0.a(f));
                jwf0Var.c = iah0.a(22);
                stickersDrawingViewGroup.n.add(jwf0Var);
                stickersDrawingViewGroup.setStickersActionsDelegate(t9l0Var);
                stickersDrawingViewGroup.setStickerListener(j96Var.F);
                stickersDrawingViewGroup.setStickerFlingListener(new ox0(j96Var, i));
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                pd8 pd8Var = (pd8) this.c;
                qas qasVar = pd8Var.b;
                se8 se8Var = pd8Var.a;
                pd8Var.c.getClass();
                CallMemberId a = OKVoipEngine.b.a();
                String str = a != null ? a.b : null;
                if (str != null && drm0.d0(str, '-')) {
                    eqt eqtVar = pd8Var.d;
                    Iterator<T> it = se8Var.b().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (epx.f(((qvw0) obj).getId(), str)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    qvw0 qvw0Var = (qvw0) obj;
                    rvw0 rvw0Var = qvw0Var instanceof rvw0 ? (rvw0) qvw0Var : null;
                    break;
                } else {
                    se8Var.getClass();
                    ij20.a aVar = new ij20.a();
                    aVar.c = "users.get";
                    aVar.b("fields", "first_name,last_name,photo_base,sex,verified,friend_status,can_call,contact_name,is_nft,is_nft_photo");
                    aVar.i = false;
                    aVar.g = 0;
                    ArrayList u0 = j5g.u0(se8Var.b(), (List) se8Var.a.d(new ij20(aVar), new te8(se8Var)));
                    ArrayList arrayList = new ArrayList(c5g.u(u0, 10));
                    Iterator it2 = u0.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((qvw0) it2.next()).getId());
                    }
                    break;
                }
            case 11:
                ((gm9) this.c).b0();
                break;
            case 12:
                CameraUIView cameraUIView = (CameraUIView) this.c;
                float f2 = CameraUIView.w1;
                if (cameraUIView.getCamera1View() == null) {
                    io.reactivex.rxjava3.disposables.c cVar = cameraUIView.M;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    cameraUIView.M = io.reactivex.rxjava3.core.q.B0(0L, TimeUnit.MILLISECONDS).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ji3(new g20(cameraUIView, 13), 7));
                } else {
                    zd9 camera1View = cameraUIView.getCamera1View();
                    if (camera1View != null) {
                        camera1View.M();
                    }
                    bm9 presenter = cameraUIView.getPresenter();
                    if (presenter != null) {
                        presenter.j3();
                    }
                }
                break;
            case 13:
                ((com.vk.im.channelcreation.impl.h) this.c).O(g.l.b);
                break;
            case 14:
                break;
            case 15:
                cxb cxbVar = (cxb) this.c;
                int i6 = 20;
                cxbVar.e(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(cxbVar.d.F(cxbVar, new q6k(cxbVar.c.f)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new p41(new qm1(cxbVar, i6), 9)), new axb(cxbVar, i2)).subscribe(new is1(new s9(cxbVar, 16), 8), new t00(new t9(cxbVar, i6), 11)));
                break;
            case 16:
                break;
            case 17:
                nhd nhdVar = (nhd) this.c;
                if (!nhdVar.b && puq.c(Features.Type.FEATURE_CLIPS_CREATE_DISABLED, 2)) {
                    Context context = nhdVar.a;
                    HashSet hashSet = iah0.a;
                    break;
                }
                z = false;
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                ClipsEditorFragment clipsEditorFragment = (ClipsEditorFragment) this.c;
                Integer num = ClipsEditorFragment.W;
                break;
            case 21:
                ClipsGridFragment clipsGridFragment = (ClipsGridFragment) this.c;
                qcy<Object>[] qcyVarArr = ClipsGridFragment.H0;
                break;
            case 22:
                break;
            case 23:
                dw20 dw20Var = ((com.vk.clips.playlists.folders.root.a) this.c).h;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                break;
            case 24:
                mlf mlfVar = (mlf) this.c;
                break;
            case 25:
                break;
            case 26:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.c;
                int i7 = ClipsWrapperFragment.Q0;
                break;
            case 27:
                ((CommunitiesSearchTopBarVh) this.c).b.invoke(a.C0502a.a);
                break;
            case 28:
                ((s5h) this.c).B6(false);
                break;
            default:
                ((f8h) this.c).b(false);
                break;
        }
        return s3q0.a;
    }
}
