package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetHeaderTabsDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetHeaderTabsResponseDto;
import com.vk.catalog2.common.ui.mvp.video.VideoUploadFragment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.group.Group;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.utils.retry.RetryKt;
import xsna.f9k0;
import xsna.pc90;
import xsna.ptd0;
import xsna.rts0;
import xsna.tj50;
import xsna.us2;
import xsna.wwi0;
import xsna.zjq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class nc90 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ nc90(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        qko0 qko0Var = null;
        int i = 29;
        switch (this.b) {
            case 0:
                List list = (List) obj;
                return new pc90.a(list, ((Number) j5g.Y(list)).intValue());
            case 1:
                return (Group) obj;
            case 2:
                return ((com.vk.newsfeed.impl.items.posting.item.modals.a) obj).a();
            case 3:
                return ((PostingState.Editing) obj).i.o;
            case 4:
                return new ybx0(0);
            case 5:
                qgi0.r((tgi0) obj, "product_card_top_bar_search");
                return s3q0.a;
            case 6:
                tj50.a aVar = (tj50.a) obj;
                leq leqVar = new leq(i);
                ao8 ao8Var = ao8.d;
                return new ptd0.a(aVar.a(leqVar, ao8Var), aVar.a(new i0r(13), ao8Var));
            case 7:
                return PublishState.a((PublishState) obj, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -1, 2043);
            case 8:
                return s3q0.a;
            case 9:
                return Boolean.valueOf(((sy40) obj).e.e);
            case 10:
                return Boolean.valueOf(RetryKt.a((Throwable) obj));
            case 11:
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(list2.size());
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj2 = list2.get(i2);
                    arrayList.add((epx.f(obj2, Boolean.FALSE) || obj2 == null) ? null : (us2.d) ((izs) i2h0.c.c).invoke(obj2));
                }
                return arrayList;
            case 12:
                Collection<wwi0.c.C3962c> collection = ((wwi0) obj).c;
                ArrayList arrayList2 = new ArrayList(c5g.u(collection, 10));
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    arrayList2.add(xwi0.a((wwi0.c.C3962c) it.next()));
                }
                return arrayList2;
            case 13:
                return Boolean.valueOf(!((it80) obj).a());
            case 14:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.n(tgi0Var, 0);
                qgi0.u(tgi0Var);
                qgi0.v(tgi0Var, -1.0f);
                qgi0.r(tgi0Var, "StatusPopupCloseButton");
                return s3q0.a;
            case 15:
                L.i((Throwable) obj);
                return s3q0.a;
            case 16:
                return s3q0.a;
            case 17:
                return s3q0.a;
            case 18:
                List<ShortVideoGetHeaderTabsDto> d = ((ShortVideoGetHeaderTabsResponseDto) obj).d();
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it2 = d.iterator();
                while (it2.hasNext()) {
                    String d2 = ((ShortVideoGetHeaderTabsDto) it2.next()).d();
                    if (d2 != null) {
                        arrayList3.add(d2);
                    }
                }
                return arrayList3;
            case 19:
                List list3 = (List) obj;
                Object obj3 = list3.get(0);
                fh9 fh9Var = i2h0.a;
                Boolean bool = Boolean.FALSE;
                us2 us2Var = (epx.f(obj3, bool) || obj3 == null) ? null : (us2) ((izs) fh9Var.c).invoke(obj3);
                Object obj4 = list3.get(1);
                int i3 = qko0.c;
                fh9 fh9Var2 = i2h0.p;
                if (!epx.f(obj4, bool) && obj4 != null) {
                    qko0Var = (qko0) ((izs) fh9Var2.c).invoke(obj4);
                }
                return new tho0(us2Var, qko0Var.a, 4);
            case 20:
                qgi0.r((tgi0) obj, "upload_cell_right_remove");
                return s3q0.a;
            case 21:
                ncq0 ncq0Var = (ncq0) obj;
                return new zcq0(ncq0Var.a, ncq0Var.b, ncq0Var.c);
            case 22:
                tj50.a aVar2 = (tj50.a) obj;
                ojq0 ojq0Var = ojq0.b;
                ao8 ao8Var2 = ao8.d;
                return new zjq0.a.b(aVar2.a(ojq0Var, ao8Var2), aVar2.a(pjq0.b, ao8Var2), aVar2.a(qjq0.b, ao8Var2), aVar2.a(rjq0.b, ao8Var2), aVar2.a(sjq0.b, ao8Var2), aVar2.a(tjq0.b, ao8Var2), aVar2.a(ujq0.b, ao8Var2), aVar2.a(vjq0.b, ao8Var2), aVar2.a(wjq0.b, ao8Var2), aVar2.a(hjq0.b, ao8Var2), aVar2.a(ijq0.b, ao8Var2), aVar2.a(kjq0.b, ao8Var2), aVar2.a(jjq0.b, ao8Var2), aVar2.a(ljq0.b, ao8Var2), aVar2.a(mjq0.b, ao8Var2), aVar2.a(njq0.b, ao8Var2));
            case 23:
                return PublishState.a((PublishState) obj, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, f9k0.e.a, false, false, false, false, -1, 2015);
            case 24:
                wjs0.a(new fyr0((VideoFile) obj));
                return s3q0.a;
            case 25:
                VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section = (VideoDiscoveryCatalogRepository$Section) obj;
                return new sfs0(videoDiscoveryCatalogRepository$Section, Collections.singletonList(videoDiscoveryCatalogRepository$Section));
            case 26:
                rts0.a.a(rts0.c, (VideoMinimizableState) obj);
                return s3q0.a;
            case 27:
                return Boolean.valueOf(((Integer) obj).intValue() < 360);
            case 28:
                return ((io.reactivex.rxjava3.core.q) obj).L(new qw80(new i0r(i), 15), false);
            default:
                int i4 = VideoUploadFragment.S;
                ((gzs) obj).invoke();
                return s3q0.a;
        }
    }
}
