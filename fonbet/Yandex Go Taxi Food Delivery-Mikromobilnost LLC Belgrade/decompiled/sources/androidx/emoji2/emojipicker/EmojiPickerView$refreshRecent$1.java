package androidx.emoji2.emojipicker;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "androidx.emoji2.emojipicker.EmojiPickerView", f = "EmojiPickerView.kt", l = {302, 303}, m = "refreshRecent$emoji2_emojipicker_release")
/* loaded from: classes10.dex */
public final class EmojiPickerView$refreshRecent$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EmojiPickerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiPickerView$refreshRecent$1(EmojiPickerView emojiPickerView, Continuation continuation) {
        super(continuation);
        this.this$0 = emojiPickerView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.refreshRecent$emoji2_emojipicker_release(this);
    }
}
