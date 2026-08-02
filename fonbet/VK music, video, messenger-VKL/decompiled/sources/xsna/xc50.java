package xsna;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.vk.api.photos.PhotosGetAlbums;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.bridges.ImageViewer;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.segmented.control.VkSegmentedControl;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.feed.design.compose.posting.preview.spinner.PostingSpinnerSize;
import com.vk.feed.settings.impl.presentation.filtered.NewsfeedFilteredSourcesFragment;
import com.vk.feed.settings.impl.presentation.filtered.f;
import com.vk.feed.tool.view.posting.preview.attachment.PreviewAttachmentWrapper;
import com.vk.lists.DefaultErrorView;
import com.vk.log.L;
import com.vk.newsfeed.impl.discover.repository.TemporaryCache;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.impl.domain.model.CropCarouselType;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$Editing$CropPhoto$SetCurrentRatio;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.voip.ui.sessionrooms.f;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a1u0;
import xsna.aq;
import xsna.cda0;
import xsna.eeu0;
import xsna.gm50;
import xsna.gpu;
import xsna.h1p0;
import xsna.h7u0;
import xsna.khm0;
import xsna.oea0;
import xsna.tj50;
import xsna.wai0;
import xsna.ywi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class xc50 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xc50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        CropCarouselType cropCarouselType;
        int i = this.b;
        int i2 = 5;
        int i3 = 8;
        int i4 = 3;
        Bitmap bitmap = null;
        boolean z = false;
        r7 = false;
        boolean z2 = false;
        z = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                yc50 yc50Var = (yc50) obj2;
                ((nc50) yc50Var.v1.getValue()).a((mc50) obj, yc50Var.kn(), yc50Var.requireArguments().getBoolean("FORCE_DARK_THEME", false));
                return s3q0.a;
            case 1:
                aq.b bVar = (aq.b) obj;
                return ((zi50) obj2).a(bVar.a).l(new i3u(new ba40(bVar, i2), 6));
            case 2:
                TextView textView = ((e860) obj2).k1;
                (textView != null ? textView : null).setEnabled(false);
                return s3q0.a;
            case 3:
                NewsfeedFilteredSourcesFragment newsfeedFilteredSourcesFragment = (NewsfeedFilteredSourcesFragment) obj2;
                f.a aVar = (f.a) obj;
                int i5 = NewsfeedFilteredSourcesFragment.a0;
                gm50.a.a(newsfeedFilteredSourcesFragment, aVar.a, new i750(newsfeedFilteredSourcesFragment, i4));
                gm50.a.a(newsfeedFilteredSourcesFragment, aVar.d, new u3u(newsfeedFilteredSourcesFragment, 18));
                gm50.a.a(newsfeedFilteredSourcesFragment, aVar.c, new bjk(newsfeedFilteredSourcesFragment, 22));
                gm50.a.a(newsfeedFilteredSourcesFragment, aVar.b, new el30(newsfeedFilteredSourcesFragment, i3));
                return s3q0.a;
            case 4:
                yp80 yp80Var = (yp80) obj2;
                Throwable th = (Throwable) obj;
                if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == 104) {
                    if (yp80Var != null) {
                        yp80Var.U();
                    }
                } else if (yp80Var != null) {
                    yp80Var.onError(th);
                }
                return s3q0.a;
            case 5:
                aha0 aha0Var = ((cda0) obj2).a;
                cda0.a aVar2 = (cda0.a) obj;
                List<oea0.a> list = aVar2.a;
                List<oea0.a> list2 = aVar2.b;
                return io.reactivex.rxjava3.core.a.n(!list.isEmpty() ? new io.reactivex.rxjava3.internal.operators.observable.b1(rsg0.T(yfb.x(aha0Var.o(cda0.e(aVar2.a), Boolean.TRUE)))) : io.reactivex.rxjava3.internal.operators.completable.i.b, !list2.isEmpty() ? new io.reactivex.rxjava3.internal.operators.observable.b1(rsg0.T(yfb.x(aha0Var.o(cda0.e(list2), Boolean.FALSE)))) : io.reactivex.rxjava3.internal.operators.completable.i.b);
            case 6:
                lha0 lha0Var = (lha0) obj2;
                BasePhotoListFragment basePhotoListFragment = lha0Var.c;
                ((hha0) basePhotoListFragment).P((PhotosGetAlbums.a) obj);
                ((hha0) basePhotoListFragment).q();
                com.vk.lists.c cVar = lha0Var.d;
                (cVar != null ? cVar : null).p(true);
                return s3q0.a;
            case 7:
                hpb0 hpb0Var = (hpb0) obj2;
                inb0 inb0Var = (inb0) obj;
                try {
                    bitmap = kd7.b(inb0Var.e, y8g0.a(R.dimen.poll_bg_view_holder_width), y8g0.a(R.dimen.poll_bg_small_height), false, false);
                } catch (Exception unused) {
                }
                inb0Var.f = bitmap;
                ng<? extends Object> ngVar = hpb0Var.n;
                ((jnb0) ngVar).c0(inb0Var);
                hpb0Var.i().getRecyclerView().scrollToPosition(ngVar.getItemCount() - 1);
                return s3q0.a;
            case 8:
                mdc0 mdc0Var = (mdc0) obj;
                h0c0 h0c0Var = ((enc0) obj2).p;
                h0c0Var.f = mdc0Var;
                pcc0 pcc0Var = h0c0Var.g;
                if (pcc0Var != null) {
                    boolean l = hg10.l(mdc0Var);
                    a4d0 a4d0Var = pcc0Var.n.g;
                    if (a4d0Var != null) {
                        a4d0Var.U6(l);
                    }
                }
                if (pcc0Var != null) {
                    PhotoVideoDisplayMode photoVideoDisplayMode = mdc0Var.b;
                    a4d0 a4d0Var2 = pcc0Var.n.g;
                    if (a4d0Var2 != null) {
                        qor qorVar = a4d0Var2.J;
                        boolean z3 = photoVideoDisplayMode == PhotoVideoDisplayMode.Grid;
                        a4d0Var2.N.c = !z3;
                        Object[] objArr = qorVar.g != z3;
                        qorVar.g = z3;
                        fsk fskVar = qorVar.k;
                        gzs<s3d0> gzsVar = qorVar.f;
                        fskVar.getClass();
                        qorVar.l = !z3 ? new nv9(gzsVar) : new mgu(gzsVar);
                        if (objArr != false) {
                            qorVar.removeAllViews();
                            bpr bprVar = qorVar.n;
                            qorVar.d(bprVar != null ? bprVar.b(qorVar) : EmptyList.b);
                        }
                        qorVar.requestLayout();
                        qorVar.invalidate();
                        bwt0.Q(qorVar, R.id.posting_ui_test_photo_video_display_mode_tag, photoVideoDisplayMode);
                    }
                }
                if (pcc0Var != null) {
                    boolean l2 = hg10.l(h0c0Var.f);
                    a1u0.a aVar3 = new a1u0.a(l2);
                    pcc0Var.p = aVar3;
                    a4d0 a4d0Var3 = pcc0Var.n.g;
                    if (a4d0Var3 != null) {
                        pbq pbqVar = a4d0Var3.G;
                        pbqVar.q = aVar3;
                        Iterator it = pbqVar.o.iterator();
                        while (it.hasNext()) {
                            ce6 ce6Var = (ce6) it.next();
                            if (ce6Var instanceof ykw) {
                                ykw ykwVar = (ykw) ce6Var;
                                ykwVar.u = aVar3;
                                zjc0 zjc0Var = ykwVar.t;
                                zjc0Var.b = aVar3;
                                PreviewAttachmentWrapper previewAttachmentWrapper = zjc0Var.a;
                                previewAttachmentWrapper.setSpinnerSize(l2 ? PostingSpinnerSize.Regular : PostingSpinnerSize.Large);
                                previewAttachmentWrapper.setSpinnerScreen(!zjc0Var.b.a);
                            } else if (ce6Var instanceof mps0) {
                                mps0 mps0Var = (mps0) ce6Var;
                                mps0Var.f = aVar3;
                                zjc0 zjc0Var2 = mps0Var.h;
                                zjc0Var2.b = aVar3;
                                PreviewAttachmentWrapper previewAttachmentWrapper2 = zjc0Var2.a;
                                previewAttachmentWrapper2.setSpinnerSize(l2 ? PostingSpinnerSize.Regular : PostingSpinnerSize.Large);
                                previewAttachmentWrapper2.setSpinnerScreen(!zjc0Var2.b.a);
                            }
                        }
                    }
                }
                if (pcc0Var != null) {
                    boolean z4 = mdc0Var.a;
                    a4d0 a4d0Var4 = pcc0Var.n.g;
                    if (a4d0Var4 != null) {
                        VkButton vkButton = a4d0Var4.M;
                        FrameLayout frameLayout = a4d0Var4.L;
                        if (frameLayout != null) {
                            bwt0.p0(frameLayout, z4);
                        }
                        if (vkButton != null) {
                            bwt0.p0(vkButton, z4);
                        }
                        View view = a4d0Var4.K;
                        if (view != null) {
                            if (vkButton != null && bwt0.K(vkButton)) {
                                z = true;
                            }
                            bwt0.p0(view, z);
                        }
                    }
                }
                mu9 mu9Var = h0c0Var.i;
                if (hg10.l(mdc0Var)) {
                    mu9Var.getClass();
                } else {
                    izs<PostingAction, s3q0> izsVar = mu9Var.b;
                    try {
                        cropCarouselType = CropCarouselType.valueOf(cqm0.n(mu9Var.c.invoke()));
                    } catch (IllegalArgumentException unused2) {
                        cropCarouselType = CropCarouselType.FIRST;
                    }
                    izsVar.invoke(new PostingAction$Editing$CropPhoto$SetCurrentRatio(cropCarouselType));
                }
                return s3q0.a;
            case 9:
                tdu tduVar = (tdu) obj;
                float floatValue = ((t2d0) obj2).s.d().floatValue();
                tduVar.A(floatValue);
                tduVar.B(floatValue);
                return s3q0.a;
            case 10:
                ((rzq0) obj).b(j5g.H0(((lcd0) obj2).b, 3), a020.b);
                return s3q0.a;
            case 11:
                com.vk.ecomm.market.good.ui.e eVar = (com.vk.ecomm.market.good.ui.e) obj2;
                com.vk.ecomm.market.good.ui.c cVar2 = eVar.l;
                eVar.e(cVar2 != null ? cVar2.e : null, true, eVar.e.getContext());
                return s3q0.a;
            case 12:
                izd0 izd0Var = (izd0) obj2;
                VKList vKList = (VKList) obj;
                g5g.y(vKList, izd0Var.f);
                izd0Var.b = vKList.j();
                izd0Var.a = vKList.size() + izd0Var.a;
                izd0Var.c = vKList.i();
                ImageViewer.c<Photo> cVar3 = izd0Var.h;
                if (cVar3 != null) {
                    cVar3.c(vKList);
                }
                return s3q0.a;
            case 13:
                TextView textView2 = new TextView(((VkSegmentedControl) obj2).getContext());
                textView2.setTextAppearance(R.style.VkUiTypography_Headline2);
                dhr0 dhr0Var = dhr0.a;
                l7s u = bwt0.u(textView2.getContext());
                dhr0Var.getClass();
                textView2.setTextColor(dhr0.f.a(R.attr.vk_ui_text_primary, u));
                textView2.setTextAlignment(4);
                textView2.setMaxLines(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setText(((TabLayout.g) obj).c);
                return textView2;
            case 14:
                UserId userId = (UserId) obj2;
                gpu gpuVar = (gpu) obj;
                if ((gpuVar instanceof gpu.a) && epx.f(((gpu.a) gpuVar).a.b.c, userId)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 15:
                ((a2e0) obj2).a();
                return s3q0.a;
            case 16:
                n6i0 n6i0Var = (n6i0) obj2;
                int intValue = ((Integer) obj).intValue();
                f4m.v(intValue, n6i0Var.e);
                n6i0Var.i.b = intValue;
                n6i0Var.e.getRecyclerView().invalidateItemDecorations();
                return s3q0.a;
            case 17:
                wai0.a aVar4 = ((wai0) obj2).d;
                if (aVar4 != null) {
                    aVar4.a();
                }
                return s3q0.a;
            case 18:
                final ifi0 ifi0Var = (ifi0) obj2;
                L.g("Can't load stickers", (Throwable) obj);
                f4m.j(ifi0Var.d);
                f4m.j(ifi0Var.e);
                DefaultErrorView defaultErrorView = ifi0Var.g;
                defaultErrorView.setVisibility(0);
                defaultErrorView.b();
                defaultErrorView.setRetryClickListener(new xa80() { // from class: xsna.gfi0
                    @Override // xsna.xa80
                    public final void b() {
                        ifi0.this.c();
                    }
                });
                return s3q0.a;
            case 19:
                kxi0 kxi0Var = (kxi0) obj2;
                ywi0.b.a aVar5 = (ywi0.b.a) obj;
                f.a.b bVar2 = aVar5.a;
                ArrayList arrayList = aVar5.b;
                kxi0Var.f.onNext(new com.vk.voip.ui.sessionrooms.f(bVar2, false, false, Integer.valueOf(arrayList.isEmpty() ? R.string.voip_session_room_admin_create_rooms_header : R.string.voip_session_room_admin_configure_rooms_header), !arrayList.isEmpty(), true, !arrayList.isEmpty(), 16));
                kxi0Var.b.onNext(arrayList);
                return s3q0.a;
            case 20:
                uoj0 uoj0Var = (uoj0) obj2;
                EmptyList emptyList = EmptyList.b;
                uoj0Var.c = emptyList;
                uoj0Var.a.invoke(emptyList);
                return s3q0.a;
            case 21:
                io.reactivex.rxjava3.disposables.c cVar4 = (io.reactivex.rxjava3.disposables.c) ((Ref$ObjectRef) obj2).element;
                if (cVar4 != null) {
                    cVar4.dispose();
                }
                return s3q0.a;
            case 22:
                return new fcl0((ViewGroup) obj, (com.vk.stickers.settings.g) obj2);
            case 23:
                qy40 qy40Var = (qy40) obj;
                cfl0 cfl0Var = ((jfl0) obj2).w;
                if (cfl0Var != null) {
                    f3b0 f3b0Var = cfl0Var.i;
                    ((zak0) f3b0Var.c).setValue(new s7k0(qy40Var, f3b0Var.b().b + 1));
                }
                return s3q0.a;
            case 24:
                igm0 igm0Var = (igm0) obj2;
                tj50.a aVar6 = (tj50.a) obj;
                jgm0 jgm0Var = new jgm0(1, igm0Var, igm0.class, "buildPreviewContentVisibility", "buildPreviewContentVisibility(Lcom/vk/stories/design/view/stats/mvi/StoryStatisticsState;)Lcom/vk/stories/design/view/stats/mvi/StoryStatisticsViewState$PreviewContentVisibility;", 0);
                ao8 ao8Var = ao8.d;
                return new khm0.f(aVar6.a(jgm0Var, ao8Var), aVar6.a(new r50(igm0Var, 5), ao8Var), aVar6.a(new kgm0(1, igm0Var, igm0.class, "buildPreviewItemsState", "buildPreviewItemsState(Lcom/vk/stories/design/view/stats/mvi/StoryStatisticsState;)Lcom/vk/stories/design/view/stats/mvi/StoryStatisticsViewState$PreviewItemsState;", 0), ao8Var), aVar6.a(new lgm0(1, igm0Var, igm0.class, "buildPreviewCarouselState", "buildPreviewCarouselState(Lcom/vk/stories/design/view/stats/mvi/StoryStatisticsState;)Lcom/vk/stories/design/view/stats/mvi/StoryStatisticsViewState$PreviewCarouselState;", 0), ao8Var), aVar6.a(new mgm0(1, igm0Var, igm0.class, "buildPrivacyState", "buildPrivacyState(Lcom/vk/stories/design/view/stats/mvi/StoryStatisticsState;)Lcom/vk/stories/design/view/stats/mvi/StoryStatisticsViewState$PrivacyState;", 0), ao8Var));
            case 25:
                ((h0o0) obj2).n.invoke();
                return s3q0.a;
            case 26:
                List<Long>[] listArr = ((g7o0) obj2).c;
                g7o0.a(j5g.C0(listArr[0]));
                g7o0.a(j5g.C0(listArr[1]));
                g7o0.a(j5g.C0(listArr[2]));
                g7o0.a(j5g.C0(listArr[3]));
                for (List<Long> list3 : listArr) {
                    list3.clear();
                }
                return s3q0.a;
            case 27:
                ((TemporaryCache) obj2).b.addAll(((TemporaryCache) obj).b);
                return s3q0.a;
            case 28:
                h1p0.f fVar = (h1p0.f) obj2;
                Activity h = e3m.h(((View) obj).getContext());
                h1p0.e eVar2 = fVar.s;
                h1p0.e eVar3 = eVar2 != null ? eVar2 : null;
                if (h != null) {
                    eeu0.a.C2801a c2801a = new eeu0.a.C2801a(new h7u0.a(h));
                    String obj3 = eVar3.b.c.toString();
                    if (obj3 == null) {
                        obj3 = "";
                    }
                    c2801a.h = obj3;
                    String obj4 = eVar3.b.c.toString();
                    c2801a.g = obj4 != null ? obj4 : "";
                    float f = 200;
                    c2801a.f = Integer.valueOf(iah0.a(f));
                    c2801a.i = Integer.valueOf(iah0.a(f));
                    if (eVar3.c) {
                        c2801a.d = "Remote value:\n".concat(eVar3.d);
                        c2801a.e = 8388611;
                    }
                    c2801a.r = 20;
                    c2801a.n = true;
                    c2801a.m = 8;
                    String string = h.getResources().getString(R.string.set_value);
                    k1p0 k1p0Var = new k1p0(fVar, eVar3);
                    c2801a.k = string;
                    c2801a.t = k1p0Var;
                    String string2 = h.getResources().getString(R.string.reset_value);
                    l1p0 l1p0Var = new l1p0(fVar, eVar3);
                    c2801a.l = string2;
                    c2801a.u = l1p0Var;
                    c2801a.g();
                }
                return Boolean.TRUE;
            default:
                ((bdr0) obj2).d = null;
                return s3q0.a;
        }
    }
}
