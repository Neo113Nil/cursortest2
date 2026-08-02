package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.location.Location;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.common.links.AwayLink;
import com.vk.core.preference.Preference;
import com.vk.core.tips.Tooltip;
import com.vk.dto.common.data.VKList;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.PurchaseDetails;
import com.vk.dto.stickers.PurchaseDetailsButton;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.newsfeed.posting.geo_picker.presentation.model.PickerPlaceDto;
import com.vk.newsfeed.posting.geo_picker.presentation.model.PlacesPage;
import com.vk.stickers.ContextUser;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.f0r;
import xsna.gm50;
import xsna.mke;
import xsna.n1j;
import xsna.r2j;
import xsna.uyq;
import xsna.wk50;
import xsna.z5h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class v63 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v63(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v64, types: [T, io.reactivex.rxjava3.disposables.c] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        PurchaseDetailsButton purchaseDetailsButton;
        ButtonAction buttonAction;
        Object obj2;
        Object obj3;
        int i = this.b;
        Object obj4 = null;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i) {
            case 0:
                d73 d73Var = (d73) obj7;
                e73 e73Var = (e73) obj6;
                a73 a73Var = (a73) obj5;
                g2q0 g2q0Var = (g2q0) obj;
                if (g2q0Var == null) {
                    d73Var.d.c();
                    d73Var.b.submit(new w63(false ? 1 : 0, e73Var, d73Var));
                } else {
                    a73Var.invoke(Integer.valueOf(g2q0Var.a), "Consent form error: " + g2q0Var.b);
                }
                break;
            case 1:
                m57.a((Fragment) obj7, (d57) obj6, (Cipher) obj, (o47) obj5);
                break;
            case 2:
                PurchaseDetails purchaseDetails = (PurchaseDetails) obj7;
                kt8 kt8Var = (kt8) obj6;
                androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) obj5;
                AwayLink awayLink = (purchaseDetails == null || (purchaseDetailsButton = purchaseDetails.e) == null || (buttonAction = purchaseDetailsButton.c) == null) ? null : buttonAction.e;
                qdz d = xwk.d();
                Context context = kt8Var.j.a;
                if (awayLink == null || (str = awayLink.b) == null) {
                    str = "";
                }
                d.c(context, Uri.parse(str), awayLink != null ? awayLink.c : null);
                if (dVar != null) {
                    dVar.dismiss();
                }
                is8 is8Var = kt8Var.i;
                if (is8Var != null) {
                    is8Var.c();
                }
                break;
            case 3:
                yye yyeVar = (yye) obj7;
                izs izsVar = (izs) obj6;
                gzs gzsVar = (gzs) obj5;
                ved vedVar = (ved) obj;
                Iterator<T> it = vedVar.a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (epx.f(((ued) obj2).a, "license_agreement_2022_agree")) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                ued uedVar = (ued) obj2;
                Iterator<T> it2 = vedVar.a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (epx.f(((ued) next).a, "ugc_sounds_agreement_2022_agree")) {
                            obj4 = next;
                        }
                    }
                }
                ued uedVar2 = (ued) obj4;
                if (uedVar != null && uedVar2 != null) {
                    String str2 = uedVar.b;
                    boolean z = (str2 == null || uedVar2.b == null) ? false : true;
                    yyeVar.c = z;
                    boolean z2 = str2 == null;
                    if (!z) {
                        izsVar.invoke(Boolean.valueOf(z2));
                    } else if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                } else if (uedVar != null) {
                    boolean z3 = uedVar.b != null;
                    yyeVar.c = z3;
                    if (!z3) {
                        izsVar.invoke(Boolean.TRUE);
                    } else if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                } else if (uedVar2 != null) {
                    boolean z4 = uedVar2.b != null;
                    yyeVar.c = z4;
                    if (!z4) {
                        izsVar.invoke(Boolean.FALSE);
                    } else if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                } else if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
            case 4:
                Context context2 = (Context) obj7;
                String str3 = (String) obj6;
                ic icVar = (ic) obj5;
                c6h c6hVar = (c6h) obj;
                if (c6hVar != null) {
                    new z5h.a(context2, c6hVar, str3, icVar).H0(((FragmentActivity) e3m.h(context2)).getSupportFragmentManager(), "invite_link_preview_dialog_tag");
                    break;
                } else {
                    break;
                }
            case 5:
                esh eshVar = (esh) obj7;
                aj1 aj1Var = (aj1) obj6;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj5;
                VKList<Photo> vKList = (VKList) obj;
                Iterator<Photo> it3 = vKList.iterator();
                while (it3.hasNext()) {
                    it3.next().B = extendedUserProfile != null ? bwd0.l(extendedUserProfile) : null;
                }
                eshVar.e = vKList;
                eshVar.b.put(aj1Var, vKList);
                break;
            case 6:
                n1j n1jVar = (n1j) obj7;
                o1j o1jVar = (o1j) obj6;
                int i2 = n1j.k1;
                gm50.a.a(n1jVar, ((r2j.f) obj).a, new com.vk.movika.sdk.base.logic.interactor.p(n1jVar, 28));
                n1jVar.bo(o1jVar, n1j.a.LOADING);
                o1jVar.setContentView((View) obj5);
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                f0r.n nVar = (f0r.n) obj7;
                wk50.a aVar = (wk50.a) obj6;
                mke.r.b bVar = (mke.r.b) obj5;
                qih0 qih0Var = (qih0) obj;
                Iterator<T> it4 = qih0Var.a.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj3 = it4.next();
                        if (epx.f(xih0.a((wih0) obj3), bVar.e)) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                wih0 wih0Var = (wih0) obj3;
                f0r.k(nVar, aVar, qih0Var, null, wih0Var != null ? xih0.b(wih0Var) : null, 2);
                ClipFeedTab.Playlist playlist = nVar.b;
                f4z f4zVar = nVar.e;
                if (wih0Var != null) {
                    f4zVar.b(new uyq.e.a.b(playlist.Z0(), xih0.a(wih0Var), qih0Var.d, qih0Var.e));
                } else {
                    f4zVar.b(new uyq.e.a.C3856a(playlist.Z0()));
                }
                break;
            case 10:
                dra0 dra0Var = (dra0) obj7;
                String str4 = (String) obj6;
                Location location = (Location) obj5;
                PlacesPage placesPage = (PlacesPage) obj;
                List<PickerPlaceDto> list = placesPage.c;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it5 = list.iterator();
                while (it5.hasNext()) {
                    arrayList.add(new gra0((PickerPlaceDto) it5.next()));
                }
                break;
            case 11:
                ((Ref$ObjectRef) obj7).element = znk0.i((b3k0) obj6, (io.reactivex.rxjava3.core.w) obj5);
                break;
            case 12:
                StickerStockItem stickerStockItem = (StickerStockItem) obj7;
                stickerStockItem.O = "suggested_stickers";
                zal0 a = g2v.d().a();
                Context context3 = ((m5n0) obj6).itemView.getContext();
                ContextUser contextUser = ((n5n0) obj5).c;
                a.E(context3, stickerStockItem, e43.m(contextUser != null ? contextUser.b : null), contextUser, true, null, new acc0(9));
                break;
            default:
                dis0 dis0Var = (dis0) obj7;
                final prq0 prq0Var = (prq0) obj6;
                wmd0 wmd0Var = (wmd0) obj5;
                if (!iah0.r(dis0Var.getContext())) {
                    String string = dis0Var.getContext().getString(R.string.video_download_tooltip_player_title);
                    String string2 = dis0Var.getContext().getString(R.string.video_download_tooltip_player_description);
                    Context context4 = dis0Var.getContext();
                    WeakReference weakReference = new WeakReference(dis0Var);
                    DialogInterface.OnShowListener onShowListener = new DialogInterface.OnShowListener() { // from class: xsna.bis0
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(DialogInterface dialogInterface) {
                            prq0.this.invoke();
                        }
                    };
                    ie40 ie40Var = new ie40(wmd0Var, 22);
                    pla.e().b().getClass();
                    Tooltip.l(new Tooltip(context4, string, string2, null, null, onShowListener, new b1y((String) null), 0, 0, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, false, null, 0, false, null, null, null, null, null, null, ie40Var, 3100L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, weakReference, null, null, null, 2122317720, 15), dis0Var.getContext(), bwt0.G(dis0Var), false, false, false, false, 236);
                    gpt0 gpt0Var = gpt0.a;
                    if (!Preference.v("video_tooltip_prefs", "tooltip_video_downloads")) {
                        Preference.I("video_tooltip_prefs", "tooltip_video_downloads", true);
                    }
                    break;
                } else {
                    break;
                }
        }
        return s3q0.a;
    }

    public /* synthetic */ v63(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
