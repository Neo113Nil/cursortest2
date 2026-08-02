package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: PostingPostResponseHelper.kt */
/* loaded from: classes4.dex */
public final class bkc0 {
    public final ikc0 a;
    public final PostingFragment b;

    public bkc0(ikc0 ikc0Var, PostingFragment postingFragment) {
        this.a = ikc0Var;
        this.b = postingFragment;
    }

    public final void a(Throwable th) {
        VKApiExecutionException vKApiExecutionException;
        String message;
        List<VKApiExecutionException> v;
        boolean z = th instanceof VKApiExecutionException;
        PostingFragment postingFragment = this.b;
        if (!z && !(th.getCause() instanceof VKApiExecutionException)) {
            postingFragment.mo(R.string.error);
            return;
        }
        VKApiExecutionException vKApiExecutionException2 = z ? (VKApiExecutionException) th : null;
        if (vKApiExecutionException2 == null || (v = vKApiExecutionException2.v()) == null || (vKApiExecutionException = v.get(0)) == null) {
            Throwable cause = th.getCause();
            vKApiExecutionException = cause instanceof VKApiExecutionException ? (VKApiExecutionException) cause : null;
        }
        if (vKApiExecutionException == null) {
            h03.b(th);
            return;
        }
        String message2 = vKApiExecutionException.getMessage();
        ikc0 ikc0Var = this.a;
        if (message2 == null || !drm0.D(message2, "already scheduled for this time", false)) {
            String message3 = vKApiExecutionException.getMessage();
            if (message3 == null || !drm0.D(message3, "posts on a day", false)) {
                String message4 = vKApiExecutionException.getMessage();
                if (message4 == null || !drm0.D(message4, "schedule more than", false)) {
                    String message5 = vKApiExecutionException.getMessage();
                    if (message5 == null || !drm0.D(message5, "access to the wall is closed", false)) {
                        if (vKApiExecutionException.s() == 100 && (message = vKApiExecutionException.getMessage()) != null && drm0.D(message, "publish_date", false)) {
                            postingFragment.mo(R.string.invalid_date);
                        } else {
                            L.i(vKApiExecutionException);
                            postingFragment.lo(j03.d(postingFragment.getActivity(), vKApiExecutionException));
                        }
                    } else if (ikc0Var.C0) {
                        postingFragment.mo(R.string.newpost_error_community_forbid_suggestion);
                    } else {
                        postingFragment.mo(R.string.posting_error_wall_access);
                    }
                } else {
                    postingFragment.mo(R.string.postpone_error_too_many);
                }
            } else {
                postingFragment.mo(R.string.postpone_error_per_day);
            }
        } else {
            postingFragment.mo(R.string.postpone_error_already_exists);
        }
        wxu wxuVar = ikc0Var.y;
        (wxuVar != null ? wxuVar : null).e0(true);
    }
}
