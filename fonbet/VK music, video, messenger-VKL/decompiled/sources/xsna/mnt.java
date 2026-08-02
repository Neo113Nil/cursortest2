package xsna;

import com.vk.geo.api.data.GeoStaticPreviewInput;
import com.vk.geo.impl.presentation.staticpreview.GeoStaticPreview;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GeoStaticPreview.kt */
@b6l(c = "com.vk.geo.impl.presentation.staticpreview.GeoStaticPreview$fetchMarkers$3$1", f = "GeoStaticPreview.kt", l = {369, 546}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class mnt extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ akt $cluster;
    final /* synthetic */ ArrayList<Pair<GeoStaticPreviewInput.Item, cpv>> $icons;
    final /* synthetic */ GeoStaticPreviewInput $input;
    final /* synthetic */ GeoStaticPreviewInput.Item $item;
    final /* synthetic */ ui50 $mutex;
    final /* synthetic */ int $style;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ GeoStaticPreview this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnt(GeoStaticPreview geoStaticPreview, GeoStaticPreviewInput geoStaticPreviewInput, GeoStaticPreviewInput.Item item, int i, akt aktVar, ui50 ui50Var, ArrayList<Pair<GeoStaticPreviewInput.Item, cpv>> arrayList, spj<? super mnt> spjVar) {
        super(2, spjVar);
        this.this$0 = geoStaticPreview;
        this.$input = geoStaticPreviewInput;
        this.$item = item;
        this.$style = i;
        this.$cluster = aktVar;
        this.$mutex = ui50Var;
        this.$icons = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new mnt(this.this$0, this.$input, this.$item, this.$style, this.$cluster, this.$mutex, this.$icons, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((mnt) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r10 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        mnt mntVar;
        cpv cpvVar;
        ArrayList<Pair<GeoStaticPreviewInput.Item, cpv>> arrayList;
        ui50 ui50Var;
        GeoStaticPreviewInput.Item item;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            GeoStaticPreview geoStaticPreview = this.this$0;
            GeoStaticPreviewInput geoStaticPreviewInput = this.$input;
            GeoStaticPreviewInput.Item item2 = this.$item;
            int i2 = this.$style;
            akt aktVar = this.$cluster;
            this.label = 1;
            mntVar = this;
            obj = GeoStaticPreview.e(geoStaticPreview, geoStaticPreviewInput, item2, i2, aktVar, mntVar);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                item = (GeoStaticPreviewInput.Item) this.L$3;
                arrayList = (ArrayList) this.L$2;
                ui50Var = (ui50) this.L$1;
                cpvVar = (cpv) this.L$0;
                kotlin.a.a(obj);
                try {
                    arrayList.add(new Pair<>(item, cpvVar));
                    return s3q0.a;
                } finally {
                    ui50Var.c(null);
                }
            }
            kotlin.a.a(obj);
            mntVar = this;
        }
        cpvVar = (cpv) obj;
        if (cpvVar != null) {
            ui50 ui50Var2 = mntVar.$mutex;
            arrayList = mntVar.$icons;
            GeoStaticPreviewInput.Item item3 = mntVar.$item;
            mntVar.L$0 = cpvVar;
            mntVar.L$1 = ui50Var2;
            mntVar.L$2 = arrayList;
            mntVar.L$3 = item3;
            mntVar.I$0 = 0;
            mntVar.label = 2;
            if (ui50Var2.b(this) != coroutineSingletons) {
                ui50Var = ui50Var2;
                item = item3;
                arrayList.add(new Pair<>(item, cpvVar));
            }
            return coroutineSingletons;
        }
        return s3q0.a;
    }
}
