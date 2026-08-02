package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.permission.PermissionHelper;
import com.vk.photogallery.GallerySelectionStrategy;
import com.vk.photogallery.LocalGalleryProvider;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.utils.Optional;
import xsna.ub9;
import xsna.w2t;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class u2t implements io.reactivex.rxjava3.core.s, ub9.c, Optional.Action {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u2t(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // ru.mail.libverify.utils.Optional.Action
    public void accept(Object obj) {
        ((VerificationController) this.b).lambda$onIsLastRouteChanged$39((VerificationApi.VerificationStateDescriptor) this.c, (VerificationListener) obj);
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        AtomicReference atomicReference = (AtomicReference) this.b;
        String str = (String) this.c;
        atomicReference.set(aVar);
        return str + "-status";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        w2t w2tVar = (w2t) this.b;
        FragmentActivity fragmentActivity = (FragmentActivity) this.c;
        w2tVar.b.k();
        w2t.a aVar = new w2t.a(fragmentActivity, w2tVar.a, rVar, w2tVar.d);
        GallerySelectionStrategy gallerySelectionStrategy = GallerySelectionStrategy.SINGLE_IMMEDIATELY;
        List singletonList = Collections.singletonList(new LocalGalleryProvider(Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, null, 2, 0 == true ? 1 : 0));
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        PermissionHelper.f(permissionHelper, fragmentActivity, PermissionHelper.e, R.string.vkim_permissions_storage, R.string.vkim_permissions_storage, new m17(fragmentActivity, singletonList, gallerySelectionStrategy, aVar, 2), null, 32);
    }
}
