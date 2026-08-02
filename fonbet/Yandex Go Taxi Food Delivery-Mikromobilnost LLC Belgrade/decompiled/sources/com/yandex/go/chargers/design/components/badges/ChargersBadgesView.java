package com.yandex.go.chargers.design.components.badges;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.at3;
import defpackage.ca1;
import defpackage.g0c;
import defpackage.he7;
import defpackage.lj1;
import defpackage.od9;
import defpackage.qo9;
import defpackage.qoi0;
import defpackage.rxv;
import defpackage.t47;
import defpackage.tje;
import defpackage.tls;
import defpackage.to9;
import defpackage.zxs;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/go/chargers/design/components/badges/ChargersBadgesView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lqo9;", "items", "Lzy11;", "submitBadges", "(Ljava/util/List;)V", "Lkotlin/Function1;", "listener", "setBadgeClickListener", "(Ltls;)V", "removeBadgeClickListener", "()V", "badgeClickListener", "Ltls;", "Lto9;", "recyclerAdapter", "Lto9;", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersBadgesView extends RecyclerView {
    public static final int $stable = 8;
    private tls badgeClickListener;
    private final to9 recyclerAdapter;

    public ChargersBadgesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = 3;
        int i3 = 1;
        t47 t47Var = new t47(i3, new od9(i2, this));
        int i4 = ca1.g0;
        g0c a = qoi0.a(qo9.class);
        lj1 lj1Var = new lj1(context, i2);
        at3 at3Var = new at3(15);
        to9 to9Var = new to9(t47Var, Collections.singletonList(new zxs(a.a(), 0, lj1Var, EmptyList.a, new he7(i3, at3Var), null)));
        this.recyclerAdapter = to9Var;
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        setAdapter(to9Var);
        setItemAnimator(null);
        setClipToPadding(false);
        setNestedScrollingEnabled(false);
        setPadding(tje.u(16, getContext()), getPaddingTop(), tje.u(16, getContext()), getPaddingBottom());
        addItemDecoration(new rxv(tje.u(8, getContext())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 recyclerAdapter$lambda$0(ChargersBadgesView chargersBadgesView, qo9 qo9Var) {
        tls tlsVar = chargersBadgesView.badgeClickListener;
        if (tlsVar != null) {
            tlsVar.invoke(qo9Var);
        }
        return zy11.a;
    }

    public final void removeBadgeClickListener() {
        this.badgeClickListener = null;
    }

    public final void setBadgeClickListener(tls listener) {
        this.badgeClickListener = listener;
    }

    public final void submitBadges(List<qo9> items) {
        this.recyclerAdapter.submitList(items, null);
        setVisibility(!items.isEmpty() ? 0 : 8);
    }

    public ChargersBadgesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ChargersBadgesView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ChargersBadgesView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
