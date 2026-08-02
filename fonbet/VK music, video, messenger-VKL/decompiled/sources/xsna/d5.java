package xsna;

import android.content.Context;
import android.view.View;
import com.vk.ads.externalsdkstat.api.ExternalSdk;
import com.vk.ads.externalsdkstat.api.di.AdsSdkStatTrackerComponent;
import com.vk.ads.optional.impl.di.OptionalAdsFeatureComponentImpl;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vk.ecomm.onlinebooking.impl.edit.a;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.ui.fragments.ImDialogsSelectionFragment;
import com.vk.log.L;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.voip.api.di.VoipCallComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.EmptySet;
import org.json.JSONObject;
import xsna.a7f0;
import xsna.acx;
import xsna.b4;
import xsna.bex0;
import xsna.cxl;
import xsna.fck;
import xsna.hmd0;
import xsna.i870;
import xsna.khw0;
import xsna.pmb0;
import xsna.sst0;
import xsna.sx40;
import xsna.w9z;
import xsna.ymb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d5 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d5(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        gvv0 view;
        WebApiApplication v;
        int i = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ((w4) obj).b.d(new b4.l0(false));
                jyr0.a(R.drawable.vk_icon_check_circle_outline_28, R.string.video_unsubscribed_message, (Context) obj2);
                break;
            case 1:
                ((izs) ((zak0) ((go7) obj).b).getValue()).invoke(new a.d.C0962a(!((BookingEditScreenState.b) obj2).a));
                break;
            case 2:
                MsgFromChannel msgFromChannel = (MsgFromChannel) obj;
                break;
            case 3:
                ymb ymbVar = (ymb) obj;
                p980 p980Var = (p980) obj2;
                DialogExt dialogExt = ymbVar.i;
                if (dialogExt != null) {
                    Collection<Integer> collection = p980Var.d.get(Long.valueOf(dialogExt.e));
                    if (collection == null) {
                        collection = EmptySet.b;
                    }
                    Collection values = ymbVar.k.values();
                    ArrayList arrayList = new ArrayList(c5g.u(values, 10));
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((ymb.a) it.next()).a.b));
                    }
                    LinkedHashSet d0 = j5g.d0(j5g.S0(arrayList), j5g.S0(collection));
                    if (!d0.isEmpty()) {
                        a7f0.a.f(ymbVar, ymbVar.f.e(d0), new vl1(ymbVar, 17), new mf8(L.a, 1), 1);
                    }
                    break;
                } else {
                    break;
                }
            case 4:
                khw0.a aVar = (khw0.a) obj;
                png pngVar = (png) obj2;
                zqk0 zqk0Var = aVar.a;
                if (zqk0Var.i) {
                    p19 provide = ((VoipCallComponent) ((k7m) m7m.f(pngVar)).a(fpf0.a(VoipCallComponent.class))).t1().provide();
                    if (provide != null && provide.d().b.a) {
                        l2x0 l2x0Var = (l2x0) pngVar.h.getValue();
                        Context context = e43.a;
                        xa4.L(context != null ? context : null);
                        l2x0Var.getClass();
                        break;
                    }
                }
                com.vk.voip.ui.c.b.g1(zqk0Var, aVar.b, aVar.c, aVar.d, aVar.e);
                break;
            case 5:
                avh avhVar = (avh) obj;
                avhVar.o.b(((sst0.b) obj2).a, (h270) avhVar.r.getValue());
                break;
            case 6:
                fck.a.C2864a c2864a = (fck.a.C2864a) obj2;
                ww50 v2 = s200.v(((fck) obj).requireContext());
                if (v2 != null) {
                    v2.H(c2864a);
                }
                break;
            case 7:
                break;
            case 8:
                pmb0 pmb0Var = (pmb0) obj;
                izs izsVar = (izs) obj2;
                if (pmb0Var instanceof pmb0.c) {
                    izsVar.invoke(cxl.i.b);
                } else if (pmb0Var instanceof pmb0.b) {
                    izsVar.invoke(cxl.h.b);
                } else if (pmb0Var instanceof pmb0.a) {
                    izsVar.invoke(cxl.t.b);
                }
                break;
            case 9:
                yjm yjmVar = (yjm) obj;
                break;
            case 10:
                int i2 = ImDialogsSelectionFragment.n0;
                ((ImDialogsSelectionFragment) obj).fo((DialogExt) obj2);
                break;
            case 11:
                x6y x6yVar = (x6y) obj2;
                try {
                    JSONObject jSONObject = new JSONObject((String) obj);
                    fvv0 M = x6yVar.M();
                    if (M != null && (view = M.getView()) != null) {
                        view.i4(jSONObject.optString("text", ""), jSONObject.optString("title", ""), jSONObject.optString("logoUrl"));
                    }
                } catch (Exception unused) {
                    bex0.a.a(x6yVar, JsApiMethodType.SHOW_QR, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                }
                break;
            case 12:
                wh50 wh50Var = (wh50) obj;
                w9z w9zVar = (w9z) obj2;
                if (((tho0) wh50Var.getValue()).a.c.length() > 4) {
                    int i3 = w9z.k1;
                    if (!w9z.b.a(((tho0) wh50Var.getValue()).a.c)) {
                        break;
                    }
                }
                break;
            case 13:
                com.vk.clips.sdk.shared.item.market_ads.b bVar = (com.vk.clips.sdk.shared.item.market_ads.b) obj2;
                break;
            case 14:
                break;
            case 15:
                i870.a aVar2 = (i870.a) obj;
                izs izsVar2 = (izs) obj2;
                if (!jjc.d().a()) {
                    snv snvVar = aVar2.d;
                    if (snvVar != null) {
                        izsVar2.invoke(snvVar);
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
                break;
            case 16:
                OptionalAdsFeatureComponentImpl optionalAdsFeatureComponentImpl = (OptionalAdsFeatureComponentImpl) obj2;
                qcy<Object>[] qcyVarArr = OptionalAdsFeatureComponentImpl.e;
                m11 J8 = ((AdsSdkStatTrackerComponent) obj).J8(ExternalSdk.APPLOVIN_MAX);
                lau P4 = optionalAdsFeatureComponentImpl.b.P4();
                P4.d(J8);
                break;
            case 17:
                ((c390) obj2).b.a(new acx.e((VideoFile) obj));
                break;
            case 18:
                cl40.a((View) obj, MusicHapticEvent.LIGHT);
                ((izs) obj2).invoke(sx40.u.b);
                break;
            case 19:
                ((izs) obj).invoke(new sx40.r0(((kib0) obj2).c().a));
                break;
            case 20:
                ((izs) obj).invoke(((lwb0) obj2).f);
                break;
            case 21:
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                com.vk.attachpicker.screen.k kVar = (com.vk.attachpicker.screen.k) obj2;
                if (onClickListener != null) {
                    onClickListener.onClick(kVar.x);
                }
                break;
            case 22:
                ((izs) obj).invoke((hmd0.a) obj2);
                break;
            case 23:
                ((rng0) obj).z((StickerStockItem) obj2);
                break;
            case 24:
                break;
            case 25:
                ggu0 ggu0Var = (ggu0) obj;
                gzs gzsVar = (gzs) obj2;
                if (ggu0Var.v() && (v = ggu0Var.e.v()) != null && v.f()) {
                    ggu0Var.l().a();
                }
                gzsVar.invoke();
                break;
            case 26:
                ((gvw0) obj).e = false;
                ((k7y) obj2).invoke();
                break;
            default:
                ((izs) obj).invoke(((rmx0) obj2).e);
                break;
        }
        return s3q0.a;
    }
}
