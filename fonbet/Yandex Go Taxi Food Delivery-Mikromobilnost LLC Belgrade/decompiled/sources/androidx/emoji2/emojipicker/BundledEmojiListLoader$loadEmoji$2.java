package androidx.emoji2.emojipicker;

import android.content.Context;
import android.content.res.TypedArray;
import defpackage.c6w;
import defpackage.d6w;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.nyq;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.y6i0;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Luu6;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.emoji2.emojipicker.BundledEmojiListLoader$loadEmoji$2", f = "BundledEmojiListLoader.kt", l = {HProv.PP_BIO_STATISTICA_LEN}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class BundledEmojiListLoader$loadEmoji$2 extends SuspendLambda implements wls {
    final /* synthetic */ int[] $categoryHeaderIconIds;
    final /* synthetic */ String[] $categoryNames;
    final /* synthetic */ Context $context;
    final /* synthetic */ nyq $emojiFileCache;
    final /* synthetic */ TypedArray $ta;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundledEmojiListLoader$loadEmoji$2(TypedArray typedArray, nyq nyqVar, Context context, int[] iArr, String[] strArr, Continuation continuation) {
        super(2, continuation);
        this.$ta = typedArray;
        this.$emojiFileCache = nyqVar;
        this.$context = context;
        this.$categoryHeaderIconIds = iArr;
        this.$categoryNames = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BundledEmojiListLoader$loadEmoji$2 bundledEmojiListLoader$loadEmoji$2 = new BundledEmojiListLoader$loadEmoji$2(this.$ta, this.$emojiFileCache, this.$context, this.$categoryHeaderIconIds, this.$categoryNames, continuation);
        bundledEmojiListLoader$loadEmoji$2.L$0 = obj;
        return bundledEmojiListLoader$loadEmoji$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BundledEmojiListLoader$loadEmoji$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tse tseVar = (tse) this.L$0;
        d6w n = y6i0.n(0, this.$ta.length());
        nyq nyqVar = this.$emojiFileCache;
        Context context = this.$context;
        TypedArray typedArray = this.$ta;
        int[] iArr = this.$categoryHeaderIconIds;
        String[] strArr = this.$categoryNames;
        ArrayList arrayList = new ArrayList(tcc.n(n, 10));
        c6w it = n.iterator();
        while (it.c) {
            arrayList.add(tje.h(tseVar, null, null, new BundledEmojiListLoader$loadEmoji$2$1$1(nyqVar, it.nextInt(), context, typedArray, iArr, strArr, null), 3));
        }
        this.label = 1;
        Object b = kotlinx.coroutines.a.b(arrayList, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
