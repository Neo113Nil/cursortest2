package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.BiometricsLockPinFragment;
import com.vk.clips.favorites.impl.ui.folders.list.c;
import com.vk.clips.playlists.ui.picker.c;
import com.vk.clips.sdk.shared.item.clips_grid_block.presentation.c;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.ecomm.checklist.impl.domain.model.CommunityCheckListTip;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.h7u0;
import xsna.ig3;
import xsna.jge;
import xsna.o8e;
import xsna.pec;
import xsna.q97;
import xsna.qvq;
import xsna.sst0;
import xsna.tlo0;
import xsna.x7b;
import xsna.xf8;
import xsna.zh8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class po1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ po1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        if (xsna.epx.f(r5 != null ? r5.b : null, r1) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010b, code lost:
    
        if (xsna.brm0.B(r2, java.lang.String.valueOf(r1.b), false) != true) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ww50 Y;
        Iterator it;
        Owner s;
        VideoFile videoFile;
        Object obj2;
        int i = this.b;
        UserId userId = null;
        userId = null;
        boolean z = true;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                return Boolean.valueOf(((ro1) obj3).e.contains(Integer.valueOf(((PhotoAlbum) obj).b)));
            case 1:
                int i2 = ArchiveFragment.e0;
                ((ArchiveFragment) obj3).getFeature().C(new ig3.m((PhotoAlbumWrapper) obj));
                return s3q0.a;
            case 2:
                ((ow3) obj3).b.invoke();
                return s3q0.a;
            case 3:
                ((bh4) obj3).F.getClass();
                return e3a.b((CatalogCatalogResponseObjectDto) obj);
            case 4:
                final bzd bzdVar = bzd.this;
                gxd gxdVar = bzdVar.e.f;
                Context ctx = bzdVar.c.getCtx();
                int i3 = h7u0.p;
                h7u0.a c = h7u0.b.c(ctx);
                c.g0(R.string.clips_audio_extraction_error_title);
                c.U(R.string.clips_audio_extraction_error_explanation);
                c.c0(R.string.clips_audio_extraction_error_retry_btn, new nv(bzdVar, 1));
                c.W(R.string.clips_audio_extraction_error_close_btn, new o1c());
                c.a0(new DialogInterface.OnDismissListener() { // from class: xsna.czd
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        szd szdVar = bzd.this.p;
                        com.vk.clips.editor.state.model.a b = szdVar.b();
                        szdVar.c(com.vk.clips.editor.state.model.a.c(szdVar.o.a, null, null, b != null ? b.d : null, null, null, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), EmptyList.b);
                    }
                });
                c.m();
                return s3q0.a;
            case 5:
                f550 f550Var = ((bd5) obj3).c;
                if (f550Var != null) {
                    f550Var.invoke();
                }
                return s3q0.a;
            case 6:
                ((mx6) obj3).c.e();
                return s3q0.a;
            case 7:
                BiometricsLockPinFragment biometricsLockPinFragment = (BiometricsLockPinFragment) obj3;
                int i4 = BiometricsLockPinFragment.c0;
                fsk0 fsk0Var = qsk0.a;
                fsk0Var.e(null);
                biometricsLockPinFragment.X.a().onNext(q97.a.a);
                fsk0Var.e(null);
                biometricsLockPinFragment.finish();
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b == null || (Y = s200.v(b)) == null) {
                    NavigationDelegateActivity a = x93.a();
                    Y = a != null ? a.Y() : null;
                }
                if (Y != null) {
                    Y.K(null);
                }
                return s3q0.a;
            case 8:
                ((wf8) obj3).d(xf8.e.a);
                return s3q0.a;
            case 9:
                yh8 yh8Var = (yh8) obj3;
                zh8.c cVar = zh8.c.a;
                if (yh8Var.s) {
                    yh8Var.p.onNext(cVar);
                }
                return s3q0.a;
            case 10:
                ((fg9) obj3).m.C0();
                return s3q0.a;
            case 11:
                ((AtomicBoolean) obj3).set(true);
                return s3q0.a;
            case 12:
                x7b x7bVar = (x7b) obj;
                y7b y7bVar = ((q7b) obj3).j1;
                if (y7bVar != null) {
                    Context context = y7bVar.a;
                    qdz qdzVar = y7bVar.b;
                    if (x7bVar instanceof x7b.c) {
                        qdzVar.e().d(context, Uri.parse(y7b.d), LaunchContext.A, null);
                    } else if (x7bVar instanceof x7b.a) {
                        UserId userId2 = ((x7b.a) x7bVar).a;
                        qdzVar.e().d(context, Uri.parse(y7b.e + userId2), LaunchContext.A, null);
                    } else {
                        if (!(x7bVar instanceof x7b.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        y7bVar.c.invoke();
                    }
                }
                return s3q0.a;
            case 13:
                ((com.vk.channels.impl.list.b) obj3).s().b((Throwable) obj, new l9(5));
                return s3q0.a;
            case 14:
                ((ftb) obj3).e.r((Throwable) obj);
                return s3q0.a;
            case 15:
                int i5 = rec.j1;
                ((rec) obj3).getFeature().C(new pec.a((uec) obj));
                return s3q0.a;
            case 16:
                int i6 = ClipFeedListFragment.a2;
                ((ClipFeedListFragment) obj3).Do().getFeature().a(new qvq.i.e(false, (String) obj));
                return s3q0.a;
            case 17:
                w6d w6dVar = (w6d) obj3;
                VideoFile videoFile2 = (VideoFile) obj;
                p8e p8eVar = w6dVar.h;
                if (p8eVar != null) {
                    p8eVar.a(new o8e(videoFile2.I0(), videoFile2.o0(), o8e.a.C3443a.a));
                }
                return w6dVar.g.Hl(k15.B(videoFile2));
            case 18:
                c9d c9dVar = (c9d) obj3;
                c9dVar.v(new com.vk.movika.sdk.base.data.a(c9dVar, 22));
                return s3q0.a;
            case 19:
                ((com.vk.clips.favorites.impl.ui.folders.list.b) obj3).T(new c.d.C0602d((b4e) obj));
                return s3q0.a;
            case 20:
                com.vk.clips.sdk.shared.item.clips_grid_block.presentation.a aVar = (com.vk.clips.sdk.shared.item.clips_grid_block.presentation.a) obj3;
                aVar.T(c.g.b.b);
                aVar.T(new c.h(aVar.V((List) obj)));
                return s3q0.a;
            case 21:
                return Boolean.valueOf(((List) obj3).containsAll(((jge.b) obj).a.a));
            case 22:
                ((com.vk.clips.playlists.ui.picker.b) obj3).T(new c.a(false));
                return s3q0.a;
            case 23:
                qgi0.h((tgi0) obj, ((eug) obj3).getResources().getString(R.string.community_profile_channel_go_into));
                return s3q0.a;
            case 24:
                twg twgVar = (twg) obj;
                ((pwg) obj3).d.getClass();
                uy9 uy9Var = twgVar.j;
                hwg hwgVar = new hwg((String) uy9Var.b, (String) uy9Var.c, tq.h(tlo0.Companion, R.string.community_check_list_header_title), new tlo0.f(R.string.community_check_list_header_description), tlo0.a.c(R.string.community_check_list_header_progress, Integer.valueOf(twgVar.b), Integer.valueOf(twgVar.c)), twgVar.b, twgVar.c);
                ArrayList arrayList = new ArrayList();
                arrayList.add(hwgVar);
                List<svg> list = twgVar.d;
                int i7 = 10;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    svg svgVar = (svg) it2.next();
                    ArrayList arrayList3 = new ArrayList();
                    String str = svgVar.b;
                    tlo0.a aVar2 = tlo0.Companion;
                    Object[] objArr = {Integer.valueOf(svgVar.d), Integer.valueOf(svgVar.e)};
                    aVar2.getClass();
                    arrayList3.add(new vvg(str, tlo0.a.c(R.string.community_check_list_category_title_progress, objArr)));
                    List<CommunityCheckListTip> list2 = svgVar.c;
                    ArrayList arrayList4 = new ArrayList(c5g.u(list2, i7));
                    for (CommunityCheckListTip communityCheckListTip : list2) {
                        CommunityCheckListTip.Type type = communityCheckListTip.d;
                        tlo0.a aVar3 = tlo0.Companion;
                        boolean z2 = communityCheckListTip.e;
                        boolean z3 = z;
                        String str2 = communityCheckListTip.a;
                        if (z2) {
                            SpannableString spannableString = new SpannableString(str2);
                            it = it2;
                            spannableString.setSpan(new StrikethroughSpan(), 0, str2.length(), 33);
                            str2 = spannableString;
                        } else {
                            it = it2;
                        }
                        arrayList4.add(new vwg(type, u11.f(aVar3, str2), communityCheckListTip.e, communityCheckListTip.b, communityCheckListTip.c));
                        z = z3;
                        it2 = it;
                    }
                    g5g.y(arrayList4, arrayList3);
                    arrayList2.add(new uvg(svgVar.a, arrayList3));
                    z = z;
                    i7 = 10;
                }
                boolean z4 = z;
                g5g.y(arrayList2, arrayList);
                nwg nwgVar = twgVar.e;
                if (nwgVar != null) {
                    zbh zbhVar = new zbh(tq.h(tlo0.Companion, R.string.community_check_list_partner_banner_title));
                    dch dchVar = new dch(nwgVar.a, nwgVar.b, nwgVar.d, nwgVar.e, nwgVar.c);
                    hfz[] hfzVarArr = new hfz[2];
                    hfzVarArr[0] = zbhVar;
                    hfzVarArr[z4 ? 1 : 0] = dchVar;
                    arrayList.add(new uvg("", e43.l(hfzVarArr)));
                }
                return arrayList;
            case 25:
                qlh qlhVar = (qlh) obj3;
                UserId userId3 = qlhVar.a;
                bwr0 bwr0Var = (bwr0) obj;
                if (bwr0Var instanceof wxr0) {
                    wxr0 wxr0Var = (wxr0) bwr0Var;
                    if (!wxr0Var.a.C2()) {
                        Owner s2 = wxr0Var.a.s();
                        break;
                    }
                    z = false;
                } else if (bwr0Var instanceof fyr0) {
                    fyr0 fyr0Var = (fyr0) bwr0Var;
                    List<sst0.b> list3 = qlhVar.l;
                    if (list3 != null) {
                        Iterator<T> it3 = list3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj2 = it3.next();
                                if (epx.f(((sst0.b) obj2).a.a1(), fyr0Var.a.a1())) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        sst0.b bVar = (sst0.b) obj2;
                        if (bVar != null) {
                            videoFile = bVar.a;
                            z = edi.v(userId3, fyr0Var, videoFile instanceof VideoFileOld ? (VideoFileOld) videoFile : null);
                        }
                    }
                    videoFile = null;
                    z = edi.v(userId3, fyr0Var, videoFile instanceof VideoFileOld ? (VideoFileOld) videoFile : null);
                } else if (bwr0Var instanceof cwr0) {
                    cwr0 cwr0Var = (cwr0) bwr0Var;
                    VideoFile videoFile3 = cwr0Var.a;
                    if (videoFile3 != null && !videoFile3.C2()) {
                        VideoFile videoFile4 = cwr0Var.a;
                        if (videoFile4 != null && (s = videoFile4.s()) != null) {
                            userId = s.b;
                        }
                        if (!epx.f(userId, userId3)) {
                            String str3 = cwr0Var.b;
                            if (str3 != null) {
                                break;
                            }
                        }
                    }
                    z = false;
                } else if (bwr0Var instanceof hwr0) {
                    z = epx.f(((hwr0) bwr0Var).a.c, userId3);
                } else if (bwr0Var instanceof jwr0) {
                    z = epx.f(((jwr0) bwr0Var).a.c, userId3);
                } else {
                    if (bwr0Var instanceof ewr0) {
                        z = epx.f(((ewr0) bwr0Var).a.c, userId3);
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                com.vk.profile.community.impl.ui.profile.f fVar = (com.vk.profile.community.impl.ui.profile.f) obj3;
                CommunityProfileViewState.Data.LoadingState loadingState = (CommunityProfileViewState.Data.LoadingState) obj;
                fVar.t.c(loadingState);
                boolean z5 = loadingState == CommunityProfileViewState.Data.LoadingState.NONE || loadingState == CommunityProfileViewState.Data.LoadingState.ACTION_LOADING;
                fVar.F = z5;
                SwipeRefreshLayout swipeRefreshLayout = fVar.o;
                if (z5 && fVar.G) {
                    fVar.j.getClass();
                } else {
                    z = false;
                }
                swipeRefreshLayout.setEnabled(z);
                return s3q0.a;
            case 27:
                f4g0 f4g0Var = (f4g0) obj;
                e2g0 e2g0Var = ((CommunityRepliesFragment) obj3).Z;
                if (e2g0Var != null) {
                    e2g0Var.n(f4g0Var.a(), f4g0Var.b(), f4g0Var.c());
                }
                return s3q0.a;
            case 28:
                ((e4n) obj3).m = null;
                return s3q0.a;
            default:
                baf0 baf0Var = (baf0) obj3;
                ojt ojtVar = (ojt) obj;
                ojtVar.d = baf0Var;
                ojtVar.h = baf0Var;
                return s3q0.a;
        }
    }
}
