package xsna;

import com.ironsource.D1;
import com.vk.api.generated.ads.dto.AdsItemBlockAdBannerBaseLinkDto;
import com.vk.dto.newsfeed.Link;

/* compiled from: AdsItemBlockAdBannerBaseLinksDtoToLinksMapper.kt */
/* loaded from: classes3.dex */
public final class gw0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Link a(AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto) {
        int i;
        String d = adsItemBlockAdBannerBaseLinkDto.d();
        AdsItemBlockAdBannerBaseLinkDto.LinkUrlTargetDto e = adsItemBlockAdBannerBaseLinkDto.e();
        String i2 = e != null ? e.i() : null;
        if (i2 != null) {
            switch (i2.hashCode()) {
                case -1820761141:
                    i2.equals(D1.e);
                    break;
                case -1544407700:
                    if (i2.equals("internal_hidden")) {
                        i = 1;
                        break;
                    }
                    break;
                case 570410685:
                    if (i2.equals("internal")) {
                        i = 2;
                        break;
                    }
                    break;
                case 1475610601:
                    if (i2.equals("authorize")) {
                        i = 3;
                        break;
                    }
                    break;
            }
            return new Link(d, i);
        }
        i = 0;
        return new Link(d, i);
    }
}
