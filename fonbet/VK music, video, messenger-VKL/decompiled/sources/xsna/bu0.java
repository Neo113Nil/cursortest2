package xsna;

import android.content.Context;
import android.view.VelocityTracker;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.vk.auth.passport.b;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.view.components.cell.VkCell;
import com.vk.ecomm.contentproducts.di.ContentProductsComponent$Companion$STUB$1;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.newsfeed.posting.impl.di.Posting2ComponentImpl;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragmentOld;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.lego.CommunityAuthorHeaderMode;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class bu0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ bu0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction storage;
        switch (this.b) {
            case 0:
                return iu0.a;
            case 1:
                iyk0 iyk0Var = eu6.a;
                return null;
            case 2:
                int i = BonusCatalogFragment.f0;
                return VkCell.Left.Main.Size.Large;
            case 3:
                return s3q0.a;
            case 4:
                return "joinSuggestedhannel: ";
            case 5:
                return new blf();
            case 6:
                qcy<Object>[] qcyVarArr = ClipsViewerComponentImpl.o0;
                return new gsf();
            case 7:
                return new max0();
            case 8:
                int i2 = CommunityProfileFragment.k0;
                CommunityAuthorHeaderMode.Companion.getClass();
                int i3 = y1z.a;
                LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                return CommunityAuthorHeaderMode.Legacy;
            case 9:
                qcy<Object>[] qcyVarArr2 = ContentProductsComponent$Companion$STUB$1.b;
                return new ContentProductsComponent$Companion$STUB$1.a();
            case 10:
                return Boolean.valueOf(fxc0.B().i().g());
            case 11:
                return VelocityTracker.obtain();
            case 12:
                return new b8u();
            case 13:
                storage = CommonAdViewerExposedFunctionsKt.getStorage();
                return storage;
            case 14:
                return new qzq0();
            case 15:
                return new kge0();
            case 16:
                ArrayList a = e43.a("vk.com", "vk.ru");
                if (!a.contains(a0a.d)) {
                    a.add(a0a.d);
                }
                ArrayList arrayList = new ArrayList(c5g.u(a, 10));
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    arrayList.add("multiqr." + ((String) it.next()));
                }
                return j5g.S0(arrayList);
            case 17:
                int i4 = LocalMediaPickerFragmentOld.c0;
                return new ak3();
            case 18:
                return Boolean.TRUE;
            case 19:
                return new DisplayNameFormatter(null, 3, null);
            case 20:
                zdw zdwVar = i7o0.b;
                return (zdwVar != null ? zdwVar : null).d.w();
            case 21:
                ComFeatures comFeatures = ComFeatures.COM_VIDEO_ON_MAIN_TAB;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 22:
                return s3q0.a;
            case 23:
                return new b.a();
            case 24:
                int i5 = PollResultsFragment.b0;
                nub0.a().g();
                return s3q0.a;
            case 25:
                qcy<Object>[] qcyVarArr3 = Posting2ComponentImpl.h;
                return new klc0();
            case 26:
                return new pxo0(2000L);
            case 27:
                return new poe0();
            case 28:
                Context context = e43.a;
                return Integer.valueOf(e3m.a(R.dimen.vkim_reactions_margin_before_stack_avatar_view, context != null ? context : null));
            default:
                return s3q0.a;
        }
    }
}
