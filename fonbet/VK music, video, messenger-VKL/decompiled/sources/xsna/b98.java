package xsna;

import android.content.Context;
import com.vk.libvideo.adfree.api.VideoAdFreeBottomSheetArguments;
import com.vk.libvideo.adfree.impl.ui.entity.BottomSheetState;
import com.vk.libvideo.adfree.impl.ui.entity.BottomSheetViewState;
import com.vkontakte.android.R;
import java.util.Arrays;

/* compiled from: BottomSheetViewStateMapper.kt */
/* loaded from: classes18.dex */
public final class b98 implements izs {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ b98(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Context context = (Context) this.c;
                VideoAdFreeBottomSheetArguments videoAdFreeBottomSheetArguments = ((BottomSheetState) obj).b;
                String str = videoAdFreeBottomSheetArguments.d;
                String str2 = videoAdFreeBottomSheetArguments.e;
                String str3 = videoAdFreeBottomSheetArguments.c;
                if (str.length() == 0) {
                    str = context.getString(R.string.video_ad_free_title);
                }
                String str4 = videoAdFreeBottomSheetArguments.b;
                if (str4.length() == 0) {
                    str4 = context.getString(R.string.video_ad_free_terms_of_service);
                }
                return new BottomSheetViewState(str, str3.length() == 0 ? context.getString(R.string.video_ad_free_proceed_button, str2) : String.format(str3, Arrays.copyOf(new Object[]{str2}, 1)), str4, videoAdFreeBottomSheetArguments.h);
            case 1:
                ((ugz) this.c).cancel(false);
                return s3q0.a;
            default:
                return "geo";
        }
    }

    public b98(quz quzVar, wow wowVar) {
        this.b = 2;
        this.c = wowVar;
    }
}
