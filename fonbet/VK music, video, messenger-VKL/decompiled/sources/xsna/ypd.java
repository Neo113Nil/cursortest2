package xsna;

import com.vk.clips.upload.ui.impl.compose.state.viewstate.TrendingHashtagUiDto;
import com.vk.fullscreenvideo.a;
import com.vk.stat.scheme.CommonMarketStat$TypeCtaButtonPositionType;
import xsna.ha70;
import xsna.mbf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ypd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ ypd(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new mbf.c.u((TrendingHashtagUiDto) obj));
                break;
            case 1:
                this.c.invoke((a.d) obj);
                break;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                CommonMarketStat$TypeCtaButtonPositionType commonMarketStat$TypeCtaButtonPositionType = CommonMarketStat$TypeCtaButtonPositionType.FLOATING;
                this.c.invoke(booleanValue ? new jjl0(commonMarketStat$TypeCtaButtonPositionType) : new ijl0(commonMarketStat$TypeCtaButtonPositionType));
                break;
            default:
                this.c.invoke(ha70.z.a);
                break;
        }
        return s3q0.a;
    }
}
