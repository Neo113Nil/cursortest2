package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.common.links.LaunchContext;
import com.vk.core.exceptions.DisposableException;
import com.vk.dto.clips.exceptions.ClipNotFoundException;
import com.vk.dto.newsfeed.exceptions.PostNotFoundException;
import com.vk.stories.exceptions.StoryNotAccessibleException;
import com.vkontakte.android.fragments.WebViewFragment;

/* compiled from: OpenCallbackFactory.kt */
/* loaded from: classes17.dex */
public final class zp80 {

    /* compiled from: OpenCallbackFactory.kt */
    public static final class c extends b {
        public final Context e;
        public final Uri f;

        public c(Context context, LaunchContext launchContext, Uri uri) {
            super(context, launchContext, uri);
            this.e = context;
            this.f = uri;
        }

        @Override // xsna.zp80.b, xsna.yp80
        public final void U() {
            Uri uri = this.f;
            WebViewFragment.c cVar = new WebViewFragment.c(naz.a(uri.toString()));
            cVar.A();
            cVar.F(false, false);
            if (j5g.P(rl3.y0(new String[]{"/terms", "/privacy"}), uri.getPath())) {
                cVar.z();
            }
            cVar.k(this.e);
        }
    }

    public static final b a(Context context, String str) {
        Uri parse = Uri.parse(str);
        LaunchContext launchContext = new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108863);
        bpn0 bpn0Var = jaz.a;
        Uri parse2 = Uri.parse(naz.a(jaz.a(parse.toString())));
        return naz.s(parse2) ? new c(context, launchContext, parse2) : new b(context, launchContext, parse);
    }

    /* compiled from: OpenCallbackFactory.kt */
    public static final class a implements yp80 {
        @Override // xsna.yp80
        public final void onError(Throwable th) {
            h03.b(th);
        }

        @Override // xsna.yp80
        public final void I() {
        }

        @Override // xsna.yp80
        public final void U() {
        }

        @Override // xsna.yp80
        public final void onSuccess() {
        }

        @Override // xsna.yp80
        public final void B0(boolean z) {
        }
    }

    /* compiled from: OpenCallbackFactory.kt */
    public static class b implements yp80 {
        public final Context b;
        public final LaunchContext c;
        public final Uri d;

        public b(Context context, LaunchContext launchContext, Uri uri) {
            this.b = context;
            this.c = launchContext;
            this.d = uri;
        }

        @Override // xsna.yp80
        public void U() {
            xwk.d().getBrowser().i(this.b, this.d, this.c, null);
        }

        @Override // xsna.yp80
        public final void onError(Throwable th) {
            if (th instanceof DisposableException) {
                return;
            }
            if (((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).J()) || h03.a(th)) {
                h03.b(th);
            } else {
                if ((th instanceof PostNotFoundException) || (th instanceof ClipNotFoundException) || (th instanceof StoryNotAccessibleException)) {
                    return;
                }
                xwk.d().getBrowser().i(this.b, this.d, this.c, null);
            }
        }

        @Override // xsna.yp80
        public final void I() {
        }

        @Override // xsna.yp80
        public final void onSuccess() {
        }

        @Override // xsna.yp80
        public final void B0(boolean z) {
        }
    }
}
