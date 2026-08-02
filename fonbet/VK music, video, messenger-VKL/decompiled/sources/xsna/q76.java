package xsna;

import android.content.Context;
import com.google.zxing.client.result.ParsedResult;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.qrcode.QRTypes$SubType;
import com.vk.qrcode.QRTypes$Type;
import java.util.HashMap;

/* compiled from: BaseCallback.java */
@Deprecated
/* loaded from: classes7.dex */
public abstract class q76 implements hx2 {
    public Object b;

    public /* synthetic */ q76(Object obj) {
        this.b = obj;
    }

    public static /* synthetic */ void d(q76 q76Var, Object obj, xzs xzsVar, int i) {
        if ((i & 1) != 0) {
            obj = null;
        }
        q76Var.c(obj, xzsVar);
    }

    public static gza0 n(String str, String str2, PlaybackLaunchMeta playbackLaunchMeta) {
        int L = drm0.L(str, '_', drm0.L(str, '_', 0, 6) + 1, 4);
        return L > 0 ? new gza0(str.substring(0, L), "", str.substring(L + 1, str.length()), str2, playbackLaunchMeta) : new gza0(str, "", null, str2, playbackLaunchMeta);
    }

    public abstract io.reactivex.rxjava3.core.q a();

    @Override // xsna.hx2
    public void e(VKApiExecutionException vKApiExecutionException) {
        if (((Context) this.b) != null) {
            h03.b(vKApiExecutionException);
        }
    }

    public void f() {
        ((io.reactivex.rxjava3.disposables.g) this.b).b(null);
    }

    public String g() {
        return ((ParsedResult) this.b).toString();
    }

    public sb7 h(Object obj) {
        Object j = j(obj);
        HashMap hashMap = (HashMap) this.b;
        sb7 sb7Var = (sb7) hashMap.get(j);
        if (sb7Var != null) {
            return sb7Var;
        }
        sb7 l = l(j, obj);
        if (l != null) {
            hashMap.put(j, l);
        }
        return l;
    }

    public abstract boolean i();

    public abstract Object j(Object obj);

    public abstract void k(StartPlaySource startPlaySource, MusicPlaybackLaunchContext musicPlaybackLaunchContext, AdsAudioPixelsContainer adsAudioPixelsContainer, wzs wzsVar);

    public abstract sb7 l(Object obj, Object obj2);

    public yp80 m() {
        return null;
    }

    public QRTypes$SubType o() {
        return QRTypes$SubType.NONE;
    }

    public String p() {
        return new String();
    }

    public abstract QRTypes$Type q();

    public q76(int i) {
        switch (i) {
            case 2:
                this.b = new io.reactivex.rxjava3.disposables.g();
                break;
            case 3:
            default:
                this.b = new HashMap();
                break;
            case 4:
                this.b = e5z0.a(giy0.d, null);
                break;
        }
    }

    public void c(Object obj, xzs xzsVar) {
    }
}
