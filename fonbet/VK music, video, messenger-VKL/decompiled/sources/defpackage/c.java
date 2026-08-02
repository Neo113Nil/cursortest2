package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.groups.dto.GroupsGetFriendsInvitationListResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoFeedClipsBlockItemsGroupsFullResultDto;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.appredirects.entity.App;
import com.vk.appredirects.entity.LinkType;
import com.vk.appredirects.filter.AppRedirectOverrides;
import com.vk.appredirects.ui.AppRedirectsSettingsFragment;
import com.vk.auth.api.models.AuthResult;
import com.vk.catalog.mvi.block.impl.filters.HorizontalFiltersWithScrollView;
import com.vk.catalog.mvi.section.domain.CatalogFilterOptionDo;
import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import com.vk.clips.models.SdkClipOrdData;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.viewer.edit.api.domain.model.ClipCoauthorSdkItem;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditAttachedVideo;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditSdkItem;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.OrdAdInfo;
import com.vk.dto.common.OrdAdvertiser;
import com.vk.dto.common.Peer;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.photo.Photo;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.model.StoryAnswer;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.internal.storage.delegates.channel_messages.ChannelMessageColumn;
import com.vk.im.engine.models.attaches.AttachComments;
import com.vk.im.engine.models.attaches.AuthorAd;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.movika.sdk.base.logic.interactor.h;
import com.vk.music.offline.configs.api.domain.model.ReactionsConfig;
import com.vk.music.restriction.ResubscribeRequiredException;
import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.b;
import com.vk.superapp.browser.ui.VkBrowserActivity;
import com.vk.superapp.common.js.bridge.api.events.GetUserInfo$Error;
import com.vk.superapp.common.js.bridge.api.events.GetUserInfo$Parameters;
import com.vk.voip.ui.broadcast.list.ui.PastBroadcastsFragment;
import com.vk.voip.ui.broadcast.list.ui.a;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.core.a;
import io.reactivex.rxjava3.core.g;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.completable.i;
import io.reactivex.rxjava3.internal.operators.flowable.f;
import io.reactivex.rxjava3.internal.operators.flowable.y;
import io.reactivex.rxjava3.internal.operators.single.r;
import io.reactivex.rxjava3.internal.operators.single.s;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.asu0;
import xsna.b9a0;
import xsna.bdb;
import xsna.bg1;
import xsna.bn40;
import xsna.c2r0;
import xsna.c5g;
import xsna.c5p;
import xsna.c8a0;
import xsna.cn70;
import xsna.cr;
import xsna.d5v;
import xsna.drx;
import xsna.e0w;
import xsna.e28;
import xsna.e3m;
import xsna.e40;
import xsna.e43;
import xsna.e55;
import xsna.eag0;
import xsna.efq;
import xsna.epx;
import xsna.eqc;
import xsna.eyf;
import xsna.f55;
import xsna.f810;
import xsna.fb50;
import xsna.fco0;
import xsna.fl3;
import xsna.fyh;
import xsna.fyr0;
import xsna.g2b;
import xsna.gn0;
import xsna.gzs;
import xsna.hkx0;
import xsna.hu4;
import xsna.hyg0;
import xsna.i0q0;
import xsna.i5g;
import xsna.ikv0;
import xsna.iu4;
import xsna.iu50;
import xsna.izs;
import xsna.j7k0;
import xsna.j83;
import xsna.ks2;
import xsna.ku1;
import xsna.kyh;
import xsna.l55;
import xsna.lb;
import xsna.lna0;
import xsna.ls2;
import xsna.maz;
import xsna.mo1;
import xsna.mwa;
import xsna.myc0;
import xsna.nq1;
import xsna.nz;
import xsna.o83;
import xsna.p810;
import xsna.pdg0;
import xsna.pn40;
import xsna.pxh;
import xsna.q640;
import xsna.qdz;
import xsna.qfe;
import xsna.r3b;
import xsna.r55;
import xsna.rdi;
import xsna.rli0;
import xsna.rm9;
import xsna.s2f0;
import xsna.s3q0;
import xsna.sp;
import xsna.sx8;
import xsna.tlo0;
import xsna.tq;
import xsna.ty4;
import xsna.uib;
import xsna.ulp0;
import xsna.ums0;
import xsna.umu0;
import xsna.uoh;
import xsna.ux8;
import xsna.v4b;
import xsna.vz80;
import xsna.w2w;
import xsna.wjs0;
import xsna.wk50;
import xsna.wmd0;
import xsna.xa4;
import xsna.xbu0;
import xsna.xgl0;
import xsna.xi9;
import xsna.xo2;
import xsna.xqm0;
import xsna.y10;
import xsna.y810;
import xsna.yzt0;
import xsna.zcl;
import xsna.zqa;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class c implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x040f, code lost:
    
        if (((xsna.eqc.a.b) r2).a.isEmpty() == false) goto L127;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v50, types: [T, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String, xsna.ikv0$d$a, xsna.zcl] */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        a aVar;
        Object bVar;
        OrdAdInfo ordAdInfo;
        int i = this.b;
        int i2 = 5;
        int i3 = 2;
        int i4 = 3;
        boolean z = true;
        z = true;
        byte b = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                l0 l0Var = (l0) obj3;
                GetUserInfo$Parameters getUserInfo$Parameters = (GetUserInfo$Parameters) obj2;
                Throwable th = (Throwable) obj;
                if (fco0.d(th)) {
                    l0Var.w0().h(fco0.h(getUserInfo$Parameters.d(), th));
                } else {
                    b.o(l0Var.w0().a, new JsMethod("VKWebAppGetUserInfo"), new GetUserInfo$Error(r7, new GetUserInfo$Error.Data(GetUserInfo$Error.Data.Type.API_ERROR, getUserInfo$Parameters.d(), null, fco0.g(th), 4, null), z ? 1 : 0, r7), null, null, 12);
                }
                return s3q0.a;
            case 1:
                AppRedirectsSettingsFragment appRedirectsSettingsFragment = (AppRedirectsSettingsFragment) obj3;
                j83 j83Var = (j83) obj2;
                final App app2 = (App) obj;
                final LinkType linkType = j83Var.a;
                final App app3 = j83Var.b;
                int i5 = AppRedirectsSettingsFragment.L0;
                View view = appRedirectsSettingsFragment.b0;
                if (view != null) {
                    xo2.f(view, true, true, 300L);
                }
                final Context requireContext = appRedirectsSettingsFragment.requireContext();
                v vVar = new v(new Callable() { // from class: xsna.f83
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        App app4;
                        int delete;
                        App app5 = App.this;
                        Context context = requireContext;
                        if (y53.a(app5, context) < 1) {
                            throw new AppRedirectOverrides.VersionTooLowException(y53.b(app5, context));
                        }
                        App app6 = app3;
                        if (y53.a(app6, context) < 1) {
                            throw new AppRedirectOverrides.VersionTooLowException(y53.b(app6, context));
                        }
                        switch (k83.$EnumSwitchMapping$0[BuildInfo.a.ordinal()]) {
                            case 1:
                                app4 = App.VK_APP;
                                break;
                            case 2:
                                app4 = App.VK_ME;
                                break;
                            case 3:
                                app4 = App.VK_CALLS;
                                break;
                            case 4:
                                app4 = App.VK_VIDEO;
                                break;
                            case 5:
                                app4 = App.VK_TV;
                                break;
                            case 6:
                                app4 = App.VK_DATING;
                                break;
                            case 7:
                                app4 = App.VK_MUSIC;
                                break;
                            default:
                                app4 = App.VK_APP;
                                break;
                        }
                        LinkType linkType2 = linkType;
                        if (app4 == app6) {
                            Set R0 = j5g.R0(AppRedirectOverrides.a(context));
                            boolean remove = R0.remove(linkType2);
                            if (remove) {
                                AppRedirectOverrides.c(context, R0);
                            }
                            delete = remove ? 1 : 2;
                        } else {
                            delete = context.getContentResolver().delete(Uri.parse("content://" + app6.i() + "/deeplinks"), String.valueOf(linkType2.ordinal()), null);
                        }
                        if (delete == 0) {
                            throw new AppRedirectOverrides.AppRedirectSettingChangeFailedException(app6);
                        }
                        if (AppRedirectOverrides.b(context, app5, linkType2)) {
                            return s3q0.a;
                        }
                        if (delete == 1) {
                            AppRedirectOverrides.b(context, app6, linkType2);
                        }
                        throw new AppRedirectOverrides.AppRedirectSettingChangeFailedException(app5);
                    }
                });
                asu0 asu0Var = asu0.a;
                vVar.q(asu0Var.c()).m(asu0Var.d()).subscribe(new gn0(new o83(appRedirectsSettingsFragment, linkType, app2, b), i3), new bg1(new lb(appRedirectsSettingsFragment, i2), i3));
                return s3q0.a;
            case 2:
                ((AtomicReference) obj3).set(new pdg0.b(obj));
                ((CountDownLatch) obj2).countDown();
                return s3q0.a;
            case 3:
                hu4 hu4Var = (hu4) obj3;
                yzt0 yzt0Var = (yzt0) obj2;
                ReactionsConfig reactionsConfig = (ReactionsConfig) obj;
                if (reactionsConfig == null) {
                    return s3q0.a;
                }
                hu4Var.e.setText(reactionsConfig.b);
                if (hu4Var.k == null) {
                    hu4Var.k = new s2f0(reactionsConfig.d, (String) yzt0Var.a(), new nq1(hu4Var, z ? 1 : 0));
                }
                hu4Var.i.setAdapter(hu4Var.k);
                return s3q0.a;
            case 4:
                ((ty4) obj3).b.invoke(new ty4.b.a((Throwable) obj, (ClipGridParams.Data.Music) obj2));
                return s3q0.a;
            case 5:
                Context context = (Context) obj3;
                AuthResult authResult = (AuthResult) obj2;
                xbu0 xbu0Var = (xbu0) obj;
                r55 r55Var = r55.a;
                c2r0 j = r55.j();
                umu0 umu0Var = r55.g;
                (umu0Var != null ? umu0Var : 0).getClass();
                l55.a.getClass();
                if (j != null) {
                    xbu0 xbu0Var2 = xbu0.i;
                    if (xbu0Var != xbu0.b.a()) {
                        ulp0 ulp0Var = new ulp0(new i5g(xbu0Var.a()), new mo1(i4));
                        UserId uid = authResult.getUid();
                        String d = xbu0Var.d();
                        String b2 = xbu0Var.b();
                        String c = xbu0Var.c();
                        AccountProfileType.a aVar2 = AccountProfileType.Companion;
                        Integer valueOf = Integer.valueOf(xbu0Var.e().h());
                        aVar2.getClass();
                        AccountProfileType a = AccountProfileType.a.a(valueOf);
                        if (a == null) {
                            a = AccountProfileType.NORMAL;
                        }
                        List A = rli0.A(new ulp0(rli0.w(ulp0Var, new c2r0.b(uid, d, b2, c, true, a)), new ku1(i4, j, context)));
                        int i6 = g.b;
                        Objects.requireNonNull(A, "source is null");
                        aVar = new s(new f(new y(A).g(io.reactivex.rxjava3.internal.functions.a.a, Integer.MAX_VALUE).j(io.reactivex.rxjava3.schedulers.a.b()), new a.r(new ArrayList()), new iu4(new e55(b, b), z ? 1 : 0)), new nz(new f55(context, j, authResult, b), i2));
                        return io.reactivex.rxjava3.core.a.m(e43.l(aVar, i.b)).q(io.reactivex.rxjava3.schedulers.a.b());
                    }
                }
                aVar = i.b;
                return io.reactivex.rxjava3.core.a.m(e43.l(aVar, i.b)).q(io.reactivex.rxjava3.schedulers.a.b());
            case 6:
                e28 e28Var = (e28) obj3;
                e28Var.i.setSelected(false);
                e28Var.j.setSelected(false);
                e28Var.k.setSelected(true);
                e28Var.b.setVisibility(8);
                e28Var.c.setVisibility(8);
                e28Var.d.setVisibility(0);
                ((c5p) obj2).b(CollageStatEvent.g.a);
                return s3q0.a;
            case 7:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                sx8 sx8Var = (sx8) obj;
                List list = (List) ref$ObjectRef.element;
                ?? I = rdi.I(list.indexOf(sx8Var), sx8.a(sx8Var, !sx8Var.f), list);
                ref$ObjectRef.element = I;
                ux8 ux8Var = (ux8) ((Ref$ObjectRef) obj2).element;
                if (ux8Var != 0) {
                    ux8Var.setItems(I);
                }
                return s3q0.a;
            case 8:
                com.vk.storycamera.builder.a aVar3 = (com.vk.storycamera.builder.a) obj3;
                xi9 xi9Var = (xi9) obj2;
                xi9.a aVar4 = (xi9.a) obj;
                StoryCameraParams.a.p(aVar3, aVar4.a);
                StoryAnswer storyAnswer = aVar4.b;
                if (storyAnswer != null) {
                    aVar3.x = Collections.singletonList(storyAnswer);
                }
                if (aVar4.a != null || storyAnswer != null) {
                    aVar3.g = e43.o(StoryCameraMode.STORY, StoryCameraMode.STORY_VIDEO, StoryCameraMode.PING_PONG);
                }
                Context context2 = xi9Var.e.get();
                if (context2 != null) {
                    aVar3.D(xa4.L(context2), 5225, null);
                }
                return s3q0.a;
            case 9:
                return com.vk.channels.impl.comments.g.a((com.vk.channels.impl.comments.g) obj, com.vk.channels.impl.comments.b.s((com.vk.channels.impl.comments.b) obj3, (mwa.a) obj2, false, 3), null, null, false, 14);
            case 10:
                ((e0w) obj).execSQL("DELETE FROM " + ((g2b) obj3).b.a + " WHERE " + ChannelMessageColumn.LOCAL_ID.getKey() + " IN(" + ((String) obj2) + ')');
                return s3q0.a;
            case 11:
                v4b v4bVar = (v4b) obj3;
                xgl0 xgl0Var = (xgl0) obj;
                Peer H0 = ((w2w) obj2).H0();
                MsgFromChannel msgFromChannel = v4bVar.d;
                boolean z2 = v4bVar.g;
                uib a2 = xgl0Var.a();
                Peer peer = v4bVar.c;
                bdb c2 = a2.c(peer.b);
                if (c2 == null) {
                    throw new IllegalStateException("Channel can't be absent");
                }
                long j2 = c2.b;
                r3b e = z2 ? xgl0Var.e() : xgl0Var.y();
                hkx0 spVar = z2 ? new sp(21) : new eyf();
                g2b g2bVar = e.b;
                g2bVar.getClass();
                StringBuilder sb = new StringBuilder("\n            SELECT ");
                cr.a(ChannelMessageColumn.CNV_MSG_ID, sb, "\n            FROM ");
                sb.append(g2bVar.b.a);
                sb.append("\n            WHERE ");
                sb.append(ChannelMessageColumn.CHANNEL_ID.getKey());
                sb.append(" = ");
                sb.append(j2);
                sb.append("\n            ORDER BY cnv_msg_id DESC LIMIT 1\n            ");
                Integer J = fl3.J(g2bVar.d.b().d(xqm0.g(sb.toString()), null));
                int intValue = J != null ? J.intValue() : Integer.MAX_VALUE;
                ChannelMsgSendConfig channelMsgSendConfig = v4bVar.f;
                MsgFromChannel msgFromChannel2 = new MsgFromChannel(msgFromChannel);
                msgFromChannel2.c = j2;
                Long l = c2.w;
                if (l != null) {
                    long longValue = l.longValue();
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    msgFromChannel2.O = Peer.a.b(longValue);
                }
                msgFromChannel2.u = c2.r;
                msgFromChannel2.h = peer;
                Date l2 = channelMsgSendConfig.l();
                if (l2 != null) {
                    msgFromChannel2.I = MsgFromChannel.b.a(msgFromChannel2.I, null, 0, null, null, null, null, false, null, null, 0, 0, l2.getTime(), false, 66846719);
                }
                msgFromChannel2.P = v4bVar.e;
                msgFromChannel2.L = z2;
                AttachComments attachComments = channelMsgSendConfig.f() ? new AttachComments(0, true, true, true, true) : null;
                if (attachComments != null) {
                    msgFromChannel2.jc(attachComments);
                }
                if (!channelMsgSendConfig.d()) {
                    Serializer.c<Peer> cVar2 = Peer.CREATOR;
                    H0 = Peer.Unknown.e;
                }
                msgFromChannel2.I = MsgFromChannel.b.a(msgFromChannel2.I, null, 0, null, null, null, H0, false, null, null, 0, 0, 0L, false, 67104767);
                msgFromChannel2.Q = channelMsgSendConfig.F();
                msgFromChannel2.p = spVar.b(msgFromChannel2, intValue);
                Msg e2 = e.b.e(msgFromChannel.b);
                MsgFromChannel msgFromChannel3 = e2 != null ? (MsgFromChannel) e2 : null;
                if (msgFromChannel3 != null) {
                    msgFromChannel2.d = msgFromChannel3.d;
                    msgFromChannel2.N = msgFromChannel3.N;
                    MsgFromChannel.b a3 = MsgFromChannel.b.a(msgFromChannel2.I, null, 0, null, null, null, null, msgFromChannel3.I.n, null, null, 0, 0, 0L, false, 67100671);
                    msgFromChannel2.I = a3;
                    AuthorAd authorAd = msgFromChannel3.I.h;
                    if (authorAd != null) {
                        msgFromChannel2.I = MsgFromChannel.b.a(a3, null, 0, null, authorAd, null, null, false, null, null, 0, 0, 0L, false, 67108735);
                    }
                    PostDonut postDonut = msgFromChannel3.I.g;
                    if (postDonut != null) {
                        msgFromChannel2.I = MsgFromChannel.b.a(msgFromChannel2.I, null, 0, postDonut, null, null, null, false, null, null, 0, 0, 0L, false, 67108799);
                    }
                    e.e(msgFromChannel.b);
                }
                e.o(msgFromChannel2);
                return msgFromChannel2;
            case 12:
                qfe qfeVar = (qfe) obj3;
                com.vk.lists.c cVar3 = (com.vk.lists.c) obj2;
                ShortVideoFeedClipsBlockItemsGroupsFullResultDto shortVideoFeedClipsBlockItemsGroupsFullResultDto = (ShortVideoFeedClipsBlockItemsGroupsFullResultDto) obj;
                List e3 = ums0.e(qfeVar.j, shortVideoFeedClipsBlockItemsGroupsFullResultDto.f(), shortVideoFeedClipsBlockItemsGroupsFullResultDto.i(), shortVideoFeedClipsBlockItemsGroupsFullResultDto.e(), false, 52);
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : e3) {
                    if (obj4 instanceof ClipVideoFile) {
                        arrayList.add(obj4);
                    }
                }
                eqc eqcVar = qfeVar.k;
                eqcVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (eqcVar.a.add(((ClipVideoFile) next).r1())) {
                        arrayList2.add(next);
                    }
                }
                if (arrayList.isEmpty() || !arrayList2.isEmpty()) {
                    eqcVar.b = 0;
                    bVar = new eqc.a.b(arrayList2);
                } else {
                    int i7 = eqcVar.b;
                    if (i7 < 3) {
                        eqcVar.b = i7 + 1;
                        bVar = eqc.a.c.a;
                    } else {
                        eqcVar.b = 0;
                        bVar = eqc.a.C2834a.a;
                    }
                }
                cVar3.s(shortVideoFeedClipsBlockItemsGroupsFullResultDto.g());
                if (!myc0.f(shortVideoFeedClipsBlockItemsGroupsFullResultDto.g())) {
                    if (bVar instanceof eqc.a.b) {
                        break;
                    } else if (!(bVar instanceof eqc.a.c) && !(bVar instanceof eqc.a.C2834a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = false;
                }
                cVar3.r(z);
                return bVar;
            case 13:
                wk50.a aVar5 = (wk50.a) obj2;
                lna0 lna0Var = (lna0) obj;
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a.d(aVar5, false);
                aVar5.a(c.r.C1015r.b);
                ((com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a) obj3).c.b(new kyh.a.n(lna0Var.a, lna0Var.b));
                return s3q0.a;
            case 14:
                return new pxh((ViewGroup) obj, ((fyh) obj2).i, ((Boolean) ((h) obj3).invoke()).booleanValue(), cn70.b(16));
            case 15:
                gzs gzsVar = (gzs) obj2;
                Activity h = e3m.h((Context) obj3);
                if (h == null) {
                    return s3q0.a;
                }
                ikv0.a aVar6 = new ikv0.a(h);
                aVar6.u = new ikv0.d(h.getString(R.string.stories_discover_has_been_hidden), (String) r7, (ikv0.d.a) r7, 6);
                aVar6.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, h.getString(R.string.cancel), new uoh(gzsVar, 9));
                i0q0.d(300L, new ls2(4, aVar6, h));
                return s3q0.a;
            case 16:
                ClipVideoFile clipVideoFile = (ClipVideoFile) obj3;
                gzs gzsVar2 = (gzs) obj2;
                ClipEditSdkItem clipEditSdkItem = (ClipEditSdkItem) obj;
                String str = clipEditSdkItem.h;
                List<ClipCoauthorSdkItem> list2 = clipEditSdkItem.m;
                ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
                for (ClipCoauthorSdkItem clipCoauthorSdkItem : list2) {
                    UserId userId = clipCoauthorSdkItem.b;
                    String str2 = clipCoauthorSdkItem.d;
                    CoOwnerItem.StatusDto statusDto = clipCoauthorSdkItem.f ? CoOwnerItem.StatusDto.APPROVED : CoOwnerItem.StatusDto.PENDING;
                    Serializer.c<Image> cVar4 = Image.CREATOR;
                    arrayList3.add(new CoOwnerItem(userId, statusDto, new Owner(userId, clipCoauthorSdkItem.c, str2, null, null, Image.b.c(str2, 50, 50, ImageSizeKey.SIZE_KEY_UNDEFINED), null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194264, null), clipCoauthorSdkItem.g, null));
                }
                ClipVideoFile Kb = ClipVideoFile.Kb(clipVideoFile, false, str, null, arrayList3, null, null, null, 8353791);
                List<ImageUrl> list3 = clipEditSdkItem.i.b;
                ArrayList arrayList4 = new ArrayList(c5g.u(list3, 10));
                for (ImageUrl imageUrl : list3) {
                    arrayList4.add(new ImageSize(imageUrl.b, imageUrl.f, (char) 0, false, 12, (zcl) null));
                }
                Kb.I0 = new Image(arrayList4);
                Kb.m = clipEditSdkItem.h;
                SdkClipOrdData sdkClipOrdData = clipEditSdkItem.k;
                if (sdkClipOrdData != null) {
                    String str3 = sdkClipOrdData.e;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = sdkClipOrdData.d;
                    ordAdInfo = new OrdAdInfo(str3, e43.m(str4 != null ? new OrdAdvertiser("", str4) : null));
                } else {
                    ordAdInfo = null;
                }
                Kb.d0 = ordAdInfo;
                ActionLink actionLink = clipVideoFile.Y;
                boolean f = epx.f(actionLink != null ? actionLink.c : null, "video");
                ClipEditAttachedVideo clipEditAttachedVideo = clipEditSdkItem.l;
                boolean z3 = clipEditAttachedVideo instanceof ClipEditAttachedVideo.Full;
                if (f || z3) {
                    SdkActionLink sdkActionLink = z3 ? ((ClipEditAttachedVideo.Full) clipEditAttachedVideo).b : null;
                    Kb.Y = sdkActionLink != null ? y10.a(sdkActionLink) : null;
                }
                wjs0.a(new fyr0(Kb));
                gzsVar2.invoke();
                return s3q0.a;
            case 17:
                efq efqVar = (efq) obj3;
                ExternalNpsCondition externalNpsCondition = (ExternalNpsCondition) obj2;
                Boolean bool = (Boolean) obj;
                L l3 = L.a;
                l3.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l3, L.LogType.d, new Object[]{"CLIPS_NPS", "isPollRetrieved: " + bool + "; " + externalNpsCondition});
                }
                if (bool.booleanValue()) {
                    efqVar.b.onNext(externalNpsCondition);
                }
                return s3q0.a;
            case 18:
                ((izs) obj3).invoke(new HorizontalFiltersWithScrollView.a.b(((HorizontalFiltersWithScrollView.c.a) ((HorizontalFiltersWithScrollView.c) obj2)).a, ((CatalogFilterOptionDo) obj).d));
                return s3q0.a;
            case 19:
                drx drxVar = (drx) obj3;
                drxVar.i.c(false);
                drxVar.i.k("invite_friends_screen_not_invited");
                ((izs) obj2).invoke((GroupsGetFriendsInvitationListResponseDto) obj);
                return s3q0.a;
            case 20:
                Context context3 = (Context) obj3;
                eag0 eag0Var = (eag0) obj;
                int i8 = VkBrowserActivity.l;
                context3.startActivities(new Intent[]{(Intent) obj2, VkBrowserActivity.a.b(context3, eag0Var.a, eag0Var.b.b)});
                return s3q0.a;
            case 21:
                p810.k kVar = (p810.k) obj;
                return new r(x.k(kVar), new e40(new rm9(kVar, (f810) obj3, (y810) obj2, i4), 18));
            case 22:
                ((Boolean) obj).getClass();
                ((q640) obj3).f = null;
                ((wmd0) obj2).invoke();
                return s3q0.a;
            case 23:
                pn40 pn40Var = (pn40) obj3;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj2;
                Throwable th2 = (Throwable) obj;
                pn40Var.a = null;
                if (th2 instanceof ResubscribeRequiredException) {
                    if (((ResubscribeRequiredException) th2).d()) {
                        pn40Var.b.c();
                    }
                    bn40.f("MusicMessageQueue", "resubscribe()");
                    pn40Var.a((gzs) ref$ObjectRef2.element);
                } else {
                    bn40.c(th2, "MusicMessageQueue");
                }
                return s3q0.a;
            case 24:
                ((fb50) obj3).c.g((hyg0) obj, (ArrayList) obj2);
                return s3q0.a;
            case 25:
                ((iu50) obj3).b.a(new Pair<>((UserId) obj2, new d5v.a((Narrative) obj)));
                return s3q0.a;
            case 26:
                maz e4 = ((qdz) ((com.vk.newsfeed.impl.fragments.a) obj3).f.getValue()).e();
                LaunchContext.a aVar7 = new LaunchContext.a();
                aVar7.o = Boolean.TRUE;
                maz.c(e4, (Context) obj2, (String) obj, aVar7.a(), null, null, 24);
                return s3q0.a;
            case 27:
                return ((vz80) obj3).e.a((zqa) obj2);
            case 28:
                int i9 = PastBroadcastsFragment.U;
                ((PastBroadcastsFragment) obj3).fo((a.c) obj, (PastBroadcastsFragment.c) obj2);
                return s3q0.a;
            default:
                c8a0 c8a0Var = (c8a0) obj3;
                c8a0Var.g.invoke(new b9a0.k(new j7k0(tq.h(tlo0.Companion, R.string.photo_flow_photo_unpin_error), Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), new tlo0.f(R.string.photos_retry), new ks2(23, c8a0Var, (Photo) obj2), null, 32)));
                L.i((Throwable) obj);
                return s3q0.a;
        }
    }
}
