package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.common.links.AwayLink;
import com.vk.dto.common.data.VKList;
import com.vk.external.miniapp.net.ad.AdvertisementConfig;
import java.util.List;
import java.util.Optional;
import ru.ok.TFFrameType;
import ru.ok.face.pipeline_frugal.FaceMorphingPipeline;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.tensorflow.util.Function;
import xsna.d4g0;
import xsna.p8c0;
import xsna.qjc;
import xsna.xex0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class o8c0 implements io.reactivex.rxjava3.functions.l, qjc.a, Function, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o8c0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.qjc.a
    public void I(AwayLink awayLink) {
        j4g0 j4g0Var = (j4g0) this.c;
        i4g0 i4g0Var = j4g0Var.s;
        if (i4g0Var != null) {
            j4g0Var.l.a(new d4g0.d(i4g0Var.b, i4g0Var.c));
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        Integer lambda$useFrame$2;
        switch (this.b) {
            case 0:
                return (p8c0.a) ((yr00) this.c).invoke(obj);
            case 1:
                return (lsc0) ((k220) this.c).invoke(obj);
            case 2:
            case 6:
            case 7:
            case 12:
            case 15:
            default:
                return (AdvertisementConfig) ((xex0.b) this.c).invoke(obj);
            case 3:
                return (Optional) ((k220) this.c).invoke(obj);
            case 4:
                return (Boolean) ((k220) this.c).invoke(obj);
            case 5:
                lambda$useFrame$2 = Tensorflow.lambda$useFrame$2((TFFrameType) this.c, (FaceMorphingPipeline) obj);
                return lambda$useFrame$2;
            case 8:
                return (io.reactivex.rxjava3.core.e) ((m2l0) this.c).invoke(obj);
            case 9:
                return (VKList) ((alj0) this.c).invoke(obj);
            case 10:
                return (List) ((uat0) this.c).invoke(obj);
            case 11:
                return (GroupsGroupFullDto) ((xep0) this.c).invoke(obj);
            case 13:
                return (pl30) ((efr0) this.c).invoke(obj);
            case 14:
                return ((gzs) this.c).invoke();
            case 16:
                ((m2l0) this.c).invoke(obj);
                return Boolean.TRUE;
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 6:
                return ((Boolean) ((s45) this.c).invoke(obj)).booleanValue();
            case 7:
                return ((Boolean) ((m2l0) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((xep0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (List) ((lk1) this.c).invoke(obj, obj2);
    }
}
