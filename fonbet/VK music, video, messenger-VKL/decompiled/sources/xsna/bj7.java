package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.Attachment;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: BoardTopicViewFragment.kt */
/* loaded from: classes6.dex */
public final class bj7 implements hx2<BaseOkResponseDto> {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ BoardTopicViewFragment c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;

    public bj7(boolean z, BoardTopicViewFragment boardTopicViewFragment, int i, String str, List<? extends Attachment> list) {
        this.b = z;
        this.c = boardTopicViewFragment;
        this.d = i;
        this.e = str;
        this.f = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // xsna.hx2
    public final void b(BaseOkResponseDto baseOkResponseDto) {
        boolean z = this.b;
        final ?? r1 = this.f;
        final String str = this.e;
        final int i = this.d;
        final BoardTopicViewFragment boardTopicViewFragment = this.c;
        if (z) {
            zi7 zi7Var = new zi7(boardTopicViewFragment, i, 0);
            gzs gzsVar = new gzs() { // from class: xsna.aj7
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
                @Override // xsna.gzs
                public final Object invoke() {
                    Pattern pattern = BoardTopicViewFragment.H0;
                    BoardTopicViewFragment boardTopicViewFragment2 = BoardTopicViewFragment.this;
                    boardTopicViewFragment2.Do(i, str, r1);
                    boardTopicViewFragment2.vo();
                    boardTopicViewFragment2.B0 = false;
                    return s3q0.a;
                }
            };
            Pattern pattern = BoardTopicViewFragment.H0;
            boardTopicViewFragment.po(i, gzsVar, zi7Var);
            return;
        }
        Pattern pattern2 = BoardTopicViewFragment.H0;
        boardTopicViewFragment.Do(i, str, r1);
        boardTopicViewFragment.vo();
        boardTopicViewFragment.B0 = false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hx2
    public final void e(VKApiExecutionException vKApiExecutionException) {
        BoardTopicViewFragment boardTopicViewFragment = this.c;
        if (!((o2i) boardTopicViewFragment.h0.getValue()).d(vKApiExecutionException, true)) {
            h03.b(vKApiExecutionException);
        }
        boardTopicViewFragment.B0 = false;
    }
}
