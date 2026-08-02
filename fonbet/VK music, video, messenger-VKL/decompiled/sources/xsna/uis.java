package xsna;

import android.widget.ImageView;
import com.vk.core.view.ProgressIconButton;
import com.vk.dto.user.RequestUserProfile;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.hss;

/* compiled from: FriendRequestHolderRedesign2LinesIcons.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class uis extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uis(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                wis wisVar = (wis) this.receiver;
                ProgressIconButton progressIconButton = wisVar.B;
                hss hssVar = wisVar.r;
                ProgressIconButton progressIconButton2 = wisVar.z;
                ImageView imageView = wisVar.D;
                ImageView imageView2 = wisVar.C;
                wisVar.itemView.setForeground(null);
                boolean z = ((RequestUserProfile) wisVar.m).j;
                if (z && (hssVar instanceof hss.c)) {
                    imageView2.setVisibility(8);
                    imageView.setVisibility(8);
                    progressIconButton2.setVisibility(0);
                    progressIconButton2.setClickable(false);
                    progressIconButton.setVisibility(8);
                    imageView2.setVisibility(8);
                    imageView.setVisibility(8);
                } else if (z && wisVar.J) {
                    imageView2.setVisibility(0);
                    imageView.setVisibility(0);
                    progressIconButton2.setVisibility(8);
                    progressIconButton.setVisibility(8);
                    imageView2.setEnabled(epx.f(((RequestUserProfile) wisVar.m).y, Boolean.TRUE));
                    imageView.setEnabled(((RequestUserProfile) wisVar.m).d());
                } else {
                    progressIconButton.setVisibility(0);
                    imageView2.setVisibility(8);
                    imageView.setVisibility(8);
                    progressIconButton2.setVisibility(8);
                }
                progressIconButton.setIconDrawable((!(hssVar instanceof hss.b) || (((RequestUserProfile) wisVar.m).v == 2)) ? wisVar.E : wisVar.H);
                wisVar.A.setVisibility(8);
                if (wisVar.K) {
                    wisVar.itemView.requestLayout();
                }
                break;
            default:
                ((wzh0) this.receiver).j();
                break;
        }
        return s3q0.a;
    }
}
