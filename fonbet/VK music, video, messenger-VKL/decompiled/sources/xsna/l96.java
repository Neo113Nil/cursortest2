package xsna;

import android.webkit.WebView;
import com.ironsource.sdk.controller.v;
import com.vk.clips.design.view.camera.widgets.TabsRecycler;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import ru.ok.android.webrtc.MutableMediaSettings;
import ru.ok.android.webrtc.SharedLocalMediaStreamSource;
import ru.ok.android.webrtc.protocol.RtcCommandOnErrorListener;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class l96 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l96(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                TabsRecycler tabsRecycler = (TabsRecycler) this.c;
                bm9 bm9Var = (bm9) ((n96) this.d).getPresenter();
                tabsRecycler.d(bm9Var != null ? bm9Var.V3() : 0, false);
                return;
            case 1:
                kcn kcnVar = (kcn) this.c;
                if (!kcnVar.d.offer((Runnable) this.d)) {
                    throw new IllegalStateException("cannot enqueue any more runnables");
                }
                kcnVar.a();
                return;
            case 2:
                ((SharedLocalMediaStreamSource) this.c).a((MutableMediaSettings) this.d);
                return;
            case 3:
                jzl0 jzl0Var = (jzl0) this.c;
                StoryEntry storyEntry = (StoryEntry) this.d;
                StoriesContainer storiesContainer = jzl0Var.i;
                jzl0Var.a.setActionItems(jzl0Var.g(storyEntry, storiesContainer == null ? null : storiesContainer, jzl0Var.o, jzl0Var.p, false));
                l5m0 l5m0Var = jzl0Var.n;
                if (l5m0Var != null) {
                    nzl0 nzl0Var = jzl0Var.j;
                    l5m0Var.a(storyEntry, 1.0f, nzl0Var != null ? nzl0Var : null);
                    return;
                }
                return;
            case 4:
                WebView webView = (WebView) this.c;
                String str = (String) this.d;
                try {
                    webView.evaluateJavascript(str, null);
                    return;
                } catch (Exception unused) {
                    webView.loadUrl("javascript:".concat(str));
                    return;
                }
            case 5:
                ivy0 ivy0Var = (ivy0) this.c;
                Throwable th = (Throwable) this.d;
                ivy0Var.getClass();
                try {
                    RtcCommandOnErrorListener<Command, Response> rtcCommandOnErrorListener = ivy0Var.d.errorListener;
                    if (rtcCommandOnErrorListener != 0) {
                        rtcCommandOnErrorListener.onRtcCommandError(ivy0Var.c, th);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    ivy0Var.a.reportException("ProtocolInfo", "rtc.command.handle.command.onerror", th2);
                    return;
                }
            case 6:
                yads.io.a((yads.io) this.c, (yads.g9) this.d);
                return;
            default:
                ((v.s) this.c).k((String) this.d);
                return;
        }
    }
}
