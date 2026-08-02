package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.auth.dto.AuthExternalFlowOutResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.bridges.ImageViewer;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.preference.Preference;
import com.vk.core.utils.newtork.d;
import com.vk.core.view.components.card.VkCard;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.Playlist;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vk.photos.root.selectalbum.domain.a;
import com.vk.posting.presentation.video.search.SearchVideoPickerFragment;
import com.vk.posting.presentation.video.search.e;
import com.vk.reefton.ReefEvent;
import com.vk.reefton.dto.ReefRequestReason;
import com.vk.reefton.trackers.ReefContentStateTracker;
import com.vk.reefton.trackers.ReefContentStateTracker$Companion$sharedPauseTimestamps$1;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vk.voip.ui.ns.NoiseSuppressorFeature$State;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.eeu0;
import xsna.fn20;
import xsna.fs70;
import xsna.gm50;
import xsna.i8a0;
import xsna.ikv0;
import xsna.oem0;
import xsna.p8c0;
import xsna.qn60;
import xsna.tj50;
import xsna.usf0;
import xsna.wr20;
import xsna.wy30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class dn20 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dn20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bf, code lost:
    
        if (r6 == null) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Dialog dialog;
        String str;
        ww50<?> Y;
        ww50<?> Y2;
        int i = this.b;
        int i2 = 2;
        r6 = null;
        FragmentImpl fragmentImpl = null;
        r6 = null;
        FragmentImpl fragmentImpl2 = null;
        String string = null;
        int i3 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                fn20.a aVar = (fn20.a) obj2;
                Context context = (Context) obj;
                FrameLayout frameLayout = new FrameLayout(context);
                VkCard vkCard = new VkCard(context, null, 6);
                fn20 fn20Var = fn20.a;
                vkCard.setBackgroundColorAttr(fn20.e((String) ((zak0) aVar.c).getValue()));
                vkCard.setElevation(iah0.b(aVar.b() ? 4.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                vkCard.setDrawBorder(aVar.a());
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                VkText vkText = new VkText(context, null, 6, 0);
                vkText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                float f = 4;
                float f2 = 2;
                vkText.setPadding(iah0.a(f), iah0.a(f2), iah0.a(f), iah0.a(f2));
                vkText.setTextAppearance(context, R.style.VkUiTypography_Text);
                vkText.setText("Sample text");
                vkText.setTextColor(dhr0.Y(R.attr.vk_ui_text_primary, context));
                linearLayout.addView(vkText);
                VKImageView vKImageView = new VKImageView(context, null, 6, 0);
                vKImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, iah0.a(128)));
                vKImageView.setAdjustViewBounds(false);
                vKImageView.o0("https://pp.userapi.com/c639222/v639222699/5e1d8/2wtUaVn4Pho.jpg", null);
                linearLayout.addView(vKImageView);
                vkCard.addView(linearLayout);
                frameLayout.addView(vkCard);
                return frameLayout;
            case 1:
                pr20 pr20Var = (pr20) obj2;
                gm50.a.a(pr20Var, ((wr20.a) obj).a, new bbw(pr20Var, 10));
                return s3q0.a;
            case 2:
                ((y030) obj2).f.invoke();
                return s3q0.a;
            case 3:
                xy30 xy30Var = (xy30) obj2;
                wy30.a aVar2 = (wy30.a) obj;
                aVar2.g = xy30Var.f;
                aVar2.i = xy30Var.b;
                aVar2.o = xy30Var.c;
                wy30 wy30Var = wy30.a;
                List<Attach> list = xy30Var.d;
                aVar2.n = wy30.n(list);
                aVar2.p = list.size();
                aVar2.q = xy30Var.e;
                return s3q0.a;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((io.reactivex.rxjava3.core.r) obj2).onNext(bool);
                return s3q0.a;
            case 5:
                return Boolean.valueOf(((Playlist) obj).b == ((Playlist) obj2).b);
            case 6:
                MusicOfflineCatalogRootVh musicOfflineCatalogRootVh = (MusicOfflineCatalogRootVh) obj2;
                musicOfflineCatalogRootVh.m.b.e.b(new t8f0(new f6w(11), false), false);
                if (((com.vk.core.utils.newtork.d) obj) instanceof d.a) {
                    Activity activity = musicOfflineCatalogRootVh.b;
                    ikv0.e.a aVar3 = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, activity.getString(R.string.catalog_offline_reload_page), new w110(musicOfflineCatalogRootVh, 9));
                    ikv0.a aVar4 = new ikv0.a(activity);
                    aVar4.u = new ikv0.d(activity.getString(R.string.catalog_offline_open_online), (String) null, (ikv0.d.a) null, 6);
                    aVar4.s = aVar3;
                    musicOfflineCatalogRootVh.s = aVar4.n();
                }
                return s3q0.a;
            case 7:
                b950 b950Var = (b950) obj2;
                Throwable th = (Throwable) obj;
                L.e("MusicSubscriptionControlContract", th);
                mzp0 mzp0Var = b950Var.d;
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                b950Var.e = null;
                b950Var.b.jo(null, th instanceof VKApiExecutionException ? (VKApiExecutionException) th : null, false);
                return s3q0.a;
            case 8:
                e860 e860Var = (e860) obj2;
                int i4 = e860.z1;
                e860Var.y1 = VkBridgeAnalytics.PersonalDiscountExitReason.CLOSE_ICON;
                if (e860Var.isAdded() && (dialog = e860Var.s) != null && dialog.isShowing()) {
                    e860Var.hide();
                }
                return s3q0.a;
            case 9:
                k570 k570Var = (k570) obj2;
                NoiseSuppressorFeature$State noiseSuppressorFeature$State = k570Var.b().get(((brj0) obj).a);
                dw20 dw20Var = k570Var.f;
                if (dw20Var != null) {
                    dw20Var.tn();
                }
                k570Var.f = null;
                k570Var.c.getClass();
                qaj0.c(Preference.f("voip_prefs_shared"), "noise-suppressor-state", Integer.valueOf(noiseSuppressorFeature$State.ordinal()));
                k570Var.e(noiseSuppressorFeature$State);
                k570Var.a(noiseSuppressorFeature$State);
                return s3q0.a;
            case 10:
                tj50.a aVar5 = (tj50.a) obj;
                t810 t810Var = new t810(8);
                ao8 ao8Var = ao8.d;
                return new fs70.b(aVar5.a(t810Var, ao8Var), aVar5.a(new xpt(13), ao8Var), aVar5.a(new oqu((es70) obj2), ao8Var));
            case 11:
                ImageViewer.c<AttachmentWithMedia> cVar = ((m680) obj2).g;
                if (cVar != null) {
                    cVar.a(true);
                }
                return s3q0.a;
            case 12:
                wl90 wl90Var = (wl90) obj2;
                AuthExternalFlowOutResponseDto authExternalFlowOutResponseDto = (AuthExternalFlowOutResponseDto) obj;
                SignUpDataHolder signUpDataHolder = wl90Var.p;
                Bundle bundle = (signUpDataHolder != null ? signUpDataHolder : null).K;
                if (bundle != null) {
                    m63.m(bundle, authExternalFlowOutResponseDto.d());
                }
                ul90 ul90Var = (ul90) wl90Var.a;
                if (ul90Var != null) {
                    ul90Var.e();
                }
                return s3q0.a;
            case 13:
                ((z8a0) obj2).e.invoke(i8a0.e.b);
                return s3q0.a;
            case 14:
                ((k2b0) obj).q((com.vk.movika.sdk.player.base.model.a) obj2);
                return s3q0.a;
            case 15:
                Throwable th2 = (Throwable) obj;
                yp80 yp80Var = ((e4b0) obj2).e;
                if (yp80Var != null) {
                    yp80Var.onError(th2);
                }
                return s3q0.a;
            case 16:
                View inflate = ((LayoutInflater) obj2).inflate(R.layout.appkit_empty, (ViewGroup) obj, false);
                ((TextView) inflate.findViewById(R.id.empty_text)).setText(R.string.music_playlists_empty_text);
                return inflate;
            case 17:
                p7c0 p7c0Var = (p7c0) obj2;
                p8c0.a aVar6 = (p8c0.a) obj;
                Bitmap bitmap = aVar6.a;
                Bitmap bitmap2 = aVar6.b;
                p7c0Var.setContentImageBitmap(bitmap);
                Bitmap createBitmap = Bitmap.createBitmap(1080, 1920, Bitmap.Config.ARGB_8888);
                Paint paint = new Paint(2);
                Canvas canvas = new Canvas(createBitmap);
                p8c0.b bVar = new p8c0.b(p7c0Var, aVar6, createBitmap, paint, canvas);
                if (p7c0Var instanceof z7c0) {
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    VKImageView vKImageView2 = (VKImageView) ((z7c0) p7c0Var).findViewById(R.id.image);
                    if (vKImageView2 != null) {
                        vKImageView2.setAspectRatio(width);
                    }
                }
                canvas.drawBitmap(bitmap2, new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), new Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight()), paint);
                canvas.drawColor(l8g.g(-16777216, 16));
                return bVar;
            case 18:
                WallWithCounters wallWithCounters = (WallWithCounters) obj2;
                qn60.c cVar2 = (qn60.c) obj;
                return new gtc0(cVar2.a, cVar2.b, wallWithCounters, wallWithCounters.i());
            case 19:
                return new com.vk.profile.questions.impl.j((ViewGroup) obj, ((com.vk.profile.questions.impl.f) obj2).i);
            case 20:
                j4f0 j4f0Var = (j4f0) obj2;
                VKList vKList = (VKList) obj;
                h5f0 h5f0Var = j4f0Var.f;
                return odq.c(h5f0Var.a, new xc3(vKList, null, h5f0Var.b, j4f0Var.g, null, false, null)).l(new i4f0(new k170(vKList, 18), i3));
            case 21:
                ReefContentStateTracker reefContentStateTracker = (ReefContentStateTracker) obj2;
                com.vk.reefton.d dVar = reefContentStateTracker.a;
                ReefEvent reefEvent = (ReefEvent) obj;
                ReefContentStateTracker$Companion$sharedPauseTimestamps$1 reefContentStateTracker$Companion$sharedPauseTimestamps$1 = ReefContentStateTracker.e;
                if (reefEvent instanceof ReefEvent.x) {
                    ReefEvent.x xVar = (ReefEvent.x) reefEvent;
                    reefContentStateTracker.c = ykj.a(reefContentStateTracker.c, xVar.b, xVar.c, xVar.d.getHost(), null, null, null, (Long) reefContentStateTracker$Companion$sharedPauseTimestamps$1.get(xVar.c), 56);
                } else if (reefEvent instanceof ReefEvent.PlayerQualityChange) {
                    ReefEvent.PlayerQualityChange playerQualityChange = (ReefEvent.PlayerQualityChange) reefEvent;
                    ReefEvent.PlayerQualityChange.Reason reason = playerQualityChange.c;
                    ReefEvent.PlayerQualityChange.Reason reason2 = ReefEvent.PlayerQualityChange.Reason.AUTO;
                    if (reason == reason2 || reason == ReefEvent.PlayerQualityChange.Reason.MANUAL) {
                        reefContentStateTracker.c = ykj.a(reefContentStateTracker.c, null, null, null, null, null, playerQualityChange.b, null, 95);
                        if (reason == reason2) {
                            dVar.a(reefContentStateTracker, ReefRequestReason.BITRATE_CHANGED_AUTOMATICALLY, System.currentTimeMillis());
                        } else if (reason == ReefEvent.PlayerQualityChange.Reason.MANUAL) {
                            dVar.a(reefContentStateTracker, ReefRequestReason.BITRATE_CHANGED_MANUALLY, System.currentTimeMillis());
                        }
                    }
                } else if (reefEvent instanceof ReefEvent.z) {
                    ReefEvent.z zVar = (ReefEvent.z) reefEvent;
                    reefContentStateTracker.c = ykj.a(reefContentStateTracker.c, null, null, null, Long.valueOf(zVar.d), Integer.valueOf(zVar.c), null, null, 103);
                } else if (reefEvent instanceof ReefEvent.o) {
                    reefContentStateTracker.c = ykj.a(reefContentStateTracker.c, null, null, ((ReefEvent.o) reefEvent).b.getHost(), null, null, null, null, 123);
                } else if ((reefEvent instanceof ReefEvent.p) && (str = reefContentStateTracker.c.b) != null) {
                    reefContentStateTracker$Companion$sharedPauseTimestamps$1.put(str, Long.valueOf(System.currentTimeMillis()));
                }
                return s3q0.a;
            case 22:
                rsf0 rsf0Var = (rsf0) obj2;
                usf0.a.InterfaceC3823a interfaceC3823a = (usf0.a.InterfaceC3823a) obj;
                boolean z = !(interfaceC3823a instanceof usf0.a.InterfaceC3823a.c);
                rsf0Var.a().setIsEnabled(z);
                ((Button) rsf0Var.g.getValue()).setEnabled(z);
                osf0 osf0Var = rsf0Var.b;
                osf0Var.An(z);
                Dialog dialog2 = osf0Var.s;
                if (dialog2 != null) {
                    dialog2.setCanceledOnTouchOutside(z);
                }
                if (interfaceC3823a instanceof usf0.a.InterfaceC3823a.b.C3825a) {
                    rsf0Var.a().h(osf0Var.getString(R.string.vk_auth_related_user_pin_error));
                } else if (interfaceC3823a instanceof usf0.a.InterfaceC3823a.b.C3826b) {
                    String str2 = ((usf0.a.InterfaceC3823a.b.C3826b) interfaceC3823a).a;
                    if (str2 != null) {
                        if (!drm0.N(str2)) {
                            string = str2;
                            break;
                        }
                    }
                    string = osf0Var.getString(R.string.vk_common_network_error);
                    eeu0.a aVar7 = new eeu0.a(osf0Var.requireContext());
                    aVar7.a.f = string;
                    aVar7.setNegativeButton(R.string.vk_auth_related_user_pin_close_talkback, new o1c());
                    aVar7.m();
                } else if (interfaceC3823a instanceof usf0.a.InterfaceC3823a.b.c) {
                    eeu0.a aVar8 = new eeu0.a(osf0Var.requireContext());
                    aVar8.B(R.string.vk_auth_related_pin_code_too_many_tries_error);
                    aVar8.q(R.string.vk_auth_related_pin_code_try_later_or_reset_pin);
                    aVar8.setNegativeButton(R.string.vk_auth_related_pin_code_reset, new ka60(rsf0Var, i2));
                    aVar8.v(R.string.vk_auth_related_pin_code_cancel, new w4p(rsf0Var, i2));
                    aVar8.i = new b3a0(rsf0Var, i2);
                    aVar8.m();
                }
                return s3q0.a;
            case 23:
                SearchVideoPickerFragment searchVideoPickerFragment = (SearchVideoPickerFragment) obj2;
                com.vk.posting.presentation.video.search.e eVar = (com.vk.posting.presentation.video.search.e) obj;
                int i5 = SearchVideoPickerFragment.U;
                FragmentActivity activity2 = searchVideoPickerFragment.getActivity();
                if (activity2 == null) {
                    return s3q0.a;
                }
                if (eVar instanceof e.a) {
                    e.a aVar9 = (e.a) eVar;
                    searchVideoPickerFragment.R.getClass();
                    if (aVar9 instanceof e.a.b) {
                        e.a.b bVar2 = (e.a.b) aVar9;
                        VideoFile videoFile = bVar2.a;
                        am50 am50Var = bVar2.b;
                        Intent intent = new Intent();
                        intent.putExtra("video_vk_attach", videoFile);
                        am50Var.a(intent);
                        ey50 ey50Var = activity2 instanceof ey50 ? (ey50) activity2 : null;
                        if (ey50Var != null && (Y2 = ey50Var.Y()) != null) {
                            fragmentImpl = Y2.u();
                        }
                        if (fragmentImpl != null) {
                            fragmentImpl.Mf(-1, intent);
                        }
                    } else {
                        if (!aVar9.equals(e.a.C1549a.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ey50 ey50Var2 = activity2 instanceof ey50 ? (ey50) activity2 : null;
                        if (ey50Var2 != null && (Y = ey50Var2.Y()) != null) {
                            fragmentImpl2 = Y.u();
                        }
                        if (fragmentImpl2 != null) {
                            h3p0.b(fragmentImpl2);
                        }
                    }
                } else {
                    if (!(eVar instanceof e.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.vk.posting.presentation.video.search.g gVar = searchVideoPickerFragment.Q;
                    com.vk.posting.presentation.video.search.g gVar2 = gVar != null ? gVar : null;
                    ((e.b.a) eVar).a.a(gVar2.h, new ff90(gVar2.b.getString(R.string.video_list_empty), 30, 50));
                }
                return s3q0.a;
            case 24:
                ((xd40) obj2).invoke(new a.h((PhotoAlbumWrapper) obj));
                return s3q0.a;
            case 25:
                return ifi0.b((ifi0) obj2, (List) obj);
            case 26:
                h7k0 h7k0Var = (h7k0) obj2;
                ikv0.d.a aVar10 = (ikv0.d.a) obj;
                f4m.E(h7k0Var.y, aVar10 != null);
                if (aVar10 != null) {
                    h7k0Var.P4(h7k0Var.y, aVar10);
                }
                return s3q0.a;
            case 27:
                ny3 ny3Var = new ny3(((ViewGroup) obj).getContext(), -1, cn70.b(48), R.layout.sticker_settings_vmoji_create_item);
                ny3Var.a(new qm0(i2));
                s6l0 s6l0Var = new s6l0(ny3Var);
                jjc.g(s6l0Var.itemView, new i750((com.vk.stickers.settings.g) obj2, 28));
                return s6l0Var;
            case 28:
                xcm0 xcm0Var = ((tcm0) obj2).k;
                if (xcm0Var != null) {
                    xgy g = xcm0Var.g();
                    if (g.e()) {
                        int i6 = ify.a;
                        if (ify.e(ify.c)) {
                            g.d();
                        }
                    } else {
                        g.h(null);
                    }
                }
                return s3q0.a;
            default:
                LinkedHashSet linkedHashSet = ((ghm0) obj2).e;
                oem0 oem0Var = (oem0) obj;
                if (oem0Var instanceof oem0.a.b) {
                    linkedHashSet.add(Integer.valueOf(((oem0.a.b) oem0Var).a));
                } else if (oem0Var instanceof oem0.c.a) {
                    linkedHashSet.remove(Integer.valueOf(((oem0.c.a) oem0Var).a));
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ dn20(p7c0 p7c0Var, p8c0 p8c0Var) {
        this.b = 17;
        this.c = p7c0Var;
    }
}
