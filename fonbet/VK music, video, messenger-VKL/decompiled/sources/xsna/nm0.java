package xsna;

import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.attachments.api.di.ClipsAttachmentsComponentStub;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.games.presentation.detail.GamesCatalogDetailFragment;
import com.vk.geo.impl.di.GeoComponentImpl;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.im.ui.di.ImUiPreferencesComponentImpl;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.search.ui.impl.catalog.apps.GlobalSearchMiniappsCatalogFragment;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.SearchFeatures;
import com.vkontakte.android.R;
import java.util.Calendar;
import java.util.List;
import kotlin.text.Regex;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nm0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ nm0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        FragmentManager supportFragmentManager;
        List<Fragment> f;
        FrameDecorator EMPTY_delegate$lambda$0;
        Fragment fragment = null;
        fragment = null;
        fragment = null;
        switch (this.b) {
            case 0:
                FeedFeatures feedFeatures = FeedFeatures.FRIEND_LIKES_INLINE;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 1:
                return new com.vk.libvideo.autoplay.c();
            case 2:
                return new pw9();
            case 3:
                ClipsAttachmentsComponentStub.f.getClass();
                return new com.vk.clips.attachments.api.di.e();
            case 4:
                c63 c63Var = c63.a;
                Activity b = c63.b();
                FragmentActivity fragmentActivity = b instanceof FragmentActivity ? (FragmentActivity) b : null;
                if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null && (f = supportFragmentManager.c.f()) != null) {
                    fragment = (Fragment) j5g.i0(f);
                }
                return Boolean.valueOf(fragment instanceof dw20);
            case 5:
                return new rod(new m3a(new ngj0()));
            case 6:
                return new z3l0();
            case 7:
                return Calendar.getInstance();
            case 8:
                int i = CommunityReviewsFragment.o0;
                return Boolean.valueOf(dhr0.M());
            case 9:
                return new e1i();
            case 10:
                return new TypedValue();
            case 11:
                return new xrm(null, null, null, null, 15);
            case 12:
                return new y2n(0);
            case 13:
                return new GlobalSearchMiniappsCatalogFragment.a(GlobalSearchMiniappsCatalogFragment.class, null, null).f();
            case 14:
                EMPTY_delegate$lambda$0 = FrameDecorator.Companion.EMPTY_delegate$lambda$0();
                return EMPTY_delegate$lambda$0;
            case 15:
                int i2 = GamesCatalogDetailFragment.d0;
                return Boolean.valueOf(uca.b());
            case 16:
                qcy<Object>[] qcyVarArr = GeoComponentImpl.f;
                return new s6r();
            case 17:
                return s3q0.a;
            case 18:
                f9w f9wVar = n3w.z;
                return "#shutdownServicesAndAwaitTermination starting...";
            case 19:
                return new ucg0();
            case 20:
                qcy<Object>[] qcyVarArr2 = ImUiPreferencesComponentImpl.b;
                return cew.b;
            case 21:
                return new Regex("^(?:adv\\.|www\\.)?rustore\\.ru");
            case 22:
                return new Regex("/clips/mediapicker");
            case 23:
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                zix zixVar = (zix) ofx.a(context);
                if (zixVar != null) {
                    return zixVar.a();
                }
                return null;
            case 24:
                return "Fragment.onResume";
            case 25:
                qcy<Object>[] qcyVarArr3 = OfflineAudioComponentImpl.M;
                return NetworkClient.ClientType.CLIENT_PLAYER_DOWNLOADER;
            case 26:
                SearchFeatures searchFeatures = SearchFeatures.SEARCH_FILTERS_DS;
                searchFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(searchFeatures));
            case 27:
                return UserId.d;
            case 28:
                Context context2 = e43.a;
                return Integer.valueOf(e3m.a(R.dimen.vkim_reactions_margin_after_counter, context2 != null ? context2 : null));
            default:
                return new jl80();
        }
    }
}
