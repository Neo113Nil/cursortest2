package xsna;

import android.content.Context;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.dto.music.ExternalAudio;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerTrack;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.k840;

/* compiled from: AudioWebInterface.kt */
/* loaded from: classes15.dex */
public final class m05 implements l05 {
    public final Context b;
    public final u2b0 c = k840.a.g().b();
    public io.reactivex.rxjava3.disposables.c d;

    public m05(Context context) {
        this.b = context;
    }

    @Override // xsna.l05
    public final void audioPause(String str) {
        ExternalAudio externalAudio;
        if (str == null) {
            return;
        }
        u2b0 u2b0Var = this.c;
        MusicTrack b = u2b0Var.b();
        if (((b == null || (externalAudio = b.H) == null) ? null : externalAudio.c) != null) {
            return;
        }
        u2b0Var.pause(6);
    }

    @Override // xsna.l05
    public final void audioPlay(String str) {
        String str2;
        Object obj;
        if (str == null || str.length() == 0) {
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
        JSONObject jSONObject = new JSONObject(str);
        int i = 0;
        int optInt = jSONObject.optInt("pos", 0);
        JSONArray jSONArray = jSONObject.getJSONArray("audioIds");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj2 = jSONArray.get(i);
            String str3 = obj2 instanceof String ? (String) obj2 : null;
            if (str3 != null) {
                if (linkedHashMap.containsKey(str3)) {
                    List list = (List) linkedHashMap.get(str3);
                    if (list != null) {
                        list.add(Integer.valueOf(i));
                    }
                } else {
                    linkedHashMap.put(str3, e43.o(Integer.valueOf(i)));
                }
            }
            i++;
        }
        List<? extends Pair<String, ? extends List<Integer>>> x = rn00.x(linkedHashMap);
        Pair pair = (Pair) j5g.b0(optInt, x);
        if (pair != null && (str2 = (String) pair.i()) != null) {
            String n0 = drm0.n0(str2, BundleUtil.UNDERLINE_TAG);
            u2b0 u2b0Var = this.c;
            MusicTrack b = u2b0Var.b();
            if (n0.equals(b != null ? b.Fb() : null)) {
                u2b0Var.f(new PlaybackActionMeta(6, 0L, 2, null));
                return;
            }
            List<PlayerTrack> g = u2b0Var.g();
            if (g != null) {
                Iterator<T> it = g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (epx.f(((PlayerTrack) obj).b.Fb(), n0)) {
                            break;
                        }
                    }
                }
                PlayerTrack playerTrack = (PlayerTrack) obj;
                if (playerTrack != null) {
                    u2b0.v0(u2b0Var, playerTrack, null, 14);
                    return;
                }
            }
        }
        this.d = lyd.g().C(this.b, x, optInt, MusicPlaybackLaunchContext.s);
    }
}
