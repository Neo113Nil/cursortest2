package xsna;

import android.net.Uri;
import android.webkit.WebView;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.embedded_players.ui.fragments.VideoEmbedFragment;
import kotlin.text.Regex;
import kotlin.text.RegexOption;

/* compiled from: VideoEmbedFragment.kt */
/* loaded from: classes14.dex */
public final class vis0 extends dir0 {
    public final /* synthetic */ VideoEmbedFragment d;
    public final /* synthetic */ String e;

    public vis0(VideoEmbedFragment videoEmbedFragment, String str) {
        this.d = videoEmbedFragment;
        this.e = str;
    }

    @Override // xsna.dir0, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        VideoEmbedFragment videoEmbedFragment = this.d;
        d3m.e(videoEmbedFragment.T, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        videoEmbedFragment.i0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (xsna.brm0.v(r2, "." + r3, false) != false) goto L24;
     */
    @Override // xsna.dir0, android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        VideoFile videoFile;
        String str2;
        String authority;
        VideoEmbedFragment videoEmbedFragment = this.d;
        if (str != null && ((videoFile = videoEmbedFragment.c0) == null || !videoFile.w8())) {
            Regex regex = new Regex(".*vk.*live.*", RegexOption.IGNORE_CASE);
            if (videoFile == null || (str2 = videoFile.getPlatform()) == null) {
                str2 = "";
            }
            if (!regex.f(str2) && (authority = Uri.parse(str).getAuthority()) != null) {
                String str3 = this.e;
                if (!authority.equals(str3)) {
                }
                if (webView != null) {
                    webView.loadUrl(str);
                }
                return true;
            }
        }
        xwk.d().e().k(videoEmbedFragment.kn(), str);
        return true;
    }
}
