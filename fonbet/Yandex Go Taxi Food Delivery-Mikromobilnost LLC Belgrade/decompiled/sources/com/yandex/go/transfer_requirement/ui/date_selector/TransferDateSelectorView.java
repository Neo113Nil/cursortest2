package com.yandex.go.transfer_requirement.ui.date_selector;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ai01;
import defpackage.but0;
import defpackage.g0c;
import defpackage.hex0;
import defpackage.ofp0;
import defpackage.psg;
import defpackage.qke;
import defpackage.qoi0;
import defpackage.t601;
import defpackage.uh01;
import defpackage.wh01;
import defpackage.wls;
import defpackage.zxs;
import defpackage.zy11;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.widget.recycler.PositionLayoutManager;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0012\u001a\u00020\r2\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R*\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/yandex/go/transfer_requirement/ui/date_selector/TransferDateSelectorView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lwh01;", "models", "Lzy11;", "setSelectorItems", "(Ljava/util/List;)V", "Lkotlin/Function2;", "listener", "setClickListener", "(Lwls;)V", "onItemClickListener", "Lwls;", "Luh01;", "dateSelectorAdapter", "Luh01;", "Lru/yandex/taxi/widget/recycler/PositionLayoutManager;", "positionLayoutManager", "Lru/yandex/taxi/widget/recycler/PositionLayoutManager;", "currentPosition", CA20Status.STATUS_USER_I, "Companion", "ai01", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransferDateSelectorView extends RecyclerView {
    private static final ai01 Companion = new ai01();

    @Deprecated
    public static final int POSITION_NOT_SET = -1;
    private int currentPosition;
    private final uh01 dateSelectorAdapter;
    private wls onItemClickListener;
    private final PositionLayoutManager positionLayoutManager;

    public TransferDateSelectorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        hex0 hex0Var = new hex0(20, this, context);
        int i2 = psg.b0;
        g0c a = qoi0.a(wh01.class);
        uh01 uh01Var = new uh01(Collections.singletonList(new zxs(a.a(), 0, null, EmptyList.a, null, new but0(21, hex0Var))));
        this.dateSelectorAdapter = uh01Var;
        PositionLayoutManager positionLayoutManager = new PositionLayoutManager(context);
        this.positionLayoutManager = positionLayoutManager;
        this.currentPosition = -1;
        setLayoutManager(positionLayoutManager);
        setAdapter(uh01Var);
        setItemAnimator(null);
        setClipToPadding(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 dateSelectorAdapter$lambda$0(TransferDateSelectorView transferDateSelectorView, Context context, int i, wh01 wh01Var) {
        wls wlsVar = transferDateSelectorView.onItemClickListener;
        if (wlsVar != null) {
            wlsVar.invoke(Integer.valueOf(i), wh01Var);
        }
        if (i != transferDateSelectorView.currentPosition) {
            qke.E(context, HapticController$Effect.CLICK_MEDIUM, false, 8);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSelectorItems$lambda$0(List list, TransferDateSelectorView transferDateSelectorView) {
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((wh01) it.next()).b) {
                break;
            } else {
                i++;
            }
        }
        int i2 = transferDateSelectorView.currentPosition;
        if (i2 == -1) {
            transferDateSelectorView.positionLayoutManager.r(i, ofp0.b / 3);
        } else if (i != i2) {
            transferDateSelectorView.smoothScrollToPosition(i);
        }
        transferDateSelectorView.currentPosition = i;
    }

    public final void setClickListener(wls listener) {
        this.onItemClickListener = listener;
    }

    public final void setSelectorItems(List<wh01> models) {
        this.dateSelectorAdapter.submitList(models, new t601(2, models, this));
    }

    public TransferDateSelectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TransferDateSelectorView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ TransferDateSelectorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
