package xsna;

import android.graphics.PointF;
import androidx.appcompat.widget.Toolbar;
import com.vk.dto.common.Good;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import com.vk.photoviewer.PhotoViewer;
import com.vk.photoviewer.PickPositionOverlayView;
import com.vkontakte.android.R;
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.utils.Consumer;
import xsna.z8u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class dn0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ dn0(int i, Serializable serializable, Object obj, Object obj2, Object obj3) {
        this.b = i;
        this.c = serializable;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        s3q0 addParticipantByLink$lambda$0;
        MultipickerProduct multipickerProduct;
        switch (this.b) {
            case 0:
                addParticipantByLink$lambda$0 = AddParticipantsCommands.addParticipantByLink$lambda$0((String) this.c, (Consumer) this.d, (Runnable) this.e, (AddParticipantsCommands) this.f, (Signaling) obj);
                return addParticipantByLink$lambda$0;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                x0o0 x0o0Var = (x0o0) this.d;
                Photo photo = (Photo) this.e;
                PointF pointF = (PointF) this.f;
                List list = (List) obj;
                ysd0 ysd0Var = (ysd0) ref$ObjectRef.element;
                if (ysd0Var != null) {
                    ysd0Var.hide();
                }
                Good a = (list == null || (multipickerProduct = (MultipickerProduct) j5g.a0(list)) == null) ? null : i740.a(multipickerProduct);
                if (a != null) {
                    String str = "product" + a.c + '_' + a.b;
                    String str2 = a.d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Pair pair = (a.V || a.m) ? new Pair(Integer.valueOf(R.string.photo_attach_service_prompt), Integer.valueOf(R.string.photo_service_attach_success)) : new Pair(Integer.valueOf(R.string.photo_attach_good_prompt), Integer.valueOf(R.string.photo_good_attach_success));
                    int intValue = ((Number) pair.d()).intValue();
                    int intValue2 = ((Number) pair.g()).intValue();
                    String string = x0o0Var.a.getString(intValue, str2);
                    z8u0.f fVar = x0o0Var.i;
                    if (fVar != null) {
                        yrj0 yrj0Var = new yrj0(intValue2, 1, x0o0Var, photo, str);
                        PhotoViewer photoViewer = fVar.a;
                        atf0 atf0Var = pointF != null ? new atf0(pointF.x, pointF.y) : null;
                        b8j0 b8j0Var = new b8j0(yrj0Var, 19);
                        photoViewer.L = true;
                        photoViewer.f = false;
                        PickPositionOverlayView pickPositionOverlayView = photoViewer.F;
                        pickPositionOverlayView.setVisibility(0);
                        Toolbar toolbar = photoViewer.D;
                        toolbar.setTitle(R.string.editing);
                        toolbar.setNavigationIcon(R.drawable.vk_icon_cancel_24);
                        photoViewer.H.setVisibility(8);
                        photoViewer.I.setVisibility(8);
                        defpackage.e0 e0Var = new defpackage.e0(18, photoViewer, b8j0Var);
                        toolbar.getMenu().clear();
                        toolbar.l(R.menu.attach_item);
                        toolbar.setOnMenuItemClickListener(new s41(e0Var, 26));
                        photoViewer.T.a(photoViewer.G, string);
                        if (atf0Var != null) {
                            pickPositionOverlayView.setRelativePoint(atf0Var);
                        }
                    }
                }
                return s3q0.a;
        }
    }
}
