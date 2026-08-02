package xsna;

import android.view.View;
import com.vk.dto.music.MusicTrack;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.json.expressions.Expression;
import kotlin.NoWhenBranchMatchedException;
import xsna.gvu;
import xsna.xh4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class wh4 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wh4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dbs0 dbs0Var;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((xh4.a) obj2).l.invoke(((vh4) obj).c);
                return;
            case 1:
                lna lnaVar = (lna) obj;
                izs<MusicTrack, s3q0> izsVar = ((jna) obj2).b;
                if (izsVar != null) {
                    izsVar.invoke(lnaVar.a);
                    return;
                }
                return;
            case 2:
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                ((y5p0) obj2).r();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 3:
                DivActionBinder.bindTapActions$lambda$2((Expression) obj2, (BindingContext) obj, view);
                return;
            case 4:
                gvu.a aVar = (gvu.a) obj;
                wzs<? super String, ? super Integer, s3q0> wzsVar = ((gvu) obj2).e;
                if (wzsVar != null) {
                    wzsVar.invoke(aVar.m, Integer.valueOf(aVar.getAdapterPosition()));
                    return;
                }
                return;
            default:
                VideoToolbarView videoToolbarView = (VideoToolbarView) obj2;
                dbs0 dbs0Var2 = (dbs0) obj;
                int i2 = VideoToolbarView.M;
                if (videoToolbarView.g() && view == videoToolbarView.q) {
                    int i3 = VideoToolbarView.b.$EnumSwitchMapping$0[videoToolbarView.u.b.ordinal()];
                    if (i3 == 1) {
                        dbs0Var = w0t0.a;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dbs0Var = pws0.a;
                    }
                    dbs0Var2 = dbs0Var;
                }
                if (dbs0Var2 instanceof w0t0) {
                    VideoPipStateHolder.a.getClass();
                    if (VideoPipStateHolder.f()) {
                        VideoPipStateHolder.j(videoToolbarView.getContext());
                        return;
                    }
                }
                ebs0 ebs0Var = videoToolbarView.t;
                if (ebs0Var != null) {
                    ebs0Var.bk(dbs0Var2);
                    return;
                }
                return;
        }
    }
}
