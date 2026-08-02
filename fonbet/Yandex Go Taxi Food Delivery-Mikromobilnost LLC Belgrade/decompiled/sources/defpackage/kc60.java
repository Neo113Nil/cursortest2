package defpackage;

import ru.yandex.taxi.location.no_permission.NoLocationPermissionModalView;

/* loaded from: classes5.dex */
public final /* synthetic */ class kc60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NoLocationPermissionModalView b;

    public /* synthetic */ kc60(NoLocationPermissionModalView noLocationPermissionModalView, int i) {
        this.a = i;
        this.b = noLocationPermissionModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        NoLocationPermissionModalView noLocationPermissionModalView = this.b;
        switch (i) {
            case 0:
                NoLocationPermissionModalView.onAttachedToWindow$lambda$0(noLocationPermissionModalView);
                break;
            default:
                noLocationPermissionModalView.dismiss();
                break;
        }
    }
}
