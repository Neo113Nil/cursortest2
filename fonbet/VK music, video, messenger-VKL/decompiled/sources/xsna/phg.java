package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.clips.models.SdkClipOrdData;
import com.vk.clips.models.VideoUrlPack;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.viewer.edit.api.domain.model.ClipCoauthorSdkItem;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditAttachedVideo;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditSdkItem;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditSdkThumbsItem;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.OrdAdInfo;
import com.vk.dto.common.OrdAdvertiser;
import com.vk.dto.common.TimelineThumbs;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xsna.xtc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class phg implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ phg(UIBlockActionFilter uIBlockActionFilter, wtm0 wtm0Var) {
        this.b = 8;
        this.c = uIBlockActionFilter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0154, code lost:
    
        if (r8 != null) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Iterator it;
        final cgh0 cgh0Var;
        View findViewByPosition;
        SdkClipOrdData sdkClipOrdData;
        String str;
        boolean z;
        Owner owner;
        boolean z2;
        boolean z3;
        Owner owner2;
        UserId userId;
        Group C0;
        us2 a;
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((rhg) obj3).a(ne7.I(55), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 1:
                wh50 wh50Var = (wh50) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-163613587, intValue, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.cta.CtaSwitchCell.<anonymous> (CtaSwitchCell.kt:67)");
                    }
                    zov0.a(((Boolean) wh50Var.getValue()).booleanValue(), null, null, false, null, aVar, 48, 28);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                ImAvatarView imAvatarView = ((com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) obj3).o;
                Drawable drawable = imAvatarView.getDrawable();
                LayerDrawable layerDrawable = drawable instanceof LayerDrawable ? (LayerDrawable) drawable : null;
                if (layerDrawable != null) {
                    Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                    if (findDrawableByLayerId != null) {
                        findDrawableByLayerId.setTint(e3m.f(R.attr.vk_ui_background_secondary, imAvatarView.getContext()));
                    }
                    Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.icon);
                    if (findDrawableByLayerId2 != null) {
                        findDrawableByLayerId2.setTint(e3m.f(R.attr.vk_ui_icon_primary, imAvatarView.getContext()));
                    }
                }
                return s3q0.a;
            case 3:
                mo60 mo60Var = ((e9n) obj3).f;
                ((sti) obj).a(new c8n((sl50) obj2, mo60Var.v, mo60Var.i0));
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((axq) obj3).f(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                sfv.a((UIBlockList) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                ((d010) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 7:
                qsl0 qsl0Var = (qsl0) obj3;
                String str2 = (String) obj;
                if (obj2 instanceof Integer) {
                    qsl0Var.C(((Number) obj2).intValue(), str2);
                } else if (obj2 instanceof Long) {
                    qsl0Var.D(((Number) obj2).longValue(), str2);
                } else if (obj2 instanceof Boolean) {
                    qsl0Var.R(str2, ((Boolean) obj2).booleanValue());
                } else {
                    qsl0Var.K(str2, obj2 != null ? obj2.toString() : null);
                }
                return s3q0.a;
            case 8:
                UIBlockActionFilter uIBlockActionFilter = (UIBlockActionFilter) obj3;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    UIBlock uIBlock = (UIBlock) it2.next();
                    if ((uIBlock instanceof UIBlockList) && epx.f(uIBlockActionFilter.A, uIBlock.b)) {
                        UIBlockList uIBlockList2 = (UIBlockList) uIBlock;
                        ArrayList<UIBlock> arrayList3 = uIBlockList2.y;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : arrayList3) {
                            if (obj4 instanceof UIBlockActionFilter) {
                                arrayList4.add(obj4);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
                        for (Iterator it3 = arrayList4.iterator(); it3.hasNext(); it3 = it3) {
                            UIBlockActionFilter uIBlockActionFilter2 = (UIBlockActionFilter) it3.next();
                            String str3 = uIBlockActionFilter2.b;
                            CatalogViewType catalogViewType = uIBlockActionFilter2.d;
                            CatalogDataType catalogDataType = uIBlockActionFilter2.e;
                            String str4 = uIBlockActionFilter2.f;
                            UserId a2 = UserId.a(uIBlockActionFilter2.g);
                            ArrayList a3 = i7o0.a(uIBlockActionFilter2.h);
                            HashSet d = p4g.d(uIBlockActionFilter2.Db());
                            UIBlockHint uIBlockHint = uIBlockActionFilter2.j;
                            arrayList5.add(new UIBlockActionFilter(str3, catalogViewType, catalogDataType, str4, a2, a3, d, uIBlockHint != null ? uIBlockHint.zb() : null, uIBlockActionFilter2.y, CatalogFilterData.zb(uIBlockActionFilter2.z, null, null, epx.f(uIBlockActionFilter2.b, uIBlockActionFilter.b), 503), uIBlockActionFilter2.A, uIBlockActionFilter2.c, uIBlockActionFilter2.l, uIBlockActionFilter2.B));
                            it2 = it2;
                        }
                        it = it2;
                        uIBlock = new UIBlockList(uIBlockList2, arrayList5);
                    } else {
                        it = it2;
                    }
                    arrayList2.add(uIBlock);
                    it2 = it;
                }
                return new UIBlockList(uIBlockList, arrayList2);
            case 9:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                View view = ((SuggestedPostsFragment) obj3).d0;
                if (view != null) {
                    view.setVisibility(booleanValue ? 0 : 8);
                }
                return s3q0.a;
            case 10:
                final sq60 sq60Var = (sq60) obj2;
                final ar60 o = ((vxq0) obj3).o();
                final RecyclerView recyclerView = o.b().n.c;
                if (recyclerView != null) {
                    RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                    final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (sq60Var.e) {
                        int v = linearLayoutManager != null ? linearLayoutManager.v() : 0;
                        cgh0Var = new cgh0(v, (linearLayoutManager == null || (findViewByPosition = linearLayoutManager.findViewByPosition(v)) == null) ? 0 : findViewByPosition.getTop());
                    } else {
                        cgh0Var = null;
                    }
                    o.b().b().H0(recyclerView, new k0(6, o, sq60Var), new Runnable() { // from class: xsna.yq60
                        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            LinearLayoutManager linearLayoutManager2;
                            cgh0 cgh0Var2 = cgh0.this;
                            if (cgh0Var2 != null && (linearLayoutManager2 = linearLayoutManager) != null) {
                                linearLayoutManager2.K(cgh0Var2.a, cgh0Var2.b);
                            }
                            sq60 sq60Var2 = sq60Var;
                            boolean z4 = sq60Var2.d;
                            RecyclerView recyclerView2 = recyclerView;
                            if (z4) {
                                RecyclerView.o layoutManager2 = recyclerView2.getLayoutManager();
                                LinearLayoutManager linearLayoutManager3 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                                if (linearLayoutManager3 != null) {
                                    linearLayoutManager3.K(0, 0);
                                }
                            }
                            ar60 ar60Var = o;
                            ((o170) ar60Var.b().V.getValue()).b(recyclerView2);
                            ar60Var.b().f().a(sq60Var2.a);
                            ehv ehvVar = (ehv) ar60Var.b().p.b;
                            if (ehvVar != null) {
                                ehvVar.r();
                            }
                        }
                    }, sq60Var.a, sq60Var.c);
                }
                return s3q0.a;
            case 11:
                kzq0 kzq0Var = (kzq0) obj3;
                ClipVideoFile clipVideoFile = (ClipVideoFile) obj;
                Activity activity = (Activity) obj2;
                xtc xtcVar = (xtc) kzq0Var.f.getValue();
                String valueOf = String.valueOf(clipVideoFile.c);
                UserId userId2 = clipVideoFile.b;
                VideoUrlPack a4 = yot0.a(clipVideoFile);
                int i2 = clipVideoFile.m0;
                int i3 = clipVideoFile.n0;
                String str5 = clipVideoFile.m;
                String str6 = str5 == null ? "" : str5;
                ArrayList arrayList6 = clipVideoFile.I0.b;
                ArrayList arrayList7 = new ArrayList(c5g.u(arrayList6, 10));
                Iterator it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    ImageSize imageSize = (ImageSize) it4.next();
                    Image image = imageSize.d;
                    arrayList7.add(new ImageUrl(image.d, Math.max(image.b, image.c), imageSize.c7()));
                }
                SdkImages sdkImages = new SdkImages(arrayList7, clipVideoFile.I0);
                TimelineThumbs timelineThumbs = clipVideoFile.K0;
                ClipEditSdkThumbsItem clipEditSdkThumbsItem = timelineThumbs != null ? new ClipEditSdkThumbsItem(timelineThumbs.b, timelineThumbs.c, timelineThumbs.d, timelineThumbs.e, timelineThumbs.f, timelineThumbs.i) : ClipEditSdkThumbsItem.h;
                OrdAdInfo ordAdInfo = clipVideoFile.d0;
                if (ordAdInfo != null) {
                    String str7 = ordAdInfo.b;
                    boolean z4 = str7.length() > 0;
                    OrdAdvertiser ordAdvertiser = (OrdAdvertiser) j5g.a0(ordAdInfo.c);
                    sdkClipOrdData = new SdkClipOrdData(z4, null, ordAdvertiser != null ? ordAdvertiser.c : null, str7);
                } else {
                    sdkClipOrdData = null;
                }
                ActionLink actionLink = clipVideoFile.Y;
                if (actionLink != null) {
                    if (!epx.f(actionLink.c, "video")) {
                        actionLink = null;
                    }
                    if (actionLink != null) {
                        str = actionLink.d;
                        break;
                    }
                }
                str = null;
                ClipEditAttachedVideo.RawId rawId = str != null ? new ClipEditAttachedVideo.RawId(str) : null;
                List<CoOwnerItem> list = clipVideoFile.N1;
                ArrayList arrayList8 = new ArrayList(c5g.u(list, 10));
                for (CoOwnerItem coOwnerItem : list) {
                    UserId userId3 = coOwnerItem.b;
                    Owner owner3 = coOwnerItem.d;
                    String str8 = owner3.c;
                    String str9 = str8 == null ? "" : str8;
                    String str10 = owner3.d;
                    arrayList8.add(new ClipCoauthorSdkItem(userId3, str9, str10 == null ? "" : str10, null, coOwnerItem.Ab(), coOwnerItem.e));
                }
                Owner owner4 = clipVideoFile.v0;
                if (owner4 == null || !fkq0.b(owner4.b)) {
                    qwe d6 = ((ClipEditComponent) kzq0Var.c.getValue()).d6();
                    PrivacySetting privacySetting = new PrivacySetting();
                    privacySetting.e = clipVideoFile.x0;
                    s3q0 s3q0Var = s3q0.a;
                    z = d6.p(privacySetting) == PostingVisibilityMode.ALL;
                } else {
                    z = true;
                }
                Owner owner5 = clipVideoFile.v0;
                ClipEditSdkItem clipEditSdkItem = new ClipEditSdkItem(valueOf, userId2, null, a4, i2, i3, str6, sdkImages, clipEditSdkThumbsItem, sdkClipOrdData, rawId, arrayList8, z, owner5 == null || !fkq0.b(owner5.b) ? !((owner = clipVideoFile.v0) == null || owner.i(16)) : (owner2 = clipVideoFile.v0) == null || (userId = owner2.b) == null || (C0 = ((gxh) kzq0Var.e.getValue()).C0(userId)) == null || C0.m != 0, clipVideoFile.W);
                Context context = activity;
                while (true) {
                    z2 = context instanceof FragmentActivity;
                    if (!z2 && (context instanceof ContextWrapper)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                FragmentManager supportFragmentManager = ((FragmentActivity) (z2 ? (Activity) context : null)).getSupportFragmentManager();
                Context context2 = activity;
                while (true) {
                    z3 = context2 instanceof FragmentActivity;
                    if (!z3 && (context2 instanceof ContextWrapper)) {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    }
                }
                xtcVar.a(clipEditSdkItem, new xtc.a(activity, supportFragmentManager, (f5z) (z3 ? (Activity) context2 : null), false), new iyd0(clipVideoFile, 12), new oq0(kzq0Var, activity, clipVideoFile, 9));
                return s3q0.a;
            case 12:
                ((exr0) obj3).a.j().g = (VideoFile) obj;
                return s3q0.a;
            default:
                DonutVideoUiModel.DescriptionChip descriptionChip = (DonutVideoUiModel.DescriptionChip) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                aVar2.K(34446680);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(34446680, intValue2, -1, "com.vk.catalog.mvi.block.video.impl.video.largelist.toDonutChip.<anonymous>.<anonymous> (VideoLargeListViewStateMapper.kt:514)");
                }
                DonutPriceTemplate donutPriceTemplate = descriptionChip.c;
                if (donutPriceTemplate == null) {
                    aVar2.K(-296098168);
                    aVar2.j();
                    a = null;
                } else {
                    aVar2.K(-1256477543);
                    a = z1o.a(donutPriceTemplate, m4s.B(aVar2), aVar2, 0);
                    aVar2.j();
                }
                if (a == null) {
                    aVar2.K(-1256473069);
                    a = ws2.b(descriptionChip.b, aVar2, 0);
                    aVar2.j();
                } else {
                    aVar2.K(-1256478122);
                    aVar2.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return a;
        }
    }

    public /* synthetic */ phg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ phg(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
