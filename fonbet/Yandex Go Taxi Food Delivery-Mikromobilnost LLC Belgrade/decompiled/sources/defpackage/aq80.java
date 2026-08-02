package defpackage;

import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.address.position_confirmation.j;
import com.yandex.go.places.impl.navigation.discovery.map.a;
import com.yandex.go.places.impl.ui.organizations.OrganizationsModalView;
import com.yandex.go.places.impl.ui.organizations.v2.OrganizationsListV2ModalView;
import com.yandex.messaging.internal.ChatAlias;
import com.yandex.messaging.internal.CreateChannel;
import com.yandex.messaging.internal.CreateFamilyChat;
import com.yandex.messaging.internal.CreateGroupChat;
import com.yandex.messaging.internal.ExistingChat;
import com.yandex.messaging.internal.InviteChat;
import com.yandex.messaging.internal.InviteThread;
import com.yandex.messaging.internal.PrivateChat;
import com.yandex.messaging.internal.StaffChat;
import com.yandex.messaging.internal.ThreadChat;
import com.yandex.messaging.internal.entities.ChatFlags;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.paging.PagedLoader$LoadType;
import com.yandex.plus.pay.ui.yb.api.PlusPayYbCardScenario;
import com.yandex.plus.pay.ui.yb.web.internal.YbWebResult;
import com.yandex.plus.pay.ui.yb.web.internal.ui.PlusPayYbWebActivity;
import com.yandex.plus.pay.ui.yb.web.internal.ui.b;
import io.appmetrica.analytics.IReporter;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import ru.yandex.taxi.cashback.router.c;
import ru.yandex.taxi.requirements.models.domain.PreorderBubbleAvailability;
import ru.yandex.taxi.tariffs.model.TariffSource;

/* loaded from: classes15.dex */
public final class aq80 implements v790, gho, efm0, nlr, k8b, rzb, gn80, twc0, mmd0, ii41, qty {
    public Object a;

    public /* synthetic */ aq80(Object obj) {
        this.a = obj;
    }

    public PreorderBubbleAvailability A(pex0 pex0Var) {
        ynm0 ynm0Var = (ynm0) this.a;
        return pex0Var.a == TariffSource.ZONE_INFO ? PreorderBubbleAvailability.HIDDEN : ynm0Var.d(pex0Var) ? PreorderBubbleAvailability.UNAVAILABLE_IN_TARIFF : (ynm0Var.c(pex0Var) && pex0Var.u && jl40.l(pex0Var.G, "preorder_unavailable_for_due")) ? PreorderBubbleAvailability.UNAVAILABLE_SELECTED_TIME : ynm0Var.c(pex0Var) ? PreorderBubbleAvailability.AVAILABLE : PreorderBubbleAvailability.HIDDEN;
    }

    public void B(yi6 yi6Var) {
        dxc0 dxc0Var = (dxc0) this.a;
        aq80 aq80Var = dxc0Var.a;
        String str = (String) yi6Var.w;
        int i = yi6Var.b;
        ByteBuffer byteBuffer = (ByteBuffer) yi6Var.x;
        swc0 swc0Var = (swc0) ((HashMap) aq80Var.a).get(str);
        if (swc0Var == null) {
            yci0.k(str, "Trying to create a platform view of unregistered type: ");
            return;
        }
        qwc0 create = swc0Var.create(dxc0Var.c, i, byteBuffer != null ? swc0Var.getCreateArgsCodec().a(byteBuffer) : null);
        View view = create.getView();
        if (view == null) {
            ny61.r("PlatformView#getView() returned null, but an Android view reference was expected.");
            return;
        }
        view.setLayoutDirection(yi6Var.c);
        dxc0Var.B.put(i, create);
        FlutterView flutterView = dxc0Var.w;
        if (flutterView == null) {
            return;
        }
        create.onFlutterViewAttached(flutterView);
    }

