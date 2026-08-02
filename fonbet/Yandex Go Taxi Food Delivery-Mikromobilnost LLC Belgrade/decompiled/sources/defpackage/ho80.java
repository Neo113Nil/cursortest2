package defpackage;

import com.yandex.go.places.impl.ui.organizations.OrganizationsModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class ho80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OrganizationsModalView b;

    public /* synthetic */ ho80(OrganizationsModalView organizationsModalView, int i) {
        this.a = i;
        this.b = organizationsModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        OrganizationsModalView organizationsModalView = this.b;
        switch (i) {
            case 0:
                OrganizationsModalView.setupOpenMapButton$lambda$0(organizationsModalView);
                break;
            default:
                OrganizationsModalView.onAttachedToWindow$lambda$0(organizationsModalView);
                break;
        }
    }
}
