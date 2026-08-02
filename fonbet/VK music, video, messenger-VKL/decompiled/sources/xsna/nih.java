package xsna;

import android.widget.ImageView;
import com.vk.core.view.ProgressIconButton;
import com.vk.dto.user.RequestUserProfile;
import com.vk.profile.community.impl.ui.profile.state.MarketInfoBlockModel;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.hss;
import xsna.kih;

/* compiled from: CommunityProfileContentGoodsViewHolder.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class nih extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nih(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i;
        boolean z = false;
        z = false;
        switch (this.b) {
            case 0:
                kih kihVar = (kih) this.receiver;
                int i2 = kih.O;
                p8u p8uVar = (p8u) kihVar.t;
                MarketInfoBlockModel marketInfoBlockModel = p8uVar != null ? p8uVar.r : null;
                if (marketInfoBlockModel != null) {
                    int i3 = kih.a.$EnumSwitchMapping$0[marketInfoBlockModel.a.ordinal()];
                    if (i3 != 1 ? i3 != 2 ? false : kihVar.F : true) {
                        z = true;
                    }
                }
                break;
            case 1:
                wis wisVar = (wis) this.receiver;
                ProgressIconButton progressIconButton = wisVar.B;
                hss hssVar = wisVar.r;
                ProgressIconButton progressIconButton2 = wisVar.A;
                ImageView imageView = wisVar.C;
                ProgressIconButton progressIconButton3 = wisVar.z;
                ImageView imageView2 = wisVar.D;
                wisVar.itemView.setForeground(null);
                progressIconButton3.setIconDrawable((!(hssVar instanceof hss.b) || (((RequestUserProfile) wisVar.m).v == 2) == true) ? wisVar.F : wisVar.G);
                if (hssVar instanceof hss.c) {
                    imageView.setVisibility(8);
                    imageView2.setVisibility(8);
                    progressIconButton3.setVisibility(0);
                    progressIconButton3.setClickable(true);
                    progressIconButton2.setVisibility(0);
                    progressIconButton.setVisibility(8);
                    imageView.setVisibility(8);
                    imageView2.setVisibility(8);
                } else if (epx.f(((RequestUserProfile) wisVar.m).c, wisVar.I) || (i = ((RequestUserProfile) wisVar.m).v) == 1 || i == 3) {
                    if (wisVar.J) {
                        imageView.setVisibility(0);
                        imageView2.setVisibility(0);
                        imageView.setEnabled(epx.f(((RequestUserProfile) wisVar.m).y, Boolean.TRUE));
                        imageView2.setEnabled(((RequestUserProfile) wisVar.m).d());
                    } else {
                        imageView.setVisibility(8);
                        imageView2.setVisibility(8);
                    }
                    progressIconButton3.setVisibility(8);
                    progressIconButton2.setVisibility(8);
                    progressIconButton.setVisibility(8);
                } else {
                    progressIconButton3.setVisibility(0);
                    progressIconButton3.setClickable(true);
                    imageView.setVisibility(8);
                    if (wisVar.J) {
                        imageView2.setVisibility(0);
                        imageView2.setEnabled(((RequestUserProfile) wisVar.m).d());
                    } else {
                        imageView2.setVisibility(8);
                    }
                    progressIconButton2.setVisibility(wisVar.L ? 0 : 8);
                    progressIconButton.setVisibility(8);
                }
                if (wisVar.K) {
                    wisVar.itemView.requestLayout();
                }
                break;
            case 2:
                ((pew) this.receiver).b();
                break;
            default:
                coj0 coj0Var = (coj0) this.receiver;
                coj0Var.d = null;
                coj0Var.e = true;
                break;
        }
        return s3q0.a;
    }
}
