package defpackage;

import com.yandex.go.ui.UserPhotoUploadingModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class br21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserPhotoUploadingModalView b;

    public /* synthetic */ br21(UserPhotoUploadingModalView userPhotoUploadingModalView, int i) {
        this.a = i;
        this.b = userPhotoUploadingModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        UserPhotoUploadingModalView userPhotoUploadingModalView = this.b;
        switch (i) {
            case 0:
                userPhotoUploadingModalView.backPressed();
                break;
            case 1:
                userPhotoUploadingModalView.touchOutside();
                break;
            default:
                userPhotoUploadingModalView.backPressed();
                break;
        }
    }
}
