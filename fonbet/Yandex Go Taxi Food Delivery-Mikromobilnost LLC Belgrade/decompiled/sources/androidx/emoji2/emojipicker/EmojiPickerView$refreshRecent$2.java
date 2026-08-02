package androidx.emoji2.emojipicker;

import defpackage.d2x;
import defpackage.d6w;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qun;
import defpackage.tcc;
import defpackage.tse;
import defpackage.vtn;
import defpackage.wls;
import defpackage.ztn;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.emoji2.emojipicker.EmojiPickerView$refreshRecent$2", f = "EmojiPickerView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class EmojiPickerView$refreshRecent$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $oldGroupSize;
    final /* synthetic */ List<String> $recent;
    int label;
    final /* synthetic */ EmojiPickerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiPickerView$refreshRecent$2(EmojiPickerView emojiPickerView, List list, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = emojiPickerView;
        this.$recent = list;
        this.$oldGroupSize = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EmojiPickerView$refreshRecent$2(this.this$0, this.$recent, this.$oldGroupSize, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        EmojiPickerView$refreshRecent$2 emojiPickerView$refreshRecent$2 = (EmojiPickerView$refreshRecent$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        emojiPickerView$refreshRecent$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        ztn ztnVar;
        ztn ztnVar2;
        d2x d2xVar;
        d2x d2xVar2;
        d2x d2xVar3;
        vtn vtnVar;
        d2x d2xVar4;
        d2x d2xVar5;
        vtn vtnVar2;
        d2x d2xVar6;
        vtn vtnVar3;
        d2x d2xVar7;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        list = this.this$0.recentItems;
        list.clear();
        list2 = this.this$0.recentItems;
        List<String> list3 = this.$recent;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(new qun((String) it.next(), 0, 4));
        }
        list2.addAll(arrayList);
        ztnVar = this.this$0.emojiPickerItems;
        if (ztnVar != null) {
            ztnVar2 = this.this$0.emojiPickerItems;
            if (ztnVar2 == null) {
                ztnVar2 = null;
            }
            d2xVar = this.this$0.recentItemGroup;
            if (d2xVar == null) {
                d2xVar = null;
            }
            d6w d = ztnVar2.d(d2xVar);
            d2xVar2 = this.this$0.recentItemGroup;
            if (d2xVar2 == null) {
                d2xVar2 = null;
            }
            int b = d2xVar2.b();
            int i = this.$oldGroupSize;
            EmojiPickerView emojiPickerView = this.this$0;
            if (b > i) {
                vtnVar3 = emojiPickerView.bodyAdapter;
                if (vtnVar3 == null) {
                    vtnVar3 = null;
                }
                int i2 = d.a + this.$oldGroupSize;
                d2xVar7 = this.this$0.recentItemGroup;
                if (d2xVar7 == null) {
                    d2xVar7 = null;
                }
                vtnVar3.notifyItemRangeInserted(i2, d2xVar7.b() - this.$oldGroupSize);
            } else {
                d2xVar3 = emojiPickerView.recentItemGroup;
                if (d2xVar3 == null) {
                    d2xVar3 = null;
                }
                if (d2xVar3.b() < this.$oldGroupSize) {
                    vtnVar = this.this$0.bodyAdapter;
                    if (vtnVar == null) {
                        vtnVar = null;
                    }
                    int i3 = d.a;
                    d2xVar4 = this.this$0.recentItemGroup;
                    if (d2xVar4 == null) {
                        d2xVar4 = null;
                    }
                    int b2 = d2xVar4.b() + i3;
                    int i4 = this.$oldGroupSize;
                    d2xVar5 = this.this$0.recentItemGroup;
                    if (d2xVar5 == null) {
                        d2xVar5 = null;
                    }
                    vtnVar.notifyItemRangeRemoved(b2, i4 - d2xVar5.b());
                }
            }
            vtnVar2 = this.this$0.bodyAdapter;
            if (vtnVar2 == null) {
                vtnVar2 = null;
            }
            int i5 = d.a;
            int i6 = this.$oldGroupSize;
            d2xVar6 = this.this$0.recentItemGroup;
            vtnVar2.notifyItemRangeChanged(i5, Math.min(i6, (d2xVar6 != null ? d2xVar6 : null).b()));
            this.this$0.recentNeedsRefreshing = false;
        }
        return zy11.a;
    }
}
