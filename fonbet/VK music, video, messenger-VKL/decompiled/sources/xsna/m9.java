package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.util.Size;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.audiomsg.player.Speed;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipDiscoverVh;
import com.vk.core.util.DefaultHashMap;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.common.DownloadState;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.user.UserProfile;
import com.vk.feed.blacklist.impl.presentation.blacklist.BlacklistFragment;
import com.vk.feed.blacklist.impl.presentation.blacklist.a;
import com.vk.feed.blacklist.impl.presentation.blacklist.f;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalRequestLoggingInfo;
import com.vk.libvideo.bottomsheet.about.delegate.x;
import com.vk.log.L;
import com.vk.movika.api.InteractiveData;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.b4;
import xsna.cri;
import xsna.dt1;
import xsna.fcw;
import xsna.gcw;
import xsna.ikv0;
import xsna.nkq;
import xsna.pkm;
import xsna.q630;
import xsna.qn60;
import xsna.t6v;
import xsna.v1j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r3v28, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        Context context;
        int i = this.b;
        int i2 = 3;
        boolean z = true;
        z = true;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                VideoFile videoFile = (VideoFile) obj3;
                x.b bVar = (x.b) obj2;
                h270 autoPlayDelegate = bVar.t.getAutoPlayDelegate();
                boolean z2 = bVar.m;
                int i3 = x.b.C1222b.$EnumSwitchMapping$1[bVar.o.ordinal()];
                bVar.l.d(new b4.b0(videoFile, autoPlayDelegate, z2, i3 != 1 ? i3 != 2 ? CommonVideoStat$TypeScreenMode.PREVIEW : CommonVideoStat$TypeScreenMode.FULLSCREEN_LANDSCAPE : CommonVideoStat$TypeScreenMode.DISCOVERY));
                return s3q0.a;
            case 1:
                f.b.C1035b c1035b = (f.b.C1035b) obj2;
                int i4 = BlacklistFragment.V;
                ((BlacklistFragment) obj3).getFeature().C(new a.b(c1035b.a, c1035b.b));
                ((ikv0) obj).a();
                return s3q0.a;
            case 2:
                return ((w89) obj3).b((s89) obj, (String) obj2);
            case 3:
                File file = (File) obj;
                return new io.reactivex.rxjava3.internal.operators.observable.b1(new io.reactivex.rxjava3.internal.operators.observable.q(new yhs0((Uri) obj2, ((com.vk.cameraui.impl.a) obj3).b.getContext(), file)).r0(asu0.a.d())).e(new io.reactivex.rxjava3.internal.operators.single.v(new bp0(file, z ? 1 : 0)));
            case 4:
                a3b a3bVar = (a3b) obj3;
                MsgFromChannel msgFromChannel = (MsgFromChannel) obj;
                io.reactivex.rxjava3.internal.operators.completable.p c = a3bVar.c(msgFromChannel, (ChannelType) obj2);
                Parcelable.Creator<ChannelMsgSendConfig> creator = ChannelMsgSendConfig.CREATOR;
                return c.c(new io.reactivex.rxjava3.internal.operators.completable.p(a3bVar.a(msgFromChannel, ChannelMsgSendConfig.a(ChannelMsgSendConfig.a.a(msgFromChannel.Q), null, false, false, false, false, null, null, null, null, false, false, false, false, null, 32766))));
            case 5:
                ttb ttbVar = (ttb) obj2;
                Peer peer = ((stb) obj3).f;
                if (peer != null) {
                    ttbVar.e.a(peer);
                }
                return s3q0.a;
            case 6:
                View view = (View) obj3;
                c6f c6fVar = ((ClipDiscoverVh) obj2).b;
                f4m.y(c6fVar != null ? c6fVar.T3() : 0, view);
                return s3q0.a;
            case 7:
                m1e m1eVar = (m1e) obj3;
                izs izsVar = (izs) obj2;
                if (!((ClipsDraftPersistentStore) obj).n()) {
                    m1eVar.getClass();
                    if (o25.a().b()) {
                        z = false;
                    }
                }
                izsVar.invoke(Boolean.valueOf(z));
                return s3q0.a;
            case 8:
                mdg mdgVar = (mdg) obj3;
                iag iagVar = (iag) obj2;
                VKList vKList = (VKList) obj;
                UserProfile userProfile = new UserProfile();
                userProfile.c = iagVar.getUid();
                userProfile.e = iagVar.y1();
                userProfile.h = iagVar.va();
                if (vKList.size() > 0) {
                    UserProfile userProfile2 = (UserProfile) j5g.Y(vKList);
                    if (fkq0.c(userProfile2.c)) {
                        mdgVar.g8(userProfile2);
                    } else {
                        userProfile.s.putAll(userProfile2.s);
                        mdgVar.g8(userProfile);
                    }
                } else {
                    mdgVar.g8(userProfile);
                }
                return s3q0.a;
            case 9:
                yua yuaVar = (yua) obj3;
                wh50 wh50Var = (wh50) obj2;
                if (((ljo0) obj).e() && (str = yuaVar.b) != null) {
                    wh50Var.setValue(str);
                }
                return s3q0.a;
            case 10:
                Context context2 = (Context) obj3;
                vmh vmhVar = (vmh) obj2;
                if (((ExtendedCommunityProfile) obj).M2.b) {
                    return new s4m(context2.getString(R.string.community_payment_delivery_return), R.drawable.vk_icon_cube_box_outline_20, VkMiniInfoCell.Mode.Link, new mag(vmhVar, i2), null, null, null, null, 4068);
                }
                return null;
            case 11:
                k2j k2jVar = (k2j) obj3;
                g2j g2jVar = (g2j) obj2;
                if (((View) obj).isEnabled()) {
                    k2jVar.l.invoke(new v1j.e(g2jVar.b.a.a));
                }
                return s3q0.a;
            case 12:
                ((izs) obj3).invoke(uu20.a((uu20) obj2, (String) obj, null, null, null, null, 30));
                return s3q0.a;
            case 13:
                rh4 rh4Var = (rh4) obj2;
                View view2 = (View) obj;
                androidx.appcompat.app.d dVar = ((vdl) obj3).j;
                if (dVar != null) {
                    dVar.cancel();
                }
                rh4Var.invoke(view2);
                return s3q0.a;
            case 14:
                SQLiteStatement compileStatement = ((e0w) obj).compileStatement(((pkm) obj3).a.e());
                for (okm okmVar : (List) obj2) {
                    compileStatement.clearBindings();
                    compileStatement.bindString(pkm.a.ID.h(), okmVar.a);
                    int h = pkm.a.APPEARANCE_ID.h();
                    String str2 = okmVar.f;
                    if (str2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    compileStatement.bindString(h, str2);
                    int h2 = pkm.a.BACKGROUND_ID.h();
                    String str3 = okmVar.g;
                    if (str3 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    compileStatement.bindString(h2, str3);
                    compileStatement.bindLong(pkm.a.UPDATE_TIME.h(), okmVar.b);
                    rdi.i(compileStatement, pkm.a.IS_HIDDEN.h(), okmVar.c);
                    compileStatement.bindLong(pkm.a.SORT.h(), okmVar.d);
                    compileStatement.bindLong(pkm.a.LAST_SYNC_TIME_MS.h(), okmVar.e);
                    compileStatement.executeInsert();
                }
                return s3q0.a;
            case 15:
                final SnapshotStateList snapshotStateList = (SnapshotStateList) obj2;
                nvy nvyVar = (nvy) obj;
                for (Object obj4 : ((nkq.a) ((mtk0) obj3).getValue()).b) {
                    int i5 = r5 + 1;
                    if (r5 < 0) {
                        e43.t();
                        throw null;
                    }
                    final jfz jfzVar = (jfz) obj4;
                    nvy.g(nvyVar, null, null, new jai(-409967385, new yzs() { // from class: xsna.pkq
                        @Override // xsna.yzs
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i6;
                            int i7;
                            lg90 b;
                            int i8;
                            androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj6;
                            int intValue = ((Integer) obj7).intValue();
                            if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-409967385, intValue, -1, "com.vk.ads.easypromote.impl.presentation.FaqView.CollapsibleLazyColumns.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FaqView.kt:120)");
                                }
                                jfz jfzVar2 = jfz.this;
                                boolean z3 = jfzVar2.c;
                                float f = z3 ? 12 : 0;
                                q630.a aVar2 = q630.a.a;
                                q630 f2 = txj0.f(aVar2, 1.0f);
                                SnapshotStateList snapshotStateList2 = snapshotStateList;
                                int i9 = r3;
                                if (z3) {
                                    aVar.K(1548809787);
                                    boolean J = aVar.J(snapshotStateList2) | aVar.o(i9);
                                    Object x = aVar.x();
                                    if (J || x == a.C0011a.a) {
                                        x = new qkq(snapshotStateList2, i9, 0);
                                        aVar.R(x);
                                    }
                                    f2 = ojc.c(f2, false, null, null, (gzs) x, 15);
                                } else {
                                    aVar.K(1544030331);
                                }
                                aVar.j();
                                dt1.a.getClass();
                                androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, aVar, 48);
                                int hashCode = Long.hashCode(n34.n(aVar));
                                sy90 D = aVar.D();
                                q630 c2 = qri.c(aVar, f2);
                                cri.h7.getClass();
                                LayoutNode.a aVar3 = cri.a.b;
                                if (aVar.N() == null) {
                                    n34.r();
                                    throw null;
                                }
                                aVar.H();
                                if (aVar.L()) {
                                    aVar.I(aVar3);
                                } else {
                                    aVar.f();
                                }
                                k9q0.w(aVar, a, cri.a.f);
                                k9q0.w(aVar, D, cri.a.e);
                                k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                                k9q0.t(aVar, cri.a.h);
                                k9q0.w(aVar, c2, cri.a.d);
                                float f3 = 12;
                                q630 H = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 5);
                                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                    szw.a("invalid weight; must be greater than zero");
                                }
                                yqv0.c(jfzVar2.a, defpackage.j0.d(1.0f, H, true), wlb0.h(aVar).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar).M, aVar, 0, 0, 8184);
                                androidx.compose.runtime.a aVar4 = aVar;
                                if (z3) {
                                    aVar4.K(-458804088);
                                    q630 q = txj0.q(aVar2, 24);
                                    i6 = i9;
                                    if (((Boolean) snapshotStateList2.get(i6)).booleanValue()) {
                                        aVar4.K(-458645895);
                                        if (androidx.compose.runtime.b.d()) {
                                            i8 = 0;
                                            androidx.compose.runtime.b.f(843978512, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronUp24> (VkSdkIcons.kt:532)");
                                        } else {
                                            i8 = 0;
                                        }
                                        b = pg90.a(R.drawable.vk_icon_chevron_up_24, i8, aVar4);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        aVar4.j();
                                    } else {
                                        aVar4.K(-458546633);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-141445858, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronDown24> (VkSdkIcons.kt:420)");
                                        }
                                        b = or.b(aVar4, -450463739, R.drawable.vk_icon_chevron_down_24, aVar4, 0);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        aVar4.j();
                                    }
                                    pzu0.b(b, null, q, wlb0.h(aVar4).getIcon().l, aVar4, 440, 0);
                                } else {
                                    i6 = i9;
                                    aVar4.K(-464411337);
                                }
                                aVar4.j();
                                aVar4.G();
                                if (!z3 || ((Boolean) snapshotStateList2.get(i6)).booleanValue()) {
                                    i7 = 1544030331;
                                    aVar4.K(1550277482);
                                    yqv0.c(jfzVar2.b, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 1, aVar2), wlb0.h(aVar4).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar4).Y, aVar4, 48, 0, 8184);
                                    aVar4 = aVar4;
                                } else {
                                    i7 = 1544030331;
                                    aVar4.K(1544030331);
                                }
                                aVar4.j();
                                if (z3) {
                                    aVar4.K(1550681784);
                                    jqu0.a(txj0.f(aVar2, 1.0f), wlb0.h(aVar4).p().a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar4, 6, 12);
                                } else {
                                    aVar4.K(i7);
                                }
                                aVar4.j();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar.h();
                            }
                            return s3q0.a;
                        }
                    }, true), 3);
                    r5 = i5;
                }
                return s3q0.a;
            case 16:
                qn60.c cVar = (qn60.c) obj;
                return new drq(cVar.a, cVar.b, (ArrayList) obj3, (String) obj2);
            case 17:
                evs evsVar = (evs) obj3;
                evsVar.getView().postDelayed(new df6(r5, evsVar, ((InteractiveData) obj2).a), 250L);
                return s3q0.a;
            case 18:
                DialogExt dialogExt = (DialogExt) obj3;
                DialogExt dialogExt2 = (DialogExt) obj;
                return (epx.f(dialogExt2, dialogExt) && (dialogExt2.d.d() || dialogExt2.b.Gb())) ? ((fhu) obj2).a(dialogExt.e, Source.NETWORK) : io.reactivex.rxjava3.core.q.T(dialogExt2);
            case 19:
                sqw sqwVar = (sqw) obj3;
                fcw.a aVar = (fcw.a) obj2;
                t6v.a aVar2 = (t6v.a) obj;
                List<Dialog> list = aVar2.a;
                ?? r3 = sqwVar.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list) {
                    if (((Boolean) r3.invoke(obj5)).booleanValue()) {
                        arrayList.add(obj5);
                    }
                }
                List<Dialog> list2 = aVar2.a;
                HashMap hashMap = new HashMap(list2.size());
                for (Dialog dialog : list2) {
                    Long Sb = dialog.Sb();
                    Boolean bool = (Boolean) sqwVar.d.invoke(dialog);
                    bool.getClass();
                    hashMap.put(Sb, bool);
                }
                return new gcw.e(arrayList, hashMap, aVar2.b.Ob(), new ImSearchLocalRequestLoggingInfo(aVar.a, aVar.c, aVar2.c, 0, aVar.d, null, 0, sqwVar.a != Source.CACHE, 104, null));
            case 20:
                gzs gzsVar = (gzs) obj2;
                if (!((fdj0) obj3).c()) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 21:
                ((mdu) obj3).f(((Number) ((if2) obj).d()).floatValue());
                ((wsy) obj2).c.invoke();
                return s3q0.a;
            case 22:
                AttachWithDownload attachWithDownload = (AttachWithDownload) ((Attach) obj).copy();
                attachWithDownload.A6(DownloadState.DOWNLOADING);
                attachWithDownload.a3(null);
                ((List) ((DefaultHashMap) obj3).get((MsgFromUser) obj2)).add(attachWithDownload);
                return attachWithDownload;
            case 23:
                ((hs50) obj3).d7((View) obj, (cjx) obj2, "DEFAULT", 0);
                return s3q0.a;
            case 24:
                ((tgp0) obj).c((bgk0) obj3, (Speed) obj2);
                return s3q0.a;
            case 25:
                ((wh50) obj3).setValue(Boolean.TRUE);
                ((wh50) obj2).setValue(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                return s3q0.a;
            case 26:
                ngb0 ngb0Var = (ngb0) obj2;
                ImageSize Cb = ((UIBlockLink) obj3).y.f.Cb(ngb0Var.m.getWidth(), true, false);
                ngb0Var.m.s0(Cb != null ? Cb.d.d : null);
                return s3q0.a;
            case 27:
                Throwable th = (Throwable) obj;
                ((SwitchCompat) obj3).setChecked(!r7.isChecked());
                View view3 = ((dyb0) obj2).g;
                if (view3 != null && (context = view3.getContext()) != null) {
                    ikv0.a aVar3 = new ikv0.a(context);
                    aVar3.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, (Integer) null, (Size) null, 14);
                    aVar3.u = new ikv0.d(context.getString(R.string.sticker_popup_animation_settings_error_messgae), (String) null, (ikv0.d.a) null, 6);
                    aVar3.b().c();
                }
                L.i(th);
                return s3q0.a;
            case 28:
                VideoFile videoFile2 = (VideoFile) obj3;
                Context context3 = (Context) obj2;
                String title = videoFile2.getTitle();
                if (title == null) {
                    title = "";
                }
                cvk.w(context3.getString(R.string.video_added, title), false);
                wjs0.a(new fyr0(videoFile2));
                wjs0.a(new cwr0(videoFile2, null, 30));
                return s3q0.a;
            default:
                ((v9f0) obj3).b.g((hyg0) obj, (ArrayList) obj2);
                return s3q0.a;
        }
    }

    public /* synthetic */ m9(kw70 kw70Var, bgk0 bgk0Var, Speed speed) {
        this.b = 24;
        this.c = bgk0Var;
        this.d = speed;
    }
}
