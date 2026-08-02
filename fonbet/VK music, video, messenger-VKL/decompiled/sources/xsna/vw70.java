package xsna;

import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.tf.factory.HandRecognitionFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class vw70 implements izs {
    public final /* synthetic */ com.vk.media.ok.b b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ Ref$ObjectRef k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;

    public /* synthetic */ vw70(com.vk.media.ok.b bVar, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Ref$ObjectRef ref$ObjectRef, boolean z8, boolean z9, boolean z10) {
        this.b = bVar;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = ref$ObjectRef;
        this.l = z8;
        this.m = z9;
        this.n = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.media.ok.b bVar = this.b;
        boolean z = this.c;
        int i = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        boolean z4 = this.g;
        boolean z5 = this.h;
        boolean z6 = this.i;
        boolean z7 = this.j;
        Ref$ObjectRef ref$ObjectRef = this.k;
        boolean z8 = this.l;
        boolean z9 = this.m;
        boolean z10 = this.n;
        TensorflowModel[] tensorflowModelArr = (TensorflowModel[]) obj;
        Tensorflow tensorflow = bVar.M;
        if (tensorflow != null) {
            tensorflow.changeSettings(z, i, z2, z3, z4, z5, z6, z7, (HandRecognitionFactory.RecognitionMode) ref$ObjectRef.element, z8, z9, z10, tensorflowModelArr);
        }
        return s3q0.a;
    }
}
