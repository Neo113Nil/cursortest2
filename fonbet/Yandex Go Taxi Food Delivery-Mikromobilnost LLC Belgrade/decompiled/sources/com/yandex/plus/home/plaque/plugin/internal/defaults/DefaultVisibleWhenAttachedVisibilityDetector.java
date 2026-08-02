package com.yandex.plus.home.plaque.plugin.internal.defaults;

import android.view.View;
import com.yandex.plus.home.plaque.feature.api.PlaqueViewVisibilityDetector;
import defpackage.isc0;
import defpackage.yjc0;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\rR$\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000fj\b\u0012\u0004\u0012\u00020\u0004`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/plus/home/plaque/plugin/internal/defaults/DefaultVisibleWhenAttachedVisibilityDetector;", "Lcom/yandex/plus/home/plaque/feature/api/PlaqueViewVisibilityDetector;", "<init>", "()V", "Lisc0;", "listener", "Lzy11;", "addListener", "(Lisc0;)V", "removeListener", "Landroid/view/View;", "view", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "listeners", "Ljava/util/HashSet;", "plus-home-plaque-plugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DefaultVisibleWhenAttachedVisibilityDetector implements PlaqueViewVisibilityDetector {
    private final HashSet<isc0> listeners = new HashSet<>();

    @Override // com.yandex.plus.home.plaque.feature.api.PlaqueViewVisibilityDetector
    public void addListener(isc0 listener) {
        this.listeners.add(listener);
    }

    @Override // com.yandex.plus.home.plaque.feature.api.PlaqueViewVisibilityDetector, android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((yjc0) ((isc0) it.next())).a(true);
        }
    }

    @Override // com.yandex.plus.home.plaque.feature.api.PlaqueViewVisibilityDetector, android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((yjc0) ((isc0) it.next())).a(false);
        }
    }

    @Override // com.yandex.plus.home.plaque.feature.api.PlaqueViewVisibilityDetector
    public void removeListener(isc0 listener) {
        this.listeners.remove(listener);
    }
}
