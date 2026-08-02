package xsna;

import android.graphics.Bitmap;
import com.ironsource.X3;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.dto.common.account.AudioAdConfig;
import com.vk.dto.common.data.VKList;
import com.vk.dto.narratives.HighlightCover;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.reactions.BadgeMeta;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.ml.b;
import com.vk.profile.core.scheduled_clips.bottom_sheet.options.CommunityScheduledClipsBottomSheetSideEffectOptions;
import com.vk.story.viewer.impl.presentation.stories.view.storyview.a;
import com.vk.superapp.api.dto.account.ProfileNavigationInfo;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.Result;
import org.json.JSONObject;
import xsna.dz40;
import xsna.go20;
import xsna.goh0;
import xsna.it80;
import xsna.k840;
import xsna.mmh0;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fo20 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ fo20(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        ProfileNavigationInfo.SecurityRecommendationIndicator securityRecommendationIndicator;
        switch (this.b) {
            case 0:
                ((zak0) go20.s).setValue((go20.j) obj);
                return s3q0.a;
            case 1:
                return ((b.a) obj).a.g();
            case 2:
                return Boolean.valueOf(!drm0.N((String) obj));
            case 3:
                ah90 ah90Var = (ah90) obj;
                StringBuilder sb = new StringBuilder(X3.j.d);
                sb.append(ah90Var.b);
                sb.append(", ");
                return vu5.b(sb, ah90Var.c, ')');
            case 4:
                glk glkVar = (glk) obj;
                g950 g950Var = k840.a.i;
                bn40.f("my hs state = ", Boolean.valueOf(g950Var.b()), ", new hs state = ", Boolean.valueOf(glkVar.a));
                Long valueOf = Long.valueOf(o25.a().i().G);
                long j = glkVar.b;
                bn40.f("my hs expires = ", valueOf, ", new hs expires = ", Long.valueOf(j));
                boolean z = glkVar.a;
                if (g950Var.b() != z || o25.a().i().G != j) {
                    o25.a().H(AudioAdConfig.zb(o25.a().V(), !z));
                    o25.a().k(j, z);
                    g950Var.k(j, z);
                    bn40.f("updated ad state = ", Boolean.valueOf(o25.a().V().f), " hs state = ", Boolean.valueOf(g950Var.b()));
                    r5v0 r5v0Var = k840.a.h;
                    (r5v0Var != null ? r5v0Var : null).b(new oe50(z, j));
                }
                return s3q0.a;
            case 5:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 6:
                return s3q0.a;
            case 7:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 8:
                nov novVar = (nov) obj;
                if (novVar instanceof ad7) {
                    return ((ad7) novVar).m;
                }
                return null;
            case 9:
                return air.b('\"', "\"", (String) obj);
            case 10:
                return equ.a((GroupsGroupFullDto) obj);
            case 11:
                return p8c0.c((Bitmap) obj);
            case 12:
                it80.b.getClass();
                return it80.a.a();
            case 13:
                return new dz40.h.a(R.string.music_player_header_radio, null, false);
            case 14:
                return Boolean.valueOf(((ReactionMeta) obj) instanceof BadgeMeta);
            case 15:
                CommunityScheduledClipsBottomSheetSideEffectOptions communityScheduledClipsBottomSheetSideEffectOptions = CommunityScheduledClipsBottomSheetSideEffectOptions.REMOVE_FROM_OWNER;
                return s3q0.a;
            case 16:
                return new mmh0.d(((tj50.a) obj).a(new pyz(25), ao8.d));
            case 17:
                return ((goh0.a) obj).b.a.h;
            case 18:
                return ((JSONObject) obj).getJSONObject("response");
            case 19:
                return s3q0.a;
            case 20:
                int i = dbi0.r1;
                return s3q0.a;
            case 21:
                ((ikv0) obj).a();
                return s3q0.a;
            case 22:
                VKList<Narrative> vKList = (VKList) obj;
                ArrayList arrayList = new ArrayList(c5g.u(vKList, 10));
                for (Narrative narrative : vKList) {
                    String str2 = narrative.d;
                    HighlightCover highlightCover = narrative.e;
                    if (highlightCover == null || (str = highlightCover.f()) == null) {
                        str = "";
                    }
                    arrayList.add(new a.b.C1842b(str2, str, narrative));
                }
                return arrayList;
            case 23:
                qgi0.r((tgi0) obj, "narrative_bottom_sheet_title");
                return s3q0.a;
            case 24:
                return ((uem0) obj).b;
            case 25:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 26:
                id3 id3Var = (id3) obj;
                hd3.a(id3Var, btm0.b);
                hd3.b(id3Var, "✅");
                return s3q0.a;
            case 27:
                return PlaylistScreenState.a((PlaylistScreenState) obj, null, null, false, false, null, null, null, 1983);
            case 28:
                return drm0.p0((String) obj).toString();
            default:
                Object d = ((Result) obj).d();
                ProfileNavigationInfo profileNavigationInfo = (ProfileNavigationInfo) (d instanceof Result.Failure ? null : d);
                return (profileNavigationInfo == null || (securityRecommendationIndicator = profileNavigationInfo.e) == null) ? ProfileNavigationInfo.SecurityRecommendationIndicator.NO_WARNING : securityRecommendationIndicator;
        }
    }
}
