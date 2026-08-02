package xsna;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.feed.design.view.newsfeed.reply.ReplyBarPlaceholderView;
import com.vk.newsfeed.impl.feedback.NewsEntryFeedbackCommentsFragment;
import com.vk.newsfeed.impl.postmodal.ModalPostCommonFragment;
import com.vk.newsfeed.impl.postmodal.comments.CommentsOutherFragment;
import com.vk.newsfeed.impl.postmodal.reactions.ModalPostReactionsFragment;
import com.vk.writebar.WriteBar;

/* compiled from: ModalPostCommonFragment.kt */
/* loaded from: classes4.dex */
public final class u030 extends nmk {
    public int a;
    public final /* synthetic */ ModalPostCommonFragment b;
    public final /* synthetic */ ModalBottomSheetBehavior<View> c;

    public u030(ModalPostCommonFragment modalPostCommonFragment, ModalBottomSheetBehavior<View> modalBottomSheetBehavior) {
        this.b = modalPostCommonFragment;
        this.c = modalBottomSheetBehavior;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void a(View view, float f) {
        z3g0 z3g0Var;
        u3g0 u3g0Var;
        int i;
        CoordinatorLayout coordinatorLayout;
        ViewGroup viewGroup;
        ReplyBarPlaceholderView replyBarPlaceholderView;
        int i2 = ModalPostCommonFragment.a0;
        ModalPostCommonFragment modalPostCommonFragment = this.b;
        ((ColorDrawable) modalPostCommonFragment.X.getValue()).setAlpha(swe0.h(l8g.b(Math.min(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.isNaN(f) ? 0.0f : f) + 1), 1.0f) * 0.6f), new k9x(0, 255, 1)));
        if (f < -0.8d) {
            return;
        }
        ModalPostCommonFragment.io(modalPostCommonFragment);
        FragmentImpl lo = modalPostCommonFragment.lo();
        ModalPostReactionsFragment modalPostReactionsFragment = lo instanceof ModalPostReactionsFragment ? (ModalPostReactionsFragment) lo : null;
        if (modalPostReactionsFragment != null) {
            modalPostReactionsFragment.Ri(f);
        }
        CommentsOutherFragment ko = modalPostCommonFragment.ko();
        if (ko == null || (u3g0Var = (z3g0Var = ko.S).d) == null) {
            return;
        }
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            u3g0Var.A(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            CommentsOutherFragment commentsOutherFragment = z3g0Var.b;
            if (commentsOutherFragment == null || (replyBarPlaceholderView = commentsOutherFragment.W) == null) {
                return;
            }
            replyBarPlaceholderView.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        CommentsOutherFragment commentsOutherFragment2 = z3g0Var.b;
        ReplyBarPlaceholderView replyBarPlaceholderView2 = commentsOutherFragment2 != null ? commentsOutherFragment2.W : null;
        if (commentsOutherFragment2 == null || (coordinatorLayout = commentsOutherFragment2.T) == null) {
            i = 0;
        } else {
            int top = coordinatorLayout.getTop();
            CommentsOutherFragment commentsOutherFragment3 = z3g0Var.b;
            i = top + ((commentsOutherFragment3 == null || (viewGroup = commentsOutherFragment3.U) == null) ? 0 : viewGroup.getTop());
        }
        float f2 = i;
        u3g0Var.A(Math.max(f2 - (u3g0Var.e != null ? r9.getTop() : 0), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        if (replyBarPlaceholderView2 != null) {
            replyBarPlaceholderView2.setTranslationY(Math.max(f2 - replyBarPlaceholderView2.getTop(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void b(int i, View view) {
        d(view, i, false);
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void c() {
        u3g0 u3g0Var;
        ModalBottomSheetBehavior<View> modalBottomSheetBehavior = this.c;
        if (modalBottomSheetBehavior.k == 5) {
            modalBottomSheetBehavior.O(4);
        }
        int i = ModalPostCommonFragment.a0;
        CommentsOutherFragment ko = this.b.ko();
        if (ko == null || (u3g0Var = ko.S.d) == null) {
            return;
        }
        jzb0 jzb0Var = new jzb0(-1, Integer.valueOf(iah0.f().widthPixels), Integer.valueOf(iah0.f().widthPixels), Integer.valueOf(iah0.a(360)));
        WriteBar writeBar = u3g0Var.e;
        if (writeBar != null) {
            writeBar.setLongtapStickerPopupWindowSize(jzb0Var);
        }
    }

    public final void d(View view, int i, boolean z) {
        NewsEntryFeedbackCommentsFragment newsEntryFeedbackCommentsFragment;
        mdg mdgVar;
        int i2;
        if (i == 1 || i == 2) {
            this.a = i;
            return;
        }
        if (z || (i2 = this.a) == 2 || i2 == 1) {
            int i3 = ModalPostCommonFragment.a0;
            ModalPostCommonFragment modalPostCommonFragment = this.b;
            CommentsOutherFragment ko = modalPostCommonFragment.ko();
            if (i == 3) {
                a(view, 1.0f);
                if (ko != null) {
                    ko.d0 = true;
                }
                if (ko != null) {
                    ko.Ym();
                }
                if (ko != null) {
                    ko.jo();
                }
            } else if (i == 4 || i == 5) {
                if (i == 5 || this.c.j) {
                    modalPostCommonFragment.finish();
                    modalPostCommonFragment.tn();
                    if (ko != null && (newsEntryFeedbackCommentsFragment = ko.Z) != null && (mdgVar = newsEntryFeedbackCommentsFragment.S) != null) {
                        mdgVar.Q7();
                    }
                } else {
                    a(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    if (ko != null) {
                        ko.d0 = true;
                    }
                    if (ko != null) {
                        ko.Ym();
                    }
                    if (ko != null) {
                        ko.jo();
                    }
                }
            } else if (i == 6) {
                if (ko != null) {
                    ko.d0 = true;
                }
                if (ko != null) {
                    ko.Ym();
                }
                if (ko != null) {
                    ko.jo();
                }
            }
            this.a = i;
        }
    }
}
