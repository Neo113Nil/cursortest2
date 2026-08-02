package xsna;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.core.preference.Preference;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stories.model.clickable.ClickablePoll;
import com.vk.im.ui.components.common.LinkAction;
import com.vk.im.ui.components.msg_search.analytics.ImSearchAnalytics;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.List;
import xsna.d3b;
import xsna.krl0;
import xsna.q22;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class hs1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hs1(Context context, ExtendedUserProfile.Contact contact, v1h v1hVar) {
        this.b = 4;
        this.e = context;
        this.c = contact;
        this.d = v1hVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                ms1 ms1Var = (ms1) this.c;
                MusicTrack musicTrack = (MusicTrack) this.d;
                Context context = (Context) this.e;
                qaj0.c(Preference.j(), "pref_track_to_mm", Boolean.TRUE);
                ms1Var.b.M(context, MusicTrack.zb(musicTrack, ((Integer) obj).intValue(), o25.a().c(), 0, 0, null, false, null, null, false, false, null, null, null, -1028, 1048575));
                return s3q0.a;
            case 1:
                com.vk.catalog2.common.ui.mvp.auto.a aVar = (com.vk.catalog2.common.ui.mvp.auto.a) this.c;
                MusicPlaybackLaunchContext musicPlaybackLaunchContext = (MusicPlaybackLaunchContext) this.d;
                q22.c cVar = (q22.c) this.e;
                List<MusicTrack> list = (List) obj;
                String str = cVar.c;
                boolean z2 = cVar.b;
                aVar.f(musicPlaybackLaunchContext, null, list, str, z2 ? PlayRequestTrigger.SHUFFLE_BUTTON : PlayRequestTrigger.FAST_PLAY_TRACK_LIST, z2 ? ShuffleMode.SHUFFLE_ON : ShuffleMode.SHUFFLE_AUTO);
                return s3q0.a;
            case 2:
                d3b d3bVar = (d3b) this.c;
                Context context2 = (Context) this.e;
                String str2 = (String) this.d;
                int i = d3b.a.$EnumSwitchMapping$0[((LinkAction) obj).ordinal()];
                if (i == 1) {
                    long j = d3bVar.i;
                    pf20 pf20Var = d3bVar.d;
                    if (j != 0) {
                        pf20Var.f(context2, j, str2);
                    } else {
                        pf20Var.d(context2, str2);
                    }
                } else if (i == 2) {
                    fvr.l(context2, str2);
                    edw.i(R.string.vkim_copy_to_clipboard_done, context2);
                }
                return s3q0.a;
            case 3:
                l0d l0dVar = (l0d) this.c;
                o1d o1dVar = (o1d) this.d;
                ClipVideoFile clipVideoFile = (ClipVideoFile) this.e;
                ClickablePoll clickablePoll = (ClickablePoll) obj;
                l0dVar.getClass();
                if (g2u0.c(o1dVar) != null) {
                    String str3 = clipVideoFile.W;
                    if (str3 == null) {
                        str3 = "";
                    }
                    z = sxc0.a().g(new krl0.b(o1dVar, str3, clickablePoll), new t9(l0dVar, 22), new t40(l0dVar, 16));
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                enj.o((Context) this.e, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, rf3.c(((ExtendedUserProfile.Contact) this.c).e, new StringBuilder("tel:"))), ((v1h) this.d).r);
                return s3q0.a;
            case 5:
                d.s sVar = (d.s) this.c;
                CommunityProfileState communityProfileState = (CommunityProfileState) this.d;
                return kn00.a((kn00) obj, sVar.b ? communityProfileState.l.a : null, (xrh) this.e, null, 0, null, null, communityProfileState.x, 1785);
            case 6:
                Integer num = (Integer) this.c;
                Integer num2 = (Integer) this.d;
                Integer num3 = (Integer) this.e;
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                vjm vjmVar = bVar.d;
                return com.vk.im.engine.models.dialogs.b.a(bVar, new vjm(num != null ? num.intValue() : vjmVar.b, num2 != null ? num2.intValue() : vjmVar.c), null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, num3.intValue(), -5, 1048575);
            default:
                ImSearchItemLoggingInfo imSearchItemLoggingInfo = (ImSearchItemLoggingInfo) this.c;
                mkr0 mkr0Var = ((krr0) this.d).l;
                qtd0 qtd0Var = (qtd0) this.e;
                if (imSearchItemLoggingInfo != null) {
                    mkr0Var.t0(ImSearchAnalytics.ClickAction.TAP, imSearchItemLoggingInfo);
                }
                mkr0Var.Q(qtd0Var, imSearchItemLoggingInfo);
                return s3q0.a;
        }
    }

    public /* synthetic */ hs1(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ hs1(d3b d3bVar, Context context, String str) {
        this.b = 2;
        this.c = d3bVar;
        this.e = context;
        this.d = str;
    }
}
