package xsna;

import com.vk.geo.api.data.GeoStaticPreviewInput;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.CameraBounds;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.id.StringId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GetClusteredMarkersForStaticPreviewUseCase.kt */
@b6l(c = "com.vk.geo.impl.presentation.staticpreview.GetClusteredMarkersForStaticPreviewUseCase$execute$2", f = "GetClusteredMarkersForStaticPreviewUseCase.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class qqt extends SuspendLambda implements wzs<yvj, spj<? super Pair<? extends dgu, ? extends List<? extends ela0>>>, Object> {
    final /* synthetic */ BoundingBox $bbox;
    final /* synthetic */ int $height;
    final /* synthetic */ GeoStaticPreviewInput $input;
    final /* synthetic */ int $width;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ rqt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqt(GeoStaticPreviewInput geoStaticPreviewInput, rqt rqtVar, BoundingBox boundingBox, int i, int i2, spj<? super qqt> spjVar) {
        super(2, spjVar);
        this.$input = geoStaticPreviewInput;
        this.this$0 = rqtVar;
        this.$bbox = boundingBox;
        this.$width = i;
        this.$height = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qqt(this.$input, this.this$0, this.$bbox, this.$width, this.$height, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Pair<? extends dgu, ? extends List<? extends ela0>>> spjVar) {
        return ((qqt) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zk3 zk3Var;
        Object a;
        Map map;
        VisibleStyle a2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            Map d = sni.d(this.$input.i.size(), 2);
            ArrayList arrayList = new ArrayList(this.$input.i.size());
            for (GeoStaticPreviewInput.Item item : this.$input.i) {
                String str = item.b;
                double d2 = item.e;
                double d3 = item.d;
                if (d.containsKey(new StringId(str))) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.w, new Object[]{"points already contains item #" + ((Object) StringId.a(str)) + ' ' + d3 + ',' + d2});
                    }
                } else {
                    d.put(new StringId(str), item);
                    double d4 = item.f;
                    arrayList.add(new elb0(str, (float) d3, (float) d2, new hah0(d4, d4)));
                }
            }
            rqt rqtVar = this.this$0;
            BoundingBox boundingBox = this.$bbox;
            rqtVar.getClass();
            nwf nwfVar = new nwf("GetClusteredMarkersForStaticPreviewUseCase", new f2p0(new dy0(15, rqtVar, boundingBox)), new pqt(rqtVar, d), rqtVar.c.f.c, 0.01f);
            zk3Var = new zk3(100);
            GeoStaticPreviewInput geoStaticPreviewInput = this.$input;
            y5u0 y5u0Var = new y5u0(geoStaticPreviewInput.l, geoStaticPreviewInput.k, 496);
            BoundingBox boundingBox2 = this.$bbox;
            CameraBounds cameraBounds = new CameraBounds(boundingBox2, boundingBox2.w0(this.$width, this.$height), 0L, 4, null);
            this.L$0 = d;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = zk3Var;
            this.label = 1;
            a = nwf.a(nwfVar, y5u0Var, cameraBounds, arrayList, null, zk3Var, null, null, this, 104);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            map = d;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zk3 zk3Var2 = (zk3) this.L$3;
            map = (Map) this.L$0;
            kotlin.a.a(obj);
            zk3Var = zk3Var2;
            a = obj;
        }
        dgu dguVar = (dgu) a;
        ArrayList<akt> arrayList2 = dguVar.a;
        ArrayList arrayList3 = new ArrayList();
        for (akt aktVar : arrayList2) {
            GeoStaticPreviewInput.Item item2 = (GeoStaticPreviewInput.Item) map.get(new StringId(aktVar.b.b));
            ela0 ela0Var = (item2 == null || (a2 = qqm0.a(zk3Var, aktVar.b.b)) == null) ? null : new ela0(item2, a2.b, aktVar);
            if (ela0Var != null) {
                arrayList3.add(ela0Var);
            }
        }
        return new Pair(dguVar, arrayList3);
    }
}
