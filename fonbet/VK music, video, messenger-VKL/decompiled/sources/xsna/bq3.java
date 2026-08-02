package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.articles.a;
import com.vk.bridges.ImageViewer;
import com.vk.core.serialize.Serializer;
import com.vk.dto.articles.Article;
import com.vk.dto.articles.ArticleTts;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.article.ArticleTtsInfo;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import kotlin.Result;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ArticleWebInterfaceImpl.kt */
/* loaded from: classes15.dex */
public final class bq3 extends h4y implements zp3 {
    public final com.vk.articles.a f;
    public ImageViewer.c<?> g;

    public bq3(com.vk.articles.a aVar) {
        this.f = aVar;
    }

    @Override // xsna.zp3
    public final void articleAnalyticsTrackEvent(String str) {
        if (str == null) {
            return;
        }
        qro0.c(new zg(str, 3));
    }

    @Override // xsna.zp3
    public final void articleBookmarked(String str) {
        if (str == null) {
            return;
        }
        qro0.c(new s(2, this, new JSONObject(str).getJSONObject("article")));
    }

    @Override // xsna.zp3
    public final void articlePhotoView(String str) {
        if (str == null) {
            return;
        }
        qro0.c(new ks2(1, str, this));
    }

    @Override // xsna.zp3
    public final void articleReady(String str) {
        qro0.c(new q(this, 3));
    }

    @Override // xsna.zp3
    public final void articleTtsApproxGenerationTime(String str) {
        Object failure;
        if (str != null) {
            try {
                failure = new JSONObject(str);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            JSONObject jSONObject = (JSONObject) failure;
            if (jSONObject == null) {
                return;
            }
            qro0.c(new m4(this, jSONObject.getLong("approx_generation_time")));
        }
    }

    @Override // xsna.zp3
    public final void articleTtsError(String str) {
        Object failure;
        Object D;
        if (str != null) {
            try {
                D = f370.D(new JSONObject(str), "error_message");
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
        } else {
            D = null;
        }
        failure = D;
        qro0.c(new zy(this, (String) (failure instanceof Result.Failure ? null : failure)));
    }

    @Override // xsna.zp3
    public final void articleTtsReady(String str) {
        Object failure;
        if (str == null) {
            articleTtsError(null);
            return;
        }
        try {
            Serializer.c<ArticleTts> cVar = ArticleTts.CREATOR;
            failure = ArticleTts.a.a(new JSONObject(str));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            articleTtsError(null);
            return;
        }
        ArticleTts articleTts = (ArticleTts) failure;
        ArticleTtsInfo articleTtsInfo = articleTts.c;
        qro0.c(new eu1(this, new ArticleTts(articleTts.b, new ArticleTtsInfo(articleTtsInfo.b, articleTtsInfo.c, Uri.parse(articleTtsInfo.d).buildUpon().scheme(HttpRequest.DEFAULT_SCHEME).authority(a0a.d).build().toString(), articleTtsInfo.e, articleTtsInfo.f))));
    }

    @Override // xsna.zp3
    public final void articleUpdate(String str) {
        if (str == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        qro0.c(new aq3(this, jSONObject.getJSONObject("article"), jSONObject, 0));
    }

    @Override // com.vk.superapp.base.js.bridge.b
    public final WebView r() {
        return this.f;
    }

    public final Article s(JSONObject jSONObject) {
        try {
            return vj90.a(jSONObject, new Owner(new UserId(jSONObject.getLong("owner_id")), jSONObject.getString("owner_name"), jSONObject.optString("owner_photo"), null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194296, null));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* compiled from: ArticleWebInterfaceImpl.kt */
    public static final class a implements ImageViewer.a {
        public a() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final View c(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect d(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void e(int i) {
            com.vk.articles.a aVar = bq3.this.f;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("index", i);
            s3q0 s3q0Var = s3q0.a;
            aVar.f("articlePhotoCarouselPositionChanged", jSONObject);
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Integer f() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect g() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean h() {
            return false;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String i() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Context j() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String m(int i, int i2) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
            bq3 bq3Var = bq3.this;
            bq3Var.g = null;
            a.InterfaceC0377a callback = bq3Var.f.getCallback();
            if (callback != null) {
                callback.wl();
            }
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final float[] q(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final ImageViewer.d r() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean s() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final ImageViewer.ControlsOptions u() {
            return ImageViewer.ControlsOptions.a(super.u(), false, null, false, 254);
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void a() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void o() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void p() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void b(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void n(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void t(Photo photo) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void v(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, boolean z) {
        }
    }
}
