package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.ArraySet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.tabs.TabLayout;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.main.VkClientLibverifyInfo;
import com.vk.auth.passkey.PasskeyAlternative;
import com.vk.auth.passkey.PasskeyCheckInfo;
import com.vk.auth.passkey.web.PasskeyWebAuthScreen;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;
import com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh;
import com.vk.clips.sdk.shared.feed.controller.mvi.state.spinner.ScreenSpinnerViewState;
import com.vk.common.links.LinksParserData;
import com.vk.community.design.view.cover.CommunityStaticCover;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.tabs.d;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.stories.model.HighlightStoriesContainer;
import com.vk.dto.user.deactivation.Deactivation;
import com.vk.dto.video.VideoAlbum;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.im.ui.components.common.NotifyId;
import com.vk.lists.ListDataSet;
import com.vk.masks.MasksView;
import com.vk.newsfeed.api.posting.community.PostingCountersModel;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import com.vk.photo.editor.features.crop.models.stat.CropStatEvent;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vk.profile.core.info_items.PostingCountersWithButtonItem;
import com.vk.reactions.view.ElevationImageView;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.d;
import com.vk.voip.ui.join.directly.withpreview.JoinCallFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.as30;
import xsna.bi10;
import xsna.bmt;
import xsna.cbh;
import xsna.oik;
import xsna.q4r;
import xsna.qr60;
import xsna.tlo0;
import xsna.u1z;
import xsna.uch0;
import xsna.v1j;
import xsna.y320;
import xsna.yzx;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class rlh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rlh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:278:0x09ef  */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Context mo2getContext;
        CommunityProfileViewState.Data.c cVar;
        sph sphVar;
        View view;
        int i;
        m3h m3hVar;
        we6 we6Var;
        ViewGroup viewGroup;
        Pair pair;
        int i2;
        String q5;
        boolean z;
        mzp0 mzp0Var;
        el30 el30Var;
        int i3 = this.b;
        int i4 = 2;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                tlh tlhVar = (tlh) obj2;
                VideoAlbum videoAlbum = (VideoAlbum) obj;
                sst0 sst0Var = (sst0) tlhVar.t;
                if (sst0Var != null) {
                    zih.a(tlhVar.E, sst0Var, new u0s0(videoAlbum, sst0Var), null, 12);
                }
                return s3q0.a;
            case 1:
                com.vk.profile.community.impl.ui.profile.f fVar = (com.vk.profile.community.impl.ui.profile.f) obj2;
                p0z p0zVar = fVar.j;
                CommunityProfileViewState.Data.a aVar = (CommunityProfileViewState.Data.a) obj;
                ExtendedCommunityProfile extendedCommunityProfile = aVar.a;
                View view2 = fVar.k;
                zth zthVar = fVar.y;
                CommunityProfileViewState.Data.c cVar2 = aVar.b;
                RecyclerView recyclerView = zthVar.b;
                CommunityStaticCover communityStaticCover = zthVar.a;
                if (cVar2 != null) {
                    if (communityStaticCover != null) {
                        if (cVar2 instanceof CommunityProfileViewState.Data.c.b) {
                            f4m.y(0, recyclerView);
                            communityStaticCover.setVisibility(4);
                        } else if (cVar2 instanceof CommunityProfileViewState.Data.c.AbstractC1625c) {
                            zthVar.a();
                            communityStaticCover.setVisibility(0);
                            communityStaticCover.setClickable(false);
                            CommunityProfileViewState.Data.c.AbstractC1625c abstractC1625c = (CommunityProfileViewState.Data.c.AbstractC1625c) cVar2;
                            if (abstractC1625c.equals(CommunityProfileViewState.Data.c.AbstractC1625c.a.a)) {
                                communityStaticCover.setState(new CommunityStaticCover.a.b(null));
                            } else if (abstractC1625c instanceof CommunityProfileViewState.Data.c.AbstractC1625c.b) {
                                communityStaticCover.setState(new CommunityStaticCover.a.b(((CommunityProfileViewState.Data.c.AbstractC1625c.b) cVar2).a));
                            } else if (abstractC1625c instanceof CommunityProfileViewState.Data.c.AbstractC1625c.C1626c) {
                                CommunityProfileViewState.Data.c.AbstractC1625c.C1626c c1626c = (CommunityProfileViewState.Data.c.AbstractC1625c.C1626c) cVar2;
                                communityStaticCover.setState(new CommunityStaticCover.a.C0723a(new jkg(c1626c.a, i4), c1626c.b, c1626c.c ? new tbg(zthVar, 6) : null));
                            } else {
                                if (!(abstractC1625c instanceof CommunityProfileViewState.Data.c.AbstractC1625c.d)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                communityStaticCover.setState(new CommunityStaticCover.a.c(new b3(zthVar, 27)));
                            }
                        } else {
                            if (!(cVar2 instanceof CommunityProfileViewState.Data.c.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f4m.j(communityStaticCover);
                        }
                        Context context = communityStaticCover.getContext();
                        HashSet hashSet = iah0.a;
                        if (fnj.d(context)) {
                            communityStaticCover.setWithOverlay(false);
                        }
                    } else {
                        f4m.y(0, recyclerView);
                        if (communityStaticCover != null) {
                            f4m.j(communityStaticCover);
                        }
                    }
                }
                qth qthVar = fVar.A;
                qthVar.f = cVar2;
                bwt0.V(qthVar.a, new ie3(9, cVar2, qthVar));
                mph mphVar = fVar.C;
                com.vk.lists.a<we6> aVar2 = mphVar.a;
                if (extendedCommunityProfile == null) {
                    view = view2;
                } else {
                    com.vk.profile.community.impl.ui.profile.b bVar = mphVar.c;
                    if (cVar2 == null || (mo2getContext = bVar.a.mo2getContext()) == null) {
                        view = view2;
                        i = 4;
                        m3hVar = null;
                    } else {
                        xrh xrhVar = aVar.d;
                        defpackage.t tVar = new defpackage.t(mphVar, extendedCommunityProfile, cVar2, 1);
                        com.vk.movika.sdk.base.presenter.c cVar3 = new com.vk.movika.sdk.base.presenter.c(8, mphVar, extendedCommunityProfile);
                        t2o t2oVar = (t2o) mphVar.p.getValue();
                        ynh ynhVar = mphVar.b;
                        if (xrhVar != null) {
                            sph sphVar2 = new sph(xrhVar, mphVar);
                            cVar = cVar2;
                            sphVar = sphVar2;
                        } else {
                            cVar = cVar2;
                            sphVar = null;
                        }
                        yte yteVar = mphVar.l;
                        int i5 = extendedCommunityProfile.Y;
                        com.vk.newsfeed.posting.impl.presentation.base.fragment.a aVar3 = (((i5 == 0 && extendedCommunityProfile.Z == 0) || i5 == 2) && bwd0.h(extendedCommunityProfile)) ? new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(mphVar, 29) : null;
                        view = view2;
                        i = 4;
                        aph aphVar = new aph(new bph(mo2getContext, extendedCommunityProfile, tVar, cVar3, t2oVar, ynhVar, sphVar, yteVar, aVar3, mphVar.h, mphVar.i), new zoh((cbh.a) mphVar.o.getValue(), new n3h(new qph(mphVar, mphVar.a(extendedCommunityProfile, cVar)), new rph(mphVar, cVar))));
                        if (!(aphVar instanceof aph)) {
                            aphVar = null;
                        }
                        if (aphVar == null) {
                            throw new IllegalArgumentException("Legacy author header path requires Legacy header factory params");
                        }
                        m3hVar = new m3h(aphVar);
                    }
                    if (m3hVar != null) {
                        ArrayList arrayList = new ArrayList(m3hVar.b(aVar.e));
                        we6 we6Var2 = (we6) j5g.a0(arrayList);
                        if (we6Var2 != null) {
                            we6Var2.i(1);
                        }
                        if ((bwd0.b(extendedCommunityProfile) || bwd0.c(extendedCommunityProfile)) && !bwd0.f(extendedCommunityProfile)) {
                            we6 we6Var3 = (we6) j5g.k0(arrayList);
                            if (we6Var3 != null) {
                                if (!(we6Var3 instanceof osg) && !(we6Var3 instanceof exg)) {
                                    we6Var3 = null;
                                }
                                if (we6Var3 != null) {
                                    we6Var3.i(2);
                                }
                            }
                            if (bwd0.b(extendedCommunityProfile) && (we6Var = (we6) j5g.a0(arrayList)) != null) {
                                we6Var.i(i);
                            }
                        }
                        ListDataSet.ArrayListImpl<T> arrayListImpl = aVar2.d;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayListImpl.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            we6 we6Var4 = (we6) next;
                            if ((we6Var4 instanceof wih) || (we6Var4 instanceof boh)) {
                                arrayList2.add(next);
                            }
                        }
                        arrayList.addAll(arrayList2);
                        aVar2.setItems(arrayList);
                        stc0 stc0Var = aVar.c;
                        mphVar.q = extendedCommunityProfile;
                        egc0 egc0Var = (egc0) mphVar.k.invoke(extendedCommunityProfile);
                        hsh hshVar = mphVar.m;
                        int i6 = stc0Var.a;
                        int i7 = stc0Var.b;
                        int i8 = stc0Var.c;
                        hshVar.c = extendedCommunityProfile.a0;
                        Context context2 = hshVar.a;
                        ListDataSet.ArrayListImpl<T> arrayListImpl2 = hshVar.b.d;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : arrayListImpl2) {
                            if (obj3 instanceof PostingCountersWithButtonItem) {
                                arrayList3.add(obj3);
                            }
                        }
                        PostingCountersWithButtonItem postingCountersWithButtonItem = (PostingCountersWithButtonItem) j5g.a0(arrayList3);
                        if (postingCountersWithButtonItem != null && (viewGroup = postingCountersWithButtonItem.h) != null) {
                            VkButton vkButton = (VkButton) viewGroup.findViewById(R.id.post_btn);
                            boolean z2 = i6 > 0 || i7 > 0 || i8 > 0;
                            int a = e3m.a(R.dimen.vk_ui_spacing_size_xl, context2);
                            bwt0.f0(vkButton, 0, a, 0, z2 ? hsh.e : a, 5);
                            PostingCountersModel.b bVar2 = new PostingCountersModel.b(i7, i6, i8);
                            int i9 = i6 + i7 + i8;
                            if (!((Boolean) hshVar.d.getValue()).booleanValue()) {
                                pair = new Pair(i9 == i6 ? new PostingCountersModel.a(context2.getString(R.string.postponed_posts_title_short), i9, PostingCountersModel.ClickActionType.OPEN_POSTPONED) : i9 == i7 ? hshVar.b(i9) : i9 == i8 ? hshVar.a(i9) : new PostingCountersModel.a(context2.getString(R.string.unpublished_posts_title), i9, PostingCountersModel.ClickActionType.OPEN_UNPUBLISHED_MODAL), null);
                            } else if (i6 <= 0 || i7 <= 0 || i8 <= 0) {
                                pair = new Pair(i7 > 0 ? hshVar.b(i7) : i6 > 0 ? new PostingCountersModel.a(context2.getString(R.string.postponed_posts_title_short), i6, PostingCountersModel.ClickActionType.OPEN_POSTPONED) : i8 > 0 ? hshVar.a(i8) : null, (i6 <= 0 || i7 <= 0) ? (i8 <= 0 || i7 <= 0) ? (i8 <= 0 || i6 <= 0) ? null : hshVar.a(i8) : hshVar.a(i8) : new PostingCountersModel.a(context2.getString(R.string.postponed_posts_title_short), i6, PostingCountersModel.ClickActionType.OPEN_POSTPONED));
                            } else {
                                pair = new Pair(new PostingCountersModel.a(context2.getString(R.string.unpublished_posts_title), i9, PostingCountersModel.ClickActionType.OPEN_UNPUBLISHED_MODAL), null);
                            }
                            egc0Var.i3(new PostingCountersModel((PostingCountersModel.a) pair.d(), (PostingCountersModel.a) pair.g(), bVar2));
                        }
                        mphVar.n.onNext(new jvh(stc0Var.a, i7, i8));
                        egc0Var.N2();
                    }
                }
                new kpd(fVar, 2);
                p0zVar.getClass();
                if (extendedCommunityProfile != null) {
                    seh sehVar = fVar.w;
                    sehVar.getClass();
                    boolean c = w2h.c(extendedCommunityProfile);
                    VkPlaceholder vkPlaceholder = sehVar.d;
                    if (vkPlaceholder != null || c) {
                        if (vkPlaceholder == null) {
                            sehVar.d = (VkPlaceholder) sehVar.a.inflate();
                        }
                        VkPlaceholder vkPlaceholder2 = sehVar.d;
                        if (vkPlaceholder2 == null) {
                            vkPlaceholder2 = null;
                        }
                        bwt0.p0(vkPlaceholder2, c);
                        if (c) {
                            Deactivation deactivation = extendedCommunityProfile.q;
                            CharSequence d = (deactivation == null || (q5 = deactivation.q5()) == null) ? "" : sehVar.b.d(q5, new LinksParserData(112, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382));
                            VkPlaceholder vkPlaceholder3 = sehVar.d;
                            i2 = 1;
                            (vkPlaceholder3 == null ? null : vkPlaceholder3).setMiddle(new VkPlaceholder.b(null, new VkPlaceholder.b.C0859b(14, u11.f(tlo0.Companion, d)), i2));
                            int i10 = extendedCommunityProfile.a1;
                            boolean z3 = i10 == 1 || i10 == 2 || i10 == 4;
                            int i11 = (z3 && extendedCommunityProfile.Y == 2) ? R.string.profile_unsubscribe : z3 ? R.string.leave_group : 0;
                            d94 d94Var = z3 ? new d94(sehVar, 2) : null;
                            if (i11 != 0) {
                                VkPlaceholder vkPlaceholder4 = sehVar.d;
                                VkPlaceholder.a.C0857a c0857a = null;
                                (vkPlaceholder4 == null ? null : vkPlaceholder4).setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(i11), (gzs) new defpackage.k(d94Var, 23), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, VkButton.Mode.Link, (VkButton.Appearance) null, false, 444), c0857a, c0857a, null, 8));
                            }
                            boolean c2 = w2h.c(extendedCommunityProfile);
                            fVar.G = !c2;
                            SwipeRefreshLayout swipeRefreshLayout = fVar.o;
                            if (fVar.F || c2) {
                                z = 0;
                            } else {
                                p0zVar.getClass();
                                z = i2;
                            }
                            swipeRefreshLayout.setEnabled(z);
                            mzp0Var = fVar.e;
                            if (mzp0Var != null) {
                                mzp0Var.d(view);
                            }
                            fVar.f.a();
                        }
                    }
                    i2 = 1;
                    boolean c22 = w2h.c(extendedCommunityProfile);
                    fVar.G = !c22;
                    SwipeRefreshLayout swipeRefreshLayout2 = fVar.o;
                    if (fVar.F) {
                    }
                    z = 0;
                    swipeRefreshLayout2.setEnabled(z);
                    mzp0Var = fVar.e;
                    if (mzp0Var != null) {
                    }
                    fVar.f.a();
                }
                return s3q0.a;
            case 2:
                ((lak) obj2).r.invoke(new v1j.v(false, ((Integer) obj).intValue()));
                return s3q0.a;
            case 3:
                gik gikVar = (gik) obj2;
                typ0 typ0Var = (typ0) obj;
                ghk ghkVar = typ0Var.a;
                oik.a aVar4 = gikVar.d.d;
                oik.a aVar5 = aVar4 != null ? aVar4 : null;
                utk0 utk0Var = aVar5.e;
                syp0 syp0Var = (syp0) utk0Var.getValue();
                if (!typ0Var.b || syp0Var.a.b == -1) {
                    aVar5.a(ghkVar.c, false);
                } else {
                    utk0Var.setValue(aVar5.d);
                }
                gikVar.j.b(new CropStatEvent.c(fhk.a(ghkVar.c)));
                return s3q0.a;
            case 4:
                ai30 ai30Var = (ai30) obj2;
                xgl0 xgl0Var = (xgl0) obj;
                int d2 = xgl0Var.system().d();
                xgl0Var.b().a().h(e43.l(new com.vk.im.engine.models.dialogs.d(DialogsCounters.Type.UNREAD, ai30Var.a, d2), new com.vk.im.engine.models.dialogs.d(DialogsCounters.Type.UNREAD_UNMUTED, ai30Var.b, d2), new com.vk.im.engine.models.dialogs.d(DialogsCounters.Type.REQUESTS, ai30Var.c, d2), new com.vk.im.engine.models.dialogs.d(DialogsCounters.Type.BUSINESS_NOTIFY_UNREAD, ai30Var.e, d2), new com.vk.im.engine.models.dialogs.d(DialogsCounters.Type.BUSINESS_NOTIFY_TOTAL, ai30Var.d, d2), new com.vk.im.engine.models.dialogs.d(DialogsCounters.Type.ARCHIVE_UNREAD, ai30Var.g, d2), new com.vk.im.engine.models.dialogs.d(DialogsCounters.Type.ARCHIVE_UNREAD_UNMUTED, ai30Var.h, d2), new com.vk.im.engine.models.dialogs.d(DialogsCounters.Type.ARCHIVE_MENTIONS, ai30Var.i, d2), new com.vk.im.engine.models.dialogs.d(DialogsCounters.Type.ARCHIVE_TOTAL, ai30Var.f, d2)));
                return s3q0.a;
            case 5:
                ((e4n) obj2).m = null;
                return s3q0.a;
            case 6:
                ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.b) obj2).T(new d.b(0));
                return s3q0.a;
            case 7:
                s3p s3pVar = (s3p) obj2;
                Integer a2 = s3pVar.a();
                if (a2 != null) {
                    int intValue = a2.intValue();
                    f640 f640Var = s3pVar.c;
                    if (f640Var != null && (el30Var = f640Var.f) != null) {
                        el30Var.invoke(Integer.valueOf(intValue));
                    }
                }
                return s3q0.a;
            case 8:
                ElevationImageView elevationImageView = (ElevationImageView) obj2;
                elevationImageView.m = (Bitmap) obj;
                elevationImageView.r = false;
                elevationImageView.s = false;
                elevationImageView.invalidate();
                return s3q0.a;
            case 9:
                int i12 = ExploreFragment.h0;
                int i13 = com.vk.core.view.components.tabs.d.G;
                nxv0 a3 = d.a.a(((ExploreFragment) obj2).requireContext());
                a3.setText(((TabLayout.g) obj).c);
                return a3;
            case 10:
                g5r g5rVar = (g5r) obj2;
                q4r q4rVar = (q4r) obj;
                if (!(q4rVar instanceof q4r.a)) {
                    if ((q4rVar instanceof q4r.b) || (q4rVar instanceof q4r.c) || (q4rVar instanceof q4r.d)) {
                        return ScreenSpinnerViewState.a.b;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                uch0 uch0Var = ((q4r.a) q4rVar).j;
                g5rVar.getClass();
                if (epx.f(uch0Var, uch0.a.b)) {
                    return ScreenSpinnerViewState.a.b;
                }
                if (epx.f(uch0Var, sdy.j)) {
                    return ScreenSpinnerViewState.Visible.Error;
                }
                if (uch0Var instanceof vch0) {
                    return ScreenSpinnerViewState.Visible.Loading;
                }
                if (epx.f(uch0Var, ine0.e)) {
                    return ScreenSpinnerViewState.Visible.Success;
                }
                throw new NoWhenBranchMatchedException();
            case 11:
                b.d dVar = (b.d) obj;
                mkm0 mkm0Var = ((q7r) obj2).i0;
                if (mkm0Var.getStoriesContainer() instanceof HighlightStoriesContainer) {
                    dVar.b(Integer.valueOf(((HighlightStoriesContainer) mkm0Var.getStoriesContainer()).o.b), "narrative_id");
                }
                return s3q0.a;
            case 12:
                tys tysVar = (tys) obj2;
                VkAuthValidatePhoneResult vkAuthValidatePhoneResult = (VkAuthValidatePhoneResult) obj;
                FullscreenPasswordData fullscreenPasswordData = tysVar.y;
                tir0 tir0Var = tysVar.z;
                SignUpDataHolder signUpDataHolder = tysVar.p;
                SignUpDataHolder signUpDataHolder2 = signUpDataHolder != null ? signUpDataHolder : null;
                if (signUpDataHolder == null) {
                    signUpDataHolder = null;
                }
                signUpDataHolder2.I = VkAuthMetaInfo.zb(signUpDataHolder.I, SilentAuthSource.BY_PHONE, null, null, 55);
                if (vkAuthValidatePhoneResult.e == VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_PASSKEY) {
                    String str = fullscreenPasswordData.b;
                    boolean z4 = fullscreenPasswordData.c;
                    tir0Var.getClass();
                    boolean z5 = vkAuthValidatePhoneResult.f == null;
                    String str2 = vkAuthValidatePhoneResult.b;
                    PasskeyAlternative.Companion.getClass();
                    PasskeyAlternative a4 = PasskeyAlternative.a.a(z5);
                    PasskeyWebAuthScreen.Companion.getClass();
                    sir0.e(sir0.a, tir0Var.c, new PasskeyCheckInfo(str, str2, a4, PasskeyWebAuthScreen.a.a(z5), z4, false, 32, null), null, null, null, 28);
                } else if (fullscreenPasswordData.c) {
                    tir0.b(tir0Var, fullscreenPasswordData.b, vkAuthValidatePhoneResult, false, 8);
                } else {
                    String str3 = fullscreenPasswordData.b;
                    tir0Var.getClass();
                    String str4 = vkAuthValidatePhoneResult.l;
                    String replace = str4 != null ? str4.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183) : null;
                    VerificationScreenData.Login login = new VerificationScreenData.Login(str3, replace == null ? str3 : replace, vkAuthValidatePhoneResult.b, true, true, null, null, 96, null);
                    r55 r55Var = r55.a;
                    r55.e().d(VkClientLibverifyInfo.Service.PASSWORDLESS);
                    sir0.f(sir0.a, tir0Var.c, null, login, null, 10);
                }
                return s3q0.a;
            case 13:
                bmt.b bVar3 = (bmt.b) obj2;
                bVar3.a();
                bmt.this.e(new cmt(qr60.a.b.a));
                return s3q0.a;
            case 14:
                oqv oqvVar = (oqv) obj2;
                tdu tduVar = (tdu) obj;
                l5g l5gVar = (l5g) ((zak0) oqvVar.d).getValue();
                boolean c3 = oqvVar.c();
                boolean d3 = l5gVar != null ? l5g.d(l5gVar.a, l5g.k) : false;
                float f = 1.0f;
                if (d3 && !c3) {
                    f = 0.64f;
                }
                tduVar.b(f);
                return s3q0.a;
            case 15:
                ((as30.a) obj2).c();
                return Boolean.TRUE;
            case 16:
                l7w l7wVar = (l7w) obj2;
                sxp sxpVar = (sxp) obj;
                io.reactivex.rxjava3.subjects.f<b6w> fVar2 = l7wVar.b;
                if (sxpVar.a() != null || sxpVar.a() == null) {
                    if (sxpVar instanceof r480) {
                        ArraySet k = ((r480) sxpVar).c.k();
                        ArrayList arrayList4 = new ArrayList(c5g.u(k, 10));
                        Iterator it2 = k.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(new b5w(((Number) it2.next()).longValue(), ImItemType.DIALOG));
                        }
                        fVar2.onNext(new e6w(j5g.S0(arrayList4)));
                    } else {
                        boolean z6 = sxpVar instanceof g480;
                        mpx mpxVar = mpx.a;
                        if (z6) {
                            fVar2.onNext(mpxVar);
                        } else if (sxpVar instanceof p680) {
                            if (((p680) sxpVar).c) {
                                fVar2.onNext(mpxVar);
                            }
                        } else if (sxpVar instanceof g980) {
                            fVar2.onNext(new e6w(Collections.singleton(new b5w(((g980) sxpVar).d, ImItemType.DIALOG))));
                        } else if (sxpVar instanceof p980) {
                            Set<Long> keySet = ((p980) sxpVar).d.keySet();
                            ArrayList arrayList5 = new ArrayList(c5g.u(keySet, 10));
                            Iterator<T> it3 = keySet.iterator();
                            while (it3.hasNext()) {
                                arrayList5.add(new b5w(((Number) it3.next()).longValue(), ImItemType.DIALOG));
                            }
                            fVar2.onNext(new e6w(j5g.S0(arrayList5)));
                        } else if (sxpVar instanceof r280) {
                            ArraySet k2 = ((r280) sxpVar).b.k();
                            ArrayList arrayList6 = new ArrayList(c5g.u(k2, 10));
                            Iterator it4 = k2.iterator();
                            while (it4.hasNext()) {
                                arrayList6.add(new b5w(((Number) it4.next()).longValue(), ImItemType.CHANNEL));
                            }
                            fVar2.onNext(new e6w(j5g.S0(arrayList6)));
                        } else if (sxpVar instanceof o280) {
                            Set<Long> keySet2 = ((o280) sxpVar).c.keySet();
                            ArrayList arrayList7 = new ArrayList(c5g.u(keySet2, 10));
                            Iterator<T> it5 = keySet2.iterator();
                            while (it5.hasNext()) {
                                arrayList7.add(new b5w(((Number) it5.next()).longValue(), ImItemType.CHANNEL));
                            }
                            fVar2.onNext(new e6w(j5g.S0(arrayList7)));
                        } else if (sxpVar instanceof r680) {
                            fVar2.onNext(new e6w(j5g.S0(((r680) sxpVar).c)));
                        } else if (sxpVar instanceof q680) {
                            fVar2.onNext(mpxVar);
                        } else if (sxpVar instanceof ka80) {
                            l7wVar.c.onNext(new o8w(((ka80) sxpVar).c));
                        }
                    }
                }
                return s3q0.a;
            case 17:
                int i14 = JoinCallFragment.U;
                ((wzx) obj2).a((yzx.c) obj);
                return s3q0.a;
            case 18:
                ((nxz) obj2).k.g(false);
                return s3q0.a;
            case 19:
                mb00 mb00Var = (mb00) obj2;
                mb00Var.e = null;
                mb00Var.b.L2(new jz6(false));
                return s3q0.a;
            case 20:
                Map.Entry entry = (Map.Entry) obj;
                return rl3.G((String[]) obj2, entry.getKey()) ? i5s.a(new StringBuilder(), (String) entry.getKey(), "=<HIDDEN>") : entry.toString();
            case 21:
                ((sf10) obj2).c.s(new nf10((vlo) obj));
                return s3q0.a;
            case 22:
                MasksView.b bVar4 = (MasksView.b) obj2;
                bi10 bi10Var = (bi10) obj;
                bi10.d dVar2 = bi10Var instanceof bi10.d ? (bi10.d) bi10Var : null;
                return Boolean.valueOf(epx.f(dVar2 != null ? dVar2.b : null, bVar4.b));
            case 23:
                y320.a aVar6 = (y320.a) obj;
                ca70 ca70Var = ca70.a;
                ca70.a((Context) obj2, aVar6.b, Integer.valueOf(aVar6.a));
                return s3q0.a;
            case 24:
                nw20 nw20Var = (nw20) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    return s3q0.a;
                }
                if (nw20Var.O0) {
                    bitmap.recycle();
                    return s3q0.a;
                }
                u1z.a aVar7 = nw20Var.A0;
                if (aVar7 == null) {
                    bitmap.recycle();
                    return s3q0.a;
                }
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new BitmapDrawable(nw20Var.getContext().getResources(), bitmap), aVar7});
                Window window = nw20Var.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(layerDrawable);
                }
                return s3q0.a;
            case 25:
                com.vk.im.ui.components.msg_list.a aVar8 = (com.vk.im.ui.components.msg_list.a) obj2;
                fvr.l(aVar8.k, (String) obj);
                if (aVar8.o != null) {
                    zk70.c(NotifyId.COPY_TO_CLIPBOARD_DONE);
                }
                return s3q0.a;
            case 26:
                return (xl30) ((vl30) obj2).invoke((xl30) obj);
            case 27:
                ((Ref$IntRef) obj2).element++;
                return s3q0.a;
            case 28:
                MusicPageInfoBlockVh musicPageInfoBlockVh = (MusicPageInfoBlockVh) obj2;
                musicPageInfoBlockVh.m = null;
                musicPageInfoBlockVh.l(false, true);
                return s3q0.a;
            default:
                ListDataSet listDataSet = (ListDataSet) obj2;
                Iterator it6 = ((List) obj).iterator();
                while (it6.hasNext()) {
                    listDataSet.d(((Number) it6.next()).intValue());
                }
                return s3q0.a;
        }
    }
}
