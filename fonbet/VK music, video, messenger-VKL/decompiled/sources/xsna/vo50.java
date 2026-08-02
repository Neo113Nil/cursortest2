package xsna;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import com.google.zxing.qrcode.QRCodeReader;
import com.vk.core.preference.Preference;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.feed.settings.impl.di.NewsfeedSettingsComponentImpl;
import com.vk.photo.editor.features.mlenhance.TextSwitcherView;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.SearchFeatures;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragmentInternalComponent;
import com.vkontakte.android.R;
import java.util.concurrent.Executors;
import xsna.cru0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo50 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ vo50(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new obx0();
            case 1:
                owq b = com.vk.toggle.d.i.b();
                if (b != null) {
                    return b;
                }
                owq.b.getClass();
                return owq.c;
            case 2:
                int i = m760.A;
                Preference.F(System.currentTimeMillis(), "games_confirm_exit_dialog", "animation_shown_timestamp");
                return s3q0.a;
            case 3:
                FeedFeatures feedFeatures = FeedFeatures.DISABLE_PLAYLIST_ANIM;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures) && com.vk.toggle.d.j().b);
            case 4:
                qcy<Object>[] qcyVarArr = NewsfeedSettingsComponentImpl.d;
                return new gz60(new byt(3), new shb());
            case 5:
                return new he70();
            case 6:
                return s3q0.a;
            case 7:
                Object obj = cru0.j;
                return Boolean.valueOf(cru0.a.c());
            case 8:
                return new b6n0(new kly(new alk(), fxc0.B()));
            case 9:
                return Integer.valueOf(dhr0.t.c(R.attr.vk_ui_text_secondary));
            case 10:
                return new Handler(Looper.getMainLooper());
            case 11:
                PublishFragmentInternalComponent.a aVar = PublishFragmentInternalComponent.v;
                return new jed0();
            case 12:
                return new QRCodeReader();
            case 13:
                return new int[]{R.id.reaction_name_1, R.id.reaction_name_2, R.id.reaction_name_3, R.id.reaction_name_4, R.id.reaction_name_5, R.id.reaction_name_6, R.id.reaction_name_7, R.id.reaction_name_8};
            case 14:
                SearchFeatures searchFeatures = SearchFeatures.SEARCH_FILTERS_DS;
                searchFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(searchFeatures));
            case 15:
                return Boolean.valueOf(fxc0.B().J().c0());
            case 16:
                return Executors.newSingleThreadExecutor(new iyg0(2));
            case 17:
                return new hhn0();
            case 18:
                return s3q0.a;
            case 19:
                int i2 = TextSwitcherView.h;
                return s3q0.a;
            case 20:
                pqo pqoVar = q6p0.a;
                return Boolean.FALSE;
            case 21:
                return new LruCache(25);
            case 22:
                return Boolean.valueOf(fxc0.B().J().R0());
            case 23:
                int i3 = VkBlurContentView.f;
                return xdu.b();
            default:
                return (nfv0) jfv0.u.getValue();
        }
    }
}
