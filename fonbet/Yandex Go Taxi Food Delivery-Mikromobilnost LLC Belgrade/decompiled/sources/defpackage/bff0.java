package defpackage;

import com.yandex.go.user_profile.ui.primary.ProfileModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class bff0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileModalView b;

    public /* synthetic */ bff0(ProfileModalView profileModalView, int i) {
        this.a = i;
        this.b = profileModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ProfileModalView profileModalView = this.b;
        switch (i) {
            case 0:
                ProfileModalView.render$lambda$1(profileModalView);
                break;
            case 1:
                ProfileModalView.render$lambda$2(profileModalView);
                break;
            case 2:
                profileModalView.requestToolbarAccessibilityFocus();
                break;
            case 3:
                ProfileModalView.showCreateNameModalCallback$lambda$0(profileModalView);
                break;
            case 4:
                ProfileModalView._init_$lambda$0(profileModalView);
                break;
            case 5:
                ProfileModalView.lambda$1$0(profileModalView);
                break;
            case 6:
                ProfileModalView._init_$lambda$2(profileModalView);
                break;
            case 7:
                ProfileModalView.applyName$lambda$0(profileModalView);
                break;
            case 8:
                ProfileModalView.applyName$lambda$1(profileModalView);
                break;
            case 9:
                ProfileModalView.applyName$lambda$2(profileModalView);
                break;
            default:
                ProfileModalView.render$lambda$0(profileModalView);
                break;
        }
    }
}
