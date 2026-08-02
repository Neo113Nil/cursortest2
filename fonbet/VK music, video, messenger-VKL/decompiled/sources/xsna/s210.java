package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.widget.EditText;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.ecomm.reviews.impl.replies.presentation.view.RepliesView;
import com.vk.writebar.WriteBar;
import kotlin.Pair;
import xsna.h2g0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class s210 implements iyp {
    public final /* synthetic */ MarketItemReviewRepliesFragment b;

    public /* synthetic */ s210(MarketItemReviewRepliesFragment marketItemReviewRepliesFragment) {
        this.b = marketItemReviewRepliesFragment;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.iyp
    public final void a(pk50 pk50Var) {
        h2g0 h2g0Var = (h2g0) pk50Var;
        boolean z = h2g0Var instanceof i2g0;
        MarketItemReviewRepliesFragment marketItemReviewRepliesFragment = this.b;
        if (z) {
            ((k2g0) marketItemReviewRepliesFragment.Q.getValue()).a((i2g0) h2g0Var);
            return;
        }
        mfy mfyVar = marketItemReviewRepliesFragment.X;
        if (h2g0Var instanceof h2g0.b) {
            marketItemReviewRepliesFragment.Mf(-1, new Intent().putExtra("market_item_review_replies_extra", yfb.b(new Pair("reply_list_was_changed_extra", Boolean.valueOf(((h2g0.b) h2g0Var).a)))));
            return;
        }
        if (h2g0Var instanceof h2g0.a) {
            String str = ((h2g0.a) h2g0Var).a;
            if (str.length() == 0) {
                return;
            }
            Context mo2getContext = marketItemReviewRepliesFragment.mo2getContext();
            ((ClipboardManager) (mo2getContext != null ? mo2getContext.getSystemService("clipboard") : null)).setPrimaryClip(ClipData.newPlainText(str, str));
            return;
        }
        if (h2g0Var instanceof h2g0.c) {
            WriteBar writeBar = marketItemReviewRepliesFragment.S;
            EditText input = writeBar != null ? writeBar.getInput() : null;
            mfyVar.getClass();
            RepliesView repliesView = marketItemReviewRepliesFragment.T;
            if (repliesView != null) {
                repliesView.e(((h2g0.c) h2g0Var).a);
            }
            s3q0 s3q0Var = s3q0.a;
            if (mfyVar.a || input == null) {
                return;
            }
            input.post(new rc4(input, 8));
            return;
        }
        if (h2g0Var instanceof h2g0.d) {
            WriteBar writeBar2 = marketItemReviewRepliesFragment.S;
            EditText input2 = writeBar2 != null ? writeBar2.getInput() : null;
            mfyVar.getClass();
            RepliesView repliesView2 = marketItemReviewRepliesFragment.T;
            if (repliesView2 != null) {
                repliesView2.f();
            }
            s3q0 s3q0Var2 = s3q0.a;
            if (mfyVar.a || input2 == null) {
                return;
            }
            input2.post(new rc4(input2, 8));
            return;
        }
        if (!(h2g0Var instanceof h2g0.e)) {
            if (h2g0Var instanceof h2g0.f) {
                cvk.w(((h2g0.f) h2g0Var).a.a(marketItemReviewRepliesFragment.requireContext()), false);
                return;
            }
            return;
        }
        WriteBar writeBar3 = marketItemReviewRepliesFragment.S;
        if (writeBar3 != null) {
            writeBar3.setText(((h2g0.e) h2g0Var).a);
        }
        e2g0 e2g0Var = marketItemReviewRepliesFragment.Y;
        if (e2g0Var != null) {
            e2g0Var.j(((h2g0.e) h2g0Var).b);
        }
    }
}
