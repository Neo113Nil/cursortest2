package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.balance.BalanceFragment;
import com.vk.catalog2.feature.music.holders.artist.ArtistInfoVhOld;
import com.vk.clips.design.view.correction.CorrectionsRecyclerView;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.interests.api.ClipsInterestsStatusProvider;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.clips.playlists.ui.picker.f;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.lists.DefaultErrorView;
import com.vk.log.L;
import com.vk.money.createtransfer.people.CreatePeopleTransferPresenter;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.newsfeed.posting.crop_editor.presentation.base.fragment.CropEditorFragment;
import com.vk.posting.presentation.album.AlbumPickerFragment;
import com.vk.posting.presentation.album.c;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.profile.community.details.impl.invitelink.CommunityInviteLinkFragment;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.views.fragments.add.AddLinkPresenter;
import com.vkontakte.android.attachments.AlbumAttachment;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.g9h;
import xsna.gm50;
import xsna.h7u0;
import xsna.ikv0;
import xsna.iqf;
import xsna.mi8;
import xsna.p29;
import xsna.rtb0;
import xsna.tj50;
import xsna.xcw0;
import xsna.zgk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ha implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ha(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [xsna.ikv0$d$a, xsna.ikv0$d$b] */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ww50<?> Y;
        RecyclerView recyclerView;
        int i = this.b;
        int i2 = 6;
        int i3 = 1;
        int i4 = 0;
        r5 = null;
        FragmentImpl fragmentImpl = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ja jaVar = (ja) obj2;
                Throwable th = (Throwable) obj;
                jaVar.n = false;
                L.A(th);
                jaVar.a.Ao(th);
                return s3q0.a;
            case 1:
                AddLinkPresenter addLinkPresenter = (AddLinkPresenter) obj2;
                wux wuxVar = addLinkPresenter.l;
                if (wuxVar == null) {
                    wuxVar = null;
                }
                vux vuxVar = wuxVar.b;
                if (vuxVar == null) {
                    vuxVar = null;
                }
                vuxVar.setValid(false);
                addLinkPresenter.j = null;
                return s3q0.a;
            case 2:
                Boolean invoke = ((pp0) obj2).f.invoke(Integer.valueOf(((rtb0.a) obj).a.b));
                invoke.booleanValue();
                return invoke;
            case 3:
                AlbumPickerFragment albumPickerFragment = (AlbumPickerFragment) obj2;
                com.vk.posting.presentation.album.c cVar = (com.vk.posting.presentation.album.c) obj;
                int i5 = AlbumPickerFragment.V;
                FragmentActivity activity = albumPickerFragment.getActivity();
                if (activity == null) {
                    return s3q0.a;
                }
                if (cVar instanceof c.a) {
                    c.a aVar = (c.a) cVar;
                    albumPickerFragment.R.getClass();
                    if (!(aVar instanceof c.a.C1526a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c.a.C1526a c1526a = (c.a.C1526a) aVar;
                    AlbumAttachment albumAttachment = c1526a.a;
                    am50 am50Var = c1526a.b;
                    Intent intent = new Intent();
                    intent.putExtra("album_attach", albumAttachment);
                    am50Var.a(intent);
                    ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
                    if (ey50Var != null && (Y = ey50Var.Y()) != null) {
                        fragmentImpl = Y.u();
                    }
                    if (fragmentImpl != null) {
                        fragmentImpl.Mf(-1, intent);
                    }
                } else {
                    if (!(cVar instanceof c.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dk1 dk1Var = albumPickerFragment.Q;
                    r5 = dk1Var != null ? dk1Var : 0;
                    ((c.b.a) cVar).a.a(r5.f, new ff90(r5.b.getString(R.string.album_list_empty), 20, 40));
                }
                return s3q0.a;
            case 4:
                ((ArtistInfoVhOld) obj2).m = null;
                return s3q0.a;
            case 5:
                ((pv4) obj2).b.onCancel();
                return s3q0.a;
            case 6:
                h03.b((Throwable) obj);
                BalanceFragment balanceFragment = ((d06) obj2).b;
                SwipeRefreshLayout swipeRefreshLayout = balanceFragment.V;
                if (swipeRefreshLayout == null) {
                    swipeRefreshLayout = null;
                }
                swipeRefreshLayout.setRefreshing(false);
                ProgressBar progressBar = balanceFragment.X;
                if (progressBar == null) {
                    progressBar = null;
                }
                f4m.j(progressBar);
                if (!balanceFragment.f0) {
                    TextView textView = balanceFragment.W;
                    if (textView == null) {
                        textView = null;
                    }
                    f4m.j(textView);
                    View view = balanceFragment.Y;
                    (view != null ? view : null).setVisibility(0);
                }
                balanceFragment.jo();
                return s3q0.a;
            case 7:
                ((com.vk.auth.verification.base.b) obj2).H0((vbu0) obj);
                return s3q0.a;
            case 8:
                com.vk.lists.c cVar2 = ((BonusCatalogFragment) obj2).W;
                (cVar2 != null ? cVar2 : null).p(false);
                return s3q0.a;
            case 9:
                return new ni8((ViewGroup) obj, ((mi8.a) obj2).i);
            case 10:
                b29 b29Var = (b29) obj2;
                int i6 = b29.j1;
                gm50.a.a(b29Var, ((p29.b) obj).a, new kf1(b29Var, i2));
                return s3q0.a;
            case 11:
                ((a89) obj2).q(xcw0.r.a);
                return s3q0.a;
            case 12:
                ((m99) obj2).r();
                return s3q0.a;
            case 13:
                lh9.d(((ak9) obj2).d, (Bitmap) obj);
                return s3q0.a;
            case 14:
                com.vk.im.engine.internal.storage.delegates.channel_messages.a aVar2 = ((r3b) obj2).c;
                List singletonList = Collections.singletonList((yj30) obj);
                aVar2.getClass();
                if (!singletonList.isEmpty()) {
                    aVar2.b.b().h(new rm0(i3, aVar2, singletonList));
                }
                return s3q0.a;
            case 15:
                okd okdVar = (okd) obj2;
                okdVar.c.b(okdVar.a, ((ModalActionSheetListItem) obj).a);
                return s3q0.a;
            case 16:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i7 = ClipsFavoriteFolderContentListFragment.W;
                ((ClipsFavoriteFolderContentListFragment.b) obj2).b().setRefreshing(booleanValue);
                return s3q0.a;
            case 17:
                ClipsInterestsFragment clipsInterestsFragment = (ClipsInterestsFragment) obj2;
                int i8 = ClipsInterestsFragment.Y;
                clipsInterestsFragment.go().d.clear();
                View view2 = clipsInterestsFragment.getView();
                RecyclerView.l itemAnimator = (view2 == null || (recyclerView = (RecyclerView) view2.findViewById(R.id.clips_interests_recycler)) == null) ? null : recyclerView.getItemAnimator();
                wka wkaVar = itemAnimator instanceof wka ? (wka) itemAnimator : null;
                if (wkaVar != null) {
                    vr2 vr2Var = wkaVar.A;
                    if (vr2Var != null) {
                        wkaVar.h.execute(vr2Var);
                    }
                    wkaVar.A = null;
                    wkaVar.k();
                }
                return s3q0.a;
            case 18:
                return new f.c(((tj50.a) obj).a(new d7((com.vk.clips.playlists.ui.picker.d) obj2, 28), ao8.d));
            case 19:
                iqf iqfVar = (iqf) obj2;
                ClipsInterestsStatusProvider.Status status = (ClipsInterestsStatusProvider.Status) obj;
                int i9 = status != null ? iqf.a.$EnumSwitchMapping$0[status.ordinal()] : -1;
                if (i9 != 1) {
                    if (i9 == 2) {
                        qsf qsfVar = iqfVar.m;
                        qsfVar.b = true;
                        List<? extends npf> list = qsfVar.c;
                        qsfVar.c = null;
                        if (list != null) {
                            npf[] npfVarArr = (npf[]) list.toArray(new npf[0]);
                            iqfVar.C((kj50[]) Arrays.copyOf(npfVarArr, npfVarArr.length));
                        }
                    } else {
                        if (i9 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iqfVar.y.b(rtf.a);
                    }
                }
                return s3q0.a;
            case 20:
                CommunityAddressesFragment communityAddressesFragment = ((vqg) obj2).c;
                cvk.u(R.string.default_network_error, false);
                CommunityAddressesFragment.g gVar = communityAddressesFragment.S;
                if ((gVar == null ? null : gVar) instanceof CommunityAddressesFragment.b) {
                    (gVar != null ? gVar : null).a0();
                }
                return s3q0.a;
            case 21:
                ((fvg) obj2).b.mo();
                return s3q0.a;
            case 22:
                CommunityInviteLinkFragment communityInviteLinkFragment = ((com.vk.profile.community.details.impl.invitelink.a) obj2).b;
                DefaultErrorView defaultErrorView = communityInviteLinkFragment.a0;
                if (defaultErrorView == null) {
                    defaultErrorView = null;
                }
                defaultErrorView.setVisibility(0);
                ViewGroup viewGroup = communityInviteLinkFragment.U;
                if (viewGroup == null) {
                    viewGroup = null;
                }
                f4m.j(viewGroup);
                ViewGroup viewGroup2 = communityInviteLinkFragment.V;
                if (viewGroup2 == null) {
                    viewGroup2 = null;
                }
                f4m.j(viewGroup2);
                ProgressBar progressBar2 = communityInviteLinkFragment.T;
                f4m.j(progressBar2 != null ? progressBar2 : null);
                return s3q0.a;
            case 23:
                g9h.a aVar3 = (g9h.a) obj2;
                aVar3.d = false;
                aVar3.a();
                return s3q0.a;
            case 24:
                mvh mvhVar = (mvh) obj2;
                int m = ((WallWithCounters) obj).m();
                mvhVar.o0 = m;
                mvhVar.d0.W3(mvhVar.n0, m, mvhVar.p0);
                return s3q0.a;
            case 25:
                ((Boolean) obj).booleanValue();
                ((com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d) obj2).C(c.d.b);
                return s3q0.a;
            case 26:
                lwj lwjVar = (lwj) obj;
                izs<? super lwj, s3q0> izsVar = ((CorrectionsRecyclerView) obj2).g;
                if (izsVar != null) {
                    izsVar.invoke(lwjVar);
                }
                return s3q0.a;
            case 27:
                ((vvr) obj2).h(1);
                return s3q0.a;
            case 28:
                ((CreatePeopleTransferPresenter) obj2).k.b = (List) obj;
                return s3q0.a;
            default:
                CropEditorFragment cropEditorFragment = (CropEditorFragment) obj2;
                zgk zgkVar = (zgk) obj;
                qcy<Object>[] qcyVarArr = CropEditorFragment.W;
                if (zgkVar instanceof zgk.a) {
                    cropEditorFragment.finish();
                } else if (zgkVar instanceof zgk.b) {
                    Intent intent2 = new Intent();
                    intent2.putExtras(yfb.b(new Pair("ImageCropResultKey", ((zgk.b) zgkVar).a)));
                    cropEditorFragment.Mf(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, intent2);
                } else if (zgkVar instanceof ahk) {
                    Context mo2getContext = cropEditorFragment.mo2getContext();
                    if (mo2getContext != null) {
                        ikv0.a aVar4 = new ikv0.a(mo2getContext);
                        aVar4.u = new ikv0.d(new ikv0.d.c(mo2getContext.getString(R.string.error)), (ikv0.d.b) r5, (ikv0.d.a) r5, i2);
                        aVar4.n();
                        cropEditorFragment.finish();
                    }
                } else if (zgkVar instanceof zgk.d) {
                    k6a0 k6a0Var = (k6a0) cropEditorFragment.U.getValue();
                    zgk.d dVar = (zgk.d) zgkVar;
                    Uri uri = dVar.a.getUri();
                    FragmentActivity kn = cropEditorFragment.kn();
                    boolean z = dVar.b;
                    k6a0Var.getClass();
                    if (URLUtil.isFileUrl(uri.toString()) || URLUtil.isContentUrl(uri.toString())) {
                        String path = uri.getPath();
                        if (path != null) {
                            File file = new File(path);
                            if (!k6a0Var.b.b(file)) {
                                s3q0 s3q0Var = s3q0.a;
                            } else if (z) {
                                e6a0 e6a0Var = new e6a0(k6a0Var, file, kn, i4);
                                String e = y8g0.e(R.string.edit_photo_alert_title);
                                String e2 = y8g0.e(R.string.edit_photo_alert_description);
                                int i10 = h7u0.p;
                                h7u0.a c = h7u0.b.c(kn);
                                c.h0(e);
                                c.a.f = e2;
                                c.X(y8g0.e(R.string.vk_bottomsheet_confirmation_cancel), new qi60(1));
                                c.d0(y8g0.e(R.string.photo_editor_edit_button), new b6a0(e6a0Var));
                                c.m();
                            } else {
                                k6a0.a(k6a0Var, file, kn);
                            }
                        }
                    } else {
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                } else {
                    if (!(zgkVar instanceof zgk.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    maz.c((maz) cropEditorFragment.T.getValue(), cropEditorFragment.requireContext(), ((zgk.c) zgkVar).a, LaunchContext.A, null, null, 24);
                }
                return s3q0.a;
        }
    }
}
