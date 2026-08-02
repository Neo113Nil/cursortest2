package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import com.vk.clips.editor.templates.impl.player.a;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.log.L;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import kotlin.Pair;
import one.video.controls.views.preview.VideoSeekPreviewImage;
import org.chromium.base.Callback;
import org.json.JSONObject;
import xsna.a9q0;
import xsna.ka3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ja3 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ja3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        FileWriter fileWriter;
        mo60 mo60Var;
        mo60 mo60Var2;
        switch (this.b) {
            case 0:
                ka3.a aVar = (ka3.a) this.c;
                Context context = (Context) this.d;
                aVar.getClass();
                Pair pair = new Pair("crashEnabled", Boolean.valueOf(aVar.a));
                Pair pair2 = new Pair("anrEnabled", Boolean.valueOf(aVar.b));
                Pair pair3 = new Pair("heapDumpEnabled", Boolean.valueOf(aVar.c));
                Pair pair4 = new Pair("systraceEnabled", Boolean.valueOf(aVar.d));
                Pair pair5 = new Pair("samplingEnabled", Boolean.valueOf(aVar.e));
                ka3.b bVar = aVar.f;
                bVar.getClass();
                String jSONObject = new JSONObject(pn00.k(pair, pair2, pair3, pair4, pair5, new Pair("otelConfig", new JSONObject(pn00.k(new Pair("enabled", Boolean.valueOf(bVar.a)), new Pair("maxSpansCountToUpload", Integer.valueOf(bVar.b)), new Pair("uploadOnlyCompleteTraces", Boolean.valueOf(bVar.c)), new Pair("installAsGlobalTracer", Boolean.valueOf(bVar.d)), new Pair("maxEventsPerSpan", Integer.valueOf(bVar.e)), new Pair("maxAttributesPerEvent", Integer.valueOf(bVar.f)), new Pair("maxAttributesPerSpan", Integer.valueOf(bVar.g)), new Pair("samplerRatio", Double.valueOf(bVar.h)))).toString()))).toString();
                FileWriter fileWriter2 = null;
                try {
                    fileWriter = new FileWriter(new File(context.getFilesDir(), "app_tracer_config.bin"));
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    fileWriter.write(jSONObject);
                    fileWriter.close();
                    return;
                } catch (IOException unused2) {
                    fileWriter2 = fileWriter;
                    if (fileWriter2 != null) {
                        fileWriter2.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    if (fileWriter2 != null) {
                        fileWriter2.close();
                    }
                    throw th;
                }
            case 1:
                ((Callback) this.c).lambda$bind$0(this.d);
                return;
            case 2:
                ubb ubbVar = (ubb) this.c;
                StoryEntry storyEntry = (StoryEntry) this.d;
                if (ubbVar.l.c) {
                    return;
                }
                ubbVar.k.a(R.string.vkim_channel_story_published, new d7k0(R.string.vkim_channel_open_story, new g22(4, ubbVar, storyEntry)));
                return;
            case 3:
                a.c cVar = (a.c) this.c;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                com.vk.clips.editor.templates.impl.player.a aVar2 = com.vk.clips.editor.templates.impl.player.a.this;
                if (aVar2.P != null && aVar2.getCurrentState() == 0) {
                    aVar2.x(aVar2.P, false, 0L, aVar2.Q);
                }
                if (surfaceTexture == null) {
                    L.G("empty texture, can't play!");
                    return;
                } else {
                    aVar2.C(surfaceTexture);
                    aVar2.u();
                    return;
                }
            case 4:
                b.i iVar = (b.i) this.c;
                JSONObject jSONObject2 = (JSONObject) this.d;
                iVar.getClass();
                if (com.vkontakte.android.data.b.h().h.contains(jSONObject2) || !com.vkontakte.android.data.b.h().h.add(jSONObject2)) {
                    return;
                }
                com.vkontakte.android.data.b.h().m.add(pvo0.a() + StringUtils.COMMA + jSONObject2);
                if (com.vkontakte.android.data.b.h().o) {
                    com.vkontakte.android.data.b.b(com.vkontakte.android.data.b.h());
                }
                iVar.r();
                return;
            case 5:
                ewx ewxVar = (ewx) this.c;
                sq60 sq60Var = (sq60) this.d;
                gbh gbhVar = ewxVar.c;
                if (gbhVar == null || (mo60Var = (mo60) gbhVar.invoke()) == null) {
                    return;
                }
                a9q0 a9q0Var = sq60Var.h;
                if ((a9q0Var instanceof a9q0.b) || (a9q0Var instanceof a9q0.a) || (a9q0Var instanceof a9q0.c) || (a9q0Var instanceof a9q0.d)) {
                    bs60.b(mo60Var.f());
                    mo60Var.f().c();
                }
                gbh gbhVar2 = ewxVar.c;
                if (gbhVar2 != null && (mo60Var2 = (mo60) gbhVar2.invoke()) != null) {
                    ewxVar.h.d(sq60Var, (tc60) mo60Var2.U.getValue(), ewxVar.g.get());
                }
                mo60Var.f().l();
                return;
            case 6:
                Context context2 = (Context) this.d;
                Long l = (Long) this.c;
                ra20.a.getClass();
                ra20.a(context2, l);
                return;
            case 7:
                ((NewsFeedComponent) ((hu60) this.c).c.getValue()).w().e(129, (Post) this.d);
                return;
            case 8:
                VideoSeekPreviewImage videoSeekPreviewImage = (VideoSeekPreviewImage) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                VideoSeekPreviewImage.a aVar3 = videoSeekPreviewImage.o;
                if (aVar3 != null) {
                    aVar3.a();
                }
                videoSeekPreviewImage.setImageBitmap(bitmap);
                return;
            default:
                com.vungle.ads.internal.platform.c.a((com.vungle.ads.internal.platform.c) this.c, (o7j) this.d);
                return;
        }
    }

    public /* synthetic */ ja3(Context context, Long l) {
        this.b = 6;
        this.d = context;
        this.c = l;
    }
}
