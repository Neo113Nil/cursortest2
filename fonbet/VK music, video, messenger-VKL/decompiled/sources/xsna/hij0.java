package xsna;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.auth.changepassword.VkChangePasswordActivity;
import com.vk.catalog2.common.ui.mvp.video.VideoCatalogAlbumBottomSheet;
import com.vk.common.links.LaunchContext;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.photo.Photo;
import com.vk.dto.video.VideoAlbum;
import com.vk.ecomm.market.attached.TaggedItemsBottomSheet;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.api.onboarding.Onboarding;
import com.vk.libvideo.bottomsheet.about.delegate.f0;
import com.vk.lists.DefaultErrorView;
import com.vk.log.L;
import com.vk.money.createtransfer.input.TransferInputField;
import com.vk.money.createtransfer.input.TransferInputFieldView;
import com.vk.newsfeed.impl.discover.themed.ThemedFeedToolbarFragment;
import com.vk.stories.design.view.stats.tabs.info.mvi.d;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.ui.VkTextFieldView;
import com.vk.superapp.vkpay.checkout.core.ui.views.VkCardForm;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.profile.presentation.a;
import com.vk.video.profile.presentation.f;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoverySideEffect;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.bex0;
import xsna.fh8;
import xsna.g0x0;
import xsna.m7a0;
import xsna.owm;
import xsna.x9m0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hij0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hij0(Context context, VideoAlbum videoAlbum) {
        this.b = 12;
        this.c = videoAlbum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = false;
        Object obj2 = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                List c = pn60.c(((iij0) obj3).b, (NewsEntry) obj, null, null, 14);
                ArrayList E = g5g.E(c, z1c0.class);
                z1c0 z1c0Var = (z1c0) j5g.a0(E);
                if (z1c0Var != null) {
                    int i2 = z1c0Var.i;
                    ArrayList arrayList = new ArrayList(c5g.u(E, 10));
                    Iterator it = E.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((z1c0) it.next()).h);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        u1c0 u1c0Var = (u1c0) it2.next();
                        if (u1c0Var.c == 263) {
                            arrayList2.add(lbs.c(u1c0Var, null, null, 199, 3));
                        } else {
                            arrayList2.add(u1c0Var);
                        }
                    }
                    break;
                }
                break;
            case 1:
                ((clj0) obj3).e.invoke(fh8.k.c.a);
                break;
            case 2:
                gyl0 presenter = ((myl0) obj3).getPresenter();
                if (presenter != null) {
                    presenter.cancel();
                }
                break;
            case 3:
                ((l3m0) obj3).m.c();
                break;
            case 4:
                n7m0 n7m0Var = (n7m0) obj3;
                ((d7m0) n7m0Var.b).Y();
                n7m0Var.d.j();
                break;
            case 5:
                ((p9m0) obj3).T(new x9m0.a((List) obj));
                break;
            case 6:
                ((com.vk.stories.design.view.stats.tabs.info.mvi.b) obj3).T(new d.c((Throwable) obj));
                break;
            case 7:
                g010 g010Var = (g010) obj3;
                bwx bwxVar = (bwx) obj;
                int i3 = TaggedItemsBottomSheet.o1;
                List<a210> list = bwxVar.a;
                boolean z2 = bwxVar.b;
                RecyclerView recyclerView = g010Var.j;
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                Parcelable onSaveInstanceState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
                g010Var.setItems(list);
                if (z2) {
                    Iterator<T> it3 = g010Var.h.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next = it3.next();
                            if (((hfz) next).getClass().equals(z110.class)) {
                                obj2 = next;
                            }
                        }
                    }
                    if (((hfz) obj2) == null) {
                        g010Var.setItems(j5g.v0(z110.b, g010Var.h));
                    }
                }
                RecyclerView.o layoutManager2 = recyclerView.getLayoutManager();
                if (layoutManager2 != null) {
                    layoutManager2.onRestoreInstanceState(onSaveInstanceState);
                }
                break;
            case 8:
                ThemedFeedToolbarFragment themedFeedToolbarFragment = (ThemedFeedToolbarFragment) obj3;
                Throwable th = (Throwable) obj;
                DefaultErrorView defaultErrorView = themedFeedToolbarFragment.R;
                if (defaultErrorView != null) {
                    defaultErrorView.setVisibility(0);
                }
                View view = themedFeedToolbarFragment.S;
                if (view != null) {
                    view.setVisibility(8);
                }
                L.E(th, new Object[0]);
                break;
            case 9:
                TransferInputFieldView transferInputFieldView = (TransferInputFieldView) obj3;
                CharSequence charSequence = (CharSequence) obj;
                int i4 = TransferInputFieldView.p;
                boolean z3 = charSequence.length() == 0;
                TextView textView = transferInputFieldView.j;
                if (z3) {
                    textView.setVisibility(0);
                } else {
                    f4m.j(textView);
                }
                TransferInputField.a aVar = transferInputFieldView.n;
                if (aVar != null) {
                    aVar.b(charSequence.toString());
                }
                break;
            case 10:
                ((wh50) obj3).setValue((String) obj);
                break;
            case 11:
                tuq0 tuq0Var = (tuq0) obj3;
                List<Photo> list2 = ((m7a0.b) obj).a;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it4 = list2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            Photo photo = (Photo) it4.next();
                            if (photo.d == -6 && epx.f(photo.e, tuq0Var.a.a())) {
                                z = true;
                            }
                        }
                    }
                }
                break;
            case 12:
                VideoAlbum videoAlbum = (VideoAlbum) obj3;
                boolean z4 = videoAlbum.l;
                videoAlbum.l = !z4;
                if (z4) {
                    wjs0.a(new jwr0(videoAlbum, "albums_unsubscribe"));
                } else {
                    wjs0.a(new jwr0(videoAlbum, "albums_subscribe"));
                    if (VideoCatalogAlbumBottomSheet.a.i != null) {
                        Onboarding onboarding = Onboarding.TwoStep;
                    }
                }
                break;
            case 13:
                maz.c(xwk.d().e(), ((f0.a) obj3).itemView.getContext(), (String) obj, LaunchContext.A, null, null, 24);
                break;
            case 14:
                ((com.vk.video.ui.discovery.minimizable.g) obj3).J.b(VideoMinimizableDiscoverySideEffect.b.a);
                break;
            case 15:
                int i5 = VideoProfileFragmentOld.p0;
                xn50.a.c((VideoProfileFragmentOld) obj3, new a.l((AdminLeaveAction) obj));
                break;
            case 16:
                ((h9t0) obj3).e.invoke(f.h.c.b);
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                break;
            case 17:
                ((abt0) obj3).l = new q190();
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                ((q9u0) obj3).O(owm.g.b);
                break;
            case 21:
                VkCardForm vkCardForm = (VkCardForm) obj3;
                VkTextFieldView vkTextFieldView = vkCardForm.b;
                (vkTextFieldView != null ? vkTextFieldView : null).c.setBackgroundResource(R.drawable.vkui_bg_edittext);
                izs<? super VkCardForm.b, s3q0> izsVar = vkCardForm.f;
                if (izsVar != null) {
                    izsVar.invoke(vkCardForm.getCardData());
                }
                break;
            case 22:
                VkChangePasswordActivity vkChangePasswordActivity = (VkChangePasswordActivity) obj3;
                JSONObject jSONObject = (JSONObject) obj;
                int i6 = VkChangePasswordActivity.m;
                if (jSONObject != null) {
                    vkChangePasswordActivity.setResult(-1);
                    vkChangePasswordActivity.finish();
                    r3y.b();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 1);
                    break;
                }
                break;
            case 23:
                r6y r6yVar = ((pvv0) obj3).b;
                if (r6yVar != null) {
                    bex0.a.a(r6yVar, JsApiMethodType.OPEN_CONTACTS, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
                }
                break;
            case 24:
                int i7 = ykw0.j1;
                ((ykw0) obj3).getFeature().C((vkw0) obj);
                break;
            default:
                ((j0x0) obj3).T(new g0x0.a.b((Throwable) obj));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ hij0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
