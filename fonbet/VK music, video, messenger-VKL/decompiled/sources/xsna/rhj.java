package xsna;

import android.content.res.Configuration;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Content.kt */
@b6l(c = "com.vk.clips.playlists.playlist_ui.ui.ContentKt$ClipsPlaylistUiView$2$1", f = "Content.kt", l = {103, 105}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class rhj extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Configuration $configuration;
    final /* synthetic */ Integer $highlightedItemIndex;
    final /* synthetic */ zzf0 $state;
    int I$0;
    int I$1;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhj(Integer num, zzf0 zzf0Var, Configuration configuration, spj<? super rhj> spjVar) {
        super(2, spjVar);
        this.$highlightedItemIndex = num;
        this.$state = zzf0Var;
        this.$configuration = configuration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new rhj(this.$highlightedItemIndex, this.$state, this.$configuration, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((rhj) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        if (xsna.fdi.K(r8.$state.o, r4 - r9, r8) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
    
        if (r9.k(r1, r2, r8) == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.a.a(obj);
                return s3q0.a;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            s3q0 s3q0Var = s3q0.a;
            return s3q0.a;
        }
        kotlin.a.a(obj);
        if (this.$highlightedItemIndex != null) {
            List<xuy> f = this.$state.o.j().f();
            Integer num = this.$highlightedItemIndex;
            Iterator<T> it = f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                int index = ((xuy) obj2).getIndex();
                if (num != null && index == num.intValue()) {
                    break;
                }
            }
            xuy xuyVar = (xuy) obj2;
            if (xuyVar != null) {
                int h = this.$state.o.j().h() / 2;
                int size = (xuyVar.getSize() / 2) + xuyVar.getOffset();
                this.L$0 = null;
                this.I$0 = h;
                this.I$1 = size;
                this.label = 1;
            } else {
                xvy xvyVar = this.$state.o;
                int intValue = this.$highlightedItemIndex.intValue();
                int i2 = -(this.$configuration.screenHeightDp / 2);
                this.L$0 = null;
                this.label = 2;
            }
            return coroutineSingletons;
        }
        return s3q0.a;
    }
}
