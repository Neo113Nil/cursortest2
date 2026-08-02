package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.ecomm.moderation.api.di.ModerationComponent$Companion$STUB$1;
import com.vk.feed.settings.impl.presentation.filtered.tab.NewsfeedFilterListFragment2;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.log.L;
import com.vk.mediastore.storage.ClipsVideoStorage;
import com.vk.music.analytics.api.di.MusicAnalyticsComponent$Companion$STUB$1;
import com.vk.photos.ui.attachmentspicker.PickVKPhotoFragmentNew;
import com.vk.superapp.local.storage.js.bridge.api.di.LocalStorageComponent;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.SmbFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.PatternSyntaxException;
import kotlin.text.Regex;
import org.json.JSONObject;
import xsna.k840;
import xsna.w950;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class z34 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ z34(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new ucg0();
            case 1:
                return (lo4) mo4.d.getValue();
            case 2:
                return new Handler(Looper.getMainLooper());
            case 3:
                return Boolean.valueOf(fxc0.B().J().s1());
            case 4:
                int i = ClipFeedListFragment.a2;
                ClipsVideoStorage clipsVideoStorage = ClipsVideoStorage.a;
                return new onf();
            case 5:
                return s3q0.a;
            case 6:
                return new ProfilesInfo();
            case 7:
                return s3q0.a;
            case 8:
                return new cvn();
            case 9:
                ComFeatures comFeatures = ComFeatures.COM_DONUT_PRICE_DISCOUNT;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 10:
                return s3q0.a;
            case 11:
                return new mlu();
            case 12:
                return new ehv0();
            case 13:
                return Boolean.valueOf(fxc0.B().J().b());
            case 14:
                SmbFeatures smbFeatures = SmbFeatures.PRODUCT_CARD_PARAMS;
                smbFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(smbFeatures));
            case 15:
                ComFeatures comFeatures2 = ComFeatures.COM_POSTING_AUTHOR_SELECTION;
                comFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures2));
            case 16:
                return new a390();
            case 17:
                return new nv30();
            case 18:
                return ((LocalStorageComponent) x6y.H().a(fpf0.a(LocalStorageComponent.class))).R6();
            case 19:
                m6r0 f = q6r0.f();
                f.getClass();
                JSONObject jSONObject = new JSONObject((String) f.b(m6r0.P0, "{}"));
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        hashMap.put(new Regex(next), jSONObject.getString(next));
                    } catch (PatternSyntaxException unused) {
                        L.G(go9.b("Incorrect redirect link pattern = ", next));
                    }
                }
                return hashMap;
            case 20:
                return s3q0.a;
            case 21:
                qcy<Object>[] qcyVarArr = ModerationComponent$Companion$STUB$1.f;
                return new p430();
            case 22:
                qcy<Object>[] qcyVarArr2 = MusicAnalyticsComponent$Companion$STUB$1.b;
                return w950.a.a.getSTUB();
            case 23:
                return k840.a.c();
            case 24:
                int i2 = NewsfeedFilterListFragment2.X;
                return new bj60();
            case 25:
                return s3q0.a;
            case 26:
                return x5m.a.b();
            case 27:
                int i3 = PickVKPhotoFragmentNew.t0;
                return new zvw(null);
            case 28:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_ENABLE_REEF;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            default:
                return new o9r0(false, Integer.valueOf(dhr0.t.c(R.attr.vk_ui_image_border_alpha)), null, null, true, null, null, null, com.vk.movika.sdk.base.model.n.a(32.0f), 1772);
        }
    }

    public /* synthetic */ z34(r6y r6yVar) {
        this.b = 18;
    }
}
