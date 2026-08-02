package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.audiomsg.player.Speed;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AudioMsgPlayerModel.kt */
/* loaded from: classes2.dex */
public final class mr4 {
    public final io.reactivex.rxjava3.subjects.d<List<ur4>> a = io.reactivex.rxjava3.subjects.d.O0(EmptyList.b);
    public final io.reactivex.rxjava3.subjects.d<it80<ur4>> b = io.reactivex.rxjava3.subjects.d.O0(new it80(null));
    public final io.reactivex.rxjava3.subjects.d<Boolean> c = io.reactivex.rxjava3.subjects.d.O0(Boolean.TRUE);
    public final io.reactivex.rxjava3.subjects.d<Float> d = io.reactivex.rxjava3.subjects.d.O0(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    public final io.reactivex.rxjava3.subjects.d<Boolean> e = io.reactivex.rxjava3.subjects.d.O0(Boolean.FALSE);
    public final io.reactivex.rxjava3.subjects.d<Speed> f = io.reactivex.rxjava3.subjects.d.O0(Speed.X1);

    public final void a(boolean z) {
        this.c.onNext(Boolean.valueOf(z));
    }

    public final void b(float f) {
        this.d.onNext(Float.valueOf(f));
    }
}
