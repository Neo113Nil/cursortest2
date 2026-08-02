package xsna;

import android.view.View;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsEcommStat$TypeBannerClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.uii0;
import xsna.xn50;

/* compiled from: AlbumsReducer.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class lp1 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lp1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(com.vk.photos.root.albums.presentation.e.i((com.vk.photos.root.albums.presentation.e) this.receiver, (com.vk.photos.root.albums.presentation.f) obj));
            case 1:
                L.i((Throwable) obj);
                return s3q0.a;
            case 2:
                ((tuf) this.receiver).getClass();
                List<Pair> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (Pair pair : list) {
                    arrayList.add(new Pair(pair.i(), xlf.b((eed) pair.j())));
                }
                return arrayList;
            case 3:
                CatchUpBanner catchUpBanner = (CatchUpBanner) obj;
                d3h d3hVar = (d3h) this.receiver;
                d3hVar.getClass();
                String str = catchUpBanner.c.e.b;
                if (str != null) {
                    SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.BANNER, null, null, null, null, null, 62, null), new MobileOfficialAppsEcommStat$TypeBannerClick(MobileOfficialAppsEcommStat$TypeBannerClick.Type.CLICK_MAJOR_LINK, catchUpBanner.j), 2);
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                    uzp0 uzp0Var = UiTracker.h;
                    uzp0Var.getClass();
                    new bjc(c, b, uzp0Var.a).q();
                    d3hVar.l(str);
                }
                return s3q0.a;
            case 4:
                com.vk.profile.community.impl.ui.profile.f.a((com.vk.profile.community.impl.ui.profile.f) this.receiver, ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 5:
                Throwable th = (Throwable) obj;
                afm afmVar = (afm) this.receiver;
                f9w f9wVar = afm.F;
                afmVar.getClass();
                afm.F.a(th);
                afmVar.D.h = false;
                dfm dfmVar = afmVar.z;
                if (dfmVar != null) {
                    dfmVar.d(th);
                }
                return s3q0.a;
            case 6:
                hpm.g((hpm) this.receiver, (com.vk.im.engine.models.dialogs.b) obj);
                return s3q0.a;
            case 7:
                com.vk.photos.ui.editalbum.domain.c.U((com.vk.photos.ui.editalbum.domain.c) this.receiver, (Throwable) obj);
                return s3q0.a;
            case 8:
                ubp ubpVar = (ubp) this.receiver;
                ubpVar.getClass();
                ubpVar.i = (VkButton) ((View) obj).findViewById(R.id.button_first);
                return s3q0.a;
            case 9:
                l430 l430Var = (l430) this.receiver;
                l430Var.getClass();
                xn50.a.c(l430Var, (k430) obj);
                return s3q0.a;
            case 10:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 11:
                eji0 eji0Var = (eji0) obj;
                ((zii0) this.receiver).getClass();
                ListBuilder e = e43.e();
                String str2 = eji0Var.c;
                e.add(new uii0.d(str2, eji0Var.d));
                if (str2.length() == 0) {
                    e.add(uii0.a.b);
                }
                Iterator<T> it = eji0Var.b.iterator();
                while (it.hasNext()) {
                    e.add(new uii0.b((s8m) it.next()));
                }
                if (str2.length() > 0 && eji0Var.e) {
                    e.add(uii0.c.b);
                }
                return e.g();
            default:
                L.i((Throwable) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp1(Object obj, int i) {
        super(1, obj, com.vk.photos.root.albums.presentation.e.class, "checkShowHeader", "checkShowHeader(Lcom/vk/photos/root/albums/presentation/AlbumsState;)Z", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 2:
                super(1, obj, tuf.class, "mapLegacyUploads", "mapLegacyUploads(Ljava/util/List;)Ljava/util/List;", 0);
                break;
            case 3:
                super(1, obj, d3h.class, "handlePartnerBannerClick", "handlePartnerBannerClick(Lcom/vk/dto/profile/CatchUpBanner;)V", 0);
                break;
            case 10:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 11:
                super(1, obj, zii0.class, "buildItems", "buildItems(Lcom/vk/camera/editor/stories/impl/share/users/mvi/SendStoryUsersState;)Ljava/util/List;", 0);
                break;
            case 12:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
