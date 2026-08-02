package xsna;

import android.content.Context;
import android.os.Trace;
import android.util.Base64;
import android.view.View;
import com.ironsource.Bb;
import com.ironsource.Wd;
import com.unity3d.ironsourceads.banner.BannerAdLoader;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.metrics.eventtracking.Event;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import com.vkontakte.android.R;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.regex.Pattern;
import one.video.controls.view.seekpreview.SeekPreviewImageView;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.animoji.render.AnimojiRenderWrapperImpl;
import ru.ok.android.webrtc.camera.RotatedTextureBufferWrapper;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.call_effects.internal.CallEffectsRenderer;
import xsna.owb;
import xsna.skm0;
import xsna.vm30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class gs2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gs2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01b2 A[Catch: all -> 0x0143, DONT_GENERATE, TryCatch #2 {all -> 0x0143, blocks: (B:49:0x0130, B:52:0x0147, B:81:0x0157, B:83:0x0161, B:73:0x016e, B:75:0x0192, B:57:0x019a, B:60:0x01ae, B:62:0x01b2, B:63:0x01bd, B:68:0x01c4, B:70:0x01c8, B:71:0x01d3, B:59:0x019e), top: B:48:0x0130, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int length;
        long currentTimeMillis;
        int i = 0;
        switch (this.b) {
            case 0:
                AnimojiRenderWrapperImpl.a((AnimojiRenderWrapperImpl) this.c);
                return;
            case 1:
                BannerAdLoader.a((Bb) this.c);
                return;
            case 2:
                ner0 ner0Var = (ner0) this.c;
                Pattern pattern = BoardTopicViewFragment.H0;
                u1u0.b(ner0Var);
                cvk.u(R.string.error, false);
                return;
            case 3:
                ((Call) this.c).j();
                return;
            case 4:
                CallEffectsRenderer.m394unselectMaskEffect$lambda2((CallEffectsRenderer) this.c);
                return;
            case 5:
                ((dl9) this.c).b.kc(false);
                return;
            case 6:
                owb.b bVar = (owb.b) this.c;
                if (dhr0.M()) {
                    dhr0.a.getClass();
                    bVar.d.setTextColor(e3m.f(R.attr.vk_ui_text_primary, dhr0.y()));
                }
                CharSequence charSequence = bVar.e;
                if (charSequence != null) {
                    bVar.c.setText(charSequence);
                }
                VkOnboardingHighlighter.e(bVar.c, false, null, true, null, 8);
                return;
            case 7:
                iod iodVar = (iod) this.c;
                iodVar.h();
                rxo0 rxo0Var = iodVar.g;
                if (rxo0Var != null && !rxo0Var.b.get()) {
                    rxo0Var.e.post(new tv9(rxo0Var, 14));
                }
                iodVar.d.x(false);
                return;
            case 8:
                View view = (View) this.c;
                view.requestFocus();
                view.post(new tsk(view, 11));
                return;
            case 9:
                ((l1t) this.c).d.f();
                return;
            case 10:
                bhl0 bhl0Var = ((n3w) this.c).j;
                Context context = bhl0Var.b;
                String str = bhl0Var.d;
                Trace.beginSection(ndp0.f("StorageManager.release"));
                try {
                    com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
                    el3 el3Var = Event.b;
                    Event.a aVar = new Event.a();
                    aVar.g("StorageManager.release");
                    aVar.c("dbFileName", str == null ? "null" : str);
                    bVar2.k(aVar.e());
                    double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                    try {
                        if (str != null) {
                            try {
                                length = (int) (context.getDatabasePath(str).exists() ? r8.length() / 1024.0d : 0.0d);
                            } catch (Exception unused) {
                            }
                            if (str != null) {
                                try {
                                    if (new File(context.getDatabasePath(str).getAbsolutePath() + "-wal").exists()) {
                                        d = r2.length() / 1024.0d;
                                    }
                                    i = (int) d;
                                } catch (Exception unused2) {
                                }
                            }
                            currentTimeMillis = System.currentTimeMillis();
                            bhl0Var.C().e(bhl0Var.j);
                            bhl0Var.C().close();
                            s3q0 s3q0Var = s3q0.a;
                            Trace.endSection();
                            return;
                        }
                        bhl0Var.C().e(bhl0Var.j);
                        bhl0Var.C().close();
                        s3q0 s3q0Var2 = s3q0.a;
                        Trace.endSection();
                        return;
                    } finally {
                        String str2 = bhl0Var.d;
                        if (str2 != null) {
                            bhl0Var.i.i((int) (System.currentTimeMillis() - currentTimeMillis), length, i, str2);
                        }
                    }
                    length = 0;
                    if (str != null) {
                    }
                    currentTimeMillis = System.currentTimeMillis();
                } finally {
                    Trace.endSection();
                }
            case 11:
                ezz ezzVar = (ezz) this.c;
                ezzVar.a(ezzVar.a, 0L);
                return;
            case 12:
                vm30 vm30Var = (vm30) this.c;
                an30 an30Var = vm30Var.F;
                hh6 a = an30Var.a();
                a.setVisibility(0);
                a.b();
                vm30.c cVar = vm30Var.i;
                if (cVar != null && cVar.getEnabled()) {
                    awt0.i(an30Var.a(), new foi(new zf20(vm30Var, 2), 27));
                }
                f4m.j(vm30Var.B);
                vm30Var.D.c(false);
                return;
            case 13:
                RotatedTextureBufferWrapper.a((RotatedTextureBufferWrapper) this.c);
                return;
            case 14:
                SeekPreviewImageView seekPreviewImageView = (SeekPreviewImageView) this.c;
                float f = SeekPreviewImageView.o;
                seekPreviewImageView.setImageBitmap(null);
                return;
            case 15:
                ((ry3) this.c).invoke();
                return;
            case 16:
                ((skm0.a) this.c).J0();
                return;
            case 17:
                ((vtt0) this.c).h(true);
                return;
            case 18:
                Wd.c((Wd) this.c);
                return;
            case 19:
                ((ru.mail.libverify.l0.a) this.c).c();
                return;
            case 20:
                s3z0 s3z0Var = (s3z0) this.c;
                JSONObject jSONObject = new JSONObject();
                try {
                    for (Map.Entry entry : s3z0Var.a.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                    JSONArray jSONArray = new JSONArray();
                    jSONObject.put("events", jSONArray);
                    for (Map.Entry entry2 : s3z0Var.b.entrySet()) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("type", entry2.getKey());
                        jSONObject2.put("value", entry2.getValue());
                        jSONArray.put(jSONObject2);
                    }
                } catch (Throwable unused3) {
                }
                String jSONObject3 = jSONObject.toString();
                wga0.b("MetricMessage: Send metrics message - \n ", jSONObject3, null);
                new mcz0().d("https://sdk.mail.ru/sdk/ms/", Base64.encodeToString(jSONObject3.getBytes(StandardCharsets.UTF_8), 0), null);
                return;
            case 21:
                ((ru.mail.libverify.api.q) this.c).i();
                return;
            default:
                ((yads.rq2) this.c).b();
                return;
        }
    }
}
