package androidx.emoji2.emojipicker;

import android.content.Context;
import android.content.res.TypedArray;
import defpackage.cy11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.nyq;
import defpackage.p61;
import defpackage.tse;
import defpackage.uu6;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Luu6;", "<anonymous>", "(Ltse;)Luu6;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.emoji2.emojipicker.BundledEmojiListLoader$loadEmoji$2$1$1", f = "BundledEmojiListLoader.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class BundledEmojiListLoader$loadEmoji$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ int[] $categoryHeaderIconIds;
    final /* synthetic */ String[] $categoryNames;
    final /* synthetic */ Context $context;
    final /* synthetic */ nyq $emojiFileCache;
    final /* synthetic */ int $it;
    final /* synthetic */ TypedArray $ta;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundledEmojiListLoader$loadEmoji$2$1$1(nyq nyqVar, int i, Context context, TypedArray typedArray, int[] iArr, String[] strArr, Continuation continuation) {
        super(2, continuation);
        this.$emojiFileCache = nyqVar;
        this.$it = i;
        this.$context = context;
        this.$ta = typedArray;
        this.$categoryHeaderIconIds = iArr;
        this.$categoryNames = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BundledEmojiListLoader$loadEmoji$2$1$1(this.$emojiFileCache, this.$it, this.$context, this.$ta, this.$categoryHeaderIconIds, this.$categoryNames, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BundledEmojiListLoader$loadEmoji$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        List a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        nyq nyqVar = this.$emojiFileCache;
        int i = this.$it;
        StringBuilder sb = new StringBuilder("emoji.v1.");
        EmojiPickerView.Companion.getClass();
        z = EmojiPickerView.emojiCompatLoaded;
        sb.append(z ? 1 : 0);
        sb.append(Extension.DOT_CHAR);
        sb.append(i);
        sb.append(Extension.DOT_CHAR);
        sb.append(cy11.a("🥱") ? 1 : 0);
        String sb2 = sb.toString();
        p61 p61Var = new p61(this.$context, this.$ta, this.$it, 5);
        synchronized (nyqVar.c) {
            try {
                File file = new File(nyqVar.a, nyqVar.b);
                if (!file.exists()) {
                    File[] listFiles = nyqVar.a.listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            kotlin.io.b.l(file2);
                        }
                    }
                    file.mkdirs();
                }
                File file3 = new File(file, sb2);
                a = nyq.a(file3);
                if (a == null) {
                    a = nyq.b(file3, p61Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr = this.$categoryHeaderIconIds;
        int i2 = this.$it;
        return new uu6(iArr[i2], this.$categoryNames[i2], a);
    }
}
