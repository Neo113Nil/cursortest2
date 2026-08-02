package defpackage;

import android.view.View;
import com.yandex.go.ui.UserPhotoUploadingModalView;
import ru.yandex.taxi.widget.text.method.LinkMovementMethod;

/* loaded from: classes14.dex */
public final /* synthetic */ class ar21 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserPhotoUploadingModalView b;

    public /* synthetic */ ar21(UserPhotoUploadingModalView userPhotoUploadingModalView, int i) {
        this.a = i;
        this.b = userPhotoUploadingModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        LinkMovementMethod linkMovementMethod_delegate$lambda$0;
        View insetsType$lambda$0;
        int i = this.a;
        UserPhotoUploadingModalView userPhotoUploadingModalView = this.b;
        switch (i) {
            case 0:
                linkMovementMethod_delegate$lambda$0 = UserPhotoUploadingModalView.linkMovementMethod_delegate$lambda$0(userPhotoUploadingModalView);
                return linkMovementMethod_delegate$lambda$0;
            default:
                insetsType$lambda$0 = UserPhotoUploadingModalView.insetsType$lambda$0(userPhotoUploadingModalView);
                return insetsType$lambda$0;
        }
    }
}
