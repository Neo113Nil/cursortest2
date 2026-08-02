package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentManager;
import com.my.tracker.MyTracker;
import com.vk.auth.api.models.AuthResult;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.clips.sdk.shared.item.common.restriction.RestrictionOverlayRenderDelegate;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.skeleton.VkTextSkeleton;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.log.L;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.photos.ui.attachmentspicker.PickVKPhotoFragmentNew;
import com.vk.profile.community.impl.ui.tag.CommunityActionTags;
import com.vk.profile.design.view.profileheader.UserProfileBaseInfoState;
import com.vk.profile.design.view.profileheader.a;
import com.vk.profile.design.view.profileheader.b;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.android.externcalls.analytics.internal.upload.MultiUploadHelper;
import xsna.awr0;
import xsna.dw20;
import xsna.hln0;
import xsna.srw0;
import xsna.y1h;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class t9b implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t9b(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x033b  */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        List list;
        MultiUploadHelper multiUploadHelper_delegate$lambda$0;
        Bundle bundle;
        int i = this.b;
        int i2 = 2;
        tp70 tp70Var = null;
        r4 = null;
        Parcelable parcelable = null;
        int i3 = 1;
        int i4 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((TextView) obj2).performHapticFeedback(0, 2);
                ((w9b) obj).s(zxd0.s.a.a);
                return s3q0.a;
            case 1:
                return ((wgb) obj2).s + ": loadInitial: finished, loaded=" + ((sfb) obj).a.size();
            case 2:
                return new RestrictionOverlayRenderDelegate(((w6d) ((b2d) obj2).a.getValue()).o, new g20((u6d) obj, 24));
            case 3:
                Object obj3 = ClipsOwnerSwipeFragment.k0;
                ((ClipsOwnerSwipeFragment) obj2).io(((poe) obj).a);
                return s3q0.a;
            case 4:
                y1h.a aVar = (y1h.a) obj2;
                y1h y1hVar = (y1h) obj;
                View view = aVar.itemView;
                z1h z1hVar = y1hVar.g;
                if (z1hVar.c == 1) {
                    y1hVar.i.invoke(view, CommunityActionTags.OPTIONS);
                } else {
                    int l = krv0.l(R.attr.vk_ui_icon_accent);
                    view.getContext();
                    e.b bVar = new e.b(view, null, null, l, 6);
                    bVar.w = R.layout.ds_internal_context_menu_item;
                    VkContextMenu.c.c(bVar, z1hVar.d ? R.string.show_community_news : R.string.hide_community_news, null, false, null, new m3g(y1hVar, i2), 30);
                    VkContextMenu.c.c(bVar, z1hVar.c == 2 ? R.string.profile_unsubscribe : R.string.leave_group, null, false, null, new sk(10, y1hVar, aVar), 30);
                    bVar.a().g();
                }
                return s3q0.a;
            case 5:
                cih cihVar = (cih) obj2;
                return new lhh(cihVar.a, cihVar.b, cihVar.c, cihVar.d, (po5) obj, false);
            case 6:
                androidx.compose.runtime.c cVar = ((gvi) obj2).b;
                v2k0 v2k0Var = cVar.c;
                r2k0 e0 = v2k0Var.e0();
                int i5 = 0;
                while (i5 < v2k0Var.c) {
                    try {
                        if (e0.l(i5)) {
                            Object n = e0.n(i5);
                            if (n != obj) {
                                iuf0 iuf0Var = n instanceof iuf0 ? (iuf0) n : null;
                                if ((iuf0Var != null ? iuf0Var.b() : null) == obj) {
                                }
                            }
                            tp70 tp70Var2 = new tp70(i5, null);
                            e0.c();
                            tp70Var = tp70Var2;
                            if (tp70Var != null) {
                                int i6 = tp70Var.a;
                                Integer num = tp70Var.b;
                                r2k0 e02 = v2k0Var.e0();
                                try {
                                    ArrayList c = tqi.c(e02, i6, num);
                                    e02.c();
                                    list = j5g.u0(cVar.u0(), c);
                                } finally {
                                }
                            } else {
                                list = EmptyList.b;
                            }
                            return new qqi(list, cVar.C);
                        }
                        int[] iArr = e0.b;
                        int i7 = i5 + 1;
                        int c2 = (i7 < e0.c ? iArr[(i7 * 5) + 4] : e0.e) - x2k0.c(i5, iArr);
                        for (int i8 = 0; i8 < c2; i8++) {
                            Object h = e0.h(i5, i8);
                            if (h != obj) {
                                iuf0 iuf0Var2 = h instanceof iuf0 ? (iuf0) h : null;
                                if ((iuf0Var2 != null ? iuf0Var2.b() : null) != obj) {
                                }
                            }
                            tp70Var = new tp70(i5, Integer.valueOf(i8));
                            if (tp70Var != null) {
                            }
                            return new qqi(list, cVar.C);
                        }
                        i5 = i7;
                    } finally {
                    }
                }
                s3q0 s3q0Var = s3q0.a;
                if (tp70Var != null) {
                }
                return new qqi(list, cVar.C);
            case 7:
                hgm hgmVar = (hgm) obj2;
                VkEnhancedImageView vkEnhancedImageView = new VkEnhancedImageView(hgmVar.d, null, 6, 0);
                vkEnhancedImageView.setId(R.id.dialog_item_status_icon);
                vkEnhancedImageView.setScaleType(ScaleType.CENTER_INSIDE);
                int i9 = hgmVar.r0;
                vkEnhancedImageView.setLayoutParams(egm.W(hgmVar, i9, i9, hgmVar.g0, 0, 0, hgmVar.v0, 24));
                ((ViewGroup) obj).addView(vkEnhancedImageView);
                return vkEnhancedImageView;
            case 8:
                MyTracker.trackEvent((String) obj2, (LinkedHashMap) obj);
                return s3q0.a;
            case 9:
                oo00 oo00Var = (oo00) obj2;
                oo00Var.m.a(new sq00((cle) obj, oo00Var.itemView));
                return s3q0.a;
            case 10:
                multiUploadHelper_delegate$lambda$0 = MultiFileUploader.multiUploadHelper_delegate$lambda$0((MultiFileUploader) obj2, (EventChannel) obj);
                return multiUploadHelper_delegate$lambda$0;
            case 11:
                ((e7a0) obj2).b.remove((String) obj);
                return s3q0.a;
            case 12:
                final PickVKPhotoFragmentNew pickVKPhotoFragmentNew = (PickVKPhotoFragmentNew) obj2;
                final lha0 lha0Var = (lha0) obj;
                return new io.reactivex.rxjava3.functions.f() { // from class: xsna.kha0
                    @Override // io.reactivex.rxjava3.functions.f
                    public final void accept(Object obj4) {
                        Throwable th = (Throwable) obj4;
                        L.i(th);
                        PickVKPhotoFragmentNew pickVKPhotoFragmentNew2 = PickVKPhotoFragmentNew.this;
                        pickVKPhotoFragmentNew2.jo();
                        if (lha0Var.m) {
                            cvk.u(R.string.default_network_error, false);
                        } else {
                            pickVKPhotoFragmentNew2.so(th);
                        }
                    }
                };
            case 13:
                PostingFragment postingFragment = (PostingFragment) obj2;
                AttachmentType attachmentType = (AttachmentType) obj;
                int i10 = PostingFragment.s0;
                cf00 cf00Var = new cf00(postingFragment, 18);
                b290 b290Var = new b290(postingFragment, 8);
                ikc0 ikc0Var = postingFragment.h0;
                wdc0 wdc0Var = new wdc0(cf00Var, b290Var, new rsx(ikc0Var != null ? ikc0Var.K0 : false, ikc0Var != null ? ikc0Var.I0 : false, ikc0Var != null ? ikc0Var.J0 : false), new n7b0(postingFragment, i3));
                ((zak0) wdc0Var.d).setValue(attachmentType);
                String simpleName = wdc0.class.getSimpleName();
                if (wdc0Var.c == null) {
                    dw20.b bVar2 = new dw20.b((Context) cf00Var.invoke(), null);
                    ComposeView composeView = wdc0Var.e;
                    wdc0Var.c = ((dw20.b) bVar2.D0(composeView, false).K()).x(0).F0(true).c(new jgj(composeView, 0, 0, 62)).a();
                }
                dw20 dw20Var = wdc0Var.c;
                if (dw20Var != null) {
                    dw20Var.Td((FragmentManager) b290Var.invoke(), simpleName);
                }
                return s3q0.a;
            case 14:
                oai0 oai0Var = (oai0) obj2;
                MusicTrack musicTrack = (MusicTrack) obj;
                oai0Var.o.J0(musicTrack);
                oai0Var.l6(musicTrack);
                return s3q0.a;
            case 15:
                uvm0 uvm0Var = (uvm0) obj2;
                ClipsAuthor clipsAuthor = (ClipsAuthor) obj;
                uvm0Var.e(clipsAuthor, false);
                int i11 = clipsAuthor.f;
                Long k = clipsAuthor.k();
                if (i11 == 1) {
                    i2 = 0;
                } else if (i11 != 3) {
                    i2 = i11;
                }
                clipsAuthor.f = i2;
                clipsAuthor.k3(true);
                if (ehd.a(clipsAuthor)) {
                    uvm0Var.d.a2();
                }
                uvm0Var.f(clipsAuthor);
                uvm0.a(clipsAuthor);
                uvm0Var.b(false);
                uvm0Var.e.b(hg1.m(o0r0.i(xwk.e(), clipsAuthor.b.b, true, null, false, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE).a0(io.reactivex.rxjava3.android.schedulers.a.b()), uvm0Var.a, 0L, false, 62).subscribe(new cl30(new arb0(uvm0Var, 23), 13), new nvm0(new mvm0(uvm0Var, clipsAuthor, i11, k), i4)));
                return s3q0.a;
            case 16:
                hln0 hln0Var = (hln0) obj;
                hln0.a aVar2 = hln0.g;
                int i12 = hln0Var.a;
                int i13 = hln0Var.b;
                aVar2.getClass();
                int[] a = hln0.a.a(i12, i13, (String) obj2);
                if (a == null) {
                    return null;
                }
                hln0Var.e(i12, i13, a);
                return s3q0.a;
            case 17:
                AuthResult authResult = (AuthResult) obj;
                m6r0 m6r0Var = (m6r0) ((Ref$ObjectRef) obj2).element;
                if (authResult != null && (bundle = authResult.r) != null) {
                    parcelable = sv1.m(bundle);
                }
                if (parcelable == null) {
                    parcelable = MultiAccountEntryPoint.Unknown.d;
                }
                if (parcelable instanceof MultiAccountEntryPoint.Sharing) {
                    c63 c63Var = c63.a;
                    c63.a(new cxp0(m6r0Var));
                } else {
                    bxp0.a(new dso0(m6r0Var, i2));
                }
                return s3q0.a;
            case 18:
                ((rlq0) obj2).g((ExtendedUserProfile) obj);
                return s3q0.a;
            case 19:
                izs izsVar = (izs) obj;
                UserProfileBaseInfoState.VerifyInfo.VerificationType verificationType = ((UserProfileBaseInfoState.VerifyInfo) obj2).d;
                int i14 = verificationType == null ? -1 : b.a.$EnumSwitchMapping$0[verificationType.ordinal()];
                if (i14 != -1) {
                    if (i14 == 1) {
                        izsVar.invoke(a.AbstractC1667a.d.a);
                    } else {
                        if (i14 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        izsVar.invoke(a.AbstractC1667a.b.a);
                    }
                }
                return s3q0.a;
            case 20:
                b9w b9wVar = (b9w) obj2;
                return b9wVar != null ? b9wVar.f(AttachDoc.class) : new p0x(((ViewGroup) obj).getContext());
            case 21:
                Object obj4 = VideoItemListSmallVh.c0;
                return ((s290) ((VideoItemListSmallVh) obj2).S.getValue()).a(((VideoFile) obj).w2());
            case 22:
                ((izs) obj2).invoke(new awr0.f(((dqt0) obj).b));
                return s3q0.a;
            case 23:
                com.vk.core.view.components.group.header.f fVar = (com.vk.core.view.components.group.header.f) obj;
                VkTextSkeleton vkTextSkeleton = new VkTextSkeleton((Context) obj2, null, 6, 0);
                vkTextSkeleton.setId(R.id.ds_internal_group_header_subtitle);
                vkTextSkeleton.setArea(fVar.getArea());
                vkTextSkeleton.setShimmer(fVar.b);
                vkTextSkeleton.setShimmerManagedExternally(true);
                vkTextSkeleton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                vkTextSkeleton.setIncludeFontPadding(false);
                return vkTextSkeleton;
            default:
                a3x0.p(((srw0) obj2).a, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.ASK_ALL_TO_UNMUTE, ((srw0.b.a) obj).a, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, com.vk.voip.ui.c.b.s0(), null, null, 1073741682);
                return s3q0.a;
        }
    }
}
