package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.soloader.MinElf;
import com.google.android.material.tabs.TabLayout;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ads.analytics.NativeAdType;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.core.cache.CatalogCacheEntry;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.segmented.control.VkSegmentedControl;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Source;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Curator;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.newsfeed.posting.impl.domain.model.PhotoTag;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoTagsData;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.az20;
import xsna.cf70;
import xsna.dbb0;
import xsna.fhc0;
import xsna.h120;
import xsna.k840;
import xsna.l7h0;
import xsna.o0r0;
import xsna.osd0;
import xsna.t310;
import xsna.tzp0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class f410 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f410(NewsEntry newsEntry, tt80 tt80Var, int i) {
        this.b = 17;
        this.c = newsEntry;
    }

    /* JADX WARN: Code restructure failed: missing block: B:310:0x07c9, code lost:
    
        r31 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x07d7, code lost:
    
        if (r3 != (-1)) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x07da, code lost:
    
        r31 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x07e0, code lost:
    
        if (r31 == null) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x07e2, code lost:
    
        r1 = r31.intValue();
        r3 = r6.a0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x07e8, code lost:
    
        if (r3 == null) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x07ea, code lost:
    
        r3.smoothScrollToPosition(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x07ed, code lost:
    
        r1 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x07f1, code lost:
    
        if (r2.a != false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x07f3, code lost:
    
        if (r5 == null) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x07f5, code lost:
    
        r5.post(new xsna.rc4(r5, 8));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0465  */
    /* JADX WARN: Type inference failed for: r1v124, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v128, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v163, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r23v2 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Playlist playlist;
        boolean z;
        ?? r23;
        Drawable f;
        boolean z2;
        String str;
        String string;
        Object obj2;
        int i = this.b;
        int i2 = 14;
        boolean z3 = true;
        VerifyInfoHelper.ColorTheme colorTheme = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) obj3;
                t310 t310Var = (t310) obj;
                int i3 = MarketItemReviewsFragment.w0;
                if (t310Var instanceof t310.a) {
                    String str2 = ((t310.a) t310Var).a;
                    ((ClipboardManager) marketItemReviewsFragment.requireContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str2, str2));
                } else if (t310Var instanceof t310.e) {
                    cvk.w(((t310.e) t310Var).a.a(marketItemReviewsFragment.requireContext()), false);
                } else {
                    int i4 = 0;
                    if (t310Var instanceof t310.b) {
                        List<efk0> list = ((t310.b) t310Var).a;
                        djg0 djg0Var = marketItemReviewsFragment.u0;
                        djg0Var.setItems(list);
                        View findViewById = marketItemReviewsFragment.requireView().findViewById(R.id.filter_cl);
                        int l = krv0.l(R.attr.vk_ui_icon_accent);
                        findViewById.getContext();
                        e.b bVar = new e.b(findViewById, null, null, l, 6);
                        bVar.w = R.layout.ds_internal_context_menu_item;
                        bVar.l = djg0Var;
                        bVar.m = iah0.a(14);
                        VkContextMenu a = bVar.a();
                        marketItemReviewsFragment.v0 = a;
                        a.g();
                    } else if (t310Var instanceof t310.c) {
                        Integer num = ((t310.c) t310Var).a;
                        if (num != null) {
                            int intValue = num.intValue();
                            mfy mfyVar = marketItemReviewsFragment.Q;
                            WriteBar writeBar = marketItemReviewsFragment.Z;
                            EditText input = writeBar != null ? writeBar.getInput() : null;
                            mfyVar.getClass();
                            Iterator it = ((n310) marketItemReviewsFragment.V.getValue()).h.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    i4 = -1;
                                    break;
                                } else {
                                    Object next = it.next();
                                    if (i4 < 0) {
                                        e43.t();
                                        throw null;
                                    }
                                    if (epx.f(((hfz) next).getItemId(), Integer.valueOf(intValue))) {
                                        break;
                                    } else {
                                        i4++;
                                    }
                                }
                            }
                        }
                    } else {
                        if (!(t310Var instanceof t310.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        t310.d dVar = (t310.d) t310Var;
                        WriteBar writeBar2 = marketItemReviewsFragment.Z;
                        if (writeBar2 != null) {
                            writeBar2.setText(dVar.a);
                        }
                        e2g0 e2g0Var = marketItemReviewsFragment.R;
                        if (e2g0Var != null) {
                            e2g0Var.j(dVar.b);
                        }
                    }
                }
                return s3q0.a;
            case 1:
                h120 h120Var = (h120) obj3;
                h120.a aVar = h120Var.k;
                if (aVar != null) {
                    xwk.e().m(h120Var.c.getContext(), aVar.a, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 2:
                return Boolean.valueOf(((ia20) obj3).h.compareAndSet(false, true));
            case 3:
                ((io.reactivex.rxjava3.subjects.d) obj3).onNext((xf20) obj);
                return s3q0.a;
            case 4:
                return new it80(((po20) obj3).b());
            case 5:
                ((zak0) ((az20) obj3).j).setValue((az20.c) obj);
                return s3q0.a;
            case 6:
                com.vk.im.ui.components.msg_list.a aVar2 = (com.vk.im.ui.components.msg_list.a) obj3;
                kym0 kym0Var = (kym0) obj;
                hg1.e(aVar2.g0, itg0.n(aVar2.l.C(aVar2, new h9q0(kym0Var.b.b, kym0Var.a.value, kym0Var.d)).q(asu0.a.c())));
                return s3q0.a;
            case 7:
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b = qk30.b(((Integer) obj).intValue(), ((vm30) obj3).H);
                return Boolean.valueOf(b != null && b.B());
            case 8:
                CatalogCacheEntry catalogCacheEntry = (CatalogCacheEntry) obj;
                xuo0.a.getClass();
                long a2 = xuo0.a() - catalogCacheEntry.d;
                long j = ((e740) obj3).b;
                return (j <= -1 || a2 <= j) ? io.reactivex.rxjava3.core.q.T(catalogCacheEntry) : io.reactivex.rxjava3.internal.operators.observable.g0.b;
            case 9:
                mzp0 mzp0Var = ((qd40) obj3).b;
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                return s3q0.a;
            case 10:
                Playlist playlist2 = (Playlist) obj3;
                Playlist playlist3 = (Playlist) obj;
                if (epx.f(playlist3.Ib(), playlist2.Ib())) {
                    playlist = playlist3;
                    r5v0 r5v0Var = k840.a.h;
                    if (r5v0Var == null) {
                        r5v0Var = null;
                    }
                    r5v0Var.b(new n8b0(xx1.m(playlist2), Playlist.zb(xx1.m(playlist2), null, null, null, DownloadingState.NotLoaded.b, -1, 254)));
                } else {
                    r5v0 r5v0Var2 = k840.a.h;
                    playlist = playlist3;
                    (r5v0Var2 != null ? r5v0Var2 : null).b(new n8b0(playlist, Playlist.zb(playlist3, null, null, null, DownloadingState.NotLoaded.b, -1, 254)));
                }
                Playlist zb = Playlist.zb(playlist2, null, null, null, DownloadingState.NotLoaded.b, -1, 254);
                r5v0 r5v0Var3 = k840.a.h;
                if (r5v0Var3 == null) {
                    r5v0Var3 = null;
                }
                r5v0Var3.b(new n8b0(playlist2, zb));
                for (MusicTrack musicTrack : playlist.y) {
                    r5v0 r5v0Var4 = k840.a.h;
                    if (r5v0Var4 == null) {
                        r5v0Var4 = null;
                    }
                    r5v0Var4.b(new ib50(musicTrack, kq40.a(musicTrack)));
                }
                return s3q0.a;
            case 11:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, (String) obj3);
                qgi0.r(tgi0Var, "MusicDownloadingIndication:inProgress");
                return s3q0.a;
            case 12:
                rt40 rt40Var = (rt40) obj3;
                tzp0.c.a aVar3 = rt40.s1;
                fs40 fs40Var = new fs40((List) obj);
                rt40Var.getClass();
                xn50.a.c(rt40Var, fs40Var);
                return s3q0.a;
            case 13:
                Curator curator = (Curator) obj3;
                bn40.g("AudioFollowCurator", (Integer) obj);
                curator.g = true;
                r5v0 r5v0Var5 = k840.a.h;
                (r5v0Var5 != null ? r5v0Var5 : null).b(new elk(curator, true));
                return s3q0.a;
            case 14:
                x660 x660Var = (x660) obj3;
                a1w a1wVar = x660Var.b;
                return a1wVar.u() ? a1wVar.C(x660Var, new com.vk.im.engine.commands.contacts.a(Source.CACHE, null, i2)).o(EmptyList.b) : io.reactivex.rxjava3.internal.operators.single.a0.b;
            case 15:
                me60 me60Var = (me60) obj;
                se60 se60Var = ((ke60) obj3).d;
                NewsfeedCoowners newsfeedCoowners = me60Var.c;
                List<Long> list2 = me60Var.d;
                Context context = se60Var.a.a;
                ListBuilder e = e43.e();
                List<NewsfeedCoowners.CoownerStatus> list3 = newsfeedCoowners.f;
                int size = list3.size();
                int i5 = 0;
                while (i5 < size) {
                    NewsfeedCoowners.CoownerStatus coownerStatus = list3.get(i5);
                    Owner owner = coownerStatus.b;
                    String str3 = coownerStatus.c;
                    VerifyInfo verifyInfo = owner.f;
                    if (verifyInfo == null || !verifyInfo.Cb()) {
                        z = z3;
                        if (owner.i(8192)) {
                            f = uko.f(R.drawable.vk_icon_verified_16, R.attr.vk_ui_text_secondary, context);
                        } else {
                            r23 = colorTheme;
                            boolean z4 = (!epx.f(str3, "approved") || epx.f(str3, "pending")) ? z : false;
                            boolean z5 = newsfeedCoowners.b;
                            boolean z6 = (z5 || !z4) ? false : z;
                            NewsfeedCoowners newsfeedCoowners2 = newsfeedCoowners;
                            z2 = (list2.contains(Long.valueOf(owner.b.b)) || !coownerStatus.d) ? false : z;
                            Pair v = zq70.v(!coownerStatus.e, fkq0.d(owner.b));
                            int intValue2 = ((Number) v.d()).intValue();
                            int intValue3 = ((Number) v.g()).intValue();
                            boolean z7 = coownerStatus.e;
                            if (i5 != 0 || z6 || !z5) {
                                UserId userId = owner.b;
                                boolean z8 = i5 != 0 ? z : false;
                                String f2 = owner.f(iah0.a(48));
                                String str4 = (f2 == null || (f2 = owner.e) != null) ? f2 : "";
                                String str5 = owner.c;
                                String str6 = str5 != null ? "" : str5;
                                ImageStatus imageStatus = owner.k;
                                if (!epx.f(str3, "pending")) {
                                    string = fkq0.b(owner.b) ? context.getString(R.string.feed_coowners_pending_community) : owner.l() ? context.getString(R.string.feed_coowners_pending_female) : context.getString(R.string.feed_coowners_pending_male);
                                } else if (owner.i(8192)) {
                                    string = context.getString(R.string.non_profit_organization_title);
                                } else if (owner.i(256)) {
                                    string = context.getString(R.string.group_government_title);
                                } else {
                                    str = null;
                                    e.add(new ie60(userId, str4, z8, str6, r23, imageStatus, str, z2, z7, (owner.i(256) || owner.i(8192)) ? null : Integer.valueOf(R.drawable.vk_icon_flag_12), intValue2, intValue3));
                                }
                                str = string;
                                e.add(new ie60(userId, str4, z8, str6, r23, imageStatus, str, z2, z7, (owner.i(256) || owner.i(8192)) ? null : Integer.valueOf(R.drawable.vk_icon_flag_12), intValue2, intValue3));
                            }
                            i5++;
                            z3 = z;
                            newsfeedCoowners = newsfeedCoowners2;
                            colorTheme = null;
                        }
                    } else {
                        z = z3;
                        f = VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, context, colorTheme, 28);
                    }
                    r23 = f;
                    if (epx.f(str3, "approved")) {
                    }
                    boolean z52 = newsfeedCoowners.b;
                    if (z52) {
                    }
                    NewsfeedCoowners newsfeedCoowners22 = newsfeedCoowners;
                    if (list2.contains(Long.valueOf(owner.b.b))) {
                    }
                    Pair v2 = zq70.v(!coownerStatus.e, fkq0.d(owner.b));
                    int intValue22 = ((Number) v2.d()).intValue();
                    int intValue32 = ((Number) v2.g()).intValue();
                    boolean z72 = coownerStatus.e;
                    if (i5 != 0) {
                    }
                    UserId userId2 = owner.b;
                    if (i5 != 0) {
                    }
                    String f22 = owner.f(iah0.a(48));
                    if (f22 == null) {
                    }
                    String str52 = owner.c;
                    if (str52 != null) {
                    }
                    ImageStatus imageStatus2 = owner.k;
                    if (!epx.f(str3, "pending")) {
                    }
                    str = string;
                    e.add(new ie60(userId2, str4, z8, str6, r23, imageStatus2, str, z2, z72, (owner.i(256) || owner.i(8192)) ? null : Integer.valueOf(R.drawable.vk_icon_flag_12), intValue22, intValue32));
                    i5++;
                    z3 = z;
                    newsfeedCoowners = newsfeedCoowners22;
                    colorTheme = null;
                }
                return e.g();
            case 16:
                ((qe70) obj3).T(new cf70.c(((bqu) obj).a));
                return s3q0.a;
            case 17:
                NewsEntry newsEntry = (NewsEntry) obj3;
                l5m l5mVar = new l5m(null, null, 3);
                l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.FEED_APPLOVIN_TRACKCODE.h(), null, newsEntry.Cb().b, null, "payed", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -22, 3, null);
                l5mVar.q();
                NativeAdType nativeAdType = NativeAdType.APPLOVIN;
                String str7 = newsEntry.Cb().b;
                int i6 = newsEntry.Cb().c;
                ((w9v0) obj).a();
                throw null;
            case 18:
                pa90 pa90Var = (pa90) obj3;
                pa90Var.k.onNext((List) obj);
                pa90Var.k.onComplete();
                return s3q0.a;
            case 19:
                TextView textView = new TextView(((VkSegmentedControl) obj3).getContext());
                textView.setTextAppearance(R.style.VkUiTypography_Headline2);
                textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
                textView.setTextAlignment(4);
                textView.setText(((TabLayout.g) obj).c);
                return textView;
            case 20:
                ((xia0) obj3).b.query(((pno0) obj).d().toString());
                return s3q0.a;
            case 21:
                oio.P((oio) obj, ((gxa0) obj3).a.getValue().a, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                return s3q0.a;
            case 22:
                cbb0 cbb0Var = (cbb0) obj3;
                ?? r1 = cbb0Var.i1;
                dbb0 dbb0Var = (dbb0) obj;
                int i7 = cbb0.q1;
                if (dbb0Var instanceof dbb0.a) {
                    cbb0Var.dismiss();
                } else if (dbb0Var instanceof dbb0.h) {
                    g7j0 a3 = y501.a();
                    FragmentActivity kn = cbb0Var.kn();
                    Playlist zb2 = Playlist.zb(((dbb0.h) dbb0Var).a, null, null, EmptyList.b, null, -8388609, 255);
                    Bundle arguments = cbb0Var.getArguments();
                    a3.j(kn, zb2, arguments != null ? cbb0.bo(arguments) : null);
                } else if (dbb0Var instanceof dbb0.g) {
                    kbj0 h8 = ((BridgeComponent) r1.getValue()).h8();
                    FragmentActivity kn2 = cbb0Var.kn();
                    Playlist zb3 = Playlist.zb(((dbb0.g) dbb0Var).a, null, null, EmptyList.b, null, -8388609, 255);
                    Bundle arguments2 = cbb0Var.getArguments();
                    h8.B(kn2, zb3, arguments2 != null ? cbb0.bo(arguments2) : null);
                } else if (dbb0Var instanceof dbb0.j) {
                    i0q0.f(new i3r(cbb0Var.kn(), 2));
                } else if (dbb0Var instanceof dbb0.f) {
                    dbb0.f fVar = (dbb0.f) dbb0Var;
                    je50.b(cbb0Var.kn(), fVar.a, fVar.b);
                } else if (dbb0Var instanceof dbb0.e) {
                    ic40.j(((BridgeComponent) r1.getValue()).Le().w(), cbb0Var.kn(), ((dbb0.e) dbb0Var).a, MusicPlaybackLaunchContext.d, MusicBottomSheetLaunchPoint.Delete.b, null, PsExtractor.VIDEO_STREAM_MASK);
                } else if (dbb0Var instanceof dbb0.d) {
                    wk40 g = ((BridgeComponent) r1.getValue()).Le().g();
                    Context context2 = e43.a;
                    g.c(context2 != null ? context2 : null, Playlist.zb(((dbb0.d) dbb0Var).a, null, null, EmptyList.b, null, -8388609, 255));
                } else if (dbb0Var instanceof dbb0.c) {
                    dbb0.c cVar = (dbb0.c) dbb0Var;
                    ((BridgeComponent) r1.getValue()).Le().I(cbb0Var.kn(), cVar.a, cVar.b);
                } else if (dbb0Var instanceof dbb0.i) {
                    com.vk.music.notifications.restriction.a aVar4 = k840.a.d;
                    MusicRestrictionPopupDisplayer.e(aVar4 != null ? aVar4 : null, cbb0Var.kn(), "download", MusicPlaybackLaunchContext.d, null, null, null, 56);
                } else {
                    if (!(dbb0Var instanceof dbb0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((j7b0) cbb0Var.l1.getValue()).y(cbb0Var.requireContext(), ((dbb0.b) dbb0Var).a);
                }
                return s3q0.a;
            case 23:
                ((l6c0) obj3).c(z4c0.a);
                return s3q0.a;
            case 24:
                PostingState.Editing editing = (PostingState.Editing) obj;
                vpc0 vpc0Var = ((qkc0) obj3).d;
                PhotoTagsData photoTagsData = editing.i.r;
                Map<Integer, List<PhotoTag>> map = photoTagsData != null ? photoTagsData.b : null;
                String str8 = editing.c.o;
                vpc0Var.getClass();
                if (map == null || map.isEmpty()) {
                    return new osd0.b(str8);
                }
                Iterator it2 = map.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (!((List) obj2).isEmpty()) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                List list4 = (List) obj2;
                if (list4 == null) {
                    return new osd0.b(str8);
                }
                PhotoTag photoTag = (PhotoTag) j5g.Y(list4);
                Iterator it3 = map.values().iterator();
                if (!it3.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object obj4 = it3.next();
                while (it3.hasNext()) {
                    obj4 = j5g.u0((List) it3.next(), (List) obj4);
                }
                int size2 = ((Collection) obj4).size();
                int i8 = size2 - 1;
                return new osd0.a(i8 > 0 ? Integer.valueOf(i8) : null, photoTag.e, photoTag.f, size2 == 1);
            case 25:
                cqc0 cqc0Var = (cqc0) obj3;
                cqc0Var.V0();
                ((fhc0.c) cqc0Var.s.getValue()).j();
                cqc0Var.j.invoke();
                return s3q0.a;
            case 26:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : (List) obj) {
                    if (linkedHashSet.contains(((UserProfile) obj5).c)) {
                        arrayList.add(obj5);
                    } else {
                        arrayList2.add(obj5);
                    }
                }
                Pair pair = new Pair(arrayList, arrayList2);
                return new sfd0((List) pair.d(), (List) pair.g());
            case 27:
                ((rg50) obj3).C(((Integer) obj).intValue());
                return s3q0.a;
            case 28:
                ((c7h0) obj3).T(new l7h0.a((Throwable) obj));
                return s3q0.a;
            default:
                ((zak0) ((c1h) obj3).h).setValue(new q9x(((q9x) obj).a));
                return s3q0.a;
        }
    }

    public /* synthetic */ f410(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
