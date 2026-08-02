package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerState;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.dto.hints.Hint;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.ecomm.categories.impl.presentation.CategoriesFragment;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.account.AccountInfo;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xsna.eeu0;
import xsna.fpe;
import xsna.gm50;
import xsna.kcb;
import xsna.l1c;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d7 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e6  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        bm9 presenter;
        Object[] objArr;
        int i = this.b;
        boolean z = true;
        int i2 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return io.reactivex.rxjava3.core.q.q(io.reactivex.rxjava3.core.q.T(e43.l(AboutVideoItem.k.b, AboutVideoItem.x.b)), ((io.reactivex.rxjava3.internal.operators.observable.p1) obj2).A(350L, TimeUnit.MILLISECONDS));
            case 1:
                AccountInfo accountInfo = (AccountInfo) obj2;
                xgl0 xgl0Var = (xgl0) obj;
                xgl0Var.r().c(accountInfo);
                xgl0Var.d().j(accountInfo);
                return s3q0.a;
            case 2:
                return com.vk.clips.sdk.shared.item.ads.c.p((com.vk.clips.sdk.shared.item.ads.c) obj2, (fw0) obj);
            case 3:
                ((zak0) ((us1) obj2).i).setValue((tho0) obj);
                return s3q0.a;
            case 4:
                zh4 zh4Var = (zh4) obj2;
                int i3 = zh4.k1;
                gm50.a.a(zh4Var, ((si4) obj).a, new zx0(zh4Var, 6));
                return s3q0.a;
            case 5:
                nl4 nl4Var = (nl4) obj;
                nl4Var.removeMessages(1);
                nl4Var.removeMessages(2);
                nl4Var.removeMessages(3);
                nl4Var.sendMessage(nl4Var.obtainMessage(3, (el4) obj2));
                return s3q0.a;
            case 6:
                ((pv4) obj2).b.c();
                return Boolean.TRUE;
            case 7:
                List list = (List) obj;
                if (!((l56) obj2).getState().Db()) {
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                g5g.y(list, arrayList);
                arrayList.add(etz.b);
                return arrayList;
            case 8:
                return new Pair((LongPollType) obj2, (ImBgSyncState) obj);
            case 9:
                o48 o48Var = (o48) obj2;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) o48Var.d).setValue(bool);
                ((zak0) o48Var.e).setValue(bool);
                return s3q0.a;
            case 10:
                com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.b bVar = (com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.b) obj2;
                bVar.b();
                bVar.l.addAll((List) obj);
                bVar.d();
                return s3q0.a;
            case 11:
                ((hk9) obj2).b.a((io.reactivex.rxjava3.disposables.c) obj);
                return s3q0.a;
            case 12:
                CameraUIView cameraUIView = (CameraUIView) obj2;
                float f = CameraUIView.w1;
                bm9 presenter2 = cameraUIView.getPresenter();
                if (presenter2 != null && presenter2.U3() && (presenter = cameraUIView.getPresenter()) != null) {
                    presenter.B3();
                }
                return s3q0.a;
            case 13:
                return new c640((ViewGroup) obj, new com.vk.movika.sdk.base.logic.interactor.p((r3a) obj2, 13));
            case 14:
                return Boolean.valueOf(epx.f(((UIBlock) obj).Fb(), ((xxf0) ((n3a) obj2)).a));
            case 15:
                final CategoriesFragment.b bVar2 = (CategoriesFragment.b) obj2;
                g47 g47Var = (g47) obj;
                g47Var.b(tci.l(bVar2.m));
                g47Var.d(new xy() { // from class: xsna.qja
                    @Override // xsna.xy
                    public final void a(lj50 lj50Var) {
                        CategoriesFragment.b.this.m.b.b((fja) lj50Var);
                    }
                });
                return s3q0.a;
            case 16:
                ((w9b) obj2).s(zxd0.u.a);
                return s3q0.a;
            case 17:
                kcb.a.InterfaceC3174a interfaceC3174a = ((kcb.a) obj2).m;
                if (interfaceC3174a != null) {
                    interfaceC3174a.f();
                }
                return s3q0.a;
            case 18:
                uhb uhbVar = (uhb) obj2;
                AccountInfo a = ((s080) obj).c.a();
                if (a != null) {
                    com.vk.dto.hints.a aVar = a.I;
                    Hint c = aVar != null ? aVar.c(uhbVar.e.getId()) : null;
                    if (uhbVar.h) {
                        if ((aVar != null ? aVar.c(uhbVar.g.getId()) : null) != null) {
                            objArr = true;
                            if (c != null && objArr == false) {
                                z = false;
                            }
                            uhbVar.c.onNext(Boolean.valueOf(!z));
                            uhbVar.b.getClass();
                            if (cew.h().getBoolean("pref_channels_onboarding_showed", false) != z) {
                                cew.h().edit().putBoolean("pref_channels_onboarding_showed", z).apply();
                            }
                        }
                    }
                    objArr = false;
                    if (c != null) {
                        z = false;
                    }
                    uhbVar.c.onNext(Boolean.valueOf(!z));
                    uhbVar.b.getClass();
                    if (cew.h().getBoolean("pref_channels_onboarding_showed", false) != z) {
                    }
                }
                return s3q0.a;
            case 19:
                return bdb.a((bdb) obj, 0, 0, 0, 0, 0, 0, (vcb) obj2, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, -129, 7);
            case 20:
                asb asbVar = (asb) obj2;
                int i4 = asb.k1;
                g2v.c().getClass();
                Context requireContext = asbVar.requireContext();
                String str = (String) asbVar.j1.getValue();
                if (!drm0.N(str)) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", str);
                    Intent createChooser = Intent.createChooser(intent, requireContext.getString(R.string.share));
                    createChooser.addFlags(268435456);
                    requireContext.startActivity(createChooser);
                }
                return s3q0.a;
            case 21:
                ((ftb) obj2).e.q((Throwable) obj);
                return s3q0.a;
            case 22:
                ((hxb) obj2).l.getClass();
                zk70.e((Throwable) obj);
                return s3q0.a;
            case 23:
                a1c a1cVar = (a1c) obj2;
                l1c.a.C3224a c3224a = (l1c.a.C3224a) obj;
                int i5 = a1c.k1;
                FragmentActivity activity = a1cVar.getActivity();
                if (activity != null) {
                    String str2 = c3224a.a;
                    String str3 = c3224a.b;
                    androidx.appcompat.app.d dVar = a1cVar.j1;
                    if (dVar != null) {
                        dVar.hide();
                    }
                    eeu0.a aVar2 = new eeu0.a(activity);
                    aVar2.c = false;
                    aVar2.setTitle(str2);
                    aVar2.a.f = str3;
                    aVar2.f(activity.getString(R.string.vk_qr_web_to_app_error_dialog_close), new z0c(a1cVar, i2));
                    a1cVar.j1 = aVar2.m();
                }
                Dialog dialog = a1cVar.s;
                nw20 nw20Var = dialog instanceof nw20 ? (nw20) dialog : null;
                if (nw20Var != null) {
                    nw20Var.Y = 5;
                }
                ViewGroup Ln = a1cVar.Ln();
                if (Ln != null) {
                    f4m.j(Ln);
                }
                return s3q0.a;
            case 24:
                ClickableSticker clickableSticker = (ClickableSticker) obj2;
                b.d dVar2 = (b.d) obj;
                if (clickableSticker != null) {
                    dVar2.b(clickableSticker.zb().zb(), "clickable_sticker");
                }
                return s3q0.a;
            case 25:
                atd atdVar = (atd) obj2;
                ((ClipsDraftPersistentStore) obj).getClass();
                egg0 m = ClipsDraftPersistentStore.m();
                atdVar.getClass();
                ArrayList a2 = atd.a(m);
                yvd0 yvd0Var = atdVar.k;
                yvd0Var.f = a2;
                yvd0Var.notifyDataSetChanged();
                return s3q0.a;
            case 26:
                hce hceVar = (hce) obj2;
                sce sceVar = hceVar.n;
                gce gceVar = hceVar.m;
                sceVar.b(gceVar != null ? gceVar.b : null, gceVar != null ? gceVar.a : null, gceVar != null ? gceVar.c : null, hceVar.itemView.getContext(), hceVar.l);
                return s3q0.a;
            case 27:
                ClipsOwnerSwipeFragment clipsOwnerSwipeFragment = (ClipsOwnerSwipeFragment) obj2;
                Object obj3 = ClipsOwnerSwipeFragment.k0;
                gm50.a.a(clipsOwnerSwipeFragment, ((fpe.a) obj).a, new loe(1, clipsOwnerSwipeFragment, ClipsOwnerSwipeFragment.class, "renderItems", "renderItems(Lcom/vk/clips/viewer/impl/owner/ui/state/ClipsOwnerSwipeViewState$ItemsData;)V", 0));
                return s3q0.a;
            default:
                ((com.vk.clips.playlists.ui.picker.d) obj2).f.getClass();
                return tqe.a((ClipsPlaylistPickerState.b) obj);
        }
    }

    public /* synthetic */ d7(qkc qkcVar, ClickableSticker clickableSticker) {
        this.b = 24;
        this.c = clickableSticker;
    }
}
