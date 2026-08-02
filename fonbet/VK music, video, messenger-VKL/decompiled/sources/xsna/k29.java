package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.vk.catalog2.common.ui.holders.video.VideoOnboardingVh;
import xsna.w19;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class k29 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k29(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.b) {
            case 0:
                ((o29) this.c).b.invoke(new w19.i(z));
                break;
            default:
                VideoOnboardingVh videoOnboardingVh = (VideoOnboardingVh) this.c;
                View view = videoOnboardingVh.e;
                if (view == null) {
                    view = null;
                }
                zmp0.b((ViewGroup) view);
                View view2 = videoOnboardingVh.e;
                if (view2 == null) {
                    view2 = null;
                }
                zmp0.a((ViewGroup) view2, new wra().setDuration(200L));
                TextView textView = videoOnboardingVh.j;
                if (textView == null) {
                    textView = null;
                }
                bwt0.p0(textView, !(videoOnboardingVh.g != null ? r5 : null).getCheckedChipIds().isEmpty());
                break;
        }
    }
}
