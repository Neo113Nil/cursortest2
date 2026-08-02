package xsna;

import com.vk.music.player.domain.state.LyricsScrollMode;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LyricsPage.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.LyricsPageKt$ContentLyrics$2$3$1", f = "LyricsPage.kt", l = {191, 193}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class hb00 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $currentLineIndex;
    final /* synthetic */ List $lines;
    final /* synthetic */ LyricsScrollMode $scrollMode;
    final /* synthetic */ xvy $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb00(LyricsScrollMode lyricsScrollMode, int i, xvy xvyVar, List list, spj spjVar) {
        super(2, spjVar);
        this.$scrollMode = lyricsScrollMode;
        this.$currentLineIndex = i;
        this.$scrollState = xvyVar;
        this.$lines = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new hb00(this.$scrollMode, this.$currentLineIndex, this.$scrollState, this.$lines, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((hb00) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r1.f(r6, r5) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        if (r6.f(0, r5) == r0) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        na00 na00Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$scrollMode == LyricsScrollMode.AUTO) {
                int i2 = this.$currentLineIndex;
                if (i2 >= 0) {
                    xvy xvyVar = this.$scrollState;
                    this.label = 1;
                    fh9 fh9Var = xvy.y;
                } else {
                    List list = this.$lines;
                    float f = kb00.a;
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            na00Var = 0;
                            break;
                        }
                        na00Var = it.next();
                        if (((ja00) na00Var) instanceof na00) {
                            break;
                        }
                    }
                    na00 na00Var2 = na00Var instanceof na00 ? na00Var : null;
                    if (na00Var2 != null && !na00Var2.b) {
                        xvy xvyVar2 = this.$scrollState;
                        this.label = 2;
                        fh9 fh9Var2 = xvy.y;
                    }
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
