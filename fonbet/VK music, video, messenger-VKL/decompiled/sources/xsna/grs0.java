package xsna;

import com.vk.catalog.mvi.block.video.impl.video.largelisttablet.VideoLargeListTabletView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class grs0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ grs0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((izs) this.c).invoke(new VideoLargeListTabletView.c.C0469c(((VideoLargeListTabletView.d) this.d).b));
                return s3q0.a;
            default:
                return Boolean.valueOf(((Number) ((wh50) this.c).getValue()).intValue() == ((rg50) this.d).getIntValue());
        }
    }
}
