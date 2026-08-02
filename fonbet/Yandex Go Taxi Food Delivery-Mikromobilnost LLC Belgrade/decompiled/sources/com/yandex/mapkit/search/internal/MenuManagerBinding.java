package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.search.MenuInfo;
import com.yandex.mapkit.search.MenuListener;
import com.yandex.mapkit.search.MenuManager;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;

/* loaded from: classes15.dex */
public class MenuManagerBinding implements MenuManager {
    protected Subscription<MenuListener> menuListenerSubscription = new Subscription<MenuListener>(this) { // from class: com.yandex.mapkit.search.internal.MenuManagerBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(MenuListener menuListener) {
            return MenuManagerBinding.createMenuListener(menuListener);
        }
    };
    private final NativeObject nativeObject;

    public MenuManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createMenuListener(MenuListener menuListener);

    @Override // com.yandex.mapkit.search.MenuManager
    public native void addListener(MenuListener menuListener);

    @Override // com.yandex.mapkit.search.MenuManager
    public native MenuInfo getMenuInfo();

    @Override // com.yandex.mapkit.search.MenuManager
    public native void removeListener(MenuListener menuListener);

    @Override // com.yandex.mapkit.search.MenuManager
    public native void setPosition(Point point);
}
