package com.yandex.go.places.impl.ui.search.viewholder;

import android.graphics.drawable.BitmapDrawable;
import defpackage.e3h0;
import defpackage.kup0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.usp0;
import defpackage.uyj;
import defpackage.vsp0;
import defpackage.w511;
import defpackage.wls;
import defpackage.wsp0;
import defpackage.xsp0;
import defpackage.ysp0;
import defpackage.zsp0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.search.viewholder.SearchItemViewHolder$bind$4", f = "SearchItemViewHolder.kt", l = {111}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SearchItemViewHolder$bind$4 extends SuspendLambda implements wls {
    final /* synthetic */ kup0 $data;
    final /* synthetic */ ListItemComponent $typedView;
    int I$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchItemViewHolder$bind$4(kup0 kup0Var, ListItemComponent listItemComponent, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$data = kup0Var;
        this.$typedView = listItemComponent;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchItemViewHolder$bind$4(this.$data, this.$typedView, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchItemViewHolder$bind$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        zy11 zy11Var = zy11.a;
        if (i3 == 0) {
            kotlin.b.b(obj);
            kup0 kup0Var = this.$data;
            zsp0 zsp0Var = kup0Var.d;
            if (zsp0Var instanceof vsp0) {
                i = e3h0.search_organization_fallback_icon;
            } else if (zsp0Var instanceof wsp0) {
                i = e3h0.search_organizations_fallback_icon;
            } else if (zsp0Var instanceof usp0) {
                i = e3h0.search_organizations_fallback_icon;
            } else if ((zsp0Var instanceof xsp0) || (zsp0Var instanceof ysp0)) {
                i = e3h0.search_address_fallback_icon;
            } else {
                if (zsp0Var != null) {
                    w511.b();
                    return null;
                }
                i = e3h0.search_organizations_fallback_icon;
            }
            if (kup0Var.c == null) {
                this.$typedView.setLeadImage(tje.y(i, this.this$0.S.a));
                return zy11Var;
            }
            this.this$0.V.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            SearchItemViewHolder$bind$4$iconByTag$1 searchItemViewHolder$bind$4$iconByTag$1 = new SearchItemViewHolder$bind$4$iconByTag$1(this.this$0, this.$data, null);
            this.I$0 = i;
            this.label = 1;
            obj = tje.k0(mdhVar, searchItemViewHolder$bind$4$iconByTag$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            i2 = i;
        } else {
            if (i3 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.I$0;
            kotlin.b.b(obj);
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        ListItemComponent listItemComponent = this.$typedView;
        if (bitmapDrawable == null) {
            listItemComponent.setLeadImage(tje.y(i2, this.this$0.S.a));
            return zy11Var;
        }
        listItemComponent.setLeadImage(bitmapDrawable);
        return zy11Var;
    }
}
