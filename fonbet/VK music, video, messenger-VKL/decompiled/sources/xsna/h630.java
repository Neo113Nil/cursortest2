package xsna;

import android.content.Intent;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.ads.dto.VkOptionalNativeAdType;
import com.vk.api.generated.audio.dto.AudioAudioIdDto;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchInCommunityCatalogRootVh;
import com.vk.catalog2.feature.search.holders.SearchSpellcheckVh;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import com.vk.common.links.LaunchContext;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.photos.root.albumdetails.presentation.k;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.reefton.Reef;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.api.SearchQuery;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.utils.Logger;
import xsna.b9q0;
import xsna.cm70;
import xsna.doh0;
import xsna.fh8;
import xsna.ha70;
import xsna.hg1;
import xsna.kb70;
import xsna.oz50;
import xsna.r5e0;
import xsna.sw50;
import xsna.tca0;
import xsna.xh60;
import xsna.xn50;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class h630 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h630(SearchInCommunityCatalogRootVh searchInCommunityCatalogRootVh, m3a m3aVar) {
        this.b = 26;
        this.c = searchInCommunityCatalogRootVh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Intent intent;
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new Pair(new int[]{((AudioAudioIdDto) j5g.Y((List) obj)).d()}, (Playlist) obj2);
            case 1:
                ta30 ta30Var = (ta30) obj2;
                if (!ta30Var.isLayoutRequested()) {
                    ta30Var.c = true;
                }
                ta30Var.invalidate();
                return s3q0.a;
            case 2:
                Attach attach = (Attach) obj2;
                Serializer.c<MsgFromChannel> cVar = MsgFromChannel.CREATOR;
                return attach;
            case 3:
                InstantJob instantJob = (InstantJob) obj;
                return Boolean.valueOf((instantJob instanceof hi30) && ((hi30) instantJob).c == ((Msg) obj2).b);
            case 4:
                n8b0 n8b0Var = (n8b0) obj;
                TreeSet<Playlist> treeSet = ((vi40) obj2).d;
                if (treeSet.removeIf(new ti40(new eqq(n8b0Var, 21), i2)) && !epx.f(n8b0Var.a.H, DownloadingState.Downloaded.b)) {
                    treeSet.add(n8b0Var.a);
                }
                return j5g.O0(treeSet);
            case 5:
                p250 p250Var = (p250) obj2;
                r5e0 r5e0Var = (r5e0) obj;
                int i3 = p250.j1;
                if (r5e0Var instanceof r5e0.a) {
                    p250Var.hide();
                } else {
                    if (!(r5e0Var instanceof r5e0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r5e0.b bVar = (r5e0.b) r5e0Var;
                    maz.c(xwk.d().e(), p250Var.requireContext(), bVar.a, LaunchContext.A, bVar.b, null, 16);
                    p250Var.hide();
                }
                return s3q0.a;
            case 6:
                MusicTrack musicTrack = ((id50) obj2).b;
                UserId c = o25.a().c();
                int intValue = ((Integer) obj).intValue();
                musicTrack.c = c;
                musicTrack.b = intValue;
                return s3q0.a;
            case 7:
                return Boolean.valueOf(((NewsfeedOptionalAdsComponent) ((hv50) obj2).c.getValue()).T1(VkOptionalNativeAdType.APPLOVIN));
            case 8:
                ((dv60) obj2).c(new xh60.e(new yo60.g.a((Throwable) obj)));
                return s3q0.a;
            case 9:
                kb70 kb70Var = (kb70) obj;
                return Boolean.valueOf((kb70Var instanceof kb70.d) && epx.f(((kb70.d) kb70Var).a, ((ha70.b) obj2).a));
            case 10:
                cm70 cm70Var = (cm70) obj2;
                ExternalNpsCondition externalNpsCondition = (ExternalNpsCondition) obj;
                cm70Var.getClass();
                if (e43.l(ExternalNpsCondition.CLIP_CREATE, ExternalNpsCondition.CLIP_CREATE_AUDIO_ATTACHMENT).contains(externalNpsCondition)) {
                    cm70Var.g.a(new cm70.a.b(externalNpsCondition));
                }
                return s3q0.a;
            case 11:
                yp80 yp80Var = (yp80) obj2;
                Throwable th = (Throwable) obj;
                if (yp80Var != null) {
                    yp80Var.onError(th);
                }
                return s3q0.a;
            case 12:
                Object obj3 = ((vl90) obj2).o;
                ((tl90) (obj3 != null ? obj3 : null)).E();
                return s3q0.a;
            case 13:
                x6a0 x6a0Var = (x6a0) obj2;
                RecyclerView recyclerView = (RecyclerView) obj;
                x6a0Var.getClass();
                if (recyclerView == null) {
                    r2 = false;
                } else {
                    recyclerView.setHasFixedSize(true);
                    recyclerView.setVerticalScrollBarEnabled(true);
                    recyclerView.setClipToPadding(false);
                    int i4 = x6a0Var.C;
                    recyclerView.setPadding(i4, 0, i4, 0);
                    recyclerView.addOnScrollListener(x6a0Var.d0);
                }
                return Boolean.valueOf(r2);
            case 14:
                PhotoFlowFragment photoFlowFragment = (PhotoFlowFragment) obj2;
                int i5 = PhotoFlowFragment.m0;
                photoFlowFragment.getClass();
                xn50.a.c(photoFlowFragment, (com.vk.photos.root.photoflow.presentation.a) obj);
                return s3q0.a;
            case 15:
                aaa0 aaa0Var = (aaa0) obj2;
                aaa0Var.o.P7(new a.s(((k.c.C1491c) aaa0Var.m).a));
                return s3q0.a;
            case 16:
                tca0 tca0Var = (tca0) obj2;
                io.reactivex.rxjava3.disposables.c cVar2 = tca0Var.d;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
                hg1.c3 c3Var = new hg1.c3(tca0.c.b);
                fVar.getClass();
                tca0Var.d = new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, c3Var).U(new hg1.b3(tca0.d.b)), new qca0(new xmz(19), i2)).subscribe(new ljs(new f0z(tca0Var, 20), 18), new pdw(new tca0.b(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 13));
                return s3q0.a;
            case 17:
                ((iha0) ((mha0) obj2).c).T2(((VKList) obj).i());
                return s3q0.a;
            case 18:
                ((e2b0) obj2).S((String) obj);
                return s3q0.a;
            case 19:
                msb0 msb0Var = (msb0) obj2;
                Integer num = (Integer) obj;
                int i6 = msb0.n1;
                if (num != null) {
                    Toast.makeText(msb0Var.requireContext(), num.intValue(), 0).show();
                }
                return s3q0.a;
            case 20:
                enc0 enc0Var = (enc0) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                bwt0.p0(enc0Var.J, booleanValue);
                if (booleanValue) {
                    enc0Var.h(5);
                    bwt0.p0(enc0Var.q, false);
                }
                return s3q0.a;
            case 21:
                final boolean booleanValue2 = ((Boolean) obj).booleanValue();
                rdi.y((gce0) obj2, new izs() { // from class: xsna.ocd0
                    @Override // xsna.izs
                    public final Object invoke(Object obj4) {
                        return PublishState.a((PublishState) obj4, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, booleanValue2, false, false, -1, 1919);
                    }
                });
                return s3q0.a;
            case 22:
                int i7 = ProductsSelectionBottomSheet.u1;
                enj.q(R.string.product_selection_fave_change_product_fail, 0, ((ProductsSelectionBottomSheet) obj2).mo2getContext());
                return s3q0.a;
            case 23:
                ProfileMainPhotosFragment profileMainPhotosFragment = (ProfileMainPhotosFragment) obj2;
                PhotoAlbum photoAlbum = (PhotoAlbum) obj;
                int i8 = ProfileMainPhotosFragment.F0;
                if (profileMainPhotosFragment.getActivity() != null) {
                    profileMainPhotosFragment.s0 = photoAlbum;
                    rfc a = fpf0.a(profileMainPhotosFragment.kn().getClass());
                    rsr rsrVar = oz50.k;
                    oz50.b.d();
                    boolean c2 = a.c(MainActivity.class);
                    FragmentActivity kn = profileMainPhotosFragment.kn();
                    HashSet hashSet = iah0.a;
                    if (fnj.d(kn) || !c2) {
                        intent = null;
                    } else {
                        FragmentActivity kn2 = profileMainPhotosFragment.kn();
                        oz50.b.d();
                        intent = new Intent(kn2, (Class<?>) MainActivity.class);
                        intent.addFlags(603979776);
                        intent.putExtra("profile_photos_picker", true);
                    }
                    rwi.d().g().d(profileMainPhotosFragment, 1534, 0, new sw50.f.a(intent, null, 28));
                    profileMainPhotosFragment.w0.postDelayed(new xq3(profileMainPhotosFragment, 11), 200L);
                }
                return s3q0.a;
            case 24:
                ((anf0) obj2).d.b();
                AtomicInteger atomicInteger = Reef.i;
                Reef.a.a((Throwable) obj);
                return s3q0.a;
            case 25:
                ((boh0) obj2).T(new doh0.e(((Integer) obj).intValue()));
                return s3q0.a;
            case 26:
                SearchInCommunityCatalogRootVh searchInCommunityCatalogRootVh = (SearchInCommunityCatalogRootVh) obj2;
                l3a l3aVar = (l3a) obj;
                if (l3aVar instanceof SearchSpellcheckVh.a.b) {
                    searchInCommunityCatalogRootVh.u.e(new SearchQuery(((SearchSpellcheckVh.a.b) l3aVar).a, SearchInputMethod.Keyboard, null, null, 12, null), new b9q0.b(true));
                }
                return s3q0.a;
            case 27:
                ((ikv0) obj).a();
                y9w.b(4, ((ccj0) obj2).a, null);
                return s3q0.a;
            case 28:
                ((clj0) obj2).e.invoke(fh8.i.b.a);
                return s3q0.a;
            default:
                return Boolean.valueOf(((ClipsEditorAudioItem) obj).d() == ((ClipsEditorAudioItem) ((kyd) obj2)).d());
        }
    }

    public /* synthetic */ h630(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
