package xsna;

import com.vk.libvideo.design.compose.base.trimmer.TrimmerBound;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class eb50 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ eb50(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Integer.valueOf(fb50.I((fb50) this.c, (String) this.d, (String) this.e, (String) this.f));
            case 1:
                lrp0 lrp0Var = (lrp0) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                gzs gzsVar = (gzs) this.e;
                dmb0 dmb0Var = (dmb0) this.f;
                jrp0 jrp0Var = (jrp0) ((zak0) lrp0Var.f).getValue();
                lqr lqrVar = jrp0Var.b;
                float f = jrp0Var.c;
                lqr lqrVar2 = new lqr(lqrVar.a + f, lqrVar.b + f);
                bpn0 bpn0Var = new bpn0(new fy0(24, dmb0Var, lqrVar2));
                bpn0 bpn0Var2 = new bpn0(new g4(24, dmb0Var, lqrVar2));
                bpn0 bpn0Var3 = new bpn0(new gba0(dmb0Var, bpn0Var, bpn0Var2, 3));
                bpn0 bpn0Var4 = new bpn0(new i4(17, dmb0Var, bpn0Var));
                bpn0 bpn0Var5 = new bpn0(new j4(26, dmb0Var, bpn0Var2));
                zhf0 zhf0Var = (zhf0) bpn0Var.getValue();
                long j = ((ov70) obj).a;
                T t = zhf0Var.a(j) ? TrimmerBound.LEFT : ((zhf0) bpn0Var2.getValue()).a(j) ? TrimmerBound.RIGHT : ((zhf0) bpn0Var3.getValue()).a(j) ? TrimmerBound.INTERNAL : (((zhf0) bpn0Var4.getValue()).a(j) || ((zhf0) bpn0Var5.getValue()).a(j)) ? TrimmerBound.EXTERNAL : 0;
                ref$ObjectRef.element = t;
                if (t != 0 && gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            default:
                yg5 yg5Var = (yg5) this.c;
                fdu0 fdu0Var = (fdu0) this.d;
                VideoTextureView videoTextureView = (VideoTextureView) this.e;
                com.vk.libvideo.autoplay.a aVar = (com.vk.libvideo.autoplay.a) this.f;
                yg5Var.f0(fdu0Var);
                yg5Var.z0(videoTextureView, aVar, null);
                return new edu0(yg5Var, videoTextureView, fdu0Var);
        }
    }
}
