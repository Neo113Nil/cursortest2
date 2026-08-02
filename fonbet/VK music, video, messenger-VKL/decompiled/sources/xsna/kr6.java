package xsna;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.preference.Preference;
import com.vk.ecomm.contentproducts.di.ContentProductsComponentImpl;
import com.vk.ecomm.storefront.impl.albums.presentation.fragment.StorefrontAlbumsFragment;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.toggle.b;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.io.File;
import kotlin.collections.EmptyList;
import kotlin.random.Random;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bbv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class kr6 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ kr6(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction storage;
        PrivateFiles.a b;
        JSONObject g;
        JSONArray optJSONArray;
        switch (this.b) {
            case 0:
                int i = qr6.q;
                return "UPLOAD_TRACE doUpload: preparing file info for upload";
            case 1:
                return s3q0.a;
            case 2:
                return "channelNotificationOff: ";
            case 3:
                Context context = e43.a;
                return (AudioManager) (context != null ? context : null).getSystemService("audio");
            case 4:
                return s3q0.a;
            case 5:
                return s3q0.a;
            case 6:
                return new u1r0();
            case 7:
                return s3q0.a;
            case 8:
                return s3q0.a;
            case 9:
                qcy<Object>[] qcyVarArr = ContentProductsComponentImpl.b;
                return new lkj();
            case 10:
                qcy<Object>[] qcyVarArr2 = FragmentImpl.M;
                return new Handler(Looper.getMainLooper());
            case 11:
                return new c7u(0);
            case 12:
                storage = CommonAdViewerExposedFunctionsKt.setStorage();
                return storage;
            case 13:
                return s3q0.a;
            case 14:
                qcy<Object>[] qcyVarArr3 = w920.v;
                return "checkHistoryUpdate: skipped and isLoading = true";
            case 15:
                return Boolean.valueOf(MusicFeatures.AUDIO_KIDS_MODE.h());
            case 16:
                return fxc0.B();
            case 17:
                bbv0.g.getClass();
                bbv0.a.f().d.i();
                return s3q0.a;
            case 18:
                return new n4b0("");
            case 19:
                Context context2 = e43.a;
                return Integer.valueOf(e3m.a(R.dimen.vkim_reactions_margin_after_stack_avatar_view, context2 != null ? context2 : null));
            case 20:
                com.vk.registration.funnels.b.z(com.vk.registration.funnels.b.a, SchemeStatSak$EventScreen.VERIFICATION_ENTER_NUMBER, null, null, null, 28);
                return s3q0.a;
            case 21:
                return Float.valueOf(1.0f);
            case 22:
                return new Handler(Looper.getMainLooper());
            case 23:
                return Preference.f("stickers_search");
            case 24:
                qcy<Object>[] qcyVarArr4 = StorefrontAlbumsFragment.R;
                return new wjl0();
            case 25:
                Random.b.getClass();
                return Boolean.valueOf(Random.c.i() < 0.001f);
            case 26:
                int i2 = SuperAppFragment.o0;
                return s3q0.a;
            case 27:
                b = e8r.a.b(r1, PrivateSubdir.CHAT_BACKGROUNDS.h(), true);
                File file = b.a;
                file.mkdirs();
                return file;
            case 28:
                return new StringBuilder();
            default:
                b.d i3 = com.vk.toggle.b.A.i(VideoFeatures.FIX_COMPRESSION);
                return (i3 == null || (g = i3.g()) == null || (optJSONArray = g.optJSONArray("encoders")) == null) ? EmptyList.b : f370.O(optJSONArray);
        }
    }
}
