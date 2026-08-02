package xsna;

import android.graphics.drawable.GradientDrawable;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.vk.catalog2.common.ui.mvp.friend.FriendsCatalogFragment;
import com.vk.im.design.view.pagination.pin.ImPinView;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ChannelProfileInfoModel.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class m9b extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9b(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ViewGroup viewGroup;
        switch (this.b) {
            case 0:
                ((i9b) this.receiver).g();
                return s3q0.a;
            case 1:
                return Boolean.valueOf(((FriendsCatalogFragment) this.receiver).isResumed());
            case 2:
                ImPinView.a((ImPinView) this.receiver);
                return s3q0.a;
            case 3:
                ((cxu0) this.receiver).getClass();
                return new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[]{-11699, -891575, -1692053});
            case 4:
                com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar = (com.vk.newsfeed.posting.market_picker.presentation.base.view.e) this.receiver;
                eVar.d.j.getClass();
                com.vk.newsfeed.posting.market_picker.presentation.base.view.h hVar = eVar.l;
                int i = eVar.m;
                hVar.l = true;
                SparseArray<com.vk.newsfeed.posting.market_picker.presentation.base.view.d> sparseArray = hVar.h;
                com.vk.newsfeed.posting.market_picker.presentation.base.view.d dVar = sparseArray.get(i);
                if (dVar != null && (viewGroup = dVar.a) != null) {
                    viewGroup.setAlpha(1.0f);
                }
                com.vk.newsfeed.posting.market_picker.presentation.base.view.d dVar2 = sparseArray.get(i);
                if (dVar2 != null) {
                    dVar2.k.setZoomable(hVar.j.get(i));
                }
                hVar.b(i);
                eVar.h = null;
                hVar.k.get(eVar.m, false);
                return s3q0.a;
            case 5:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ALREADY_VERIFIED_LIBVERIFY_STARTED, null, null, null, null, null, null, 254);
                return s3q0.a;
            default:
                mjw0 mjw0Var = (mjw0) this.receiver;
                int i2 = mjw0.m1;
                return Boolean.valueOf(mjw0Var.m());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9b(FriendsCatalogFragment friendsCatalogFragment) {
        super(0, friendsCatalogFragment, FriendsCatalogFragment.class, "isResumed", "isResumed()Z", 0);
        this.b = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9b(Object obj, int i) {
        super(0, obj, i9b.class, "archiveChannel", "archiveChannel()V", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(0, obj, cxu0.class, "sunset", "sunset()Landroid/graphics/drawable/Drawable;", 0);
                break;
            case 4:
                super(0, obj, com.vk.newsfeed.posting.market_picker.presentation.base.view.e.class, "onFinishScaleIn", "onFinishScaleIn()V", 0);
                break;
            case 5:
                super(0, obj, com.vk.registration.funnels.b.class, "onLibverifyAlreadyVerifiedStarted", "onLibverifyAlreadyVerifiedStarted()V", 0);
                break;
            default:
                break;
        }
    }
}
