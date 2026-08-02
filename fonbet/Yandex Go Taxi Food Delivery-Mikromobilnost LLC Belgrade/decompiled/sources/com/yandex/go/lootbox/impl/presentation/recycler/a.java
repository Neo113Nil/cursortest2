package com.yandex.go.lootbox.impl.presentation.recycler;

import android.view.View;
import androidx.core.view.b;
import defpackage.awh;
import defpackage.eqz;
import defpackage.ike;
import defpackage.k7x0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.rp31;
import defpackage.s5o;
import defpackage.tje;
import defpackage.txc;
import defpackage.vsn;
import defpackage.wih0;
import defpackage.wys;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class a extends wys {
    public static final List a0 = Collections.singletonList(new s5o(LootBoxGiftsListItemViewHolder$Companion$PAYLOAD_TYPES$1.b));
    public final ike R;
    public final k7x0 S;
    public final pav T;
    public final c U;
    public final txc V;
    public final zuj0 W;
    public final ListItemComponent Z;

    public a(View view, ike ikeVar, k7x0 k7x0Var, pav pavVar, c cVar, txc txcVar, zuj0 zuj0Var) {
        super(view);
        this.R = ikeVar;
        this.S = k7x0Var;
        this.T = pavVar;
        this.U = cVar;
        this.V = txcVar;
        this.W = zuj0Var;
        int i = wih0.gift;
        WeakHashMap weakHashMap = b.a;
        this.Z = (ListItemComponent) ((View) rp31.d(view, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if (r13 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c0(a aVar, FormattedText formattedText, FormattedText formattedText2, ContinuationImpl continuationImpl) {
        LootBoxGiftsListItemViewHolder$bindText$1 lootBoxGiftsListItemViewHolder$bindText$1;
        int i;
        ListItemComponent listItemComponent;
        ListItemComponent listItemComponent2 = aVar.Z;
        if (continuationImpl instanceof LootBoxGiftsListItemViewHolder$bindText$1) {
            lootBoxGiftsListItemViewHolder$bindText$1 = (LootBoxGiftsListItemViewHolder$bindText$1) continuationImpl;
            int i2 = lootBoxGiftsListItemViewHolder$bindText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lootBoxGiftsListItemViewHolder$bindText$1.label = i2 - Integer.MIN_VALUE;
                LootBoxGiftsListItemViewHolder$bindText$1 lootBoxGiftsListItemViewHolder$bindText$12 = lootBoxGiftsListItemViewHolder$bindText$1;
                Object obj = lootBoxGiftsListItemViewHolder$bindText$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lootBoxGiftsListItemViewHolder$bindText$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = aVar.U;
                    lootBoxGiftsListItemViewHolder$bindText$12.L$0 = null;
                    lootBoxGiftsListItemViewHolder$bindText$12.L$1 = formattedText2;
                    lootBoxGiftsListItemViewHolder$bindText$12.L$2 = listItemComponent2;
                    lootBoxGiftsListItemViewHolder$bindText$12.label = 1;
                    obj = c.e(cVar, formattedText, null, false, lootBoxGiftsListItemViewHolder$bindText$12, 30);
                    if (obj != coroutineSingletons) {
                        listItemComponent = listItemComponent2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    listItemComponent2 = (ListItemComponent) lootBoxGiftsListItemViewHolder$bindText$12.L$2;
                    kotlin.b.b(obj);
                    listItemComponent2.setSubtitle(obj.toString());
                    return zy11.a;
                }
                listItemComponent = (ListItemComponent) lootBoxGiftsListItemViewHolder$bindText$12.L$2;
                formattedText2 = (FormattedText) lootBoxGiftsListItemViewHolder$bindText$12.L$1;
                kotlin.b.b(obj);
                FormattedText formattedText3 = formattedText2;
                listItemComponent.setTitle((CharSequence) obj);
                c cVar2 = aVar.U;
                lootBoxGiftsListItemViewHolder$bindText$12.L$0 = null;
                lootBoxGiftsListItemViewHolder$bindText$12.L$1 = null;
                lootBoxGiftsListItemViewHolder$bindText$12.L$2 = listItemComponent2;
                lootBoxGiftsListItemViewHolder$bindText$12.label = 2;
                obj = c.e(cVar2, formattedText3, null, false, lootBoxGiftsListItemViewHolder$bindText$12, 30);
            }
        }
        lootBoxGiftsListItemViewHolder$bindText$1 = new LootBoxGiftsListItemViewHolder$bindText$1(aVar, continuationImpl);
        LootBoxGiftsListItemViewHolder$bindText$1 lootBoxGiftsListItemViewHolder$bindText$122 = lootBoxGiftsListItemViewHolder$bindText$1;
        Object obj2 = lootBoxGiftsListItemViewHolder$bindText$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lootBoxGiftsListItemViewHolder$bindText$122.label;
        if (i != 0) {
        }
        FormattedText formattedText32 = formattedText2;
        listItemComponent.setTitle((CharSequence) obj2);
        c cVar22 = aVar.U;
        lootBoxGiftsListItemViewHolder$bindText$122.L$0 = null;
        lootBoxGiftsListItemViewHolder$bindText$122.L$1 = null;
        lootBoxGiftsListItemViewHolder$bindText$122.L$2 = listItemComponent2;
        lootBoxGiftsListItemViewHolder$bindText$122.label = 2;
        obj2 = c.e(cVar22, formattedText32, null, false, lootBoxGiftsListItemViewHolder$bindText$122, 30);
    }

    @Override // defpackage.wys
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final void c(eqz eqzVar) {
        this.a.setOnClickListener(new vsn(28, this, eqzVar));
        a0(new awh(tje.N(this.R, null, null, new LootBoxGiftsListItemViewHolder$bind$bindJob$1(this, eqzVar, null), 3), 1));
        this.Z.setDividers(DividerPosition.BOTTOM, DividerType.NORMAL);
    }
}
