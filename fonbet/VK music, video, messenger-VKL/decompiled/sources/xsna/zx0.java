package xsna;

import android.app.Dialog;
import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.articles.authorpage.ui.ArticleAuthorPageFragment;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.catalog2.feature.search.holders.SearchSpellcheckVh;
import com.vk.channels.api.ChannelActionInProgress;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.documents.impl.ui.fragments.AttachDocumentsFragment;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.log.L;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stories.design.view.viewer.AnimatedSubtitleView;
import com.vk.voip.ui.media_request.VoipEnableOwnMicAndVideoRequestedDialog;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.maybe.c;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.c11;
import xsna.f4b;
import xsna.f69;
import xsna.gm50;
import xsna.h7u0;
import xsna.ikv0;
import xsna.ipb;
import xsna.kq1;
import xsna.lpe0;
import xsna.qv4;
import xsna.wt5;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class zx0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zx0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0343, code lost:
    
        r4 = xsna.d3m.c(r2.c, (r15 & 1) != 0 ? 300 : r2.q, (r15 & 2) != 0 ? 0 : 0, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v20, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.util.Size, java.lang.String, xsna.ikv0$d$a] */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Window window;
        Window window2;
        TextView textView;
        ViewPropertyAnimator c;
        ViewPropertyAnimator c2;
        gvw0 gvw0Var;
        int i = this.b;
        int i2 = 6;
        int i3 = 3;
        int i4 = 1;
        byte b = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                com.vk.clips.sdk.shared.item.ads.c cVar = (com.vk.clips.sdk.shared.item.ads.c) obj2;
                gm50.a.a(cVar, ((c11.a) obj).a, new ay0(cVar, b));
                return s3q0.a;
            case 1:
                xp1 xp1Var = (xp1) obj2;
                kq1 kq1Var = (kq1) obj;
                int i5 = xp1.l1;
                if (kq1Var.equals(kq1.a.a)) {
                    xp1Var.Qn(true);
                    xp1Var.hide();
                } else if (kq1Var instanceof kq1.b) {
                    PhotoAlbum photoAlbum = ((kq1.b) kq1Var).a;
                    int i6 = (!photoAlbum.x || photoAlbum.w) ? R.string.delete_album_dialog_description : R.string.delete_album_dialog_description_flow;
                    int i7 = h7u0.p;
                    h7u0.a c3 = h7u0.b.c(xp1Var.requireContext());
                    c3.g0(R.string.delete_album_dialog_title);
                    c3.a.f = xp1Var.getString(i6);
                    c3.c0(R.string.delete_album_dialog_delete, new wp1(b, xp1Var, photoAlbum));
                    c3.W(R.string.delete_album_dialog_cancel, null);
                    c3.m();
                } else if (kq1Var instanceof kq1.d) {
                } else if (kq1Var instanceof kq1.c) {
                    Throwable th = ((kq1.c) kq1Var).a;
                    Dialog dialog = xp1Var.s;
                    if (dialog != null && (window2 = dialog.getWindow()) != null) {
                        String g = j03.g(xp1Var.mo2getContext(), th, R.string.error);
                        ikv0.a aVar = new ikv0.a(xp1Var.requireContext());
                        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_warning_triangle_outline_28, Integer.valueOf(R.attr.vk_ui_accent_orange), (Size) r7, 12);
                        aVar.u = new ikv0.d(g, (String) r7, (ikv0.d.a) r7, i2);
                        aVar.b().d(window2);
                    }
                } else {
                    if (!(kq1Var instanceof kq1.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j7k0 j7k0Var = ((kq1.e) kq1Var).a;
                    Dialog dialog2 = xp1Var.s;
                    if (dialog2 != null && (window = dialog2.getWindow()) != null) {
                        j7k0Var.a(xp1Var.requireContext(), new yp1(xp1Var, 0)).d(window);
                    }
                }
                return s3q0.a;
            case 2:
                int i8 = AnimatedSubtitleView.f;
                ((x0n0) obj2).h.invoke();
                return s3q0.a;
            case 3:
                ((kg3) obj2).l.invoke();
                return s3q0.a;
            case 4:
                AdminLeaveAction adminLeaveAction = (AdminLeaveAction) obj;
                final gn3 gn3Var = ((ArticleAuthorPageFragment) obj2).a0;
                if (gn3Var != null) {
                    ArticleAuthorPageFragment articleAuthorPageFragment = gn3Var.b;
                    final pm3 pm3Var = gn3Var.e;
                    if (pm3Var != null) {
                        Owner owner = pm3Var.a;
                        final boolean a = pm3Var.a();
                        final boolean z = pm3Var.h;
                        owner.g(4, false);
                        pm3Var.h = false;
                        articleAuthorPageFragment.po(pm3Var);
                        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new hqu(fkq0.e(owner.b), (String) null, (String) null, adminLeaveAction, 20), null, null, 3);
                        fu0 fu0Var = new fu0(new pt(i2), i4);
                        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                        io.reactivex.rxjava3.core.q m = hg1.m(y0.E(fu0Var, lVar, kVar, kVar), articleAuthorPageFragment.getActivity(), 0L, false, 62);
                        int i9 = kwg0.a;
                        m.subscribe(new iwg0(), new io.reactivex.rxjava3.functions.f() { // from class: xsna.an3
                            @Override // io.reactivex.rxjava3.functions.f
                            public final void accept(Object obj3) {
                                Throwable th2 = (Throwable) obj3;
                                pm3 pm3Var2 = pm3.this;
                                pm3Var2.a.g(4, a);
                                pm3Var2.h = z;
                                ArticleAuthorPageFragment articleAuthorPageFragment2 = gn3Var.b;
                                articleAuthorPageFragment2.po(pm3Var2);
                                articleAuthorPageFragment2.lo(th2);
                                com.vk.metrics.eventtracking.b.a.a(th2);
                            }
                        });
                    }
                }
                return s3q0.a;
            case 5:
                AttachDocumentsFragment attachDocumentsFragment = (AttachDocumentsFragment) obj2;
                Throwable th2 = (Throwable) obj;
                int i10 = AttachDocumentsFragment.R0;
                attachDocumentsFragment.zo(2);
                ViewGroup viewGroup = attachDocumentsFragment.K0;
                if (viewGroup != null && (textView = (TextView) viewGroup.findViewById(R.id.error_text)) != null) {
                    textView.setText(((th2 instanceof VKApiExecutionException) && ((VKApiExecutionException) th2).s() == 15) ? R.string.docs_types_disabled : R.string.vk_common_network_error);
                }
                return s3q0.a;
            case 6:
                zh4 zh4Var = (zh4) obj2;
                List list = (List) obj;
                if (list != null) {
                    qi4 qi4Var = zh4Var.i1;
                    if (qi4Var == null) {
                        qi4Var = null;
                    }
                    qi4Var.Uc(new ri4(1, null, list));
                } else {
                    int i11 = zh4.k1;
                }
                return s3q0.a;
            case 7:
                pv4 pv4Var = (pv4) obj2;
                qv4 qv4Var = (qv4) obj;
                View view = pv4Var.i;
                if (view != null && bwt0.K(view) && (qv4Var instanceof qv4.c)) {
                    View view2 = pv4Var.i;
                    d3m.e(view2 == null ? null : view2, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new ux3(pv4Var, i4), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                } else {
                    View view3 = pv4Var.i;
                    if ((view3 == null || !bwt0.K(view3)) && !(qv4Var instanceof qv4.c)) {
                        View view4 = pv4Var.i;
                        if (view4 == null) {
                            view4 = null;
                        }
                        awt0.p(view4);
                        qu4 qu4Var = pv4Var.j;
                        if (qu4Var == null) {
                            qu4Var = null;
                        }
                        boolean z2 = qv4Var instanceof qv4.d;
                        qu4Var.t = true;
                        View view5 = qu4Var.a;
                        bwt0.p0(view5, true);
                        view5.setAlpha(1.0f);
                        ViewGroup viewGroup2 = qu4Var.b;
                        viewGroup2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        viewGroup2.setTranslationY(iah0.a(32));
                        viewGroup2.setAlpha(0.1f);
                        viewGroup2.setScaleX(0.3f);
                        viewGroup2.setScaleY(0.3f);
                        ViewPropertyAnimator withEndAction = viewGroup2.animate().setInterpolator(qu4Var.o).scaleX(1.0f).scaleY(1.0f).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L).alpha(1.0f).withEndAction(new nu4(qu4Var, b));
                        withEndAction.start();
                        io.reactivex.rxjava3.disposables.b bVar = qu4Var.n;
                        xo2.b(withEndAction, bVar);
                        if (!qu4Var.u && c2 != null) {
                            xo2.b(c2, bVar);
                        }
                        if (z2) {
                            c = d3m.c(qu4Var.f, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 300L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            if (c != null) {
                                xo2.b(c, bVar);
                            }
                        } else {
                            qu4Var.b(false);
                        }
                        pv4Var.b.a();
                        TextView textView2 = pv4Var.r;
                        (textView2 != null ? textView2 : 0).sendAccessibilityEvent(8);
                    } else if (qv4Var instanceof qv4.b) {
                        pv4Var.C = true;
                        pv4Var.f(false);
                        qu4 qu4Var2 = pv4Var.j;
                        (qu4Var2 != null ? qu4Var2 : null).b(false);
                    }
                }
                return s3q0.a;
            case 8:
                ((pt5) obj2).T(wt5.b.b);
                return s3q0.a;
            case 9:
                wo6 wo6Var = ((zo6) obj2).d;
                if (wo6Var != null) {
                    wo6Var.g0();
                }
                return s3q0.a;
            case 10:
                eb7 eb7Var = (eb7) obj2;
                eb7Var.g.setVisibility(8);
                eb7Var.h.setVisibility(0);
                eb7Var.i.setVisibility(8);
                eb7Var.j.setVisibility(8);
                return s3q0.a;
            case 11:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) ((o48) obj2).f).setValue(bool);
                return s3q0.a;
            case 12:
                VoipEnableOwnMicAndVideoRequestedDialog.RequestMedia requestMedia = (VoipEnableOwnMicAndVideoRequestedDialog.RequestMedia) obj;
                Context context = ((f69) obj2).a;
                ?? h = e3m.h(context);
                evw0 evw0Var = h instanceof evw0 ? (evw0) h : null;
                if (evw0Var == null || (gvw0Var = evw0Var.getPermissions()) == null) {
                    gvw0Var = new gvw0(context, new ivw0());
                }
                int i12 = f69.a.$EnumSwitchMapping$0[requestMedia.ordinal()];
                if (i12 == 1) {
                    gvw0Var.h(new e20(i3), new e69(b, b));
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.vk.voip.ui.c.C0(com.vk.voip.ui.c.b, gvw0Var);
                }
                return s3q0.a;
            case 13:
                float f = CameraUIView.w1;
                bm9 presenter = ((CameraUIView) obj2).getPresenter();
                if (presenter != null) {
                    presenter.T3();
                }
                return s3q0.a;
            case 14:
                wpe0 wpe0Var = (wpe0) obj;
                izs<lpe0, s3q0> actionListener = ((r3a) obj2).getActionListener();
                if (actionListener != null) {
                    actionListener.invoke(new lpe0.b(wpe0Var.a));
                }
                return s3q0.a;
            case 15:
                ((wxa) obj2).a();
                return s3q0.a;
            case 16:
                ((xgl0) obj).a().q(((c1b) obj2).d, ChannelActionInProgress.NONE, Boolean.FALSE);
                return s3q0.a;
            case 17:
                ((y3b) obj2).T(f4b.b.b);
                return s3q0.a;
            case 18:
                Throwable th3 = (Throwable) obj;
                oob oobVar = ((ynb) obj2).l;
                if (oobVar != null) {
                    oobVar.j = false;
                }
                L.i(th3);
                return s3q0.a;
            case 19:
                lpb lpbVar = (lpb) obj2;
                ipb ipbVar = (ipb) obj;
                if (ipbVar instanceof ipb.a) {
                    ((FragmentImpl) ((Fragment) lpbVar.g.c)).a0();
                } else if (!(ipbVar instanceof ipb.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 20:
                ((ftb) obj2).e.A0();
                return s3q0.a;
            case 21:
                Throwable th4 = (Throwable) obj;
                xyb.C.a(th4);
                if (((xyb) obj2).A != null) {
                    zk70.e(th4);
                }
                return s3q0.a;
            case 22:
                pno0 pno0Var = (pno0) obj;
                syj syjVar = ((mbc) obj2).y;
                (syjVar != null ? syjVar : null).x0(pno0Var.d().toString());
                return s3q0.a;
            case 23:
                ClipsEditorMusicInfo clipsEditorMusicInfo = (ClipsEditorMusicInfo) obj2;
                w9y w9yVar = (w9y) obj;
                w9yVar.g("music_track", clipsEditorMusicInfo.b);
                w9yVar.e(clipsEditorMusicInfo.c, "track_url");
                w9yVar.c(Integer.valueOf(clipsEditorMusicInfo.d), "start_ms");
                w9yVar.c(Integer.valueOf(clipsEditorMusicInfo.e), "finish_ms");
                w9yVar.c(Integer.valueOf(clipsEditorMusicInfo.f), "delay_ms");
                w9yVar.e(clipsEditorMusicInfo.g, "file_path");
                w9yVar.c(Integer.valueOf(clipsEditorMusicInfo.h), "recommended_time");
                w9yVar.b(Boolean.valueOf(clipsEditorMusicInfo.i), "from_duet");
                w9yVar.b(Boolean.valueOf(clipsEditorMusicInfo.j), "from_local_video");
                w9yVar.g("music_catalog_info", clipsEditorMusicInfo.k);
                w9yVar.b(Boolean.valueOf(clipsEditorMusicInfo.l), "from_voice_over");
                return s3q0.a;
            case 24:
                o6f o6fVar = (o6f) obj2;
                Throwable th5 = (Throwable) obj;
                o6fVar.e.e = 0L;
                o6fVar.j7();
                h03.b(th5);
                L.g("ClipsTemplateEditorCropperActionsHandlerImpl", th5);
                return s3q0.a;
            case 25:
                ((yl0) obj2).invoke((List) obj);
                return s3q0.a;
            case 26:
                CommunitiesCatalogRootVh communitiesCatalogRootVh = (CommunitiesCatalogRootVh) obj2;
                CommunitiesSearchTopBarVh communitiesSearchTopBarVh = communitiesCatalogRootVh.Q;
                l3a l3aVar = (l3a) obj;
                if (l3aVar instanceof SearchSpellcheckVh.a.C0525a) {
                    communitiesSearchTopBarVh.b(((SearchSpellcheckVh.a.C0525a) l3aVar).a);
                } else if (l3aVar instanceof SearchSpellcheckVh.a.b) {
                    SearchSpellcheckVh.a.b bVar2 = (SearchSpellcheckVh.a.b) l3aVar;
                    communitiesSearchTopBarVh.b(bVar2.a);
                    CommunitiesCatalogRootVh.n0(communitiesCatalogRootVh, bVar2.a, false, SearchInputMethod.Keyboard, null, 20);
                } else if (l3aVar instanceof xyh0) {
                    xyh0 xyh0Var = (xyh0) l3aVar;
                    com.vk.catalog2.common.ui.holders.search.b bVar3 = com.vk.catalog2.common.ui.holders.search.b.a;
                    SearchResultsImplVh searchResultsImplVh = communitiesCatalogRootVh.R;
                    String V = searchResultsImplVh.V();
                    if (V == null) {
                        V = "";
                    }
                    com.vk.catalog2.common.ui.holders.search.b.b(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP_SHOW_ALL, V);
                    communitiesCatalogRootVh.Z.a(searchResultsImplVh.V(), new com.vk.movika.sdk.base.ui.i(10, communitiesCatalogRootVh, xyh0Var));
                }
                return s3q0.a;
            case 27:
                ((j5) obj2).invoke((Throwable) obj);
                return s3q0.a;
            case 28:
                ((c.a) ((io.reactivex.rxjava3.core.l) obj2)).f(new jlu((AdminLeaveAction) obj));
                return s3q0.a;
            default:
                ((mvh) obj2).t();
                return s3q0.a;
        }
    }
}
