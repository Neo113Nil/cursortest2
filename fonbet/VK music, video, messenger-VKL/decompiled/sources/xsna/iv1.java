package xsna;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.vk.catalog2.feature.music.holders.artist.MusicPagePhoneHeaderVh;
import com.vk.core.ui.CircularProgressView;
import com.vk.feed.tool.view.newsfeed.tab.WrapContentAutoSizingTextView;
import com.vk.feed.tool.view.posting.photoviewer.PhotoViewerLayout;
import com.vk.newsfeed.impl.feed.views.FeedRecyclerPaginatedView;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;
import com.vk.story.viewer.impl.presentation.stories.b;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import one.video.controls.views.preview.VideoSeekPreviewImage;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import org.json.JSONObject;
import ru.mail.libverify.controls.VerificationController;
import ru.ok.proto.okmp.OkmpPublisher;
import xsna.phz0;
import xsna.wl80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class iv1 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iv1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        ProgressBar progressBar = null;
        r3 = null;
        Activity activity = null;
        switch (this.b) {
            case 0:
                jv1 jv1Var = (jv1) this.c;
                jv1Var.a();
                View view = jv1Var.a;
                view.setVisibility(0);
                view.setAlpha(1.0f);
                break;
            case 1:
                ((AutoSuggestStickersPopupWindow) this.c).u();
                break;
            case 2:
                ((com.vk.channels.impl.list.f) this.c).R();
                break;
            case 3:
                com.vk.clips.editor.templates.impl.player.a aVar = com.vk.clips.editor.templates.impl.player.a.this;
                aVar.I = aVar.getCurrentPosition();
                Surface surface = aVar.w;
                if (surface != null) {
                    surface.release();
                    aVar.w = null;
                }
                aVar.v(new o93(aVar, 7));
                aVar.H = false;
                break;
            case 4:
                v3r v3rVar = (v3r) this.c;
                int i = FeedRecyclerPaginatedView.U;
                dhr0.a.getClass();
                dhr0.D().getClass();
                com.vk.core.ui.themes.a.b(v3rVar);
                break;
            case 5:
                try {
                    ProgressBar progressBar2 = ((com.vk.folders.impl.configure.h) this.c).k;
                    if (progressBar2 != null) {
                        progressBar = progressBar2;
                    }
                    bwt0.p0(progressBar, false);
                    s3q0 s3q0Var = s3q0.a;
                    break;
                } catch (Throwable unused) {
                    return;
                }
            case 6:
                com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar = (com.vk.newsfeed.posting.market_picker.presentation.base.view.e) this.c;
                PhotoViewerLayout photoViewerLayout = eVar.q;
                eVar.e.e.dispose();
                Integer num = eVar.f;
                if (num != null) {
                    int intValue = num.intValue();
                    Activity d = com.vk.newsfeed.posting.market_picker.presentation.base.view.e.d(eVar.c);
                    if (d != null) {
                        d.setRequestedOrientation(intValue);
                    }
                }
                SparseArray<com.vk.newsfeed.posting.market_picker.presentation.base.view.d> sparseArray = eVar.l.h;
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    com.vk.newsfeed.posting.market_picker.presentation.base.view.d valueAt = sparseArray.valueAt(i2);
                    valueAt.a.removeCallbacks(valueAt.i);
                }
                if (photoViewerLayout.isAttachedToWindow()) {
                    eVar.p.removeViewImmediate(photoViewerLayout);
                }
                eVar.h = null;
                break;
            case 7:
                CollapsingToolbarLayout collapsingToolbarLayout = ((MusicPagePhoneHeaderVh) this.c).d;
                if (collapsingToolbarLayout != null && (context = collapsingToolbarLayout.getContext()) != null) {
                    activity = e3m.h(context);
                }
                if (activity != null) {
                    mnh0.w(activity.getWindow().getDecorView(), !r0.f);
                    break;
                }
                break;
            case 8:
                ((kbe) this.c).invoke();
                break;
            case 9:
                ((OkmpPublisher) this.c).lambda$abort$3();
                break;
            case 10:
                wl80.a aVar2 = (wl80.a) this.c;
                xsw xswVar = new xsw(aVar2, 18);
                int i3 = wl80.b0;
                BaseVideoPlayer.c(xswVar, null);
                if (!aVar2.o()) {
                    int i4 = wl80.c.a[wl80.this.G.ordinal()];
                    if (i4 == 2 || i4 == 3) {
                        wl80 wl80Var = wl80.this;
                        wl80Var.F = null;
                        wl80Var.C0(OneVideoPlayer.State.ENDED);
                        break;
                    }
                }
                break;
            case 11:
                com.vk.story.viewer.impl.presentation.stories.b bVar = (com.vk.story.viewer.impl.presentation.stories.b) this.c;
                if (bVar.I()) {
                    bVar.t0 = Boolean.FALSE;
                    bVar.z0 = true;
                    b.m mVar = bVar.S;
                    mVar.c = true;
                    mVar.notifyDataSetChanged();
                    mVar.c = false;
                    bVar.z0 = false;
                    bVar.O.f = false;
                    bVar.F();
                    qo6 currentStoryView = bVar.getCurrentStoryView();
                    if (currentStoryView != null) {
                        currentStoryView.y0();
                        break;
                    }
                }
                break;
            case 12:
                ikn0 ikn0Var = (ikn0) this.c;
                w5d0 w5d0Var = ikn0Var.f;
                if (w5d0Var != null) {
                    w5d0Var.a();
                    ikn0Var.f = null;
                    break;
                }
                break;
            case 13:
                ((VerificationController) this.c).lambda$sendCallInClickStats$1();
                break;
            case 14:
                CircularProgressView circularProgressView = (CircularProgressView) this.c;
                circularProgressView.setIndeterminate(true);
                circularProgressView.b();
                break;
            case 15:
                VideoSeekPreviewImage.a aVar3 = ((VideoSeekPreviewImage) this.c).o;
                if (aVar3 != null) {
                    aVar3.c();
                    break;
                }
                break;
            case 16:
                ((ggu0) this.c).f();
                break;
            case 17:
                WrapContentAutoSizingTextView.setText$lambda$0((WrapContentAutoSizingTextView) this.c);
                break;
            case 18:
                String str = (String) this.c;
                if (TextUtils.isEmpty(str)) {
                    gu8.c(null, "WebFormVKBridgeParser: json is null, parsing requestId has been failed");
                    break;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has(CommonUrlParts.REQUEST_ID)) {
                            jSONObject.optInt(CommonUrlParts.REQUEST_ID);
                            break;
                        }
                    } catch (Throwable unused2) {
                        gu8.c(null, "WebFormVKBridgeParser: json is null, parsing requestId has been failed");
                        return;
                    }
                }
                break;
            default:
                phz0 phz0Var = (phz0) this.c;
                phz0.a aVar4 = phz0Var.n;
                if (aVar4 != phz0.a.a) {
                    if (aVar4 == phz0.a.b) {
                        phz0Var.o -= 200;
                    }
                    if (phz0Var.o > 0) {
                        phz0Var.n();
                        break;
                    }
                }
                phz0Var.m();
                break;
        }
    }

    public /* synthetic */ iv1(waz0 waz0Var, String str) {
        this.b = 18;
        this.c = str;
    }
}
