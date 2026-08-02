package xsna;

import android.graphics.Path;
import com.unity3d.ads.core.domain.IntentCreation;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.camera.clips.api.stub.CameraClipsComponentStub;
import com.vk.clips.entrypoints.stub.ClipsEntryPointsComponentStub;
import com.vk.clips.internal.nps.impl.di.ClipsInternalNpsComponentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.money.createtransfer.people.CreatePeopleTransferFragment;
import com.vk.profile.community.suggestions.impl.di.CommunitySuggestionsComponentImpl;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.R;
import java.util.Calendar;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.Regex;
import one.video.player.BaseVideoPlayer;
import xsna.k840;
import xsna.zbd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class l63 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ l63(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        IntentCreation initialize$lambda$220$lambda$86;
        switch (this.b) {
            case 0:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_LINKVH_REDESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 1:
                return s3q0.a;
            case 2:
                int i = nh4.n1;
                return Boolean.valueOf(MusicFeatures.AUDIO_BOOK_CHAPTER_DOWNLOAD.h());
            case 3:
                vw3 vw3Var = BaseVideoPlayer.H;
                hzf0 hzf0Var = new hzf0();
                hzf0Var.start();
                return hzf0Var;
            case 4:
                qcy<Object>[] qcyVarArr = CameraClipsComponentStub.h;
                return new yyd();
            case 5:
                return k840.a.c();
            case 6:
                return s3q0.a;
            case 7:
                qcy<Object>[] qcyVarArr2 = ClipsEntryPointsComponentStub.c;
                return new sud();
            case 8:
                qcy<Object>[] qcyVarArr3 = ClipsInternalNpsComponentImpl.g;
                return new pra();
            case 9:
                return Calendar.getInstance();
            case 10:
                qcy<Object>[] qcyVarArr4 = CommunitySuggestionsComponentImpl.b;
                return new m3i();
            case 11:
                int i2 = CreatePeopleTransferFragment.B0;
                return new sbv0();
            case 12:
                return new androidx.recyclerview.widget.g();
            case 13:
                byte[] bArr = u7r.j;
                return "StorageManager is null but SDK version >= 26";
            case 14:
                return lar.c.getString(R.string.fsize_gb);
            case 15:
                return new ots();
            case 16:
                return new m4r();
            case 17:
                return new cx40();
            case 18:
                Path path = new Path();
                path.moveTo(21.5238f, 42.4013f);
                path.cubicTo(21.3631f, 42.498f, 21.1716f, 42.5518f, 20.9238f, 42.5518f);
                path.cubicTo(20.6761f, 42.5518f, 20.4846f, 42.498f, 20.3238f, 42.4013f);
                path.cubicTo(20.0376f, 42.229f, 19.8491f, 41.9204f, 19.6141f, 41.5359f);
                path.cubicTo(19.4385f, 41.2484f, 19.2369f, 40.9185f, 18.9494f, 40.5716f);
                path.cubicTo(18.5053f, 40.0359f, 18.0713f, 39.6007f, 17.6434f, 39.2518f);
                path.cubicTo(16.9937f, 38.7218f, 16.3583f, 38.3905f, 15.7238f, 38.2076f);
                path.cubicTo(15.4573f, 38.1307f, 15.191f, 38.08f, 14.9238f, 38.0518f);
                path.lineTo(15.7238f, 38.0518f);
                path.cubicTo(15.4489f, 38.0518f, 15.1823f, 38.052f, 14.9238f, 38.0518f);
                path.cubicTo(14.9027f, 38.0517f, 14.8816f, 38.0515f, 14.8606f, 38.0515f);
                path.cubicTo(10.9483f, 38.0479f, 8.88958f, 37.9939f, 7.2919f, 37.1798f);
                path.cubicTo(5.78661f, 36.4128f, 4.56276f, 35.189f, 3.79578f, 33.6837f);
                path.cubicTo(2.92383f, 31.9724f, 2.92383f, 29.7322f, 2.92383f, 25.2518f);
                path.lineTo(2.92383f, 14.8518f);
                path.cubicTo(2.92383f, 10.3713f, 2.92383f, 8.13113f, 3.79578f, 6.41983f);
                path.cubicTo(4.56276f, 4.91454f, 5.78661f, 3.69069f, 7.2919f, 2.92371f);
                path.cubicTo(9.0032f, 2.05176f, 11.2434f, 2.05176f, 15.7238f, 2.05176f);
                path.lineTo(26.1238f, 2.05176f);
                path.cubicTo(30.6042f, 2.05176f, 32.8445f, 2.05176f, 34.5558f, 2.92371f);
                path.cubicTo(36.061f, 3.69069f, 37.2849f, 4.91454f, 38.0519f, 6.41983f);
                path.cubicTo(38.9238f, 8.13113f, 38.9238f, 10.3713f, 38.9238f, 14.8518f);
                path.lineTo(38.9238f, 25.2518f);
                path.cubicTo(38.9238f, 29.7322f, 38.9238f, 31.9724f, 38.0519f, 33.6837f);
                path.cubicTo(37.2849f, 35.189f, 36.061f, 36.4128f, 34.5558f, 37.1798f);
                path.cubicTo(32.9581f, 37.9939f, 30.8994f, 38.0479f, 26.9871f, 38.0515f);
                path.cubicTo(26.9661f, 38.0515f, 26.945f, 38.0515f, 26.9238f, 38.0516f);
                path.cubicTo(26.6653f, 38.0518f, 26.3988f, 38.0518f, 26.1238f, 38.0518f);
                path.lineTo(26.9238f, 38.0516f);
                path.cubicTo(26.6567f, 38.0798f, 26.3903f, 38.1307f, 26.1238f, 38.2076f);
                path.cubicTo(25.4894f, 38.3905f, 24.8539f, 38.7218f, 24.2042f, 39.2518f);
                path.cubicTo(23.7764f, 39.6007f, 23.3423f, 40.0359f, 22.8983f, 40.5716f);
                path.cubicTo(22.6107f, 40.9185f, 22.4092f, 41.2484f, 22.2335f, 41.5359f);
                path.cubicTo(21.9986f, 41.9204f, 21.81f, 42.229f, 21.5238f, 42.4013f);
                path.close();
                return path;
            case 19:
                aaw aawVar = aaw.b;
                UserId c = o25.a().c();
                aawVar.getClass();
                return aaw.d(c);
            case 20:
                return new Regex("/call/join/[A-Za-z0-9._/]+");
            case 21:
                return new ucg0();
            case 22:
                return s3q0.a;
            case 23:
                return new w940();
            case 24:
                return OKVoipEngine.B;
            case 25:
                zbd0.a aVar = zbd0.a.a;
                return 4;
            case 26:
                return new u1r0();
            case 27:
                iyk0 iyk0Var = a4h0.a;
                return null;
            case 28:
                initialize$lambda$220$lambda$86 = ServiceProvider.initialize$lambda$220$lambda$86();
                return initialize$lambda$220$lambda$86;
            default:
                AtomicInteger atomicInteger = tn50.b;
                return Executors.newSingleThreadExecutor(new iyg0(1));
        }
    }
}
