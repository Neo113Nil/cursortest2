package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.mentions.MentionProfileVO;
import com.vk.newsfeed.posting.mentions.PostingMentionLoadingState;
import com.vk.newsfeed.posting.mentions.PostingMentionState;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.enc0;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class unc0 extends FunctionReferenceImpl implements izs<PostingMentionState, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(PostingMentionState postingMentionState) {
        PostingMentionState postingMentionState2 = postingMentionState;
        enc0 enc0Var = (enc0) this.receiver;
        RecyclerView recyclerView = enc0Var.L;
        l320 l320Var = enc0Var.a0;
        PostingMentionLoadingState postingMentionLoadingState = postingMentionState2.b;
        List<MentionProfileVO> list = postingMentionState2.c;
        boolean z = postingMentionLoadingState != PostingMentionLoadingState.EMPTY;
        bwt0.p0(enc0Var.F, z);
        bwt0.p0(enc0Var.G, z);
        if (z) {
            ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior = enc0Var.M;
            if (modalBottomSheetBehavior != null) {
                modalBottomSheetBehavior.O(4);
            }
            m320 m320Var = enc0Var.N;
            if (m320Var != null) {
                m320Var.b = enc0.r0;
            }
            ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior2 = enc0Var.M;
            if (modalBottomSheetBehavior2 != null) {
                modalBottomSheetBehavior2.D = false;
            }
            int i = enc0.a.$EnumSwitchMapping$4[postingMentionLoadingState.ordinal()];
            if (i == 1) {
                enc0.e(enc0Var, 5);
            } else if (i == 2) {
                enc0.e(enc0Var, 6);
            } else if (i == 3) {
                enc0.e(enc0Var, 3);
                l320Var.e = enc0Var.i0;
                ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior3 = enc0Var.M;
                if (modalBottomSheetBehavior3 != null) {
                    modalBottomSheetBehavior3.D = true;
                }
                l320Var.setItems(list);
                recyclerView.scrollToPosition(0);
            } else if (i == 4) {
                enc0.e(enc0Var, 3);
                l320Var.e = null;
                m320 m320Var2 = enc0Var.N;
                if (m320Var2 != null) {
                    m320Var2.b = enc0.s0;
                }
                l320Var.setItems(list);
                recyclerView.scrollToPosition(0);
            }
        }
        return s3q0.a;
    }
}
