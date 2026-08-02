package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Trace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.unity3d.services.UnityAdsConstants;
import com.vk.antispam.ProfileSpamAction;
import com.vk.billing.GoogleStorePurchasesManagerImpl;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupRedesignCardWithBottomBtnVh;
import com.vk.channels.api.Channel;
import com.vk.clips.attachments.impl.views.video.ClipsVideoAttachmentPickerFragment;
import com.vk.clips.attachments.impl.views.video.b;
import com.vk.clips.design.view.camera.controls.ClipsControlsView;
import com.vk.community.design.view.components.catalog.CommunityCardView;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.notifications.NotificationItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.user.UserSex;
import com.vk.ecomm.reviews.api.model.ReviewsActionType;
import com.vk.im.engine.internal.causation.BackpressureException;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.ui.components.common.PromoLinkAction;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.metrics.eventtracking.Event;
import com.vk.music.offline.impl.sync.MusicOfflineSyncServiceHelper;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.stat.scheme.CommonStat$TypeCommonEventItem;
import com.vk.stat.scheme.MobileOfficialAppsNftStat$TypeNftItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.bg7;
import xsna.f0r;
import xsna.fum;
import xsna.gm50;
import xsna.gzp0;
import xsna.i5e0;
import xsna.ldm;
import xsna.nyd0;
import xsna.phg0;
import xsna.s710;
import xsna.spb;
import xsna.wim;
import xsna.wk50;
import xsna.yk8;
import xsna.ytm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class by5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ by5(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v96, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        UserId userId;
        String invoke;
        int i = 10;
        int i2 = 27;
        int i3 = 5;
        str = "";
        int i4 = 2;
        int i5 = 1;
        switch (this.b) {
            case 0:
                xyh xyhVar = (xyh) this.c;
                e1w e1wVar = (e1w) this.d;
                ay5 ay5Var = (ay5) xyhVar.invoke();
                if (ay5Var != null && !ay5.c.contains(e1wVar.getClass())) {
                    ConcurrentHashMap<String, Integer> concurrentHashMap = ay5Var.b;
                    StringBuilder sb = new StringBuilder();
                    sb.append(e1wVar.c());
                    mla mlaVar = e1wVar.a;
                    if (mlaVar == null) {
                        mlaVar = null;
                    }
                    sb.append(mlaVar.b);
                    String sb2 = sb.toString();
                    final yx5 yx5Var = new yx5(null == true ? 1 : 0);
                    if (concurrentHashMap.compute(sb2, new BiFunction() { // from class: xsna.zx5
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj2, Object obj3) {
                            return (Integer) yx5.this.invoke(obj2, obj3);
                        }
                    }).intValue() == 4) {
                        m3w m3wVar = ay5Var.a;
                        String e1wVar2 = e1wVar.toString();
                        mla mlaVar2 = e1wVar.a;
                        m3wVar.invoke(new BackpressureException(e1wVar2, (mlaVar2 != null ? mlaVar2 : null).b()));
                    }
                }
                return s3q0.a;
            case 1:
                wf7 wf7Var = (wf7) this.c;
                Executor executor = ((bg7) this.d).c;
                bg7.c.a aVar = (bg7.c.a) obj;
                return System.currentTimeMillis() - aVar.b > TimeUnit.SECONDS.toMillis((long) aVar.a) ? new io.reactivex.rxjava3.internal.operators.single.r(m4s.F(wf7Var.deleteBytes(new DeleteBytesRequest(new ArrayList(), true)), executor), new l7(new wh6(i5), i3)) : m4s.F(wf7Var.retrieveBytes(new RetrieveBytesRequest(new ArrayList(), true)), executor);
            case 2:
                com.vk.movika.sdk.base.observable.p pVar = (com.vk.movika.sdk.base.observable.p) this.c;
                dy9 dy9Var = (dy9) this.d;
                fm50 fm50Var = (fm50) obj;
                pVar.invoke(fm50Var);
                ((zak0) dy9Var.e).setValue(fm50Var);
                return s3q0.a;
            case 3:
                Channel channel = (Channel) this.c;
                w8b w8bVar = (w8b) this.d;
                Group group = (Group) ((wpp) obj).c.get(Long.valueOf(channel.A.d));
                if (group != null) {
                    w8bVar.b.onNext(group);
                }
                return s3q0.a;
            case 4:
                ((ypb) this.c).m.invoke((spb.b) this.d);
                return s3q0.a;
            case 5:
                nlh0 nlh0Var = (nlh0) this.c;
                axc axcVar = (axc) this.d;
                Throwable th = (Throwable) obj;
                VideoFile A = k15.A(nlh0Var.k());
                ClipVideoFile clipVideoFile = A instanceof ClipVideoFile ? (ClipVideoFile) A : null;
                if (clipVideoFile != null) {
                    axcVar.getClass();
                    axc.c(clipVideoFile);
                }
                j03.l(th);
                return s3q0.a;
            case 6:
                View view = (View) this.c;
                ClipsControlsView clipsControlsView = (ClipsControlsView) this.d;
                int i6 = ClipsControlsView.P;
                if (((VkText) view).isClickable()) {
                    clipsControlsView.P4();
                }
                return s3q0.a;
            case 7:
                ClipsVideoAttachmentPickerFragment clipsVideoAttachmentPickerFragment = (ClipsVideoAttachmentPickerFragment) this.c;
                ClipsVideoAttachmentPickerFragment.b bVar = (ClipsVideoAttachmentPickerFragment.b) this.d;
                b.a aVar2 = (b.a) obj;
                int i7 = ClipsVideoAttachmentPickerFragment.W;
                gm50.a.a(clipsVideoAttachmentPickerFragment, aVar2.a, new dsc(clipsVideoAttachmentPickerFragment, 7));
                gm50.a.a(clipsVideoAttachmentPickerFragment, aVar2.b, new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(bVar, i2));
                gm50.a.a(clipsVideoAttachmentPickerFragment, aVar2.c, new o43(i, clipsVideoAttachmentPickerFragment, bVar));
                gm50.a.a(clipsVideoAttachmentPickerFragment, aVar2.d, new jm0(bVar, 16));
                gm50.a.a(clipsVideoAttachmentPickerFragment, aVar2.e, new n6f(bVar, i4));
                return s3q0.a;
            case 8:
                ((izs) this.c).invoke((utj) this.d);
                return s3q0.a;
            case 9:
                List list = (List) obj;
                com.vk.core.compose.component.datetime.g gVar = new com.vk.core.compose.component.datetime.g((k9x) this.c, (com.vk.core.compose.component.datetime.l) this.d, ((Boolean) list.get(0)).booleanValue());
                com.vk.core.compose.component.datetime.m mVar = gVar.a;
                mVar.a().h((String) list.get(1));
                s3q0 s3q0Var = s3q0.a;
                ((zak0) mVar.a).setValue(mVar.a());
                return gVar;
            case 10:
                xam xamVar = (xam) this.c;
                List list2 = (List) this.d;
                wim.a aVar3 = (wim.a) obj;
                ListBuilder e = e43.e();
                if (aVar3.b) {
                    e.add(ProfileSpamAction.DeleteChat.b);
                }
                if (aVar3.c) {
                    e.add(ProfileSpamAction.BlackList.b);
                }
                if (aVar3.a) {
                    e.add(ProfileSpamAction.Report.b);
                }
                ListBuilder g = e.g();
                String str2 = aVar3.d;
                if (str2 == null) {
                    str2 = "";
                }
                UserSex userSex = aVar3.e;
                xamVar.getClass();
                FragmentActivity fragmentActivity = xamVar.i;
                if (g.isEmpty()) {
                    edw edwVar = edw.a;
                    edw.d(R.string.vkim_msg_header_antispam_actions_failed, fragmentActivity, false);
                } else {
                    boolean contains = g.contains(ProfileSpamAction.BlackList.b);
                    boolean contains2 = g.contains(ProfileSpamAction.DeleteChat.b);
                    List I = rl3.I(new String[]{(contains2 && contains) ? userSex == UserSex.FEMALE ? fragmentActivity.getString(R.string.vkim_msg_spam_dialog_ban_andclear_chat_toast_message_female, str2) : fragmentActivity.getString(R.string.vkim_msg_spam_dialog_ban_andclear_chat_toast_message_male, str2) : contains2 ? fragmentActivity.getString(R.string.vkim_msg_spam_dialog_clear_chat) : contains ? userSex == UserSex.FEMALE ? fragmentActivity.getString(R.string.vkim_msg_spam_dialog_ban_toast_message_female, str2) : fragmentActivity.getString(R.string.vkim_msg_spam_dialog_ban_toast_message_male, str2) : null, g.contains(ProfileSpamAction.Report.b) ? fragmentActivity.getString(R.string.vkim_msg_spam_dialog_report) : null});
                    String g0 = ((ArrayList) I).size() < 2 ? (String) j5g.a0(I) : j5g.g0(I, ". ", null, ".", 0, null, 58);
                    str = g0 != null ? g0 : "";
                    edw edwVar2 = edw.a;
                    edw.j(fragmentActivity, str);
                }
                if (list2.contains(ProfileSpamAction.DeleteChat.b)) {
                    xamVar.k.b().i(fragmentActivity);
                }
                return s3q0.a;
            case 11:
                w2w w2wVar = (w2w) this.c;
                wqm wqmVar = (wqm) this.d;
                pdm c = w2wVar.I0().b().c();
                FolderType folderType = wqmVar.b;
                ldm i8 = c.i();
                Cursor d = i8.b.b().d(i8.a.a(ldm.a.TYPE, folderType.j()), null);
                ArrayList arrayList = new ArrayList(d.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    try {
                        if (d.moveToFirst()) {
                            while (!d.isAfterLast()) {
                                arrayList.add(ldm.c(d));
                                d.moveToNext();
                            }
                        }
                        Trace.endSection();
                        List O0 = j5g.O0(arrayList);
                        Integer j = c.j();
                        int intValue = j != null ? j.intValue() : -1;
                        List<rdm> list3 = O0;
                        edi ediVar = wqmVar.d;
                        ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                        for (rdm rdmVar : list3) {
                            ediVar.getClass();
                            arrayList2.add(new rpm(rdmVar.a, rdmVar.b, rdmVar.c));
                        }
                        return new xpp(arrayList2, intValue < cq.a(w2wVar));
                    } finally {
                        d.close();
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 12:
                fum fumVar = (fum) this.c;
                String str3 = ((i5e0.a) this.d).a;
                fumVar.getClass();
                if (fum.b.$EnumSwitchMapping$0[((PromoLinkAction) obj).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                fumVar.O(new ytm.j(str3));
                return s3q0.a;
            case 13:
                ((f0r.u) this.c).h((wk50.a) this.d, (Throwable) obj);
                return s3q0.a;
            case 14:
                i2s i2sVar = (i2s) this.c;
                e580 e580Var = (e580) this.d;
                t2s t2sVar = (t2s) obj;
                i2sVar.h.a();
                Set R0 = j5g.R0(t2sVar.f);
                R0.remove(Integer.valueOf(e580Var.b));
                return i2s.u(t2s.a(t2sVar, EmptyList.b, false, jgp.b, null, false, R0, null, true, 0, 346));
            case 15:
                List list4 = (List) this.c;
                oio oioVar = (oio) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.d() >> 32)) * ((Number) ((mtk0) this.d).getValue()).floatValue();
                if (intBitsToFloat > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    oio.r1(oioVar, yk8.a.a(list4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat, 8), 0L, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (oioVar.d() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)) / 2.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)) / 2.0f) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 242);
                }
                return s3q0.a;
            case 16:
                com.vk.dto.group.Group group2 = (com.vk.dto.group.Group) this.c;
                GroupRedesignCardWithBottomBtnVh groupRedesignCardWithBottomBtnVh = (GroupRedesignCardWithBottomBtnVh) this.d;
                CommunityCardView communityCardView = groupRedesignCardWithBottomBtnVh.i;
                if (communityCardView == null) {
                    communityCardView = null;
                }
                String s = f870.s(group2, communityCardView.getWidth());
                CommunityCardView communityCardView2 = groupRedesignCardWithBottomBtnVh.i;
                (communityCardView2 != null ? communityCardView2 : null).setCardImage(new CommunityCardView.b(s));
                return s3q0.a;
            case 17:
                return new cqx(((LayoutInflater) this.c).inflate(R.layout.vkim_chat_invitation_broadcast_item, (ViewGroup) obj, false), new h6g((bqx) this.d, 26));
            case 18:
                i210 i210Var = (i210) this.c;
                y4u y4uVar = i210Var.a;
                Context context = i210Var.b;
                f210 f210Var = (f210) this.d;
                long j2 = f210Var.c;
                int i9 = f210Var.b;
                u60 u60Var = (u60) obj;
                if (u60Var == ReviewsActionType.ACTION_COPY_TEXT) {
                    String str4 = f210Var.d;
                    ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str4, str4));
                    cvk.w(context.getString(R.string.text_copied), false);
                } else if (u60Var == ReviewsActionType.ACTION_EDIT) {
                    cxo cxoVar = i210Var.c;
                    Good good = cxoVar.r;
                    if (good != null) {
                        cxoVar.j = true;
                        ((ajg0) cxoVar.a.S.getValue()).l(context, f210Var.c, good.c, Integer.valueOf(i9));
                    }
                } else if (u60Var == ReviewsActionType.ACTION_REPORT) {
                    ((n5g0) y4uVar.H.getValue()).b(i9, context, new UserId(j2));
                } else if (u60Var == ReviewsActionType.ACTION_DELETE) {
                    c4u a = y4uVar.a();
                    cxo cxoVar2 = i210Var.c;
                    a.getClass();
                    h010 h010Var = cxoVar2.f;
                    if (h010Var == null || (userId = h010Var.c) == null) {
                        userId = UserId.d;
                    }
                    hg1.n(a.a.c(userId, j2, i9), context, false, null, 62).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new eu0(new pf4(cxoVar2, a, i9), i2), new fu0(new cg7(context, i5), 24));
                }
                return s3q0.a;
            case 19:
                t710 t710Var = (t710) this.c;
                s710.a aVar4 = (s710.a) ((s710) this.d);
                t710Var.e(new x610(aVar4.d, aVar4.c, aVar4.b, aVar4.e));
                return s3q0.a;
            case 20:
                tam0 tam0Var = (tam0) this.c;
                u440 u440Var = (u440) this.d;
                if (tam0Var.t == null) {
                    u440Var.f8(tam0Var);
                }
                if (u440Var.getCurrentIndex() == 0) {
                    u440Var.e8();
                }
                return s3q0.a;
            case 21:
                List list5 = (List) this.c;
                MusicOfflineSyncServiceHelper musicOfflineSyncServiceHelper = (MusicOfflineSyncServiceHelper) this.d;
                int intValue2 = ((Integer) obj).intValue() * 100;
                List subList = list5.subList(intValue2, Math.min(intValue2 + 100, list5.size()));
                tfx tfxVar = new tfx("audio.getMigrationPlaylistIds", new io.reactivex.rxjava3.internal.operators.observable.n0(6), new jr(5));
                tfxVar.i("playlist_ids", subList);
                return rsg0.a0(yfb.x(tfxVar)).F(new tk40(new wjw0(musicOfflineSyncServiceHelper), i5));
            case 22:
                li70 li70Var = (li70) this.c;
                Context context2 = (Context) this.d;
                View view2 = (View) obj;
                c970 c970Var = li70Var.N;
                if (c970Var != null) {
                    NotificationItem notificationItem = li70Var.c;
                    c970.d(c970Var, context2, notificationItem != null ? notificationItem.d : null, view2, 4);
                }
                li70Var.d("main_item");
                return s3q0.a;
            case 23:
                j9k j9kVar = (j9k) this.c;
                com.vk.billing.h hVar = (com.vk.billing.h) this.d;
                l27 l27Var = (l27) obj;
                BillingResult billingResult = l27Var.a;
                List<Purchase> list6 = l27Var.b;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"Billing : PurchasesManager", "Retrieved SUBSs for restore: code " + billingResult.getResponseCode() + ", products " + list6.size()});
                }
                if (billingResult.getResponseCode() != 0 || list6.isEmpty()) {
                    j9kVar.invoke(null);
                }
                hVar.b.getClass();
                SharedPreferences sharedPreferences = o27.f;
                Set<String> stringSet = (sharedPreferences != null ? sharedPreferences : null).getStringSet("acknowledged_tokens", EmptySet.b);
                if (stringSet != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list6) {
                        if (!stringSet.contains(((Purchase) obj2).getPurchaseToken())) {
                            arrayList3.add(obj2);
                        }
                    }
                    list6 = arrayList3;
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list6) {
                    if (GoogleStorePurchasesManagerImpl.a.a((Purchase) obj3) != -1) {
                        arrayList4.add(obj3);
                    }
                }
                j9kVar.invoke(j5g.a0(arrayList4));
                return s3q0.a;
            case 24:
                ((ohg0) this.c).T(new phg0.a((List) ((Ref$ObjectRef) this.d).element));
                return s3q0.a;
            case 25:
                Context context3 = (Context) this.c;
                q4l0 q4l0Var = (q4l0) this.d;
                StickerStockItem stickerStockItem = (StickerStockItem) obj;
                zal0 a2 = g2v.d().a();
                gzs<String> gzsVar = q4l0Var.n;
                if (gzsVar != null && (invoke = gzsVar.invoke()) != null) {
                    str = invoke;
                }
                stickerStockItem.O = "story_create_suggestion_".concat(str);
                s3q0 s3q0Var2 = s3q0.a;
                zal0.m(a2, context3, stickerStockItem, null, null, 60);
                return s3q0.a;
            case 26:
                ((pdn0) this.c).p.d0(((qdn0) this.d).e);
                return s3q0.a;
            case 27:
                Context context4 = (Context) this.c;
                RectF rectF = (RectF) this.d;
                VkTooltip.a aVar5 = new VkTooltip.a(context4);
                aVar5.b = context4.getString(R.string.clips_author_selector_editor_tooltip_text);
                aVar5.e = VkTooltip.Appearance.Inversion;
                aVar5.f = VkTooltip.TooltipGravity.LEFT;
                aVar5.n = new wul0(i4);
                aVar5.o = 5000L;
                Rect rect = new Rect();
                rectF.roundOut(rect);
                aVar5.a(rect);
                return s3q0.a;
            default:
                fpq0 fpq0Var = (fpq0) this.c;
                UserProfileAction.x xVar = (UserProfileAction.x) this.d;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj;
                if (xVar.b && !extendedUserProfile.K1 && extendedUserProfile.a.Y) {
                    nyd0.g e2 = fpq0Var.n.e();
                    long j3 = extendedUserProfile.a.c.b;
                    e2.getClass();
                    gzp0.a.c(new MobileOfficialAppsNftStat$TypeNftItem(MobileOfficialAppsNftStat$TypeNftItem.Source.FROM_OWN_PROFILE, new CommonStat$TypeCommonEventItem(null, Long.valueOf(j3), null, null, 13, null)));
                }
                mzp0 mzp0Var = fpq0Var.p;
                if (mzp0Var != null) {
                    mzp0Var.c(extendedUserProfile.K1);
                }
                if (xVar.b) {
                    com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
                    el3 el3Var = Event.b;
                    Event.a b = h5s.b("screen_view_data");
                    b.a(extendedUserProfile.a.c, "user_profile_id");
                    bVar2.k(b.e());
                }
                return s3q0.a;
        }
    }
}
