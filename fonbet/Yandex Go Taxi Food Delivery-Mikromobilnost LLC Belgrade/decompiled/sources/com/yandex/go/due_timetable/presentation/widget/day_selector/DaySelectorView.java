package com.yandex.go.due_timetable.presentation.widget.day_selector;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.g0c;
import defpackage.j9f;
import defpackage.mjf;
import defpackage.msg;
import defpackage.nsg;
import defpackage.ofp0;
import defpackage.psg;
import defpackage.qke;
import defpackage.qoi0;
import defpackage.qsg;
import defpackage.tbb;
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
import ru.yandex.taxi.widget.recycler.PositionLayoutManager;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fR6\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/yandex/go/due_timetable/presentation/widget/day_selector/DaySelectorView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lnsg;", "models", "Lzy11;", "setDaySelectorItems", "(Ljava/util/List;)V", "Lkotlin/Function2;", "onItemClickListener", "Lwls;", "getOnItemClickListener", "()Lwls;", "setOnItemClickListener", "(Lwls;)V", "Lmsg;", "daySelectorAdapter", "Lmsg;", "Lru/yandex/taxi/widget/recycler/PositionLayoutManager;", "positionLayoutManager", "Lru/yandex/taxi/widget/recycler/PositionLayoutManager;", "currentPosition", CA20Status.STATUS_USER_I, "Companion", "qsg", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DaySelectorView extends RecyclerView {
    private static final qsg Companion = new qsg();

    @Deprecated
    public static final int POSITION_NOT_SET = -1;
    private int currentPosition;
    private final msg daySelectorAdapter;
    private wls onItemClickListener;
    private final PositionLayoutManager positionLayoutManager;

    public DaySelectorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mjf mjfVar = new mjf(3, this, context);
        int i2 = psg.b0;
        g0c a = qoi0.a(nsg.class);
        msg msgVar = new msg(Collections.singletonList(new zxs(a.a(), 0, null, EmptyList.a, null, new tbb(15, mjfVar))));
        this.daySelectorAdapter = msgVar;
        PositionLayoutManager positionLayoutManager = new PositionLayoutManager(context);
        this.positionLayoutManager = positionLayoutManager;
        this.currentPosition = -1;
        setLayoutManager(positionLayoutManager);
        setAdapter(msgVar);
        setItemAnimator(null);
        setClipToPadding(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 daySelectorAdapter$lambda$0(DaySelectorView daySelectorView, Context context, int i, nsg nsgVar) {
        wls wlsVar = daySelectorView.onItemClickListener;
        if (wlsVar != null) {
            wlsVar.invoke(Integer.valueOf(i), nsgVar);
        }
        if (i != daySelectorView.currentPosition) {
            qke.v(context);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDaySelectorItems$lambda$0(List list, DaySelectorView daySelectorView) {
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((nsg) it.next()).e) {
                break;
            } else {
                i++;
            }
        }
        int i2 = daySelectorView.currentPosition;
        if (i2 == -1) {
            daySelectorView.positionLayoutManager.r(i, ofp0.b / 3);
        } else if (i != i2) {
            daySelectorView.smoothScrollToPosition(i);
        }
        daySelectorView.currentPosition = i;
    }

    public final wls getOnItemClickListener() {
        return this.onItemClickListener;
    }

    public final void setDaySelectorItems(List<nsg> models) {
        this.daySelectorAdapter.submitList(models, new j9f(26, models, this));
    }

    public final void setOnItemClickListener(wls wlsVar) {
        this.onItemClickListener = wlsVar;
    }

    public DaySelectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DaySelectorView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DaySelectorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