    public void C(int i) {
        dxc0 dxc0Var = (dxc0) this.a;
        SparseArray sparseArray = dxc0Var.C;
        SparseArray sparseArray2 = dxc0Var.B;
        qwc0 qwc0Var = (qwc0) sparseArray2.get(i);
        if (qwc0Var == null) {
            nnm.q(i, "Disposing unknown platform view with id: ", "PlatformViewsController2");
            return;
        }
        if (qwc0Var.getView() != null) {
            View view = qwc0Var.getView();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        sparseArray2.remove(i);
        try {
            qwc0Var.dispose();
        } catch (RuntimeException e) {
            Log.e("PlatformViewsController2", "Disposing platform view threw an exception", e);
        }
        FlutterMutatorView flutterMutatorView = (FlutterMutatorView) sparseArray.get(i);
        if (flutterMutatorView != null) {
            flutterMutatorView.removeAllViews();
            flutterMutatorView.unsetOnDescendantFocusChangeListener();
            ViewGroup viewGroup2 = (ViewGroup) flutterMutatorView.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(flutterMutatorView);
            }
            sparseArray.remove(i);
        }
    }

    public void D(axc0 axc0Var) {
        int i = axc0Var.a;
        dxc0 dxc0Var = (dxc0) this.a;
        float f = dxc0Var.c.getResources().getDisplayMetrics().density;
        qwc0 qwc0Var = (qwc0) dxc0Var.B.get(i);
        if (qwc0Var == null) {
            nnm.q(i, "Sending touch to an unknown view with id: ", "PlatformViewsController2");
            return;
        }
        View view = qwc0Var.getView();
        if (view == null) {
            nnm.q(i, "Sending touch to a null view with id: ", "PlatformViewsController2");
            return;
        }
        long j = axc0Var.p;
        int i2 = axc0Var.e;
        MotionEvent g = dxc0Var.D.g(new na30(j));
        List<List> list = (List) axc0Var.g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d = f;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d);
            arrayList.add(pointerCoords);
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i2]);
        if (g == null) {
            List<List> list3 = (List) axc0Var.f;
            ArrayList arrayList2 = new ArrayList();
            for (List list4 : list3) {
                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                pointerProperties.id = ((Integer) list4.get(0)).intValue();
                pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
                arrayList2.add(pointerProperties);
            }
            g = MotionEvent.obtain(axc0Var.b.longValue(), axc0Var.c.longValue(), axc0Var.d, axc0Var.e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i2]), pointerCoordsArr, axc0Var.h, axc0Var.i, axc0Var.j, axc0Var.k, axc0Var.l, axc0Var.m, axc0Var.n, axc0Var.o);
        } else if (pointerCoordsArr.length >= 1) {
            g.offsetLocation(pointerCoordsArr[0].x - g.getX(), pointerCoordsArr[0].y - g.getY());
        }
        view.dispatchTouchEvent(g);
    }

    public boolean E(String str, swc0 swc0Var) {
        HashMap hashMap = (HashMap) this.a;
        if (hashMap.containsKey(str)) {
            return false;
        }
        hashMap.put(str, swc0Var);
        return true;
    }

    @Override // defpackage.v790
    public void F(w790 w790Var) {
        b890 b890Var = (b890) this.a;
        b890Var.b.postDelayed(new ud30(9, b890Var, PagedLoader$LoadType.PREPEND, w790Var), 0L);
    }

    @Override // defpackage.ii41
    public void a() {
        b viewModel;
        viewModel = ((PlusPayYbWebActivity) this.a).getViewModel();
        up51 up51Var = viewModel.c;
        String str = viewModel.b;
        PlusPayYbCardScenario plusPayYbCardScenario = viewModel.w;
        ind0 a = up51Var.a.a.a();
        eu90 eu90Var = up51Var.b;
        String d = dio.d(a.a);
        PayUIEvgenAnalytics$YbCardActionScenario a2 = up51.a(plusPayYbCardScenario);
        LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "url", str);
        t.put("action_scenario", a2.getEventValue());
        t.put("_meta", eu90.c(new HashMap()));
        eu90Var.f("OpeningYbCard.WebView.Loaded", t);
    }

    @Override // defpackage.efm0
    public void b(anh anhVar, String str) {
        n891.n(new uga0((ljh) this.a, anhVar, str, 1));
    }

    @Override // defpackage.k8b
    public Object c(ExistingChat existingChat) {
        p1b0 p1b0Var = (p1b0) this.a;
        p2b h = p1b0Var.a().h(existingChat.id());
        if (h != null) {
            return ci91.g(h);
        }
        return null;
    }

    @Override // defpackage.ii41
    public void d() {
        b viewModel;
        viewModel = ((PlusPayYbWebActivity) this.a).getViewModel();
        viewModel.Y("auth_required");
    }

    @Override // defpackage.ii41
    public void e(String str) {
        b viewModel;
        viewModel = ((PlusPayYbWebActivity) this.a).getViewModel();
        viewModel.getClass();
        viewModel.x = YbWebResult.Error.INSTANCE;
        up51 up51Var = viewModel.c;
        String str2 = viewModel.b;
        PlusPayYbCardScenario plusPayYbCardScenario = viewModel.w;
        ind0 a = up51Var.a.a.a();
        eu90 eu90Var = up51Var.b;
        String d = dio.d(a.a);
        PayUIEvgenAnalytics$YbCardActionScenario a2 = up51.a(plusPayYbCardScenario);
        LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "url", str2);
        t.put("action_scenario", a2.getEventValue());
        t.put("fail_reason", str);
        t.put("_meta", eu90.c(new HashMap()));
        eu90Var.f("OpeningYbCard.WebView.Fail", t);
        viewModel.W();
    }

    @Override // defpackage.rzb
    public void f() {
        ((j) this.a).d();
    }

    @Override // defpackage.ii41
    public void g(String str, boolean z) {
    }

    @Override // defpackage.ii41
    public void h(String str) {
        b viewModel;
        viewModel = ((PlusPayYbWebActivity) this.a).getViewModel();
        viewModel.getClass();
        viewModel.x = new YbWebResult.SuccessOpenCard(str);
        viewModel.c.b(viewModel.b, viewModel.w, str);
        viewModel.W();
    }

    @Override // defpackage.ii41
    public void i() {
        b viewModel;
        viewModel = ((PlusPayYbWebActivity) this.a).getViewModel();
        viewModel.getClass();
        viewModel.x = YbWebResult.SuccessTopupCard.INSTANCE;
        viewModel.c.b(viewModel.b, viewModel.w, null);
        viewModel.W();
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object j(CreateChannel createChannel) {
        return null;
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object k(InviteThread inviteThread) {
        return null;
    }

    @Override // defpackage.ii41
    public void l(String str) {
        b viewModel;
        viewModel = ((PlusPayYbWebActivity) this.a).getViewModel();
        viewModel.Y(str);
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object m(InviteChat inviteChat) {
        return null;
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object n(StaffChat staffChat) {
        return null;
    }

    @Override // defpackage.ii41
    public void o() {
        b viewModel;
        viewModel = ((PlusPayYbWebActivity) this.a).getViewModel();
        viewModel.X();
    }

    @Override // defpackage.rzb
    public void onCancel() {
        ((j) this.a).a();
    }

    @Override // defpackage.qty
    public void onChanged(int i, int i2, Object obj) {
        int i3 = i2 + i;
        while (i < i3) {
            erd0 erd0Var = (erd0) this.a;
            View childAt = ((ViewGroup) erd0Var.a).getChildAt(i);
            if (childAt == null) {
                v8o v8oVar = (v8o) erd0Var.b;
                ((IReporter) v8oVar.b.getValue()).reportError("PlusViewGroupAdapter: make dirty by pos", oyr.i(i, "Has not child at position "), new IllegalStateException());
            } else {
                erd0Var.c(childAt);
            }
            i++;
        }
    }

    @Override // defpackage.nlr
    public void onClose() {
        ((doa0) ((hoa0) this.a).x.a).r(new qu(9));
    }

    @Override // defpackage.v790
    public void onError() {
        b890 b890Var = (b890) this.a;
        b890Var.b.post(new sd30(26, b890Var, PagedLoader$LoadType.PREPEND));
    }

    @Override // defpackage.qty
    public void onInserted(int i, int i2) {
        erd0 erd0Var = (erd0) this.a;
        ViewGroup viewGroup = (ViewGroup) erd0Var.a;
        int i3 = i2 + i;
        while (i < i3) {
            crd0 e = erd0Var.e(viewGroup, i);
            View view = e.a;
            view.setTag(cfh0.micro_widget_view_holder_tag, e);
            view.setLayoutDirection(viewGroup.getLayoutDirection());
            ((ArrayList) erd0Var.w).add(i, e);
            e.b = true;
            viewGroup.addView(view, i);
            i++;
        }
    }

    @Override // defpackage.qty
    public void onMoved(int i, int i2) {
        erd0 erd0Var = (erd0) this.a;
        ViewGroup viewGroup = (ViewGroup) erd0Var.a;
        View childAt = viewGroup.getChildAt(i);
        erd0Var.c(childAt);
        viewGroup.removeViewAt(i);
        viewGroup.addView(childAt, i2);
        ArrayList arrayList = (ArrayList) erd0Var.w;
        arrayList.add(i2, arrayList.remove(i));
    }

    @Override // defpackage.qty
    public void onRemoved(int i, int i2) {
        erd0 erd0Var = (erd0) this.a;
        for (int i3 = 0; i3 < i2; i3++) {
            ((ViewGroup) erd0Var.a).removeViewAt(i);
            ((ArrayList) erd0Var.w).remove(i);
        }
    }

    @Override // defpackage.mmd0
    public void openUrl(String str) {
        ((oqd0) ((a46) this.a).J).b(str, false, true);
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object p(ChatAlias chatAlias) {
        return null;
    }

    @Override // defpackage.gn80
    public void q(boolean z) {
        a aVar = (a) this.a;
        a.o0(aVar, true);
        a.j0(aVar, qoi0.a(z ? OrganizationsListV2ModalView.class : OrganizationsModalView.class));
    }

    @Override // defpackage.mmd0
    public void r() {
        ((c) ((s3d0) ((a46) this.a).K).d.getValue()).i();
    }

    @Override // defpackage.gn80
    public void s(boolean z) {
        a.i0((a) this.a, qoi0.a(z ? OrganizationsListV2ModalView.class : OrganizationsModalView.class));
    }

    @Override // defpackage.k8b
    public Object t(ThreadChat threadChat) {
        p1b0 p1b0Var = (p1b0) this.a;
        p2b h = p1b0Var.a().h(threadChat.getThreadId());
        if (h == null) {
            return null;
        }
        String str = h.b;
        p2b h2 = p1b0Var.a().h(new ChatId.ThreadId(str).c().a);
        if (h2 == null) {
            return null;
        }
        long j = h.a;
        Long l = h.g;
        Long l2 = h.h;
        String str2 = h2.c;
        long j2 = h2.d;
        String str3 = h2.e;
        boolean z = h2.f;
        return new o1b0(j, str, str2, ChatFlags.a(j2, 1L), ChatFlags.a(j2, 8L), ChatFlags.a(j2, 4L), ChatFlags.a(j2, 128L), str3, l, l2, ChatFlags.a(j2, 64L), z, ChatFlags.a(j2, 16L));
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object u(CreateFamilyChat createFamilyChat) {
        return null;
    }

    @Override // defpackage.k8b
    public Object v() {
        p1b0 p1b0Var = (p1b0) this.a;
        Long l = (Long) androidx.room.util.a.b(p1b0Var.a().a, true, false, new rfa(23));
        if (l == null) {
            return null;
        }
        p2b p2bVar = (p2b) androidx.room.util.a.b(p1b0Var.a().a, true, false, new hcb(l.longValue(), 11));
        if (p2bVar != null) {
            return ci91.g(p2bVar);
        }
        return null;
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object w(CreateGroupChat createGroupChat) {
        return null;
    }

    @Override // defpackage.mmd0
    public void x(String str) {
        ((a46) this.a).r(new dcc0(str, 3));
    }

    @Override // defpackage.mmd0
    public void y() {
        ((a46) this.a).r(new qu(9));
    }

    @Override // defpackage.k8b
    public Object z(PrivateChat privateChat) {
        p2b p2bVar = (p2b) androidx.room.util.a.b(((p1b0) this.a).a().a, true, false, new b5a(privateChat.addressee(), 14));
        if (p2bVar != null) {
            return ci91.g(p2bVar);
        }
        return null;
    }
}
