package xsna;

import androidx.compose.runtime.a;
import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;
import com.vk.profile.community.details.impl.contacts.a;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class be1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ be1(izs izsVar, int i) {
        this.b = 2;
        this.c = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-261714155, intValue, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.screen.AlbumChooseView.<anonymous> (AlbumChooseView.kt:39)");
                    }
                    izs izsVar = this.c;
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new ee1(izsVar, 0);
                        aVar.R(x);
                    }
                    sq8.a(48, aVar, d370.N(R.string.album_choose_done, 0, aVar), (gzs) x, null, true);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                this.c.invoke(new a.d((CommunityAddContactsState.ContactField.ContactViewType) obj, ((Boolean) obj2).booleanValue()));
                break;
            default:
                ((Integer) obj2).getClass();
                ich0.k(this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ be1(izs izsVar, int i, byte b) {
        this.b = i;
        this.c = izsVar;
    }
}
