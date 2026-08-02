package xsna;

import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.auth.dto.AuthOnSuccessValidationResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateExtendedResponseDto;
import com.vk.clips.editor.templates.impl.domain.ClipsVideoTemplateEditorInputModel;
import com.vk.clips.editor.templates.impl.views.main.ClipsTemplateEditorFragment;
import com.vk.community.design.compose.donut.DonutUserStackClipPosition;
import com.vk.community.design.compose.donut.DonutUserStackSize;
import com.vk.core.view.components.subnavigation.VkSubnavigationBar;
import com.vk.dto.messages.MsgSyncState;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistLink;
import com.vk.dto.music.PlaylistPermissions;
import com.vk.dto.stickers.VmojiConstructorOpenParamsModel;
import com.vk.libvideo.api.ad.AdBannerData;
import com.vk.libvideo.api.ad.a;
import com.vk.odnoklassniki.registration.data.CreatePasswordFragmentData;
import com.vk.odnoklassniki.registration.data.OkExistingProfileFragmentData;
import com.vk.odnoklassniki.registration.data.OkItsMeFragmentData;
import com.vk.odnoklassniki.registration.data.VKIDItsMeFragmentData;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vk.voip.ui.permissions.ScreencastPermissionFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import one.video.ad.ux.controls.OneVideoAdBaseControls;
import xsna.gv30;
import xsna.p66;
import xsna.q5b0;
import xsna.sum0;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class q66 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q66(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015d  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        rh0 rh0Var;
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                AuthOnSuccessValidationResponseDto authOnSuccessValidationResponseDto = (AuthOnSuccessValidationResponseDto) obj;
                int i2 = p66.c.a.$EnumSwitchMapping$0[authOnSuccessValidationResponseDto.d().ordinal()];
                if (i2 == 1) {
                    q55 q55Var = q55.a;
                    q55.c().b.q(new CreatePasswordFragmentData(str, authOnSuccessValidationResponseDto.e(), str2, str3));
                } else if (i2 == 2) {
                    m200.C(new IllegalStateException("ok_mimicry_need_validation come just after validation"));
                } else if (i2 == 3) {
                    q55 q55Var2 = q55.a;
                    q55.c().b.f(new OkItsMeFragmentData(str, authOnSuccessValidationResponseDto.f(), str2));
                } else if (i2 == 4) {
                    q55 q55Var3 = q55.a;
                    q55.c().b.v(new VKIDItsMeFragmentData(str, authOnSuccessValidationResponseDto.f(), str2));
                } else if (i2 == 5) {
                    q55 q55Var4 = q55.a;
                    q55.c().b.a(new OkExistingProfileFragmentData(str, authOnSuccessValidationResponseDto.f(), str2));
                }
                return s3q0.a;
            case 1:
                w2w w2wVar = (w2w) obj4;
                d040 d040Var = (d040) obj3;
                MsgSyncState msgSyncState = (MsgSyncState) obj2;
                Iterator<T> it = w2wVar.getConfig().f().iterator();
                while (it.hasNext()) {
                    long longValue = ((Number) it.next()).longValue();
                    Collection<lj30> f = d040Var.f(longValue, Collections.singleton(msgSyncState));
                    ArrayList arrayList = new ArrayList(c5g.u(f, 10));
                    Iterator<T> it2 = f.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(((lj30) it2.next()).c));
                    }
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        int intValue = ((Number) it3.next()).intValue();
                        gv30.a aVar = new gv30.a();
                        aVar.a = longValue;
                        aVar.a();
                        aVar.b();
                        aVar.c();
                        aVar.b = Integer.valueOf(intValue);
                        new zd20(new gv30(aVar), new utb(w2wVar.I0(), w2wVar.getExperiments()), true, false).a(w2wVar);
                        w2wVar.S0().j(null);
                    }
                }
                return s3q0.a;
            case 2:
                a9f a9fVar = (a9f) obj4;
                m7f m7fVar = (m7f) obj2;
                EmptyList emptyList = EmptyList.b;
                ClipsTemplateEditorFragment.a aVar2 = new ClipsTemplateEditorFragment.a();
                aVar2.y(new ClipsVideoTemplateEditorInputModel(m7fVar.a(), m7fVar.a, (ShortVideoGetTemplateExtendedResponseDto) obj, emptyList, m7fVar.c, a9fVar.a));
                aVar2.s(true);
                aVar2.t();
                dhr0.a.getClass();
                aVar2.w(dhr0.u().c);
                aVar2.k(((View) obj3).getContext());
                a9fVar.b = null;
                return s3q0.a;
            case 3:
                u4o u4oVar = new u4o((DonutUserStackSize) obj4, (DonutUserStackClipPosition) obj3, (iy5) obj2);
                sgi0<u4o> sgi0Var = v4o.b;
                qcy<Object> qcyVar = v4o.a[0];
                sgi0Var.getClass();
                ((tgi0) obj).a(sgi0Var, u4oVar);
                return s3q0.a;
            case 4:
                Playlist playlist = (Playlist) obj4;
                List<MusicTrack> list = (List) obj3;
                com.vk.music.playlist.display.data.a aVar3 = (com.vk.music.playlist.display.data.a) obj2;
                playlist.g = (PlaylistLink) obj;
                playlist.t = true;
                PlaylistPermissions playlistPermissions = playlist.B;
                playlist.B = playlistPermissions != null ? PlaylistPermissions.zb(playlistPermissions, false) : null;
                playlist.y = list;
                aVar3.a.b(new b9b0(playlist, xx1.k(playlist), true));
                return s3q0.a;
            case 5:
                q5b0.a aVar4 = (q5b0.a) obj3;
                wh50 wh50Var = (wh50) obj2;
                OneVideoAdBaseControls oneVideoAdBaseControls = (OneVideoAdBaseControls) ((wh50) obj4).getValue();
                if (oneVideoAdBaseControls != null) {
                    com.vk.libvideo.api.ad.a aVar5 = aVar4.b;
                    je0 je0Var = aVar4.a;
                    if (aVar5 instanceof a.AbstractC1195a) {
                        a.AbstractC1195a abstractC1195a = (a.AbstractC1195a) aVar5;
                        if (abstractC1195a instanceof a.AbstractC1195a.b) {
                            a.AbstractC1195a.b bVar = (a.AbstractC1195a.b) abstractC1195a;
                            qh0 qh0Var = bVar.e;
                            if (qh0Var != null) {
                                float f2 = qh0Var.c;
                                AdBannerData.a aVar6 = bVar.d;
                                int i3 = (int) ((aVar6.e - f2) * 1000.0f);
                                rh0Var = new rh0(i3, (int) (f2 * 1000), aVar6.h ? Integer.valueOf(Math.max(((int) (aVar6.i * 1000.0f)) - i3, 0)) : null);
                                if (rh0Var != null) {
                                    oneVideoAdBaseControls.V2();
                                } else {
                                    oneVideoAdBaseControls.c1();
                                    oneVideoAdBaseControls.setAdProgress(rh0Var);
                                }
                                if (aVar4.d) {
                                    n9c0 postView = oneVideoAdBaseControls.getPostView();
                                    if (postView != null) {
                                        je0Var.e(postView);
                                    }
                                    oneVideoAdBaseControls.setState(OneVideoAdBaseControls.c.a(oneVideoAdBaseControls.getState(), null, (int) (((q9x) wh50Var.getValue()).a >> 32), (int) (((q9x) wh50Var.getValue()).a & 4294967295L), 3));
                                }
                            }
                        } else {
                            if (!(abstractC1195a instanceof a.AbstractC1195a.C1196a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        rh0Var = null;
                        if (rh0Var != null) {
                        }
                        if (aVar4.d) {
                        }
                    } else {
                        if (!(aVar5 instanceof a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oneVideoAdBaseControls.getMotionDelegate().c((sws0) je0Var.d().b);
                        OneVideoAdBaseControls.b motionDelegate = oneVideoAdBaseControls.getMotionDelegate();
                        je0Var.d().getClass();
                        motionDelegate.a(false);
                        oneVideoAdBaseControls.getMotionDelegate().b(((a.b) aVar4.b).a);
                    }
                }
                return s3q0.a;
            case 6:
                VkSubnavigationBar vkSubnavigationBar = new VkSubnavigationBar((Context) obj, null, 0, 14, 0);
                vkSubnavigationBar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                sum0.k(vkSubnavigationBar, (sum0.c) obj4, new wow((List) obj3), (izs) obj2);
                return vkSubnavigationBar;
            case 7:
                y2n0 y2n0Var = (y2n0) obj2;
                tra0.a aVar7 = (tra0.a) obj;
                aVar7.q((tra0) obj4, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                aVar7.q((tra0) obj3, y2n0Var.a, y2n0Var.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 8:
                aaw0 aaw0Var = (aaw0) obj3;
                aaw0Var.getClass();
                y8w0 y8w0Var = new y8w0(0);
                y8w0Var.a = (String) obj4;
                VmojiConstructorOpenParamsModel vmojiConstructorOpenParamsModel = ((VmojiProductModel) obj2).k;
                y8w0Var.b = vmojiConstructorOpenParamsModel != null ? vmojiConstructorOpenParamsModel.v0() : null;
                y8w0Var.c = vmojiConstructorOpenParamsModel != null ? vmojiConstructorOpenParamsModel.zb() : null;
                y8w0Var.d = vmojiConstructorOpenParamsModel != null ? vmojiConstructorOpenParamsModel.Ab() : null;
                d6w0.a(b6m.e(), aaw0Var.b, "keyboard_create", y8w0Var.a(), 8);
                return s3q0.a;
            default:
                gvw0 gvw0Var = (gvw0) obj4;
                qbe0 qbe0Var = (qbe0) obj3;
                ScreencastPermissionFragment screencastPermissionFragment = (ScreencastPermissionFragment) obj;
                yu1 yu1Var = new yu1(29, gvw0Var, (w9l0) obj2);
                qqt0 qqt0Var = new qqt0(gvw0Var, 7);
                Context mo2getContext = screencastPermissionFragment.mo2getContext();
                Object systemService = mo2getContext != null ? mo2getContext.getSystemService("media_projection") : null;
                MediaProjectionManager mediaProjectionManager = systemService instanceof MediaProjectionManager ? (MediaProjectionManager) systemService : null;
                Intent createScreenCaptureIntent = mediaProjectionManager != null ? mediaProjectionManager.createScreenCaptureIntent() : null;
                if (mo2getContext == null || mediaProjectionManager == null || createScreenCaptureIntent == null) {
                    gvw0Var.g = false;
                    qbe0Var.invoke();
                    s3q0 s3q0Var = s3q0.a;
                } else if (mo2getContext.getPackageManager().queryIntentActivities(createScreenCaptureIntent, 0).isEmpty()) {
                    gvw0Var.g = false;
                    qbe0Var.invoke();
                    s3q0 s3q0Var2 = s3q0.a;
                } else {
                    screencastPermissionFragment.N = yu1Var;
                    screencastPermissionFragment.O = qqt0Var;
                    hb0<Intent> hb0Var = screencastPermissionFragment.P;
                    if (hb0Var != null) {
                        hb0Var.a(createScreenCaptureIntent);
                    }
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ q66(w2w w2wVar, d040 d040Var, MsgSyncState msgSyncState, pic picVar) {
        this.b = 1;
        this.c = w2wVar;
        this.d = d040Var;
        this.e = msgSyncState;
    }

    public /* synthetic */ q66(sum0 sum0Var, sum0.c cVar, List list, izs izsVar) {
        this.b = 6;
        this.c = cVar;
        this.d = list;
        this.e = izsVar;
    }

    public /* synthetic */ q66(aaw0 aaw0Var, String str, VmojiProductModel vmojiProductModel) {
        this.b = 8;
        this.d = aaw0Var;
        this.c = str;
        this.e = vmojiProductModel;
    }
}
