package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.location.Location;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Parcel;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.util.Size;
import android.view.ViewGroup;
import com.ironsource.O6;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.style.SearchSuggestionCatalogViewStyle;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.clips.viewer.impl.grid.repository.cache.GridHeaderMemCache;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.AttachmentsArrangementConfig;
import com.vk.dto.music.SearchSuggestion;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.components.viewcontrollers.dialog_header.redesign.popup.ReadReactionsChooser;
import com.vk.location.common.LocationCommon;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import com.vk.voip.miniapps.impl.picture_in_picture.overlay.MiniAppCallPiPOverlayService;
import com.vkontakte.android.R;
import java.io.File;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.aex;
import xsna.i5e0;
import xsna.ikv0;
import xsna.k840;
import xsna.sg60;
import xsna.tlo0;
import xsna.uze0;
import xsna.vm30;
import xsna.wfu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class rxz implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rxz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.util.Size, xsna.ikv0$d$a, xsna.ikv0$d$b] */
    /* JADX WARN: Type inference failed for: r4v26 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int baseStationId;
        Object obj2;
        StoryEntry storyEntry;
        int i = 9;
        switch (this.b) {
            case 0:
                Context context = (Context) this.c;
                Location location = (Location) obj;
                Random random = txz.c;
                LocationCommon.a.getClass();
                if (epx.f(location, LocationCommon.b)) {
                    return txz.c("2");
                }
                JSONObject jSONObject = new JSONObject();
                double latitude = location.getLatitude();
                double d = 5;
                double pow = Math.pow(10.0d, d);
                jSONObject.put(O6.s, String.valueOf(Math.rint(latitude * pow) / pow));
                double longitude = location.getLongitude();
                double pow2 = Math.pow(10.0d, d);
                jSONObject.put("lon", String.valueOf(Math.rint(longitude * pow2) / pow2));
                jSONObject.put("ts", String.valueOf(location.getTime() / 1000));
                jSONObject.put("accuracy", Float.valueOf(location.getAccuracy()));
                try {
                    CellLocation cellLocation = ((TelephonyManager) context.getSystemService("phone")).getCellLocation();
                    if (cellLocation instanceof GsmCellLocation) {
                        int cid = ((GsmCellLocation) cellLocation).getCid();
                        if (cid >= 0) {
                            jSONObject.put("cell_id", cid);
                            jSONObject.put("cell_type", "gsm");
                        }
                    } else if ((cellLocation instanceof CdmaCellLocation) && (baseStationId = ((CdmaCellLocation) cellLocation).getBaseStationId()) >= 0) {
                        jSONObject.put("cell_id", baseStationId);
                        jSONObject.put("cell_type", "cdma");
                    }
                } catch (Throwable unused) {
                }
                try {
                    WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
                    jSONObject.put("wifi_ssid", URLEncoder.encode(connectionInfo.getSSID(), C.UTF8_NAME));
                    jSONObject.put("wifi_bssid", URLEncoder.encode(connectionInfo.getBSSID(), C.UTF8_NAME));
                } catch (Throwable unused2) {
                }
                return jSONObject;
            case 1:
                ((u810) this.c).getClass();
                Iterator<T> it = ((y810) obj).f.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((glu) obj2).e) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                glu gluVar = (glu) obj2;
                r4 = gluVar != null ? gluVar.g : 0;
                return Boolean.valueOf((r4 != 0 ? r4.a : true) && (r4 != 0 ? r4.b : true));
            case 2:
                MiniAppCallPiPOverlayService miniAppCallPiPOverlayService = (MiniAppCallPiPOverlayService) this.c;
                int i2 = MiniAppCallPiPOverlayService.e;
                miniAppCallPiPOverlayService.stopSelf();
                return s3q0.a;
            case 3:
                Context context2 = ((com.vk.im.ui.components.msg_list.a) this.c).k;
                int i3 = 6;
                if (((Boolean) obj).booleanValue()) {
                    tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_msg_request_conversation_sent_success);
                    ikv0.a aVar = new ikv0.a(context2);
                    aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) r4, 12);
                    aVar.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h, context2).toString()), (ikv0.d.b) r4, (ikv0.d.a) r4, i3);
                    aVar.n();
                } else {
                    tlo0.f h2 = tq.h(tlo0.Companion, R.string.vkim_msg_request_conversation_failed);
                    ikv0.a aVar2 = new ikv0.a(context2);
                    float f = 28;
                    aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_triangle_outline_56, Integer.valueOf(R.attr.vk_ui_icon_negative), new Size(iah0.a(f), iah0.a(f)), 8);
                    aVar2.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h2, context2).toString()), (ikv0.d.b) r4, (ikv0.d.a) r4, i3);
                    aVar2.n();
                }
                return s3q0.a;
            case 4:
                ((com.vk.im.ui.components.msg_list.c) this.c).j = false;
                return s3q0.a;
            case 5:
                vm30 vm30Var = (vm30) this.c;
                if (vm30.l.a.$EnumSwitchMapping$0[((ReadReactionsChooser.Choice) obj).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                ym30 ym30Var = vm30Var.t0;
                if (ym30Var != null) {
                    ym30Var.l0();
                }
                return s3q0.a;
            case 6:
                rw30 rw30Var = (rw30) this.c;
                rw30Var.p.a(SearchMode.MESSAGES);
                edw edwVar = edw.a;
                edw.g(R.string.vkim_search_offline, rw30Var.k);
                return s3q0.a;
            case 7:
                qi40 qi40Var = (qi40) this.c;
                Map<String, CatalogLink> t = pn00.t(((hda) obj).b.q);
                qi40Var.c = t;
                return t;
            case 8:
                sg60.b bVar = (sg60.b) this.c;
                sg60.b.a(bVar, new w100(sg60.this, i));
                return s3q0.a;
            case 9:
                sr80 sr80Var = (sr80) this.c;
                if (sr80Var.d) {
                    sr80Var.b.dispose();
                    io.reactivex.rxjava3.internal.operators.single.x k = io.reactivex.rxjava3.core.x.k(s3q0.a);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    io.reactivex.rxjava3.core.w b = io.reactivex.rxjava3.schedulers.a.b();
                    Objects.requireNonNull(timeUnit, "unit is null");
                    Objects.requireNonNull(b, "scheduler is null");
                    sr80Var.b = new io.reactivex.rxjava3.internal.operators.single.d(k, 5L, timeUnit, b, false).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new fsq(new ba40(sr80Var, 7), 13), new lw30(new el30(sr80Var, i), 4));
                }
                return s3q0.a;
            case 10:
                y490 y490Var = (y490) this.c;
                nee neeVar = ((wfu.a.b) obj).a;
                y490Var.e.a(String.valueOf(y490Var.b.b), new GridHeaderMemCache.HeaderCache.OwnerCache(neeVar.l, neeVar.f));
                return s3q0.a;
            case 11:
                u2a0 u2a0Var = (u2a0) this.c;
                aex.a.C2538a c2538a = (aex.a.C2538a) u2a0Var.m;
                if (c2538a != null && (storyEntry = c2538a.d) != null) {
                    pdx pdxVar = u2a0Var.o;
                    Context context3 = u2a0Var.itemView.getContext();
                    Parcel obtain = Parcel.obtain();
                    try {
                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                        Serializer.g gVar = new Serializer.g(obtain);
                        gVar.i0(storyEntry);
                        obtain.setDataPosition(0);
                        Serializer.StreamParcelable G = gVar.G(StoryEntry.class.getClassLoader());
                        obtain.recycle();
                        pdxVar.b(context3, (StoryEntry) G);
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                }
                return s3q0.a;
            case 12:
                CharSequence charSequence = (CharSequence) obj;
                lma0 lma0Var = (lma0) ((mma0) this.c).h;
                if (lma0Var != null) {
                    lma0Var.g0(charSequence.toString());
                }
                return s3q0.a;
            case 13:
                Integer num = ((UIBlockList) this.c).O;
                if (((bnn0) obj) instanceof vyh0) {
                    return null;
                }
                if (BuildInfo.h()) {
                    fp01 fp01Var = k840.a.j;
                    if (fp01Var == null) {
                        fp01Var = null;
                    }
                    fp01Var.getClass();
                    o2l.a.getClass();
                    int i4 = Preference.j().getInt("__dbg_music_ad_banner_test_slot_id", 0);
                    Integer valueOf = i4 != 0 ? Integer.valueOf(i4) : null;
                    if (valueOf != null) {
                        return valueOf;
                    }
                }
                return num;
            case 14:
                j7b0 j7b0Var = (j7b0) this.c;
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(new z8b0(R.string.music_player_snack_bar_common_error, j7b0Var.c));
                return s3q0.a;
            case 15:
                Owner owner = (Owner) this.c;
                UserProfile userProfile = (UserProfile) obj;
                owner.c = userProfile != null ? userProfile.e : null;
                owner.e = userProfile != null ? userProfile.h : null;
                return owner;
            case 16:
                elc0 elc0Var = (elc0) this.c;
                AttachmentsArrangementConfig attachmentsArrangementConfig = (AttachmentsArrangementConfig) obj;
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
                com.vk.core.files.a.O((File) elc0Var.a.getValue(), Serializer.b.e(attachmentsArrangementConfig));
                return attachmentsArrangementConfig;
            case 17:
                e5d0 e5d0Var = (e5d0) this.c;
                qtd0 qtd0Var = (qtd0) obj;
                f5d0 f5d0Var = e5d0Var.o;
                e5d0Var.o = f5d0Var != null ? f5d0.a(f5d0Var, (User) qtd0Var, false, 14) : null;
                return s3q0.a;
            case 18:
                q5e0 q5e0Var = (q5e0) this.c;
                i5e0.a aVar3 = q5e0Var.m;
                if (aVar3 != null) {
                    q5e0Var.l.I(aVar3);
                }
                return Boolean.TRUE;
            case 19:
                ((rg50) this.c).C(((Integer) obj).intValue());
                return s3q0.a;
            case 20:
                ((tze0) this.c).b.onNext(uze0.a.a);
                return s3q0.a;
            case 21:
                e6f0 e6f0Var = (e6f0) this.c;
                rtt rttVar = (rtt) obj;
                e6f0Var.u = rttVar;
                e6f0Var.b.kl(rttVar, e6f0Var.i, e6f0Var.j, e6f0Var.e);
                return s3q0.a;
            case 22:
                Photo photo = (Photo) this.c;
                odg0.a.getClass();
                return Boolean.valueOf(epx.f(photo.e, ((Photo) obj).e));
            case 23:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, (String) ((zak0) ((pkg0) this.c).b).getValue());
                qgi0.r(tgi0Var, "AudioTrackDuration");
                return s3q0.a;
            case 24:
                bi20 bi20Var = (bi20) this.c;
                SearchSuggestion searchSuggestion = (SearchSuggestion) obj;
                return new UIBlockSearchSuggestion(bi20Var.a, bi20Var.d, bi20Var.c, new SearchSuggestionCatalogViewStyle(searchSuggestion.g), bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, searchSuggestion);
            case 25:
                w4k0 w4k0Var = (w4k0) this.c;
                SmartCropState smartCropState = (SmartCropState) w4k0Var.b.getCurrentState();
                rdi.y(w4k0Var, new ev60(10));
                g3q.a(w4k0Var, new s4k0(smartCropState, w4k0Var, null));
                return s3q0.a;
            case 26:
                hak0 hak0Var = (hak0) this.c;
                Canvas canvas = (Canvas) obj;
                Matrix matrix = hak0Var.f;
                int save = canvas.save();
                canvas.concat(matrix);
                try {
                    canvas.drawBitmap(hak0Var.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
                    canvas.restoreToCount(save);
                    return s3q0.a;
                } catch (Throwable th2) {
                    canvas.restoreToCount(save);
                    throw th2;
                }
            case 27:
                return ((s3l0) this.c).x();
            case 28:
                return new vfy((ViewGroup) obj, ((com.vk.stickers.keyboard.page.a) this.c).m);
            default:
                ((yvl0) this.c).b.a();
                return s3q0.a;
        }
    }
}
