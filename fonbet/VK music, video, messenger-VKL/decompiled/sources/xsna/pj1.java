package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.ecomm.cart.impl.points_map.ui.fragment.DeliveryPointsMapFragment;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.log.L;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.impl.postmodal.comments.CommentsOutherFragment;
import com.vk.photos.ui.editalbum.presentation.CreateAlbumFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.xn50;

/* compiled from: AlbumPickerFeatureDelegate.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class pj1 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pj1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                break;
            case 1:
                L.i((Throwable) obj);
                break;
            case 2:
                ((p3f) this.receiver).getClass();
                List<UsersUserFullDto> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (UsersUserFullDto usersUserFullDto : list) {
                    arrayList.add(Boolean.valueOf((usersUserFullDto.j() == BaseBoolIntDto.YES || usersUserFullDto.D() == BaseBoolIntDto.NO) ? false : true));
                }
                Boolean bool = (Boolean) j5g.a0(arrayList);
                break;
            case 3:
                CommentsOutherFragment commentsOutherFragment = (CommentsOutherFragment) this.receiver;
                int i = CommentsOutherFragment.h0;
                break;
            case 4:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).Y((com.vk.profile.community.impl.ui.profile.actions.d) obj);
                break;
            case 5:
                CreateAlbumFragment createAlbumFragment = (CreateAlbumFragment) this.receiver;
                createAlbumFragment.getClass();
                xn50.a.c(createAlbumFragment, (com.vk.photos.ui.editalbum.domain.a) obj);
                break;
            case 6:
                DeliveryPointsMapFragment deliveryPointsMapFragment = (DeliveryPointsMapFragment) this.receiver;
                deliveryPointsMapFragment.getClass();
                xn50.a.c(deliveryPointsMapFragment, (cxl) obj);
                break;
            case 7:
                afm afmVar = (afm) this.receiver;
                zsk0 zsk0Var = afmVar.D;
                zsk0Var.i = false;
                zsk0Var.e.Hb((ProfilesInfo) obj);
                afmVar.Y0();
                afmVar.b1();
                break;
            case 8:
                ybp ybpVar = (ybp) obj;
                acp acpVar = (acp) this.receiver;
                io.reactivex.rxjava3.subjects.i<ybp> iVar = acpVar.b;
                if (iVar != null) {
                    if (acp.c(iVar)) {
                        iVar = null;
                    }
                    if (iVar != null) {
                        iVar.onSuccess(ybpVar);
                    }
                }
                acpVar.b = null;
                break;
            case 9:
                ((e3a) this.receiver).getClass();
                break;
            case 10:
                break;
            case 11:
                vgg vggVar = (vgg) obj;
                s6k0 s6k0Var = (s6k0) this.receiver;
                s6k0Var.getClass();
                Throwable th = vggVar.a;
                if ((th instanceof VKApiExecutionException) && f35.d((VKApiExecutionException) th)) {
                    sp.v(s6k0Var.a, s6k0Var.b, new jz70(s6k0Var, 23));
                } else {
                    vggVar.c();
                }
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                rcx0 rcx0Var = (rcx0) this.receiver;
                icx0 icx0Var = rcx0Var.b;
                if (!booleanValue && epx.f(icx0Var.m(), rcx0Var.c.a())) {
                    icx0Var.j();
                }
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj1(Object obj, int i) {
        super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 2:
                super(1, obj, p3f.class, "mapToCanShareToUser", "mapToCanShareToUser(Ljava/util/List;)Z", 0);
                break;
            case 9:
                super(1, obj, e3a.class, "mapToCatalog", "mapToCatalog(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0);
                break;
            case 10:
                super(1, obj, NewsComment.class, "containsComment", "containsComment(Lcom/vk/newsfeed/api/data/NewsComment;)Z", 0);
                break;
            default:
                break;
        }
    }
}
