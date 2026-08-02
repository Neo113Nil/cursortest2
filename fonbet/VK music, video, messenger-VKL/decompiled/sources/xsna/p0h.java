package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.clips.models.SdkClipOrdData;
import com.vk.clips.models.VideoUrlPack;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.viewer.edit.api.domain.model.ClipCoauthorSdkItem;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditAttachedVideo;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditSdkItem;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditSdkThumbsItem;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.OrdAdInfo;
import com.vk.dto.common.OrdAdvertiser;
import com.vk.dto.common.TimelineThumbs;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.ecomm.verifiedseller.impl.screens.verificationstub.VerificationStubFragment;
import com.vk.profile.design.view.profileheader.UserProfileBaseInfoState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.q0h;
import xsna.xtc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class p0h implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p0h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0219, code lost:
    
        if (r0 != null) goto L100;
     */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        SdkImages sdkImages;
        ClipEditSdkThumbsItem clipEditSdkThumbsItem;
        SdkClipOrdData sdkClipOrdData;
        String str;
        boolean z;
        Owner owner;
        boolean z2;
        boolean z3;
        Owner owner2;
        UserId userId;
        Group C0;
        int i = this.b;
        int i2 = 16;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                q0h.a aVar = (q0h.a) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-265412092, intValue, -1, "com.vk.profile.community.impl.ui.item.header.CommunityCuratorPageItem.CommunityArtistPageViewHolder.<anonymous> (CommunityCuratorPageItem.kt:40)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-1921670337, new lk1(aVar, 3), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 1:
                n0i n0iVar = (n0i) obj3;
                ClipVideoFile clipVideoFile = (ClipVideoFile) obj;
                Activity activity = (Activity) obj2;
                xtc xtcVar = (xtc) n0iVar.f.getValue();
                String valueOf = String.valueOf(clipVideoFile.c);
                UserId userId2 = clipVideoFile.b;
                VideoUrlPack a = yot0.a(clipVideoFile);
                int i3 = clipVideoFile.m0;
                int i4 = clipVideoFile.n0;
                String str2 = clipVideoFile.m;
                String str3 = str2 == null ? "" : str2;
                ArrayList arrayList = clipVideoFile.I0.b;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
                    ImageSize imageSize = (ImageSize) it.next();
                    Image image = imageSize.d;
                    arrayList2.add(new ImageUrl(image.d, Math.max(image.b, image.c), imageSize.c7()));
                }
                SdkImages sdkImages2 = new SdkImages(arrayList2, clipVideoFile.I0);
                TimelineThumbs timelineThumbs = clipVideoFile.K0;
                if (timelineThumbs != null) {
                    sdkImages = sdkImages2;
                    clipEditSdkThumbsItem = new ClipEditSdkThumbsItem(timelineThumbs.b, timelineThumbs.c, timelineThumbs.d, timelineThumbs.e, timelineThumbs.f, timelineThumbs.i);
                } else {
                    sdkImages = sdkImages2;
                    clipEditSdkThumbsItem = ClipEditSdkThumbsItem.h;
                }
                OrdAdInfo ordAdInfo = clipVideoFile.d0;
                if (ordAdInfo != null) {
                    String str4 = ordAdInfo.b;
                    boolean z4 = str4.length() > 0;
                    OrdAdvertiser ordAdvertiser = (OrdAdvertiser) j5g.a0(ordAdInfo.c);
                    sdkClipOrdData = new SdkClipOrdData(z4, null, ordAdvertiser != null ? ordAdvertiser.c : null, str4);
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
                ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                for (CoOwnerItem coOwnerItem : list) {
                    UserId userId3 = coOwnerItem.b;
                    Owner owner3 = coOwnerItem.d;
                    String str5 = owner3.c;
                    String str6 = str5 == null ? "" : str5;
                    String str7 = owner3.d;
                    arrayList3.add(new ClipCoauthorSdkItem(userId3, str6, str7 == null ? "" : str7, null, coOwnerItem.Ab(), coOwnerItem.e));
                }
                Owner owner4 = clipVideoFile.v0;
                if (owner4 == null || !fkq0.b(owner4.b)) {
                    qwe d6 = ((ClipEditComponent) n0iVar.c.getValue()).d6();
                    PrivacySetting privacySetting = new PrivacySetting();
                    privacySetting.e = clipVideoFile.x0;
                    s3q0 s3q0Var = s3q0.a;
                    z = d6.p(privacySetting) == PostingVisibilityMode.ALL;
                } else {
                    z = true;
                }
                Owner owner5 = clipVideoFile.v0;
                ClipEditSdkItem clipEditSdkItem = new ClipEditSdkItem(valueOf, userId2, null, a, i3, i4, str3, sdkImages, clipEditSdkThumbsItem, sdkClipOrdData, rawId, arrayList3, z, owner5 == null || !fkq0.b(owner5.b) ? !((owner = clipVideoFile.v0) == null || owner.i(16)) : (owner2 = clipVideoFile.v0) == null || (userId = owner2.b) == null || (C0 = ((gxh) n0iVar.e.getValue()).C0(userId)) == null || C0.m != 0, clipVideoFile.W);
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
                xtcVar.a(clipEditSdkItem, new xtc.a(activity, supportFragmentManager, (f5z) (z3 ? (Activity) context2 : null), false), new i4h(clipVideoFile, 4), new sa5(n0iVar, activity, clipVideoFile, 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((giy) obj3).b(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 3:
                ((Integer) obj2).getClass();
                com.vk.profile.design.view.profileheader.b.l((UserProfileBaseInfoState.c.a) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 4:
                VerificationStubFragment verificationStubFragment = (VerificationStubFragment) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i5 = VerificationStubFragment.O;
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(646604093, intValue2, -1, "com.vk.ecomm.verifiedseller.impl.screens.verificationstub.VerificationStubFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (VerificationStubFragment.kt:29)");
                    }
                    boolean y = aVar3.y(verificationStubFragment);
                    Object x = aVar3.x();
                    if (y || x == c0012a) {
                        x = new iri0(verificationStubFragment, 15);
                        aVar3.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    boolean y2 = aVar3.y(verificationStubFragment);
                    Object x2 = aVar3.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new jaa0(verificationStubFragment, 27);
                        aVar3.R(x2);
                    }
                    qnr0.b(gzsVar, (gzs) x2, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 5:
                Alert$Button alert$Button = (Alert$Button) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1060961326, intValue3, -1, "com.vk.core.compose.component.VkAlertOld.<anonymous> (VkAlertOld.kt:82)");
                    }
                    x7u0.a(alert$Button, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            default:
                DateTimePickerState dateTimePickerState = (DateTimePickerState) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-898716823, intValue4, -1, "com.vk.core.compose.component.datetime.VkDatePickerDialog.<anonymous>.<anonymous> (VkDateTimePicker.kt:98)");
                    }
                    boolean J = aVar5.J(dateTimePickerState);
                    Object x3 = aVar5.x();
                    if (J || x3 == c0012a) {
                        x3 = new g8n0(dateTimePickerState, i2);
                        aVar5.R(x3);
                    }
                    bqv0.e((gzs) x3, aVar5, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ p0h(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
