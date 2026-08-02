package xsna;

import android.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.clips.api.stub.CameraClipsComponentStub;
import com.vk.clips.internal.nps.impl.di.ClipsInternalNpsComponentImpl;
import com.vk.im.engine.models.CallState;
import com.vk.im.itemlist.impl.di.ImItemListComponentImpl;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SoccomFeatures;
import com.vkontakte.android.R;
import java.util.regex.Pattern;
import kotlin.text.Regex;
import xsna.k840;
import xsna.qtd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class af0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ af0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new p4r();
            case 1:
                return s3q0.a;
            case 2:
                return s3q0.a;
            case 3:
                return new h56();
            case 4:
                return CallState.h();
            case 5:
                qcy<Object>[] qcyVarArr = CameraClipsComponentStub.h;
                return qtd.a.a;
            case 6:
                return s3q0.a;
            case 7:
                bpn0 bpn0Var = fxc0.a;
                return Boolean.valueOf(((g7s0) (bpn0Var != null ? bpn0Var : null).getValue()).J().z1());
            case 8:
                qcy<Object>[] qcyVarArr2 = ClipsInternalNpsComponentImpl.g;
                return new ljx();
            case 9:
                return Boolean.valueOf(com.vk.toggle.d.N());
            case 10:
                return androidx.compose.runtime.k.b(new tho0((String) null, 0L, 7));
            case 11:
                return androidx.compose.runtime.k.b(-1);
            case 12:
                return new float[1];
            case 13:
                return new vkq(o25.a());
            case 14:
                return lar.c.getString(R.string.fsize_mb);
            case 15:
                return new s6g0();
            case 16:
                return new c41();
            case 17:
                SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
                soccomFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(soccomFeatures));
            case 18:
                return s3q0.a;
            case 19:
                return dhr0.t.b(R.drawable.vk_icon_dropdown_16, R.attr.vk_ui_stroke_accent);
            case 20:
                Path path = new Path();
                path.moveTo(12.4923f, 21.9622f);
                path.cubicTo(13.535f, 20.5999f, 14.7273f, 20.4046f, 16.2174f, 19.311f);
                path.rLineTo(-5.2936f, 0.4905f);
                path.rLineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3.7425f);
                path.cubicTo(11.5645f, 23.544f, 11.7989f, 22.8682f, 12.4923f, 21.9622f);
                path.close();
                path.moveTo(12.4923f, 21.9622f);
                path.moveTo(9.35531f, 21.9622f);
                path.cubicTo(8.312571f, 20.5999f, 7.1202908f, 20.4046f, 5.6302104f, 19.311f);
                path.rLineTo(5.29359f, 0.4905f);
                path.rLineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3.7425f);
                path.cubicTo(10.2832f, 23.544f, 10.0487f, 22.8682f, 9.35531f, 21.9622f);
                path.close();
                path.moveTo(9.35531f, 21.9622f);
                s3q0 s3q0Var = s3q0.a;
                Path path2 = new Path();
                path2.moveTo(10.9238f, 19.6601f);
                path2.cubicTo(15.7839f, 19.6601f, 19.7238f, 15.716901f, 19.7238f, 10.852601f);
                path2.cubicTo(19.7238f, 5.9883013f, 15.783901f, 2.045021f, 10.9238f, 2.045021f);
                path2.cubicTo(6.0637207f, 2.045021f, 2.1238308f, 5.9883013f, 2.1238308f, 10.852601f);
                path2.cubicTo(2.1238308f, 15.716901f, 6.0637207f, 19.6601f, 10.9238f, 19.6601f);
                path2.close();
                path2.moveTo(10.9238f, 19.6601f);
                path2.rMoveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.2011f);
                path2.cubicTo(16.446701f, 20.8612f, 20.923801f, 16.3802f, 20.923801f, 10.8526f);
                path2.cubicTo(20.923801f, 5.3249903f, 16.446701f, 0.84399414f, 10.923801f, 0.84399414f);
                path2.cubicTo(5.40098f, 0.843994f, 0.923828f, 5.32499f, 0.923828f, 10.8526f);
                path2.cubicTo(0.923828f, 16.3802f, 5.40098f, 20.8612f, 10.9238f, 20.8612f);
                path2.close();
                path2.moveTo(10.9238f, 20.8612f);
                return e43.l(path, path2);
            case 21:
                qcy<Object>[] qcyVarArr3 = ImItemListComponentImpl.b;
                return new v5w();
            case 22:
                return new Regex("/join/[A-Za-z0-9._/]+");
            case 23:
                return Pattern.compile("\\[((?:id|club)[0-9]+)\\|([^]]+)]");
            case 24:
                return new p2m();
            case 25:
                return new a390();
            case 26:
                return new float[9];
            case 27:
                return Boolean.valueOf(MusicFeatures.AUDIO_FACE_LIFTING_2_ITERATION.h());
            case 28:
                return k840.a.c();
            default:
                return s3q0.a;
        }
    }
}
