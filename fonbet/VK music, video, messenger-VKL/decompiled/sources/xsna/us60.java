package xsna;

import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class us60 implements gzs {
    public final /* synthetic */ byte b;

    @Override // xsna.gzs
    public final Object invoke() {
        StringBuilder sb = new StringBuilder("screenResumed: ");
        byte b = this.b;
        sb.append((b & 2) != 0);
        sb.append("\nisOnScreen: ");
        sb.append((b & 1) != 0);
        sb.append("\nscreenAutoPlayResumed: ");
        sb.append(wn60.b(b));
        sb.append("\nfragmentTopAndOnly: ");
        sb.append((b & 8) != 0);
        sb.append("\nhasOverlayView: ");
        sb.append((b & AmfConstants.TYPE_TYPED_OBJECT_MARKER) != 0);
        return sb.toString();
    }
}
