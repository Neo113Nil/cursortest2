package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;
import com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment;
import com.vk.video.channel.common.AuthorCommentsSelectorArguments;
import kotlin.Lazy;

/* compiled from: BottomSheetCommentsFragmentPresenter.kt */
/* loaded from: classes4.dex */
public final class t78 extends com.vk.newsfeed.impl.presenters.b {
    public final Object b0;

    public t78(BottomSheetCommentsFragment bottomSheetCommentsFragment, mzp0 mzp0Var, Lazy lazy) {
        super(bottomSheetCommentsFragment, mzp0Var);
        this.b0 = lazy;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.impl.presenters.b, xsna.c9c0
    public final void e4(String str) {
        boolean z;
        ?? r0;
        int i = ify.a;
        ify.e(ify.c);
        Context context = this.b.getContext();
        if (context != null) {
            while (true) {
                z = context instanceof FragmentActivity;
                if (z || !(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (((FragmentActivity) (z ? (Activity) context : null)) == null || (r0 = this.b0) == 0 || ((xas0) r0.getValue()) == null) {
                return;
            }
            new AuthorCommentsSelectorArguments(str);
        }
    }
}
