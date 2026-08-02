package xsna;

import com.vk.ads.easypromote.impl.di.EasyPromoteComponentImpl;
import com.vk.attachpicker.impl.location.LocationFragment;
import com.vk.camera.clips.api.stub.CameraClipsComponentStub;
import com.vk.clips.coauthors.di.ClipsCoauthorsInternalComponent;
import com.vk.clips.internal.nps.impl.di.ClipsInternalNpsComponentImpl;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.common.links.generator.impl.di.LinksGeneratorComponentImpl;
import com.vk.ecomm.market.di.MarketProductFilterComponentImpl;
import com.vk.medianative.AudioNative;
import com.vk.toggle.Features;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.BirthdayBroadcastReceiver;
import com.vkontakte.android.R;
import java.util.Calendar;
import kotlin.text.Regex;
import xsna.lkt0;
import xsna.ls50;
import xsna.pne;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class de4 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ de4(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(MusicFeatures.AUDIO_BOOK_CHAPTER_DOWNLOAD.h());
            case 1:
                return Long.valueOf(AudioNative.b());
            case 2:
                int i = BirthdayBroadcastReceiver.a;
                return s3q0.a;
            case 3:
                qcy<Object>[] qcyVarArr = CameraClipsComponentStub.h;
                return lkt0.a.a.getSTUB();
            case 4:
                return new iid0();
            case 5:
                return Integer.valueOf(dhr0.t.c(R.attr.vk_ui_icon_accent));
            case 6:
                qcy<Object>[] qcyVarArr2 = ClipsCoauthorsInternalComponent.c;
                return new ind();
            case 7:
                return new zi9();
            case 8:
                return new cmf();
            case 9:
                qcy<Object>[] qcyVarArr3 = ClipsInternalNpsComponentImpl.g;
                return new wl70();
            case 10:
                return new pne.a.C3523a();
            case 11:
                String str = ClipsUploadFragmentImpl.a0;
                return s3q0.a;
            case 12:
                return s3q0.a;
            case 13:
                return s3q0.a;
            case 14:
                qcy<Object>[] qcyVarArr4 = EasyPromoteComponentImpl.c;
                return new lwo();
            case 15:
                return new rx3();
            case 16:
                return new a390();
            case 17:
                return new Regex("/app");
            case 18:
                qcy<Object>[] qcyVarArr5 = LinksGeneratorComponentImpl.f;
                return new k24();
            case 19:
                int i2 = LocationFragment.h0;
                return s3q0.a;
            case 20:
                return new ks50(ls50.b.a);
            case 21:
                qcy<Object>[] qcyVarArr6 = MarketProductFilterComponentImpl.e;
                return new vy00();
            case 22:
                return new float[9];
            case 23:
                return s3q0.a;
            case 24:
                return new e2x(0);
            case 25:
                return Boolean.valueOf(com.vk.toggle.b.A.a(Features.Type.FEATURE_CORE_SOCIAL_NET));
            case 26:
                return s3q0.a;
            case 27:
                return Boolean.valueOf(MusicFeatures.OFFLINE_PENDING_UI.h());
            case 28:
                return s3q0.a;
            default:
                return Calendar.getInstance();
        }
    }
}
