package com.yandex.messaging.ui.chatlist;

import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/ui/chatlist/RecyclingStateCacheLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RecyclingStateCacheLayoutManager extends LinearLayoutManager {
    public LinearLayoutManager.SavedState b0;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void I0(RecyclerView recyclerView, r0 r0Var) {
        this.b0 = (LinearLayoutManager.SavedState) super.X0();
        super.I0(recyclerView, r0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void V0(RecyclerView.k kVar) {
        super.V0(kVar);
        this.b0 = null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final Parcelable X0() {
        return d0() > 0 ? super.X0() : this.b0;
    }
}
