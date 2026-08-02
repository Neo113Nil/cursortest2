package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListTabletVh;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.search.fragment.RestoreSearchFragment;
import com.vk.voip.ui.sessionrooms.dialog.model.a;
import java.util.List;
import kotlin.Pair;
import xsna.auq;
import xsna.d5o0;
import xsna.s8z0;
import xsna.vwf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class gs00 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.c, bc80, vwf.c, r580, s8z0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gs00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 3:
                return (List) ((k8d) this.c).invoke((List) obj, obj2);
            case 9:
                return (a.b) ((wvi0) this.c).invoke(obj, obj2);
            default:
                return (s3q0) ((oq0) this.c).invoke(obj, obj2);
        }
    }

    @Override // xsna.r580
    public void c(DonutVideoAction donutVideoAction) {
        ((VideoItemListTabletVh) this.c).e(donutVideoAction, DonutVideoClickSource.DESCRIPTION);
    }

    @Override // xsna.s8z0.a
    public void i(z9z0 z9z0Var) {
        ((x6z0) this.c).f = z9z0Var;
    }

    @Override // xsna.bc80
    public void onSuccess(Object obj) {
        ((d5o0.a) this.c).b(auq.a.a);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((ot) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (c.m) ((o43) obj2).invoke(obj);
            case 1:
            case 3:
            case 8:
            case 9:
            case 15:
            case 17:
            default:
                return (it80) ((r7w0) obj2).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.t) ((ue40) obj2).invoke(obj);
            case 4:
                return (BaseOkResponseDto) ((gz30) obj2).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.t) ((gz30) obj2).invoke(obj);
            case 6:
                return (s3q0) ((v4w) obj2).invoke(obj);
            case 7:
                int i2 = RestoreSearchFragment.h0;
                return (String) ((gz30) obj2).invoke(obj);
            case 10:
                return (Long) ((gz30) obj2).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.e) ((b8j0) obj2).invoke(obj);
            case 12:
                return (Pair) ((epj0) obj2).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.t) ((com.vk.im.engine.commands.messages.c) obj2).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.o) ((b8j0) obj2).invoke(obj);
            case 16:
                return (tfs0) ((izs) obj2).invoke(obj);
            case 18:
                return (io.reactivex.rxjava3.core.t) ((b8j0) obj2).invoke(obj);
            case 19:
                return (Pair) ((xg3) obj2).invoke(obj);
            case 20:
                return (it80) ((gz30) obj2).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.t) ((r6h) obj2).invoke(obj);
            case 22:
                return (io.reactivex.rxjava3.core.t) ((b8j0) obj2).invoke(obj);
        }
    }
}
