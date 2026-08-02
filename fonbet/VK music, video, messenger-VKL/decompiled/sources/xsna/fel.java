package xsna;

import android.media.MediaCodecInfo;
import android.util.Range;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.media3.transformer.k;
import com.google.common.collect.ArrayListMultimap;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class fel implements k.b, NestedScrollView.d, yads.ng1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fel(Object obj, int i) {
        this.c = obj;
        this.b = i;
    }

    @Override // androidx.media3.transformer.k.b
    public int b(MediaCodecInfo mediaCodecInfo) {
        String str = (String) this.c;
        ArrayListMultimap<String, MediaCodecInfo> arrayListMultimap = hjp.a;
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        videoCapabilities.getClass();
        Range<Integer> bitrateRange = videoCapabilities.getBitrateRange();
        int i = this.b;
        return Math.abs(bitrateRange.clamp(Integer.valueOf(i)).intValue() - i);
    }

    @Override // androidx.core.widget.NestedScrollView.d
    public void c(NestedScrollView nestedScrollView, int i) {
        ViewGroup viewGroup = ((nw20) this.c).l0;
        if (viewGroup == null) {
            viewGroup = null;
        }
        viewGroup.setAlpha(xwk.a(i / this.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        yads.ao0.a((yads.df2) this.c, this.b, (yads.nf2) obj);
    }
}
