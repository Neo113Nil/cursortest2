package xsna;

import android.os.Parcelable;
import android.util.SizeF;
import android.util.SparseArray;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.vk.clips.attachments.impl.di.ClipsAttachmentsComponentImpl;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.b;
import com.vk.external.miniapp.net.app.AppFields;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.games.presentation.fragments.GameUnavailableFragment;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.metrics.reporters.AnrAppExitExceptions;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.search.ui.impl.catalog.MusicDiscoverSearchCatalogFragment;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.text.Regex;
import ru.ok.android.commons.http.Http;
import xsna.pgn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e20 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ e20(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction showOfferwallAd;
        switch (this.b) {
            case 0:
                return Integer.valueOf(iah0.a(80));
            case 1:
                bpn0 bpn0Var = AnrAppExitExceptions.b;
                return new Regex(".*executing service.*");
            case 2:
                return Boolean.valueOf(MusicFeatures.AUDIO_REWORK_PLAYER_ADS.h());
            case 3:
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                cVar.B0();
                cVar.r1();
                return s3q0.a;
            case 4:
                return s3q0.a;
            case 5:
                return new jwx(2, 30);
            case 6:
                qcy<Object>[] qcyVarArr = ClipsAttachmentsComponentImpl.f;
                return new okq0();
            case 7:
                b.C0547b c0547b = com.vk.clips.attachments.impl.publish.geolocation.presentation.b.k1;
                return s3q0.a;
            case 8:
                return new s290();
            case 9:
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return izi0.m(ContactsViews.USERS, ContactsViews.CONTACTS, ContactsViews.INVITE, ContactsViews.WRITE_BY_PHONE_NUMBER, ContactsViews.HINTS, ContactsViews.EMPTY, ContactsViews.CREATE_CHAT, ContactsViews.CREATE_CASPER_CHAT, ContactsViews.CREATE_CHANNEL);
            case 10:
                return new MusicDiscoverSearchCatalogFragment.a(MusicDiscoverSearchCatalogFragment.class, null, null).f();
            case 11:
                float f = lgo.a;
                return Boolean.TRUE;
            case 12:
                wdx0 wdx0Var = e370.f;
                wdx0 wdx0Var2 = wdx0Var != null ? wdx0Var : null;
                int i = pgn0.a.a;
                return wdx0Var2.c().b;
            case 13:
                qcy<Object>[] qcyVarArr2 = GameUnavailableFragment.W;
                return Boolean.valueOf(com.vk.toggle.b.A.a(SaFeatures.SA_MINI_APPS_CATALOG_ALIAS));
            case 14:
                showOfferwallAd = CommonAdViewerExposedFunctionsKt.showOfferwallAd();
                return showOfferwallAd;
            case 15:
                return new Regex("(^|[a-z0-9.\\-]*\\.)m\\.([a-z0-9.\\-]+\\.)?(vk|vkontakte)\\.(com|ru|me)");
            case 16:
                return s3q0.a;
            case 17:
                return new dpj0(0);
            case 18:
                return new bc40();
            case 19:
                return new cy1();
            case 20:
                return new i08();
            case 21:
                SparseArray sparseArray = new SparseArray();
                int b = cn70.b(20);
                abg0 abg0Var = dhr0.t;
                sparseArray.put(b, abg0Var.b(R.drawable.vk_icon_picture_outline_20, R.attr.vk_ui_icon_secondary));
                sparseArray.put(cn70.b(28), abg0Var.b(R.drawable.vk_icon_picture_outline_28, R.attr.vk_ui_icon_secondary));
                return sparseArray;
            case 22:
                return new p2r();
            case 23:
                HashMap hashMap = new HashMap();
                hq.c(104, hashMap, "square", 156, "square_1.5x");
                hq.c(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, hashMap, "square_2x", Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE, "square_3x");
                hashMap.put(Integer.valueOf(Http.StatusCode.RANGE_NOT_SATISFIABLE), "square_4x");
                return hashMap;
            case 24:
                return new SizeF(iah0.b(32.0f), iah0.b(32.0f));
            case 25:
                return s3q0.a;
            case 26:
                return new y4f();
            case 27:
                qcy<Object>[] qcyVarArr3 = SuggestedPostsFragment.r0;
                return new y3v();
            case 28:
                return s3q0.a;
            default:
                Parcelable.Creator<WebApiApplication> creator = WebApiApplication.CREATOR;
                ArrayList arrayList = new ArrayList(WebApiApplication.a.a());
                arrayList.remove(AppFields.PLACEHOLDER_INFO);
                return arrayList;
        }
    }
}
