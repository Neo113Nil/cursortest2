package xsna;

import android.content.Context;
import android.os.Parcelable;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetDownloadUrlQualityDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetDownloadUrlResponseDto;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class nrd implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Parcelable d;
    public final /* synthetic */ Parcelable e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ nrd(Object obj, Parcelable parcelable, Parcelable parcelable2, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = parcelable;
        this.e = parcelable2;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.g;
        Object obj2 = this.f;
        Parcelable parcelable = this.e;
        Parcelable parcelable2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ord.b((ord) obj2, (gzs) obj, ord.a((ClipVideoFile) parcelable, (ShortVideoGetDownloadUrlResponseDto) obj3, (ShortVideoGetDownloadUrlQualityDto) parcelable2));
                break;
            default:
                yp80 yp80Var = (yp80) obj;
                MobileOfficialAppsCallsStat$TypeVoipCallItem.Source source = MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.DEEPLINK;
                UiTracker uiTracker = UiTracker.a;
                com.vk.common.links.c.d0((Context) obj3, (UserId) parcelable2, new VoipCallSource(source, UiTracker.c()), false, (UserId) parcelable, (String) obj2, yp80Var);
                break;
        }
        return s3q0.a;
    }
}
