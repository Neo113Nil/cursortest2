package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.vk.api.generated.friends.dto.FriendsDeleteResponseDto;
import com.vk.catalog.mvi.section.ui.entity.CatalogBlockData;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemSearchListVh;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.clips.sdk.shared.api.domain.HashtagParseMode;
import com.vk.clips.sdk.shared.api.domain.MentionsParseMode;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoOwner;
import com.vk.log.L;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.qrcode.d;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.voip.ui.share.link.pager.view.c;
import com.vk.voip.ui.share.link.pager_new.model.VoipShareLinkSheetButton;
import com.vk.voip.ui.share.link.pager_new.view.VoipShareLinkPagerViewNew;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.text.Regex;
import xsna.dug0;
import xsna.e3m;
import xsna.ems;
import xsna.l1x0;
import xsna.w1x0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class go6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ go6(Activity activity, com.vk.qrcode.c cVar, d.b bVar, cme0 cme0Var) {
        this.b = 7;
        this.c = activity;
        this.d = cVar;
        this.e = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e5  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        String str;
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                lo6 lo6Var = (lo6) obj4;
                View view = (View) obj3;
                View view2 = (View) obj2;
                if (!lo6Var.e) {
                    lo6Var.removeView(view);
                    lo6Var.addView(view2);
                }
                return s3q0.a;
            case 1:
                UserProfile userProfile = (UserProfile) obj4;
                FriendsItemSearchListVh friendsItemSearchListVh = (FriendsItemSearchListVh) obj3;
                UIBlockProfile uIBlockProfile = (UIBlockProfile) obj2;
                boolean z2 = ((FriendsDeleteResponseDto) obj).d() == FriendsDeleteResponseDto.FriendDeletedDto.OK;
                userProfile.v = z2 ? 2 : 0;
                friendsItemSearchListVh.getClass();
                boolean a = FriendsItemSearchListVh.a(uIBlockProfile);
                UserProfile userProfile2 = uIBlockProfile.A;
                if (a) {
                    boolean z3 = userProfile2.v == 2;
                    if (userProfile2.e0 != SocialButtonType.FOLLOW || z3) {
                        z = true;
                        m3a m3aVar = friendsItemSearchListVh.b;
                        if (!z) {
                            friendsItemSearchListVh.d(uIBlockProfile);
                        } else if (FriendsItemSearchListVh.a(uIBlockProfile)) {
                            boolean z4 = userProfile2.v == 2;
                            if (userProfile2.e0 == SocialButtonType.FOLLOW && !z4) {
                                friendsItemSearchListVh.c(uIBlockProfile);
                            }
                        }
                        if (z2) {
                            m3aVar.j(new ems.b(uIBlockProfile));
                        } else {
                            m3aVar.j(new ems.d(uIBlockProfile));
                        }
                        return s3q0.a;
                    }
                }
                z = false;
                m3a m3aVar2 = friendsItemSearchListVh.b;
                if (!z) {
                }
                if (z2) {
                }
                return s3q0.a;
            case 2:
                dwj dwjVar = (dwj) obj;
                return dwjVar.m(myc0.h(dwjVar.getScope(), null, null, new woz((eea) obj4, (String) obj3, (CatalogBlockData) obj2, null), 3));
            case 3:
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj4;
                h420 h420Var = (h420) obj3;
                String str2 = (String) obj2;
                Pair pair = (Pair) obj;
                if (cVar != null) {
                    cVar.dispose();
                }
                h420Var.l = false;
                h420Var.l(str2, (List) pair.i(), (List) pair.j());
                return s3q0.a;
            case 4:
                tny tnyVar = (tny) obj;
                ((wh50) obj2).setValue(jgz.i(tnyVar));
                ((vg7) obj4).a.getValue().add(new lg7(jgz.i(tnyVar), (mdu) obj3));
                return s3q0.a;
            case 5:
                UIBlockLink uIBlockLink = (UIBlockLink) obj4;
                de40 de40Var = (de40) obj2;
                View view3 = (View) obj3;
                CatalogLink catalogLink = uIBlockLink.y;
                b5a b5aVar = de40Var.e;
                Meta meta = catalogLink.g;
                b5aVar.a(new cfp0(uIBlockLink, meta != null ? meta.c : null));
                if (catalogLink.e.length() == 0) {
                    SearchStatInfoProvider searchStatInfoProvider = de40Var.f;
                    de40Var.g.invoke(catalogLink.b, catalogLink.c, searchStatInfoProvider != null ? searchStatInfoProvider.b(SchemeStat$EventItem.Type.CATALOG_ITEM, "", true) : null, view3.getContext());
                } else {
                    de40Var.h.invoke(view3, uIBlockLink);
                }
                return s3q0.a;
            case 6:
                Set<String> set = MusicTrackCellVh.A;
                return ((MusicTrackCellVh) obj4).e().e1((MusicTrack) obj3, (MusicPlaybackLaunchContext) obj2, true);
            case 7:
                Activity activity = (Activity) obj4;
                com.vk.qrcode.c cVar2 = (com.vk.qrcode.c) obj3;
                d.b bVar = (d.b) obj2;
                VideoOwner videoOwner = (VideoOwner) obj;
                com.vk.qrcode.d dVar = com.vk.qrcode.d.b;
                if (videoOwner != null && (videoOwner.h != null || videoOwner.g != null)) {
                    com.vk.qrcode.i iVar = new com.vk.qrcode.i();
                    Pair pair2 = videoOwner.f != null ? new Pair(activity.getString(R.string.clip_open), new ss3(20, activity, cVar2)) : null;
                    Group group = videoOwner.h;
                    if (group != null) {
                        str = group.e;
                    } else {
                        UserProfile userProfile3 = videoOwner.g;
                        str = userProfile3 != null ? userProfile3.h : null;
                    }
                    if (group != null) {
                        r5 = group.d;
                    } else {
                        UserProfile userProfile4 = videoOwner.g;
                        if (userProfile4 != null) {
                            r5 = userProfile4.e;
                        }
                    }
                    String str3 = r5;
                    ibr0 pe = ((ClipsViewerComponent) ((k7m) m7m.f(iVar)).a(fpf0.a(ClipsViewerComponent.class))).pe();
                    VideoFile videoFile = videoOwner.f;
                    CharSequence string = videoFile == null ? activity.getString(R.string.clip_unavailable) : pe.a(videoFile.j1(), HashtagParseMode.DEFAULT, MentionsParseMode.DEFAULT, false);
                    e3m.a aVar = e3m.a;
                    com.vk.qrcode.d.k(dVar, activity, bVar, null, str, null, null, m33.a(R.drawable.vk_icon_clip_circle_fill_violet_28, activity), com.vk.qrcode.d.h(activity, cVar2), str3, string, 2, null, pair2, null, null, null, null, null, 2048744);
                }
                return s3q0.a;
            case 8:
                return qkk0.m((qkk0) obj4, (Context) obj, (VkSpinnerContent.SpinnerState) obj3, (VkScreenSpinner.SpinnerMode) obj2, null, 56);
            case 9:
                UserId userId = (UserId) obj3;
                String str4 = (String) obj2;
                dug0.c cVar3 = (dug0.c) obj;
                s8w0 s8w0Var = ((n8w0) obj4).a;
                List<mbw0> c = s8w0Var.b().c();
                if (c.size() > 50) {
                    int size = c.size() - 50;
                    lbw0 b = s8w0Var.b();
                    List<mbw0> H0 = j5g.H0(c, size);
                    ArrayList arrayList = new ArrayList(c5g.u(H0, 10));
                    for (mbw0 mbw0Var : H0) {
                        File file = new File(s8w0Var.a(), mbw0Var.getFileName());
                        Regex regex = com.vk.core.files.a.a;
                        vhk0.b(file);
                        arrayList.add(mbw0Var.getUserId());
                    }
                    b.e(arrayList);
                    L.e(size + " files were removed");
                }
                s8w0Var.b().b(System.currentTimeMillis(), userId, str4);
                L.e("New file " + str4 + " registered for user " + userId);
                return cVar3.c;
            default:
                l1x0 l1x0Var = (l1x0) obj3;
                VoipShareLinkPagerViewNew voipShareLinkPagerViewNew = ((l1x0.b) obj2).b;
                int i2 = l1x0.k1;
                int i3 = l1x0.c.$EnumSwitchMapping$0[((VoipShareLinkSheetButton) obj4).b.ordinal()];
                if (i3 == 1) {
                    w1x0.a aVar2 = w1x0.a.b;
                    l1x0Var.getClass();
                    xn50.a.c(l1x0Var, aVar2);
                } else if (i3 == 2) {
                    boolean z5 = voipShareLinkPagerViewNew.getCurrentLinkType() instanceof c.a;
                    String currentLinkText = voipShareLinkPagerViewNew.getCurrentLinkText();
                    w1x0.c cVar4 = new w1x0.c(true, z5, currentLinkText != null ? currentLinkText : "");
                    l1x0Var.getClass();
                    xn50.a.c(l1x0Var, cVar4);
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean z6 = voipShareLinkPagerViewNew.getCurrentLinkType() instanceof c.a;
                    String currentLinkText2 = voipShareLinkPagerViewNew.getCurrentLinkText();
                    w1x0.c cVar5 = new w1x0.c(false, z6, currentLinkText2 != null ? currentLinkText2 : "");
                    l1x0Var.getClass();
                    xn50.a.c(l1x0Var, cVar5);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ go6(UIBlockLink uIBlockLink, de40 de40Var, View view) {
        this.b = 5;
        this.c = uIBlockLink;
        this.e = de40Var;
        this.d = view;
    }

    public /* synthetic */ go6(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
