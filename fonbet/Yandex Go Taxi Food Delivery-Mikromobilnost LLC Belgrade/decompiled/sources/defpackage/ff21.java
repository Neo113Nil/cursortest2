package defpackage;

import com.yandex.go.feed_video.domain.manager.a;
import com.yandex.urbanads.internal.divkit.video.UrbanAdsDivPlayerView;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import ru.yandex.video.m3.list_player_manager.PlaybackConfig;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.list_player_manager.model.Stream;
import ru.yandex.video.m3.list_player_manager.model.StreamType;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

/* loaded from: classes7.dex */
public final class ff21 implements r4l {
    public final List a;
    public final v4l b;
    public final LinkedHashSet c = new LinkedHashSet();
    public final zf21 d;
    public UrbanAdsDivPlayerView e;
    public final ef21 f;

    public ff21(List list, v4l v4lVar, ag21 ag21Var) {
        this.a = list;
        this.b = v4lVar;
        c1x0 c1x0Var = (c1x0) ag21Var;
        c1x0Var.getClass();
        zf21 zf21Var = new zf21((a) c1x0Var.a);
        this.d = zf21Var;
        ef21 ef21Var = new ef21(this);
        this.f = ef21Var;
        zf21Var.b.add(ef21Var);
        zf21Var.a().setMuted(v4lVar.b);
    }

    @Override // defpackage.r4l
    public final void a(q4l q4lVar) {
        this.c.add(q4lVar);
    }

    @Override // defpackage.r4l
    public final void b(long j) {
        this.d.a().seekTo(j);
    }

    @Override // defpackage.r4l
    public final void c(List list, v4l v4lVar) {
        this.d.a().setMuted(v4lVar.b);
        d(list, v4lVar.d);
    }

    public final void d(List list, JSONObject jSONObject) {
        String str;
        String str2;
        jol jolVar = (jol) kotlin.collections.a.R(list);
        if (jolVar != null) {
            String uri = jolVar.a.toString();
            String str3 = jolVar.b;
            if (jSONObject == null || (str = jSONObject.optString("first_frame_url")) == null || str.length() <= 0) {
                str = null;
            }
            if (jSONObject == null || (str2 = jSONObject.optString("first_frame_hash")) == null || str2.length() <= 0) {
                str2 = null;
            }
            zf21 zf21Var = this.d;
            zf21Var.getClass();
            StreamType streamType = str3 != null ? (StreamType) ((Map) zf21.f.getValue()).get(str3) : null;
            if (streamType == null) {
                streamType = StreamType.HLS;
            }
            MediaData.Builder builder = new MediaData.Builder((List<Stream>) Collections.singletonList(new Stream(streamType, uri)));
            builder.setFirstFrameUrl(str);
            builder.setFirstFrameHash(str2);
            zf21Var.a().setSource(builder.build(), new PlaybackConfig(false, 0L, false, false, null, 16, null));
        }
    }

    @Override // defpackage.r4l
    public final void pause() {
        this.d.a().pause();
    }

    @Override // defpackage.r4l
    public final void play() {
        this.d.a().play();
    }

    @Override // defpackage.r4l
    public final void release() {
        ef21 ef21Var = this.f;
        zf21 zf21Var = this.d;
        zf21Var.b.remove(ef21Var);
        ListYandexPlayerView listYandexPlayerView = zf21Var.d;
        if (listYandexPlayerView != null) {
            listYandexPlayerView.detach();
        }
        zf21Var.d = null;
        zf21Var.a().removeObserver(zf21Var.c);
        ListYandexPlayerView listYandexPlayerView2 = zf21Var.d;
        if (listYandexPlayerView2 != null) {
            listYandexPlayerView2.detach();
        }
        zf21Var.d = null;
        zf21Var.a.c(zf21Var.a());
        zf21Var.a().dropSource();
        this.e = null;
    }

    @Override // defpackage.r4l
    public final void setMuted(boolean z) {
        this.d.a().setMuted(z);
    }
}
