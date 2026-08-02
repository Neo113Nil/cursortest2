package xsna;

import android.widget.FrameLayout;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.ecomm.clipproductattaches.di.ClipProductAttachesComponent$Companion$STUB$1;
import com.vk.im.ui.views.MentionCounterView;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.superapp.dating.sdk.js.bridge.impl.utils.DatingMiniAppIds;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorModalInternalComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.components.clips.ClipsUploadSdkEditComponentVkApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class cj4 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ cj4(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = 0;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(MusicFeatures.AUDIO_BOOK_CHAPTER_DOWNLOAD.h());
            case 1:
                AuthorModalInternalComponent.a aVar = AuthorModalInternalComponent.i;
                return new pee0(k7b.a);
            case 2:
                return new avl0();
            case 3:
                return Preference.f("classifieds_search");
            case 4:
                qcy<Object>[] qcyVarArr = ClipProductAttachesComponent$Companion$STUB$1.a;
                return new ClipProductAttachesComponent$Companion$STUB$1.a();
            case 5:
                asu0.a.getClass();
                return asu0.i();
            case 6:
                return new AtomicInteger(0);
            case 7:
                return s3q0.a;
            case 8:
                qcy<Object>[] qcyVarArr2 = ClipsUploadSdkEditComponentVkApp.h;
                return new ClipsUploadSdkEditComponentVkApp.b();
            case 9:
                return new cmf();
            case 10:
                qcy<Object>[] qcyVarArr3 = ClipsViewerComponentImpl.o0;
                return qyk0.a().c();
            case 11:
                ArrayList<dl60> arrayList = CommentThreadFragment.y0;
                return new jgg();
            case 12:
                return new a390();
            case 13:
                return s3q0.a;
            case 14:
                zrp<DatingMiniAppIds> h = DatingMiniAppIds.h();
                ArrayList arrayList2 = new ArrayList(c5g.u(h, 10));
                Iterator<E> it = h.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((DatingMiniAppIds) it.next()).i()));
                }
                return arrayList2;
            case 15:
                return new czm();
            case 16:
                return new q1n(new y2n(0));
            case 17:
                ComFeatures comFeatures = ComFeatures.COM_DONUT_PRICE_DISCOUNT;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 18:
                return s3q0.a;
            case 19:
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                return layoutParams;
            case 20:
                int i2 = EntriesListFragment.m0;
                return !BuildInfo.h() ? new gsm0() : new gsm0();
            case 21:
                return Long.valueOf(System.nanoTime());
            case 22:
                return new s3d0(i);
            case 23:
                return s3q0.a;
            case 24:
                pqo pqoVar = wtz.a;
                return null;
            case 25:
                List<Integer> list = a500.z;
                return "API error";
            case 26:
                int i3 = MentionCounterView.h;
                dhr0.a.getClass();
                baf0 b = dhr0.t.b(R.drawable.vk_icon_mention_16, R.attr.vk_legacy_counter_secondary_text);
                float f = 12;
                b.setBounds(0, 0, iah0.a(f), iah0.a(f));
                return b;
            case 27:
                qcy<Object>[] qcyVarArr4 = w920.v;
                return "onUpdateSuccess: MsgHistory updated";
            case 28:
                return Boolean.valueOf(MusicFeatures.SUBSCRIPTION_NAV_SCREENS.h());
            default:
                FeedFeatures feedFeatures = FeedFeatures.PARSE_LINKS;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
        }
    }
}
