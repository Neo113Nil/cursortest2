package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import androidx.activity.ComponentActivity;
import androidx.emoji2.text.c;
import androidx.emoji2.text.f;
import com.ironsource.Wd;
import com.vk.im.ui.views.EmptyViewForList;
import com.vk.libvideo.live.impl.dialog.LiveVideoDialog;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.writebar.WriteBar;
import java.nio.MappedByteBuffer;
import ru.ok.android.webrtc.animoji.render.AnimojiRenderWrapperImpl;
import ru.ok.android.webrtc.protocol.screenshare.send.ScreenshareSender;
import ru.ok.call_effects.internal.CallEffectsRenderer;
import xsna.d6s;
import xsna.igz0;
import xsna.skm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class fs2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fs2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    private final void a() {
        dsi dsiVar = ((n3w) this.c).n;
        synchronized (dsiVar.b) {
            try {
                for (Object obj : dsiVar.e.values()) {
                    dsiVar.d.removeCallbacksAndMessages(obj);
                    dsiVar.f.a(obj);
                }
                dsiVar.e.clear();
                dsiVar.c.clear();
                dsiVar.g = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [android.view.ViewGroup, xsna.kkz0] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                AnimojiRenderWrapperImpl.b((AnimojiRenderWrapperImpl) this.c);
                return;
            case 1:
                lj8 lj8Var = (lj8) this.c;
                lj8Var.f.setVisibility(0);
                f4m.j(lj8Var.d);
                f4m.j(lj8Var.i);
                f4m.j(lj8Var.e);
                return;
            case 2:
                CallEffectsRenderer.m395unselectVirtualBackgroundEffect$lambda1((CallEffectsRenderer) this.c);
                return;
            case 3:
                ((dl9) this.c).b.kc(true);
                return;
            case 4:
                ComponentActivity.e eVar = (ComponentActivity.e) this.c;
                Runnable runnable = eVar.c;
                if (runnable != null) {
                    runnable.run();
                    eVar.c = null;
                    return;
                }
                return;
            case 5:
                ((com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) this.c).y();
                return;
            case 6:
                EmptyViewForList emptyViewForList = (EmptyViewForList) this.c;
                int i = EmptyViewForList.i;
                emptyViewForList.b();
                return;
            case 7:
                f.b bVar = (f.b) this.c;
                synchronized (bVar.d) {
                    try {
                        if (bVar.h == null) {
                            return;
                        }
                        try {
                            d6s.b c = bVar.c();
                            int i2 = c.f;
                            if (i2 == 2) {
                                synchronized (bVar.d) {
                                }
                            }
                            if (i2 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                            }
                            try {
                                int i3 = pdp0.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                f.a aVar = bVar.c;
                                Context context = bVar.a;
                                aVar.getClass();
                                d6s.b[] bVarArr = {c};
                                hup0 hup0Var = aup0.a;
                                Trace.beginSection(ndp0.f("TypefaceCompat.createFromFontInfo"));
                                try {
                                    Typeface b = aup0.a.b(context, bVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer d = iup0.d(bVar.a, c.a);
                                    if (d == null || b == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        androidx.emoji2.text.g gVar = new androidx.emoji2.text.g(b, we7.r(d));
                                        Trace.endSection();
                                        synchronized (bVar.d) {
                                            try {
                                                c.i iVar = bVar.h;
                                                if (iVar != null) {
                                                    iVar.b(gVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        bVar.b();
                                        return;
                                    } finally {
                                        int i4 = pdp0.a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (bVar.d) {
                                try {
                                    c.i iVar2 = bVar.h;
                                    if (iVar2 != null) {
                                        iVar2.a(th2);
                                    }
                                    bVar.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 8:
                a();
                return;
            case 9:
                ((LiveVideoDialog) this.c).Yb();
                return;
            case 10:
                ((ScreenshareSender) this.c).c();
                return;
            case 11:
                ((ry3) this.c).invoke();
                return;
            case 12:
                mzl0 mzl0Var = (mzl0) this.c;
                int i5 = StoryBottomViewGroup.P;
                mzl0Var.invoke();
                return;
            case 13:
                ((gzs) this.c).invoke();
                return;
            case 14:
                ((skm0.a) this.c).n();
                return;
            case 15:
                n5p0 n5p0Var = (n5p0) this.c;
                n5p0Var.a.b.removeView(n5p0Var.c);
                n5p0Var.c = null;
                n5p0Var.d = null;
                return;
            case 16:
                ((f7c) this.c).invoke(-1, "No value for meta-data 'com.vk.unitylevelplay.LEVEL_PLAY_APP_ID'");
                return;
            case 17:
                ((vrq0) this.c).q6(null);
                return;
            case 18:
                ((vtt0) this.c).e(true);
                return;
            case 19:
                Wd.e((Wd) this.c);
                return;
            case 20:
                WriteBar.m((WriteBar) this.c);
                return;
            case 21:
                ((com.my.tracker.obfuscated.e0) this.c).e();
                return;
            case 22:
                ((ru.mail.libverify.api.q) this.c).k();
                return;
            default:
                jgz0 jgz0Var = (jgz0) this.c;
                igz0.a aVar2 = jgz0Var.f;
                aVar2.a(jgz0Var.l / 1000.0d);
                long j = jgz0Var.l;
                if (j > 0) {
                    jgz0Var.l = j - 200;
                    return;
                }
                jgz0Var.e.c();
                jgz0Var.b.h(jgz0Var.c);
                aVar2.e();
                aVar2.a.j = true;
                return;
        }
    }
}
