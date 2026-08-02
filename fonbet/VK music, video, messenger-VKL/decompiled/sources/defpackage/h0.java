package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.shortVideo.dto.ShortVideoSetCoOwnerStatusResponseDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.ui.holder.MusicHistoryRemoveAllVh;
import com.vk.clips.favorites.impl.ui.folders.content.a;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.snackbar.HideReason;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vk.debug.ui.dev.DebugDevImageFragment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Source;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.o;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vk.libvideo.design.view.endview.VideoEndView;
import com.vk.libvideo.design.view.overlay.LiveUpcomingView;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.photos.ui.editalbum.domain.c;
import com.vk.photos.ui.editalbum.domain.g;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeEndVideoClick;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.b;
import com.vk.superapp.browser.internal.ui.menu.action.m;
import com.vk.superapp.common.js.bridge.api.events.GetUserInfo$Parameters;
import com.vk.superapp.common.js.bridge.api.events.GetUserInfo$Response;
import com.vk.superapp.common.js.bridge.impl.GetUserSerializer;
import com.vk.superapp.common.js.bridge.impl.data.BDateVisibility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.arf;
import xsna.c3e;
import xsna.c5g;
import xsna.cbg;
import xsna.cjx;
import xsna.cl1;
import xsna.cqm0;
import xsna.drm0;
import xsna.ds5;
import xsna.dz00;
import xsna.egi;
import xsna.elb;
import xsna.epx;
import xsna.f0r;
import xsna.f370;
import xsna.f5z;
import xsna.fgg0;
import xsna.flb;
import xsna.fm3;
import xsna.frr0;
import xsna.fwx0;
import xsna.fz7;
import xsna.gm3;
import xsna.gwc;
import xsna.gzs;
import xsna.hs50;
import xsna.hy30;
import xsna.hyg0;
import xsna.iie;
import xsna.is5;
import xsna.iyr0;
import xsna.izs;
import xsna.j5g;
import xsna.jai;
import xsna.jas0;
import xsna.jgz;
import xsna.kn00;
import xsna.ktf0;
import xsna.l2k;
import xsna.l980;
import xsna.m520;
import xsna.mdm;
import xsna.mec;
import xsna.nfd0;
import xsna.nfg;
import xsna.nvy;
import xsna.nxt0;
import xsna.pcr;
import xsna.pz30;
import xsna.qkk0;
import xsna.quv;
import xsna.qyg0;
import xsna.rmg;
import xsna.rry;
import xsna.ruv;
import xsna.rw30;
import xsna.ry00;
import xsna.s3q0;
import xsna.t3h;
import xsna.tij;
import xsna.tny;
import xsna.ubm0;
import xsna.uh;
import xsna.vcr;
import xsna.vwg;
import xsna.w2w;
import xsna.wgg0;
import xsna.wjs0;
import xsna.wk50;
import xsna.wow;
import xsna.wwg;
import xsna.wzs;
import xsna.xa4;
import xsna.xbm0;
import xsna.xd3;
import xsna.xgv;
import xsna.yok;
import xsna.ysg0;
import xsna.yzs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class h0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:228:0x0664, code lost:
    
        if (r5 == null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0688, code lost:
    
        if (r5 == null) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x06ac, code lost:
    
        if (r4 == null) goto L252;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05f2  */
    /* JADX WARN: Type inference failed for: r0v63, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v23, types: [xsna.w2w] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.vk.superapp.common.js.bridge.api.events.GetUserInfo$Response$Data$UsersValue] */
    /* JADX WARN: Type inference failed for: r2v53, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Integer x;
        GetUserInfo$Response.User.Sex sex;
        GetUserInfo$Response.User.Sex sex2;
        String optString;
        String optString2;
        String optString3;
        String D;
        flb flbVar;
        DownloadingState downloadingState;
        int i = this.b;
        int i2 = 6;
        boolean z = false;
        z = false;
        int i3 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                GetUserInfo$Parameters getUserInfo$Parameters = (GetUserInfo$Parameters) obj3;
                l0 l0Var = (l0) obj2;
                JSONArray optJSONArray = ((JSONObject) obj).optJSONArray("response");
                if (optJSONArray == null) {
                    throw new IllegalStateException("Response is empty");
                }
                ArrayList arrayList = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                int i4 = 0;
                while (i4 < length) {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i4);
                    BDateVisibility.a aVar = BDateVisibility.Companion;
                    int optInt = jSONObject.optInt("bdate_visibility");
                    aVar.getClass();
                    BDateVisibility bDateVisibility = (optInt < 0 || optInt >= BDateVisibility.values().length) ? BDateVisibility.SHOW : BDateVisibility.values()[optInt];
                    if (jSONObject.has("bdate")) {
                        if (bDateVisibility == BDateVisibility.HIDE) {
                            jSONObject.remove("bdate");
                        }
                        if (bDateVisibility == BDateVisibility.HIDE_YEAR) {
                            List c0 = drm0.c0(jSONObject.getString("bdate"), new String[]{"."}, 0, i2);
                            if (c0.size() >= 3) {
                                jSONObject.put("bdate", j5g.g0(j5g.T(1, c0), ".", null, null, 0, null, 62));
                            }
                            JSONObject optJSONObject = jSONObject.optJSONObject("country");
                            GetUserInfo$Response.User.Country country = optJSONObject == null ? new GetUserInfo$Response.User.Country(f370.x(optJSONObject, "id"), f370.D(optJSONObject, "title")) : null;
                            JSONObject optJSONObject2 = jSONObject.optJSONObject("city");
                            GetUserInfo$Response.User.City city = optJSONObject2 == null ? new GetUserInfo$Response.User.City(f370.x(optJSONObject2, "id"), f370.D(optJSONObject2, "title")) : null;
                            x = f370.x(jSONObject, "sex");
                            if (x != null && x.intValue() == 1) {
                                sex2 = GetUserInfo$Response.User.Sex.MALE;
                            } else {
                                if (x != null && x.intValue() == 2) {
                                    sex = GetUserInfo$Response.User.Sex.FEMALE;
                                    sex2 = sex;
                                }
                                sex = GetUserInfo$Response.User.Sex.ANY;
                                sex2 = sex;
                            }
                            optString = jSONObject.optString("photo_base");
                            long j = jSONObject.getLong("id");
                            String string = jSONObject.getString("first_name");
                            String string2 = jSONObject.getString("last_name");
                            if (cqm0.a(optString) != null) {
                                WebImageSize.CREATOR.getClass();
                                optString2 = WebImageSize.a.a(100, optString).b;
                                break;
                            }
                            optString2 = jSONObject.optString("photo_100");
                            String str = optString2;
                            if (cqm0.a(optString) != null) {
                                WebImageSize.CREATOR.getClass();
                                optString3 = WebImageSize.a.a(200, optString).b;
                                break;
                            }
                            optString3 = jSONObject.optString("photo_200");
                            String str2 = optString3;
                            if (cqm0.a(optString) != null) {
                                WebImageSize.CREATOR.getClass();
                                D = WebImageSize.a.a(400, optString).b;
                                break;
                            }
                            D = f370.D(jSONObject, "photo_max_orig");
                            arrayList.add(new GetUserInfo$Response.User(j, string, string2, str2, sex2, f370.D(jSONObject, "bdate"), f370.x(jSONObject, "bdate_visibility"), city, country, str, D, f370.u(AnalyticsBaseParamsConstantsKt.TIMEZONE, jSONObject), f370.q(jSONObject, "can_access_closed"), f370.q(jSONObject, "is_closed")));
                            i4++;
                            i2 = 6;
                        }
                    }
                    JSONObject optJSONObject3 = jSONObject.optJSONObject("country");
                    if (optJSONObject3 == null) {
                    }
                    JSONObject optJSONObject22 = jSONObject.optJSONObject("city");
                    if (optJSONObject22 == null) {
                    }
                    x = f370.x(jSONObject, "sex");
                    if (x != null) {
                        sex2 = GetUserInfo$Response.User.Sex.MALE;
                        optString = jSONObject.optString("photo_base");
                        long j2 = jSONObject.getLong("id");
                        String string3 = jSONObject.getString("first_name");
                        String string22 = jSONObject.getString("last_name");
                        if (cqm0.a(optString) != null) {
                        }
                        optString2 = jSONObject.optString("photo_100");
                        String str3 = optString2;
                        if (cqm0.a(optString) != null) {
                        }
                        optString3 = jSONObject.optString("photo_200");
                        String str22 = optString3;
                        if (cqm0.a(optString) != null) {
                        }
                        D = f370.D(jSONObject, "photo_max_orig");
                        arrayList.add(new GetUserInfo$Response.User(j2, string3, string22, str22, sex2, f370.D(jSONObject, "bdate"), f370.x(jSONObject, "bdate_visibility"), city, country, str3, D, f370.u(AnalyticsBaseParamsConstantsKt.TIMEZONE, jSONObject), f370.q(jSONObject, "can_access_closed"), f370.q(jSONObject, "is_closed")));
                        i4++;
                        i2 = 6;
                    }
                    if (x != null) {
                        sex = GetUserInfo$Response.User.Sex.FEMALE;
                        sex2 = sex;
                        optString = jSONObject.optString("photo_base");
                        long j22 = jSONObject.getLong("id");
                        String string32 = jSONObject.getString("first_name");
                        String string222 = jSONObject.getString("last_name");
                        if (cqm0.a(optString) != null) {
                        }
                        optString2 = jSONObject.optString("photo_100");
                        String str32 = optString2;
                        if (cqm0.a(optString) != null) {
                        }
                        optString3 = jSONObject.optString("photo_200");
                        String str222 = optString3;
                        if (cqm0.a(optString) != null) {
                        }
                        D = f370.D(jSONObject, "photo_max_orig");
                        arrayList.add(new GetUserInfo$Response.User(j22, string32, string222, str222, sex2, f370.D(jSONObject, "bdate"), f370.x(jSONObject, "bdate_visibility"), city, country, str32, D, f370.u(AnalyticsBaseParamsConstantsKt.TIMEZONE, jSONObject), f370.q(jSONObject, "can_access_closed"), f370.q(jSONObject, "is_closed")));
                        i4++;
                        i2 = 6;
                    }
                    sex = GetUserInfo$Response.User.Sex.ANY;
                    sex2 = sex;
                    optString = jSONObject.optString("photo_base");
                    long j222 = jSONObject.getLong("id");
                    String string322 = jSONObject.getString("first_name");
                    String string2222 = jSONObject.getString("last_name");
                    if (cqm0.a(optString) != null) {
                    }
                    optString2 = jSONObject.optString("photo_100");
                    String str322 = optString2;
                    if (cqm0.a(optString) != null) {
                    }
                    optString3 = jSONObject.optString("photo_200");
                    String str2222 = optString3;
                    if (cqm0.a(optString) != null) {
                    }
                    D = f370.D(jSONObject, "photo_max_orig");
                    arrayList.add(new GetUserInfo$Response.User(j222, string322, string2222, str2222, sex2, f370.D(jSONObject, "bdate"), f370.x(jSONObject, "bdate_visibility"), city, country, str322, D, f370.u(AnalyticsBaseParamsConstantsKt.TIMEZONE, jSONObject), f370.q(jSONObject, "can_access_closed"), f370.q(jSONObject, "is_closed")));
                    i4++;
                    i2 = 6;
                }
                GetUserInfo$Response.Data.UserValue usersValue = arrayList.size() > 1 ? new GetUserInfo$Response.Data.UsersValue(new GetUserInfo$Response.Users(arrayList)) : new GetUserInfo$Response.Data.UserValue((GetUserInfo$Response.User) j5g.Y(arrayList));
                usersValue.a(getUserInfo$Parameters.d());
                b.p(l0Var.L0().a, new JsMethod("VKWebAppGetUserInfo"), new GetUserInfo$Response(null, usersValue, getUserInfo$Parameters.d(), 1, null), new yok(GetUserInfo$Response.Data.class, GetUserSerializer.a), null, false, null, 56);
                return s3q0.a;
            case 1:
                xd3 xd3Var = (xd3) obj2;
                SimpleAttachListItem simpleAttachListItem = ((xd3.a) obj3).s;
                if (simpleAttachListItem != null) {
                    xd3Var.a.invoke(simpleAttachListItem);
                }
                return s3q0.a;
            case 2:
                is5 is5Var = (is5) obj3;
                fgg0 fgg0Var = is5Var.b;
                wow wowVar = new wow(fgg0Var);
                int i5 = 1;
                ((rry) obj).a(fgg0Var.size(), null, new fm3(wowVar, i5), new jai(-1117249557, new gm3(wowVar, is5Var, (ds5) obj2, i5), true));
                return s3q0.a;
            case 3:
                final o.a aVar2 = (o.a) obj3;
                final izs izsVar = (izs) obj2;
                nvy nvyVar = (nvy) obj;
                nvy.g(nvyVar, null, null, new jai(1841017423, new fz7(false ? 1 : 0, aVar2, izsVar), true), 3);
                if (aVar2.g != null) {
                    nvy.g(nvyVar, null, null, new jai(-1761583724, new yzs() { // from class: xsna.gz7
                        @Override // xsna.yzs
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj5;
                            int intValue = ((Integer) obj6).intValue();
                            if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1761583724, intValue, -1, "com.vk.ecomm.onlinebooking.impl.main.presentation.BookingMenuContent.<anonymous>.<anonymous>.<anonymous> (BookingStartScreen.kt:251)");
                                }
                                o.a aVar4 = o.a.this;
                                vz7.d(aVar4.g, aVar4.h, aVar4.i, izsVar, aVar3, 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar3.h();
                            }
                            return s3q0.a;
                        }
                    }, true), 3);
                }
                return s3q0.a;
            case 4:
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                qyg0 V0 = ((hyg0) obj).V0("SELECT * FROM audio_book_chapter WHERE uid = ? AND chapter_id = ?");
                try {
                    V0.D3(1, str4);
                    V0.D3(2, str5);
                    int k = egi.k(V0, "id");
                    int k2 = egi.k(V0, "uid");
                    int k3 = egi.k(V0, "chapter_id");
                    int k4 = egi.k(V0, "title");
                    int k5 = egi.k(V0, "url");
                    int k6 = egi.k(V0, "duration");
                    int k7 = egi.k(V0, "progress_time");
                    int k8 = egi.k(V0, "progress_status");
                    int k9 = egi.k(V0, "track_code");
                    int k10 = egi.k(V0, "special_project_id");
                    int k11 = egi.k(V0, "context_flags_mask");
                    int k12 = egi.k(V0, "manifest_url");
                    int k13 = egi.k(V0, "downloading_state");
                    int k14 = egi.k(V0, X3.a.k);
                    int k15 = egi.k(V0, "json_raw");
                    if (V0.step()) {
                        int i6 = (int) V0.getLong(k);
                        UserId b = fwx0.b(V0.l2(k2));
                        String l2 = V0.l2(k3);
                        String l22 = V0.l2(k4);
                        String l23 = V0.isNull(k5) ? null : V0.l2(k5);
                        Integer valueOf = V0.isNull(k6) ? null : Integer.valueOf((int) V0.getLong(k6));
                        int i7 = (int) V0.getLong(k7);
                        String l24 = V0.l2(k8);
                        String l25 = V0.isNull(k9) ? null : V0.l2(k9);
                        Integer valueOf2 = V0.isNull(k10) ? null : Integer.valueOf((int) V0.getLong(k10));
                        Integer valueOf3 = V0.isNull(k11) ? null : Integer.valueOf((int) V0.getLong(k11));
                        String l26 = V0.isNull(k12) ? null : V0.l2(k12);
                        int i8 = (int) V0.getLong(k13);
                        if (i8 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i8 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i8 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i8 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i8 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        flbVar = new flb(i6, b, l2, l22, l23, valueOf, i7, l24, l25, valueOf2, valueOf3, l26, downloadingState, uh.a(V0.isNull(k14) ? null : V0.l2(k14)), V0.l2(k15));
                    } else {
                        flbVar = null;
                    }
                    return flbVar;
                } finally {
                    V0.close();
                }
            case 5:
                gwc gwcVar = (gwc) obj3;
                SdkVideoFile sdkVideoFile = (SdkVideoFile) obj2;
                gwcVar.i = null;
                int i9 = gwc.a.$EnumSwitchMapping$0[((HideReason) obj).ordinal()];
                if (i9 == 1 || i9 == 2 || i9 == 3 || i9 == 4) {
                    gwcVar.b(sdkVideoFile);
                } else if (i9 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 6:
                ClipVideoFile clipVideoFile = (ClipVideoFile) obj3;
                UserId userId = (UserId) obj2;
                if (!((ShortVideoSetCoOwnerStatusResponseDto) j5g.Y((List) obj)).d()) {
                    throw new IllegalStateException("Something went wrong");
                }
                List<CoOwnerItem> list = clipVideoFile.N1;
                ArrayList arrayList2 = new ArrayList();
                for (CoOwnerItem coOwnerItem : list) {
                    if (epx.f(coOwnerItem.b, userId)) {
                        coOwnerItem = null;
                    }
                    if (coOwnerItem != null) {
                        arrayList2.add(coOwnerItem);
                    }
                }
                return ClipVideoFile.Kb(clipVideoFile, false, null, null, arrayList2, null, null, null, 8355839);
            case 7:
                ((com.vk.clips.favorites.impl.ui.folders.content.recycler.b) obj3).l.invoke(new a.d.C0588a(((c3e) obj2).c));
                return s3q0.a;
            case 8:
                NewsComment newsComment = (NewsComment) obj2;
                cbg cbgVar = (cbg) obj;
                int i10 = cbgVar.c;
                ((nfg) obj3).getClass();
                if ((i10 == 443 || i10 == 444) && epx.f(cbgVar.a, newsComment)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                izs izsVar2 = (izs) obj2;
                vwg vwgVar = ((wwg) obj3).m;
                if (vwgVar != null) {
                    izsVar2.invoke(vwgVar);
                }
                return s3q0.a;
            case 10:
                return kn00.a((kn00) obj, null, null, null, ((d.w) obj3).c, null, null, ((CommunityProfileState) obj2).x, 1775);
            case 11:
                ((tij) obj3).h1((nfd0.b) obj2);
                return s3q0.a;
            case 12:
                ?? r0 = (List) obj;
                int i11 = DebugDevImageFragment.U;
                ((Ref$ObjectRef) obj3).element = r0;
                ((EditText) obj2).setHint("Max: " + r0.size());
                return s3q0.a;
            case 13:
                c cVar = (c) obj3;
                PhotoAlbum photoAlbum = (PhotoAlbum) obj;
                ysg0.b.a(new cl1(photoAlbum));
                cVar.g.b(new g.c(photoAlbum));
                cVar.f.i.a.b(((PhotoAlbum) obj2).b);
                return s3q0.a;
            case 14:
                ((f0r.a) obj3).h((wk50.a) obj2, (Throwable) obj);
                return s3q0.a;
            case 15:
                quv quvVar = (quv) obj3;
                f5z f5zVar = (f5z) obj2;
                ruv.a aVar3 = (ruv.a) obj;
                quvVar.t = aVar3;
                aVar3.b.b(new arf(quvVar, 21), f5zVar);
                int i12 = 18;
                aVar3.c.b(new iie(quvVar, i12), f5zVar);
                aVar3.a.b(new l2k(quvVar, i12), f5zVar);
                aVar3.f.b(new rmg(quvVar, 15), f5zVar);
                aVar3.g.b(new xgv(quvVar, i3), f5zVar);
                aVar3.h.b(new t3h(quvVar, 26), f5zVar);
                return s3q0.a;
            case 16:
                ((izs) obj3).invoke(((LiveUpcomingView) obj2).d);
                return s3q0.a;
            case 17:
                ry00 ry00Var = (ry00) obj2;
                ((mec) ((vcr) obj3)).l = (dz00) obj;
                pcr pcrVar = ry00Var.b;
                if (pcrVar.a(ry00Var.f)) {
                    ListBuilder fields = pcrVar.getFields();
                    ry00Var.f = fields;
                    ry00Var.c.invoke(fields);
                }
                return s3q0.a;
            case 18:
                rw30 rw30Var = (rw30) obj3;
                gzs gzsVar = (gzs) obj2;
                hy30 hy30Var = (hy30) obj;
                rw30Var.getClass();
                boolean isEmpty = hy30Var.j.a.isEmpty();
                if (hy30Var.d.length() > 0 && hy30Var.h == SearchMode.PEERS && hy30Var.i == Source.CACHE && isEmpty) {
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                    return s3q0.a;
                }
                if (hy30Var.h == SearchMode.MESSAGES) {
                    hy30Var.j = rw30Var.p.j;
                }
                rw30Var.e1(hy30Var);
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 19:
                ?? r12 = (w2w) obj3;
                pz30 pz30Var = (pz30) obj2;
                List<? extends Msg> list2 = (List) obj;
                r12.K().t().u().b(list2);
                long j3 = pz30Var.b.b;
                List<? extends Msg> list3 = list2;
                ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((Msg) it.next()).zb());
                }
                r12.e1(pz30Var, new l980("xsna.pz30", j3, arrayList3));
                return s3q0.a;
            case 20:
                ((MusicHistoryRemoveAllVh) obj3).b.b(new ktf0(((UIBlock) obj2).b), false);
                return s3q0.a;
            case 21:
                ((hs50) obj3).d7((View) obj, (cjx) obj2, NativeAdContent.ViewTag.CTA, 6);
                return s3q0.a;
            case 22:
                Integer num = (Integer) obj;
                num.intValue();
                ((wzs) obj3).invoke(Long.valueOf(((wgg0) obj2).a), num);
                return s3q0.a;
            case 23:
                VkSpinnerContent.SpinnerState spinnerState = (VkSpinnerContent.SpinnerState) obj2;
                Context context = (Context) obj;
                VkScreenSpinner m = qkk0.m((qkk0) obj3, context, spinnerState, VkScreenSpinner.SpinnerMode.Shadow, spinnerState.name(), 40);
                m.setColor(context.getColor(R.color.holo_purple));
                return m;
            case 24:
                final nxt0 nxt0Var = (nxt0) obj2;
                mdm mdmVar = new mdm((xbm0) obj3, nxt0Var, ((Integer) obj).intValue());
                nxt0Var.setAlpha(1.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(100L);
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.sbm0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        nxt0 nxt0Var2 = nxt0.this;
                        nxt0Var2.setScaleX(floatValue);
                        nxt0Var2.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        nxt0Var2.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
                duration.addListener(new ubm0(nxt0Var, mdmVar));
                duration.start();
                return s3q0.a;
            case 25:
                ((LinkedHashMap) obj3).put((String) obj2, xa4.K(jgz.j((tny) obj, true)));
                return s3q0.a;
            case 26:
                m520 m520Var = (m520) obj2;
                if (((m) obj3).l) {
                    m520Var.l();
                }
                return s3q0.a;
            case 27:
                ((frr0) obj3).l.m0((String) obj2);
                return s3q0.a;
            case 28:
                jas0 jas0Var = (jas0) obj3;
                String str6 = (String) obj2;
                List list4 = (List) obj;
                Object obj4 = (List) jas0Var.e.get(str6);
                if (obj4 == null) {
                    obj4 = EmptyList.b;
                }
                if (!epx.f(obj4, list4)) {
                    wjs0.a(new iyr0(list4, str6));
                    jas0Var.e.put(str6, list4);
                }
                return s3q0.a;
            default:
                int i13 = VideoEndView.z;
                ((VideoEndView) obj3).b(MobileOfficialAppsVideoStat$TypeEndVideoClick.EventType.PREVIOUS);
                ((View.OnClickListener) obj2).onClick((View) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ h0(String str, String str2, elb elbVar) {
        this.b = 4;
        this.c = str;
        this.d = str2;
    }
}
