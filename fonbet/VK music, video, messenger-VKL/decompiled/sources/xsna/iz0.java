package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.widget.ProgressBar;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateExtendedResponseDto;
import com.vk.auth.api.models.AuthResult;
import com.vk.clips.favorites.impl.ui.folders.list.c;
import com.vk.clips.favorites.impl.ui.folders.picker.ClipsFavoritesFoldersPickerFragment;
import com.vk.clips.favorites.impl.ui.folders.picker.f;
import com.vk.clips.interests.api.di.ClipsInterestsComponent;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.api.recom.ShortVideoMyTargetMapperTracker;
import com.vk.clips.upload.edit.api.ClipCoverPreviewType;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.storefrontservices.api.StorefrontServicesRefSource;
import com.vk.fave.FaveItem;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.blacklist.impl.presentation.blacklist.f;
import com.vk.photos.ui.editalbum.domain.d;
import com.vk.photos.ui.editalbum.domain.g;
import com.vk.photos.ui.editalbum.presentation.CreateAlbumEntryPoint;
import com.vk.profile.community.impl.ui.profile.actions.c;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.trust_mark.CommunityTrustMarksArgs;
import com.vk.profile.community.impl.ui.trust_mark.a;
import com.vk.profile.community.impl.ui.trust_mark.b;
import com.vk.profile.community.impl.ui.trust_mark.c;
import com.vk.profile.community.impl.ui.trust_mark.d;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.OneVideoPlayer;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.c11;
import xsna.ca9;
import xsna.d4e;
import xsna.gko;
import xsna.k1u0;
import xsna.kn1;
import xsna.p4e;
import xsna.qfa0;
import xsna.tj50;
import xsna.tlo0;
import xsna.uxd0;
import xsna.x4d0;
import xsna.yre;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class iz0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iz0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r2v37, types: [io.reactivex.rxjava3.internal.operators.observable.l2] */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v73, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v84, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v95, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v98, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v79, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object, java.util.List] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        io.reactivex.rxjava3.internal.operators.observable.q qVar;
        UserId userId;
        UserId userId2;
        UserId userId3;
        CommunityTrustMarksArgs.TrustMarkData.Type type;
        int i = 22;
        int i2 = 16;
        int i3 = 28;
        int i4 = 4;
        int i5 = 24;
        int i6 = 3;
        int i7 = 14;
        int i8 = 15;
        ?? r10 = 1;
        int i9 = 10;
        MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType blockType = null;
        blockType = null;
        blockType = null;
        int i10 = 0;
        switch (this.b) {
            case 0:
                mz0 mz0Var = ((com.vk.clips.sdk.shared.item.ads.d) this.c).d;
                mz0Var.getClass();
                return new c11.a(((tj50.a) obj).a(new lz0(mz0Var, i10), ao8.d));
            case 1:
                ji1 ji1Var = (ji1) this.c;
                ji1Var.n.a(((kn1.a) ji1Var.m).a);
                return s3q0.a;
            case 2:
                return (AuthResult) this.c;
            case 3:
                r46 r46Var = (r46) this.c;
                r46Var.k(new uxd0.c0(r46Var.c, new ng1((io.reactivex.rxjava3.disposables.c) obj, i4)));
                return s3q0.a;
            case 4:
                View view = (View) obj;
                View.OnClickListener onClickListener = ((BaseVkSearchView) this.c).I;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                return s3q0.a;
            case 5:
                ((com.vk.feed.blacklist.impl.presentation.blacklist.b) this.c).g.b(new f.b.a((Throwable) obj));
                return s3q0.a;
            case 6:
                return ca9.c.a((ca9.c) obj, null, null, null, null, null, null, null, null, null, null, false, null, null, (CallMemberId) ((it80) this.c).a, null, false, null, false, null, false, null, -1073741825, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            case 7:
                rkb rkbVar = (rkb) this.c;
                rkbVar.h.onNext(rkbVar.a(rkbVar.b.a(rkbVar.g), rkbVar.b()));
                return s3q0.a;
            case 8:
                ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.b(new d5(i6, (ymb) this.c, (p980) obj));
                return s3q0.a;
            case 9:
                ((c9d) this.c).j = Boolean.valueOf(((OneVideoPlayer) obj).getState() == OneVideoPlayer.State.PLAYING);
                return s3q0.a;
            case 10:
                zld zldVar = ((cmd) this.c).C;
                if (zldVar != null) {
                    cmd cmdVar = zldVar.d;
                    mef mefVar = zldVar.f;
                    if (zldVar.j) {
                        zldVar.k = ClipCoverPreviewType.GALLERY;
                        hg1.b(cmdVar, new io.reactivex.rxjava3.internal.operators.single.v(new uld(zldVar, i10)).q(mefVar.a().e().c()).m(mefVar.a().e().d()).subscribe(new az(new com.vk.movika.sdk.base.observable.c(zldVar, i5), i8), new io1(new com.vk.movika.sdk.base.observable.e(zldVar, i), i2)));
                    } else {
                        zldVar.k = ClipCoverPreviewType.ORIGINAL;
                        x4d0 x4d0Var = zldVar.e;
                        boolean z = x4d0Var instanceof x4d0.a;
                        if (z) {
                            cv10 cv10Var = zldVar.h;
                            if (cv10Var != null) {
                                cv10Var.release();
                            }
                            zldVar.h = null;
                            OneVideoPlayer oneVideoPlayer = zldVar.p;
                            if (oneVideoPlayer != null) {
                                oneVideoPlayer.release();
                            }
                            cmdVar.release();
                        }
                        if (z) {
                            qVar = new io.reactivex.rxjava3.internal.operators.observable.s0(new wld(i10, zldVar, cmdVar.getPlayerViewSize())).r0(mefVar.a().e().e(10, "clips-cover-thread"));
                        } else {
                            if (!(x4d0Var instanceof x4d0.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            qVar = new io.reactivex.rxjava3.internal.operators.observable.q(new kb(zldVar, i8));
                        }
                        int i11 = 8;
                        hg1.b(cmdVar, hg1.m(qVar, zldVar.b, 0L, false, 62).U(new y7(new x7(zldVar, 27), i11)).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ff3(new com.vk.im.ui.fragments.b(zldVar, i3), i11), new ov2(new zt4(zldVar, i7), i9)));
                    }
                }
                return s3q0.a;
            case 11:
                ((com.vk.clips.favorites.impl.ui.folders.list.b) this.c).T(new c.b(((d4e.a.e) obj).a));
                return s3q0.a;
            case 12:
                f.b bVar = (f.b) obj;
                p4e p4eVar = ((ClipsFavoritesFoldersPickerFragment) this.c).T;
                if (p4eVar == null) {
                    p4eVar = null;
                }
                List<View> list = p4eVar.j;
                ComposeView composeView = p4eVar.f;
                ProgressBar progressBar = p4eVar.e;
                if (bVar.equals(f.b.c.a)) {
                    dw20 dw20Var = p4eVar.k;
                    if (dw20Var != null) {
                        dw20Var.hide();
                    }
                    p4eVar.k = null;
                } else if (bVar.equals(f.b.d.a)) {
                    p4eVar.a();
                    progressBar.setVisibility(0);
                    f4m.j(composeView);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        f4m.j((View) it.next());
                    }
                } else if (bVar.equals(f.b.C0612b.a)) {
                    p4eVar.a();
                    f4m.j(progressBar);
                    composeView.setVisibility(0);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        f4m.j((View) it2.next());
                    }
                } else {
                    if (!(bVar instanceof f.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    p4eVar.a();
                    f4m.j(progressBar);
                    f4m.j(composeView);
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        ((View) it3.next()).setVisibility(0);
                    }
                    f.b.a aVar = (f.b.a) bVar;
                    f.a aVar2 = aVar.a;
                    p4e.a aVar3 = p4eVar.g;
                    aVar3.a.setLeftMainViewController(new s4e());
                    VkCell vkCell = aVar3.a;
                    r4e r4eVar = new r4e(aVar2.a);
                    VkCell.Left.Main.Size size = VkCell.Left.Main.Size.Medium;
                    Context context = p4eVar.a;
                    vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.e(r4eVar, new Size(size.k(context), size.k(context))), null));
                    vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(oq.d(tlo0.Companion, aVar2.b), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), (VkCell.Middle.d) null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 14));
                    boolean z2 = aVar2.c;
                    int i12 = z2 ? R.drawable.vk_icon_bookmark_28 : R.drawable.vk_icon_bookmark_outline_28;
                    gko.b bVar2 = gko.Companion;
                    vkCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, new VkCell.Right.e.b((dko) new gko(i12), (k1u0) new k1u0.a(z2 ? new x7g(R.attr.vk_ui_accent_orange) : new x7g(R.attr.vk_ui_icon_tertiary)), (Size) null, (tlo0) (z2 ? new tlo0.f(R.string.favorites_remove) : new tlo0.f(R.string.favorites_add)), false, (gzs) new eu1(p4eVar, i), 20), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 29));
                    RecyclerView recyclerView = p4eVar.i;
                    if (recyclerView.getAdapter() == null) {
                        recyclerView.setAdapter(new l4e(p4eVar.b));
                    }
                    ((l4e) recyclerView.getAdapter()).setItems(aVar.b);
                }
                return s3q0.a;
            case 13:
                ClipsPlaylist clipsPlaylist = (ClipsPlaylist) this.c;
                w9y w9yVar = (w9y) obj;
                w9yVar.c(Integer.valueOf(clipsPlaylist.b), "id");
                w9yVar.e(clipsPlaylist.c, "name");
                w9yVar.e(clipsPlaylist.d, "cover");
                w9yVar.c(Integer.valueOf(clipsPlaylist.e), "size");
                w9yVar.d(Long.valueOf(clipsPlaylist.f.b), "oid");
                w9yVar.b(Boolean.valueOf(clipsPlaylist.g), "is_owner");
                w9yVar.e(clipsPlaylist.h, "thumb_hash");
                return s3q0.a;
            case 14:
                tj50.a aVar4 = (tj50.a) obj;
                xre xreVar = (xre) ((sre) this.c).d.getValue();
                xreVar.getClass();
                vr0 vr0Var = new vr0(17);
                ao8 ao8Var = ao8.d;
                return new yre.a.d(aVar4.a(vr0Var, ao8Var), aVar4.a(new dj1(xreVar, i8), ao8Var), aVar4.a(new pe1(i9), ao8Var), aVar4.a(new ve0(i2), ao8Var));
            case 15:
                ShortVideoMyTargetMapperTracker shortVideoMyTargetMapperTracker = (ShortVideoMyTargetMapperTracker) this.c;
                Throwable th = (Throwable) obj;
                com.vk.metrics.eventtracking.b.a.a(th);
                if (shortVideoMyTargetMapperTracker != null) {
                    shortVideoMyTargetMapperTracker.a(ShortVideoMyTargetMapperTracker.MyTargetType.STATIC, th);
                }
                return s3q0.a;
            case 16:
                return (ShortVideoGetTemplateExtendedResponseDto) this.c;
            case 17:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.c;
                int i13 = ClipsWrapperFragment.Q0;
                io.reactivex.rxjava3.internal.operators.maybe.x k = ((ClipsInterestsComponent) clipsWrapperFragment.c0.getValue()).e().b(clipsWrapperFragment.requireContext()).k(asu0.a.d());
                t00 t00Var = new t00(new t40(clipsWrapperFragment, i3), 18);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                clipsWrapperFragment.I0 = new io.reactivex.rxjava3.internal.operators.maybe.s(new io.reactivex.rxjava3.internal.operators.maybe.b0(k, lVar, t00Var, lVar, kVar, kVar)).subscribe();
                return s3q0.a;
            case 18:
                ((weh) this.c).d.invoke(new d.j.k0(weh.e + ((UserId) obj).b));
                return s3q0.a;
            case 19:
                com.vk.profile.community.impl.ui.trust_mark.a aVar5 = (com.vk.profile.community.impl.ui.trust_mark.a) this.c;
                ?? r2 = aVar5.k1;
                com.vk.profile.community.impl.ui.trust_mark.c cVar = (com.vk.profile.community.impl.ui.trust_mark.c) obj;
                int i14 = com.vk.profile.community.impl.ui.trust_mark.a.p1;
                Context mo2getContext = aVar5.mo2getContext();
                if (mo2getContext != null) {
                    if (cVar instanceof c.a) {
                        CommunityTrustMarksArgs.ActionButton.Type type2 = ((c.a) cVar).a;
                        Context mo2getContext2 = aVar5.mo2getContext();
                        if (mo2getContext2 != null && (userId3 = aVar5.i1) != null) {
                            CommunityTrustMarksArgs communityTrustMarksArgs = aVar5.h1;
                            if (communityTrustMarksArgs != null && (type = communityTrustMarksArgs.c.b) != null) {
                                switch (d.a.$EnumSwitchMapping$0[type.ordinal()]) {
                                    case 1:
                                        blockType = MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType.VERIFIED_BUSINESS;
                                        break;
                                    case 2:
                                        blockType = MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType.POPULAR_SHOP;
                                        break;
                                    case 3:
                                        blockType = MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType.FRIENDS_TRUST_MARK;
                                        break;
                                    case 4:
                                        blockType = MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType.MANY_YEARS_IN_VK;
                                        break;
                                    case 5:
                                        blockType = MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType.YC_INTEGRATION;
                                        break;
                                    case 6:
                                        blockType = MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType.EXTERNAL_INTEGRATION;
                                        break;
                                    case 7:
                                        blockType = MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType.FREE_DELIVERY;
                                        break;
                                    case 8:
                                        blockType = MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType.HAS_DERLIVERY;
                                        break;
                                    case 9:
                                        blockType = MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType.SELF_DELIVERY;
                                        break;
                                    case 10:
                                    case 11:
                                    case 12:
                                        blockType = MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType.PURCHASE_INFO;
                                        break;
                                }
                            }
                            MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType blockType2 = blockType;
                            int i15 = a.b.$EnumSwitchMapping$1[type2.ordinal()];
                            if (i15 == 1) {
                                rml0.a((rml0) aVar5.n1.getValue(), mo2getContext2, userId3, new MarketAnalyticsParams(null, null, CommonMarketStat$TypeRefSource.COMMUNITY_TRUST_MARKS, null, null, null, null, false, null, false, false, blockType2, false, 6139, null), 24);
                            } else if (i15 == 2) {
                                com.vk.ecomm.storefrontservices.api.a.a((com.vk.ecomm.storefrontservices.api.a) aVar5.o1.getValue(), mo2getContext2, userId3, null, null, null, false, StorefrontServicesRefSource.COMMUNITY_TRUST_MARKS, String.valueOf(blockType2), 188);
                            } else {
                                if (i15 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c.b bVar3 = aVar5.j1;
                                if (bVar3 != null) {
                                    bVar3.invoke(b.c.a);
                                }
                            }
                        }
                        aVar5.dismiss();
                    } else if (cVar instanceof c.g) {
                        CommunityTrustMarksArgs.TrustMarkData.Type type3 = ((c.g) cVar).a;
                        Context mo2getContext3 = aVar5.mo2getContext();
                        if (mo2getContext3 != null && (userId2 = aVar5.i1) != null && a.b.$EnumSwitchMapping$0[type3.ordinal()] == 1) {
                            xqg.b((xqg) aVar5.l1.getValue(), mo2getContext3, fkq0.a(userId2), null, null, null, false, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        }
                        aVar5.dismiss();
                    } else if (cVar instanceof c.b) {
                        c.b bVar4 = (c.b) cVar;
                        CommunityTrustMarksArgs.TrustMarkData.Type type4 = bVar4.a;
                        CommunityTrustMarksArgs.AdminButtons adminButtons = bVar4.b;
                        Context mo2getContext4 = aVar5.mo2getContext();
                        if (mo2getContext4 != null && (userId = aVar5.i1) != null) {
                            int i16 = a.b.$EnumSwitchMapping$0[type4.ordinal()];
                            if (i16 == 2) {
                                maz.c((maz) r2.getValue(), mo2getContext4, adminButtons.b, LaunchContext.A, null, null, 24);
                            } else if (i16 == 3) {
                                maz.c((maz) r2.getValue(), mo2getContext4, adminButtons.c, LaunchContext.A, null, null, 24);
                            } else if (i16 == 4) {
                                maz.c((maz) r2.getValue(), mo2getContext4, adminButtons.d, LaunchContext.A, null, null, 24);
                            } else if (i16 == 5) {
                                ((wnr0) aVar5.m1.getValue()).b(mo2getContext4, fkq0.a(userId), "base");
                            }
                        }
                        aVar5.dismiss();
                    } else if (cVar instanceof c.f) {
                        maz.c((maz) r2.getValue(), mo2getContext, ((c.f) cVar).a, LaunchContext.A, null, null, 24);
                        aVar5.dismiss();
                    } else if (cVar instanceof c.d) {
                        c.b bVar5 = aVar5.j1;
                        if (bVar5 != null) {
                            bVar5.invoke(new b.a(((c.d) cVar).a));
                        }
                    } else if (cVar instanceof c.C1630c) {
                        aVar5.dismiss();
                    } else {
                        if (!(cVar instanceof c.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar5.dismiss();
                        c.b bVar6 = aVar5.j1;
                        if (bVar6 != null) {
                            bVar6.invoke(b.C1629b.a);
                        }
                    }
                }
                return s3q0.a;
            case 20:
                return Boolean.valueOf(!((i2l) this.c).a.contains(((t200) obj).a));
            case 21:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
                String[] strArr = DebugDevSettingsFragment.t0;
                String join = String.join(StringUtils.COMMA, (List) Arrays.stream(VideoUrl.values()).filter(new x3l((List) obj, i10)).map(new uqk(r10 == true ? 1 : 0)).collect(Collectors.toList()));
                o2l.a.getClass();
                o2l.j("__dbg_video_choose_urls", join);
                enj.r(debugDevSettingsFragment.mo2getContext(), "Please restart the app!", 0);
                return s3q0.a;
            case 22:
                ((g3m) this.c).d();
                return s3q0.a;
            case 23:
                ((ebm) this.c).X0((xpp) obj);
                return s3q0.a;
            case 24:
                dfm dfmVar = ((afm) this.c).z;
                if (dfmVar != null) {
                    dfmVar.n();
                }
                return s3q0.a;
            case 25:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, (ArrayList) this.c, null, 0, null, 0, -1, 2088959);
            case 26:
                ((DiscoverSearchFragment) this.c).l0 = null;
                return s3q0.a;
            case 27:
                com.vk.photos.ui.editalbum.domain.c cVar2 = (com.vk.photos.ui.editalbum.domain.c) this.c;
                PhotoAlbum photoAlbum = (PhotoAlbum) obj;
                ysg0.b.a(new cl1(photoAlbum));
                f4z f4zVar = cVar2.g;
                tlo0.a aVar6 = tlo0.Companion;
                Object[] objArr = {photoAlbum.g};
                aVar6.getClass();
                f4zVar.b(new g.k(new j7k0(tlo0.a.c(R.string.photo_flow_settings_snackbar, objArr), Integer.valueOf(R.drawable.vk_icon_check_circle_outline_28), Integer.valueOf(R.attr.vk_ui_icon_positive), new tlo0.f(R.string.photo_flow_settings_snackbar_action), new sfg(cVar2, i7), null, 32), TimeUnit.SECONDS.toMillis(1L), g.e.a));
                f4zVar.b(new g.a(photoAlbum));
                d.a aVar7 = cVar2.f.i;
                qfa0.a aVar8 = aVar7.a;
                CreateAlbumEntryPoint createAlbumEntryPoint = aVar7.b;
                aVar8.e(createAlbumEntryPoint != null ? createAlbumEntryPoint.b : null);
                return s3q0.a;
            case 28:
                wjp wjpVar = ((ikp) this.c).h;
                if (wjpVar != null) {
                    wjpVar.q();
                }
                return s3q0.a;
            default:
                gpq gpqVar = (gpq) this.c;
                wsq wsqVar = (wsq) obj;
                ad90 ad90Var = wsqVar.b;
                iqq iqqVar = wsqVar.a;
                if (ad90Var != null) {
                }
                List<FaveItem> list2 = iqqVar.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    gmq gmqVar = ((FaveItem) obj2).f;
                    if (!(gmqVar instanceof VideoAttachment) || !((VideoAttachment) gmqVar).k.Q0()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    FaveItem faveItem = (FaveItem) it4.next();
                    gnq.a.getClass();
                    arrayList2.add(new FaveEntry(faveItem, false, gnq.b(faveItem.f)));
                }
                ad90 ad90Var2 = wsqVar.b;
                return new crq(arrayList2, ad90Var2 != null ? new tqq(ad90Var2.a, ad90Var2.b, ad90Var2.c) : null, iqqVar.d);
        }
    }

    public /* synthetic */ iz0(afm afmVar, Boolean bool) {
        this.b = 24;
        this.c = afmVar;
    }
}
