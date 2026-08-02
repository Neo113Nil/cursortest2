package xsna;

import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.likes.dto.LikesAddResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.j;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.dialogslist.impl.list.adapter.DialogsListAdapter;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.TagsSuggestions;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.file_picker.external.ExternalFilePickerFragment;
import com.vk.file_picker.external.e;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vkontakte.android.data.b;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.e4n;
import xsna.gm50;
import xsna.hg1;
import xsna.lgg;
import xsna.m6e;
import xsna.qms;
import xsna.tj50;
import xsna.ukl;
import xsna.xxl;
import xsna.xyq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class j6e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j6e(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v62, types: [T, android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r2v12, types: [xsna.rag] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 12;
        boolean z = false;
        z = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                m6e.a aVar = (m6e.a) obj2;
                int intValue = ((Integer) obj).intValue();
                n0f n0fVar = aVar.i;
                RecyclerView recyclerView = aVar.a;
                if (!n0fVar.g) {
                    dux duxVar = n0fVar.c;
                    rvx a = duxVar != null ? duxVar.a(intValue) : null;
                    if (a != null) {
                        n0fVar.n(new qxr(a.a, a.b, intValue), recyclerView);
                    }
                }
                return s3q0.a;
            case 1:
                tj50.a aVar2 = (tj50.a) obj;
                ((com.vk.clips.attachments.impl.publish.geolocation.presentation.i) ((com.vk.clips.attachments.impl.publish.geolocation.presentation.g) obj2).d.getValue()).getClass();
                nt ntVar = new nt(19);
                ao8 ao8Var = ao8.d;
                return new j.b(aVar2.a(ntVar, ao8Var), aVar2.a(com.vk.clips.attachments.impl.publish.geolocation.presentation.h.b, ao8Var));
            case 2:
                Throwable th = (Throwable) obj;
                h03.b(th);
                L.g("ClipsTemplateEditorCropperActionsHandlerImpl", th);
                ((o6f) obj2).j7();
                return s3q0.a;
            case 3:
                iag iagVar = (iag) obj2;
                iagVar.f0(true);
                iagVar.f(((LikesAddResponseDto) obj).l1());
                return iagVar;
            case 4:
                Throwable th2 = (Throwable) obj;
                ?? r2 = ((mdg) obj2).e;
                r2.k0();
                if ((th2 instanceof VKApiExecutionException) && ((VKApiExecutionException) th2).s() == 15) {
                    r2.P5();
                }
                return s3q0.a;
            case 5:
                xeg xegVar = (xeg) obj2;
                xegVar.n = false;
                io.reactivex.rxjava3.subjects.f<lgg> fVar = xegVar.m;
                fVar.onNext(lgg.g.a);
                fVar.onNext(new lgg.f(true));
                io.reactivex.rxjava3.subjects.d<rag> dVar = xegVar.k;
                dVar.onNext(dVar.P0() != null ? new rag(null, dVar.P0().b, null) : null);
                return s3q0.a;
            case 6:
                String str = (String) ((Triple) obj).k();
                UserId userId = ((arg) obj2).k;
                Set<String> set = p0e0.a;
                b.d dVar2 = new b.d("groups_addresses");
                dVar2.b("build_route", "action");
                dVar2.b(str, "service");
                dVar2.b(userId, "group_id");
                dVar2.e();
                return s3q0.a;
            case 7:
                int i3 = CommunityProfileFragment.k0;
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) ((CommunityProfileFragment) obj2).d0.getValue();
                hg1.x0 x0Var = new hg1.x0(CommunityProfileFragment.g.b);
                qVar.getClass();
                return new io.reactivex.rxjava3.internal.operators.single.e0(new io.reactivex.rxjava3.internal.operators.observable.i0(qVar, x0Var).U(new hg1.w0(CommunityProfileFragment.h.b)).K().r(3000L, TimeUnit.MILLISECONDS), new yi2(new ol(14), i2));
            case 8:
                ((arh) obj2).d.b((io.reactivex.rxjava3.disposables.c) obj);
                return s3q0.a;
            case 9:
                int intValue2 = ((Integer) obj).intValue();
                e2g0 e2g0Var = ((CommunityReviewsFragment) obj2).S;
                if (e2g0Var != null) {
                    e2g0Var.i(intValue2);
                }
                return s3q0.a;
            case 10:
                com.vk.profile.community.impl.ui.view.a aVar3 = (com.vk.profile.community.impl.ui.view.a) obj2;
                aVar3.f.invoke();
                aVar3.e.g();
                return s3q0.a;
            case 11:
                rdi.y((z0k) obj2, new w0k(((Boolean) obj).booleanValue(), z ? 1 : 0));
                return s3q0.a;
            case 12:
                ((zak0) ((ygk) obj2).p).setValue((zhf0) obj);
                return s3q0.a;
            case 13:
                ((Ref$ObjectRef) obj2).element = xa4.K(jgz.j((tny) obj, true));
                return s3q0.a;
            case 14:
                ocl oclVar = (ocl) obj2;
                vqt vqtVar = (vqt) obj;
                oclVar.o = vqtVar.d;
                oclVar.u(vqtVar);
                return s3q0.a;
            case 15:
                Throwable th3 = (Throwable) obj;
                ukl.a aVar4 = ((ukl) obj2).a;
                if (aVar4 != null) {
                    aVar4.d(th3, null);
                }
                return s3q0.a;
            case 16:
                wxl wxlVar = (wxl) obj2;
                tj50.a aVar5 = (tj50.a) obj;
                wyl wylVar = wxlVar.e;
                rxl rxlVar = new rxl(1, wylVar, wyl.class, "map", "map(Lcom/vk/ecomm/cart/impl/points_map/feature/state/DeliveryPointsMapState;)Lcom/vk/ecomm/cart/impl/points_map/ui/state/DeliveryPointsMapViewState$Map;", 0);
                ao8 ao8Var2 = ao8.d;
                return new xxl.c(aVar5.a(rxlVar, ao8Var2), aVar5.a(new sxl(1, wxlVar.f, xyl.class, "map", "map(Lcom/vk/ecomm/cart/impl/points_map/feature/state/DeliveryPointsMapState;)Lcom/vk/ecomm/cart/impl/points_map/ui/state/DeliveryPointsMapViewState$Sheet;", 0), ao8Var2), aVar5.a(new txl(1, wylVar, wyl.class, "mapCLusterItems", "mapCLusterItems(Lcom/vk/ecomm/cart/impl/points_map/feature/state/DeliveryPointsMapState;)Lcom/vk/ecomm/cart/impl/points_map/ui/state/DeliveryPointsMapViewState$ClusterItems;", 0), ao8Var2), aVar5.a(new uxl(1, wylVar, wyl.class, "mapSelectedDeliveryPointMarker", "mapSelectedDeliveryPointMarker(Lcom/vk/ecomm/cart/impl/points_map/feature/state/DeliveryPointsMapState;)Lcom/vk/ecomm/cart/impl/points_map/ui/state/DeliveryPointsMapViewState$SelectedDeliveryPointMarker;", 0), ao8Var2), aVar5.a(new vxl(1, wylVar, wyl.class, "mapUserLocation", "mapUserLocation(Lcom/vk/ecomm/cart/impl/points_map/feature/state/DeliveryPointsMapState;)Lcom/vk/ecomm/cart/impl/points_map/ui/state/DeliveryPointsMapViewState$UserLocation;", 0), ao8Var2));
            case 17:
                return new gm20((ViewGroup) obj, ((DialogsListAdapter) obj2).j);
            case 18:
                mwm mwmVar = (mwm) obj2;
                a1w a1wVar = mwmVar.b;
                return a1wVar.C(mwmVar, new tpu(Collections.singletonList(a1wVar.q()), Source.CACHE, z, i2));
            case 19:
                ((e4n.a) obj2).a();
                return s3q0.a;
            case 20:
                int intValue3 = ((Integer) obj).intValue();
                u1c0 u1c0Var = ((n1o) obj2).F;
                if (u1c0Var != null) {
                    u1c0Var.f = intValue3;
                }
                return s3q0.a;
            case 21:
                TagsSuggestions tagsSuggestions = (TagsSuggestions) obj2;
                u1c0 u1c0Var2 = (u1c0) obj;
                if (u1c0Var2.c == 147 && u1c0Var2.a == tagsSuggestions) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 22:
                ExternalFilePickerFragment externalFilePickerFragment = (ExternalFilePickerFragment) obj2;
                int i4 = ExternalFilePickerFragment.R;
                gm50.a.a(externalFilePickerFragment, ((e.b) obj).a, new e60(25));
                externalFilePickerFragment.Mf(0, null);
                return s3q0.a;
            case 23:
                tgi0 tgi0Var = (tgi0) obj;
                String str2 = (String) ((zak0) ((xyq.b) obj2).d).getValue();
                if (str2 == null) {
                    str2 = "";
                }
                qgi0.h(tgi0Var, str2);
                return s3q0.a;
            case 24:
                ((m6r) obj2).a.d(new PostingAction.Fetch.LoadedLocalSettings((PostingSettings) obj));
                return s3q0.a;
            case 25:
                ((z0s) obj2).c.d(j580.b);
                return s3q0.a;
            case 26:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) ((fxt0) obj2).g).setValue(bool);
                return s3q0.a;
            case 27:
                return new p990((ViewGroup) obj, ((hks) obj2).i);
            case 28:
                qms qmsVar = (qms) obj2;
                int i5 = qms.c.$EnumSwitchMapping$0[((qms.a) qms.a.h().get(((ModalActionSheetListItem) obj).a)).ordinal()];
                if (i5 == 1) {
                    qms.b bVar = qmsVar.f;
                    if (bVar != null) {
                        bVar.b.invoke();
                    }
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qms.b bVar2 = qmsVar.g;
                    if (bVar2 != null) {
                        bVar2.b.invoke();
                    }
                }
                return s3q0.a;
            default:
                ((com.vk.attachpicker.fragment.gallery.c) obj2).k = true;
                return ((ViewPropertyAnimator) obj).alpha(1.0f).translationX(cn70.c(-68)).setDuration(300L);
        }
    }
}
