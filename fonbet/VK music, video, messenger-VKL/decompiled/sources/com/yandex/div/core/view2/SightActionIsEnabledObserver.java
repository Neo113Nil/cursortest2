package com.yandex.div.core.view2;

import android.view.View;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.SightActionIsEnabledObserver;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.collections.EmptySet;
import xsna.a0t;
import xsna.apn;
import xsna.izs;
import xsna.j5g;
import xsna.s3q0;

/* compiled from: SightActionIsEnabledObserver.kt */
/* loaded from: classes7.dex */
public final class SightActionIsEnabledObserver {
    private final a0t<Div2View, ExpressionResolver, View, a, apn, s3q0> onDisable;
    private final a0t<Div2View, ExpressionResolver, View, a, apn, s3q0> onEnable;
    private final WeakHashMap<View, Set<apn>> boundedActions = new WeakHashMap<>();
    private final HashMap<apn, Subscription> subscriptions = new HashMap<>();
    private final WeakHashMap<View, s3q0> hasSubscription = new WeakHashMap<>();

    /* compiled from: SightActionIsEnabledObserver.kt */
    public static final class Subscription {
        private final Disposable disposable;
        private final WeakReference<View> owner;

        public Subscription(Disposable disposable, View view) {
            this.disposable = disposable;
            this.owner = new WeakReference<>(view);
        }

        public final void close() {
            this.disposable.close();
        }

        public final WeakReference<View> getOwner() {
            return this.owner;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SightActionIsEnabledObserver(a0t<? super Div2View, ? super ExpressionResolver, ? super View, ? super a, ? super apn, s3q0> a0tVar, a0t<? super Div2View, ? super ExpressionResolver, ? super View, ? super a, ? super apn, s3q0> a0tVar2) {
        this.onEnable = a0tVar;
        this.onDisable = a0tVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addSubscriptionIfNeeded(final View view) {
        if (this.hasSubscription.containsKey(view) || !(view instanceof ExpressionSubscriber)) {
            return;
        }
        ((ExpressionSubscriber) view).addSubscription(new Disposable() { // from class: xsna.rlj0
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                SightActionIsEnabledObserver.addSubscriptionIfNeeded$lambda$2(SightActionIsEnabledObserver.this, view);
            }
        });
        this.hasSubscription.put(view, s3q0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscriptionIfNeeded$lambda$2(SightActionIsEnabledObserver sightActionIsEnabledObserver, View view) {
        Set<apn> remove = sightActionIsEnabledObserver.boundedActions.remove(view);
        sightActionIsEnabledObserver.cancelObserving(remove != null ? remove : EmptySet.b);
    }

    private final void cancelObserving(apn apnVar) {
        Set<apn> set;
        Subscription remove = this.subscriptions.remove(apnVar);
        if (remove == null) {
            return;
        }
        remove.close();
        View view = remove.getOwner().get();
        if (view == null || (set = this.boundedActions.get(view)) == null) {
            return;
        }
        set.remove(apnVar);
    }

    public final void observe(final View view, final Div2View div2View, final ExpressionResolver expressionResolver, final a aVar, List<? extends apn> list) {
        Subscription remove;
        addSubscriptionIfNeeded(view);
        WeakHashMap<View, Set<apn>> weakHashMap = this.boundedActions;
        Set<apn> set = weakHashMap.get(view);
        if (set == null) {
            set = EmptySet.b;
        }
        LinkedHashSet d0 = j5g.d0(list, set);
        Set<apn> R0 = j5g.R0(d0);
        for (apn apnVar : set) {
            if (!d0.contains(apnVar) && (remove = this.subscriptions.remove(apnVar)) != null) {
                remove.close();
            }
        }
        for (final apn apnVar2 : list) {
            if (!d0.contains(apnVar2)) {
                R0.add(apnVar2);
                cancelObserving(apnVar2);
                this.subscriptions.put(apnVar2, new Subscription(apnVar2.isEnabled().observe(expressionResolver, new izs<Boolean, s3q0>() { // from class: com.yandex.div.core.view2.SightActionIsEnabledObserver$observe$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // xsna.izs
                    public /* bridge */ /* synthetic */ s3q0 invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return s3q0.a;
                    }

                    public final void invoke(boolean z) {
                        a0t a0tVar;
                        a0t a0tVar2;
                        if (z) {
                            a0tVar2 = SightActionIsEnabledObserver.this.onEnable;
                            a0tVar2.invoke(div2View, expressionResolver, view, aVar, apnVar2);
                        } else {
                            a0tVar = SightActionIsEnabledObserver.this.onDisable;
                            a0tVar.invoke(div2View, expressionResolver, view, aVar, apnVar2);
                        }
                    }
                }), view));
            }
        }
        weakHashMap.put(view, R0);
    }

    public final void cancelObserving(Iterable<? extends apn> iterable) {
        Iterator<? extends apn> it = iterable.iterator();
        while (it.hasNext()) {
            cancelObserving(it.next());
        }
    }
}
