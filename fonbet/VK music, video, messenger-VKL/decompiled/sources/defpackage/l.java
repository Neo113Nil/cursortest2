package defpackage;

import android.app.Activity;
import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import com.vk.clips.playlists.model.PlaylistRawId;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.api.LoadContext;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUserDenied;
import com.vk.superapp.base.js.bridge.b;
import com.vk.superapp.common.js.bridge.api.events.OpenReportForm$Parameters;
import com.vk.superapp.common.js.bridge.api.events.OpenReportForm$Response;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.a7f0;
import xsna.aue;
import xsna.c1h;
import xsna.ccj;
import xsna.drx;
import xsna.erx;
import xsna.fb50;
import xsna.fmc0;
import xsna.fwx0;
import xsna.ggj;
import xsna.h1e0;
import xsna.hc50;
import xsna.hyg0;
import xsna.i1r0;
import xsna.ikv0;
import xsna.izs;
import xsna.jte;
import xsna.kqu;
import xsna.mcp;
import xsna.mtk0;
import xsna.oio;
import xsna.orx;
import xsna.p2y;
import xsna.qyg0;
import xsna.rbe0;
import xsna.rop;
import xsna.s3q0;
import xsna.s6s0;
import xsna.ste;
import xsna.tol;
import xsna.vte;
import xsna.w2w;
import xsna.x1n0;
import xsna.y6s0;
import xsna.yk8;
import xsna.zq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class l implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, xsna.kte$b] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Set<PlaylistRawId> set;
        DownloadingState downloadingState;
        switch (this.b) {
            case 0:
                l0 l0Var = (l0) this.c;
                p2y p2yVar = (p2y) this.d;
                OpenReportForm$Parameters openReportForm$Parameters = (OpenReportForm$Parameters) this.e;
                if (((String) obj) == null) {
                    l0Var.w0().m(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), p2yVar.b(), 1, null));
                } else {
                    x1n0 L0 = l0Var.L0();
                    String h = openReportForm$Parameters.h();
                    b.p(L0.a, new JsMethod("VKWebAppOpenReportForm"), new OpenReportForm$Response(null, new OpenReportForm$Response.Data(true, h), h, 1, null), null, null, false, null, 60);
                }
                return s3q0.a;
            case 1:
                ste steVar = (ste) this.c;
                aue aueVar = (aue) this.d;
                jte.j jVar = (jte.j) this.e;
                ShortVideoGetPlaylistsResponseDto shortVideoGetPlaylistsResponseDto = (ShortVideoGetPlaylistsResponseDto) obj;
                aue.b bVar = (aue.b) aueVar;
                ClipsPlaylistsFolderLaunchParams.FoldersLaunchType foldersLaunchType = bVar.b;
                Set set2 = null;
                ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.SinglePick singlePick = foldersLaunchType instanceof ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.SinglePick ? (ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.SinglePick) foldersLaunchType : null;
                if (singlePick != null && (set = singlePick.c) != null) {
                    set2 = ste.U(jVar.b, set);
                }
                if (set2 == null) {
                    set2 = EmptySet.b;
                }
                steVar.T(new vte.h(shortVideoGetPlaylistsResponseDto, set2, bVar.e.a, jVar.b));
                return s3q0.a;
            case 2:
                drx drxVar = (drx) this.c;
                String str = (String) this.d;
                erx erxVar = (erx) this.e;
                drxVar.T(new orx.d.e(true));
                a7f0.a.e(drxVar, drxVar.h.d(str, null), null, new zq0(new tol(drxVar, str, erxVar, 3), 4), new rop(drxVar, 10), null, 9);
                return s3q0.a;
            case 3:
                String str2 = (String) this.c;
                String str3 = (String) this.d;
                List list = (List) this.e;
                qyg0 V0 = ((hyg0) obj).V0(str2);
                try {
                    V0.D3(1, str3);
                    Iterator it = list.iterator();
                    int i = 2;
                    while (it.hasNext()) {
                        V0.D3(i, (String) it.next());
                        i++;
                    }
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        int i2 = (int) V0.getLong(0);
                        UserId b = fwx0.b(V0.l2(1));
                        String l2 = V0.l2(2);
                        int i3 = (int) V0.getLong(3);
                        if (i3 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i3 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i3 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i3 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i3 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        arrayList.add(new hc50(i2, downloadingState, b, l2, V0.l2(4)));
                    }
                    V0.close();
                    return arrayList;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 4:
                ProfilesSimpleInfo profilesSimpleInfo = (ProfilesSimpleInfo) this.c;
                h1e0 h1e0Var = (h1e0) this.d;
                w2w w2wVar = (w2w) this.e;
                ProfilesSimpleInfo profilesSimpleInfo2 = h1e0Var.c;
                LinkedHashMap linkedHashMap = profilesSimpleInfo2.c;
                long j = h1e0Var.d;
                profilesSimpleInfo.c.putAll((Map) new ccj(h1e0Var.e, j, linkedHashMap).o(w2wVar));
                profilesSimpleInfo.b.putAll((Map) new i1r0(profilesSimpleInfo2.b, j).o(w2wVar));
                profilesSimpleInfo.d.putAll((Map) new mcp(profilesSimpleInfo2.d).o(w2wVar));
                profilesSimpleInfo.e.putAll((Map) new kqu(profilesSimpleInfo2.e, j).o(w2wVar));
                return s3q0.a;
            case 5:
                StoryViewerRouter.d(((rbe0) this.c).f, (Context) this.e, null, ((fmc0.m.f) this.d).a, MobileOfficialAppsConStoriesStat$ViewEntryPoint.REPOST_AUTO_TO_STORY_ACTIVITY, LoadContext.Owner.b, "story_view", null, null, null, 3906);
                ((ikv0) obj).a();
                return s3q0.a;
            case 6:
                yk8 yk8Var = (yk8) this.c;
                c1h c1hVar = (c1h) this.d;
                mtk0 mtk0Var = (mtk0) this.e;
                ggj ggjVar = (ggj) obj;
                ggjVar.s1();
                if (((Number) mtk0Var.getValue()).floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float intBitsToFloat = (Float.intBitsToFloat((int) (ggjVar.d() & 4294967295L)) - Float.intBitsToFloat((int) (yk8Var.b() & 4294967295L))) - ((Number) c1hVar.o.getValue()).floatValue();
                    ggjVar.a0().a.l(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat);
                    try {
                        oio.x1(ggjVar, yk8Var, 0L, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ggjVar.d() >> 32))) << 32) | (Float.floatToRawIntBits(r5) & 4294967295L), ((Number) mtk0Var.getValue()).floatValue(), null, null, 0, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
                    } finally {
                        ggjVar.a0().a.l(-0.0f, -intBitsToFloat);
                    }
                }
                return s3q0.a;
            default:
                Activity activity = (Activity) this.c;
                y6s0 y6s0Var = (y6s0) this.d;
                s6s0 s6s0Var = (s6s0) this.e;
                String string = activity.getString(R.string.video_is_not_unpinned);
                ikv0.a aVar = new ikv0.a(activity);
                aVar.u = new ikv0.d(string, (String) null, (ikv0.d.a) null, 6);
                aVar.n();
                if (y6s0Var == null) {
                    return null;
                }
                y6s0Var.a(VideoBottomSheetSideEffectOptions.UNPIN, s6s0Var.a);
                return s3q0.a;
        }
    }

    public /* synthetic */ l(String str, String str2, List list, fb50 fb50Var) {
        this.b = 3;
        this.c = str;
        this.d = str2;
        this.e = list;
    }
}
