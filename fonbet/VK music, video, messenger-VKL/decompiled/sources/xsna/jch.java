package xsna;

import android.app.Activity;
import android.view.View;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.vk.core.view.components.picture.VkImage;
import com.vk.libvideo.design.view.fullscreen.VideoTopBarView;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$IntRef;
import one.video.controls.views.VideoButtonsView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class jch implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jch(int i, Object obj, Object obj2, String str) {
        this.b = i;
        this.c = obj;
        this.e = str;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                VkImage foregroundImageView = ((b8h) obj).getForegroundImageView();
                foregroundImageView.setVisibility(0);
                foregroundImageView.setOnLoadCallback(((lch) obj3).k);
                foregroundImageView.o0((String) obj2, null);
                break;
            case 1:
                ((w8t) obj3).a.invoke(t90.a((s90) obj, (Integer) obj2));
                break;
            case 2:
                VideoButtonsView videoButtonsView = (VideoButtonsView) obj;
                VideoTopBarView videoTopBarView = (VideoTopBarView) ((jcf0) obj3).invoke();
                View view = (View) ((uhs0) obj2).invoke();
                if (videoTopBarView != null && bwt0.K(videoTopBarView)) {
                    break;
                } else {
                    View findViewWithTag = videoButtonsView.findViewWithTag("settings");
                    if ((findViewWithTag == null || !bwt0.K(findViewWithTag)) && ((findViewWithTag = view.findViewById(R.id.settings)) == null || !bwt0.K(findViewWithTag))) {
                        findViewWithTag = null;
                    }
                    if (findViewWithTag != null) {
                        break;
                    }
                }
                break;
            case 3:
                com.vk.qrcode.d dVar = com.vk.qrcode.d.b;
                com.vk.qrcode.d.m((Activity) obj, rsr.r().a((cn) obj3, "photo" + ((String) obj2)));
                break;
            case 4:
                ((izs) obj3).invoke(new ArrayList((SnapshotStateList) obj));
                ((gzs) obj2).invoke();
                break;
            case 5:
                opl0 opl0Var = (opl0) obj3;
                opl0Var.notifyItemChanged(((Ref$IntRef) obj).element);
                opl0Var.notifyItemChanged(((Ref$IntRef) obj2).element);
                break;
            default:
                q7v0 q7v0Var = (q7v0) obj3;
                wzs wzsVar = (wzs) obj;
                VkOnboardingCampaign e = q7v0Var.e((String) obj2);
                if (e != null) {
                    wzsVar.invoke(q7v0Var, e);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jch(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
