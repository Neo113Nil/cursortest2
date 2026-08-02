package com.yandex.div.core.view2;

import com.yandex.div2.DivVisibilityAction;
import defpackage.dms;
import defpackage.f9l;
import defpackage.nnk;
import defpackage.rvo;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/yandex/div/core/view2/Div2View;", "scope", "Lrvo;", "resolver", "Landroid/view/View;", "<anonymous parameter 2>", "Lm3k;", "<anonymous parameter 3>", "Lf9l;", "action", "Lzy11;", "invoke", "(Lcom/yandex/div/core/view2/Div2View;Lrvo;Landroid/view/View;Lm3k;Lf9l;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DivVisibilityActionTracker$isEnabledObserver$2 extends Lambda implements dms {
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivVisibilityActionTracker$isEnabledObserver$2(i iVar) {
        super(5);
        this.this$0 = iVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Div2View div2View = (Div2View) obj;
        rvo rvoVar = (rvo) obj2;
        f9l f9lVar = (f9l) obj5;
        if (f9lVar instanceof DivVisibilityAction) {
            i iVar = this.this$0;
            iVar.g(div2View, rvoVar, null, f9lVar, 0, iVar.d);
        } else if (f9lVar instanceof nnk) {
            i iVar2 = this.this$0;
            iVar2.g(div2View, rvoVar, null, f9lVar, 0, iVar2.e);
        }
        return zy11.a;
    }
}
