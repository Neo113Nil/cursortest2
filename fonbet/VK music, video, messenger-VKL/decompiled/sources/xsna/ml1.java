package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.appredirects.activity.BaseLinkRedirectActivity;
import com.vk.appredirects.resolver.AppRedirectResult;
import com.vk.auth.restore.RestoreReason;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.community.design.view.donut.DonutUserStackView;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.IndeterminateProgressBarWithLogoView;
import com.vk.dto.common.Good;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.tags.Tag;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.ecomm.market.good.c;
import com.vk.ecomm.market.good.ui.topbar.ProductCardTopBarControlAction;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.ui.components.account.main.vc.AccountAvatarAction;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.mediapicker.impl.presentation.mvi.MediaPickerMviState;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain.PostingContentType;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.privacy_picker.presentation.donut_levels.DonutLevelsFragment;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.reefton.dto.ReefLocationSource;
import com.vk.sharing.api.dto.SharingDataType;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketTransitionToBookmarks;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import xsna.b3p0;
import xsna.d5v;
import xsna.fh8;
import xsna.ggh;
import xsna.gh8;
import xsna.hpb0;
import xsna.i510;
import xsna.ikv0;
import xsna.jfd0;
import xsna.kqc0;
import xsna.kv70;
import xsna.o660;
import xsna.p3o;
import xsna.tmd0;
import xsna.w510;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ml1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ml1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.vk.stat.scheme.CommonMarketStat$TypeAdCampaign, xsna.zcl] */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.vk.auth.main.b] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        int i = this.b;
        int i2 = 14;
        int i3 = 15;
        int i4 = 6;
        int i5 = 4;
        int i6 = 8;
        czs0 czs0Var = null;
        boolean z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        int i7 = 7;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                PhotoAlbum photoAlbum = (PhotoAlbum) obj3;
                ql1 ql1Var = (ql1) obj2;
                ImageSize Cb = photoAlbum.u.Cb(ql1Var.o.getWidth(), true, false);
                if (Cb == null || (str = Cb.d.d) == null) {
                    str = photoAlbum.k;
                }
                ql1Var.o.load(str);
                return s3q0.a;
            case 1:
                String str4 = (String) obj2;
                com.vk.auth.main.b bVar = ((p66) obj3).d;
                (bVar != null ? bVar : 0).S0(new RestoreReason.AlreadyUsedPhone(str4));
                return s3q0.a;
            case 2:
                IndeterminateProgressBarWithLogoView indeterminateProgressBarWithLogoView = (IndeterminateProgressBarWithLogoView) obj3;
                BaseLinkRedirectActivity baseLinkRedirectActivity = (BaseLinkRedirectActivity) obj2;
                AppRedirectResult appRedirectResult = (AppRedirectResult) obj;
                int i8 = BaseLinkRedirectActivity.g;
                int i9 = appRedirectResult == null ? -1 : BaseLinkRedirectActivity.d.$EnumSwitchMapping$0[appRedirectResult.ordinal()];
                if (i9 == 1) {
                    indeterminateProgressBarWithLogoView.postDelayed(new o4(baseLinkRedirectActivity, 2), 500L);
                } else if (i9 != 2) {
                    baseLinkRedirectActivity.Q1();
                    Intent intent = baseLinkRedirectActivity.getIntent();
                    uc00 uc00Var = uc00.a;
                    uc00.n(new tbg(intent, 29));
                    Uri data = intent.getData();
                    if (data != null) {
                        try {
                            uc00.e = data.getQueryParameter("mrgcampaign");
                        } catch (Throwable unused) {
                        }
                    }
                    Iterator<BaseLinkRedirectActivity.c> it = baseLinkRedirectActivity.O1().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            BaseLinkRedirectActivity.c next = it.next();
                            if (next.b(baseLinkRedirectActivity, baseLinkRedirectActivity.getIntent())) {
                                next.c(baseLinkRedirectActivity, baseLinkRedirectActivity.getIntent());
                                baseLinkRedirectActivity.getIntent();
                                if (next.a()) {
                                    baseLinkRedirectActivity.finish();
                                }
                            }
                        }
                    }
                } else {
                    baseLinkRedirectActivity.finish();
                }
                return s3q0.a;
            case 3:
                Context context = (Context) obj3;
                tgi0 tgi0Var = (tgi0) obj;
                int length = ((String) obj2).length() % 4;
                qgi0.h(tgi0Var, context.getString(R.string.talkback_dots_entered_count, context.getString(length != 1 ? length != 2 ? length != 3 ? R.string.talkback_digit_zero_form : R.string.talkback_digit_three_form : R.string.talkback_digit_two_form : R.string.talkback_digit_one_form)));
                return s3q0.a;
            case 4:
                ggj ggjVar = (ggj) obj;
                ggjVar.s1();
                oio.u1(ggjVar, (Path) obj3, (yk8) obj2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 60);
                return s3q0.a;
            case 5:
                ((b2b) obj3).g.b((MsgFromChannel) obj2, (ChannelMsgSendConfig) obj);
                return s3q0.a;
            case 6:
                String str5 = (String) obj2;
                ClipFeedTab clipFeedTab = (ClipFeedTab) obj;
                bpe bpeVar = ((toe) obj3).b;
                if ((clipFeedTab instanceof ClipFeedTab.SingleAdv) || (clipFeedTab instanceof ClipFeedTab.Discover) || (clipFeedTab instanceof ClipFeedTab.MusicTemplate) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.MusicTemplateCatalogClip) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.TrendingHashtagCatalogClip) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.TrendingMusicCatalogClip) || (clipFeedTab instanceof ClipFeedTab.MyClips) || (clipFeedTab instanceof ClipFeedTab.Playlist)) {
                    z = false;
                } else if (!(clipFeedTab instanceof ClipFeedTab.SingleClip) && !(clipFeedTab instanceof ClipFeedTab.SingleClipByVideoId) && !(clipFeedTab instanceof ClipFeedTab.SingleClipWithDecoration) && !(clipFeedTab instanceof ClipFeedTab.SingleClipFromBlock) && !(clipFeedTab instanceof ClipFeedTab.ClipsFromShopsSource) && !(clipFeedTab instanceof ClipFeedTab.ClipsFromTrendsSource) && !(clipFeedTab instanceof ClipFeedTab.CatalogClip.CompilationCatalogClip) && !(clipFeedTab instanceof ClipFeedTab.CatalogClip.HashtagCatalogClip) && !(clipFeedTab instanceof ClipFeedTab.CatalogClip.SearchCatalogClip) && !(clipFeedTab instanceof ClipFeedTab.CatalogClip.MusicCatalogClip) && !(clipFeedTab instanceof ClipFeedTab.CatalogClip.MaskCatalogClip) && !(clipFeedTab instanceof ClipFeedTab.CatalogClip.ProfileCatalogClip) && !(clipFeedTab instanceof ClipFeedTab.CatalogClip.UnknownCatalogClip) && !(clipFeedTab instanceof ClipFeedTab.Compilation) && !(clipFeedTab instanceof ClipFeedTab.Hashtag) && !(clipFeedTab instanceof ClipFeedTab.LikedClips) && !(clipFeedTab instanceof ClipFeedTab.LivesTop) && !(clipFeedTab instanceof ClipFeedTab.Mask) && !(clipFeedTab instanceof ClipFeedTab.Music) && !(clipFeedTab instanceof ClipFeedTab.NewsfeedDiscoverMedia) && !(clipFeedTab instanceof ClipFeedTab.Place) && !(clipFeedTab instanceof ClipFeedTab.Profile) && !(clipFeedTab instanceof ClipFeedTab.ProfileLives) && !(clipFeedTab instanceof ClipFeedTab.Search) && !(clipFeedTab instanceof ClipFeedTab.TopVideo) && !(clipFeedTab instanceof ClipFeedTab.UserSubscriptions) && !(clipFeedTab instanceof ClipFeedTab.FavoriteFolder) && !(clipFeedTab instanceof ClipFeedTab.NewsMonotheme) && !(clipFeedTab instanceof ClipFeedTab.CoauthorInvitations)) {
                    throw new NoWhenBranchMatchedException();
                }
                bpeVar.e(str5, z);
                return s3q0.a;
            case 7:
                return ((dgh) obj3).I((Clips) obj2, (ggh.a) obj);
            case 8:
                kdj kdjVar = (kdj) obj3;
                Collection<Contact> collection = (Collection) obj2;
                SQLiteStatement g = kdjVar.b.b().g("\n                REPLACE INTO contacts(id,phone,local_phone,local_name,name,user_id,device_local_id,is_new,sync_time,import_time,last_seen_status,avatar,can_write,can_call,calls_id)\n                VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)\n                ");
                for (Contact contact : collection) {
                    g.clearBindings();
                    g.bindLong(1, contact.b);
                    g.bindString(2, contact.d);
                    g.bindString(3, contact.f);
                    g.bindString(i5, contact.e);
                    g.bindString(5, contact.c);
                    rdi.l(g, i4, contact.j);
                    int i10 = i7;
                    g.bindString(i10, contact.i);
                    rdi.i(g, 8, contact.g);
                    g.bindLong(9, contact.k);
                    g.bindLong(10, contact.l);
                    g.bindLong(11, contact.m.h());
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                    g.bindBlob(12, Serializer.b.e(contact.h));
                    rdi.i(g, 13, contact.n);
                    rdi.i(g, 14, contact.o);
                    rdi.m(g, 15, contact.p);
                    g.executeInsert();
                    i7 = i10;
                    i5 = i5;
                    i4 = 6;
                }
                kdjVar.b.I0().v().k(collection);
                return s3q0.a;
            case 9:
                h4o h4oVar = (h4o) obj3;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                Context context2 = (Context) obj;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                ?? a = io.reactivex.rxjava3.internal.operators.observable.q1.a(1, context2);
                a.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                TextView textView = new TextView(context2);
                textView.setLayoutParams(new LinearLayout.LayoutParams(layoutParams));
                textView.setText("Несколько донов");
                a.addView(textView);
                for (DonutUserStackView.ClipPosition clipPosition : DonutUserStackView.ClipPosition.h()) {
                    for (DonutUserStackView.Size size : DonutUserStackView.Size.h()) {
                        DonutUserStackView donutUserStackView = new DonutUserStackView(context2);
                        donutUserStackView.setLayoutParams(new LinearLayout.LayoutParams(layoutParams));
                        donutUserStackView.setAvatarUrlsAndDonStatus(new wow(h4oVar.b));
                        donutUserStackView.setSize(size);
                        donutUserStackView.setPosition(clipPosition);
                        a.addView(donutUserStackView);
                    }
                }
                TextView textView2 = new TextView(context2);
                textView2.setLayoutParams(new LinearLayout.LayoutParams(layoutParams));
                textView2.setText("Нет донов");
                a.addView(textView2);
                for (DonutUserStackView.ClipPosition clipPosition2 : DonutUserStackView.ClipPosition.h()) {
                    for (DonutUserStackView.Size size2 : DonutUserStackView.Size.h()) {
                        DonutUserStackView donutUserStackView2 = new DonutUserStackView(context2);
                        donutUserStackView2.setLayoutParams(new LinearLayout.LayoutParams(layoutParams));
                        donutUserStackView2.setAvatarUrlsAndDonStatus(new wow(h4oVar.c));
                        donutUserStackView2.setSize(size2);
                        donutUserStackView2.setPosition(clipPosition2);
                        a.addView(donutUserStackView2);
                    }
                }
                ref$ObjectRef.element = a;
                return a;
            case 10:
                yvj yvjVar = (yvj) obj3;
                mc90 mc90Var = (mc90) obj2;
                w510 w510Var = (w510) obj;
                if (w510Var instanceof w510.a) {
                    myc0.h(yvjVar, null, null, new i510.a(mc90Var, w510Var, null), 3);
                }
                return s3q0.a;
            case 11:
                rv10 rv10Var = (rv10) obj3;
                com.vk.mediapicker.impl.presentation.mvi.b bVar2 = (com.vk.mediapicker.impl.presentation.mvi.b) obj2;
                MediaPickerMviState mediaPickerMviState = (MediaPickerMviState) obj;
                List<MediaStoreEntry> list = rv10Var.a;
                List<MediaStoreEntry> list2 = rv10Var.b;
                boolean z2 = bVar2.c.getConfig().b && ((MediaPickerMviState) bVar2.b.getCurrentState()).c == -1 && ((Boolean) bVar2.e.getValue()).booleanValue();
                List<MediaStoreEntry> list3 = rv10Var.a;
                return MediaPickerMviState.a(mediaPickerMviState, 0, null, false, null, new MediaPickerMviState.Medias.Loaded(z2, list, list2, (list3.isEmpty() || list3.size() < 100) ? MediaPickerMviState.Pagination.NoMoreData : MediaPickerMviState.Pagination.Loaded), 31);
            case 12:
                i640 i640Var = (i640) obj2;
                if (((Set) obj3).contains(obj)) {
                    ph50<Object, Object> ph50Var = i640Var.b;
                    qh50<ohi0<s3q0>> qh50Var = i640Var.d;
                    Object d = ph50Var.d(obj);
                    if (d != null) {
                        if (d instanceof qh50) {
                            qh50 qh50Var2 = (qh50) d;
                            Object[] objArr = qh50Var2.b;
                            long[] jArr = qh50Var2.a;
                            int length2 = jArr.length - 2;
                            if (length2 >= 0) {
                                int i11 = 0;
                                while (true) {
                                    long j = jArr[i11];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                        for (int i13 = 0; i13 < i12; i13++) {
                                            if ((255 & j) < 128) {
                                                qh50Var.e((ohi0) objArr[(i11 << 3) + i13]);
                                            }
                                            j >>= 8;
                                        }
                                        if (i12 != 8) {
                                        }
                                    }
                                    if (i11 != length2) {
                                        i11++;
                                    }
                                }
                            }
                        } else {
                            qh50Var.e((ohi0) d);
                        }
                    }
                }
                return s3q0.a;
            case 13:
                String str6 = (String) obj3;
                String str7 = (String) obj2;
                hyg0 hyg0Var = (hyg0) obj;
                qyg0 V0 = hyg0Var.V0("DELETE FROM audio_track WHERE uid = ? AND mid = ?");
                try {
                    V0.D3(1, str6);
                    V0.D3(2, str7);
                    V0.step();
                    int p = sv1.p(hyg0Var);
                    V0.close();
                    return Integer.valueOf(p);
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 14:
                ((um50) obj3).c(new v43(i2, (h7f0) obj, (pk50) obj2));
                return s3q0.a;
            case 15:
                ((iu50) obj3).b.a(new Pair<>((UserId) obj2, new d5v.a((Narrative) obj)));
                return s3q0.a;
            case 16:
                o660 o660Var = (o660) obj3;
                View view = (View) obj2;
                int i14 = o660.a.$EnumSwitchMapping$0[((AccountAvatarAction) obj).ordinal()];
                if (i14 == 1) {
                    o660Var.b.invoke(new zxd0.r(view));
                } else if (i14 == 2) {
                    o660Var.b.invoke(new zxd0.q(view));
                }
                return s3q0.a;
            case 17:
                ((py60) obj3).a(new ly60((String) obj2));
                return s3q0.a;
            case 18:
                kv70.a aVar = (kv70.a) obj3;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj2;
                List list4 = (List) obj;
                if (list4 != null) {
                    Iterator it2 = list4.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            ?? next2 = it2.next();
                            if (epx.f(((czs0) next2).a.a1(), aVar.e.a1())) {
                                czs0Var = next2;
                            }
                        }
                    }
                    czs0 czs0Var2 = czs0Var;
                    if (czs0Var2 != null) {
                        String a2 = lv70.a(czs0Var2.b, aVar.f);
                        dw20 dw20Var = (dw20) ref$ObjectRef2.element;
                        dw20Var.Q = a2;
                        com.vk.core.ui.bottomsheet.internal.e Hn = dw20Var.Hn();
                        Hn.C0 = a2;
                        TextView textView3 = Hn.l;
                        if (textView3 != null) {
                            textView3.setText(a2);
                        }
                    }
                }
                return s3q0.a;
            case 19:
                hpb0 hpb0Var = (hpb0) obj2;
                ((hpb0.c) obj3).b.invoke((List) obj);
                RecyclerView.o layoutManager = hpb0Var.i().getRecyclerView().getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    ((LinearLayoutManager) layoutManager).K(hpb0Var.n.getCurrentPosition(), iah0.f().widthPixels / 3);
                }
                return s3q0.a;
            case 20:
                ((izs) obj3).invoke(new kqc0.d((PostingContentType) obj, ((vcc0) ((wh50) obj2).getValue()).a));
                return s3q0.a;
            case 21:
                cfd0 cfd0Var = (cfd0) obj3;
                afd0 afd0Var = (afd0) obj2;
                jfd0 jfd0Var = (jfd0) obj;
                qcy<Object>[] qcyVarArr = cfd0.q1;
                if (jfd0Var instanceof jfd0.d) {
                    cfd0Var.dismiss();
                    hd60.a().M0(xa4.L(cfd0Var.requireContext()));
                } else if (jfd0Var instanceof jfd0.a) {
                    cfd0Var.dismiss();
                } else if (jfd0Var instanceof jfd0.e) {
                    DonutLevelsFragment.a aVar2 = new DonutLevelsFragment.a();
                    jfd0.e eVar = (jfd0.e) jfd0Var;
                    DonutLevel donutLevel = eVar.a;
                    Bundle bundle = aVar2.j;
                    bundle.putParcelable("level", donutLevel);
                    bundle.putParcelableArrayList("levels", new ArrayList<>(eVar.b));
                    bundle.putSerializable("uuid", eVar.c);
                    aVar2.i(xa4.L(cfd0Var.requireContext()), CommonGatewayClient.CODE_TOO_MANY_REQUESTS);
                } else if (jfd0Var instanceof jfd0.f) {
                    bfd0 bfd0Var = cfd0Var.j1;
                    if (bfd0Var != null) {
                        jfd0.f fVar = (jfd0.f) jfd0Var;
                        bfd0Var.a(fVar.a, fVar.b, fVar.c);
                    }
                } else if (!(jfd0Var instanceof jfd0.c)) {
                    if (!(jfd0Var instanceof jfd0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context mo2getContext = cfd0Var.mo2getContext();
                    if (mo2getContext == null) {
                        return s3q0.a;
                    }
                    cfd0Var.getChildFragmentManager().l0("request_donut_teaser", cfd0Var, cfd0Var.n1);
                    jfd0.b bVar3 = (jfd0.b) jfd0Var;
                    new p3o.a(mo2getContext, bVar3.a, bVar3.b).H0(cfd0Var.getChildFragmentManager(), p3o.class.getName());
                } else if (((jfd0.c) jfd0Var).a != null) {
                    new tsa(new com.vk.movika.sdk.android.defaultplayer.container.e(22, cfd0Var, jfd0Var), new hj60(afd0Var, i3)).a(cfd0Var.requireContext());
                } else {
                    ckc0.c((ckc0) cfd0Var.l1.getValue(), null, null, null, 6);
                }
                return s3q0.a;
            case 22:
                ymd0 ymd0Var = (ymd0) obj3;
                ComposeView composeView = (ComposeView) obj2;
                tmd0 tmd0Var = (tmd0) obj;
                if (tmd0Var.equals(tmd0.a.a)) {
                    ymd0Var.b.invoke();
                } else {
                    b3p0 b3p0Var = ymd0Var.a.X;
                    if (b3p0Var != null) {
                        Context context3 = composeView.getContext();
                        j8u j8uVar = b3p0Var.c;
                        cxo cxoVar = b3p0Var.a;
                        y4u y4uVar = cxoVar.a;
                        if (!(tmd0Var instanceof tmd0.a)) {
                            if (tmd0Var instanceof tmd0.e) {
                                com.vk.ecomm.market.good.c d2 = y4uVar.d();
                                c.a a3 = b3p0Var.a(context3);
                                d2.getClass();
                                Long l = a3.b;
                                UserId userId = a3.c;
                                Long valueOf = userId != null ? Long.valueOf(userId.b) : null;
                                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = a3.d;
                                String str8 = a3.e;
                                String str9 = a3.f;
                                SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, l, valueOf, null, str8, null, 40, null);
                                UiTrackingScreen b = UiTracker.j.b();
                                SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b != null ? b.a : null, commonMarketStat$TypeRefSource, null, str9, new com.vk.stat.scheme.g0(), 41), 2);
                                UiTracker uiTracker = UiTracker.a;
                                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                                uzp0 uzp0Var = UiTracker.h;
                                uzp0Var.getClass();
                                new bjc(c, b2, uzp0Var.a).q();
                                d2.e.c(a3.a, new cgc(null, null, false, null, null, 258047));
                            } else if (tmd0Var instanceof tmd0.g) {
                                com.vk.ecomm.market.good.c d3 = y4uVar.d();
                                c.a a4 = b3p0Var.a(context3);
                                d3.getClass();
                                Long l2 = a4.b;
                                UserId userId2 = a4.c;
                                Long valueOf2 = userId2 != null ? Long.valueOf(userId2.b) : null;
                                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource2 = a4.d;
                                String str10 = a4.e;
                                String str11 = a4.f;
                                SchemeStat$EventItem schemeStat$EventItem2 = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, l2, valueOf2, null, str10, null, 40, null);
                                UiTrackingScreen b3 = UiTracker.j.b();
                                SchemeStat$TypeClick b4 = SchemeStat$TypeClick.a.b(schemeStat$EventItem2, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b3 != null ? b3.a : null, commonMarketStat$TypeRefSource2, null, str11, new com.vk.stat.scheme.g0(), 41), 2);
                                UiTracker uiTracker2 = UiTracker.a;
                                MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                                uzp0 uzp0Var2 = UiTracker.h;
                                uzp0Var2.getClass();
                                new bjc(c2, b4, uzp0Var2.a).q();
                                d3.e.c(a4.a, new cgc(null, null, true, null, null, 255999));
                            } else if (tmd0Var instanceof tmd0.b) {
                                y4uVar.d().a(context3, j8uVar.b, Integer.valueOf(cxoVar.w));
                            } else if (tmd0Var instanceof tmd0.d) {
                                com.vk.ecomm.market.good.c d4 = y4uVar.d();
                                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource3 = b3p0Var.b;
                                GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = cxoVar.g;
                                String str12 = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.h : null;
                                gwh0 gwh0Var = d4.f;
                                if (gwh0Var != null) {
                                    gwh0Var.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_FAVE_OUT);
                                }
                                String queryParameter = str12 != null ? Uri.parse(str12).getQueryParameter("traffic_source") : null;
                                SchemeStat$EventItem schemeStat$EventItem3 = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
                                UiTrackingScreen b5 = UiTracker.j.b();
                                SchemeStat$TypeClick b6 = SchemeStat$TypeClick.a.b(schemeStat$EventItem3, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b5 != null ? b5.a : null, commonMarketStat$TypeRefSource3, null, null, new CommonMarketStat$TypeMarketTransitionToBookmarks(r14, queryParameter, true ? 1 : 0, r14), 57), 2);
                                UiTracker uiTracker3 = UiTracker.a;
                                MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
                                uzp0 uzp0Var3 = UiTracker.h;
                                uzp0Var3.getClass();
                                new bjc(c3, b6, uzp0Var3.a).q();
                                d4.h.a(context3);
                            } else if (tmd0Var instanceof tmd0.f) {
                                com.vk.ecomm.market.good.c d5 = y4uVar.d();
                                Good good = cxoVar.r;
                                gwh0 gwh0Var2 = d5.f;
                                if (gwh0Var2 != null) {
                                    gwh0Var2.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE_OUT);
                                }
                                if (good != null) {
                                    String a5 = d5.i.a(good);
                                    tbj0 a6 = d5.b.a(context3);
                                    a6.q = "market_item";
                                    UserId userId3 = good.c;
                                    a6.r = "market" + userId3.b + '_' + good.b;
                                    a6.c = d5.c.h(good, a5);
                                    a6.j = good;
                                    a6.d = d5.d.i(good);
                                    a6.h = Integer.valueOf(SharingDataType.GOOD.ordinal());
                                    a6.c();
                                }
                            } else {
                                if (!(tmd0Var instanceof tmd0.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ProductCardTopBarControlAction productCardTopBarControlAction = ((tmd0.c) tmd0Var).a;
                                maz mazVar = b3p0Var.d;
                                int i15 = b3p0.a.$EnumSwitchMapping$0[productCardTopBarControlAction.ordinal()];
                                if (i15 != 1) {
                                    if (i15 == 2 || i15 == 3) {
                                        if (!TextUtils.isEmpty(cxoVar.B) && (str3 = cxoVar.B) != null) {
                                            mazVar.a(context3, str3);
                                        }
                                    } else if (i15 == 4) {
                                        ((ClipboardManager) context3.getSystemService("clipboard")).setText(j8uVar.c);
                                        h010 h010Var = cxoVar.f;
                                        Long valueOf3 = h010Var != null ? Long.valueOf(h010Var.b) : null;
                                        h010 h010Var2 = cxoVar.f;
                                        UserId userId4 = h010Var2 != null ? h010Var2.c : null;
                                        GoodFragmentAnalyticsParams goodFragmentAnalyticsParams2 = cxoVar.g;
                                        SchemeStat$TypeClick b7 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, valueOf3, userId4 != null ? Long.valueOf(userId4.b) : null, null, goodFragmentAnalyticsParams2 != null ? goodFragmentAnalyticsParams2.f : null, null, 40, null), MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, cxoVar.h, b3p0Var.b, null, null, new MobileOfficialAppsMarketStat$TypeMarketCopyLinkClickItem(goodFragmentAnalyticsParams2 != null ? goodFragmentAnalyticsParams2.c : null, goodFragmentAnalyticsParams2 != null ? goodFragmentAnalyticsParams2.d : null, goodFragmentAnalyticsParams2 != null ? goodFragmentAnalyticsParams2.e : null), 56), 2);
                                        UiTracker uiTracker4 = UiTracker.a;
                                        MobileOfficialAppsCoreNavStat$EventScreen c4 = UiTracker.c();
                                        uzp0 uzp0Var4 = UiTracker.h;
                                        uzp0Var4.getClass();
                                        new bjc(c4, b7, uzp0Var4.a).q();
                                        ikv0.a aVar3 = new ikv0.a(context3);
                                        aVar3.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
                                        aVar3.u = new ikv0.d(new ikv0.d.c(context3.getString(R.string.product_card_link_copied_title)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                                        aVar3.n();
                                    } else {
                                        if (i15 != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        b3p0Var.e.invoke();
                                    }
                                } else if (!TextUtils.isEmpty(cxoVar.A) && (str2 = cxoVar.A) != null) {
                                    cxoVar.k = true;
                                    mazVar.a(context3, str2);
                                }
                            }
                        }
                    }
                }
                return s3q0.a;
            case 23:
                ((rrd0) obj3).o.f((ird0) obj2, ((Integer) obj).intValue());
                return s3q0.a;
            case 24:
                ArrayList arrayList = (ArrayList) obj3;
                ise0 ise0Var = (ise0) obj2;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    xqe0 xqe0Var = (xqe0) entry.getKey();
                    List<JSONObject> list5 = (List) entry.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : arrayList) {
                        if (epx.f(((zwm0) obj4).b, xqe0Var.a)) {
                            arrayList2.add(obj4);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        zwm0 zwm0Var = (zwm0) it3.next();
                        for (JSONObject jSONObject : list5) {
                            try {
                                zwm0Var.b(jSONObject);
                            } catch (InterruptedException e) {
                                throw e;
                            } catch (Throwable th2) {
                                ise0Var.d.h("Unable to handle event: " + jSONObject, th2);
                            }
                        }
                    }
                }
                return s3q0.a;
            case 25:
                com.vk.reefton.trackers.g gVar = (com.vk.reefton.trackers.g) obj3;
                vof0 vof0Var = (vof0) obj2;
                q7i q7iVar = (q7i) obj;
                xnf0 xnf0Var = gVar.b;
                fnf0 fnf0Var = gVar.a;
                ReefLocationSource reefLocationSource = ReefLocationSource.GPS;
                tnf0 b8 = xnf0Var.b(reefLocationSource);
                if (b8 != null) {
                    gVar.h(vof0Var, b8);
                } else {
                    tnf0 b9 = xnf0Var.b(ReefLocationSource.NETWORK);
                    if (b9 != null) {
                        gVar.h(vof0Var, b9);
                    } else {
                        tnf0 b10 = xnf0Var.b(ReefLocationSource.PASSIVE);
                        if (b10 != null) {
                            gVar.h(vof0Var, b10);
                        }
                    }
                }
                fnf0Var.getClass();
                unf0 unf0Var = gVar.c;
                if (unf0Var != null) {
                    unf0Var.a(ReefLocationSource.NETWORK, fnf0Var.f(), fnf0Var.j());
                }
                tnf0 b11 = xnf0Var.b(reefLocationSource);
                if (b11 != null) {
                    gVar.f = fhr.a(gVar.f, null, com.vk.reefton.trackers.g.g(b11), 1);
                }
                gVar.b.a(ReefLocationSource.NETWORK, fnf0Var.b(), fnf0Var.g(), new ync(gVar, vof0Var, q7iVar, i6));
                return s3q0.a;
            case 26:
                y6s0 y6s0Var = (y6s0) obj3;
                s6s0 s6s0Var = (s6s0) obj2;
                if (y6s0Var != null) {
                    y6s0Var.a(VideoBottomSheetSideEffectOptions.REMOVE_FROM_OWNER, s6s0Var.a);
                }
                return s3q0.a;
            case 27:
                ((clj0) obj3).e.invoke(new fh8.j.d(((gh8.g) obj2).a));
                return s3q0.a;
            case 28:
                ((x4a) obj3).invoke((Bitmap) obj, ((xpa0) obj2).U());
                return s3q0.a;
            default:
                Photo photo = (Photo) obj3;
                List<Tag> list6 = (List) obj2;
                if (((BaseOkResponseDto) obj).i() != 1) {
                    photo.x = list6;
                }
                return s3q0.a;
        }
    }
}
