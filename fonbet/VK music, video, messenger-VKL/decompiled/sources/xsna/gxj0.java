package xsna;

import android.os.Parcelable;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.stickers.post.attach.StoryAttachImageView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.serialize.Serializer;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import xsna.hh8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class gxj0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ gxj0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Integer.valueOf(((fxj0) obj).e6());
            case 1:
                Throwable th = (Throwable) obj;
                h03.b(th);
                com.vk.metrics.eventtracking.b.a.a(th);
                return s3q0.a;
            case 2:
                int i = StoryAttachImageView.t;
                return ahn.C((io.reactivex.rxjava3.core.q) obj);
            case 3:
                hh8 hh8Var = (hh8) obj;
                int i2 = StreamInfoFragment.S;
                hh8Var.getClass();
                return Boolean.valueOf(!((hh8Var instanceof hh8.a) || (hh8Var instanceof hh8.b)));
            case 4:
                return s3q0.a;
            case 5:
                Serializer.c<UIBlockList> cVar = UIBlockList.CREATOR;
                return ((UIBlock) obj).toString();
            case 6:
                Parcelable a = ((h7o0) obj).a();
                if (a != null) {
                    return a;
                }
                throw new IllegalStateException();
            case 7:
                xgx0.a.getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            case 8:
                return Float.valueOf(((sq2) obj).a);
            case 9:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 10:
                q5j q5jVar = (q5j) obj;
                m6j m6jVar = q5jVar.f;
                s5j s5jVar = q5jVar.c;
                jor0.a(m6jVar, s5jVar.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                jcv.b(q5jVar.g, s5jVar.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                return s3q0.a;
            case 11:
                return new l7w0((ViewGroup) obj);
            case 12:
                return Boolean.valueOf(((MediaOptionState) obj) != MediaOptionState.MUTED_PERMANENT);
            case 13:
                return low0.a((low0) obj, false, true, 2815);
            default:
                return Boolean.valueOf(((VoipViewModelState) obj).h());
        }
    }
}
