package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.bottomsheet.actionsheet.a;
import com.vk.feed.core.models.MyTargetAdsComplainOptions;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MyTargetReportBottomSheetImpl.kt */
/* loaded from: classes3.dex */
public final class ps50 {
    public final mv0 a;
    public Bundle b;

    public ps50(mv0 mv0Var) {
        this.a = mv0Var;
    }

    public final ps50 a(String str, MyTargetAdsComplainOptions[] myTargetAdsComplainOptionsArr, SdkVideoFile sdkVideoFile, String str2) {
        Bundle bundle = new Bundle(3);
        bundle.putString("CLOSE_ADS_CHOICES_URL", str);
        bundle.putParcelableArray("ADS_CHOICES_WITH_ID", myTargetAdsComplainOptionsArr);
        bundle.putParcelable("ADS_VIDEO_ITEM", sdkVideoFile);
        bundle.putString("ADS_UNIQUE_KEY", str2);
        this.b = bundle;
        return this;
    }

    public final void b(int i) {
        Bundle bundle = this.b;
        String string = bundle != null ? bundle.getString("CLOSE_ADS_CHOICES_URL") : null;
        if (string != null) {
            this.a.a(string + i);
        }
    }

    public final void c(Context context) {
        Parcelable[] parcelableArr;
        ArrayList arrayList = new ArrayList();
        Bundle bundle = this.b;
        if (bundle == null || (parcelableArr = bundle.getParcelableArray("ADS_CHOICES_WITH_ID")) == null) {
            parcelableArr = new Parcelable[0];
        }
        ArrayList arrayList2 = new ArrayList();
        for (Parcelable parcelable : parcelableArr) {
            MyTargetAdsComplainOptions myTargetAdsComplainOptions = parcelable instanceof MyTargetAdsComplainOptions ? (MyTargetAdsComplainOptions) parcelable : null;
            if (myTargetAdsComplainOptions != null) {
                arrayList2.add(myTargetAdsComplainOptions);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            MyTargetAdsComplainOptions myTargetAdsComplainOptions2 = (MyTargetAdsComplainOptions) it.next();
            arrayList.add(new ModalActionSheetListItem(myTargetAdsComplainOptions2.b, null, myTargetAdsComplainOptions2.c, myTargetAdsComplainOptions2.d, null, 0, null, false, false, 498));
        }
        arrayList.add(new ModalActionSheetListItem(-23, null, context.getString(R.string.report_screen_cancel), null, null, 0, null, false, false, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE));
        a.C0785a c0785a = new a.C0785a();
        c0785a.b = arrayList;
        c0785a.c = new ba40(this, 6);
        c0785a.a(context, "MyTargetReportBottomSheet");
    }
}
