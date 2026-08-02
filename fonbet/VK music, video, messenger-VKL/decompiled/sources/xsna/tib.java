package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.dto.hints.HintId;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.service.MusicPlayerAction;
import java.util.ArrayList;
import java.util.Optional;
import xsna.hg1;

/* compiled from: ChannelsShowcaseBannerLoaderImpl.kt */
/* loaded from: classes.dex */
public final class tib {
    public final Object a;

    public /* synthetic */ tib(Object obj) {
        this.a = obj;
    }

    public static Intent b(int i, String str, boolean z) {
        Intent intent = new Intent(z ? "android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION" : "android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION");
        intent.putExtra("android.media.extra.PACKAGE_NAME", str);
        intent.putExtra("android.media.extra.AUDIO_SESSION", i);
        intent.putExtra("android.media.extra.CONTENT_TYPE", 0);
        return intent;
    }

    public Intent a(Context context, MusicPlayerAction musicPlayerAction, String str) {
        Intent intent = new Intent(musicPlayerAction.name(), null, context, (Class) this.a);
        intent.putExtra("EXTRA_PAYLOAD", str);
        return intent;
    }

    public Intent c(Context context, boolean z, PlaybackActionMeta playbackActionMeta, String str) {
        Intent a = a(context, MusicPlayerAction.ACTION_PREV, str);
        a.putExtra("EXTRA_NEED_TO_REWIND", z);
        a.putExtra("EXTRA_ACTION_META", playbackActionMeta);
        return a;
    }

    public tib(ArrayList arrayList) {
        this.a = new ArrayList(arrayList);
    }

    public tib(h7v h7vVar, a1w a1wVar) {
        this.a = HintId.IM_CHANNELS_SHOWCASE_BANNER.getId();
        io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar.l.a(), new hg1.x()).U(new hg1.w());
        final qib qibVar = new qib(this, 0);
        io.reactivex.rxjava3.core.q.X(U.U(new io.reactivex.rxjava3.functions.l() { // from class: xsna.rib
            @Override // io.reactivex.rxjava3.functions.l
            public final Object apply(Object obj) {
                return (Optional) qib.this.invoke(obj);
            }
        }), new io.reactivex.rxjava3.internal.operators.observable.s0(new sib(0, h7vVar, this))).k0();
    }
}
